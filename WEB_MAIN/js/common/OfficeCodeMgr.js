var ___OfficeCodeMgr = function() {};

var OFFICE_CODE_MGR_checkContainOfficeCode 
		= function(ofcGrpCd, subSysCd,ofcCd ){
			//var GRP_000001_COM = {"SUB_SYS_CD":"COM","OFC_CD_LIST":["CLTH","SELDD","SELDDD","SELHO","SELSTF"]};
			var tmpCode = "-1";
			try{
				eval( " var tmpCode = GRP_" +ofcGrpCd+"_"+ subSysCd +";");
			}catch(e){
				alert("<%=OfficeCodeMgr.getOfficeCodeListToJS(\""+ofcGrpCd+"\",\""+subSysCd+"\")%> does not defined");
				return false;
			}
			 
			if( tmpCode.OFC_CD_LIST.length > 0){
				var joinCode = "|" + tmpCode.OFC_CD_LIST.join("|") +"|";
				if( joinCode.indexOf( "|"+ ofcCd +"|" ) >= 0 ){
					return true;
				}
			}			
			return false;
		};

var OFFICE_CODE_MGR_getOfficeCodeList 
		= function(ofcGrpCd, subSysCd ){
			//var GRP_000001_COM = {"SUB_SYS_CD":"COM","OFC_CD_LIST":["CLTH","SELDD","SELDDD","SELHO","SELSTF"]};
			var tmpCode = "-1";
			try{
				eval( " var tmpCode = GRP_" +ofcGrpCd+"_"+ subSysCd +";");
			}catch(e){
				alert("<%=OfficeCodeMgr.getOfficeCodeListToJS(\""+ofcGrpCd+"\",\""+subSysCd+"\")%> does not defined");
				return new Array();
			}
			 		
			return tmpCode.OFC_CD_LIST;
		};


___OfficeCodeMgr.prototype.checkContainOfficeCode = OFFICE_CODE_MGR_checkContainOfficeCode;
___OfficeCodeMgr.prototype.getOfficeCodeList = OFFICE_CODE_MGR_getOfficeCodeList;

var OfficeCodeMgr = new ___OfficeCodeMgr();
