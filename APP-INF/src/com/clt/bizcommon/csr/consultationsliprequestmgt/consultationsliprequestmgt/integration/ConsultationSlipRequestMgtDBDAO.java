/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : ConsultationSlipRequestMgtDBDAO.java
*@FileTitle : CSR Creation - Summary
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.01
*@LastModifier : �⑤���
*@LastVersion : 1.0
* 2009.07.01 �⑤���
* 1.0 Creation
* ---------------------------------------------------------
* History
* 2010.08.31 源�쁺泥�[CHM-201005571-01] [VOP-PSO] 怨듯넻 CSR��Invoice 議곌굔 移쇰읆 異붽��붿껌嫄�
* 2010.08.31 源�쁺泥�[] R4J �먯꽌 硫붿냼��二쇱꽍 �섏젙遺�텇 �섏젙��
* 2010.10.12 源�쁺泥�[] Invoices��寃쎌슦��RcvDt 媛믪씠 ��옣�섎룄濡��섏젙��
* 2010.10.18 源�쁺泥�[CHM-201006348-01] CSR �꾪몴 Remark 蹂댁셿 - INV_DESC 異붽�
* 2010.10.25 源�쁺泥�[] 硫붿냼��二쇱꽍遺�텇 泥좎옄媛���젮 �섏젙��
* 2010.11.05 源�쁺泥�[] DBDAO��SQL臾몄씠 �덉뼱 �묒뾽��
* 2011.10.20 誘쇱젙��[CHM-201113843] 怨듯넻 CSR R4J Rule �덉쭏寃고븿 議곗튂
=========================================================*/
package com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.integration;
 
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.clt.bizcommon.approval.util.ApprovalUtil;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.basic.ConsultationSlipRequestMgtBCImpl;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo.ApPayInvListVO;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo.AsaNoVO;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo.AutoRevVVDListVO;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo.CSRSOhdrVO;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo.CSRSOlistVO;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo.CheckAsaVO;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo.CreateApInvDTRBASANoSelectVO;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo.CsrListInputVO;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo.CsrParmVO;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo.DtrbListVO;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo.HdrVO;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo.IfCsrListInputVO;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo.PayInvVO;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo.SearchDTRBTtlVO;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo.SrchPayGrpLuCdVO;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo.TAXInfoVO;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.component.util.JSPUtil;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.db.ISQLTemplate;
import com.clt.framework.support.db.RowSetUtil;
import com.clt.framework.support.db.SQLExecuter;
import com.clt.framework.support.layer.integration.DBDAOSupport;
import com.clt.syscommon.common.table.ApInvDtrbVO;
import com.clt.syscommon.common.table.ComAproCsrDtlVO;
import com.clt.syscommon.common.table.ComAproRqstHdrVO;
import com.clt.syscommon.common.table.ComAproRqstRoutVO;

/**
 * ALPS ConsultationSlipRequestMgtDBDAO <br>
 * - ALPS-ConsultationSlipRequestMgt system Business Logic��泥섎━�섍린 �꾪븳 JDBC �묒뾽�섑뻾.<br>
 *
 * @author HAM DAE SUNG
 * @see ConsultationSlipRequestMgtBCImpl 李몄“
 * @since J2EE 1.6
 */
public class ConsultationSlipRequestMgtDBDAO extends DBDAOSupport {

	/**
	 * COM_CSR_0001 : 議고쉶踰꾪듉 <br>
	 * CSR Creation��由ъ뒪�몃� 議고쉶�⑸땲��
	 * @param ApPayInvListVO apPayInvListVO
	 * @return List<ApPayInvListVO>
	 * @exception DAOException
	 */
	public List<ApPayInvListVO> searchCsrList (ApPayInvListVO apPayInvListVO) throws DAOException {
		DBRowSet dbRowset = null;
		List<ApPayInvListVO> list = null;
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();

		try{
			if(apPayInvListVO != null){
				Map<String, String> mapVO = apPayInvListVO .getColumnValues();
				mapVO.put("inv_ofc_cd", 	apPayInvListVO.getInvOfcCd());
				mapVO.put("inv_cfm_dt", 	apPayInvListVO.getInvCfmDt());
				mapVO.put("vndr_seq",   	apPayInvListVO.getVndrSeq());
				mapVO.put("inv_sub_sys_cd", apPayInvListVO.getInvSubSysCd());

				param.putAll(mapVO);
				velParam.putAll(mapVO);
			}
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new ConsultationSlipRequestMgtDBDAOApPayInvListRSQL(), param, velParam);

			list = (List)RowSetUtil.rowSetToVOs(dbRowset, ApPayInvListVO.class);
		}catch(SQLException se){
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return list;
	}

	/**
	 * CSR_0001 : �붾㈃濡쒕뱶<br>
	 * CSR Creation�� A/P, ASA 泥댄겕<br>
	 * @param CheckAsaVO checkAsaVO
	 * @return List<CheckAsaVO>
	 * @exception DAOException
	 */
	 public List<CheckAsaVO> checkAsaOffice(CheckAsaVO checkAsaVO) throws DAOException {
		DBRowSet dbRowset = null;
		List<CheckAsaVO> list = null;

		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();
		try{
			Map<String, String> mapVO = new HashMap<String, String>();
			if(checkAsaVO.getAsaGubun().equals("O")){
				mapVO.put("inv_ofc_cd", checkAsaVO.getCostOfcCd());
			}else{
				mapVO.put("inv_ofc_cd", checkAsaVO.getInvOfcCd());
			}
			param.putAll(mapVO);
			velParam.putAll(mapVO);

			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new ConsultationSlipRequestMgtDBDAOCheckAsaRSQL(), param, velParam);
			list = (List)RowSetUtil.rowSetToVOs(dbRowset, CheckAsaVO .class);
		}catch(SQLException se){
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return list;
	}

	/**
	 * COM_CSR_0002 : 議고쉶踰꾪듉 <br>
	 * CSR Creation(Detail)��由ъ뒪�몃� 議고쉶�⑸땲��<br>
	 * @param CsrListInputVO csrListInputVO
	 * @return List<CsrListInputVO>
	 * @exception DAOException
	 */
	public List<CsrListInputVO> searchCSRSummaryDetail (CsrListInputVO csrListInputVO) throws DAOException {
		DBRowSet dbRowset = null;
		List<CsrListInputVO> list = null;
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();

		try{
			if(csrListInputVO != null){
				Map<String, String> mapVO = csrListInputVO .getColumnValues();
				mapVO.put("cost_ofc_cd", csrListInputVO.getCostOfcCd());
				mapVO.put("inv_ofc_cd",  csrListInputVO.getInvOfcCd());
				mapVO.put("vndr_seq", 	 csrListInputVO.getVndrSeq());
				mapVO.put("inv_sub_sys_cd", csrListInputVO.getInvSubSysCd());

				mapVO.put("inv_curr_cd", csrListInputVO.getInvCurrCd());
				mapVO.put("inv_sts_cd",  csrListInputVO.getInvStsCd());
				mapVO.put("inv_rjct_sts_cd", csrListInputVO.getInvRjctStsCd());
				mapVO.put("inv_cfm_dt",  csrListInputVO.getInvCfmDt());
				
				mapVO.put("pso_trns_slp_ctnt",  csrListInputVO.getPsoTrnsSlpCtnt());

				param.putAll(mapVO);
				velParam.putAll(mapVO);
			}
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new ConsultationSlipRequestMgtDBDAOCsrListInputRSQL(), param, velParam);

			list = (List)RowSetUtil.rowSetToVOs(dbRowset, CsrListInputVO.class);
		}catch(SQLException se){
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return list;
	}

	/**
	 * COM_CSR_0002 : 議고쉶踰꾪듉 <br>
	 * CSR Creation(Detail)��由ъ뒪�몃� 議고쉶�⑸땲��<br>
	 * @param String invOfcCd
	 * @return List<AsaNoVO>
	 * @exception DAOException
	 */
	 public List<AsaNoVO> searchAsaNoList(String invOfcCd) throws DAOException {
	 	DBRowSet dbRowset = null;
	 	List<AsaNoVO> list = null;
	 	// query parameter
	 	Map<String, Object> param = new HashMap<String, Object>();
	 	// velocity parameter
	 	Map<String, Object> velParam = new HashMap<String, Object>();

	 	try {
	 		 Map<String, String> mapVO = new HashMap<String, String>();
	 		 mapVO.put("inv_ofc_cd", invOfcCd);

	 		 param.putAll(mapVO);
	 		 velParam.putAll(mapVO);
	 		 dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate) new ConsultationSlipRequestMgtDBDAOAsaNoRSQL(),	param, velParam);
	 		 list = (List) RowSetUtil.rowSetToVOs(dbRowset, AsaNoVO.class);
	 	} catch (SQLException se) {
	 		log.error(se.getMessage(), se);
	 		throw new DAOException(new ErrorHandler(se).getMessage());
	 	} catch (Exception ex) {
	 		log.error(ex.getMessage(), ex);
	 		throw new DAOException(new ErrorHandler(ex).getMessage());
	 	}
	 	return list;
	 }

	/**
	 * COM_CSR_0004 : �붾㈃ 濡쒕뱶
	 * EviCode 肄ㅻ낫由ъ뒪��議고쉶
	 * @return List<TAXInfoVO>
	 * @throws DAOException
	 */
	 public List<TAXInfoVO> searchEviCodeList() throws DAOException {
	 	DBRowSet dbRowset = null;
	 	List<TAXInfoVO> list = null;
	 	// query parameter
	 	Map<String, Object> param = new HashMap<String, Object>();
	 	// velocity parameter
	 	Map<String, Object> velParam = new HashMap<String, Object>();

	 	try {
	 		 Map<String, String> mapVO = new HashMap<String, String>();
	 		 //mapVO.put("vndr_seq", vndrSeq);

	 		 param.putAll(mapVO);
	 		 velParam.putAll(mapVO);
	 		 dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate) new ConsultationSlipRequestMgtDBDAOEviCodeListRSQL(),	param, velParam);
	 		 list = (List) RowSetUtil.rowSetToVOs(dbRowset, TAXInfoVO.class);
	 	} catch (SQLException se) {
	 		log.error(se.getMessage(), se);
	 		throw new DAOException(new ErrorHandler(se).getMessage());
	 	} catch (Exception ex) {
	 		log.error(ex.getMessage(), ex);
	 		throw new DAOException(new ErrorHandler(ex).getMessage());
	 	}
	 	return list;
	 }

		/**
		 * COM_CSR_0004 : �붾㈃濡쒕뱶 �먮뒗 �ъ뾽�먮벑濡앸쾲��湲곗엯 <br>
		 * �ъ뾽�먮벑濡앸쾲�� Vendor Code, �곹샇, �낇깭, 二쇱냼, ��몴�먮챸 議고쉶
		 * @param String compNo
		 * @return List<TAXInfoVO>
		 * @exception DAOException
		 */
		 public List<TAXInfoVO> searchTAXInfo(String compNo) throws DAOException {
			DBRowSet dbRowset = null;
			List<TAXInfoVO> list = null;

			//query parameter
			Map<String, Object> param = new HashMap<String, Object>();
			//velocity parameter
			Map<String, Object> velParam = new HashMap<String, Object>();
			try{
				Map<String, String> mapVO = new HashMap<String, String>();
				mapVO.put("comp_no", compNo);

				param.putAll(mapVO);
				velParam.putAll(mapVO);

				dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new ConsultationSlipRequestMgtDBDAOTAXInfoRSQL(), param, velParam);
				list = (List)RowSetUtil.rowSetToVOs(dbRowset, TAXInfoVO .class);
			}catch(SQLException se){
				log.error(se.getMessage(),se);
				throw new DAOException(new ErrorHandler(se).getMessage());
			}catch(Exception ex){
				log.error(ex.getMessage(),ex);
				throw new DAOException(new ErrorHandler(ex).getMessage());
			}
			return list;
		}

		/**
		 * COM_CSR_0004 evid_no 梨꾨쾲諛륁���
		 * @param String taxNo1
		 * @param String taxNo2
		 * @return String
		 * @throws DAOException
		 */
		public String searchApEviNo(String taxNo1, String taxNo2) throws DAOException {
			DBRowSet dbRowset = null;
			String eviNo = "";
			//query parameter
			Map<String, Object> param = new HashMap<String, Object>();
			//velocity parameter
			Map<String, Object> velParam = new HashMap<String, Object>();

			try{
				Map<String, String> mapVO = new HashMap<String, String>();
				mapVO.put("tax_no1", taxNo1);
				mapVO.put("tax_no2", taxNo2);

				param.putAll(mapVO);
				velParam.putAll(mapVO);

				dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new ConsultationSlipRequestMgtDBDAOsearchApEviNoRSQL(), param, velParam);
				while(dbRowset.next()){
					eviNo = dbRowset.getString("tax_no3");
	            }
			}catch(SQLException se){
				log.error(se.getMessage(),se);
				throw new DAOException(new ErrorHandler(se).getMessage());
			}catch(Exception ex){
				log.error(ex.getMessage(),ex);
				throw new DAOException(new ErrorHandler(ex).getMessage());
			}
			return eviNo;
		}
		
		/**
		 * COM_CSR_0004 : �붾㈃濡쒕뱶 <br>
		 * �ъ뾽�먮벑濡앸쾲��議고쉶 
		 * @param TAXInfoVO tAXInfoVO
		 * @return String
		 * @exception DAOException
		 */
		public String searchCompNo(TAXInfoVO tAXInfoVO) throws DAOException {
			DBRowSet dbRowset = null;
			String compNo = "";
			//query parameter
			Map<String, Object> param = new HashMap<String, Object>();
			//velocity parameter
			Map<String, Object> velParam = new HashMap<String, Object>();

			try{
				Map<String, String> mapVO = new HashMap<String, String>();
				mapVO.put("vndr_seq", tAXInfoVO.getVndrSeq());

				param.putAll(mapVO);
				velParam.putAll(mapVO);

				dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new ConsultationSlipRequestMgtDBDAOSearchCompNoRSQL(), param, velParam);
				while(dbRowset.next()){
					compNo = dbRowset.getString("rgst_no");
	            }
			}catch(SQLException se){
				log.error(se.getMessage(),se);
				throw new DAOException(new ErrorHandler(se).getMessage());
			}catch(Exception ex){
				log.error(ex.getMessage(),ex);
				throw new DAOException(new ErrorHandler(ex).getMessage());
			}
			return compNo;
		}

		/**
		 * COM_CSR_0004, COM_CSR_0005 : addApEviNo<br>
		 * addApEviNo
		 * @param TAXInfoVO tAXInfoVO
		 * @throws DAOException
		 */
		public void addApEviNo (TAXInfoVO tAXInfoVO) throws DAOException {
			try {
				SQLExecuter sqlExe = new SQLExecuter("");

				if(tAXInfoVO != null){
					//query parameter
			        Map<String, String> param = tAXInfoVO.getColumnValues();
			        int result = sqlExe.executeUpdate((ISQLTemplate) new ConsultationSlipRequestMgtDBDAOAddApEviNoRSQL() , param, null);

					if(result == Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert SQL");
				}
			}catch(SQLException se){
				log.error(se.getMessage(),se);
				throw new DAOException(new ErrorHandler(se).getMessage());
			}catch(Exception ex){
				log.error(ex.getMessage(),ex);
				throw new DAOException(new ErrorHandler(ex).getMessage());
			}
		}

		/**
		 * COM_CSR_0004 : �꾨즺踰꾪듉 <br>
		 * �멸툑怨꾩궛��TAXCode 議고쉶 
		 * @param TAXInfoVO tAXInfoVO
		 * @return List<TAXInfoVO>
		 * @exception DAOException
		 */
		 public List<TAXInfoVO> searchTAXCode(TAXInfoVO tAXInfoVO) throws DAOException {
			DBRowSet dbRowset = null;
			List<TAXInfoVO> list = null;

			//query parameter
			Map<String, Object> param = new HashMap<String, Object>();
			//velocity parameter
			Map<String, Object> velParam = new HashMap<String, Object>();
			try{
				Map<String, String> mapVO = new HashMap<String, String>();
				
				if(tAXInfoVO != null){
					mapVO.put("tax_type", tAXInfoVO.getTaxType());
					mapVO.put("fa_flg", tAXInfoVO.getFaFlg());
					mapVO.put("tax_naid_flg", tAXInfoVO.getTaxNaidFlg());
					mapVO.put("tax_nsl_flg", tAXInfoVO.getTaxNslFlg());
				}

				param.putAll(mapVO);
				velParam.putAll(mapVO);

				dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new ConsultationSlipRequestMgtDBDAOTAXCodeRSQL(), param, velParam);
				list = (List)RowSetUtil.rowSetToVOs(dbRowset, TAXInfoVO .class);
			}catch(SQLException se){
				log.error(se.getMessage(),se);
				throw new DAOException(new ErrorHandler(se).getMessage());
			}catch(Exception ex){
				log.error(ex.getMessage(),ex);
				throw new DAOException(new ErrorHandler(ex).getMessage());
			}
			return list;
		}

		/**
		 * COM_CSR_0008 : 議고쉶踰꾪듉 <br>
		 * CSR I/F Inquiry ��由ъ뒪�몃� 議고쉶�⑸땲��<br>
		 * @param IfCsrListInputVO ifCsrListInputVO
		 * @return List<IfCsrListInputVO>
		 * @exception DAOException
		 */
		public List<IfCsrListInputVO> searchCsrIfList (IfCsrListInputVO ifCsrListInputVO) throws DAOException {
			DBRowSet dbRowset = null;
			List<IfCsrListInputVO> list = null;
			//query parameter
			Map<String, Object> param = new HashMap<String, Object>();
			//velocity parameter
			Map<String, Object> velParam = new HashMap<String, Object>();

			try{
				if(ifCsrListInputVO != null){
					Map<String, String> mapVO = ifCsrListInputVO .getColumnValues();
					String searchCsrNo = ifCsrListInputVO.getSearchCsrNo();
					String dtStatus = ifCsrListInputVO.getDtStatus();
					String fmEffDt = ifCsrListInputVO.getFmEffDt();
					String toEffDt = ifCsrListInputVO.getToEffDt();
					String ifStatus = ifCsrListInputVO.getIfStatus();
					String invSubSysCd = ifCsrListInputVO.getInvSubSysCd();
					String ifNo = ifCsrListInputVO.getIfNo();
					
					String srcCtnt = "";
					
					if(searchCsrNo == null) searchCsrNo="";
					if(dtStatus == null) dtStatus="";
					if(fmEffDt == null)	fmEffDt="";
					if(toEffDt == null)	toEffDt="";
					if(ifStatus == null) ifStatus="";
					if(ifNo == null) ifNo="CSR";					
										
					if(invSubSysCd.equals("MNR")){
						srcCtnt	=	"SO_M&R";
					}else if(invSubSysCd.equals("TLL")){
						srcCtnt	=	"EQ";
					}else if(invSubSysCd.equals("LSE")){
						srcCtnt	=	"SO_LEASE";
					}else if(invSubSysCd.equals("PSO")){
						srcCtnt	=	"SO_PORT";
					}else if(invSubSysCd.equals("CHS")){
						srcCtnt	=	"SO_CHASSIS";
					}else if(invSubSysCd.equals("MGS")){
						srcCtnt	=	"SO_MGSET";
					}else if(invSubSysCd.equals("CNI")){
						srcCtnt	=	"SO_CCC";
					}else if(invSubSysCd.equals("AGT")){
						srcCtnt	=	"COMMISSION";
					}
					mapVO.put("ofc_cd", ifCsrListInputVO.getOfcCd());
					mapVO.put("fm_eff_dt", fmEffDt);
					mapVO.put("to_eff_dt", toEffDt);
					mapVO.put("search_csr_no", searchCsrNo);
					mapVO.put("dt_status", dtStatus);
					mapVO.put("if_status", ifStatus);
					mapVO.put("src_ctnt",  srcCtnt);
					mapVO.put("if_no", ifNo);
					
					param.putAll(mapVO);
					velParam.putAll(mapVO);
				}
				dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new ConsultationSlipRequestMgtDBDAOIfCsrListInputVORSQL(), param, velParam);

				list = (List)RowSetUtil.rowSetToVOs(dbRowset, IfCsrListInputVO.class);
			}catch(SQLException se){
				log.error(se.getMessage(),se);
				throw new DAOException(new ErrorHandler(se).getMessage());
			}catch(Exception ex){
				log.error(ex.getMessage(),ex);
				throw new DAOException(new ErrorHandler(ex).getMessage());
			}
			return list;
		}

		 /*************************************************************************************************************************************************************
		  ***************************************************** !! Approval Request Before Step Start !!  *************************************************************
		  *************************************************************************************************************************************************************/
