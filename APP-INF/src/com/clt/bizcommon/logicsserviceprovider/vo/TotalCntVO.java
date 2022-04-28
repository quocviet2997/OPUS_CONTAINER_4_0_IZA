/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : TotalCntVO.java
*@FileTitle : TotalCntVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.04.24
*@LastModifier : 우경민
*@LastVersion : 1.0
* 2009.04.24 우경민 
* 1.0 최초생성
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
 * - 팝업에서 불러오는 전체 카운트 조회 - 페이징 처리용<br>
 * - searchLogicsServiceProvider에서 호출. Max Count<br>
 *
 * @author 우경민
 * @since J2EE 1.5 
 * 2009.4.30
 */

public class TotalCntVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<TotalCntVO> models = new ArrayList<TotalCntVO>();
	
	/* Status */
	private String ibflag = null;
	/* Column Info */
	private String cnt = null;
	/* Column Info */
	private String pCountry = null;
	/* Column Info */
	private String pVndrSeq = null;
	/* Column Info */
	private String pSpType = null;
	/* Column Info */
	private String pPrintVndrSeq = null;
	/* Column Info */
	private String pVndrNm = null;
	/* Column Info */
	private String pOfcCd = null;
	/* Page Number */
	private String pagerows = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	hashFildInpo	*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public TotalCntVO() {}

	public TotalCntVO(String ibflag, String pagerows, String cnt, String pCountry, String pOfcCd, String pVndrNm, String pPrintVndrSeq, String pVndrSeq, String pSpType) {
		this.ibflag = ibflag;
		this.cnt = cnt;
		this.pCountry = pCountry;
		this.pVndrSeq = pVndrSeq;
		this.pSpType = pSpType;
		this.pPrintVndrSeq = pPrintVndrSeq;
		this.pVndrNm = pVndrNm;
		this.pOfcCd = pOfcCd;
		this.pagerows = pagerows;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cnt", getCnt());
		this.hashColumns.put("p_country", getPCountry());
		this.hashColumns.put("p_vndr_seq", getPVndrSeq());
		this.hashColumns.put("p_sp_type", getPSpType());
		this.hashColumns.put("p_print_vndr_seq", getPPrintVndrSeq());
		this.hashColumns.put("p_vndr_nm", getPVndrNm());
		this.hashColumns.put("p_ofc_cd", getPOfcCd());
		this.hashColumns.put("pagerows", getPagerows());
		return this.hashColumns;
	}
	
	/**
	 * hashFildInpo
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cnt", "cnt");
		this.hashFields.put("p_country", "pCountry");
		this.hashFields.put("p_vndr_seq", "pVndrSeq");
		this.hashFields.put("p_sp_type", "pSpType");
		this.hashFields.put("p_print_vndr_seq", "pPrintVndrSeq");
		this.hashFields.put("p_vndr_nm", "pVndrNm");
		this.hashFields.put("p_ofc_cd", "pOfcCd");
		this.hashFields.put("pagerows", "pagerows");
		return this.hashFields;
	}
	
	public String getIbflag() {
		return this.ibflag;
	}
	public String getCnt() {
		return this.cnt;
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
	public String getPVndrNm() {
		return this.pVndrNm;
	}
	public String getPOfcCd() {
		return this.pOfcCd;
	}
	public String getPagerows() {
		return this.pagerows;
	}

	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setCnt(String cnt) {
		this.cnt = cnt;
		//this.cnt=true;
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
	public void setPVndrNm(String pVndrNm) {
		this.pVndrNm = pVndrNm;
		//this.pVndrNm=true;
	}
	public void setPOfcCd(String pOfcCd) {
		this.pOfcCd = pOfcCd;
		//this.pOfcCd=true;
	}
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}
	public void fromRequest(HttpServletRequest request) {
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCnt(JSPUtil.getParameter(request, "cnt", ""));
		setPCountry(JSPUtil.getParameter(request, "p_country", ""));
		setPVndrSeq(JSPUtil.getParameter(request, "p_vndr_seq", ""));
		setPSpType(JSPUtil.getParameter(request, "p_sp_type", ""));
		setPPrintVndrSeq(JSPUtil.getParameter(request, "p_print_vndr_seq", ""));
		setPVndrNm(JSPUtil.getParameter(request, "p_vndr_nm", ""));
		setPOfcCd(JSPUtil.getParameter(request, "p_ofc_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
	}

	public TotalCntVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public TotalCntVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		TotalCntVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] cnt = (JSPUtil.getParameter(request, prefix	+ "cnt".trim(), length));
			String[] pCountry = (JSPUtil.getParameter(request, prefix	+ "p_country".trim(), length));
			String[] pVndrSeq = (JSPUtil.getParameter(request, prefix	+ "p_vndr_seq".trim(), length));
			String[] pSpType = (JSPUtil.getParameter(request, prefix	+ "p_sp_type".trim(), length));
			String[] pPrintVndrSeq = (JSPUtil.getParameter(request, prefix	+ "p_print_vndr_seq".trim(), length));
			String[] pVndrNm = (JSPUtil.getParameter(request, prefix	+ "p_vndr_nm".trim(), length));
			String[] pOfcCd = (JSPUtil.getParameter(request, prefix	+ "p_ofc_cd".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new TotalCntVO();
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (cnt[i] != null)
					model.setCnt(cnt[i]);
				if (pCountry[i] != null)
					model.setPCountry(pCountry[i]);
				if (pVndrSeq[i] != null)
					model.setPVndrSeq(pVndrSeq[i]);
				if (pSpType[i] != null)
					model.setPSpType(pSpType[i]);
				if (pPrintVndrSeq[i] != null)
					model.setPPrintVndrSeq(pPrintVndrSeq[i]);
				if (pVndrNm[i] != null)
					model.setPVndrNm(pVndrNm[i]);
				if (pOfcCd[i] != null)
					model.setPOfcCd(pOfcCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {}
		return getTotalCntVOs();
	}

	public TotalCntVO[] getTotalCntVOs(){
		TotalCntVO[] vos = (TotalCntVO[])models.toArray(new TotalCntVO[models.size()]);
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
		this.cnt = this.cnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pCountry = this.pCountry .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pVndrSeq = this.pVndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pSpType = this.pSpType .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pPrintVndrSeq = this.pPrintVndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pVndrNm = this.pVndrNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pOfcCd = this.pOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
