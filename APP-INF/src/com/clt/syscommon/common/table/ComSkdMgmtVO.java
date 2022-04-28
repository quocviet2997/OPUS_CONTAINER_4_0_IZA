/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : ComSkdMgmtVO.java
*@FileTitle : ComSkdMgmtVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.30
*@LastModifier : 
*@LastVersion : 1.0
* 2009.07.30  
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
 * 관련 Event 에서 생성, 서버실행요청시 Data 전달역할을 수행하는 Value Object
 *
 * @author 
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class ComSkdMgmtVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<ComSkdMgmtVO> models = new ArrayList<ComSkdMgmtVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String skdParaCtnt = null;
	/* Column Info */
	private String rsvDt = null;
	/* Column Info */
	private String skdDesc = null;
	/* Column Info */
	private String skdId = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String preSkdId = null;
	/* Column Info */
	private String skdTpCd = null;
	/* Column Info */
	private String pgmNo = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String skdDyCtnt = null;
	/* Column Info */
	private String svrId = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String skdMonCtnt = null;
	/* Column Info */
	private String skdMntCtnt = null;
	/* Column Info */
	private String skdHrCtnt = null;
	/* Column Info */
	private String skdWkCtnt = null;
	/* Column Info */
	private String updUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public ComSkdMgmtVO() {}

	public ComSkdMgmtVO(String ibflag, String pagerows, String skdId, String pgmNo, String skdTpCd, String svrId, String rsvDt, String preSkdId, String skdMntCtnt, String skdHrCtnt, String skdDyCtnt, String skdMonCtnt, String skdWkCtnt, String skdParaCtnt, String skdDesc, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.skdParaCtnt = skdParaCtnt;
		this.rsvDt = rsvDt;
		this.skdDesc = skdDesc;
		this.skdId = skdId;
		this.creDt = creDt;
		this.preSkdId = preSkdId;
		this.skdTpCd = skdTpCd;
		this.pgmNo = pgmNo;
		this.pagerows = pagerows;
		this.skdDyCtnt = skdDyCtnt;
		this.svrId = svrId;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.skdMonCtnt = skdMonCtnt;
		this.skdMntCtnt = skdMntCtnt;
		this.skdHrCtnt = skdHrCtnt;
		this.skdWkCtnt = skdWkCtnt;
		this.updUsrId = updUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("skd_para_ctnt", getSkdParaCtnt());
		this.hashColumns.put("rsv_dt", getRsvDt());
		this.hashColumns.put("skd_desc", getSkdDesc());
		this.hashColumns.put("skd_id", getSkdId());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("pre_skd_id", getPreSkdId());
		this.hashColumns.put("skd_tp_cd", getSkdTpCd());
		this.hashColumns.put("pgm_no", getPgmNo());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("skd_dy_ctnt", getSkdDyCtnt());
		this.hashColumns.put("svr_id", getSvrId());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("skd_mon_ctnt", getSkdMonCtnt());
		this.hashColumns.put("skd_mnt_ctnt", getSkdMntCtnt());
		this.hashColumns.put("skd_hr_ctnt", getSkdHrCtnt());
		this.hashColumns.put("skd_wk_ctnt", getSkdWkCtnt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("skd_para_ctnt", "skdParaCtnt");
		this.hashFields.put("rsv_dt", "rsvDt");
		this.hashFields.put("skd_desc", "skdDesc");
		this.hashFields.put("skd_id", "skdId");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("pre_skd_id", "preSkdId");
		this.hashFields.put("skd_tp_cd", "skdTpCd");
		this.hashFields.put("pgm_no", "pgmNo");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("skd_dy_ctnt", "skdDyCtnt");
		this.hashFields.put("svr_id", "svrId");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("skd_mon_ctnt", "skdMonCtnt");
		this.hashFields.put("skd_mnt_ctnt", "skdMntCtnt");
		this.hashFields.put("skd_hr_ctnt", "skdHrCtnt");
		this.hashFields.put("skd_wk_ctnt", "skdWkCtnt");
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
	 * @return skdParaCtnt
	 */
	public String getSkdParaCtnt() {
		return this.skdParaCtnt;
	}
	
	/**
	 * Column Info
	 * @return rsvDt
	 */
	public String getRsvDt() {
		return this.rsvDt;
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
	 * @return skdDyCtnt
	 */
	public String getSkdDyCtnt() {
		return this.skdDyCtnt;
	}
	
	/**
	 * Column Info
	 * @return svrId
	 */
	public String getSvrId() {
		return this.svrId;
	}
	
	/**
	 * Column Info
	 * @return creUsrId
	 */
	public String getCreUsrId() {
		return this.creUsrId;
	}
	
	/**
	 * VO Data Value( C:Creation, U:Update, D:Delete )
	 * @return ibflag
	 */
	public String getIbflag() {
		return this.ibflag;
	}
	
	/**
	 * Column Info
	 * @return skdMonCtnt
	 */
	public String getSkdMonCtnt() {
		return this.skdMonCtnt;
	}
	
	/**
	 * Column Info
	 * @return skdMntCtnt
	 */
	public String getSkdMntCtnt() {
		return this.skdMntCtnt;
	}
	
	/**
	 * Column Info
	 * @return skdHrCtnt
	 */
	public String getSkdHrCtnt() {
		return this.skdHrCtnt;
	}
	
	/**
	 * Column Info
	 * @return skdWkCtnt
	 */
	public String getSkdWkCtnt() {
		return this.skdWkCtnt;
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
	 * @param skdParaCtnt
	 */
	public void setSkdParaCtnt(String skdParaCtnt) {
		this.skdParaCtnt = skdParaCtnt;
	}
	
	/**
	 * Column Info
	 * @param rsvDt
	 */
	public void setRsvDt(String rsvDt) {
		this.rsvDt = rsvDt;
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
	 * @param skdDyCtnt
	 */
	public void setSkdDyCtnt(String skdDyCtnt) {
		this.skdDyCtnt = skdDyCtnt;
	}
	
	/**
	 * Column Info
	 * @param svrId
	 */
	public void setSvrId(String svrId) {
		this.svrId = svrId;
	}
	
	/**
	 * Column Info
	 * @param creUsrId
	 */
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
	}
	
	/**
	 * VO Data Value( C:Creation, U:Update, D:Delete )
	 * @param ibflag
	 */
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
	}
	
	/**
	 * Column Info
	 * @param skdMonCtnt
	 */
	public void setSkdMonCtnt(String skdMonCtnt) {
		this.skdMonCtnt = skdMonCtnt;
	}
	
	/**
	 * Column Info
	 * @param skdMntCtnt
	 */
	public void setSkdMntCtnt(String skdMntCtnt) {
		this.skdMntCtnt = skdMntCtnt;
	}
	
	/**
	 * Column Info
	 * @param skdHrCtnt
	 */
	public void setSkdHrCtnt(String skdHrCtnt) {
		this.skdHrCtnt = skdHrCtnt;
	}
	
	/**
	 * Column Info
	 * @param skdWkCtnt
	 */
	public void setSkdWkCtnt(String skdWkCtnt) {
		this.skdWkCtnt = skdWkCtnt;
	}
	
	/**
	 * Column Info
	 * @param updUsrId
	 */
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setSkdParaCtnt(JSPUtil.getParameter(request, "skd_para_ctnt", ""));
		setRsvDt(JSPUtil.getParameter(request, "rsv_dt", ""));
		setSkdDesc(JSPUtil.getParameter(request, "skd_desc", ""));
		setSkdId(JSPUtil.getParameter(request, "skd_id", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setPreSkdId(JSPUtil.getParameter(request, "pre_skd_id", ""));
		setSkdTpCd(JSPUtil.getParameter(request, "skd_tp_cd", ""));
		setPgmNo(JSPUtil.getParameter(request, "pgm_no", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setSkdDyCtnt(JSPUtil.getParameter(request, "skd_dy_ctnt", ""));
		setSvrId(JSPUtil.getParameter(request, "svr_id", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setSkdMonCtnt(JSPUtil.getParameter(request, "skd_mon_ctnt", ""));
		setSkdMntCtnt(JSPUtil.getParameter(request, "skd_mnt_ctnt", ""));
		setSkdHrCtnt(JSPUtil.getParameter(request, "skd_hr_ctnt", ""));
		setSkdWkCtnt(JSPUtil.getParameter(request, "skd_wk_ctnt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return ComSkdMgmtVO[]
	 */
	public ComSkdMgmtVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return ComSkdMgmtVO[]
	 */
	public ComSkdMgmtVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		ComSkdMgmtVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] skdParaCtnt = (JSPUtil.getParameter(request, prefix	+ "skd_para_ctnt", length));
			String[] rsvDt = (JSPUtil.getParameter(request, prefix	+ "rsv_dt", length));
			String[] skdDesc = (JSPUtil.getParameter(request, prefix	+ "skd_desc", length));
			String[] skdId = (JSPUtil.getParameter(request, prefix	+ "skd_id", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] preSkdId = (JSPUtil.getParameter(request, prefix	+ "pre_skd_id", length));
			String[] skdTpCd = (JSPUtil.getParameter(request, prefix	+ "skd_tp_cd", length));
			String[] pgmNo = (JSPUtil.getParameter(request, prefix	+ "pgm_no", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] skdDyCtnt = (JSPUtil.getParameter(request, prefix	+ "skd_dy_ctnt", length));
			String[] svrId = (JSPUtil.getParameter(request, prefix	+ "svr_id", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] skdMonCtnt = (JSPUtil.getParameter(request, prefix	+ "skd_mon_ctnt", length));
			String[] skdMntCtnt = (JSPUtil.getParameter(request, prefix	+ "skd_mnt_ctnt", length));
			String[] skdHrCtnt = (JSPUtil.getParameter(request, prefix	+ "skd_hr_ctnt", length));
			String[] skdWkCtnt = (JSPUtil.getParameter(request, prefix	+ "skd_wk_ctnt", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			
			for (int i = 0; i < length; i++) {
				model = new ComSkdMgmtVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (skdParaCtnt[i] != null)
					model.setSkdParaCtnt(skdParaCtnt[i]);
				if (rsvDt[i] != null)
					model.setRsvDt(rsvDt[i]);
				if (skdDesc[i] != null)
					model.setSkdDesc(skdDesc[i]);
				if (skdId[i] != null)
					model.setSkdId(skdId[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (preSkdId[i] != null)
					model.setPreSkdId(preSkdId[i]);
				if (skdTpCd[i] != null)
					model.setSkdTpCd(skdTpCd[i]);
				if (pgmNo[i] != null)
					model.setPgmNo(pgmNo[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (skdDyCtnt[i] != null)
					model.setSkdDyCtnt(skdDyCtnt[i]);
				if (svrId[i] != null)
					model.setSvrId(svrId[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (skdMonCtnt[i] != null)
					model.setSkdMonCtnt(skdMonCtnt[i]);
				if (skdMntCtnt[i] != null)
					model.setSkdMntCtnt(skdMntCtnt[i]);
				if (skdHrCtnt[i] != null)
					model.setSkdHrCtnt(skdHrCtnt[i]);
				if (skdWkCtnt[i] != null)
					model.setSkdWkCtnt(skdWkCtnt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getComSkdMgmtVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return ComSkdMgmtVO[]
	 */
	public ComSkdMgmtVO[] getComSkdMgmtVOs(){
		ComSkdMgmtVO[] vos = (ComSkdMgmtVO[])models.toArray(new ComSkdMgmtVO[models.size()]);
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
	 * 필드에 있는 값을 스트링 배열로 반환.
	 * @param field
	 * @param i
	 * @return String[]
	 */
	private String[] getField(Field[] field, int i) {
		String[] arr = null;
		try{
			arr = (String[]) field[i].get(this);
		}catch(Exception ex){
			arr = null;
		}
		return arr;
	}

	/**
	* 포맷팅된 문자열에서 특수문자 제거("-","/",",",":")
	*/
	public void unDataFormat(){
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdParaCtnt = this.skdParaCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rsvDt = this.rsvDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdDesc = this.skdDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdId = this.skdId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.preSkdId = this.preSkdId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdTpCd = this.skdTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pgmNo = this.pgmNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdDyCtnt = this.skdDyCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.svrId = this.svrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdMonCtnt = this.skdMonCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdMntCtnt = this.skdMntCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdHrCtnt = this.skdHrCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdWkCtnt = this.skdWkCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
