/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : InvRevAcctCdVO.java
*@FileTitle : InvRevAcctCdVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.11
*@LastModifier : 정휘택
*@LastVersion : 1.0
* 2009.05.11 정휘택 
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
 * @author 정휘택
 * @since J2EE 1.5
 */

public class InvRevAcctCdVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<InvRevAcctCdVO> models = new ArrayList<InvRevAcctCdVO>();
	
	/* Column Info */
	private String repChgCd = null;
	/* Status */
	private String ibflag = null;
	/* Column Info */
	private String acctCd = null;
	/* Column Info */
	private String acctKrnNm = null;
	/* Column Info */
	private String revTpSrcCd = null;
	/* Column Info */
	private String prcDivCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String invSrcCd = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String invAcctDivCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String revTpGrpCd = null;
	/* Column Info */
	private String chgCd = null;
	/* Column Info */
	private String acctEngNm = null;
	/* Page Number */
	private String pagerows = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	hashFildInpo	*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public InvRevAcctCdVO() {}

	public InvRevAcctCdVO(String ibflag, String pagerows, String invSrcCd, String revTpGrpCd, String revTpSrcCd, String invAcctDivCd, String chgCd, String acctCd, String acctKrnNm, String acctEngNm, String prcDivCd, String deltFlg, String repChgCd, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.repChgCd = repChgCd;
		this.ibflag = ibflag;
		this.acctCd = acctCd;
		this.acctKrnNm = acctKrnNm;
		this.revTpSrcCd = revTpSrcCd;
		this.prcDivCd = prcDivCd;
		this.updUsrId = updUsrId;
		this.invSrcCd = invSrcCd;
		this.updDt = updDt;
		this.invAcctDivCd = invAcctDivCd;
		this.creDt = creDt;
		this.deltFlg = deltFlg;
		this.creUsrId = creUsrId;
		this.revTpGrpCd = revTpGrpCd;
		this.chgCd = chgCd;
		this.acctEngNm = acctEngNm;
		this.pagerows = pagerows;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("rep_chg_cd", getRepChgCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("acct_cd", getAcctCd());
		this.hashColumns.put("acct_krn_nm", getAcctKrnNm());
		this.hashColumns.put("rev_tp_src_cd", getRevTpSrcCd());
		this.hashColumns.put("prc_div_cd", getPrcDivCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("inv_src_cd", getInvSrcCd());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("inv_acct_div_cd", getInvAcctDivCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("rev_tp_grp_cd", getRevTpGrpCd());
		this.hashColumns.put("chg_cd", getChgCd());
		this.hashColumns.put("acct_eng_nm", getAcctEngNm());
		this.hashColumns.put("pagerows", getPagerows());
		return this.hashColumns;
	}
	
	/**
	 * hashFildInpo
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("rep_chg_cd", "repChgCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("acct_cd", "acctCd");
		this.hashFields.put("acct_krn_nm", "acctKrnNm");
		this.hashFields.put("rev_tp_src_cd", "revTpSrcCd");
		this.hashFields.put("prc_div_cd", "prcDivCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("inv_src_cd", "invSrcCd");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("inv_acct_div_cd", "invAcctDivCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("rev_tp_grp_cd", "revTpGrpCd");
		this.hashFields.put("chg_cd", "chgCd");
		this.hashFields.put("acct_eng_nm", "acctEngNm");
		this.hashFields.put("pagerows", "pagerows");
		return this.hashFields;
	}
	
	public String getRepChgCd() {
		return this.repChgCd;
	}
	public String getIbflag() {
		return this.ibflag;
	}
	public String getAcctCd() {
		return this.acctCd;
	}
	public String getAcctKrnNm() {
		return this.acctKrnNm;
	}
	public String getRevTpSrcCd() {
		return this.revTpSrcCd;
	}
	public String getPrcDivCd() {
		return this.prcDivCd;
	}
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	public String getInvSrcCd() {
		return this.invSrcCd;
	}
	public String getUpdDt() {
		return this.updDt;
	}
	public String getInvAcctDivCd() {
		return this.invAcctDivCd;
	}
	public String getCreDt() {
		return this.creDt;
	}
	public String getDeltFlg() {
		return this.deltFlg;
	}
	public String getCreUsrId() {
		return this.creUsrId;
	}
	public String getRevTpGrpCd() {
		return this.revTpGrpCd;
	}
	public String getChgCd() {
		return this.chgCd;
	}
	public String getAcctEngNm() {
		return this.acctEngNm;
	}
	public String getPagerows() {
		return this.pagerows;
	}

	public void setRepChgCd(String repChgCd) {
		this.repChgCd = repChgCd;
		//this.repChgCd=true;
	}
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setAcctCd(String acctCd) {
		this.acctCd = acctCd;
		//this.acctCd=true;
	}
	public void setAcctKrnNm(String acctKrnNm) {
		this.acctKrnNm = acctKrnNm;
		//this.acctKrnNm=true;
	}
	public void setRevTpSrcCd(String revTpSrcCd) {
		this.revTpSrcCd = revTpSrcCd;
		//this.revTpSrcCd=true;
	}
	public void setPrcDivCd(String prcDivCd) {
		this.prcDivCd = prcDivCd;
		//this.prcDivCd=true;
	}
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
		//this.updUsrId=true;
	}
	public void setInvSrcCd(String invSrcCd) {
		this.invSrcCd = invSrcCd;
		//this.invSrcCd=true;
	}
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
		//this.updDt=true;
	}
	public void setInvAcctDivCd(String invAcctDivCd) {
		this.invAcctDivCd = invAcctDivCd;
		//this.invAcctDivCd=true;
	}
	public void setCreDt(String creDt) {
		this.creDt = creDt;
		//this.creDt=true;
	}
	public void setDeltFlg(String deltFlg) {
		this.deltFlg = deltFlg;
		//this.deltFlg=true;
	}
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
		//this.creUsrId=true;
	}
	public void setRevTpGrpCd(String revTpGrpCd) {
		this.revTpGrpCd = revTpGrpCd;
		//this.revTpGrpCd=true;
	}
	public void setChgCd(String chgCd) {
		this.chgCd = chgCd;
		//this.chgCd=true;
	}
	public void setAcctEngNm(String acctEngNm) {
		this.acctEngNm = acctEngNm;
		//this.acctEngNm=true;
	}
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}
	public void fromRequest(HttpServletRequest request) {
		setRepChgCd(JSPUtil.getParameter(request, "rep_chg_cd", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setAcctCd(JSPUtil.getParameter(request, "acct_cd", ""));
		setAcctKrnNm(JSPUtil.getParameter(request, "acct_krn_nm", ""));
		setRevTpSrcCd(JSPUtil.getParameter(request, "rev_tp_src_cd", ""));
		setPrcDivCd(JSPUtil.getParameter(request, "prc_div_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setInvSrcCd(JSPUtil.getParameter(request, "inv_src_cd", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setInvAcctDivCd(JSPUtil.getParameter(request, "inv_acct_div_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setDeltFlg(JSPUtil.getParameter(request, "delt_flg", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setRevTpGrpCd(JSPUtil.getParameter(request, "rev_tp_grp_cd", ""));
		setChgCd(JSPUtil.getParameter(request, "chg_cd", ""));
		setAcctEngNm(JSPUtil.getParameter(request, "acct_eng_nm", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
	}

	public InvRevAcctCdVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public InvRevAcctCdVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		InvRevAcctCdVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] repChgCd = (JSPUtil.getParameter(request, prefix	+ "rep_chg_cd".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] acctCd = (JSPUtil.getParameter(request, prefix	+ "acct_cd".trim(), length));
			String[] acctKrnNm = (JSPUtil.getParameter(request, prefix	+ "acct_krn_nm".trim(), length));
			String[] revTpSrcCd = (JSPUtil.getParameter(request, prefix	+ "rev_tp_src_cd".trim(), length));
			String[] prcDivCd = (JSPUtil.getParameter(request, prefix	+ "prc_div_cd".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] invSrcCd = (JSPUtil.getParameter(request, prefix	+ "inv_src_cd".trim(), length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] invAcctDivCd = (JSPUtil.getParameter(request, prefix	+ "inv_acct_div_cd".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] revTpGrpCd = (JSPUtil.getParameter(request, prefix	+ "rev_tp_grp_cd".trim(), length));
			String[] chgCd = (JSPUtil.getParameter(request, prefix	+ "chg_cd".trim(), length));
			String[] acctEngNm = (JSPUtil.getParameter(request, prefix	+ "acct_eng_nm".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new InvRevAcctCdVO();
				if (repChgCd[i] != null)
					model.setRepChgCd(repChgCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (acctCd[i] != null)
					model.setAcctCd(acctCd[i]);
				if (acctKrnNm[i] != null)
					model.setAcctKrnNm(acctKrnNm[i]);
				if (revTpSrcCd[i] != null)
					model.setRevTpSrcCd(revTpSrcCd[i]);
				if (prcDivCd[i] != null)
					model.setPrcDivCd(prcDivCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (invSrcCd[i] != null)
					model.setInvSrcCd(invSrcCd[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (invAcctDivCd[i] != null)
					model.setInvAcctDivCd(invAcctDivCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (revTpGrpCd[i] != null)
					model.setRevTpGrpCd(revTpGrpCd[i]);
				if (chgCd[i] != null)
					model.setChgCd(chgCd[i]);
				if (acctEngNm[i] != null)
					model.setAcctEngNm(acctEngNm[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {}
		return getInvRevAcctCdVOs();
	}

	public InvRevAcctCdVO[] getInvRevAcctCdVOs(){
		InvRevAcctCdVO[] vos = (InvRevAcctCdVO[])models.toArray(new InvRevAcctCdVO[models.size()]);
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
		this.repChgCd = this.repChgCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.acctCd = this.acctCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.acctKrnNm = this.acctKrnNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.revTpSrcCd = this.revTpSrcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prcDivCd = this.prcDivCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invSrcCd = this.invSrcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invAcctDivCd = this.invAcctDivCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.revTpGrpCd = this.revTpGrpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chgCd = this.chgCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.acctEngNm = this.acctEngNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
