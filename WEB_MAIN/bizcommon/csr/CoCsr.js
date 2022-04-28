/**
	* 오류 메세지 가져오기
	*
	* @param msgNo 오류 번호
	* @param msg1 출력 변수1
	* @param msg2 출력 변수2
	* @param msg3 출력 변수3
	* @return 오류메세지
	*/
function  getMsg(msgNo,msg1,msg2,msg3)
{
	var msgs=new Array();
	// 일반 입력 형식 관련 메세지
	msgs['COM12111']='The service is not available now.';
	msgs['COM12112']='Do you really want to exit?';
	msgs['COM12113']='Please select ' + msg1;
	msgs['COM12114']='Please check ' + msg1;
	msgs['COM12115']=msg1 + ' has been duplicated.';
	msgs['COM12116']=msg1 + ' has been completed.';
	msgs['COM12117']=msg1 + ' has been canceled.';
	msgs['COM12118']='Please select ' + msg2 + ' of ' + msg1 + '.';
	msgs['COM12119']='Please select only one  ' + msg2 + ' of ' + msg1 + '.';
	msgs['COM12120']='Please enter ' + msg2 + ' of ' + msg1 + ' first row.';
	msgs['COM12121']='Processing the addition of ' + msg1 ;
	msgs['COM12122']=msg1 + ' can only contain numbers.';
	msgs['COM12123']=msg1 + ' can only contain letters.';
	msgs['COM12124']=msg1 + ' cannot contain numbers.\n\n Please enter letters only.';
	msgs['COM12125']=msg1 + ' cannot contain letters.\n\n Please enter numbers only.';
	msgs['COM12126']='Please enter ' + msg1 + ' in Korean.';
	msgs['COM12127']='Please enter ' + msg1 + ' in either English letters or numbers.';
	msgs['COM12128']='Please enter ' + msg1 + ' using a combination of English letters and numbers.';
	msgs['COM12129']=msg1 + ' cannot contain special characters.';
	msgs['COM12130']='Please enter ' + msg2 + ' of ' + msg1 + '.';
	// 날짜 형식 관련 메세지
	msgs['COM12131']=msg1 + ' must be greater than the current date.';
	msgs['COM12132']='Please enter a valid date format: YYYY-MM-DD';
	msgs['COM12133']=msg1 + ' must be ' + msg3 + ' than ' + msg2 + '.';
	msgs['COM12134']='Please enter a valid date format for('+ msg1 + ') : YYYY-MM-DD';
	// 숫자 형식 관련 메세지
	msgs['COM12135']='Please round ' + msg3 + ' from a minimum of ' + msg2 + ' decimal place to a maximum ' + msg1 + ' decimal place.';
	msgs['COM12136']='Please round ' + msg1 + ' to a whole number.';
	msgs['COM12137']=msg1 + ' must start with ' + msg2 + ' and must be ' + msg3 + ' characters long.';
	// 단순 메세지
	msgs['COM12138']='Please enter ' + msg1 + ' or ' + msg2 + '.';
	msgs['COM12139']='Please select ' + msg1 + ' or ' + msg2 + '.';
	msgs['COM12140']='Please enter ' + msg2 + ' of ' + msg1 + ' first row.';
	msgs['COM12141']='Please select ' + msg2 + ' of ' + msg2 + '.';
	msgs['COM12142']=msg1 + ' must be shorter than ' + msg2 + ' characters long.';
	msgs['COM12143']=msg1 + ' must be longer than ' + msg2 + ' characters long.';
	// 로그인 관련 메세지
	msgs['COM12144']='The User ID you entered cannot be found.\n\n Please try again.';
	msgs['COM12145']='Please enter your user ID and Password.';
	msgs['COM12146']='Please enter your User ID and Password, and press OK button.';
	// 저장 관련 메세지
	msgs['COM12147']='Do you want to save (' + msg1 + ')?';
	msgs['COM12148']='Saving (' + msg1 + ') has been canceled.';
	msgs['COM12149']='Registering (' + msg1 + ') has been completed';
	msgs['COM12150']='Registering (' + msg1 + ') has failed';
	msgs['COM12151']='Saving (' + msg1 + ') has failed';
	msgs['COM12152']=msg1 + ' has been changed.\n\n Do you want to save these changes?';
	msgs['COM12153']=msg1 + ' has been changed.\n\n Please save the changes and exit the program.';
	// 수정 관련 메세지
	msgs['COM12154']='Do you want to update ' + msg1 + '?';
	msgs['COM12155']=msg1 + ' update has been canceled.';
	msgs['COM12156']=msg1 + ' update has been completed.';
	msgs['COM12157']=msg1 + ' update has failed.';
	msgs['COM12158']='Do you want to update the selected ' + msg1 + '?';
	msgs['COM12159']='The selected ' + msg1 + ' update has been canceled.';
	msgs['COM12160']='Updating ' + msg1 + ' ......';
	// 조회 관련 메세지
	msgs['COM12161']='There is no corresponding data for the search criteria: ' + msg1 + '.';
	msgs['COM12162']='Opening advanced search of ' + msg1 + ' ....';
	msgs['COM12163']='Searching ' + msg1 + ' ......';
	msgs['COM12164']='Reading ' + msg1 + ' ......';
	// 삭제 관련 메세지
	msgs['COM12165']='Do you want to delete ' + msg1 + '?';
	msgs['COM12166']=msg1 + ' deletion has been canceled.';
	msgs['COM12167']=msg1 + ' has been deleted.';
	msgs['COM12168']=msg1 + ' has not been deleted.';
	msgs['COM12169']='Do you want to delete ' + msg1 + ' and ' + msg2 + '?';
	msgs['COM12170']=msg1 + ' and ' + msg2 + ' deletion has been canceled.';
	msgs['COM12171']='Do you want to delete the selected ' + msg1 + '?';
	msgs['COM12172']='Deletion of the selected ' + msg1 + ' has been canceled.';
	// 문자열 관련 메세지
	msgs['COM12173']=msg1 + ' must not be over ' + msg2 + ' characters long.';
	msgs['COM12174']=msg1 + ' must be at least ' + msg2 + ' characters long.';
	msgs['COM12175']=msg1 + ' must be either ' + msg2 + ' or ' + msg3 + ' characters long.';
	msgs['COM12176']=msg1 + ' must be over ' + msg2 + ' characters long.';
	// 추가 메세지
	msgs['COM12176']='Please select one at least.';
	msgs['COM12177']='Please select one only.';
	msgs['COM12178']='Please enter number only.';
	msgs['COM12179']='Please enter correct date.\n\n Format : YYYY-MM-DD';
	msgs['COM12180']='Please enter correct date.\n\n Format : YYYY-MM';
	msgs['COM12181']='Please enter correct date.\n\n Format : YY-MM-DD';
	msgs['COM12182']='Please enter today or future date.';
	msgs['COM12183']='It is possible to take a long time.\n\nYou must not navigate away from this page during approval.\n\nDo you want to continue?';
	msgs['COM12184']='The selected approval will be disapproved.\n\nDo you want to continue?';
	msgs['COM12185']='Header Setting ' + msg1 + ' - Success !!';
	msgs['COM12186']='The approved route cannot be deleted.';
	msgs['COM12187']='Prepayment and non-prepayment invoices can not be selected at the same time.\n\nPlease select either prepayment or non-prepayment invoice only.\n';
	msgs['COM12188']='More than one prepaid CSR No have been selected.';
	msgs['COM12189']='Invoices for prepaid CSR and standard CSR can not be selected at the same time.';
	msgs['COM12190']='Please select one prepayment invoice at a time.';
	// CSR 관련 메세지 (상당히 많은 분량이 중복됨)
	msgs['CSR10001']='Please enter Agreement No.' ;
	msgs['CSR10002']='This is incorrect Agreement No. format.\n\n Please try again.' ;
	msgs['CSR10003']='There is no Agreement to be deleted.' ;
	msgs['CSR10004']='There is lack of data for pop-up display.' ;
	msgs['CSR10005']='There is no mandatory item.\n\n Please check again.' ;
	msgs['CSR10006']='Please select Cost Code for Throughput Rate.' ;
	msgs['CSR10007']='Agreement header information is not entered/saved.\n\n Please check again.' ;
	msgs['CSR10008']='Please check Agreement information again.' ;
	msgs['CSR10009']='Please enter Yard Code.' ;
	msgs['CSR10010']='There is no Yard Code Name.\n\n Please enter Yard Code again.' ;
	msgs['CSR10011']='Please enter Service Provider Code.' ;
	msgs['CSR10012']='Please enter Effective Date.' ;
	msgs['CSR10013']='Date is not correct.' ;
	msgs['CSR10014']='Please check Auto Ext.' ;
	msgs['CSR10015']='Already registered Agreement as same Yard and Service Provider.\n\n Eo you want to register another Agreement?' ;
	msgs['CSR10016']='Please select Cost code.' ;
	msgs['CSR10017']='Please select Vol. UOM.' ;
	msgs['CSR10018']='Please select Currency.' ;
	msgs['CSR10019']='There is no registered Cost Code with the Throughput Rate.\n\n Do you want to register now?' ;
	msgs['CSR10020']='There is no Agreement header information.\n\n Please check again.' ;
	msgs['CSR10021']='Please enter Yard.' ;
	msgs['CSR10022']='Please enter Service Provider.' ;
	msgs['CSR10023']='Please enter Contract Office.' ;
	msgs['CSR10024']='Please enter Effective Date.' ;
	msgs['CSR10025']='Please select Cost code.' ;
	msgs['CSR10026']='Please select container Type/Size.' ;
	msgs['CSR10027']='Please enter Rate.' ;
	msgs['CSR10028']='There is no data to Save.\n\n Please check again.' ;
	msgs['CSR10029']='Verification is not completed.\n\n Please check Verify again.' ;
	msgs['CSR10030']='There is no data on Load EXCEL.\n\n Please check again.' ;
	msgs['CSR10031']='Please modify Terminal Rate List Sheet Data.' ;
	msgs['CSR10032']='Terminal Rate List Verify has been completed.' ;
	msgs['CSR10033']='Please check Terminal Agreement again.' ;
	msgs['CSR10034']='There is no necessary data for Verify.\n\n Please check again.' ;
	msgs['CSR10035']='Terminal Rate List Data save/modify/delete is not completed.\n\n Please complete Data save/modify/delete.' ;
	msgs['CSR10036']='This is Confirmed Terminal Rate List.' ;
	msgs['CSR10037']='Please select SR AGMT Type.' ;
	msgs['CSR10038']='Please select Cost code.' ;
	msgs['CSR10039']='Please select Vol. UOM.' ;
	msgs['CSR10040']='Please enter Commence Time.' ;
	msgs['CSR10041']='Please enter Commence Time as HH:MM format.' ;
	msgs['CSR10042']='Please select Free Days/Rate.' ;
	msgs['CSR10043']='Please select DG Class.' ;
	msgs['CSR10044']='Please select DG, NODG.' ;
	msgs['CSR10045']='Please check DG Class.' ;
	msgs['CSR10046']='Please enter Days.' ;
	msgs['CSR10047']='Please check No of Volume Tier.' ;
	msgs['CSR10048']='Please check Cal. Period.' ;
	msgs['CSR10049']='Please enter FP TEU.' ;
	msgs['CSR10050']='Storage Rate List Data save/modify/delete is not completed.\n\n Please complete Data save/modify/delete.' ;
	msgs['CSR10051']='This is Confirmed Storage Rate List.' ;
	msgs['CSR10052']='This is Cost Code for Storage Rate List.' ;
	msgs['CSR10053']='This is Cost Code for Terminal Rate List.' ;
	msgs['CSR10054']='This Cost Code can not be used for Agreement Cost Code.' ;
	msgs['CSR10055']='Please check Auto Calc. ' ;
	msgs['CSR10056']='Please select Bound.' ;
	msgs['CSR10057']='Please select IPC/Ocean.' ;
	msgs['CSR10058']='Please select Applied Date.' ;
	msgs['CSR10059']='Please select Lane.' ;
	msgs['CSR10060']='Please select DG Class.' ;
	msgs['CSR10061']='Please check No of Volume Tier.' ;
	msgs['CSR10062']='Please enter No of Volume Tier.' ;
	msgs['CSR10063']='Please check No of Overtime Shift.' ;
	msgs['CSR10064']='Please enter No of Overtime Shift.' ;
	msgs['CSR10065']='Please select Terminal Handling Charge.' ;
	msgs['CSR10066']='This is invalid Yard Code.' ;
	msgs['CSR10067']='This is invalid Service Provider Code.' ;
	msgs['CSR10068']='There is no Agreement.\n\n Do you want to register?' ;
	msgs['CSR10069']='Agreement header information Save has been completed.' ;
	msgs['CSR10070']='Terminal Agreement information interim Save has been processed.' ;
	msgs['CSR10071']='Storage Agreement information interim Save has been processed.' ;
	msgs['CSR10072']='Agreement is saved successfully.' ;
	msgs['CSR10073']='Terminal Rate List interim Save has been processed.' ;
	msgs['CSR10074']='Register Agreement has been processed.' ;
	msgs['CSR10075']='Storage Rate List interim Save has been processed.' ;
	msgs['CSR10076']='Register Storage Agreement has been processed.' ;
	msgs['CSR10077']='Save Fail ' + msg1 ;
	msgs['CSR10078']='There is no data to Print.' ;
	msgs['CSR10079']='Please enter correct data on Effective On.' ;
	msgs['CSR10080']='You select Summary header Line.\n\n Please select Agreement data line.' ;
	msgs['CSR10081']='Please select correct Agreement Data.' ;
	msgs['CSR10083']='Please enter Agreement No. and Agreement Version().' ;
	msgs['CSR10084']='Please select Agreement Copy line.' ;
	msgs['CSR10085']='There is no header information on Agreement Creation & Correction screen.\n\n Please check again.' ;
	msgs['CSR10086']='Please check correct Agreement Copy data.' ;
	msgs['CSR10087']='Please load Excel File.' ;
	msgs['CSR10088']='Please modify sheet.' ;
	msgs['CSR10089']='Verify has been completed and data will be list up on AGMT.' ;
	msgs['CSR10090']='Please load Excel file.' ;
	msgs['CSR10091']='Please modify sheet.' ;
	msgs['CSR10092']='Verify has been completed and data will be list up on AGMT.';
	msgs['CSR10093']='Register Throughput Cost Code has been saved.' ;
	msgs['CSR10094']='This is invalid Password.\n\n Please try again.' ;
	msgs['CSR21001']='Rejected Invoice';
	msgs['CSR21002']='Confirmed Invoice';
	msgs['CSR21003']='There is a lack of data for pop-up display.';
	msgs['CSR21004']='Please click VVD Delete Button';
	msgs['CSR21005']='The Terminal Invoice Header is not saved.';
	msgs['CSR21006']='The VVD No. does not exist.';
	msgs['CSR21007']='Do you want to delete all Container List Data on VVD NO : '+ msg1 +' Coincidence, Discrepancy Tab? ';
	msgs['CSR21008']='There is no data to convert.';
	msgs['CSR21009']='There is no selected data.';
	msgs['CSR21010']='The Terminal Invoice Header is not saved.';
	msgs['CSR21011']='There are undated Container List data.\n\n Please save Container List Data first.';
	msgs['CSR21012']='There is no data to calculate.';
	msgs['CSR21013']='There is no Discrepancy Container List Data!';
	msgs['CSR21014']='There is no Cost Calc data to save.';
	msgs['CSR21015']='Cost Calculation is not processed.\n\n Please confirm after Cost Calculation.';
	msgs['CSR21016']='INV AMT and calculated AMT do not match.';
	msgs['CSR21017']='There is no data.';
	msgs['CSR21018']='Do you want to add VVD?';
	msgs['CSR21019']='VVD is 9 characters long.';
	msgs['CSR21020']='There is no data to delete.';
	msgs['CSR21021']='Do you want to delete VVD?';
	msgs['CSR21022']='This is initial page.';
	msgs['CSR21023']='This is final page.';
	msgs['CSR21024']='Yard Code must be entered first.';
	msgs['CSR21025']='The service is not available now';
	msgs['CSR21026']=msg1+' is not entered.';
	msgs['CSR21027']=msg1+' is not selected.';
	msgs['CSR21028']=msg1+' is not selected.';
	msgs['CSR21029']='On-dock Rail Invoice duplicate.';
	msgs['CSR21030']='Off Dock Cy Invoice duplicate.';
	msgs['CSR21031']='Marine Terminal Storage Invoice duplicate.';
	msgs['CSR21032']='[ERR] multi header data are retrieved.';
	msgs['CSR21033']='The Invoice confirmation is required.';
	msgs['CSR21034']='There is no data saved.';
	msgs['CSR21035']='ERR';
	msgs['CSR21036']='This Yard Code does not match Cost OFC.';
	msgs['CSR21037']='An ERR occurred while confirming Yard Code of Cost OFC.';
	msgs['CSR21038']='This is invalid Cost OFC.';
	msgs['CSR21039']='This is invalid Yard Code.';
	msgs['CSR21040']='This is invalid Service Provider Code.';
	msgs['CSR21041']='Please enter numbers only';
	msgs['CSR21042']='Service Provider Code is 6 characters long.';
	msgs['CSR21043']='VVD is 9 characters long.';
	msgs['CSR21044']='There is no VVD.';
	msgs['CSR21045']='Cost Code is not selected';
	msgs['CSR21046']='You can delete it Manual Calculation Type.';
	msgs['CSR21047']='Wrong VVD format is entered.';
	msgs['CSR21048']='Wrong Date is entered.';
	msgs['CSR21049']=msg1;
	// CSR - Marine Terminal Invoice Container List 조회화면 관련 메세지
	msgs['CSR21501']='Please Input Invoice No & Service Provider Code!';
	msgs['CSR21502']='Please Input Invoice No!';
	msgs['CSR21503']='Please Input Service Provider Code!';
	msgs['CSR21504']='Invaid Service Provider Code!';
	msgs['CSR21505']='No Data for Inv No : '+ msg1+' & Service Provider Code: '+ msg2 ;
	msgs['CSR21506']='The service is not available now';
	msgs['CSR21507']=msg1;
	msgs['CSR21508']='This is not Marine Terminal Type Invoice.';
	msgs['CSR21509']='This is initial page.';
	msgs['CSR21510']='This is final page.';
	msgs['CSR21511']='This is invalid Service Provider Code.';
	// CSR - Revised Vol. Pop(TM&ON)
	msgs['CSR21601']='There is no modified item.';
	msgs['CSR21602']='[Cost Code] is mandatory item.';
	msgs['CSR21603']='[container No.] is mandatory item.';
	// CSR - 3rd Pop
	msgs['CSR21701']='Mandatory item is not entered. \n\n Please check it up.';
	// CSR - Invice Summary Inquiry 관련 메세지
	msgs['CSR21901']='Please enter Yard.';
	msgs['CSR21902']='Please enter correct Yard information.';
	msgs['CSR21903']='Retrieve option : Please enter start date.';
	msgs['CSR21904']='Retrieve option : Please enter end date.';
	msgs['CSR21905']='No Data Found';
	msgs['CSR21906']='There is lack of data for pop-up display.';
	msgs['CSR21907']='No Row Selected';
	msgs['CSR21908']='There is no row selected.';
	msgs['CSR21909']='The service is not available now';
	msgs['CSR21910']='This Service Provider Code is invalid.';
	msgs['CSR21911']=msg1;
	// CSR - On-dock Rail Invoice Creation&Correction 관련 메세지
	msgs['CSR22001']='Rejected Invoice !!';
	msgs['CSR22002']='Confirmed Invoice !!';
	msgs['CSR22003']='There is a lack of data for pop-up display.';
	msgs['CSR22004']='Yard Code must be entered first.';
	msgs['CSR22005']='The Terminal Invoice Header is not saved.';
	msgs['CSR22006']='Do you want to delete all Container List Data on Coincidence, Discrepancy Tab?';
	msgs['CSR22007']='There is no data to convert.';
	msgs['CSR22008']='There is no data selected.';
	msgs['CSR22009']='There is changed Container List data. \n\n Please save Container List Data first.';
	msgs['CSR22010']='There is no data to calculate.';
	msgs['CSR22011']='Not Exist Discrepancy Container List Data!';
	msgs['CSR22012']='Please confirm after calculate Cost for changed Container List data.';
	msgs['CSR22013']='Cost Calculation is not processed.\n\n Please confirm after Cost Calculation.';
	msgs['CSR22014']='INV AMT and Calculated AMT do not match.';
	msgs['CSR22015']='The service is not available now.';
	msgs['CSR22016']=msg1;
	msgs['CSR22017']=msg1+' is not entered.';
	msgs['CSR22018']=msg1+' is not selected.';
	msgs['CSR22019']='This is invalid Cost OFC.';
	msgs['CSR22020']='This is invalid Yard Code.';
	msgs['CSR22021']='This is invalid Service Provider Code.';
	msgs['CSR22022']='Please enter numbers only';
	msgs['CSR22023']='Service Provider Code is 6 characters long.';
	msgs['CSR22024']='[ERR] Multi header data are retrieved.';
	msgs['CSR22025']='There is no data saved.';
	msgs['CSR22026']='Marine Terminal Invoice duplicate.';
	msgs['CSR22027']='Off Dock Cy Invoice duplicate.';
	msgs['CSR22028']='Marine Terminal Storage Invoice duplicate.';
	msgs['CSR22029']='This is Confirmed Invoice.\n\n Do you want to modify?';
	msgs['CSR22030']='ERR';
	msgs['CSR22031']='Cost Code is not selected.';
	msgs['CSR22032']='Type/Size is not selected.';
	msgs['CSR22033']='DG is not selected.';
	msgs['CSR22034']='Revised Vol. is not selected.';
	msgs['CSR22035']='It is possible when Calculation Type is Manual.';
	msgs['CSR22036']='Wrong date is entered.';
	msgs['CSR22037']=msg1 + ' is mandatory item.';
	msgs['CSR22038']='';
	msgs['CSR22039']='';
	msgs['CSR22040']='';
	// CSR - On-dock Rail Charge Container List Inquiry
	msgs['CSR22501']='Please input Invoice No & Service Provider Code!';
	msgs['CSR22502']='Please Input Invoice No!';
	msgs['CSR22503']='Please Input Service Provider Code!';
	msgs['CSR22504']='Invalid Service Provider Code!';
	msgs['CSR22505']='No Data for Inv No: ' + msg1 + ' & Service Provider Code: ' + msg2 ;
	msgs['CSR22506']='';
	msgs['CSR22507']=msg1 ;
	msgs['CSR22508']='This is invalid Service Provider Code.';
	msgs['CSR22509']='';
	msgs['CSR22510']='';
	// CSR - File Import 화면-On-Dock Rail Charge
	msgs['CSR22601']='EXCEL FILE SOURCE DATA is wrong.';
	msgs['CSR22602']='Verify is not processed.';
	msgs['CSR23001']='Processed normally.' ;
	msgs['CSR23001']='Cost OFC and Yard Code do not match.' ;
	msgs['CSR23002']='Error occurred while confirming the Yard Code of CostOFC.' ;
	msgs['CSR23003']='' ;
	msgs['CSR23004']='Delete all sheets and modify yd, Cost OFC, calc. Storage Combo Items.' ;
	msgs['CSR23005']='Hold Remarks is not entered.' ;
	msgs['CSR23006']='This is invalid ' + msg1 + '.' ;
	msgs['CSR23007']=msg1 + ' is not entered.' ;
	msgs['CSR23008']=msg1 + ' is invalid.' ;
	msgs['CSR23009']=msg1 + ' has error.' ;
	msgs['CSR23010']='You must select ' + msg2 + 'item when you check ' + msg1 + '.' ;
	msgs['CSR23011']='Date format is wrong.' ;
	msgs['CSR23012']='Start date must be earlier than end date.' ;
	msgs['CSR23013']='There is a SHEET to check before saving.\n\n Do you want to move?' ;
	msgs['CSR23014']='There is a lack of data for pop-up display.' ;
	msgs['CSR23015']='There is no data to delete.' ;
	msgs['CSR23016']='Please enter the start date and end date of Period.' ;
	msgs['CSR23017']='This is error of basic information' ;
	msgs['CSR23018']='There is no modified item.' ;
	msgs['CSR23019']='There is no selected row.' ;
	msgs['CSR23020']='There is not saved data.\n\n Please save first.' ;
	msgs['CSR23021']='There is modified data.\n\n Please save first.' ;
	msgs['CSR23022']='Please enter the start date of Period.' ;
	msgs['CSR23023']='There is no calculation type.' ;
	msgs['CSR23024']='There is no data to process.' ;
	msgs['CSR23025']='There is no data to delete.' ;
	msgs['CSR23026']='There is no data to print.' ;
	msgs['CSR23027']='Already confirmed.' ;
	msgs['CSR23028']='The service is not available now.' ;
	msgs['CSR23029']='This is invalid column.' ;
	msgs['CSR23030']=msg1 + ' duplicate.' ;
	msgs['CSR23031']='Multi HEADER is retrieved.\n\n Please contact system manager.' ;
	msgs['CSR23032']='You must enter ' + msg1 + ' and ' + msg2 + '.' ;
	msgs['CSR23033']='There is no data to confirm.' ;
	msgs['CSR23034']='There is modified data on Coincidence/Discrepancy tab.\n\n Do you want to ignore and confirm?' ;
	msgs['CSR23035']=msg1 + ' is modified.\n\n Please save basic data first.' ;
	msgs['CSR23036']='Error occurred on Cost Group Code' ;
	msgs['CSR23037']='Saved ' + msg1 + ' and calculated ' + msg2 + ' do not match.' ;
	msgs['CSR23038']='Period date and saved date do not match.\n\n Please save or modify the Period.' ;
	msgs['CSR23039']='This is confirmed status.\n\n Do you want to cancel and modify confirmed status?' ;
	msgs['CSR23040']='This is Approval Request processed status.' ;
	msgs['CSR23041']='This is A/P Interface processed status.' ;
	msgs['CSR23042']='This is rejected status.\n\n Do you want to cancel and save rejected status?' ;
	msgs['CSR23043']='Multi HEADER is retrieved.\n\n Please contact system manager.' ;
	msgs['CSR23044']='Confirm processed status' ;
	msgs['CSR23045']='Please select Cost Code.' ;
	msgs['CSR23046']='There is no Cost Group code.' ;
	msgs['CSR23047']='There is no container no.' ;
	msgs['CSR23048']='There is no important DATA TYPE.\n\n Please contact system manager.' ;
	msgs['CSR23049']='An error occurred on a mandatory item.' ;
	msgs['CSR23050']='It can not be processed anymore because an error occurred on ' + msg1 + '.' ;
	msgs['CSR23051']='There is no data to verify.' ;
	msgs['CSR23052']='Verify completed status' ;
	msgs['CSR23053']='Do you want to delete all data on Coincidence, Discrepancy, Cost Calc.(TMNL), Cost Calc.(SR by FD) Tab?' ;
	msgs['CSR23054']='There is invalid row.\n\n Do you want to delete?' ;
	msgs['CSR23055']=msg1 + ' wrong data are found.\n\n Please modify them on file and reload it.' ;
	msgs['CSR23056']='It cannot be processed anymore because an error occurred on ' + msg1 + '.' ;
	msgs['CSR23057']='Please upload data.' ;
	msgs['CSR23058']='Verification of ' + msg1 + '.\n\n List has been completed.' ;
	msgs['CSR23059']='Duplicate' ;
	msgs['CSR23060']='There is new data.\n\n Please save first.' ;
	msgs['CSR23061']='Please enter cost code first.' ;
	msgs['CSR23062']='Yard Code has been changed.\n\n Do you want to delete all data on Coincidence, Discrepancy, Cost Calc.(SR by FD)and Cost Calc.(SR by FP) Tab?' ;
	msgs['CSR23063']='Reject process completed.' ;
	msgs['CSR23064']='End date on Period does not match. Can not process' ;
	msgs['CSR23065']='There is error on Period.' ;
	msgs['CSR23066']='Please delete all sheets and modify Yard, Cost OFC, and calc Storage Combo Items' ;
	msgs['CSR23068']='Do you want to move to Coincidence?' ;
	msgs['CSR23069']='Do you want to move to Discrepancy?' ;
	msgs['CSR23070']='Auto Calculation Data on Cal Tab will be cleared.\n\n Do you want to modify?' ;
	msgs['CSR23071']='There is entered data already.\n\n Do you want to retrieve?' ;
	msgs['CSR24001']='Cost OFC does not match Yard Code.' ;
	msgs['CSR24002']='An error occurred while confirming Yard Code of Cost OFC.' ;
	msgs['CSR24003']='' ;
	msgs['CSR24004']='Please delete all sheets and modify Yard, Cost OFC and calc Storage Combo Items' ;
	msgs['CSR24005']='There is no Remarks at Hold.' ;
	msgs['CSR24006']='This is invalid ' + msg1 + '.' ;
	msgs['CSR24007']=msg1 + ' is not entered.' ;
	msgs['CSR24008']=msg1 + ' was invalid.' ;
	msgs['CSR24009']='An error occurred on ' + msg1 + '.' ;
	msgs['CSR24010']='You must select ' + msg2 + ' item when you check ' + msg1 + '.' ;
	msgs['CSR24011']='Date format is wrong.' ;
	msgs['CSR24012']='Start date must be earlier than end date.' ;
	msgs['CSR24013']='There is Sheet to confirm before saving. DO you want to move?' ;
	msgs['CSR24014']='There is a lack of data for pop-up display.' ;
	msgs['CSR24015']='There is no data to delete.' ;
	msgs['CSR24016']='Please enter start date & end date of Period.' ;
	msgs['CSR24017']='Basic data error' ;
	msgs['CSR24018']='There is no data modified.' ;
	msgs['CSR24019']='There is no row selected.' ;
	msgs['CSR24020']='There is data to save.\n\n Please save first.' ;
	msgs['CSR24021']='There is data modified.\n\n Please save first.' ;
	msgs['CSR24022']='You must enter start date of Period.' ;
	msgs['CSR24023']='There is no calculation type.' ;
	msgs['CSR24024']='There is no data to process.' ;
	msgs['CSR24025']='There is no data to delete.' ;
	msgs['CSR24026']='There is no data to print.' ;
	msgs['CSR24027']='Already confirmed.' ;
	msgs['CSR24028']='The service is not available now.' ;
	msgs['CSR24029']='This is invalid column.' ;
	msgs['CSR24030']=msg1 + ' duplicated.' ;
	msgs['CSR24031']='Multi HEADER is retrieved.\n\n Please contact system manager.' ;
	msgs['CSR24032']='You must enter ' + msg1 + ' and ' + msg2 + '.' ;
	msgs['CSR24033']='There is no data to confirm.' ;
	msgs['CSR24034']='There is modified data on Coincidence/Discrepancy tab.\n\n Do you want to ignore and confirm?' ;
	msgs['CSR24035']=msg1 + 'has been changed.\n\n Please save basic data.' ;
	msgs['CSR24036']='Error occurred on Cost Group Code' ;
	msgs['CSR24037']='Saved ' + msg1 + ' and calculated ' + msg2 + ' do not match.' ;
	msgs['CSR24038']='Period date and saved date do not match.\n\n Please save or modify Period.' ;
	msgs['CSR24039']='Confirmed status.\n\n Do you want to cancel confirm status and modify them?' ;
	msgs['CSR24040']='Approval Request processed status.' ;
	msgs['CSR24041']='A/P Interface processed status.' ;
	msgs['CSR24042']='Rejected status.\n\n Do you want to cancel reject status and modify them?' ;
	msgs['CSR24043']='Multi HEADER is retrieved.\n\n Please contact system manager.' ;
	msgs['CSR24044']='confirm processed status' ;
	msgs['CSR24045']='Please select Cost Code.' ;
	msgs['CSR24046']='There is no Cost Group code.' ;
	msgs['CSR24047']='There is no container No.' ;
	msgs['CSR24048']='There is no important DATA TYPE.\n\n Please contact system manager.' ;
	msgs['CSR24049']='An error occurred on mandatory item.' ;
	msgs['CSR24050']='It cannot be processed anymore because an error occurred on ' + msg1 + '.' ;
	msgs['CSR24051']='There is no data to verify.' ;
	msgs['CSR24052']='Verify completed status' ;
	msgs['CSR24053']='Do you want to delete all data on Coincidence, Discrepancy, Cost Calc.(TMNL), Cost Calc.(SR by FD) Tab?' ;
	msgs['CSR24054']='This is invalid row.\n\n Do you want to delete?' ;
	msgs['CSR24055']='There is '+ msg1 + 'wrong data.\n\n Please modify the file and reload.' ;
	msgs['CSR24056']='It cannot be processed anymore because an error occurred on ' + msg1 + '.' ;
	msgs['CSR24057']='Please upload data.' ;
	msgs['CSR24058']=msg1 + ' List has been verified.' ;
	msgs['CSR24059']='Duplicate' ;
	msgs['CSR24060']='There is new data.\n\n Please save first.' ;
	msgs['CSR24061']='Please enter cost code first.' ;
	msgs['CSR24062']='Yard Code has been changed.\n\n Do you want to delete all data on Coincidence, Discrepancy, Cost Calc.(SR by FD)and Cost Calc.(SR by FP) Tab?' ;
	msgs['CSR24063']='Reject process has been completed.' ;
	msgs['CSR24064']='End date on Period does not match.\n\n Can not process' ;
	msgs['CSR24065']='Error occurred on period' ;
	msgs['CSR24066']='Delete all sheets and modify Yard, Cost OFC and calc Storage Combo Items.' ;
	msgs['CSR24067']='Do you want to delete all data on Coincidence, Discrepancy, Cost Calc.(SR by FD) Tab?' ;
	msgs['CSR24068']='Do you want to move to Coincidence?' ;
	msgs['CSR24069']='Do you want to move to Discrepancy?' ;
	msgs['CSR24070']='Cal Tab Auto Calculation Data will be cleared.\n\n Do you want to modify?' ;
	msgs['CSR24071']='There are entered data.\n\n Do you want to retrieve?' ;
	msgs['CSR25001']='There is no invoice no checked.\n\n Please check again.' ;
	msgs['CSR25002']='Please enter input item on Tax accounts of evidence or Accounts popup screen'; //'Please select evidence type.' ;
	msgs['CSR25003']='Please enter input items on Tax accounts of evidence or Accounts popup screen.' ;
	msgs['CSR25004']='There is no data to process.' ;
	msgs['CSR25005']='There is no CSR_NO paid.' ;
	msgs['CSR25006']='There is no data retrieved.' ;
	msgs['CSR25007']='Multi HEADER is retrieved.\n\n Please contact system manager.' ;
	msgs['CSR25008']='Invoice No toal tax amount differs from the entered tax amount.\n\n Please check again.' ;
	msgs['CSR25009']='Invoice No consultation amount differs from entered total amount.\n\n Please check again.' ;
	msgs['CSR25010']='Please check tax account No. again.' ;
	msgs['CSR25011']='Please check Profit/Loss type.' ;
	msgs['CSR25012']='Please check Tax Type.' ;
	msgs['CSR25013']='This is a worng company registration No.\n\n Please check again.' ;
	msgs['CSR25014']='There is no names of goods and amount entered for tax accounts.\n\n Please check again.' ;
	msgs['CSR25015']='Tax accounts items have been saved.' ;
	msgs['CSR25016']='Accounts items have been saved.' ;
	msgs['CSR31001']='Do you want to process reject?' ;
	msgs['CSR40001']='There is no relevant data.\n\n Do you want to create data with the Inv. No.?' ;
	msgs['CSR40002']=msg1 + ' has not been saved.' ;
	msgs['CSR40003']='Agreement status has not been retrieved.\n\n Please contact PIC of Agreement.' ;
	msgs['CSR40004']='Agreement is being modified.\n\n Please contact PIC of Agreement.' ;
	msgs['CSR40005']='Agreement does not exist.\n\n Please contact PIC of Agreement.' ;
	msgs['CSR40006']='Approval Request has been processed.' ;
	msgs['CSR40007']='CNTR LIST has not been saved.\n\n Please enter new VVD after save CNTR LIST.' ;
	msgs['CSR40008']='CNTR Type Size, F/M, DG and Working Date are mandatory items.\n\n Please check.' ;
	msgs['CSR40009']='Auto Calculation result on Cal Tab will clear.\n\n Do you want to process?' ;
	msgs['CSR40010']='Has been Confirmed.' ;
	msgs['CSR40011']='Please select one among Cost Calc. Method.' ;
	msgs['CSR40012']='Do you want to delete all data on Cost Calc.(SR by FP) Tab?' ;
	msgs['CSR40013']='Cost Calculation result has not been saved.\n\n Please enter new VVD after save.' ;
	msgs['CSR40014']='Cost Calculation has not been done.\n\n Please enter new VVD after caluculation & saving.' ;
	msgs['CSR40015']=msg1 + 'has been omitted.' ;
	msgs['CSR40016']='Please enter all ' + msg1 + '.' ;
	msgs['CSR40017']='File has not been imported.' ;
	msgs['CSR40018']='There is no Cost Code on the Manual Input row.' ;
	msgs['CSR40019']='This is Rejected Invoice.\n\n Do you want to do Reject Lift?' ;
	msgs['CSR40020']='This is not Rejected invoice.' ;
	msgs['CSR40021']='Incase of SVXJO, Revised Vol. Popup could not be used.' ;
	msgs['CSR40022']='Revised Vol / 3rd Party / Carrier are mandatory items on SVXXJO.' ;
	msgs['CSR40023']='Do you want to select TPB target?' ;
	msgs['CSR40024']='Please select TPB target.' ;
	msgs['CSR40025']='Please enter ' + msg1 + '.' ;
	msgs['CSR40026']=msg1 + ' has not been entered.' ;
	msgs['CSR40027']='Yard Code has been modified.\n\n Do you want to delete all data on Coincidence, Discrepancy, Cost Calc. Tab?' ;
	msgs['CSR40028']='Currency code ' + msg1 + ' registered on agreement does not match currency code ' + msg2 + ' on current S/O header.' ;
	msgs['CSR40029']='Currency code on agreement is being retrieved.\n\n Please calculate again.' ;
	msgs['CSR40030']='Currency code on agreement could not be retrieved.' ;
	msgs['CSR40031']='There is no invoice.\n\n Do you want to create newly?' ;
	msgs['CSR40032']='Do you want to delete all data on ' + msg1 + '?' ;
	msgs['CSR40033']=msg1 + ' has been modified.\n\n You have to recalculate after clear calculated result.\n\n Do you want to process it?' ;
	msgs['CSR40034']=msg1 + ' could not be deleted.' ;
	msgs['CSR40035']='Status of reject' ;
	msgs['CSR40036']='There is no ATB on S/O header.' ;
	msgs['CSR40037']='Last date of the period on S/O header has not been saved.' ;
	msgs['CSR40038']='Last date of the period on S/O header has not been entered.' ;
	msgs['CSR40039']='Currency code of S/O header has not been selected.' ;
	msgs['CSR40040']='Currency code of S/O header has not been saved.' ;
	msgs['CSR40041']=msg1 + ' has been omitted.' ;
	msgs['CSR40042']='An error occurred on ' + msg1 + '.' ;
	msgs['CSR40043']='Numbers of List has been verified.' ;
	msgs['CSR40044']='Please contact your manager.' ;
	msgs['CSR40045']='Status of basic data not saved.' ;
	msgs['CSR40046']='Numbers of confirm data have been retrieved.\n\n Please contact your manager.' ;
	msgs['CSR40047']='Numbers of reject header data have been retrieved.\n\n Please contact your manager.' ;
	msgs['CSR40048']='There is no CSR No. on selected row.' ;
	msgs['CSR40049']='There is no breakdown of modification.' ;
	msgs['CSR40050']='These are registered data on ' + msg1 + '.' ;
	msgs['CSR40051']='This is invalid invoice status.\n\n Please contact your manager.' ;
	msgs['CSR40052']='This is invalid ' + msg1 + '.' ;
	msgs['CSR40053']='There was calculated result already.\n\n Please calculate after delete the calculated result.' ;
	msgs['CSR40054']='Entered VVD does not match VVD on CNTR List.' ;
	msgs['CSR40055']='Auto/Manual Code has been omitted.' ;
	msgs['CSR40056']='There is no data to save.' ;
	msgs['CSR40057']='Do you want to save?' ;
	msgs['CSR40058']='This is not exist ' + msg1 + '.' ;
	msgs['CSR40059']='Interim saving has been completed.' ;
	msgs['CSR40060']='Duplicated' ;
	msgs['CSR40061']='An error occurred on important factor.' ;
	msgs['CSR40062']='There is no relevant data.\n\n Do you want to create it with the Invoice No.?' ;
	msgs['CSR40063']='This is not confirmed ' + msg1 + '.' ;
	msgs['CSR10095']='These are saving canceled Yard code and vendor SEQ.\n\n Please check again.';
	msgs['CSR10096']='Please check Agreement after Retrieve.';
	msgs['CSR10097']='There is no date to delete.\n\n Please check again.';
	msgs['CSR10098']='Terminal Rate List Verify has not been completed.';
	msgs['CSR10099']='Throughput Cost Code and Volume Accumulated Method has not been registered.\n\n Please check again.';
	msgs['CSR10100']='Cost Code related with Throughput Rate has not been registered.\n\n Please check again.';
	msgs['CSR10101']='Volume Accumulate Method related with Tier Vol. adaption has not been registered.\n\n Please check again.';
	msgs['CSR10102']='Saving/Modification of Terminal Rate List Data has not been completed.\n\n Please complete saving/modification the Data.';
	msgs['CSR10103']='Please modify Storage Rate List Sheet Data.';
	msgs['CSR10104']='Storage Rate List Verify has been completed.';
	msgs['CSR10105']='Please check Storage Agreement again.';
	msgs['CSR10106']='Storage Rate List Verify has not been completed.';
	msgs['CSR10107']='Please enter correct Yard information.';
	msgs['CSR10108']='Numbers can be entered on vendor information.\n\n Please enter numbers.';
	msgs['CSR10109']='Saving/modification of Storage Rate List Data has not been completed.\n\n Please complete saving/modification the Data.';
	msgs['CSR10110']='Interim saving of Agreement Rate List has been processed.';
	msgs['CSR10111']='Agreement HEADER information and Agreement Rate List has been saved.';
	msgs['CSR10112']='Start date must be earlier than end date.';
	msgs['CSR10113']='There is registered Agreement with same Yard, Vendor.';
	msgs['CSR10114']='Header input data and Agreement List data are modified as the same time.\n\n Please modify Agreement List data after modify and adapt upper input data.';
	msgs['CSR10115']='There is no modified data on Header input data and Agreement List.\n\n Please check again.';
	msgs['CSR10116']='There is no Agreement.\n\n Do you want to create new one?' ;
	msgs['CSR10117']='There is sane condition rate.\n\n Please check the Agreement.';
	msgs['CSR10118']='This is Registered Agreement.\n\n Do you want to modify?';
	msgs['CSR10119']='There are ' + msg1 + ' duplicate rows total.\n\n Please check again.';
	msgs['CSR10120']='Verify has been completed.\n\n There is Terminal Agreement Rate List.\n\n Please click confirm in case of addition or click cancel in case of update on existing Rate List.';
	msgs['CSR10121']='Verify has been completed.\n\n There is Storage Agreement Rate List.\n\n Please click confirm in case of addition or click cancel in case of update on existing Rate List.';
	msgs['CSR10122']='Please enter Period.';
	msgs['CSR10123']='Please check Cost Code For Volume Accumulate.';
	msgs['CSR10124']='This is Registered Agreement.\n\n Do you want to modify?';
	msgs['CSR10125']='Terminal/Storage Rate List Data have not been saved/modified.\n\n Please complete save/modify Data.';
	msgs['CSR10126']='There is no Rate List Data.\n\n Please check again.';
	msgs['CSR15001']='Please enter Cost Code which will be deleted.';
	msgs['CSR15002']='Please enter correct Cost Code which will be deleted.';
	msgs['CSR15003']='English character and numbers can be entered.';
	msgs['CSR15004']='Please enter Cost Code.';
	msgs['CSR15005']='Please enter correct Cost Code.';
	msgs['CSR15006']='Please enter Full name of Cost Code.' ;
	msgs['CSR15007']='Please enter Cost Code cost abbr nm.';
	msgs['CSR15008']='Please enter Cost Code cost opt no.';
	msgs['CSR15009']='Numbers can be entered.\n\n Please enter numbers.';
	msgs['CSR15010']='Please enter Carrier Code.';
	msgs['CSR15011']='Please enter Carrier Full Name.';
	msgs['CSR25017']='Please select data row on Sheet.';
	msgs['CSR25018']='Could not use CSR Creation screen because there is no country code on session information.';
	msgs['CSR25019']='If you select others there is no contents to enter.';
	msgs['CSR25020']='There is no Approval Step.\n\n Please check again.';
	msgs['CSR25021']='Approval Request has been completed.';
	msgs['CSR25022']='Total amount is more than 0.\n\n Please check profit.';
	msgs['CSR25023']='Total amount is less than 0.\n\n Please check loss.';
	msgs['CSR25024']='Tax amount is 0.\n\n Please check free of tax.';
	msgs['CSR25025']='Tax amount is more than 0.\n\n Please check taxable.';
	msgs['CSR25026']='There is no commodity name entered.\n\n Please check again.';
	msgs['CSR25027']='It is impossible to create anymore.';
	msgs['CSR25028']='Issue date is out of range.\n\n Please check again.';
	msgs['CSR25029']='Entered issue date is wrong.\n\n Please check again.';
	msgs['CSR25030']='Please check No. of the accounts.';
	msgs['CSR25031']='There is no commodity name and amount for the accounts.\n\n Please check again.';
	msgs['CSR25032']='INV Currency and ASA No INV Currency do not match.' ;
	msgs['CSR25033']='전자계산서 혹은 종이계산서인지 선택하십시오' ;
	msgs['CSR25034']='CSR Creation is not possible at this moment.\n\n Please contact the system administrator.' ;
	//print
	msgs['CSR90001']='There is no data to print.';
	msgs['CSR90002']="There is an Error in Script.";
	if (msgs[msgNo.toUpperCase()])
		return msgs[msgNo.toUpperCase()];
	return "";
}
/*****************************************************************
	이 JS FILE은 외부에서 CSR공통기능을 호출하는 function을 구성
******************************************************************/
String.prototype.trim=function(){
	return this.replace(/(^\s*)|(\s*$)/g, "");
}
function CsrGetRepairPartner(sheetObj,vndrSeq){
	var f_query='';
	//쿼리 스트링 조합시작
	f_query += 'f_cmd' + '=' + SEARCH01 + '&';
	f_query += 'vndr_seq=' + vndrSeq + '&';
	var sXml=sheetObj.GetSearchData("CSR_COM01.do", f_query);
	return  sXml;
}
function csr_getInputValue(sheetObj,ofc_cd){
	var f_query='';
	//쿼리 스트링 조합시작
	f_query += 'f_cmd' + '=' + COMMAND05 + '&';
	f_query += 'ofc_cd=' + ofc_cd + '&';
// 	var sXml=sheetObj.GetSearchData("CSR_COM01.do","" ,f_query,true);
	var sXml=sheetObj.GetSearchData("CSR_COM01.do", f_query, {sync:1});
	return  sXml;
}
///////////////////////////////////////////////////////////////////////////
function csr_rpad(src, len, pad){
	try {
		if (src==undefined || src==null || isNaN(len) || pad==undefined || pad==null){
			return (src==undefined||src==null?'':src);
		}
		src=new String(src);
		src=src.trim();
		pad=new String(pad);
		pad=pad.trim();
		if (src.trim()=='' || pad.trim()==''){
			return (src==undefined||src==null?'':src);
		}
		var retval='';
		var padCnt=Number(len) - src.length;
		for(var i=0; i<padCnt; i++){
			retval += pad;
		}
		retval=src + retval;
	} catch (e){ return src; //'';
	}
	return retval;
}
function csr_lpad(src, len, pad){
	try {
		if (src==undefined || src==null || isNaN(len) || pad==undefined || pad==null){
			return (src==undefined||src==null?'':src);
		}
		src=new String(src);
		src=src.trim();
		pad=new String(pad);
		pad=pad.trim();
		if (src.trim()=='' || pad.trim()==''){
			return (src==undefined||src==null?'':src);
		}
		var retval='';
		var padCnt=Number(len) - src.length;
		for(var i=0; i<padCnt; i++){
			retval += pad;
		}
		retval=retval + src;
	} catch (e){ return src; //'';
	}
	return retval;
}
function setTooltip(sheetObj, col_arg){
	try {
		if (sheetObj!=null && sheetObj.RowCount()>0 && col_arg!=undefined && col_arg!=null && col_arg!=''){
			var col_arr=col_arg.split('|');
			for (var j=0; col_arr!=null && j<col_arr.length; j++){
				for (var i=sheetObj.HeaderRows(); i<(sheetObj.HeaderRows()+ sheetObj.RowCount()); i++){
					if (sheetObj.GetCellValue(i,col_arr[j])!=undefined && sheetObj.GetCellValue(i,col_arr[j])!=null && sheetObj.GetCellValue(i,col_arr[j])!=''){
						sheetObj.SetToolTipText(i,col_arr[j],sheetObj.GetCellValue(i,col_arr[j]));
					}
				}
			}
		}
	} catch (e){ //혹시 오류가 발생해도 나머지 src에 영향을 주지 않기 위해 아무것도 하지않는당.. 아무 이유 없어~
	}
}
function csr_enterCheck(funcNm){
	if (funcNm==undefined || funcNm==null || funcNm.trim()==''){return false;}
	if (ComGetEvent("keycode") == 13){eval(funcNm+'()');}
}
function csr_isValidDateObject(str_date, del){
	// regular expression을 통과해도 진짜 날짜 유형 객체에 적합한지 검사한다.  사용예: 2006-11-00은 정규식은 통과하지만, 사실상 유효하지 않는 날짜이다.
	if (del==undefined || del==null || del.trim()==''){del='-';}
	var arr_date=str_date.split(del);
	var obj_date=new Date(arr_date[0],arr_date[1]-1,arr_date[2]);
	var result=(1*arr_date[0]==obj_date.getFullYear() && 1*arr_date[1]==(obj_date.getMonth()+1) && 1*arr_date[2]==obj_date.getDate());
	if (result){return true;
	} else {return false;
	}
}
function csr_checkFormat2(src, regexp){
	// 사용예:  regexp = /(^\d{4}\-\d{2}\-\d{2}$)/;
	if (src==null || src=='' || regexp==null || regexp==''){return false;}
	result=(regexp.test(src));
	if (!result){return false;
	} else {return true;
	}
}
function csr_moveFocus(fromFormElement, toFormElement, numleng) {
	// 사용예: onKeyup="javascript:csr_moveFocus(this, this.form.to_prd_dt, 10);"
	var eleLeng=fromFormElement.value.length;
	if (eleLeng>=numleng){toFormElement.focus();}
}
function csr_setBackColorAllTextTypeReadonly(formObj) {
	var numOfEle=formObj.elements.length;
	for (var i=0; i < numOfEle; i++){
		if (formObj.elements[i].type == 'text'){
			set_TextReadonly(formObj.elements[i], formObj.elements[i].readOnly);
		}
	}
}
function csr_chkInput(obj) {
	if (obj.maxLength < tes_getStrLen(obj.value)){
		obj.value='';
		obj.focus();
		return false;
	}
}
function csr_isNum(obj){
	//숫자만
	if (!isNumber(obj)){
		obj.value='';
	}
}
function csr_isApNum(obj){
	//영문과 숫자만
	if (!isAlphaNum(obj)){
		obj.value='';
	}
}
function csr_isNumD(obj, isChkFmt, int_str){
	if (isChkFmt==undefined || isChkFmt==null || isChkFmt.trim()==''){
		// 단순히 숫자와 '-'만 허용
		if (!isNumDash(obj)){obj.value='';
		}
	} else if (isChkFmt!=undefined && isChkFmt!=null && isChkFmt=='Y'){
		var int_char=(int_str!=undefined&&int_str!=null&int_str.trim()!=''?int_str.trim():'-');
		var src=obj.value;
		for (var i=0; src!=null && i<src.length; i++){
			if ((i!=4 && i!=7 && !isNumber2(src.charAt(i))) || ((i==4 || i==7) && !isNumDash2(src.charAt(i)))){
				src=src.substring(0,i) + src.substring(i+1,src.length);
			} else {
				if ((i==4 || i==7) && (src.charAt(i)!=int_char)){
					src=src.substring(0,i) + int_char + src.substring(i,src.length);
				}
			}
		}
		obj.value=src;
	}
	return true;
}
function csr_chkAmtFmtObj(obj, curr_cd){
	if (obj==undefined || obj.value==null || obj.value.trim()==''){
		return false;
	}
	obj.value=csr_chkAmtFmt(obj.value, curr_cd);
}
function csr_chkAmtFmt(src, curr_cd){
	src=new String(src);
	if (src==undefined || src==null || src.trim()==''){
		return '';
	}
	src=csr_deleteComma(src);
	//if (curr_cd!=undefined && curr_cd!=null && (curr_cd=='KRW' || curr_cd=='JPY')){
	if (curr_cd!=undefined && curr_cd!=null && tes_isNoDecimalPointCurrCD(curr_cd)){
		if (src.indexOf('.') != -1){
			src=src.substring(0,src.indexOf('.'));
		}
		src=csr_addComma(src);
	} else {
		if (src.indexOf('.') == -1){
			src=csr_addComma(src) + '.00'
		} else {
			var temp=src.split(".");
			if (temp.length == 2){
				if (temp[1]==null || temp[1].trim()==''){temp[1]='00';}
				if (temp[1].length == 1){temp[1]=temp[1] + '0';
				} else if (temp[1].length == 2){
				} else if (temp[1].length > 2){temp[1]=temp[1].substring(0,2);
				}
				src=csr_addComma(temp[0])+'.'+temp[1];
			} else if (temp.length > 2){
				// 두번째 .부터 .를 다 삭제하고 재계산하기
				var tmp_str='';
				for (var i=1; i<temp.length; i++){
					tmp_str=tmp_str + new String(temp[i]).trim();
				}
				if (tmp_str==null || tmp_str.trim()==''){tmp_str='00';}
				if (tmp_str.length == 1){tmp_str=tmp_str + '0';
				} else if (tmp_str.length == 2){
				} else if (tmp_str.length > 2){tmp_str=tmp_str.substring(0,2);
				}
				src=csr_addComma(temp[0])+'.'+tmp_str;
			} else {
				//showErrMessage('ERR!');
				return false;
			}
		}
	}
	return src;
}
function csr_deleteCommaObj(obj){
	obj.value=csr_deleteComma(obj.value);
}
function csr_addCommaObj(obj){
	// comma제거 후 다시 comma적용
	var tmp=obj.value;
	if (tmp==undefined || tmp==null ||tmp.trim()==''){return false;}
	tmp=csr_deleteComma(tmp);
	obj.value=csr_addComma(tmp);
}
function csr_deleteComma(src){
	// comma를 제거
	var src=String(src);
	if (src==null || trim(src)==''){
		return '';
	}
	return src.replace(/,/gi,'');
}
function csr_addComma(src){
	// comma를 3자리마다 끼워넣기
	var src=String(src);
	if (src==null || trim(src)==''){
		return '';
	}
	var re=/(-?\d+)(\d{3})/;
	while (re.test(src)) {
		src=src.replace(re, "$1,$2");
	}
	return  src;
}
function csr_getDiffDate(sdate, sdiff, stype) {
	/***********************************************************
		sdate:  YYYYMMDD 형식의 문자열
		sdiff:  차이값
		stype:	'Y' - 년
				'M' - 월
				'D'/NULL/''/이외  - 일
	***********************************************************/
	var tyy=sdate.substring(0,4);
	var tmm=sdate.substring(4,6) - 1;
	var tdd=sdate.substring(6,8);
	if (stype == "M") tdd="01";
	var currdate=new Date(tyy,tmm,tdd);
	switch (stype) {
		case "Y" :
			diffdate=new Date(currdate.getFullYear() + sdiff,currdate.getMonth(),currdate.getDate());
			break;
		case "M" :
			diffdate=new Date(currdate.getFullYear(),currdate.getMonth() + sdiff,currdate.getDate());
			break;
		default  :
			diffdate=new Date(currdate.getFullYear(),currdate.getMonth(),currdate.getDate() + sdiff);
			break;
	}
	var tmpyy=diffdate.getFullYear();
	var ls_yy=(tmpyy > 99) ? tmpyy : 1900 + tmpyy;
	var tmpmm=diffdate.getMonth();
	var ls_mm=(tmpmm < 9)  ? "0" + (tmpmm + 1) : tmpmm + 1;
	var tmpdd=diffdate.getDate();
	var ls_dd=(tmpdd < 10) ? "0" + tmpdd : tmpdd;
	switch (stype) {
		case "M" :
			return ls_yy.toString() + ls_mm.toString();
		default  :
			return ls_yy.toString() + ls_mm.toString() + ls_dd.toString() ;
	}
}
/**
  * 입력값을 콤마가 포함된 문자열로 변환하여 리턴
  * @param obj   숫자
  * @return ret  콤마를 추가한 숫자
 */
