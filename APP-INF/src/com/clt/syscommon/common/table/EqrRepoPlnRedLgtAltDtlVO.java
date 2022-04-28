/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : EqrRepoPlnRedLgtAltDtlVO.java
*@FileTitle : EqrRepoPlnRedLgtAltDtlVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.17
*@LastModifier : 
*@LastVersion : 1.0
* 2009.07.17  
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

public class EqrRepoPlnRedLgtAltDtlVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<EqrRepoPlnRedLgtAltDtlVO> models = new ArrayList<EqrRepoPlnRedLgtAltDtlVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String adhrVolQty = null;
	/* Column Info */
	private String adhrRto = null;
	/* Column Info */
	private String cntrTpszCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String adhrItmCd = null;
	/* Column Info */
	private String adhrBseCd = null;
	/* Column Info */
	private String rccCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Page Number */
	private String pagerows = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public EqrRepoPlnRedLgtAltDtlVO() {}

	public EqrRepoPlnRedLgtAltDtlVO(String ibflag, String pagerows, String rccCd, String adhrItmCd, String cntrTpszCd, String adhrBseCd, String adhrRto, String adhrVolQty, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.adhrVolQty = adhrVolQty;
		this.adhrRto = adhrRto;
		this.cntrTpszCd = cntrTpszCd;
		this.creDt = creDt;
		this.adhrItmCd = adhrItmCd;
		this.adhrBseCd = adhrBseCd;
		this.rccCd = rccCd;
		this.updUsrId = updUsrId;
		this.pagerows = pagerows;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("adhr_vol_qty", getAdhrVolQty());
		this.hashColumns.put("adhr_rto", getAdhrRto());
		this.hashColumns.put("cntr_tpsz_cd", getCntrTpszCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("adhr_itm_cd", getAdhrItmCd());
		this.hashColumns.put("adhr_bse_cd", getAdhrBseCd());
		this.hashColumns.put("rcc_cd", getRccCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("pagerows", getPagerows());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("adhr_vol_qty", "adhrVolQty");
		this.hashFields.put("adhr_rto", "adhrRto");
		this.hashFields.put("cntr_tpsz_cd", "cntrTpszCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("adhr_itm_cd", "adhrItmCd");
		this.hashFields.put("adhr_bse_cd", "adhrBseCd");
		this.hashFields.put("rcc_cd", "rccCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("pagerows", "pagerows");
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
	 * VO Data Value( C:Creation, U:Update, D:Delete )
	 * @return ibflag
	 */
	public String getIbflag() {
		return this.ibflag;
	}
	
	/**
	 * Column Info
	 * @return adhrVolQty
	 */
	public String getAdhrVolQty() {
		return this.adhrVolQty;
	}
	
	/**
	 * Column Info
	 * @return adhrRto
	 */
	public String getAdhrRto() {
		return this.adhrRto;
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
	 * @return adhrItmCd
	 */
	public String getAdhrItmCd() {
		return this.adhrItmCd;
	}
	
	/**
	 * Column Info
	 * @return adhrBseCd
	 */
	public String getAdhrBseCd() {
		return this.adhrBseCd;
	}
	
	/**
	 * Column Info
	 * @return rccCd
	 */
	public String getRccCd() {
		return this.rccCd;
	}
	
	/**
	 * Column Info
	 * @return updUsrId
	 */
	public String getUpdUsrId() {
		return this.updUsrId;
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
	 * VO Data Value( C:Creation, U:Update, D:Delete )
	 * @param ibflag
	 */
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
	}
	
	/**
	 * Column Info
	 * @param adhrVolQty
	 */
	public void setAdhrVolQty(String adhrVolQty) {
		this.adhrVolQty = adhrVolQty;
	}
	
	/**
	 * Column Info
	 * @param adhrRto
	 */
	public void setAdhrRto(String adhrRto) {
		this.adhrRto = adhrRto;
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
	 * @param adhrItmCd
	 */
	public void setAdhrItmCd(String adhrItmCd) {
		this.adhrItmCd = adhrItmCd;
	}
	
	/**
	 * Column Info
	 * @param adhrBseCd
	 */
	public void setAdhrBseCd(String adhrBseCd) {
		this.adhrBseCd = adhrBseCd;
	}
	
	/**
	 * Column Info
	 * @param rccCd
	 */
	public void setRccCd(String rccCd) {
		this.rccCd = rccCd;
	}
	
	/**
	 * Column Info
	 * @param updUsrId
	 */
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
	}
	
	/**
	 * Page Number
	 * @param pagerows
	 */
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setAdhrVolQty(JSPUtil.getParameter(request, "adhr_vol_qty", ""));
		setAdhrRto(JSPUtil.getParameter(request, "adhr_rto", ""));
		setCntrTpszCd(JSPUtil.getParameter(request, "cntr_tpsz_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setAdhrItmCd(JSPUtil.getParameter(request, "adhr_itm_cd", ""));
		setAdhrBseCd(JSPUtil.getParameter(request, "adhr_bse_cd", ""));
		setRccCd(JSPUtil.getParameter(request, "rcc_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return EqrRepoPlnRedLgtAltDtlVO[]
	 */
	public EqrRepoPlnRedLgtAltDtlVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return EqrRepoPlnRedLgtAltDtlVO[]
	 */
	public EqrRepoPlnRedLgtAltDtlVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		EqrRepoPlnRedLgtAltDtlVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] adhrVolQty = (JSPUtil.getParameter(request, prefix	+ "adhr_vol_qty", length));
			String[] adhrRto = (JSPUtil.getParameter(request, prefix	+ "adhr_rto", length));
			String[] cntrTpszCd = (JSPUtil.getParameter(request, prefix	+ "cntr_tpsz_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] adhrItmCd = (JSPUtil.getParameter(request, prefix	+ "adhr_itm_cd", length));
			String[] adhrBseCd = (JSPUtil.getParameter(request, prefix	+ "adhr_bse_cd", length));
			String[] rccCd = (JSPUtil.getParameter(request, prefix	+ "rcc_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			
			for (int i = 0; i < length; i++) {
				model = new EqrRepoPlnRedLgtAltDtlVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (adhrVolQty[i] != null)
					model.setAdhrVolQty(adhrVolQty[i]);
				if (adhrRto[i] != null)
					model.setAdhrRto(adhrRto[i]);
				if (cntrTpszCd[i] != null)
					model.setCntrTpszCd(cntrTpszCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (adhrItmCd[i] != null)
					model.setAdhrItmCd(adhrItmCd[i]);
				if (adhrBseCd[i] != null)
					model.setAdhrBseCd(adhrBseCd[i]);
				if (rccCd[i] != null)
					model.setRccCd(rccCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getEqrRepoPlnRedLgtAltDtlVOs();
	}
	
	/**
	 * EES_EQR_0044 Red Light Alert 기준 조회/수정---컨테이너 이송 계획 화면에서 사용
	 * 
	 * @param request
	 * @param typesize
	 * @return
	 */
	public EqrRepoPlnRedLgtAltDtlVO[] fromRequestGrid1(HttpServletRequest request, String typesize) {
		EqrRepoPlnRedLgtAltDtlVO model = null;
		String tpsz = JSPUtil.getParameter(request, "tpsz", "");
		String[] prefix = tpsz.split(",");
			
		try {
			int length = request.getParameterValues("ibflag1").length;
			
			for(int k=0; k<prefix.length; k++) {
				String[] ibflag1      =  (JSPUtil.getParameter(request, "ibflag1", length));
				String[] rcc_cd1      =  (JSPUtil.getParameter(request, "rcc_cd1", length));
				String[] adhr_itm_cd  =  (JSPUtil.getParameter(request, "adhr_itm_cd", length));
				String   cntr_tpsz_cd =  prefix[k].trim().toString();
				String[] adhr_bse_cd  =  (JSPUtil.getParameter(request, "adhr_bse_cd", length));
				String[] adhr_rto     =  (JSPUtil.getParameter(request, prefix[k].toLowerCase() + "adhr_rto", length));
				String[] adhr_vol_qty =  (JSPUtil.getParameter(request, prefix[k].toLowerCase() + "adhr_vol_qty", length));
				for (int i = 0; i < length; i++) {
					model = new EqrRepoPlnRedLgtAltDtlVO();
					model.setIbflag      		  ( ibflag1      	[i]);
					model.setRccCd     		  ( rcc_cd1     	[i]);
					model.setAdhrItmCd 		  ( adhr_itm_cd 	[i]);
					model.setCntrTpszCd		  ( cntr_tpsz_cd	);
					model.setAdhrBseCd 		  ( adhr_bse_cd 	[i]);
					model.setAdhrRto    		  ( adhr_rto    	[i]);
					model.setAdhrVolQty		  ( adhr_vol_qty	[i]);
					models.add(model);
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return getEqrRepoPlnRedLgtAltDtlVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return EqrRepoPlnRedLgtAltDtlVO[]
	 */
	public EqrRepoPlnRedLgtAltDtlVO[] getEqrRepoPlnRedLgtAltDtlVOs(){
		EqrRepoPlnRedLgtAltDtlVO[] vos = (EqrRepoPlnRedLgtAltDtlVO[])models.toArray(new EqrRepoPlnRedLgtAltDtlVO[models.size()]);
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
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.adhrVolQty = this.adhrVolQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.adhrRto = this.adhrRto .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrTpszCd = this.cntrTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.adhrItmCd = this.adhrItmCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.adhrBseCd = this.adhrBseCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rccCd = this.rccCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
