/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : AccessHistoryVO.java
*@FileTitle : AccessHistoryVO
*Open Issues :
*Change history :
*@LastModifyDate : 2010.03.09
*@LastModifier : 김경범
*@LastVersion : 1.0
* 2010.03.09 김경범 
* 1.0 Creation
=========================================================*/

package com.clt.syscommon.management.opus.accesshistory.vo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.clt.framework.component.common.AbstractValueObject;
import com.clt.framework.component.util.JSPUtil;

/**
 * Table Value Ojbect<br>
 * 관련 Event 에서 생성, 서버실행요청시 Data 전달역할을 수행하는 Value Object
 *
 * @author 김경범
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class AccessHistoryVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<AccessHistoryVO> models = new ArrayList<AccessHistoryVO>();
	
	/* Column Info */
	private String cntCud = null;
	/* Column Info */
	private String lvl6 = null;
	/* Column Info */
	private String lvl2 = null;
	/* Column Info */
	private String pgmNm = null;
	/* Column Info */
	private String lvl3 = null;
	/* Column Info */
	private String cntEtc = null;
	/* Column Info */
	private String lvl4 = null;
	/* Column Info */
	private String pgmNo = null;
	/* Column Info */
	private String cntLoad = null;
	/* Column Info */
	private String lvl5 = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String cntRrr = null;
	/* Column Info */
	private String ofcCd = null;
	/* Column Info */
	private String lvl1 = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String cntTotal = null;
	/* Column Info */
	private String lvl = null;
	/* Column Info */
	private String usrId = null;
	/* Column Info */
	private String hlvl = null;
	/* Column Info */
	private String rhq = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public AccessHistoryVO() {}

	public AccessHistoryVO(String ibflag, String pagerows, String lvl, String hlvl, String pgmNo, String pgmNm, String cntTotal, String cntLoad, String cntCud, String cntRrr, String cntEtc, String rhq, String ofcCd, String usrId, String lvl1, String lvl2, String lvl3, String lvl4, String lvl5, String lvl6) {
		this.cntCud = cntCud;
		this.lvl6 = lvl6;
		this.lvl2 = lvl2;
		this.pgmNm = pgmNm;
		this.lvl3 = lvl3;
		this.cntEtc = cntEtc;
		this.lvl4 = lvl4;
		this.pgmNo = pgmNo;
		this.cntLoad = cntLoad;
		this.lvl5 = lvl5;
		this.pagerows = pagerows;
		this.cntRrr = cntRrr;
		this.ofcCd = ofcCd;
		this.lvl1 = lvl1;
		this.ibflag = ibflag;
		this.cntTotal = cntTotal;
		this.lvl = lvl;
		this.usrId = usrId;
		this.hlvl = hlvl;
		this.rhq = rhq;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("cnt_cud", getCntCud());
		this.hashColumns.put("lvl6", getLvl6());
		this.hashColumns.put("lvl2", getLvl2());
		this.hashColumns.put("pgm_nm", getPgmNm());
		this.hashColumns.put("lvl3", getLvl3());
		this.hashColumns.put("cnt_etc", getCntEtc());
		this.hashColumns.put("lvl4", getLvl4());
		this.hashColumns.put("pgm_no", getPgmNo());
		this.hashColumns.put("cnt_load", getCntLoad());
		this.hashColumns.put("lvl5", getLvl5());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("cnt_rrr", getCntRrr());
		this.hashColumns.put("ofc_cd", getOfcCd());
		this.hashColumns.put("lvl1", getLvl1());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cnt_total", getCntTotal());
		this.hashColumns.put("level", getLvl());
		this.hashColumns.put("usr_id", getUsrId());
		this.hashColumns.put("hlvl", getHlvl());
		this.hashColumns.put("rhq", getRhq());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("cnt_cud", "cntCud");
		this.hashFields.put("lvl6", "lvl6");
		this.hashFields.put("lvl2", "lvl2");
		this.hashFields.put("pgm_nm", "pgmNm");
		this.hashFields.put("lvl3", "lvl3");
		this.hashFields.put("cnt_etc", "cntEtc");
		this.hashFields.put("lvl4", "lvl4");
		this.hashFields.put("pgm_no", "pgmNo");
		this.hashFields.put("cnt_load", "cntLoad");
		this.hashFields.put("lvl5", "lvl5");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("cnt_rrr", "cntRrr");
		this.hashFields.put("ofc_cd", "ofcCd");
		this.hashFields.put("lvl1", "lvl1");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cnt_total", "cntTotal");
		this.hashFields.put("lvl", "lvl");
		this.hashFields.put("usr_id", "usrId");
		this.hashFields.put("hlvl", "hlvl");
		this.hashFields.put("rhq", "rhq");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return cntCud
	 */
	public String getCntCud() {
		return this.cntCud;
	}
	
	/**
	 * Column Info
	 * @return lvl6
	 */
	public String getLvl6() {
		return this.lvl6;
	}
	
	/**
	 * Column Info
	 * @return lvl2
	 */
	public String getLvl2() {
		return this.lvl2;
	}
	
	/**
	 * Column Info
	 * @return pgmNm
	 */
	public String getPgmNm() {
		return this.pgmNm;
	}
	
	/**
	 * Column Info
	 * @return lvl3
	 */
	public String getLvl3() {
		return this.lvl3;
	}
	
	/**
	 * Column Info
	 * @return cntEtc
	 */
	public String getCntEtc() {
		return this.cntEtc;
	}
	
	/**
	 * Column Info
	 * @return lvl4
	 */
	public String getLvl4() {
		return this.lvl4;
	}
	
	/**
	 * Column Info
	 * @return pgmNo
	 */
	public String getPgmNo() {
		return this.pgmNo;
	}
	
	/**
	 * Column Info
	 * @return cntLoad
	 */
	public String getCntLoad() {
		return this.cntLoad;
	}
	
	/**
	 * Column Info
	 * @return lvl5
	 */
	public String getLvl5() {
		return this.lvl5;
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
	 * @return cntRrr
	 */
	public String getCntRrr() {
		return this.cntRrr;
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
	 * @return lvl1
	 */
	public String getLvl1() {
		return this.lvl1;
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
	 * @return cntTotal
	 */
	public String getCntTotal() {
		return this.cntTotal;
	}
	
	/**
	 * Column Info
	 * @return lvl
	 */
	public String getLvl() {
		return this.lvl;
	}
	
	/**
	 * Column Info
	 * @return usrId
	 */
	public String getUsrId() {
		return this.usrId;
	}
	
	/**
	 * Column Info
	 * @return hlvl
	 */
	public String getHlvl() {
		return this.hlvl;
	}
	
	/**
	 * Column Info
	 * @return rhq
	 */
	public String getRhq() {
		return this.rhq;
	}
	

	/**
	 * Column Info
	 * @param cntCud
	 */
	public void setCntCud(String cntCud) {
		this.cntCud = cntCud;
	}
	
	/**
	 * Column Info
	 * @param lvl6
	 */
	public void setLvl6(String lvl6) {
		this.lvl6 = lvl6;
	}
	
	/**
	 * Column Info
	 * @param lvl2
	 */
	public void setLvl2(String lvl2) {
		this.lvl2 = lvl2;
	}
	
	/**
	 * Column Info
	 * @param pgmNm
	 */
	public void setPgmNm(String pgmNm) {
		this.pgmNm = pgmNm;
	}
	
	/**
	 * Column Info
	 * @param lvl3
	 */
	public void setLvl3(String lvl3) {
		this.lvl3 = lvl3;
	}
	
	/**
	 * Column Info
	 * @param cntEtc
	 */
	public void setCntEtc(String cntEtc) {
		this.cntEtc = cntEtc;
	}
	
	/**
	 * Column Info
	 * @param lvl4
	 */
	public void setLvl4(String lvl4) {
		this.lvl4 = lvl4;
	}
	
	/**
	 * Column Info
	 * @param pgmNo
	 */
	public void setPgmNo(String pgmNo) {
		this.pgmNo = pgmNo;
	}
	
	/**
	 * Column Info
	 * @param cntLoad
	 */
	public void setCntLoad(String cntLoad) {
		this.cntLoad = cntLoad;
	}
	
	/**
	 * Column Info
	 * @param lvl5
	 */
	public void setLvl5(String lvl5) {
		this.lvl5 = lvl5;
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
	 * @param cntRrr
	 */
	public void setCntRrr(String cntRrr) {
		this.cntRrr = cntRrr;
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
	 * @param lvl1
	 */
	public void setLvl1(String lvl1) {
		this.lvl1 = lvl1;
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
	 * @param cntTotal
	 */
	public void setCntTotal(String cntTotal) {
		this.cntTotal = cntTotal;
	}
	
	/**
	 * Column Info
	 * @param lvl
	 */
	public void setLvl(String lvl) {
		this.lvl = lvl;
	}
	
	/**
	 * Column Info
	 * @param usrId
	 */
	public void setUsrId(String usrId) {
		this.usrId = usrId;
	}
	
	/**
	 * Column Info
	 * @param hlvl
	 */
	public void setHlvl(String hlvl) {
		this.hlvl = hlvl;
	}
	
	/**
	 * Column Info
	 * @param rhq
	 */
	public void setRhq(String rhq) {
		this.rhq = rhq;
	}
	
/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		fromRequest(request,"");
	}

	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request, String prefix) {
		setCntCud(JSPUtil.getParameter(request, prefix + "cnt_cud", ""));
		setLvl6(JSPUtil.getParameter(request, prefix + "lvl6", ""));
		setLvl2(JSPUtil.getParameter(request, prefix + "lvl2", ""));
		setPgmNm(JSPUtil.getParameter(request, prefix + "pgm_nm", ""));
		setLvl3(JSPUtil.getParameter(request, prefix + "lvl3", ""));
		setCntEtc(JSPUtil.getParameter(request, prefix + "cnt_etc", ""));
		setLvl4(JSPUtil.getParameter(request, prefix + "lvl4", ""));
		setPgmNo(JSPUtil.getParameter(request, prefix + "pgm_no", ""));
		setCntLoad(JSPUtil.getParameter(request, prefix + "cnt_load", ""));
		setLvl5(JSPUtil.getParameter(request, prefix + "lvl5", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setCntRrr(JSPUtil.getParameter(request, prefix + "cnt_rrr", ""));
		setOfcCd(JSPUtil.getParameter(request, prefix + "ofc_cd", ""));
		setLvl1(JSPUtil.getParameter(request, prefix + "lvl1", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setCntTotal(JSPUtil.getParameter(request, prefix + "cnt_total", ""));
		setLvl(JSPUtil.getParameter(request, prefix + "lvl", ""));
		setUsrId(JSPUtil.getParameter(request, prefix + "usr_id", ""));
		setHlvl(JSPUtil.getParameter(request, prefix + "hlvl", ""));
		setRhq(JSPUtil.getParameter(request, prefix + "rhq", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return AccessHistoryVO[]
	 */
	public AccessHistoryVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return AccessHistoryVO[]
	 */
	public AccessHistoryVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		AccessHistoryVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] cntCud = (JSPUtil.getParameter(request, prefix	+ "cnt_cud", length));
			String[] lvl6 = (JSPUtil.getParameter(request, prefix	+ "lvl6", length));
			String[] lvl2 = (JSPUtil.getParameter(request, prefix	+ "lvl2", length));
			String[] pgmNm = (JSPUtil.getParameter(request, prefix	+ "pgm_nm", length));
			String[] lvl3 = (JSPUtil.getParameter(request, prefix	+ "lvl3", length));
			String[] cntEtc = (JSPUtil.getParameter(request, prefix	+ "cnt_etc", length));
			String[] lvl4 = (JSPUtil.getParameter(request, prefix	+ "lvl4", length));
			String[] pgmNo = (JSPUtil.getParameter(request, prefix	+ "pgm_no", length));
			String[] cntLoad = (JSPUtil.getParameter(request, prefix	+ "cnt_load", length));
			String[] lvl5 = (JSPUtil.getParameter(request, prefix	+ "lvl5", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] cntRrr = (JSPUtil.getParameter(request, prefix	+ "cnt_rrr", length));
			String[] ofcCd = (JSPUtil.getParameter(request, prefix	+ "ofc_cd", length));
			String[] lvl1 = (JSPUtil.getParameter(request, prefix	+ "lvl1", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] cntTotal = (JSPUtil.getParameter(request, prefix	+ "cnt_total", length));
			String[] lvl = (JSPUtil.getParameter(request, prefix	+ "lvl", length));
			String[] usrId = (JSPUtil.getParameter(request, prefix	+ "usr_id", length));
			String[] hlvl = (JSPUtil.getParameter(request, prefix	+ "hlvl", length));
			String[] rhq = (JSPUtil.getParameter(request, prefix	+ "rhq", length));
			
			for (int i = 0; i < length; i++) {
				model = new AccessHistoryVO();
				if (cntCud[i] != null)
					model.setCntCud(cntCud[i]);
				if (lvl6[i] != null)
					model.setLvl6(lvl6[i]);
				if (lvl2[i] != null)
					model.setLvl2(lvl2[i]);
				if (pgmNm[i] != null)
					model.setPgmNm(pgmNm[i]);
				if (lvl3[i] != null)
					model.setLvl3(lvl3[i]);
				if (cntEtc[i] != null)
					model.setCntEtc(cntEtc[i]);
				if (lvl4[i] != null)
					model.setLvl4(lvl4[i]);
				if (pgmNo[i] != null)
					model.setPgmNo(pgmNo[i]);
				if (cntLoad[i] != null)
					model.setCntLoad(cntLoad[i]);
				if (lvl5[i] != null)
					model.setLvl5(lvl5[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (cntRrr[i] != null)
					model.setCntRrr(cntRrr[i]);
				if (ofcCd[i] != null)
					model.setOfcCd(ofcCd[i]);
				if (lvl1[i] != null)
					model.setLvl1(lvl1[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (cntTotal[i] != null)
					model.setCntTotal(cntTotal[i]);
				if (lvl[i] != null)
					model.setLvl(lvl[i]);
				if (usrId[i] != null)
					model.setUsrId(usrId[i]);
				if (hlvl[i] != null)
					model.setHlvl(hlvl[i]);
				if (rhq[i] != null)
					model.setRhq(rhq[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getAccessHistoryVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return AccessHistoryVO[]
	 */
	public AccessHistoryVO[] getAccessHistoryVOs(){
		AccessHistoryVO[] vos = (AccessHistoryVO[])models.toArray(new AccessHistoryVO[models.size()]);
		return vos;
	}
	
	/**
	 * VO Class의 내용을 String으로 변환
	 */
	public String toString() {
		   return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE );
	   }

	/**
	* 포맷팅된 문자열에서 특수문자 제거("-","/",",",":")
	*/
	public void unDataFormat(){
		this.cntCud = this.cntCud .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lvl6 = this.lvl6 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lvl2 = this.lvl2 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pgmNm = this.pgmNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lvl3 = this.lvl3 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntEtc = this.cntEtc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lvl4 = this.lvl4 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pgmNo = this.pgmNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntLoad = this.cntLoad .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lvl5 = this.lvl5 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntRrr = this.cntRrr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ofcCd = this.ofcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lvl1 = this.lvl1 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntTotal = this.cntTotal .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lvl = this.lvl .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.usrId = this.usrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hlvl = this.hlvl .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rhq = this.rhq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
