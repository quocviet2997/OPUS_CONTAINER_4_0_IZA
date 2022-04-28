/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : EqrTsTmlVO.java
*@FileTitle : EqrTsTmlVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.01
*@LastModifier : 
*@LastVersion : 1.0
* 2009.07.01  
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

public class EqrTsTmlVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<EqrTsTmlVO> models = new ArrayList<EqrTsTmlVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String toSlanCd = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String fmYdCd = null;
	/* Column Info */
	private String eccCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String fmSlanCd = null;
	/* Column Info */
	private String ts20ftUcAmt = null;
	/* Column Info */
	private String laneDirCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String toYdCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String ts45ftUcAmt = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String ts40ftUcAmt = null;
	/* Column Info */
	private String updUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public EqrTsTmlVO() {}

	public EqrTsTmlVO(String ibflag, String pagerows, String eccCd, String fmSlanCd, String toSlanCd, String laneDirCd, String fmYdCd, String toYdCd, String ts20ftUcAmt, String ts40ftUcAmt, String ts45ftUcAmt, String deltFlg, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.toSlanCd = toSlanCd;
		this.deltFlg = deltFlg;
		this.fmYdCd = fmYdCd;
		this.eccCd = eccCd;
		this.creDt = creDt;
		this.fmSlanCd = fmSlanCd;
		this.ts20ftUcAmt = ts20ftUcAmt;
		this.laneDirCd = laneDirCd;
		this.pagerows = pagerows;
		this.toYdCd = toYdCd;
		this.ibflag = ibflag;
		this.ts45ftUcAmt = ts45ftUcAmt;
		this.creUsrId = creUsrId;
		this.ts40ftUcAmt = ts40ftUcAmt;
		this.updUsrId = updUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("to_slan_cd", getToSlanCd());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("fm_yd_cd", getFmYdCd());
		this.hashColumns.put("ecc_cd", getEccCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("fm_slan_cd", getFmSlanCd());
		this.hashColumns.put("ts_20ft_uc_amt", getTs20ftUcAmt());
		this.hashColumns.put("lane_dir_cd", getLaneDirCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("to_yd_cd", getToYdCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("ts_45ft_uc_amt", getTs45ftUcAmt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ts_40ft_uc_amt", getTs40ftUcAmt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("to_slan_cd", "toSlanCd");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("fm_yd_cd", "fmYdCd");
		this.hashFields.put("ecc_cd", "eccCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("fm_slan_cd", "fmSlanCd");
		this.hashFields.put("ts_20ft_uc_amt", "ts20ftUcAmt");
		this.hashFields.put("lane_dir_cd", "laneDirCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("to_yd_cd", "toYdCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("ts_45ft_uc_amt", "ts45ftUcAmt");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ts_40ft_uc_amt", "ts40ftUcAmt");
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
	 * @return toSlanCd
	 */
	public String getToSlanCd() {
		return this.toSlanCd;
	}
	
	/**
	 * Column Info
	 * @return deltFlg
	 */
	public String getDeltFlg() {
		return this.deltFlg;
	}
	
	/**
	 * Column Info
	 * @return fmYdCd
	 */
	public String getFmYdCd() {
		return this.fmYdCd;
	}
	
	/**
	 * Column Info
	 * @return eccCd
	 */
	public String getEccCd() {
		return this.eccCd;
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
	 * @return fmSlanCd
	 */
	public String getFmSlanCd() {
		return this.fmSlanCd;
	}
	
	/**
	 * Column Info
	 * @return ts20ftUcAmt
	 */
	public String getTs20ftUcAmt() {
		return this.ts20ftUcAmt;
	}
	
	/**
	 * Column Info
	 * @return laneDirCd
	 */
	public String getLaneDirCd() {
		return this.laneDirCd;
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
	 * @return toYdCd
	 */
	public String getToYdCd() {
		return this.toYdCd;
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
	 * @return ts45ftUcAmt
	 */
	public String getTs45ftUcAmt() {
		return this.ts45ftUcAmt;
	}
	
	/**
	 * Column Info
	 * @return creUsrId
	 */
	public String getCreUsrId() {
		return this.creUsrId;
	}
	
	/**
	 * Column Info
	 * @return ts40ftUcAmt
	 */
	public String getTs40ftUcAmt() {
		return this.ts40ftUcAmt;
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
	 * @param toSlanCd
	 */
	public void setToSlanCd(String toSlanCd) {
		this.toSlanCd = toSlanCd;
	}
	
	/**
	 * Column Info
	 * @param deltFlg
	 */
	public void setDeltFlg(String deltFlg) {
		this.deltFlg = deltFlg;
	}
	
	/**
	 * Column Info
	 * @param fmYdCd
	 */
	public void setFmYdCd(String fmYdCd) {
		this.fmYdCd = fmYdCd;
	}
	
	/**
	 * Column Info
	 * @param eccCd
	 */
	public void setEccCd(String eccCd) {
		this.eccCd = eccCd;
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
	 * @param fmSlanCd
	 */
	public void setFmSlanCd(String fmSlanCd) {
		this.fmSlanCd = fmSlanCd;
	}
	
	/**
	 * Column Info
	 * @param ts20ftUcAmt
	 */
	public void setTs20ftUcAmt(String ts20ftUcAmt) {
		this.ts20ftUcAmt = ts20ftUcAmt;
	}
	
	/**
	 * Column Info
	 * @param laneDirCd
	 */
	public void setLaneDirCd(String laneDirCd) {
		this.laneDirCd = laneDirCd;
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
	 * @param toYdCd
	 */
	public void setToYdCd(String toYdCd) {
		this.toYdCd = toYdCd;
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
	 * @param ts45ftUcAmt
	 */
	public void setTs45ftUcAmt(String ts45ftUcAmt) {
		this.ts45ftUcAmt = ts45ftUcAmt;
	}
	
	/**
	 * Column Info
	 * @param creUsrId
	 */
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
	}
	
	/**
	 * Column Info
	 * @param ts40ftUcAmt
	 */
	public void setTs40ftUcAmt(String ts40ftUcAmt) {
		this.ts40ftUcAmt = ts40ftUcAmt;
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
		setToSlanCd(JSPUtil.getParameter(request, "to_slan_cd", ""));
		setDeltFlg(JSPUtil.getParameter(request, "delt_flg", ""));
		setFmYdCd(JSPUtil.getParameter(request, "fm_yd_cd", ""));
		setEccCd(JSPUtil.getParameter(request, "ecc_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setFmSlanCd(JSPUtil.getParameter(request, "fm_slan_cd", ""));
		setTs20ftUcAmt(JSPUtil.getParameter(request, "ts_20ft_uc_amt", ""));
		setLaneDirCd(JSPUtil.getParameter(request, "lane_dir_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setToYdCd(JSPUtil.getParameter(request, "to_yd_cd", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setTs45ftUcAmt(JSPUtil.getParameter(request, "ts_45ft_uc_amt", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setTs40ftUcAmt(JSPUtil.getParameter(request, "ts_40ft_uc_amt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return EqrTsTmlVO[]
	 */
	public EqrTsTmlVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return EqrTsTmlVO[]
	 */
	public EqrTsTmlVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		EqrTsTmlVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] toSlanCd = (JSPUtil.getParameter(request, prefix	+ "to_slan_cd", length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg", length));
			String[] fmYdCd = (JSPUtil.getParameter(request, prefix	+ "fm_yd_cd", length));
			String[] eccCd = (JSPUtil.getParameter(request, prefix	+ "ecc_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] fmSlanCd = (JSPUtil.getParameter(request, prefix	+ "fm_slan_cd", length));
			String[] ts20ftUcAmt = (JSPUtil.getParameter(request, prefix	+ "ts_20ft_uc_amt", length));
			String[] laneDirCd = (JSPUtil.getParameter(request, prefix	+ "lane_dir_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] toYdCd = (JSPUtil.getParameter(request, prefix	+ "to_yd_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] ts45ftUcAmt = (JSPUtil.getParameter(request, prefix	+ "ts_45ft_uc_amt", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ts40ftUcAmt = (JSPUtil.getParameter(request, prefix	+ "ts_40ft_uc_amt", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			
			for (int i = 0; i < length; i++) {
				model = new EqrTsTmlVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (toSlanCd[i] != null)
					model.setToSlanCd(toSlanCd[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (fmYdCd[i] != null)
					model.setFmYdCd(fmYdCd[i]);
				if (eccCd[i] != null)
					model.setEccCd(eccCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (fmSlanCd[i] != null)
					model.setFmSlanCd(fmSlanCd[i]);
				if (ts20ftUcAmt[i] != null)
					model.setTs20ftUcAmt(ts20ftUcAmt[i]);
				if (laneDirCd[i] != null)
					model.setLaneDirCd(laneDirCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (toYdCd[i] != null)
					model.setToYdCd(toYdCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (ts45ftUcAmt[i] != null)
					model.setTs45ftUcAmt(ts45ftUcAmt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ts40ftUcAmt[i] != null)
					model.setTs40ftUcAmt(ts40ftUcAmt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getEqrTsTmlVOs();
	}
	
	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. (Sheet2 전용)
	 * @param request
	 * @param prefix
	 * @return EqrTsTmlVO[]
	 */
	public EqrTsTmlVO[] fromRequestGrid1(HttpServletRequest request, String prefix) {
		EqrTsTmlVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag1");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag1").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] toSlanCd = (JSPUtil.getParameter(request, prefix	+ "to_slan_cd", length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg", length));
			String[] fmYdCd = (JSPUtil.getParameter(request, prefix	+ "fm_yd_cd", length));
			String[] eccCd1 = (JSPUtil.getParameter(request, prefix	+ "ecc_cd1", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] fmSlanCd = (JSPUtil.getParameter(request, prefix	+ "fm_slan_cd", length));
			String[] ts20ftUcAmt = (JSPUtil.getParameter(request, prefix	+ "ts_20ft_uc_amt", length));
			String[] laneDirCd = (JSPUtil.getParameter(request, prefix	+ "lane_dir_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] toYdCd = (JSPUtil.getParameter(request, prefix	+ "to_yd_cd", length));
			String[] ibflag1 = (JSPUtil.getParameter(request, prefix	+ "ibflag1", length));
			String[] ts45ftUcAmt = (JSPUtil.getParameter(request, prefix	+ "ts_45ft_uc_amt", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ts40ftUcAmt = (JSPUtil.getParameter(request, prefix	+ "ts_40ft_uc_amt", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			
			for (int i = 0; i < length; i++) {
				model = new EqrTsTmlVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (toSlanCd[i] != null)
					model.setToSlanCd(toSlanCd[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (fmYdCd[i] != null)
					model.setFmYdCd(fmYdCd[i]);
				if (eccCd1[i] != null)
					model.setEccCd(eccCd1[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (fmSlanCd[i] != null)
					model.setFmSlanCd(fmSlanCd[i]);
				if (ts20ftUcAmt[i] != null)
					model.setTs20ftUcAmt(ts20ftUcAmt[i]);
				if (laneDirCd[i] != null)
					model.setLaneDirCd(laneDirCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (toYdCd[i] != null)
					model.setToYdCd(toYdCd[i]);
				if (ibflag1[i] != null)
					model.setIbflag(ibflag1[i]);
				if (ts45ftUcAmt[i] != null)
					model.setTs45ftUcAmt(ts45ftUcAmt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ts40ftUcAmt[i] != null)
					model.setTs40ftUcAmt(ts40ftUcAmt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getEqrTsTmlVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return EqrTsTmlVO[]
	 */
	public EqrTsTmlVO[] getEqrTsTmlVOs(){
		EqrTsTmlVO[] vos = (EqrTsTmlVO[])models.toArray(new EqrTsTmlVO[models.size()]);
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
		this.toSlanCd = this.toSlanCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fmYdCd = this.fmYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eccCd = this.eccCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fmSlanCd = this.fmSlanCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ts20ftUcAmt = this.ts20ftUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.laneDirCd = this.laneDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.toYdCd = this.toYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ts45ftUcAmt = this.ts45ftUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ts40ftUcAmt = this.ts40ftUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
