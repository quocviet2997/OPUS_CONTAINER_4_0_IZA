// 이벤트 타입 분기 (모바일.태블릿 / PC)
var mobileKeyWords = new Array('iPhone', 'iPod', 'BlackBerry', 'Android', 'Windows CE', 'Windows CE;', 'LG', 'MOT', 'SAMSUNG', 'SonyEricsson', 'Mobile', 'Symbian', 'Opera Mobi', 'Opera Mini', 'IEmobile');
for (var word in mobileKeyWords){
	
	if (navigator.appVersion.indexOf("MSIE 8")) {
		//IE8 
		eventType_mounseEnter	= "mouseenter";
		eventType_click			= "click";
		eventType_mouseUp		= "mouseup";
		eventType_mouseDown		= "mousedown";
		
	} else if (navigator.userAgent.match(mobileKeyWords[word]) == null){
		eventType_mounseEnter	= "mouseenter";
		eventType_click			= "click";
		eventType_mouseUp		= "mouseup";
		eventType_mouseDown		= "mousedown";		
	} else {
		//Tablet PC
		eventType_click ,
		eventType_mounseEnter,
		eventType_mouseUp		= "touchend";
		eventType_mouseDown		= "touchstart";
	}
}


// 절대좌표 영역(TOP/GNB)등 수치정보 전역변수 처리, [ W = width , H = height ]
var utilBar_H			= $(top.document).find(".pop_html").length > 0 ? 0 : 26;	// (div class="util_bar") 상단 logo, util btns 영역
var location_H			= 24;	// (div class="location") page_title_area 현재 메뉴 navi 출력영역 버튼
var gnbHideShowBtn_W	= 36;	// (button class="btn_gnb_hide") GNB Show / Hide


function fullmenu_load() {
	/************** [FULL MENU] **************/
	// fullmenu height get
	
	var fullmenu = document.getElementById("fullmenu_frame");
	fullmenu = (fullmenu.contentWindow) ? fullmenu.contentWindow : (fullmenu.contentDocument.document) ? fullmenu.contentDocument.document : fullmenu.contentDocument;
	fullMenu_height = fullmenu.document.body.scrollHeight + 25;//padding 25px
	
	
	$(".fullmenu_wrap").contents().find(".full_menu > ul > li").css("height",fullMenu_height -27 ); // padding-top , border-top
	$(".fullmenu_wrap").css({display:"none", visibility:"visible", height:0 });
	
	$(".util_full").on(eventType_click,function(){
		$(this).toggleClass("on");
		
		if($(this).hasClass("on")){
			$(".fullmenu_wrap").css("display","block");
			$(".fullmenu_wrap").stop().animate({height: fullMenu_height },200);
		} else {
			$(".fullmenu_wrap").stop().animate({height:0},200).fadeOut(100);
		}
	});
// Anchor 클릭시 slideUp
	$(".fullmenu_wrap").contents().find(".full_menu li a[href]").on(eventType_click,function(){
		$(".fullmenu_wrap").stop().animate({height:0},200).fadeOut(100);
		$(".util_full").removeClass("on");
	});
}



