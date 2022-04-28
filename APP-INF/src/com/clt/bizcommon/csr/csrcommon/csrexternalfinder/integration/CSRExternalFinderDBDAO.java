/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CSRExternalFinderDBDAO.java
*@FileTitle : 공통유틸
*Open Issues :
*Change history :
*@LastModifyDate : 2009.10.15
*@LastModifier : 함대성
*@LastVersion : 1.0
* 2009.10.15 함대성
* 1.0 Creation
* -------------------------------------------------------
* History
* 2010.10.18 김영철 [CHM-201006348-01] CSR 전표 Remark 보완 - INV_DESC 추가
=========================================================*/
package com.clt.bizcommon.csr.csrcommon.csrexternalfinder.integration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.clt.bizcommon.csr.csrcommon.csrexternalfinder.vo.SpCsrVO;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.component.util.JSPUtil;
import com.clt.framework.component.util.loggable.LoggableStateFactory;
import com.clt.framework.component.util.loggable.LoggableStatement;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.db.ISQLTemplate;
import com.clt.framework.support.db.RowSetUtil;
import com.clt.framework.support.db.SQLExecuter;
import com.clt.framework.support.layer.integration.DBDAOSupport;
import com.clt.syscommon.common.table.ApPayInvDtlVO;
import com.clt.syscommon.common.table.ApPayInvVO;
 
/**
 * ALPS CSRExternalFinderDBDAO <br>
 * - ALPS-CSRExternalFinderDBDAO system Business Logic을 처리하기 위한 JDBC 작업수행.<br>
 * 
 * @author Dohyoung Lee
 * @see CSRExternalFinderBCImpl 참조
 * @since J2EE 1.4
 */
public class CSRExternalFinderDBDAO extends DBDAOSupport {

	private String dataSource = "";
	
//	/**
//	 * 패라미터라이즈 생성자
//	 * @param dataSource
//	 */
//	public CSRExternalFinderDBDAO(String dataSource) {
//		this.dataSource = dataSource ;
//	}
//	
//	/**
//	 * default 생성자.
//	 */
//	public CSRExternalFinderDBDAO() {
//		this.dataSource = "" ;
//	}

