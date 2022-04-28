/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : CoPopup.js
*@FileTitle  : Common Popup Process  
*@author     : CLT
*@version    : 1.0
*@since      : 2014/04/08
=========================================================*/

// 리턴팝업에서 사용하는 전역변수
var rtnPopValue = new Array(20);

/**
 * 해당 url을 팝업으로 새창을 열어서 표시하고, 새창에 포커스 설정 후 팝업창 window object 또는 
 * window.returnValue를 리턴한다. <br>
 * bModal 인자값에 따라 팝업창이 Modal 인지 Modaless(일반팝업) 인지 선택한다. <br>
 * bModal=true인 경우 window.showModalDialog 함수를 이용하고, bModal=false인 경우 window.open
 * 함수를 이용한다. <br>
 * sFeatures 인자의 자세한 설정은
 * {@link http://msdn.microsoft.com/ko-kr/library/ms536651(en-us,VS.85).aspx window.open 도움말}
 * 또는
 * {@link http://msdn.microsoft.com/ko-kr/library/ms536759(en-us,VS.85).aspx window.showModalDialog 도움말}
 * 을 참고한다.<br>
 * <br>
 * <b>Example :</b>
 * 
 * <pre>
 * ComOpenWindow(
 * 		"ESD_TPB_911.do",
 * 		"ESD_TPB_911",
 * 		"toolbar=no,location=no,status=no,menubar=no,scrollbars=auto,resizable=no,alwaysRaised,dependent,titlebar=no,width=755,height=460");
 * ComOpenWindow("ESD_TPB_911.do", null, "width=755,height=460");
 * pWin = ComOpenWindow("ESD_TPB_911.do", null, "width=755,height=460"); //pWin은 팝업창 window object이다.
 * </pre>
 * 
 * @param {string}
 *            sUrl 선택,팝업창의 Url, default="about:blank"
 * @param {string}
 *            sWinName 선택,팝업창의 name 또는 dialogArguments, default=null
 * @param {string}
 *            sFeatures 선택,팝업창의 세부 설정, default=""
 * @param {bool}
 *            bModal 선택,팝업의 Modal 여부 (true:Modal, false:일반팝업), default=false
 * @returns object<br>
 *          bModal=false로 오픈된 경우 리턴값 : 팝업창의 window Object bModal=true로 오픈된 경우
 *          리턴값 : 팝업창의 window.returnValue값
 * @see #ComOpenWindow
 */
function ComOpenWindow(sUrl, sWinName, sFeatures, bModal) {
	
	try {
		if (bModal) {
			
			return _CallPopUp(sUrl, sFeatures);
			//return window.showModalDialog(sUrl,window,sFeatures);
		} else {
			/* WINDOW POPUP  */
			// window name에 공백이 들어가면 window.open 함수에 오류가 발생하여 trimAll()함
			var winObj = window.open(sUrl, ComTrimAll(sWinName), sFeatures);
			if (winObj == null)
				return ComShowMessage("Fail to open popup. Please change options of your browser.");
			
			winObj.focus();
			
			
			$(winObj).load(function(){
				
				/***** 팝업 표준 지켜지지 않았을 경우 표준구조 강제 생성. (S) **************************************************************/ 
				if($(this.document.body).find(".layer_popup_title").length == 0) {
					$(this.document.body).find(".page_title_area").each(function(){
						if(!$(this).children("h2").hasClass("page_title")){ $(this).children("h2").addClass("page_title"); }
						$(this).next('.opus_design_btn').andSelf().wrapAll('<div class="layer_popup_title"/>');
					});
				}
				if($(this.document.body).find(".layer_popup_contents").length == 0) {
					$(this.document.body).find(".wrap_result").each(function(){
					    $(this).prev('[class^="wrap_search"]').andSelf().wrapAll('<div class="layer_popup_contents"/>');
					});
				}
				/***** 팝업 표준 지켜지지 않았을 경우 표준구조 강제 생성. (E) **************************************************************/
				
				var popupCont		= $(this.document.body).find(".layer_popup_contents");
				var popupContHeight = $(this.document.body).innerHeight();
				var popTitleHeight	= $(this.document.body).find(".layer_popup_title").innerHeight();
				
				//만에하나 최소한의 표준인  wrap_result 가 없을경우 강제생성. 
				if ($(popupCont).children(".wrap_result").length < 1) {
					$(popupCont).wrapInner("<div class='wrap_result'></div>");
				}
				
				var resultHeight 	= popupContHeight - $(popupCont).children(".wrap_result").position().top;
				
				
				// layer_popup_contents DIV가 최상위 부모가 아닐 경우 height 100% 처리
				if($(popupCont).parent()[0].tagName != "BODY") {
					$(popupCont).parent().css("height","100%");
				}
				
				
				// wrap_result Height 지정.
				$(popupCont).css("padding-top",popTitleHeight)
				.children(".wrap_result").css("height",resultHeight-1);//border-bottom-width 1px
				
					
				//RD 오브젝트 있을 경우 : JSP 내부에서 하드코딩으로 height 퍼센트 잡아서 처리하기로 협의. 삭제
//				if( $(popupCont).find(".opus_design_RD").length > 0 && $(popupCont).find(".opus_design_RD").hasClass("rd_hidden") == false ) {
//					
//					var RDnextElem 		  = $(popupCont).find(".opus_design_RD").nextAll()[$(popupCont).find(".opus_design_RD").nextAll().length-1];
//					var RDnextElem_height = $(RDnextElem).position().top + parseInt($(RDnextElem).css("margin-bottom")) + $(RDnextElem).outerHeight();
//					
//					$(popupCont).find(".opus_design_RD").attr("style","height:"+ ($(popupCont).find(".wrap_result").height() - RDnextElem_height) +"px!important");
//					$(popupCont).find(".opus_design_RD").next().css("padding-top",($(popupCont).find(".wrap_result").height() - RDnextElem_height));
//				}
			});
			
			//현재 window에서 focusout시 alert 출력
//			$(winObj).bind("focusout",function(){
//				alert("현재 작업을 완료해 주세요.");
//			});
			
			return winObj;
		}
	} catch (err) {
		ComFuncErrMsg(err.message);
	}
}