$(window).load(function(){
	//$(".gnb_2dpeth").css("visibility","visible");
	
	/******************** INITIALIZE ********************/
	//select & wrap Top padding
	setTimeout(function(){ 
		$(".wrap").css("padding-top", utilBar_H + $(".page_title_area").outerHeight());
		
		if(navigator.appVersion.indexOf("MSIE 9.0") != -1) {
			$("select").each(function(){
				$(this).addClass("ie9");
			});
		}
		//layer popup design
		$(".layer_popup_contents").css("padding-top",$(".layer_popup_title").outerHeight()-6);
	},10); 
	
	
	
	
	
	
	
	/************** [GNB] INITIALIZE **************/
	// GNB TITLE 정의 (2depth 출력)
	if($("#gnb_frame").contents().find("#gnb_2depth_name").length > 0 && window.navigation != undefined) {

		if(parent && parent!=this) {
			//iframe (탭 / popup 등) 일 경우 return
			return;
			
		} else if(navigation.innerHTML == "")  {
			$("#gnb_frame").contents().find("#gnb_2depth_name")[0].innerHTML = location.href.split(".do")[0].split("/")[location.href.split(".do")[0].split("/").length-1];
			
		} else {
			$("#gnb_frame").contents().find("#gnb_2depth_name")[0].innerHTML = $(navigation).text().split(">")[1].replace(/(^\s*)|(\s*$)/gi, "");
	    	
			$("#fullmenu_frame").contents().find(".full_menu li a[href]").each(function(){
	    		if($(this).text() == $("#gnb_2depth_name").text()) {
	    			$(this).parent("li").addClass("now");
				}
			});
		}
	} else {
		var indexInfo = location.href.split("=").length -1 ;
		var str = location.href.split("=")[indexInfo];
		
		$("#fullmenu_frame").contents().find(".full_menu li a[href]").each(function(){
			if($(this).attr("href").indexOf(str) != -1 ) {
				$(this).parent("li").addClass("now");
				$("#gnb_frame").contents().find("#gnb_2depth_name")[0].innerHTML = $(this).text();
				
			} else if (str.toLowerCase().indexOf("adm_") === 0){
				$("#gnb_frame").contents().find("#gnb_2depth_name")[0].innerHTML = "Administrator";
			}
		});
	}
	

	// GNB positioning 
	$("#gnb_frame").css("padding-top",utilBar_H + $(".page_title_area").outerHeight());
	
	// GNB 최소넓이 지정 (타이틀명 넓이)
    $("#gnb_frame").contents().find("#gnb_2depth_name").css("display","inline");
    var gnbTitleWidth = $("#gnb_frame").contents().find("#gnb_2depth_name").innerWidth(); 
    $("#gnb_frame").contents().find("#gnb_2depth_name").css("display","block");
    $("#gnb_frame").contents().find(".gnb_list").css("min-width",gnbTitleWidth);
    $("#gnb_frame").css("width",$("#gnb_frame").contents().find(".gnb_list").outerWidth());
    
    
	// 메인페이지의 경우에는 기본적으로 GNB 3depth 까지는 열려있게끔
    if(location.href.toLowerCase().indexOf("maintobe") != -1){
    	$("#gnb_frame").css({
    		left:0
		});
    } else {
    	$("#gnb_frame").css("left",parseInt("-" + $("#gnb_frame").contents().find(".gnb_list").outerWidth()));
    }
	
    $("#gnb_frame").css("visibility","visible");
    
    
    
	
	// GNB hide/show button (로고 하단 3선버튼) 
	$(".btn_gnb_hide").on(eventType_mounseEnter , function(event){
		$(".btn_gnb_hide > span").stop().fadeIn(150);
	}).mouseleave(function(event){
		$(".btn_gnb_hide > span").stop().fadeOut(150);
	});
	
	
	
	// GNB Show,Hide
	$(".btn_gnb_hide").on(eventType_click, function(event){
		$("#gnb_frame").css({ paddingTop: $(".page_title_area").outerHeight() + utilBar_H});
		
		if($("#gnb_frame").offset().left == 0) {
			$("#gnb_frame").stop().animate({
				left:parseInt("-" + $("#gnb_frame").outerWidth())
			},250);
		} else {
			$("#gnb_frame").stop().animate({
				left:0
			},250);
		}
	});
	
	
	//Title area initialize
	$(".page_title_area .opus_design_btn").css("padding-left",$(".page_title").outerWidth()+20);
	$(".btn_gnb_hide").css("height",$(".wrap_search").prev(".page_title_area").outerHeight() -1);
	
	
	
	
	/***************************** Layout *****************************/
	//layout_change 버튼 now_layout class 제어
	$(".layout_change > button").bind(eventType_click,function(){
		$(this).addClass("now_layout").siblings().removeClass("now_layout");
	});
	
	//location show
	function location_show() {
		$(".page_title > button").addClass("toggle");
		$(".location").stop().animate({ height:location_H },250);
		$(".btn_gnb_hide").stop().animate({ height:$(".page_title_area").outerHeight() + location_H -1 },250);
		$("#gnb_frame").stop().animate({ paddingTop: $(".page_title_area").outerHeight() + location_H + utilBar_H -1},250);
		$(".wrap").animate({paddingTop : utilBar_H + $(".page_title_area").outerHeight() + location_H},250);
	}
	//location hide
	function location_hide() {
		if($(".location").height() == 0 ) {
			return;
		}
		$(".page_title > button").removeClass("toggle");
		$(".location").stop(true,true).animate({ height:0 },250);
		$(".btn_gnb_hide").removeClass("toggle").stop(true,true).animate({ height:$(".page_title_area").outerHeight() - location_H -1 },250);
		
		$("#gnb_frame").stop().animate({ paddingTop :$(".page_title_area").outerHeight() - location_H + utilBar_H -1},250);
		
		$(".wrap").animate({paddingTop : utilBar_H + $(".page_title_area").outerHeight() - location_H},250);
	}
	//location show/hide
	$(".page_title > button").click(function(){
		if(parseInt($(".location").css("height").replace("px","")) == 0) {
			location_show();
		} else if (parseInt($(".location").outerHeight()) >= location_H) {
			location_hide();
		}
	});
	
	
	//inquiry DIV(wrap_search) show/hide
	//inquiry_hide
	function inquiry_hide() {
		//wrap element find
		if ($(".wrap_search").length == 1) {
			var wrapElement = ".wrap_search";
		} else if ($(".wrap_search_tab").length == 1){
			var wrapElement = ".wrap_search_tab";
		} else {
			return;
		}
		
		$(wrapElement)
		.addClass("hideBorder")
		.stop(true,true)
		.animate({ 
			top:"-"+$(wrapElement).innerHeight(),
			marginBottom:"-"+$(wrapElement).innerHeight()
		},250);
	}
	//inquiry_show
	function inquiry_show() {
		//wrap element find
		if ($(".wrap_search").length == 1) {
			var wrapElement = ".wrap_search";
		} else if ($(".wrap_search_tab").length == 1){
			var wrapElement = ".wrap_search_tab";
		} else {
			return;
		}
		
		$(wrapElement)
		.removeClass("hideBorder")
		.slideDown()
		.animate({ 
			top:0,
			marginBottom:0,
			borderBottomWidth:1
		},250);
	}
	
	
	
	//layout_change 버튼클릭시 각 함수호출
	$(".layout_default").bind(eventType_click, function(){
		location_hide();
		inquiry_show();
	});
	$(".layout_hide").bind(eventType_click, function(){
		location_hide();
		inquiry_hide();
	});
	
	
	
	
	/******************** util_bar ********************/
	// preferences
	$(".util_setting").bind(eventType_click, function(){
		$(".preferences").animate({right:0}, 250);
		$(".favorite_links").animate({right:-414}, 250);
	});
	$("#prefer_save").bind(eventType_click, function(){
		$(".preferences").stop(true,true).animate({right:-320}, 250);
	});
	
	//favorite_links
	$(".util_fav").bind(eventType_click, function(){
		$(".favorite_links").stop(true,true).animate({right:0}, 250);
		$(".preferences").animate({right:-320}, 250); 
	});
	
	
	
	// 다른영역 클릭시 닫히는 부분
	$(this).on(eventType_click ,function(event){
		
		// popup일 경우 return
		if( location.href.indexOf("pop_mode") != -1 ) {
			return;
		}
		
		// iframe (보통 탭 내부의 컨텐츠를 클릭했을 경우)
		if(top.document.body !== this.document.body) {
			$(top.document.getElementById("fullmenu_frame")).stop().animate({height:0},200).fadeOut(100);
			$(top.document.body).find(".util_full.on").removeClass("on");
		}
		
		
		if( $(event.target).parents(".gnb_wrap").length == 0 ||
			$(event.target).parents(".preferences").length == 0 ||
			$(event.target).parents(".favorite_links").length == 0 ||
			$(event.target).parents(".fullmenu_wrap").length == 0) {
			
			
			if( parseInt($(".preferences").css("right")) == 0 &&
				$(event.target).parents(".preferences").length == 0) {
				
				$(".preferences").stop(true,true).animate({right:-320}, 250);
			}
			
			
			if( parseInt($(".favorite_links").css("right")) == 0 &&
				$(event.target).parents(".favorite_links").length == 0) {
				
				$(".favorite_links").stop(true,true).animate({right:-414}, 250);
			}
			
			if(	$(".fullmenu_wrap").is(":visible") && 
				$(event.target).parents(".fullmenu_wrap").length == 0 &&
				!$(event.target).hasClass("util_full") ) {
				
				$(".util_full").triggerHandler(eventType_click);
			}

			
			// GNB CLOSE
			if($(event.target).parents(".gnb_wrap").length == 0 && parseInt($("#gnb_frame").css("left")) == 0) {
				
				$("#gnb_frame").contents().find(".gnb_now").removeClass("gnb_now");
				
				$(".btn_gnb_hide").triggerHandler(eventType_click);
				$("#gnb_frame").stop().animate({
					width:$("#gnb_frame").contents().find(".gnb_list").outerWidth() + 2,
					left:parseInt("-" + ($("#gnb_frame").contents().find(".gnb_list").outerWidth() + 2))
				},250);
			}
		}
	});
	
	
	
	//calendar compnent
	$(".calendar_apply input").bind("load focusout",function(){
		if(this.value != "") {
			$(this).addClass("val");
		} else {
			$(this).removeClass("val");
		}
	});
	if(navigator.appName.indexOf("Microsoft") != -1) {
		return;
	} else {
		if(navigator.vendor.indexOf("Apple") != -1) {
			$("select").each(function(){ $(this).addClass("safari_select"); });
			$(".calendar_wrap").addClass("safari_calendar");
		}
	}
	
	
	// float CLEAR element
	$(".opus_design_btn").each(function(){
		$(this).after("<span class='clear'></span>");
	});
	
	
    // popup 관련 
	titleHeight			= $(top.document).find(".layer_popup_title").length > 0 ? $(top.document).find(".layer_popup_title").outerHeight() : $(top.document).find(".page_title_area").outerHeight();
	scroll_obj			= $(top.document).find(".pop_html").length > 0 ? $(top.document).contents().find(".layer_popup_contents") : window;
	scroll_top			= $(top.document).find(".pop_html").length > 0 ? $(top.document).contents().find(".layer_popup_contents").scrollTop() : window.pageYOffset;
	
	
	$(scroll_obj).on("scroll",function(e){
		var scroll_top = $(this).scrollTop();
		
		if(-Math.abs(scroll_top) <= utilBar_H + titleHeight - $(".layer_popup_bgTop").height()){
			$(".layer_popup_bgTop").css("margin-top",utilBar_H + titleHeight - $(".layer_popup_bgTop").height());
		} else {
			$(".layer_popup_bgTop").css("margin-top",-Math.abs(scroll_top));
		}
	});
	
	
	// RD 이전 형제요소 Offset / height 계산 (있을 경우에만 계산)
	/*if ( $(".opus_design_RD").prevAll()[0] !== undefined ) {
		
		// 형제 중 첫번째 요소 top position + 마지막 요소 offset bottom(계산)
//		var 
//		$(".opus_design_RD").prevAll().last().position().top ;
//		$(".opus_design_RD").prevAll().first().position().top +$(".opus_design_RD").prevAll().first().outerHeight();
		
		
		
	}
	
	// RD height settings
	$("[data-rdwrap]").height((document.body.scrollHeight - $("[data-rdwrap]").offset().top)-24);*/
	
	//$("[data-rdwrap]").children(".opus_design_RD").height();
	//$("[data-rdwrap]").innerHeight() - $("[data-rdwrap]").children(".opus_design_RD").outerHeight()
});


