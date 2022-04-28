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

$(window).load(function(){
	
	/************** [GNB] INITIALIZE **************/
	// gnb iframe 변수처리
	gnbFrame = $(parent.document).find("#gnb_frame");
	gnbFrameCont = $(gnbFrame).contents().find("body");
	
	
	$(".gnb_2dpeth").css("visibility","visible");
	
	
		
	// has child addClass
	$(".gnb_list li").each(function(index) {
		// UL(sub depth) 가지고있는 li 에 has_chlid CLASS 추가 (디자인요소)
		$(this).has("ul").addClass("has_child");
		
	}).on(eventType_mounseEnter,function(){
		
		if($(gnbFrame).is(":animated")) {
			$(gnbFrame).finish();
		} 
		
		$(this).addClass("gnb_now")
			   .siblings("li").removeClass("gnb_now")
			   .find(".gnb_now").removeClass("gnb_now");
		
		
		// [2dpeth LIST]outer-width (GNB 최소 넓이) (border 두께 2)
		var min_width = $(".gnb_list").outerWidth() + 2;
		
		// 다른 하위 DEPTH 메뉴 display none
		$(this).siblings("li").find("div").stop().css("display","none");
			
		/************ GNB 펼침 **************/
		//if($(this).hasClass("has_child")){
			
			
		// width 계산 ( 나의 자식(다음) ul + 바로 윗 depth 의 ul 넓이 SUM )
		if($(this).parent("ul").parent().parent().hasClass("gnb_list") || $(this).parent().hasClass("gnb_list")) {
			var curMenu_prevMenu_sum = $(this).children("div").outerWidth();
			
		} else if ($(this).children("ul").length == 0) {
			
			var curMenu_prevMenu_sum = $(this).parent("ul").outerWidth();
		} else {
			var curMenu_prevMenu_sum = $(this).parent("ul").outerWidth() + $(this).children("div").outerWidth();
		}
		
		// 보여줄 하위 DEPTH 메뉴 left 좌표 지정
		$(this).children("div").css("display","inline-block").css("left",$(this).parent("ul").outerWidth());
		
		
		// prev menu width ++
		var prevWidthSum	= 0;
		
		for( i = 0; i < $(".gnb_now").length; i++) {
			
			if( i > 0 ) {
				for(j = 0; j < i; j++) {
					prevWidthSum += $(".gnb_now:eq("+ j +") > div").outerWidth();
				}
			}
		}

		
		var widthMAX = 0;
		
		  if (navigator.appName == 'Microsoft Internet Explorer') {
			  
		    var ua = navigator.userAgent;
		    var re  = new RegExp("MSIE ([0-9]{1,}[\.0-9]{0,})");
		    
		    if (re.exec(ua) != null && re.exec(ua).indexOf("10.0") == 0) {
		    	
		    	$("div").each(function(){
					if($(this).css("display") == "inline-block") {
						widthMAX += $(this).outerWidth();
					}
				});
		    	
		    } else {
		    	
		    	$(gnbFrameCont).find("ul:visible").each(function(){
					widthMAX += $(this).outerWidth();
				});
		    }
		    
		    
		  } else if (navigator.appName == 'Netscape') {
			  
		    var ua = navigator.userAgent;
		    var re  = new RegExp("Trident/.*rv:([0-9]{1,}[\.0-9]{0,})");
		    
		    
		    if (re.exec(ua) != null) {
		    	
		    	if ($("ul:visible").length > 0) {
		    		$("ul:visible").each(function(){
						widthMAX += $(this).outerWidth();
					});
		    	} else {
		    	
		    		$("ul").each(function(){
						if($(this).parent("div").css("display") == "inline-block") {
							widthMAX += $(this).parent("div").outerWidth();
						}
					});
		    	}
		    } else {
		    	
		    	$("ul:visible").each(function(){
					widthMAX += $(this).outerWidth();
				});
		    }
		  } else {
			  
			  $("ul:visible").each(function(){
					widthMAX += $(this).outerWidth();
				});
		  }
		  
		
		// 합쳐진 width 선언
		$(gnbFrame).css("max-width",widthMAX+30);
		$(gnbFrame).stop().animate({
			width:widthMAX 
		},250);
		
		
		// width reset
		curMenu_prevMenu_sum, prevWidthSum = 0;
	});
});
