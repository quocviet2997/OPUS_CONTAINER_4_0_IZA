<%--
=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : common_opus.jsp
*@FileTitle  : Common opus 
*@author     : CLT
*@version    : 1.0
*@since      : 2014/04/08
=========================================================
--%>
<%-------------------- 怨듯넻?앹뾽?섏씠吏???ы븿???ㅽ겕由쏀듃 START --------------------%>
<SCRIPT LANGUAGE="javascript">
<!--
<%
	// Popup 紐⑤뱶 (1: function ?몄텧?? 2: target ?명똿??
	String pop_mode=request.getParameter("pop_mode");	
	if(pop_mode == null || pop_mode.equals(""))
		pop_mode="1";
	// ?몄텧??遺紐⑥갹???ㅽ겕由쏀듃 硫붿냼??(pop_mode媛 1(function ?몄텧?? ??寃쎌슦)
	String func=request.getParameter("func");
	// 媛믪쓣 ?명똿??遺紐⑥갹??Object紐⑸줉 (pop_mode媛 2(target ?명똿?? ??寃쎌슦)
	String targetObjList=request.getParameter("targetObjList");
	// Multi Sheet??寃쎌슦, ?곗씠?곕? 媛?몄삱 Sheet ?뺣낫
	String sheet=request.getParameter("sheet");	
	// Multi Sheet??寃쎌슦, Sheet??Index ?뺣낫
	String sheetIdx=request.getParameter("sheetIdx");
	// Sheet?먯꽌 ?앹뾽 ?몄텧?? Target???섎뒗 Cell??row/col ?뺣낫
	String row=request.getParameter("row");
	String col=request.getParameter("col");	
	String strDisplay=request.getParameter("display");
	String strPopOpt=null;
	String popKind="";
	if("none".equals(strDisplay)) {
		popKind="none";
	} else {
		if(strDisplay != null && strDisplay.length() >= 3) {
			strPopOpt=strDisplay.substring(0,3);
		}
		if(strPopOpt != null) {
			if("0,1".equals(strPopOpt)) {
				popKind="checkbox";
			} else if("1,0".equals(strPopOpt)) {
				popKind="radio";
			} else if("0,0".equals(strPopOpt)) {
				popKind="row";
			} 
		}
	}