function ComOpenWindowPos(sUrl, sWinName, sFeatures, bModal) {
	try {
		if (bModal) {
			/* LAYER POPUP */
			return _CallPopUpPos(sUrl, sFeatures);
		} else {
			// window name에 공백이 들어가면 window.open 함수에 오류가 발생하여 trimAll()함
			var winObj = window.open(sUrl, ComTrimAll(sWinName), sFeatures);
			if (winObj == null)
				return ComShowMessage("Fail to open popup. Please change options of your browser.");
			
			winObj.focus();
			
			$(winObj).load(function(){
			
				/***** 팝업 표준 지켜지지 않았을 경우 표준구조 강제 생성. (S) **************************************************************/ 
				if($(this.document.body).find(".layer_popup_title").length == 0) {
					$(this.document.body).find(".page_title_area").each(function(){
						if(!$(this).children("h2").hasClass("page_title")){ $(this).children("h2").addClass("page_title"); }
						$(this).next('.opus_design_btn').andSelf().wrapAll('<div class="layer_popup_title"/>');
					});
				}
				if($(this.document.body).find(".layer_popup_contents").length == 0) {
					$(this.document.body).find(".wrap_result").each(function(){
					    $(this).prev('[class^="wrap_search"]').andSelf().wrapAll('<div class="layer_popup_contents"/>');
					});
				}
				/***** 팝업 표준 지켜지지 않았을 경우 표준구조 강제 생성. (E) **************************************************************/
				
				var popupCont		= $(this.document.body).find(".layer_popup_contents");
				var popupContHeight = $(this.document.body).innerHeight();
				var popTitleHeight	= $(this.document.body).find(".layer_popup_title").innerHeight();
				
				//만에하나 최소한의 표준인  wrap_result 가 없을경우 강제생성. 
				if ($(popupCont).children(".wrap_result").length < 1) {
					$(popupCont).wrapInner("<div class='wrap_result'></div>");
				}
				
				$(popupCont).css("padding-top",popTitleHeight);
				
				var resultHeight 	= popupContHeight - $(popupCont).children(".wrap_result").position().top;
				
				
				// layer_popup_contents DIV가 최상위 부모가 아닐 경우 height 100% 처리
				if($(popupCont).parent()[0].tagName != "BODY") {
					$(popupCont).parent().css("height","100%");
				}
				
			
				// wrap_result Height 지정.
				
				$(popupCont).children(".wrap_result").css("height",resultHeight-1);//border-bottom-width 1px
				
				//RD 오브젝트 있을 경우 : JSP 내부에서 하드코딩으로 height 퍼센트 잡아서 처리하기로 협의. 삭제
//				if( $(popupCont).find(".opus_design_RD").length > 0 && $(popupCont).find(".opus_design_RD").hasClass("rd_hidden") == false ) {
//					
//					var RDnextElem 		  = $(popupCont).find(".opus_design_RD").nextAll()[$(popupCont).find(".opus_design_RD").nextAll().length-1];
//					var RDnextElem_height = $(RDnextElem).position().top + parseInt($(RDnextElem).css("margin-bottom")) + $(RDnextElem).outerHeight();
//					
//					$(popupCont).find(".opus_design_RD").attr("style","height:"+ ($(popupCont).find(".wrap_result").height() - RDnextElem_height) +"px!important");
//					$(popupCont).find(".opus_design_RD").next().css("padding-top",($(popupCont).find(".wrap_result").height() - RDnextElem_height));
//				}
			});
			
			return winObj;
		}
	} catch (err) {
		ComFuncErrMsg(err.message);
	}
}


function _CallPopUp(pUrl, sFeatures) {
	var sWidth, sHeight;
	 var aTmp = sFeatures.split(";");
	 for (var i=0; i<aTmp.length; i++) {
	  var aConfig = aTmp[i].split(":");
	  if(aConfig != "") {
	   aConfig[0] = aConfig[0].trim();
	  }
	  if(aConfig[0]=="dialogWidth") {
	   sWidth = aConfig[1];
	  }
	  if(aConfig[0]=="dialogHeight") {
	   sHeight = aConfig[1];
	  }
	 }
	
	var ifr = document.getElementById("popiframe");
	if (ifr){
		$(ifr).remove();
		$('<iframe id="popiframe" name="popiframe" src="'+pUrl+ '" width="'+sWidth + '" height="' + sHeight + '"></iframe>').appendTo(".layer_popup");
	} else {
		
		// POPUP 이름 설정. 고유 키값처럼 쓰는 용도
		var popupName = pUrl.split(".do")[0].replace("/opuscntr/","").split("/");
		
		$('<div class="layer_popup" data-popupname="'+ popupName +'"><script>$(".layer_popup").draggable({handle:".layer_popup_drag", iframeFix: true, containment: "document", scroll:false });</script><span class="layer_popup_drag" style="width:'+ (parseInt(sWidth.replace("px",""))- 45) +'px"></span></div>')
		.appendTo("body");
		
		$('<iframe id="popiframe" name="popiframe" src="'+pUrl+ '" width="'+sWidth + '" height="' + sHeight + '"></iframe>').appendTo(".layer_popup[data-popupname='"+ popupName +"']");
		
		// 탭 내부 layer popup 의 경우 상단 layer_popup_bgTop 추가 생성
		if(top.document!= this.document && $(parent.document.getElementById(this.name)).parent().prevAll(".opus_design_tab:eq(0)").length > 0) {
			
			// popup type 분기 (window.open , top.document) 
			var scroll_top = $(top.document).find(".pop_html").length > 0 ? $(top.document).contents().find(".layer_popup_contents").scrollTop() : parent.pageYOffset;
			
			var tabOffsetTop = $(top.document).find(".pop_html").length > 0 ? $(parent.document.getElementById(this.name)).parent().prevAll(".opus_design_tab:eq(0)").offset().top + scroll_top : $(parent.document.getElementById(this.name)).parent().prevAll(".opus_design_tab:eq(0)").offset().top;
			var tabHeight = $(parent.document.getElementById(this.name)).parent().prevAll(".opus_design_tab:eq(0)").outerHeight() + parseInt($(parent.document.getElementById(this.name)).parent().prevAll(".opus_design_tab:eq(0)").css("margin-bottom"));
		    var tabOffsetBtm = tabOffsetTop + tabHeight + $(parent.document.getElementById(this.name)).outerHeight();
//			var tabOffsetBtm = (tabOffsetTop + tabHeight + $(parent.document.getElementById(this.name)).outerHeight()) - $(top.document).height();
			var scrollTopPosi = 0;
			
			var topFixedHeight = $(top.document.body).find(".header_fixed")[0] == undefined ? 0 : $(top.document.body).find(".header_fixed").outerHeight();
			var utilbar 	   = $(top.document).find(".pop_html").length > 0 ? 0 : 26;
			
			
			if(scroll_top > 0) {
				scrollTopPosi = scroll_top - (titleHeight + (topFixedHeight -5));
			}
			
			$(parent.document.body)
			.prepend("<div class='layer_popup_bgTop' style='height:"+(tabOffsetTop + tabHeight)+"px;margin-top:-"+ scrollTopPosi +"px'><img src='/opuscntr/style/images/theme_default/pop_bg_logo.png' alt='' /></div>")
			.append("<div class='layer_popup_bgBtm' style='top:"+ (tabOffsetBtm-1 - scrollTopPosi) +"px'></div>");
			
			
			// 스크롤 위치 감안하여 위치 지정.
			if(-Math.abs(scroll_top) <= utilbar + titleHeight - $(parent.document.body).find(".layer_popup_bgTop").height()){
				
				$(parent.document.body).find(".layer_popup_bgTop").css("margin-top", utilbar + titleHeight - $(parent.document.body).find(".layer_popup_bgTop").height());
				
			} else {
				$(parent.document.body).find(".layer_popup_bgTop").css("margin-top",-Math.abs(scroll_top));
			}
			
		} 			 			
			$("body").prepend("<div class='layer_popup_bg'></div>");
		
		$("html").addClass("popupOpen");
		
		//drag handel hidden
		if($(window.parent.document.body).find(".layer_popup[data-popupname='"+ popupName +"']").is(":visible")) {
			$(window.parent.document.body).find(".layer_popup_drag").css("z-index","-1");
		}
	 }
		 
	 
	//레이어 팝업 열림
	$(".layer_popup_bg,.layer_popup_bgTop,.layer_popup").fadeIn(100);
	
	
	
	//레이어 팝업 세로/가로 가운데 위치
	$(".layer_popup[data-popupname='"+ popupName +"']").css({
		marginTop :parseInt("-" + $(".layer_popup[data-popupname='"+ popupName +"']").outerHeight()/2),
		marginLeft : parseInt("-" + $(".layer_popup[data-popupname='"+ popupName +"']").outerWidth()/2)
	});
	
	
	// contents 크기조절. 아이프레임일 경우
	if($(".layer_popup[data-popupname='"+ popupName +"']").children("#popiframe").length > 0) {
		
		
		
		$(".layer_popup[data-popupname='"+ popupName +"'] #popiframe").load(function(){
			
			// 부모 드래그 핸들러 뒤로보냄
			var parDoc = top.document == parent.document ? top : parent ; 			
			$(parDoc.document).find("#popiframe").prev().css("z-index",-1);
			$(this).prev().css("z-index",10);
			
			
			/***** 팝업 표준 지켜지지 않았을 경우 표준구조 강제 생성. (S) **************************************************************/ 
			if($(this).contents().find(".layer_popup_title").length == 0) {
				$(this).contents().find(".page_title_area").each(function(){
					if(!$(this).children("h2").hasClass("page_title")){ $(this).children("h2").addClass("page_title"); }
					if($(this).children("h2").children("span").length == 0){ $(this).children("h2").wrapInner("<span></span>"); }
					$(this).next('.opus_design_btn').andSelf().wrapAll('<div class="layer_popup_title"/>');
				});
			}
			if($(this).contents().find(".layer_popup_contents").length == 0) {
				$(this).contents().find(".wrap_result").each(function(){
					 $(this).prevAll('[class^="wrap_search"],[class^="wrap_result"]').andSelf().wrapAll('<div class="layer_popup_contents"/>');
				});
			}
			/***** 팝업 표준 지켜지지 않았을 경우 표준구조 강제 생성. (E) **************************************************************/
			
			
			var popupCont		= $(this).contents().find(".layer_popup_contents");
			var popupContHeight = $(this).contents().find("body").innerHeight();
			var popTitleHeight	= $(this).contents().find(".layer_popup_title").innerHeight();
			
			//만에하나 최소한의 표준인  wrap_result 가 없을경우 강제생성. 
			if ($(popupCont).children(".wrap_result").length < 1) {
				$(popupCont).wrapInner("<div class='wrap_result'></div>");
			}
			
			$(popupCont).css("padding-top",popTitleHeight);
			
			var resultHeight 	= popupContHeight - $(popupCont).children(".wrap_result").position().top;
			
			
			// layer_popup_contents DIV가 최상위 부모가 아닐 경우 height 100% 처리
			if($(popupCont).parent()[0].tagName != "BODY") {
				$(popupCont).parent().css("height","100%");
			}
			
		
			// wrap_result Height 지정.
			
			$(popupCont).children(".wrap_result").css("height",resultHeight-1);//border-bottom-width 1px
			
			//RD 오브젝트 있을 경우 : JSP 내부에서 하드코딩으로 height 퍼센트 잡아서 처리하기로 협의. 삭제
//			if( $(popupCont).find(".opus_design_RD").length > 0 && $(popupCont).find(".opus_design_RD").hasClass("rd_hidden") == false ) {
//				
//				var RDnextElem 		  = $(popupCont).find(".opus_design_RD").nextAll()[$(popupCont).find(".opus_design_RD").nextAll().length-1];
//				var RDnextElem_height = $(RDnextElem).position().top + parseInt($(RDnextElem).css("margin-bottom")) + $(RDnextElem).outerHeight();
//				
//				$(popupCont).find(".opus_design_RD").attr("style","height:"+ ($(popupCont).find(".wrap_result").height() - RDnextElem_height) +"px!important");
//				$(popupCont).find(".opus_design_RD").next().css("padding-top",($(popupCont).find(".wrap_result").height() - RDnextElem_height));
//			}
		});
	} else {
		// Layer POPUP contents 높이조절
		$(".layer_popup_contents").height($(window).height() - $(".layer_popup_title").innerHeight() - parseInt($("body").css("border-top-width"))-parseInt($("body").css("border-bottom-width")));
		var wrapPad = parseInt($(".wrap_result").css("padding-top")) + parseInt($(".wrap_result").css("padding-bottom"));
		var titHeight = $("[class^='wrap_search']").length > 0 ? $("[class^='wrap_search']").outerHeight() + $(".page_title_area").height() : wrapPad ;
		
		$(".layer_popup_contents .wrap_result").height($(".layer_popup_contents").height() - titHeight);
	}
	
}

