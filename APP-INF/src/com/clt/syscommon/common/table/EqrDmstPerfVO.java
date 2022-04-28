/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : EqrDmstPerfVO.java
*@FileTitle : EqrDmstPerfVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.23
*@LastModifier : 채창호
*@LastVersion : 1.0
* 2009.07.23 채창호 
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
 * @author 채창호
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class EqrDmstPerfVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<EqrDmstPerfVO> models = new ArrayList<EqrDmstPerfVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String fmEccCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String toEccCd = null;
	/* Column Info */
	private String dmstRto = null;
	/* Column Info */
	private String cntrTpszCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String ttlCntrQty = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String eccCntrQty = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String yrwk = null;
	/* Column Info */
	private Object rscount = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public EqrDmstPerfVO() {}

	public EqrDmstPerfVO(String ibflag, String pagerows, String fmEccCd, String toEccCd, String cntrTpszCd, String eccCntrQty, String ttlCntrQty, String dmstRto, String creUsrId, String creDt, String updUsrId, String updDt,String yrwk ) {
		this.updDt = updDt;
		this.creUsrId = creUsrId;
		this.fmEccCd = fmEccCd;
		this.ibflag = ibflag;
		this.toEccCd = toEccCd;
		this.dmstRto = dmstRto;
		this.cntrTpszCd = cntrTpszCd;
		this.creDt = creDt;
		this.ttlCntrQty = ttlCntrQty;
		this.updUsrId = updUsrId;
		this.eccCntrQty = eccCntrQty;
		this.pagerows = pagerows;
		this.yrwk     = yrwk;
		
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("fm_ecc_cd", getFmEccCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("to_ecc_cd", getToEccCd());
		this.hashColumns.put("dmst_rto", getDmstRto());
		this.hashColumns.put("cntr_tpsz_cd", getCntrTpszCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("ttl_cntr_qty", getTtlCntrQty());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("ecc_cntr_qty", getEccCntrQty());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("yrwk", getYrwk());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("fm_ecc_cd", "fmEccCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("to_ecc_cd", "toEccCd");
		this.hashFields.put("dmst_rto", "dmstRto");
		this.hashFields.put("cntr_tpsz_cd", "cntrTpszCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("ttl_cntr_qty", "ttlCntrQty");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("ecc_cntr_qty", "eccCntrQty");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("yrwk", "yrwk");
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
	 * @return creUsrId
	 */
	public String getCreUsrId() {
		return this.creUsrId;
	}
	
	/**
	 * Column Info
	 * @return fmEccCd
	 */
	public String getFmEccCd() {
		return this.fmEccCd;
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
	 * @return toEccCd
	 */
	public String getToEccCd() {
		return this.toEccCd;
	}
	
	/**
	 * Column Info
	 * @return dmstRto
	 */
	public String getDmstRto() {
		return this.dmstRto;
	}
	
	/**
	 * Column Info
	 * @return cntrTpszCd
	 */
	public String getCntrTpszCd() {
		return this.cntrTpszCd;
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
	 * @return ttlCntrQty
	 */
	public String getTtlCntrQty() {
		return this.ttlCntrQty;
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
	 * @return eccCntrQty
	 */
	public String getEccCntrQty() {
		return this.eccCntrQty;
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
	 * @param updDt
	 */
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
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
	 * @param fmEccCd
	 */
	public void setFmEccCd(String fmEccCd) {
		this.fmEccCd = fmEccCd;
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
	 * @param toEccCd
	 */
	public void setToEccCd(String toEccCd) {
		this.toEccCd = toEccCd;
	}
	
	/**
	 * Column Info
	 * @param dmstRto
	 */
	public void setDmstRto(String dmstRto) {
		this.dmstRto = dmstRto;
	}
	
	/**
	 * Column Info
	 * @param cntrTpszCd
	 */
	public void setCntrTpszCd(String cntrTpszCd) {
		this.cntrTpszCd = cntrTpszCd;
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
	 * @param ttlCntrQty
	 */
	public void setTtlCntrQty(String ttlCntrQty) {
		this.ttlCntrQty = ttlCntrQty;
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
	 * @param eccCntrQty
	 */
	public void setEccCntrQty(String eccCntrQty) {
		this.eccCntrQty = eccCntrQty;
	}
	
	/**
	 * Page Number
	 * @param pagerows
	 */
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
	}
	
	/**
	 * @return the yrwk
	 */
	public String getYrwk() {
		return yrwk;
	}

	/**
	 * @param yrwk the yrwk to set
	 */
	public void setYrwk(String yrwk) {
		this.yrwk = yrwk;
	}

	
	/**
	 * @return the rscount
	 */
	public Object getRscount() {
		return rscount;
	}

	/**
	 * @param rscount the rscount to set
	 */
	public void setRscount(Object rscount) {
		this.rscount = rscount;
	}

	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setFmEccCd(JSPUtil.getParameter(request, "fm_ecc_cd", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setToEccCd(JSPUtil.getParameter(request, "to_ecc_cd", ""));
		setDmstRto(JSPUtil.getParameter(request, "dmst_rto", ""));
		setCntrTpszCd(JSPUtil.getParameter(request, "cntr_tpsz_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setTtlCntrQty(JSPUtil.getParameter(request, "ttl_cntr_qty", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setEccCntrQty(JSPUtil.getParameter(request, "ecc_cntr_qty", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return EqrDmstPerfVO[]
	 */
	public EqrDmstPerfVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return EqrDmstPerfVO[]
	 */
	public EqrDmstPerfVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		EqrDmstPerfVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] fmEccCd = (JSPUtil.getParameter(request, prefix	+ "fm_ecc_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] toEccCd = (JSPUtil.getParameter(request, prefix	+ "to_ecc_cd", length));
			String[] dmstRto = (JSPUtil.getParameter(request, prefix	+ "dmst_rto", length));
			String[] cntrTpszCd = (JSPUtil.getParameter(request, prefix	+ "cntr_tpsz_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] ttlCntrQty = (JSPUtil.getParameter(request, prefix	+ "ttl_cntr_qty", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] eccCntrQty = (JSPUtil.getParameter(request, prefix	+ "ecc_cntr_qty", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			
			for (int i = 0; i < length; i++) {
				model = new EqrDmstPerfVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (fmEccCd[i] != null)
					model.setFmEccCd(fmEccCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (toEccCd[i] != null)
					model.setToEccCd(toEccCd[i]);
				if (dmstRto[i] != null)
					model.setDmstRto(dmstRto[i]);
				if (cntrTpszCd[i] != null)
					model.setCntrTpszCd(cntrTpszCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (ttlCntrQty[i] != null)
					model.setTtlCntrQty(ttlCntrQty[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (eccCntrQty[i] != null)
					model.setEccCntrQty(eccCntrQty[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getEqrDmstPerfVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return EqrDmstPerfVO[]
	 */
	public EqrDmstPerfVO[] getEqrDmstPerfVOs(){
		EqrDmstPerfVO[] vos = (EqrDmstPerfVO[])models.toArray(new EqrDmstPerfVO[models.size()]);
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
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fmEccCd = this.fmEccCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.toEccCd = this.toEccCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dmstRto = this.dmstRto .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrTpszCd = this.cntrTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ttlCntrQty = this.ttlCntrQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eccCntrQty = this.eccCntrQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.yrwk = this.yrwk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
