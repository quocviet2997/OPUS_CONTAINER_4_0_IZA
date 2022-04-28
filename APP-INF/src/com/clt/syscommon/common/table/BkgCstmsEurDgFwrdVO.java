/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BkgCstmsEurDgFwrdVO.java
*@FileTitle : BkgCstmsEurDgFwrdVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.12
*@LastModifier : 경종윤
*@LastVersion : 1.0
* 2009.05.12 경종윤 
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
 * - PDTO(Data Transfer Object including Parameters)<br>
 * - 관련 Event에서 작성, 서버실행요청시 PDTO의 역할을 수행하는 Value Object<br>
 *
 * @author 경종윤
 * @since J2EE 1.5
 * @see ..
 */

public class BkgCstmsEurDgFwrdVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgCstmsEurDgFwrdVO> models = new ArrayList<BkgCstmsEurDgFwrdVO>();
	
	/* Status */
	private String ibflag = null;
	/* Column Info */
	private String fwrdAddr4 = null;
	/* Column Info */
	private String anrFwrdId = null;
	/* Column Info */
	private String fwrdNm = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String fwrdAddr1 = null;
	/* Column Info */
	private String fwrdPhnNo = null;
	/* Column Info */
	private String cntcPsonNm = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String fwrdAddr2 = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String fwrdAddr3 = null;
	/* Column Info */
	private String fwrdFaxNo = null;
	/* Page Number */
	private String pagerows = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	hashFildInpo	*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgCstmsEurDgFwrdVO() {}

	public BkgCstmsEurDgFwrdVO(String ibflag, String pagerows, String anrFwrdId, String fwrdNm, String fwrdAddr1, String fwrdAddr2, String fwrdAddr3, String fwrdAddr4, String fwrdFaxNo, String fwrdPhnNo, String cntcPsonNm, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.ibflag = ibflag;
		this.fwrdAddr4 = fwrdAddr4;
		this.anrFwrdId = anrFwrdId;
		this.fwrdNm = fwrdNm;
		this.updUsrId = updUsrId;
		this.fwrdAddr1 = fwrdAddr1;
		this.fwrdPhnNo = fwrdPhnNo;
		this.cntcPsonNm = cntcPsonNm;
		this.updDt = updDt;
		this.creDt = creDt;
		this.fwrdAddr2 = fwrdAddr2;
		this.creUsrId = creUsrId;
		this.fwrdAddr3 = fwrdAddr3;
		this.fwrdFaxNo = fwrdFaxNo;
		this.pagerows = pagerows;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("fwrd_addr4", getFwrdAddr4());
		this.hashColumns.put("anr_fwrd_id", getAnrFwrdId());
		this.hashColumns.put("fwrd_nm", getFwrdNm());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("fwrd_addr1", getFwrdAddr1());
		this.hashColumns.put("fwrd_phn_no", getFwrdPhnNo());
		this.hashColumns.put("cntc_pson_nm", getCntcPsonNm());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("fwrd_addr2", getFwrdAddr2());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("fwrd_addr3", getFwrdAddr3());
		this.hashColumns.put("fwrd_fax_no", getFwrdFaxNo());
		this.hashColumns.put("pagerows", getPagerows());
		return this.hashColumns;
	}
	
	/**
	 * hashFildInpo
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("fwrd_addr4", "fwrdAddr4");
		this.hashFields.put("anr_fwrd_id", "anrFwrdId");
		this.hashFields.put("fwrd_nm", "fwrdNm");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("fwrd_addr1", "fwrdAddr1");
		this.hashFields.put("fwrd_phn_no", "fwrdPhnNo");
		this.hashFields.put("cntc_pson_nm", "cntcPsonNm");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("fwrd_addr2", "fwrdAddr2");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("fwrd_addr3", "fwrdAddr3");
		this.hashFields.put("fwrd_fax_no", "fwrdFaxNo");
		this.hashFields.put("pagerows", "pagerows");
		return this.hashFields;
	}
	
	public String getIbflag() {
		return this.ibflag;
	}
	public String getFwrdAddr4() {
		return this.fwrdAddr4;
	}
	public String getAnrFwrdId() {
		return this.anrFwrdId;
	}
	public String getFwrdNm() {
		return this.fwrdNm;
	}
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	public String getFwrdAddr1() {
		return this.fwrdAddr1;
	}
	public String getFwrdPhnNo() {
		return this.fwrdPhnNo;
	}
	public String getCntcPsonNm() {
		return this.cntcPsonNm;
	}
	public String getUpdDt() {
		return this.updDt;
	}
	public String getCreDt() {
		return this.creDt;
	}
	public String getFwrdAddr2() {
		return this.fwrdAddr2;
	}
	public String getCreUsrId() {
		return this.creUsrId;
	}
	public String getFwrdAddr3() {
		return this.fwrdAddr3;
	}
	public String getFwrdFaxNo() {
		return this.fwrdFaxNo;
	}
	public String getPagerows() {
		return this.pagerows;
	}

	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setFwrdAddr4(String fwrdAddr4) {
		this.fwrdAddr4 = fwrdAddr4;
		//this.fwrdAddr4=true;
	}
	public void setAnrFwrdId(String anrFwrdId) {
		this.anrFwrdId = anrFwrdId;
		//this.anrFwrdId=true;
	}
	public void setFwrdNm(String fwrdNm) {
		this.fwrdNm = fwrdNm;
		//this.fwrdNm=true;
	}
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
		//this.updUsrId=true;
	}
	public void setFwrdAddr1(String fwrdAddr1) {
		this.fwrdAddr1 = fwrdAddr1;
		//this.fwrdAddr1=true;
	}
	public void setFwrdPhnNo(String fwrdPhnNo) {
		this.fwrdPhnNo = fwrdPhnNo;
		//this.fwrdPhnNo=true;
	}
	public void setCntcPsonNm(String cntcPsonNm) {
		this.cntcPsonNm = cntcPsonNm;
		//this.cntcPsonNm=true;
	}
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
		//this.updDt=true;
	}
	public void setCreDt(String creDt) {
		this.creDt = creDt;
		//this.creDt=true;
	}
	public void setFwrdAddr2(String fwrdAddr2) {
		this.fwrdAddr2 = fwrdAddr2;
		//this.fwrdAddr2=true;
	}
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
		//this.creUsrId=true;
	}
	public void setFwrdAddr3(String fwrdAddr3) {
		this.fwrdAddr3 = fwrdAddr3;
		//this.fwrdAddr3=true;
	}
	public void setFwrdFaxNo(String fwrdFaxNo) {
		this.fwrdFaxNo = fwrdFaxNo;
		//this.fwrdFaxNo=true;
	}
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}
	public void fromRequest(HttpServletRequest request) {
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setFwrdAddr4(JSPUtil.getParameter(request, "fwrd_addr4", ""));
		setAnrFwrdId(JSPUtil.getParameter(request, "anr_fwrd_id", ""));
		setFwrdNm(JSPUtil.getParameter(request, "fwrd_nm", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setFwrdAddr1(JSPUtil.getParameter(request, "fwrd_addr1", ""));
		setFwrdPhnNo(JSPUtil.getParameter(request, "fwrd_phn_no", ""));
		setCntcPsonNm(JSPUtil.getParameter(request, "cntc_pson_nm", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setFwrdAddr2(JSPUtil.getParameter(request, "fwrd_addr2", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setFwrdAddr3(JSPUtil.getParameter(request, "fwrd_addr3", ""));
		setFwrdFaxNo(JSPUtil.getParameter(request, "fwrd_fax_no", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
	}

	public BkgCstmsEurDgFwrdVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public BkgCstmsEurDgFwrdVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgCstmsEurDgFwrdVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] fwrdAddr4 = (JSPUtil.getParameter(request, prefix	+ "fwrd_addr4".trim(), length));
			String[] anrFwrdId = (JSPUtil.getParameter(request, prefix	+ "anr_fwrd_id".trim(), length));
			String[] fwrdNm = (JSPUtil.getParameter(request, prefix	+ "fwrd_nm".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] fwrdAddr1 = (JSPUtil.getParameter(request, prefix	+ "fwrd_addr1".trim(), length));
			String[] fwrdPhnNo = (JSPUtil.getParameter(request, prefix	+ "fwrd_phn_no".trim(), length));
			String[] cntcPsonNm = (JSPUtil.getParameter(request, prefix	+ "cntc_pson_nm".trim(), length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] fwrdAddr2 = (JSPUtil.getParameter(request, prefix	+ "fwrd_addr2".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] fwrdAddr3 = (JSPUtil.getParameter(request, prefix	+ "fwrd_addr3".trim(), length));
			String[] fwrdFaxNo = (JSPUtil.getParameter(request, prefix	+ "fwrd_fax_no".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgCstmsEurDgFwrdVO();
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (fwrdAddr4[i] != null)
					model.setFwrdAddr4(fwrdAddr4[i]);
				if (anrFwrdId[i] != null)
					model.setAnrFwrdId(anrFwrdId[i]);
				if (fwrdNm[i] != null)
					model.setFwrdNm(fwrdNm[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (fwrdAddr1[i] != null)
					model.setFwrdAddr1(fwrdAddr1[i]);
				if (fwrdPhnNo[i] != null)
					model.setFwrdPhnNo(fwrdPhnNo[i]);
				if (cntcPsonNm[i] != null)
					model.setCntcPsonNm(cntcPsonNm[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (fwrdAddr2[i] != null)
					model.setFwrdAddr2(fwrdAddr2[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (fwrdAddr3[i] != null)
					model.setFwrdAddr3(fwrdAddr3[i]);
				if (fwrdFaxNo[i] != null)
					model.setFwrdFaxNo(fwrdFaxNo[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgCstmsEurDgFwrdVOs();
	}

	public BkgCstmsEurDgFwrdVO[] getBkgCstmsEurDgFwrdVOs(){
		BkgCstmsEurDgFwrdVO[] vos = (BkgCstmsEurDgFwrdVO[])models.toArray(new BkgCstmsEurDgFwrdVO[models.size()]);
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
		} catch (Exception ex) {
			return null;
		}
		return ret.toString();
	}
	
	/**
	 * 각 클래스 해당하는 필드 정보를 배열에 담는다 
	 * @param field
	 * @param i
	 * @return String[]
	 */
	private String[] getField(Field[] field, int i) {
		String[] arr = null;
		try{
			arr = (String[]) field[i].get(this);
		}catch(Exception ex){
			arr = getFieldCatct(field, i, arr);
		}
		return arr;
	}
	
	/**
	 * getField 에서 catch문에 대한 로직
	 * @param field
	 * @param i
	 * @param arr
	 * @return arr
	 */
	private String[] getFieldCatct(Field[] field, int i, String[] arr) {
		try {
			arr = new String[1];
			arr[0] = String.valueOf(field[i].get(this));
		} catch (IllegalAccessException e) {
			return null;
		}
		return arr;
	}
	
	/**
	* DataFormat 설정
	*/
	public void onDataFormat(){
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fwrdAddr4 = this.fwrdAddr4 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.anrFwrdId = this.anrFwrdId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fwrdNm = this.fwrdNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fwrdAddr1 = this.fwrdAddr1 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fwrdPhnNo = this.fwrdPhnNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntcPsonNm = this.cntcPsonNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fwrdAddr2 = this.fwrdAddr2 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fwrdAddr3 = this.fwrdAddr3 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fwrdFaxNo = this.fwrdFaxNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