function _CallPopUpPos(pUrl, sFeatures) {
	var sWidth, sHeight, sLeft, sTop;
	var aTmp = sFeatures.split(";");
	for (var i=0; i<aTmp.length; i++) {
		var aConfig = aTmp[i].split(":");
		if(aConfig != "") {
			aConfig[0] = aConfig[0].trim();
		}
		if(aConfig[0]=="dialogWidth") {
			sWidth = aConfig[1];
		}
		else if(aConfig[0]=="dialogHeight") {
			sHeight = aConfig[1];
		}
		else if(aConfig[0]=="dialogLeft") {
			sLeft = aConfig[1];
		}
		else if(aConfig[0]=="dialogTop") {
			sTop = aConfig[1];
		}
	}
	
	var ifr = document.getElementById("popiframe");
	if (ifr){
		$(ifr).remove();
		$('<iframe id="popiframe" name="popiframe" src="'+pUrl+ '" width="'+sWidth + '" height="' + sHeight + '"></iframe>').appendTo(".layer_popup");
	} else {
		// POPUP 이름 설정. 고유 키값처럼 쓰는 용도
		var popupName = pUrl.split(".do")[0].replace("/opuscntr/","").split("/");
		
		$('<div class="layer_popup" data-popupname="'+ popupName +'"><script>$(".layer_popup").draggable({handle:".layer_popup_drag", iframeFix: true, containment: "document", scroll:false });$("div, p").disableSelection();</script><span class="layer_popup_drag" style="width:'+ (parseInt(sWidth.replace("px",""))- 45) +'px"></span> </div>')
		.appendTo("body");
		$('<iframe id="popiframe" name="popiframe" src="'+pUrl+ '" width="'+sWidth + '" height="' + sHeight + '"></iframe>').appendTo(".layer_popup");
		
		$("body").prepend("<div class='layer_popup_bg'></div>");
		$("html").addClass("popupOpen");
		
		
		// 탭 내부 layer popup 의 경우 상단 layer_popup_bgTop 추가 생성
		if(top.document!= this.document && $(parent.document.getElementById(this.name)).parent().prevAll(".opus_design_tab:eq(0)").length > 0) {
			
			// popup type 분기 (window.open , top.document) 
			var scroll_top = $(top.document).find(".pop_html").length > 0 ? $(top.document).contents().find(".layer_popup_contents").scrollTop() : parent.pageYOffset;
			
			var tabOffsetTop = $(top.document).find(".pop_html").length > 0 ? $(parent.document.getElementById(this.name)).parent().prevAll(".opus_design_tab:eq(0)").offset().top + scroll_top : $(parent.document.getElementById(this.name)).parent().prevAll(".opus_design_tab:eq(0)").offset().top;
			var tabHeight = $(parent.document.getElementById(this.name)).parent().prevAll(".opus_design_tab:eq(0)").outerHeight() + parseInt($(parent.document.getElementById(this.name)).parent().prevAll(".opus_design_tab:eq(0)").css("margin-bottom"));
			var tabOffsetBtm = tabOffsetTop + tabHeight + $(parent.document.getElementById(this.name)).outerHeight();
//			var tabOffsetBtm = (tabOffsetTop + tabHeight + $(parent.document.getElementById(this.name)).outerHeight()) - $(top.document).height();
			var scrollTopPosi = 0;
			
			
			
			
			
			var topFixedHeight = $(top.document.body).find(".header_fixed")[0] == undefined ? 0 : $(top.document.body).find(".header_fixed").outerHeight();
			var utilbar 	   = $(top.document).find(".pop_html").length > 0 ? 0 : 26;
			
			
			if(scroll_top > 0) {
				scrollTopPosi = scroll_top - (titleHeight + (topFixedHeight -5));
			}
			
			$(parent.document.body)
			.prepend("<div class='layer_popup_bgTop' style='height:"+(tabOffsetTop + tabHeight)+"px;margin-top:-"+ scrollTopPosi +"px'><img src='/opuscntr/style/images/theme_default/pop_bg_logo.png' alt='' /></div>")
			.append("<div class='layer_popup_bgBtm' style='top:"+ (tabOffsetBtm-1 - scrollTopPosi) +"px'></div>");
			
			
			// 스크롤 위치 감안하여 위치 지정.
			if(-Math.abs(scroll_top) <= utilbar + titleHeight - $(parent.document.body).find(".layer_popup_bgTop").height()){
				
				$(parent.document.body).find(".layer_popup_bgTop").css("margin-top", utilbar + titleHeight - $(parent.document.body).find(".layer_popup_bgTop").height());
				
			} else {
				$(parent.document.body).find(".layer_popup_bgTop").css("margin-top",-Math.abs(scroll_top));
			}
			
		} 				
			$("body").prepend("<div class='layer_popup_bg'></div>");
		
		$("html").addClass("popupOpen");
		
		//drag handel hidden
		if($(window.parent.document.body).find(".layer_popup[data-popupname='"+ popupName +"']").is(":visible")) {
			$(window.parent.document.body).find(".layer_popup_drag").css("z-index","-1");
		}
	 }
		 
	 
	//레이어 팝업 열림
	$(".layer_popup_bg,.layer_popup").fadeIn(100);
	
	var adjHeight = $(window).scrollTop() + parseInt(sTop.replace("px",""));
	
	//레이어 팝업 세로/가로 가운데 위치
	$(".layer_popup[data-popupname='"+ popupName +"']").css({
		marginTop :parseInt("-" + $(".layer_popup[data-popupname='"+ popupName +"']").outerHeight()/2) + adjHeight,
		marginLeft : parseInt("-" + $(".layer_popup[data-popupname='"+ popupName +"']").outerWidth()/2)
	});
	

	// contents 크기조절. 아이프레임일 경우
	if($(".layer_popup[data-popupname='"+ popupName +"']").children("#popiframe").length > 0) {
		
		
		$(".layer_popup[data-popupname='"+ popupName +"'] #popiframe").load(function(){

			//부모 드래그 핸들러 뒤로보냄
			var parDoc = top.document == parent.document ? top : parent ; 			
			$(parDoc.document).find("#popiframe").prev().css("z-index",-1);
			$(this).prev().css("z-index",10);
			
			/***** 팝업 표준 지켜지지 않았을 경우 표준구조 강제 생성. (S) wrap_result 마저 없을 경우는 경우의 수에 넣지 않음(정말 최소한의 표준입니다.) *****/ 
			if($(this).contents().find(".layer_popup_title").length == 0) {
				$(this).contents().find(".page_title_area").each(function(){
					if(!$(this).children("h2").hasClass("page_title")){ $(this).children("h2").addClass("page_title"); }
					$(this).next('.opus_design_btn').andSelf().wrapAll('<div class="layer_popup_title"/>');
					if($(this).children("h2").children("span").length == 0){ $(this).children("h2").wrapInner("<span></span>"); }
				});
			}
			if($(this).contents().find(".layer_popup_contents").length == 0) {
				$(this).contents().find(".wrap_result").each(function(){
					$(this).prevAll('[class^="wrap_search"],[class^="wrap_result"]').andSelf().wrapAll('<div class="layer_popup_contents"/>');
				});
			}
			/***** 팝업 표준 지켜지지 않았을 경우 표준구조 강제 생성. (E) **************************************************************/
			
			
			var popupCont		= $(this).contents().find(".layer_popup_contents");
			var popupContHeight = $(this).contents().find("body").innerHeight();
			var popTitleHeight	= $(this).contents().find(".layer_popup_title").innerHeight();
			
			var resultHeight 	= popupContHeight - $(popupCont).children(".wrap_result").position().top;
			
			
			// layer_popup_contents DIV가 최상위 부모가 아닐 경우 height 100% 처리
			if($(popupCont).parent()[0].tagName != "BODY") {
				$(popupCont).parent().css("height","100%");
			}
			
			
			// wrap_result Height 지정.
			$(popupCont).css("padding-top",popTitleHeight)
			.children(".wrap_result").css("height",resultHeight-1);//border-bottom-width 1px 
			
			
			//RD 오브젝트 있을 경우 : JSP 내부에서 하드코딩으로 height 퍼센트 잡아서 처리하기로 협의. 삭제 
//			if( $(popupCont).find(".opus_design_RD").length > 0 && $(popupCont).find(".opus_design_RD").hasClass("rd_hidden") == false ) {
//				
//				var RDnextElem 		  = $(popupCont).find(".opus_design_RD").nextAll()[$(popupCont).find(".opus_design_RD").nextAll().length-1];
//				var RDnextElem_height = $(RDnextElem).position().top + parseInt($(RDnextElem).css("margin-bottom")) + $(RDnextElem).outerHeight();
//				
//				$(popupCont).find(".opus_design_RD").attr("style","height:"+ ($(popupCont).find(".wrap_result").height() - RDnextElem_height) +"px!important");
//				$(popupCont).find(".opus_design_RD").next().css("padding-top",($(popupCont).find(".wrap_result").height() - RDnextElem_height));
//			}
		});
	} else {
		// Layer POPUP contents 높이조절
		$(".layer_popup_contents").height($(window).height() - $(".layer_popup_title").innerHeight() - parseInt($("body").css("border-top-width"))-parseInt($("body").css("border-bottom-width")));
		var wrapPad = parseInt($(".wrap_result").css("padding-top")) + parseInt($(".wrap_result").css("padding-bottom"));
		var titHeight = $("[class^='wrap_search']").length > 0 ? $("[class^='wrap_search']").outerHeight() + $(".page_title_area").height() : wrapPad ;
		
		$(".layer_popup_contents .wrap_result").height($(".layer_popup_contents").height() - titHeight);
	}
}	