/**
 * COM_CSR_0002 : Approval Request 踰꾪듉 <br>
 * 5. R.VVD LEVEL CHECK 2009-09 異붽�
 * @param String csrNo
 * @exception DAOException
 */
public void searchApInvVVDChacke(String csrNo) throws DAOException {
	DBRowSet dbRowset = null;
	String output_text = null;
	Map<String, Object> mapVO = new HashMap<String, Object>();
	//query parameter
	Map<String, Object> param = new HashMap<String, Object>();
	//velocity parameter
	Map<String, Object> velParam = new HashMap<String, Object>();

	try{

		mapVO.put("csr_no", 		csrNo);

		param.putAll(mapVO);
		velParam.putAll(mapVO);

		dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new ConsultationSlipRequestMgtDBDAOSearchApInvVVDChackeRSQL(), param, velParam);
		
		if(dbRowset!=null && dbRowset.next()){
			output_text = dbRowset.getString("OUTPUT_TEXT");
			if (output_text !=null && output_text.length()>0){
				log.error("\n\n " + output_text + "\n\n");
				throw new DAOException((new ErrorHandler("CSR00025", new String[]{output_text}).getMessage()));
			}
		}
	}catch(SQLException se){
		log.error(se.getMessage(),se);
		throw new DAOException(new ErrorHandler(se).getMessage());
	}catch(Exception ex){
		log.error(ex.getMessage(),ex);
		throw new DAOException(new ErrorHandler(ex).getMessage());
	}
	return;
}

/**
 * ConsultationSlipRequestMgtDBDAOAutoRevVVDListRSQL 荑쇰━�섏젙 -> ��젣�뚯씠釉��곸슜 2009-09-28
 * @param Collection<PayInvVO> payInvVOs
 * @param CsrParmVO csrParmVO
 * @return DBRowSet[]
 * @throws DAOException
 */
public DBRowSet[] getAutoRevVVDList(Collection<PayInvVO> payInvVOs, CsrParmVO csrParmVO) throws DAOException {
	log.debug("\n\n DAO.getAutoRevVVDList -------------------------------\n");

	DBRowSet dRs = null;
	DBRowSet[] dRsArr = null; 
	int dRsCnt = 0;
	//String ap_ofc_cd = param_map!=null?(param_map.get("ap_ofc_cd")!=null?(String)param_map.get("ap_ofc_cd"):""):"";
	//log.debug("\n### ap_ofc_cd:"+ap_ofc_cd + "<<<<<");

	Map<String, Object> mapVO = new HashMap<String, Object>();
	//query parameter
	Map<String, Object> param = new HashMap<String, Object>();
	//velocity parameter
	Map<String, Object> velParam = new HashMap<String, Object>();

	try{
		dRsArr = new DBRowSet[payInvVOs.size()];
		Iterator itr = payInvVOs.iterator();
		PayInvVO model = null;

		while (itr.hasNext()) {
			model = (PayInvVO)itr.next();
    		if(!model.getIbflag().equals("")){
				mapVO.put("ap_ofc_cd", JSPUtil.getNull(csrParmVO.getApOfcCd() ));
				mapVO.put("inv_no",    JSPUtil.getNull(model.getInv_no	   () ));
				mapVO.put("vndr_seq",  JSPUtil.getNull(model.getVndr_seq   () ));
				
				param.putAll(mapVO);
				velParam.putAll(mapVO);
    		}

			dRs = new SQLExecuter("").executeQuery((ISQLTemplate)new ConsultationSlipRequestMgtDBDAOAutoRevVVDListRSQL(), param, velParam);

			dRsArr[dRsCnt] = dRs;
			dRsCnt++;
		}
	}catch(SQLException se){
		log.error(se.getMessage(),se);
		throw new DAOException(new ErrorHandler(se).getMessage());
	}catch(Exception ex){
		log.error(ex.getMessage(),ex);
		throw new DAOException(new ErrorHandler(ex).getMessage());
	}
	return dRsArr;
}

/**
 * COM_CSR_0002 : modifyAutoRevVVD<br>
 * modifyAutoRevVVD
 * @param List<AutoRevVVDListVO> autoRevVVDListVO
 * @throws DAOException
 */
public void modifyAutoRevVVD(List<AutoRevVVDListVO> autoRevVVDListVO) throws DAOException {
	log.debug("\n\n DAO.modifyAutoRevVVD -------------------------------\n");
	//velocity parameter
	Map<String, Object> velParam = new HashMap<String, Object>();
	try { 
		int updCnt[] = null;
		SQLExecuter sqlExe = new SQLExecuter(""); 
		 
		updCnt = sqlExe.executeBatch((ISQLTemplate)new ConsultationSlipRequestMgtDBDAOModifyAutoRevVVDUSQL(), autoRevVVDListVO, velParam);
		for(int j = 0; j < updCnt.length; j++){
			if(updCnt[j]== Statement.EXECUTE_FAILED)
				throw new DAOException("Fail to insert No1"+ j + " SQL");
		}
		
	} catch (SQLException se) {
		log.error(se.getMessage(),se);
		throw new DAOException(new ErrorHandler(se).getMessage());
	} catch (DAOException de) {
		log.error(de.getMessage(), de);
		throw de;
	} catch(Exception ex){
		log.error(ex.getMessage(),ex);
		throw new DAOException(new ErrorHandler(ex).getMessage());
	}
}

/**
 * COM_CSR_0002 : searchApInvDTRBIn<br>
 * 援�궡 searchApInvDTRBIn
 * @param Collection<PayInvVO> payInvVOs
 * @param CsrParmVO csrParmVO
 * @return DBRowSet[]
 * @throws DAOException
 */
public DBRowSet[] searchApInvDTRBIn(Collection<PayInvVO> payInvVOs, CsrParmVO csrParmVO) throws DAOException {
	log.debug("\n\n DAO.searchApInvDTRBIn -------------------------------\n");

	DBRowSet dRs = null;
	DBRowSet[] dRsArr = null;
	int dRsCnt = 0;
	String vndr_seq			= csrParmVO.getVndrSeq();
	String ofc_cd			= csrParmVO.getInvOfcCd();
	int line_seq = 1;
	log.debug("\n### vndr_seq:"+vndr_seq + ",  ofc_cd :" +ofc_cd+ "<<<<<");

	Map<String, Object> mapVO = new HashMap<String, Object>();
	//query parameter
	Map<String, Object> param = new HashMap<String, Object>();
	//velocity parameter
	Map<String, Object> velParam = new HashMap<String, Object>();

	try{
		dRsArr = new DBRowSet[payInvVOs.size()];
		Iterator itr = payInvVOs.iterator();
		PayInvVO model = null;

		while (itr.hasNext()) {
			model = (PayInvVO)itr.next();
    		if(!model.getIbflag().equals("")){
				//mapVO.put("vndr_seq",  JSPUtil.getNull(vndr_seq ));
				mapVO.put("ofc_cd",    JSPUtil.getNull(ofc_cd ));
				mapVO.put("line_seq",  String.valueOf(line_seq));
				mapVO.put("inv_tax_cd","");

				mapVO.put("inv_no",    JSPUtil.getNull(model.getInv_no	 () ));
				mapVO.put("vndr_seq",  JSPUtil.getNull(model.getVndr_seq () ));
				mapVO.put("cre_usr_id",JSPUtil.getNull(model.getCre_usr_id()));

				param.putAll(mapVO);
				velParam.putAll(mapVO);
				//2009-11-23 荑쇰━ �섏젙
				dRs = new SQLExecuter("").executeQuery((ISQLTemplate)new ConsultationSlipRequestMgtDBDAOApInvDTRBInRSQL(), param, velParam);
    			
				dRsArr[dRsCnt] = dRs;
				dRsCnt++;
    		}
    		line_seq++;

		}
	}catch(SQLException se){
		log.error(se.getMessage(),se);
		throw new DAOException(new ErrorHandler(se).getMessage());
	}catch(Exception ex){
		log.error(ex.getMessage(),ex);
		throw new DAOException(new ErrorHandler(ex).getMessage());
	}
	return dRsArr;
}
 
/**
 * COM_CSR_0002 : searchApInvDTRBIn<br>
 * 援�쇅 searchApInvDTRBIn
 * @param Collection<PayInvVO> payInvVOs
 * @param CsrParmVO csrParmVO
 * @return DBRowSet[]
 * @throws DAOException
 */
public DBRowSet[] searchApInvDTRBOut(Collection<PayInvVO> payInvVOs, CsrParmVO csrParmVO) throws DAOException {
	log.debug("\n\n DAO.searchApInvDTRBOut -------------------------------\n");

	DBRowSet dRs = null;
	DBRowSet[] dRsArr = null;
	int dRsCnt = 0;
	int line_seq = 1;
	String cnt_cd			= csrParmVO.getCntCd();
	String vndr_seq			= csrParmVO.getVndrSeq();
	String evi_gb			= csrParmVO.getEviGb();
	String ofc_cd			= csrParmVO.getOfcCd();
	String evi_tax_code		= csrParmVO.getEviTaxCode();
	log.debug("\n### vndr_seq:"+vndr_seq + ",  ofc_cd :" +ofc_cd+ ",  cnt_cd :" +cnt_cd+ ",  evi_gb :" +evi_gb+ ",  evi_tax_code :" +evi_tax_code+ "<<<<<");

	Map<String, Object> mapVO = new HashMap<String, Object>();
	//query parameter
	Map<String, Object> param = new HashMap<String, Object>();
	//velocity parameter
	Map<String, Object> velParam = new HashMap<String, Object>();

	try{
		dRsArr = new DBRowSet[payInvVOs.size()];
		Iterator itr = payInvVOs.iterator();
		PayInvVO model = null;

		while (itr.hasNext()) {
			model = (PayInvVO)itr.next();
    		if(!model.getIbflag().equals("")){
				mapVO.put("ofc_cd",    JSPUtil.getNull(ofc_cd ));				//ofc_cd
				mapVO.put("line_seq",  String.valueOf(line_seq));				//line_seq
				mapVO.put("cre_usr_id",JSPUtil.getNull(model.getCre_usr_id()));	//cre_usr_id
				mapVO.put("inv_no",    JSPUtil.getNull(model.getInv_no	 () ));	//inv_no
				mapVO.put("vndr_seq",  JSPUtil.getNull(vndr_seq ));				//vndr_seq

				//2014.11.12 Delete KR, KRW hard-coding logic, TAX logic change by IY Cho

				param.putAll(mapVO);
				velParam.putAll(mapVO);
    		}
			dRs = new SQLExecuter("").executeQuery((ISQLTemplate)new ConsultationSlipRequestMgtDBDAOApInvDTRBOutRSQL(), param, velParam);

			dRsArr[dRsCnt] = dRs;
			dRsCnt++;
			
			line_seq++;
		}
	}catch(SQLException se){
		log.error(se.getMessage(),se);
		throw new DAOException(new ErrorHandler(se).getMessage());
	}catch(Exception ex){
		log.error(ex.getMessage(),ex);
		throw new DAOException(new ErrorHandler(ex).getMessage());
	}

	return dRsArr;
}

		 /*************************************************************************************************************************************************************
		  ****************************************************** !! Approval Request Before Step End !!  **************************************************************
		  *************************************************************************************************************************************************************/


		 /*************************************************************************************************************************************************************
		  *********************************************************	!! Approval Request Step Start !!  ****************************************************************
		  *************************************************************************************************************************************************************/

/**
 * COM_CSR_0002 : Approval Request 踰꾪듉 <br>
 * 媛��곗씠��CHECK  ���녿뒗 寃쎌슦 Exception 諛쒖깮 �쒖폒  �붿씠��吏꾪뻾�쒗궎吏��딆쓬 - mdm_organization
 * @param CsrParmVO csrParmVO
 * @return CSRSOhdrVO
 * @exception DAOException
 */
public CSRSOhdrVO searchApInvChacke1(CsrParmVO csrParmVO) throws DAOException {
	DBRowSet dbRowset = null;
	List<CSRSOhdrVO> list = null;
	CSRSOhdrVO rtnVO = null;

	String ofc_cd 		= csrParmVO.getCostOfcCd();

	Map<String, Object> mapVO = new HashMap<String, Object>();
	//query parameter
	Map<String, Object> param = new HashMap<String, Object>();
	//velocity parameter
	Map<String, Object> velParam = new HashMap<String, Object>();

	try{
		mapVO.put("ofc_cd", 		ofc_cd);

		param.putAll(mapVO);
		velParam.putAll(mapVO);

		dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new ConsultationSlipRequestMgtDBDAOsearchApInvChacke1RSQL(), param, velParam);

		list = (List)RowSetUtil.rowSetToVOs(dbRowset, CSRSOhdrVO.class);

		if(list.size() > 0){	//csr_no 踰덊샇�곗삤湲�
			rtnVO = (CSRSOhdrVO)list.get(0);
		}
	}catch(SQLException se){
		log.error(se.getMessage(),se);
		throw new DAOException(new ErrorHandler(se).getMessage());
	}catch(Exception ex){
		log.error(ex.getMessage(),ex);
		throw new DAOException(new ErrorHandler(ex).getMessage());
	}

	return rtnVO;
}
 
/**
 * COM_CSR_0002 : Approval Request 踰꾪듉 <br>
 * ACCT_CD(鍮꾩슜肄붾뱶)
 * @param Collection<PayInvVO> payInvVOs
 * @exception DAOException
 */ 
public void searchApInvChacke2(Collection<PayInvVO> payInvVOs) throws DAOException {
	DBRowSet dRs = null;
	List<CSRSOhdrVO> list = null;
	CSRSOhdrVO rtnVO = null;
	int i = 0;
	int acctCdCount = 0;

	Map<String, Object> mapVO = new HashMap<String, Object>();
	//query parameter
	Map<String, Object> param = new HashMap<String, Object>();
	//velocity parameter
	Map<String, Object> velParam = new HashMap<String, Object>();

	try{
		Iterator itr = payInvVOs.iterator();
		PayInvVO model = null;

		while (itr.hasNext()) {
			model = (PayInvVO)itr.next();
    		if(!model.getIbflag().equals("")){
				mapVO.put("inv_no",    JSPUtil.getNull(model.getInv_no	 () ));
				mapVO.put("vndr_seq",  JSPUtil.getNull(model.getVndr_seq () ));

				param.putAll(mapVO);
				velParam.putAll(mapVO);
    		}

			dRs = new SQLExecuter("").executeQuery((ISQLTemplate)new ConsultationSlipRequestMgtDBDAOsearchApInvChacke2RSQL(), param, velParam);
			list = (List)RowSetUtil.rowSetToVOs(dRs, CSRSOhdrVO.class);

			rtnVO = (CSRSOhdrVO)list.get(0);
			acctCdCount = Integer.parseInt(rtnVO.getCount())+acctCdCount;
			i++;
		}

		if( acctCdCount > 0 ){
			throw new DAOException(new ErrorHandler("CSR00024").getMessage());
		}
	}catch(SQLException se){
		log.error(se.getMessage(),se);
		throw new DAOException(new ErrorHandler(se).getMessage());
	}catch(Exception ex){
		log.error(ex.getMessage(),ex);
		throw new DAOException(new ErrorHandler(ex).getMessage());
	}

	return;
}

/**
 * COM_CSR_0002 : Approval Request 踰꾪듉 <br>
 * csr_no �앹꽦: csrNo 梨꾨쾲��ap_csr_no �뚯씠釉붿뿉 insert / >>>>>>>臾쇰쪟���λ퉬 �먭컻��援щ텇�쇰줈 CSR_NO 梨꾨쾲 [SM]
 * @param String ofcCd
 * @param String csrTpCd
 * @param String invSubSysCd
 * @return String
 * @exception DAOException
 */
public String multiCSRNo(String ofcCd, String csrTpCd, String invSubSysCd) throws DAOException {
	DBRowSet dbRowset = null;
	String csrNo = "";
	Map<String, Object> mapVO = new HashMap<String, Object>();
	//query parameter
	Map<String, Object> param = new HashMap<String, Object>();
	//velocity parameter
	Map<String, Object> velParam = new HashMap<String, Object>();

	try{
		//mapVO.put("bigo",  JSPUtil.getNull(bigo));
		mapVO.put("csr_tp_cd", 		csrTpCd);
		mapVO.put("ofc_cd", 		ofcCd);
		mapVO.put("inv_sub_sys_cd", 		invSubSysCd);

		param.putAll(mapVO);
		velParam.putAll(mapVO);

		dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new ConsultationSlipRequestMgtDBDAOMultiCSRNoRSQL(), param, velParam);
		
		if(dbRowset!=null && dbRowset.next()){
			csrNo = dbRowset.getString("csr_no");
		}
	}catch(SQLException se){
		log.error(se.getMessage(),se);
		throw new DAOException(new ErrorHandler(se).getMessage());
	}catch(Exception ex){
		log.error(ex.getMessage(),ex);
		throw new DAOException(new ErrorHandler(ex).getMessage());
	}
	return csrNo;
}

