/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : CoJoo.js
*@FileTitle  : Common JavaScript for Joint Operation
*@author     : CLT
*@version    : 1.0
*@since      : 2014/04/08
=========================================================*/
	if(msgs == undefined){
		msgs=new Array();
	}
var gVtOther="0123456789-+=|_,./() ";
var gVtNumber="0123456789";
var gVtSpcChar="-+=|_,./()"; 
//2014.10.06 NYK Add.
var gDefaultCsrLength = 16; 
var gEvidenceClassTaxE3 = "E3"; //2014.11.07 NYK Add.
var gEvidenceClassTaxF0 = "F0"; //2014.11.07 NYK Add.
var gCurrencyUSD = "USD";
var gCurrencyKRW = "KRW";

var COLOR_RED 	= "#FF0000";
var COLOR_BLACK = "#000000";
var COLOR_BLUE 	= "#0042ED";

    msgs['JOO00000']="There is no data.  Please re-check key data.";
	msgs['JOO00001']="There is any error in script.  Please check it again.";
	msgs['JOO00002']="The length of carrier code is 3 characters only.";
	msgs['JOO00003']="Customer Code (XX999999) is invalid !";
	msgs['JOO00004']="To create accounts, Please recheck the delete mark.";
	msgs['JOO00005']="You should input either Customer or Service Provider code.";
	msgs['JOO00006']="Please check the validation of Customer Code.";
	msgs['JOO00007']="Please check the validation of Service Provider Code.";
	msgs['JOO00008']="Please select 'Carrier code'.";
	msgs['JOO00009']="Please select 'Trade code'.";
	msgs['JOO00010']="Please select 'Revenue Lane code'.";
	msgs['JOO00011']="There is no data to copy.";
	msgs['JOO00012']="You can copy after saving the modified data.";
	msgs['JOO00013']="Do you want to copy data ?";
	msgs['JOO00014']="Please select different carrier code.";
	msgs['JOO00015']="You can't choose 'ITEM, Dir. Code' when you click 'Create' button.";
	msgs['JOO00016']="You can't choose 'Dir. Code' when you click 'Create' button.";
	msgs['JOO00017']="[{?msg1}] ITEM is mandatory to inquiry (length=3).";
	msgs['JOO00018']="[{?msg1}] Dir. is mandatory item.";
	msgs['JOO00019']="[{?msg1}] is mandatory item.";
	msgs['JOO00020']="[{?msg1}] TDR/RDR is mandatory item.";
	msgs['JOO00021']="[{?msg1}] Basic port is mandatory item.";
	msgs['JOO00022']="[{?msg1}] Second port must be different from basic port.";
	msgs['JOO00023']="[{?msg1}] Third port must be different from basic port.";
	msgs['JOO00024']="[{?msg1}] Third port must be different from second port.";
	msgs['JOO00025']="[{?msg1}] Pair basic port is a mandatory item.";
	msgs['JOO00026']="[{?msg1}] Pair second port must be different from basic port.";
	msgs['JOO00027']="[{?msg1}] Pair third port must be different from basic port.";
	msgs['JOO00028']="[{?msg1}] Pair third port must be different from second port.";
	msgs['JOO00029']="[{?msg1}] Pair basic port must be different from basic port.";
	msgs['JOO00030']="[{?msg1}] Unit Cost basis port is a mandatory item.";
	msgs['JOO00031']="VVD is invalid !";
	msgs['JOO00032']="The VVD [{?msg1}] was canceled. If you want to keep on going,  Press 'OK' otherwise press 'CANCEL'.";
	msgs['JOO00033']="Please input an account month.";
	msgs['JOO00034']="Data already exists.";
	msgs['JOO00035']="[{?msg1}] Unit Cost Port is a mandatory item.";
	msgs['JOO00036']="There is no data to save.";
	msgs['JOO00037']="Please check the Vessel Code.(XXXX)";
	msgs['JOO00038']="Please check the Voyage Number(9999).";
	msgs['JOO00039']="Please input VVD at first.";
	msgs['JOO00040']="Please check the Vessel Code [{?msg1}].";
	msgs['JOO00041']="[{?msg1}] Please check the Voyage Number(9999).";
	msgs['JOO00042']="[{?msg1}] Please select direction.";
	msgs['JOO00043']="[{?msg1}] Please select item.";
	msgs['JOO00044']="[{?msg1}] Please select basic port.";
	msgs['JOO00045']="[{?msg1}] Please select status.";
	msgs['JOO00046']="Do you want to save the changes ?";
	msgs['JOO00047']="[{?msg1}] Please select trade code.";
	msgs['JOO00048']="[{?msg1}] Please select revenue lane code.";
	msgs['JOO00049']="[{?msg1}] Please select main carrier.";
	msgs['JOO00050']="[{?msg1}] Please select sub carrier.";
	msgs['JOO00051']="[{?msg1}] Sub carrier must be different form main carrier. Error 'Sub-carrier' must be different form main carrier.";
	msgs['JOO00052']="[{?msg1}] Please insert a full name.";
	msgs['JOO00053']="[{?msg1}] Please check the account code.";
	msgs['JOO00054']="There is no data to be added.";
	msgs['JOO00055']="[{?msg1}] Please select revenue direction.";
	msgs['JOO00056']="[{?msg1}] Please input amount.";
    msgs['JOO00057']="[{?msg1}] You can't remove the data because it has a slip number. [{?msg2}]";
	msgs['JOO00058']="[{?msg1}] {?msg2} is empty.";
	msgs['JOO00059']="[{?msg1}] There is duplicated.";
	msgs['JOO00060']="Item must be empty when you create data.";
	msgs['JOO00061']="Do you want to delete all data ?";
	msgs['JOO00062']="Please input YYYY-MM of the tax invoice.";
	msgs['JOO00063']="Please select office code for the tax invoice number.";
	msgs['JOO00064']="Please input 'Issue Date'.";
	msgs['JOO00065']="Please input exchange rate.";
	msgs['JOO00066']="Year/ Month of tax invoice must be identical with that of issue date.";
	msgs['JOO00067']="Please input commodity name/code ?";
	msgs['JOO00068']="Please input 'Item Amount'.";
	msgs['JOO00069']="Item amount must be over zero, if something is positive.";
	msgs['JOO00070']="Item amount must be below zero, if something is negative.";
	msgs['JOO00071']="Amount from exchange rate x item account is different from current one.\nTo keep processing,  Please press 'OK' button.  If not, press 'Cancel' button.";
 	msgs['JOO00072']="Please select CSR No. to view detail.";
	msgs['JOO00073']="There is no CSR information to view in detail.";
	msgs['JOO00074']="The CSR No. is missing.";
	msgs['JOO00075']="Please input full CSR No. (length 19~20).";
	msgs['JOO00076']="Please input a condition either CSR No. or Issue Date.";
	msgs['JOO00077']="Please input the reason of cancel.";
	msgs['JOO00078']="'To date' must be later than 'From date'.";
	msgs['JOO00079']="Please click 'row delete' button, after 1 or more checked rows.";
	msgs['JOO00080']="'To port' must be different from 'From port'.";
	msgs['JOO00081']="There is the same pair(VVD, From-To port).";
	msgs['JOO00082']="There is no data In Financial Matrix. Insert the Financial Matrix data at first'";
	msgs['JOO00083']="There is no data in basic port.  Please insert the basic port data at first.";
	msgs['JOO00084']="[{?msg1}] Please select a R/T/U.";
	msgs['JOO00085']="[{?msg1}] Please select a Inter Port/Ocean.";
	msgs['JOO00086']="[{?msg1}] Please select a RGN.";
	msgs['JOO00087']="[{?msg1}] Please select a POL.";
	msgs['JOO00088']="[{?msg1}] Please select a POD.";
	msgs['JOO00089']="Please input a right Year-Month (YYYY-MM).";
	msgs['JOO00090']="The period must be within 6 months.";
	msgs['JOO00091']="The period must be before Account month.";
	msgs['JOO00092']="Please select a combined No.";
	msgs['JOO00093']="There is no data to delete.";
	msgs['JOO00094']="If you want to save, Please remove combined No. at first.";
	msgs['JOO00095']="Unable to remove the data because it has a slip no.";
	msgs['JOO00096']="Please select the combined number.";
	msgs['JOO00097']="Please input  description.";
	msgs['JOO00098']="Please select Evidence Class.";
	msgs['JOO00099']="Please select Evidence Type.";
	msgs['JOO00100']="It was already settled.";
	msgs['JOO00101']="Please input  Eff.Date.";
	msgs['JOO00102']="Please input  Due Date.";
	msgs['JOO00103']="{?msg1} are cancelled VVD.  Do you want to keep on going ?";
	msgs['JOO00104']="Please retrieve at first !";
	msgs['JOO00105']="You can input an evidence when Evidence Class is Value Added Tax.";
	msgs['JOO00106']="Please input evidence.";
	msgs['JOO00107']="The month of Eff. Date [{?msg1}] was closed. \nDo you want to replace the Eff. Date with opened month's 1st date [{?msg2}]?";
	msgs['JOO00108']="Amount is not a number.";
	msgs['JOO00109']="Service Provider code is empty.";
	msgs['JOO00110']="Please check Lane code.";
	msgs['JOO00111']="Please select  Lane code.";
	msgs['JOO00112']="Please input  Office code";
    msgs['JOO00113']="Please select  Item type code.";
	msgs['JOO00114']="[{?msg1}] Please input currency.";
	msgs['JOO00115']="Please select  {?msg1}.";
	msgs['JOO00116']="Please input {?msg1}.";
    msgs['JOO00117']="Please check {?msg1}.";
	msgs['JOO00118']="You must save it before sending.";
	msgs['JOO00119']="It doesn't have any evidence.";
	msgs['JOO00120']="This Combined data has been reversed !";
	msgs['JOO00121']="This Combined data can't be reversed because its evidence type is 'TAX'.";
	msgs['JOO00122']="This Combined data was canceled.";
	msgs['JOO00123']="Are you sure to reverse it ?";
    msgs['JOO00124']="You must save it before printing.";
	msgs['JOO00125']="There doesn't exist month {?msg1} in AP_PERIOD.";
	msgs['JOO00126']="This combined data can't be reversed because the month of Eff. Date is closed.";
	msgs['JOO00127']="The necessary condition to send into ERP is only Execute Month.\nPlease deselect other conditions.";
	msgs['JOO00128']="You can send data into ERP after saving changes.";
	msgs['JOO00129']="Are you sure to send the retrieved data into ERP ?";
	msgs['JOO00130']="The estimate year should be equal to or greater than target VVD year.";	      
    msgs['JOO00131']="Total amount value is not found.";   
    msgs['JOO00132']="Data is duplicated ![{?msg1}]  Do you want to save without checking duplicated data ?";       
    msgs['JOO00133']="Please select settlement option.";
    msgs['JOO00134']="[{?msg1}] is more than 4000 bytes !";
    msgs['JOO00135']='Do you want to delete {?msg1}?';
    msgs['JOO00136']="{?msg1} code is invalid !";
    msgs['JOO00137']="The Center Code ({?msg1})  in Financial Matrix is different from MDM's({?msg2}).";
    msgs['JOO00138']="The Location Code ({?msg1})  in Financial Matrix is different from MDM's({?msg2}).";
    msgs['JOO00139']="[{?msg1}] is closed month.  And it doesn't exist open month after the month.";
    msgs['JOO00140']="Two or more un-closed month exist ! Do you want ignore it ?";
    msgs['JOO00141']="No data found in 'Target VVD'.";
    msgs['JOO00142']="Two or more data in 'Target VVD'.";
    msgs['JOO00143']="There is no data !";
    msgs['JOO00144']="There is too many data.";
    msgs['JOO00145']="Data is duplicated !\nDo you want to update the old data ?"; 
    msgs['JOO00146']="Carrier-Trade-Lane is invalid !";
	msgs['JOO00147']="Service Provider Code (999999) is invalid !";
	msgs['JOO00148']="{?msg1} do(es) not have 'Revenue Year Month'.";
	msgs['JOO00149']="The settlement option of the lane is not 'Cycle'";
	msgs['JOO00150']="You can't press 'Create' button because the settlement option of the lane is 'Cycle'";
	msgs['JOO00151']="Fail to execute.";
	msgs['JOO00152']="Read result file aleady";
	msgs['JOO00153']="You can make 'Reverse Slip' after approval.";
	msgs['JOO00154']="Please input 'Unit Cost Basic Port Etd Date' at first.";
	msgs['JOO00155']="Please input 'Inter/Ocean' at first.";
	msgs['JOO00156']="Please input 'RGN' at first.";
    msgs['JOO00157']="There exists a same data\nDo you want to ignore the duplication?";
	msgs['JOO00158']="[{?msg1}] Please select 'BSA Type'.";
	msgs['JOO00159']="Please input 'From Port' at first.";
	msgs['JOO00160']="Success to execute";
	msgs['JOO00161']="There is duplicated data.";
	msgs['JOO00162']="Settlement Item [{?msg1}] do(es) not exist in 'Financial Matrix'.";
    msgs['JOO00163']="The Center Code in Financial Matrix is different from MDM's";
    msgs['JOO00164']="The Location Code in Financial Matrix is different from MDM's";
	msgs['JOO00165']="Please click the row that you want to reject.";
	msgs['JOO00166']="Are you sure to reject it?";
	msgs['JOO00167']="Please input a condition either 'Effective Date' or 'CSR No.'";
	msgs['JOO00168']="Please input both 'from date' and 'to date'";
	msgs['JOO00169']="Please retrieve at first.";
	msgs['JOO00170']="This csr data can't be approved because the month of Eff. Date is closed.";
	msgs['JOO00171']="Please select RDR/TDR.";
	msgs['JOO00172']="In creation mode...Please retrive at first.";
	msgs['JOO00173']="Can not retrieve 'R/F Surcharge' because it does not have 'Unit Cost Basic Port Etd Date'.";
	msgs['JOO00174']="Please, set the approval step.";
	msgs['JOO00175']="There is no need to create basic-port data if its settlement option is 'Cycle'.";
	msgs['JOO00176']="'Eff.Date' must be earlier than 'DUE Date'";
	msgs['JOO00177']="It was closed!!!";
	msgs['JOO00178']="Please, select tax invoice type.";
	msgs['JOO00179']="Please check CSR  I/F Status.";
	msgs['JOO00180']="Please check 'BSA Type'";
	msgs['JOO00181']="Do you want to delete the data of no value before saving?";
	msgs['JOO00182']="{?msg1} is pending case.";
	msgs['JOO00183']="Can not remove the selected data because there exists combined data.";3
	msgs['JOO00184']="Please select 'Rev/Exp'.";
	msgs['JOO00185']="Please select 'Source'.";
	msgs['JOO00186']="Please select 'Booking Type'.";
	msgs['JOO00187']="Please input {?msg1} date.";
	msgs['JOO00188']="There is(are) {?msg1} same period data.\n\nIf you want to input new period, press 'OK' button,\notherwise press 'CANCEL' button and choose a 'Reference Number'.";
	msgs['JOO00189']="Please check the currency.\nEach different currency cant't be invoiced.";
	msgs['JOO00190']="Please select CSR No. to CSR Reject.";
	msgs['JOO00191']="There is no CSR information to CSR Reject.";
	msgs['JOO00192']="You can make 'Reject CSR' after approval.";
	msgs['JOO00193']="[{?msg1}] Please select from port.";
	msgs['JOO00194']="[{?msg1}] Please select to port.";
	msgs['JOO00195']="[{?msg1}] Please select from date/time.";
	msgs['JOO00196']="[{?msg1}] Please select to date/time.";
	msgs['JOO00197']="Check the currency : it's different BSA with JOO settlement.";
	msgs['JOO00198']='{?msg1} is not valid date-time format. Please input a correct date-time. \n\n Format : YYYY-MM-DD HH24:MI.';
	msgs["JOO00199"]="Please input {?msg2} as {?msg1}"; //{?msg1}을(를) {?msg2}(으)로 입력해 주시기 바랍니다
	msgs['JOO00200']='Please input Duration(From ~ To) exactly.';
	msgs['JOO00201']='Please input Duration From exactly.';
	msgs['JOO00202']='Please input Duration To exactly.';
    msgs['JOO00203']="Lane is invalid !";
	msgs['JOO00204']="[{?msg1}]Please check TP/SZ data.";
	msgs['JOO00205']="[{?msg1}] is duplicated.";
	msgs['JOO00206']="[{?msg1}] {?msg2} is missing.";
	msgs['JOO00207']="Please check the VVD in settlement, there is no related VVD in AR Master Revenue VVD.";
	msgs['JOO00208']="Please input 'To Port' at first.";
	msgs['JOO00209']="Please select same Trade & Revenue Lane.";
	msgs['JOO00210']="Can't make an invoice with different partners.";
	msgs['JOO00211']="{?msg1}' must be earlier than {?msg2}.";
    msgs['JOO00212']="Please input Duration({?msg1} ~ {?msg1}) exactly.";
    msgs['JOO00213']="Please input Duration {?msg1} exactly.";
	msgs['JOO00214']="{?msg1} is empty.";
    msgs['JOO00215']="Same settlement data exists. It is overwritten after Save.";
    msgs['JOO00216']="{?msg1} not exists in JOO Setup.";
    msgs['JOO00217']="[{?msg1}] {?msg2} not exists in JOO Setup.";
    msgs['JOO00218']="{?msg1} not exists in schedule.";
    msgs['JOO00219']="[{?msg1}] {?msg2} not exists in schedule.";
    msgs['JOO00220']="Same invoiced data exists. It is newly added after Save.";
    msgs['JOO00221']="The partners have been selected more than two. \nThe invoices will be made with one connected key number for the purpose of bank transaction.";
    msgs['JOO00222']="It has been duplicated. Please check the data.";
    msgs['JOO00223']="Duplicated.";
    msgs['JOO00224']="Please check the {?msg1}.";
	msgs['JOO00225']="Do you want to {?msg1} ?";
	msgs['JOO00226']="CSR can't be approved or cancelled by issuer : {?msg1}";
	msgs['JOO00227']="CSR can't be approved or cancelled\nby issuer ({?msg1}) or 1st approver ({?msg2})";
	msgs['JOO10015']="Selected settlement data must have same vendor/customer for each partner.";
	msgs['JOO10016']="Can't input minus amount in THEA settlement";
	msgs['JOO10017']="Other Staff({?msg1}) is handling the selected settlement data.  Do you coninue ?";
	msgs['JOO10018']="CSR has been approved successfully";
	msgs['JOO10019']="Unexpected system error occured,\nPlease contact system administrator.";
	msgs['JOO10020']="Selected settlement data must have same vendor/customer/currency for each partner.";
	msgs['JOO10021']="Adjustment Amount & Balance Amount must be same.";
    msgs["JOO10022"]="{?msg1} Processing... please try again later";//Batch Processing 이 진행 중임을 표시
    msgs["JOO10023"]="Approval of JOO Offset No: {?msg1} is under processing now. please try again later";//Batch Processing 이 진행 중임을 표시
    msgs["JOO10024"]="Approval process is in-progress.  It will take quite some time before completeion due to a large volume of data";//Batch Processing 이 진행 중임을 표시
    msgs["JOO10025"]="More than {?msg1} letters are required in ({?msg2}) field.";
	
    /**
	 * return radio value
	 * @param radioObj
	 * @return
	 */
	function JooGetRadioValue(radioObj){
		var val="";
		for(var i=0; i<radioObj.length; i++){
			if (radioObj[i].checked){
				val=radioObj[i].value;
				break;
			}
		}
		return val;
	}	
    /**
	 * setting radio value
	 * @param radioObj
	 * @return
	 */
	function JooSetRadioValue(radioObj, val){
		for(var i=0; i<radioObj.length; i++){
			if (radioObj[i].value == val){
				radioObj[i].checked=true;
				break;
			}
		}
		radioObj.value=val;
	}	
	function JooSetRadioDisabled(radioObj, bol){
		for(var i=0; i<radioObj.length; i++){
			radioObj[i].disabled=bol;
		}
	}	
	/**
	 * checking that del_chk is checked but not Row Delete
	 * @param sheetObj
	 * @param prefix
	 * @return
	 */
	function existsUnDelRows(sheetObj, prefix){
		var rtnValue=false;
		var checkedRows=(sheetObj.FindCheckedRow(prefix+"del_chk")).split("|");
		if (checkedRows == "") 
			return rtnValue;
		var stat="";
		for(var i=0; i < checkedRows.length-1; i++){
			stat=sheetObj.GetRowStatus(checkedRows[i]);
			if ((stat == "I" || stat == "U") && (sheetObj.GetRowHidden(checkedRows[i]) == false)){
				rtnValue=true;
				break;
			}
		}
		return rtnValue;
	}
	/**
	 * adding data to combo field
	 * Web IBMultiCombo객체.InsertItem(Index, Text, Code);
	 */	
	function addComboItem(comboObj, comboItems) {
		for (var i=0 ; i < comboItems.length ; i++) {
			var comboItem=comboItems[i].split(",");
			//comboObj.InsertItem(i, comboItem[0] + "|" + comboItem[1], comboItem[1]);
			//NYK Modify 2014.10.21
			if(comboItem.length == 1){
				comboObj.InsertItem(i, comboItem[0], comboItem[0]);
			}else{
				comboObj.InsertItem(i, comboItem[0] + "|" + comboItem[1], comboItem[1]);
			}
			
		}   		
	}
	/**
	 * adding data to combo field
	 */	
	function UF_addComboItem(comboObj, comboItems) {
		for (var i=0 ; i < comboItems.length ; i++) {
			var comboItem=comboItems[i].split(",");
			//comboObj.InsertItem(i, comboItem[0], comboItem[1]);
			//NYK Modify 2014.10.21
			if(comboItem.length == 1){
				comboObj.InsertItem(i, comboItem[0], comboItem[0]);
			}else{
				comboObj.InsertItem(i, comboItem[0], comboItem[1]);
			}
		}   		
	}	
	/**
      *  getting data from Xml
      *    savename  using | in case of multiple data
      * @param xmlStr
      * @param savename
      * @return value   ex) aaa|dddd
      * @author jkc
      */
     function ComJooGetRowValue(xmlStr, colList)  {
    	 var rtnArr=new Array();
         if (xmlStr == null || xmlStr == "" || colList == null || colList == "") {
           return;
         }
         try {
       	  var xmlDoc = ComGetXmlDoc(xmlStr);
       	  if (xmlDoc == null) return;
       	  var xmlRoot = xmlDoc.documentElement;
       	  
           var dataNode=xmlRoot.getElementsByTagName("DATA").item(0);
           if (dataNode == null || dataNode.attributes.length < 3) {
             return;
           }
           var col=dataNode.getAttribute("COLORDER");
           var colArr=col.split("|");
           var sep=dataNode.getAttribute("COLSEPARATOR");
           var total=dataNode.getAttribute("TOTAL");
           var dataChileNodes=dataNode.childNodes;
           if (dataChileNodes == null) {
             return;
           }
           var colListArr=colList.split("|");
           var colListIdx=Array();
           for (var i=0; i < colListArr.length; i++) {
             for (var j=0; j < colArr.length; j++) {
               if (colListArr[i] == colArr[j]) {
                 colListIdx[i]=j;
                 break;
               }
             }
           }
           for (var i=0; i < dataChileNodes.length; i++) {
             if (dataChileNodes[i].nodeType != 1) {
               continue;
             }
             var arrData=dataChileNodes[i].firstChild.nodeValue.split(sep);
             var subDataArr=new Array();
             for (var j=0; j < colListIdx.length; j++) {
               subDataArr[j]=arrData[colListIdx[j]];
             }
             rtnArr[i]=(subDataArr);
           }
         } catch (err) {
           ComFuncErrMsg(err.message);
         }
         return rtnArr;
         
   }
     /**
      * add month click
      * @param obj
      * @param iMonth
      * @return
      */
     function UF_addMonth(obj, iMonth){
    	 if (obj.value != "") {
			 obj.value=ComGetDateAdd(obj.value+"-01", "M", iMonth).substring(0, 7);
    	 }
     }
      /**
       * getting msg from sXml
       * @param sXml
       * @return Sring MESSAGE
       * @author jkc
       */
      function ComJooGetMessageFromXml(sXml){
         if ( sXml == null  || sXml == "" ) return;
         return ComGetSelectSingleNode(sXml, "MESSAGE");
     }      
      /**
       * return formatted data. ex) code1\tname1|code2\tname2|...
       * @param code
       * @param name
       * @return
       */
      function UF_getComboStringForSheet(code, name){
    	  var codeArr=code.split("|");
    	  var nameArr=name.split("|");
    	  if (codeArr.length == 0) return "";
    	  var cnt=codeArr.length;
    	  if (codeArr.length > nameArr.length)
    		  cnt=nameArr.length;
    	  var rtnString="";
    	  for (var inx=0; inx < cnt; inx++){
    		  if (inx==cnt-1)
    			  rtnString=rtnString+codeArr[inx]+"\t"+nameArr[inx];
    		  else
    			  rtnString=rtnString+codeArr[inx]+"\t"+nameArr[inx]+"|";
    	  }
    	  return rtnString;
      }
       /**
        * 
        * <pre>
        *    Excel Title 
        * </pre>
        *
        * @param   sheetObj
        * @param   paramObj
        *          - Attribute : title         
        *                      : align         : {"center", "left", "right"}, (default:center)
        *                      : cols          : (default : Sheet Cols count(except hidden Type)
        *                      : orientation   : {Landscape,Portrait}(default : Landscape )
        *                      : columnwidth   : (default : auto) ex)optional, 3 col 30, 4 col 50 --> 3:30|4:50 
        *                      : datarowheight : (default : 20) ex)optional, 3 Row 30, 4 Row 50 --> 3:30|4:50
        *                                        paramObj.datarowheight="1:50"
        * @author jang kang cheol
        */
        function ComJooGetPgmTitle(sheetObj, paramObj){
           var doc=document.all;
           var pageUrl="FNS_JOO_EXCEL.do?";
           /*************************** title **********************************/
           var sTitle="";
           /*************************** align **********************************/
           var sTalign="center,left,right";
           var sAlign="";
           /*************************** Col count **********************************/
           var sCols="";
           var iCols=0;
           /*************************** orientation **********************************/        
           var sOrientation="";
           /*************************** column width **********************************/        
           var sColumnwidth="";
           /*************************** row Height **********************************/        
           var sDatarowheight="";
           if(paramObj.title == undefined ){
               sTitle=doc.title.innerHTML.replace("&nbsp;","");
               sTitle=sTitle.replace("&amp;"," ");
           }else{
               sTitle=paramObj.title;
           }
           if(paramObj.align == undefined ){
               sAlign="center"; 
           }else if(sTalign.indexOf(paramObj.align) == -1 ){
               sAlign="left";
           }else{
               sAlign=paramObj.align;
           }
           if(paramObj.cols == undefined ){
               for(var i=0; i<= sheetObj.LastCol(); i++){
            	   if ( sheetObj.GetCellProperty(0, i, "Hidden")!= "0"
                        && ! (
                        sheetObj.GetCellProperty(0, i, "Hidden")== "0" &&
                        sheetObj.GetCellProperty(0, i, "Type")== "Status"
                        )
                      ){
                       iCols++;
                   }
               }
           }else{
               iCols=eval(paramObj.cols);
           }
           if(paramObj.orientation == undefined ){
               sOrientation="Landscape";
           }else{
               sOrientation=paramObj.orientation;
           }
           if(paramObj.columnwidth == undefined ){
               sColumnwidth="";
           }else{
               sColumnwidth=paramObj.columnwidth;
           }
           if(paramObj.datarowheight == undefined ){
               sDatarowheight="";
           }else{
               sDatarowheight=paramObj.datarowheight;
           }        
           var sUrl=pageUrl+"title="+sTitle+"&align="+sAlign+"&cols="+iCols+"&columnwidth="+sColumnwidth+"&datarowheight="+sDatarowheight;
           return sUrl;
       }
        /**
         * Xml Tran result
         * @param xmlStr
         * @param savename
         * @return value    
         * @author jkc
         */
         function ComJooGetTrAllValue(sXml){
           if ( sXml == null  || sXml == "" ) return;
           return ComGetSelectSingleNode(sXml, "TR-ALL");
       }
         /**
          * Radio의 Disabled
          * @param radioObj
          * @param aBoolean
          * @return
          */
         function ComJooRadioDisabled(radioObj, aBoolean){
        		for(var i=0; i<radioObj.length; i++){ 
    				radioObj[i].disabled=aBoolean;
        		}
         }	