function csr_addComma2(src) {
    var ret;
    var chars=".,0123456789";
    if (!containsCharsOnly2(src,chars)) {
        showErrMessage("숫자만 입력하십시오.");
        return;
    } // end if
    var numstr=src;
    numstr=csr_deleteComma(numstr);
    var rxSplit=new RegExp('([0-9])([0-9][0-9][0-9][,.])');
    var arrNumber=numstr.split('.');
    arrNumber[0]=arrNumber[0] + '.';
    do {
        arrNumber[0]=arrNumber[0].replace(rxSplit, '$1,$2');
    }
    while (rxSplit.test(arrNumber[0]));
    if (arrNumber.length > 1) {
        ret=arrNumber.join('');
    } else {
        ret=arrNumber[0].split('.')[0];
    } // end if
    return ret;
}
   /*****************
    * 기타 CSR Script
    * **************/
  function tes_getMonthLength(sdate){
  	sdate=new String(sdate);
  	sdate=sdate.substring(0,8);
  	var tyy=sdate.substring(0,4);
  	var tmm=sdate.substring(4,6) - 1;
  	var tdd=sdate.substring(6,8);
  	switch(tmm){
  		case 1:
  			if ((tyy%4==0 && tyy%100!=0) || tyy%400==0)
  			//if ((tyy%4==0) && (tyy%100!=0 || tyy%400==0))
  			return 29; // leap year
  			else
  			return 28;
  		case 3:
  			return 30;
  		case 5:
  			return 30;
  		case 8:
  			return 30;
  		case 10:
  			return 30
  		default:
  			return 31;
  	}
  }
  function tes_copy_rows_to(dest_obj, queryStr, appendMode){
  	//<주> 반드시 ibflag을 넘겨야 제대로 동작한데이...  prefix를 쓰는경우는 prefix를 request로 넘겨야 하구 없으면 넘기지 말구..
  	//dest_obj: row를 이동할 목적 sheet, queryStr: 각자 알아서 넘길것들을 정의, appendMode: true이면 뒤에 붙인다.
  	if (dest_obj==undefined || dest_obj==null){
  		return false;
  	}
  	if (queryStr==undefined || queryStr==null){
  		queryStr='';
  	}
  	if (appendMode==undefined || appendMode==null || appendMode!=true){
  		appendMode=false;
  	}
   	dest_obj.DoSearch("TES_SHEET.screen", queryStr,{Append:appendMode} );
  }
  function tes_checkFormat(src, regexp){
  	// 사용예:  regexp = "^(\\d{4}-\\d{2}-\\d{2})$";
  	if (src==null || src=='' || regexp==null || regexp==''){return false;}
  	re=new RegExp(regexp,"gi");
  	if (!re.test(src)){return false;
  	} else {return true;
  	}
  }
  function tes_isAllDataSaved(sheets){
  	//주어진 sheet에서 하나라도 신규data가 있는지 확인
  	var tes_isAllDataSaved=true;
  	for (var i=0; i<sheets.length; i++){
  		for (var j=1; j<=sheets[i].RowCount(); j++){
  			if (sheets[i].GetCellValue(j,'ibflag')=='I'){
  				tes_isAllDataSaved=false;
  				break;
  			}
  		}
  	}
  	return tes_isAllDataSaved;
  }
  function tes_isModified(sheets,params){
  	//주어진 sheet에서 하나라도 수정되거나 신규data가 있는지 확인 - 단 sheet에 status를 확인할 col이 존재하야 한다.
  	var returnValue=false;
  	for (i=0;i<sheets.length;i++){
  		if(sheets[i].IsDataModified()&& params[i].length>0)
  			returnValue=true;
  	}
  	return returnValue;
  }
  function tes_isModified2(sheets){
  	//주어진 sheet에서 하나라도 수정되거나 신규data가 있는지 확인 - 단 sheet에 status를 확인할 col이 존재하야 한다.
  	var returnValue=false;
  	for (i=0;i<sheets.length;i++){
  		if(sheets[i].IsDataModified())
  			returnValue=true;
  	}
  	return returnValue;
  }
  function tes_getPopupPosition(winWidth, winHeight) {
  	// 사용예:
  	// ex) window.open('ESD_TES_921RemarksPopup.screen?hld_rmk_inp_nm=hld_rmk','popup_remarks',tes_getPopupPosition(300,150)+'width=300px, height=150px, location=0, status=0, resizable=1');
  	TopPosition=(screen.height) ? (screen.height-winHeight)/2 : 0;
  	LeftPosition=(screen.width) ? (screen.width-winWidth)/2 : 0;
  	var position='top='+TopPosition+'px, left='+LeftPosition+'px, ';
  	return position;
  }
  function tes_isNoDecimalPointCurrCD(CURR_CD) {
  	var arr_curr=new Array('KRW','JPY','TWD'); //소숫점 이하 제한 통화 단위들
  	for (var i=0; CURR_CD!=undefined && CURR_CD!=null && arr_curr!=null && i<arr_curr.length; i++){
  		if (arr_curr[i]!=undefined && arr_curr[i]==CURR_CD){
  			return true;
  		}
  	}
  	return false;
  }
  function tes_isMon(obj, isChkFmt, curr_cd){
  	//통화만 -> 숫자,.까지  + 소숫점 이하 2자리만 허용
  	if (!isMoney(obj)){
  		obj.value='';
  	}
  	if (isChkFmt!=undefined && isChkFmt!=null && isChkFmt=='Y'){
  		var src=csr_deleteComma(obj.value);
  		//if (curr_cd!=undefined && curr_cd!=null && (curr_cd=='KRW' || curr_cd=='JPY')){
  		if (curr_cd!=undefined && curr_cd!=null && tes_isNoDecimalPointCurrCD(curr_cd)){
  			if (src.indexOf('.') != -1){
  				src=src.substring(0,src.indexOf('.'));
  			}
  			obj.value=csr_chkAmtFmt(src, curr_cd);
  		} else {
  			if (src.indexOf('.') != -1){
  				if (src.length-1 > src.indexOf('.')+2){
  					src=src.substring(0,src.indexOf('.')+3);
  					obj.value=csr_chkAmtFmt(src, curr_cd);
  				}
  				if (src.indexOf('.') != src.lastIndexOf('.')){
  					src=src.substring(0,src.lastIndexOf('.'));
  					obj.value=csr_chkAmtFmt(src, curr_cd);
  				}
  			}
  		}
  	}
  }
  function tes_getStrLen(src) {
  	// 한글 및 영문 str의 길이를 구함
  	src=new String(src);
  	var byteLength=0;
  	for (var inx=0; inx < src.length; inx++) {
  		var oneChar=escape(src.charAt(inx));
  		if (oneChar.length == 1) {
  			byteLength ++;
  		} else if (oneChar.indexOf("%u") != -1) {
  			byteLength=byteLength + 2;
  		} else if (oneChar.indexOf("%") != -1) {
  			byteLength=byteLength + oneChar.length/3;
  		}
  	}
  	return byteLength;
  }
   /* 입력값이 알파벳인지 체크
    * @param obj   Object
    * @return true 알파벳일 경우
    * */
  function tes_isAlphabet(obj){
  	//영문과 숫자만
  	if (!isAlphabet(obj)){
  		obj.value='';
  	}
  }
  /* Total Amount 소수점 계산 위한 함수 ( 2009-06-04 )
   * val = 값, precision= 소숫점 자릿수
   */
  function tes_round(val,precision) {
      val=val * Math.pow(100,precision);
      val=Math.round(val);
      return val/Math.pow(100,precision);
  }