function _CallPopUpRD(pUrl, parmObj, sFeatures) {
	var sWidth, sHeight;
	 var aTmp = sFeatures.split(";");
	 for (var i=0; i<aTmp.length; i++) {
	  var aConfig = aTmp[i].split(":");
	  if(aConfig != "") {
	   aConfig[0] = aConfig[0].trim();
	  }
	  if(aConfig[0]=="dialogWidth") {
	   sWidth = aConfig[1];
	  }
	  if(aConfig[0]=="dialogHeight") {
	   sHeight = aConfig[1];
	  }
	 }
	
	var ifr = document.getElementById("popiframe");
	if (ifr){
		$(ifr).remove();
		$('<iframe id="popiframe" name="popiframe" src="'+pUrl+ '" width="'+sWidth + '" height="' + sHeight + '"></iframe>').appendTo(".layer_popup");
	} else {
		
		// POPUP 이름 설정. 고유 키값처럼 쓰는 용도
		var popupName = pUrl.split(".do")[0].replace("/opuscntr/","").split("/");
		
		$('<div class="layer_popup" data-popupname="'+ popupName +'"><script>$(".layer_popup").draggable({handle:".layer_popup_drag", iframeFix: true, containment: "document", scroll:false });</script><span class="layer_popup_drag" style="width:'+ (parseInt(sWidth.replace("px",""))- 45) +'px"></span></div>')
		//$('<div class="layer_popup"><script>$(".layer_popup").draggable({handle:".layer_popup_drag", iframeFix: true, containment: "document", scroll:false });$("div, p").disableSelection();</script><span class="layer_popup_drag" style="width:'+ sWidth +'"></span> </div>')
		.appendTo("body");
		
		$('<iframe id="popiframe" name="popiframe" src="'+pUrl+ '" width="'+sWidth + '" height="' + sHeight + '"></iframe>').appendTo(".layer_popup[data-popupname='"+ popupName +"']");
		//$('<button type="button" class="pop_close ir" name="pop_close" onclick="ComClosePopup();"></button>').appendTo(".layer_popup");
		
		
		//$(".layer_popup[data-popupname='"+ popupName +"']").append("<button type='button' class='pop_close ir' onclick='ComClosePopup();'>Close</button>");
		// 탭 내부 layer popup 의 경우 상단 layer_popup_bgTop 추가 생성
		if(top.document!= this.document && $(parent.document.getElementById(this.name)).parent().prevAll(".opus_design_tab:eq(0)").length > 0) {
			
			// popup type 분기 (window.open , top.document) 
			var scroll_top = $(top.document).find(".pop_html").length > 0 ? $(top.document).contents().find(".layer_popup_contents").scrollTop() : parent.pageYOffset;
			
			var tabOffsetTop = $(top.document).find(".pop_html").length > 0 ? $(parent.document.getElementById(this.name)).parent().prevAll(".opus_design_tab:eq(0)").offset().top + scroll_top : $(parent.document.getElementById(this.name)).parent().prevAll(".opus_design_tab:eq(0)").offset().top;
			var tabHeight = $(parent.document.getElementById(this.name)).parent().prevAll(".opus_design_tab:eq(0)").outerHeight() + parseInt($(parent.document.getElementById(this.name)).parent().prevAll(".opus_design_tab:eq(0)").css("margin-bottom"));
			var tabOffsetBtm = tabOffsetTop + tabHeight + $(parent.document.getElementById(this.name)).outerHeight();
//			var tabOffsetBtm = (tabOffsetTop + tabHeight + $(parent.document.getElementById(this.name)).outerHeight()) - $(top.document).height();
			var scrollTopPosi = 0;
			
			
			
			var topFixedHeight = $(top.document.body).find(".header_fixed")[0] == undefined ? 0 : $(top.document.body).find(".header_fixed").outerHeight();
			var utilbar 	   = $(top.document).find(".pop_html").length > 0 ? 0 : 26;
			
			
			if(scroll_top > 0) {
				scrollTopPosi = scroll_top - (titleHeight + (topFixedHeight -5));
			}
			
			$(parent.document.body)
			.prepend("<div class='layer_popup_bgTop' style='height:"+(tabOffsetTop + tabHeight)+"px;margin-top:-"+ scrollTopPosi +"px'><img src='/opuscntr/style/images/theme_default/pop_bg_logo.png' alt='' /></div>")
			.append("<div class='layer_popup_bgBtm' style='top:"+ (tabOffsetBtm-1 - scrollTopPosi) +"px'></div>");
			
			
			// 스크롤 위치 감안하여 위치 지정.
			if(-Math.abs(scroll_top) <= utilbar + titleHeight - $(parent.document.body).find(".layer_popup_bgTop").height()){
				
				$(parent.document.body).find(".layer_popup_bgTop").css("margin-top", utilbar + titleHeight - $(parent.document.body).find(".layer_popup_bgTop").height());
				
			} else {
				$(parent.document.body).find(".layer_popup_bgTop").css("margin-top",-Math.abs(scroll_top));
			}
			
		} 					
			$("body").prepend("<div class='layer_popup_bg'></div>");
		
		$("html").addClass("popupOpen");
		
		//drag handel hidden
		if($(window.parent.document.body).find(".layer_popup[data-popupname='"+ popupName +"']").is(":visible")) {
			$(window.parent.document.body).find(".layer_popup_drag").css("z-index","-1");
		}
	 }
		 
	 
	//레이어 팝업 열림
	$(".layer_popup_bg,.layer_popup_bgTop,.layer_popup").fadeIn(100);
	
	
	
	//레이어 팝업 세로/가로 가운데 위치
	$(".layer_popup[data-popupname='"+ popupName +"']").css({
		marginTop :parseInt("-" + $(".layer_popup[data-popupname='"+ popupName +"']").outerHeight()/2),
		marginLeft : parseInt("-" + $(".layer_popup[data-popupname='"+ popupName +"']").outerWidth()/2)
	});
	
	
	// contents 크기조절. 아이프레임일 경우
	if($(".layer_popup[data-popupname='"+ popupName +"']").children("#popiframe").length > 0) {
		
		
		
		$(".layer_popup[data-popupname='"+ popupName +"'] #popiframe").load(function(){
			
			// 부모 드래그 핸들러 뒤로보냄
			var parDoc = top.document == parent.document ? top : parent ; 			
			$(parDoc.document).find("#popiframe").prev().css("z-index",-1);
			$(this).prev().css("z-index",10);
			
			
			/***** 팝업 표준 지켜지지 않았을 경우 표준구조 강제 생성. (S) **************************************************************/ 
			if($(this).contents().find(".layer_popup_title").length == 0) {
				$(this).contents().find(".page_title_area").each(function(){
					if(!$(this).children("h2").hasClass("page_title")){ $(this).children("h2").addClass("page_title"); }
					if($(this).children("h2").children("span").length == 0){ $(this).children("h2").wrapInner("<span></span>"); }
					$(this).next('.opus_design_btn').andSelf().wrapAll('<div class="layer_popup_title"/>');
				});
			}
			if($(this).contents().find(".layer_popup_contents").length == 0) {
				$(this).contents().find(".wrap_result").each(function(){
					 $(this).prevAll('[class^="wrap_search"],[class^="wrap_result"]').andSelf().wrapAll('<div class="layer_popup_contents"/>');
				});
			}
			/***** 팝업 표준 지켜지지 않았을 경우 표준구조 강제 생성. (E) **************************************************************/
			
			
			var popupCont		= $(this).contents().find(".layer_popup_contents");
			var popupContHeight = $(this).contents().find("body").innerHeight();
			var popTitleHeight	= $(this).contents().find(".layer_popup_title").innerHeight();
			
			//만에하나 최소한의 표준인  wrap_result 가 없을경우 강제생성. 
			if ($(popupCont).children(".wrap_result").length < 1) {
				$(popupCont).wrapInner("<div class='wrap_result'></div>");
			}
			
			$(popupCont).css("padding-top",popTitleHeight);
			
			var resultHeight 	= popupContHeight - $(popupCont).children(".wrap_result").position().top;
			
			
			// layer_popup_contents DIV가 최상위 부모가 아닐 경우 height 100% 처리
			if($(popupCont).parent()[0].tagName != "BODY") {
				$(popupCont).parent().css("height","100%");
			}
			
		
			// wrap_result Height 지정.
			
			$(popupCont).children(".wrap_result").css("height",resultHeight-1);//border-bottom-width 1px
			
			//RD 오브젝트 있을 경우 : JSP 내부에서 하드코딩으로 height 퍼센트 잡아서 처리하기로 협의. 삭제
//			if( $(popupCont).find(".opus_design_RD").length > 0 && $(popupCont).find(".opus_design_RD").hasClass("rd_hidden") == false ) {
//				
//				var RDnextElem 		  = $(popupCont).find(".opus_design_RD").nextAll()[$(popupCont).find(".opus_design_RD").nextAll().length-1];
//				var RDnextElem_height = $(RDnextElem).position().top + parseInt($(RDnextElem).css("margin-bottom")) + $(RDnextElem).outerHeight();
//				
//				$(popupCont).find(".opus_design_RD").attr("style","height:"+ ($(popupCont).find(".wrap_result").height() - RDnextElem_height) +"px!important");
//				$(popupCont).find(".opus_design_RD").next().css("padding-top",($(popupCont).find(".wrap_result").height() - RDnextElem_height));
//			}
		});
	} else {
		// Layer POPUP contents 높이조절
		$(".layer_popup_contents").height($(window).height() - $(".layer_popup_title").innerHeight() - parseInt($("body").css("border-top-width"))-parseInt($("body").css("border-bottom-width")));
		var wrapPad = parseInt($(".wrap_result").css("padding-top")) + parseInt($(".wrap_result").css("padding-bottom"));
		var titHeight = $("[class^='wrap_search']").length > 0 ? $("[class^='wrap_search']").outerHeight() + $(".page_title_area").height() : wrapPad ;
		
		$(".layer_popup_contents .wrap_result").height($(".layer_popup_contents").height() - titHeight);
	}
	
} 


	

