/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : EqrEngInpOpmzRunVO.java
*@FileTitle : EqrEngInpOpmzRunVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.28
*@LastModifier : 채창호
*@LastVersion : 1.0
* 2009.07.28 채창호 
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
 * 관련 Event 에서 생성, 서버실행요청시 Data 전달역할을 수행하는 Value Object
 *
 * @author 채창호
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class EqrEngInpOpmzRunVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<EqrEngInpOpmzRunVO> models = new ArrayList<EqrEngInpOpmzRunVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String soldFlg = null;
	/* Column Info */
	private String engRunStDt = null;
	/* Column Info */
	private String runDesc = null;
	/* Column Info */
	private String durWks = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String outIfEndDt = null;
	/* Column Info */
	private String sclOutFlg = null;
	/* Column Info */
	private String stDt = null;
	/* Column Info */
	private String runIdNo = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String onhFlg = null;
	/* Column Info */
	private String runProgKnt = null;
	/* Column Info */
	private String runStsDesc = null;
	/* Column Info */
	private String sclInFlg = null;
	/* Column Info */
	private String snsFlg = null;
	/* Column Info */
	private String runStsCd = null;
	/* Column Info */
	private String engRunEndDt = null;
	/* Column Info */
	private String offhFlg = null;
	/* Column Info */
	private String bseRunIdNo = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String usrAbtFlg = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public EqrEngInpOpmzRunVO() {}

	public EqrEngInpOpmzRunVO(String ibflag, String pagerows, String runIdNo, String runDesc, String stDt, String durWks, String onhFlg, String offhFlg, String sclInFlg, String sclOutFlg, String soldFlg, String snsFlg, String bseRunIdNo, String runStsCd, String runStsDesc, String runProgKnt, String usrAbtFlg, String engRunStDt, String engRunEndDt, String outIfEndDt, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.soldFlg = soldFlg;
		this.engRunStDt = engRunStDt;
		this.runDesc = runDesc;
		this.durWks = durWks;
		this.creDt = creDt;
		this.outIfEndDt = outIfEndDt;
		this.sclOutFlg = sclOutFlg;
		this.stDt = stDt;
		this.runIdNo = runIdNo;
		this.pagerows = pagerows;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.onhFlg = onhFlg;
		this.runProgKnt = runProgKnt;
		this.runStsDesc = runStsDesc;
		this.sclInFlg = sclInFlg;
		this.snsFlg = snsFlg;
		this.runStsCd = runStsCd;
		this.engRunEndDt = engRunEndDt;
		this.offhFlg = offhFlg;
		this.bseRunIdNo = bseRunIdNo;
		this.updUsrId = updUsrId;
		this.usrAbtFlg = usrAbtFlg;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("sold_flg", getSoldFlg());
		this.hashColumns.put("eng_run_st_dt", getEngRunStDt());
		this.hashColumns.put("run_desc", getRunDesc());
		this.hashColumns.put("dur_wks", getDurWks());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("out_if_end_dt", getOutIfEndDt());
		this.hashColumns.put("scl_out_flg", getSclOutFlg());
		this.hashColumns.put("st_dt", getStDt());
		this.hashColumns.put("run_id_no", getRunIdNo());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("onh_flg", getOnhFlg());
		this.hashColumns.put("run_prog_knt", getRunProgKnt());
		this.hashColumns.put("run_sts_desc", getRunStsDesc());
		this.hashColumns.put("scl_in_flg", getSclInFlg());
		this.hashColumns.put("sns_flg", getSnsFlg());
		this.hashColumns.put("run_sts_cd", getRunStsCd());
		this.hashColumns.put("eng_run_end_dt", getEngRunEndDt());
		this.hashColumns.put("offh_flg", getOffhFlg());
		this.hashColumns.put("bse_run_id_no", getBseRunIdNo());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("usr_abt_flg", getUsrAbtFlg());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("sold_flg", "soldFlg");
		this.hashFields.put("eng_run_st_dt", "engRunStDt");
		this.hashFields.put("run_desc", "runDesc");
		this.hashFields.put("dur_wks", "durWks");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("out_if_end_dt", "outIfEndDt");
		this.hashFields.put("scl_out_flg", "sclOutFlg");
		this.hashFields.put("st_dt", "stDt");
		this.hashFields.put("run_id_no", "runIdNo");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("onh_flg", "onhFlg");
		this.hashFields.put("run_prog_knt", "runProgKnt");
		this.hashFields.put("run_sts_desc", "runStsDesc");
		this.hashFields.put("scl_in_flg", "sclInFlg");
		this.hashFields.put("sns_flg", "snsFlg");
		this.hashFields.put("run_sts_cd", "runStsCd");
		this.hashFields.put("eng_run_end_dt", "engRunEndDt");
		this.hashFields.put("offh_flg", "offhFlg");
		this.hashFields.put("bse_run_id_no", "bseRunIdNo");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("usr_abt_flg", "usrAbtFlg");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return updDt
	 */
	public String getUpdDt() {
		return this.updDt;
	}
	
	/**
	 * Column Info
	 * @return soldFlg
	 */
	public String getSoldFlg() {
		return this.soldFlg;
	}
	
	/**
	 * Column Info
	 * @return engRunStDt
	 */
	public String getEngRunStDt() {
		return this.engRunStDt;
	}
	
	/**
	 * Column Info
	 * @return runDesc
	 */
	public String getRunDesc() {
		return this.runDesc;
	}
	
	/**
	 * Column Info
	 * @return durWks
	 */
	public String getDurWks() {
		return this.durWks;
	}
	
	/**
	 * Column Info
	 * @return creDt
	 */
	public String getCreDt() {
		return this.creDt;
	}
	
	/**
	 * Column Info
	 * @return outIfEndDt
	 */
	public String getOutIfEndDt() {
		return this.outIfEndDt;
	}
	
	/**
	 * Column Info
	 * @return sclOutFlg
	 */
	public String getSclOutFlg() {
		return this.sclOutFlg;
	}
	
	/**
	 * Column Info
	 * @return stDt
	 */
	public String getStDt() {
		return this.stDt;
	}
	
	/**
	 * Column Info
	 * @return runIdNo
	 */
	public String getRunIdNo() {
		return this.runIdNo;
	}
	
	/**
	 * Page Number
	 * @return pagerows
	 */
	public String getPagerows() {
		return this.pagerows;
	}
	
	/**
	 * Column Info
	 * @return creUsrId
	 */
	public String getCreUsrId() {
		return this.creUsrId;
	}
	
	/**
	 * VO Data Value( C:Creation, U:Update, D:Delete )
	 * @return ibflag
	 */
	public String getIbflag() {
		return this.ibflag;
	}
	
	/**
	 * Column Info
	 * @return onhFlg
	 */
	public String getOnhFlg() {
		return this.onhFlg;
	}
	
	/**
	 * Column Info
	 * @return runProgKnt
	 */
	public String getRunProgKnt() {
		return this.runProgKnt;
	}
	
	/**
	 * Column Info
	 * @return runStsDesc
	 */
	public String getRunStsDesc() {
		return this.runStsDesc;
	}
	
	/**
	 * Column Info
	 * @return sclInFlg
	 */
	public String getSclInFlg() {
		return this.sclInFlg;
	}
	
	/**
	 * Column Info
	 * @return snsFlg
	 */
	public String getSnsFlg() {
		return this.snsFlg;
	}
	
	/**
	 * Column Info
	 * @return runStsCd
	 */
	public String getRunStsCd() {
		return this.runStsCd;
	}
	
	/**
	 * Column Info
	 * @return engRunEndDt
	 */
	public String getEngRunEndDt() {
		return this.engRunEndDt;
	}
	
	/**
	 * Column Info
	 * @return offhFlg
	 */
	public String getOffhFlg() {
		return this.offhFlg;
	}
	
	/**
	 * Column Info
	 * @return bseRunIdNo
	 */
	public String getBseRunIdNo() {
		return this.bseRunIdNo;
	}
	
	/**
	 * Column Info
	 * @return updUsrId
	 */
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	
	/**
	 * Column Info
	 * @return usrAbtFlg
	 */
	public String getUsrAbtFlg() {
		return this.usrAbtFlg;
	}
	

	/**
	 * Column Info
	 * @param updDt
	 */
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
	}
	
	/**
	 * Column Info
	 * @param soldFlg
	 */
	public void setSoldFlg(String soldFlg) {
		this.soldFlg = soldFlg;
	}
	
	/**
	 * Column Info
	 * @param engRunStDt
	 */
	public void setEngRunStDt(String engRunStDt) {
		this.engRunStDt = engRunStDt;
	}
	
	/**
	 * Column Info
	 * @param runDesc
	 */
	public void setRunDesc(String runDesc) {
		this.runDesc = runDesc;
	}
	
	/**
	 * Column Info
	 * @param durWks
	 */
	public void setDurWks(String durWks) {
		this.durWks = durWks;
	}
	
	/**
	 * Column Info
	 * @param creDt
	 */
	public void setCreDt(String creDt) {
		this.creDt = creDt;
	}
	
	/**
	 * Column Info
	 * @param outIfEndDt
	 */
	public void setOutIfEndDt(String outIfEndDt) {
		this.outIfEndDt = outIfEndDt;
	}
	
	/**
	 * Column Info
	 * @param sclOutFlg
	 */
	public void setSclOutFlg(String sclOutFlg) {
		this.sclOutFlg = sclOutFlg;
	}
	
	/**
	 * Column Info
	 * @param stDt
	 */
	public void setStDt(String stDt) {
		this.stDt = stDt;
	}
	
	/**
	 * Column Info
	 * @param runIdNo
	 */
	public void setRunIdNo(String runIdNo) {
		this.runIdNo = runIdNo;
	}
	
	/**
	 * Page Number
	 * @param pagerows
	 */
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
	}
	
	/**
	 * Column Info
	 * @param creUsrId
	 */
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
	}
	
	/**
	 * VO Data Value( C:Creation, U:Update, D:Delete )
	 * @param ibflag
	 */
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
	}
	
	/**
	 * Column Info
	 * @param onhFlg
	 */
	public void setOnhFlg(String onhFlg) {
		this.onhFlg = onhFlg;
	}
	
	/**
	 * Column Info
	 * @param runProgKnt
	 */
	public void setRunProgKnt(String runProgKnt) {
		this.runProgKnt = runProgKnt;
	}
	
	/**
	 * Column Info
	 * @param runStsDesc
	 */
	public void setRunStsDesc(String runStsDesc) {
		this.runStsDesc = runStsDesc;
	}
	
	/**
	 * Column Info
	 * @param sclInFlg
	 */
	public void setSclInFlg(String sclInFlg) {
		this.sclInFlg = sclInFlg;
	}
	
	/**
	 * Column Info
	 * @param snsFlg
	 */
	public void setSnsFlg(String snsFlg) {
		this.snsFlg = snsFlg;
	}
	
	/**
	 * Column Info
	 * @param runStsCd
	 */
	public void setRunStsCd(String runStsCd) {
		this.runStsCd = runStsCd;
	}
	
	/**
	 * Column Info
	 * @param engRunEndDt
	 */
	public void setEngRunEndDt(String engRunEndDt) {
		this.engRunEndDt = engRunEndDt;
	}
	
	/**
	 * Column Info
	 * @param offhFlg
	 */
	public void setOffhFlg(String offhFlg) {
		this.offhFlg = offhFlg;
	}
	
	/**
	 * Column Info
	 * @param bseRunIdNo
	 */
	public void setBseRunIdNo(String bseRunIdNo) {
		this.bseRunIdNo = bseRunIdNo;
	}
	
	/**
	 * Column Info
	 * @param updUsrId
	 */
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
	}
	
	/**
	 * Column Info
	 * @param usrAbtFlg
	 */
	public void setUsrAbtFlg(String usrAbtFlg) {
		this.usrAbtFlg = usrAbtFlg;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setSoldFlg(JSPUtil.getParameter(request, "sold_flg", ""));
		setEngRunStDt(JSPUtil.getParameter(request, "eng_run_st_dt", ""));
		setRunDesc(JSPUtil.getParameter(request, "run_desc", ""));
		setDurWks(JSPUtil.getParameter(request, "dur_wks", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setOutIfEndDt(JSPUtil.getParameter(request, "out_if_end_dt", ""));
		setSclOutFlg(JSPUtil.getParameter(request, "scl_out_flg", ""));
		setStDt(JSPUtil.getParameter(request, "st_dt", ""));
		setRunIdNo(JSPUtil.getParameter(request, "run_id_no", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setOnhFlg(JSPUtil.getParameter(request, "onh_flg", ""));
		setRunProgKnt(JSPUtil.getParameter(request, "run_prog_knt", ""));
		setRunStsDesc(JSPUtil.getParameter(request, "run_sts_desc", ""));
		setSclInFlg(JSPUtil.getParameter(request, "scl_in_flg", ""));
		setSnsFlg(JSPUtil.getParameter(request, "sns_flg", ""));
		setRunStsCd(JSPUtil.getParameter(request, "run_sts_cd", ""));
		setEngRunEndDt(JSPUtil.getParameter(request, "eng_run_end_dt", ""));
		setOffhFlg(JSPUtil.getParameter(request, "offh_flg", ""));
		setBseRunIdNo(JSPUtil.getParameter(request, "bse_run_id_no", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setUsrAbtFlg(JSPUtil.getParameter(request, "usr_abt_flg", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return EqrEngInpOpmzRunVO[]
	 */
	public EqrEngInpOpmzRunVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return EqrEngInpOpmzRunVO[]
	 */
	public EqrEngInpOpmzRunVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		EqrEngInpOpmzRunVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] soldFlg = (JSPUtil.getParameter(request, prefix	+ "sold_flg", length));
			String[] engRunStDt = (JSPUtil.getParameter(request, prefix	+ "eng_run_st_dt", length));
			String[] runDesc = (JSPUtil.getParameter(request, prefix	+ "run_desc", length));
			String[] durWks = (JSPUtil.getParameter(request, prefix	+ "dur_wks", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] outIfEndDt = (JSPUtil.getParameter(request, prefix	+ "out_if_end_dt", length));
			String[] sclOutFlg = (JSPUtil.getParameter(request, prefix	+ "scl_out_flg", length));
			String[] stDt = (JSPUtil.getParameter(request, prefix	+ "st_dt", length));
			String[] runIdNo = (JSPUtil.getParameter(request, prefix	+ "run_id_no", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] onhFlg = (JSPUtil.getParameter(request, prefix	+ "onh_flg", length));
			String[] runProgKnt = (JSPUtil.getParameter(request, prefix	+ "run_prog_knt", length));
			String[] runStsDesc = (JSPUtil.getParameter(request, prefix	+ "run_sts_desc", length));
			String[] sclInFlg = (JSPUtil.getParameter(request, prefix	+ "scl_in_flg", length));
			String[] snsFlg = (JSPUtil.getParameter(request, prefix	+ "sns_flg", length));
			String[] runStsCd = (JSPUtil.getParameter(request, prefix	+ "run_sts_cd", length));
			String[] engRunEndDt = (JSPUtil.getParameter(request, prefix	+ "eng_run_end_dt", length));
			String[] offhFlg = (JSPUtil.getParameter(request, prefix	+ "offh_flg", length));
			String[] bseRunIdNo = (JSPUtil.getParameter(request, prefix	+ "bse_run_id_no", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] usrAbtFlg = (JSPUtil.getParameter(request, prefix	+ "usr_abt_flg", length));
			
			for (int i = 0; i < length; i++) {
				model = new EqrEngInpOpmzRunVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (soldFlg[i] != null)
					model.setSoldFlg(soldFlg[i]);
				if (engRunStDt[i] != null)
					model.setEngRunStDt(engRunStDt[i]);
				if (runDesc[i] != null)
					model.setRunDesc(runDesc[i]);
				if (durWks[i] != null)
					model.setDurWks(durWks[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (outIfEndDt[i] != null)
					model.setOutIfEndDt(outIfEndDt[i]);
				if (sclOutFlg[i] != null)
					model.setSclOutFlg(sclOutFlg[i]);
				if (stDt[i] != null)
					model.setStDt(stDt[i]);
				if (runIdNo[i] != null)
					model.setRunIdNo(runIdNo[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (onhFlg[i] != null)
					model.setOnhFlg(onhFlg[i]);
				if (runProgKnt[i] != null)
					model.setRunProgKnt(runProgKnt[i]);
				if (runStsDesc[i] != null)
					model.setRunStsDesc(runStsDesc[i]);
				if (sclInFlg[i] != null)
					model.setSclInFlg(sclInFlg[i]);
				if (snsFlg[i] != null)
					model.setSnsFlg(snsFlg[i]);
				if (runStsCd[i] != null)
					model.setRunStsCd(runStsCd[i]);
				if (engRunEndDt[i] != null)
					model.setEngRunEndDt(engRunEndDt[i]);
				if (offhFlg[i] != null)
					model.setOffhFlg(offhFlg[i]);
				if (bseRunIdNo[i] != null)
					model.setBseRunIdNo(bseRunIdNo[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (usrAbtFlg[i] != null)
					model.setUsrAbtFlg(usrAbtFlg[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getEqrEngInpOpmzRunVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return EqrEngInpOpmzRunVO[]
	 */
	public EqrEngInpOpmzRunVO[] getEqrEngInpOpmzRunVOs(){
		EqrEngInpOpmzRunVO[] vos = (EqrEngInpOpmzRunVO[])models.toArray(new EqrEngInpOpmzRunVO[models.size()]);
		return vos;
	}
	
	/**
	 * VO Class의 내용을 String으로 변환
	 */
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
		} catch (Exception ex) {
			return null;
		}
		return ret.toString();
	}
	
	/**
	 * 필드에 있는 값을 스트링 배열로 반환.
	 * @param field
	 * @param i
	 * @return String[]
	 */
	private String[] getField(Field[] field, int i) {
		String[] arr = null;
		try{
			arr = (String[]) field[i].get(this);
		}catch(Exception ex){
			arr = null;
		}
		return arr;
	}

	/**
	* 포맷팅된 문자열에서 특수문자 제거("-","/",",",":")
	*/
	public void unDataFormat(){
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.soldFlg = this.soldFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.engRunStDt = this.engRunStDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.runDesc = this.runDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.durWks = this.durWks .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.outIfEndDt = this.outIfEndDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sclOutFlg = this.sclOutFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stDt = this.stDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.runIdNo = this.runIdNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.onhFlg = this.onhFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.runProgKnt = this.runProgKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.runStsDesc = this.runStsDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sclInFlg = this.sclInFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.snsFlg = this.snsFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.runStsCd = this.runStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.engRunEndDt = this.engRunEndDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.offhFlg = this.offhFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bseRunIdNo = this.bseRunIdNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.usrAbtFlg = this.usrAbtFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
