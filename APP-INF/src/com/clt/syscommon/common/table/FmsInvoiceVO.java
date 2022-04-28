/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : FmsInvoiceVO.java
*@FileTitle : FmsInvoiceVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.02.20
*@LastModifier : 
*@LastVersion : 1.0
* 2009.02.20  
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
 * @author 
 * @since J2EE 1.5
 */

public class FmsInvoiceVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<FmsInvoiceVO> models = new ArrayList<FmsInvoiceVO>();
	
	/* Column Inpo */
	private String updDt = null;
	/* Column Inpo */
	private String vslCd = null;
	/* Column Inpo */
	private String acmmFlg = null;
	/* Column Inpo */
	private String fletOffhRsnCd = null;
	/* Column Inpo */
	private String creDt = null;
	/* Column Inpo */
	private String invSeq = null;
	/* Column Inpo */
	private String ppayHirNo = null;
	/* Column Inpo */
	private String fletIssTpCd = null;
	/* Column Inpo */
	private String brogFlg = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Inpo */
	private String fletCtrtNo = null;
	/* Column Inpo */
	private String creUsrId = null;
	/* Column Inpo */
	private String offhSeq = null;
	/* Status */
	private String ibflag = null;
	/* Column Inpo */
	private String effDt = null;
	/* Column Inpo */
	private String invUsdDys = null;
	/* Column Inpo */
	private String expDt = null;
	/* Column Inpo */
	private String updUsrId = null;
	
	/* Column Inpo */
	private String oriEffDt = null;
	/* Column Inpo */
	private String oriExpDt = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	hashFildInpo	*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public FmsInvoiceVO() {}

	public FmsInvoiceVO(String ibflag, String pagerows, String fletCtrtNo, String fletIssTpCd, String invSeq, String effDt, String expDt, String invUsdDys, String ppayHirNo, String acmmFlg, String brogFlg, String fletOffhRsnCd, String vslCd, String offhSeq, String creUsrId, String creDt, String updUsrId, String updDt, String oriEffDt, String oriExpDt) {
		this.updDt = updDt;
		this.vslCd = vslCd;
		this.acmmFlg = acmmFlg;
		this.fletOffhRsnCd = fletOffhRsnCd;
		this.creDt = creDt;
		this.invSeq = invSeq;
		this.ppayHirNo = ppayHirNo;
		this.fletIssTpCd = fletIssTpCd;
		this.brogFlg = brogFlg;
		this.pagerows = pagerows;
		this.fletCtrtNo = fletCtrtNo;
		this.creUsrId = creUsrId;
		this.offhSeq = offhSeq;
		this.ibflag = ibflag;
		this.effDt = effDt;
		this.invUsdDys = invUsdDys;
		this.expDt = expDt;
		this.updUsrId = updUsrId;
		
		this.oriEffDt = oriEffDt;
		this.oriExpDt = oriExpDt;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("acmm_flg", getAcmmFlg());
		this.hashColumns.put("flet_offh_rsn_cd", getFletOffhRsnCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("inv_seq", getInvSeq());
		this.hashColumns.put("ppay_hir_no", getPpayHirNo());
		this.hashColumns.put("flet_iss_tp_cd", getFletIssTpCd());
		this.hashColumns.put("brog_flg", getBrogFlg());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("flet_ctrt_no", getFletCtrtNo());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("offh_seq", getOffhSeq());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("eff_dt", getEffDt());
		this.hashColumns.put("inv_usd_dys", getInvUsdDys());
		this.hashColumns.put("exp_dt", getExpDt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		
		this.hashColumns.put("ori_eff_dt", getOriEffDt());
		this.hashColumns.put("ori_exp_dt", getOriExpDt());
		return this.hashColumns;
	}
	
	/**
	 * hashFildInpo
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("acmm_flg", "acmmFlg");
		this.hashFields.put("flet_offh_rsn_cd", "fletOffhRsnCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("inv_seq", "invSeq");
		this.hashFields.put("ppay_hir_no", "ppayHirNo");
		this.hashFields.put("flet_iss_tp_cd", "fletIssTpCd");
		this.hashFields.put("brog_flg", "brogFlg");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("flet_ctrt_no", "fletCtrtNo");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("offh_seq", "offhSeq");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("eff_dt", "effDt");
		this.hashFields.put("inv_usd_dys", "invUsdDys");
		this.hashFields.put("exp_dt", "expDt");
		this.hashFields.put("upd_usr_id", "updUsrId");
		
		this.hashFields.put("ori_eff_dt", "oriEffDt");
		this.hashFields.put("ori_exp_dt", "oriExpDt");
		return this.hashFields;
	}
	
	public String getUpdDt() {
		return this.updDt;
	}
	public String getVslCd() {
		return this.vslCd;
	}
	public String getAcmmFlg() {
		return this.acmmFlg;
	}
	public String getFletOffhRsnCd() {
		return this.fletOffhRsnCd;
	}
	public String getCreDt() {
		return this.creDt;
	}
	public String getInvSeq() {
		return this.invSeq;
	}
	public String getPpayHirNo() {
		return this.ppayHirNo;
	}
	public String getFletIssTpCd() {
		return this.fletIssTpCd;
	}
	public String getBrogFlg() {
		return this.brogFlg;
	}
	public String getPagerows() {
		return this.pagerows;
	}
	public String getFletCtrtNo() {
		return this.fletCtrtNo;
	}
	public String getCreUsrId() {
		return this.creUsrId;
	}
	public String getOffhSeq() {
		return this.offhSeq;
	}
	public String getIbflag() {
		return this.ibflag;
	}
	public String getEffDt() {
		return this.effDt;
	}
	public String getInvUsdDys() {
		return this.invUsdDys;
	}
	public String getExpDt() {
		return this.expDt;
	}
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	
	public String getOriEffDt() {
		return this.oriEffDt;
	}
	
	public String getOriExpDt() {
		return this.oriExpDt;
	}

	public void setUpdDt(String updDt) {
		this.updDt = updDt;
		//this.updDt=true;
	}
	public void setVslCd(String vslCd) {
		this.vslCd = vslCd;
		//this.vslCd=true;
	}
	public void setAcmmFlg(String acmmFlg) {
		this.acmmFlg = acmmFlg;
		//this.acmmFlg=true;
	}
	public void setFletOffhRsnCd(String fletOffhRsnCd) {
		this.fletOffhRsnCd = fletOffhRsnCd;
		//this.fletOffhRsnCd=true;
	}
	public void setCreDt(String creDt) {
		this.creDt = creDt;
		//this.creDt=true;
	}
	public void setInvSeq(String invSeq) {
		this.invSeq = invSeq;
		//this.invSeq=true;
	}
	public void setPpayHirNo(String ppayHirNo) {
		this.ppayHirNo = ppayHirNo;
		//this.ppayHirNo=true;
	}
	public void setFletIssTpCd(String fletIssTpCd) {
		this.fletIssTpCd = fletIssTpCd;
		//this.fletIssTpCd=true;
	}
	public void setBrogFlg(String brogFlg) {
		this.brogFlg = brogFlg;
		//this.brogFlg=true;
	}
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}
	public void setFletCtrtNo(String fletCtrtNo) {
		this.fletCtrtNo = fletCtrtNo;
		//this.fletCtrtNo=true;
	}
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
		//this.creUsrId=true;
	}
	public void setOffhSeq(String offhSeq) {
		this.offhSeq = offhSeq;
		//this.offhSeq=true;
	}
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setEffDt(String effDt) {
		this.effDt = effDt;
		//this.effDt=true;
	}
	public void setInvUsdDys(String invUsdDys) {
		this.invUsdDys = invUsdDys;
		//this.invUsdDys=true;
	}
	public void setExpDt(String expDt) {
		this.expDt = expDt;
		//this.expDt=true;
	}
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
		//this.updUsrId=true;
	}
	
	public void setOriEffDt(String oriEffDt) {
		this.oriEffDt = oriEffDt;
		//this.effDt=true;
	}
	
	public void setOriExpDt(String oriExpDt) {
		this.oriExpDt = oriExpDt;
		//this.effDt=true;
	}
	
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setVslCd(JSPUtil.getParameter(request, "vsl_cd", ""));
		setAcmmFlg(JSPUtil.getParameter(request, "acmm_flg", ""));
		setFletOffhRsnCd(JSPUtil.getParameter(request, "flet_offh_rsn_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setInvSeq(JSPUtil.getParameter(request, "inv_seq", ""));
		setPpayHirNo(JSPUtil.getParameter(request, "ppay_hir_no", ""));
		setFletIssTpCd(JSPUtil.getParameter(request, "flet_iss_tp_cd", ""));
		setBrogFlg(JSPUtil.getParameter(request, "brog_flg", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setFletCtrtNo(JSPUtil.getParameter(request, "flet_ctrt_no", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setOffhSeq(JSPUtil.getParameter(request, "offh_seq", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setEffDt(JSPUtil.getParameter(request, "eff_dt", ""));
		setInvUsdDys(JSPUtil.getParameter(request, "inv_usd_dys", ""));
		setExpDt(JSPUtil.getParameter(request, "exp_dt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		
		setOriEffDt(JSPUtil.getParameter(request, "ori_eff_dt", ""));
		setOriExpDt(JSPUtil.getParameter(request, "ori_exp_dt", ""));
	}

	public FmsInvoiceVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public FmsInvoiceVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		FmsInvoiceVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd".trim(), length));
			String[] acmmFlg = (JSPUtil.getParameter(request, prefix	+ "acmm_flg".trim(), length));
			String[] fletOffhRsnCd = (JSPUtil.getParameter(request, prefix	+ "flet_offh_rsn_cd".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] invSeq = (JSPUtil.getParameter(request, prefix	+ "inv_seq".trim(), length));
			String[] ppayHirNo = (JSPUtil.getParameter(request, prefix	+ "ppay_hir_no".trim(), length));
			String[] fletIssTpCd = (JSPUtil.getParameter(request, prefix	+ "flet_iss_tp_cd".trim(), length));
			String[] brogFlg = (JSPUtil.getParameter(request, prefix	+ "brog_flg".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] fletCtrtNo = (JSPUtil.getParameter(request, prefix	+ "flet_ctrt_no".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] offhSeq = (JSPUtil.getParameter(request, prefix	+ "offh_seq".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] effDt = (JSPUtil.getParameter(request, prefix	+ "eff_dt".trim(), length));
			String[] invUsdDys = (JSPUtil.getParameter(request, prefix	+ "inv_usd_dys".trim(), length));
			String[] expDt = (JSPUtil.getParameter(request, prefix	+ "exp_dt".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			
			String[] oriEffDt = (JSPUtil.getParameter(request, prefix	+ "ori_eff_dt".trim(), length));
			String[] oriExpDt = (JSPUtil.getParameter(request, prefix	+ "ori_exp_dt".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new FmsInvoiceVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (acmmFlg[i] != null)
					model.setAcmmFlg(acmmFlg[i]);
				if (fletOffhRsnCd[i] != null)
					model.setFletOffhRsnCd(fletOffhRsnCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (invSeq[i] != null)
					model.setInvSeq(invSeq[i]);
				if (ppayHirNo[i] != null)
					model.setPpayHirNo(ppayHirNo[i]);
				if (fletIssTpCd[i] != null)
					model.setFletIssTpCd(fletIssTpCd[i]);
				if (brogFlg[i] != null)
					model.setBrogFlg(brogFlg[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (fletCtrtNo[i] != null)
					model.setFletCtrtNo(fletCtrtNo[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (offhSeq[i] != null)
					model.setOffhSeq(offhSeq[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (effDt[i] != null)
					model.setEffDt(effDt[i]);
				if (invUsdDys[i] != null)
					model.setInvUsdDys(invUsdDys[i]);
				if (expDt[i] != null)
					model.setExpDt(expDt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				
				if (oriEffDt[i] != null)
					model.setOriEffDt(oriEffDt[i]);
				
				if (oriExpDt[i] != null)
					model.setOriExpDt(oriExpDt[i]);
				
				models.add(model);
			}

		} catch (Exception e) {}
		return getFmsInvoiceVOs();
	}

	public FmsInvoiceVO[] getFmsInvoiceVOs(){
		FmsInvoiceVO[] vos = (FmsInvoiceVO[])models.toArray(new FmsInvoiceVO[models.size()]);
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
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslCd = this.vslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.acmmFlg = this.acmmFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fletOffhRsnCd = this.fletOffhRsnCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invSeq = this.invSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ppayHirNo = this.ppayHirNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fletIssTpCd = this.fletIssTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.brogFlg = this.brogFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fletCtrtNo = this.fletCtrtNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.offhSeq = this.offhSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.effDt = this.effDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invUsdDys = this.invUsdDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.expDt = this.expDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		
		this.oriEffDt = this.oriEffDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.oriExpDt = this.oriExpDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
