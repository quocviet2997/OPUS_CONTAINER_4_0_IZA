<!--
function flashWrite(url,w,h,id,bg,vars){

   var flashStr=
    "<object classid='clsid:d27cdb6e-ae6d-11cf-96b8-444553540000' codebase='http://fpdownload.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=8,0,0,0' width='"+w+"' height='"+h+"' id='"+id+"' align='middle'>"+
    "<param name='allowScriptAccess' value='always' />"+
    "<param name='movie' value='"+url+"' />"+
    "<param name='FlashVars' value='"+vars+"' />"+
    "<param name='wmode' value='transparent' />"+
    "<param name='menu' value='false' />"+
    "<param name='quality' value='high' />"+
    "<embed src='"+url+"' FlashVars='"+vars+"' wmode='transparent' menu='false' quality='high' width='"+w+"' height='"+h+"' allowScriptAccess='always' type='application/x-shockwave-flash' pluginspage='http://www.macromedia.com/go/getflashplayer' />"+
    "</object>";

    document.write(flashStr);
}

function flashWrite_noTrans(url,wsize,hsize) {
document.write("<object classid=clsid:D27CDB6E-AE6D-11cf-96B8-444553540000 codebase=http://download.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=6,0,29,0 width="+wsize+" height="+hsize+">");
document.write("<param name=movie value="+url+">");
document.write("<param name=quality value=high>");
document.write("<embed src="+url+" quality=high pluginspage=http://www.macromedia.com/go/getflashplayer type=application/x-shockwave-flash width="+wsize+" height="+hsize+"></embed>");
document.write("</object>");
}
-->