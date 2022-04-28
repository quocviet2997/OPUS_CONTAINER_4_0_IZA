<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_0062.jsp
*@FileTitle  : Credit Customer Detail
*@author     : CLT
*@version    : 1.0
*@since      : 2018/12/19
=========================================================*/
%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.apps.opus.bcm.ccd.commoncode.partner.event.BcmCcd0062Event"%>
<%@ page import="org.apache.log4j.Logger" %> 
<%@ page import="com.clt.framework.component.util.StringUtil" %>  
<%            
    BcmCcd0062Event  event = null;              //PDTO(Data Transfer Object including Parameters)
    Exception serverException   = null;         //서버에서 발생한 에러
    String strErrMsg = "";                      //에러메세지
    int rowCount     = 0;                       //DB ResultSet 리스트의 건수

    String strUsr_id        = "";
    String strUsr_nm        = "";
    Logger log = Logger.getLogger("com.clt.apps.opus.bcm.ccd.commoncode.partner");
    // search Init
    String custCd = "";      
    String custAgmtNo = "";

    try {
        SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
        strUsr_id = account.getUsr_id();
        strUsr_nm = account.getUsr_nm();

        event = (BcmCcd0062Event)request.getAttribute("Event");
        serverException = (Exception)request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);
        
        custCd = StringUtil.xssFilter(request.getParameter("cust_cd"));
        if(custCd == null){
        	custCd = ""; //"JP212938"; //"DK100218";
        }
        
        custAgmtNo = StringUtil.xssFilter(request.getParameter("cust_agmt_no"));
        if(custAgmtNo == null){
        	custAgmtNo = "";
        }
        
        if (serverException != null) {
            strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
        }

    }catch(Exception e) {
        log.error(e.toString());
    }
%>
<head>
<title>Credit Customer Detail</title>
<script type="text/javascript">

	var G_MDAA_CHK;
	var G_AHTU_TP_CD;
	var CRDT_CHK;

    function setupPage(){
        var errMessage = "<%=strErrMsg%>";
        if (errMessage.length >= 1) {
            ComShowMessage(errMessage);
        } // end if
        loadPage();
    }

</script>
</head>

<body class="popup_bg" onLoad="setupPage();">
<form name="form">
<input type="hidden" name="f_cmd" id="f_cmd" />
<input type="hidden" name="pagerows" id="pagerows" />
<input id="cust_input_flg" name="cust_input_flg" type="hidden" />
<input id="term_input_flg" name="term_input_flg" type="hidden" />
<!-- popup_title_area(S) -->
 <div class="layer_popup_title">
    <!-- page_title_area(S) -->
    <div class="page_title_area clear">
        <!-- page_title(S) -->
        <h2 class="page_title"><span>Credit Customer Detail</span></h2>
        <!-- page_title(E) -->
        <!-- opus_design_btn(S) -->
        <div class="opus_design_btn"><!--
        --><button type="button" class="btn_normal" name="btn_save" id="btn_save" disabled>Save</button><!--
        --><button type="button" class="btn_normal" name="btn_history" id="btn_history">History</button><!--
        --><button type="button" class="btn_normal" name="btn_close" id="btn_close">Close</button></div>
        <!-- opus_design_btn(E) --> 
    </div> 
    <!-- page_title_area(E) -->
</div>
<!-- popup_title_area(E) --> 

