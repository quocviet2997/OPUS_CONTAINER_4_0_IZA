var comboObjects = new Array();
var comboCnt = 0;
var partnerCnt = 0;

function setComboObject(combo_obj) {
	comboObjects[comboCnt++] = combo_obj;
}

function initCombo(comboObj, comboNo){
	with(comboObj){
		switch(comboNo){
			case 1:
				SetDropHeight(210);
				var data = partnerCb.split("|");
				geneDataCombo(comboObj, partnerCb)
				if(GetItemCount() > 1)
					SetMultiSelect(1);
				SetItemCheck(0,1);
				break;
			case 2:
				SetDropHeight(90);
				break;
			case 3:
				SetDropHeight(90);
				break;
		}
	}
}

function geneDataCombo(comboObj, dataStr){
	if(typeof dataStr !== 'undefined'){
		if(dataStr.indexOf("|") != -1){
			var data = dataStr.split("|");
			for(var j=0; j<data.length; j++){
				comboObj.InsertItem(-1, data[j], data[j]);
			}
		}
		if(dataStr.length > 0 && dataStr.indexOf("|") == -1){
			comboObj.InsertItem(-1, dataStr, dataStr);
		}
	}
}

function resetCondition(){
	for(var i=0; i<comboObjects.length; i++){
		comboObjects[i].SetSelectIndex(-1, 1);
		comboObjects[i].SetItemCheck(0, 1);
	}
}

function partner_OnCheckClick(comboObj, index, code) {
	with(comboObj){
		if(GetItemCheck(index) == true){
			partnerCnt++;
			if(index == 0){
				for(var i= 0; i<GetItemCount(); i++){
					if(i!=0 && GetItemCheck(i) == true){
						SetSelectIndex(-1,1);
						break;
					}
				}
				SetItemCheck(0,1);
				comboObjects[1].RemoveAll();
				comboObjects[2].RemoveAll();
				comboObjects[1].SetEnable(false);
				comboObjects[2].SetEnable(false);
			}
			else{
				SetItemCheck(0,0);
				getLaneData()
			}
		}
		else{
			partnerCnt--;
			getLaneData()
		}
		
		if(partnerCnt == 0){
			SetItemCheck(0,1);
		}
	}
}

function getLaneData(){
	comboObjects[1].RemoveAll();
	comboObjects[2].RemoveAll();
	document.form.f_cmd.value = SEARCH03;
	var t = FormQueryString(document.form);
	var str = sheetObjects[0].GetSearchData("DOU_TRAINING_0003GS.do", FormQueryString(document.form));
	laneCb = ComGetEtcData(str, "laneCb");
	geneDataCombo(comboObjects[1], laneCb);
	if(comboObjects[1].GetItemCount() > 0){
		comboObjects[1].SetSelectIndex(0,1);
		comboObjects[1].SetEnable(true);
	}
	else
		comboObjects[1].SetEnable(false);
}

function lane_OnSelect(comboObj, index, text) {
	comboObjects[2].RemoveAll();
	document.form.f_cmd.value = SEARCH04;
	document.form.lane.value = text;
	var str = sheetObjects[0].GetSearchData("DOU_TRAINING_0003GS.do", FormQueryString(document.form));
	tradeCb = ComGetEtcData(str, "tradeCb");
	geneDataCombo(comboObjects[2], tradeCb);
	if(comboObjects[2].GetItemCount() > 0){
		comboObjects[2].SetSelectIndex(0,1);
		comboObjects[2].SetEnable(true);
	}
	else
		comboObjects[2].SetEnable(false);
}