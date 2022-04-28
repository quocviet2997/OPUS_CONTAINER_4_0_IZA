var tabObjects = new Array();
var tabCnt = 0;
var currentTab = 0;

function setTabObject(tab_obj){
	tabObjects[tabCnt++] = tab_obj;
}

function initTab(tabObj, tabNo){
	switch(tabNo){
		case 1:
			tabObj.InsertItem("Summary", "");
			tabObj.InsertItem("Details", "");
			break;
	}
}

function tab1_OnClick(tabObj, index){
	showTabData(index);
}

function showTabData(index){
	currentTab = index;
	var summary = document.getElementById("summary_grid");
	var details = document.getElementById("details_grid");
	switch(index){
		case 0:
			summary.style.display = "block";
			details.style.display = "none";
			break;
		case 1:
			summary.style.display = "none";
			details.style.display = "block";
			break;
	}
}