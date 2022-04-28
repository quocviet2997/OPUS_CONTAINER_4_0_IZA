/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : FmsBunkerVO.java
*@FileTitle : FmsBunkerVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.02.16
*@LastModifier : 안성인
*@LastVersion : 1.0
* 2009.02.16 안성인 
* 1.0 Creation
=========================================================*/

package com.clt.syscommon.common.table;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import com.clt.framework.component.common.AbstractValueObject;
import com.clt.framework.component.util.JSPUtil;

/**
 * Table Value Ojbect<br>
 * - PDTO(Data Transfer Object including Parameters)<br>
 * - 관련 Event에서 작성, 서버실행요청시 PDTO의 역할을 수행하는 Value Object<br>
 *
 * @author 안성인
 * @since J2EE 1.5
 */

public class FmsBunkerVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<FmsBunkerVO> models = new ArrayList<FmsBunkerVO>();
	
	/* Column Inpo */
	private String acctCd = null;
	/* Column Inpo */
	private String slpFuncCd = null;
	/* Column Inpo */
	private String acctItmSeq = null;
	/* Column Inpo */
	private String updUsrId = null;
	/* Column Inpo */
	private String ifDt = null;
	/* Column Inpo */
	private String updDt = null;
	/* Column Inpo */
	private String vslCd = null;
	/* Column Inpo */
	private String bnkPrcAmt = null;
	/* Column Inpo */
	private String slpTeamCd = null;
	/* Column Inpo */
	private String bnkYrmon = null;
	/* Column Inpo */
	private String fletMeasUtCd = null;
	/* Status */
	private String ibflag = null;
	/* Column Inpo */
	private String bnkQty = null;
	/* Column Inpo */
	private String skdDirCd = null;
	/* Column Inpo */
	private String slpTpCd = null;
	/* Column Inpo */
	private String slpIssDt = null;
	/* Column Inpo */
	private String revDirCd = null;
	/* Column Inpo */
	private String bnkDt = null;
	/* Column Inpo */
	private String bnkTpCd = null;
	/* Column Inpo */
	private String bnkSeq = null;
	/* Column Inpo */
	private String slpSeqNo = null;
	/* Column Inpo */
	private String creDt = null;
	/* Column Inpo */
	private String skdVoyNo = null;
	/* Column Inpo */
	private String creUsrId = null;
	/* Column Inpo */
	private String fletCtrtNo = null;
	/* Column Inpo */
	private String portCd = null;
	/* Column Inpo */
	private String slpSerNo = null;
	/* Page Number */
	private String pagerows = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	hashFildInpo	*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public FmsBunkerVO() {}

	public FmsBunkerVO(String ibflag, String pagerows, String fletCtrtNo, String bnkSeq, String bnkYrmon, String bnkTpCd, String acctCd, String acctItmSeq, String bnkDt, String vslCd, String skdVoyNo, String skdDirCd, String revDirCd, String portCd, String fletMeasUtCd, String bnkQty, String bnkPrcAmt, String slpTpCd, String slpFuncCd, String slpTeamCd, String slpIssDt, String slpSerNo, String slpSeqNo, String ifDt, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.acctCd = acctCd;
		this.slpFuncCd = slpFuncCd;
		this.acctItmSeq = acctItmSeq;
		this.updUsrId = updUsrId;
		this.ifDt = ifDt;
		this.updDt = updDt;
		this.vslCd = vslCd;
		this.bnkPrcAmt = bnkPrcAmt;
		this.slpTeamCd = slpTeamCd;
		this.bnkYrmon = bnkYrmon;
		this.fletMeasUtCd = fletMeasUtCd;
		this.ibflag = ibflag;
		this.bnkQty = bnkQty;
		this.skdDirCd = skdDirCd;
		this.slpTpCd = slpTpCd;
		this.slpIssDt = slpIssDt;
		this.revDirCd = revDirCd;
		this.bnkDt = bnkDt;
		this.bnkTpCd = bnkTpCd;
		this.bnkSeq = bnkSeq;
		this.slpSeqNo = slpSeqNo;
		this.creDt = creDt;
		this.skdVoyNo = skdVoyNo;
		this.creUsrId = creUsrId;
		this.fletCtrtNo = fletCtrtNo;
		this.portCd = portCd;
		this.slpSerNo = slpSerNo;
		this.pagerows = pagerows;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("acct_cd", getAcctCd());
		this.hashColumns.put("slp_func_cd", getSlpFuncCd());
		this.hashColumns.put("acct_itm_seq", getAcctItmSeq());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("if_dt", getIfDt());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("bnk_prc_amt", getBnkPrcAmt());
		this.hashColumns.put("slp_team_cd", getSlpTeamCd());
		this.hashColumns.put("bnk_yrmon", getBnkYrmon());
		this.hashColumns.put("flet_meas_ut_cd", getFletMeasUtCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("bnk_qty", getBnkQty());
		this.hashColumns.put("skd_dir_cd", getSkdDirCd());
		this.hashColumns.put("slp_tp_cd", getSlpTpCd());
		this.hashColumns.put("slp_iss_dt", getSlpIssDt());
		this.hashColumns.put("rev_dir_cd", getRevDirCd());
		this.hashColumns.put("bnk_dt", getBnkDt());
		this.hashColumns.put("bnk_tp_cd", getBnkTpCd());
		this.hashColumns.put("bnk_seq", getBnkSeq());
		this.hashColumns.put("slp_seq_no", getSlpSeqNo());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("skd_voy_no", getSkdVoyNo());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("flet_ctrt_no", getFletCtrtNo());
		this.hashColumns.put("port_cd", getPortCd());
		this.hashColumns.put("slp_ser_no", getSlpSerNo());
		this.hashColumns.put("pagerows", getPagerows());
		return this.hashColumns;
	}
	
	/**
	 * hashFildInpo
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("acct_cd", "acctCd");
		this.hashFields.put("slp_func_cd", "slpFuncCd");
		this.hashFields.put("acct_itm_seq", "acctItmSeq");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("if_dt", "ifDt");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("bnk_prc_amt", "bnkPrcAmt");
		this.hashFields.put("slp_team_cd", "slpTeamCd");
		this.hashFields.put("bnk_yrmon", "bnkYrmon");
		this.hashFields.put("flet_meas_ut_cd", "fletMeasUtCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("bnk_qty", "bnkQty");
		this.hashFields.put("skd_dir_cd", "skdDirCd");
		this.hashFields.put("slp_tp_cd", "slpTpCd");
		this.hashFields.put("slp_iss_dt", "slpIssDt");
		this.hashFields.put("rev_dir_cd", "revDirCd");
		this.hashFields.put("bnk_dt", "bnkDt");
		this.hashFields.put("bnk_tp_cd", "bnkTpCd");
		this.hashFields.put("bnk_seq", "bnkSeq");
		this.hashFields.put("slp_seq_no", "slpSeqNo");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("skd_voy_no", "skdVoyNo");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("flet_ctrt_no", "fletCtrtNo");
		this.hashFields.put("port_cd", "portCd");
		this.hashFields.put("slp_ser_no", "slpSerNo");
		this.hashFields.put("pagerows", "pagerows");
		return this.hashFields;
	}
	
	public String getAcctCd() {
		return this.acctCd;
	}
	public String getSlpFuncCd() {
		return this.slpFuncCd;
	}
	public String getAcctItmSeq() {
		return this.acctItmSeq;
	}
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	public String getIfDt() {
		return this.ifDt;
	}
	public String getUpdDt() {
		return this.updDt;
	}
	public String getVslCd() {
		return this.vslCd;
	}
	public String getBnkPrcAmt() {
		return this.bnkPrcAmt;
	}
	public String getSlpTeamCd() {
		return this.slpTeamCd;
	}
	public String getBnkYrmon() {
		return this.bnkYrmon;
	}
	public String getFletMeasUtCd() {
		return this.fletMeasUtCd;
	}
	public String getIbflag() {
		return this.ibflag;
	}
	public String getBnkQty() {
		return this.bnkQty;
	}
	public String getSkdDirCd() {
		return this.skdDirCd;
	}
	public String getSlpTpCd() {
		return this.slpTpCd;
	}
	public String getSlpIssDt() {
		return this.slpIssDt;
	}
	public String getRevDirCd() {
		return this.revDirCd;
	}
	public String getBnkDt() {
		return this.bnkDt;
	}
	public String getBnkTpCd() {
		return this.bnkTpCd;
	}
	public String getBnkSeq() {
		return this.bnkSeq;
	}
	public String getSlpSeqNo() {
		return this.slpSeqNo;
	}
	public String getCreDt() {
		return this.creDt;
	}
	public String getSkdVoyNo() {
		return this.skdVoyNo;
	}
	public String getCreUsrId() {
		return this.creUsrId;
	}
	public String getFletCtrtNo() {
		return this.fletCtrtNo;
	}
	public String getPortCd() {
		return this.portCd;
	}
	public String getSlpSerNo() {
		return this.slpSerNo;
	}
	public String getPagerows() {
		return this.pagerows;
	}

	public void setAcctCd(String acctCd) {
		this.acctCd = acctCd;
		//this.acctCd=true;
	}
	public void setSlpFuncCd(String slpFuncCd) {
		this.slpFuncCd = slpFuncCd;
		//this.slpFuncCd=true;
	}
	public void setAcctItmSeq(String acctItmSeq) {
		this.acctItmSeq = acctItmSeq;
		//this.acctItmSeq=true;
	}
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
		//this.updUsrId=true;
	}
	public void setIfDt(String ifDt) {
		this.ifDt = ifDt;
		//this.ifDt=true;
	}
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
		//this.updDt=true;
	}
	public void setVslCd(String vslCd) {
		this.vslCd = vslCd;
		//this.vslCd=true;
	}
	public void setBnkPrcAmt(String bnkPrcAmt) {
		this.bnkPrcAmt = bnkPrcAmt;
		//this.bnkPrcAmt=true;
	}
	public void setSlpTeamCd(String slpTeamCd) {
		this.slpTeamCd = slpTeamCd;
		//this.slpTeamCd=true;
	}
	public void setBnkYrmon(String bnkYrmon) {
		this.bnkYrmon = bnkYrmon;
		//this.bnkYrmon=true;
	}
	public void setFletMeasUtCd(String fletMeasUtCd) {
		this.fletMeasUtCd = fletMeasUtCd;
		//this.fletMeasUtCd=true;
	}
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setBnkQty(String bnkQty) {
		this.bnkQty = bnkQty;
		//this.bnkQty=true;
	}
	public void setSkdDirCd(String skdDirCd) {
		this.skdDirCd = skdDirCd;
		//this.skdDirCd=true;
	}
	public void setSlpTpCd(String slpTpCd) {
		this.slpTpCd = slpTpCd;
		//this.slpTpCd=true;
	}
	public void setSlpIssDt(String slpIssDt) {
		this.slpIssDt = slpIssDt;
		//this.slpIssDt=true;
	}
	public void setRevDirCd(String revDirCd) {
		this.revDirCd = revDirCd;
		//this.revDirCd=true;
	}
	public void setBnkDt(String bnkDt) {
		this.bnkDt = bnkDt;
		//this.bnkDt=true;
	}
	public void setBnkTpCd(String bnkTpCd) {
		this.bnkTpCd = bnkTpCd;
		//this.bnkTpCd=true;
	}
	public void setBnkSeq(String bnkSeq) {
		this.bnkSeq = bnkSeq;
		//this.bnkSeq=true;
	}
	public void setSlpSeqNo(String slpSeqNo) {
		this.slpSeqNo = slpSeqNo;
		//this.slpSeqNo=true;
	}
	public void setCreDt(String creDt) {
		this.creDt = creDt;
		//this.creDt=true;
	}
	public void setSkdVoyNo(String skdVoyNo) {
		this.skdVoyNo = skdVoyNo;
		//this.skdVoyNo=true;
	}
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
		//this.creUsrId=true;
	}
	public void setFletCtrtNo(String fletCtrtNo) {
		this.fletCtrtNo = fletCtrtNo;
		//this.fletCtrtNo=true;
	}
	public void setPortCd(String portCd) {
		this.portCd = portCd;
		//this.portCd=true;
	}
	public void setSlpSerNo(String slpSerNo) {
		this.slpSerNo = slpSerNo;
		//this.slpSerNo=true;
	}
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}
	public void fromRequest(HttpServletRequest request) {
		setAcctCd(JSPUtil.getParameter(request, "acct_cd", ""));
		setSlpFuncCd(JSPUtil.getParameter(request, "slp_func_cd", ""));
		setAcctItmSeq(JSPUtil.getParameter(request, "acct_itm_seq", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setIfDt(JSPUtil.getParameter(request, "if_dt", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setVslCd(JSPUtil.getParameter(request, "vsl_cd", ""));
		setBnkPrcAmt(JSPUtil.getParameter(request, "bnk_prc_amt", ""));
		setSlpTeamCd(JSPUtil.getParameter(request, "slp_team_cd", ""));
		setBnkYrmon(JSPUtil.getParameter(request, "bnk_yrmon", ""));
		setFletMeasUtCd(JSPUtil.getParameter(request, "flet_meas_ut_cd", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setBnkQty(JSPUtil.getParameter(request, "bnk_qty", ""));
		setSkdDirCd(JSPUtil.getParameter(request, "skd_dir_cd", ""));
		setSlpTpCd(JSPUtil.getParameter(request, "slp_tp_cd", ""));
		setSlpIssDt(JSPUtil.getParameter(request, "slp_iss_dt", ""));
		setRevDirCd(JSPUtil.getParameter(request, "rev_dir_cd", ""));
		setBnkDt(JSPUtil.getParameter(request, "bnk_dt", ""));
		setBnkTpCd(JSPUtil.getParameter(request, "bnk_tp_cd", ""));
		setBnkSeq(JSPUtil.getParameter(request, "bnk_seq", ""));
		setSlpSeqNo(JSPUtil.getParameter(request, "slp_seq_no", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setSkdVoyNo(JSPUtil.getParameter(request, "skd_voy_no", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setFletCtrtNo(JSPUtil.getParameter(request, "flet_ctrt_no", ""));
		setPortCd(JSPUtil.getParameter(request, "port_cd", ""));
		setSlpSerNo(JSPUtil.getParameter(request, "slp_ser_no", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
	}

	public FmsBunkerVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public FmsBunkerVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		FmsBunkerVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] acctCd = (JSPUtil.getParameter(request, prefix	+ "acct_cd".trim(), length));
			String[] slpFuncCd = (JSPUtil.getParameter(request, prefix	+ "slp_func_cd".trim(), length));
			String[] acctItmSeq = (JSPUtil.getParameter(request, prefix	+ "acct_itm_seq".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] ifDt = (JSPUtil.getParameter(request, prefix	+ "if_dt".trim(), length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd".trim(), length));
			String[] bnkPrcAmt = (JSPUtil.getParameter(request, prefix	+ "bnk_prc_amt".trim(), length));
			String[] slpTeamCd = (JSPUtil.getParameter(request, prefix	+ "slp_team_cd".trim(), length));
			String[] bnkYrmon = (JSPUtil.getParameter(request, prefix	+ "bnk_yrmon".trim(), length));
			String[] fletMeasUtCd = (JSPUtil.getParameter(request, prefix	+ "flet_meas_ut_cd".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] bnkQty = (JSPUtil.getParameter(request, prefix	+ "bnk_qty".trim(), length));
			String[] skdDirCd = (JSPUtil.getParameter(request, prefix	+ "skd_dir_cd".trim(), length));
			String[] slpTpCd = (JSPUtil.getParameter(request, prefix	+ "slp_tp_cd".trim(), length));
			String[] slpIssDt = (JSPUtil.getParameter(request, prefix	+ "slp_iss_dt".trim(), length));
			String[] revDirCd = (JSPUtil.getParameter(request, prefix	+ "rev_dir_cd".trim(), length));
			String[] bnkDt = (JSPUtil.getParameter(request, prefix	+ "bnk_dt".trim(), length));
			String[] bnkTpCd = (JSPUtil.getParameter(request, prefix	+ "bnk_tp_cd".trim(), length));
			String[] bnkSeq = (JSPUtil.getParameter(request, prefix	+ "bnk_seq".trim(), length));
			String[] slpSeqNo = (JSPUtil.getParameter(request, prefix	+ "slp_seq_no".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] skdVoyNo = (JSPUtil.getParameter(request, prefix	+ "skd_voy_no".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] fletCtrtNo = (JSPUtil.getParameter(request, prefix	+ "flet_ctrt_no".trim(), length));
			String[] portCd = (JSPUtil.getParameter(request, prefix	+ "port_cd".trim(), length));
			String[] slpSerNo = (JSPUtil.getParameter(request, prefix	+ "slp_ser_no".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new FmsBunkerVO();
				if (acctCd[i] != null)
					model.setAcctCd(acctCd[i]);
				if (slpFuncCd[i] != null)
					model.setSlpFuncCd(slpFuncCd[i]);
				if (acctItmSeq[i] != null)
					model.setAcctItmSeq(acctItmSeq[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (ifDt[i] != null)
					model.setIfDt(ifDt[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (bnkPrcAmt[i] != null)
					model.setBnkPrcAmt(bnkPrcAmt[i]);
				if (slpTeamCd[i] != null)
					model.setSlpTeamCd(slpTeamCd[i]);
				if (bnkYrmon[i] != null)
					model.setBnkYrmon(bnkYrmon[i]);
				if (fletMeasUtCd[i] != null)
					model.setFletMeasUtCd(fletMeasUtCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (bnkQty[i] != null)
					model.setBnkQty(bnkQty[i]);
				if (skdDirCd[i] != null)
					model.setSkdDirCd(skdDirCd[i]);
				if (slpTpCd[i] != null)
					model.setSlpTpCd(slpTpCd[i]);
				if (slpIssDt[i] != null)
					model.setSlpIssDt(slpIssDt[i]);
				if (revDirCd[i] != null)
					model.setRevDirCd(revDirCd[i]);
				if (bnkDt[i] != null)
					model.setBnkDt(bnkDt[i]);
				if (bnkTpCd[i] != null)
					model.setBnkTpCd(bnkTpCd[i]);
				if (bnkSeq[i] != null)
					model.setBnkSeq(bnkSeq[i]);
				if (slpSeqNo[i] != null)
					model.setSlpSeqNo(slpSeqNo[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (skdVoyNo[i] != null)
					model.setSkdVoyNo(skdVoyNo[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (fletCtrtNo[i] != null)
					model.setFletCtrtNo(fletCtrtNo[i]);
				if (portCd[i] != null)
					model.setPortCd(portCd[i]);
				if (slpSerNo[i] != null)
					model.setSlpSerNo(slpSerNo[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {}
		return getFmsBunkerVOs();
	}

	public FmsBunkerVO[] getFmsBunkerVOs(){
		FmsBunkerVO[] vos = (FmsBunkerVO[])models.toArray(new FmsBunkerVO[models.size()]);
		return vos;
	}
	
	public String toString() {
		StringBuffer ret = new StringBuffer();
		Field[] field = this.getClass().getDeclaredFields();
		String space = "";
		try{
			for(int i = 0; i < field.length; i++){
				String[] arr = null;
				arr = getField(field, i);
				if(arr != null){
					for(int j = 0; j < arr.length; j++) {
						ret.append(field[i].getName().concat(space).substring(0, 30).concat("= ") + arr[j] + "\n");
					}
				} else {
					ret.append(field[i].getName() + " =  null \n");
				}
			}
		} catch (Exception ex) {}
		return ret.toString();
	}
	
	/**
	 * 각 클래스 해당하는 필드 정보를 배열에 담는다 
	 * @param field
	 * @param i
	 * @return String[]
	 * @throws IllegalAccessException
	 */
	private String[] getField(Field[] field, int i) throws IllegalAccessException {
		String[] arr;
		try{
			arr = (String[]) field[i].get(this);
		}catch(Exception ex){
			arr = new String[1];
			arr[0] = String.valueOf(field[i].get(this));
		}
		return arr;
	}
	
	/**
	* DataFormat 설정
	*/
	public void onDataFormat(){
		this.acctCd = this.acctCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slpFuncCd = this.slpFuncCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.acctItmSeq = this.acctItmSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ifDt = this.ifDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslCd = this.vslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bnkPrcAmt = this.bnkPrcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slpTeamCd = this.slpTeamCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bnkYrmon = this.bnkYrmon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fletMeasUtCd = this.fletMeasUtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bnkQty = this.bnkQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdDirCd = this.skdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slpTpCd = this.slpTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slpIssDt = this.slpIssDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.revDirCd = this.revDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bnkDt = this.bnkDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bnkTpCd = this.bnkTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bnkSeq = this.bnkSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slpSeqNo = this.slpSeqNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdVoyNo = this.skdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fletCtrtNo = this.fletCtrtNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.portCd = this.portCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slpSerNo = this.slpSerNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