%>	
<%-- 	var sheet=<%= sheet %> --%>
	var sheetObj=null;
	// 2007.01.25 : Sheet ?섏뿉 ?곴??놁씠 媛??留덉?留?Sheet瑜??명똿??
	sheetObj=sheetObjects[sheetObjects.length - 1];
	/*
	if(sheet == 2) {
		sheetObj=sheetObjects[1];
	} else {
		sheetObj=sheetObjects[0];
	}*/
	function comPopupOK() {
		<%
			if(pop_mode != null && pop_mode.equals("1")) {
		%>
				callParentFunc();
		<%
			} else if(pop_mode != null && pop_mode.equals("2")) {
		%>
				setParentTarget();
		<%
			}
		%>
	}
	
	// 遺紐⑥갹??function???몄텧
	function callParentFunc() {
		<%
			if(func == null || func.equals("")) {
		%>
  				ComClosePopup(); 
				return;
		<%
			}
		%>
		var rArray=null; //?됰뜲?댄꽣瑜??닿퀬 ?덈뒗 諛곗뿴
		// ?⑥씪?좏깮(Radio) ?먮뒗 ?ㅼ쨷?좏깮(CheckBox) ????.
		if("<%=popKind%>" == "radio" || "<%=popKind%>" == "checkbox") {
			rArray=getCheckedRows();
			if(rArray == null) {
				ComShowCodeMessage("COM12114", "row");
				return;
			}
        }
        // ?좏깮諛뺤뒪媛 ?녿뒗寃쎌슦.. ?⑥씪?좏깮
        else if("<%=popKind%>" == "row") {
        	rArray=getSelectedRow();
        	if(rArray == null) {
				ComShowCodeMessage("COM12114", "row");
				return;
			}
        }
        // 紐⑤몢?좏깮??寃쎌슦
        else if("<%=popKind%>" == "none") {
        	rArray=getAllRows();
        	if(rArray == null) {
				ComShowCodeMessage("COM12114", "row");
				return;
			}
        }
		// 紐⑤떖李쎌씤 寃쎌슦??window 媛앹껜濡쒕???opener瑜??띾뱷
		var bModal = false;
		if(!opener) {
			opener=parent;
			bModal = true;
		}
		try {
			<%
			if(func == null || func.equals("")) {
			%>
				return;
			<%
			} else {
			%>
				if (opener.<%= func %> == undefined) {
					return ComShowMessage('Cannot find opener.<%= func %>() or parent.<%= func %>() js function');
				}
			<%
			}
				if(func != null && !func.equals("")) {					
					if(row != null && col != null) {
						if(sheetIdx != null && sheetIdx != "") {
			%>
							opener.<%= func %>(rArray, <%=row%>, "<%=col%>", <%=sheetIdx%>);
  							ComClosePopup(); 
			<%
						} else {
			%>
							opener.<%= func %>(rArray, <%=row%>, "<%=col%>");
  							ComClosePopup(); 
			<%
						}
					} else {
			%>
						opener.<%= func %>(rArray);
  						ComClosePopup(); 
			<%
					}
				}
			%>
		}
		catch(e) {
		 	ComShowCodeMessage("COM12111");
		}
	}
	// 遺紐⑥갹??Target Object??媛??명똿
	function setParentTarget() {
		<%
			// Target ?뺣낫媛 ?놁쓣??Return
			if(targetObjList == null || targetObjList.equals("")) {
		%>
  				ComClosePopup(); 
				return;
		<%
			} else {
			java.util.StringTokenizer tokenTarget=new java.util.StringTokenizer(targetObjList, "|");
			while(tokenTarget.hasMoreTokens()) {
				String unit=(String)tokenTarget.nextToken();
				if(unit.indexOf(":") != -1) {
					java.util.StringTokenizer tokenUnit=new java.util.StringTokenizer(unit, ":");
					String popSource=(String)tokenUnit.nextToken();
					String parentTarget=(String)tokenUnit.nextToken();
		%> 
					// 紐⑤떖李쎌씤 寃쎌슦??window 媛앹껜濡쒕???opener瑜??띾뱷			        
					if(!opener)
						opener=parent;
					var rArray=null; 	// ?됰뜲?댄꽣瑜??닿퀬 ?덈뒗 諛곗뿴
					var val="";	// Target Object???명똿??媛?
					var tagName=opener.document.all["<%=parentTarget%>"].tagName;
					// ?⑥씪?좏깮(Radio) ?먮뒗 ?ㅼ쨷?좏깮(CheckBox) ????.
					if("<%=popKind%>" == "radio" || "<%=popKind%>" == "checkbox") {
						rArray=getCheckedRows("<%=popSource%>");
			        }
			        // ?좏깮諛뺤뒪媛 ?녿뒗寃쎌슦.. ?⑥씪?좏깮
			        else {
			        	rArray=getSelectedRow("<%=popSource%>");
			        }
					// Target Object???낅젰??媛믪쓣 ?띾뱷
					for(var i=0; i<rArray.length; i++) {
						if(i == 0) {
							val += rArray[i];
							// Combo諛뺤뒪??寃쎌슦??留?泥섏쓬 媛믪쑝濡??명똿 ??break
							if(tagName == "SELECT") {								
								break;
							}
						} else {
							// 以묐났泥댄겕
							if(!chkDup(val, rArray[i]))
								val += "," + rArray[i];
						}
					}
					// Target Object??媛??명똿
					try {
						opener.document.all["<%=parentTarget%>"].value=val;
						try {
							// Target Object??OnChange ?대깽??諛쒖깮?쒗궓??
							// => ?닿쾬? Onchange ?대깽?몃? 吏?뺥븳 Object?먮쭔 ?곹뼢???쇱튇??
							opener.document.all["<%=parentTarget%>"].fireEvent("onchange");
						} catch(e) {}
  							ComClosePopup(); 
					}
					catch(e) {
					 	ComShowCodeMessage("COM12111");
					}
		<%		
				}
			}	
			}
		%>
	}
	function chkDup(val, ind) {
		var bDup=false;
		var arrVal=val.split(",");
		for(var i=0; i<arrVal.length; i++) {
			if(arrVal[i] == ind) {
				bDup=true;
				break;
			}
		}
		return bDup;
	}
	function getSelectedRow(colName) {
		var colsCnt=sheetObj.LastCol()+ 1;
//吏?먯븞???뺤씤?붾쭩]HANJIN: 		var rows=sheetObj.Rows;
		var rArray=null; //?됰뜲?댄꽣瑜??닿퀬 ?덈뒗 諛곗뿴
    	var cArray=null; //?대뜲?댄꽣瑜??닿퀬 ?덈뒗 諛곗뿴
		var selectRow=sheetObj.GetSelectRow();
       	if(selectRow == 0) {
       		return null;
       	}
       	else {
       		rArray=new Array(1);
       		// ?뱀젙 而щ읆紐낆씠 吏?뺣맂 寃쎌슦
       		if(colName != null && colName != "") {
//       			cArray = sheetObj.CellValue(i, colName);
       			cArray=sheetObj.GetCellValue(selectRow, colName);
       		} else {
	       		cArray=new Array(colsCnt);
	  			for(var j=0; j<cArray.length; j++) {
	  				cArray[j]=sheetObj.GetCellValue(selectRow, j);
	            }
	        }
            rArray[0]=cArray;
            return rArray;
       	}
	}
	function getAllRows() {
		var checkRows;
		var colsCnt=sheetObj.LastCol()+ 1;
//吏?먯븞???뺤씤?붾쭩]HANJIN: 		var rows=sheetObj.Rows;
		var rArray=null; //?됰뜲?댄꽣瑜??닿퀬 ?덈뒗 諛곗뿴
    	var cArray=null; //?대뜲?댄꽣瑜??닿퀬 ?덈뒗 諛곗뿴
    	var idx=0;
    	var rowCount=sheetObj.RowCount();
    	rArray=new Array(rowCount);
		for(var i=0; i < rowCount; i++) {
			cArray=new Array(colsCnt);
			for(var j=0; j<cArray.length; j++) {
             	cArray[j]=sheetObj.GetCellValue(i + sheetObj.HeaderRows(), j);
            }        
	        rArray[idx++]=cArray;
  		}
	  	return rArray;
	}
 	function getCheckedRows(colName) {

		var colsCnt=sheetObj.LastCol()+ 1;



  		var sCheckRows = sheetObj.FindCheckedRow("<%=popKind%>");
    	var arrRow = sCheckRows.split("|");
 		if(sCheckRows == "") return null;

		var rArray=new Array(arrRow.length);
    	var cArray=null; //챙혰쨈챘혥째챙혶쨈챠혙째챘짜쩌 챘혢쨈챗쨀혻 챙혷혞챘혡혬 챘째째챙혰쨈
    	

    	for(idx=0; idx<arrRow.length; idx++){ 

  			cArray=null;
  			// 챠혡쨔챙혻혮 챙쨩짭챘혺쩌챘짧혚챙혶쨈 챙짠?챙혻혮챘혨혵 챗짼쩍챙혳째
  			if(colName != null && colName != "") {
  				cArray=sheetObj.GetCellValue(arrRow[idx], colName);
  			} else {
  				cArray=new Array(colsCnt);
	  			for(var j=0; j<cArray.length; j++) {
	  				cArray[j]=sheetObj.GetCellValue(arrRow[idx], j);
                }
            }
            rArray[idx]=cArray;
    	}


	  	return rArray;
	}
	var myVar;
	function myTimer() {
		if (sheetObj.ColSaveName(1) != "") {
			<%
			String[] display=null;
			/* display ?듭뀡 String??媛?닔媛 3?댄븯??寃쎌슦??Hidden ?듭뀡???놁쑝誘濡?
			?꾨옒 If 議곌굔臾몄뿉 strDisplay.length() > 3 異붽?(2006-10-20 by Hyung Choon Roh) */
			if(strDisplay != "none" && strDisplay != null && !strDisplay.equals("") && strDisplay.length() > 3) {
				display=strDisplay.split(",");
			}
			for (int i=0; display != null && i<display.length; i++) {
				if (display[i].equals("0")) {
			%>
					sheetObj.SetColHidden(<%= i %>, 1);// 챘짠혞챙짠?챘짠혟챙쨩짭챘혺쩌챙혶쨍챙혶쨍 챠혡쨔챙혻혮챙혚혢챠혣혚 챙쨩짭챘혺쩌챙혶쨍챙짠?챘혡혬 챘짧짢챘짜쨈챗짼혻챙혵쩌챘혗혱 챠혷혞챘혫혻챙혙짚챙혻혮챙혶쨈 챙혮혞챘혨혱챘혡혬챗짼혘챘혧혙 챙혷혞챙혶혣(챙혞혱챙혻혮챘째혬챘혷혣~~!)
			<%
		    	}
			}
			%>
			clearInterval(myVar);
		} 
	}
//	function window::onload() {
	$(document).ready(function(){
		myVar=setInterval(function(){myTimer()},500);
	});
-->
</SCRIPT>
<%-------------------- 怨듯넻?앹뾽?섏씠吏???ы븿???ㅽ겕由쏀듃 END --------------------%>