/**
 * {@link #ComOpenWindow} 함수와 동일한 처리와 함께 팝업화면을 화면의 중앙에 활성화 한다. <br>
 * bModal 인자값에 따라 팝업창이 Modal 인지 Modaless(일반팝업) 인지 선택한다. <br>
 * bModal=true인 경우 window.showModalDialog 함수를 이용하고, bModal=false인 경우 window.open
 * 함수를 이용한다. <br>
 * 팝업을 표시할 경우 가운데 표시하기위한 width, height, left, top 옵션은 자동으로 설정되고, 그외 다음과 같은 옵션이
 * 설정된다. <br>
 * window.showModalDialog 함수의 옵션 : "scroll:no; status:no; help:no;"<br>
 * window.open 함수의 옵션 : "status=no, resizable=no, scrollbars=no"<br>
 * <br>
 * <b>Example :</b>
 * 
 * <pre>
 * ComOpenWindowCenter("ESD_TPB_911.do", "ESD_TPB_911", 755, 460);
 * ComOpenWindowCenter("ESD_TPB_911.do", null, 755, 460);
 * pWin = ComOpenWindowCenter("ESD_TPB_911.do", null, 755, 460); //pWin은 팝업창 window object이다.
 * </pre>
 * 
 * @param {string}
 *            sUrl 선택,팝업창의 Url, default="about:blank"
 * @param {string}
 *            sWinName 선택,팝업창의 name 또는 dialogArguments, default=null
 * @param {string}
 *            iWidth 선택,팝업창의 넓이로 픽셀단위이며 최소100이상 설정
 * @param {string}
 *            iHeight 선택,팝업창의 높이로 픽셀단위이며 최소100이상 설정
 * @param {bool}
 *            bModal 선택,팝업의 Modal 여부 (true:Modal, false:일반팝업), default=false
 * @param {String}
 *            sScroll 선택, 스크롤바 생성 여부 (no | yes), default=no
 * @returns object<br>
 *          bModal=false로 오픈된 경우 리턴값 : 팝업창의 window Object bModal=true로 오픈된 경우
 *          리턴값 : 팝업창의 window.returnValue값
 * @see #ComOpenWindow
 */