/** multiCSRInsert CSR嫄대뱾���ㅼ쨷�쇰줈 �ｋ뒗��
 * @param ofcCd
 * @param csrNo
 * @param creUsrId
 * @throws DAOException
 */
public void multiCSRInsert(String ofcCd, String csrNo, String creUsrId) throws DAOException {
	log.debug("start multiCSRInsert ============================");
	Map<String, Object> mapVO = new HashMap<String, Object>();
	//query parameter
	Map<String, Object> param 		= new HashMap<String, Object>();
	//velocity parameter
	Map<String, Object> velParam 	= new HashMap<String, Object>();
	try {
		mapVO.put("ofc_cd", ofcCd);
		mapVO.put("csr_no", csrNo);
		mapVO.put("cre_usr_id", creUsrId);
		
		param.putAll(mapVO);
		velParam.putAll(mapVO);
		
		new SQLExecuter("").executeUpdate((ISQLTemplate)new ConsultationSlipRequestMgtDBDAOMultiCSRNoCSQL(), param, velParam);

	} catch (SQLException se) {
		log.error(se.getMessage(), se);
		throw new DAOException(new ErrorHandler(se).getMessage());
	} catch (DAOException de) {
		log.error(de.getMessage(), de);
		throw de;
	} catch (Exception e) {
		log.error(e.getMessage(), e);
		throw new DAOException(e.getMessage());
	}
}

/**
 * COM_CSR_0002 : Approval Request 踰꾪듉 <br>
 * AP HDR 諛�DTRB INSERT
 * @param CsrParmVO csrParmVO
 * @param String creUsrId
 * @exception DAOException
 */
public void createApInvHDR(CsrParmVO csrParmVO, String creUsrId) throws DAOException {
	//TLL - PL PO GL GO
	String ttlLssDivCd   	= csrParmVO.getTtlLssDivCd(); 
	String invRgstNo   		= csrParmVO.getInvRgstNo(); 
	
	int result = 0;

	String csr_no			= csrParmVO.getCsrNo(); 
//	String coa_acct_cd 		= "210111";		//coa_acct_cd 
	String invSubSysCd   	= csrParmVO.getInvSubSysCd();	//紐⑤뱢
//	if(invSubSysCd.equals("CNI")){
//		coa_acct_cd = "210121";
//	}
	String csr_amt			= csrParmVO.getCsrAmt();
	if(ttlLssDivCd.equals("PO") || ttlLssDivCd.equals("GO")){	//�≪옣湲덉븸(怨듦툒���몄븸)��0�쇰줈 �뗮똿
		csr_amt = "0";
	}
	String asanogb			= csrParmVO.getAsanogb();     // A/P�대㈃ 援�궡 ASA or null �대㈃ �댁쇅
	String ofc_cd 			= csrParmVO.getOfcCd();
	String cost_ofc_cd 		= csrParmVO.getCostOfcCd();
	String ap_ofc_cd 		= csrParmVO.getApOfcCd();
	String usr_eml	 		= csrParmVO.getUsrEml();
	String usr_nm	 		= csrParmVO.getUsrNm();
	String vndr_seq			= csrParmVO.getVndrSeq();
	String curr_cd 			= csrParmVO.getCurrCd();
	String cnt_cd 			= csrParmVO.getCntCd();
//	String gen_pay_term_cd 	= csrParmVO.getGenPayTermCd();
	String asa_no			= csrParmVO.getAsaNoS();
	String evi_gb			= csrParmVO.getEviGb();
	String csr_tp_cd		= csrParmVO.getCsrTpCd();
	//2009-11-23
	String pso_trns_slp_ctnt= csrParmVO.getPsoTrnsSlpCtnt();
	
	String ppay_aply_flg = "";              		//ppay_aply_flg
	String inv_dt		 = "";
	
	//寃곗젣���깅챸 
	String  aproSeqKey  	= JSPUtil.getNull(String.valueOf(csrParmVO.getAproseqkey()));
	
	if(csr_tp_cd.equals("S")){
		csr_tp_cd = "STANDARD";
	}else if(csr_tp_cd.equals("C")){
		csr_tp_cd = "CREDIT";
	}else if(csr_tp_cd.equals("P")){
		csr_tp_cd = "PREPAYMENT";
		ppay_aply_flg = "Y";              		   //ppay_aply_flg
	}
	
	String max_iss_dt		= csrParmVO.getMaxIssDt();
	String max_rcv_dt		= csrParmVO.getMaxRcvDt();

	String payment_due_dt	= csrParmVO.getPaymentDueDt();
	log.debug("\n\n ### payment_due_dt:"+payment_due_dt+" ###################################################### \n\n");

	String cre_usr_id		= creUsrId;
	String evi_inv_dt		= csrParmVO.getEviInvDt();
	if(!evi_inv_dt.equals("")){
		evi_inv_dt = evi_inv_dt.replaceAll("-","/");
	}
	String s_evi_inv_dt		= csrParmVO.getSEviInvDt();
	if(!s_evi_inv_dt.equals("")){
		s_evi_inv_dt = s_evi_inv_dt.replaceAll("-","/");
	}
	 //evi_inv_dt -> gl_dt �명똿
	//2014.11.12 Delete KR, KRW hard-coding logic, TAX logic change by IY Cho
	evi_inv_dt = max_iss_dt.replaceAll("-","/");	//gl_dt  

	String evi_total_net_amt= csrParmVO.getEviTotalNetAmt();
	String evi_tax_no2		= csrParmVO.getEviTaxNo2();
	String evi_total_tax_amt= csrParmVO.getEviTotalTaxAmt();
	String evi_ctnt1		= csrParmVO.getEviCtnt1();
	String evi_ctnt2		= csrParmVO.getEviCtnt2();
	String evi_ctnt3		= csrParmVO.getEviCtnt3();
	String evi_ctnt4		= csrParmVO.getEviCtnt4();
	String evi_ctnt5		= csrParmVO.getEviCtnt5();
	String evi_ctnt6		= csrParmVO.getEviCtnt6();
	String evi_ctnt7		= csrParmVO.getEviCtnt7();
	String evi_ctnt8		= csrParmVO.getEviCtnt8();
	String evi_ctnt9		= csrParmVO.getEviCtnt9();
	String evi_ctnt10		= csrParmVO.getEviCtnt10();
	String evi_ctnt11		= csrParmVO.getEviCtnt11();
	String evi_ctnt12		= csrParmVO.getEviCtnt12();
	String evi_tax_no		= csrParmVO.getEviTaxNo();
	String pay_group_cd		= csrParmVO.getPayGroupCd();
	//�꾩옄/醫낆씠怨꾩궛��
	String attr_ctnt8       = csrParmVO.getAttrCtnt8();
	
	String pay_amt = "";
	String pay_dt ="";
	String csr_curr_cd = curr_cd;
	String vndr_term_nm =  JSPUtil.getNull(csrParmVO.getGenPayTermDesc()); //gen_pay_term_cd;

	String attr_ctnt1 = aproSeqKey;
	String attr_ctnt2 = "";
	String attr_ctnt3 = "";
	
	//2014.11.12 Delete KR, KRW hard-coding logic, TAX logic change by IY Cho
	if(!asa_no.equals("")){
		attr_ctnt2 = asa_no;               	  	//attr_ctnt2
	}
	
	String attr_ctnt4 = evi_total_net_amt;
	String attr_ctnt5 = evi_tax_no2;	//WORKPLACE
	String attr_ctnt6 = evi_total_tax_amt;
	String attr_ctnt7 = "";
	//String attr_ctnt8 = "";
	String attr_ctnt9 = "";
	String attr_ctnt10 = usr_nm;
	String attr_ctnt11 = "";
	String attr_ctnt12 = "";
	String attr_ctnt13 = "";
	String attr_ctnt14 = "";
	String attr_ctnt15 = "";

	String attr_cate_nm = "";
	//2014.11.12 Delete KR, KRW hard-coding logic, TAX logic change by IY Cho
	attr_cate_nm = "Invoices";              //attr_cate_nm
	attr_ctnt8 = csrParmVO.getRcvDt().replaceAll("-", "")+"000000";

	String evi_ctnt13 = evi_tax_no;
	String evi_ctnt14 = "";
	String evi_ctnt15 = "";
	String evi_ctnt16 = "";
	String evi_ctnt17 = "";
	String evi_ctnt18 = "";
	
	/*
	 *SRC_CTNT
	'MNR' => 'SO_M&R'
	'LSE' => 'SO_LEASE'
	'PSO' => 'SO_PORT'
	'CHS' => 'SO_CHASSIS'
	 */
	String srcCtnt = "";
	if(invSubSysCd.equals("MNR")){
		srcCtnt	=	"SO_M&R";
	}else if(invSubSysCd.equals("TLL")){
		srcCtnt	=	"EQ";
	}else if(invSubSysCd.equals("LSE")){
		srcCtnt	=	"SO_LEASE";
	}else if(invSubSysCd.equals("PSO")){
		srcCtnt	=	"SO_PORT";
	}else if(invSubSysCd.equals("CHS")){
		srcCtnt	=	"SO_CHASSIS";
	}else if(invSubSysCd.equals("MGS")){
		srcCtnt	=	"SO_MGSET";
	}else if(invSubSysCd.equals("CNI")){
		srcCtnt	=	"SO_CCC";
	}else if(invSubSysCd.equals("AGT")){
		srcCtnt	=	"COMMISSION";
	}
	
	String pay_mzd_lu_cd = "";
	String pay_grp_lu_cd = "";
	
	log.debug("@@@ cnt_cd:"+cnt_cd+" - asa_no:"+asa_no+" - pay_group_cd:"+pay_group_cd+" - csr_amt:"+csr_amt);
	
	//2009-11-26 ap_ctr_cd ���곕씪 ��궡 ��쇅 援щ텇 �섏젙 -> 2010-05-17 1: ��쇅, 2: ��궡 �뗮똿�섏뿬 援�궡媛��꾨땶寃쎌슦(利� ��쇅媛��꾨땶寃쎌슦) pay_grp_lu_cd ���묐��щ� 遺숈씠吏��딅뒗��
//	String ap_ctr_cd_io = srchPayGrpLuCd(cost_ofc_cd);
	//pay_grp_lu_cd = ap_ctr_cd_gbn;	//��궡吏�텋, ��쇅吏�텋 �좏삎 �뗮똿
//	if(curr_cd.equals("JPY")){
//		pay_grp_lu_cd = "EXTERNAL PAYMENT";
//	}else{
//		pay_grp_lu_cd = "INTERNAL PAYMENT";
//	}
//	
//	if(pay_grp_lu_cd.equals("EXTERNAL PAYMENT")){
//		//2009-11-24 PSO �ъ옄鍮꾨낫�꾧�����퉬 濡쒖쭅 異붽� 
//		if(pso_trns_slp_ctnt.equals("AR")){
//			pay_grp_lu_cd = "INTERNAL PAYMENT";
//		}
//	}else{
		if(csr_amt.equals("0") || asanogb.equals("ASA")){
			pay_grp_lu_cd = ap_ofc_cd+"_ZERO PAYMENT"; 						//pay_grp_lu_cd
		}else{
//			if(!ap_ctr_cd_io.equals("1")){
//				//  2009-01-01 �댄썑 : XMNBB 議곗쭅蹂�꼍�쇰줈 �명빐 XMNBB�����댁긽 PAY_GROUP���좏깮�섏� �딄퀬 �쇰컲�곸씤 �ㅻⅨ OFFICE���숈씪�섍쾶 泥섎━�쒕떎. 
//				if (pay_group_cd!=null && pay_group_cd.trim().equals("RHQ") && ap_ofc_cd!=null && (ap_ofc_cd.trim().equals("SZPBB")||ap_ofc_cd.trim().equals("CANBS")||ap_ofc_cd.trim().equals("XMNBB"))){
//					pay_grp_lu_cd = ap_ofc_cd+"_RHQ_PYMT"; 						//pay_grp_lu_cd
//				} else {
					pay_grp_lu_cd = ap_ofc_cd+"_O/EXP";                   	    //pay_grp_lu_cd
				}
//			}
//		}
//	}
	
	//2009-12-07 PSO Canal = AA, �꾨룄湲�= GO
//	if(pso_trns_slp_ctnt.equals("GO")){
//		pay_grp_lu_cd = "INTERNAL PAYMENT";
//	}
//	
//	//TOTAL LOSS �꾩슜 
//	if(ttlLssDivCd.equals("PO") || ttlLssDivCd.equals("GO") || ttlLssDivCd.equals("PL") || ttlLssDivCd.equals("GL")){ 
//		//pay_mzd_lu_cd = "WIRE";
//		pay_grp_lu_cd = "EXTERNAL PAYMENT";
//	}
	
	String coa_co_cd = "01";                  		//coa_co_cd
	String coa_rgn_cd = cost_ofc_cd;                //coa_rgn_cd
	String coa_ctr_cd = cost_ofc_cd;                //coa_ctr_cd
	//log.debug("\n cost_ofc_cd:"+cost_ofc_cd+" \n");
	
	//coa_acct_cd = "210111";					//coa_acct_cd 
	/*if(pso_trns_slp_ctnt.equals("GO")){  
		coa_acct_cd = "210121";
	}*/

	String coa_vvd_cd = "0000000000";               //coa_vvd_cd
	String coa_inter_co_cd = vndr_seq;            	//coa_inter_co_cd
	String coa_ftu_n1st_cd = "000000";            	//coa_ftu_n1st_cd
	String coa_ftu_n2nd_cd = "000000";            	//coa_ftu_n2nd_cd
	String ppd_no = "";                     		//ppd_no
	String ppd_dtrb_no = "";                		//ppd_dtrb_no
	String ppd_aply_amt = "";               		//ppd_aply_amt
	String ppd_gl_dt = "";                  		//ppd_gl_dt
	String apro_flg = "N";                   		//apro_flg
	String tax_decl_flg = "";               		//tax_decl_flg
	String err_csr_no = "";                 		//err_csr_no
	String if_flg = "";                     		//if_flg
	String if_dt = "";                      		//if_dt
	String if_err_rsn = "";                 		//if_err_rsn
	String tj_ofc_cd = ap_ofc_cd;                  	//tj_ofc_cd
	String act_xch_rt = "";                 		//act_xch_rt
	String imp_err_flg = "";                		//imp_err_flg
	String rcv_err_flg = "";                		//rcv_err_flg
	String tax_curr_xch_flg = "";           		//tax_curr_xch_flg
	String imp_err_rsn = "";                		//imp_err_rsn
	String rcv_err_rsn = "";                		//rcv_err_rsn
	String ftu_use_ctnt1 = "";              		//ftu_use_ctnt1
	String ftu_use_ctnt2 = "";              		//ftu_use_ctnt2
	String ftu_use_ctnt3 = "";              		//ftu_use_ctnt3
	String ftu_use_ctnt4 = "";              		//ftu_use_ctnt4
	String ftu_use_ctnt5 = "";              		//ftu_use_ctnt5

	if(evi_gb.equals("1") || evi_gb.equals("2")){
		tax_decl_flg = "Y";
	}
	
	//2014.11.12 Delete KR, KRW hard-coding logic, TAX logic change by IY Cho
	inv_dt = max_iss_dt;
	
	//query parameter
	Map<String, Object> param = new HashMap<String, Object>();
	//velocity parameter
	Map<String, Object> velParam = new HashMap<String, Object>();
	//mapVO
	Map<String, Object> mapVO = new HashMap<String, Object>();

	try { 
		mapVO.put("csr_no",   		csr_no			 );
		mapVO.put("csr_tp_cd",   	csr_tp_cd        );
		mapVO.put("max_iss_dt",   	max_iss_dt       );
		mapVO.put("max_rcv_dt",   	max_rcv_dt       );
		mapVO.put("evi_inv_dt",   	evi_inv_dt       );
		mapVO.put("inv_dt",   		inv_dt       );
		mapVO.put("ap_ofc_cd",   	ap_ofc_cd        );
		mapVO.put("vndr_seq",   	vndr_seq         );
		mapVO.put("csr_amt",   		csr_amt          );
		mapVO.put("pay_amt",   		pay_amt          );
		mapVO.put("pay_dt",   		pay_dt           );
		mapVO.put("csr_curr_cd",  	csr_curr_cd      );
		mapVO.put("vndr_term_nm", 	vndr_term_nm     );
		mapVO.put("payment_due_dt", payment_due_dt   );
		mapVO.put("attr_cate_nm", 	attr_cate_nm     );
		mapVO.put("attr_ctnt1",   	attr_ctnt1       );
		mapVO.put("attr_ctnt2",   	attr_ctnt2       );
		mapVO.put("attr_ctnt3",   	attr_ctnt3       );
		mapVO.put("attr_ctnt4",   	attr_ctnt4       );
		mapVO.put("attr_ctnt5",   	attr_ctnt5       );
		mapVO.put("attr_ctnt6",   	attr_ctnt6       );
		mapVO.put("attr_ctnt7",   	attr_ctnt7       );
		mapVO.put("attr_ctnt8",   	attr_ctnt8       );
		mapVO.put("attr_ctnt9",   	attr_ctnt9       );
		mapVO.put("attr_ctnt10",  	attr_ctnt10      );
		mapVO.put("attr_ctnt11",  	attr_ctnt11      );
		mapVO.put("attr_ctnt12",  	attr_ctnt12      );
		mapVO.put("attr_ctnt13",  	attr_ctnt13      );
		mapVO.put("attr_ctnt14",  	attr_ctnt14      );
		mapVO.put("attr_ctnt15",  	attr_ctnt15      );
		mapVO.put("evi_ctnt1",   	evi_ctnt1        );
		mapVO.put("evi_ctnt2",   	evi_ctnt2        );
		mapVO.put("evi_ctnt3",   	evi_ctnt3        );
		mapVO.put("evi_ctnt4",   	evi_ctnt4        );
		mapVO.put("evi_ctnt5",   	evi_ctnt5        );
		mapVO.put("evi_ctnt6",   	evi_ctnt6        );
		mapVO.put("evi_ctnt7",   	evi_ctnt7        );
		mapVO.put("evi_ctnt8",   	evi_ctnt8        );
		mapVO.put("evi_ctnt9",   	evi_ctnt9        );
		mapVO.put("evi_ctnt10",   	evi_ctnt10       );
		mapVO.put("evi_ctnt11",   	evi_ctnt11       );
		mapVO.put("evi_ctnt12",   	evi_ctnt12       );
		mapVO.put("evi_ctnt13",   	evi_ctnt13       );
		mapVO.put("evi_ctnt14",   	evi_ctnt14       );
		mapVO.put("evi_ctnt15",   	evi_ctnt15       );
		mapVO.put("evi_ctnt16",   	evi_ctnt16       );
		mapVO.put("evi_ctnt17",   	evi_ctnt17       );
		mapVO.put("evi_ctnt18",   	evi_ctnt18       );
		mapVO.put("src_ctnt",   	srcCtnt         );
		mapVO.put("pay_mzd_lu_cd",  pay_mzd_lu_cd    );
		mapVO.put("pay_grp_lu_cd",  pay_grp_lu_cd    );
		mapVO.put("coa_co_cd",   	coa_co_cd        );
		mapVO.put("cost_ofc_cd",  	cost_ofc_cd      );
//		mapVO.put("coa_acct_cd",  	coa_acct_cd      );
		mapVO.put("coa_vvd_cd",   	coa_vvd_cd       );
		mapVO.put("coa_ftu_n1st_cd",coa_ftu_n1st_cd  );
		mapVO.put("coa_ftu_n2nd_cd",coa_ftu_n2nd_cd  );
		mapVO.put("ppd_no",   		ppd_no           );
		mapVO.put("ppd_dtrb_no",  	ppd_dtrb_no      );
		mapVO.put("ppd_aply_amt", 	ppd_aply_amt     );
		mapVO.put("ppd_gl_dt",   	ppd_gl_dt        );
		mapVO.put("apro_flg",   	apro_flg         );
		mapVO.put("tax_decl_flg", 	tax_decl_flg     );
		mapVO.put("err_csr_no",   	err_csr_no       );
		mapVO.put("if_flg",   		if_flg           );
		mapVO.put("if_dt",   		if_dt            );
		mapVO.put("if_err_rsn",   	if_err_rsn       );
		mapVO.put("ppay_aply_flg",	ppay_aply_flg    );
		mapVO.put("act_xch_rt",  	act_xch_rt       );
		mapVO.put("imp_err_flg",  	imp_err_flg      );
		mapVO.put("rcv_err_flg",  	rcv_err_flg      );
		mapVO.put("tax_curr_xch_flg",   tax_curr_xch_flg );
		mapVO.put("usr_eml",   		usr_eml          );
		mapVO.put("imp_err_rsn",  	imp_err_rsn      );
		mapVO.put("rcv_err_rsn",  	rcv_err_rsn      );
		mapVO.put("ftu_use_ctnt1",  ftu_use_ctnt1    );
		mapVO.put("ftu_use_ctnt2",  ftu_use_ctnt2    );
		mapVO.put("ftu_use_ctnt3",  ftu_use_ctnt3    );
		mapVO.put("ftu_use_ctnt4",  ftu_use_ctnt4    );
		mapVO.put("ftu_use_ctnt5",  ftu_use_ctnt5    );
		mapVO.put("ofc_cd",   		ofc_cd           );
		mapVO.put("cre_usr_id",   	cre_usr_id       );

		mapVO.put("coa_rgn_cd", 	coa_rgn_cd);
		mapVO.put("coa_ctr_cd", 	coa_ctr_cd);
		mapVO.put("coa_inter_co_cd",coa_inter_co_cd);
		mapVO.put("tj_ofc_cd", 		tj_ofc_cd);
		
		//異붽� 09-30
		mapVO.put("ttl_lss_div_cd", ttlLssDivCd);
		mapVO.put("inv_rgst_no", invRgstNo);
		mapVO.put("pso_trns_slp_ctnt", pso_trns_slp_ctnt);

	    param.putAll(mapVO);
		velParam.putAll(mapVO);

		SQLExecuter sqlExe = new SQLExecuter(""); 
		result = sqlExe.executeUpdate((ISQLTemplate)new ConsultationSlipRequestMgtDBDAOCreateApInvHDRCSQL(), param, velParam);
		if(result == Statement.EXECUTE_FAILED)
				throw new DAOException("Fail to insert SQL");
		
	} catch (SQLException se) {
		log.error(se.getMessage(),se);
		throw new DAOException(new ErrorHandler(se).getMessage());
	}catch(Exception ex){
		log.error(ex.getMessage(),ex);
		throw new DAOException(new ErrorHandler(ex).getMessage());
	}

}

