/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : EqrRepoExePlnFbVO.java
*@FileTitle : EqrRepoExePlnFbVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.23
*@LastModifier : 
*@LastVersion : 1.0
* 2009.07.23  
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

public class EqrRepoExePlnFbVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<EqrRepoExePlnFbVO> models = new ArrayList<EqrRepoExePlnFbVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String fbRto = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String fbItmCd = null;
	/* Column Info */
	private String cntrTpszCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String cntrVolQty = null;
	/* Column Info */
	private String fbItmBseCd = null;
	/* EES_EQR_058 에서 사용 */
	private String oldBseCd = null;   
	/* Column Info */
	private String updUsrId = null;
	/* Page Number */
	private String pagerows = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public EqrRepoExePlnFbVO() {}

	public EqrRepoExePlnFbVO(String ibflag, String pagerows, String fbItmCd, String fbItmBseCd, String cntrTpszCd, String fbRto, String cntrVolQty, String creUsrId, String creDt, String updUsrId, String updDt, String oldBseCd) {
		this.updDt = updDt;
		this.fbRto = fbRto;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.fbItmCd = fbItmCd;
		this.cntrTpszCd = cntrTpszCd;
		this.creDt = creDt;
		this.cntrVolQty = cntrVolQty;
		this.fbItmBseCd = fbItmBseCd;
		this.updUsrId = updUsrId;
		this.pagerows = pagerows;
		this.oldBseCd = oldBseCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("fb_rto", getFbRto());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("fb_itm_cd", getFbItmCd());
		this.hashColumns.put("cntr_tpsz_cd", getCntrTpszCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("cntr_vol_qty", getCntrVolQty());
		this.hashColumns.put("fb_itm_bse_cd", getFbItmBseCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("old_bse_cd", getOldBseCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("fb_rto", "fbRto");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("fb_itm_cd", "fbItmCd");
		this.hashFields.put("cntr_tpsz_cd", "cntrTpszCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("cntr_vol_qty", "cntrVolQty");
		this.hashFields.put("fb_itm_bse_cd", "fbItmBseCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("old_bse_cd", "oldBseCd");
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
	 * @return fbRto
	 */
	public String getFbRto() {
		return this.fbRto;
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
	 * @return fbItmCd
	 */
	public String getFbItmCd() {
		return this.fbItmCd;
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
	 * @return cntrVolQty
	 */
	public String getCntrVolQty() {
		return this.cntrVolQty;
	}
	
	/**
	 * Column Info
	 * @return fbItmBseCd
	 */
	public String getFbItmBseCd() {
		return this.fbItmBseCd;
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
	 * @return oldBseCd
	 */
	public String getOldBseCd() {
		return this.oldBseCd;
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
	 * @param fbRto
	 */
	public void setFbRto(String fbRto) {
		this.fbRto = fbRto;
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
	 * @param fbItmCd
	 */
	public void setFbItmCd(String fbItmCd) {
		this.fbItmCd = fbItmCd;
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
	 * @param cntrVolQty
	 */
	public void setCntrVolQty(String cntrVolQty) {
		this.cntrVolQty = cntrVolQty;
	}
	
	/**
	 * Column Info
	 * @param fbItmBseCd
	 */
	public void setFbItmBseCd(String fbItmBseCd) {
		this.fbItmBseCd = fbItmBseCd;
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
	 * Column Info
	 * @param updUsrId
	 */
	public void setOldBseCd(String oldBseCd) {
		this.oldBseCd = oldBseCd;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setFbRto(JSPUtil.getParameter(request, "fb_rto", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setFbItmCd(JSPUtil.getParameter(request, "fb_itm_cd", ""));
		setCntrTpszCd(JSPUtil.getParameter(request, "cntr_tpsz_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setCntrVolQty(JSPUtil.getParameter(request, "cntr_vol_qty", ""));
		setFbItmBseCd(JSPUtil.getParameter(request, "fb_itm_bse_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setPagerows(JSPUtil.getParameter(request, "old_bse_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return EqrRepoExePlnFbVO[]
	 */
	public EqrRepoExePlnFbVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return EqrRepoExePlnFbVO[]
	 */
	public EqrRepoExePlnFbVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		EqrRepoExePlnFbVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] fbRto = (JSPUtil.getParameter(request, prefix	+ "fb_rto", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] fbItmCd = (JSPUtil.getParameter(request, prefix	+ "fb_itm_cd", length));
			String[] cntrTpszCd = (JSPUtil.getParameter(request, prefix	+ "cntr_tpsz_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] cntrVolQty = (JSPUtil.getParameter(request, prefix	+ "cntr_vol_qty", length));
			String[] fbItmBseCd = (JSPUtil.getParameter(request, prefix	+ "fb_itm_bse_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] oldBseCd = (JSPUtil.getParameter(request, prefix	+ "old_bse_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new EqrRepoExePlnFbVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (fbRto[i] != null)
					model.setFbRto(fbRto[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (fbItmCd[i] != null)
					model.setFbItmCd(fbItmCd[i]);
				if (cntrTpszCd[i] != null)
					model.setCntrTpszCd(cntrTpszCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (cntrVolQty[i] != null)
					model.setCntrVolQty(cntrVolQty[i]);
				if (fbItmBseCd[i] != null)
					model.setFbItmBseCd(fbItmBseCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (oldBseCd[i] != null)
					model.setOldBseCd(oldBseCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getEqrRepoExePlnFbVOs();
	}
	
	/**
	 * EES_EQR_0058 실행 계획 Feedback 기준 설정 화면에서 사용
	 * 
	 * @param request
	 * @param perfix
	 * @return
	 */
	public EqrRepoExePlnFbVO[] fromRequestGridArrayList(HttpServletRequest request, String perfix) {
		EqrRepoExePlnFbVO model = null;
		String[] prefix = JSPUtil.getParameter(request, "tpszall", "").split(",");
		int length = request.getParameterValues("ibflag").length;
		
		try {
			
			for (int k=0 ; k < prefix.length ; k++){
				String[] ibflag        =  (JSPUtil.getParameter(request, "ibflag", length));
				String[] page_rows     =  (JSPUtil.getParameter(request, "page_rows", length));
				String[] old_bse_cd    =  (JSPUtil.getParameter(request, "old_bse_cd", length));
				String[] fb_itm_cd     =  (JSPUtil.getParameter(request, "fb_itm_cd", length));
				String[] fb_itm_bse_cd =  (JSPUtil.getParameter(request, "fb_itm_bse_cd", length));
				String cntr_tpsz_cd    =  prefix[k].trim().toString();				
				String[] fb_rto        =  (JSPUtil.getParameter(request, prefix[k].toLowerCase() + "fb_rto", length));
				String[] cntr_vol_qty  =  (JSPUtil.getParameter(request, prefix[k].toLowerCase() + "cntr_vol_qty", length));
				
				for (int i = 0; i < length; i++) {
					model = new EqrRepoExePlnFbVO();
					model.setIbflag       		  ( ibflag       	[i]);
					model.setPagerows    		  ( page_rows    	[i]);
					model.setOldBseCd    		  ( old_bse_cd    	[i]);
					model.setFbItmCd    		  ( fb_itm_cd    	[i]);
					model.setFbItmBseCd		  ( fb_itm_bse_cd	[i]);
					model.setCntrTpszCd 		  ( cntr_tpsz_cd);
					model.setFbRto       		  ( fb_rto       	[i]);
					model.setCntrVolQty 		  ( cntr_vol_qty 	[i]);
					models.add(model);
				}
			}
		} catch (Exception ex) {
			return null;
		}
		
		return getEqrRepoExePlnFbVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return EqrRepoExePlnFbVO[]
	 */
	public EqrRepoExePlnFbVO[] getEqrRepoExePlnFbVOs(){
		EqrRepoExePlnFbVO[] vos = (EqrRepoExePlnFbVO[])models.toArray(new EqrRepoExePlnFbVO[models.size()]);
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
		this.fbRto = this.fbRto .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fbItmCd = this.fbItmCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrTpszCd = this.cntrTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrVolQty = this.cntrVolQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fbItmBseCd = this.fbItmBseCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.oldBseCd = this.oldBseCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
