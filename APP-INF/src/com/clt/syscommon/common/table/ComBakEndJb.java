
/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : ComBakEndJb.java
*@FileTitle : ComBakEndJb
*Open Issues :
*Change history :
*@LastModifyDate : 2009.01.12
*@LastModifier : 정인선
*@LastVersion : 1.0
* 2009.01.12 정인선
* 1.0 최초 생성
=========================================================*/

package com.clt.syscommon.common.table;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import com.clt.framework.component.util.JSPUtil;

/**
 * Table Value Ojbect<br>
 * - PDTO(Data Transfer Object including Parameters)<br>
 * - 관련 Event에서 작성, 서버실행요청시 PDTO의 역할을 수행하는 Value Object<br>
 *
 * @author 정인선
 * @since J2EE 1.5
 */

public class ComBakEndJb implements Serializable {

	private static final long serialVersionUID = 1L;
	/* 컬럼 설명	*/
	private String updDt = null;
	/* 컬럼 설명	*/
	private String creUsrId = null;
	/* 컬럼 설명	*/
	private String thdId = null;
	/* 컬럼 설명	*/
	private String ibflag = null;
	/* 컬럼 설명	*/
	private String jbStsFlg = null;
	/* 컬럼 설명	*/
	private String jbMsg = null;
	/* 컬럼 설명	*/
	private String creDt = null;
	/* 컬럼 설명	*/
	private String jbId = null;
	/* 컬럼 설명	*/
	private String updUsrId = null;
	/* 컬럼 설명	*/
	private String pagerows = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumn = new HashMap<String, String>();
	private HashMap<String, String> hashFields = new HashMap<String, String>();

	public ComBakEndJb() {}

	public ComBakEndJb(String ibflag, String pagerows, String jbId, String thdId, String jbMsg, String jbStsFlg, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.creUsrId = creUsrId;
		this.thdId = thdId;
		this.ibflag = ibflag;
		this.jbStsFlg = jbStsFlg;
		this.jbMsg = jbMsg;
		this.creDt = creDt;
		this.jbId = jbId;
		this.updUsrId = updUsrId;
		this.pagerows = pagerows;
	}
	
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", getUpdDt());
		this.hashFields.put("cre_usr_id", getCreUsrId());
		this.hashFields.put("thd_id", getThdId());
		this.hashFields.put("ibflag", getIbflag());
		this.hashFields.put("jb_sts_flg", getJbStsFlg());
		this.hashFields.put("jb_msg", getJbMsg());
		this.hashFields.put("cre_dt", getCreDt());
		this.hashFields.put("jb_id", getJbId());
		this.hashFields.put("upd_usr_id", getUpdUsrId());
		this.hashFields.put("pagerows", getPagerows());
		return this.hashFields;	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValue(){
		this.hashColumn.put("upd_dt", getUpdDt());
		this.hashColumn.put("cre_usr_id", getCreUsrId());
		this.hashColumn.put("thd_id", getThdId());
		this.hashColumn.put("ibflag", getIbflag());
		this.hashColumn.put("jb_sts_flg", getJbStsFlg());
		this.hashColumn.put("jb_msg", getJbMsg());
		this.hashColumn.put("cre_dt", getCreDt());
		this.hashColumn.put("jb_id", getJbId());
		this.hashColumn.put("upd_usr_id", getUpdUsrId());
		this.hashColumn.put("pagerows", getPagerows());
		return this.hashColumn;
	}
	
	public String getUpdDt() {
		return this.updDt;
	}
	public String getCreUsrId() {
		return this.creUsrId;
	}
	public String getThdId() {
		return this.thdId;
	}
	public String getIbflag() {
		return this.ibflag;
	}
	public String getJbStsFlg() {
		return this.jbStsFlg;
	}
	public String getJbMsg() {
		return this.jbMsg;
	}
	public String getCreDt() {
		return this.creDt;
	}
	public String getJbId() {
		return this.jbId;
	}
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	public String getPagerows() {
		return this.pagerows;
	}

	public void setUpdDt(String updDt) {
		this.updDt = updDt;
		//this.updDt=true;
	}
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
		//this.creUsrId=true;
	}
	public void setThdId(String thdId) {
		this.thdId = thdId;
		//this.thdId=true;
	}
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setJbStsFlg(String jbStsFlg) {
		this.jbStsFlg = jbStsFlg;
		//this.jbStsFlg=true;
	}
	public void setJbMsg(String jbMsg) {
		this.jbMsg = jbMsg;
		//this.jbMsg=true;
	}
	public void setCreDt(String creDt) {
		this.creDt = creDt;
		//this.creDt=true;
	}
	public void setJbId(String jbId) {
		this.jbId = jbId;
		//this.jbId=true;
	}
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
		//this.updUsrId=true;
	}
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}
	public static ComBakEndJb fromRequest(HttpServletRequest request) {
		ComBakEndJb model = new ComBakEndJb();
		try {
			model.setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
			model.setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
			model.setThdId(JSPUtil.getParameter(request, "thd_id", ""));
			model.setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
			model.setJbStsFlg(JSPUtil.getParameter(request, "jb_sts_flg", ""));
			model.setJbMsg(JSPUtil.getParameter(request, "jb_msg", ""));
			model.setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
			model.setJbId(JSPUtil.getParameter(request, "jb_id", ""));
			model.setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
			model.setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		} catch (Exception e) {}
		return model;
	}

	public static Collection<ComBakEndJb> fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public static Collection<ComBakEndJb> fromRequestGrid(HttpServletRequest request, String prefix) {
		ComBakEndJb model = null;
		Collection<ComBakEndJb> models = new ArrayList<ComBakEndJb>();

		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp==null)
   			return models;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] thdId = (JSPUtil.getParameter(request, prefix	+ "thd_id".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] jbStsFlg = (JSPUtil.getParameter(request, prefix	+ "jb_sts_flg".trim(), length));
			String[] jbMsg = (JSPUtil.getParameter(request, prefix	+ "jb_msg".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] jbId = (JSPUtil.getParameter(request, prefix	+ "jb_id".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new ComBakEndJb();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (thdId[i] != null)
					model.setThdId(thdId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (jbStsFlg[i] != null)
					model.setJbStsFlg(jbStsFlg[i]);
				if (jbMsg[i] != null)
					model.setJbMsg(jbMsg[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (jbId[i] != null)
					model.setJbId(jbId[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {}
		return models;
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

}