/**
 * COM_CSR_0002 : Approval Request 踰꾪듉 <br>
 * searchApInvDTRBIn -> or searchApInvDTRBOut -> 濡쒖쭅�쇰줈 DBRowSet[] ��엯�쇰줈 �댁븘���곗씠��뱾��AP_INV_DTRB��INSERT, AP_INV_HDR��UPDATE
 * @param List<SearchDTRBTtlVO> searchDTRBTtlVOList
 * @param CsrParmVO csrParmVO
 * @param String creUsrId
 * @exception DAOException
 */
public void createApInvDTRB(List<SearchDTRBTtlVO> searchDTRBTtlVOList, CsrParmVO csrParmVO, String creUsrId) throws DAOException {
	log.debug("\n DAO.createApInvDTRB --------------------------------------------------");

	String csr_no 	= JSPUtil.getNull(csrParmVO.getCsrNo());
	String ofc_cd	= csrParmVO.getInvOfcCd();
	
	List al = new ArrayList();
	SearchDTRBTtlVO model = new SearchDTRBTtlVO();
	Iterator itr = searchDTRBTtlVOList.iterator();
	
	//velocity parameter
	Map<String, Object> velParam = new HashMap<String, Object>();
	
	try {
		int insCnt[] = null;
		SQLExecuter sqlExe = new SQLExecuter(""); 
		
		//for (int j=0; j<searchDTRBTtlVOList.length; j++){
		while(itr.hasNext()){
			model = (SearchDTRBTtlVO) itr.next();
			
			Map<String, Object> mapVO2 = new HashMap<String, Object>();
			mapVO2.put("csr_no", csr_no);
			mapVO2.put("line_seq", model.getLineSeq());
			mapVO2.put("line_no",  model.getLineNo());
			mapVO2.put("line_tp_lu_cd", model.getLineTpLuCd());
			mapVO2.put("csr_amt",  model.getCsrAmt());
			mapVO2.put("inv_desc", model.getInvDesc());
			mapVO2.put("inv_tax_cd", model.getInvTaxCd());
			mapVO2.put("dtrb_coa_co_cd",   model.getDtrbCoaCoCd());
			mapVO2.put("dtrb_coa_rgn_cd",  model.getDtrbCoaRgnCd());
			mapVO2.put("dtrb_coa_ctr_cd",  model.getDtrbCoaCtrCd());
			mapVO2.put("dtrb_coa_acct_cd", model.getDtrbCoaAcctCd());
			mapVO2.put("dtrb_coa_vvd_cd",  model.getDtrbCoaVvdCd());
			mapVO2.put("dtrb_coa_inter_co_cd", model.getDtrbCoaInterCoCd());
			mapVO2.put("dtrb_coa_ftu_n1st_cd", model.getDtrbCoaFtuN1stCd());
			mapVO2.put("dtrb_coa_ftu_n2nd_cd", model.getDtrbCoaFtuN2ndCd());
			mapVO2.put("attr_cate_nm",model.getAttrCateNm());
			mapVO2.put("attr_ctnt1",  model.getAttrCtnt1());
			mapVO2.put("attr_ctnt2",  model.getAttrCtnt2());
			mapVO2.put("attr_ctnt3",  model.getAttrCtnt3());
			mapVO2.put("attr_ctnt4",  model.getAttrCtnt4());
			mapVO2.put("attr_ctnt5",  model.getAttrCtnt5());
			mapVO2.put("attr_ctnt6",  model.getAttrCtnt6());
			mapVO2.put("attr_ctnt7",  model.getAttrCtnt7());
			mapVO2.put("attr_ctnt8",  model.getAttrCtnt8());
			mapVO2.put("attr_ctnt9",  model.getAttrCtnt9());
			mapVO2.put("attr_ctnt10", model.getAttrCtnt10());
			mapVO2.put("attr_ctnt11", model.getAttrCtnt11());
			mapVO2.put("attr_ctnt12", model.getAttrCtnt12());
			mapVO2.put("attr_ctnt13", model.getAttrCtnt13());
			mapVO2.put("attr_ctnt14", model.getAttrCtnt14());
			mapVO2.put("attr_ctnt15", model.getAttrCtnt15());
			//mapVO2.put("bkg_no", rowSetArr[j].getString("bkg_no"));
			mapVO2.put("cntr_tpsz_cd",model.getCntrTpszCd());
			mapVO2.put("act_vvd_cd",  model.getActVvdCd());
			mapVO2.put("pln_sctr_div_cd", model.getPlnSctrDivCd());
			mapVO2.put("so_crr_cd",   model.getSoCrrCd());
			//mapVO2.put("yd_cd", rowSetArr[j].getString("yd_cd"));
			mapVO2.put("ftu_use_ctnt1", model.getFtuUseCtnt1());
			mapVO2.put("ftu_use_ctnt2", model.getFtuUseCtnt2());
			mapVO2.put("ftu_use_ctnt3", model.getFtuUseCtnt3());
			mapVO2.put("ftu_use_ctnt4", model.getFtuUseCtnt4());
			mapVO2.put("ftu_use_cntr5", model.getFtuUseCntr5());
			mapVO2.put("eai_evnt_dt", model.getEaiEvntDt());
			mapVO2.put("ofc_cd",      ofc_cd);
			mapVO2.put("cre_usr_id",  creUsrId);
			mapVO2.put("stl_key_no",  model.getStlKeyNo());
			mapVO2.put("ownr_vndr_seq",  model.getOwnrVndrSeq());
			
			al.add(mapVO2);
		}
		
		insCnt = sqlExe.executeBatch((ISQLTemplate)new ConsultationSlipRequestMgtDBDAOInsApInvDtrbCSQL(), al, velParam);
		
		for(int j = 0; j < insCnt.length; j++){
			if(insCnt[j]== Statement.EXECUTE_FAILED)
				throw new DAOException("Fail to insert No1"+ j + " SQL");
		}

	} catch (SQLException se) {
		log.error(se.getMessage(),se);
		throw new DAOException(new ErrorHandler(se).getMessage());
	}catch(Exception ex){
		log.error(ex.getMessage(),ex);
		throw new DAOException(new ErrorHandler(ex).getMessage());
	}
}

/**
 * COM_CSR_0002 : Approval Request 踰꾪듉 <br>
 * AP_INV_HDR DESC UPDATE
 * @param CsrParmVO csrParmVO
 * @exception DAOException
 */
public void createApInvHdrUpdate(CsrParmVO csrParmVO) throws DAOException {
	log.debug("start createApInvHdrUpdate ===============================");
	//query parameter
	Map<String, Object> param = new HashMap<String, Object>();
	//velocity parameter
	Map<String, Object> velParam = new HashMap<String, Object>();
	//
	Map<String, Object> mapVO = new HashMap<String, Object>();
	
	String csr_no 	= JSPUtil.getNull(csrParmVO.getCsrNo());
	//2009-11-23
	String pso_trns_slp_ctnt  = csrParmVO.getPsoTrnsSlpCtnt(); 
	//TLL - PL PO GL GO
	String invSubSysCd   	  = csrParmVO.getInvSubSysCd();	//紐⑤뱢
	
	try {
		//update
		mapVO.put("csr_no", csr_no);
		param.putAll(mapVO);
		velParam.putAll(mapVO);
		// 諛곕��꾩뿉 INV_DESC��MAX ACCT紐낆쓣 �ｋ뒗�� 
		int result = 0;
		SQLExecuter sqlExe = new SQLExecuter("");

		if(!invSubSysCd.equals("TLL") && !pso_trns_slp_ctnt.equals("AR")){
			result = sqlExe.executeUpdate((ISQLTemplate)new ConsultationSlipRequestMgtDBDAOUdtApInvHdrUSQL(), param, velParam);
			if(result == Statement.EXECUTE_FAILED)
				throw new EventException((new ErrorHandler("CSR00002", new String[]{"INV_DESC"}).getMessage())); 
		}
	
	} catch (SQLException se) {
		log.error(se.getMessage(), se);
		throw new DAOException(new ErrorHandler(se).getMessage());
	} catch (DAOException de) {
		log.error(de.getMessage(), de);
		throw de;
	} catch (Exception e) {
		log.error(e.getMessage(), e);
		throw new DAOException(e.getMessage());
	}
	
}


/**
 * COM_CSR_0002 : Approval Request 踰꾪듉 <br>
 * AP_INV_DTRB ��LINE_SEQ, LINE_NO UPDATE
 * @param String csrNo
 * @exception DAOException
 */
public void modifyApInvDTRBLineNo(String csrNo) throws DAOException {
	log.debug("\n DAO.modifyApInvDTRBLineNo --------------------------------------------------");

	Map<String, Object> param 		= new HashMap<String, Object>();
	//velocity parameter
	Map<String, Object> velParam 	= new HashMap<String, Object>();
	
	try {
		param.put("csr_no", csrNo);

		new SQLExecuter("").executeUpdate((ISQLTemplate)new ConsultationSlipRequestMgtDBDAOModifyApInvDTRBLineNoUpdate01USQL(), param, velParam);

	} catch (SQLException se) {
		log.error(se.getMessage(), se);
		throw new DAOException(new ErrorHandler(se).getMessage());
	} catch (DAOException de) {
		log.error(de.getMessage(), de);
		throw de;
	} catch (Exception e) {
		log.error(e.getMessage(), e);
		throw new DAOException(e.getMessage());
	}
}

/**
 * COM_CSR_0002 : Approval Request 踰꾪듉 <br>
 * AP_INV_DTRB ��LINE_SEQ, LINE_NO UPDATE
 * @param List<ApInvDtrbVO> voList
 * @exception DAOException
 */
public void modifyApInvDTRBLineNo02(List<ApInvDtrbVO> voList) throws DAOException {
	log.debug("\n DAO.modifyApInvDTRBLineNo02 --------------------------------------------------");

	//query parameter
	Map<String, Object> param = new HashMap<String, Object>();
	//velocity parameter
	Map<String, Object> velParam = new HashMap<String, Object>();

	try {
		int insCnt[] = null;
		if(voList.size() > 0){
			insCnt = new SQLExecuter("").executeBatch((ISQLTemplate)new ConsultationSlipRequestMgtDBDAOModifyApInvDTRBLineNoUpdate02USQL(), voList, param, velParam);
			for(int i = 0; i < insCnt.length; i++){
				if(insCnt[i]== Statement.EXECUTE_FAILED)
					throw new DAOException("Fail to insert No"+ i + " SQL");
			}
		}			

	} catch (SQLException se) {
		log.error(se.getMessage(), se);
		throw new DAOException(new ErrorHandler(se).getMessage());
	} catch (DAOException de) {
		log.error(de.getMessage(), de);
		throw de;
	} catch (Exception e) {
		log.error(e.getMessage(), e);
		throw new DAOException(e.getMessage());
	}
}

/**
 * COM_CSR_0002 : Approval Request 踰꾪듉 <br>
 * AP_INV_DTRB ��LINE_SEQ, LINE_NO UPDATE
 * @param String csrNo
 * @return DBRowSet
 * @exception DAOException
 */
public DBRowSet modifyApInvDTRBLineNo03(String csrNo) throws DAOException {
	if(log.isDebugEnabled())log.debug("\n==========CARIssueTransferSlipManageDBDAO    modifyApInvDTRBLineNo03() ============");

	DBRowSet 			dbRowSet	= null;
	Map<String, Object> param 		= new HashMap<String, Object>();
	Map<String, Object> velParam 	= new HashMap<String, Object>(); //velocity parameter
	
	try {
		param.put("csr_no", csrNo);
		
		dbRowSet = new SQLExecuter("").executeQuery((ISQLTemplate)new ConsultationSlipRequestMgtDBDAOModifyApInvDTRBLineNoUpdate03RSQL(), param, velParam);

		return dbRowSet;
	} catch (SQLException se) {
		log.error(se.getMessage(), se);
		throw new DAOException(new ErrorHandler(se).getMessage());
	} catch (DAOException de) {
		log.error(de.getMessage(), de);
		throw de;
	} catch (Exception e) {
		log.error(e.getMessage(), e);
		throw new DAOException(e.getMessage());
	}
	
}

/**
 * COM_CSR_0002 : Approval Request 踰꾪듉 <br>
 * AP_INV_DTRB GAP(泥�뎄諛쏆� Invoice��湲덉븸 - 怨듦툒�� UPDATE瑜��꾪븳 議고쉶 
 * @param String csrNo
 * @param String invNo
 * @param String vndrSeq
 * @return DBRowSet
 * @exception DAOException
 */
public DBRowSet createApInvDTRB_sum(String csrNo, String invNo, String vndrSeq) throws DAOException {
	log.debug("start createApInvDTRB_sum ========================");

	DBRowSet 			dbRowSet	= null;
	Map<String, Object> mapVO = new HashMap<String, Object>();
	//query parameter
	Map<String, Object> param = new HashMap<String, Object>();
	//velocity parameter
	Map<String, Object> velParam = new HashMap<String, Object>();

	try{
		mapVO.put("csr_no", 		csrNo);
		mapVO.put("inv_no", 		invNo);
		mapVO.put("vndr_seq", 		vndrSeq);

		param.putAll(mapVO);
		velParam.putAll(mapVO);
		
		dbRowSet = new SQLExecuter("").executeQuery((ISQLTemplate)new ConsultationSlipRequestMgtDBDAOCreateApInvDTRBSumRSQL(), param, velParam);
		return dbRowSet;
	} catch (SQLException se) {
		log.error(se.getMessage(), se);
		throw new DAOException(new ErrorHandler(se).getMessage());
	} catch (DAOException de) {
		log.error(de.getMessage(), de);
		throw de;
	} catch (Exception e) {
		log.error(e.getMessage(), e);
		throw new DAOException(e.getMessage());
	}
	
}

/**
 * COM_CSR_0002 : Approval Request 踰꾪듉 <br>
 * AP_INV_DTRB GAP(泥�뎄諛쏆� Invoice��湲덉븸 - 怨듦툒�� UPDATE
 * @param CsrParmVO csrParmVO
 * @param String gap
 * @param String invNo2
 * @param costCd
 * @param cntrTpszCd
 * @exception EventException
 */
