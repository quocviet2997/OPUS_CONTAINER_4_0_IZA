<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ taglib uri="/WEB-INF/template.tld" prefix="template"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.framework.component.util.JSPUtil" %>
<%@ page import="com.clt.framework.support.view.menu.MenuBean" %>
<%@ page import="com.clt.framework.support.view.menu.MenuProcessor" %>
<%@ page import="com.clt.framework.support.view.menu.MenuEventResponse" %>
<%@ page import="com.clt.framework.core.view.template.Parameter"%>
<%@ page import="com.clt.framework.core.view.template.Screen"%>
<%@ page import="com.clt.framework.core.controller.util.WebKeys"%>
<!-- 다국어 관련 추가 부분 -->
<%@ page import="com.clt.framework.support.view.signon.web.SignOnFilter" %>
<!DOCTYPE html>
<html style="overflow-y:hidden">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="style/css/theme_default.css" />
<!-- common js include --> 
<script type="text/javascript" src="style/js/jquery-1.11.0.min.js"></script>
<script type="text/javascript" src="style/js/gnb.js"></script>
<!-- common js include -->
<title>OPUS Container</title>
<base target="_parent" />
</head>
<body>



<!-- full_menu(S) -->
<div class="full_menu">
    <ul>
        <li><!-- Sales MGMT(S) -->
            <ul>
                <li>Sales MGMT</li>
                <li><a href="/opuscntr/opusMainTobe.do?parentPgmNo=ESM_SAQ_M001" target="_blank">Sales Quota</a></li>
                <li><a href="/opuscntr/opusMainTobe.do?parentPgmNo=ESM_SPC_M001" target="_blank">Space Control</a></li>
                <li><a href="/opuscntr/opusMainTobe.do?parentPgmNo=ESM_PRI_M001" target="_blank">Pricing</a></li>
                <li><a href="/opuscntr/opusMainTobe.do?parentPgmNo=ESM_COA_M001" target="_blank">CNTR BIZ PFMC Analysis</a></li>
                <li><a href="/opuscntr/opusMainTobe.do?parentPgmNo=ESM_BSA_M001" target="_blank">BSA</a></li>
                <li><a href="/opuscntr/opusMainTobe.do?parentPgmNo=ESM_SAM_M001" target="_blank">Sales Admin</a></li>
            </ul>
        </li><!-- Sales MGMT(E) --><!-- 
     --><li><!-- Support &amp; Admin(S) -->
            <ul>
                <li>Support &amp; Admin</li>
                <li><a href="/opuscntr/opusMainTobe.do?parentPgmNo=CPS_CNI_M001" target="_blank">Claim &amp; Insurance</a></li>
                <li><a href="/opuscntr/opusMainTobe.do?parentPgmNo=ESM_FLT_M001" target="_blank">Fleet Management</a></li>
                <li><a href="/opuscntr/opusMainTobe.do?parentPgmNo=FNS_JOO_M001" target="_blank">Joint Operation</a></li>
                <li><a href="/opuscntr/opusMainTobe.do?parentPgmNo=ESM_ACM_M001" target="_blank">Agent Commission Management</a></li>
            </ul>
        </li><!-- Support &amp; Admin(E) --><!-- 
     --><li><!-- EQ MGMT(S) -->
            <ul>
                <li>EQ MGMT</li>
                <li><a href="/opuscntr/opusMainTobe.do?parentPgmNo=EES_EQR_M001" target="_blank">EQ Reposition</a></li>
                <li><a href="/opuscntr/opusMainTobe.do?parentPgmNo=EES_MST_M001" target="_blank">CNTR Master</a></li>
                <li><a href="/opuscntr/opusMainTobe.do?parentPgmNo=EES_LSE_M001" target="_blank">CNTR Lease</a></li>
                <li><a href="/opuscntr/opusMainTobe.do?parentPgmNo=EES_CIM_M001" target="_blank">CNTR Inventory</a></li>
                <li><a href="/opuscntr/opusMainTobe.do?parentPgmNo=EES_MNR_M001" target="_blank">M&amp;R</a></li>
                <li><a href="/opuscntr/opusMainTobe.do?parentPgmNo=EES_CGM_M001" target="_blank">Chassis</a></li>
                <li><a href="/opuscntr/opusMainTobe.do?parentPgmNo=EES_CGM_M019" target="_blank">M.G Set</a></li>
            </ul>
        </li><!-- EQ MGMT(E) --><!-- 
     --><li><!-- Service MGMT(S) -->
            <ul>
                <li>Service MGMT</li>
                <li><a href="/opuscntr/opusMainTobe.do?parentPgmNo=ESM_BKG_M001" target="_blank">Booking/Documentation</a></li>
                <li><a href="/opuscntr/opusMainTobe.do?parentPgmNo=ESD_PRD_M001" target="_blank">Product Catalog</a></li>
                <li><a href="/opuscntr/opusMainTobe.do?parentPgmNo=ESD_SCE_M001" target="_blank">SCEM</a></li>
                <li><a href="/opuscntr/opusMainTobe.do?parentPgmNo=ESD_TES_M001" target="_blank">TML INV</a></li>
                <li><a href="/opuscntr/opusMainTobe.do?parentPgmNo=ESD_TRS_M001" target="_blank">Trans S/O</a></li>
                <li><a href="/opuscntr/opusMainTobe.do?parentPgmNo=FNS_INV_M001" target="_blank">A/R Invoice</a></li>
                <li><a href="/opuscntr/opusMainTobe.do?parentPgmNo=EES_CTM_M001" target="_blank">CNTR Movement</a></li>
                <li><a href="/opuscntr/opusMainTobe.do?parentPgmNo=ESD_TPB_M001" target="_blank">3rd Party Billing</a></li>
                <li><a href="/opuscntr/opusMainTobe.do?parentPgmNo=EES_DMT_M001" target="_blank">Demurrage/Detention</a></li>
                <li><a href="/opuscntr/opusMainTobe.do?parentPgmNo=ESM_OCP_M001" target="_blank">OCPS</a></li> 
                <li><a href="/opuscntr/opusMainTobe.do?parentPgmNo=TPL_DOM_M001" target="_blank">Domestic</a></li> 
            </ul>
        </li><!-- Service MGMT(E) --><!-- 
     --><li><!-- Vessel OPR(S) -->
            <ul>
                <li>Vessel OPR</li>
                <li><a href="/opuscntr/opusMainTobe.do?parentPgmNo=VOP_OPF_M001" target="_blank">Operation &amp; PFMC</a></li>
                <li><a href="/opuscntr/opusMainTobe.do?parentPgmNo=VOP_PSO_M001" target="_blank">Port Service Order</a></li>
                <li><a href="/opuscntr/opusMainTobe.do?parentPgmNo=VOP_SCG_M001" target="_blank">Special Cargo</a></li>
                <li><a href="/opuscntr/opusMainTobe.do?parentPgmNo=VOP_VSK_M001" target="_blank">Vessel Schedule</a></li>
            </ul>
        </li><!-- Vessel OPR(E) --><!-- 
     --><li><!-- BIZ Common(S) -->
            <ul>
                <li>BIZ Common</li>
                <li><a href="/opuscntr/opusMainTobe.do?parentPgmNo=BCM_CCD_M001" target="_blank">Master Data</a></li>
            <!--<li><a href="/opuscntr/opusMainTobe.do?parentPgmNo=BCM_FIN_M001" target="_blank">Finance Setup</a></li>-->
                <li><a href="/opuscntr/opusMainTobe.do?parentPgmNo=BCM_SUP_M001" target="_blank">EDI Setup</a></li>
                <li><a href="/opuscntr/opusMainTobe.do?parentPgmNo=COM_SEC_M001" target="_blank">Security</a></li>
                <li><a href="/opuscntr/opusMainTobe.do?parentPgmNo=COM_CAP_M001" target="_blank">Approval</a></li>
            <!--<li><a href="/opuscntr/opusMainTobe.do?parentPgmNo=ADM_000_M000" target="_blank">Administer</a></li>-->
                <li><a href="/opuscntr/opusMainTobe.do?parentPgmNo=COM_FAX_M001" target="_blank">Fax Monitoring</a></li>
            </ul>
        </li><!-- BIZ Common(E) --><!-- 
     --><li class="last"><!-- Statement MGMT(S) -->
            <ul>
                <li>Statement MGMT</li>
                <li><a href="/opuscntr/opusMainTobe.do?parentPgmNo=STM_SAP_M001" target="_blank">Statement Account Payable</a></li>
                <li><a href="/opuscntr/opusMainTobe.do?parentPgmNo=STM_SAR_M001" target="_blank">Statement Account Receivable</a></li>
                <li><a href="/opuscntr/opusMainTobe.do?parentPgmNo=STM_SAC_M001" target="_blank">Statement Accrual</a></li>
                <li><a href="/opuscntr/opusMainTobe.do?parentPgmNo=STM_SCO_M001" target="_blank">Statement Common</a></li>
            </ul>
        </li><!-- Statement MGMT(E) -->
    </ul>
</div>
<!-- full_menu(E) -->




</body>
<!-- VER 1.2 -->
</html>