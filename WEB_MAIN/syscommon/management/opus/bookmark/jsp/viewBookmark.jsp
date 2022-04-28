<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html style="min-width:0!important">
<head>
	<title>OPUS Container</title>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" type="text/css" href="style/css/theme_default.css" />
	<!-- 제품 include -->
	<script type="text/javascript" src="js/ibleaders.js"></script>
	<script type="text/javascript" src="js/ibtab/ibmditab.js?version=U1"></script>
	<script type="text/javascript" src="js/ibtab/ibmditabinfo.js?version=U1"></script>
	<script type="text/javascript" src="js/ibtab/ibmditabscroll.js?version=U1"></script>
	<script type="text/javascript" src="js/ibsheet/ibsheet.js?version=U3"></script>
	<script type="text/javascript" src="js/ibcombo/ibmulticombo.js?version=U3"></script>
	<script type="text/javascript" src="js/ibcombo/ibmulticomboinfo.js?version=U1"></script>
	<script type="text/javascript" src="js/ibupload/ibupload.js?version=U2"></script>
	<!-- 제품 include -->
	<!-- common js include -->
	<script type="text/javascript" src="style/js/jquery-1.11.0.min.js?version=U1"></script>
	<script type="text/javascript" src="style/js/jquery-ui.js?version=U1"></script>
	<script type="text/javascript" src="js/common/CoCommon.js?version=U1"></script>
	<script type="text/javascript" src="js/common/CoMessage.js?version=U2"></script>
	<script type="text/javascript" src="js/common/CoFormControl.js?version=U1"></script>
	<script type="text/javascript" src="js/common/CoPopup.js?version=U1"></script>
	<script type="text/javascript" src="js/common/CoCalendar.js?version=U1"></script>
	<script type="text/javascript" src="js/common/CoObject.js?version=U2"></script>		
	<script type="text/javascript" src="js/common/IBSheetInfo.js?version=U2"></script>
	<script type="text/javascript" src="js/common/CoBiz.js?version=U1"></script>
	<script type="text/javascript" src="js/common/OfficeCodeMgr.js?version=U1"></script>
	<script type="text/javascript" src="js/common/ConstantMgr.js?version=U1"></script>
	<!-- common js include -->
	<script>
	$(window).load(function(){
		$(".btn_add_favorites").bind({
			
			click: function(){
				var btnText = $(this).text();
				var curPgmNo = parent.document.getElementById("curPgmNo").value;
				var uiTitle = parent.document.getElementById("uiTitle").value;
				var f_dp_nm = document.form.in_dp_nm;
				var prntPgmNo = parent.document.getElementById("prntPgmNo").value;
				
				if(btnText.indexOf("Add") != -1) {
					if(f_dp_nm.value != "") uiTitle = f_dp_nm.value;
					$(this).text("Delete From Favorites").addClass("btn_add_favorites_on");
					createRemoveBookmark(1,curPgmNo,uiTitle,prntPgmNo);
					f_dp_nm.style.display = "none";
					f_dp_nm.value = "";
				} else {
					$(this).text("Add To Favorites").removeClass("btn_add_favorites_on");
					createRemoveBookmark(2,curPgmNo,uiTitle,prntPgmNo);
					f_dp_nm.style.display = "inline";
				}
			},
			
			mouseenter : function(){
				if($(this).text().toLowerCase().indexOf("delete") < 0) {
					if(parent.document.getElementById("uiTitle").value == $("#in_dp_nm").val() || $("#in_dp_nm").val() == ""){
						$("#in_dp_nm").val(parent.document.getElementById("uiTitle").value);
					}
					$(".fav_inputBox").stop().animate({height:41},150);
					
					$("#in_dp_nm").focus();
				}
			},
			mouseup : function(){
				$(".fav_inputBox").stop().animate({height:0},150);
			},
			mouseleave : function(e){
				// box hide
				if(!$(e.relatedTarget).parent().hasClass("fav_inputBox") && !$(event.relatedTarget).hasClass("fav_inputBox")) {
					$(".fav_inputBox").stop().animate({height:0},150);
				}
			}
			
		});
		
		// box hide
		$(".fav_inputBox").bind("mouseleave",function(event){
			$(".fav_inputBox").stop().animate({height:0},150);
		});
		
		
		$("#btn_Del").click(function(){
			
			if(ComShowConfirm("Do you really want to delete?")){
				
				var formObj = document.form;
				var favChk = formObj.favChk;
				var i = 0;
				if(typeof(favChk.length)=="number"){
					for(var j=0;j<favChk.length;j++){
						if(favChk[j].checked == true){
							formObj.f_cmd.value=REMOVE;
							sheet1.GetSaveData("CREATEREMOVEBOOKMARK.do", FormQueryString(formObj)+"&ibflag=D&pgm_no="+favChk[j].value);
							i++;
						}
					}
				} else {
					if(favChk.checked == true){
						formObj.f_cmd.value=REMOVE;
						sheet1.GetSaveData("CREATEREMOVEBOOKMARK.do", FormQueryString(formObj)+"&ibflag=D&pgm_no="+favChk.value);
						i++;
					}
				}
					
				if(i>0){
					$("#favList").empty();
					searchBookmark();
				}
			}
			
		});
	});
	</script>
	<script>
	  	function loadPage() {
			var sheetObj=sheet1;
			sheetObj.SetWaitTimeOut(10);
			ComConfigSheet(sheetObj);
			initSheet(sheetObj,1);
			ComEndConfigSheet(sheetObj);
			searchBookmark();
		}
		function sheet1_OnSearchEnd(sheetObj, ErrMsg) {
			var formObj = document.form;
			var f_dp_nm = formObj.in_dp_nm;
			with(sheetObj){
				var favList = document.getElementById("favList");
				var curPgm = parent.document.getElementById("curPgmNo").value;
				var curFlag = "N";
				if(curPgm == ""){
					curFlag = "X";
				}
				for(var j=1;j<= sheetObj.SearchRows();j++){
					var tmpPgm = sheetObj.GetCellValue(j,"pgm_no");
					if(curPgm == tmpPgm){
						curFlag = "Y";
					} 
					var li = document.createElement("li");
					var checkbox = document.createElement("input");
					var dispNm = 
						formObj.dp_nm
					checkbox.type = "checkbox";
					if(j<10) checkbox.id = "fav_0"+j;
					else checkbox.id = "fav_"+j;
					checkbox.name = "favChk";
					checkbox.value = tmpPgm;
					var aLink = document.createElement("a");
					aLink.setAttribute("href",sheetObj.GetCellValue(j,"pgm_full_url"));
					aLink.setAttribute("target","_blank");
					aLink.appendChild(document.createTextNode(sheetObj.GetCellValue(j,"dp_nm")));
					li.appendChild(checkbox);
					li.appendChild(aLink);
					favList.appendChild(li);
				}
				if(curFlag=="Y"){
					$(".btn_add_favorites").text("Delete From Favorites").addClass("btn_add_favorites_on");
					f_dp_nm.style.display = "none";
				} else {
					$(".btn_add_favorites").text("Add To Favorites").removeClass("btn_add_favorites_on");
					f_dp_nm.style.display = "inline";
					if(curFlag=="X"){
						$(".btn_add_favorites").attr('disabled', 'disabled');
					}
				}
				
			}
		}
		function searchBookmark(){
			var sheetObj=sheet1;
			doActionIBSheet(sheetObj,document.form,IBSEARCH);
		}
		function addBookmarkItem(pgmNo,dpNm){
			var favList = document.getElementById("favList");
			var li = document.createElement("li");
			var checkbox = document.createElement("input");
			checkbox.type = "checkbox";
			var i = sheet1.RowCount()+1;
			if(i<10) checkbox.id = "fav_0"+i;
			else checkbox.id = "fav_"+i;
			var aLink = document.createElement("a");
			aLink.setAttribute("href","/opuscntr/"+pgmNo+".do");
			aLink.setAttribute("target","_blank");
			aLink.appendChild(document.createTextNode(dpNm));
			li.appendChild(checkbox);
			li.appendChild(aLink);
			favList.appendChild(li);
		}
		function createRemoveBookmark(cmd,pgmNo,dpNm, prntPgmNo){
			var formObj = document.form;
			if(cmd==1){
				$("#favList").empty();
				formObj.f_cmd.value=ADD;
				sheet1.GetSaveData("CREATEREMOVEBOOKMARK.do", FormQueryString(formObj)+"&ibflag=I&pgm_no="+pgmNo+"&prnt_pgm_no="+prntPgmNo+"&dp_nm="+dpNm);
				searchBookmark();
				//addBookmarkItem(pgmNo,dpNm);
			}else{
				$("#favList").empty();
				formObj.f_cmd.value=REMOVE;
				sheet1.GetSaveData("CREATEREMOVEBOOKMARK.do", FormQueryString(formObj)+"&ibflag=D&pgm_no="+pgmNo+"&prnt_pgm_no="+prntPgmNo);
				searchBookmark();
			}//end if
		}
		// Sheet관련 프로세스 처리
		function doActionIBSheet(sheetObj,formObj,sAction) {
			//sheetObj.ShowDebugMsg(true);
	    	switch(sAction) {
				case IBSEARCH:      //조회
					formObj.f_cmd.value=SEARCH;
	 				sheetObj.DoSearch("BOOKMARKGS.do", FormQueryString(formObj) );
					//parent.bookmark_icon_select();
					break;
	  		}
		  }
		function initSheet(sheetObj,sheetNo,flag) {
		    var cnt=0;
		    var sheetID=sheetObj.id;
		    switch(sheetID) {
		       case "sheet1":
	               with(sheetObj){
				       var HeadTitle1="|||";
				
				       SetConfig( { SearchMode:2, MergeSheet:0, Page:100, FrozenCol:0, DataRowMerge:1 } );
				
				       var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
				       var headers = [ { Text:HeadTitle1, Align:"Center"} ];
				       InitHeaders(headers, info);
				
				       var cols = [ {Type:"Text",      Hidden:1,  Width:0,	Align:"Left",    ColMerge:1,   SaveName:"dp_nm",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
									{Type:"Text",      Hidden:1,  Width:0,	Align:"Center",  ColMerge:1,   SaveName:"dp_seq",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
									{Type:"Text",      Hidden:1,  Width:0,	Align:"Left",    ColMerge:1,   SaveName:"pgm_no",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
									{Type:"Text",      Hidden:1,  Width:0,	Align:"Left",    ColMerge:1,   SaveName:"pgm_full_url",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 }  ];
				        
				       InitColumns(cols);
				       //SetEditable(1);
				       //SetCountPosition(0);
				       //SetEditableColorDiff(false);
				       ////SetImageList("bookmark","img/new_sub/btn_my_plus.gif");
				       //SetRowHidden(0, 1);
					   //SetColBackColor(0,"#FFFFFF");
				       //SetColBackColor(4,"#FFFFFF");
				       //SetActionMenu("실행하기|새창으로 실행하기");
				       ////SetSheetWidth(mainTable.clientWidth);
		               ////SetSheetHeight(mainTable.height);
			       }
			
	
				break;
			}
	    }
	</script>
</head>
<body onLoad="loadPage();">
<form name='form'>
	<input type='hidden' name='f_cmd' />
	<h2 class="fav_h">Favorite links</h2>
    <!-- favorites(S) -->
    <div class="favorites">
   		<button type="button" class="btn_add_favorites">Add to Favorites</button>
   		<div class="fav_inputBox">
   			<label for="in_dp_nm">Program Name</label><!-- 
		 --><input type="text" name="in_dp_nm" id="in_dp_nm" dataformat="engup" maxlength="50" />
		</div>
		<ul id="favList"></ul>
    	<!-- favorites(E) -->
    	<button type="button" class="btn_normal floatR" name="btn_Del" id="btn_Del">Delete Selected Items</button>	
    </div>
    <div id="mainTable" style="position:absolute;top:-9999px;left:-9999px">
		<script>ComSheetObject('sheet1');</script>
	</div>
</form>
</body>
</html>