public void createApInvDTRB_sumUpdateDiff(CsrParmVO csrParmVO, String gap, String invNo2, String costCd, String cntrTpszCd) throws DAOException {
	
	Map<String, Object> mapVO = new HashMap<String, Object>();
	//query parameter
	Map<String, Object> param = new HashMap<String, Object>();
	//velocity parameter
	Map<String, Object> velParam = new HashMap<String, Object>();

	try{
		mapVO.put("csr_no", 		csrParmVO.getCsrNo());
		mapVO.put("curr_cd", 		csrParmVO.getCurrCd());
		mapVO.put("gap", 			gap);
		mapVO.put("inv_no2", 		invNo2);
		mapVO.put("cost_cd", 		costCd);
		mapVO.put("cntr_tpsz_cd", 	cntrTpszCd);
		
		param.putAll(mapVO);
		velParam.putAll(mapVO);

		new SQLExecuter("").executeUpdate((ISQLTemplate)new ConsultationSlipRequestMgtDBDAOCreateApInvDTRBSumUpdateDiffUSQL(), param, velParam);

	} catch (SQLException se) {
		log.error(se.getMessage(), se);
		throw new DAOException(new ErrorHandler(se).getMessage());
	} catch (DAOException de) {
		log.error(de.getMessage(), de);
		throw de;
	} catch (Exception e) {
		log.error(e.getMessage(), e);
		throw new DAOException(e.getMessage());
	}
}

/**
 * COM_CSR_0002 : Approval Request 踰꾪듉 <br>
 * asa_no 媛믪씠 �덈뒗寃쎌슦 AP_INV_DTRB  GAP(泥�뎄諛쏆� Invoice��湲덉븸 - 怨듦툒�� UPDATE
 * @param String csrNo
 * @return DBRowSet
 * @exception EventException
 */
public DBRowSet createApInvDTRBASANoSelect(String csrNo) throws DAOException {
	log.debug("start createApInvDTRBASANoSelect ========================");

	DBRowSet 			dbRowSet	= null;
	Map<String, Object> param 		= new HashMap<String, Object>();
	Map<String, Object> velParam 	= new HashMap<String, Object>(); //velocity parameter
	
	try {
		param.put("csr_no", csrNo);

		dbRowSet = new SQLExecuter("").executeQuery((ISQLTemplate)new ConsultationSlipRequestMgtDBDAOCreateApInvDTRBASANoSelectRSQL(), param, velParam);

		return dbRowSet;
	} catch (SQLException se) {
		log.error(se.getMessage(), se);
		throw new DAOException(new ErrorHandler(se).getMessage());
	} catch (DAOException de) {
		log.error(de.getMessage(), de);
		throw de;
	} catch (Exception e) {
		log.error(e.getMessage(), e);
		throw new DAOException(e.getMessage());
	}
}

/**
 * COM_CSR_0002 : Approval Request 踰꾪듉 <br>
 * asa_no 媛믪씠 �덈뒗寃쎌슦 AP_INV_DTRB  GAP(泥�뎄諛쏆� Invoice��湲덉븸 - 怨듦툒�� UPDATE
 * @param CreateApInvDTRBASANoSelectVO createApInvDTRBASANoSelectVO
 * @param String ofcCd 
 * @param String costOfcCd
 * @param String vndrSeq
 * @param String creUsrId
 * @param String csrTpCd
 * @exception DAOException
 */
public void createApInvDTRBASANoInsert(CreateApInvDTRBASANoSelectVO createApInvDTRBASANoSelectVO, String ofcCd, String costOfcCd, String vndrSeq, String creUsrId, String csrTpCd) throws DAOException {
	log.debug("start createApInvDTRBASANoInsert =============================");
	
	Map<String, Object> param 		= new HashMap<String, Object>();
	//velocity parameter
	Map<String, Object> velParam 	= new HashMap<String, Object>();
	
	try {
		Map<String, String> mapVO = createApInvDTRBASANoSelectVO.getColumnValues();
		param.putAll(mapVO);
		velParam.putAll(mapVO);
		
		param.put("ofc_cd", ofcCd);
		param.put("cost_ofc_cd", costOfcCd);
		param.put("vndr_seq",  vndrSeq);
		param.put("cre_usr_id",  creUsrId);
		param.put("cre_tp_cd",  csrTpCd);
		
		new SQLExecuter("").executeUpdate((ISQLTemplate)new ConsultationSlipRequestMgtDBDAOCreateApInvDTRBASANoCSQL(), param, velParam);
	
	} catch (SQLException se) {
		log.error(se.getMessage(), se);
		throw new DAOException(new ErrorHandler(se).getMessage());
	} catch (DAOException de) {
		log.error(de.getMessage(), de);
		throw de;
	} catch (Exception e) {
		log.error(e.getMessage(), e);
		throw new DAOException(e.getMessage());
	}	
}

/**
 * COM_CSR_0002 : Approval Request 踰꾪듉 <br>
 * ap_inv_hdr csr_amr update
 * @param String csrNo
 * @exception EventException
 */
public void createApInvDTRBASANoUpdate(String csrNo) throws DAOException {
	log.debug("start createApInvDTRBASANoUpdate =============================");

	Map<String, Object> param 		= new HashMap<String, Object>();
	//velocity parameter
	Map<String, Object> velParam 	= new HashMap<String, Object>();
	
	try {
		param.put("csr_no", csrNo);
		
		new SQLExecuter("").executeUpdate((ISQLTemplate)new ConsultationSlipRequestMgtDBDAOCreateApInvDTRBASANoUSQL(), param, velParam);

	} catch (SQLException se) {
		log.error(se.getMessage(), se);
		throw new DAOException(new ErrorHandler(se).getMessage());
	} catch (DAOException de) {
		log.error(de.getMessage(), de);
		throw de;
	} catch (Exception e) {
		log.error(e.getMessage(), e);
		throw new DAOException(e.getMessage());
	}	
}

/**
 * CSR�앹꽦��AP I/F瑜��꾪빐 AP_INV_IF��DATA瑜��ｋ뒗�� -> �꾩옱 �ъ슜�섏� �딅뒗 硫붿냼��2010-08-04
 * @param String csrNo
 * @param String ofcCd
 * @return String
 * @exception DAOException
 */
public String createApInvIF(String csrNo, String ofcCd) throws DAOException {
	log.debug("\n DAO.createApInvIF --------------------------------------------------");
	String pgm_no = "ESDCSRXXX"+JSPUtil.getKST("yyyyMMdd");
	//query parameter
	Map<String, Object> param = new HashMap<String, Object>();
	//velocity parameter
	Map<String, Object> velParam = new HashMap<String, Object>();

	int result = 0;
	try {
        Map<String, Object> mapVO = new HashMap<String, Object>();
        mapVO.put("pgm_no", pgm_no);
        mapVO.put("csr_no", csrNo);
        mapVO.put("ofc_cd", ofcCd);

        param.putAll(mapVO);
		velParam.putAll(mapVO);

		SQLExecuter sqlExe = new SQLExecuter("");
		result = sqlExe.executeUpdate((ISQLTemplate)new ConsultationSlipRequestMgtDBDAOApInvIFCSQL(), param, velParam);
		if(result == Statement.EXECUTE_FAILED)
				throw new DAOException("Fail to insert SQL");
	} catch (SQLException se) {
		log.error(se.getMessage(),se);
		throw new DAOException(new ErrorHandler(se).getMessage());
	}catch(Exception ex){
		log.error(ex.getMessage(),ex);
		throw new DAOException(new ErrorHandler(ex).getMessage());
	}
	return pgm_no;
}

/**
 * COM_CSR_0002 : Approval Request 踰꾪듉 <br>
 * 7.HDR CSR NO UPDATE 泥섎━ -> AP_PAY_INV ��CSR_NO �낅뜲�댄듃
 * @param Collection<PayInvVO> payInvVOs
 * @param String csrNo
 * @param String batchFlag
 * @return String
 * @exception DAOException
 * @exception EventException 
 */
public String upateInvCSRNo(Collection<PayInvVO> payInvVOs, String csrNo, String batchFlag ) throws DAOException, EventException {
	log.debug("\n DAO.upateInvCSRNo --------------------------------------------------");

	List al = new ArrayList();
	//velocity parameter
	Map<String, Object> velParam = new HashMap<String, Object>();
	try {
		Iterator itr = payInvVOs.iterator();
		PayInvVO model = null;
		int updCnt[] = null;

		while (itr.hasNext()) {
			model = (PayInvVO)itr.next();
    		if(!model.getIbflag().equals("")){
				Map<String, Object> mapVO2 = new HashMap<String, Object>();
				mapVO2.put("batch_flag", 	JSPUtil.getNull(batchFlag ));
				mapVO2.put("csr_no", 	JSPUtil.getNull(csrNo ));
				mapVO2.put("inv_rgst_no", 	JSPUtil.getNull(model.getInv_rgst_no() ));
				al.add(mapVO2);
				velParam.putAll(mapVO2);
    		}
		}
		
		SQLExecuter sqlExe = new SQLExecuter("");
		updCnt = sqlExe.executeBatch((ISQLTemplate)new ConsultationSlipRequestMgtDBDAOUdtInvCSRNoUSQL(), al, velParam);

		for(int j = 0; j < updCnt.length; j++){
			if(updCnt[j]== Statement.EXECUTE_FAILED)
				throw new DAOException("Fail to update No1"+ j + " SQL");
		}
	}catch(SQLException se){
		log.error(se.getMessage(),se);
		throw new EventException((new ErrorHandler("CSR00088").getMessage())); 
	}catch(Exception ex){
		log.error(ex.getMessage(),ex);
		throw new DAOException(new ErrorHandler(ex).getMessage());
	}
	return csrNo;
}

/**
 * COM_CSR_0002 : Approval Request 버튼 <br>
 * 8.EP 결제하기 - 결제등록 (COM_APRO_RQST_HDR, ComAproRqstRoutVO)
 * @param CsrParmVO csrParmVO
 * @exception DAOException
 */
public void createCSREPApproval(CsrParmVO csrParmVO) throws DAOException
{
	log.debug("\n DAO.createCSREPApproval --------------------------------------------------");

	String  sCsr_no 			= csrParmVO.getCsrNo();
	String  sTotal_amt  		= csrParmVO.getTotalAmt();
	String  sCost_ofc_cd  		= csrParmVO.getCostOfcCd();
	String  sInv_ofc_cd         = csrParmVO.getInvOfcCd();  //2015.12.28 Cost Office -> Invoice Office
	//	String  sInv_ofc_cd  		= JSPUtil.getNull(String.valueOf(hashParam.get("ofc_cd")));
	String  sUsr_nm  			= csrParmVO.getUsrNm();
	String  sCre_usr_id  		= csrParmVO.getCreUsrId();
	//String  sApro_step  		= csrParmVO.getAproStep();
	String  sOfc_nm  			= "";
	String  sVndr_seq  			= csrParmVO.getVndrSeq();
	String  sCurr_cd  			= csrParmVO.getCurrCd();
	String  sCnt_cd  			= csrParmVO.getInvKnt();
	//String  sGen_pay_term_cd	= JSPUtil.getNull(String.valueOf(hashParam.get("gen_pay_term_cd")));
	String  sPayment_due_dt		= csrParmVO.getPaymentDueDt();
	String  sInv_sub_sys_cd		= csrParmVO.getInvSubSysCd();

	if(sInv_sub_sys_cd.equals("TLL")){
		sInv_sub_sys_cd = "MNR";
	}
	
	if(!sPayment_due_dt.equals("")){
		sPayment_due_dt = sPayment_due_dt.replaceAll("-","");
	}

	try {
		ApprovalUtil util = new ApprovalUtil();

		// COM_APRO_RQST_HDR
		ComAproRqstHdrVO header = new ComAproRqstHdrVO();
		header.setSubSysCd(sInv_sub_sys_cd);
		header.setAproKndCd("CSR");
		header.setRqstOfcCd(sCost_ofc_cd);
		header.setRqstOfcNm(sOfc_nm);
		header.setRqstUsrJbTitNm(""); // 吏곸콉
		header.setRqstUsrId(sCre_usr_id);
		header.setRqstUsrNm(sUsr_nm);
		header.setCreUsrId(sCre_usr_id); 

//		// COM_APRO_RQST_ROUT
//		//ComAproRqstRoutVO[] route = util.convertApprovalRoute(sApro_step);
//		//OFC 단위 결재로 변경. APRO_STEP 세팅할 필요 없음 (OFC 만 세팅)
//		ComAproRqstRoutVO route = new ComAproRqstRoutVO();
//		route.setAproOfcCd(sInv_ofc_cd); //2015.12.28 Cost Office -> Invoice Office
//		//route.setAproOfcCd(sCost_ofc_cd);
//		route.setAproOfcNm(sOfc_nm);
		
//		ComAproRqstRoutVO[] routes = ApprovalUtil.getApprovalRoutes(sInv_ofc_cd, sInv_sub_sys_cd);
		ComAproRqstRoutVO[] routes = ApprovalUtil.getApprovalRoutes(sInv_ofc_cd, sInv_sub_sys_cd, sCsr_no);
		
		if (routes!=null && routes.length>0){
			ComAproCsrDtlVO csr = new ComAproCsrDtlVO();
			csr.setCsrNo(sCsr_no);
			csr.setCostOfcCd(sCost_ofc_cd);
			csr.setInvKnt(sCnt_cd);
			csr.setVndrSeq(sVndr_seq);
			//csr.setPay_due_dt(sGen_pay_term_cd);
			csr.setPayDueDt(sPayment_due_dt);
			csr.setCurrCd(sCurr_cd);
			csr.setAproTtlAmt(sTotal_amt.replace(",", ""));
			csr.setCreUsrId(sCre_usr_id);
			csr.setUpdUsrId(sCre_usr_id);

			// CSR 결재요청 정보 생성
			util.saveCsrApro(header, routes, csr);
		} else {
			log.error("\n\n Approval Step information is not found! \n\n");
//			throw new Exception("\n\n Approval Step information is not found! \n\n");
			throw new Exception(new ErrorHandler("CSR00093", new String[]{}).getMessage());
		}
		
	}catch(SQLException se){
		log.error(se.getMessage(),se);
		throw new DAOException(new ErrorHandler(se).getMessage());
	} catch(Exception e) {
		log.error(e.getMessage(),e);
		throw new DAOException(new ErrorHandler(e).getMessage());
	}
}

/**
 * COM_CSR_0002 : Approval Request 踰꾪듉 <br>
 * 9. inv_sts_cd 'A' 寃곗젣�섍린
 * @param Collection<PayInvVO> payInvVOs
 * @param String invStsCd
 * @exception DAOException
 */
public void modifyStsCdSOHDR(Collection<PayInvVO> payInvVOs, String invStsCd) throws DAOException {
	log.debug("\n DAO.modifyStsCdSOHDR --------------------------------------------------");

	List al = new ArrayList();
	//velocity parameter
	Map<String, Object> velParam = new HashMap<String, Object>();

	try {
		Iterator itr = payInvVOs.iterator();
		PayInvVO model = null;
		int updCnt[] = null;
		
		while (itr.hasNext()) {
			model = (PayInvVO)itr.next();
    		if(!model.getIbflag().equals("")){
				Map<String, Object> mapVO2 = new HashMap<String, Object>();
				mapVO2.put("inv_sts_cd", 	JSPUtil.getNull(invStsCd ));
				mapVO2.put("inv_rgst_no", 	JSPUtil.getNull(model.getInv_rgst_no() ));
				al.add(mapVO2);
    		}
		}
		
		SQLExecuter sqlExe = new SQLExecuter("");
		updCnt = sqlExe.executeBatch((ISQLTemplate)new ConsultationSlipRequestMgtDBDAOModifyStsSOHDRUSQL(), al, velParam);

		for(int j = 0; j < updCnt.length; j++){
			if(updCnt[j]== Statement.EXECUTE_FAILED)
				throw new DAOException("Fail to update No1"+ j + " SQL");
		}
	}catch(SQLException se){
		log.error(se.getMessage(),se);
		throw new DAOException(new ErrorHandler(se).getMessage());
	}catch(Exception ex){
		log.error(ex.getMessage(),ex);
		throw new DAOException(new ErrorHandler(ex).getMessage());
	}
}

/**
 * COM_CSR_0002 : Approval Request 시 동시 CSR 생성 여부 체크 <br>
 * 20. AP PAY INV STATUS CODE CHECK
 * @param String invRgstNo
 * @return String
 * @exception DAOException
 */
public String searchCsrCreationCheck(String invRgstNo) throws DAOException {
	DBRowSet dbRowset = null;
	String  rtnValue = "";
	//query parameter
	Map<String, Object> param = new HashMap<String, Object>();
	//velocity parameter
	Map<String, Object> velParam = new HashMap<String, Object>();

	try{
		if (invRgstNo != null) {
			Map<String, String> mapVO = new HashMap<String, String>();
			mapVO.put("inv_rgst_no", invRgstNo);
		
			param.putAll(mapVO);
			velParam.putAll(mapVO);
		}
		dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new ConsultationSlipRequestMgtDBDAOSearchCsrCreationCheckRSQL(), param, velParam);
		if(dbRowset.next()) {
			rtnValue = dbRowset.getString("INV_STS_CD");
		}

	}catch(SQLException se){
		log.error(se.getMessage(),se);
		throw new DAOException(new ErrorHandler(se).getMessage());
	}catch(Exception ex){
		log.error(ex.getMessage(),ex);
		throw new DAOException(new ErrorHandler(ex).getMessage());
	}
	return rtnValue;
}

/**
 * COM_CSR_0002 : Approval Request 踰꾪듉 <br>
 * 10. CSR AMT VAILD CHECK 
 * @param String csrNo
 * @return String
 * @exception DAOException
 */
public String checkCSRAmtVsInvAmt(String csrNo) throws DAOException {
	DBRowSet dbRowset = null;
	String retval = "";
	//query parameter
	Map<String, Object> param = new HashMap<String, Object>();
	//velocity parameter
	Map<String, Object> velParam = new HashMap<String, Object>();

	try{
		Map<String, String> mapVO = new HashMap<String, String>();
		mapVO.put("csr_no", csrNo);

		param.putAll(mapVO);
		velParam.putAll(mapVO);

		dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new ConsultationSlipRequestMgtDBDAOcheckCSRAmtVsInvAmtRSQL(), param, velParam);
		while(dbRowset.next()){
			retval = dbRowset.getString("retval");
        }
	}catch(SQLException se){
		log.error(se.getMessage(),se);
		throw new DAOException(new ErrorHandler(se).getMessage());
	}catch(Exception ex){
		log.error(ex.getMessage(),ex);
		throw new DAOException(new ErrorHandler(ex).getMessage());
	}
	return retval;
}

