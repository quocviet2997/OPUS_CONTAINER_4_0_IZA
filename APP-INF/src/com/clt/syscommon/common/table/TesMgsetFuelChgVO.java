/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : TesMgsetFuelChgVO.java
*@FileTitle : TesMgsetFuelChgVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.09.25
*@LastModifier : yOng hO lEE
*@LastVersion : 1.0
* 2009.09.25 yOng hO lEE 
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
 * @author yOng hO lEE
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class TesMgsetFuelChgVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<TesMgsetFuelChgVO> models = new ArrayList<TesMgsetFuelChgVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String mgstRunHrs = null;
	/* Column Info */
	private String currCd = null;
	/* Column Info */
	private String fuelRt = null;
	/* Column Info */
	private String chssNo = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String ttlAmt = null;
	/* Column Info */
	private String mgstNo = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String rfCntrNo = null;
	/* Column Info */
	private String ydCd = null;
	/* Column Info */
	private String lbrAmt = null;
	/* Column Info */
	private String woNo = null;
	/* Column Info */
	private String tmlSoSeq = null;
	/* Column Info */
	private String fuelDt = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String tmlSoOfcCtyCd = null;
	/* Column Info */
	private String tmlSoDtlSeq = null;
	/* Column Info */
	private String fuelAmt = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public TesMgsetFuelChgVO() {}

	public TesMgsetFuelChgVO(String ibflag, String pagerows, String tmlSoOfcCtyCd, String tmlSoSeq, String tmlSoDtlSeq, String mgstNo, String ydCd, String fuelDt, String mgstRunHrs, String currCd, String fuelRt, String fuelAmt, String lbrAmt, String ttlAmt, String chssNo, String rfCntrNo, String woNo, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.mgstRunHrs = mgstRunHrs;
		this.currCd = currCd;
		this.fuelRt = fuelRt;
		this.chssNo = chssNo;
		this.creDt = creDt;
		this.ttlAmt = ttlAmt;
		this.mgstNo = mgstNo;
		this.pagerows = pagerows;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.rfCntrNo = rfCntrNo;
		this.ydCd = ydCd;
		this.lbrAmt = lbrAmt;
		this.woNo = woNo;
		this.tmlSoSeq = tmlSoSeq;
		this.fuelDt = fuelDt;
		this.updUsrId = updUsrId;
		this.tmlSoOfcCtyCd = tmlSoOfcCtyCd;
		this.tmlSoDtlSeq = tmlSoDtlSeq;
		this.fuelAmt = fuelAmt;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("mgst_run_hrs", getMgstRunHrs());
		this.hashColumns.put("curr_cd", getCurrCd());
		this.hashColumns.put("fuel_rt", getFuelRt());
		this.hashColumns.put("chss_no", getChssNo());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("ttl_amt", getTtlAmt());
		this.hashColumns.put("mgst_no", getMgstNo());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("rf_cntr_no", getRfCntrNo());
		this.hashColumns.put("yd_cd", getYdCd());
		this.hashColumns.put("lbr_amt", getLbrAmt());
		this.hashColumns.put("wo_no", getWoNo());
		this.hashColumns.put("tml_so_seq", getTmlSoSeq());
		this.hashColumns.put("fuel_dt", getFuelDt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("tml_so_ofc_cty_cd", getTmlSoOfcCtyCd());
		this.hashColumns.put("tml_so_dtl_seq", getTmlSoDtlSeq());
		this.hashColumns.put("fuel_amt", getFuelAmt());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("mgst_run_hrs", "mgstRunHrs");
		this.hashFields.put("curr_cd", "currCd");
		this.hashFields.put("fuel_rt", "fuelRt");
		this.hashFields.put("chss_no", "chssNo");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("ttl_amt", "ttlAmt");
		this.hashFields.put("mgst_no", "mgstNo");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("rf_cntr_no", "rfCntrNo");
		this.hashFields.put("yd_cd", "ydCd");
		this.hashFields.put("lbr_amt", "lbrAmt");
		this.hashFields.put("wo_no", "woNo");
		this.hashFields.put("tml_so_seq", "tmlSoSeq");
		this.hashFields.put("fuel_dt", "fuelDt");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("tml_so_ofc_cty_cd", "tmlSoOfcCtyCd");
		this.hashFields.put("tml_so_dtl_seq", "tmlSoDtlSeq");
		this.hashFields.put("fuel_amt", "fuelAmt");
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
	 * @return mgstRunHrs
	 */
	public String getMgstRunHrs() {
		return this.mgstRunHrs;
	}
	
	/**
	 * Column Info
	 * @return currCd
	 */
	public String getCurrCd() {
		return this.currCd;
	}
	
	/**
	 * Column Info
	 * @return fuelRt
	 */
	public String getFuelRt() {
		return this.fuelRt;
	}
	
	/**
	 * Column Info
	 * @return chssNo
	 */
	public String getChssNo() {
		return this.chssNo;
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
	 * @return ttlAmt
	 */
	public String getTtlAmt() {
		return this.ttlAmt;
	}
	
	/**
	 * Column Info
	 * @return mgstNo
	 */
	public String getMgstNo() {
		return this.mgstNo;
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
	 * @return rfCntrNo
	 */
	public String getRfCntrNo() {
		return this.rfCntrNo;
	}
	
	/**
	 * Column Info
	 * @return ydCd
	 */
	public String getYdCd() {
		return this.ydCd;
	}
	
	/**
	 * Column Info
	 * @return lbrAmt
	 */
	public String getLbrAmt() {
		return this.lbrAmt;
	}
	
	/**
	 * Column Info
	 * @return woNo
	 */
	public String getWoNo() {
		return this.woNo;
	}
	
	/**
	 * Column Info
	 * @return tmlSoSeq
	 */
	public String getTmlSoSeq() {
		return this.tmlSoSeq;
	}
	
	/**
	 * Column Info
	 * @return fuelDt
	 */
	public String getFuelDt() {
		return this.fuelDt;
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
	 * @return tmlSoOfcCtyCd
	 */
	public String getTmlSoOfcCtyCd() {
		return this.tmlSoOfcCtyCd;
	}
	
	/**
	 * Column Info
	 * @return tmlSoDtlSeq
	 */
	public String getTmlSoDtlSeq() {
		return this.tmlSoDtlSeq;
	}
	
	/**
	 * Column Info
	 * @return fuelAmt
	 */
	public String getFuelAmt() {
		return this.fuelAmt;
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
	 * @param mgstRunHrs
	 */
	public void setMgstRunHrs(String mgstRunHrs) {
		this.mgstRunHrs = mgstRunHrs;
	}
	
	/**
	 * Column Info
	 * @param currCd
	 */
	public void setCurrCd(String currCd) {
		this.currCd = currCd;
	}
	
	/**
	 * Column Info
	 * @param fuelRt
	 */
	public void setFuelRt(String fuelRt) {
		this.fuelRt = fuelRt;
	}
	
	/**
	 * Column Info
	 * @param chssNo
	 */
	public void setChssNo(String chssNo) {
		this.chssNo = chssNo;
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
	 * @param ttlAmt
	 */
	public void setTtlAmt(String ttlAmt) {
		this.ttlAmt = ttlAmt;
	}
	
	/**
	 * Column Info
	 * @param mgstNo
	 */
	public void setMgstNo(String mgstNo) {
		this.mgstNo = mgstNo;
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
	 * @param rfCntrNo
	 */
	public void setRfCntrNo(String rfCntrNo) {
		this.rfCntrNo = rfCntrNo;
	}
	
	/**
	 * Column Info
	 * @param ydCd
	 */
	public void setYdCd(String ydCd) {
		this.ydCd = ydCd;
	}
	
	/**
	 * Column Info
	 * @param lbrAmt
	 */
	public void setLbrAmt(String lbrAmt) {
		this.lbrAmt = lbrAmt;
	}
	
	/**
	 * Column Info
	 * @param woNo
	 */
	public void setWoNo(String woNo) {
		this.woNo = woNo;
	}
	
	/**
	 * Column Info
	 * @param tmlSoSeq
	 */
	public void setTmlSoSeq(String tmlSoSeq) {
		this.tmlSoSeq = tmlSoSeq;
	}
	
	/**
	 * Column Info
	 * @param fuelDt
	 */
	public void setFuelDt(String fuelDt) {
		this.fuelDt = fuelDt;
	}
	
	/**
	 * Column Info
	 * @param updUsrId
	 */
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
	}
	
	/**
	 * Column Info
	 * @param tmlSoOfcCtyCd
	 */
	public void setTmlSoOfcCtyCd(String tmlSoOfcCtyCd) {
		this.tmlSoOfcCtyCd = tmlSoOfcCtyCd;
	}
	
	/**
	 * Column Info
	 * @param tmlSoDtlSeq
	 */
	public void setTmlSoDtlSeq(String tmlSoDtlSeq) {
		this.tmlSoDtlSeq = tmlSoDtlSeq;
	}
	
	/**
	 * Column Info
	 * @param fuelAmt
	 */
	public void setFuelAmt(String fuelAmt) {
		this.fuelAmt = fuelAmt;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setMgstRunHrs(JSPUtil.getParameter(request, "mgst_run_hrs", ""));
		setCurrCd(JSPUtil.getParameter(request, "curr_cd", ""));
		setFuelRt(JSPUtil.getParameter(request, "fuel_rt", ""));
		setChssNo(JSPUtil.getParameter(request, "chss_no", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setTtlAmt(JSPUtil.getParameter(request, "ttl_amt", ""));
		setMgstNo(JSPUtil.getParameter(request, "mgst_no", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setRfCntrNo(JSPUtil.getParameter(request, "rf_cntr_no", ""));
		setYdCd(JSPUtil.getParameter(request, "yd_cd", ""));
		setLbrAmt(JSPUtil.getParameter(request, "lbr_amt", ""));
		setWoNo(JSPUtil.getParameter(request, "wo_no", ""));
		setTmlSoSeq(JSPUtil.getParameter(request, "tml_so_seq", ""));
		setFuelDt(JSPUtil.getParameter(request, "fuel_dt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setTmlSoOfcCtyCd(JSPUtil.getParameter(request, "tml_so_ofc_cty_cd", ""));
		setTmlSoDtlSeq(JSPUtil.getParameter(request, "tml_so_dtl_seq", ""));
		setFuelAmt(JSPUtil.getParameter(request, "fuel_amt", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return TesMgsetFuelChgVO[]
	 */
	public TesMgsetFuelChgVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return TesMgsetFuelChgVO[]
	 */
	public TesMgsetFuelChgVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		TesMgsetFuelChgVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] mgstRunHrs = (JSPUtil.getParameter(request, prefix	+ "mgst_run_hrs", length));
			String[] currCd = (JSPUtil.getParameter(request, prefix	+ "curr_cd", length));
			String[] fuelRt = (JSPUtil.getParameter(request, prefix	+ "fuel_rt", length));
			String[] chssNo = (JSPUtil.getParameter(request, prefix	+ "chss_no", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] ttlAmt = (JSPUtil.getParameter(request, prefix	+ "ttl_amt", length));
			String[] mgstNo = (JSPUtil.getParameter(request, prefix	+ "mgst_no", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] rfCntrNo = (JSPUtil.getParameter(request, prefix	+ "rf_cntr_no", length));
			String[] ydCd = (JSPUtil.getParameter(request, prefix	+ "yd_cd", length));
			String[] lbrAmt = (JSPUtil.getParameter(request, prefix	+ "lbr_amt", length));
			String[] woNo = (JSPUtil.getParameter(request, prefix	+ "wo_no", length));
			String[] tmlSoSeq = (JSPUtil.getParameter(request, prefix	+ "tml_so_seq", length));
			String[] fuelDt = (JSPUtil.getParameter(request, prefix	+ "fuel_dt", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] tmlSoOfcCtyCd = (JSPUtil.getParameter(request, prefix	+ "tml_so_ofc_cty_cd", length));
			String[] tmlSoDtlSeq = (JSPUtil.getParameter(request, prefix	+ "tml_so_dtl_seq", length));
			String[] fuelAmt = (JSPUtil.getParameter(request, prefix	+ "fuel_amt", length));
			
			for (int i = 0; i < length; i++) {
				model = new TesMgsetFuelChgVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (mgstRunHrs[i] != null)
					model.setMgstRunHrs(mgstRunHrs[i]);
				if (currCd[i] != null)
					model.setCurrCd(currCd[i]);
				if (fuelRt[i] != null)
					model.setFuelRt(fuelRt[i]);
				if (chssNo[i] != null)
					model.setChssNo(chssNo[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (ttlAmt[i] != null)
					model.setTtlAmt(ttlAmt[i]);
				if (mgstNo[i] != null)
					model.setMgstNo(mgstNo[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (rfCntrNo[i] != null)
					model.setRfCntrNo(rfCntrNo[i]);
				if (ydCd[i] != null)
					model.setYdCd(ydCd[i]);
				if (lbrAmt[i] != null)
					model.setLbrAmt(lbrAmt[i]);
				if (woNo[i] != null)
					model.setWoNo(woNo[i]);
				if (tmlSoSeq[i] != null)
					model.setTmlSoSeq(tmlSoSeq[i]);
				if (fuelDt[i] != null)
					model.setFuelDt(fuelDt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (tmlSoOfcCtyCd[i] != null)
					model.setTmlSoOfcCtyCd(tmlSoOfcCtyCd[i]);
				if (tmlSoDtlSeq[i] != null)
					model.setTmlSoDtlSeq(tmlSoDtlSeq[i]);
				if (fuelAmt[i] != null)
					model.setFuelAmt(fuelAmt[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getTesMgsetFuelChgVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return TesMgsetFuelChgVO[]
	 */
	public TesMgsetFuelChgVO[] getTesMgsetFuelChgVOs(){
		TesMgsetFuelChgVO[] vos = (TesMgsetFuelChgVO[])models.toArray(new TesMgsetFuelChgVO[models.size()]);
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
		this.mgstRunHrs = this.mgstRunHrs .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.currCd = this.currCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fuelRt = this.fuelRt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chssNo = this.chssNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ttlAmt = this.ttlAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mgstNo = this.mgstNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rfCntrNo = this.rfCntrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ydCd = this.ydCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lbrAmt = this.lbrAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.woNo = this.woNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlSoSeq = this.tmlSoSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fuelDt = this.fuelDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlSoOfcCtyCd = this.tmlSoOfcCtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlSoDtlSeq = this.tmlSoDtlSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fuelAmt = this.fuelAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
