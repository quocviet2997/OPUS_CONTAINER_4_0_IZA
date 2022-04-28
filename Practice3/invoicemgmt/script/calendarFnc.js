var flagValidateYear = false;

function initDateTime(fm, to){
	var yearMonthFm = new Date();
	yearMonthFm.setMonth(yearMonthFm.getMonth()-1);
	var yearMonthTo = new Date();
	showYearMonth(yearMonthFm, fm);
	showYearMonth(yearMonthTo, to);
}

function showYearMonth(yearMonth, id){
	var temp = '';
	if(yearMonth.getMonth() == 0)
		temp = '01';
	else {
		if(yearMonth.getMonth() < 9)
			temp = '0' + (yearMonth.getMonth()+1);
		else
			temp = yearMonth.getMonth()+1;
		
	}
	tempYM = yearMonth.getFullYear() + '-' + temp;
	document.getElementById(id).value = tempYM;
}

function year_month_fm_onChange() {
	for(var i=0; i<sheetObjects.length; i++){
		sheetObjects[i].RemoveAll();
	}
}

function year_month_to_onChange() {
	for(var i=0; i<sheetObjects.length; i++){
		sheetObjects[i].RemoveAll();
	}
}

function year_month_fm_nextMonth(fm, to) {
	var today = new Date();
	var yearMonthFm = document.getElementById(fm).value;
	var fm_year = parseInt(yearMonthFm.slice(0, 4));
	var fm_month = parseInt(yearMonthFm.slice(-2))-1;
	try{
		if(fm_year <= today.getFullYear()){
			if (fm_year == today.getFullYear() && fm_month>= today.getMonth()-1){
				throw 'The value of Year Month From can\'t be greater or equal the value of Year Month To!';
			}
			else{
				yearMonthFm = new Date(fm_year, fm_month+1);
				showYearMonth(yearMonthFm, fm);
				year_month_fm_onChange();
			}
		}
		else{
			throw 'The value of Year Month From is greater or equal current month!';
		}
	}
	catch(e){
		ComShowMessage(e);
	}
}

function year_month_fm_preMonth(fm, to) {
	var yearMonthFm = document.getElementById(fm).value;
	var fm_year = parseInt(yearMonthFm.slice(0, 4));
	var fm_month = parseInt(yearMonthFm.slice(-2))-1;
	yearMonthFm = new Date(fm_year, fm_month-1);
	showYearMonth(yearMonthFm, fm);
	year_month_fm_onChange();
}

function year_month_to_nextMonth(fm, to) {
	var today = new Date();
	var yearMonthTo = document.getElementById(to).value;
	var to_year = parseInt(yearMonthTo.slice(0, 4));
	var to_month = parseInt(yearMonthTo.slice(-2))-1;
	try{
		if(to_year <= today.getFullYear()){
			if (to_year == today.getFullYear() && to_month > today.getMonth() - 1){
				throw 'The value of Year Month To can\'t be greater or equal current month!';
			}
			else{
				yearMonthTo = new Date(to_year, to_month+1);
				showYearMonth(yearMonthTo, to);
				year_month_to_onChange()
			}
		}
		else{
			throw 'The value of Year Month From is greater or equal current month!';
		}
	}
	catch(e){
		ComShowMessage(e);
	}
}

function year_month_to_preMonth(fm, to) {
	var today = new Date();
	var yearMonthFm = document.getElementById(fm).value;
	var yearMonthTo = document.getElementById(to).value;
	var fm_year = parseInt(yearMonthFm.slice(0, 4));
	var fm_month = parseInt(yearMonthFm.slice(-2))-1;
	var to_year = parseInt(yearMonthTo.slice(0, 4));
	var to_month = parseInt(yearMonthTo.slice(-2))-1;
	try{
		if(fm_year <= to_year){
			if (to_year == fm_year && fm_month > to_month-2){
				throw 'The value of Year Month To can\'t be lesser or equal the value of Year Month From!';
			} else{
				yearMonthTo = new Date(to_year, to_month-1);
				showYearMonth(yearMonthTo, to);
				year_month_to_onChange();
			}
		}
	}
	catch(e){
		ComShowMessage(e);
	}
}

function validateYearMonth(fm, to){
	var a = getMonthDifferent(fm, to);
	if(getMonthDifferent(fm, to)<0){
		ComShowCodeMessage('INV20001');
		return;
	}		
	if(flagValidateYear == false && getMonthDifferent(fm, to)>3){
		notificateYearMonth('INV20002');
	}
}

function notificateYearMonth(message){
	var choice = window.confirm(msgs[message]);
	if(choice)
		flagValidateYear = true;
}

function getMonthDifferent(fm, to){
	var yearMonthFm = document.getElementById(fm).value;
	var yearMonthTo = document.getElementById(to).value;
	var fm_year = parseInt(yearMonthFm.slice(0, 4));
	var fm_month = parseInt(yearMonthFm.slice(-2))-1;
	var to_year = parseInt(yearMonthTo.slice(0, 4));
	var to_month = parseInt(yearMonthTo.slice(-2))-1;
	if((fm_year*100 + fm_month) - (to_year*100 + to_month)>0){
		return -1;
	}
	return to_month - fm_month + 12*(to_year-fm_year);
}

function initPeriod(){
	var formObject = document.form;
	var tmpToYm = ComGetNowInfo("ymd", "-");
	formObject.dt_to.value = GetDateFormat(tmpToYm, "ym");
	var tmpFrYm = ComGetDateAdd(formObject.dt_to.value+"-01", "M", -1);
	formObject.dt_fm.value = GetDateFormat(tmpFrYm, "ym");
}

function GetDateFormat(obj, sFormat){
	var sVal = String(getArgValue(obj));
	sVal = sVal.replace(/\/|\-|\.|\:|\ /g,"");
	
	if(ComIsEmpty(sVal)) return "";
	
	var retValue = "";
	switch(sFormat) {
	case "ym":
		retValue = sVal.substring(0,6);
	}
	retValue = ComGetMaskedValue(retValue,sFormat);
	return retValue;
}

