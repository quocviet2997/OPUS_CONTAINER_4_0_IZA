/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : LseOnhAproVO.java
*@FileTitle : LseOnhAproVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.21
*@LastModifier : 제동식
*@LastVersion : 1.0
* 2009.05.21 제동식 
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
 * @author 제동식
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class LseOnhAproVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<LseOnhAproVO> models = new ArrayList<LseOnhAproVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String aproRmk = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String agmtSeq = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String cntrOnhAuthNo = null;
	/* Column Info */
	private String pkupDueDt = null;
	/* Column Info */
	private String dppChgAmt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String minOnhDys = null;
	/* Column Info */
	private String onhLocCd = null;
	/* Column Info */
	private String mftDt = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String freeDys = null;
	/* Column Info */
	private String agmtCtyCd = null;
	/* Column Info */
	private String lseeVndrSeq = null;
	/* Column Info */
	private String pkupChgAmt = null;
	/* Column Info */
	private String lstmCd = null;
	/* Column Info */
	private String pkupChgCrAmt = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String authDppFreeDys = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public LseOnhAproVO() {}

	public LseOnhAproVO(String ibflag, String pagerows, String cntrOnhAuthNo, String agmtCtyCd, String agmtSeq, String lseeVndrSeq, String lstmCd, String onhLocCd, String pkupDueDt, String mftDt, String freeDys, String pkupChgAmt, String pkupChgCrAmt, String dppChgAmt, String minOnhDys, String authDppFreeDys, String aproRmk, String deltFlg, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.aproRmk = aproRmk;
		this.deltFlg = deltFlg;
		this.agmtSeq = agmtSeq;
		this.creDt = creDt;
		this.cntrOnhAuthNo = cntrOnhAuthNo;
		this.pkupDueDt = pkupDueDt;
		this.dppChgAmt = dppChgAmt;
		this.pagerows = pagerows;
		this.minOnhDys = minOnhDys;
		this.onhLocCd = onhLocCd;
		this.mftDt = mftDt;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.freeDys = freeDys;
		this.agmtCtyCd = agmtCtyCd;
		this.lseeVndrSeq = lseeVndrSeq;
		this.pkupChgAmt = pkupChgAmt;
		this.lstmCd = lstmCd;
		this.pkupChgCrAmt = pkupChgCrAmt;
		this.updUsrId = updUsrId;
		this.authDppFreeDys = authDppFreeDys;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("apro_rmk", getAproRmk());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("agmt_seq", getAgmtSeq());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("cntr_onh_auth_no", getCntrOnhAuthNo());
		this.hashColumns.put("pkup_due_dt", getPkupDueDt());
		this.hashColumns.put("dpp_chg_amt", getDppChgAmt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("min_onh_dys", getMinOnhDys());
		this.hashColumns.put("onh_loc_cd", getOnhLocCd());
		this.hashColumns.put("mft_dt", getMftDt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("free_dys", getFreeDys());
		this.hashColumns.put("agmt_cty_cd", getAgmtCtyCd());
		this.hashColumns.put("lsee_vndr_seq", getLseeVndrSeq());
		this.hashColumns.put("pkup_chg_amt", getPkupChgAmt());
		this.hashColumns.put("lstm_cd", getLstmCd());
		this.hashColumns.put("pkup_chg_cr_amt", getPkupChgCrAmt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("auth_dpp_free_dys", getAuthDppFreeDys());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("apro_rmk", "aproRmk");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("agmt_seq", "agmtSeq");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("cntr_onh_auth_no", "cntrOnhAuthNo");
		this.hashFields.put("pkup_due_dt", "pkupDueDt");
		this.hashFields.put("dpp_chg_amt", "dppChgAmt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("min_onh_dys", "minOnhDys");
		this.hashFields.put("onh_loc_cd", "onhLocCd");
		this.hashFields.put("mft_dt", "mftDt");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("free_dys", "freeDys");
		this.hashFields.put("agmt_cty_cd", "agmtCtyCd");
		this.hashFields.put("lsee_vndr_seq", "lseeVndrSeq");
		this.hashFields.put("pkup_chg_amt", "pkupChgAmt");
		this.hashFields.put("lstm_cd", "lstmCd");
		this.hashFields.put("pkup_chg_cr_amt", "pkupChgCrAmt");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("auth_dpp_free_dys", "authDppFreeDys");
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
	 * @return aproRmk
	 */
	public String getAproRmk() {
		return this.aproRmk;
	}
	
	/**
	 * Column Info
	 * @return deltFlg
	 */
	public String getDeltFlg() {
		return this.deltFlg;
	}
	
	/**
	 * Column Info
	 * @return agmtSeq
	 */
	public String getAgmtSeq() {
		return this.agmtSeq;
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
	 * @return cntrOnhAuthNo
	 */
	public String getCntrOnhAuthNo() {
		return this.cntrOnhAuthNo;
	}
	
	/**
	 * Column Info
	 * @return pkupDueDt
	 */
	public String getPkupDueDt() {
		return this.pkupDueDt;
	}
	
	/**
	 * Column Info
	 * @return dppChgAmt
	 */
	public String getDppChgAmt() {
		return this.dppChgAmt;
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
	 * @return minOnhDys
	 */
	public String getMinOnhDys() {
		return this.minOnhDys;
	}
	
	/**
	 * Column Info
	 * @return onhLocCd
	 */
	public String getOnhLocCd() {
		return this.onhLocCd;
	}
	
	/**
	 * Column Info
	 * @return mftDt
	 */
	public String getMftDt() {
		return this.mftDt;
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
	 * @return freeDys
	 */
	public String getFreeDys() {
		return this.freeDys;
	}
	
	/**
	 * Column Info
	 * @return agmtCtyCd
	 */
	public String getAgmtCtyCd() {
		return this.agmtCtyCd;
	}
	
	/**
	 * Column Info
	 * @return lseeVndrSeq
	 */
	public String getLseeVndrSeq() {
		return this.lseeVndrSeq;
	}
	
	/**
	 * Column Info
	 * @return pkupChgAmt
	 */
	public String getPkupChgAmt() {
		return this.pkupChgAmt;
	}
	
	/**
	 * Column Info
	 * @return lstmCd
	 */
	public String getLstmCd() {
		return this.lstmCd;
	}
	
	/**
	 * Column Info
	 * @return pkupChgCrAmt
	 */
	public String getPkupChgCrAmt() {
		return this.pkupChgCrAmt;
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
	 * @return authDppFreeDys
	 */
	public String getAuthDppFreeDys() {
		return this.authDppFreeDys;
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
	 * @param aproRmk
	 */
	public void setAproRmk(String aproRmk) {
		this.aproRmk = aproRmk;
	}
	
	/**
	 * Column Info
	 * @param deltFlg
	 */
	public void setDeltFlg(String deltFlg) {
		this.deltFlg = deltFlg;
	}
	
	/**
	 * Column Info
	 * @param agmtSeq
	 */
	public void setAgmtSeq(String agmtSeq) {
		this.agmtSeq = agmtSeq;
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
	 * @param cntrOnhAuthNo
	 */
	public void setCntrOnhAuthNo(String cntrOnhAuthNo) {
		this.cntrOnhAuthNo = cntrOnhAuthNo;
	}
	
	/**
	 * Column Info
	 * @param pkupDueDt
	 */
	public void setPkupDueDt(String pkupDueDt) {
		this.pkupDueDt = pkupDueDt;
	}
	
	/**
	 * Column Info
	 * @param dppChgAmt
	 */
	public void setDppChgAmt(String dppChgAmt) {
		this.dppChgAmt = dppChgAmt;
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
	 * @param minOnhDys
	 */
	public void setMinOnhDys(String minOnhDys) {
		this.minOnhDys = minOnhDys;
	}
	
	/**
	 * Column Info
	 * @param onhLocCd
	 */
	public void setOnhLocCd(String onhLocCd) {
		this.onhLocCd = onhLocCd;
	}
	
	/**
	 * Column Info
	 * @param mftDt
	 */
	public void setMftDt(String mftDt) {
		this.mftDt = mftDt;
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
	 * @param freeDys
	 */
	public void setFreeDys(String freeDys) {
		this.freeDys = freeDys;
	}
	
	/**
	 * Column Info
	 * @param agmtCtyCd
	 */
	public void setAgmtCtyCd(String agmtCtyCd) {
		this.agmtCtyCd = agmtCtyCd;
	}
	
	/**
	 * Column Info
	 * @param lseeVndrSeq
	 */
	public void setLseeVndrSeq(String lseeVndrSeq) {
		this.lseeVndrSeq = lseeVndrSeq;
	}
	
	/**
	 * Column Info
	 * @param pkupChgAmt
	 */
	public void setPkupChgAmt(String pkupChgAmt) {
		this.pkupChgAmt = pkupChgAmt;
	}
	
	/**
	 * Column Info
	 * @param lstmCd
	 */
	public void setLstmCd(String lstmCd) {
		this.lstmCd = lstmCd;
	}
	
	/**
	 * Column Info
	 * @param pkupChgCrAmt
	 */
	public void setPkupChgCrAmt(String pkupChgCrAmt) {
		this.pkupChgCrAmt = pkupChgCrAmt;
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
	 * @param authDppFreeDys
	 */
	public void setAuthDppFreeDys(String authDppFreeDys) {
		this.authDppFreeDys = authDppFreeDys;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setAproRmk(JSPUtil.getParameter(request, "apro_rmk", ""));
		setDeltFlg(JSPUtil.getParameter(request, "delt_flg", ""));
		setAgmtSeq(JSPUtil.getParameter(request, "agmt_seq", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setCntrOnhAuthNo(JSPUtil.getParameter(request, "cntr_onh_auth_no", ""));
		setPkupDueDt(JSPUtil.getParameter(request, "pkup_due_dt", ""));
		setDppChgAmt(JSPUtil.getParameter(request, "dpp_chg_amt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setMinOnhDys(JSPUtil.getParameter(request, "min_onh_dys", ""));
		setOnhLocCd(JSPUtil.getParameter(request, "onh_loc_cd", ""));
		setMftDt(JSPUtil.getParameter(request, "mft_dt", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setFreeDys(JSPUtil.getParameter(request, "free_dys", ""));
		setAgmtCtyCd(JSPUtil.getParameter(request, "agmt_cty_cd", ""));
		setLseeVndrSeq(JSPUtil.getParameter(request, "lsee_vndr_seq", ""));
		setPkupChgAmt(JSPUtil.getParameter(request, "pkup_chg_amt", ""));
		setLstmCd(JSPUtil.getParameter(request, "lstm_cd", ""));
		setPkupChgCrAmt(JSPUtil.getParameter(request, "pkup_chg_cr_amt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setAuthDppFreeDys(JSPUtil.getParameter(request, "auth_dpp_free_dys", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return LseOnhAproVO[]
	 */
	public LseOnhAproVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return LseOnhAproVO[]
	 */
	public LseOnhAproVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		LseOnhAproVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] aproRmk = (JSPUtil.getParameter(request, prefix	+ "apro_rmk".trim(), length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg".trim(), length));
			String[] agmtSeq = (JSPUtil.getParameter(request, prefix	+ "agmt_seq".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] cntrOnhAuthNo = (JSPUtil.getParameter(request, prefix	+ "cntr_onh_auth_no".trim(), length));
			String[] pkupDueDt = (JSPUtil.getParameter(request, prefix	+ "pkup_due_dt".trim(), length));
			String[] dppChgAmt = (JSPUtil.getParameter(request, prefix	+ "dpp_chg_amt".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] minOnhDys = (JSPUtil.getParameter(request, prefix	+ "min_onh_dys".trim(), length));
			String[] onhLocCd = (JSPUtil.getParameter(request, prefix	+ "onh_loc_cd".trim(), length));
			String[] mftDt = (JSPUtil.getParameter(request, prefix	+ "mft_dt".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] freeDys = (JSPUtil.getParameter(request, prefix	+ "free_dys".trim(), length));
			String[] agmtCtyCd = (JSPUtil.getParameter(request, prefix	+ "agmt_cty_cd".trim(), length));
			String[] lseeVndrSeq = (JSPUtil.getParameter(request, prefix	+ "lsee_vndr_seq".trim(), length));
			String[] pkupChgAmt = (JSPUtil.getParameter(request, prefix	+ "pkup_chg_amt".trim(), length));
			String[] lstmCd = (JSPUtil.getParameter(request, prefix	+ "lstm_cd".trim(), length));
			String[] pkupChgCrAmt = (JSPUtil.getParameter(request, prefix	+ "pkup_chg_cr_amt".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] authDppFreeDys = (JSPUtil.getParameter(request, prefix	+ "auth_dpp_free_dys".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new LseOnhAproVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (aproRmk[i] != null)
					model.setAproRmk(aproRmk[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (agmtSeq[i] != null)
					model.setAgmtSeq(agmtSeq[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (cntrOnhAuthNo[i] != null)
					model.setCntrOnhAuthNo(cntrOnhAuthNo[i]);
				if (pkupDueDt[i] != null)
					model.setPkupDueDt(pkupDueDt[i]);
				if (dppChgAmt[i] != null)
					model.setDppChgAmt(dppChgAmt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (minOnhDys[i] != null)
					model.setMinOnhDys(minOnhDys[i]);
				if (onhLocCd[i] != null)
					model.setOnhLocCd(onhLocCd[i]);
				if (mftDt[i] != null)
					model.setMftDt(mftDt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (freeDys[i] != null)
					model.setFreeDys(freeDys[i]);
				if (agmtCtyCd[i] != null)
					model.setAgmtCtyCd(agmtCtyCd[i]);
				if (lseeVndrSeq[i] != null)
					model.setLseeVndrSeq(lseeVndrSeq[i]);
				if (pkupChgAmt[i] != null)
					model.setPkupChgAmt(pkupChgAmt[i]);
				if (lstmCd[i] != null)
					model.setLstmCd(lstmCd[i]);
				if (pkupChgCrAmt[i] != null)
					model.setPkupChgCrAmt(pkupChgCrAmt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (authDppFreeDys[i] != null)
					model.setAuthDppFreeDys(authDppFreeDys[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getLseOnhAproVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return LseOnhAproVO[]
	 */
	public LseOnhAproVO[] getLseOnhAproVOs(){
		LseOnhAproVO[] vos = (LseOnhAproVO[])models.toArray(new LseOnhAproVO[models.size()]);
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
		this.aproRmk = this.aproRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agmtSeq = this.agmtSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrOnhAuthNo = this.cntrOnhAuthNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pkupDueDt = this.pkupDueDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dppChgAmt = this.dppChgAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.minOnhDys = this.minOnhDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.onhLocCd = this.onhLocCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mftDt = this.mftDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.freeDys = this.freeDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agmtCtyCd = this.agmtCtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lseeVndrSeq = this.lseeVndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pkupChgAmt = this.pkupChgAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lstmCd = this.lstmCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pkupChgCrAmt = this.pkupChgCrAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.authDppFreeDys = this.authDppFreeDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
