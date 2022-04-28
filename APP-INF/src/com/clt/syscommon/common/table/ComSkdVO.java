/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : ComSkdVO.java
*@FileTitle : ComSkdVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.13
*@LastModifier : 최영희
*@LastVersion : 1.0
* 2009.05.13 최영희 
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
 * @author 최영희
 * @since J2EE 1.5
 * @see ..
 */

public class ComSkdVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<ComSkdVO> models = new ArrayList<ComSkdVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String skdMnt = null;
	/* Column Info */
	private String skdDesc = null;
	/* Column Info */
	private String skdId = null;
	/* Column Info */
	private String svrCd = null;
	/* Column Info */
	private String skdMon = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String preSkdId = null;
	/* Column Info */
	private String rsvTm = null;
	/* Column Info */
	private String skdWk = null;
	/* Column Info */
	private String skdTpCd = null;
	/* Column Info */
	private String pgmNo = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String skdHr = null;
	/* Column Info */
	private String creUsrId = null;
	/* Status */
	private String ibflag = null;
	/* Column Info */
	private String skdPara = null;
	/* Column Info */
	private String skdDy = null;
	/* Column Info */
	private String updUsrId = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	hashFildInpo	*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public ComSkdVO() {}

	public ComSkdVO(String ibflag, String pagerows, String skdId, String pgmNo, String skdTpCd, String svrCd, String rsvTm, String preSkdId, String skdMnt, String skdHr, String skdDy, String skdMon, String skdWk, String skdPara, String skdDesc, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.skdMnt = skdMnt;
		this.skdDesc = skdDesc;
		this.skdId = skdId;
		this.svrCd = svrCd;
		this.skdMon = skdMon;
		this.creDt = creDt;
		this.preSkdId = preSkdId;
		this.rsvTm = rsvTm;
		this.skdWk = skdWk;
		this.skdTpCd = skdTpCd;
		this.pgmNo = pgmNo;
		this.pagerows = pagerows;
		this.skdHr = skdHr;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.skdPara = skdPara;
		this.skdDy = skdDy;
		this.updUsrId = updUsrId;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("skd_mnt", getSkdMnt());
		this.hashColumns.put("skd_desc", getSkdDesc());
		this.hashColumns.put("skd_id", getSkdId());
		this.hashColumns.put("svr_cd", getSvrCd());
		this.hashColumns.put("skd_mon", getSkdMon());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("pre_skd_id", getPreSkdId());
		this.hashColumns.put("rsv_tm", getRsvTm());
		this.hashColumns.put("skd_wk", getSkdWk());
		this.hashColumns.put("skd_tp_cd", getSkdTpCd());
		this.hashColumns.put("pgm_no", getPgmNo());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("skd_hr", getSkdHr());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("skd_para", getSkdPara());
		this.hashColumns.put("skd_dy", getSkdDy());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		return this.hashColumns;
	}
	
	/**
	 * hashFildInpo
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("skd_mnt", "skdMnt");
		this.hashFields.put("skd_desc", "skdDesc");
		this.hashFields.put("skd_id", "skdId");
		this.hashFields.put("svr_cd", "svrCd");
		this.hashFields.put("skd_mon", "skdMon");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("pre_skd_id", "preSkdId");
		this.hashFields.put("rsv_tm", "rsvTm");
		this.hashFields.put("skd_wk", "skdWk");
		this.hashFields.put("skd_tp_cd", "skdTpCd");
		this.hashFields.put("pgm_no", "pgmNo");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("skd_hr", "skdHr");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("skd_para", "skdPara");
		this.hashFields.put("skd_dy", "skdDy");
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
	 * @return skdMnt
	 */
	public String getSkdMnt() {
		return this.skdMnt;
	}
	
	/**
	 * Column Info
	 * @return skdDesc
	 */
	public String getSkdDesc() {
		return this.skdDesc;
	}
	
	/**
	 * Column Info
	 * @return skdId
	 */
	public String getSkdId() {
		return this.skdId;
	}
	
	/**
	 * Column Info
	 * @return svrCd
	 */
	public String getSvrCd() {
		return this.svrCd;
	}
	
	/**
	 * Column Info
	 * @return skdMon
	 */
	public String getSkdMon() {
		return this.skdMon;
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
	 * @return preSkdId
	 */
	public String getPreSkdId() {
		return this.preSkdId;
	}
	
	/**
	 * Column Info
	 * @return rsvTm
	 */
	public String getRsvTm() {
		return this.rsvTm;
	}
	
	/**
	 * Column Info
	 * @return skdWk
	 */
	public String getSkdWk() {
		return this.skdWk;
	}
	
	/**
	 * Column Info
	 * @return skdTpCd
	 */
	public String getSkdTpCd() {
		return this.skdTpCd;
	}
	
	/**
	 * Column Info
	 * @return pgmNo
	 */
	public String getPgmNo() {
		return this.pgmNo;
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
	 * @return skdHr
	 */
	public String getSkdHr() {
		return this.skdHr;
	}
	
	/**
	 * Column Info
	 * @return creUsrId
	 */
	public String getCreUsrId() {
		return this.creUsrId;
	}
	
	/**
	 * Status
	 * @return ibflag
	 */
	public String getIbflag() {
		return this.ibflag;
	}
	
	/**
	 * Column Info
	 * @return skdPara
	 */
	public String getSkdPara() {
		return this.skdPara;
	}
	
	/**
	 * Column Info
	 * @return skdDy
	 */
	public String getSkdDy() {
		return this.skdDy;
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
	 * @param skdMnt
	 */
	public void setSkdMnt(String skdMnt) {
		this.skdMnt = skdMnt;
	}
	
	/**
	 * Column Info
	 * @param skdDesc
	 */
	public void setSkdDesc(String skdDesc) {
		this.skdDesc = skdDesc;
	}
	
	/**
	 * Column Info
	 * @param skdId
	 */
	public void setSkdId(String skdId) {
		this.skdId = skdId;
	}
	
	/**
	 * Column Info
	 * @param svrCd
	 */
	public void setSvrCd(String svrCd) {
		this.svrCd = svrCd;
	}
	
	/**
	 * Column Info
	 * @param skdMon
	 */
	public void setSkdMon(String skdMon) {
		this.skdMon = skdMon;
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
	 * @param preSkdId
	 */
	public void setPreSkdId(String preSkdId) {
		this.preSkdId = preSkdId;
	}
	
	/**
	 * Column Info
	 * @param rsvTm
	 */
	public void setRsvTm(String rsvTm) {
		this.rsvTm = rsvTm;
	}
	
	/**
	 * Column Info
	 * @param skdWk
	 */
	public void setSkdWk(String skdWk) {
		this.skdWk = skdWk;
	}
	
	/**
	 * Column Info
	 * @param skdTpCd
	 */
	public void setSkdTpCd(String skdTpCd) {
		this.skdTpCd = skdTpCd;
	}
	
	/**
	 * Column Info
	 * @param pgmNo
	 */
	public void setPgmNo(String pgmNo) {
		this.pgmNo = pgmNo;
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
	 * @param skdHr
	 */
	public void setSkdHr(String skdHr) {
		this.skdHr = skdHr;
	}
	
	/**
	 * Column Info
	 * @param creUsrId
	 */
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
	}
	
	/**
	 * Status
	 * @param ibflag
	 */
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
	}
	
	/**
	 * Column Info
	 * @param skdPara
	 */
	public void setSkdPara(String skdPara) {
		this.skdPara = skdPara;
	}
	
	/**
	 * Column Info
	 * @param skdDy
	 */
	public void setSkdDy(String skdDy) {
		this.skdDy = skdDy;
	}
	
	/**
	 * Column Info
	 * @param updUsrId
	 */
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
	}
	
	/**
	 * Request 넘어온 단건 DATA를 VO Class 에 담는다. 
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setSkdMnt(JSPUtil.getParameter(request, "skd_mnt", ""));
		setSkdDesc(JSPUtil.getParameter(request, "skd_desc", ""));
		setSkdId(JSPUtil.getParameter(request, "skd_id", ""));
		setSvrCd(JSPUtil.getParameter(request, "svr_cd", ""));
		setSkdMon(JSPUtil.getParameter(request, "skd_mon", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setPreSkdId(JSPUtil.getParameter(request, "pre_skd_id", ""));
		setRsvTm(JSPUtil.getParameter(request, "rsv_tm", ""));
		setSkdWk(JSPUtil.getParameter(request, "skd_wk", ""));
		setSkdTpCd(JSPUtil.getParameter(request, "skd_tp_cd", ""));
		setPgmNo(JSPUtil.getParameter(request, "pgm_no", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setSkdHr(JSPUtil.getParameter(request, "skd_hr", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setSkdPara(JSPUtil.getParameter(request, "skd_para", ""));
		setSkdDy(JSPUtil.getParameter(request, "skd_dy", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
	}

	/**
	 * Request를 VO Class를 담는다.
	 * @param request
	 * @return ComSkdVO[]
	 */
	public ComSkdVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return ComSkdVO[]
	 */
	public ComSkdVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		ComSkdVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] skdMnt = (JSPUtil.getParameter(request, prefix	+ "skd_mnt".trim(), length));
			String[] skdDesc = (JSPUtil.getParameter(request, prefix	+ "skd_desc".trim(), length));
			String[] skdId = (JSPUtil.getParameter(request, prefix	+ "skd_id".trim(), length));
			String[] svrCd = (JSPUtil.getParameter(request, prefix	+ "svr_cd".trim(), length));
			String[] skdMon = (JSPUtil.getParameter(request, prefix	+ "skd_mon".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] preSkdId = (JSPUtil.getParameter(request, prefix	+ "pre_skd_id".trim(), length));
			String[] rsvTm = (JSPUtil.getParameter(request, prefix	+ "rsv_tm".trim(), length));
			String[] skdWk = (JSPUtil.getParameter(request, prefix	+ "skd_wk".trim(), length));
			String[] skdTpCd = (JSPUtil.getParameter(request, prefix	+ "skd_tp_cd".trim(), length));
			String[] pgmNo = (JSPUtil.getParameter(request, prefix	+ "pgm_no".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] skdHr = (JSPUtil.getParameter(request, prefix	+ "skd_hr".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] skdPara = (JSPUtil.getParameter(request, prefix	+ "skd_para".trim(), length));
			String[] skdDy = (JSPUtil.getParameter(request, prefix	+ "skd_dy".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new ComSkdVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (skdMnt[i] != null)
					model.setSkdMnt(skdMnt[i]);
				if (skdDesc[i] != null)
					model.setSkdDesc(skdDesc[i]);
				if (skdId[i] != null)
					model.setSkdId(skdId[i]);
				if (svrCd[i] != null)
					model.setSvrCd(svrCd[i]);
				if (skdMon[i] != null)
					model.setSkdMon(skdMon[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (preSkdId[i] != null)
					model.setPreSkdId(preSkdId[i]);
				if (rsvTm[i] != null)
					model.setRsvTm(rsvTm[i]);
				if (skdWk[i] != null)
					model.setSkdWk(skdWk[i]);
				if (skdTpCd[i] != null)
					model.setSkdTpCd(skdTpCd[i]);
				if (pgmNo[i] != null)
					model.setPgmNo(pgmNo[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (skdHr[i] != null)
					model.setSkdHr(skdHr[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (skdPara[i] != null)
					model.setSkdPara(skdPara[i]);
				if (skdDy[i] != null)
					model.setSkdDy(skdDy[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getComSkdVOs();
	}

	/**
	 * 여러 VO Calss를 배열화 한다 
	 * @return ComSkdVO[]
	 */
	public ComSkdVO[] getComSkdVOs(){
		ComSkdVO[] vos = (ComSkdVO[])models.toArray(new ComSkdVO[models.size()]);
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
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdMnt = this.skdMnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdDesc = this.skdDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdId = this.skdId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.svrCd = this.svrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdMon = this.skdMon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.preSkdId = this.preSkdId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rsvTm = this.rsvTm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdWk = this.skdWk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdTpCd = this.skdTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pgmNo = this.pgmNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdHr = this.skdHr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdPara = this.skdPara .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdDy = this.skdDy .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
