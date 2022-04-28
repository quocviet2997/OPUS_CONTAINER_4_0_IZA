/*
* multi object embed
* for standard
* Ver 0.91
*/
function setEmbed(){ 
	var objId = new String; 
	var parameter = new String; 
	var clsid = new String; 
	var codebase = new String; 
	var pluginspage = new String; 
	var embedType = new String; 
	var src = new String; 
	var width = new String; 
	var height = new String; 
	this.init = function(oSrc, oWidth, oHeight, oId) {
		thisFileName = getFileName(oSrc).split(".")[0];
		thisFileType = getFileName(oSrc).split(".")[1];
		thisFileType = thisFileType.replace(" ", "");
		
		if (!oId){
			oId = thisFileName;
		}

		switch(thisFileType){
			case "swf" : {
				embedType = "application/x-shockwave-flash";
				mediaType = "flash";
				} break;
			case "wmv" : {
				embedType = "video/x-ms-wmv";
				mediaType = "movie";
				} break;
			case "wma" : {
				embedType = "audio/x-ms-wma";
				mediaType = "movie";
				} break;
			case "mp3" : {
				embedType = "audio/mpeg";
				mediaType = "movie";
				} break;
			case "asf" : {
				embedType = "video/x-ms-asf ";
				mediaType = "movie";
				} break;
			case "avi" : {
				embedType = "video/x-msvideo";
				mediaType = "movie";
				} break;
			case "mpeg" :
			case "mpg" : {
				embedType = "video/mpeg";
				mediaType = "movie";
				} break;
		}

		if (mediaType == "flash"){ 
			clsid = "D27CDB6E-AE6D-11cf-96B8-444553540000";
			codebase = "https://download.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=10,0,0,0"; 
			pluginspage = "http://www.macromedia.com/go/getflashplayer"; 
			parameter += "<param name='quality' value='high'>\n"; 
		} 
		else if (mediaType == "movie"){ 
			clsid="CLSID:6BF52A52-394A-11d3-B153-00C04F79FAA6";
			codebase="https://activex.microsoft.com/activex/controls/mplayer/en/nsmp2inf.cab#Version=6,4,5,715";
			pluginspage="http://www.microsoft.com/windows/mediaplayer/download/default.asp";
		} 

		if (thisFileType == "mov"){ 
			clsid="CLSID:02BF25D5-8C17-4B23-BC80-D3488ABDDC6B";
			codebase="http://www.apple.com/qtactivex/qtplugin.cab";
			pluginspage="http://www.microsoft.com/windows/mediaplayer/download/default.asp";
			embedType="video/quicktime";
		} 

		src = oSrc;
		width = oWidth;
		height = oHeight;
		objId = oId;	
	} 

	this.param = function(parm , value) {      
		parameter += "<param name='"+parm +"' value='"+ value + "'>\n";
	}  


	this.show = function(chk) { 
		if (clsid){ 
			obj = '<object classid="clsid:'+ clsid +'" codebase="'+ codebase +'" width="'+ width +'" height="'+ height +'" id="' + objId + '">\n';
			obj += '<param name="src" value="'+ src + '">\n';
			obj += '<param name="url" value="'+ src + '">\n';
			obj += parameter;
			obj += 'You need to get the latest <a href="http://www.macromedia.com/go/getflashplayer">Flash Player</a> to see this object.<br />';
			obj += '최신의 <a href="http://www.macromedia.com/go/getflashplayer">플래시 플레이어</a>가 필요합니다.';
			obj += '</object>\n';
			obj += '<!--<![endif]-->';
			obj += '</object>\n'; 
			//eval("window." + objId + " = document.getElementById('" + objId + "');");
		}
		
		if(!chk){
			document.write(obj);
		}else{
			chk.innerHTML = obj;
		}
	}
}

function getFileName(uri){
	if(uri.indexOf("#")>0)uri = uri.substr(0,uri.indexOf("#"));
	if(uri.indexOf("&")>0)uri = uri.substr(0,uri.indexOf("&"));
	if(uri.indexOf("?")>0)uri = uri.substr(0,uri.indexOf("?"));
	var thisUriArray = uri.split(/\//);
	var thisFileName = thisUriArray[thisUriArray.length-1];
	return thisFileName;
}

function getSWF(movieName) {
    if (navigator.appName.indexOf("Microsoft") != -1) {
		if (window.document[movieName])	return window.document[movieName];
    }
	else {
		if (!window.document[movieName]) return document.getElementById(movieName);
		if(document[movieName].length != undefined)	return document[movieName][1];
    }
}


function IE_HtmlRewrite(objParent) {
	if (window.ActiveXObject && objParent) {
		objParent.innerHTML = objParent.innerHTML;
	}
}