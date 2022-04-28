/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CgmLongStayDysEnvVO.java
*@FileTitle : CgmLongStayDysEnvVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.08
*@LastModifier : 김창식
*@LastVersion : 1.0
* 2009.05.08 김창식 
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
 * @author 김창식
 * @since J2EE 1.5
 */

public class CgmLongStayDysEnvVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<CgmLongStayDysEnvVO> models = new ArrayList<CgmLongStayDysEnvVO>();
	
	/* Status */
	private String ibflag = null;
	/* Column Info */
	private String n5thInqFmDys = null;
	/* Column Info */
	private String n4thInqToDys = null;
	/* Column Info */
	private String n2ndInqToDys = null;
	/* Column Info */
	private String n4thInqFmDys = null;
	/* Column Info */
	private String n5thInqToDys = null;
	/* Column Info */
	private String n3rdInqToDys = null;
	/* Column Info */
	private String n2ndInqFmDys = null;
	/* Column Info */
	private String n1stInqToDys = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String n1stInqFmDys = null;
	/* Column Info */
	private String n3rdInqFmDys = null;
	/* Page Number */
	private String pagerows = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	hashFildInpo	*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public CgmLongStayDysEnvVO() {}

	public CgmLongStayDysEnvVO(String ibflag, String pagerows, String creUsrId, String n1stInqFmDys, String n1stInqToDys, String n2ndInqFmDys, String n2ndInqToDys, String n3rdInqFmDys, String n3rdInqToDys, String n4thInqFmDys, String n4thInqToDys, String n5thInqFmDys, String n5thInqToDys) {
		this.ibflag = ibflag;
		this.n5thInqFmDys = n5thInqFmDys;
		this.n4thInqToDys = n4thInqToDys;
		this.n2ndInqToDys = n2ndInqToDys;
		this.n4thInqFmDys = n4thInqFmDys;
		this.n5thInqToDys = n5thInqToDys;
		this.n3rdInqToDys = n3rdInqToDys;
		this.n2ndInqFmDys = n2ndInqFmDys;
		this.n1stInqToDys = n1stInqToDys;
		this.creUsrId = creUsrId;
		this.n1stInqFmDys = n1stInqFmDys;
		this.n3rdInqFmDys = n3rdInqFmDys;
		this.pagerows = pagerows;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("n5th_inq_fm_dys", getN5thInqFmDys());
		this.hashColumns.put("n4th_inq_to_dys", getN4thInqToDys());
		this.hashColumns.put("n2nd_inq_to_dys", getN2ndInqToDys());
		this.hashColumns.put("n4th_inq_fm_dys", getN4thInqFmDys());
		this.hashColumns.put("n5th_inq_to_dys", getN5thInqToDys());
		this.hashColumns.put("n3rd_inq_to_dys", getN3rdInqToDys());
		this.hashColumns.put("n2nd_inq_fm_dys", getN2ndInqFmDys());
		this.hashColumns.put("n1st_inq_to_dys", getN1stInqToDys());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("n1st_inq_fm_dys", getN1stInqFmDys());
		this.hashColumns.put("n3rd_inq_fm_dys", getN3rdInqFmDys());
		this.hashColumns.put("pagerows", getPagerows());
		return this.hashColumns;
	}
	
	/**
	 * hashFildInpo
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("n5th_inq_fm_dys", "n5thInqFmDys");
		this.hashFields.put("n4th_inq_to_dys", "n4thInqToDys");
		this.hashFields.put("n2nd_inq_to_dys", "n2ndInqToDys");
		this.hashFields.put("n4th_inq_fm_dys", "n4thInqFmDys");
		this.hashFields.put("n5th_inq_to_dys", "n5thInqToDys");
		this.hashFields.put("n3rd_inq_to_dys", "n3rdInqToDys");
		this.hashFields.put("n2nd_inq_fm_dys", "n2ndInqFmDys");
		this.hashFields.put("n1st_inq_to_dys", "n1stInqToDys");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("n1st_inq_fm_dys", "n1stInqFmDys");
		this.hashFields.put("n3rd_inq_fm_dys", "n3rdInqFmDys");
		this.hashFields.put("pagerows", "pagerows");
		return this.hashFields;
	}
	
	public String getIbflag() {
		return this.ibflag;
	}
	public String getN5thInqFmDys() {
		return this.n5thInqFmDys;
	}
	public String getN4thInqToDys() {
		return this.n4thInqToDys;
	}
	public String getN2ndInqToDys() {
		return this.n2ndInqToDys;
	}
	public String getN4thInqFmDys() {
		return this.n4thInqFmDys;
	}
	public String getN5thInqToDys() {
		return this.n5thInqToDys;
	}
	public String getN3rdInqToDys() {
		return this.n3rdInqToDys;
	}
	public String getN2ndInqFmDys() {
		return this.n2ndInqFmDys;
	}
	public String getN1stInqToDys() {
		return this.n1stInqToDys;
	}
	public String getCreUsrId() {
		return this.creUsrId;
	}
	public String getN1stInqFmDys() {
		return this.n1stInqFmDys;
	}
	public String getN3rdInqFmDys() {
		return this.n3rdInqFmDys;
	}
	public String getPagerows() {
		return this.pagerows;
	}

	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setN5thInqFmDys(String n5thInqFmDys) {
		this.n5thInqFmDys = n5thInqFmDys;
		//this.n5thInqFmDys=true;
	}
	public void setN4thInqToDys(String n4thInqToDys) {
		this.n4thInqToDys = n4thInqToDys;
		//this.n4thInqToDys=true;
	}
	public void setN2ndInqToDys(String n2ndInqToDys) {
		this.n2ndInqToDys = n2ndInqToDys;
		//this.n2ndInqToDys=true;
	}
	public void setN4thInqFmDys(String n4thInqFmDys) {
		this.n4thInqFmDys = n4thInqFmDys;
		//this.n4thInqFmDys=true;
	}
	public void setN5thInqToDys(String n5thInqToDys) {
		this.n5thInqToDys = n5thInqToDys;
		//this.n5thInqToDys=true;
	}
	public void setN3rdInqToDys(String n3rdInqToDys) {
		this.n3rdInqToDys = n3rdInqToDys;
		//this.n3rdInqToDys=true;
	}
	public void setN2ndInqFmDys(String n2ndInqFmDys) {
		this.n2ndInqFmDys = n2ndInqFmDys;
		//this.n2ndInqFmDys=true;
	}
	public void setN1stInqToDys(String n1stInqToDys) {
		this.n1stInqToDys = n1stInqToDys;
		//this.n1stInqToDys=true;
	}
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
		//this.creUsrId=true;
	}
	public void setN1stInqFmDys(String n1stInqFmDys) {
		this.n1stInqFmDys = n1stInqFmDys;
		//this.n1stInqFmDys=true;
	}
	public void setN3rdInqFmDys(String n3rdInqFmDys) {
		this.n3rdInqFmDys = n3rdInqFmDys;
		//this.n3rdInqFmDys=true;
	}
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}
	public void fromRequest(HttpServletRequest request) {
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setN5thInqFmDys(JSPUtil.getParameter(request, "n5th_inq_fm_dys", ""));
		setN4thInqToDys(JSPUtil.getParameter(request, "n4th_inq_to_dys", ""));
		setN2ndInqToDys(JSPUtil.getParameter(request, "n2nd_inq_to_dys", ""));
		setN4thInqFmDys(JSPUtil.getParameter(request, "n4th_inq_fm_dys", ""));
		setN5thInqToDys(JSPUtil.getParameter(request, "n5th_inq_to_dys", ""));
		setN3rdInqToDys(JSPUtil.getParameter(request, "n3rd_inq_to_dys", ""));
		setN2ndInqFmDys(JSPUtil.getParameter(request, "n2nd_inq_fm_dys", ""));
		setN1stInqToDys(JSPUtil.getParameter(request, "n1st_inq_to_dys", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setN1stInqFmDys(JSPUtil.getParameter(request, "n1st_inq_fm_dys", ""));
		setN3rdInqFmDys(JSPUtil.getParameter(request, "n3rd_inq_fm_dys", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
	}

	public CgmLongStayDysEnvVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public CgmLongStayDysEnvVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		CgmLongStayDysEnvVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] n5thInqFmDys = (JSPUtil.getParameter(request, prefix	+ "n5th_inq_fm_dys".trim(), length));
			String[] n4thInqToDys = (JSPUtil.getParameter(request, prefix	+ "n4th_inq_to_dys".trim(), length));
			String[] n2ndInqToDys = (JSPUtil.getParameter(request, prefix	+ "n2nd_inq_to_dys".trim(), length));
			String[] n4thInqFmDys = (JSPUtil.getParameter(request, prefix	+ "n4th_inq_fm_dys".trim(), length));
			String[] n5thInqToDys = (JSPUtil.getParameter(request, prefix	+ "n5th_inq_to_dys".trim(), length));
			String[] n3rdInqToDys = (JSPUtil.getParameter(request, prefix	+ "n3rd_inq_to_dys".trim(), length));
			String[] n2ndInqFmDys = (JSPUtil.getParameter(request, prefix	+ "n2nd_inq_fm_dys".trim(), length));
			String[] n1stInqToDys = (JSPUtil.getParameter(request, prefix	+ "n1st_inq_to_dys".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] n1stInqFmDys = (JSPUtil.getParameter(request, prefix	+ "n1st_inq_fm_dys".trim(), length));
			String[] n3rdInqFmDys = (JSPUtil.getParameter(request, prefix	+ "n3rd_inq_fm_dys".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new CgmLongStayDysEnvVO();
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (n5thInqFmDys[i] != null)
					model.setN5thInqFmDys(n5thInqFmDys[i]);
				if (n4thInqToDys[i] != null)
					model.setN4thInqToDys(n4thInqToDys[i]);
				if (n2ndInqToDys[i] != null)
					model.setN2ndInqToDys(n2ndInqToDys[i]);
				if (n4thInqFmDys[i] != null)
					model.setN4thInqFmDys(n4thInqFmDys[i]);
				if (n5thInqToDys[i] != null)
					model.setN5thInqToDys(n5thInqToDys[i]);
				if (n3rdInqToDys[i] != null)
					model.setN3rdInqToDys(n3rdInqToDys[i]);
				if (n2ndInqFmDys[i] != null)
					model.setN2ndInqFmDys(n2ndInqFmDys[i]);
				if (n1stInqToDys[i] != null)
					model.setN1stInqToDys(n1stInqToDys[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (n1stInqFmDys[i] != null)
					model.setN1stInqFmDys(n1stInqFmDys[i]);
				if (n3rdInqFmDys[i] != null)
					model.setN3rdInqFmDys(n3rdInqFmDys[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {}
		return getCgmLongStayDysEnvVOs();
	}

	public CgmLongStayDysEnvVO[] getCgmLongStayDysEnvVOs(){
		CgmLongStayDysEnvVO[] vos = (CgmLongStayDysEnvVO[])models.toArray(new CgmLongStayDysEnvVO[models.size()]);
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
		this.n5thInqFmDys = this.n5thInqFmDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n4thInqToDys = this.n4thInqToDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n2ndInqToDys = this.n2ndInqToDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n4thInqFmDys = this.n4thInqFmDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n5thInqToDys = this.n5thInqToDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3rdInqToDys = this.n3rdInqToDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n2ndInqFmDys = this.n2ndInqFmDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stInqToDys = this.n1stInqToDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stInqFmDys = this.n1stInqFmDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3rdInqFmDys = this.n3rdInqFmDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
