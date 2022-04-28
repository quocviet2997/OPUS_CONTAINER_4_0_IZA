/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : OpfRstwgRsnCdVO.java
*@FileTitle : OpfRstwgRsnCdVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.11
*@LastModifier : 이선영
*@LastVersion : 1.0
* 2009.05.11 이선영 
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
 * @author 이선영
 * @since J2EE 1.5
 * @see ..
 */

public class OpfRstwgRsnCdVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<OpfRstwgRsnCdVO> models = new ArrayList<OpfRstwgRsnCdVO>();
	
	/* Column Info */
	private String updUsrId = null;
	/* Status */
	private String ibflag = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String rstwgCdTpCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String rstwgRsnCdFullDesc = null;
	/* Column Info */
	private String coCd = null;
	/* Column Info */
	private String rstwgRsnCd = null;
	/* Page Number */
	private String pagerows = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	hashFildInpo	*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public OpfRstwgRsnCdVO() {}

	public OpfRstwgRsnCdVO(String ibflag, String pagerows, String rstwgCdTpCd, String rstwgRsnCd, String rstwgRsnCdFullDesc, String coCd, String deltFlg, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updUsrId = updUsrId;
		this.ibflag = ibflag;
		this.updDt = updDt;
		this.rstwgCdTpCd = rstwgCdTpCd;
		this.creDt = creDt;
		this.deltFlg = deltFlg;
		this.creUsrId = creUsrId;
		this.rstwgRsnCdFullDesc = rstwgRsnCdFullDesc;
		this.coCd = coCd;
		this.rstwgRsnCd = rstwgRsnCd;
		this.pagerows = pagerows;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("rstwg_cd_tp_cd", getRstwgCdTpCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("rstwg_rsn_cd_full_desc", getRstwgRsnCdFullDesc());
		this.hashColumns.put("co_cd", getCoCd());
		this.hashColumns.put("rstwg_rsn_cd", getRstwgRsnCd());
		this.hashColumns.put("pagerows", getPagerows());
		return this.hashColumns;
	}
	
	/**
	 * hashFildInpo
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("rstwg_cd_tp_cd", "rstwgCdTpCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("rstwg_rsn_cd_full_desc", "rstwgRsnCdFullDesc");
		this.hashFields.put("co_cd", "coCd");
		this.hashFields.put("rstwg_rsn_cd", "rstwgRsnCd");
		this.hashFields.put("pagerows", "pagerows");
		return this.hashFields;
	}
	
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	public String getIbflag() {
		return this.ibflag;
	}
	public String getUpdDt() {
		return this.updDt;
	}
	public String getRstwgCdTpCd() {
		return this.rstwgCdTpCd;
	}
	public String getCreDt() {
		return this.creDt;
	}
	public String getDeltFlg() {
		return this.deltFlg;
	}
	public String getCreUsrId() {
		return this.creUsrId;
	}
	public String getRstwgRsnCdFullDesc() {
		return this.rstwgRsnCdFullDesc;
	}
	public String getCoCd() {
		return this.coCd;
	}
	public String getRstwgRsnCd() {
		return this.rstwgRsnCd;
	}
	public String getPagerows() {
		return this.pagerows;
	}

	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
		//this.updUsrId=true;
	}
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
		//this.updDt=true;
	}
	public void setRstwgCdTpCd(String rstwgCdTpCd) {
		this.rstwgCdTpCd = rstwgCdTpCd;
		//this.rstwgCdTpCd=true;
	}
	public void setCreDt(String creDt) {
		this.creDt = creDt;
		//this.creDt=true;
	}
	public void setDeltFlg(String deltFlg) {
		this.deltFlg = deltFlg;
		//this.deltFlg=true;
	}
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
		//this.creUsrId=true;
	}
	public void setRstwgRsnCdFullDesc(String rstwgRsnCdFullDesc) {
		this.rstwgRsnCdFullDesc = rstwgRsnCdFullDesc;
		//this.rstwgRsnCdFullDesc=true;
	}
	public void setCoCd(String coCd) {
		this.coCd = coCd;
		//this.coCd=true;
	}
	public void setRstwgRsnCd(String rstwgRsnCd) {
		this.rstwgRsnCd = rstwgRsnCd;
		//this.rstwgRsnCd=true;
	}
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}
	public void fromRequest(HttpServletRequest request) {
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setRstwgCdTpCd(JSPUtil.getParameter(request, "rstwg_cd_tp_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setDeltFlg(JSPUtil.getParameter(request, "delt_flg", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setRstwgRsnCdFullDesc(JSPUtil.getParameter(request, "rstwg_rsn_cd_full_desc", ""));
		setCoCd(JSPUtil.getParameter(request, "co_cd", ""));
		setRstwgRsnCd(JSPUtil.getParameter(request, "rstwg_rsn_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
	}

	public OpfRstwgRsnCdVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public OpfRstwgRsnCdVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		OpfRstwgRsnCdVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] rstwgCdTpCd = (JSPUtil.getParameter(request, prefix	+ "rstwg_cd_tp_cd".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] rstwgRsnCdFullDesc = (JSPUtil.getParameter(request, prefix	+ "rstwg_rsn_cd_full_desc".trim(), length));
			String[] coCd = (JSPUtil.getParameter(request, prefix	+ "co_cd".trim(), length));
			String[] rstwgRsnCd = (JSPUtil.getParameter(request, prefix	+ "rstwg_rsn_cd".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new OpfRstwgRsnCdVO();
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (rstwgCdTpCd[i] != null)
					model.setRstwgCdTpCd(rstwgCdTpCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (rstwgRsnCdFullDesc[i] != null)
					model.setRstwgRsnCdFullDesc(rstwgRsnCdFullDesc[i]);
				if (coCd[i] != null)
					model.setCoCd(coCd[i]);
				if (rstwgRsnCd[i] != null)
					model.setRstwgRsnCd(rstwgRsnCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getOpfRstwgRsnCdVOs();
	}

	public OpfRstwgRsnCdVO[] getOpfRstwgRsnCdVOs(){
		OpfRstwgRsnCdVO[] vos = (OpfRstwgRsnCdVO[])models.toArray(new OpfRstwgRsnCdVO[models.size()]);
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
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rstwgCdTpCd = this.rstwgCdTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rstwgRsnCdFullDesc = this.rstwgRsnCdFullDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.coCd = this.coCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rstwgRsnCd = this.rstwgRsnCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
