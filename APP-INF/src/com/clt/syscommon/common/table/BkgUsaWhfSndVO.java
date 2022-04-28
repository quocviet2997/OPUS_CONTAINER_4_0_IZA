/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BkgUsaWhfSndVO.java
*@FileTitle : BkgUsaWhfSndVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.08.27
*@LastModifier : 김민정
*@LastVersion : 1.0
* 2009.08.27 김민정 
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
 * @author 김민정
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class BkgUsaWhfSndVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgUsaWhfSndVO> models = new ArrayList<BkgUsaWhfSndVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String vslCd = null;
	/* Column Info */
	private String arrDt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String ddctAmt = null;
	/* Column Info */
	private String skdVoyNo = null;
	/* Column Info */
	private String vslNm = null;
	/* Column Info */
	private String ioBndCd = null;
	/* Column Info */
	private String depDt = null;
	/* Column Info */
	private String skdDirCd = null;
	/* Column Info */
	private String crrCd = null;
	/* Column Info */
	private String sndRmk = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String bilSndPtyNm = null;
	/* Column Info */
	private String vslVoyDirNo = null;
	/* Column Info */
	private String brthDesc = null;
	/* Column Info */
	private String bilRcvPtyNm = null;
	/* Column Info */
	private String portCd = null;
	/* Column Info */
	private String loclUpdDt = null;
	/* Column Info */
	private String whfDcRt = null;
	/* Column Info */
	private String updUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgUsaWhfSndVO() {}

	public BkgUsaWhfSndVO(String ibflag, String pagerows, String vslCd, String skdVoyNo, String skdDirCd, String portCd, String ioBndCd, String vslNm, String crrCd, String vslVoyDirNo, String brthDesc, String depDt, String arrDt, String bilRcvPtyNm, String bilSndPtyNm, String sndRmk, String whfDcRt, String ddctAmt, String loclUpdDt, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.vslCd = vslCd;
		this.arrDt = arrDt;
		this.creDt = creDt;
		this.ddctAmt = ddctAmt;
		this.skdVoyNo = skdVoyNo;
		this.vslNm = vslNm;
		this.ioBndCd = ioBndCd;
		this.depDt = depDt;
		this.skdDirCd = skdDirCd;
		this.crrCd = crrCd;
		this.sndRmk = sndRmk;
		this.pagerows = pagerows;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.bilSndPtyNm = bilSndPtyNm;
		this.vslVoyDirNo = vslVoyDirNo;
		this.brthDesc = brthDesc;
		this.bilRcvPtyNm = bilRcvPtyNm;
		this.portCd = portCd;
		this.loclUpdDt = loclUpdDt;
		this.whfDcRt = whfDcRt;
		this.updUsrId = updUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("arr_dt", getArrDt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("ddct_amt", getDdctAmt());
		this.hashColumns.put("skd_voy_no", getSkdVoyNo());
		this.hashColumns.put("vsl_nm", getVslNm());
		this.hashColumns.put("io_bnd_cd", getIoBndCd());
		this.hashColumns.put("dep_dt", getDepDt());
		this.hashColumns.put("skd_dir_cd", getSkdDirCd());
		this.hashColumns.put("crr_cd", getCrrCd());
		this.hashColumns.put("snd_rmk", getSndRmk());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("bil_snd_pty_nm", getBilSndPtyNm());
		this.hashColumns.put("vsl_voy_dir_no", getVslVoyDirNo());
		this.hashColumns.put("brth_desc", getBrthDesc());
		this.hashColumns.put("bil_rcv_pty_nm", getBilRcvPtyNm());
		this.hashColumns.put("port_cd", getPortCd());
		this.hashColumns.put("locl_upd_dt", getLoclUpdDt());
		this.hashColumns.put("whf_dc_rt", getWhfDcRt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("arr_dt", "arrDt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("ddct_amt", "ddctAmt");
		this.hashFields.put("skd_voy_no", "skdVoyNo");
		this.hashFields.put("vsl_nm", "vslNm");
		this.hashFields.put("io_bnd_cd", "ioBndCd");
		this.hashFields.put("dep_dt", "depDt");
		this.hashFields.put("skd_dir_cd", "skdDirCd");
		this.hashFields.put("crr_cd", "crrCd");
		this.hashFields.put("snd_rmk", "sndRmk");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("bil_snd_pty_nm", "bilSndPtyNm");
		this.hashFields.put("vsl_voy_dir_no", "vslVoyDirNo");
		this.hashFields.put("brth_desc", "brthDesc");
		this.hashFields.put("bil_rcv_pty_nm", "bilRcvPtyNm");
		this.hashFields.put("port_cd", "portCd");
		this.hashFields.put("locl_upd_dt", "loclUpdDt");
		this.hashFields.put("whf_dc_rt", "whfDcRt");
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
	 * @return vslCd
	 */
	public String getVslCd() {
		return this.vslCd;
	}
	
	/**
	 * Column Info
	 * @return arrDt
	 */
	public String getArrDt() {
		return this.arrDt;
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
	 * @return ddctAmt
	 */
	public String getDdctAmt() {
		return this.ddctAmt;
	}
	
	/**
	 * Column Info
	 * @return skdVoyNo
	 */
	public String getSkdVoyNo() {
		return this.skdVoyNo;
	}
	
	/**
	 * Column Info
	 * @return vslNm
	 */
	public String getVslNm() {
		return this.vslNm;
	}
	
	/**
	 * Column Info
	 * @return ioBndCd
	 */
	public String getIoBndCd() {
		return this.ioBndCd;
	}
	
	/**
	 * Column Info
	 * @return depDt
	 */
	public String getDepDt() {
		return this.depDt;
	}
	
	/**
	 * Column Info
	 * @return skdDirCd
	 */
	public String getSkdDirCd() {
		return this.skdDirCd;
	}
	
	/**
	 * Column Info
	 * @return crrCd
	 */
	public String getCrrCd() {
		return this.crrCd;
	}
	
	/**
	 * Column Info
	 * @return sndRmk
	 */
	public String getSndRmk() {
		return this.sndRmk;
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
	 * @return bilSndPtyNm
	 */
	public String getBilSndPtyNm() {
		return this.bilSndPtyNm;
	}
	
	/**
	 * Column Info
	 * @return vslVoyDirNo
	 */
	public String getVslVoyDirNo() {
		return this.vslVoyDirNo;
	}
	
	/**
	 * Column Info
	 * @return brthDesc
	 */
	public String getBrthDesc() {
		return this.brthDesc;
	}
	
	/**
	 * Column Info
	 * @return bilRcvPtyNm
	 */
	public String getBilRcvPtyNm() {
		return this.bilRcvPtyNm;
	}
	
	/**
	 * Column Info
	 * @return portCd
	 */
	public String getPortCd() {
		return this.portCd;
	}
	
	/**
	 * Column Info
	 * @return loclUpdDt
	 */
	public String getLoclUpdDt() {
		return this.loclUpdDt;
	}
	
	/**
	 * Column Info
	 * @return whfDcRt
	 */
	public String getWhfDcRt() {
		return this.whfDcRt;
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
	 * @param vslCd
	 */
	public void setVslCd(String vslCd) {
		this.vslCd = vslCd;
	}
	
	/**
	 * Column Info
	 * @param arrDt
	 */
	public void setArrDt(String arrDt) {
		this.arrDt = arrDt;
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
	 * @param ddctAmt
	 */
	public void setDdctAmt(String ddctAmt) {
		this.ddctAmt = ddctAmt;
	}
	
	/**
	 * Column Info
	 * @param skdVoyNo
	 */
	public void setSkdVoyNo(String skdVoyNo) {
		this.skdVoyNo = skdVoyNo;
	}
	
	/**
	 * Column Info
	 * @param vslNm
	 */
	public void setVslNm(String vslNm) {
		this.vslNm = vslNm;
	}
	
	/**
	 * Column Info
	 * @param ioBndCd
	 */
	public void setIoBndCd(String ioBndCd) {
		this.ioBndCd = ioBndCd;
	}
	
	/**
	 * Column Info
	 * @param depDt
	 */
	public void setDepDt(String depDt) {
		this.depDt = depDt;
	}
	
	/**
	 * Column Info
	 * @param skdDirCd
	 */
	public void setSkdDirCd(String skdDirCd) {
		this.skdDirCd = skdDirCd;
	}
	
	/**
	 * Column Info
	 * @param crrCd
	 */
	public void setCrrCd(String crrCd) {
		this.crrCd = crrCd;
	}
	
	/**
	 * Column Info
	 * @param sndRmk
	 */
	public void setSndRmk(String sndRmk) {
		this.sndRmk = sndRmk;
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
	 * @param bilSndPtyNm
	 */
	public void setBilSndPtyNm(String bilSndPtyNm) {
		this.bilSndPtyNm = bilSndPtyNm;
	}
	
	/**
	 * Column Info
	 * @param vslVoyDirNo
	 */
	public void setVslVoyDirNo(String vslVoyDirNo) {
		this.vslVoyDirNo = vslVoyDirNo;
	}
	
	/**
	 * Column Info
	 * @param brthDesc
	 */
	public void setBrthDesc(String brthDesc) {
		this.brthDesc = brthDesc;
	}
	
	/**
	 * Column Info
	 * @param bilRcvPtyNm
	 */
	public void setBilRcvPtyNm(String bilRcvPtyNm) {
		this.bilRcvPtyNm = bilRcvPtyNm;
	}
	
	/**
	 * Column Info
	 * @param portCd
	 */
	public void setPortCd(String portCd) {
		this.portCd = portCd;
	}
	
	/**
	 * Column Info
	 * @param loclUpdDt
	 */
	public void setLoclUpdDt(String loclUpdDt) {
		this.loclUpdDt = loclUpdDt;
	}
	
	/**
	 * Column Info
	 * @param whfDcRt
	 */
	public void setWhfDcRt(String whfDcRt) {
		this.whfDcRt = whfDcRt;
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
		setVslCd(JSPUtil.getParameter(request, "vsl_cd", ""));
		setArrDt(JSPUtil.getParameter(request, "arr_dt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setDdctAmt(JSPUtil.getParameter(request, "ddct_amt", ""));
		setSkdVoyNo(JSPUtil.getParameter(request, "skd_voy_no", ""));
		setVslNm(JSPUtil.getParameter(request, "vsl_nm", ""));
		setIoBndCd(JSPUtil.getParameter(request, "io_bnd_cd", ""));
		setDepDt(JSPUtil.getParameter(request, "dep_dt", ""));
		setSkdDirCd(JSPUtil.getParameter(request, "skd_dir_cd", ""));
		setCrrCd(JSPUtil.getParameter(request, "crr_cd", ""));
		setSndRmk(JSPUtil.getParameter(request, "snd_rmk", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setBilSndPtyNm(JSPUtil.getParameter(request, "bil_snd_pty_nm", ""));
		setVslVoyDirNo(JSPUtil.getParameter(request, "vsl_voy_dir_no", ""));
		setBrthDesc(JSPUtil.getParameter(request, "brth_desc", ""));
		setBilRcvPtyNm(JSPUtil.getParameter(request, "bil_rcv_pty_nm", ""));
		setPortCd(JSPUtil.getParameter(request, "port_cd", ""));
		setLoclUpdDt(JSPUtil.getParameter(request, "locl_upd_dt", ""));
		setWhfDcRt(JSPUtil.getParameter(request, "whf_dc_rt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BkgUsaWhfSndVO[]
	 */
	public BkgUsaWhfSndVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgUsaWhfSndVO[]
	 */
	public BkgUsaWhfSndVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgUsaWhfSndVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd", length));
			String[] arrDt = (JSPUtil.getParameter(request, prefix	+ "arr_dt", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] ddctAmt = (JSPUtil.getParameter(request, prefix	+ "ddct_amt", length));
			String[] skdVoyNo = (JSPUtil.getParameter(request, prefix	+ "skd_voy_no", length));
			String[] vslNm = (JSPUtil.getParameter(request, prefix	+ "vsl_nm", length));
			String[] ioBndCd = (JSPUtil.getParameter(request, prefix	+ "io_bnd_cd", length));
			String[] depDt = (JSPUtil.getParameter(request, prefix	+ "dep_dt", length));
			String[] skdDirCd = (JSPUtil.getParameter(request, prefix	+ "skd_dir_cd", length));
			String[] crrCd = (JSPUtil.getParameter(request, prefix	+ "crr_cd", length));
			String[] sndRmk = (JSPUtil.getParameter(request, prefix	+ "snd_rmk", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] bilSndPtyNm = (JSPUtil.getParameter(request, prefix	+ "bil_snd_pty_nm", length));
			String[] vslVoyDirNo = (JSPUtil.getParameter(request, prefix	+ "vsl_voy_dir_no", length));
			String[] brthDesc = (JSPUtil.getParameter(request, prefix	+ "brth_desc", length));
			String[] bilRcvPtyNm = (JSPUtil.getParameter(request, prefix	+ "bil_rcv_pty_nm", length));
			String[] portCd = (JSPUtil.getParameter(request, prefix	+ "port_cd", length));
			String[] loclUpdDt = (JSPUtil.getParameter(request, prefix	+ "locl_upd_dt", length));
			String[] whfDcRt = (JSPUtil.getParameter(request, prefix	+ "whf_dc_rt", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgUsaWhfSndVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (arrDt[i] != null)
					model.setArrDt(arrDt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (ddctAmt[i] != null)
					model.setDdctAmt(ddctAmt[i]);
				if (skdVoyNo[i] != null)
					model.setSkdVoyNo(skdVoyNo[i]);
				if (vslNm[i] != null)
					model.setVslNm(vslNm[i]);
				if (ioBndCd[i] != null)
					model.setIoBndCd(ioBndCd[i]);
				if (depDt[i] != null)
					model.setDepDt(depDt[i]);
				if (skdDirCd[i] != null)
					model.setSkdDirCd(skdDirCd[i]);
				if (crrCd[i] != null)
					model.setCrrCd(crrCd[i]);
				if (sndRmk[i] != null)
					model.setSndRmk(sndRmk[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (bilSndPtyNm[i] != null)
					model.setBilSndPtyNm(bilSndPtyNm[i]);
				if (vslVoyDirNo[i] != null)
					model.setVslVoyDirNo(vslVoyDirNo[i]);
				if (brthDesc[i] != null)
					model.setBrthDesc(brthDesc[i]);
				if (bilRcvPtyNm[i] != null)
					model.setBilRcvPtyNm(bilRcvPtyNm[i]);
				if (portCd[i] != null)
					model.setPortCd(portCd[i]);
				if (loclUpdDt[i] != null)
					model.setLoclUpdDt(loclUpdDt[i]);
				if (whfDcRt[i] != null)
					model.setWhfDcRt(whfDcRt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgUsaWhfSndVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BkgUsaWhfSndVO[]
	 */
	public BkgUsaWhfSndVO[] getBkgUsaWhfSndVOs(){
		BkgUsaWhfSndVO[] vos = (BkgUsaWhfSndVO[])models.toArray(new BkgUsaWhfSndVO[models.size()]);
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
		this.vslCd = this.vslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.arrDt = this.arrDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ddctAmt = this.ddctAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdVoyNo = this.skdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslNm = this.vslNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ioBndCd = this.ioBndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.depDt = this.depDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdDirCd = this.skdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.crrCd = this.crrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sndRmk = this.sndRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bilSndPtyNm = this.bilSndPtyNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslVoyDirNo = this.vslVoyDirNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.brthDesc = this.brthDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bilRcvPtyNm = this.bilRcvPtyNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.portCd = this.portCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.loclUpdDt = this.loclUpdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.whfDcRt = this.whfDcRt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
