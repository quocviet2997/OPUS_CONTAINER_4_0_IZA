var ___ConstantMgr = function() {};

var CONSTANT_MGR_isHeadOfficeCode = function(param ){
	var code = CONSTANT_MGR_getBaseLocationCode();
	if( code == param ){
		return true;
	}
	return false;
}

var CONSTANT_MGR_isBaseLocationCode = function(param ){
	var code = CONSTANT_MGR_getHeadOfficeCode();
	if( code == param ){
		return true;
	}
	return false;
}


var CONSTANT_MGR_isCompanyCode = function(param ){
	var code = CONSTANT_MGR_getCompanyCode();
	if( code == param ){
		return true;
	}
	return false;
}

var CONSTANT_MGR_isCompanyName = function(param ){
	var code = CONSTANT_MGR_getCompanyName();
	if( code == param ){
		return true;
	}
	return false;
}


var CONSTANT_MGR_isScacCode = function(param ){
	var code = CONSTANT_MGR_getScacCode();
	if( code == param ){
		return true;
	}
	return false;
}


var CONSTANT_MGR_getBaseLocationCode = function(){
	//var OPCC00001 = "ABC" ;
	var tmpCode = "";
	try{
		eval( " var tmpCode = OPC001 ;");
	}catch(e){
		alert("<%=ConstantMgr.getBaseLocationCodeToJS()%> does not defined");
		return "";
	}	
	return tmpCode;
}

var CONSTANT_MGR_getHeadOfficeCode = function(){
	//var OPCC00002 = "ABC" ;
	var tmpCode = "";
	try{
		eval( " var tmpCode = OPC002 ;");
	}catch(e){
		alert("<%=ConstantMgr.getHeadOfficeCodeToJS()%> does not defined");
		return "";
	}	
	return tmpCode;
}

var CONSTANT_MGR_getCompanyCode = function(){
	//var OPCC00003 = "ABC" ;
	var tmpCode = "";
	try{
		eval( " var tmpCode = OPC003 ;");
	}catch(e){
		alert("<%=ConstantMgr.getCompanyCodeToJS()%> does not defined");
		return "";
	}	
	return tmpCode;
}

var CONSTANT_MGR_getCompanyName = function(){
	//var OPCC00003 = "ABC" ;
	var tmpCode = "";
	try{
		eval( " var tmpCode = OPC005 ;");
	}catch(e){
		alert("<%=ConstantMgr.getCompanyNameToJS()%> does not defined");
		return "";
	}	
	return tmpCode;
}


var CONSTANT_MGR_getScacCode = function(){
	//var OPCC00003 = "ABC" ;
	var tmpCode = "";
	try{
		eval( " var tmpCode = OPC004 ;");
	}catch(e){
		alert("<%=ConstantMgr.getScacCodeToJS()%> does not defined");
		return "";
	}	
	return tmpCode;
}
___ConstantMgr.prototype.isHeadOfficeCode = CONSTANT_MGR_isHeadOfficeCode;
___ConstantMgr.prototype.isBaseLocationCode = CONSTANT_MGR_isBaseLocationCode;
___ConstantMgr.prototype.isCompanyCode = CONSTANT_MGR_isCompanyCode;
___ConstantMgr.prototype.isCompanyName = CONSTANT_MGR_isCompanyName;
___ConstantMgr.prototype.isScacCode = CONSTANT_MGR_isScacCode;

___ConstantMgr.prototype.getBaseLocationCode = CONSTANT_MGR_getBaseLocationCode;
___ConstantMgr.prototype.getHeadOfficeCode = CONSTANT_MGR_getHeadOfficeCode;
___ConstantMgr.prototype.getCompanyCode = CONSTANT_MGR_getCompanyCode;
___ConstantMgr.prototype.getCompanyName = CONSTANT_MGR_getCompanyName;
___ConstantMgr.prototype.getScacCode = CONSTANT_MGR_getScacCode;

var ConstantMgr = new ___ConstantMgr();