/*************
 * 공통스크립트
 * **********/
 // 리턴팝업에서 사용하는 전역변수
 var rtnPopValue=new Array(20);
 /*=COMMON CONTROL ===========================================================
     1. 일반적으로 obj tag와 관계없이 사용되는 기능.
     2. Function List
         - openWindow(theURL, winName, features)
         : 새창 열기
         - alertConfirm(message)
         : 사용자의 의사결정을 포함하는 메세지박스 표시
         - alertFocus(element, message)
         : 메세지를 알리는 메세지박스 표시 후 Element에 지정된 obj tag 로 focus
         - showErrMessage(message)
         : 서버 프로그램에서 생긴 ERROR 를 보여주는 MESSAGEBOX alert
         - manyElementsSameFuction( ...)
         : 여러개의 object들을 같은 함수로 동시에 처리하고 싶을때 쓴다.
 ============================================================================*/
 /**
   * 새창열기
   *  window.open 에서 사용되는 방식으로 features 설정
   * @param theURL    새창의 Url
   * @param winName   새창의 name
   * @param features  새창의 세부 설정
   * @return
  */
 function openWindow(theURL,winName,features) {
     window.open(theURL,winName,features);
 }
 /**
   * 사용자의 의사결정을 포함하는 메세지박스 표시
   * @param message   메세지박스에 보여질 메세지
   * @return 1 : 확인,  0 : 취소
  */
 function alertConfirm(message) {
     if(confirm(message)==1) {
         return 1;
     } else {
         return 0;
     } // end if
 }
 /**
   * 메세지를 알리는 메세지박스 표시 후 Element에 지정된 obj tag 로 focus
   * @param obj   focus 를 가질 Object
   * @param message   메세지박스에 보여질 메세지
   * @return
  */
 function alertFocus(obj, message) {
    if ( message != '') alert( message );
    obj.focus();
    if (obj.type == 'text' && obj.value.length >=1 ) obj.select();
    return ;
 }
 
 /**
  * 여러개의 input과 같은 object들을 같은 이벤트로 동시에 처리하고 싶을때 쓴다.
  * 가령 그 필드에 focus가 들어갈시 한글로 시작하게하는 onLoadHangul을 쓰고 싶을때면
  * 다음처럼 이벤트명과 오브젝트를 호출한다.
  *
  * manyElementsSameFuction( ... )
  *
  * 호출예 : manyElementsSameFuction("onLoadHangul",frm.CONT_NAME,frm.ISD_NAME);
  * @param strEventName 공통으로 적용되어야할 함수명 , EventArgument1 오브젝트 , ...
  * @return
  */
 function manyElementsSameFuction() {
     var obj_receiver,sEvent;
     obj_receiver=manyElementsSameFuction.arguments;
     for(i=1; i< obj_receiver.length; i++) {
         sEvent=obj_receiver[0];
         if (obj_receiver[i] != "") {
             sEvent += "(" +  "obj_receiver[" + i + "]" + ");";
             eval(sEvent) ;
         } // end if
     } // end for
 }
 /*=FORM CONTROL =============================================================
     1. 폼 관련 기본 기능을 처리.
     2. Function List
         - chkLen(Object, Int)
         : 입력 받은 폼태그(Object)의 문자열의 길이가 특정 길이(Int)와 같은지 여부 체크
         - chkLenMoveFocus(Object, Int, Object)
         : 입력 받은 폼태그(Object)의 문자열의 길이가 특정 길이(Int) 이면
           다른 객체(Object)로 포커스를 이동
         - setFocus(Object)
         : 입력 받은 객체로 포커스 이동
         - chkLenByByte(Object, int)
         : 입력 필드의 문자 크기를 한정시킬때.. (한글까지 고려하여 계산됨)
         - getLenByByte(String)
         : 입력 필드의 문자 크기를 얻는다.. (한글까지 고려하여 계산됨)
         - disableObject(Object)
         : 대상 Object를 disable 시킨다.
         - enableObject(Object)
         : 대상 Object를 enable 시킨다.
         - disableManyObjects( ... )
         : 입력되어진 변수의 수만큼 disableObject function 수행, 개수는 상관없음
         - enableManyObjects( ... )
         : 입력되어진 변수의 수만큼 enableObject function 수행, 개수는 상관없음
         - hideElement(Object)
         : 입력되어진 Object 들을 display="none" 시킨다.
         - showElement(Object)
         : 입력되어진 Object 들을 display="" 시킨다.
         - manyElementsHide( ... )
         : 입력되어진 Object 들을 모두  display="none" 시킨다, 개수는 상관없음
         - manyElementsShow( ... )
         : 입력되어진 Object 들을 모두  display="" 시킨다, 개수는 상관없음
         - clearObject(Object)
         : 대상 Object의 value값을 초기화 시킨다.
         - clearManyObjects( ... )
         : 입력되어진 변수의 수만큼 clearObject function 수행, 개수는 상관없음
         - setupEnterKeyNextFocus(FORM)
         : Enter Key를 눌렀을때 다음 엘리먼트로 넘어가는 tab과 같은 역할을 하기위한 사전작업
         - enterKeyNextFocus()
         : Enter Key를 눌렀을때 다음 엘리먼트로 넘어가는 tab과 같은 역할을 하는 함수
         - enterKeyMaxLengthNextFocus()
         : Enter Key를 눌렀을때 다음 엘리먼트로 넘어가는 tab과 같은 역할을 하는 함수, maxlength로 다음 오브젝트로 자동 전송
         - onLoadHangu(Object)
         : linput tag가 최초로 focus를 받았을때 한글 입력모드가 되게함
 ============================================================================*/
 /**
   * 입력 받은 폼태그(Object)의 문자열의 길이가 특정 길이(Int)와 같은지 여부 체크
   * @param obj   대상 폼태그(Object)
   * @param len   비교할 길이
   * @return  true : 길이가 같음, false : 길이가 다름
  */
 function chkLen(obj, len) {
     if (obj.value.length == len) return true;
     return false;
 }
 /**
   * 입력 받은 폼태그(Object)의 문자열의 길이가 특정 길이(Int) 이면
   * 다른 객체(Object)로 포커스를 이동
   * @param obj   대상 폼태그(Object)
   * @param len   비교할 길이
   * @param dest  포커스를 이동할 폼태그(Object)
   * @return
  */
 function chkLenMoveFocus(obj, len, dest) {
     if (obj.value.length == len)
     setFocus(dest);
 }
 /**
   * 입력 받은 객체로 포커스 이동
   * @param obj   포커스를 이동할 폼태그(Object)
   * @return
  */
 function setFocus(obj) {
     obj.focus();
 }
 /**
   * 입력 필드의 문자 크기를 한정시킬때.. (한글까지 고려하여 계산됨)
   * @param obj   대상 폼태그(Object)
   * @param len   비교할 길이
   * @return true : 길이가 작음, false : 길이가 큼
  */
 function chkLenByByte(obj, len)
 {
     var src=obj.value;
     var srcLen=getLenByByte(src);
     if (srcLen <= len) return true;
     var delLen=srcLen - len;
     obj.focus();
     return false;
 }
 /**
   * 입력 필드의 문자 크기를 얻는다.. (한글까지 고려하여 계산됨)
   * @param String   문자열
   * @return int 문자열의 길이
  */
 function getLenByByte(value)
 {
     var byteLength=0;
     for (var inx=0; inx < value.length; inx++) {
         var oneChar=escape(value.charAt(inx));
         if ( oneChar.length == 1 ) {
             byteLength ++;
         } else if (oneChar.indexOf("%u") != -1) {
             byteLength += 2;
         } else if (oneChar.indexOf("%") != -1) {
             byteLength += oneChar.length/3;
         }
     } // end for
     return byteLength;
 }
 /**
   * 대상 Object를 disable 시킨다.
   * @param  obj   대상 폼태그(Object)
   * @return
  */
 function disableObject(obj)
 {
     switch( obj.type ) {
         case "button" :
		    case "select-one" :
		    case "textarea" :
		    case "radio" :
		    case "option" :
		    case "checkbox" :
              obj.disabled=true;
              break;
         case "password" :
         case "text" :
              obj.readOnly=true;
              obj.style.backgroundColor="#E8E7EC";
              obj.style.color="#606060";
              break;
         default:
     } // end switch
 }
 /**
   * 대상 Object를 enable 시킨다.
   * @param obj   대상 폼태그(Object)
   * @return
  */
 function enableObject(obj)
 {
     switch( obj.type ) {
         case "button" :
		    case "select-one" :
		    case "textarea" :
		    case "radio" :
		    case "option" :
         case "checkbox" :
              obj.disabled=false;
              break;
         case "password" :
         case "text" :
              obj.readOnly=false;
              obj.style.backgroundColor="#ffffff";
              obj.style.color="#000000";
              break;
         default:
     } // end switch
 }
 /**
  * 입력되어진 변수의 수만큼 disableObject function 수행.
  * 입력되어진 Object 들을 모두 disable 시킨다.
  * 호출예 : disableManyObjects(haengwon_no, name, center_section_code);
  * @param obj   대상 폼태그(Object)
  * @param obj   대상 폼태그(Object)
  *  :
  */
 function disableManyObjects() {
     var obj_receiver;
     obj_receiver=disableManyObjects.arguments;
     for(i=0; i< obj_receiver.length; i++) {
         if (obj_receiver[i] != "") {
             disableObject(obj_receiver[i]);
         }
     } // end for
 }
 /**
  * 입력되어진 변수의 수만큼 enableObject function 수행.
  * 입력되어진 Object 들을 모두 enable 시킨다.
  * 호출예 : enableManyObjects(haengwon_no, name, center_section_code);
  * @param obj   대상 폼태그(Object)
  * @param obj   대상 폼태그(Object)
  *  :
  */
 function enableManyObjects() {
     var obj_receiver;
     obj_receiver=enableManyObjects.arguments;
     for(i=0; i< obj_receiver.length; i++) {
         if (obj_receiver[i] != "") {
             enableObject(obj_receiver[i]);
         }
     } // end for
 }
 /**
  * 입력되어진 Object 들을 display = "none" 시킨다.
  * 호출예 : hideElement(systemCode);
  * @param obj   대상 폼태그(Object)
  *  :
  */
 function hideElement(obj) {
    obj.style.display="none";
 }
 /**
  * 입력되어진 Object 들을 display = "" 시킨다.
  * 호출예 : showElement(systemCode);
  * @param obj   대상 폼태그(Object)
  *  :
  */
 function showElement(obj) {
    obj.style.display="";
 }
 /**
  * 입력되어진 변수의 수만큼 manyElementsHide function 수행.
  * 입력되어진 Object 들을 모두 display = "none" 시킨다.
  * 호출예 : manyElementsHide(haengwon_no, name, center_section_code);
  * @param obj   대상 폼태그(Object)
  * @param obj   대상 폼태그(Object)
  *  :
  */
 function manyElementsHide() {
 	var obj_receiver;
  	obj_receiver=manyElementsHide.arguments;
 	for(i=0; i< obj_receiver.length; i++) {
 		if (obj_receiver[i] != "") {
 			hideElement(obj_receiver[i]);
 		}
 	} // end for
 }
 /**
  * 입력되어진 변수의 수만큼 manyElementsShow function 수행.
  * 입력되어진 Object 들을 모두 display = "" 시킨다.
  * 호출예 : manyElementsHide(haengwon_no, name, center_section_code);
  * @param obj   대상 폼태그(Object)
  * @param obj   대상 폼태그(Object)
  *  :
  */
 function manyElementsShow() {
 	var obj_receiver;
  	obj_receiver=manyElementsShow.arguments;
 	for(i=0; i< obj_receiver.length; i++) {
 		if (obj_receiver[i] != "") {
 			showElement(obj_receiver[i]);
 		} // end if
 	} // end for
 }
 /**
   * 대상 Object의 value값을 초기화 시킨다.
   * @param obj   대상 폼태그(Object)
   * @return
  */
 function clearObject(obj)
 {
     switch( obj.type ) {
         case "select-one" :
              obj.selectedIndex='0';
         case "radio" :
		    case "checkbox" :
              obj.checked=false;
              break;
         case "text" :
         case "password" :
              obj.readOnly=false;
              obj.value="";
              break;
         default:
     } // end switch
 }
 /**
  * 입력되어진 변수의 수만큼 clearObject function 수행.
  * 입력되어진 Object 들을 모두 clear 시킨다.
  * 호출예 : clearManyObjects(haengwon_no, name, center_section_code);
  * @param obj   대상 폼태그(Object)
  * @param obj   대상 폼태그(Object)
  * @return
  */
 function clearManyObjects() {
     var obj_receiver;
     obj_receiver=clearManyObjects.arguments;
     for(i=0; i< obj_receiver.length; i++) {
         if (obj_receiver[i] != "") {
             clearObject(obj_receiver[i]);
         } // end if
     } // end for
 }
 /**
  * Enter Key를 눌렀을때 다음 엘리먼트로 넘어가는 tab과 같은 역할을 하기위한 사전작업
  * 호출예 : setupEnterKeyNextFocus(document.form);
  * @param FORM 해당 form 오브젝트
  * @return
  */
 function setupEnterKeyNextFocus(frm)
 {
     //alert("setNextFocus 시작");
     var i, x=1;
     for(i=0; i< frm.elements.length; i++) {
         if((frm.elements[i].type=="button")||(frm.elements[i].disabled)||(frm.elements[i].readOnly)) {
             frm.elements[i].tabIndex=-1;
         } // end if
         frm.elements[i].tabIndex=x++;
     } // end for
 }
 /**
  * Enter Key를 눌렀을때 다음 엘리먼트로 넘어가는 tab과 같은 역할을 하는 함수
  * 이를 실행시키기 위해서는 페이지를 초기화할때 setEnterNextFocus(frm);를 호출해야한다.
  * 사용예>
  *  <SCRIPT LANGUAGE="javascript" FOR="document" EVENT="onkeydown">
  *  <!--
  *      enterKeyNextFocus();
  *  //-->
  *  </SCRIPT>
  *  ....
  *  <body .... onload="setEnterNextFocus(frm);" >
  * @param
  * @return
  */
 function enterKeyNextFocus()
 {
     var keyCode=ComGetEvent("keycode");
     var obj = ComGetEvent();
     // 엔터키(13)이면
     if (keyCode == 13) {
    	 obj.keyCode = 9;
		 obj.which =9;
		 obj.charCode =9;
     } // end if
 }
 /**
  * maxlength만큼 글자를 입력하면 다음 엘레멘트로 넘어가는 Tab과 같은 역할을 하는 함수
  *
  * 이를 실행시키기 위해서는 페이지를 초기화할때 setEnterNextFocus(frm);를 호출해야 하며
  * input tag 에 maxlength가 정의가 되어져 있어야 한다.
  * 사용예>
  *  <SCRIPT LANGUAGE="javascript" FOR="document" EVENT="onkeydown">
  *  <!--
  *      enterKeyMaxLengthNextFocus();
  *  //-->
  *  </SCRIPT>
  *  ....
  *  <body .... onload="setEnterNextFocus(frm);" >
  *  ....
  *  <input type="text" .... maxlength="4" .... >
  * @param
  * @return
  */
 function enterKeyMaxLengthNextFocus()
 {
     var keyCode=ComGetEvent("keycode");
     var srcMaxLength=ComGetEvent("maxlength");;
     var srcValue=ComGetEvent("value");
     var obj = ComGetEvent();
     if(srcValue!=null){
         var srcValueLength=srcValue.length;
         //Keycode가 37(왼쪽커서키)나 39(오른쪽커서키), 8(backspace)이나 46(delete) 이 아니면
         //Tab Keycode로 바꾸어 다음 오브젝트로 포커스를 이동시켜야 한다.
         if(srcMaxLength==srcValueLength){
             if(!((keyCode==37)||(keyCode==39)||(keyCode==46)||(keyCode==8))){
            	 obj.keyCode = 9;
        		 obj.which =9;
        		 obj.charCode =9;
                 return;
             } // end if
         } // end if
         // 엔터키(13)이면
         if (keyCode == 13) {
        	 obj.keyCode = 9;
    		 obj.which =9;
    		 obj.charCode =9;
         } // end if
     } // end if
 }
 /**
  * input tag가 최초로 focus를 받았을때 한글 입력모드가 되게함
  * 호출예 : onLoadHangul(Object);
  * @param Object
  * @return
  */
 function onLoadHangul(element) {
     element.style.imeMode="active";
 }
 /*=CHECKBOX/RADIO CONTROL ===========================================================
     1. CHECKBOX/RADIO 관련 기본 기능을 처리.
     2. Function List
- togleCheckAll(Object, Object)
         : checkbox들을 반복하여 선택하거나 해지한다.
         - setAllCheckboxCancel(Object)
         : checkbox를 모두 해지한다.
         - setAllCheckboxCheck(Object)
         : checkbox를 모두 선택 표시한다.
         - isChecked(Object)
         : 리스트에서 하나이상의 체크박스가 선택되었는지 확인한다.
         - isCheckedOnlyOne(Object)
         : 리스트에서 하나의 체크박스만 선택되었는지 확인한다.
         - getRadioValue(oRadio)
         : 선택된 하나의 Radio Object Value를 반환
 ============================================================================*/
 /**
   * 처음 obj가 선택되어진 경우 전체 checkObj를 선택하고
   * 해지되어진 경우 모두 해지한다.
   * @param obj   전체를 control하는 CHECKBOX 의 OBJECT
   * @param checkObj 해당 CHECKBOX
   * @return
  */