function JooRowHideDelete(sheetObj, col, isMsg) {
	if (isMsg==undefined || isMsg==null) isMsg=true;
	var org_col=col;
	col=ComIsNumber(col)?ComParseInt(col):sheetObj.SaveNameCol(col);
	if (col< 0 || col > sheetObj.LastCol()) {
		ComShowMessage("[JooRowHideDelete] '" + sheetObj.id + "' ['" + org_col + "'] is column not exist.");
		return -1;
	}
	//result : "1|3|5|"
	var sRow=sheetObj.FindCheckedRow(col);
	if (sRow == "") {
		if(isMsg) ComShowCodeMessage("COM12189");
		return 0;
	}
	var arrRow=sRow.split("|"); //result : "1|3|5|"
	sheetObj.RenderSheet(0);//for existing dtAutoSumEx
	if (sheetObj.GetCellProperty(0, col, "Type")== "DelCheck") {
		for (var idx=arrRow.length-1; idx>=0; idx--){
			var row=arrRow[idx];
			sheetObj.SetRowHidden(row,1);
		}
	} else {
		for (var idx=arrRow.length-1; idx>=0; idx--){
			var row=arrRow[idx];
			if (sheetObj.GetRowStatus(row) == "I"){
				sheetObj.RowDelete(row, false);
			}else{
				sheetObj.SetCellValue(row, col,0,0);
				sheetObj.SetRowHidden(row,1);
				sheetObj.SetRowStatus(row,"D");
			}
		}
	}
	sheetObj.RenderSheet(1);
	return arrRow.length-1;
}
/**
 * return button click enabled by class
 * @param srcName
 * @return
 */
