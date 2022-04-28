<%@ page language="java" contentType="text/html;charset=utf-8" pageEncoding="utf-8"%>
<%@ page import="java.io.*" %>
<%@ page import="com.ibleaders.ibsheet7.ibsheet.excel.LoadExcel" %>
<%@ page import="com.ibleaders.ibsheet7.util.LoadExcelCallbackInterface" %>
<%@ page import="com.ibleaders.ibsheet7.util.Synchronizer" %>
<script type="text/javascript" src="../../common/CoFormControl.js"></script>
<script type="text/javascript" src="../../common/CoMessage.js"></script>
<script type="text/javascript" src="../../../style/js/jquery-1.11.0.min.js"></script>


<%
	LoadExcel ibExcel = new LoadExcel();
	ibExcel.setService(request, response);

	//System.out.println(com.ibleaders.ibsheet7.util.Version.getVersion());

    //====================================================================================================
    // [ 사용자 환경 설정 #1 ]
    //====================================================================================================
    // Html 페이지의 엔코딩이 utf-8 로 구성되어 있으면 "ibExcel.setPageEncoding("utf-8")" 로 설정하십시오.
    // 한글 헤더가 있는 그리드에서 엑셀 로딩이 동작하지 않으면 이 값을 바꿔 보십시오.
    // Down2Excel.jsp 에서의 설정값과 동일하게 바꿔주십시오.
    //====================================================================================================
	ibExcel.setPageEncoding("utf-8");

    //====================================================================================================
    // [ 사용자 환경 설정 #2 ]
	//====================================================================================================
	// LoadExcel 용도의 엑셀파일을 업로드하여 임시보관할 임시폴더경로를 지정해 주십시오.
	// 예 : "C:/tmp/"   "/usr/tmp/"
	//====================================================================================================
	//ibExcel.setTempFolder("/usr/tmp/");
	ibExcel.setTempFolder(System.getProperty("java.io.tmpdir") + "/");

    //====================================================================================================
    // [ 사용자 환경 설정 #3 ]
	//====================================================================================================
	// LoadExcel 처리를 허용할 최대 행수를 설정한다.
	// 엑셀 데이터가 지정한 행 수보다 많은 경우 메시지를 출력하고 처리가 종료된다.
	//====================================================================================================
	ibExcel.setMaxRows(20000);

    //====================================================================================================
    // [ 사용자 환경 설정 #4 ]
	//====================================================================================================
	// HeaderMatch 사용 시 시트에 있는 헤더가 엑셀에 하나라도 존재하지 않는 경우 오류메시지를 출력하고 데이터를 로딩하지 않을지 여부.
	//====================================================================================================
	// ibExcel.setStrictHeaderMatch(true);
 	try {
	    // 서버에서 병행처리를 허용할 최대 동시 작업 갯수를 설정한다.
	    Synchronizer.init(20);
	        
	    // 싱크 처리 객체로 부터 처리권한을 확인한다.
	    // 인자를 true로 설정하는 경우 : 싱크 처리 객체에서 자원을 사용가능해질때까지 최대 30초 동안 기다렸다가 자원 사용이 가능해졌을때 권한을 할당 후 true를 반환한다.
	    // 인자를 false로 설정하는 경우 : 자원 사용여부를 확인후 즉시 반환. 사용 가능하면 할당 후 true를 반환하고, 사용이 불가능한 경우 false를 반환한다.
	    boolean bToken = Synchronizer.use(false);
	 	// 싱크 객체로 부터 권한을 정상 할당 받은 경우에만 엑셀 작업을 진행한다.
 	
	    if (bToken) {
			String frm = ibExcel.getLoadFrm();
	
			if ("".equals(frm)) {
				// 서버에 저장된 파일명
				String uploadFileName = ibExcel.getUploadFileName();
				//서버에 저장된 파일 이름으로 파일객체 생성
				File oFile = new File(uploadFileName);
				//존재여부 확인
				if (oFile.exists()) {
				      long L = oFile.length();   // 파일 사이즈	
				      if(L > 5000000){			 // 특정 사이즈 초과시에 alert창 호출 (5MB)
				      	 oFile.delete();		 // 파일 삭제
		   		      	 out.println("<script>parent.ComOpenWait(false);</script>");
		   		      	 out.println("<script>var targetWnd = null; if(opener!=null) {targetWnd = opener;} else {targetWnd = parent;} targetWnd.Grids[0].LoadExcelError({Code:-4,Msg:'Excel size cannot exceed 5MB'}); </script>");
				      }else{					 // 파일 사이즈가 정상적이라면 업로드
				      	String uploadFileNameOrg = ibExcel.getUploadFileNameOrg();
				      	out.print(ibExcel.LoadExcelFile(false));
				      }
				}
			} else {
				out.print(frm);
			}
			// 엑셀 다운 완료 후 싱크 객체로 할당받은 권한을 반환한다.
	        Synchronizer.release();
		}
	    else {
	    	out.println("<script>parent.ComOpenWait(false);</script>");
	    	out.println("<script>var targetWnd = null; if(opener!=null) {targetWnd = opener;} else {targetWnd = parent;} targetWnd.Grids[0].LoadExcelError({Code:-4,Msg:'Only 20 Excel upload tasks can be done at the same time. Please try again later'}); </script>");
	    }
	} catch(Exception e) {
		out.println("<script>var targetWnd = null; if(opener!=null) {targetWnd = opener;} else {targetWnd = parent;} targetWnd.Grids[0].LoadExcelError(); </script>");

		e.printStackTrace();
	} catch (Error e) {
		out.println("<script>try{var targetWnd = null; if(opener!=null) {targetWnd = opener;} else {targetWnd = parent;} targetWnd.Grids[0].LoadExcelError(); }catch(e){}</script>");

		e.printStackTrace();
	}
%>