function togleCheckAll(obj, checkObj) {
     if (!obj.checked) {
         setAllCheckboxCancel(checkObj);
     } else {
         setAllCheckboxCheck(checkObj);
     } // end if
 }
 /**
   * CHECKBOX를 모두 해지한다.
   * @param obj   해당 CHECKBOX 의 OBJECT
   * @return
  */
 function setAllCheckboxCancel(obj){
     var count=obj.length;
     if(count > 1){
         for(var i=0;i<count;i++){
             obj[i].checked=false;
         } // end for
      }else {
         obj.checked=false;
      } // end if
      return;
 }
 /**
   * CHECKBOX를 모두 선택 표시한다.
   * @param obj   해당 CHECKBOX 의 OBJECT
   * @return
  */
 function setAllCheckboxCheck(obj){
     var count=obj.length;
     if(count > 1){
         for(var i=0;i<count;i++){
             obj[i].checked=true;
         } // end for
      } else {
         obj.checked=true;
      } // end if
      return;
 }
 /**
   * 리스트에서 하나이상의 체크박스가 선택되었는지 확인한다.
   * @param obj   해당 CHECKBOX 의 OBJECT
   * @return
  */
 function isChecked(obj){
     var count=obj.length;
     var iChecked=0;
     if(count > 1){
         for(var i=0;i<count;i++){
             if (obj[i].checked) iChecked++;
         } // end for
     } else {
         if (obj.checked) iChecked++;
     } // end if
     if (iChecked == 0) {
         return false;
     } // end if
     return true;
 }
 /**
   * 리스트에서 하나의 체크박스만 선택되었는지 확인
   * @param obj   해당 CHECKBOX 의 OBJECT
   * @return true : 하나만 선택시, false : 하나 이상 혹은 채크 된게 없을 시
  */
 function isCheckedOnlyOne(obj){
     var count=obj.length;
     if(count > 1){
         var iChecked=0;
         for(var i=0;i<count;i++){
             if (obj[i].checked) iChecked++;
         } // end for
         if (iChecked > 1) {
             return false;
         } else if (iChecked == 0) {
             return false;
         }// end if
      } // end if
      return true;
 }
 /*
  * 선택된 하나의 Radio Object Value를 반환
  * @param     oRadio : object Radio
  * @return    String
  */
 function getRadioValue(oRadio) {
     if (oRadio == null) return "";
     if (oRadio.length != null)
     {
         for(i=0; i<oRadio.length; i++)
         {
             if (oRadio[i].checked) return oRadio[i].value;
         } // end for
     } else  {
         if (oRadio.checked) return oRadio.value;
     } // end if
     return "";
 }
 /*=TEXT INPUT VALUE CONTROL ====================================
     1. 문자열 관련 기본 기능을 처리.
     2. Function List
         - isNull(Object)
         : 입력값이 NULL인지 체크
         - isNull2(String)
         : 입력값이 NULL인지 체크
         - isEmpty(Object)
         : 입력값이 공백인지 확인하여 리턴
         - isEmpty2(String)
         : 입력값이 공백인지 확인하여 리턴
         - removeSpaces(Value)
         : 입력값에 포함된 모든 스페이스 문자를 제거 후 리턴
         - replaceStr(str, find, replace)
         : 문자열에 포함된 모든 변환대상 패턴을 변경하여 리턴
         - containsChars(Object)
         : 입력값에 특정 문자(chars)가 있는지 체크. 특정 문자를 허용하지 않으려 할 때 사용
         - containsCharsOnly(Object)
         : 입력값이 특정 문자(chars)만으로 되어있는지 체크
         - isKorean(Object)
         : 입력값이 한글인지 체크
         - isAlphabet(Object)
         : 입력값이 알파벳인지 체크
         - isUpperCase(Object)
         : 입력값이 알파벳 대문자인지 체크
         - isLowerCase(Object)
         : 입력값이 알파벳 소문자인지 체크
         - isNumber(Object)
         : 입력된 문자열이 숫자 만을 포함하고 있는지 여부 리턴
         - isNumber2(String)
         : 입력된 문자열이 숫자 만을 포함하고 있는지 여부 리턴
         - isAlphaNum(Object)
         : 입력값이 알파벳,숫자로 되어있는지 체크
         - isNumDash(Object)
         : 입력값이 숫자,대시(-)로 되어있는지 체크
         - isNumDash2(String)
         : 입력값이 숫자,대시(-)로 되어있는지 체크
         - isNumComma(Object)
         : 입력값이 숫자,콤마(,)로 되어있는지 체크
         - isNumPeriod(Object)
         : 입력값이 숫자,날짜 구분자(.)로 되어있는지 체크
         - isNumSlash(Object)
         : 입력값이 숫자,슬래쉬(/)로 되어있는지 체크
         - isNumSlash2(String)
         : 입력값이 숫자,슬래쉬(/)로 되어있는지 체크
         - isMoney(Object)
         : 입력값이 숫자,소숫점(.),숫자구분자(,)로 되어있는지 체크
         - isEmailAddr(Object)
         : 입력값이 이메일을 구성할 수 있는 문자들로 구성되어 있는지 단순체크
         - isNumberMessage(Object)
         : 입력된 문자열이 숫자 만을 포함하고 있는지 여부 리턴,오류가 있을 경우 메세지를 표시하고 focus 이동
 ============================================================================*/
 /**
  * 입력값이 NULL인지 체크
  * @param obj   Object
  * @return true : Null 또는 공백
  */
 function isNull(obj) {
     return isNull2(obj.value);
 }
 /**
  * 입력값이 NULL인지 체크
  * @param val   String
  * @return true : Null 또는 공백
  */
 function isNull2(val) {
     if (val == null || val == "") {
         return true;
     } // end if
     return false;
 }
 /**
  * 입력값에 스페이스 이외의 의미있는 값이 있는지 체크
  * @param obj   Object
  * @return true : 공백
  */
 function isEmpty(obj) {
     return isEmpty2(obj.value);
 }
 /**
  * 입력값에 스페이스 이외의 의미있는 값이 있는지 체크
  * @param val   String
  * @return true : 공백
  */
 function isEmpty2(val) {
     if (val == null || val.replace(/ /gi,"") == "") {
         return true;
     } // end if
     return false;
 }
 /**
  * 입력값에 포함된 모든 스페이스 문자를 제거 후 리턴
  * @param str   Value
  * @return ret  스페이스가 제거된 문자열
  */
 function removeSpaces(str) {
     var ret="";
     if (str.length == 0) return ret;
     for (var i=0; i<str.length; i++) {
         if (str.charAt(i) != " ") ret += str.charAt(i);
     } // end if
     return ret;
 }
 /**
  * 문자열에 포함된 모든 변환대상 패턴을 변경하여 리턴
  * @param str   문자열
  * @return ret  변경된 문자열
  */
 function replaceStr(str, find, replace)
 {
     var pos=0;
     pos=str.indexOf(find);
     while(pos != -1)
     {
         pre_str=str.substring(0, pos);
         post_str=str.substring(pos + find.length, str.length);
         str=pre_str + replace + post_str;
         pos=str.indexOf(find);
     } // end while
     return str;
 }
 /**
  * 입력값에 특정 문자(chars)가 포함되지 않았는지 체크
  * 특정 문자를 허용하지 않으려 할 때 사용
  * ex) if (containsChars(form.name,"!,*&^%$#@~;")) {
  *         alert("이름 필드에는 특수 문자를 사용할 수 없습니다.");
  *     }
  * @param obj   Object
  * @return true 특정 문자가 없을 경우
  */
 function containsChars(obj,chars) {
     for (var inx=0; inx < obj.value.length; inx++) {
        if (chars.indexOf(obj.value.charAt(inx)) != -1) {
            return true;
        } // end if
     } // end for
     return false;
 }
 /**
  * 입력값이 특정 문자(chars)만으로 되어있는지 체크
  * 특정 문자만 허용하려 할 때 사용
  * ex) if (!containsCharsOnly(form.blood,"ABO")) {
  *         alert("혈액형 필드에는 A,B,O 문자만 사용할 수 있습니다.");
  *     }
  * @param obj   Object
  * @return true 특정 문자가 있을 경우
  */
 function containsCharsOnly(obj,chars) {
     for (var inx=0; inx < obj.value.length; inx++) {
        if (chars.indexOf(obj.value.charAt(inx)) == -1) {
            return false;
        } // end if
     } // end for
     return true;
 }
 /**
  * 입력값이 특정 문자(chars)만으로 되어있는지 체크
  * 특정 문자만 허용하려 할 때 사용
  * ex) if (!containsCharsOnly2("ABOCCCC","ABO")) {
  *         alert("혈액형 필드에는 A,B,O 문자만 사용할 수 있습니다.");
  *     }
  * @param val   String
  * @return true 특정 문자가 있을 경우
  */
 function containsCharsOnly2(val,chars) {
     for (var inx=0; inx < val.length; inx++) {
        if (chars.indexOf(val.charAt(inx)) == -1) {
            return false;
        } // end if
     } // end for
     return true;
 }
 /**
  * 입력값이 한글인지 체크
  * @param obj   Object
  * @return true 한글인 경우
  */
 function isKorean(obj)
 {
     if ((obj.value.length*2) == getLenByByte(obj.value)) return true;
     return false;
 }
 /**
  * 입력값이 알파벳인지 체크
  * @param obj   Object
  * @return true 알파벳일 경우
  */
 function isAlphabet(obj) {
     var chars="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
     return containsCharsOnly(obj,chars);
 }
 /**
  * 입력값이 알파벳 대문자인지 체크
  * @param obj   Object
  * @return true 알파벳 대문자인 경우
  */
 function isUpperCase(obj) {
     var chars="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
     return containsCharsOnly(obj,chars);
 }
 /**
  * 입력값이 알파벳 소문자인지 체크
  * @param obj   Object
  * @return true 알파벳 소문자인 경우
  */
 function isLowerCase(obj) {
     var chars="abcdefghijklmnopqrstuvwxyz";
     return containsCharsOnly(obj,chars);
 }
 /**
   * 입력된 문자열이 숫자 만을 포함하고 있는지 여부 리턴
   * @param obj   Object
   * @return true - 숫자만을 포함하고 있는 경우
  */
 function isNumber(obj) {
     var chars="0123456789";
     return containsCharsOnly(obj,chars);
 }
 /**
   * 입력된 문자열이 숫자 만을 포함하고 있는지 여부 리턴
   * @param val   String
   * @return true - 숫자만을 포함하고 있는 경우
  */
 function isNumber2(val) {
     var chars="0123456789";
     return containsCharsOnly2(val,chars);
 }
 /**
  * 입력값이 알파벳,숫자로 되어있는지 체크
  * @param obj   Object
  * @return true 알파벳,숫자로 되어있는 경우
  */
 function isAlphaNum(obj) {
     var chars="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
     return containsCharsOnly(obj,chars);
 }
 /**
  * 입력값이 숫자,대시(-)로 되어있는지 체크
  * @param obj   Object
  * @return true 숫자,대시(-)로 되어있는 경우
  */
 function isNumDash(obj) {
     var chars="-0123456789";
     return containsCharsOnly(obj,chars);
 }
 /**
  * 입력값이 숫자,대시(-)로 되어있는지 체크
  * @param val   String
  * @return true 숫자,대시(-)로 되어있는 경우
  */
 function isNumDash2(val) {
     var chars="-0123456789";
     return containsCharsOnly2(val,chars);
 }
 /**
  * 입력값이 숫자,콤마(,)로 되어있는지 체크
  * @param obj   Object
  * @return true 숫자,콤마(,)로 되어있는 경우
  */
 function isNumComma(obj) {
     var chars=",0123456789";
     return containsCharsOnly(obj,chars);
 }
 /**
  * 입력값이 숫자,날짜 구분자(.)로 되어있는지 체크
  * @param obj   Object
  * @return true 숫자,날짜 구분자(.)로 되어있는 경우
  */
 function isNumPeriod(obj) {
     var chars=".0123456789";
     return containsCharsOnly(obj,chars);
 }
 /**
  * 입력값이 숫자,슬래쉬(/)로 되어있는지 체크
  * @param obj   Object
  * @return true 숫자,대시(/)로 되어있는 경우
  */
 function isNumSlash(obj) {
     var chars="/0123456789";
     return containsCharsOnly(obj,chars);
 }
 /**
  * 입력값이 숫자,슬래쉬(/)로 되어있는지 체크
  * @param val   String
  * @return true 숫자,대시(/)로 되어있는 경우
  */
 function isNumSlash2(val) {
     var chars="/0123456789";
     return containsCharsOnly2(val,chars);
 }
 /**
  * 입력값이 숫자,소숫점(.),숫자구분자(,)로 되어있는지 체크
  * @param obj   Object
  * @return true 숫자,날짜 구분자(.)로 되어있는 경우
  */
 function isMoney(obj) {
     var chars="-.,0123456789";
     return containsCharsOnly(obj,chars);
 }
 /**
  * 입력값이 이메일을 구성할 수 있는 문자들로 구성되어 있는지 체크
  * 단순한 이메일 입력포맷을 확인한다.
  * @param obj   Object
  * @return true 이메일 구성이 가능한 문자들로 구성되어 있을 경우
  */
 function isEmailAddr(obj) {
     var format=/^((\w|[\-\.])+)@((\w|[\-\.])+)\.([A-Za-z]+)$/;
     return isValidFormat(obj, format);
 }
 /**
   * 입력된 문자열이 숫자 만을 포함하고 있는지 여부 리턴
   * 오류가 있을 경우 메세지를 표시하고 focus 이동
   * @param obj   Object
   * @return true - 숫자만을 포함하고 있는 경우
  */
 function isNumberMessage(obj) {
     if (!isNumber(obj)) {
         alertFocus(obj, '숫자만 입력하십시오');
         return false;
     }
     return true;
 }
 /*=NUMBER CONTROL ===========================================================
     1. 숫자 관련 기본 기능을 처리.
     2. Function List
         - addComma(Object)
         : 입력값을 콤마가 포함된 문자열로 변환하여 리턴
           12345 를 입력하면 12,345 로 변환하여 리턴
         - removeComma(String)
         : 입력값에서 콤마를 없앤다.
         - removeDash(String)
         : 입력값에서 구분자(-)를 없앤다.
         - removeSlash(String)
         : 입력값에서 슬래쉬(/)를 없앤다.
         - removePeriod(String)
         : 입력값에서 날짜 구분자(.) 를 없앤다.
         - parseInt2(str)
         : 문자열을 정수로 변환하여 리턴
         - removeSeparator(Object)
         : 문자열에서 / - , . ; : 등을 제거하고 value 에 값넣어줌
 ============================================================================*/
 /**
   * 입력값을 콤마가 포함된 문자열로 변환하여 리턴
   * @param obj   숫자
   * @return ret  콤마를 추가한 숫자
  */
 function addComma(obj) {
     var ret;
     if (!isMoney(obj)) {
         alertFocus(obj, "숫자만 입력하십시오.");
         return;
     } // end if
     var numstr=obj.value;
     numstr=removeComma(numstr);
     var rxSplit=new RegExp('([0-9])([0-9][0-9][0-9][,.])');
     var arrNumber=numstr.split('.');
     arrNumber[0] += '.';
     do {
         arrNumber[0]=arrNumber[0].replace(rxSplit, '$1,$2');
     }
     while (rxSplit.test(arrNumber[0]));
     if (arrNumber.length > 1) {
         ret=arrNumber.join('');
     } else {
         ret=arrNumber[0].split('.')[0];
     } // end if
     obj.value=ret;
 }
 /**
  * 입력값에서 콤마를 없앤다.
  * @param str   문자열
  * @return 변경된 문자열
  */
 function removeComma(str) {
     return str.replace(/,/gi,"");
 }
 /**
  * 입력값에서 구분자(-)를 없앤다.
  * @param str   문자열
  * @return 변경된 문자열
  */
 function removeDash(str) {
     return str.replace(/-/gi,"");
 }
 /**
  * 입력값에서 점 구분자(.)를 없앤다.
  * @param str   문자열
  * @return 변경된 문자열
  */
 function removePeriod(str) {
     return replaceStr(str, '.', '');
 }
 /**
  * 입력값에서 슬래쉬(/)를 없앤다.
  * @param str   문자열
  * @return 변경된 문자열
  */
 function removeSlash(str) {
     return replaceStr(str, '/', '');
 }
 /**
   * 문자열을 10진수로 변환하여 리턴
   * @param str   문자열
   * @return 정수
  */
 function parseInt2(str) {
     return parseInt(str, 10);
 }
 /**
  * 입력값에서 구분자(-)를 없앤다.
  * @param str   문자열
  * @return 변경된 문자열
  */
 function removeSeparator(obj) {
     var objvalue=obj.value;
     objvalue=objvalue.replace(/\/|\-|\.|\,|\;|\:/g,"");
     obj.value=objvalue;
 }
 /*=DATETIME CONTROL ===========================================================
     1. 일자와 시간 관련 기본 기능을 처리.
     2. Function List
         - isDate(Object)
         : 입력값을 일자 Format 인지 확인
         - isValidYYYYMM(Object)
         : 입력된 문자열이 일자 Format YYYYMM이 맞는지를 확인
         - isValidYYMMDD(Object)
         : 입력된 문자열이 일자 Format YYMMDD이 맞는지를 확인
         - isMonth(month)
         : 입력된 문자열이 일자의 월로 변환가능한지 확인
         - isDay(year, month, day)
         : 입력된 문자열이 일자의 일로 변환가능한지 확인
         - isDay2(day)
         : 입력된 문자열이 일자의 일로 변환가능한지 확인 (월에 관계없음)
         - getEndDay(year, month)
         : 해당 년, 월의 마지막 일자를 가져온다
         - addDateSeperator(Object)
         : 입력값에 일자 형식에 맞추어 DATE_SEPERATOR 를 추가한다.
         - getDaysBetween(fromObj, toObj)
         : 처음 Object와 두번째 Object 사이의 일자를 반환한다.이경우에 두번째 Object가 처음 Object 보다 나중 일자이다.
         - getDaysBetween2(String, String)
         : 처음 Object와 두번째 Object 사이의 일자를 반환한다.이경우에 두번째 Object가 처음 Object 보다 나중 일자이다.
         - getDaysToToday(Object)
         : 오늘까지 남은 일수를 반환한다. 오늘 이후의 일자에 대해서는 음수값을 반환한다.
         - isAfterToday(Object)
         : 입력된 일자가 오늘 이후의 일자인지 확인한다.
         - getAddDate(dateValue, day)
         : 첫번째인자의 날짜에 두번째일자수를 더한 날짜를 yyyyMMdd 형식으로 리턴한다.
 ============================================================================*/
 /**
   * 입력된 문자열이 일자 Format 확인 - (/, -, .) 제거되고 비교
   * @param str   문자열
   * @return true 일자 , false
  */
 function isDate(obj) {
     str=obj.value.replace(/\/|\-|\./g,"");
     if (!isNumSlash(obj) && !isNumPeriod(obj) && !isNumDash(obj)) {
         return false;
     }
     if (str.length != 8) {
         return false;
     }
     var year=str.substring(0,4);
     var month=str.substring(4,6);
     var day=str.substring(6,8);
     if ( parseInt2( year ) >= 1900  && isMonth( month ) && isDay( year,month ,day) )
         return true;
     else {
         return false;
     }
 }
 /**
   * 입력된 문자열이 일자 Format YYYYMM이 맞는지를 확인 - (/, -, .) 제거되고 비교
   * @param str   문자열
   * @return true 일자 , false
  */
 function isValidYYYYMM ( obj ) {
     str=obj.value.replace(/\/|\-|\./g,"");
     if (!isNumSlash(obj) && !isNumPeriod(obj) && !isNumDash(obj)) {
         return false;
     }
     if (str.length != 6) {
         return false;
     }
     var year=str.substring(0,4);
     var month=str.substring(4,6);
     if ( parseInt2( year ) >= 1900  && isMonth( month ))
         return true;
     else {
         return false;
     }
 }
 /**
   * 입력된 문자열이 6자리 일자 Format 확인 - (/, -, .) 제거되고 비교
   * @param str   문자열
   * @return true 일자 , false
  */
 function isValidYYMMDD ( obj )
 {
     str=obj.value.replace(/\/|\-|\./g,"");
     if (!isNumSlash(obj) && !isNumPeriod(obj) && !isNumDash(obj)) {
         return false;
     }
     if (str.length != 6) {
         return false;
     }
     var year=str.substring(0,2);
     var month=str.substring(2,4);
     var day=str.substring(4);
     if ( isMonth(month) && isDay2(day) )
         return true;
     else {
         return false;
     }
 }
 /**
   * 입력된 문자열이 일자의 월로 변환가능한지 확인
   * @param month   문자열
   * @return true : 가능할 경우
  */
 function isMonth(month) {
     if (month.length > 2) return false;
     month=parseInt(month,10);
     if ((month <= 0) || (month > 12)) return false;
     return true;
 }
 /**
   * 입력된 문자열이 일자의 일로 변환가능한지 확인
   * @param year   년
   * @param month  월
   * @param day    일
   * @return true : 가능할 경우
  */
 function isDay(year, month, day) {
     if (day.length > 2) return false;
     year=parseInt(year, 10);
     month=parseInt(month, 10);
     day=parseInt(day, 10);
     if ((day <= 0) || (day > getEndDay(year, month))) return false;
     return true;
 }
 /**
   * 입력된 문자열이 일자의 일로 변환가능한지 확인 (월에 관계없음)
   * @param day 문자열
   * @return true : 가능할 경우
  */
 function isDay2(day) {
     if (day.length > 2) return false;
     day=parseInt(day, 10);
     if ((day <= 0) || (day > 31)) return false;
     return true;
 }
 /**
   * 해당 년, 월의 마지막 일자를 가져온다
   * @param year   년
   * @param month  월
   * @return 마지막 일자
  */
 function getEndDay(year,month) {
     if (!isMonth(month)) return 0;
     if ((month==1)||(month==3)||(month==5)||(month==7)||(month==8)||(month==10)||(month==12)) {
         return 31;
     } else {
         if(month==2) {
             if ((year%4==0) && ((year/4)%200!=0))   return 29;
             else    return 28;
         } else {
             return 30;
         } // end if
     } // end if
 }
 /**
  * 입력값이 유효한 일자인지 확인하고
  * 일자 형식에 맞추어 DATE_SEPERATOR 를 추가한다.
  * @param obj   Object
  * @return 구분자가 추가된 일자 형식의 문자열
  */
 function addDateSeperator(obj) {
     if (isEmpty(obj)) return false;
     var numstr=obj.value.replace(/\/|\-|\./g,"");
     if (numstr.length < 6) {
         obj.value='';
         alertFocus(obj, "날짜는 YYYYMM이나 YYYYMMDD의 형식으로 입력해주십시오.");
         return false;
     } // end if
     if (numstr.length == 6){
         if (!isValidYYYYMM(obj)) return false;
         var rxSplit=new RegExp('([0-9][0-9][0-9][0-9])([0-9][0-9])');
         numstr=numstr.replace(rxSplit, '$1'+DATE_SEPERATOR+'$2');
     } else {
         if (!isDate(obj)) return false;
         var rxSplit=new RegExp('([0-9][0-9][0-9][0-9])([0-9][0-9])([0-9][0-9])');
         numstr=numstr.replace(rxSplit, '$1'+DATE_SEPERATOR+'$2'+DATE_SEPERATOR+'$3');
     } // end if
     obj.value=numstr;
     return true;
 }
 /**
  * 처음 Object와 두번째 Object 사이의 일자를 반환한다.
  * 이경우에 두번째 Object가 처음 Object 보다 나중 일자이다.
  * @param fromObj   Object
  * @param toObj     Object
  * @return int 두 Object 사이의 일자
  */
 function getDaysBetween(fromObj, toObj) {
     var numstr1=fromObj.value.replace(/\/|\-|\./g,"");
     var user_day1=new Date(numstr1.substr(0,4), parseInt2(numstr1.substr(4,2))-1, parseInt2(numstr1.substr(6)));
     var numstr2=toObj.value.replace(/\/|\-|\./g,"");
     var user_day2=new Date(numstr2.substr(0,4), parseInt2(numstr2.substr(4,2))-1, parseInt2(numstr2.substr(6)));
     user_day1=user_day1.getTime();
     user_day2=user_day2.getTime();
     var day_gab=Math.floor( (user_day2 - user_day1) / (60*60*24*1000) );
     return day_gab;
 }
 /**
  * 처음 String과 두번째 String 사이의 일자를 반환한다.
  * 처음 String와 두번째 String사이의 일자를 반환한다.이경우에 두번째 String가 처음 String보다 나중 일자이다.
  * @param fromObj   String
  * @param toObj     String
  * @return int 두 Object 사이의 일자
  */
 function getDaysBetween2(fromVal, toVal) {
     var numstr1=fromVal.replace(/\/|\-|\./g,"");
     var user_day1=new Date(numstr1.substr(0,4), parseInt2(numstr1.substr(4,2))-1, parseInt2(numstr1.substr(6)));
     var numstr2=toVal.replace(/\/|\-|\./g,"");
     var user_day2=new Date(numstr2.substr(0,4), parseInt2(numstr2.substr(4,2))-1, parseInt2(numstr2.substr(6)));
     user_day1=user_day1.getTime();
     user_day2=user_day2.getTime();
     var day_gab=Math.floor( (user_day2 - user_day1) / (60*60*24*1000) );
     return day_gab;
 }
 /**
  * 오늘까지 지난 일수를 반환한다. 오늘 이후의 일자에 대해서는 음수값을 반환한다.
  * @param obj   Object
  * @return int 자난 일수
  */
 function getDaysToToday(obj) {
     var numstr=obj.value.replace(/\/|\-|\./g,"");
     var user_day=new Date(numstr.substr(0,4), parseInt2(numstr.substr(4,2))-1, parseInt2(numstr.substr(6)));
     user_day=user_day.getTime();
     var today=new Date();
     today=today.getTime();
     var day_gab=Math.floor( (today - user_day) / (60*60*24*1000) );
     return day_gab;
 }
 /**
  * 입력된 일자가 오늘 이후의 일자인지 확인한다.
  * @param obj   Object
  * @return true : 오늘 이후의 일자일 경우, false
  */
 function isAfterToday(obj) {
     if (isEmpty(obj)) return false;
     if (!isDate(obj)) {
         return false;
     } // end if
     var day_gab=getDaysToToday(obj);
     if( day_gab > 0) {
         return false;
     } // end if
     return true;
 }
 /**
  * 첫번째인자의 날짜에 두번째일자수를 더한 날짜를
  * yyyyMMdd 형식으로 리턴한다.
  * @param dateValue yyyyMMdd 또는 yyyy-MM-dd 형식의 날짜포맷
  * @param daya 가감일수
  * @return 가감된 일자(yyyy-MM-dd)
  */
 function getAddDate(dateValue, day) {
     var numstr=dateValue.replace(/\/|\-|\./g,"");
     if ((day < 0 ) || (numstr.length != 8)) {
         return dateValue;
     }
 	//기준일
 	var basic=new Date(0);
     var user_day=new Date(numstr.substr(0,4), parseInt2(numstr.substr(4,2))-1, parseInt2(numstr.substr(6)));
     var rtn_day=new Date((1000*60*60*24*(day+((user_day-basic)/(1000*60*60*24)))));
     var year=rtn_day.getFullYear();
     var month=rtn_day.getMonth() + 1 ;
     var day=rtn_day.getDate();
     if (month < 10) {
         month="0" + month;
     }
     if (day < 10) {
         day="0" + day;
     }
     var rtn_date=year + "-" + month + "-" + day;
     return rtn_date;
 }
 /*=TEXT INPUT VALUE VALIDATION CHECK ==========================================
     1. TEXT 입력 값의 유효성을  확인한다.
     2. Function List
         - isValidJumin(obj)
         : 문자열이 올바른 주민등록번호인지 확인하여 리턴
         - isValidSaupja(obj)
         : 문자열이 올바른 사업자등록번호인지 확인하여 리턴
 ============================================================================*/
 /**
   * 문자열이 올바른 주민등록번호인지 확인하여 리턴
   * @param obj   Object
   * @return true : 바른 주민등록번호일 경우
  */
 function isValidJumin(oResNo) {
     if(isEmpty(oResNo)) return false;
     var sResNo=removeDash(oResNo.value);
     if(sResNo.length != 13) {
         return false;
     }
     var a=new Array(6)
     var b=new Array(7)
     var tot=0
     var c=0
     var sJumin0=sResNo.substring(0,6);
     if (!isMonth(sJumin0.substring(2,4)))
         return false;
     else if (!isDay2(sJumin0.substring(4,6)))
         return false;
     var sJumin1=sResNo.substring(6,13);
     for(var i=1;i<7;i++)
     {
         a[i]=sJumin0.substring(i-1,i);
         b[i]=sJumin1.substring(i-1,i);
         if(i<3)
             c=Number(b[i])*(i+7);
         else
             c=Number(b[i])*((i+9)%10);
         tot=tot + Number(a[i])*(i+1) + c;
     } // end for
     b[7]=sJumin1.substring(6,7);
     if(Number(b[7]) != ((11-(tot%11))%10)) {
         return false;
     } else {
         return true;
     }
 }
 /**
  * 문자열이 올바른 사업자등록번호인지 확인하여 리턴
  * @param obj   Object
  * @return true : 바른 사업자등록번호일 경우
  */
 function isValidSaupja(oCorpNo)
 {
     if (isEmpty(oCorpNo)) return false;
     var sCorpNo=removeDash(oCorpNo.value);
     if(sCorpNo.length != 10) {
         return false;
     } // end if
     var chkRule="137137135";
     var step1, step2, step3, step4, step5, step6, step7;
     step1=0;
     for (var i=0; i<7; i++)
     {
         step1=step1 + (sCorpNo.substring(i, i+1) * chkRule.substring(i, i+1));
     } // end for
     step2=step1 % 10;
     step3=(sCorpNo.substring(7, 8) * chkRule.substring(7, 8)) % 10;
     step4=sCorpNo.substring(8, 9) * chkRule.substring(8, 9);
     step5=Math.round(step4 / 10 - 0.5);
     step6=step4 - (step5 * 10);
     step7=(10 - ((step2 + step3 + step5 + step6) % 10)) % 10;
     if (sCorpNo.substring(9, 10) != step7) {
         return false;
     } else {
         return true;
     } // end if
 }
 /*=TEXT INPUT VALUE FORMAT CONTROL ============================================
     1. TEXT 입력 값의 기준 포맷을 따라 변경한다
     2. Function List
         - addSeperatorToJuminNo(Object)
         : 13자리의 주민등록번호를 입력받아 자동으로 '-'를 더하여 리턴(ex)123456-7890123
         - addSeperatorToSaupjaNo(Object)
         : 10자리의 사업자번호를 입력받아 자동으로 '-'를 더하여 리턴(ex)123-45-67890
         - addSeperatorToSilmyungNo(Object)
         : 10자리의 사업자번호, 13자리의 주민번호를 입력받아 자동으로 '-'를 더하여 리턴
 ============================================================================*/
 /**
   * 13자리의 주민등록번호를 입력받아 자동으로 '-'를 더하여 리턴
   * @param obj   Object
   * @return acct 주민등록번호
   */
 function addSeperatorToJuminNo(obj)
 {
     if (isEmpty(obj)) return;
     if (!isNumDash(obj)) {
         obj.value='';
         return false;
     } // end if
     if (!isValidJumin(obj)) {
         obj.value='';
         return false;
     } // end if
     var numstr=removeDash(obj.value);
     var rxSplit=new RegExp('([0-9][0-9][0-9][0-9][0-9][0-9])([0-9][0-9][0-9][0-9][0-9][0-9][0-9])');
     numstr=numstr.replace(rxSplit, '$1-$2');
     obj.value=numstr;
 }
 /**
  * 10자리의 사업자번호를 입력받아 자동으로 '-'를 더하여 리턴
  * @param obj   Object
  * @return acct 사업자번호
  */
 function addSeperatorToSaupjaNo(obj)
 {
     if (isEmpty(obj)) return;
     if (!isNumDash(obj)) {
         obj.value='';
         return false;
     } // end if
     if (!isValidSaupja(obj)) {
         obj.value='';
         return false;
     } // end if
     var numstr=removeDash(obj.value);
     var rxSplit=new RegExp('([0-9][0-9][0-9])([0-9][0-9])([0-9][0-9][0-9][0-9][0-9])');
     numstr=numstr.replace(rxSplit, '$1-$2-$3');
     obj.value=numstr;
 }
 /**
  * 10자리 혹은 13자리의 사업자번호,주민번호를 입력받아 자동으로 '-'를 더하여 리턴
  * @param obj   Object
  * @return acct 사업자번호, 주민번호
  */
 function addSeperatorToSilmyungNo(obj)
 {
     if (isEmpty(obj)) return;
     var numstr=removeDash(obj.value);
     if (numstr.length == 10) {
         addSeperatorToSaupjaNo(obj);
     } else if (numstr.length == 13){
         addSeperatorToJuminNo(obj);
     } else {
         return false;
     } // end if
 }
 //---------------------------------------------------------------------
 // 그외 추가적인 support function
 //---------------------------------------------------------------------
	/**
	* @param     : obj	=> 객체
	* sample	: <input type ="text" name ="date" onblur="convert_Date(this)" onfocus="delete_Char(this,'-')">
	* @return 	:
	* 설명		: 날짜를 검사 하여 보여주기
	**/
	function convert_Date(obj)
	{
		obj.value=delete_Char(obj.value,'-');
		switch(obj.value.length)
		{
			case 0 :
					return;
					break;
			case 6 :
					if (parseInt(obj.value.substring(0,2),10)  > 80 )
					{
						obj.value="19"+obj.value;
					}
					else
					{
						obj.value="20"+obj.value;
					}
					break;
			case 8 :
					break;
			default :
					obj.focus();
					return;
					break;
		}
		var realDate=chk_Date(obj.value);
		if (!realDate)
		{
			obj.focus();
			return;
		}
		str=obj.value;
		str=str.substring(0,4) + "-" + str.substring(4,6) + "-" + str.substring(6);
		obj.value=str;
	}
	/**
	* @param     : obj	=> 객체
	* sample	: <input type ="text" name ="date" onblur="convert_Yymm(this)" onfocus="delete_Char(this,'-')">
	* @return 	:
	* 설명		: 년월(YYYY-MM)을 검사 하여 보여주기
	**/
	function convert_Yymm(obj)
	{
		obj.value=delete_Char(obj.value,'-');
		switch(obj.value.length)
		{
			case 0 :
					return;
					break;
			case 4 :
					if (parseInt(obj.value.substring(0,2),10)  > 80 )
					{
						obj.value="19"+obj.value;
					}
					else
					{
						obj.value="20"+obj.value;
					}
					break;
			case 6 :
					break;
			default :
					obj.focus();
					return;
					break;
		}
		var realDate=chk_Date(obj.value + "01");
		if (!realDate)
		{
			obj.focus();
			return;
		}
		str=obj.value;
		str=str.substring(0,4) + "-" + str.substring(4,6);
		obj.value=str;
	}
	/**
	* @param     : obj	=> 객체
	* sample	: <input type ="text" name ="time0" onblur="convert_Time(this)" onfocus="delete_Char(this,':')">
	* @return 	:
	* 설명		: 날짜를 검사 하여 보여주기
	**/
	function convert_Time(obj)
	{
		obj.value=delete_Char(obj.value,':');
		str=obj.value ;
		switch(obj.value.length)
		{
			case 0 :
					return;
					break;
			case 4 :
					str=str +"01";
					break;
			case 6 :
					break;
			default :
					obj.focus();
					return;
					break;
		}
		var realDate=chk_Time(str);
		if (!realDate)
		{
			obj.focus();
			return;
		}
		if (obj.value.length == 4)
		{
			str=str.substring(0,2) + ":" + str.substring(2,4);
		}
		else if (obj.value.length == 6)
		{
			str=str.substring(0,2) + ":" + str.substring(2,4) + ":" + str.substring(4);
		}
		obj.value=str;
	}
	/**
	* @param     : str	=> 날짜
	* sample	: chk_Date("2003-01-01");
	* @return 	: true/false
	* 설명		: 날짜가 유효한지 검사
	**/
	function chk_Date(str)
	{
		str=delete_Char(str,'-');
		str=trim(str);
		if (!chk_Number(str)) return (false);
		if (str.length != 8)       return (false);
		if (!chk_Year(str))     return (false);
		if (!chk_Month(str))    return (false);
		if (!chk_Day(str))      return (false);
		return (true);
	}
	/**
	* @param     : str	=> 시간
	* sample	: chk_Time("12:12:12");chk_Time("12:12");
	* @return 	: true/false
	* 설명		: 시간이 유효한지 검사
	**/
	function chk_Time(str)
	{
		str=delete_Char(str,':');
		str=trim(str);
		if (!chk_Number(str)) return (false);
		if (str.length != 6)    return (false);
		hh=str.substring(0,2);
		mm=str.substring(2,4);
		ss=str.substring(4);
		if (!chk_Between(hh,"00","23")) return (false);
		if (!chk_Between(mm,"00","59")) return (false);
		if (!chk_Between(ss,"00","59")) return (false);
		return (true);
	}
	/**
	* @param     : str	=> 날짜
	* sample	: chk_Year("2003-01-01");
	* @return 	: true/false
	* 설명		: 년도가 유효한지 검사
	**/
	function chk_Year(str)
	{
		var year;
		var to;
		today=new Date();
		to=today.getYear() + 100;
		to    += "";
		if (to.length == 2) to=(parseInt(to, 10) + 1900) + "";
		str=trim(str);
		year=get_Year(str);
		return (chk_Between(year, "1901", to));
	}
	/**
	* @param     : str	=> 날짜
	* sample	: chk_Month("2003-01-01");
	* @return 	: true/false
	* 설명		: 월이 유효한지 검사
	**/
	function chk_Month(str)
	{
	  var month;
	  str=trim(str);
	  month=get_Month(str);
	  return (chk_Between(month, "01", "12"));
	}
	/**
	* @param     : str	=> 날짜
	* sample	: chk_Day("2003-01-01");
	* @return 	: true/false
	* 설명		: 날이 유효한지 검사
	**/
	function chk_Day(str)
	{
	  var day;
	  str=trim(str);
	  last_day=get_LastDay(str);
	  day=get_Day(str);
	  return (chk_Between(day, "01", last_day));
	}
	/**
	* @param     : str	=> String
	* sample	: chk_Number("12126761");
	* @return 	: true/false
	* 설명		: 숫자만으로 구성되어 있는지 검사
	**/
	function chk_Number(str)
	{
	  RefString="-1234567890";
	  DecimalPoints=0;
	  for (var i=0; i<str.length; i++)
	  {
		  TempChar=str.substring(i, i+1);
		  if (RefString.indexOf(TempChar,0) == -1) { return false; }
	  }
	  return true;
	}
	/**
	* @param     : str	=> String
	* sample	: chk_AlphaNumber("121267asvx61");
	* @return 	: true/false
	* 설명		: 숫자와 영문으로만  구성되어 있는지 검사
	**/
	function chk_AlphaNumber(str)
	{
		var success=true;
		var valid="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		str=str.toUpperCase();
		if (chk_Blank(str)) return (false);
		str=trim(str);
		for (var i=0; i < str.length; i++)
		{
			var number=(valid.indexOf(str.substring(i, i+1)) != -1);
			if (!(number))
			{
				success=false;
				break;
			}
		}
		return (success);
	}
	/**
	* @param     : str	=> String
	* sample	: chk_Blank("");
	* @return 	: true/false
	* 설명		: 공백인지 검사
	**/
	function chk_Blank(str)
	{
	  var rV=false;
	  if ((str == "") || (str == null) || (str == "null")) rV=true;
	  return rV;
	}
	/**
	* @param     : str	=> String
	* sample	: rtrim("121323    ");
	* @return 	: String
	* 설명		: str의 오른쪽 Blank를 소거한다.
	**/
	function rtrim(str)
	{
	  var index;
	  var ch=" ";
	  if (chk_Blank(str)) return (str);
	  for (index=str.length - 1; index >= 0; index--)
	    if (str.charAt(index) != ch) break;
	  return (str.substring(0, index + 1));
	}
	/**
	* @param     : str	=> String
	* sample	: rtrim("   121323");
	* @return 	: String
	* 설명		: str의 왼쪽 Blank를 소거한다.
	**/
	function ltrim(str)
	{
	  var index;
	  var len;
	  var ch=" ";
	  if (chk_Blank(str)) return (str);
	  len=str.length;
	  for (index=0; index < str.length; index++, len--)
	    if (str.charAt(index) != ch) break;
	  return (str.substring(index, index + len));
	}
	/**
	* @param     : str	=> String
	* sample	: trim("   121323   ");
	* @return 	: String
	* 설명		: str의 양쪽 Blank를 소거한다.
	**/
	function trim(str)
	{
	  var rV;
	  rV=ltrim(str);
	  rV=rtrim(rV);
	  return (rV);
	}
	/**
	* @param     : str	=> 날짜
	* sample	: get_Year("2003-01-01"); get_Year("20030101");
	* @return 	: 년도
	* 설명		: str에서 연도를 구함
	**/
	function get_Year(str)
	{
		str=delete_Char(str,'-');
		str=trim(str);
		return (str.substr(0, 4));
	}
	/**
	* @param     : str	=> 날짜
	* sample	: get_Month("2003-01-01"); get_Month("20030101");
	* @return 	: 월
	* 설명		: str에서 월을 구함
	**/
	function get_Month(str)
	{
		str=delete_Char(str,'-');
		str=trim(str);
		return (str.substr(4, 2));
	}
	/**
	* @param     : str	=> 날짜
	* sample	: get_Day(("2003-01-01"); get_Day(("20030101");
	* @return 	: 날짜
	* 설명		: str에서 날짜를 구함
	**/
	function get_Day(str)
	{
		str=delete_Char(str,'-');
		str=trim(str);
		return (str.substr(6, 2));
	}
	/**
	* @param     : str	=> String
	*		: from  => 시작
	*		: to   => 끝
	* sample	: chk_Between("1999","1900","2003");
	* @return 	: true/false
	* 설명		: 2문자 사이에 속하는 값인지 검사
	**/
	function chk_Between(str, from, to)
	{
	  if ((str < from) || (str > to)) return (false);
	  return (true);
	}
	/**
	* @param     : str	=> 날짜
	* sample	: get_LastDay(("2003-01-01"); get_LastDay(("20030101");
	* @return 	: 일자
	* 설명		: 달의 마지막 일자를 구함
	**/
	function get_LastDay(str)
	{
	  var maxday=new Array("31", "28", "31", "30", "31", "30",
	                         "31", "31", "30", "31", "30", "31");
	  var month=get_Month(str);
	  var day=maxday[parseInt(month, 10) - 1];
	  if (chk_LeapYear(str))
	    if (month == "02") day="29";
	  return (day);
	}
	/**
	* @param     : str	=> 날짜
	* sample	: chk_LeapYear(("2003-01-01"); chk_LeapYear(("20030101");
	* @return 	: true/false
	* 설명		: 윤년인지 아닌지 check
	**/
	function chk_LeapYear(str)
	{
	  var year;
	  str=trim(str);
	  year=parseInt(get_Year(str), 10);
	  if ( (year%4   == 0) &&
	      ((year%100 != 0) || (year%400 == 0)) ) return (true);
	  return (false);
	}
	/**
	* @param :
	* sample	: get_NowDate('-');get_NowDate('/');
	* @return 	: 현재 날짜
	* 설명		: 현재 날짜 가지고 오기
	**/
	function get_NowDate()
	{
		var delimiter="";
		if (arguments[0] == null)
		{
			delimiter="-" ;
		}
		else
		{
			delimiter=arguments[0] ;
		}
		year1=get_NowYear();
		month2=get_NowMonth();
		day2=get_NowDay();
		return year1+delimiter+fullZero(month2,2)+delimiter+fullZero(day2,2);
	}
	/**
	* @param :
	* sample	: get_NowYymm('-');get_Yymm('/');
	* @return 	: 현재 년월(YYYY-MM)
	* 설명		: 현재 년월 가지고 오기
	**/
	function get_NowYymm()
	{
		var delimiter="";
		if (arguments[0] == null)
		{
			delimiter="-" ;
		}
		else
		{
			delimiter=arguments[0] ;
		}
		year1=get_NowYear();
		month2=get_NowMonth();
		return year1+delimiter+fullZero(month2,2);
	}
	/**
	* @param :
	* sample	: get_NowYear();
	* @return 	: 현재 년도
	* 설명		: 현재 년도 가지고 오기
	**/
	function get_NowYear()
	{
		today=new Date()
		return 	""+today.getFullYear();
	}
	/**
	* @param :
	* sample	: get_NowMonth();
	* @return 	: 현재 월
	* 설명		: 현재 월 가지고 오기
	**/
	function get_NowMonth()
	{
		today=new Date()
		month1=today.getMonth()+1;
		return 	month1.toString();
	}
	/**
	* @param :
	* sample	: get_NowDay();
	* @return 	: 현재 일자
	* 설명		: 현재 일자 가지고 오기
	**/
	function get_NowDay()
	{
		today=new Date()
		day1=today.getDate();
		return 	day1.toString();
	}
	/**
	* @param :
	* sample	: get_NowTime(':');get_NowTime("-");
	* @return 	: 현재 시간
	* 설명		: 현재 시간 가지고 오기
	**/
	function get_NowTime()
	{
		var delimiter="";
		if (arguments[0] == null)
		{
			delimiter=":" ;
		}
		else
		{
			delimiter=arguments[0] ;
		}
		today=new Date()
		H=today.getHours().toString();
		M=today.getMinutes().toString();
		S=today.getSeconds().toString();
		return fullZero(H,2)+delimiter+fullZero(M,2)+delimiter+fullZero(S,2);
	}
	/**
	* @param     : str => String
	*		: icount => 전체 문자 갯수
	* sample	: fullZero("123",5);
	* @return 	: String
	* 설명		: 전체 문자 만큼 앞에 0을 채워준다
	**/
	function fullZero(str,icount)
	{
		var slength=(""+str).length;
		var s="";
		for (i=0 ; i < icount - slength ; i++)
		{
			s=s + "0";
		}
		return s + str;
	}
	/**
	* @param     : str => String
	* sample	: chk_Hangle("가나다라마바사");
	* @return 	: true/false
	* 설명		: 한글인지 아닌지 를 검사
	**/
	function chk_Hangle(str)
	{
	  var rV=false;
	  if (chk_Blank(str)) return (rV);
	  str=trim(str);
	  for (var i=0; i < str.length; i++)
	  {
	    if (str.charCodeAt(i) >= 123)
	    {
	      rV=true;
	      break;
	    }
	  }
	  return (rV);
	}
	/**
	* @param     : str => String
	* sample	: get_ByteLength("가나다라마바사");
	* @return 	: byte 길이
	* 설명		: 한글을 2byte 로 해서 나온 byte 길이
	**/
	function get_ByteLength(str)
	{
	  var byteLength=0;
	  for (inx=0; inx < str.length; inx++)
	  {
	    var oneChar=escape(str.charAt(inx));
		if      (oneChar.length == 1)           { byteLength ++; }
	    else if (oneChar.indexOf("%u") != -1)   { byteLength += 2; }
	    else if (oneChar.indexOf("%") != -1)    { byteLength += oneChar.length/3; }
	  }
	  return byteLength;
	}
	/**
	* @param     : obj => 객체
	* sample	: <input type ="text" name ="money" onblur="convert_Money(this);" onfocus="delete_Char(this,',')" >
	* @return 	:
	* 설명		: 숫자인지를 검사 하여 금액으로 보여주기
	**/
	function convert_Money(obj)
	{
		var flag=false;
		if(obj.value.substring(0,1) == "-")
		{
			minus="-";
			obj.value=delete_Char(obj.value,'-');
			flag=true;
		}
		if (!chk_Number(obj.value))
		{
			obj.focus();
			return;
		}
		str=obj.value;
		s_str=display_Money(str);
		if(flag == true)
		{
			obj.value=minus +s_str;
		}
		else
		{
			obj.value=s_str ;
		}
		flag=false;
	}
	/**
	* @param     : str => String
	* sample	: <input type ="text" name ="money" onblur="display_Money(this.value);" onfocus="delete_Char(this,',')"
	* @return 	:
	* 설명		: 금액 3자리 마다 콤마(,)를 찍어주는 함수 ex) 1000 => 1,000
	**/
	function display_Money(str)
	{
		var minus="";
		if(str.charAt(0) == "-")
		{
		   minus=str.charAt(0);
		   str=delete_Char(str,'-');
		}
		var div=str.length % 3;
		var s_str="";
		if (div == 0 ) {
			count=(str.length/3)-1;
		}else{
			count=(str.length-div) /3;
		}
		for (i=1;i<=count;i++){
			s_str=str.substr(str.length-3,3)+s_str;
			str=str.substr(0,str.length-3);
			if (str.length>0){
			s_str=","+s_str;
			}
		}
		s_str=str + s_str;
		return minus+s_str;
	}
	
	/**
	* @param     : obj => 객체
	*		: state => 객체상태
	* sample	: <input type ="text" name ="han"   >
	*		: <input type="button" onclick= "set_ImeModeHangle(han,true)" value="한글">
	*		: <input type="button" onclick= "set_ImeModeHangle(han,false)" value="영문">
	* @return 	:
	* 설명		: 한글,숫자만 입력가능/영문,숫자만 입력가능
	**/
	function set_ImeModeHangle(obj,state)
	{
		if (state)
		{	//한글+숫자
			obj.style.imeMode="active" ;
		}
		else
		{	//영문+숫자
			obj.style.imeMode="disabled" ;
		}
	}
	/**
	* @param     : obj => 다음 focus가 가야할 객체
	*		        : maxlength => 지금객체의 maxlength
	* sample	    : <input type ="text" name ="auto_tab0" onkeyup="nextFocus(this,auto_tab1, 2)" maxlength="2">
	* @return 	    :
	* 설명		    : maxlength가 됐을 다음 포커스 로 자동 이동하게 함
	**/
	function nextFocus(myobj,obj, maxlength)
	{
		if (maxlength =="" || maxlength == null || maxlength =="undefined")
		{
	       	var keyCode=ComGetEvent("keycode");
			var filter=[0,8,9,16,17,18,,33,34,35,36,37,38,39,40,46];
			if (chk_Defined(obj))
			{
				obj.focus();
				if (obj.type == "text"     ||
					obj.type == "password" ||
					obj.type == "textarea")
				{
					obj.select();
				}
			}
	    }
	    else
	    {
		var keyCode=ComGetEvent("keycode");
		var filter=[0,8,9,16,17,18,,33,34,35,36,37,38,39,40,46];
		if (myobj.value.length >= maxlength &&
			!containsElement(filter, keyCode))
		{
			if (chk_Defined(obj))
			{
				obj.focus();
				if (obj.type == "text"     ||
					obj.type == "password" ||
					obj.type == "textarea")
				{
					obj.select();
				}
			}
		}
	}
		/*[] ------------------------------------------------------------------ []*/
		/*| Usage           : 직접적인사용은 하지마시요.                         |*/
		/*[] ------------------------------------------------------------------ []*/
		function containsElement(arr, ele)
		{
			var found=false;
			var index=0;
			while (!found && index < arr.length)
			{
				if (arr[index] == ele)
				found=true;
				else
				index++;
			}
			return (found);
		}
	}
	/**
	* @param     : arg => 인자값
	* sample	: chk_Defined(arguments[0]);
	* @return 	: true/false
	* 설명		: 인자값이 있나 없나 검사
	**/
	function chk_Defined(arg)
	{
	  return (arg != null);
	}
	/**
	* @param     : str=> 만으로 나이 계산
	* sample	: calc_Age("1974-01-01");
	* @return 	: 만나이
	* 설명		: 만으로 나이계산
	**/
	function calc_Age(str)
	{
		str=delete_Char(str,'-');
	    if(str.length != 8)
	    {
	       	return;
	    }
	    var mm=str.substring(4,6);
	    var day=eval(str.substring(6,8));
	    var year=eval(str.substring(0,4));
		yy2=get_NowYear();
		mm2=eval(get_NowMonth());
		dd2=eval(get_NowDay());
		yourage=yy2 - year;
		if (mm2 < mm) yourage--;
		if ((mm2 == mm) && (dd2 < day)) yourage--;
		return yourage;
	}
	/**
	* @param     : str=> 기준일자
	*		: thedate => N일수
	*		: flag => true/false (+/-)일수
	* sample	: calc_Date("1974-01-01","5",true); calc_Date("1974-01-01","5",false);
	* @return 	: +일수 /-일수
	* 설명		: 기준일자의 이후/이전 날짜
	**/
	function calc_Date(str,thedate,flag)
	{
		arg=delete_Char(str,'-');
		if(arg.length != 8)
		{
			return
		}
		var mm=arg.substring(4,6);
	    var day=arg.substring(6,8);
	    var year=arg.substring(0,4);
		plann=eval(thedate);         //+ 몇일
		var dayStr=mm+"-"+day+"-"+year;
		var Meet=new Date(dayStr);
		if(flag == true)
		{
			//annitime = Meet.getTime()+plann*1000*3600*24-1
			annitime=Meet.getTime()+plann*1000*3600*24;
		}
		else
		{
			//annitime = Meet.getTime()-plann*1000*3600*24-1
			annitime=Meet.getTime()-plann*1000*3600*24;
		}
		var anniday=new Date();
		anniday.setTime(annitime);
		var plusmonth=anniday.getMonth()+1;
		var plusyear=(anniday.getYear()<100)?"19"+anniday.getYear():anniday.getYear();
		var plusday=anniday.getDate();
		return plusyear+"-"+FullZero(plusmonth,2)+"-"+FullZero(plusday,2) ;
	}
	/**
	* @param     : fromtime=> 시작일자
	*		: totime => 끝일자
	* sample	: get_IntervalDay("1974-01-01", "2003-01-01");
	* @return 	: 날짜 차이
	* 설명		: 시작일자와 끝일자 사이의 날짜 차이
	**/
	function get_IntervalDay(fromtime, totime)
	{
		fromtime=delete_Char(fromtime,'-');
		totime=delete_Char(totime,'-');
		if ( fromtime.length != 8 || totime.length != 8 )
		{
			return false;
		}
		var year=fromtime.substring(0,4);
		var month=fromtime.substring(4,6);
		var day=fromtime.substring(6,8);
		var year2=totime.substring(0,4);
		var month2=totime.substring(4,6);
		var day2=totime.substring(6,8);
		if(isNaN(year) || isNaN(month) || isNaN(day))
			return false;
		if(isNaN(year2) || isNaN(month2) || isNaN(day2))
			return false;
		if((year <= 0) || (year2 <= 0))
			return false;
		if((month <= 0  || month > 12) || (month2 <= 0  || month2 > 12))
			return false;
		var from_time=new Date(year,month-1,day);
		var to_time=new Date(year2,month2-1,day2);
		var fmillsec=from_time.getTime();
		var tmillsec=to_time.getTime();
		var resultday=(tmillsec - fmillsec)/(1000*60*60*24);
		return resultday;
	}
	/**
	* @param     : msg1=> 메시지
	* sample	: CONFIRM("정말 삭제 하시겠습니까?");
	* @return 	: true/false
	* 설명		: confirm 함수에 앞뒤에 말 붙인거
	**/
	function CONFIRM(msg1)
	{
		msg1="확인하십시오!!\n" +
		       "────────────────────────────────     \n\n" +
		       "" + msg1 + "\n" +
		       "\n────────────────────────────────     \n" +
		       "아래의 [취소]버튼을 누르시면 이 작업은 취소됩니다.";
		return confirm(msg1);
	}
	/**
	* @param     : obj => window
	* sample	: <input type ="text" name ="number" style="ime-mode:disabled"  onkeydown="onlyNumber(window)"  >
	* @return 	:
	* 설명		: 리얼타임으로 숫자만 입력할때
	**/
	function onlyNumber(obj)
	{
		key=ComGetEvent("keycode")
		//alert('key  '+key);
		if ( key == 13  || key == 9 )
		{   // 엔터,TAB
			return true;
		}
		if(obj.event.shiftKey == true){
			obj.event.returnValue=false;
			return true;
	    }
		if (key == 91 || key == 92 || key == 93 || key == 229 || key == 21 || key == 25 || key == 19 ) return true;
		if (key >= 112 && key <= 123) {       // function key
			ComJsEventStop();
			return true;
		}
		if ((key == 40) || (key == 38 )) {    // 위, 아래 화살표
			ComJsEventStop();
			return true;
		}
		if (( key > 95) && ( key < 106 )) {   // 우측 키패드 숫자 key
			ComJsEventStop();
			return true;
		}
		if (( key > 47) && ( key < 58 )) {    // 키보드 상단 숫자 key
			ComJsEventStop();
			return true;
		}
		if (( key == 37)||( key == 39 )||( key == 46)||( key == 8 ) ) {  // 좌,우 화살표,DEL,BACKS,-
			ComJsEventStop();
			return true;
		}
		if (obj.event.altKey || obj.event.shiftKey || obj.event.ctrlKey)
		{
			ComJsEventStop();
			return true;
		}
		if (( key > 36) && ( key < 41 ))
		{    // 좌,상,우,하 화살표
			ComJsEventStop();
			return true;
		}
		if (( key > 32) && ( key < 37 ))
		{    // Page-Up, Page-Down, End, Home
			ComJsEventStop();
			return true;
		}
		if (( key == 45) || ( key == 46 ) || ( key == 144 ))
		{    // Insert,Delete,NumLock
			ComJsEventStop();
			return true;
		}
		if (( key == 46)||( key == 8 )||( key == 17)||( key == 18 )||( key == 20)||( key == 27 ))
		{  // DEL,BACKS,Ctrl,Alt,CapsLock,Esc
			ComJsEventStop();
			return true;
		}
		obj.event.returnValue=false;
		//alert('숫자만 입력 가능합니다.');
		return false;
	}
	/**
	* @param     : obj => window
	* sample	: <input type ="text" name ="number" style="ime-mode:disabled"  onkeydown="onlyNumber(window)"  >
	* @return 	:
	* 설명		: 리얼타임으로 숫자와 '-'만 입력할때
	**/
	function onlyNumberMinus(obj)
	{
		event = ComGetEvent();
		key=ComGetEvent("keycode")
		//alert('key  '+key);
		if ( key == 13  || key == 9 )
		{   // 엔터,TAB
			return true;
		}
		if(ComGetEvent("keycode") || event.shiftKey == true){
			window.event.returnValue=false;
			return true;
	    }
		if (key == 91 || key == 92 || key == 93 || key == 229 || key == 21 || key == 25 || key == 19 ) return true;
		if (key >= 112 && key <= 123) {       // function key
			ComJsEventStop();
			return true;
		}
		if ((key == 40) || (key == 38 )) {    // 위, 아래 화살표
			ComJsEventStop();
			return true;
		}
		if (( key > 95) && ( key < 106 )) {   // 우측 키패드 숫자 key
			ComJsEventStop();
			return true;
		}
		if (( key > 47) && ( key < 58 )) {    // 키보드 상단 숫자 key
			ComJsEventStop();
			return true;
		}
		if( key == 189)   // - 처리
		{
			var str=obj.value;
			//alert(str.charAt(0));
			if(str.charAt(0) == "-" )
			{    event.returnValue=false; return false;}
			else
			{	 ComJsEventStop();   }
	    }
		if (( key == 37)||( key == 39 )||( key == 46)||( key == 8 )  ) {  // 좌,우 화살표,DEL,BACKS,-
			ComJsEventStop();
			return true;
		}
		if (event.altKey || event.shiftKey || event.ctrlKey)
		{
			ComJsEventStop();
			return true;
		}
		if (( key > 36) && ( key < 41 ))
		{    // 좌,상,우,하 화살표
			ComJsEventStop();
			return true;
		}
		if (( key > 32) && ( key < 37 ))
		{    // Page-Up, Page-Down, End, Home
			ComJsEventStop();
			return true;
		}
		if (( key == 45) || ( key == 46 ) || ( key == 144 ))
		{    // Insert,Delete,NumLock
			ComJsEventStop();
			return true;
		}
		if (( key == 46)||( key == 8 )||( key == 17)||( key == 18 )||( key == 20)||( key == 27 ))
		{  // DEL,BACKS,Ctrl,Alt,CapsLock,Esc
			ComJsEventStop();
			return true;
		}
		window.event.returnValue=false;
		//alert('숫자만 입력 가능합니다.');
		return false;
	}
	/**
	* @param     : obj => 객체
	*		: state => 객체상태
	* sample	: <input name="readonly1" type="text" />
	*		: <input type="button" onclick="javascript:set_TextReadonly(readonly1,!(readonly1.readOnly))" value=""/>
	* @return 	:
	* 설명		: 객체를 readonly만들고  배경색 바꿈
	**/
	function set_TextReadonly(obj,state)
	{
		if (state)
		{
			obj.style.background='#EEEEEE';
		}
		else
		{
			obj.style.background='#FFFFFF';
		}
		obj.readOnly=state ;
	}
	/**
	* @param     : obj => 객체
	* sample	: <input name="up" type="text" onblur="upper(this)"  />
	* @return 	:
	* 설명		: 대문자로 만들기
	**/
	function upper(obj)
	{
		str=obj.value;
		str=str.toUpperCase();
		obj.value=str;
	}
	/**
	* @param    : str => string
	*	@param    : type => 날짜타입
	*	@param    : msg => 오류발생할 때 출력할 메세지
	* sample	  : format_Date2(20030101,'YYYY-MM-DD',getMsg('COM12179'))  => 2003-01-01
	* @return 	:
	* 설명		: 날짜포맷
	**/
	function format_Date2(str,type, msg){
	  if (msg==null)
	    msg=getMsg("COM12179");
	  var formatDate=format_Date(str,type);
	  if (formatDate.length==0){
	    showErrMessage(msg);
	  }
	  return formatDate;
	}
	/**
	* @param    : str => string
	*	@param    : type => 날짜타입
	* sample	  : format_Date(20030101,'YYYY-MM-DD')  => 2003-01-01
	* @return 	:
	* 설명		: 날짜포맷
	**/
	function format_Date(str,type){
	  if(type == null)
	    type="YYYY-MM-DD";
		delimeter=DATE_SEPERATOR;
		str=delete_Char(str,delimeter);
		if(!isNumber2(str))
		 return "";
		switch(type)
		{
			case "YYYY-MM-DD" :
					if ( str.length == 8 )
					{
					  try{
					    onAfterFormatDate();
					  }catch(e){}
						return str.substring(0,4) + delimeter + str.substring(4,6)+ delimeter + str.substring(6);
					}
					else if ( str.length == 6 )
					{
						if ( str.substring(0,2) > 80 )
						{
							str="19" + str ;
						}
						else
						{
							str="20" + str ;
						}
					  try{
					    onAfterFormatDate();
					  }catch(e){}
						return str.substring(0,4) + delimeter + str.substring(4,6)+ delimeter + str.substring(6);
					}
					else
					{
						return "";
					}
					break;
			case "YY-MM-DD" :
					if ( str.length == 6 )
					{
					  try{
					    onAfterFormatDate();
					  }catch(e){}
						return str.substring(0,2) + delimeter + str.substring(2,4)+ delimeter + str.substring(4);
					}
					else if ( str.length == 8 )
					{
					  try{
					    onAfterFormatDate();
					  }catch(e){}
						return str.substring(2,4) + delimeter + str.substring(4,6)+ delimeter + str.substring(6);
					}
					else
					{
						return "";
					}
					break;
			default	:
				return "";
		}
	}
	/**
	* @param     : str => string
	*		: type => 시간타입
	* sample	: format_Date(121314,'hh:nn:ss')  => 12:13:14
	* @return 	:
	* 설명		: 시간포맷
	**/
	function format_Time(str,type)
	{
		str=delete_Char(str,':');
		delimeter=":";
		switch(type)
		{
			case "hh:nn:ss" :
						if (str.length != 6)
							return "";
						return str.substring(0,2) + delimeter + str.substring(2,4)+ delimeter + str.substring(4);
					break;
			case "hh:nn" :
						if (!(str.length == 4||str.length == 6))
							return "";
						return str.substring(0,2) + delimeter + str.substring(2,4);
					break;
			default	:
		}
	}
	/**
	* @param     : str => string
	*		: type => 숫자타입
	* sample	: format(121314,'#,###.00')  => 1,213.14
	* @return 	:
	* 설명		: 숫자 포맷
	**/
	function format(str,type)
	{
		str=delete_Char(str,',');
		switch(type)
		{
			case "#,###" :
					return display_Money(str);
					break;
			case "#,###.0" :
					p=str.split(".");
					p[0]=display_Money(p[0]);
					if (p.length == 1 )
					{
						return p[0]+"."+"0";
					}
					else if (p.length ==2 )
					{
						return p[0]+"."+p[1];
					}
					else
					{
						return "";
					}
			case "#,###.00" :
			        p=str.split(".");
					p[0]=display_Money(p[0]);
					if (p.length == 1 )
					{
						return p[0]+"."+"00";
					}
					else if (p.length ==2 )
					{
						return p[0]+"."+p[1];
					}
					else
					{
						return "";
					}
					break;
		}
	}
	/**
	* @param     : source => string 또는 obj 둘다 지원
	*		: char => 없애고 싶은 단어나 문장
	* sample	: delete_Char(this,',')   => this.value 가 3,3,3, 일때 이함수를 이용하면 333으로 나옴
	* @return 	:
	* 설명		: 문자를 없앨때 쓰는 함수
	**/
	function delete_Char(source,char1)
	{
		if (typeof(source) == "string")
		{
			return replaceStr(source,char1,'');
		}
		else if (typeof(source) == "object")
		{
			source.value=replaceStr(source.value,char1,'');
		}
		else
		{
			alert("지원하지 않는 형태입니다.");
		}
	}
	/**
	* @param     : element
	*               : flag       f => field (text,textarea)
	*                            t => <td>등의 테이블데이터성일때 사용
	* sample	    :
	* @return 	    :
	* 설명		    : 풍선 도움말로 안보이는 부분의 내용을 보여줌.
	**/
	function showTip(element, flag)
	{
	  if(flag == 't')
	  {
	      element.title=element.innerText;
	  }
	  else
	  {
	  	element.title=element.value;
	  }
	}
	/**
	* @param     : obj  => object
	*                : css  => 바꿔주고자 하는 css의 Class명
	*               : css2 => 클릭시 선택된 row를 보여줄때 사용
	* sample	    : CSS 를 적용시킬 Object, Css의 Class명, 선택된 row Css의 Class명
	*                  (ex) changeCss(this, 'css','css2');
	* @return 	    :
	* 설명		    : onMouseOver or Out Event를 발생시킬때 자동으로 Css를 바꾼다.
	*                  css2, 추가사항-> 해당 row를 클릭하여 현재 선택된 row를 보여주고 싶을때 사용한다.
	**/
	function changeCss(obj, css, css2)
	{
	  if (!((css2 =='') || (css2 == null)))
	  {
	  	changeCss_clear(obj,css);
	    obj.className=css2;
	  }
	  else
	  {
	  	if (obj.className != 'tr3')
	      obj.className=css;
	  }
	}
	/***************
	* 해당 table내의 모든 row를 해당 class로 바꾼다.
	***************/
	function changeCss_clear(obj,chClass)
	{
	  var pobj=document.all ? obj.parentElement : obj.parentNode;
	  //var pobj = obj.parentNode;
	  for(var i=0;i<pobj.rows.length;i++)
	  {
	  	pobj.childNodes[i].className=chClass;
	  }
	}
	/**
	* @param     : obj  => object
	* sample	    : clear_Combo(test38)
	* @return 	    :
	* 설명		    : 콤보안에 값을 모두 없앤다. 초기화
	**/
	function clear_Combo(obj)
	{
	    if (obj == null)
	    {
	        return;
	    }
	    else
	    {
		    for (var index=obj.length-1; index >= 0; index--)
		    {
		        obj.options[index]=null;
		    }
	    }
	}
	/**
	* @param     : obj  => object
	* sample	    : add_Combo(test39,"가나다라","10")
	* @return 	    :
	* 설명		    : 콤보안에 값을 더한다.
	**/
	function add_Combo(obj, text, value)
	{
	    if (obj == null)
	    {
	        return;
	    }
	    else
	    {
		    var len=obj.length;
	        if (len == 0)
	        {
	            option1=new Option(text, value, true);
	        }
	        else
	        {
	            option1=new Option(text, value);
	        }
	        obj.options[len]=option1;
	   }
	}
	
	/**
	* @param     : obj  => object
	*                 text_only  => 가져올 콤보값의 text
	* sample	    : f_get_combo_value(obj, text_only)
	* @return 	    : string
	* 설명		    : combobox에 str값의 선택된값을 구함
	**/
	function get_Combo(obj)
	{
	  var rV;
	  var len=obj.length;
	  var otype="";
	  if (obj == null) return;
	  otype=(obj.type).substring(0, 6);
	  if (otype != "select") return;
	    for (var index=0; index < len; index++)
	    {
	      if (obj.options[index].selected)
	      {
	        rV=trim(obj.options[index].text);
	      }
	    }
	  return (rV);
	}
	
/**
 * Form오브젝트 안에 있는 컨트롤을 QueryString으로 구성한다. 이때, 한글은 인코딩하지 않는다. 빈값은 넣어주지 않는다.<br>
 * @param{form}	str	 Form 객체  
 * @param{exElmNms}	str	  exElmNms값들은 form elemente name으로 구성하지 않을 값들이다. 
 */	 
 function csrFrmQryStr(form, exElmNms) {
	 return FormQueryString(form , exElmNms)
 }
//*************** CSR END ***************//
