<%-------------------- ê³µíµíìíì´ì§ì í¬í¨í  ì¤í¬ë¦½í¸ START --------------------%>
<SCRIPT type="text/javascript">
<!--
<%
//Popup 모드 (1: function 호출형, 2: target 세팅형)
	String pop_mode = request.getParameter("pop_mode");	
	if(pop_mode == null || pop_mode.equals(""))
		pop_mode = "1";

	// 호출할 부모창의 스크립트 메소드 (pop_mode가 1(function 호출형) 인 경우)
	String func  = com.clt.framework.component.util.StringUtil.xssFilter(request.getParameter("func"));

	if("".equals(func) || func== null){
		func="callbackNotFound";
	}
	// 값을 세팅할 부모창의 Object목록 (pop_mode가 2(target 세팅형) 인 경우)
	String targetObjList = request.getParameter("targetObjList");
	
	// Multi Sheet인 경우, 데이터를 가져올 Sheet 정보
	String sheet = request.getParameter("sheet");	
	
	// Multi Sheet인 경우, Sheet의 Index 정보
	String sheetIdx = request.getParameter("sheetIdx");
	
	// Sheet에서 팝업 호출시, Target이 되는 Cell의 row/col 정보
	String row = request.getParameter("row");
	String col = request.getParameter("col");	

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
	// 2007.01.25 : Sheet 수에 상관없이 가장 마지막 Sheet를 세팅함
	try{
		if(sheetObjects == null || sheetObjects  == undefined){
			sheetObj = null;
		} else {
			sheetObj=sheetObjects[sheetObjects.length - 1];
		}
	}catch(e){}
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
				ComClosePopup();
		<%
			}
		%>
	}
	// 부모창의 function을 호출
	function callParentFunc() {
		<%
			if(func == null || func.equals("") || func.equals("callbackNotFound")) {
		%>
				ComClosePopup();
				return;
		<%
			}
		%>
		var rArray = null; //행데이터를 담고 있는 배열
		
		// 부모창의 Target Object에 값 세팅
		if("<%=popKind%>" == "radio" || "<%=popKind%>" == "checkbox") {
			rArray=getCheckedRows();
			if(rArray == null) {
				ComShowCodeMessage("COM12114", "row");
				return;
			}
        }
        // ì íë°ì¤ê° ìëê²½ì°.. ë¨ì¼ì í
        else if("<%=popKind%>" == "row") {
        	rArray=getSelectedRow();
        	if(rArray == null) {
				ComShowCodeMessage("COM12114", "row");
				return;
			}
        }
        // ëª¨ëì íì¸ ê²½ì°
        else if("<%=popKind%>" == "none") {
        	rArray = getAllRows();
        	if(rArray == null) {
				ComShowCodeMessage("COM12114", "row");
				return;
			}
        }
		// ëª¨ë¬ì°½ì¸ ê²½ì°ë window ê°ì²´ë¡ë¶í° openerë¥¼ íë
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
	// ë¶ëª¨ì°½ì Target Objectì ê° ì¸í
	function setParentTarget() {
		<%
			// Target ì ë³´ê° ììì Return
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
					// ëª¨ë¬ì°½ì¸ ê²½ì°ë window ê°ì²´ë¡ë¶í° openerë¥¼ íë			        
					if(!opener)
						opener=parent;
					var rArray=null; 	// íë°ì´í°ë¥¼ ë´ê³  ìë ë°°ì´
					var val="";	// Target Objectì ì¸íí  ê°
					var tagName=opener.document.all["<%=parentTarget%>"].tagName;
					// ë¨ì¼ì í(Radio) ëë ë¤ì¤ì í(CheckBox) ì¼ ë..
					if("<%=popKind%>" == "radio" || "<%=popKind%>" == "checkbox") {
						rArray=getCheckedRows("<%=popSource%>");
			        }
			        // ì íë°ì¤ê° ìëê²½ì°.. ë¨ì¼ì í
			        else {
			        	rArray=getSelectedRow("<%=popSource%>");
			        }
					// Target Objectì ìë ¥í  ê°ì íë
					for(var i=0; i<rArray.length; i++) {
						if(i == 0) {
							val += rArray[i];
							// Comboë°ì¤ì¸ ê²½ì°ë ë§¨ ì²ì ê°ì¼ë¡ ì¸í í break
							if(tagName == "SELECT") {								
								break;
							}
						} else {
							// ì¤ë³µì²´í¬
							if(!chkDup(val, rArray[i]))
								val += "," + rArray[i];
						}
					}
					// Target Objectì ê° ì¸í
					try {
						opener.document.all["<%=parentTarget%>"].value=val;
						try {
							// Target Objectì OnChange ì´ë²¤í¸ ë°ììí¨ë¤.
							// => ì´ê²ì Onchange ì´ë²¤í¸ë¥¼ ì§ì í Objectìë§ ìí¥ì ë¼ì¹ë¤.
							if (opener.document.all["<%=parentTarget%>"].value != "") {
								ComFireEvent(opener.document.all["<%=parentTarget%>"] , "change");
							}
						} catch(e) {}
						//ComClosePopup();
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
		if(sheetObj == null) return "";
		var colsCnt=sheetObj.LastCol()+ 1;
//ì§ììí¨[íì¸ìë§]HANJIN: 		var rows=sheetObj.Rows;
		var rArray=null; //íë°ì´í°ë¥¼ ë´ê³  ìë ë°°ì´
    	var cArray=null; //ì´ë°ì´í°ë¥¼ ë´ê³  ìë ë°°ì´
		var selectRow=sheetObj.GetSelectRow();
       	if(selectRow == 0 || selectRow == -1) {
       		return "";
       	}
       	else {
       		rArray=new Array(1);
       		// í¹ì  ì»¬ë¼ëªì´ ì§ì ë ê²½ì°
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
 		if(sheetObj == null) return null;
		var colsCnt=sheetObj.LastCol()+ 1;
//ì§ììí¨[íì¸ìë§]HANJIN: 		var rows=sheetObj.Rows;
		var rArray=null; //íë°ì´í°ë¥¼ ë´ê³  ìë ë°°ì´
    	var cArray=null; //ì´ë°ì´í°ë¥¼ ë´ê³  ìë ë°°ì´
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

 	function ComPopUpReturnValue(rArray){
 		try{
	 		if(!opener) {
				opener=parent;
	 		}
	 		<%
			if(func == null || func.equals("")) {
			%>
				return;
			<%
			} else {
			%>
				opener.<%= func %>(rArray);
			<%
			} 
			%>
			ComClosePopup(); 
 		} catch (e) {
 			ComShowMessage(e.message);
 		}
 		
 	}
 	function getCheckedRows(colName) {
 		if(sheetObj == null) return null;
		var colsCnt=sheetObj.LastCol()+ 1;

  		var sCheckRows = sheetObj.FindCheckedRow("<%=popKind%>");
    	var arrRow = sCheckRows.split("|");
 		if(sCheckRows == "") return null;

		var rArray=new Array(arrRow.length);
    	var cArray=null; //ì´ë°ì´í°ë¥¼ ë´ê³  ìë ë°°ì´
    	
    	for(idx=0; idx<arrRow.length; idx++){ 
  			cArray=null;
  			// í¹ì  ì»¬ë¼ëªì´ ì§ì ë ê²½ì°
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
		try{
			if (sheetObj.ColSaveName(1) != "") {
				<%
				String[] display=null;
				if(strDisplay != "none" && strDisplay != null && !strDisplay.equals("") && strDisplay.length() > 3) {
					display=strDisplay.split(",");
				}
				for (int i=0; display != null && i<display.length; i++) {
					if (display[i].equals("0")) {
				%>
						sheetObj.SetColHidden(<%= i %>, 1);
				<%
			    	}
				}
				%>
			}
			clearInterval(myVar);
		}catch(e){}
	}
//	function window::onload() {
	$(document).ready(function(){
		myVar = setInterval(function(){myTimer()},500);
	});
-->
</SCRIPT>
<%-------------------- ê³µíµíìíì´ì§ì í¬í¨í  ì¤í¬ë¦½í¸ END --------------------%>
