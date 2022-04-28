/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : EqrRepoExePlnFbExptVO.java
*@FileTitle : EqrRepoExePlnFbExptVO
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

public class EqrRepoExePlnFbExptVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<EqrRepoExePlnFbExptVO> models = new ArrayList<EqrRepoExePlnFbExptVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String lccGrpSeq = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String fbItmBseCd = null;
	/* Column Info */
	private String rccGrpSeq = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String fbRto = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String locCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String fbItmCd = null;
	/* Column Info */
	private String cntrTpszCd = null;
	/* Column Info */
	private String locGrpCd = null;
	/* Column Info */
	private String cntrVolQty = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String eccGrpSeq = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public EqrRepoExePlnFbExptVO() {}

	public EqrRepoExePlnFbExptVO(String ibflag, String pagerows, String locGrpCd, String locCd, String fbItmCd, String fbItmBseCd, String cntrTpszCd, String fbRto, String cntrVolQty, String rccGrpSeq, String lccGrpSeq, String eccGrpSeq, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.lccGrpSeq = lccGrpSeq;
		this.creDt = creDt;
		this.fbItmBseCd = fbItmBseCd;
		this.rccGrpSeq = rccGrpSeq;
		this.pagerows = pagerows;
		this.fbRto = fbRto;
		this.ibflag = ibflag;
		this.locCd = locCd;
		this.creUsrId = creUsrId;
		this.fbItmCd = fbItmCd;
		this.cntrTpszCd = cntrTpszCd;
		this.locGrpCd = locGrpCd;
		this.cntrVolQty = cntrVolQty;
		this.updUsrId = updUsrId;
		this.eccGrpSeq = eccGrpSeq;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("lcc_grp_seq", getLccGrpSeq());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("fb_itm_bse_cd", getFbItmBseCd());
		this.hashColumns.put("rcc_grp_seq", getRccGrpSeq());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("fb_rto", getFbRto());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("loc_cd", getLocCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("fb_itm_cd", getFbItmCd());
		this.hashColumns.put("cntr_tpsz_cd", getCntrTpszCd());
		this.hashColumns.put("loc_grp_cd", getLocGrpCd());
		this.hashColumns.put("cntr_vol_qty", getCntrVolQty());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("ecc_grp_seq", getEccGrpSeq());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("lcc_grp_seq", "lccGrpSeq");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("fb_itm_bse_cd", "fbItmBseCd");
		this.hashFields.put("rcc_grp_seq", "rccGrpSeq");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("fb_rto", "fbRto");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("loc_cd", "locCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("fb_itm_cd", "fbItmCd");
		this.hashFields.put("cntr_tpsz_cd", "cntrTpszCd");
		this.hashFields.put("loc_grp_cd", "locGrpCd");
		this.hashFields.put("cntr_vol_qty", "cntrVolQty");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("ecc_grp_seq", "eccGrpSeq");
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
	 * @return lccGrpSeq
	 */
	public String getLccGrpSeq() {
		return this.lccGrpSeq;
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
	 * @return fbItmBseCd
	 */
	public String getFbItmBseCd() {
		return this.fbItmBseCd;
	}
	
	/**
	 * Column Info
	 * @return rccGrpSeq
	 */
	public String getRccGrpSeq() {
		return this.rccGrpSeq;
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
	 * @return fbRto
	 */
	public String getFbRto() {
		return this.fbRto;
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
	 * @return locCd
	 */
	public String getLocCd() {
		return this.locCd;
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
	 * @return locGrpCd
	 */
	public String getLocGrpCd() {
		return this.locGrpCd;
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
	 * @return eccGrpSeq
	 */
	public String getEccGrpSeq() {
		return this.eccGrpSeq;
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
	 * @param lccGrpSeq
	 */
	public void setLccGrpSeq(String lccGrpSeq) {
		this.lccGrpSeq = lccGrpSeq;
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
	 * @param fbItmBseCd
	 */
	public void setFbItmBseCd(String fbItmBseCd) {
		this.fbItmBseCd = fbItmBseCd;
	}
	
	/**
	 * Column Info
	 * @param rccGrpSeq
	 */
	public void setRccGrpSeq(String rccGrpSeq) {
		this.rccGrpSeq = rccGrpSeq;
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
	 * @param fbRto
	 */
	public void setFbRto(String fbRto) {
		this.fbRto = fbRto;
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
	 * @param locCd
	 */
	public void setLocCd(String locCd) {
		this.locCd = locCd;
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
	 * @param locGrpCd
	 */
	public void setLocGrpCd(String locGrpCd) {
		this.locGrpCd = locGrpCd;
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
	 * Column Info
	 * @param eccGrpSeq
	 */
	public void setEccGrpSeq(String eccGrpSeq) {
		this.eccGrpSeq = eccGrpSeq;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setLccGrpSeq(JSPUtil.getParameter(request, "lcc_grp_seq", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setFbItmBseCd(JSPUtil.getParameter(request, "fb_itm_bse_cd", ""));
		setRccGrpSeq(JSPUtil.getParameter(request, "rcc_grp_seq", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setFbRto(JSPUtil.getParameter(request, "fb_rto", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setLocCd(JSPUtil.getParameter(request, "loc_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setFbItmCd(JSPUtil.getParameter(request, "fb_itm_cd", ""));
		setCntrTpszCd(JSPUtil.getParameter(request, "cntr_tpsz_cd", ""));
		setLocGrpCd(JSPUtil.getParameter(request, "loc_grp_cd", ""));
		setCntrVolQty(JSPUtil.getParameter(request, "cntr_vol_qty", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setEccGrpSeq(JSPUtil.getParameter(request, "ecc_grp_seq", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return EqrRepoExePlnFbExptVO[]
	 */
	public EqrRepoExePlnFbExptVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return EqrRepoExePlnFbExptVO[]
	 */
	public EqrRepoExePlnFbExptVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		EqrRepoExePlnFbExptVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] lccGrpSeq = (JSPUtil.getParameter(request, prefix	+ "lcc_grp_seq", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] fbItmBseCd = (JSPUtil.getParameter(request, prefix	+ "fb_itm_bse_cd", length));
			String[] rccGrpSeq = (JSPUtil.getParameter(request, prefix	+ "rcc_grp_seq", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] fbRto = (JSPUtil.getParameter(request, prefix	+ "fb_rto", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] locCd = (JSPUtil.getParameter(request, prefix	+ "loc_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] fbItmCd = (JSPUtil.getParameter(request, prefix	+ "fb_itm_cd", length));
			String[] cntrTpszCd = (JSPUtil.getParameter(request, prefix	+ "cntr_tpsz_cd", length));
			String[] locGrpCd = (JSPUtil.getParameter(request, prefix	+ "loc_grp_cd", length));
			String[] cntrVolQty = (JSPUtil.getParameter(request, prefix	+ "cntr_vol_qty", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] eccGrpSeq = (JSPUtil.getParameter(request, prefix	+ "ecc_grp_seq", length));
			
			for (int i = 0; i < length; i++) {
				model = new EqrRepoExePlnFbExptVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (lccGrpSeq[i] != null)
					model.setLccGrpSeq(lccGrpSeq[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (fbItmBseCd[i] != null)
					model.setFbItmBseCd(fbItmBseCd[i]);
				if (rccGrpSeq[i] != null)
					model.setRccGrpSeq(rccGrpSeq[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (fbRto[i] != null)
					model.setFbRto(fbRto[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (locCd[i] != null)
					model.setLocCd(locCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (fbItmCd[i] != null)
					model.setFbItmCd(fbItmCd[i]);
				if (cntrTpszCd[i] != null)
					model.setCntrTpszCd(cntrTpszCd[i]);
				if (locGrpCd[i] != null)
					model.setLocGrpCd(locGrpCd[i]);
				if (cntrVolQty[i] != null)
					model.setCntrVolQty(cntrVolQty[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (eccGrpSeq[i] != null)
					model.setEccGrpSeq(eccGrpSeq[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getEqrRepoExePlnFbExptVOs();
	}
	
	/**
	 * EES_EQR_0058 실행 계획 Feedback 기준 설정 화면에서 사용
	 * 
	 * @param request
	 * @param perfix
	 * @return
	 */
	public EqrRepoExePlnFbExptVO[] fromRequestGridArrayList(HttpServletRequest request, String perfix) {
		EqrRepoExePlnFbExptVO model = null;
		
		String[] prefix = JSPUtil.getParameter(request, "tpszall", "").split(",");
		int length = request.getParameterValues("ibflag").length;
		
		try {
			for (int k=0 ; k < prefix.length ; k++){
				String[] ibflag        =  (JSPUtil.getParameter(request, "ibflag", length));
				String[] page_rows     =  (JSPUtil.getParameter(request, "page_rows", length));
				String[] loc_grp_cd    =  (JSPUtil.getParameter(request, "loc_grp_cd", length));
				String[] loc_cd        =  (JSPUtil.getParameter(request, "loc_cd", length));
				String[] fb_itm_cd     =  (JSPUtil.getParameter(request, "fb_itm_cd", length));
				String[] fb_itm_bse_cd =  (JSPUtil.getParameter(request, "fb_itm_bse_cd", length));
				String cntr_tpsz_cd    =  prefix[k].trim().toString();
				String[] fb_rto        =  (JSPUtil.getParameter(request, prefix[k].toLowerCase() + "fb_rto", length));
				String[] cntr_vol_qty  =  (JSPUtil.getParameter(request, prefix[k].toLowerCase() + "cntr_vol_qty", length));
				String[] rcc_grp_seq   =  (JSPUtil.getParameter(request, "rcc_grp_seq", length));
				String[] lcc_grp_seq   =  (JSPUtil.getParameter(request, "lcc_grp_seq", length));
				String[] ecc_grp_seq   =  (JSPUtil.getParameter(request, "ecc_grp_seq", length));
				
				for (int i = 0; i < length; i++) {
					model = new EqrRepoExePlnFbExptVO();
					model.setIbflag       		  ( ibflag       	[i]);
					model.setPagerows    		  ( page_rows    	[i]);
					model.setLocGrpCd   		  ( loc_grp_cd   	[i]);
					model.setLocCd       		  ( loc_cd       	[i]);
					model.setFbItmCd    		  ( fb_itm_cd    	[i]);
					model.setFbItmBseCd		  ( fb_itm_bse_cd	[i]);
					model.setCntrTpszCd 		  ( cntr_tpsz_cd);
					model.setFbRto       		  ( fb_rto       	[i]);
					model.setCntrVolQty 		  ( cntr_vol_qty 	[i]);
					model.setRccGrpSeq  		  ( rcc_grp_seq  	[i]);
					model.setLccGrpSeq  		  ( lcc_grp_seq  	[i]);
					model.setEccGrpSeq  		  ( ecc_grp_seq  	[i]);
					models.add(model);
				}
			}
		} catch (Exception ex) {
			return null;
		}
		
		return getEqrRepoExePlnFbExptVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return EqrRepoExePlnFbExptVO[]
	 */
	public EqrRepoExePlnFbExptVO[] getEqrRepoExePlnFbExptVOs(){
		EqrRepoExePlnFbExptVO[] vos = (EqrRepoExePlnFbExptVO[])models.toArray(new EqrRepoExePlnFbExptVO[models.size()]);
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
		this.lccGrpSeq = this.lccGrpSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fbItmBseCd = this.fbItmBseCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rccGrpSeq = this.rccGrpSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fbRto = this.fbRto .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.locCd = this.locCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fbItmCd = this.fbItmCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrTpszCd = this.cntrTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.locGrpCd = this.locGrpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrVolQty = this.cntrVolQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eccGrpSeq = this.eccGrpSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