function ComOpenWindowCenter(sUrl, sWinName, iWidth, iHeight, bModal, sScroll) {
	ComOpenWindowCenter(sUrl, sWinName, iWidth, iHeight, bModal, sScroll, 0);
}

function ComOpenWindowCenter(sUrl, sWinName, iWidth, iHeight, bModal, sScroll, addHeight) {
	 if (sScroll == undefined || sScroll == null) sScroll = "no";
	 try {
		var leftpos = (screen.width - iWidth) / 2;
		if (leftpos < 0)
			leftpos = 0;
		var toppos = (screen.height - iHeight) / 2;
		if (toppos < 0)
			toppos = 0;
		else
			if(addHeight != undefined) {
				toppos += addHeight;
			}

		if (bModal) {
			/* LAYER POPUP */
			return ComOpenWindow(sUrl, sWinName,
					"scroll:"+sScroll+";status:no;help:no;dialogWidth:" + iWidth
							+ "px;dialogHeight:" + iHeight + "px;dialogLeft:"
							+ leftpos + ";dialogTop:" + toppos, true);
			
		} else {
			/* WINDOW POPUP */
			return ComOpenWindow(sUrl, sWinName,
					"status=no, resizable=no, scrollbars="+sScroll+", width=" + iWidth
							+ ", height=" + iHeight + ", left=" + leftpos
							+ ", top=" + toppos);
		}
	} catch (err) {
		ComFuncErrMsg(err.message);
	}
}

/**
 * 공통 팝업창 호출하고, 팝업창에서 마지막 처리는 부모페이지(opener)의 특정함수를 호출하도록 지정한다. <br>
 * 부모페이지(opener)의 특정함수는 첫번째 인자는 팝업창에서 선택된 데이터의 배열이다. <br>
 * bModal 인자값에 따라 팝업창이 Modal 인지 Modaless(일반팝업) 인지 선택하며
 * {@link #ComOpenWindowCenter} 함수를 이용한다. <br>
 * 부모창(opener)의 Sheet의 특정 Cell에서 공통 팝업을 호출하는 경우 iRow, iCol, iSheetIdx 인자를 설정하여
 * 호출한다. <br>
 * 1) iRow, iCol 인자 : 해당 Cell 정보(row, col)로 팝업URL에 "&row=iRow인자값&col=iCol인자값"으로
 * 전달된다. <br>
 * 2) iSheetIdx 인자 : Sheet의 sheetObjects 배열 Index로 팝업URL에
 * "&sheetIdx=iSheetIdx인자값"으로 전달된다. <br>
 * 인자를 설정하면 url에 다음 querystring이 추가되어 조회된다. <br>
 * url?pop_mode=1&display=sDisplay인자값&func=sFunc
 * 인자값&sheet=2&row=iRow인자값&col=iCol인자값&sheetIdx=iSheetIdx인자값 <br>
 * row와 col인자를 설정하여 호출하는 경우 부모페이지(opener)의 특정함수는 첫번째 인자는 팝업창에서 선택된 데이터의 배열이고,
 * 2번째인자는 row, 3번째 인자는 col, 4번째 인자는 sheetIdx이다. <br>
 * <b>Example :</b>
 * 
 * <pre>
 *     //Modaless(일반팝업)로 팝업이 표시되고, 팝업이 닫힐때 부모(opener)의 getVVD 함수를 호출한다.
 *     ComOpenPopup('/opuscntr/COM_ENS_0B2.do?sdate=20080901&amp;edate=20081231', 770, 470, 'getVVD', '1,0,1,1,1,1,1,1');
 *     function getVVD(aryPopupData)
 *     //부모창(opener)의 sheetObjects[0] Sheet의 Cell(3,10)에서 팝업을 열었다. Modal로 팝업을 표시하고, 팝업이 닫힐때 부모(opener)의 setCntInfoInSheet함수를 호출한다.
 *     ComOpenPopup('/opuscntr/COM_ENS_0M1.do?cnt_cd=123&amp;classId=cls', 565, 480, 'setCntInfoInSheet', "1,0,1,1,1,1,1", true, false, 3, 10, 0);
 *     function setCntInfoInSheet(aryPopupData, row, col, sheetIdx)
 * </pre>
 * 
 * @param {string}
 *            sUrl 필수,호출될 팝업 주소
 * @param {int}
 *            iWidth 필수,팝업 창의 넓이
 * @param {int}
 *            iHeight 필수,팝업 창의 높이
 * @param {string}
 *            sFunc 필수,팝업에서 최종 확인을 했을때 데이터를 받을 부모창(opener)의 자바스크립트 함수명
 * @param {string}
 *            sDisplay 필수,팝업창에 있는 그리드의 컬럼 히든여부 설정(1:보임, 0:숨김)
 * @param {bool}
 *            bModal 선택,팝업의 Modal 여부 (true:Modal, false:일반팝업), default=false
 * @param {bool}
 *            b2ndSheet 선택,Sheet 2개인 팝업 오픈시 true 1개인 팝업 오픈시 false, default=false
 * @param {int}
 *            iRow 선택,Sheet의 Cell의 Row Index
 * @param {int}
 *            iCol 선택,Sheet의 Cell의 Col Index
 * @param {int}
 *            iSheetIdx 선택,Sheet의 sheetObjects 배열 Index
 * @param {string}
 *            sWinName 선택,팝업창의 name 또는 dialogArguments, default=compopup
 * @param {String}
 *            sScroll 선택, 스크롤바 생성 여부 (no | yes), default=no
 * @returns object<br>
 *          bModal=false로 오픈된 경우 리턴값 : 팝업창의 window Object bModal=true로 오픈된 경우
 *          리턴값 : 팝업창의 window.returnValue값
 * @see #ComOpenWindowCenter
 * @see #ComOpenPopupWithTarget
 */
