/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : EqrScnrBsaPortVO.java
*@FileTitle : EqrScnrBsaPortVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.08.11
*@LastModifier : 정은호
*@LastVersion : 1.0
* 2009.08.11 정은호 
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
 * @author 정은호
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class EqrScnrBsaPortVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<EqrScnrBsaPortVO> models = new ArrayList<EqrScnrBsaPortVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String vslPortAvgWgt = null;
	/* Column Info */
	private String vslCd = null;
	/* Column Info */
	private String coCd = null;
	/* Column Info */
	private String scnrId = null;
	/* Column Info */
	private String vslPortSpc = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String skdVoyNo = null;
	/* Column Info */
	private String trdCd = null;
	/* Column Info */
	private String vslPortCd = null;
	/* Column Info */
	private String skdDirCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String fmYrwk = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String toYrwk = null;
	/* Column Info */
	private String vslPortCallSeq = null;
	/* Column Info */
	private String updUsrId = null;
	/* input param */
	private String vslPortCd1 = null;
	/* input param */
	private String vslPortSpc1 = null;
	/* input param */
	private String vslPortAvgWgt1 = null;
	/* input param */
	private String checked = null;
	

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public EqrScnrBsaPortVO() {}

	public EqrScnrBsaPortVO(String ibflag, String pagerows, String scnrId, String coCd, String fmYrwk, String toYrwk, String vslCd, String skdVoyNo, String skdDirCd, String trdCd, String vslPortCallSeq, String vslPortCd, String vslPortSpc, String vslPortAvgWgt, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.vslPortAvgWgt = vslPortAvgWgt;
		this.vslCd = vslCd;
		this.coCd = coCd;
		this.scnrId = scnrId;
		this.vslPortSpc = vslPortSpc;
		this.creDt = creDt;
		this.skdVoyNo = skdVoyNo;
		this.trdCd = trdCd;
		this.vslPortCd = vslPortCd;
		this.skdDirCd = skdDirCd;
		this.pagerows = pagerows;
		this.fmYrwk = fmYrwk;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.toYrwk = toYrwk;
		this.vslPortCallSeq = vslPortCallSeq;
		this.updUsrId = updUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("vsl_port_avg_wgt", getVslPortAvgWgt());
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("co_cd", getCoCd());
		this.hashColumns.put("scnr_id", getScnrId());
		this.hashColumns.put("vsl_port_spc", getVslPortSpc());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("skd_voy_no", getSkdVoyNo());
		this.hashColumns.put("trd_cd", getTrdCd());
		this.hashColumns.put("vsl_port_cd", getVslPortCd());
		this.hashColumns.put("skd_dir_cd", getSkdDirCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("fm_yrwk", getFmYrwk());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("to_yrwk", getToYrwk());
		this.hashColumns.put("vsl_port_call_seq", getVslPortCallSeq());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("vsl_port_cd1", getVslPortCd1());
		this.hashColumns.put("vsl_port_spc1", getVslPortSpc1());
		this.hashColumns.put("vsl_port_avg_wgt1", getVslPortAvgWgt1());
		this.hashColumns.put("checked", getChecked());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("vsl_port_avg_wgt", "vslPortAvgWgt");
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("co_cd", "coCd");
		this.hashFields.put("scnr_id", "scnrId");
		this.hashFields.put("vsl_port_spc", "vslPortSpc");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("skd_voy_no", "skdVoyNo");
		this.hashFields.put("trd_cd", "trdCd");
		this.hashFields.put("vsl_port_cd", "vslPortCd");
		this.hashFields.put("skd_dir_cd", "skdDirCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("fm_yrwk", "fmYrwk");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("to_yrwk", "toYrwk");
		this.hashFields.put("vsl_port_call_seq", "vslPortCallSeq");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("vsl_port_cd1", "vslPortCd1");
		this.hashFields.put("vsl_port_spc1", "vslPortSpc1");
		this.hashFields.put("checked", "checked");
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
	 * @return vslPortAvgWgt
	 */
	public String getVslPortAvgWgt() {
		return this.vslPortAvgWgt;
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
	 * @return coCd
	 */
	public String getCoCd() {
		return this.coCd;
	}
	
	/**
	 * Column Info
	 * @return scnrId
	 */
	public String getScnrId() {
		return this.scnrId;
	}
	
	/**
	 * Column Info
	 * @return vslPortSpc
	 */
	public String getVslPortSpc() {
		return this.vslPortSpc;
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
	 * @return skdVoyNo
	 */
	public String getSkdVoyNo() {
		return this.skdVoyNo;
	}
	
	/**
	 * Column Info
	 * @return trdCd
	 */
	public String getTrdCd() {
		return this.trdCd;
	}
	
	/**
	 * Column Info
	 * @return vslPortCd
	 */
	public String getVslPortCd() {
		return this.vslPortCd;
	}
	
	/**
	 * Column Info
	 * @return skdDirCd
	 */
	public String getSkdDirCd() {
		return this.skdDirCd;
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
	 * @return fmYrwk
	 */
	public String getFmYrwk() {
		return this.fmYrwk;
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
	 * @return toYrwk
	 */
	public String getToYrwk() {
		return this.toYrwk;
	}
	
	/**
	 * Column Info
	 * @return vslPortCallSeq
	 */
	public String getVslPortCallSeq() {
		return this.vslPortCallSeq;
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
	 * @param vslPortAvgWgt
	 */
	public void setVslPortAvgWgt(String vslPortAvgWgt) {
		this.vslPortAvgWgt = vslPortAvgWgt;
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
	 * @param coCd
	 */
	public void setCoCd(String coCd) {
		this.coCd = coCd;
	}
	
	/**
	 * Column Info
	 * @param scnrId
	 */
	public void setScnrId(String scnrId) {
		this.scnrId = scnrId;
	}
	
	/**
	 * Column Info
	 * @param vslPortSpc
	 */
	public void setVslPortSpc(String vslPortSpc) {
		this.vslPortSpc = vslPortSpc;
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
	 * @param skdVoyNo
	 */
	public void setSkdVoyNo(String skdVoyNo) {
		this.skdVoyNo = skdVoyNo;
	}
	
	/**
	 * Column Info
	 * @param trdCd
	 */
	public void setTrdCd(String trdCd) {
		this.trdCd = trdCd;
	}
	
	/**
	 * Column Info
	 * @param vslPortCd
	 */
	public void setVslPortCd(String vslPortCd) {
		this.vslPortCd = vslPortCd;
	}
	
	/**
	 * Column Info
	 * @param skdDirCd
	 */
	public void setSkdDirCd(String skdDirCd) {
		this.skdDirCd = skdDirCd;
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
	 * @param fmYrwk
	 */
	public void setFmYrwk(String fmYrwk) {
		this.fmYrwk = fmYrwk;
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
	 * @param toYrwk
	 */
	public void setToYrwk(String toYrwk) {
		this.toYrwk = toYrwk;
	}
	
	/**
	 * Column Info
	 * @param vslPortCallSeq
	 */
	public void setVslPortCallSeq(String vslPortCallSeq) {
		this.vslPortCallSeq = vslPortCallSeq;
	}
	
	/**
	 * Column Info
	 * @param updUsrId
	 */
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
	}
	
	public String getVslPortCd1() {
		return vslPortCd1;
	}

	public void setVslPortCd1(String vslPortCd1) {
		this.vslPortCd1 = vslPortCd1;
	}

	public String getVslPortSpc1() {
		return vslPortSpc1;
	}

	public void setVslPortSpc1(String vslPortSpc1) {
		this.vslPortSpc1 = vslPortSpc1;
	}

	public String getVslPortAvgWgt1() {
		return vslPortAvgWgt1;
	}

	public void setVslPortAvgWgt1(String vslPortAvgWgt1) {
		this.vslPortAvgWgt1 = vslPortAvgWgt1;
	}

	public String getChecked() {
		return checked;
	}

	public void setChecked(String checked) {
		this.checked = checked;
	}

	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setVslPortAvgWgt(JSPUtil.getParameter(request, "vsl_port_avg_wgt", ""));
		setVslCd(JSPUtil.getParameter(request, "vsl_cd", ""));
		setCoCd(JSPUtil.getParameter(request, "company_code", ""));
		setScnrId(JSPUtil.getParameter(request, "scnr_id", ""));
		setVslPortSpc(JSPUtil.getParameter(request, "vsl_port_spc", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setSkdVoyNo(JSPUtil.getParameter(request, "skd_voy_no", ""));
		setTrdCd(JSPUtil.getParameter(request, "trd_cd", ""));
		setVslPortCd(JSPUtil.getParameter(request, "vsl_port_cd", ""));
		setSkdDirCd(JSPUtil.getParameter(request, "skd_dir_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setFmYrwk(JSPUtil.getParameter(request, "fm_yrwk", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setToYrwk(JSPUtil.getParameter(request, "to_yrwk", ""));
		setVslPortCallSeq(JSPUtil.getParameter(request, "vsl_port_call_seq", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setVslPortCd1(JSPUtil.getParameter(request, "vessel_port_code1", ""));
		setVslPortSpc1(JSPUtil.getParameter(request, "vessel_port_space1", ""));
		setVslPortAvgWgt1(JSPUtil.getParameter(request, "vessel_port_average_weight1", ""));
		setChecked(JSPUtil.getParameter(request, "checked", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return EqrScnrBsaPortVO[]
	 */
	public EqrScnrBsaPortVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return EqrScnrBsaPortVO[]
	 */
	public EqrScnrBsaPortVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		EqrScnrBsaPortVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] vslPortAvgWgt = (JSPUtil.getParameter(request, prefix	+ "vessel_port_average_weight", length));
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd", length));
			String[] coCd = (JSPUtil.getParameter(request, prefix	+ "company_code", length));
			String[] scnrId = (JSPUtil.getParameter(request, prefix	+ "scnr_id", length));
			String[] vslPortSpc = (JSPUtil.getParameter(request, prefix	+ "vessel_port_space", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] skdVoyNo = (JSPUtil.getParameter(request, prefix	+ "skd_voy_no", length));
			String[] trdCd = (JSPUtil.getParameter(request, prefix	+ "trade_code", length));
			String[] vslPortCd = (JSPUtil.getParameter(request, prefix	+ "vessel_port_code", length));
			String[] skdDirCd = (JSPUtil.getParameter(request, prefix	+ "skd_dir_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] fmYrwk = (JSPUtil.getParameter(request, prefix	+ "from_year_week", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] toYrwk = (JSPUtil.getParameter(request, prefix	+ "to_year_week", length));
			String[] vslPortCallSeq = (JSPUtil.getParameter(request, prefix	+ "vessel_port_call_sequence", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] vslPortCd1 = (JSPUtil.getParameter(request, prefix	+ "vessel_port_code1", length));
			String[] vslPortSpc1 = (JSPUtil.getParameter(request, prefix	+ "vessel_port_space1", length));
			String[] vslPortAvgWgt1 = (JSPUtil.getParameter(request, prefix	+ "vessel_port_average_weight1", length));
			String[] checked = (JSPUtil.getParameter(request, prefix	+ "checked", length));
			
			for (int i = 0; i < length; i++) {
				model = new EqrScnrBsaPortVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (vslPortAvgWgt[i] != null)
					model.setVslPortAvgWgt(vslPortAvgWgt[i]);
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (coCd[i] != null)
					model.setCoCd(coCd[i]);
				if (scnrId[i] != null)
					model.setScnrId(scnrId[i]);
				if (vslPortSpc[i] != null)
					model.setVslPortSpc(vslPortSpc[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (skdVoyNo[i] != null)
					model.setSkdVoyNo(skdVoyNo[i]);
				if (trdCd[i] != null)
					model.setTrdCd(trdCd[i]);
				if (vslPortCd[i] != null)
					model.setVslPortCd(vslPortCd[i]);
				if (skdDirCd[i] != null)
					model.setSkdDirCd(skdDirCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (fmYrwk[i] != null)
					model.setFmYrwk(fmYrwk[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (toYrwk[i] != null)
					model.setToYrwk(toYrwk[i]);
				if (vslPortCallSeq[i] != null)
					model.setVslPortCallSeq(vslPortCallSeq[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (vslPortCd1[i] != null)
					model.setVslPortCd1(vslPortCd1[i]);
				if (vslPortSpc1[i] != null)
					model.setVslPortSpc1(vslPortSpc1[i]);
				if (vslPortAvgWgt1[i] != null)
					model.setVslPortAvgWgt1(vslPortAvgWgt1[i]);
				if (checked[i] != null)
					model.setChecked(checked[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getEqrScnrBsaPortVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return EqrScnrBsaPortVO[]
	 */
	public EqrScnrBsaPortVO[] getEqrScnrBsaPortVOs(){
		EqrScnrBsaPortVO[] vos = (EqrScnrBsaPortVO[])models.toArray(new EqrScnrBsaPortVO[models.size()]);
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
		this.vslPortAvgWgt = this.vslPortAvgWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslCd = this.vslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.coCd = this.coCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.scnrId = this.scnrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslPortSpc = this.vslPortSpc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdVoyNo = this.skdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trdCd = this.trdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslPortCd = this.vslPortCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdDirCd = this.skdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fmYrwk = this.fmYrwk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.toYrwk = this.toYrwk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslPortCallSeq = this.vslPortCallSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslPortCd1 = this.vslPortCd1 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslPortSpc1 = this.vslPortSpc1 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslPortAvgWgt1 = this.vslPortAvgWgt1 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.checked = this.checked .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
