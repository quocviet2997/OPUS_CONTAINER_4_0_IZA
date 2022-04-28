<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<script type="text/javascript">
	function setupPage(){
		
	}
</script>

<form name="form">

<br>
<h2>&nbsp;&nbsp;OPUS 4.0 Sample Page</h2>
	<div class="wrap_result">
		<!-- opus_grid_design_btn(S) -->
		<div class="opus_design_inquiry">
			<table>
				<tr>
					<td	colspan="2" style="width:250px;"><h3 class="title_design">Business Sample</h3></td>
				</tr>
				<tr>
					<!-- <td width="150" align="center"><a href="#" onclick="ComOpenWindowCenter('/opuscntr/Sample_MailNoMrd.do', 'Sample_MailNoMrd', 800, 700)">Mail (SMTP)</a></td>
					<td width="150" align="center"><a href="#" onclick="ComOpenWindowCenter('/opuscntr/Sample_Mail.do', 'Sample_Mail', 850, 700)">RD 첨부 Mail (SMTP)</a></td> -->
					<td style="width:150px;">
						<a href="#" onclick="ComOpenWindowCenter('/opuscntr/Sample_FileUpload.do', 'Sample_FileUpload', 650, 420)">File Upload & Download</a>
					</td>
					<td>
						<a href="#" onclick="window.open('view-source:http://<%=request.getServerName()%>:<%=request.getServerPort()%>/opuscntr/sample/fileupload/jsp/fileupload.jsp')"><button type="button" class="btn_normal">jsp소스보기</button></a>
						<a href="#" onclick="window.open('view-source:http://<%=request.getServerName()%>:<%=request.getServerPort()%>/opuscntr/sample/fileupload/script/fileupload.js')"><button type="button" class="btn_normal">js소스보기</button></a>
					</td>
				</tr>
				<tr>
					<!-- <td width="150" align="center"><a href="#" onclick="ComOpenWindowCenter('/opuscntr/Sample_MailNoMrd.do', 'Sample_MailNoMrd', 800, 700)">Mail (SMTP)</a></td>
					<td width="150" align="center"><a href="#" onclick="ComOpenWindowCenter('/opuscntr/Sample_Mail.do', 'Sample_Mail', 850, 700)">RD 첨부 Mail (SMTP)</a></td> -->
					<td style="width:150px;">
						<a href="#" onclick="ComOpenWindowCenter('/opuscntr/Sample_MultiUpload.do', 'Sample_FileUpload', 650, 420)">File Multi Upload</a>
					</td>
					<td>
						<a href="#" onclick="window.open('view-source:http://<%=request.getServerName()%>:<%=request.getServerPort()%>/opuscntr/sample/fileupload/jsp/multiupload.jsp')"><button type="button" class="btn_normal">jsp소스보기</button></a>
						<a href="#" onclick="window.open('view-source:http://<%=request.getServerName()%>:<%=request.getServerPort()%>/opuscntr/sample/fileupload/script/multiupload.js')"><button type="button" class="btn_normal">js소스보기</button></a>
					</td>
				</tr>				
				<tr>
					<!-- <td width="150" align="center"><a href="#" onclick="ComOpenWindowCenter('/opuscntr/Sample_RDViewer.do', 'Sample_RDViewer', 870, 770)">RD Viewer</a></td> -->
					<td style="width:150px;">
						<a href="#" onclick="ComOpenWindowCenter('/opuscntr/BackEndJob.do', 'BackEndJob', 550, 150)">BackEnd Job</a>
					</td>
					<td>
						<a href="#" onclick="window.open('view-source:http://<%=request.getServerName()%>:<%=request.getServerPort()%>/opuscntr/sample/backendjob/thread/jsp/BackEndJobSearchSample.jsp')"><button type="button" class="btn_normal">jsp소스보기</button></a>
						<a href="#" onclick="window.open('view-source:http://<%=request.getServerName()%>:<%=request.getServerPort()%>/opuscntr/sample/backendjob/thread/script/BackEndJobSearchSample.js')"><button type="button" class="btn_normal">js소스보기</button></a>	
					</td>
				</tr>	
			</table>
		</div>
		<!-- opus_grid_design_btn(E) -->
	</div>
	<div class="wrap_result">
		<div class="opus_design_inquiry">
			<table style="width:200px;">
				<tbody>
					<tr>
						<td	colspan="5" style="width:250px;"><h3 class="title_design">Layout Sample</h3></td>
					</tr>
					<tr>
						<td>
							<a href="#" onclick="window.open('/opuscntr/divDefault.do?parentPgmNo=ADM_000_M000')">
								<img src="/opuscntr/sample/div/img/default.png" border="0"></img>
							</a>
						</td>
						<td>
							<a href="#" onclick="ComOpenPopup('/opuscntr/divPop.do', 700, 465, 'setPgmNo', '0,1',true)">
								<img src="/opuscntr/sample/div/img/popup.png" border="0"></img>
							</a>
						</td>
						<td>
							<a href="#" onclick="window.open('/opuscntr/divRD.do?parentPgmNo=ADM_000_M000')">
								<img src="/opuscntr/sample/div/img/rd.png" border="0"></img>
							</a>
						</td>
						<td>
							<a href="#" onclick="ComOpenPopup('/opuscntr/divRDPop.do', 600, 700, '', '0,1',true)">
								<img src="/opuscntr/sample/div/img/rdPop.png" border="0"></img>
							</a>
						</td>
					</tr>
					<tr>
						<td align="center">Default Sample
							<a href="#" onclick="window.open('view-source:http://<%=request.getServerName()%>:<%=request.getServerPort()%>/opuscntr/sample/div/jsp/div_Default.jsp')"><button type="button" class="btn_normal">jsp소스보기</button></a>
							<a href="#" onclick="window.open('view-source:http://<%=request.getServerName()%>:<%=request.getServerPort()%>/opuscntr/sample/div/script/div_Default.js')"><button type="button" class="btn_normal">js소스보기</button></a>
						</td>
						<td align="center">Popup Sample
							<a href="#" onclick="window.open('view-source:http://<%=request.getServerName()%>:<%=request.getServerPort()%>/opuscntr/sample/div/jsp/div_Popup.jsp')"><button type="button" class="btn_normal">jsp소스보기</button></a>
							<a href="#" onclick="window.open('view-source:http://<%=request.getServerName()%>:<%=request.getServerPort()%>/opuscntr/sample/div/script/div_Popup.js')"><button type="button" class="btn_normal">js소스보기</button></a>
						</td>
						<td align="center">RD Sample
							<a href="#" onclick="window.open('view-source:http://<%=request.getServerName()%>:<%=request.getServerPort()%>/opuscntr/sample/div/jsp/div_RD.jsp')"><button type="button" class="btn_normal">jsp소스보기</button></a>
							<a href="#" onclick="window.open('view-source:http://<%=request.getServerName()%>:<%=request.getServerPort()%>/opuscntr/sample/div/script/div_RD.js')"><button type="button" class="btn_normal">js소스보기</button></a>
						</td>
						<td align="center">RD Popup Sample
							<a href="#" onclick="window.open('view-source:http://<%=request.getServerName()%>:<%=request.getServerPort()%>/opuscntr/sample/div/jsp/div_RD_Popup.jsp')"><button type="button" class="btn_normal">jsp소스보기</button></a>
							<a href="#" onclick="window.open('view-source:http://<%=request.getServerName()%>:<%=request.getServerPort()%>/opuscntr/sample/div/script/div_RD_Popup.js')"><button type="button" class="btn_normal">js소스보기</button></a>
						</td>
					</tr>
				</tbody>
			</table>	
			
			<table class="line_bluedot"><tr><td></td></tr></table>
			
			<table style="width:200px;">
				<tbody>	
					<tr>
						<td>
							<a href="#" onclick="ComOpenPopup('/opuscntr/divRDPopHtml.do', 600, 700, '', '0,1',true)">
								<img src="/opuscntr/sample/div/img/rdPopHtml.png" border="0"></img>
							</a>
						</td>
						<td>
							<a href="#" onclick="window.open('/opuscntr/divTab.do?parentPgmNo=ADM_000_M000')">
								<img src="/opuscntr/sample/div/img/tab.png" border="0"></img>
							</a>
						</td>
						
						<td>
							<a href="#" onclick="window.open('/opuscntr/divVertical.do?parentPgmNo=ADM_000_M000')">
								<img src="/opuscntr/sample/div/img/vertical.png" border="0"></img>
							</a>
						</td>
						<td>
							<a href="#" onclick="window.open('/opuscntr/divFlex.do?parentPgmNo=ADM_000_M000')">
								<img src="/opuscntr/sample/div/img/flex.png" border="0"></img>
							</a>
						</td>
					</tr>
					<tr>
						<td align="center">RD Popup Sample With Html
							<a href="#" onclick="window.open('view-source:http://<%=request.getServerName()%>:<%=request.getServerPort()%>/opuscntr/sample/div/jsp/div_RD_PopupWithHtml.jsp')"><button type="button" class="btn_normal">jsp소스보기</button></a>
							<a href="#" onclick="window.open('view-source:http://<%=request.getServerName()%>:<%=request.getServerPort()%>/opuscntr/sample/div/script/div_RD_PopupWithHtml.js')"><button type="button" class="btn_normal">js소스보기</button></a>
						</td>
						<td align="center">Tab Sample
							<a href="#" onclick="window.open('view-source:http://<%=request.getServerName()%>:<%=request.getServerPort()%>/opuscntr/sample/div/jsp/div_Tab.jsp')"><button type="button" class="btn_normal">jsp소스보기</button></a>
							<a href="#" onclick="window.open('view-source:http://<%=request.getServerName()%>:<%=request.getServerPort()%>/opuscntr/sample/div/script/div_Tab.js')"><button type="button" class="btn_normal">js소스보기</button></a>
						</td>
						<td align="center">Vertical Sample
							<a href="#" onclick="window.open('view-source:http://<%=request.getServerName()%>:<%=request.getServerPort()%>/opuscntr/sample/div/jsp/div_Vertical.jsp')"><button type="button" class="btn_normal">jsp소스보기</button></a>
							<a href="#" onclick="window.open('view-source:http://<%=request.getServerName()%>:<%=request.getServerPort()%>/opuscntr/sample/div/script/div_Vertical.js')"><button type="button" class="btn_normal">js소스보기</button></a>
						</td>
						<td align="center">Flex Vertical Sample
							<a href="#" onclick="window.open('view-source:http://<%=request.getServerName()%>:<%=request.getServerPort()%>/opuscntr/sample/div/jsp/div_Flex.jsp')"><button type="button" class="btn_normal">jsp소스보기</button></a>
							<a href="#" onclick="window.open('view-source:http://<%=request.getServerName()%>:<%=request.getServerPort()%>/opuscntr/sample/div/script/div_Flex.js')"><button type="button" class="btn_normal">js소스보기</button></a>
						</td>
					</tr>
				</tbody>
			</table>
			<table>
				<tr>
					<td>
							<a href="#" onclick="ComOpenPopup('/opuscntr/Sample_Mail.do', 600, 700, '', '0,1',true)">
								mail
							</a>
					</td>
					<td>
							<a href="#" onclick="ComOpenPopup('/opuscntr/fax_send.do', 600, 700, '', '0,1',true)">
								fax
							</a>
					</td>
				</tr>
			</tabel>
		</div>
	
	</div>
</form>
