<%-------------------- ê³µíµíìíì´ì§ì í¬í¨í  ì¤í¬ë¦½í¸ START --------------------%>
<SCRIPT type="text/javascript">
<!--
<%
	// Popup ëª¨ë (1: function í¸ì¶í, 2: target ì¸íí)
	String pop_mode=request.getParameter("pop_mode");	
	if(pop_mode == null || pop_mode.equals(""))
		pop_mode="1";
	// í¸ì¶í  ë¶ëª¨ì°½ì ì¤í¬ë¦½í¸ ë©ìë (pop_modeê° 1(function í¸ì¶í) ì¸ ê²½ì°)
	String func=request.getParameter("func");
	// ê°ì ì¸íí  ë¶ëª¨ì°½ì Objectëª©ë¡ (pop_modeê° 2(target ì¸íí) ì¸ ê²½ì°)
	String targetObjList=request.getParameter("targetObjList");
	// Multi Sheetì¸ ê²½ì°, ë°ì´í°ë¥¼ ê°ì ¸ì¬ Sheet ì ë³´
	String sheet=request.getParameter("sheet");	
	// Multi Sheetì¸ ê²½ì°, Sheetì Index ì ë³´
	String sheetIdx=request.getParameter("sheetIdx");
	// Sheetìì íì í¸ì¶ì, Targetì´ ëë Cellì row/col ì ë³´
	String row=request.getParameter("row");
	String col=request.getParameter("col");	
	String strDisplay=request.getParameter("display");
	String strPopOpt=null;
	String popKind=null;
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
	// 2007.01.25 : Sheet ìì ìê´ìì´ ê°ì¥ ë§ì§ë§ Sheetë¥¼ ì¸íí¨
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
	// ë¶ëª¨ì°½ì functionì í¸ì¶
	function callParentFunc() {
		<%
			if(func == null || func.equals("")) {
		%>
				ComClosePopup();
				return;
		<%
			}
		%>
		var rArray=null; //íë°ì´í°ë¥¼ ë´ê³  ìë ë°°ì´
		// ë¨ì¼ì í(Radio) ëë ë¤ì¤ì í(CheckBox) ì¼ ë..
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
//ì§ììí¨[íì¸ìë§]HANJIN: 		var rows=sheetObj.Rows;
		var rArray=null; //íë°ì´í°ë¥¼ ë´ê³  ìë ë°°ì´
    	var cArray=null; //ì´ë°ì´í°ë¥¼ ë´ê³  ìë ë°°ì´
		var selectRow=sheetObj.GetSelectRow();
       	if(selectRow == 0) {
       		return null;
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

 	function getCheckedRows(colName) {
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
		if (sheetObj.ColSaveName(1) != "") {
			<%
			String[] display=null;
			/* display ìµì Stringì ê°¯ìê° 3ì´íì¸ ê²½ì°ë Hidden ìµìì´ ìì¼ë¯ë¡,
			ìë If ì¡°ê±´ë¬¸ì strDisplay.length() > 3 ì¶ê°(2006-10-20 by Hyung Choon Roh) */
			if(strDisplay != "none" && strDisplay != null && !strDisplay.equals("") && strDisplay.length() > 3) {
				display=strDisplay.split(",");
			}
			for (int i=0; display != null && i<display.length; i++) {
				if (display[i].equals("0")) {
			%>
					sheetObj.SetColHidden(<%= i %>, 1);// ë§ì§ë§ì»¬ë¼ì¸ì¸ í¹ì ìí ì»¬ë¼ì¸ì§ë ëª¨ë¥´ê² ì¼ë íë ì¤ì ì´ ìëëê²ë ìì(ìì ë°ë~~!)
			<%
		    	}
			}
			%>
			clearInterval(myVar);
		} 
	}
//	function window::onload() {
	$(document).ready(function(){
		myVar = setInterval(function(){myTimer()},500);
	});
-->
</SCRIPT>
<%-------------------- ê³µíµíìíì´ì§ì í¬í¨í  ì¤í¬ë¦½í¸ END --------------------%>
