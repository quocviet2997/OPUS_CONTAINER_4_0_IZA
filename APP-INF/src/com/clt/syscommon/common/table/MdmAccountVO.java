/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : MdmAccountVO.java
*@FileTitle : MdmAccountVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.04.20
*@LastModifier : 김석준
*@LastVersion : 1.0
* 2009.04.20 김석준 
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
 * @author 김석준
 * @since J2EE 1.5
 */

public class MdmAccountVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<MdmAccountVO> models = new ArrayList<MdmAccountVO>();
	
	/* Column Inpo */
	private String acctCd = null;
	/* Column Inpo */
	private String acctgMngTpCd = null;
	/* Column Inpo */
	private String vvdLvlFlg3 = null;
	/* Column Inpo */
	private String eaiEvntDt = null;
	/* Column Inpo */
	private String budUseFlg = null;
	/* Column Inpo */
	private String vvdLvlFlg2 = null;
	/* Column Inpo */
	private String updUsrId = null;
	/* Column Inpo */
	private String updDt = null;
	/* Column Inpo */
	private String pndTgtFlg = null;
	/* Column Inpo */
	private String deltFlg = null;
	/* Column Inpo */
	private String vvdLvlFlg5 = null;
	/* Status */
	private String ibflag = null;
	/* Column Inpo */
	private String acctKrnNm = null;
	/* Column Inpo */
	private String vvdLvlFlg1 = null;
	/* Column Inpo */
	private String budIfFlg = null;
	/* Column Inpo */
	private String entrExpnFlg = null;
	/* Column Inpo */
	private String estmTgtFlg = null;
	/* Column Inpo */
	private String autoCurrXchRtFlg = null;
	/* Column Inpo */
	private String jnlCreFlg = null;
	/* Column Inpo */
	private String creDt = null;
	/* Column Inpo */
	private String creUsrId = null;
	/* Column Inpo */
	private String acctEngNm = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Inpo */
	private String vvdLvlFlg4 = null;
	/* Column Inpo */
	private String vvdLvlFlg6 = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	hashFildInpo	*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public MdmAccountVO() {}

	public MdmAccountVO(String ibflag, String pagerows, String acctCd, String acctEngNm, String acctKrnNm, String budIfFlg, String budUseFlg, String jnlCreFlg, String acctgMngTpCd, String pndTgtFlg, String estmTgtFlg, String vvdLvlFlg1, String vvdLvlFlg2, String vvdLvlFlg3, String vvdLvlFlg4, String vvdLvlFlg5, String vvdLvlFlg6, String autoCurrXchRtFlg, String entrExpnFlg, String creUsrId, String creDt, String updUsrId, String updDt, String deltFlg, String eaiEvntDt) {
		this.acctCd = acctCd;
		this.acctgMngTpCd = acctgMngTpCd;
		this.vvdLvlFlg3 = vvdLvlFlg3;
		this.eaiEvntDt = eaiEvntDt;
		this.budUseFlg = budUseFlg;
		this.vvdLvlFlg2 = vvdLvlFlg2;
		this.updUsrId = updUsrId;
		this.updDt = updDt;
		this.pndTgtFlg = pndTgtFlg;
		this.deltFlg = deltFlg;
		this.vvdLvlFlg5 = vvdLvlFlg5;
		this.ibflag = ibflag;
		this.acctKrnNm = acctKrnNm;
		this.vvdLvlFlg1 = vvdLvlFlg1;
		this.budIfFlg = budIfFlg;
		this.entrExpnFlg = entrExpnFlg;
		this.estmTgtFlg = estmTgtFlg;
		this.autoCurrXchRtFlg = autoCurrXchRtFlg;
		this.jnlCreFlg = jnlCreFlg;
		this.creDt = creDt;
		this.creUsrId = creUsrId;
		this.acctEngNm = acctEngNm;
		this.pagerows = pagerows;
		this.vvdLvlFlg4 = vvdLvlFlg4;
		this.vvdLvlFlg6 = vvdLvlFlg6;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("acct_cd", getAcctCd());
		this.hashColumns.put("acctg_mng_tp_cd", getAcctgMngTpCd());
		this.hashColumns.put("vvd_lvl_flg3", getVvdLvlFlg3());
		this.hashColumns.put("eai_evnt_dt", getEaiEvntDt());
		this.hashColumns.put("bud_use_flg", getBudUseFlg());
		this.hashColumns.put("vvd_lvl_flg2", getVvdLvlFlg2());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("pnd_tgt_flg", getPndTgtFlg());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("vvd_lvl_flg5", getVvdLvlFlg5());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("acct_krn_nm", getAcctKrnNm());
		this.hashColumns.put("vvd_lvl_flg1", getVvdLvlFlg1());
		this.hashColumns.put("bud_if_flg", getBudIfFlg());
		this.hashColumns.put("entr_expn_flg", getEntrExpnFlg());
		this.hashColumns.put("estm_tgt_flg", getEstmTgtFlg());
		this.hashColumns.put("auto_curr_xch_rt_flg", getAutoCurrXchRtFlg());
		this.hashColumns.put("jnl_cre_flg", getJnlCreFlg());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("acct_eng_nm", getAcctEngNm());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("vvd_lvl_flg4", getVvdLvlFlg4());
		this.hashColumns.put("vvd_lvl_flg6", getVvdLvlFlg6());
		return this.hashColumns;
	}
	
	/**
	 * hashFildInpo
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("acct_cd", "acctCd");
		this.hashFields.put("acctg_mng_tp_cd", "acctgMngTpCd");
		this.hashFields.put("vvd_lvl_flg3", "vvdLvlFlg3");
		this.hashFields.put("eai_evnt_dt", "eaiEvntDt");
		this.hashFields.put("bud_use_flg", "budUseFlg");
		this.hashFields.put("vvd_lvl_flg2", "vvdLvlFlg2");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("pnd_tgt_flg", "pndTgtFlg");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("vvd_lvl_flg5", "vvdLvlFlg5");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("acct_krn_nm", "acctKrnNm");
		this.hashFields.put("vvd_lvl_flg1", "vvdLvlFlg1");
		this.hashFields.put("bud_if_flg", "budIfFlg");
		this.hashFields.put("entr_expn_flg", "entrExpnFlg");
		this.hashFields.put("estm_tgt_flg", "estmTgtFlg");
		this.hashFields.put("auto_curr_xch_rt_flg", "autoCurrXchRtFlg");
		this.hashFields.put("jnl_cre_flg", "jnlCreFlg");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("acct_eng_nm", "acctEngNm");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("vvd_lvl_flg4", "vvdLvlFlg4");
		this.hashFields.put("vvd_lvl_flg6", "vvdLvlFlg6");
		return this.hashFields;
	}
	
	public String getAcctCd() {
		return this.acctCd;
	}
	public String getAcctgMngTpCd() {
		return this.acctgMngTpCd;
	}
	public String getVvdLvlFlg3() {
		return this.vvdLvlFlg3;
	}
	public String getEaiEvntDt() {
		return this.eaiEvntDt;
	}
	public String getBudUseFlg() {
		return this.budUseFlg;
	}
	public String getVvdLvlFlg2() {
		return this.vvdLvlFlg2;
	}
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	public String getUpdDt() {
		return this.updDt;
	}
	public String getPndTgtFlg() {
		return this.pndTgtFlg;
	}
	public String getDeltFlg() {
		return this.deltFlg;
	}
	public String getVvdLvlFlg5() {
		return this.vvdLvlFlg5;
	}
	public String getIbflag() {
		return this.ibflag;
	}
	public String getAcctKrnNm() {
		return this.acctKrnNm;
	}
	public String getVvdLvlFlg1() {
		return this.vvdLvlFlg1;
	}
	public String getBudIfFlg() {
		return this.budIfFlg;
	}
	public String getEntrExpnFlg() {
		return this.entrExpnFlg;
	}
	public String getEstmTgtFlg() {
		return this.estmTgtFlg;
	}
	public String getAutoCurrXchRtFlg() {
		return this.autoCurrXchRtFlg;
	}
	public String getJnlCreFlg() {
		return this.jnlCreFlg;
	}
	public String getCreDt() {
		return this.creDt;
	}
	public String getCreUsrId() {
		return this.creUsrId;
	}
	public String getAcctEngNm() {
		return this.acctEngNm;
	}
	public String getPagerows() {
		return this.pagerows;
	}
	public String getVvdLvlFlg4() {
		return this.vvdLvlFlg4;
	}
	public String getVvdLvlFlg6() {
		return this.vvdLvlFlg6;
	}

	public void setAcctCd(String acctCd) {
		this.acctCd = acctCd;
		//this.acctCd=true;
	}
	public void setAcctgMngTpCd(String acctgMngTpCd) {
		this.acctgMngTpCd = acctgMngTpCd;
		//this.acctgMngTpCd=true;
	}
	public void setVvdLvlFlg3(String vvdLvlFlg3) {
		this.vvdLvlFlg3 = vvdLvlFlg3;
		//this.vvdLvlFlg3=true;
	}
	public void setEaiEvntDt(String eaiEvntDt) {
		this.eaiEvntDt = eaiEvntDt;
		//this.eaiEvntDt=true;
	}
	public void setBudUseFlg(String budUseFlg) {
		this.budUseFlg = budUseFlg;
		//this.budUseFlg=true;
	}
	public void setVvdLvlFlg2(String vvdLvlFlg2) {
		this.vvdLvlFlg2 = vvdLvlFlg2;
		//this.vvdLvlFlg2=true;
	}
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
		//this.updUsrId=true;
	}
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
		//this.updDt=true;
	}
	public void setPndTgtFlg(String pndTgtFlg) {
		this.pndTgtFlg = pndTgtFlg;
		//this.pndTgtFlg=true;
	}
	public void setDeltFlg(String deltFlg) {
		this.deltFlg = deltFlg;
		//this.deltFlg=true;
	}
	public void setVvdLvlFlg5(String vvdLvlFlg5) {
		this.vvdLvlFlg5 = vvdLvlFlg5;
		//this.vvdLvlFlg5=true;
	}
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setAcctKrnNm(String acctKrnNm) {
		this.acctKrnNm = acctKrnNm;
		//this.acctKrnNm=true;
	}
	public void setVvdLvlFlg1(String vvdLvlFlg1) {
		this.vvdLvlFlg1 = vvdLvlFlg1;
		//this.vvdLvlFlg1=true;
	}
	public void setBudIfFlg(String budIfFlg) {
		this.budIfFlg = budIfFlg;
		//this.budIfFlg=true;
	}
	public void setEntrExpnFlg(String entrExpnFlg) {
		this.entrExpnFlg = entrExpnFlg;
		//this.entrExpnFlg=true;
	}
	public void setEstmTgtFlg(String estmTgtFlg) {
		this.estmTgtFlg = estmTgtFlg;
		//this.estmTgtFlg=true;
	}
	public void setAutoCurrXchRtFlg(String autoCurrXchRtFlg) {
		this.autoCurrXchRtFlg = autoCurrXchRtFlg;
		//this.autoCurrXchRtFlg=true;
	}
	public void setJnlCreFlg(String jnlCreFlg) {
		this.jnlCreFlg = jnlCreFlg;
		//this.jnlCreFlg=true;
	}
	public void setCreDt(String creDt) {
		this.creDt = creDt;
		//this.creDt=true;
	}
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
		//this.creUsrId=true;
	}
	public void setAcctEngNm(String acctEngNm) {
		this.acctEngNm = acctEngNm;
		//this.acctEngNm=true;
	}
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}
	public void setVvdLvlFlg4(String vvdLvlFlg4) {
		this.vvdLvlFlg4 = vvdLvlFlg4;
		//this.vvdLvlFlg4=true;
	}
	public void setVvdLvlFlg6(String vvdLvlFlg6) {
		this.vvdLvlFlg6 = vvdLvlFlg6;
		//this.vvdLvlFlg6=true;
	}
	public void fromRequest(HttpServletRequest request) {
		setAcctCd(JSPUtil.getParameter(request, "acct_cd", ""));
		setAcctgMngTpCd(JSPUtil.getParameter(request, "acctg_mng_tp_cd", ""));
		setVvdLvlFlg3(JSPUtil.getParameter(request, "vvd_lvl_flg3", ""));
		setEaiEvntDt(JSPUtil.getParameter(request, "eai_evnt_dt", ""));
		setBudUseFlg(JSPUtil.getParameter(request, "bud_use_flg", ""));
		setVvdLvlFlg2(JSPUtil.getParameter(request, "vvd_lvl_flg2", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setPndTgtFlg(JSPUtil.getParameter(request, "pnd_tgt_flg", ""));
		setDeltFlg(JSPUtil.getParameter(request, "delt_flg", ""));
		setVvdLvlFlg5(JSPUtil.getParameter(request, "vvd_lvl_flg5", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setAcctKrnNm(JSPUtil.getParameter(request, "acct_krn_nm", ""));
		setVvdLvlFlg1(JSPUtil.getParameter(request, "vvd_lvl_flg1", ""));
		setBudIfFlg(JSPUtil.getParameter(request, "bud_if_flg", ""));
		setEntrExpnFlg(JSPUtil.getParameter(request, "entr_expn_flg", ""));
		setEstmTgtFlg(JSPUtil.getParameter(request, "estm_tgt_flg", ""));
		setAutoCurrXchRtFlg(JSPUtil.getParameter(request, "auto_curr_xch_rt_flg", ""));
		setJnlCreFlg(JSPUtil.getParameter(request, "jnl_cre_flg", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setAcctEngNm(JSPUtil.getParameter(request, "acct_eng_nm", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setVvdLvlFlg4(JSPUtil.getParameter(request, "vvd_lvl_flg4", ""));
		setVvdLvlFlg6(JSPUtil.getParameter(request, "vvd_lvl_flg6", ""));
	}

	public MdmAccountVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public MdmAccountVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		MdmAccountVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] acctCd = (JSPUtil.getParameter(request, prefix	+ "acct_cd".trim(), length));
			String[] acctgMngTpCd = (JSPUtil.getParameter(request, prefix	+ "acctg_mng_tp_cd".trim(), length));
			String[] vvdLvlFlg3 = (JSPUtil.getParameter(request, prefix	+ "vvd_lvl_flg3".trim(), length));
			String[] eaiEvntDt = (JSPUtil.getParameter(request, prefix	+ "eai_evnt_dt".trim(), length));
			String[] budUseFlg = (JSPUtil.getParameter(request, prefix	+ "bud_use_flg".trim(), length));
			String[] vvdLvlFlg2 = (JSPUtil.getParameter(request, prefix	+ "vvd_lvl_flg2".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] pndTgtFlg = (JSPUtil.getParameter(request, prefix	+ "pnd_tgt_flg".trim(), length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg".trim(), length));
			String[] vvdLvlFlg5 = (JSPUtil.getParameter(request, prefix	+ "vvd_lvl_flg5".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] acctKrnNm = (JSPUtil.getParameter(request, prefix	+ "acct_krn_nm".trim(), length));
			String[] vvdLvlFlg1 = (JSPUtil.getParameter(request, prefix	+ "vvd_lvl_flg1".trim(), length));
			String[] budIfFlg = (JSPUtil.getParameter(request, prefix	+ "bud_if_flg".trim(), length));
			String[] entrExpnFlg = (JSPUtil.getParameter(request, prefix	+ "entr_expn_flg".trim(), length));
			String[] estmTgtFlg = (JSPUtil.getParameter(request, prefix	+ "estm_tgt_flg".trim(), length));
			String[] autoCurrXchRtFlg = (JSPUtil.getParameter(request, prefix	+ "auto_curr_xch_rt_flg".trim(), length));
			String[] jnlCreFlg = (JSPUtil.getParameter(request, prefix	+ "jnl_cre_flg".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] acctEngNm = (JSPUtil.getParameter(request, prefix	+ "acct_eng_nm".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] vvdLvlFlg4 = (JSPUtil.getParameter(request, prefix	+ "vvd_lvl_flg4".trim(), length));
			String[] vvdLvlFlg6 = (JSPUtil.getParameter(request, prefix	+ "vvd_lvl_flg6".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new MdmAccountVO();
				if (acctCd[i] != null)
					model.setAcctCd(acctCd[i]);
				if (acctgMngTpCd[i] != null)
					model.setAcctgMngTpCd(acctgMngTpCd[i]);
				if (vvdLvlFlg3[i] != null)
					model.setVvdLvlFlg3(vvdLvlFlg3[i]);
				if (eaiEvntDt[i] != null)
					model.setEaiEvntDt(eaiEvntDt[i]);
				if (budUseFlg[i] != null)
					model.setBudUseFlg(budUseFlg[i]);
				if (vvdLvlFlg2[i] != null)
					model.setVvdLvlFlg2(vvdLvlFlg2[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (pndTgtFlg[i] != null)
					model.setPndTgtFlg(pndTgtFlg[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (vvdLvlFlg5[i] != null)
					model.setVvdLvlFlg5(vvdLvlFlg5[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (acctKrnNm[i] != null)
					model.setAcctKrnNm(acctKrnNm[i]);
				if (vvdLvlFlg1[i] != null)
					model.setVvdLvlFlg1(vvdLvlFlg1[i]);
				if (budIfFlg[i] != null)
					model.setBudIfFlg(budIfFlg[i]);
				if (entrExpnFlg[i] != null)
					model.setEntrExpnFlg(entrExpnFlg[i]);
				if (estmTgtFlg[i] != null)
					model.setEstmTgtFlg(estmTgtFlg[i]);
				if (autoCurrXchRtFlg[i] != null)
					model.setAutoCurrXchRtFlg(autoCurrXchRtFlg[i]);
				if (jnlCreFlg[i] != null)
					model.setJnlCreFlg(jnlCreFlg[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (acctEngNm[i] != null)
					model.setAcctEngNm(acctEngNm[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (vvdLvlFlg4[i] != null)
					model.setVvdLvlFlg4(vvdLvlFlg4[i]);
				if (vvdLvlFlg6[i] != null)
					model.setVvdLvlFlg6(vvdLvlFlg6[i]);
				models.add(model);
			}

		} catch (Exception e) {}
		return getMdmAccountVOs();
	}

	public MdmAccountVO[] getMdmAccountVOs(){
		MdmAccountVO[] vos = (MdmAccountVO[])models.toArray(new MdmAccountVO[models.size()]);
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
		this.acctgMngTpCd = this.acctgMngTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vvdLvlFlg3 = this.vvdLvlFlg3 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eaiEvntDt = this.eaiEvntDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.budUseFlg = this.budUseFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vvdLvlFlg2 = this.vvdLvlFlg2 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pndTgtFlg = this.pndTgtFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vvdLvlFlg5 = this.vvdLvlFlg5 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.acctKrnNm = this.acctKrnNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vvdLvlFlg1 = this.vvdLvlFlg1 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.budIfFlg = this.budIfFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.entrExpnFlg = this.entrExpnFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.estmTgtFlg = this.estmTgtFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.autoCurrXchRtFlg = this.autoCurrXchRtFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.jnlCreFlg = this.jnlCreFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.acctEngNm = this.acctEngNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vvdLvlFlg4 = this.vvdLvlFlg4 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vvdLvlFlg6 = this.vvdLvlFlg6 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
