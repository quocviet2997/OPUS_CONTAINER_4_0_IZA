/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : SaqYryQtaRlseVO.java
*@FileTitle : SaqYryQtaRlseVO
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

public class SaqYryQtaRlseVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<SaqYryQtaRlseVO> models = new ArrayList<SaqYryQtaRlseVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String qtaTgtCd = null;
	/* Column Info */
	private String rlseGdt = null;
	/* Column Info */
	private String qtaRlseStsCd = null;
	/* Column Info */
	private String rcvGdt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String sndGdt = null;
	/* Column Info */
	private String bseYr = null;
	/* Page Number */
	private String pagerows = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String yqtaRlseVerNo = null;
	/* Column Info */
	private String updUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public SaqYryQtaRlseVO() {}

	public SaqYryQtaRlseVO(String ibflag, String pagerows, String yqtaRlseVerNo, String qtaTgtCd, String bseYr, String sndGdt, String rcvGdt, String rlseGdt, String qtaRlseStsCd, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.qtaTgtCd = qtaTgtCd;
		this.rlseGdt = rlseGdt;
		this.qtaRlseStsCd = qtaRlseStsCd;
		this.rcvGdt = rcvGdt;
		this.creDt = creDt;
		this.sndGdt = sndGdt;
		this.bseYr = bseYr;
		this.pagerows = pagerows;
		this.ibflag = ibflag;
		this.creUsrId = creUsrId;
		this.yqtaRlseVerNo = yqtaRlseVerNo;
		this.updUsrId = updUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("qta_tgt_cd", getQtaTgtCd());
		this.hashColumns.put("rlse_gdt", getRlseGdt());
		this.hashColumns.put("qta_rlse_sts_cd", getQtaRlseStsCd());
		this.hashColumns.put("rcv_gdt", getRcvGdt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("snd_gdt", getSndGdt());
		this.hashColumns.put("bse_yr", getBseYr());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("yqta_rlse_ver_no", getYqtaRlseVerNo());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("qta_tgt_cd", "qtaTgtCd");
		this.hashFields.put("rlse_gdt", "rlseGdt");
		this.hashFields.put("qta_rlse_sts_cd", "qtaRlseStsCd");
		this.hashFields.put("rcv_gdt", "rcvGdt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("snd_gdt", "sndGdt");
		this.hashFields.put("bse_yr", "bseYr");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("yqta_rlse_ver_no", "yqtaRlseVerNo");
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
	 * @return qtaTgtCd
	 */
	public String getQtaTgtCd() {
		return this.qtaTgtCd;
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
	 * @return qtaRlseStsCd
	 */
	public String getQtaRlseStsCd() {
		return this.qtaRlseStsCd;
	}
	
	/**
	 * Column Info
	 * @return rcvGdt
	 */
	public String getRcvGdt() {
		return this.rcvGdt;
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
	 * @return sndGdt
	 */
	public String getSndGdt() {
		return this.sndGdt;
	}
	
	/**
	 * Column Info
	 * @return bseYr
	 */
	public String getBseYr() {
		return this.bseYr;
	}
	
	/**
	 * Page Number
	 * @return pagerows
	 */
	public String getPagerows() {
		return this.pagerows;
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
	 * @return creUsrId
	 */
	public String getCreUsrId() {
		return this.creUsrId;
	}
	
	/**
	 * Column Info
	 * @return yqtaRlseVerNo
	 */
	public String getYqtaRlseVerNo() {
		return this.yqtaRlseVerNo;
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
	 * @param qtaTgtCd
	 */
	public void setQtaTgtCd(String qtaTgtCd) {
		this.qtaTgtCd = qtaTgtCd;
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
	 * @param qtaRlseStsCd
	 */
	public void setQtaRlseStsCd(String qtaRlseStsCd) {
		this.qtaRlseStsCd = qtaRlseStsCd;
	}
	
	/**
	 * Column Info
	 * @param rcvGdt
	 */
	public void setRcvGdt(String rcvGdt) {
		this.rcvGdt = rcvGdt;
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
	 * @param sndGdt
	 */
	public void setSndGdt(String sndGdt) {
		this.sndGdt = sndGdt;
	}
	
	/**
	 * Column Info
	 * @param bseYr
	 */
	public void setBseYr(String bseYr) {
		this.bseYr = bseYr;
	}
	
	/**
	 * Page Number
	 * @param pagerows
	 */
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
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
	 * @param creUsrId
	 */
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
	}
	
	/**
	 * Column Info
	 * @param yqtaRlseVerNo
	 */
	public void setYqtaRlseVerNo(String yqtaRlseVerNo) {
		this.yqtaRlseVerNo = yqtaRlseVerNo;
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
		setQtaTgtCd(JSPUtil.getParameter(request, "qta_tgt_cd", ""));
		setRlseGdt(JSPUtil.getParameter(request, "rlse_gdt", ""));
		setQtaRlseStsCd(JSPUtil.getParameter(request, "qta_rlse_sts_cd", ""));
		setRcvGdt(JSPUtil.getParameter(request, "rcv_gdt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setSndGdt(JSPUtil.getParameter(request, "snd_gdt", ""));
		setBseYr(JSPUtil.getParameter(request, "bse_yr", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setYqtaRlseVerNo(JSPUtil.getParameter(request, "yqta_rlse_ver_no", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return SaqYryQtaRlseVO[]
	 */
	public SaqYryQtaRlseVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return SaqYryQtaRlseVO[]
	 */
	public SaqYryQtaRlseVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		SaqYryQtaRlseVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] qtaTgtCd = (JSPUtil.getParameter(request, prefix	+ "qta_tgt_cd", length));
			String[] rlseGdt = (JSPUtil.getParameter(request, prefix	+ "rlse_gdt", length));
			String[] qtaRlseStsCd = (JSPUtil.getParameter(request, prefix	+ "qta_rlse_sts_cd", length));
			String[] rcvGdt = (JSPUtil.getParameter(request, prefix	+ "rcv_gdt", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] sndGdt = (JSPUtil.getParameter(request, prefix	+ "snd_gdt", length));
			String[] bseYr = (JSPUtil.getParameter(request, prefix	+ "bse_yr", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] yqtaRlseVerNo = (JSPUtil.getParameter(request, prefix	+ "yqta_rlse_ver_no", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			
			for (int i = 0; i < length; i++) {
				model = new SaqYryQtaRlseVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (qtaTgtCd[i] != null)
					model.setQtaTgtCd(qtaTgtCd[i]);
				if (rlseGdt[i] != null)
					model.setRlseGdt(rlseGdt[i]);
				if (qtaRlseStsCd[i] != null)
					model.setQtaRlseStsCd(qtaRlseStsCd[i]);
				if (rcvGdt[i] != null)
					model.setRcvGdt(rcvGdt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (sndGdt[i] != null)
					model.setSndGdt(sndGdt[i]);
				if (bseYr[i] != null)
					model.setBseYr(bseYr[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (yqtaRlseVerNo[i] != null)
					model.setYqtaRlseVerNo(yqtaRlseVerNo[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getSaqYryQtaRlseVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return SaqYryQtaRlseVO[]
	 */
	public SaqYryQtaRlseVO[] getSaqYryQtaRlseVOs(){
		SaqYryQtaRlseVO[] vos = (SaqYryQtaRlseVO[])models.toArray(new SaqYryQtaRlseVO[models.size()]);
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
		this.qtaTgtCd = this.qtaTgtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rlseGdt = this.rlseGdt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.qtaRlseStsCd = this.qtaRlseStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rcvGdt = this.rcvGdt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sndGdt = this.sndGdt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bseYr = this.bseYr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.yqtaRlseVerNo = this.yqtaRlseVerNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
