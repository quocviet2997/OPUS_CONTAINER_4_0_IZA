/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : SaqMonQtaRlseVO.java
*@FileTitle : SaqMonQtaRlseVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.23
*@LastModifier : 김민아
*@LastVersion : 1.0
* 2009.07.23 김민아 
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
 * @author 김민아
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class SaqMonQtaRlseVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<SaqMonQtaRlseVO> models = new ArrayList<SaqMonQtaRlseVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String bseQtrCd = null;
	/* Column Info */
	private String mqtaRlseVerNo = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String rlseGdt = null;
	/* Column Info */
	private String mqtaUpdFlg = null;
	/* Column Info */
	private String qtaRlseStsCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String bseYr = null;
	/* Column Info */
	private String updUsrId = null;
	/* Page Number */
	private String pagerows = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public SaqMonQtaRlseVO() {}

	public SaqMonQtaRlseVO(String ibflag, String pagerows, String mqtaRlseVerNo, String bseYr, String bseQtrCd, String rlseGdt, String qtaRlseStsCd, String mqtaUpdFlg, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.bseQtrCd = bseQtrCd;
		this.mqtaRlseVerNo = mqtaRlseVerNo;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.rlseGdt = rlseGdt;
		this.mqtaUpdFlg = mqtaUpdFlg;
		this.qtaRlseStsCd = qtaRlseStsCd;
		this.creDt = creDt;
		this.bseYr = bseYr;
		this.updUsrId = updUsrId;
		this.pagerows = pagerows;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("bse_qtr_cd", getBseQtrCd());
		this.hashColumns.put("mqta_rlse_ver_no", getMqtaRlseVerNo());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("rlse_gdt", getRlseGdt());
		this.hashColumns.put("mqta_upd_flg", getMqtaUpdFlg());
		this.hashColumns.put("qta_rlse_sts_cd", getQtaRlseStsCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("bse_yr", getBseYr());
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
		this.hashFields.put("bse_qtr_cd", "bseQtrCd");
		this.hashFields.put("mqta_rlse_ver_no", "mqtaRlseVerNo");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("rlse_gdt", "rlseGdt");
		this.hashFields.put("mqta_upd_flg", "mqtaUpdFlg");
		this.hashFields.put("qta_rlse_sts_cd", "qtaRlseStsCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("bse_yr", "bseYr");
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
	 * @return bseQtrCd
	 */
	public String getBseQtrCd() {
		return this.bseQtrCd;
	}
	
	/**
	 * Column Info
	 * @return mqtaRlseVerNo
	 */
	public String getMqtaRlseVerNo() {
		return this.mqtaRlseVerNo;
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
	 * @return rlseGdt
	 */
	public String getRlseGdt() {
		return this.rlseGdt;
	}
	
	/**
	 * Column Info
	 * @return mqtaUpdFlg
	 */
	public String getMqtaUpdFlg() {
		return this.mqtaUpdFlg;
	}
	
	/**
	 * Column Info
	 * @return qtaRlseStsCd
	 */
	public String getQtaRlseStsCd() {
		return this.qtaRlseStsCd;
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
	 * @param bseQtrCd
	 */
	public void setBseQtrCd(String bseQtrCd) {
		this.bseQtrCd = bseQtrCd;
	}
	
	/**
	 * Column Info
	 * @param mqtaRlseVerNo
	 */
	public void setMqtaRlseVerNo(String mqtaRlseVerNo) {
		this.mqtaRlseVerNo = mqtaRlseVerNo;
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
	 * @param rlseGdt
	 */
	public void setRlseGdt(String rlseGdt) {
		this.rlseGdt = rlseGdt;
	}
	
	/**
	 * Column Info
	 * @param mqtaUpdFlg
	 */
	public void setMqtaUpdFlg(String mqtaUpdFlg) {
		this.mqtaUpdFlg = mqtaUpdFlg;
	}
	
	/**
	 * Column Info
	 * @param qtaRlseStsCd
	 */
	public void setQtaRlseStsCd(String qtaRlseStsCd) {
		this.qtaRlseStsCd = qtaRlseStsCd;
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
		setBseQtrCd(JSPUtil.getParameter(request, "bse_qtr_cd", ""));
		setMqtaRlseVerNo(JSPUtil.getParameter(request, "mqta_rlse_ver_no", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setRlseGdt(JSPUtil.getParameter(request, "rlse_gdt", ""));
		setMqtaUpdFlg(JSPUtil.getParameter(request, "mqta_upd_flg", ""));
		setQtaRlseStsCd(JSPUtil.getParameter(request, "qta_rlse_sts_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setBseYr(JSPUtil.getParameter(request, "bse_yr", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return SaqMonQtaRlseVO[]
	 */
	public SaqMonQtaRlseVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return SaqMonQtaRlseVO[]
	 */
	public SaqMonQtaRlseVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		SaqMonQtaRlseVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] bseQtrCd = (JSPUtil.getParameter(request, prefix	+ "bse_qtr_cd", length));
			String[] mqtaRlseVerNo = (JSPUtil.getParameter(request, prefix	+ "mqta_rlse_ver_no", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] rlseGdt = (JSPUtil.getParameter(request, prefix	+ "rlse_gdt", length));
			String[] mqtaUpdFlg = (JSPUtil.getParameter(request, prefix	+ "mqta_upd_flg", length));
			String[] qtaRlseStsCd = (JSPUtil.getParameter(request, prefix	+ "qta_rlse_sts_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] bseYr = (JSPUtil.getParameter(request, prefix	+ "bse_yr", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			
			for (int i = 0; i < length; i++) {
				model = new SaqMonQtaRlseVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (bseQtrCd[i] != null)
					model.setBseQtrCd(bseQtrCd[i]);
				if (mqtaRlseVerNo[i] != null)
					model.setMqtaRlseVerNo(mqtaRlseVerNo[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (rlseGdt[i] != null)
					model.setRlseGdt(rlseGdt[i]);
				if (mqtaUpdFlg[i] != null)
					model.setMqtaUpdFlg(mqtaUpdFlg[i]);
				if (qtaRlseStsCd[i] != null)
					model.setQtaRlseStsCd(qtaRlseStsCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (bseYr[i] != null)
					model.setBseYr(bseYr[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getSaqMonQtaRlseVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return SaqMonQtaRlseVO[]
	 */
	public SaqMonQtaRlseVO[] getSaqMonQtaRlseVOs(){
		SaqMonQtaRlseVO[] vos = (SaqMonQtaRlseVO[])models.toArray(new SaqMonQtaRlseVO[models.size()]);
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
		this.bseQtrCd = this.bseQtrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mqtaRlseVerNo = this.mqtaRlseVerNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rlseGdt = this.rlseGdt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mqtaUpdFlg = this.mqtaUpdFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.qtaRlseStsCd = this.qtaRlseStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bseYr = this.bseYr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