/**
 * COM_CSR_0002 : Approval Request 踰꾪듉 <br>
 * RevVVD媛�AR_MST_REV_VVD��議댁옱/��젣 �섏뿀�붿� 議고쉶 / ERR MSG��inv_no��異쒕젰 / Rev.VVD濡�Rev.VVD master��議댁옱/��젣 �щ�瑜�議고쉶.
 * @param String csrNo
 * @return DBRowSet
 * @exception DAOException
 */ 
public DBRowSet checkMstRevVVD01(String csrNo) throws DAOException {
	log.debug("\n\n DAO.checkMstRevVVD01 - csr_no:"+csrNo+" ---------------------------------------   \n");
	DBRowSet 			dbRowSet	= null;
	Map<String, Object> param 		= new HashMap<String, Object>();
	Map<String, Object> velParam 	= new HashMap<String, Object>(); //velocity parameter
	
	try {
		param.put("csr_no", csrNo);
		
		dbRowSet = new SQLExecuter("").executeQuery((ISQLTemplate)new ConsultationSlipRequestMgtDBDAOCheckMstRevVVD01RSQL(), param, velParam);

		return dbRowSet;
	} catch (SQLException se) {
		log.error(se.getMessage(), se);
		throw new DAOException(new ErrorHandler(se).getMessage());
	} catch (DAOException de) {
		log.error(de.getMessage(), de);
		throw de;
	} catch (Exception e) {
		log.error(e.getMessage(), e);
		throw new DAOException(e.getMessage());
	}
	
}

/**
 * COM_CSR_0002 : Approval Request 踰꾪듉 <br>
 * DTRB_COA_ACCT_CD 議고쉶.
 * @param String csrNo
 * @return DBRowSet
 * @exception DAOException
 */ 
public DBRowSet checkAcctCd(String csrNo) throws DAOException {
	log.debug("\n\n DAO.checkAcctCd - csr_no:"+csrNo+" ---------------------------------------   \n");
	DBRowSet 			dbRowSet	= null;
	Map<String, Object> param 		= new HashMap<String, Object>();
	Map<String, Object> velParam 	= new HashMap<String, Object>(); //velocity parameter
	
	try {
		param.put("csr_no", csrNo);
		
		dbRowSet = new SQLExecuter("").executeQuery((ISQLTemplate)new ConsultationSlipRequestMgtDBDAOCheckAcctCdRSQL(), param, velParam);

		return dbRowSet;
	} catch (SQLException se) {
		log.error(se.getMessage(), se);
		throw new DAOException(new ErrorHandler(se).getMessage());
	} catch (DAOException de) {
		log.error(de.getMessage(), de);
		throw de;
	} catch (Exception e) {
		log.error(e.getMessage(), e);
		throw new DAOException(e.getMessage());
	}
}

/**
 * COM_CSR_0002 : Approval Request 踰꾪듉 <br>
 * RevVVD媛�AR_MST_REV_VVD��議댁옱/��젣 �섏뿀�붿� 議고쉶 / ERR MSG��inv_no��異쒕젰 / Rev.VVD濡�Rev.VVD master��議댁옱/��젣 �щ�瑜�議고쉶.
 * @param String vvdCd
 * @return DBRowSet
 * @exception DAOException
 */
public DBRowSet checkMstRevVVD02(String vvdCd) throws DAOException {
	log.debug("\n\n DAO.checkMstRevVVD02 - vvd_cd:"+vvdCd+" ---------------------------------------   \n");
	DBRowSet 			dbRowSet	= null;
	Map<String, Object> param 		= new HashMap<String, Object>();
	Map<String, Object> velParam 	= new HashMap<String, Object>(); //velocity parameter
	
	try {
		param.put("vvd_cd", vvdCd);
		
		dbRowSet = new SQLExecuter("").executeQuery((ISQLTemplate)new ConsultationSlipRequestMgtDBDAOCheckMstRevVVD02RSQL(), param, velParam);

		return dbRowSet;
	} catch (SQLException se) {
		log.error(se.getMessage(), se);
		throw new DAOException(new ErrorHandler(se).getMessage());
	} catch (DAOException de) {
		log.error(de.getMessage(), de);
		throw de;
	} catch (Exception e) {
		log.error(e.getMessage(), e);
		throw new DAOException(e.getMessage());
	}
	
}

/**
 * COM_CSR_0002 : Approval Request 踰꾪듉 <br>
 * AP_INV_DTRB INSERT [利앸튃]
 * @param Collection<PayInvVO> payInvVOs
 * @param CsrParmVO csrParmVO
 * @exception DAOException
 */
public void createApInvDTRBEvi(Collection<PayInvVO> payInvVOs, CsrParmVO csrParmVO) throws DAOException {
	//query parameter
	Map<String, Object> param = new HashMap<String, Object>();
	//velocity parameter
	Map<String, Object> velParam = new HashMap<String, Object>();

	List<String> invNo = new ArrayList();
	int result = 0;
	try {
        Map<String, Object> mapVO = new HashMap<String, Object>();
        mapVO.put("csr_no", csrParmVO.getCsrNo());

		if(csrParmVO.getCntCd().equals("KR")){
			if(csrParmVO.getEviGb().equals("1")){
				mapVO.put("inv_tax_cd", csrParmVO.getEviTaxCode());   				//inv_tax_cd
			}else if(csrParmVO.getEviGb().equals("2")){
				mapVO.put("inv_tax_cd", "매입계산서"); 							//inv_tax_cd
			}else{
				mapVO.put("inv_tax_cd", "");   									//inv_tax_cd
			}
			String arrInvNo[] = setParams(payInvVOs.iterator()).split(",");
			for(int i=0;i<arrInvNo.length;i++){   
				invNo.add(arrInvNo[i]);   
			}
		}else{
			mapVO.put("inv_tax_cd", ""); 										//inv_tax_cd
		}        
        mapVO.put("ofc_cd", csrParmVO.getInvOfcCd());
        mapVO.put("user_id", csrParmVO.getCreUsrId());
//        mapVO.put("inv_no", setParams(payInvVOs.iterator()));
        mapVO.put("inv_no", invNo);
        mapVO.put("vndr_seq", csrParmVO.getVndrSeq());

        param.putAll(mapVO);
		velParam.putAll(mapVO);

		SQLExecuter sqlExe = new SQLExecuter("");
		result = sqlExe.executeUpdate((ISQLTemplate)new ConsultationSlipRequestMgtDBDAOCreateApInvDTRBEviCSQL(), param, velParam);
		if(result == Statement.EXECUTE_FAILED)
				throw new DAOException("Fail to insert SQL");
	} catch (SQLException se) {
		log.error(se.getMessage(),se);
		throw new DAOException(new ErrorHandler(se).getMessage());
	}catch(Exception ex){
		log.error(ex.getMessage(),ex);
		throw new DAOException(new ErrorHandler(ex).getMessage());
	}
}

/**
 * COM_CSR_0002 : private�덉뿉 諛섎났臾몄궗�⑹떆 r4j�듦낵�� �듦낵�섏� 紐삵븷寃쎌슦 �꾪궎��뿉 �щЦ��<br>
 * AP_INV_DTRB
 * @param int i
 * @param Iterator itr
 * @param PreparedStatement insertPs
 * @param PayInvVO payInvVO
 * @return String
 * @exception SQLException
 */
private String setParams(Iterator itr) throws DAOException { 
	String payInvNo = "";
	PayInvVO payInvVO = null;
	StringBuilder sb = new StringBuilder("");
	try{
		while (itr.hasNext()) {
			payInvVO = (PayInvVO)itr.next();
//			payInvNo = payInvNo + payInvVO.getInv_no() + ",";
			payInvNo = (sb.append(payInvNo).append(payInvVO.getInv_no()).append(",")).toString();
//			insertPs.setString(i++, payInvVO.getInv_no());	
			//inv_no
		}
		payInvNo = payInvNo.substring(0, payInvNo.length()-1);
	} catch (Exception e) {
		log.error(e.getMessage(), e);
		throw new DAOException(e.getMessage());
	}

	return payInvNo;
}

/**
 * COM_CSR_0002 : Approval Request 踰꾪듉 <br>
 * AP_INV_DTRB INSERT [TLL]
 * @param Collection<PayInvVO> payInvVOs
 * @param CsrParmVO csrParmVO
 * @exception DAOException
 */
public void createApInvDTRBEviTll(Collection<PayInvVO> payInvVOs, CsrParmVO csrParmVO) throws DAOException {
	//query parameter
	Map<String, Object> param = new HashMap<String, Object>();
	//velocity parameter
	Map<String, Object> velParam = new HashMap<String, Object>();

	List<String> invNo = new ArrayList();
	int result = 0;
	try {
        Map<String, Object> mapVO = new HashMap<String, Object>();
        
        String arrInvNo[] = setParams(payInvVOs.iterator()).split(",");
		for(int i=0;i<arrInvNo.length;i++){   
			invNo.add(arrInvNo[i]);   
		}
        mapVO.put("csr_no", csrParmVO.getCsrNo());
        mapVO.put("ofc_cd", csrParmVO.getInvOfcCd());
        mapVO.put("user_id", csrParmVO.getCreUsrId());
//      mapVO.put("inv_no", setParams(payInvVOs.iterator()));
        mapVO.put("inv_no", invNo);
        mapVO.put("vndr_seq", csrParmVO.getVndrSeq());

        param.putAll(mapVO);
		velParam.putAll(mapVO);

		SQLExecuter sqlExe = new SQLExecuter("");
		result = sqlExe.executeUpdate((ISQLTemplate)new ConsultationSlipRequestMgtDBDAOcreateApInvDTRBEviTllCSQL(), param, velParam);
		if(result == Statement.EXECUTE_FAILED)
				throw new DAOException("Fail to insert SQL");
	} catch (SQLException se) {
		log.error(se.getMessage(),se);
		throw new DAOException(new ErrorHandler(se).getMessage());
	}catch(Exception ex){
		log.error(ex.getMessage(),ex);
		throw new DAOException(new ErrorHandler(ex).getMessage());
	}
}

/*************************************************************************************************************************************************************
 **********************************************************	!! Approval Request Step End !!  *****************************************************************
 *************************************************************************************************************************************************************/


/*************************************************************************************************************************************************************
 *************************************************************!! Preview Step Add Start !!  ******************************************************************
 *************************************************************************************************************************************************************/

/**
 * COM_CSR_0008 : CSR Format 踰꾪듉 <br>
 * CSR Format 踰꾪듉 援ы쁽濡쒖쭅 - �뚮┸��
 * @param String csrNo
 * @return HdrVO 
 * @exception DAOException
 */
public HdrVO searchPreviewHDR(String csrNo) throws DAOException {
	DBRowSet dbRowset = null;
	List<HdrVO> list = null;
	HdrVO rtnVO = null;

	//query parameter
	Map<String, Object> param = new HashMap<String, Object>();
	//velocity parameter
	Map<String, Object> velParam = new HashMap<String, Object>();
	try{
		Map<String, String> mapVO = new HashMap<String, String>();
		mapVO.put("csr_no", csrNo);

		param.putAll(mapVO);
		velParam.putAll(mapVO);

		dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new ConsultationSlipRequestMgtDBDAOHdrRSQL(), param, velParam);
		list = (List)RowSetUtil.rowSetToVOs(dbRowset, HdrVO .class);

		if(list.size() > 0){
			rtnVO = (HdrVO)list.get(0);
		}
	}catch(SQLException se){
		log.error(se.getMessage(),se);
		throw new DAOException(new ErrorHandler(se).getMessage());
	}catch(Exception ex){
		log.error(ex.getMessage(),ex);
		throw new DAOException(new ErrorHandler(ex).getMessage());
	}
	return rtnVO;
}

/**
 * COM_CSR_0008 : CSR Format 踰꾪듉 <br>
 * CSR Format 踰꾪듉 援ы쁽濡쒖쭅 - 由ъ뒪��
 * @param String csrNo
 * @return List<DtrbListVO>
 * @exception DAOException
 */
public List<DtrbListVO> searchPreviewDTRBList(String csrNo) throws DAOException {
	DBRowSet dbRowset = null;
	List<DtrbListVO> list = null;
	// query parameter
	Map<String, Object> param = new HashMap<String, Object>();
	// velocity parameter
	Map<String, Object> velParam = new HashMap<String, Object>();

	try {
		Map<String, String> mapVO = new HashMap<String, String>();
		mapVO.put("csr_no", csrNo);

		param.putAll(mapVO);
		velParam.putAll(mapVO);
		dbRowset = new SQLExecuter("").executeQuery( (ISQLTemplate) new ConsultationSlipRequestMgtDBDAODtrbListRSQL(), param, velParam);
		list = (List)RowSetUtil.rowSetToVOs(dbRowset, DtrbListVO.class);
	} catch (SQLException se) {
		log.error(se.getMessage(), se);
		throw new DAOException(new ErrorHandler(se).getMessage());
	} catch (Exception ex) {
		log.error(ex.getMessage(), ex);
		throw new DAOException(new ErrorHandler(ex).getMessage());
	}
	return list;
}

/**
 * deleteApInvHDRDTRB : deleteApInvHDRDTRB<br>
 * deleteApInvHDRDTRB
 * @param String csrNo
 * @throws DAOException
 */
public void deleteApInvHDRDTRB(String csrNo) throws DAOException {
	//query parameter
	Map<String, Object> param = new HashMap<String, Object>();
	//velocity parameter
	Map<String, Object> velParam = new HashMap<String, Object>();
	Map<String, Object> mapVO = new HashMap<String, Object>();

	int result = 0;
	try {
        mapVO.put("csr_no", csrNo);

        param.putAll(mapVO);
		velParam.putAll(mapVO);
		SQLExecuter sqlExe = new SQLExecuter("");
		
		result = sqlExe.executeUpdate((ISQLTemplate)new ConsultationSlipRequestMgtDBDAODelApInvHdrDSQL(), param, velParam);
		if(result == Statement.EXECUTE_FAILED)
			throw new DAOException("Fail to insert SQL"); 
	} catch (SQLException se) {
		log.error(se.getMessage(),se);
		throw new DAOException(new ErrorHandler(se).getMessage());
	}catch(Exception ex){
		log.error(ex.getMessage(),ex);
		throw new DAOException(new ErrorHandler(ex).getMessage());
	}
}

/**
 * deleteApInvHDRDTRB : deleteApInvHDRDTRB<br>
 * deleteApInvHDRDTRB
 * @param String csrNo
 * @throws DAOException
 */
public void deleteApInvHDRDTRB02(String csrNo) throws DAOException {
	//query parameter
	Map<String, Object> param = new HashMap<String, Object>();
	//velocity parameter
	Map<String, Object> velParam = new HashMap<String, Object>();
	Map<String, Object> mapVO = new HashMap<String, Object>();

	int result = 0;
	try {
        mapVO.put("csr_no", csrNo);

        param.putAll(mapVO);
		velParam.putAll(mapVO);
		SQLExecuter sqlExe = new SQLExecuter("");
		 
		result = sqlExe.executeUpdate((ISQLTemplate)new ConsultationSlipRequestMgtDBDAODelApInvDtrbDSQL(), param, velParam);
		if(result == Statement.EXECUTE_FAILED)
			throw new DAOException("Fail to insert SQL");
	} catch (SQLException se) {
		log.error(se.getMessage(),se);
		throw new DAOException(new ErrorHandler(se).getMessage());
	}catch(Exception ex){
		log.error(ex.getMessage(),ex);
		throw new DAOException(new ErrorHandler(ex).getMessage());
	}
}

/*************************************************************************************************************************************************************
 *************************************************************	!! Preview Step Add End !!  ******************************************************************
 *************************************************************************************************************************************************************/


/**
 * COM_CSR_0011 : �붾㈃濡쒕뱶 <br>
 * Invoice List Inquiry ��由ъ뒪�명뤌議고쉶 
 * @param CSRSOlistVO cSRSOlistVO
 * @return List<CSRSOlistVO>
 * @exception DAOException
 */
public List<CSRSOlistVO> searchCSRSOlist (CSRSOlistVO cSRSOlistVO) throws DAOException {
	DBRowSet dbRowset = null;
	List<CSRSOlistVO> list = null;
	//query parameter
	Map<String, Object> param = new HashMap<String, Object>();
	//velocity parameter
	Map<String, Object> velParam = new HashMap<String, Object>();

	try{
		if(cSRSOlistVO != null){
			Map<String, String> mapVO = cSRSOlistVO .getColumnValues();
			mapVO.put("csr_no", cSRSOlistVO.getCsrNo());

			param.putAll(mapVO);
			velParam.putAll(mapVO);
		}
		dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new ConsultationSlipRequestMgtDBDAOCSRSOlistRSQL(), param, velParam);

		list = (List)RowSetUtil.rowSetToVOs(dbRowset, CSRSOlistVO.class);
	}catch(SQLException se){
		log.error(se.getMessage(),se);
		throw new DAOException(new ErrorHandler(se).getMessage());
	}catch(Exception ex){
		log.error(ex.getMessage(),ex);
		throw new DAOException(new ErrorHandler(ex).getMessage());
	}
	return list;
}

/**
 * COM_CSR_0011 : �붾㈃濡쒕뱶 <br>
 * Invoice List Inquiry ���뚮┸�쇱“�� : ��껜�꾪몴濡�寃�깋���대떦 SO紐⑸줉
 * @param CSRSOhdrVO cSRSOhdrVO
 * @return CSRSOhdrVO
 * @exception DAOException
 */
public CSRSOhdrVO searchCSRSOhdr (CSRSOhdrVO cSRSOhdrVO) throws DAOException {
	DBRowSet dbRowset = null;
	List<CSRSOhdrVO> list = null;
	CSRSOhdrVO rtnVO = null;
	//query parameter
	Map<String, Object> param = new HashMap<String, Object>();
	//velocity parameter
	Map<String, Object> velParam = new HashMap<String, Object>();

	try{
		if(cSRSOhdrVO != null){
			Map<String, String> mapVO = cSRSOhdrVO .getColumnValues();
			
			
			String invSubSysCd = cSRSOhdrVO.getInvSubSysCd();
			
			String srcCtnt = "";
 
			if(invSubSysCd.equals("MNR")){
				srcCtnt	=	"SO_M&R";
			}else if(invSubSysCd.equals("TLL")){
				srcCtnt	=	"EQ";
			}else if(invSubSysCd.equals("LSE")){
				srcCtnt	=	"SO_LEASE";
			}else if(invSubSysCd.equals("PSO")){
				srcCtnt	=	"SO_PORT";
			}else if(invSubSysCd.equals("CHS")){
				srcCtnt	=	"SO_CHASSIS";
			}else if(invSubSysCd.equals("MGS")){
				srcCtnt	=	"SO_MGSET";
			}else if(invSubSysCd.equals("CNI")){
				srcCtnt	=	"SO_CCC";
			}else if(invSubSysCd.equals("AGT")){
				srcCtnt	=	"COMMISSION";
			}
			
			mapVO.put("src_ctnt",  srcCtnt);
			mapVO.put("csr_no",    cSRSOhdrVO.getCsrNo());
			mapVO.put("ofc_cd",    cSRSOhdrVO.getOfcCd());
			param.putAll(mapVO);
			velParam.putAll(mapVO);
		}
		dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new ConsultationSlipRequestMgtDBDAOCSRSOhdrRSQL(), param, velParam);

		list = (List)RowSetUtil.rowSetToVOs(dbRowset, CSRSOhdrVO.class);

		if(list.size() > 0){
			rtnVO = (CSRSOhdrVO)list.get(0);
		}
	}catch(SQLException se){
		log.error(se.getMessage(),se);
		throw new DAOException(new ErrorHandler(se).getMessage());
	}catch(Exception ex){
		log.error(ex.getMessage(),ex);
		throw new DAOException(new ErrorHandler(ex).getMessage());
	}
	return rtnVO;
}