	/**
	 * CSR_0001 : 공통<br>
	 * vendor체크 조회 처리<br>
	 * @param String vndrSeq
	 * @return List<SpCsrVO>
	 * @exception EventException
	 */
	 public List<SpCsrVO> checkVendor(String vndrSeq) throws DAOException {
		DBRowSet dbRowset = null;  
		List<SpCsrVO> list = null;
			
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter 
		Map<String, Object> velParam = new HashMap<String, Object>(); 
		try{ 
			Map<String, String> mapVO = new HashMap<String, String>();
			mapVO.put("vndr_seq", vndrSeq);
		    
			param.putAll(mapVO);           
			velParam.putAll(mapVO);
			
			dbRowset = new SQLExecuter(this.dataSource).executeQuery((ISQLTemplate)new CSRExternalFinderDBDAOSpCsrVORSQL(), param, velParam);
			list = (List)RowSetUtil.rowSetToVOs(dbRowset, SpCsrVO .class);
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
		 * CSR_0008 : 공통<br>
		 * 권한 로케이션 날짜 조회 처리<br>
		 * @param String ofcCd
		 * @return List<SpCsrVO>
		 * @exception EventException
		 */
	 public List<SpCsrVO> getDBdate(String ofcCd) throws DAOException {
		DBRowSet dbRowset = null;  
		List<SpCsrVO> list = null;
			
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter 
		Map<String, Object> velParam = new HashMap<String, Object>(); 
		try{ 
			Map<String, String> mapVO = new HashMap<String, String>();
			mapVO.put("ofc_cd", ofcCd);
		    
			param.putAll(mapVO);           
			velParam.putAll(mapVO);
			
			dbRowset = new SQLExecuter(this.dataSource).executeQuery((ISQLTemplate)new CSRExternalFinderDBDAODBdateRSQL(), param, velParam);
			list = (List)RowSetUtil.rowSetToVOs(dbRowset, SpCsrVO .class);
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
	 * CSR_0008 : 공통<br>
	 * Office change기능 추가로 인해 session의 ofc_cd를 기준으로 (session이 아닌) MDM의 cnt_cd를 조회 <br>
	 * @param String ofcCd
	 * @return String
	 * @exception EventException
	 */
	public String getMDMCntCd(String ofcCd) throws DAOException {
		log.debug("\n DAO.getMDMCnt_cd \n");
		
		DBRowSet dbRowset = null;
		String cnt_cd = "";
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();

		try{
			Map<String, String> mapVO = new HashMap<String, String>();
			mapVO.put("ofc_cd", ofcCd);

			param.putAll(mapVO);
			velParam.putAll(mapVO);

			dbRowset = new SQLExecuter(this.dataSource).executeQuery((ISQLTemplate)new CSRExternalFinderDBDAOGetMdmCntCdRSQL(), param, velParam);
			while(dbRowset.next()){
				cnt_cd = dbRowset.getString("cnt_cd");
            }
		}catch(SQLException se){
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return JSPUtil.getNull(cnt_cd);
	} 
	
	/**
	 * AP연계 인터페이스 : 공통
	 * INV_RGST_NO 조회<br>
	 * @param ApPayInvVO apPayInvVO
	 * @return String
	 * @exception EventException
	 */
	public String srchInvRgstNo(ApPayInvVO apPayInvVO) throws DAOException {
		log.debug("\n DAO.srchInvRgstNo \n");
		
		DBRowSet dbRowset = null;
		String invRgstNo = "";
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();

		try{
			Map<String, String> mapVO = new HashMap<String, String>();
			mapVO.put("inv_ofc_cd", apPayInvVO.getInvOfcCd());

			param.putAll(mapVO);
			velParam.putAll(mapVO);

			dbRowset = new SQLExecuter(this.dataSource).executeQuery((ISQLTemplate)new CSRExternalFinderDBDAOSrchInvRgstNoRSQL(), param, velParam);
			while(dbRowset.next()){
				invRgstNo = dbRowset.getString("inv_rgst_no");
            }
		}catch(SQLException se){
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return JSPUtil.getNull(invRgstNo);
	} 

	/**
	 * AP연계 인터페이스 : 공통
	 * AP_PAY_INV 생성<br>
	 * @param ApPayInvVO apPayInvVO
	 * @exception EventException
	 */
	public void addApPayInv(ApPayInvVO apPayInvVO) throws DAOException, Exception {
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();
		try {
			Map<String, String> mapVO = apPayInvVO.getColumnValues();

			param.putAll(mapVO);
			velParam.putAll(mapVO);
			
			SQLExecuter sqlExe = new SQLExecuter(this.dataSource);
			int result = sqlExe.executeUpdate((ISQLTemplate)new CSRExternalFinderDBDAOAddApPayInvCSQL(), param, velParam);
			if(result == Statement.EXECUTE_FAILED) {
				throw new DAOException("Fail to insert SQL");
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
	 * AP연계 인터페이스 : 공통
	 * AP_PAY_INV 수정<br>
	 * @param ApPayInvVO apPayInvVO
	 * @exception EventException
	 */
	public void modifyApPayInv(ApPayInvVO apPayInvVO) throws DAOException, Exception {
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();
		try {
			Map<String, String> mapVO = apPayInvVO.getColumnValues();

			param.putAll(mapVO);
			velParam.putAll(mapVO);
				
			SQLExecuter sqlExe = new SQLExecuter(this.dataSource);
			int result = sqlExe.executeUpdate((ISQLTemplate)new CSRExternalFinderDBDAOModifyApPayInvVOUSQL(), param, velParam);
			if(result == Statement.EXECUTE_FAILED) {
				throw new DAOException("Fail to insert SQL");
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
	 * AP연계 인터페이스 : 공통
	 * AP_PAY_INV_DTL목록 일괄 생성<br>
	 * @param List<ApPayInvDtlVO> apPayInvDtlVOs
	 * @exception EventException
	 */
	public void addApPayInvDtl(List<ApPayInvDtlVO> apPayInvDtlVOs) throws DAOException, Exception {
		try {
			SQLExecuter sqlExe = new SQLExecuter();
			//int insCnt[] = null;
			Iterator itr = apPayInvDtlVOs.iterator();
			ApPayInvDtlVO model = null;
			Map<String, Object> mapVO = new HashMap<String, Object>();
			//query parameter
			Map<String, Object> param = new HashMap<String, Object>();
			//velocity parameter
			Map<String, Object> velParam = new HashMap<String, Object>();
			
			String vslCd = "";
			String acctCd = "";
			
			while (itr.hasNext()) {
				model  = (ApPayInvDtlVO)itr.next();
				vslCd  = JSPUtil.getNull(model.getVslCd());
				acctCd = JSPUtil.getNull(model.getAcctCd());
				log.info("\n[][addApPayInvDtl] >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> vslCd = " + vslCd);
				if(vslCd.equals("")){
					log.error("\n\n vsl_cd :" + vslCd + " --------------------- \n\n");
					throw new DAOException((new ErrorHandler("CSR00087")).getMessage());
				}
				if(acctCd.equals("")){
					log.error("\n\n acct_cd :" + acctCd + " --------------------- \n\n");
					throw new DAOException((new ErrorHandler("CSR00092")).getMessage());
				}
				
				mapVO.put("inv_rgst_no",	JSPUtil.getNull(model.getInvRgstNo()));
				mapVO.put("lgs_cost_cd",	JSPUtil.getNull(model.getLgsCostCd()));
				mapVO.put("acct_cd",		JSPUtil.getNull(model.getAcctCd()));
				mapVO.put("vsl_cd",			JSPUtil.getNull(model.getVslCd()));
				mapVO.put("skd_voy_no",		JSPUtil.getNull(model.getSkdVoyNo()));
				mapVO.put("skd_dir_cd",		JSPUtil.getNull(model.getSkdDirCd()));
				mapVO.put("rev_dir_cd",		JSPUtil.getNull(model.getRevDirCd()));
				mapVO.put("slan_cd",		JSPUtil.getNull(model.getSlanCd()));
				mapVO.put("act_vvd_cd",		JSPUtil.getNull(model.getActVvdCd()));
				mapVO.put("port_cd",		JSPUtil.getNull(model.getPortCd()));
				mapVO.put("yd_cd",			JSPUtil.getNull(model.getYdCd()));
				mapVO.put("cntr_tpsz_cd",	JSPUtil.getNull(model.getCntrTpszCd()));
				mapVO.put("inv_amt",		JSPUtil.getNull(model.getInvAmt()));
				mapVO.put("so_20ft_qty",	JSPUtil.getNull(model.getSo20ftQty()));
				mapVO.put("so_40ft_qty",	JSPUtil.getNull(model.getSo40ftQty()));
				mapVO.put("so_teu_qty",		JSPUtil.getNull(model.getSoTeuQty()));
				mapVO.put("so_ut_qty",		JSPUtil.getNull(model.getSoUtQty()));
				mapVO.put("so_ofc_cty_cd",	JSPUtil.getNull(model.getSoOfcCtyCd()));
				mapVO.put("so_seq",			JSPUtil.getNull(model.getSoSeq()));
				mapVO.put("delt_flg",		JSPUtil.getNull(model.getDeltFlg()));
				mapVO.put("cre_usr_id",		JSPUtil.getNull(model.getCreUsrId()));
				mapVO.put("cre_dt",			JSPUtil.getNull(model.getCreDt()));
				mapVO.put("upd_usr_id",		JSPUtil.getNull(model.getUpdUsrId()));
				mapVO.put("inv_desc",		JSPUtil.getNull(model.getInvDesc()));
				mapVO.put("act_plc",		JSPUtil.getNull(model.getActPlc()));
				mapVO.put("act_dt",		JSPUtil.getNull(model.getActDt())); 
				mapVO.put("stl_key_no",     JSPUtil.getNull(model.getStlKeyNo()));
				mapVO.put("ownr_vndr_seq",  JSPUtil.getNull(model.getOwnrVndrSeq()));
				
				//mapVO.put("cost_ofc_cd", costOfcCd);
				
				param.putAll(mapVO);
				velParam.putAll(mapVO);
				
			    sqlExe.executeUpdate((ISQLTemplate)new CSRExternalFinderDBDAOAddApPayInvDtlVOCSQL(), param, velParam);
			}
		} catch(SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch (DAOException de) {
			log.error(de.getMessage(), de);
			throw de;
		} catch(Exception ex){
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
	}
	
	/**
	 * AP연계 인터페이스 : 공통
	 * AP_PAY_INV_DTL목록 일괄 수정<br>
	 * @param List<ApPayInvDtlVO> apPayInvDtlVOs
	 * @exception EventException
	 */
	public void modifyApPayInvDtl(List<ApPayInvDtlVO> apPayInvDtlVOs) throws DAOException, Exception {
		try {
			SQLExecuter sqlExe = new SQLExecuter();
			int insCnt[] = null;
			if(apPayInvDtlVOs.size() > 0) {
				insCnt = sqlExe.executeBatch((ISQLTemplate)new CSRExternalFinderDBDAOModifyApPayInvDtlVOUSQL(), apPayInvDtlVOs, null);
				for(int i = 0; i < insCnt.length; i++) {
					if(insCnt[i] == Statement.EXECUTE_FAILED)
						throw new DAOException("Fail to insert No"+ i + " SQL");
				}
			}
		} catch(SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch(Exception ex){
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
	}
	
	/**
	 * AP연계 인터페이스 : 공통
	 * 비교할 INV_AMT 와 Currency에따른 소수점 적용된 INV_AMT 비교 체크 - 결과값이 0 이아니면 CSR00081에러<br>
	 * @param ApPayInvVO apPayInvVO
	 * @exception EventException
	 */
	public void searchApInvAmtChk(ApPayInvVO apPayInvVO) throws DAOException {
		
		DBRowSet dbRowset = null;
		// query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		// velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();

		String amtChk 	 = "";
		String invNetAmt = "";
		String invAmt 	 = "";
		
		try {
			param.put("inv_net_amt", apPayInvVO.getInvNetAmt());
			param.put("inv_rgst_no", apPayInvVO.getInvRgstNo());			
			
			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate) new CSRExternalFinderDBDAOSearchApInvAmtChkRSQL(), param, velParam);
			
			if(dbRowset!=null){
				while(dbRowset.next()){
					amtChk	= dbRowset.getString("AMTCHK");
					invNetAmt = dbRowset.getString("INV_NET_AMT");
					invAmt = dbRowset.getString("INV_AMT");
					log.info("\n[][searchApInvAmtChk] >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> invNetAmt = " + invNetAmt + " : invAmt = " + invAmt );
					if(!amtChk.equals("0")){
						log.error("\n\n Wrong INV_NET_AMT :" + invNetAmt + " / INV_NET_AMT:" + invAmt + " --------------------- \n\n");
						throw new DAOException((new ErrorHandler("CSR00081", new String[]{apPayInvVO.getInvCurrCd(), apPayInvVO.getInvNetAmt()})).getMessage());
					}
				}						
			}
		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler(se).getMessage(), se);
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
		return;		
	}
	
	/**
	 * AP연계 인터페이스 : 공통
	 * 비교할 INV_AMT 와 Currency에따른 소수점 적용된 INV_AMT 비교 체크 - 결과값이 0 이아니면 CSR00081에러<br>
	 * @param ApPayInvVO apPayInvVO
	 * @exception EventException
	 */
	public void searchApInvVsAmtChk(ApPayInvVO apPayInvVO) throws DAOException {
		DBRowSet dbRowset = null;
		// query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		// velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();
		String amtChk 	 = "";
		
		try {
			param.put("inv_rqst_no", apPayInvVO.getInvRgstNo());

			dbRowset = new SQLExecuter("").executeQuery((ISQLTemplate) new CSRExternalFinderDBDAOSearchApInvVsAmtChkRSQL(), param, velParam);

			if(dbRowset!=null){
				while(dbRowset.next()){
					amtChk	= dbRowset.getString("amtChk");
					if(!amtChk.equals("0")){
						log.info("\n[][searchApInvVsAmtChk] >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> AMTCHK = " + amtChk );
						throw new DAOException(new ErrorHandler("CSR00080").getMessage());
					}
				}
			}
		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler(se).getMessage(), se);
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage(), ex);
		}
		return;
	}
	  
	/**
	 * AP연계 인터페이스 : 공통
	 * INV_RGST_NO 조회<br>
	 * @param ApPayInvVO apPayInvVO
	 * @exception EventException
	 */
	public void searchStsChk(ApPayInvVO apPayInvVO) throws DAOException {
		log.debug("\n DAO.srchInvRgstNo \n");
		
		DBRowSet dbRowset = null;
		String invStsCd = "";
		String invNo = "";
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();

		try{
			Map<String, String> mapVO = new HashMap<String, String>();
			mapVO.put("inv_rgst_no", apPayInvVO.getInvRgstNo());
			mapVO.put("inv_sub_sys_cd", apPayInvVO.getInvSubSysCd());
			mapVO.put("inv_ofc_cd", apPayInvVO.getInvOfcCd());

			param.putAll(mapVO);
			velParam.putAll(mapVO);

			dbRowset = new SQLExecuter(this.dataSource).executeQuery((ISQLTemplate)new CSRExternalFinderDBDAOStsChkRSQL(), param, velParam);
			while(dbRowset.next()){
				invStsCd = dbRowset.getString("inv_sts_cd");
				invNo = dbRowset.getString("inv_no");
            }
			
			log.info("\n[][searchStsChk] >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> inv_rgst_no :" + invNo + ", inv_sts_cd" + invStsCd);
			if(invStsCd.equals("E") || invStsCd.equals("R") || invStsCd.equals("J") ||invStsCd.equals("P") || invStsCd.equals("D") || invStsCd.equals("A")){	//invStsCd.equals("C") || 
				throw new DAOException((new ErrorHandler("CSR00089", new String[]{invNo, invStsCd})).getMessage());
			}
		}catch(SQLException se){
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch (DAOException de) {
			log.error(de.getMessage(), de);
			throw de;
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return;
	} 
	
	/**
	 * AP연계 인터페이스 : 공통
	 * INV_RGST_NO 조회<br>
	 * @param ApPayInvVO apPayInvVO
	 * @exception EventException
	 */
	public void searchInvNOChk(ApPayInvVO apPayInvVO) throws DAOException {
		log.debug("\n DAO.srchInvRgstNo \n");
		
		DBRowSet dbRowset = null;
		int invNoCnt = 0;
		//query parameter
		Map<String, Object> param = new HashMap<String, Object>();
		//velocity parameter
		Map<String, Object> velParam = new HashMap<String, Object>();

		try{
			Map<String, String> mapVO = new HashMap<String, String>();
			mapVO.put("inv_no", apPayInvVO.getInvNo());
			mapVO.put("vndr_seq", apPayInvVO.getVndrSeq());

			param.putAll(mapVO);
			velParam.putAll(mapVO);

			dbRowset = new SQLExecuter(this.dataSource).executeQuery((ISQLTemplate)new CSRExternalFinderDBDAOInvNoChkRSQL(), param, velParam);
			while(dbRowset.next()){
				invNoCnt = dbRowset.getInt("cnt"); 
            }
			
			log.info("\n[][searchInvNOChk] >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> inv_no :" + apPayInvVO.getInvNo() );
			if(invNoCnt > 0){
				throw new DAOException((new ErrorHandler("CSR00090", new String[]{apPayInvVO.getInvNo() })).getMessage());
			}
		}catch(SQLException se){
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		}catch (DAOException de) {
			log.error(de.getMessage(), de);
			throw de;
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		return;
	} 
}