function JooBtnClickEnable(srcName) {
	return !ComGetBtnDisable(srcName);
}
/**
 * changing class by button authority
 * @param auth
 * @param editable
 * @return
 */
function JooSetBtnClass(auth, editable) {
	var doc=document.all;

	for ( var i=0; i < doc.length; i++) {
		if (doc[i].id.indexOf("btn") > -1) {
			if (doc[i].getAttribute("auth") != undefined) {
				if (doc[i].getAttribute("auth") == auth) {
					ComEnableObject( doc[i] , editable );
				}
			}
		}
	}
}


/**
 * 두 날짜 사이의 시간을 반환한다. 시간은 sToDate - sFromDate로 계산되며, 둘중 하나라도 날짜포멧이 아닌 경우 결과는 "NaN"으로 리턴된다. <br>
 * @param {string,object} sFromDate   필수,시작일자 문자열 또는 HTML태그(Object)
 * @param {string,object} sToDate     필수,종료일자 문자열 또는 HTML태그(Object)
 * @returns number,두 날짜 사이의 시간<br>
 * NaN : 두 인자 중 날짜가 아닌것이 하나라도 있어서 연산이 불가능한 경우
 * ex) 
 */
function getDateTimesBetween(sFromDate, sToDate) {
    try {
        var iFromTime = getDateObj(sFromDate);
        var iToTime   = getDateObj(sToDate);
        var val = iToTime - iFromTime;
		return (iToTime - iFromTime) / (24*60*60*1000) ; // 시(24) * 분 (60) * 초(60)
		
    } catch(err) { ComFuncErrMsg(err.message); }
}

