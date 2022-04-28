/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : EqrIbBkgFcastVO.java
*@FileTitle : EqrIbBkgFcastVO
*Open Issues :
*Change history :
* No.	Ver.		Modifier           		modifier date    explanation
* 1      	1.0      	Lee Byoung Hun	2009.08.11		1.0 최초 생성
*
*@LastModifyDate : 2009.08.11
*@LastModifier : Lee Byoung Hun
*@LastVersion : 1.0
* 2009.08.11  
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

public class EqrIbBkgFcastVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<EqrIbBkgFcastVO> models = new ArrayList<EqrIbBkgFcastVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String coCd = null;
	/* Column Info */
	private String scnrId = null;
	/* Column Info */
	private String toEccCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String fcastDt = null;
	/* Page Number */
	private String pagerows = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String fcastYrwk = null;
	/* Column Info */
	private String fmEccCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String ifcstDatTpCd = null;
	/* Column Info */
	private String cntrTpszCd = null;
	/* Column Info */
	private String cntrVolQty = null;
	/* Column Info */
	private String updUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public EqrIbBkgFcastVO() {}

	public EqrIbBkgFcastVO(String ibflag, String pagerows, String scnrId, String fcastYrwk, String coCd, String fmEccCd, String toEccCd, String ifcstDatTpCd, String cntrTpszCd, String fcastDt, String cntrVolQty, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.coCd = coCd;
		this.scnrId = scnrId;
		this.toEccCd = toEccCd;
		this.creDt = creDt;
		this.fcastDt = fcastDt;
		this.pagerows = pagerows;
		this.ibflag = ibflag;
		this.fcastYrwk = fcastYrwk;
		this.fmEccCd = fmEccCd;
		this.creUsrId = creUsrId;
		this.ifcstDatTpCd = ifcstDatTpCd;
		this.cntrTpszCd = cntrTpszCd;
		this.cntrVolQty = cntrVolQty;
		this.updUsrId = updUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("co_cd", getCoCd());
		this.hashColumns.put("scnr_id", getScnrId());
		this.hashColumns.put("to_ecc_cd", getToEccCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("fcast_dt", getFcastDt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("fcast_yrwk", getFcastYrwk());
		this.hashColumns.put("fm_ecc_cd", getFmEccCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ifcst_dat_tp_cd", getIfcstDatTpCd());
		this.hashColumns.put("cntr_tpsz_cd", getCntrTpszCd());
		this.hashColumns.put("cntr_vol_qty", getCntrVolQty());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("co_cd", "coCd");
		this.hashFields.put("scnr_id", "scnrId");
		this.hashFields.put("to_ecc_cd", "toEccCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("fcast_dt", "fcastDt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("fcast_yrwk", "fcastYrwk");
		this.hashFields.put("fm_ecc_cd", "fmEccCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ifcst_dat_tp_cd", "ifcstDatTpCd");
		this.hashFields.put("cntr_tpsz_cd", "cntrTpszCd");
		this.hashFields.put("cntr_vol_qty", "cntrVolQty");
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
	 * @return toEccCd
	 */
	public String getToEccCd() {
		return this.toEccCd;
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
	 * @return fcastDt
	 */
	public String getFcastDt() {
		return this.fcastDt;
	}
	
	/**
	 * Page Number
	 * @return pagerows
	 */
	public String getPagerows() {
		return this.pagerows;
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
	 * @return fcastYrwk
	 */
	public String getFcastYrwk() {
		return this.fcastYrwk;
	}
	
	/**
	 * Column Info
	 * @return fmEccCd
	 */
	public String getFmEccCd() {
		return this.fmEccCd;
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
	 * @return ifcstDatTpCd
	 */
	public String getIfcstDatTpCd() {
		return this.ifcstDatTpCd;
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
	 * @return cntrVolQty
	 */
	public String getCntrVolQty() {
		return this.cntrVolQty;
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
	 * @param toEccCd
	 */
	public void setToEccCd(String toEccCd) {
		this.toEccCd = toEccCd;
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
	 * @param fcastDt
	 */
	public void setFcastDt(String fcastDt) {
		this.fcastDt = fcastDt;
	}
	
	/**
	 * Page Number
	 * @param pagerows
	 */
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
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
	 * @param fcastYrwk
	 */
	public void setFcastYrwk(String fcastYrwk) {
		this.fcastYrwk = fcastYrwk;
	}
	
	/**
	 * Column Info
	 * @param fmEccCd
	 */
	public void setFmEccCd(String fmEccCd) {
		this.fmEccCd = fmEccCd;
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
	 * @param ifcstDatTpCd
	 */
	public void setIfcstDatTpCd(String ifcstDatTpCd) {
		this.ifcstDatTpCd = ifcstDatTpCd;
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
	 * @param cntrVolQty
	 */
	public void setCntrVolQty(String cntrVolQty) {
		this.cntrVolQty = cntrVolQty;
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
		setCoCd(JSPUtil.getParameter(request, "co_cd", ""));
		setScnrId(JSPUtil.getParameter(request, "scnr_id", ""));
		setToEccCd(JSPUtil.getParameter(request, "to_ecc_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setFcastDt(JSPUtil.getParameter(request, "fcast_dt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setFcastYrwk(JSPUtil.getParameter(request, "fcast_yrwk", ""));
		setFmEccCd(JSPUtil.getParameter(request, "fm_ecc_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIfcstDatTpCd(JSPUtil.getParameter(request, "ifcst_dat_tp_cd", ""));
		setCntrTpszCd(JSPUtil.getParameter(request, "cntr_tpsz_cd", ""));
		setCntrVolQty(JSPUtil.getParameter(request, "cntr_vol_qty", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return EqrIbBkgFcastVO[]
	 */
	public EqrIbBkgFcastVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return EqrIbBkgFcastVO[]
	 */
	public EqrIbBkgFcastVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		EqrIbBkgFcastVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] coCd = (JSPUtil.getParameter(request, prefix	+ "co_cd", length));
			String[] scnrId = (JSPUtil.getParameter(request, prefix	+ "scnr_id", length));
			String[] toEccCd = (JSPUtil.getParameter(request, prefix	+ "to_ecc_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] fcastDt = (JSPUtil.getParameter(request, prefix	+ "fcast_dt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] fcastYrwk = (JSPUtil.getParameter(request, prefix	+ "fcast_yrwk", length));
			String[] fmEccCd = (JSPUtil.getParameter(request, prefix	+ "fm_ecc_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ifcstDatTpCd = (JSPUtil.getParameter(request, prefix	+ "ifcst_dat_tp_cd", length));
			String[] cntrTpszCd = (JSPUtil.getParameter(request, prefix	+ "cntr_tpsz_cd", length));
			String[] cntrVolQty = (JSPUtil.getParameter(request, prefix	+ "cntr_vol_qty", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			
			for (int i = 0; i < length; i++) {
				model = new EqrIbBkgFcastVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (coCd[i] != null)
					model.setCoCd(coCd[i]);
				if (scnrId[i] != null)
					model.setScnrId(scnrId[i]);
				if (toEccCd[i] != null)
					model.setToEccCd(toEccCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (fcastDt[i] != null)
					model.setFcastDt(fcastDt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (fcastYrwk[i] != null)
					model.setFcastYrwk(fcastYrwk[i]);
				if (fmEccCd[i] != null)
					model.setFmEccCd(fmEccCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ifcstDatTpCd[i] != null)
					model.setIfcstDatTpCd(ifcstDatTpCd[i]);
				if (cntrTpszCd[i] != null)
					model.setCntrTpszCd(cntrTpszCd[i]);
				if (cntrVolQty[i] != null)
					model.setCntrVolQty(cntrVolQty[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getEqrIbBkgFcastVOs();
	}
	
	/**
	 * EES_EQR_0079 컨테이너 수요 예측(I/B) 화면에서 사용
	 * 
	 * @param request
	 * @param tpszOrg
	 * @return
	 */
	public EqrIbBkgFcastVO[] fromRequestGridList(HttpServletRequest request, String tpszOrg) {
		EqrIbBkgFcastVO model = null;
		
		 String[] tpszOrgs = {};
		 if (!(tpszOrg.equals(""))){
			 tpszOrgs = tpszOrg.split(",");
	     }
		
		int length = request.getParameterValues("ibflag").length;
  		
  		try {
			for (int k=0 ; k < tpszOrgs.length ; k++){
				String[] ibflag       	=  (JSPUtil.getParameter(request, "ibflag", length));
				String[] scnr_id      	=  (JSPUtil.getParameter(request, "scnr_id", length));
				String[] fcast_yrwk   	=  (JSPUtil.getParameter(request, "week", length));
				String[] co_cd        	=  (JSPUtil.getParameter(request, "co_cd", length));
				String[] fm_ecc_cd    	=  (JSPUtil.getParameter(request, "fm_loc", length));
				String[] to_ecc_cd    	=  (JSPUtil.getParameter(request, "to_loc", length));
				String   cntr_tpsz_cd 	=  tpszOrgs[k].trim().toString();
				String[] cntr_vol_qty 	=  (JSPUtil.getParameter(request, tpszOrgs[k].toLowerCase()+"_cntr_vol_qty", length));

				for (int i = 0; i < length; i++) {
					model = new EqrIbBkgFcastVO();
					model.setIbflag      		  ( ibflag      	[i]);
					model.setScnrId     		  ( scnr_id     	[i]);
					model.setFcastYrwk  		  ( fcast_yrwk  	[i]);
					model.setCoCd       		  ( co_cd       	[i]);
					model.setFmEccCd   		  ( fm_ecc_cd   	[i]);
					model.setToEccCd   		  ( to_ecc_cd   	[i]);
					model.setCntrTpszCd		  ( cntr_tpsz_cd);
					model.setCntrVolQty		  ( cntr_vol_qty	[i]);
					models.add(model);
				}
			}
  		} catch (Exception e) {
			return null;
		}
		
		return getEqrIbBkgFcastVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return EqrIbBkgFcastVO[]
	 */
	public EqrIbBkgFcastVO[] getEqrIbBkgFcastVOs(){
		EqrIbBkgFcastVO[] vos = (EqrIbBkgFcastVO[])models.toArray(new EqrIbBkgFcastVO[models.size()]);
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
		this.coCd = this.coCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.scnrId = this.scnrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.toEccCd = this.toEccCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fcastDt = this.fcastDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fcastYrwk = this.fcastYrwk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fmEccCd = this.fmEccCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ifcstDatTpCd = this.ifcstDatTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrTpszCd = this.cntrTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrVolQty = this.cntrVolQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
