/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : SaqYryQtaStepVerRfVO.java
*@FileTitle : SaqYryQtaStepVerRfVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.09.23
*@LastModifier : 정은호
*@LastVersion : 1.0
* 2009.09.23 정은호 
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
 * @author 정은호
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class SaqYryQtaStepVerRfVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<SaqYryQtaStepVerRfVO> models = new ArrayList<SaqYryQtaStepVerRfVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String saqStsCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String bseYr = null;
	/* Column Info */
	private String yqtaStepCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String yqtaMdlVerNo = null;
	/* Column Info */
	private String fnlCfmGdt = null;
	/* Column Info */
	private String drftCfmGdt = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String slsFcastPubNo = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String creOfcCd = null;
	/* Column Info */
	private String yqtaVerNo = null;
	/* Column Info */
	private String updUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public SaqYryQtaStepVerRfVO() {}

	public SaqYryQtaStepVerRfVO(String ibflag, String pagerows, String yqtaStepCd, String bseYr, String yqtaVerNo, String saqStsCd, String creOfcCd, String slsFcastPubNo, String yqtaMdlVerNo, String drftCfmGdt, String fnlCfmGdt, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.saqStsCd = saqStsCd;
		this.creDt = creDt;
		this.bseYr = bseYr;
		this.yqtaStepCd = yqtaStepCd;
		this.pagerows = pagerows;
		this.yqtaMdlVerNo = yqtaMdlVerNo;
		this.fnlCfmGdt = fnlCfmGdt;
		this.drftCfmGdt = drftCfmGdt;
		this.ibflag = ibflag;
		this.slsFcastPubNo = slsFcastPubNo;
		this.creUsrId = creUsrId;
		this.creOfcCd = creOfcCd;
		this.yqtaVerNo = yqtaVerNo;
		this.updUsrId = updUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("saq_sts_cd", getSaqStsCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("bse_yr", getBseYr());
		this.hashColumns.put("yqta_step_cd", getYqtaStepCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("yqta_mdl_ver_no", getYqtaMdlVerNo());
		this.hashColumns.put("fnl_cfm_gdt", getFnlCfmGdt());
		this.hashColumns.put("drft_cfm_gdt", getDrftCfmGdt());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("sls_fcast_pub_no", getSlsFcastPubNo());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("cre_ofc_cd", getCreOfcCd());
		this.hashColumns.put("yqta_ver_no", getYqtaVerNo());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("saq_sts_cd", "saqStsCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("bse_yr", "bseYr");
		this.hashFields.put("yqta_step_cd", "yqtaStepCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("yqta_mdl_ver_no", "yqtaMdlVerNo");
		this.hashFields.put("fnl_cfm_gdt", "fnlCfmGdt");
		this.hashFields.put("drft_cfm_gdt", "drftCfmGdt");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("sls_fcast_pub_no", "slsFcastPubNo");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("cre_ofc_cd", "creOfcCd");
		this.hashFields.put("yqta_ver_no", "yqtaVerNo");
		this.hashFields.put("upd_usr_id", "updUsrId");
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
	 * @return saqStsCd
	 */
	public String getSaqStsCd() {
		return this.saqStsCd;
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
	 * @return bseYr
	 */
	public String getBseYr() {
		return this.bseYr;
	}
	
	/**
	 * Column Info
	 * @return yqtaStepCd
	 */
	public String getYqtaStepCd() {
		return this.yqtaStepCd;
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
	 * @return yqtaMdlVerNo
	 */
	public String getYqtaMdlVerNo() {
		return this.yqtaMdlVerNo;
	}
	
	/**
	 * Column Info
	 * @return fnlCfmGdt
	 */
	public String getFnlCfmGdt() {
		return this.fnlCfmGdt;
	}
	
	/**
	 * Column Info
	 * @return drftCfmGdt
	 */
	public String getDrftCfmGdt() {
		return this.drftCfmGdt;
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
	 * @return slsFcastPubNo
	 */
	public String getSlsFcastPubNo() {
		return this.slsFcastPubNo;
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
	 * @return creOfcCd
	 */
	public String getCreOfcCd() {
		return this.creOfcCd;
	}
	
	/**
	 * Column Info
	 * @return yqtaVerNo
	 */
	public String getYqtaVerNo() {
		return this.yqtaVerNo;
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
	 * @param updDt
	 */
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
	}
	
	/**
	 * Column Info
	 * @param saqStsCd
	 */
	public void setSaqStsCd(String saqStsCd) {
		this.saqStsCd = saqStsCd;
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
	 * @param bseYr
	 */
	public void setBseYr(String bseYr) {
		this.bseYr = bseYr;
	}
	
	/**
	 * Column Info
	 * @param yqtaStepCd
	 */
	public void setYqtaStepCd(String yqtaStepCd) {
		this.yqtaStepCd = yqtaStepCd;
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
	 * @param yqtaMdlVerNo
	 */
	public void setYqtaMdlVerNo(String yqtaMdlVerNo) {
		this.yqtaMdlVerNo = yqtaMdlVerNo;
	}
	
	/**
	 * Column Info
	 * @param fnlCfmGdt
	 */
	public void setFnlCfmGdt(String fnlCfmGdt) {
		this.fnlCfmGdt = fnlCfmGdt;
	}
	
	/**
	 * Column Info
	 * @param drftCfmGdt
	 */
	public void setDrftCfmGdt(String drftCfmGdt) {
		this.drftCfmGdt = drftCfmGdt;
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
	 * @param slsFcastPubNo
	 */
	public void setSlsFcastPubNo(String slsFcastPubNo) {
		this.slsFcastPubNo = slsFcastPubNo;
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
	 * @param creOfcCd
	 */
	public void setCreOfcCd(String creOfcCd) {
		this.creOfcCd = creOfcCd;
	}
	
	/**
	 * Column Info
	 * @param yqtaVerNo
	 */
	public void setYqtaVerNo(String yqtaVerNo) {
		this.yqtaVerNo = yqtaVerNo;
	}
	
	/**
	 * Column Info
	 * @param updUsrId
	 */
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setSaqStsCd(JSPUtil.getParameter(request, "saq_sts_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setBseYr(JSPUtil.getParameter(request, "bse_yr", ""));
		setYqtaStepCd(JSPUtil.getParameter(request, "yqta_step_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setYqtaMdlVerNo(JSPUtil.getParameter(request, "yqta_mdl_ver_no", ""));
		setFnlCfmGdt(JSPUtil.getParameter(request, "fnl_cfm_gdt", ""));
		setDrftCfmGdt(JSPUtil.getParameter(request, "drft_cfm_gdt", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setSlsFcastPubNo(JSPUtil.getParameter(request, "sls_fcast_pub_no", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setCreOfcCd(JSPUtil.getParameter(request, "cre_ofc_cd", ""));
		setYqtaVerNo(JSPUtil.getParameter(request, "yqta_ver_no", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return SaqYryQtaStepVerRfVO[]
	 */
	public SaqYryQtaStepVerRfVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return SaqYryQtaStepVerRfVO[]
	 */
	public SaqYryQtaStepVerRfVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		SaqYryQtaStepVerRfVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] saqStsCd = (JSPUtil.getParameter(request, prefix	+ "saq_sts_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] bseYr = (JSPUtil.getParameter(request, prefix	+ "bse_yr", length));
			String[] yqtaStepCd = (JSPUtil.getParameter(request, prefix	+ "yqta_step_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] yqtaMdlVerNo = (JSPUtil.getParameter(request, prefix	+ "yqta_mdl_ver_no", length));
			String[] fnlCfmGdt = (JSPUtil.getParameter(request, prefix	+ "fnl_cfm_gdt", length));
			String[] drftCfmGdt = (JSPUtil.getParameter(request, prefix	+ "drft_cfm_gdt", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] slsFcastPubNo = (JSPUtil.getParameter(request, prefix	+ "sls_fcast_pub_no", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] creOfcCd = (JSPUtil.getParameter(request, prefix	+ "cre_ofc_cd", length));
			String[] yqtaVerNo = (JSPUtil.getParameter(request, prefix	+ "yqta_ver_no", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			
			for (int i = 0; i < length; i++) {
				model = new SaqYryQtaStepVerRfVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (saqStsCd[i] != null)
					model.setSaqStsCd(saqStsCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (bseYr[i] != null)
					model.setBseYr(bseYr[i]);
				if (yqtaStepCd[i] != null)
					model.setYqtaStepCd(yqtaStepCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (yqtaMdlVerNo[i] != null)
					model.setYqtaMdlVerNo(yqtaMdlVerNo[i]);
				if (fnlCfmGdt[i] != null)
					model.setFnlCfmGdt(fnlCfmGdt[i]);
				if (drftCfmGdt[i] != null)
					model.setDrftCfmGdt(drftCfmGdt[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (slsFcastPubNo[i] != null)
					model.setSlsFcastPubNo(slsFcastPubNo[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (creOfcCd[i] != null)
					model.setCreOfcCd(creOfcCd[i]);
				if (yqtaVerNo[i] != null)
					model.setYqtaVerNo(yqtaVerNo[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getSaqYryQtaStepVerRfVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return SaqYryQtaStepVerRfVO[]
	 */
	public SaqYryQtaStepVerRfVO[] getSaqYryQtaStepVerRfVOs(){
		SaqYryQtaStepVerRfVO[] vos = (SaqYryQtaStepVerRfVO[])models.toArray(new SaqYryQtaStepVerRfVO[models.size()]);
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
		this.saqStsCd = this.saqStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bseYr = this.bseYr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.yqtaStepCd = this.yqtaStepCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.yqtaMdlVerNo = this.yqtaMdlVerNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fnlCfmGdt = this.fnlCfmGdt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.drftCfmGdt = this.drftCfmGdt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slsFcastPubNo = this.slsFcastPubNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creOfcCd = this.creOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.yqtaVerNo = this.yqtaVerNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
