/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : ComMnuCfgVO.java
*@FileTitle : ComMnuCfgVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.03.04
*@LastModifier : 김경범
*@LastVersion : 1.0
* 2009.03.04 김경범 
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
 * @author 김경범
 * @since J2EE 1.5
 */

public class ComMnuCfgVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<ComMnuCfgVO> models = new ArrayList<ComMnuCfgVO>();
	
	/* Column Inpo */
	private String updUsrId = null;
	/* Column Inpo */
	private String dpSeq = null;
	/* Column Inpo */
	private String prntPgmNo = null;
	/* Status */
	private String ibflag = null;
	/* Column Inpo */
	private String updDt = null;
	/* Column Inpo */
	private String creDt = null;
	/* Column Inpo */
	private String creUsrId = null;
	/* Column Inpo */
	private String pgmLvlVal = null;
	/* Column Inpo */
	private String chdPgmNo = null;
	/* Column Inpo */
	private String mnuCfgCd = null;
	/* Page Number */
	private String pagerows = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	hashFildInpo	*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public ComMnuCfgVO() {}

	public ComMnuCfgVO(String ibflag, String pagerows, String mnuCfgCd, String prntPgmNo, String chdPgmNo, String pgmLvlVal, String dpSeq, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updUsrId = updUsrId;
		this.dpSeq = dpSeq;
		this.prntPgmNo = prntPgmNo;
		this.ibflag = ibflag;
		this.updDt = updDt;
		this.creDt = creDt;
		this.creUsrId = creUsrId;
		this.pgmLvlVal = pgmLvlVal;
		this.chdPgmNo = chdPgmNo;
		this.mnuCfgCd = mnuCfgCd;
		this.pagerows = pagerows;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("dp_seq", getDpSeq());
		this.hashColumns.put("prnt_pgm_no", getPrntPgmNo());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("pgm_lvl_val", getPgmLvlVal());
		this.hashColumns.put("chd_pgm_no", getChdPgmNo());
		this.hashColumns.put("mnu_cfg_cd", getMnuCfgCd());
		this.hashColumns.put("pagerows", getPagerows());
		return this.hashColumns;
	}
	
	/**
	 * hashFildInpo
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("dp_seq", "dpSeq");
		this.hashFields.put("prnt_pgm_no", "prntPgmNo");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("pgm_lvl_val", "pgmLvlVal");
		this.hashFields.put("chd_pgm_no", "chdPgmNo");
		this.hashFields.put("mnu_cfg_cd", "mnuCfgCd");
		this.hashFields.put("pagerows", "pagerows");
		return this.hashFields;
	}
	
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	public String getDpSeq() {
		return this.dpSeq;
	}
	public String getPrntPgmNo() {
		return this.prntPgmNo;
	}
	public String getIbflag() {
		return this.ibflag;
	}
	public String getUpdDt() {
		return this.updDt;
	}
	public String getCreDt() {
		return this.creDt;
	}
	public String getCreUsrId() {
		return this.creUsrId;
	}
	public String getPgmLvlVal() {
		return this.pgmLvlVal;
	}
	public String getChdPgmNo() {
		return this.chdPgmNo;
	}
	public String getMnuCfgCd() {
		return this.mnuCfgCd;
	}
	public String getPagerows() {
		return this.pagerows;
	}

	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
		//this.updUsrId=true;
	}
	public void setDpSeq(String dpSeq) {
		this.dpSeq = dpSeq;
		//this.dpSeq=true;
	}
	public void setPrntPgmNo(String prntPgmNo) {
		this.prntPgmNo = prntPgmNo;
		//this.prntPgmNo=true;
	}
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
		//this.updDt=true;
	}
	public void setCreDt(String creDt) {
		this.creDt = creDt;
		//this.creDt=true;
	}
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
		//this.creUsrId=true;
	}
	public void setPgmLvlVal(String pgmLvlVal) {
		this.pgmLvlVal = pgmLvlVal;
		//this.pgmLvlVal=true;
	}
	public void setChdPgmNo(String chdPgmNo) {
		this.chdPgmNo = chdPgmNo;
		//this.chdPgmNo=true;
	}
	public void setMnuCfgCd(String mnuCfgCd) {
		this.mnuCfgCd = mnuCfgCd;
		//this.mnuCfgCd=true;
	}
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}
	public void fromRequest(HttpServletRequest request) {
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setDpSeq(JSPUtil.getParameter(request, "dp_seq", ""));
		setPrntPgmNo(JSPUtil.getParameter(request, "prnt_pgm_no", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setPgmLvlVal(JSPUtil.getParameter(request, "pgm_lvl_val", ""));
		setChdPgmNo(JSPUtil.getParameter(request, "chd_pgm_no", ""));
		setMnuCfgCd(JSPUtil.getParameter(request, "mnu_cfg_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
	}

	public ComMnuCfgVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public ComMnuCfgVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		ComMnuCfgVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] dpSeq = (JSPUtil.getParameter(request, prefix	+ "dp_seq".trim(), length));
			String[] prntPgmNo = (JSPUtil.getParameter(request, prefix	+ "prnt_pgm_no".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] pgmLvlVal = (JSPUtil.getParameter(request, prefix	+ "pgm_lvl_val".trim(), length));
			String[] chdPgmNo = (JSPUtil.getParameter(request, prefix	+ "chd_pgm_no".trim(), length));
			String[] mnuCfgCd = (JSPUtil.getParameter(request, prefix	+ "mnu_cfg_cd".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new ComMnuCfgVO();
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (dpSeq[i] != null)
					model.setDpSeq(dpSeq[i]);
				if (prntPgmNo[i] != null)
					model.setPrntPgmNo(prntPgmNo[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (pgmLvlVal[i] != null)
					model.setPgmLvlVal(pgmLvlVal[i]);
				if (chdPgmNo[i] != null)
					model.setChdPgmNo(chdPgmNo[i]);
				if (mnuCfgCd[i] != null)
					model.setMnuCfgCd(mnuCfgCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {}
		return getComMnuCfgVOs();
	}

	public ComMnuCfgVO[] getComMnuCfgVOs(){
		ComMnuCfgVO[] vos = (ComMnuCfgVO[])models.toArray(new ComMnuCfgVO[models.size()]);
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
		this.dpSeq = this.dpSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prntPgmNo = this.prntPgmNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pgmLvlVal = this.pgmLvlVal .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chdPgmNo = this.chdPgmNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mnuCfgCd = this.mnuCfgCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