<!-- wrap_result (S)  -->
<div class="wrap_result coupled_btn_normal2">

        <div class="opus_design_inquiry">
            <!-- Block 1ST :layout_wrap (S) -->
            <div class="layout_wrap">
                <div class="layout_flex_fixed" style="width:980px">
                    <div class="opus_design_inquiry sm" >
                        <table> 
                          <colgroup>
                            <col width="150" />
                            <col width="130" />
                            <col width="150" />
                            <col width="130"/>
                            <col/>
                            <col/>
                            <col/>
                            <col/>
                          </colgroup>
                          <tbody>
                          <tr>
                            <th>Credit Agreement No</th>
                            <td><input type="text" name="cust_agmt_no" id="cust_agmt_no" caption="Credit Agreement No" maxlength=20 
                                    style="width:105px;ime-mode:disabled;text-align:center;" dataformat="engupetc" class="input1" value="<%=custAgmtNo %>" readOnly /></td>
                            <th>Payment Office</th>
                            <td><input type="text" name="cr_clt_ofc_cd" caption="Payment Office" maxlength=5 
                                    style="width:80px;ime-mode:disabled;text-align:center;" dataformat="engup" class="input1" fullfill required="true"/><!-- 
                             --><button class="input_seach_btn" name="btn_com_ens_071" id="btn_com_ens_071" type="button"></button>
                            </td>
                            <th>Country/RHQ</th>
                            <td><input type="text" name="aply_cnt_ctnt" caption="Country/RHQ" maxlength=50 
                                    style="width:80px;ime-mode:disabled;text-align:center;" dataformat="engupetc" class="input2" readOnly /></td>
                            <th>Multiple Country Flag</th>
                            <td>
                                <select style="width: 50px;" class="input" name="mlt_cnt_flg" id="mlt_cnt_flg">
                                    <option value="N">N</option>
                                    <option value="Y">Y</option>
                                </select>
                            </td>
                          </tr>
                          <tr>
                            <th>Customer Code</th>
                            <td><input type="text" name="cust_cd" id="cust_cd" caption="Customer Code" maxlength=8 
                                    style="width:105px;ime-mode:disabled;text-align:center;" value="<%=custCd %>" class="input2" readOnly /></td>
                            <th>Customer Name</th>
                            <td colspan="3"><input type="text" name="cust_lgl_eng_nm" style="width:325px;" class="input2" readOnly /></td>
                            <th>&nbsp;</th>
                            <td>&nbsp;</td>
                          </tr>
                          <tr>
                            <th>Credit Currency</th>
                            <td><input type="text" name="cr_curr_cd" caption="Credit Currency" maxlength=3 
                                    style="width:77px;text-align:center;" dataformat="engup" fullfill class="input1" required="true" /><!--
                                               --><button class="input_seach_btn" name="btn_com_ens_n13" id="btn_com_ens_n13" type="button"></button></td>
                            <th>Credit Amount Limit</th>
                            <td><input type="text" name="cr_amt" caption="Credit Amount Limit" maxlength=25 
                                    style="width:80px;text-align:right;" dataformat=float pointcount="3" class="input1" required="true" /></td>
                            <th>Credit DIV</th>
                            <td>
                                <select style="width:80px;" class="input2" name="cust_cr_due_dt_div_cd" caption="Credit DIV" required="true">
                                    <option value=""></option>
                                    <option value="S" >S/A Date</option>
                                    <option value="I" >Issue Date</option>
                                </select>
                            </td>
                            <th>&nbsp;</th>
                            <td>&nbsp;</td>
                          </tr>
                          <tr>
                            <th>Credit Start Date</th>
                            <td><input type="text" name="cr_cust_st_dt" caption="Credit Start Date" maxlength=10
                                    style="width:77px;text-align:center;ime-mode:disabled" class="input" 
                                    required="true" dataformat="ymd" /><!--
                                               --><button type="button" class="calendar ir margin_none" name="btn_cr_cust_st_dt" id="btn_cr_cust_st_dt"></button></td>
                            <th>Credit End Date</th>
                            <td><input type="text" name="cr_cust_end_dt" caption="Credit End Date" maxlength=10
                                    style="width:80px;text-align:center;ime-mode:disabled" class="input" 
                                    required="true" dataformat="ymd" /><!--
                                               --><button type="button" class="calendar ir margin_none" name="btn_cr_cust_end_dt" id="btn_cr_cust_end_dt"></button></td>
                            <th>O/B Credit Term</th>
                            <td><input type="text" name="ob_cr_term_dys" caption="O/B Credit Term" maxlength=3 
                                    style="width:80px; ime-mode:disabled; text-align:right;" dataformat="int" class="input" /></td>
                            <th>I/B Credit Term</th>
                            <td><input type="text" name="ib_cr_term_dys" caption="I/B Credit Term" maxlength=3
                                    style="width:50px; ime-mode:disabled; text-align:right;" dataformat="int" class="input" /></td>
                          </tr>
                          <tr>
                            <th>Review Date</th>
                            <td><input type="text" name="rvw_dt" caption="Review Date" maxlength=10
                                    style="width:77px;text-align:center;ime-mode:disabled" class="input2" dataformat="ymd" readOnly /></td>
                            <th>PIC Email</th>
                            <td colspan="2"><input type="text" name="pic_eml" caption="PIC Email" maxlength=200 
                                    style="width:200px;ime-mode:disabled;" class="input" /></td>
                            <td>&nbsp;</td>
                            <th>&nbsp;</th>
                            <td>&nbsp;</td>
                          </tr> 
                          </tbody>
                        </table>
                        <table>
                          <tbody>
                          <colgroup>
                                <col width="250px"/>
                                <col width="80px"/>
                                <col width="100px" />
                                <col width="135px" />
                                <col width="110px" />
                                <col width="*" />
                          </colgroup>                          
                          <tr>
                            <th>Financial Risk To Release B/L and Cargo</th>
                            <td><!--  
                                --><select style="width: 50px; ime-mode:disabled" class="input" name="cust_rlse_ctrl_flg" id="cust_rlse_ctrl_flg" required="true">
                                    <option value="N">N</option>
                                    <option value="Y">Y</option>
                                </select>
                            </td>
                            <th>Credit Flag</th>
                            <td>
                                <select style="width:50px;" class="input2" disabled>
                                    <option value="Y" selected>Y</option>
                                </select>
                            </td>
                            <th>Freight Release Ready Flag</th>
                            <td><!--  
                                --><select style="width: 50px; ime-mode:disabled" class="input" name="cr_rdy_flg" id="cr_rdy_flg" required="true">
                                    <option value="N">N</option>
                                    <option value="Y">Y</option>
                                </select>
                            </td>
                          </tr>                                                    
                          </tbody>
                        </table>
                    </div>
              
                </div>    
            </div>
            <!-- Block 1ST :layout_wrap (E) -->                                
            <!-- Block 2ND :layout_wrap (S) -->
            <div class="layout_wrap">
                <div class="layout_flex_fixed" style="width:980px">                
                    <div class="layout_wrap">
                        <div class="layout_vertical_2 pad_rgt_8" style="width:250px;">
                              <div class="opus_design_inquiry sm" style="height:200px;">
                              
                                <table width="100%"> 
                                  <tr>
                                    <th width="57px">Contract Number</th>
                                    <td>&nbsp;</td>
                                  </tr>
                                </table>
                                  
                                <div class="opus_design_grid grid_height" style="margin:4px 0"><script type="text/javascript">ComSheetObject('sheet1');</script></div>
                                  
                                <table> 
                                  <tr>
                                    <th width="220">&nbsp;</th>
                                    <td >
                                        <button type="button" class="btn_etc" name="btn_RowAdd1" id="btn_RowAdd1">Row Add</button><!-- 
                                       --><button type="button" class="btn_etc" name="btn_RowDelete1" id="btn_RowDelete1">Row Delete</button>
                                    </td>
                                  </tr>
                                </table>
                                
                              </div>
                        </div> 
                                
                        <div class="layout_vertical_2" style="width:730px;">
                            <div class="opus_design_inquiry sm" style="height:200px;">
                              <table width="100%"> 
                                  <tr>
                                    <th width="57px">Associated / Child Customer Code</th>
                                    <td>&nbsp;</td>
                                  </tr>
                                </table>
                                  
                                <div class="opus_design_grid grid_height" style="margin:4px 0"><script type="text/javascript">ComSheetObject('sheet2');</script></div>
                                  
                                <table> 
                                  <tr>
                                    <th width="550px">&nbsp;</th>
                                    <td>
                                        <button type="button" class="btn_etc" name="btn_RowAdd2" id="btn_RowAdd2">Row Add</button><!-- 
                                       --><button type="button" class="btn_etc" name="btn_RowDelete2" id="btn_RowDelete2">Row Delete</button>
                                    </td>
                                  </tr>
                                </table>
                              </div>
                        </div> 
                    </div>                                                                              
                   
                </div>
            </div>
            <!-- Block 2ND :layout_wrap (E) -->            
            <!-- Block 3RD :layout_wrap (S) -->
            <div class="opus_design_inquiry sm" style="width:980px;">
              <table>
                <tr>
                    <th>Payment Date1</th>
                    <td><input type="text" name="pay_dt_dy1" caption="Payment Date1" maxlength="2" style="width: 80px; ime-mode:disabled; text-align:right;" class="input" dataformat="num" /> </td>
                    <th>Payment Date2</th>
                    <td><input type="text" name="pay_dt_dy2" caption="Payment Date2" maxlength="2" style="width: 80px; ime-mode:disabled; text-align:right;" class="input" dataformat="num" /> </td>
                    <th>Payment Date3</th>
                    <td><input type="text" name="pay_dt_dy3" caption="Payment Date3" maxlength="2" style="width: 80px; ime-mode:disabled; text-align:right;" class="input" dataformat="num" /> </td>
                    <th>Payment Date4</th>
                    <td><input type="text" name="pay_dt_dy4" caption="Payment Date4" maxlength="2" style="width: 80px; ime-mode:disabled; text-align:right;" class="input" dataformat="num" /> </td>
                    <td></td>
                </tr>
                <tr>
                  <th>Remark</th>
                  <td colspan="5"><input type="text" name="cr_cust_rmk" id="cr_cust_rmk" caption="Remark" maxlength=100 
                          style="width:623px;" /></td>
                  <th></th>
                  <td></td>
                  <td></td>
                </tr>
                
              </table>            
            </div>
            <!-- Block 3RD :layout_wrap (E) -->
            <!-- Block 4TH :layout_wrap (S) -->
            <div class="opus_design_inquiry sm" style="width:980px;">
              <table>
                <tr>
                  <th width="50" class="align_left">Delete Flag</th>
                  <td width="100">
                      <select style="width:60px;" name="delt_flg" class="input" id="delt_flg">
                          <option value="N" selected>N</option>
                          <option value="Y">Y</option>
                      </select></td>
                  <th width="50" class="align_left">Create User</th>
                  <td width="340"><input type="text" style="width:80px;text-align:center;" class="input2" name="cre_usr_id" id="cre_usr_id" readOnly/></td>
                  <th width="50" class="align_left">Create Date/Time</th>
                  <td width="340"><input type="text" style="width:120px;text-align:center;" class="input2" name="cre_dt" id="cre_dt" readOnly/></td>
                  <th width="50" class="align_left">Last Update User</th>
                  <td width="340"><input type="text" style="width:80px;text-align:center;" class="input2" name="upd_usr_id" id="upd_usr_id" readOnly/></td>
                  <th width="50" class="align_left">Last Update Date</th>
                  <td width="340"><input type="text" style="width:120px;text-align:center;" class="input2" name="upd_dt" id="upd_dt" readOnly/></td>
                </tr>
              </table>            
            </div>
            <!-- Block 4TH :layout_wrap (E) -->            
        </div> 

</div>
<!-- wrap_result (E)   style="Display :none" -->

</form>
</body>
<%@include file="/bizcommon/include/common_opus.jsp"%>
