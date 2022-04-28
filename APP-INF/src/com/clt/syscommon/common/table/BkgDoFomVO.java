/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BkgDoFomVO.java
*@FileTitle : BkgDoFomVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.02
*@LastModifier : 안진응
*@LastVersion : 1.0
* 2009.07.02 안진응 
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
 * @author 안진응
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class BkgDoFomVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgDoFomVO> models = new ArrayList<BkgDoFomVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String ofcCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String authCtnt = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String addrCtnt = null;
	/* Column Info */
	private String loclLangFlg = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String doPrnRmk = null;
	/* Column Info */
	private String doFomPrvCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Page Number */
	private String pagerows = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgDoFomVO() {}

	public BkgDoFomVO(String ibflag, String pagerows, String ofcCd, String doFomPrvCd, String loclLangFlg, String addrCtnt, String doPrnRmk, String authCtnt, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.ofcCd = ofcCd;
		this.creUsrId = creUsrId;
		this.authCtnt = authCtnt;
		this.ibflag = ibflag;
		this.addrCtnt = addrCtnt;
		this.loclLangFlg = loclLangFlg;
		this.creDt = creDt;
		this.doPrnRmk = doPrnRmk;
		this.doFomPrvCd = doFomPrvCd;
		this.updUsrId = updUsrId;
		this.pagerows = pagerows;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("ofc_cd", getOfcCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("auth_ctnt", getAuthCtnt());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("addr_ctnt", getAddrCtnt());
		this.hashColumns.put("locl_lang_flg", getLoclLangFlg());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("do_prn_rmk", getDoPrnRmk());
		this.hashColumns.put("do_fom_prv_cd", getDoFomPrvCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("pagerows", getPagerows());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("ofc_cd", "ofcCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("auth_ctnt", "authCtnt");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("addr_ctnt", "addrCtnt");
		this.hashFields.put("locl_lang_flg", "loclLangFlg");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("do_prn_rmk", "doPrnRmk");
		this.hashFields.put("do_fom_prv_cd", "doFomPrvCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("pagerows", "pagerows");
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
	 * @return ofcCd
	 */
	public String getOfcCd() {
		return this.ofcCd;
	}
	
	/**
	 * Column Info
	 * @return creUsrId
	 */
	public String getCreUsrId() {
		return this.creUsrId;
	}
	
	/**
	 * Column Info
	 * @return authCtnt
	 */
	public String getAuthCtnt() {
		return this.authCtnt;
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
	 * @return addrCtnt
	 */
	public String getAddrCtnt() {
		return this.addrCtnt;
	}
	
	/**
	 * Column Info
	 * @return loclLangFlg
	 */
	public String getLoclLangFlg() {
		return this.loclLangFlg;
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
	 * @return doPrnRmk
	 */
	public String getDoPrnRmk() {
		return this.doPrnRmk;
	}
	
	/**
	 * Column Info
	 * @return doFomPrvCd
	 */
	public String getDoFomPrvCd() {
		return this.doFomPrvCd;
	}
	
	/**
	 * Column Info
	 * @return updUsrId
	 */
	public String getUpdUsrId() {
		return this.updUsrId;
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
	 * @param updDt
	 */
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
	}
	
	/**
	 * Column Info
	 * @param ofcCd
	 */
	public void setOfcCd(String ofcCd) {
		this.ofcCd = ofcCd;
	}
	
	/**
	 * Column Info
	 * @param creUsrId
	 */
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
	}
	
	/**
	 * Column Info
	 * @param authCtnt
	 */
	public void setAuthCtnt(String authCtnt) {
		this.authCtnt = authCtnt;
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
	 * @param addrCtnt
	 */
	public void setAddrCtnt(String addrCtnt) {
		this.addrCtnt = addrCtnt;
	}
	
	/**
	 * Column Info
	 * @param loclLangFlg
	 */
	public void setLoclLangFlg(String loclLangFlg) {
		this.loclLangFlg = loclLangFlg;
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
	 * @param doPrnRmk
	 */
	public void setDoPrnRmk(String doPrnRmk) {
		this.doPrnRmk = doPrnRmk;
	}
	
	/**
	 * Column Info
	 * @param doFomPrvCd
	 */
	public void setDoFomPrvCd(String doFomPrvCd) {
		this.doFomPrvCd = doFomPrvCd;
	}
	
	/**
	 * Column Info
	 * @param updUsrId
	 */
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
	}
	
	/**
	 * Page Number
	 * @param pagerows
	 */
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setOfcCd(JSPUtil.getParameter(request, "ofc_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setAuthCtnt(JSPUtil.getParameter(request, "auth_ctnt", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setAddrCtnt(JSPUtil.getParameter(request, "addr_ctnt", ""));
		setLoclLangFlg(JSPUtil.getParameter(request, "locl_lang_flg", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setDoPrnRmk(JSPUtil.getParameter(request, "do_prn_rmk", ""));
		setDoFomPrvCd(JSPUtil.getParameter(request, "do_fom_prv_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BkgDoFomVO[]
	 */
	public BkgDoFomVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgDoFomVO[]
	 */
	public BkgDoFomVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgDoFomVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] ofcCd = (JSPUtil.getParameter(request, prefix	+ "ofc_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] authCtnt = (JSPUtil.getParameter(request, prefix	+ "auth_ctnt", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] addrCtnt = (JSPUtil.getParameter(request, prefix	+ "addr_ctnt", length));
			String[] loclLangFlg = (JSPUtil.getParameter(request, prefix	+ "locl_lang_flg", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] doPrnRmk = (JSPUtil.getParameter(request, prefix	+ "do_prn_rmk", length));
			String[] doFomPrvCd = (JSPUtil.getParameter(request, prefix	+ "do_fom_prv_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgDoFomVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (ofcCd[i] != null)
					model.setOfcCd(ofcCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (authCtnt[i] != null)
					model.setAuthCtnt(authCtnt[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (addrCtnt[i] != null)
					model.setAddrCtnt(addrCtnt[i]);
				if (loclLangFlg[i] != null)
					model.setLoclLangFlg(loclLangFlg[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (doPrnRmk[i] != null)
					model.setDoPrnRmk(doPrnRmk[i]);
				if (doFomPrvCd[i] != null)
					model.setDoFomPrvCd(doFomPrvCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgDoFomVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BkgDoFomVO[]
	 */
	public BkgDoFomVO[] getBkgDoFomVOs(){
		BkgDoFomVO[] vos = (BkgDoFomVO[])models.toArray(new BkgDoFomVO[models.size()]);
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
		this.ofcCd = this.ofcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.authCtnt = this.authCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.addrCtnt = this.addrCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.loclLangFlg = this.loclLangFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.doPrnRmk = this.doPrnRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.doFomPrvCd = this.doFomPrvCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