/**
 * COM_CSR_0008 : CSR Cancel踰꾪듉<br>
 * Cancel ��옣
 * @param IfCsrListInputVO ifCsrListInputVO
 * @throws DAOException
 */
public void multiConfirmCSR(IfCsrListInputVO ifCsrListInputVO) throws DAOException,Exception {
	//query parameter
	Map<String, Object> param = new HashMap<String, Object>();
	//velocity parameter
	Map<String, Object> velParam = new HashMap<String, Object>();

	int result = 0;
	try {
        Map<String, Object> mapVO = new HashMap<String, Object>();
        mapVO.put("csr_no", ifCsrListInputVO.getCsrNo());
        mapVO.put("upd_usr_id", ifCsrListInputVO.getUpdUsrId());
        mapVO.put("ofc_cd", ifCsrListInputVO.getOfcCd());
        mapVO.put("inv_sts_cd", ifCsrListInputVO.getInvStsCd());

        param.putAll(mapVO);
		velParam.putAll(mapVO);

		SQLExecuter sqlExe = new SQLExecuter("");
		result = sqlExe.executeUpdate((ISQLTemplate)new ConsultationSlipRequestMgtDBDAOCancelCSR01USQL(), param, velParam);
		if(result == Statement.EXECUTE_FAILED)
				throw new DAOException("Fail to insert SQL");
	} catch (SQLException se) {
		log.error(se.getMessage(),se);
		throw new DAOException(new ErrorHandler(se).getMessage());
	}catch(Exception ex){
		log.error(ex.getMessage(),ex);
		throw new DAOException(new ErrorHandler(ex).getMessage());
	}
}

/**
 * COM_CSR_0008 : CSR Cancel踰꾪듉<br>
 * Cancel ��옣
 * @param IfCsrListInputVO ifCsrListInputVO
 * @throws DAOException
 */
public void cancelCSR(IfCsrListInputVO ifCsrListInputVO) throws DAOException,Exception {
	//query parameter
	Map<String, Object> param = new HashMap<String, Object>();
	//velocity parameter
	Map<String, Object> velParam = new HashMap<String, Object>();

	int result = 0;
	try {
        Map<String, Object> mapVO = new HashMap<String, Object>();
        mapVO.put("csr_no", ifCsrListInputVO.getCsrNo());
        //mapVO.put("upd_usr_id", ifCsrListInputVO.getUpdUsrId());
       // mapVO.put("ofc_cd", ifCsrListInputVO.getOfcCd());
        mapVO.put("aft_act_flg", ifCsrListInputVO.getAftActFlg());

		param.putAll(mapVO);
		velParam.putAll(mapVO);

		SQLExecuter sqlExe = new SQLExecuter("");
		result = sqlExe.executeUpdate((ISQLTemplate)new ConsultationSlipRequestMgtDBDAOCancelCSR02USQL(), param, velParam);
		if(result == Statement.EXECUTE_FAILED)
				throw new DAOException("Fail to insert SQL");
	} catch (SQLException se) {
		log.error(se.getMessage(),se);
		throw new DAOException(new ErrorHandler(se).getMessage());
	}catch(Exception ex){
		log.error(ex.getMessage(),ex);
		throw new DAOException(new ErrorHandler(ex).getMessage());
	}
}

/**
 * COM_CSR_0008 : CSR Cancel踰꾪듉<br>
 * CSR Cancel��COM_APRO_RQST_HDR �낅뜲�댄듃
 * @param IfCsrListInputVO ifCsrListInputVO
 * @throws DAOException
 */
public void cancelCSRApro1(IfCsrListInputVO ifCsrListInputVO) throws DAOException,Exception {
	//query parameter
	Map<String, Object> param = new HashMap<String, Object>();
	//velocity parameter
	Map<String, Object> velParam = new HashMap<String, Object>();

	int result = 0;
	try {
        Map<String, Object> mapVO = new HashMap<String, Object>();
        mapVO.put("csr_no", ifCsrListInputVO.getCsrNo());

		param.putAll(mapVO);
		velParam.putAll(mapVO);

		SQLExecuter sqlExe = new SQLExecuter("");
		result = sqlExe.executeUpdate((ISQLTemplate)new ConsultationSlipRequestMgtDBDAOCSRCancellation3USQL(), param, velParam);
		if(result == Statement.EXECUTE_FAILED)
				throw new DAOException("Fail to insert SQL");
	} catch (SQLException se) {
		log.error(se.getMessage(),se);
		throw new DAOException(new ErrorHandler(se).getMessage());
	}catch(Exception ex){
		log.error(ex.getMessage(),ex);
		throw new DAOException(new ErrorHandler(ex).getMessage());
	}
}


/**
 * COM_CSR_0008 : CSR Cancel踰꾪듉<br>
 * CSR Cancel��COM_APRO_CSR_DTL �낅뜲�댄듃
 * @param IfCsrListInputVO ifCsrListInputVO
 * @throws DAOException
 */
public void cancelCSRApro2(IfCsrListInputVO ifCsrListInputVO) throws DAOException,Exception {
	//query parameter
	Map<String, Object> param = new HashMap<String, Object>();
	//velocity parameter
	Map<String, Object> velParam = new HashMap<String, Object>();
 
	int result = 0;
	try {
        Map<String, Object> mapVO = new HashMap<String, Object>();
        mapVO.put("csr_no", ifCsrListInputVO.getCsrNo());

		param.putAll(mapVO);
		velParam.putAll(mapVO);

		SQLExecuter sqlExe = new SQLExecuter("");
		result = sqlExe.executeUpdate((ISQLTemplate)new ConsultationSlipRequestMgtDBDAOCSRCancellation4USQL(), param, velParam);
		if(result == Statement.EXECUTE_FAILED)
				throw new DAOException("Fail to insert SQL");
	} catch (SQLException se) {
		log.error(se.getMessage(),se);
		throw new DAOException(new ErrorHandler(se).getMessage());
	}catch(Exception ex){
		log.error(ex.getMessage(),ex);
		throw new DAOException(new ErrorHandler(ex).getMessage());
	}
}

/**
 * COM_CSR_0014 : CSR Cancel踰꾪듉���붾㈃濡쒕뱶<br>
 * A/P Rejected & Disapproved ���몃낫�댁뒪蹂�Cancel ��옣 - �ㅺ굔���곗씠�곕� �쇨큵�곸쑝濡�媛깆떊�쒕떎.
 * @param Collection<PayInvVO> payInvVOs
 * @throws DAOException
 */
public void multiRejectedCSRCancellation01(Collection<PayInvVO> payInvVOs) throws DAOException {
	log.debug("start multiRejectedCSRCancellation01 ==================");
	try {
		int updCnt1[] = null;
		if(payInvVOs.size() > 0){
			updCnt1 = new SQLExecuter("").executeBatch((ISQLTemplate)new ConsultationSlipRequestMgtDBDAOCSRCancellation1USQL(), payInvVOs, null);
			for(int j = 0; j < updCnt1.length; j++){
				if(updCnt1[j]== Statement.EXECUTE_FAILED)
					throw new DAOException("Fail to update No1"+ j + " SQL");
			}
		}
	} catch (SQLException se) {
		log.error(se.getMessage(), se);
		throw new DAOException(new ErrorHandler(se).getMessage());
	} catch (DAOException de) {
		log.error(de.getMessage(), de);
		throw de;
	} catch (Exception e) {
		log.error(e.getMessage(), e);
		throw new DAOException(e.getMessage());
	}
}

/**
 * COM_CSR_0014 : CSR Cancel踰꾪듉���붾㈃濡쒕뱶<br>
 * A/P Rejected & Disapproved ���몃낫�댁뒪蹂�Cancel ��옣 - �ㅺ굔���곗씠�곕� �쇨큵�곸쑝濡�媛깆떊�쒕떎.
 * @param Collection<PayInvVO> payInvVOs
 * @throws DAOException
 */
public void multiRejectedCSRCancellation02(Collection<PayInvVO> payInvVOs) throws DAOException {
	log.debug("start multiRejectedCSRCancellation01 ==================");
	try {
		int updCnt2[] = null;
		if(payInvVOs.size() > 0){
			updCnt2 = new SQLExecuter("").executeBatch((ISQLTemplate)new ConsultationSlipRequestMgtDBDAOCSRCancellation2USQL(), payInvVOs, null);
			for(int j = 0; j < updCnt2.length; j++){
				if(updCnt2[j]== Statement.EXECUTE_FAILED)
					throw new DAOException("Fail to update No2"+ j + " SQL");
			}
		}
	} catch (SQLException se) {
		log.error(se.getMessage(), se);
		throw new DAOException(new ErrorHandler(se).getMessage());
	} catch (DAOException de) {
		log.error(de.getMessage(), de);
		throw de;
	} catch (Exception e) {
		log.error(e.getMessage(), e);
		throw new DAOException(e.getMessage());
	}
}

/**
 * COM_CSR_0014 : CSR Cancel踰꾪듉���붾㈃濡쒕뱶<br>
 * A/P Rejected & Disapproved ���몃낫�댁뒪蹂�Cancel ��옣 - �ㅺ굔���곗씠�곕� �쇨큵�곸쑝濡�媛깆떊�쒕떎.
 * @param Collection<PayInvVO> payInvVOs
 * @throws DAOException
 */
public void multiRejectedCSRCancellation03(Collection<PayInvVO> payInvVOs) throws DAOException {
	log.debug("start multiRejectedCSRCancellation01 ==================");
	try {
		int updCnt3[] = null;
		if(payInvVOs.size() > 0){
			updCnt3 = new SQLExecuter("").executeBatch((ISQLTemplate)new ConsultationSlipRequestMgtDBDAOCSRCancellation3USQL(), payInvVOs, null);	//COM_APRO_RQST_HDR �낅뜲�댄듃
			for(int j = 0; j < updCnt3.length; j++){
				if(updCnt3[j]== Statement.EXECUTE_FAILED)
					throw new DAOException("Fail to update No3"+ j + " SQL");
			}
		}
	} catch (SQLException se) {
		log.error(se.getMessage(), se);
		throw new DAOException(new ErrorHandler(se).getMessage());
	} catch (DAOException de) {
		log.error(de.getMessage(), de);
		throw de;
	} catch (Exception e) {
		log.error(e.getMessage(), e);
		throw new DAOException(e.getMessage());
	}
}

/**
 * COM_CSR_0014 : CSR Cancel踰꾪듉���붾㈃濡쒕뱶<br>
 * A/P Rejected & Disapproved ���몃낫�댁뒪蹂�Cancel ��옣 - �ㅺ굔���곗씠�곕� �쇨큵�곸쑝濡�媛깆떊�쒕떎.
 * @param Collection<PayInvVO> payInvVOs
 * @throws DAOException
 */
public void multiRejectedCSRCancellation04(Collection<PayInvVO> payInvVOs) throws DAOException {
	log.debug("start multiRejectedCSRCancellation01 ==================");
	try {
		int updCnt4[] = null;
		if(payInvVOs.size() > 0){
			updCnt4 = new SQLExecuter("").executeBatch((ISQLTemplate)new ConsultationSlipRequestMgtDBDAOCSRCancellation4USQL(), payInvVOs, null);	//COM_APRO_CSR_DTL �낅뜲�댄듃
			for(int j = 0; j < updCnt4.length; j++){
				if(updCnt4[j]== Statement.EXECUTE_FAILED)
					throw new DAOException("Fail to update No4"+ j + " SQL");
			}
		}
	} catch (SQLException se) {
		log.error(se.getMessage(), se);
		throw new DAOException(new ErrorHandler(se).getMessage());
	} catch (DAOException de) {
		log.error(de.getMessage(), de);
		throw de;
	} catch (Exception e) {
		log.error(e.getMessage(), e);
		throw new DAOException(e.getMessage());
	}
}

/**
 * AP 濡��꾩넚��CSR �뺣낫瑜�媛�졇�⑤떎
 * @param String csrNo
 * @param String ofcCd
 * @return DBRowSet
 * @exception DAOException
 */
public DBRowSet searchApInvInfForEAIInterface(String csrNo, String ofcCd) throws DAOException {
	log.debug("start searchINFtoAP =======================");
	
	DBRowSet dbRowset = null;
	//query parameter
	Map<String, Object> param = new HashMap<String, Object>();
	//velocity parameter
	Map<String, Object> velParam = new HashMap<String, Object>();
    /**
     *        <LIFID>FNS008-0003</LIFID>
     *
     **/
    String pgmNo = "ESDCSRXXX"+JSPUtil.getKST("yyyyMMdd");
	try {
		param.put("pgm_no", pgmNo);
		param.put("csr_no", csrNo);
		param.put("ofc_cd", ofcCd);
		
		dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new ConsultationSlipRequestMgtDBDAOSearchINFtoAPRSQLRSQL(), param, velParam);
	} catch (SQLException se) {
		log.debug("#####################se.getMessage()============>"+se.getMessage());
		log.error(se.getMessage(), se);
		throw new DAOException(new ErrorHandler(se).getMessage());
	} catch (DAOException de) {
		log.error(de.getMessage(), de);
		throw de;
	} catch (Exception e) {
		log.error(e.getMessage(), e);
		throw new DAOException(e.getMessage());
	}
	return dbRowset;	
}

/**
 * EP - > CSR �몄텧
 * AP_INV_HDR �낅뜲�댄듃 
 * @param String csrNo
 * @param String titleName
 * @exception DAOException
 */
public void approvalRequestAccount(String csrNo, String titleName) throws DAOException
{
	//query parameter
	Map<String, Object> param = new HashMap<String, Object>();
	//velocity parameter
	Map<String, Object> velParam = new HashMap<String, Object>();
 
	int result = 0;
	try {
        Map<String, Object> mapVO = new HashMap<String, Object>();
        mapVO.put("csr_no", csrNo);
        mapVO.put("title_name", titleName);

		param.putAll(mapVO);
		velParam.putAll(mapVO);

		SQLExecuter sqlExe = new SQLExecuter("");
		result = sqlExe.executeUpdate((ISQLTemplate)new ConsultationSlipRequestMgtDBDAOapprovalRequestAccountUSQL(), param, velParam);
		if(result == Statement.EXECUTE_FAILED)
				throw new DAOException("Fail to Update SQL");
	} catch (SQLException se) {
		log.error(se.getMessage(),se);
		throw new DAOException(new ErrorHandler(se).getMessage());
	}catch(Exception ex){
		log.error(ex.getMessage(),ex);
		throw new DAOException(new ErrorHandler(ex).getMessage());
	}
	

}
 
/**
 * EP - > CSR �몄텧
 * HPC��AP_PAY_INV data update�섍린
 * @param String csrNo
 * @param String mode
 * @exception DAOException
 */
public void updateHPC(String csrNo, String mode) throws DAOException {
	log.debug("\n\n DAO.updateHPC - ########################################### ");
	if (mode==null || mode.trim().equals("")){
		throw new DAOException("unknown mode !!!!!!!");
	}
	
	//query parameter
	Map<String, Object> param = new HashMap<String, Object>();
	//velocity parameter
	Map<String, Object> velParam = new HashMap<String, Object>();
 
	int result = 0;
	try {
        Map<String, Object> mapVO = new HashMap<String, Object>();
        mapVO.put("csr_no", csrNo);
        mapVO.put("mode", mode);

		param.putAll(mapVO);
		velParam.putAll(mapVO);

		SQLExecuter sqlExe = new SQLExecuter("");
		result = sqlExe.executeUpdate((ISQLTemplate)new ConsultationSlipRequestMgtDBDAOupdateHPCUSQL(), param, velParam);
		if(result == Statement.EXECUTE_FAILED)
				throw new DAOException("Fail to Update SQL");
	} catch (SQLException se) {
		log.error(se.getMessage(),se);
		throw new DAOException(new ErrorHandler(se).getMessage());
	}catch(Exception ex){
		log.error(ex.getMessage(),ex);
		throw new DAOException(new ErrorHandler(ex).getMessage());
	}
}	

/**
 * COM_CSR_0002 : Approval Request 踰꾪듉 <br>
 * csr_no �앹꽦: csr_no 梨꾨쾲��ap_csr_no �뚯씠釉붿뿉 insert / >>>>>>>臾쇰쪟���λ퉬 �먭컻��援щ텇�쇰줈 CSR_NO 梨꾨쾲 [SM]
 * @param String costOfcCd
 * @return String
 * @exception DAOException
 */
public String srchPayGrpLuCd(String costOfcCd) throws DAOException {
	DBRowSet dbRowset = null;
	List<SrchPayGrpLuCdVO> list = null;
	SrchPayGrpLuCdVO rtnVO = null;
	//String ap_ctr_cd_gbn = "";
	String ap_ctr_cd_io = "";
	Map<String, Object> mapVO = new HashMap<String, Object>();
	//query parameter
	Map<String, Object> param = new HashMap<String, Object>();
	//velocity parameter
	Map<String, Object> velParam = new HashMap<String, Object>();

	try{
		mapVO.put("ofc_cd", 		costOfcCd);

		param.putAll(mapVO);
		velParam.putAll(mapVO);

		dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new ConsultationSlipRequestMgtDBDAOSrchPayGrpLuCdRSQL(), param, velParam);

		list = (List)RowSetUtil.rowSetToVOs(dbRowset, SrchPayGrpLuCdVO.class);

		if(list.size() > 0){	//csr_no 踰덊샇�곗삤湲�
			rtnVO = (SrchPayGrpLuCdVO)list.get(0);
			//ap_ctr_cd_gbn = rtnVO.getApCtrCdGbn();
			ap_ctr_cd_io = rtnVO.getApCtrCdIo();
		}
        
	}catch(SQLException se){
		log.error(se.getMessage(),se);
		throw new DAOException(new ErrorHandler(se).getMessage());
	}catch(Exception ex){
		log.error(ex.getMessage(),ex);
		throw new DAOException(new ErrorHandler(ex).getMessage());
	}
	return ap_ctr_cd_io;
}