function ComOpenPopupScroll(sUrl, iWidth, iHeight, sFunc, sDisplay, bModal, addHeight) {
	if(addHeight == undefined) {
		addHeight = 0;
	} else {
		addHeight += 0;
	}
	ComOpenPopup(sUrl, iWidth, iHeight, sFunc, sDisplay, bModal, null, null, null, null, null, "no", addHeight);
}


function ComOpenPopup(sUrl, iWidth, iHeight, sFunc, sDisplay, bModal, b2ndSheet, iRow, iCol, iSheetIdx, sWinName, sScroll, addHeight) {
	try {
		// sDisplay인자값의 Validation을 체크한다.
		if (!chkDisplayStr(sDisplay, "ComOpenPopup"))
			return;

		if (bModal == undefined || bModal == null)
			bModal = false;
		if (b2ndSheet == undefined || b2ndSheet == null)
			b2ndSheet = false;
		if (sWinName == undefined || sWinName == null)
			sWinName = "compopup";
		if (sScroll == undefined || sScroll == null) 
			 sScroll = "no";

		var pop_mode = "1"; // 1은 function 호출형, 2는 target 세팅형
		sUrl += ((sUrl.indexOf("?") == -1) ? "?" : "&") + "pop_mode="
				+ pop_mode + "&display=" + sDisplay + "&func=" + sFunc;

		// Sheet 2개인 팝업 오픈시
		if (b2ndSheet)
			sUrl += "&sheet=2";

		// 부모창(opener)의 Sheet의 특정 Cell에서 공통 팝업을 호출하는 경우
		if (iRow != undefined && iRow != null && iRow != undefined
				&& iRow != null) {
			// 1) Sheet 의 셀 정보를 전달한다.
			sUrl += "&row=" + iRow + "&col=" + iCol;

			// 2) Sheet의 sheetObjects 배열 Index
			if (iSheetIdx != undefined && iSheetIdx != null)
				sUrl += "&sheetIdx=" + iSheetIdx;
		}

		//$("body").append("<span></span>");
		if(addHeight == undefined) {
			return ComOpenWindowCenter(sUrl, sWinName, iWidth, iHeight, bModal, sScroll);
		} else {
			var sFeatures  = "scroll:no;status:no;help:no;" 
							+ "dialogWidth:"  + iWidth     + "px;" 
							+ "dialogHeight:" + iHeight    + "px;" 
							+ "dialogTop:"    + addHeight  + "px;"
			return ComOpenWindowPos(sUrl, sWinName, sFeatures, bModal);
		}
	} catch (err) {
		ComFuncErrMsg(err.message);
	}
}

/**
 * 공통 팝업창 호출하고, 팝업창에서 마지막 처리는 부모창(opener)의 Target Object를 지정해 줌으로서 팝업창에서 처리를 하도록
 * 한다. <br>
 * bModal 인자값에 따라 팝업창이 Modal 인지 Modaless(일반팝업) 인지 선택하며
 * {@link #ComOpenWindowCenter} 함수를 이용한다. <br>
 * sTargetObjList는 팝업창의 데이터를 받을 부모창의 Object명을 의미하며 다음과 같이 "|"구분과 ":"구분의 문자열로
 * 구성한다. <br>
 * 예) "popupval1:txtData1|popupval2:txtData2|popupval3:cboData1" <br>
 * 인자를 설정하면 url에 다음 querystring이 추가되어 조회된다. <br>
 * url?pop_mode=2&display=sDisplay인자값&targetObjList=sTargetObjList 인자값 <br>
 * <br>
 * <b>Example :</b>
 * 
 * <pre>
 * //Modal로 팝업이 표시되고, 완료 시 팝업창은 부모(opener)의 opener.sltStatus=loc_dpth_cd를 설정하고, opener.txtLocation=loc_cd를 설정한다.
 * ComOpenPopupWithTarget('/opuscntr/COM_ENS_0O1.do?depth=3&amp;classId=COM_ENS_0O1',
 * 		400, 500, "loc_dpth_cd:sltStatus|loc_cd:txtLocation", "0,1", true);
 * </pre>
 * 
 * @param {string}
 *            sUrl 필수,호출될 팝업 주소
 * @param {int}
 *            iWidth 필수,팝업 창의 넓이
 * @param {int}
 *            iHeight 필수,팝업 창의 높이
 * @param {string}
 *            sTargetObjList 필수,팝업에서 최종 확인을 했을때 데이터를 받을 부모창의 Object명(Input 또는
 *            Combo 등)
 * @param {string}
 *            sDisplay 필수,팝업창에 있는 그리드의 컬럼 히든여부 설정(1:보임, 0:숨김)
 * @param {bool}
 *            bModal 선택,팝업의 Modal 여부 (true:Modal, false:일반팝업), default=false
 * @param {String}
 *            sScroll 선택, 스크롤바 생성 여부 (no | yes), default=no
 * @returns object<br>
 *          bModal=false로 오픈된 경우 리턴값 : 팝업창의 window Object bModal=true로 오픈된 경우
 *          리턴값 : 팝업창의 window.returnValue값
 * @see #ComOpenWindowCenter
 * @see #ComOpenPopup
 */
function ComOpenPopupWithTarget(sUrl, iWidth, iHeight, sTargetObjList, sDisplay, bModal, sScroll) {
	try {
		// sDisplay인자값의 Validation을 체크한다.
		if (!chkDisplayStr(sDisplay, "ComOpenPopupWithTarget"))
			return;

		if (bModal == undefined || bModal == null)
			bModal = false;
		if (sScroll == undefined || sScroll == null) 
			 sScroll = "no";

		var pop_mode = "2"; // 1은 function 호출형, 2는 target 세팅형
		sUrl += ((sUrl.indexOf("?") == -1) ? "?" : "&") + "pop_mode="
				+ pop_mode + "&display=" + sDisplay + "&targetObjList="
				+ sTargetObjList;

		return ComOpenWindowCenter(sUrl, 'compopup', iWidth, iHeight, bModal, sScroll);

	} catch (err) {
		ComFuncErrMsg(err.message);
	}
}