/**
 * 포맷이 없는 value로 넘어 와야 한다.
 * @param srcCharValue
 * @param sFormat
 * @returns {String}
 */
function JooGetDateFormat(obj, sFormat){
	var sVal = String(getArgValue(obj));
	sVal = sVal.replace(/\/|\-|\.|\:|\ /g,"");
	
    if (ComIsEmpty(sVal)) return "";
    
	var retValue = "";
	switch(sFormat){
	    	
		case "ymd":		//yyyy-mm-dd 10	            
		case "mdy":		//mm-dd-yyyy 10
			retValue = sVal.substring(0,8);
			break;     	            
	    case "ym":		//yyyy-mm 7
	    case "yw":		//yyyy-mm 7
	    case "hms":     //hh:mm:ss 8
			retValue = sVal.substring(0,6);
			break;     	            
	    case "yyyy":     //yyyy 4   	            
	    case "hm":      //hh:mm 5
			retValue = sVal.substring(0,4);
			break;
	    case "ymdhms":     //yyyy-mm-dd hh:mm:ss 19
			retValue = sVal.substring(0,14);
			break;    	            
	    case "ymdhm":     //yyyy-mm-dd hh:mm 16
			retValue = sVal.substring(0,12);
			break;
		}

	retValue = ComGetMaskedValue(retValue,sFormat);
	return retValue;
}

