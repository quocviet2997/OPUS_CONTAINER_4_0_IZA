/* 버튼클릭이벤트를 받아 처리하는 이벤트핸들러 정의 */
document.onclick = processButtonClick;

var sortCnt = 3;
var popupOpt = "popup"; // or modal

/* 버튼 네임으로 구분하여 프로세스를 분기처리하는 이벤트핸들러 */
function processButtonClick(){     
     /*******************************************************/
     var formObject = document.form;

	 try {
		var srcName = window.event.srcElement.getAttribute("name");
        
        switch(srcName) {
            case "btn_add":
                insertRow(document.all.srcTblSort, document.all.tblSort)
	            break;
    	    case "btn_close":    
    	        window.close();
	            break;
	        case "btn_new":    
    	        formObject.reset();
	            break;
	         case "btn_ok":    
    	        executeSort();
	            break;
        } // end switch
	 } catch(e) {
		if( e == "[object Error]") {
			ComShowMessage(OBJECT_ERROR);
		} else {
			ComShowMessage(e);
		}
	 }
}

function executeSort() {
    
    var sheetId = document.form.sheetId.value;
    
    var sortColumns = "";
    var sortOrders  = "";
    
    for(var i=1; i<=sortCnt; i++) {
        if(document.all["sel_sort_col_" + i].value == "") {
            continue;
        }
        
        var gubun = "";
        if(i != sortCnt) {
            gubun = "|"
        }
        
        sortColumns += document.all["sel_sort_col_" + i].value + gubun;
        if(document.all["rdo_sort_opt_" + i]) {
            if(document.all["rdo_sort_opt_" + i][0].checked) {
                sortOrders  += "ASC" + "|";
            } else {
                sortOrders  += "DESC" + "|";
            }
        }
    }
    var sheetObj = opener.document.all[sheetId];
    sheetObj.ColumnSort(sortColumns, "DESC", sortOrders, true);
}

function insertRow(srcTBL,destTBL){	

    sortCnt = sortCnt + 1;
    
    var lineRow = destTBL.tBodies(0).appendChild(srcTBL.rows(0).cloneNode(true));
    var contRow = destTBL.tBodies(0).appendChild(srcTBL.rows(1).cloneNode(true));
    
    
    contRow.cells(0).childNodes(0).id = "sel_sort_col_" + sortCnt;
    contRow.cells(0).childNodes(0).name = "sel_sort_col_" + sortCnt;
    contRow.cells(1).childNodes(0).id = "rdo_sort_opt_" + sortCnt;
    contRow.cells(1).childNodes(0).name = "rdo_sort_opt_" + sortCnt;
    contRow.cells(2).childNodes(0).id = "rdo_sort_opt_" + sortCnt;
    contRow.cells(2).childNodes(0).name = "rdo_sort_opt_" + sortCnt;
    
    if(popupOpt == "popup") {    // Popup Object
        window.resizeTo(document.body.scrollWidth + 10, document.body.scrollHeight + 38)
    } else {        // Modal
        window.dialogHeight = (parseInt(window.dialogHeight) + 38) + "px";
    }    
}

function setColumnListBox() {
    
    var sheetId = document.form.sheetId.value;
    
    // 모달창인 경우는 window 객체로부터 opener를 획득			        
	if(!opener) {
	    popupOpt = "modal";
	    opener = window.dialogArguments;
	}
    
    var sheetObj = opener.document.all[sheetId];	
	var lastCol = sheetObj.lastCol;
	
	// 헤더 rows 파악
	var headerRowCnt = sheetObj.HeaderRows;
	var headerRowIdx = headerRowCnt - 1;
	
	for(var i=0; i<=lastCol; i++) {	    
	    
	    // Data Type이 아래와 같은 경우는 제외
	    var type = sheetObj.ReadDataProperty(headerRowIdx, i, dpDataType);
	    
	    if(type == dtStatus || type == dtDelCheck || type == dtSeq || type == dtHidden || type == dtRadioCheck) {
	       continue;    
	    }
	    
		for(var j=1; j<=sortCnt; j++) {
		    document.all["sel_sort_col_" + j].options.add(new Option(sheetObj.cellText(headerRowIdx, i), "" + i));
		}
		
		document.all["sel_sort_col"].options.add(new Option(sheetObj.cellText(headerRowIdx, i), "" + i));
	}
}