// 브라우저 리사이즈시 - POPUP / GNB 등 절대좌표 요소들 Redesign
$(window).on("resize", function(event){
	
	$("#gnb_frame").css({
		paddingTop : utilBar_H + $(".page_title_area").outerHeight()
	});
		
	
	/**** (GNB) REDESIGN ****/
	$(".gnb_2depth").css("max-width",$(window).width() - 225);
	$(".btn_gnb_hide").css("height",$(".page_title_area").outerHeight()-1);
	$(".gnb_2depth,.gnb_2depth ul").css("height",$(window).height() - ($(".header_fixed").outerHeight() + $(".page_title_area").outerHeight()));
	$(".wrap").stop().css("padding-top",$(".header_fixed").outerHeight() + $(".page_title_area").outerHeight());
	
	
	/**** (POPUP) REDESIGN ****/
	$(".layer_popup:eq(0)").css({
		marginTop:parseInt( "-"+ $(".layer_popup:eq(0)").outerHeight() /2),
		marginLeft:parseInt( "-"+ $(".layer_popup:eq(0)").outerWidth() /2)
	});
	
	//레이어팝업일때 (DIV)
	if(parent.document.getElementById(window.name) != null) {
		$(".layer_popup_contents").css("height",parseInt($(".layer_popup_contents").height() + window.innerHeight - $(".layer_popup_contents").height() - 92));
	//window.open 팝업일때(Method)
	} else {
		$(".layer_popup_contents").css("height",parseInt($(".layer_popup_contents").height() + window.innerHeight - $(".layer_popup_contents").height() - 67));
	}
	
	
	//popup resizeable
	$(".ui-resizable-e").on(eventType_mouseDown ,function(event){
		$(this).css({
			width:"1000px",
			right: "-500px"
		});
	}).on(eventType_mouseUp, function(){
		$(this).css({
			width:"9px",
			right: 0
		});
	});
	
	
	if($(top.document).find(".opus_design_tab:eq(0)")[0] != undefined) {
	
		var tabOffsetTop 	= $(top.document).find(".opus_design_tab:eq(0)").offset().top + scroll_top;
		var tabHeight 		= $(top.document).find(".opus_design_tab:eq(0)").outerHeight() + parseInt($(top.document).find(".opus_design_tab:eq(0)").css("margin-bottom"));
		var scroll_top 		= $(scroll_obj).scrollTop();
			
		
		if(-Math.abs(scroll_top) <= utilBar_H + titleHeight - $(".layer_popup_bgTop").height()){
			$(".layer_popup_bgTop").css({
				height	  : (tabOffsetTop + tabHeight),
				marginTop : utilBar_H + titleHeight - $(".layer_popup_bgTop").height()
				
			});
		} else {
			$(".layer_popup_bgTop").css({
				height	  : (tabOffsetTop + tabHeight),
				marginTop : -Math.abs(scroll_top)
			});
		}
	}
	
	
});
//VER 1.21