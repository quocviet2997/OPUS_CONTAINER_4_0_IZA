/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : ComUsrPgmMtchVO.java
*@FileTitle : ComUsrPgmMtchVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.03.05
*@LastModifier : 이승열
*@LastVersion : 1.0
* 2009.03.05 이승열 
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
 * @author 이승열
 * @since J2EE 1.5
 */

public class ComUsrPgmMtchVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<ComUsrPgmMtchVO> models = new ArrayList<ComUsrPgmMtchVO>();
	

	private String checkbox = null;
	private String updUsrId = null;
	private String pgmNo = null;
	/* Status */
	private String ibflag = null;
	private String updDt = null;
	private String addFlg = null;
	private String creDt = null;
	private String usrId = null;
	private String creUsrId = null;
	private String pagerows = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	hashFildInpo	*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public ComUsrPgmMtchVO() {}

	public ComUsrPgmMtchVO(String ibflag, String pagerows, String usrId, String pgmNo, String addFlg, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updUsrId = updUsrId;
		this.pgmNo = pgmNo;
		this.ibflag = ibflag;
		this.updDt = updDt;
		this.addFlg = addFlg;
		this.creDt = creDt;
		this.usrId = usrId;
		this.creUsrId = creUsrId;
		this.pagerows = pagerows;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("checkbox", getCheckbox());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("pgm_no", getPgmNo());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("add_flg", getAddFlg());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("usr_id", getUsrId());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("pagerows", getPagerows());
		return this.hashColumns;
	}
	
	/**
	 * hashFildInpo
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("checkbox", "checkbox");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("pgm_no", "pgmNo");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("add_flg", "addFlg");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("usr_id", "usrId");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("pagerows", "pagerows");
		return this.hashFields;
	}
	
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	public String getPgmNo() {
		return this.pgmNo;
	}
	public String getIbflag() {
		return this.ibflag;
	}
	public String getUpdDt() {
		return this.updDt;
	}
	public String getAddFlg() {
		return this.addFlg;
	}
	public String getCreDt() {
		return this.creDt;
	}
	public String getUsrId() {
		return this.usrId;
	}
	public String getCreUsrId() {
		return this.creUsrId;
	}
	public String getPagerows() {
		return this.pagerows;
	}

	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
		//this.updUsrId=true;
	}
	public void setPgmNo(String pgmNo) {
		this.pgmNo = pgmNo;
		//this.pgmNo=true;
	}
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
		//this.updDt=true;
	}
	public void setAddFlg(String addFlg) {
		this.addFlg = addFlg;
		//this.addFlg=true;
	}
	public void setCreDt(String creDt) {
		this.creDt = creDt;
		//this.creDt=true;
	}
	public void setUsrId(String usrId) {
		this.usrId = usrId;
		//this.usrId=true;
	}
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
		//this.creUsrId=true;
	}
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}
	public void fromRequest(HttpServletRequest request) {
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setPgmNo(JSPUtil.getParameter(request, "pgm_no", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setAddFlg(JSPUtil.getParameter(request, "add_flg", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setUsrId(JSPUtil.getParameter(request, "usr_id", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
	}

	public ComUsrPgmMtchVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public ComUsrPgmMtchVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		ComUsrPgmMtchVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] checkbox = (JSPUtil.getParameter(request, prefix	+ "checkbox".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] pgmNo = (JSPUtil.getParameter(request, prefix	+ "pgm_no".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] addFlg = (JSPUtil.getParameter(request, prefix	+ "add_flg".trim(), length));
			
			int cnt = addFlg.length;
			for(int i=0;i < cnt;i++){
				if("1".equals(addFlg[i])){
					addFlg[i]="Y";
				}else{
					addFlg[i]="N";
				}
			}
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] usrId = (JSPUtil.getParameter(request, prefix	+ "usr_id".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new ComUsrPgmMtchVO();
				if (checkbox[i] != null)
					model.setCheckbox(checkbox[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (pgmNo[i] != null)
					model.setPgmNo(pgmNo[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (addFlg[i] != null)
					model.setAddFlg(addFlg[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (usrId[i] != null)
					model.setUsrId(usrId[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {}
		return getComUsrPgmMtchVOs();
	}

	public ComUsrPgmMtchVO[] getComUsrPgmMtchVOs(){
		ComUsrPgmMtchVO[] vos = (ComUsrPgmMtchVO[])models.toArray(new ComUsrPgmMtchVO[models.size()]);
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
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pgmNo = this.pgmNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.addFlg = this.addFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.usrId = this.usrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}

	public void setCheckbox(String checkbox) {
		this.checkbox = checkbox;
	}

	public String getCheckbox() {
		return checkbox;
	}
}