/**
 * COM_CSR_0002 : Approval Request 踰꾪듉 <br>
 * AP_INV_DTRB ��INV_DESC �낅뜲�댄듃
 * @param String csrNo
 * @param String dtrbCoaAcctCd
 * @param String lineSeq
 * @param String lineNo
 * @exception DAOException
 */
public void modifyDesc(String csrNo, String dtrbCoaAcctCd, String lineSeq, String lineNo) throws DAOException {
	log.debug("\n DAO.modifyDesc --------------------------------------------------");
	
	Map<String, Object> mapVO 		= new HashMap<String, Object>();
	Map<String, Object> param 		= new HashMap<String, Object>();
	//velocity parameter
	Map<String, Object> velParam 	= new HashMap<String, Object>();
	
	try {
		mapVO.put("csr_no", 	csrNo);
		mapVO.put("dtrb_coa_acct_cd", 	dtrbCoaAcctCd);
		mapVO.put("line_seq", 	lineSeq);
		mapVO.put("line_no", 	lineNo);
		
		
		param.putAll(mapVO);
		velParam.putAll(mapVO);

		new SQLExecuter("").executeUpdate((ISQLTemplate)new ConsultationSlipRequestMgtDBDAOModifyDescUSQL(), param, velParam);

	} catch (SQLException se) {
		log.error(se.getMessage(), se);
		throw new DAOException(new ErrorHandler(se).getMessage());
	} catch (DAOException de) {
		log.error(de.getMessage(), de);
		throw de;
	} catch (Exception e) {
		log.error(e.getMessage(), e);
		throw new DAOException(e.getMessage());
	}
}


/**
 * COM_CSR_0002 : Approval Request 踰꾪듉 <br>
 * AP_INV_HDR ��INV_DESC �낅뜲�댄듃
 * @param String csrNo
 * @exception DAOException
 */
public void modifyHdrDesc(String csrNo) throws DAOException {
	log.debug("\n DAO.modifyHdrDesc --------------------------------------------------");
	
	Map<String, Object> mapVO 		= new HashMap<String, Object>();
	Map<String, Object> param 		= new HashMap<String, Object>();
	//velocity parameter
	Map<String, Object> velParam 	= new HashMap<String, Object>();
	
	try {
		mapVO.put("csr_no", 	csrNo);
		
		param.putAll(mapVO);
		velParam.putAll(mapVO);

		new SQLExecuter("").executeUpdate((ISQLTemplate)new ConsultationSlipRequestMgtDBDAOModifyHdrDescUSQL(), param, velParam);

	} catch (SQLException se) {
		log.error(se.getMessage(), se);
		throw new DAOException(new ErrorHandler(se).getMessage());
	} catch (DAOException de) {
		log.error(de.getMessage(), de);
		throw de;
	} catch (Exception e) {
		log.error(e.getMessage(), e);
		throw new DAOException(e.getMessage());
	}
}


/**
 * COM_CSR_0002 : Approval Request 踰꾪듉 <br>
 * AP_PAY_INV ��CSR_NO �낅뜲�댄듃 ��寃껋쓣 Null濡���
 * @param Collection<PayInvVO> payInvVOs
 * @exception DAOException
 * @exception EventException 
 */
public void upateInvCSRNoNull(Collection<PayInvVO> payInvVOs) throws DAOException, EventException {
	log.debug("\n DAO.upateInvCSRNoNull --------------------------------------------------");

	List al = new ArrayList();
	//velocity parameter
	Map<String, Object> velParam = new HashMap<String, Object>();
	try {
		Iterator itr = payInvVOs.iterator();
		PayInvVO model = null;
		int updCnt[] = null;
		
		while (itr.hasNext()) {
			model = (PayInvVO)itr.next();
    		if(!model.getIbflag().equals("")){
				Map<String, Object> mapVO2 = new HashMap<String, Object>();
				mapVO2.put("inv_rgst_no", 	JSPUtil.getNull(model.getInv_rgst_no() ));
				al.add(mapVO2);
    		}
		}
		
		SQLExecuter sqlExe = new SQLExecuter("");
		updCnt = sqlExe.executeBatch((ISQLTemplate)new ConsultationSlipRequestMgtDBDAOUdtInvCSRNoNullUSQL(), al, velParam);

		for(int j = 0; j < updCnt.length; j++){
			if(updCnt[j]== Statement.EXECUTE_FAILED)
				throw new DAOException("Fail to update No1"+ j + " SQL");
		}

	} catch (SQLException se) {
		log.error(se.getMessage(), se);
		throw new DAOException(new ErrorHandler(se).getMessage());
	} catch (DAOException de) {
		log.error(de.getMessage(), de);
		throw de;
	} catch (Exception e) {
		log.error(e.getMessage(), e);
		throw new DAOException(e.getMessage());
	}
}


/**
 * STM_SAP_0250 : interface batch<br>
 * modifySoInvoiceInterfaceResult
 * @param String csrNo
 * @param String ifErrRsn
 * @exception DAOException
 */
public void modifySoInvoiceInterfaceResult(String csrNo, String ifErrRsn) throws DAOException {
	
	Map<String, Object> mapVO 		= new HashMap<String, Object>();
	Map<String, Object> param 		= new HashMap<String, Object>();
	//velocity parameter
	Map<String, Object> velParam 	= new HashMap<String, Object>();
	
	try {
		mapVO.put("csr_no", 	csrNo);
		mapVO.put("if_err_rsn", 	ifErrRsn);
		
		param.putAll(mapVO);
		velParam.putAll(mapVO);

		new SQLExecuter("").executeUpdate((ISQLTemplate)new ConsultationSlipRequestMgtDBDAOModifySoInvoiceInterfaceResultUSQL(), param, velParam);

	} catch (SQLException se) {
		log.error(se.getMessage(), se);
		throw new DAOException(new ErrorHandler(se).getMessage());
	} catch (DAOException de) {
		log.error(de.getMessage(), de);
		throw de;
	} catch (Exception e) {
		log.error(e.getMessage(), e);
		throw new DAOException(e.getMessage());
	}
}

/**
 * STM_SAP_0250 : interface batch<br>
 * modifySoInvoiceInterfaceSucess
 * @param String csrNo
 * @exception DAOException
 */
public void modifySoInvoiceInterfaceSucess(String csrNo) throws DAOException {
	
	Map<String, Object> mapVO 		= new HashMap<String, Object>();
	Map<String, Object> param 		= new HashMap<String, Object>();
	//velocity parameter
	Map<String, Object> velParam 	= new HashMap<String, Object>();
	
	try {
		mapVO.put("csr_no", 	csrNo);		
		
		param.putAll(mapVO);
		velParam.putAll(mapVO);

		new SQLExecuter("").executeUpdate((ISQLTemplate)new ConsultationSlipRequestMgtDBDAOModifySoInvoiceInterfaceSucessUSQL(), param, velParam);

	} catch (SQLException se) {
		log.error(se.getMessage(), se);
		throw new DAOException(new ErrorHandler(se).getMessage());
	} catch (DAOException de) {
		log.error(de.getMessage(), de);
		throw de;
	} catch (Exception e) {
		log.error(e.getMessage(), e);
		throw new DAOException(e.getMessage());
	}
}


/**
 * STM_SAP_0250 : interface batch<br>
 * modifySoInvoiceInterfaceSucess
 * @param String csrNo
 * @param String invStsCd
 * @exception DAOException
 */
public void modifySoPayInvoiceInterface(String csrNo, String invStsCd) throws DAOException {
	
	Map<String, Object> mapVO 		= new HashMap<String, Object>();
	Map<String, Object> param 		= new HashMap<String, Object>();
	//velocity parameter
	Map<String, Object> velParam 	= new HashMap<String, Object>();
	
	try {
		mapVO.put("csr_no", 	    csrNo);		
		mapVO.put("inv_sts_cd", 	invStsCd);		
		
		param.putAll(mapVO);
		velParam.putAll(mapVO);

		new SQLExecuter("").executeUpdate((ISQLTemplate)new ConsultationSlipRequestMgtDBDAOModifySoPayInvoiceInterfaceUSQL(), param, velParam);

	} catch (SQLException se) {
		log.error(se.getMessage(), se);
		throw new DAOException(new ErrorHandler(se).getMessage());
	} catch (DAOException de) {
		log.error(de.getMessage(), de);
		throw de;
	} catch (Exception e) {
		log.error(e.getMessage(), e);
		throw new DAOException(e.getMessage());
	}
}


/**
 * STM_SAP_0250 : interface batch<br>
 * modifySoInvoiceInterfaceSucess
 * @param String invStsCd
 * @param String pay_bat_seq
 * @param String pay_bat_nm
 * @param String vndr_no
 * @exception DAOException
 */
public void modifySoPayInvoiceInterfaceBatchByStmSap(String invStsCd, String pay_bat_seq, String pay_bat_nm, String vndr_no) throws DAOException {
	
	Map<String, Object> mapVO 		= new HashMap<String, Object>();
	Map<String, Object> param 		= new HashMap<String, Object>();
	//velocity parameter
	Map<String, Object> velParam 	= new HashMap<String, Object>();
	
	try {
		mapVO.put("inv_sts_cd", 	invStsCd);	
		mapVO.put("pay_bat_seq", 	pay_bat_seq);	
		mapVO.put("pay_bat_nm", 	pay_bat_nm);	
		mapVO.put("vndr_no", 		vndr_no);	
		
		param.putAll(mapVO);
		velParam.putAll(mapVO);

		new SQLExecuter("").executeUpdate((ISQLTemplate)new ConsultationSlipRequestMgtDBDAOModifySoPayInvoiceInterfaceBatchByStmSapUSQL(), param, velParam);

	} catch (SQLException se) {
		log.error(se.getMessage(), se);
		throw new DAOException(new ErrorHandler(se).getMessage());
	} catch (DAOException de) {
		log.error(de.getMessage(), de);
		throw de;
	} catch (Exception e) {
		log.error(e.getMessage(), e);
		throw new DAOException(e.getMessage());
	}
}

/**
 * STM_SAP_0060 : interface payment<br>
 * modifyAPInvoiceByStmSap
 * @param String csr_no
 * @exception DAOException
 */
public void modifyAPInvoiceByStmSap(String csr_no) throws DAOException {
	
	Map<String, Object> mapVO 		= new HashMap<String, Object>();
	Map<String, Object> param 		= new HashMap<String, Object>();
	//velocity parameter
	Map<String, Object> velParam 	= new HashMap<String, Object>();
	
	try {
		mapVO.put("csr_no", 		csr_no);	
		param.putAll(mapVO);
		velParam.putAll(mapVO);

		new SQLExecuter("").executeUpdate((ISQLTemplate)new ConsultationSlipRequestMgtDBDAOModifyAPInvoiceByStmSapUSQL(), param, velParam);

	} catch (SQLException se) {
		log.error(se.getMessage(), se);
		throw new DAOException(new ErrorHandler(se).getMessage());
	} catch (DAOException de) {
		log.error(de.getMessage(), de);
		throw de;
	} catch (Exception e) {
		log.error(e.getMessage(), e);
		throw new DAOException(e.getMessage());
	}
}

/**
 * STM_SAP_0060 : interface payment<br>
 * modifyAPInvoiceByStmSap
 * @param String csr_no
 * @exception DAOException
 */
public void modifyAPInvoiceDeleteByStmSap(String csr_no) throws DAOException {
	
	Map<String, Object> mapVO 		= new HashMap<String, Object>();
	Map<String, Object> param 		= new HashMap<String, Object>();
	//velocity parameter
	Map<String, Object> velParam 	= new HashMap<String, Object>();
	
	try {
		mapVO.put("csr_no", 		csr_no);	
		param.putAll(mapVO);
		velParam.putAll(mapVO);

		new SQLExecuter("").executeUpdate((ISQLTemplate)new ConsultationSlipRequestMgtDBDAOModifyAPInvoiceDeleteByStmSapUSQL(), param, velParam);

	} catch (SQLException se) {
		log.error(se.getMessage(), se);
		throw new DAOException(new ErrorHandler(se).getMessage());
	} catch (DAOException de) {
		log.error(de.getMessage(), de);
		throw de;
	} catch (Exception e) {
		log.error(e.getMessage(), e);
		throw new DAOException(e.getMessage());
	}
}

/**
 * STM_SAP_0060 : interface payment<br>
 * modifyAPInvoiceByStmSap
 * @param String pay_bat_seq
 * @param String pay_bat_nm
 * @param String vndr_no
 * @exception DAOException
 */
public void modifyAPInvoicePayBatchByStmSap(String pay_bat_seq, String pay_bat_nm, String vndr_no) throws DAOException {
	
	Map<String, Object> mapVO 		= new HashMap<String, Object>();
	Map<String, Object> param 		= new HashMap<String, Object>();
	//velocity parameter
	Map<String, Object> velParam 	= new HashMap<String, Object>();
	
	try {
		mapVO.put("pay_bat_seq", 	pay_bat_seq);	
		mapVO.put("pay_bat_nm", 	pay_bat_nm);	
		mapVO.put("vndr_no", 		vndr_no);	
		
		param.putAll(mapVO);
		velParam.putAll(mapVO);

		new SQLExecuter("").executeUpdate((ISQLTemplate)new ConsultationSlipRequestMgtDBDAOModifyAPInvoicePayBatchByStmSapUSQL(), param, velParam);

	} catch (SQLException se) {
		log.error(se.getMessage(), se);
		throw new DAOException(new ErrorHandler(se).getMessage());
	} catch (DAOException de) {
		log.error(de.getMessage(), de);
		throw de;
	} catch (Exception e) {
		log.error(e.getMessage(), e);
		throw new DAOException(e.getMessage());
	}
}

/**
 * STM_SAP_0060 : interface payment<br>
 * modifyAPInvoiceRejectByStmSap
 * @param String csr_no
 * @param String rcv_err_flg
 * @param String rcv_err_rsn
 * @param String usr_id
 * @exception DAOException
 */
public void modifyAPInvoiceRejectByStmSap(String csr_no, String rcv_err_flg, String rcv_err_rsn,  String usr_id) throws DAOException {
	
	Map<String, Object> mapVO 		= new HashMap<String, Object>();
	Map<String, Object> param 		= new HashMap<String, Object>();
	//velocity parameter
	Map<String, Object> velParam 	= new HashMap<String, Object>();
	
	try { 
		
		mapVO.put("csr_no", 		csr_no);	
		mapVO.put("rcv_err_flg", 	rcv_err_flg);	
		mapVO.put("rcv_err_rsn", 	rcv_err_rsn);	
		mapVO.put("usr_id", 		usr_id);
		
		param.putAll(mapVO);
		velParam.putAll(mapVO);

		new SQLExecuter("").executeUpdate((ISQLTemplate)new ConsultationSlipRequestMgtDBDAOModifyAPInvoiceRejectByStmSapUSQL(), param, velParam);

	} catch (SQLException se) {
		log.error(se.getMessage(), se);
		throw new DAOException(new ErrorHandler(se).getMessage());
	} catch (DAOException de) {
		log.error(de.getMessage(), de);
		throw de;
	} catch (Exception e) {
		log.error(e.getMessage(), e);
		throw new DAOException(e.getMessage());
	}
}


/**
 * COM_CSR_0002 : Approval Request<br>
 * 2014.10.30 ACTIVITY DATE/PLACE LOGIC ADD by IY Cho
 * @param String module
 * @param String cost_cd
 * @param String acct_cd
 * @return DBRowSet
 * @exception DAOException
 */
public DBRowSet searchActivity(String module, String cost_cd, String acct_cd) throws DAOException {
	
	DBRowSet dbRowset = null;
	Map<String, Object> param 		= new HashMap<String, Object>();
	
	try { 
		param.put("module", 	module);	
		param.put("cost_cd", 	cost_cd);	
		param.put("acct_cd", 	acct_cd);	

		dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate)new ConsultationSlipRequestMgtDBDAOSearchActivityRSQL(), param, param);

	} catch (SQLException se) {
		log.error(se.getMessage(), se);
		throw new DAOException(new ErrorHandler(se).getMessage());
	} catch (DAOException de) {
		log.error(de.getMessage(), de);
		throw de;
	} catch (Exception e) {
		log.error(e.getMessage(), e);
		throw new DAOException(e.getMessage());
	}
	return dbRowset;	
}


/**
 * COM_CSR_0002 : Approval Request<br>
 * 2014.10.30 ACTIVITY DATE/PLACE LOGIC ADD by IY Cho
 * @param String csr_no
 * @param String line_seq
 * @param String act_dt
 * @param String act_plc
 * @exception DAOException
 */
public void modifyActivity(String csr_no, String line_seq, String act_dt, String act_plc) throws DAOException {
	
	Map<String, Object> param 		= new HashMap<String, Object>();
	
	try { 
		param.put("csr_no", 	csr_no);	
		param.put("line_seq", 	line_seq);	
		param.put("act_dt", 	act_dt);	
		param.put("act_plc", 	act_plc);	

		new SQLExecuter("").executeUpdate((ISQLTemplate)new ConsultationSlipRequestMgtDBDAOModifyActivityUSQL(), param, param);

	} catch (SQLException se) {
		log.error(se.getMessage(), se);
		throw new DAOException(new ErrorHandler(se).getMessage());
	} catch (DAOException de) {
		log.error(de.getMessage(), de);
		throw de;
	} catch (Exception e) {
		log.error(e.getMessage(), e);
		throw new DAOException(e.getMessage());
	}
}

/**
 * COM_CSR_0002 : Approval Request<br>
 * 2015.06.01 ACTIVITY DATE/PLACE ASSIGNMENT WHEN COST_CD IS NULL by IY Cho
 * @param String csr_no
 * @param String line_seq
 * @exception DAOException
 */
public void modifyActivity2(String csr_no, String line_seq) throws DAOException {
	
	Map<String, Object> param 		= new HashMap<String, Object>();
	
	try { 
		param.put("csr_no", 	csr_no);	
		param.put("line_seq", 	line_seq);

		new SQLExecuter("").executeUpdate((ISQLTemplate)new ConsultationSlipRequestMgtDBDAOModifyActivity2USQL(), param, param);

	} catch (SQLException se) {
		log.error(se.getMessage(), se);
		throw new DAOException(new ErrorHandler(se).getMessage());
	} catch (DAOException de) {
		log.error(de.getMessage(), de);
		throw de;
	} catch (Exception e) {
		log.error(e.getMessage(), e);
		throw new DAOException(e.getMessage());
	}
}

}