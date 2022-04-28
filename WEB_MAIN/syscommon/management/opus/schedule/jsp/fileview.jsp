<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page import="java.io.File"%>
<%@ page import="java.io.BufferedInputStream"%>
<%@ page import="java.io.BufferedOutputStream"%>
<%@ page import="java.io.FileInputStream"%>
<%@ page import="java.io.FileNotFoundException"%>
<%@ page import="java.util.zip.*"%>
<%@ page import="java.io.*"%>
<%!
        int currPos = 0;
		int firstClickPos = 0;
		String firstclick = "Y";
		String filename = null;
%>
<%!
private String readString(String command, String filePath, String readPos, String readByte){
	String contents = null;
	try{
		FileInputStream fr = null;
		File file = new File(filePath);
		filename = file.getName();
		long len = file.length();
		int readbytes = Integer.parseInt(readByte);
		int readPosition = Integer.parseInt(readPos);
		
		// 프로그램 소스이면 전체 내용을 출력해야 한다 .
		if ( (filePath.toLowerCase().lastIndexOf(".java") > 0) || (filePath.toLowerCase().lastIndexOf(".jsp")> 0)
		  || (filePath.toLowerCase().lastIndexOf(".js") > 0) || (filePath.toLowerCase().lastIndexOf(".html") > 0) 
		  || (filePath.toLowerCase().lastIndexOf(".xml") > 0)|| (filePath.toLowerCase().lastIndexOf(".out") > 0)) {
			contents = readString(filePath, 0, (int)len);
			currPos = (int)len;
			return contents;
		}
		
		if ( command.equals("first")) {
			contents = readString(filePath, 0, readbytes);
			currPos = readbytes;
		} else if ( command.equals("prev")) {
			readPosition = readPosition - readbytes;
			if ( readPosition < 0 ) readPosition = 0;
			contents = readString(filePath, readPosition, readbytes);
			currPos = readPosition - readbytes;
		} else if ( command.equals("next")) {
			if ( readPosition > len ) readPosition = (int)len - readbytes;
			contents = readString(filePath, readPosition, readbytes);
			currPos = readPosition + readbytes;
		} else if ( command.equals("last")) {
			readPosition = (int)len - readbytes;
			if ( readPosition < 0 ) readPosition = 0;
			contents = readString(filePath, readPosition, readbytes);
			currPos = readPosition - readbytes;
		} else if ( command.equals("download")) {
			// 다운로드시에는 readByte 는 파일의 맨 끝에서부터 readByte 만큼 앞으로 가서 다운로드 받는다.
			firstClickPos = (int)len - readbytes;
			readbytes = (int)len - firstClickPos;
			contents = readString(filePath, firstClickPos, readbytes);
		}
		
	}catch(Exception e){
		return null;
	}

	return contents;
}

private String readString(String filePath, int readPos, int readByte){
    FileInputStream fr = null;
    
    InputStream in = null;
    InputStreamReader ir = null;
    BufferedReader br = null;
    
    StringBuffer sbContents = new StringBuffer();
    try {
        File file = new File(filePath);

        if(!(file.exists() && file.isFile())){
            return null;
        }
        
        fr = new FileInputStream(file);
        ir = new InputStreamReader(fr,"UTF-8");
        br = new BufferedReader(ir);
        br.skip(readPos);
        
        char[] c = new char[readByte];
        int len = 0;
        
        if ((len = br.read(c, 0, c.length)) != -1) {
        	sbContents.append(c, 0, len);
        }
        
    }catch(FileNotFoundException e){
        return null;
    }catch(IOException e){
        return null;    
    }catch(Exception e){
            return null;
    }finally{
    	try{
            if(br != null){
                br.close();
            }
    	}catch(Exception e){;}
    	try{
            if(ir != null){
                ir.close();
            }
    	}catch(Exception e){;}
    	try{
            if(fr != null){
                fr.close();
            }
    	}catch(Exception e){;}
	}
    return sbContents.toString();
}

