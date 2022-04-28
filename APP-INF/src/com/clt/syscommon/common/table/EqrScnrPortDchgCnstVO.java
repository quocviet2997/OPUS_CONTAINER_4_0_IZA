/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : EqrScnrPortDchgCnstVO.java
*@FileTitle : EqrScnrPortDchgCnstVO
*Open Issues :
*Change history :
* No.	Ver.		Modifier           		modifier date    explanation
* 1      	1.0      	Lee Byoung Hun	2009.08.12		1.0 최초 생성
*
*@LastModifyDate : 2009.08.12
*@LastModifier : Lee Byoung Hun
*@LastVersion : 1.0
* 2009.08.12  
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

public class EqrScnrPortDchgCnstVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<EqrScnrPortDchgCnstVO> models = new ArrayList<EqrScnrPortDchgCnstVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String vslLaneCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String scnrId = null;
	/* Column Info */
	private String cnstCntrTpszCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String cntrVolQty = null;
	/* Column Info */
	private String vslLocCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Page Number */
	private String pagerows = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public EqrScnrPortDchgCnstVO() {}

	public EqrScnrPortDchgCnstVO(String ibflag, String pagerows, String scnrId, String vslLaneCd, String vslLocCd, String cnstCntrTpszCd, String cntrVolQty, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.vslLaneCd = vslLaneCd;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.scnrId = scnrId;
		this.cnstCntrTpszCd = cnstCntrTpszCd;
		this.creDt = creDt;
		this.cntrVolQty = cntrVolQty;
		this.vslLocCd = vslLocCd;
		this.updUsrId = updUsrId;
		this.pagerows = pagerows;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("vsl_lane_cd", getVslLaneCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("scnr_id", getScnrId());
		this.hashColumns.put("cnst_cntr_tpsz_cd", getCnstCntrTpszCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("cntr_vol_qty", getCntrVolQty());
		this.hashColumns.put("vsl_loc_cd", getVslLocCd());
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
		this.hashFields.put("vsl_lane_cd", "vslLaneCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("scnr_id", "scnrId");
		this.hashFields.put("cnst_cntr_tpsz_cd", "cnstCntrTpszCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("cntr_vol_qty", "cntrVolQty");
		this.hashFields.put("vsl_loc_cd", "vslLocCd");
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
	 * @return vslLaneCd
	 */
	public String getVslLaneCd() {
		return this.vslLaneCd;
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
	 * @return scnrId
	 */
	public String getScnrId() {
		return this.scnrId;
	}
	
	/**
	 * Column Info
	 * @return cnstCntrTpszCd
	 */
	public String getCnstCntrTpszCd() {
		return this.cnstCntrTpszCd;
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
	 * @return cntrVolQty
	 */
	public String getCntrVolQty() {
		return this.cntrVolQty;
	}
	
	/**
	 * Column Info
	 * @return vslLocCd
	 */
	public String getVslLocCd() {
		return this.vslLocCd;
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
	 * @param vslLaneCd
	 */
	public void setVslLaneCd(String vslLaneCd) {
		this.vslLaneCd = vslLaneCd;
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
	 * @param scnrId
	 */
	public void setScnrId(String scnrId) {
		this.scnrId = scnrId;
	}
	
	/**
	 * Column Info
	 * @param cnstCntrTpszCd
	 */
	public void setCnstCntrTpszCd(String cnstCntrTpszCd) {
		this.cnstCntrTpszCd = cnstCntrTpszCd;
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
	 * @param cntrVolQty
	 */
	public void setCntrVolQty(String cntrVolQty) {
		this.cntrVolQty = cntrVolQty;
	}
	
	/**
	 * Column Info
	 * @param vslLocCd
	 */
	public void setVslLocCd(String vslLocCd) {
		this.vslLocCd = vslLocCd;
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
		setVslLaneCd(JSPUtil.getParameter(request, "vsl_lane_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setScnrId(JSPUtil.getParameter(request, "scnr_id", ""));
		setCnstCntrTpszCd(JSPUtil.getParameter(request, "cnst_cntr_tpsz_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setCntrVolQty(JSPUtil.getParameter(request, "cntr_vol_qty", ""));
		setVslLocCd(JSPUtil.getParameter(request, "vsl_loc_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return EqrScnrPortDchgCnstVO[]
	 */
	public EqrScnrPortDchgCnstVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return EqrScnrPortDchgCnstVO[]
	 */
	public EqrScnrPortDchgCnstVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		EqrScnrPortDchgCnstVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] vslLaneCd = (JSPUtil.getParameter(request, prefix	+ "vsl_lane_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] scnrId = (JSPUtil.getParameter(request, prefix	+ "scnr_id", length));
			String[] cnstCntrTpszCd = (JSPUtil.getParameter(request, prefix	+ "cnst_cntr_tpsz_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] cntrVolQty = (JSPUtil.getParameter(request, prefix	+ "cntr_vol_qty", length));
			String[] vslLocCd = (JSPUtil.getParameter(request, prefix	+ "vsl_loc_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			
			for (int i = 0; i < length; i++) {
				model = new EqrScnrPortDchgCnstVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (vslLaneCd[i] != null)
					model.setVslLaneCd(vslLaneCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (scnrId[i] != null)
					model.setScnrId(scnrId[i]);
				if (cnstCntrTpszCd[i] != null)
					model.setCnstCntrTpszCd(cnstCntrTpszCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (cntrVolQty[i] != null)
					model.setCntrVolQty(cntrVolQty[i]);
				if (vslLocCd[i] != null)
					model.setVslLocCd(vslLocCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getEqrScnrPortDchgCnstVOs();
	}
	
	/**
	 * EES_EQR_0138 Constraint by Lane/ECC 화면에서 사용
	 * 
	 * @param request
	 * @param tpsz
	 * @return
	 */
	public EqrScnrPortDchgCnstVO[] fromRequestGridList(HttpServletRequest request, String tpsz) {
		EqrScnrPortDchgCnstVO model = null;
		
		 String[] tpszOrgs = {};
		 if (!(tpsz.equals(""))){
			 tpszOrgs = tpsz.split(",");
	     }
		
		int length = request.getParameterValues("ibflag").length;
  		
  		try {
			for (int k=0 ; k < tpszOrgs.length ; k++){
				String[] ibflag       	=  (JSPUtil.getParameter(request, "ibflag", length));
				String[] scnr_id      	=  (JSPUtil.getParameter(request, "scnr_id", length));
				String[] vsl_lane_cd   	=  (JSPUtil.getParameter(request, "lane", length));
				String[] vsl_loc_cd        	=  (JSPUtil.getParameter(request, "pod", length));
				String   cntr_tpsz_cd 	=  tpszOrgs[k].trim().toString();
				String[] cntr_vol_qty 	=  (JSPUtil.getParameter(request, tpszOrgs[k].toLowerCase()+"_qty", length));

				for (int i = 0; i < length; i++) {
					model = new EqrScnrPortDchgCnstVO();
					model.setIbflag      		  ( ibflag      	[i]);
					model.setScnrId     		  ( scnr_id     	[i]);
					model.setVslLaneCd  		  ( vsl_lane_cd  	[i]);
					model.setVslLocCd       		  ( vsl_loc_cd       	[i]);
					model.setCnstCntrTpszCd		  ( cntr_tpsz_cd);
					model.setCntrVolQty		  ( cntr_vol_qty	[i]);
					models.add(model);
				}
			}
  		} catch (Exception e) {
			return null;
		}
		
		return getEqrScnrPortDchgCnstVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return EqrScnrPortDchgCnstVO[]
	 */
	public EqrScnrPortDchgCnstVO[] getEqrScnrPortDchgCnstVOs(){
		EqrScnrPortDchgCnstVO[] vos = (EqrScnrPortDchgCnstVO[])models.toArray(new EqrScnrPortDchgCnstVO[models.size()]);
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
		this.vslLaneCd = this.vslLaneCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.scnrId = this.scnrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cnstCntrTpszCd = this.cnstCntrTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrVolQty = this.cntrVolQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslLocCd = this.vslLocCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
