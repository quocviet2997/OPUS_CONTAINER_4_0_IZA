/*=========================================================
*Copyright(c) 2012 CyberLogitec
*@FileName : SearchMdmMovementVO.java
*@FileTitle : SearchMdmMovementVO
*Open Issues :
*Change history :
*@LastModifyDate : 2012.02.17
*@LastModifier : 김종옥
*@LastVersion : 1.0
* 2012.02.17 김종옥
* 1.0 Creation
=========================================================*/

package com.clt.bizcommon.movement.vo;

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
 * @author 김종옥
 * @see
 * @since J2EE 1.5
 */
public class SearchMdmMovementVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<SearchMdmMovementVO> models = new ArrayList<SearchMdmMovementVO>();
	
	private String mvmtStsCd = null;
	private String ibflag = null;
	private String mvmtStsNm = null;
	private String pagerows = null;
	private String mdmYN = null;
	private String deltFlg = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	hashFildInpo	*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public SearchMdmMovementVO() {}

	public SearchMdmMovementVO(String ibflag, String pagerows, String mvmtStsCd, String mvmtStsNm) {
		this.mvmtStsCd = mvmtStsCd;
		this.ibflag = ibflag;
		this.mvmtStsNm = mvmtStsNm;
		this.pagerows = pagerows;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("mvmt_sts_cd", getMvmtStsCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("mvmt_sts_nm", getMvmtStsNm());
		this.hashColumns.put("mdm_yn", getMdmYN());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("pagerows", getPagerows());
		return this.hashColumns;
	}
	
	/**
	 * hashFildInpo
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("mvmt_sts_cd", "mvmtStsCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("mvmt_sts_nm", "mvmtStsNm");
		this.hashFields.put("mdm_yn", "mdmYN");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("pagerows", "pagerows");
		return this.hashFields;
	}
	
	public String getMvmtStsCd() {
		return this.mvmtStsCd;
	}
	public String getIbflag() {
		return this.ibflag;
	}
	public String getMvmtStsNm() {
		return this.mvmtStsNm;
	}
	public String getPagerows() {
		return this.pagerows;
	}
	

	public String getMdmYN() {
		return mdmYN;
	}

	public void setMdmYN(String mdmYN) {
		this.mdmYN = mdmYN;
	}

	public String getDeltFlg() {
		return deltFlg;
	}

	public void setDeltFlg(String deltFlg) {
		this.deltFlg = deltFlg;
	}

	public void setMvmtStsCd(String mvmtStsCd) {
		this.mvmtStsCd = mvmtStsCd;
	}
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
	}
	public void setMvmtStsNm(String mvmtStsNm) {
		this.mvmtStsNm = mvmtStsNm;
	}
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
	}
	public void fromRequest(HttpServletRequest request) {
		setMvmtStsCd(JSPUtil.getParameter(request, "mvmt_sts_cd", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setMvmtStsNm(JSPUtil.getParameter(request, "mvmt_sts_nm", ""));
		setMdmYN(JSPUtil.getParameter(request, "mdm_yn", ""));
		if("Y".equals(this.mdmYN)){
			setDeltFlg(JSPUtil.getParameter(request, "delt_flg", "N"));
		}else{
			setDeltFlg(JSPUtil.getParameter(request, "delt_flg", "N"));
		}
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
	}

	public SearchMdmMovementVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public SearchMdmMovementVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		SearchMdmMovementVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] mvmtStsCd = (JSPUtil.getParameter(request, prefix	+ "mvmt_sts_cd".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] mvmtStsNm = (JSPUtil.getParameter(request, prefix	+ "mvmt_sts_nm".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new SearchMdmMovementVO();
				if (mvmtStsCd[i] != null)
					model.setMvmtStsCd(mvmtStsCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (mvmtStsNm[i] != null)
					model.setMvmtStsNm(mvmtStsNm[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {}
		return getMdmMovementVOs();
	}

	public SearchMdmMovementVO[] getMdmMovementVOs(){
		SearchMdmMovementVO[] vos = (SearchMdmMovementVO[])models.toArray(new SearchMdmMovementVO[models.size()]);
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
		this.mvmtStsCd = this.mvmtStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mvmtStsNm = this.mvmtStsNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