/**
 * Modal 형태의 팝업 실행
 * @param sUrl
 * @param sTitle   // 팝업 타이틀. 여러 개의 팝업 실행시 title이 달라야 함. 
 * @param iWidth
 * @param iHeight
 * @param sFunc    // 팝업에서 결과 값 리턴 받을 함수명 지정
 * @param sDisplay
 * @param sFrame   // Frame에서 실행 되는지 아닌지 구분 iFrame에서 실행 될 경우, true
 * @param sScroll
 */
function ComOpenPopupWithTargetModal(sUrl, sTitle, iWidth, iHeight, sFunc, sDisplay, sFrame, sScroll) {
	var windowObject;

	try {
		// sDisplay인자값의 Validation을 체크한다.
		if (!chkDisplayStr(sDisplay, "ComOpenPopupWithTarget"))
			return;
		if (sScroll == undefined || sScroll == null) 
			 sScroll = "no";

		var pop_mode = "1"; // 1은 function 호출형, 2는 target 세팅형
		sUrl += ((sUrl.indexOf("?") == -1) ? "?" : "&") + "pop_mode=" + pop_mode;
		sUrl += "&display=" + sDisplay + "&func=" + sFunc;
		windowObject = ComOpenWindowCenter(sUrl, sTitle, iWidth, iHeight, false, sScroll);
	} catch (err) {
		ComFuncErrMsg(err.message);
	}

	if (!sFrame) {
		$(window.document.body).prepend("<div class='layer_popup_bg'></div>");
		$(window.document.body).find(".layer_popup_bg,.layer_popup").fadeIn(100);

		$(windowObject.window).bind("beforeunload", function() {
			$(document).find("html").removeClass("popupOpen");
			$(document).find(".layer_popup,.layer_popup_bg").remove();
		});
	} else {
		$(window.parent.document.body).prepend("<div class='layer_popup_bg'></div>");
		$(window.parent.document.body).find(".layer_popup_bg,.layer_popup").fadeIn(100);

		$(windowObject.window).bind("beforeunload", function() {
			$(parent.document).find("html").removeClass("popupOpen");
			$(parent.document).find(".layer_popup,.layer_popup_bg").remove();
		});
	}

	var pE = (window.event) ? window.event : arguments[0];
	if (pE.stopPropagation) pE.stopPropagation();

	$(".layer_popup_bg,.layer_popup", parent.document).click(function() {
		windowObject.focus()
	});
}

/**
 * {@link #ComOpenPopup}함수와 {@link #ComOpenPopupWithTarget}함수의 Display인자값이
 * 정확한지 여부를 확인하여 반환한다. <br>
 * 이 함수는 이 파일(CoPopup.js)에서만 사용하기 위한 목적으로 만들졌다.
 */
function chkDisplayStr(sDisplay, sFucnName) {
	try {
		var sMsgTitle = "[" + sFucnName + " Error] ";

		if (sDisplay != "none") {
			if (sDisplay.length >= 3) {
				var chkStr = sDisplay.substring(0, 3);
				if (chkStr != "0,0" && chkStr != "0,1" && chkStr != "1,0") {
					alert(sMsgTitle
						       + "Information to open a Popup is wrong  \n\n"
						       + "Example) A front of three word of Parameter must be '0.0','0.1','1.0'."); 
					return false;
				}
			} else {
				alert(sMsgTitle + "Information of Display Parameter is insufficient to open Popup.");  
				return false;
			}
		}

		return true;
	} catch (err) {
		ComFuncErrMsg(err.message);
	}
}

/**
 * {@link #ComOpenWindow} 함수와 동일하지만 return으로 window Object를 반환하지 않는다.
 */
function ComOpenWindow2(sUrl, sWinName, sFeatures) {
	try {
		var winObj = ComOpenWindow(sUrl, sWinName, sFeatures);
	} catch (err) {
		ComFuncErrMsg(err.message);
	}
}

/**
 * Post 방식으로 PopUp을 연다.
 * 
 * @param sUrl
 * @param sWinName
 * @param sHeight
 */
function ComPostOpenWindow(sUrl, sWinName, sFeatures) {
	window.open("", sWinName, sFeatures);
	document.form.action = sUrl;
	document.form.target = sWinName;
	document.form.method = "post";
	document.form.submit();
}


/**
 * window로 팝업이 열린경우와 Moal(LayorPopup)로 팝업이 열린 경우 각 경우에 따라 팝업창을 닫는다. 
 */
function ComClosePopup() {
	if(win_opener_button_create_obj){
		$(parent.document).find(".layer_popup,.layer_popup_bg").remove();
		window.close();
	} else {
		
		var parentW = "parent";
		
		//while (eval(parentW).name != "" && eval(parentW).name.toLowerCase().indexOf("frame") != -1){
		while (eval(parentW).name != "" && top.document != eval(parentW).document && eval(parentW).name != "popiframe"){
			parentW += ".parent";
		}
		

		//drag handel show
		if($(eval(parentW).document.body).find(".layer_popup").is(":visible")) {
			$(eval(parentW).document.body).find(".layer_popup_drag").css("z-index","10");
		}
		
		$(eval(parentW).document.body).find(".layer_popup_bgTop,.layer_popup_bgBtm").remove();
		$(parent.document).find("html").removeClass("popupOpen");
		$(parent.document).find(".layer_popup,.layer_popup_bg").remove();
		
//		PopUp에서 버튼을 사용해서  X 처리하게 되면 아래 주석을 푼다.
//		$(document).find("html").removeClass("popupOpen");
//		$(document).find(".layer_popup,.layer_popup_bg").remove();
	}
}

/**
 * window로 팝업이 열린경우와 Moal(LayorPopup)로 팝업이 열린 경우 각 경우에 따라 팝업창을 닫는다. 
 */
function ComClosePopupModal(){
	if(opener) $(opener.document).find(".layer_popup_bg,.layer_popup_bgTop,.layer_popup_bgBtm").remove();
	if(opener) window.close();
}


 /**
  * Post 방식으로 RD Popup을 띄운다. Popup창의 Size 조절 가능
  * @param sFeatures
  */
 function ComOpenRDPopup(sFeatures) {
	if(sFeatures == undefined){
	 	ComPostOpenWindow("/opuscntr/COM_RD_COMMON_POPUP.do", "ReportDesignerCommonPopup", "width=1010, height=660, status=no");
	} else{
		ComPostOpenWindow("/opuscntr/COM_RD_COMMON_POPUP.do", "ReportDesignerCommonPopup", sFeatures);
	}
 }
   
   /**
    * Post 방식으로 RD Modal Popup을 띄운다. Popup창의 Size 조절 가능
    * @param sFeatures
    */
   function ComOpenRDPopupModal(sFeatures) {
		if(sFeatures == undefined){
			ComPostOpenWindow("/opuscntr/COM_RD_COMMON_POPUP_MODAL.do", "ReportDesignerCommonPopup", "width=1010, height=660, status=no");
		} else{
			ComPostOpenWindow("/opuscntr/COM_RD_COMMON_POPUP_MODAL.do", "ReportDesignerCommonPopup", sFeatures);
		}
   }

 /**
 * 
 * @param sUserId
 */
  	function ComUserPopup(sUserId) {
  		ComOpenWindowCenter("/opuscntr/UserInfo.do?usr_id="+sUserId+"&f_cmd=104", "UserInfo", "500", "320", true);
	}
