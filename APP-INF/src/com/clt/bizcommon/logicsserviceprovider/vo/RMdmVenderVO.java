/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : RMdmVenderVO.java
*@FileTitle : RMdmVenderVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.04.24
*@LastModifier : 우경민
*@LastVersion : 1.0
* 2009.04.24 우경민 
* 1.0 Creation
=========================================================*/

package com.clt.bizcommon.logicsserviceprovider.vo;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import com.clt.framework.component.common.AbstractValueObject;
import com.clt.framework.component.util.JSPUtil;

/**
 * - TBL : MDM_VENDER <br>
 * - LogicsServiceProvider 조회 처리 <br>
 * - searchLogicsServiceProvider에서 호출. Vender List<br>
 *
 * @author 우경민
 * @since J2EE 1.5 
 *  * 2009.4.30
 */


public class RMdmVenderVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<RMdmVenderVO> models = new ArrayList<RMdmVenderVO>();
	
	/* Status */
	private String ibflag = null;
	/* Column Info */
	private String vndrSeq = null;
	/* Column Info */
	private String vndrAbbrNm = null;
	/* Column Info */
	private String prntVndrSeq = null;
	/* Column Info */
	private String ofcCd = null;
	/* Column Info */
	private String vndrLglEngNm = null;
	/* Column Info */
	private String engAddr = null;
	/* Column Info */
	private String vndrCntCd = null;
	/* Column Info */
	private String pCountry = null;
	/* Column Info */
	private String pVndrSeq = null;
	/* Column Info */
	private String pSpType = null;
	/* Column Info */
	private String pPrintVndrSeq = null;
	/* Column Info */
	private String orgVndrSeq = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String pOfcCd = null;
	/* Column Info */
	private String pVndrNm = null;
	/* Column Info */
	private String usaEdiCd = null;
	/* Column Info */
	private String modiVndrCd = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	hashFildInpo	*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public RMdmVenderVO() {}

	public RMdmVenderVO(String ibflag, String pagerows, String vndrSeq, String ofcCd, String vndrLglEngNm, String vndrAbbrNm, String prntVndrSeq, String vndrCntCd, String orgVndrSeq, String engAddr, String pCountry, String pOfcCd, String pVndrNm, String pPrintVndrSeq, String pVndrSeq, String pSpType, String usaEdiCd, String modiVndrCd) {
		this.ibflag = ibflag;
		this.vndrSeq = vndrSeq;
		this.vndrAbbrNm = vndrAbbrNm;
		this.prntVndrSeq = prntVndrSeq;
		this.ofcCd = ofcCd;
		this.vndrLglEngNm = vndrLglEngNm;
		this.engAddr = engAddr;
		this.vndrCntCd = vndrCntCd;
		this.pCountry = pCountry;
		this.pVndrSeq = pVndrSeq;
		this.pSpType = pSpType;
		this.pPrintVndrSeq = pPrintVndrSeq;
		this.orgVndrSeq = orgVndrSeq;
		this.pagerows = pagerows;
		this.pOfcCd = pOfcCd;
		this.pVndrNm = pVndrNm;
		this.usaEdiCd = usaEdiCd;
		this.modiVndrCd = modiVndrCd;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("vndr_seq", getVndrSeq());
		this.hashColumns.put("vndr_abbr_nm", getVndrAbbrNm());
		this.hashColumns.put("prnt_vndr_seq", getPrntVndrSeq());
		this.hashColumns.put("ofc_cd", getOfcCd());
		this.hashColumns.put("vndr_lgl_eng_nm", getVndrLglEngNm());
		this.hashColumns.put("eng_addr", getEngAddr());
		this.hashColumns.put("vndr_cnt_cd", getVndrCntCd());
		this.hashColumns.put("p_country", getPCountry());
		this.hashColumns.put("p_vndr_seq", getPVndrSeq());
		this.hashColumns.put("p_sp_type", getPSpType());
		this.hashColumns.put("p_print_vndr_seq", getPPrintVndrSeq());
		this.hashColumns.put("org_vndr_seq", getOrgVndrSeq());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("p_ofc_cd", getPOfcCd());
		this.hashColumns.put("p_vndr_nm", getPVndrNm());
		this.hashColumns.put("usa_edi_cd", getUsaEdiCd());
		this.hashColumns.put("modi_vndr_cd", getModiVndrCd());
		return this.hashColumns;
	}
	
	/**
	 * hashFildInpo
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("vndr_seq", "vndrSeq");
		this.hashFields.put("vndr_abbr_nm", "vndrAbbrNm");
		this.hashFields.put("prnt_vndr_seq", "prntVndrSeq");
		this.hashFields.put("ofc_cd", "ofcCd");
		this.hashFields.put("vndr_lgl_eng_nm", "vndrLglEngNm");
		this.hashFields.put("eng_addr", "engAddr");
		this.hashFields.put("vndr_cnt_cd", "vndrCntCd");
		this.hashFields.put("p_country", "pCountry");
		this.hashFields.put("p_vndr_seq", "pVndrSeq");
		this.hashFields.put("p_sp_type", "pSpType");
		this.hashFields.put("p_print_vndr_seq", "pPrintVndrSeq");
		this.hashFields.put("org_vndr_seq", "orgVndrSeq");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("p_ofc_cd", "pOfcCd");
		this.hashFields.put("p_vndr_nm", "pVndrNm");
		this.hashFields.put("usa_edi_cd", "usaEdiCd");
		this.hashFields.put("modi_vndr_cd", "modiVndrCd");
		return this.hashFields;
	}
	
	public String getIbflag() {
		return this.ibflag;
	}
	public String getVndrSeq() {
		return this.vndrSeq;
	}
	public String getVndrAbbrNm() {
		return this.vndrAbbrNm;
	}
	public String getPrntVndrSeq() {
		return this.prntVndrSeq;
	}
	public String getOfcCd() {
		return this.ofcCd;
	}
	public String getVndrLglEngNm() {
		return this.vndrLglEngNm;
	}
	public String getEngAddr() {
		return this.engAddr;
	}
	public String getVndrCntCd() {
		return this.vndrCntCd;
	}
	public String getPCountry() {
		return this.pCountry;
	}
	public String getPVndrSeq() {
		return this.pVndrSeq;
	}
	public String getPSpType() {
		return this.pSpType;
	}
	public String getPPrintVndrSeq() {
		return this.pPrintVndrSeq;
	}
	public String getOrgVndrSeq() {
		return this.orgVndrSeq;
	}
	public String getPagerows() {
		return this.pagerows;
	}
	public String getPOfcCd() {
		return this.pOfcCd;
	}
	public String getPVndrNm() {
		return this.pVndrNm;
	}
	public String getUsaEdiCd() {
		return usaEdiCd;
	}
	public String getModiVndrCd() {
		return modiVndrCd;
	}
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setVndrSeq(String vndrSeq) {
		this.vndrSeq = vndrSeq;
		//this.vndrSeq=true;
	}
	public void setVndrAbbrNm(String vndrAbbrNm) {
		this.vndrAbbrNm = vndrAbbrNm;
		//this.vndrAbbrNm=true;
	}
	public void setPrntVndrSeq(String prntVndrSeq) {
		this.prntVndrSeq = prntVndrSeq;
		//this.prntVndrSeq=true;
	}
	public void setOfcCd(String ofcCd) {
		this.ofcCd = ofcCd;
		//this.ofcCd=true;
	}
	public void setVndrLglEngNm(String vndrLglEngNm) {
		this.vndrLglEngNm = vndrLglEngNm;
		//this.vndrLglEngNm=true;
	}
	public void setEngAddr(String engAddr) {
		this.engAddr = engAddr;
		//this.engAddr=true;
	}
	public void setVndrCntCd(String vndrCntCd) {
		this.vndrCntCd = vndrCntCd;
		//this.vndrCntCd=true;
	}
	public void setPCountry(String pCountry) {
		this.pCountry = pCountry;
		//this.pCountry=true;
	}
	public void setPVndrSeq(String pVndrSeq) {
		this.pVndrSeq = pVndrSeq;
		//this.pVndrSeq=true;
	}
	public void setPSpType(String pSpType) {
		this.pSpType = pSpType;
		//this.pSpType=true;
	}
	public void setPPrintVndrSeq(String pPrintVndrSeq) {
		this.pPrintVndrSeq = pPrintVndrSeq;
		//this.pPrintVndrSeq=true;
	}
	public void setOrgVndrSeq(String orgVndrSeq) {
		this.orgVndrSeq = orgVndrSeq;
		//this.orgVndrSeq=true;
	}
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}
	public void setPOfcCd(String pOfcCd) {
		this.pOfcCd = pOfcCd;
		//this.pOfcCd=true;
	}
	public void setPVndrNm(String pVndrNm) {
		this.pVndrNm = pVndrNm;
		//this.pVndrNm=true;
	}
	public void setUsaEdiCd(String usaEdiCd) {
		this.usaEdiCd = usaEdiCd;
	}
	public void setModiVndrCd(String modiVndrCd) {
		this.modiVndrCd = modiVndrCd;
	}
	public void fromRequest(HttpServletRequest request) {
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setVndrSeq(JSPUtil.getParameter(request, "vndr_seq", ""));
		setVndrAbbrNm(JSPUtil.getParameter(request, "vndr_abbr_nm", ""));
		setPrntVndrSeq(JSPUtil.getParameter(request, "prnt_vndr_seq", ""));
		setOfcCd(JSPUtil.getParameter(request, "ofc_cd", ""));
		setVndrLglEngNm(JSPUtil.getParameter(request, "vndr_lgl_eng_nm", ""));
		setEngAddr(JSPUtil.getParameter(request, "eng_addr", ""));
		setVndrCntCd(JSPUtil.getParameter(request, "vndr_cnt_cd", ""));
		setPCountry(JSPUtil.getParameter(request, "p_country", ""));
		setPVndrSeq(JSPUtil.getParameter(request, "p_vndr_seq", ""));
		setPSpType(JSPUtil.getParameter(request, "p_sp_type", ""));
		setPPrintVndrSeq(JSPUtil.getParameter(request, "p_print_vndr_seq", ""));
		setOrgVndrSeq(JSPUtil.getParameter(request, "org_vndr_seq", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setPOfcCd(JSPUtil.getParameter(request, "p_ofc_cd", ""));
		setPVndrNm(JSPUtil.getParameter(request, "p_vndr_nm", ""));
		setUsaEdiCd(JSPUtil.getParameter(request, "usa_edi_cd", ""));
		setModiVndrCd(JSPUtil.getParameter(request, "modi_vndr_cd", ""));
	}

	public RMdmVenderVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public RMdmVenderVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		RMdmVenderVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] vndrSeq = (JSPUtil.getParameter(request, prefix	+ "vndr_seq".trim(), length));
			String[] vndrAbbrNm = (JSPUtil.getParameter(request, prefix	+ "vndr_abbr_nm".trim(), length));
			String[] prntVndrSeq = (JSPUtil.getParameter(request, prefix	+ "prnt_vndr_seq".trim(), length));
			String[] ofcCd = (JSPUtil.getParameter(request, prefix	+ "ofc_cd".trim(), length));
			String[] vndrLglEngNm = (JSPUtil.getParameter(request, prefix	+ "vndr_lgl_eng_nm".trim(), length));
			String[] engAddr = (JSPUtil.getParameter(request, prefix	+ "eng_addr".trim(), length));
			String[] vndrCntCd = (JSPUtil.getParameter(request, prefix	+ "vndr_cnt_cd".trim(), length));
			String[] pCountry = (JSPUtil.getParameter(request, prefix	+ "p_country".trim(), length));
			String[] pVndrSeq = (JSPUtil.getParameter(request, prefix	+ "p_vndr_seq".trim(), length));
			String[] pSpType = (JSPUtil.getParameter(request, prefix	+ "p_sp_type".trim(), length));
			String[] pPrintVndrSeq = (JSPUtil.getParameter(request, prefix	+ "p_print_vndr_seq".trim(), length));
			String[] orgVndrSeq = (JSPUtil.getParameter(request, prefix	+ "org_vndr_seq".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] pOfcCd = (JSPUtil.getParameter(request, prefix	+ "p_ofc_cd".trim(), length));
			String[] pVndrNm = (JSPUtil.getParameter(request, prefix	+ "p_vndr_nm".trim(), length));
			String[] usaEdiCd = (JSPUtil.getParameter(request, prefix	+ "usa_edi_cd".trim(), length));
			String[] modiVndrCd = (JSPUtil.getParameter(request, prefix	+ "modi_vndr_cd".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new RMdmVenderVO();
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (vndrSeq[i] != null)
					model.setVndrSeq(vndrSeq[i]);
				if (vndrAbbrNm[i] != null)
					model.setVndrAbbrNm(vndrAbbrNm[i]);
				if (prntVndrSeq[i] != null)
					model.setPrntVndrSeq(prntVndrSeq[i]);
				if (ofcCd[i] != null)
					model.setOfcCd(ofcCd[i]);
				if (vndrLglEngNm[i] != null)
					model.setVndrLglEngNm(vndrLglEngNm[i]);
				if (engAddr[i] != null)
					model.setEngAddr(engAddr[i]);
				if (vndrCntCd[i] != null)
					model.setVndrCntCd(vndrCntCd[i]);
				if (pCountry[i] != null)
					model.setPCountry(pCountry[i]);
				if (pVndrSeq[i] != null)
					model.setPVndrSeq(pVndrSeq[i]);
				if (pSpType[i] != null)
					model.setPSpType(pSpType[i]);
				if (pPrintVndrSeq[i] != null)
					model.setPPrintVndrSeq(pPrintVndrSeq[i]);
				if (orgVndrSeq[i] != null)
					model.setOrgVndrSeq(orgVndrSeq[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (pOfcCd[i] != null)
					model.setPOfcCd(pOfcCd[i]);
				if (pVndrNm[i] != null)
					model.setPVndrNm(pVndrNm[i]);
				if (usaEdiCd[i] != null)
					model.setUsaEdiCd(usaEdiCd[i]);
				if (modiVndrCd[i] != null)
					model.setModiVndrCd(modiVndrCd[i]);
				models.add(model);
			}

		} catch (Exception e) {}
		return getRMdmVenderVOs();
	}

	public RMdmVenderVO[] getRMdmVenderVOs(){
		RMdmVenderVO[] vos = (RMdmVenderVO[])models.toArray(new RMdmVenderVO[models.size()]);
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
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vndrSeq = this.vndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vndrAbbrNm = this.vndrAbbrNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prntVndrSeq = this.prntVndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ofcCd = this.ofcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vndrLglEngNm = this.vndrLglEngNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.engAddr = this.engAddr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vndrCntCd = this.vndrCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pCountry = this.pCountry .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pVndrSeq = this.pVndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pSpType = this.pSpType .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pPrintVndrSeq = this.pPrintVndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.orgVndrSeq = this.orgVndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pOfcCd = this.pOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pVndrNm = this.pVndrNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.usaEdiCd = this.usaEdiCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.modiVndrCd = this.modiVndrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