// 파일 다운로드...
private void download(HttpServletRequest request, HttpServletResponse response, File file){
    
	FileInputStream fin = null;
	BufferedOutputStream outs = null;
 
    try {
        response.reset() ;
        response.setContentType("application/smnet");
        String strClient = request.getHeader("user-agent");

        response.setHeader("Content-Type", "application/octet-stream; charset=euc-kr");
        response.setHeader("Content-Disposition", "attachment;filename=" + file.getName() + ";");
        response.setHeader("Content-Length", ""+file.length() );

		fin = new FileInputStream(file);
		//BufferedOutputStream bufferedOutputStream = null;
		
		outs = new BufferedOutputStream(response.getOutputStream());
		//byte byteData[] = new byte[(int) file.length()];
		byte[] buffer = new byte[1024];
		int read = 0;
		 while ((read = fin.read(buffer)) != -1) {
		        outs.write(buffer, 0, read);
		      }

		outs.flush();

    }catch(FileNotFoundException e){
        return;
    } catch (IOException e) {
        return;
    } catch ( Exception e ) {
        return;
    } finally {
        if ( fin != null ) try {fin.close();} catch ( Exception e ) {;}
        if ( outs != null ) try {outs.close();} catch ( Exception e ) {;}
    }
}
%>
<%
        String filepath=request.getParameter("filepath");
        String readPos=request.getParameter("readpos");
        String readbyte=request.getParameter("readbyte");
        String lastFlag=request.getParameter("lastflag");
        String command=request.getParameter("command");
        String dnldSize=request.getParameter("dnldsize");
        
        String contents = null;
        
        File file = new File(filepath);
        long fileSize = file.length();

        if (file == null || !file.exists() || file.length() <= 0 || file.isDirectory()) {
            out.println("The file comes to erase, or there is not a contents.");
        } else {
        
	        if ( fileSize > 1024*1024 ){
	        	download(request, response, file);
	        } else {
	        	contents = readString(command, filepath, readPos, readbyte);
	    		contents = contents.replaceAll("&","&amp;").replaceAll("<","&lt;")
	    		.replaceAll(">","&gt;").replaceAll(" ","&nbsp;")
	    		.replaceAll("\t","&nbsp;&nbsp;&nbsp;&nbsp;").replaceAll("\\n","<br>");
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>FileViewer</title>
<script language="javascript">
function readFirstFile(){
	document.form1.target="_self";
    document.form1.readpos.value='0';
    document.form1.command.value='first';
    document.form1.readbyte.value='10000';
    document.form1.filepath.value='<%=filepath%>';
    document.form1.submit();
}
function readPrevFile(){
	document.form1.target="_self";
	document.form1.command.value='prev';
    document.form1.readpos.value='<%=currPos%>';
    document.form1.filepath.value='<%=filepath%>';
    document.form1.readbyte.value='10000';
    document.form1.submit();
}
function readNextFile(){
	document.form1.target="_self";
	document.form1.command.value='next';
    document.form1.readpos.value='<%=currPos%>';
    document.form1.filepath.value='<%=filepath%>';
    document.form1.readbyte.value='10000';
    document.form1.submit();
}
function readLastFile(){
	document.form1.target="_self";
    document.form1.command.value='last';
    document.form1.readbyte.value='10000';
    document.form1.readpos.value='<%=currPos%>';
    document.form1.filepath.value='<%=filepath%>';
    document.form1.submit();
}

function downloadFile(){
	document.form1.target="dlnd";
    document.form1.command.value='download';
    document.form1.readbyte.value='10000';
    document.form1.readpos.value='<%=currPos%>';
    document.form1.filepath.value='<%=filepath%>';
    document.form1.submit();
}
</script>
</head>
<body>
<form name="form1" action="FileView.screen" method="post">
<table border="0" cellspacing="0" cellpadding="0" class="search">
	<!--tr>
		<td><font color="blue"><b> FileName : <%=filename %></b></font></td>
	</tr-->
	<tr>
		<td><%=contents%></td>
	</tr>
	<tr>
		<td>
		<font color="blue"><br>
<!--			<input type="button" value="First" name="first"	onClick="readFirstFile();" /> &nbsp;
			<input type="button" value="Prev" name="previous" onClick="readPrevFile();" /> &nbsp;
			<input type="button" value="Next" name="next" onClick="readNextFile();" /> &nbsp;
			<input type="button" value="Last" name="last" onClick="readLastFile();" /> &nbsp;
			다운로드 사이즈 : 최종 <input type="text" size=20 value="100000" name="dnldsize" /> bytes
			<input type="button" value="DownLoad" name="download" onClick="downloadFile();" />-->
		</font>
		</td>
	</tr>	
</table>
	<input type="hidden" name="readpos" /> 
	<input type="hidden" name="lastflag" />
	<input type="hidden" name="readbyte" /> 
	<input type="hidden" name="filepath" />
	<input type="hidden" name="command" />
</form>
<iframe name="dlnd" style="display:none;width:1px;height:1px;"></iframe>
</body>
</html>
<%		}
	}
%>