/**
 * 반환받은 XML이 에러일 경우 SheetObj에 메시지를 보내고, false를 반환한다.
 * @author Park Mangeon
 * @param SheetObj
 * @param xmlStr
 * @return
 */
  function ComIsNotErrMessage(SheetObj, xmlStr){
     if(xmlStr == null  || xmlStr == "" ) return true;
	 try {
	   var vPrefix = xmlStr.substring(1,6);
	
	    if (vPrefix == "ERROR") {
	         SheetObj.LoadSearchXml(xmlStr);
	         return false;
	        } else {
	         return true;
	        }

     } catch(err) { ComFuncErrMsg(err.message); }
  }
  
  function ComJooCsrDetailPopup(param, modal, winname){
	  if(modal == "undefined" || modal == "") modal = false;
	  if(winname == "undefined" || winname == "") winname = "CsrDetailPopupWindow";
	  ComOpenPopup("/opuscntr/FNS_JOO_0024.do"+param, 900, 450, "popupFinish", "none", modal, false, 0, 0, 0, winname);
  }
  
function JooComGetDaysBetween2(sFromDate, sToDate, digits) {
    try {
        //문자열 또는 HTML태그(Object)인 경우 처리
        var sFromDate = getArgValue(sFromDate);
        var sToDate   = getArgValue(sToDate);
        
        //if(sFromDate.length != sToDate.length) return NaN;	//khlee:길이 비교하지 않도록 변경함

        var iFromTime = getDateObj(sFromDate);
        var iToTime   = getDateObj(sToDate);
        
        var iPlusVal = 0;
        //var iPlusVal = 1/Number(ComRpad("1",(digits+1), "0"));
		
		return JooComGetRound( ((iToTime - iFromTime) / (60*60*24*1000)) + iPlusVal,  digits);
		
    } catch(err) { ComFuncErrMsg(err.message); }
}

function JooComGetRound(n, digits) {
	  if (digits >= 0) return parseFloat(n.toFixed(digits)); // 소수부 반올림

	  digits = Math.pow(10, digits); // 정수부 반올림
	  var t = Math.round(n * digits) / digits;

	  return parseFloat(t.toFixed(0));
}

function JooComGetCarrierText(comboObj, idx){
	var formObj = document.form;
	//var selIdx			= Number(comboObj.GetSelectIndex());
	//var selComboText	= comboObj.GetText(selIdx, idx);
	var selCode			= comboObj.GetSelectCode();
	var selComboText	= comboObj.GetText(selCode, idx);
	
	if(selComboText == "undefined" || selComboText == undefined || selComboText == "")
		selComboText = "";
	return selComboText;	
}
