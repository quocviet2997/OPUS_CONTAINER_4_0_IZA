/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : EqrScnrDmstVO.java
*@FileTitle : EqrScnrDmstVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.08.06
*@LastModifier : 
*@LastVersion : 1.0
* 2009.08.06  
* 1.0 Creation
=========================================================*/

package com.clt.syscommon.common.table;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

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

public class EqrScnrDmstVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<EqrScnrDmstVO> models = new ArrayList<EqrScnrDmstVO>();
	
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
	private String scnrId = null;
	/* Column Info */
	private String cntrTpszCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String plnYrwk = null;
	/* Column Info */
	private String cntrVolQty = null;
	/* Column Info */
	private String updUsrId = null;
	/* Page Number */
	private String pagerows = null;
	/* 추가변수 */
	private String rsCount = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public EqrScnrDmstVO() {}

	public EqrScnrDmstVO(String ibflag, String pagerows, String scnrId, String plnYrwk, String fmEccCd, String toEccCd, String cntrTpszCd, String cntrVolQty, String creUsrId, String creDt, String updUsrId, String updDt, String rsCount) {
		this.updDt = updDt;
		this.creUsrId = creUsrId;
		this.fmEccCd = fmEccCd;
		this.ibflag = ibflag;
		this.toEccCd = toEccCd;
		this.scnrId = scnrId;
		this.cntrTpszCd = cntrTpszCd;
		this.creDt = creDt;
		this.plnYrwk = plnYrwk;
		this.cntrVolQty = cntrVolQty;
		this.updUsrId = updUsrId;
		this.pagerows = pagerows;
		this.rsCount = rsCount;
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
		this.hashColumns.put("scnr_id", getScnrId());
		this.hashColumns.put("cntr_tpsz_cd", getCntrTpszCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("pln_yrwk", getPlnYrwk());
		this.hashColumns.put("cntr_vol_qty", getCntrVolQty());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("rsCount", getRsCount());
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
		this.hashFields.put("scnr_id", "scnrId");
		this.hashFields.put("cntr_tpsz_cd", "cntrTpszCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("pln_yrwk", "plnYrwk");
		this.hashFields.put("cntr_vol_qty", "cntrVolQty");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("rsCount", "rsCount");
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
	 * @return scnrId
	 */
	public String getScnrId() {
		return this.scnrId;
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
	 * @return plnYrwk
	 */
	public String getPlnYrwk() {
		return this.plnYrwk;
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
	 * @param scnrId
	 */
	public void setScnrId(String scnrId) {
		this.scnrId = scnrId;
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
	 * @param plnYrwk
	 */
	public void setPlnYrwk(String plnYrwk) {
		this.plnYrwk = plnYrwk;
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
	 * Page Number
	 * @param pagerows
	 */
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
	}
	
	/**
	 * @return the rsCount
	 */
	public String getRsCount() {
		return rsCount;
	}

	/**
	 * @param rsCount the rsCount to set
	 */
	public void setRsCount(String rsCount) {
		this.rsCount = rsCount;
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
		setScnrId(JSPUtil.getParameter(request, "scnr_id", ""));
		setCntrTpszCd(JSPUtil.getParameter(request, "cntr_tpsz_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setPlnYrwk(JSPUtil.getParameter(request, "pln_yrwk", ""));
		setCntrVolQty(JSPUtil.getParameter(request, "cntr_vol_qty", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setRsCount(JSPUtil.getParameter(request, "rsCount", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return EqrScnrDmstVO[]
	 */
	public EqrScnrDmstVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return EqrScnrDmstVO[]
	 */
	public EqrScnrDmstVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		EqrScnrDmstVO model = null;
		
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
			String[] scnrId = (JSPUtil.getParameter(request, prefix	+ "scnr_id", length));
			String[] cntrTpszCd = (JSPUtil.getParameter(request, prefix	+ "cntr_tpsz_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] plnYrwk = (JSPUtil.getParameter(request, prefix	+ "pln_yrwk", length));
			String[] cntrVolQty = (JSPUtil.getParameter(request, prefix	+ "cntr_vol_qty", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] rsCount = (JSPUtil.getParameter(request, prefix	+ "rsCount", length));
			
			for (int i = 0; i < length; i++) {
				model = new EqrScnrDmstVO();
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
				if (scnrId[i] != null)
					model.setScnrId(scnrId[i]);
				if (cntrTpszCd[i] != null)
					model.setCntrTpszCd(cntrTpszCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (plnYrwk[i] != null)
					model.setPlnYrwk(plnYrwk[i]);
				if (cntrVolQty[i] != null)
					model.setCntrVolQty(cntrVolQty[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (rsCount[i] != null)
					model.setRsCount(rsCount[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getEqrScnrDmstVOs();
	}
	
	/**
	 * EES_EQR_0021 US Domestic 물량 조회/수정 화면에서 사용<br>
	 * perfix_month : 200609,200610,200611,20061  형식임.<br>
	 * 
	 * @param request
	 * @param prefix
	 * @param perfix_month
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List fromRequestPerfixMonth(HttpServletRequest request, String prefix, String perfix_month) {

		List month = new ArrayList();
		try {
			
			String[] prefixMonth = perfix_month.split(",");
			
			for(int i=0; i<=prefixMonth.length; i++) {
				
				prefixMonth[i] = prefixMonth[i].substring(4,6);//09, 10 형식으로 월만.

			    	month.add((JSPUtil.getParameter(request, prefix + prefixMonth[i] + "_cntr_vol_qty		".trim())));
			}

			
		} catch (Exception ex) {
		}
		return month;
	}
	
	/**
	 * EES_EQR_0021 US Domestic 물량 조회/수정 화면에서 사용<br>
	 * 
	 * @param request
	 * @param perfix_weekly
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List fromRequestPerfixWeek(HttpServletRequest request, String perfix_weekly) {

		List week = new ArrayList();
		try {
			
			String[] prefixWeek = perfix_weekly.split(",");
			
			for(int i=0; i<=prefixWeek.length; i++) {
			    	week.add(prefixWeek[i]);
			}
			
		} catch (Exception ex) {
		}
		return week;
	}	
	
	/**
	 * EES_EQR_0021 US Domestic 물량 조회/수정 화면에서 사용<br>
	 * 
	 * @param request
	 * @param monthly_count
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List fromRequestPerfixMonthWeekCnt(HttpServletRequest request, String monthly_count) {

		List monthWeekCnt = new ArrayList();
		try {
			
			String[] prefixMonthWeekCnt = monthly_count.split(",");
			
			for(int i=0; i<=prefixMonthWeekCnt.length; i++) {
				monthWeekCnt.add(prefixMonthWeekCnt[i]);
			}
			
		} catch (Exception ex) {
		}
		return monthWeekCnt;
	}
	
	/**
	 * EES_EQR_0021 US Domestic 물량 조회/수정 화면에서 사용<br>
	 * 
	 * @param request
	 * @param newTitle
	 * @return
	 */
    public EqrScnrDmstVO[] fromRequestGridArrayList(HttpServletRequest request , String newTitle) {
    	EqrScnrDmstVO model = null;
        
        String[] prefix = {};
        
        //visiable 한 TPSZ 만 넘긴다.(조회조건의 TPSZ를 무시)
        prefix = newTitle.split(",");
        
        int length = request.getParameterValues("ibflag").length;
        
        try {
        	for (int k=0 ; k < prefix.length ; k++){
    			
            String[] ibflag          =  (JSPUtil.getParameter(request, "ibflag", length));
            String[] page_rows       =  (JSPUtil.getParameter(request, "page_rows", length));
            String[] scnr_id         =  (JSPUtil.getParameter(request, "scnr_id", length));
            
            String pln_yrwk    =  "";
            String prefixStr    =  prefix[k].trim().toString();
            
            String[] fm_ecc_cd    =  (JSPUtil.getParameter(request, "fm_ecc_cd", length));
			String[] to_ecc_cd    =  (JSPUtil.getParameter(request, "to_ecc_cd", length));
			String[] cntr_tpsz_cd =  (JSPUtil.getParameter(request, "cntr_tpsz_cd", length));
			String[] cntr_vol_qty =  (JSPUtil.getParameter(request, prefixStr+"_cntr_vol_qty", length));
            
            for (int i = 0; i < length; i++) {
                model = new EqrScnrDmstVO();
                model.setIbflag      		  ( ibflag      	[i]);
				model.setPagerows   		  ( page_rows   	[i]);
				model.setScnrId     		  ( scnr_id     	[i]);
				model.setPlnYrwk    		  ( pln_yrwk    	);
				model.setFmEccCd   		  ( fm_ecc_cd   	[i]);
				model.setToEccCd   		  ( to_ecc_cd   	[i]);
				model.setCntrTpszCd		  ( cntr_tpsz_cd	[i]);
				model.setCntrVolQty		  ( cntr_vol_qty	[i]);
                models.add(model);
            }
       	}
        } catch (Exception ex) {
        }
        return getEqrScnrDmstVOs();
    }

	/**
	 * VO 배열을 반환
	 * @return EqrScnrDmstVO[]
	 */
	public EqrScnrDmstVO[] getEqrScnrDmstVOs(){
		EqrScnrDmstVO[] vos = (EqrScnrDmstVO[])models.toArray(new EqrScnrDmstVO[models.size()]);
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
		this.scnrId = this.scnrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrTpszCd = this.cntrTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.plnYrwk = this.plnYrwk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrVolQty = this.cntrVolQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rsCount = this.rsCount .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}

}
