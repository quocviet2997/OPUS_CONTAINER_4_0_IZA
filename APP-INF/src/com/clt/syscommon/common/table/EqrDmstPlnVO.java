/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : EqrDmstPlnVO.java
*@FileTitle : EqrDmstPlnVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.22
*@LastModifier : 채창호
*@LastVersion : 1.0
* 2009.07.22 채창호 
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
 * @author 채창호
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class EqrDmstPlnVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<EqrDmstPlnVO> models = new ArrayList<EqrDmstPlnVO>();
	
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
	/* Input Info */
	private Object rscount= null;
	
	

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public EqrDmstPlnVO() {}

	public EqrDmstPlnVO(String ibflag, String pagerows, String plnYrwk, String fmEccCd, String toEccCd, String cntrTpszCd, String cntrVolQty, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.creUsrId = creUsrId;
		this.fmEccCd = fmEccCd;
		this.ibflag = ibflag;
		this.toEccCd = toEccCd;
		this.cntrTpszCd = cntrTpszCd;
		this.creDt = creDt;
		this.plnYrwk = plnYrwk;
		this.cntrVolQty = cntrVolQty;
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
		this.hashColumns.put("fm_ecc_cd", getFmEccCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("to_ecc_cd", getToEccCd());
		this.hashColumns.put("cntr_tpsz_cd", getCntrTpszCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("pln_yrwk", getPlnYrwk());
		this.hashColumns.put("cntr_vol_qty", getCntrVolQty());
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
		this.hashFields.put("fm_ecc_cd", "fmEccCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("to_ecc_cd", "toEccCd");
		this.hashFields.put("cntr_tpsz_cd", "cntrTpszCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("pln_yrwk", "plnYrwk");
		this.hashFields.put("cntr_vol_qty", "cntrVolQty");
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
		setCntrTpszCd(JSPUtil.getParameter(request, "cntr_tpsz_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setPlnYrwk(JSPUtil.getParameter(request, "pln_yrwk", ""));
		setCntrVolQty(JSPUtil.getParameter(request, "cntr_vol_qty", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return EqrDmstPlnVO[]
	 */
	public EqrDmstPlnVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return EqrDmstPlnVO[]
	 */
	public EqrDmstPlnVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		EqrDmstPlnVO model = null;
		
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
				String[] cntrTpszCd = (JSPUtil.getParameter(request, prefix	+ "cntr_tpsz_cd", length));
				String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
				String[] plnYrwk = (JSPUtil.getParameter(request, prefix	+ "pln_yrwk", length));
				String[] cntrVolQty = (JSPUtil.getParameter(request, prefix	+ "cntr_vol_qty", length));
				String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
				String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			
				for (int i = 0; i < length; i++) {
					model = new EqrDmstPlnVO();
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
					models.add(model);
				}
         
			}catch (Exception e) {
				return null;
			}
		return getEqrDmstPlnVOs();
	}
	
	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return EqrDmstPlnVO[]
	 */
	public EqrDmstPlnVO[] fromRequestGrid1(HttpServletRequest request, String prefix) {
		EqrDmstPlnVO model = null;
		
			String[] tmp = request.getParameterValues(prefix + "ibflag");
			if(tmp == null)
				return null;

			int length = request.getParameterValues(prefix + "ibflag").length;
  
			try {
				//String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
				//String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
				String[] fmEccCd = (JSPUtil.getParameter(request, prefix	+ "fm_ecc_cd", length));
				String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
				String[] toEccCd = (JSPUtil.getParameter(request, prefix	+ "to_ecc_cd", length));
				String[] cntrTpszCd = (JSPUtil.getParameter(request, prefix	+ "cntr_tpsz_cd", length));
				//String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
				String[] plnYrwk = (JSPUtil.getParameter(request, prefix	+ "pln_yrwk", length));
				String[] cntrVolQty = null;
				//String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
				//String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
				// 사용하지 않는 변수 주석처리 modify By ChungEunHo 09.10.16
			
					for(int k=0; k<length; k++) {

						for(int i=0; i<= 52; i++) {
							cntrVolQty =  (JSPUtil.getParameter(request,  prefix + (i+1) + "_cntr_vol_qty		".trim(), length));
							if(!cntrVolQty[k].equals("")) {
								model = new EqrDmstPlnVO();
								model.setIbflag       ( ibflag      	[k]);				
								model.setFmEccCd      ( fmEccCd      	[k]);
								model.setToEccCd      ( toEccCd   		[k]);
								model.setCntrTpszCd   ( cntrTpszCd		[k]);
			
								model.setCntrVolQty   ( cntrVolQty		[k]);
								model.setPlnYrwk      ( plnYrwk    		[k] );
								models.add(model);
							}
						}
					}

         
			}catch (Exception e) {
				return null;
			}
		return getEqrDmstPlnVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return EqrDmstPlnVO[]
	 */
	public EqrDmstPlnVO[] getEqrDmstPlnVOs(){
		EqrDmstPlnVO[] vos = (EqrDmstPlnVO[])models.toArray(new EqrDmstPlnVO[models.size()]);
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
	
	
	public  List<String> fromRequestGrid3(HttpServletRequest request, String prefix) {
		
		List<String> month = new ArrayList<String>();
		try {
			
			for(int i=1; i<=12; i++) {
				month.add((JSPUtil.getParameter(request, prefix + i + "_cntr_vol_qty		".trim(), "E")));
			}
			
			
		} catch (Exception ex) {
		}
		return month;
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
		this.cntrTpszCd = this.cntrTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.plnYrwk = this.plnYrwk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrVolQty = this.cntrVolQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
