/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BkgArrNtcWdDtlVO.java
*@FileTitle : BkgArrNtcWdDtlVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.06.09
*@LastModifier : 박만건
*@LastVersion : 1.0
* 2009.06.09 박만건 
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
 * @author 박만건
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class BkgArrNtcWdDtlVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgArrNtcWdDtlVO> models = new ArrayList<BkgArrNtcWdDtlVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String anSeq = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String imptNtcRmk = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String anFomCd = null;
	/* Column Info */
	private String addrCtnt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String updUsrId = null;
	/* Page Number */
	private String pagerows = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgArrNtcWdDtlVO() {}

	public BkgArrNtcWdDtlVO(String ibflag, String pagerows, String anSeq, String anFomCd, String addrCtnt, String imptNtcRmk, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.anSeq = anSeq;
		this.creUsrId = creUsrId;
		this.imptNtcRmk = imptNtcRmk;
		this.ibflag = ibflag;
		this.anFomCd = anFomCd;
		this.addrCtnt = addrCtnt;
		this.creDt = creDt;
		this.updUsrId = updUsrId;
		this.pagerows = pagerows;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("an_seq", getAnSeq());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("impt_ntc_rmk", getImptNtcRmk());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("an_fom_cd", getAnFomCd());
		this.hashColumns.put("addr_ctnt", getAddrCtnt());
		this.hashColumns.put("cre_dt", getCreDt());
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
		this.hashFields.put("an_seq", "anSeq");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("impt_ntc_rmk", "imptNtcRmk");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("an_fom_cd", "anFomCd");
		this.hashFields.put("addr_ctnt", "addrCtnt");
		this.hashFields.put("cre_dt", "creDt");
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
	 * @return anSeq
	 */
	public String getAnSeq() {
		return this.anSeq;
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
	 * @return imptNtcRmk
	 */
	public String getImptNtcRmk() {
		return this.imptNtcRmk;
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
	 * @return anFomCd
	 */
	public String getAnFomCd() {
		return this.anFomCd;
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
	 * @return creDt
	 */
	public String getCreDt() {
		return this.creDt;
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
	 * @param anSeq
	 */
	public void setAnSeq(String anSeq) {
		this.anSeq = anSeq;
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
	 * @param imptNtcRmk
	 */
	public void setImptNtcRmk(String imptNtcRmk) {
		this.imptNtcRmk = imptNtcRmk;
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
	 * @param anFomCd
	 */
	public void setAnFomCd(String anFomCd) {
		this.anFomCd = anFomCd;
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
	 * @param creDt
	 */
	public void setCreDt(String creDt) {
		this.creDt = creDt;
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
		setAnSeq(JSPUtil.getParameter(request, "an_seq", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setImptNtcRmk(JSPUtil.getParameter(request, "impt_ntc_rmk", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setAnFomCd(JSPUtil.getParameter(request, "an_fom_cd", ""));
		setAddrCtnt(JSPUtil.getParameter(request, "addr_ctnt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BkgArrNtcWdDtlVO[]
	 */
	public BkgArrNtcWdDtlVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgArrNtcWdDtlVO[]
	 */
	public BkgArrNtcWdDtlVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgArrNtcWdDtlVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] anSeq = (JSPUtil.getParameter(request, prefix	+ "an_seq", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] imptNtcRmk = (JSPUtil.getParameter(request, prefix	+ "impt_ntc_rmk", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] anFomCd = (JSPUtil.getParameter(request, prefix	+ "an_fom_cd", length));
			String[] addrCtnt = (JSPUtil.getParameter(request, prefix	+ "addr_ctnt", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgArrNtcWdDtlVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (anSeq[i] != null)
					model.setAnSeq(anSeq[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (imptNtcRmk[i] != null)
					model.setImptNtcRmk(imptNtcRmk[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (anFomCd[i] != null)
					model.setAnFomCd(anFomCd[i]);
				if (addrCtnt[i] != null)
					model.setAddrCtnt(addrCtnt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgArrNtcWdDtlVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BkgArrNtcWdDtlVO[]
	 */
	public BkgArrNtcWdDtlVO[] getBkgArrNtcWdDtlVOs(){
		BkgArrNtcWdDtlVO[] vos = (BkgArrNtcWdDtlVO[])models.toArray(new BkgArrNtcWdDtlVO[models.size()]);
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
		this.anSeq = this.anSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.imptNtcRmk = this.imptNtcRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.anFomCd = this.anFomCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.addrCtnt = this.addrCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
