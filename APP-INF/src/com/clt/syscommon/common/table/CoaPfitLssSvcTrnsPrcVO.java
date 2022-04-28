/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CoaPfitLssSvcTrnsPrcVO.java
*@FileTitle : CoaPfitLssSvcTrnsPrcVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.09.25
*@LastModifier : 임옥영
*@LastVersion : 1.0
* 2009.09.25 임옥영 
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
 * @author 임옥영
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class CoaPfitLssSvcTrnsPrcVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<CoaPfitLssSvcTrnsPrcVO> models = new ArrayList<CoaPfitLssSvcTrnsPrcVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String iocCd = null;
	/* Column Info */
	private String vslCd = null;
	/* Column Info */
	private String agmtSgnOfcCd = null;
	/* Column Info */
	private String raPlAmt = null;
	/* Column Info */
	private String estmPlAmt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String plDesc = null;
	/* Column Info */
	private String skdVoyNo = null;
	/* Column Info */
	private String trdCd = null;
	/* Column Info */
	private String rlaneCd = null;
	/* Column Info */
	private String skdDirCd = null;
	/* Column Info */
	private String acclRtAmt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String cntrTpszCd = null;
	/* Column Info */
	private String slsOfcCd = null;
	/* Column Info */
	private String coAmt = null;
	/* Column Info */
	private String hjsSlsAmt = null;
	/* Column Info */
	private String actPlAmt = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String stndCostCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public CoaPfitLssSvcTrnsPrcVO() {}

	public CoaPfitLssSvcTrnsPrcVO(String ibflag, String pagerows, String vslCd, String skdVoyNo, String skdDirCd, String iocCd, String rlaneCd, String trdCd, String cntrTpszCd, String slsOfcCd, String agmtSgnOfcCd, String stndCostCd, String estmPlAmt, String raPlAmt, String actPlAmt, String acclRtAmt, String plDesc, String hjsSlsAmt, String coAmt, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.iocCd = iocCd;
		this.vslCd = vslCd;
		this.agmtSgnOfcCd = agmtSgnOfcCd;
		this.raPlAmt = raPlAmt;
		this.estmPlAmt = estmPlAmt;
		this.creDt = creDt;
		this.plDesc = plDesc;
		this.skdVoyNo = skdVoyNo;
		this.trdCd = trdCd;
		this.rlaneCd = rlaneCd;
		this.skdDirCd = skdDirCd;
		this.acclRtAmt = acclRtAmt;
		this.pagerows = pagerows;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.cntrTpszCd = cntrTpszCd;
		this.slsOfcCd = slsOfcCd;
		this.coAmt = coAmt;
		this.hjsSlsAmt = hjsSlsAmt;
		this.actPlAmt = actPlAmt;
		this.updUsrId = updUsrId;
		this.stndCostCd = stndCostCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("ioc_cd", getIocCd());
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("agmt_sgn_ofc_cd", getAgmtSgnOfcCd());
		this.hashColumns.put("ra_pl_amt", getRaPlAmt());
		this.hashColumns.put("estm_pl_amt", getEstmPlAmt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("pl_desc", getPlDesc());
		this.hashColumns.put("skd_voy_no", getSkdVoyNo());
		this.hashColumns.put("trd_cd", getTrdCd());
		this.hashColumns.put("rlane_cd", getRlaneCd());
		this.hashColumns.put("skd_dir_cd", getSkdDirCd());
		this.hashColumns.put("accl_rt_amt", getAcclRtAmt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cntr_tpsz_cd", getCntrTpszCd());
		this.hashColumns.put("sls_ofc_cd", getSlsOfcCd());
		this.hashColumns.put("co_amt", getCoAmt());
		this.hashColumns.put("hjs_sls_amt", getHjsSlsAmt());
		this.hashColumns.put("act_pl_amt", getActPlAmt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("stnd_cost_cd", getStndCostCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("ioc_cd", "iocCd");
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("agmt_sgn_ofc_cd", "agmtSgnOfcCd");
		this.hashFields.put("ra_pl_amt", "raPlAmt");
		this.hashFields.put("estm_pl_amt", "estmPlAmt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("pl_desc", "plDesc");
		this.hashFields.put("skd_voy_no", "skdVoyNo");
		this.hashFields.put("trd_cd", "trdCd");
		this.hashFields.put("rlane_cd", "rlaneCd");
		this.hashFields.put("skd_dir_cd", "skdDirCd");
		this.hashFields.put("accl_rt_amt", "acclRtAmt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cntr_tpsz_cd", "cntrTpszCd");
		this.hashFields.put("sls_ofc_cd", "slsOfcCd");
		this.hashFields.put("co_amt", "coAmt");
		this.hashFields.put("hjs_sls_amt", "hjsSlsAmt");
		this.hashFields.put("act_pl_amt", "actPlAmt");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("stnd_cost_cd", "stndCostCd");
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
	 * @return iocCd
	 */
	public String getIocCd() {
		return this.iocCd;
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
	 * @return agmtSgnOfcCd
	 */
	public String getAgmtSgnOfcCd() {
		return this.agmtSgnOfcCd;
	}
	
	/**
	 * Column Info
	 * @return raPlAmt
	 */
	public String getRaPlAmt() {
		return this.raPlAmt;
	}
	
	/**
	 * Column Info
	 * @return estmPlAmt
	 */
	public String getEstmPlAmt() {
		return this.estmPlAmt;
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
	 * @return plDesc
	 */
	public String getPlDesc() {
		return this.plDesc;
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
	 * @return rlaneCd
	 */
	public String getRlaneCd() {
		return this.rlaneCd;
	}
	
	/**
	 * Column Info
	 * @return skdDirCd
	 */
	public String getSkdDirCd() {
		return this.skdDirCd;
	}
	
	/**
	 * Column Info
	 * @return acclRtAmt
	 */
	public String getAcclRtAmt() {
		return this.acclRtAmt;
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
	 * @return cntrTpszCd
	 */
	public String getCntrTpszCd() {
		return this.cntrTpszCd;
	}
	
	/**
	 * Column Info
	 * @return slsOfcCd
	 */
	public String getSlsOfcCd() {
		return this.slsOfcCd;
	}
	
	/**
	 * Column Info
	 * @return coAmt
	 */
	public String getCoAmt() {
		return this.coAmt;
	}
	
	/**
	 * Column Info
	 * @return hjsSlsAmt
	 */
	public String getHjsSlsAmt() {
		return this.hjsSlsAmt;
	}
	
	/**
	 * Column Info
	 * @return actPlAmt
	 */
	public String getActPlAmt() {
		return this.actPlAmt;
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
	 * @return stndCostCd
	 */
	public String getStndCostCd() {
		return this.stndCostCd;
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
	 * @param iocCd
	 */
	public void setIocCd(String iocCd) {
		this.iocCd = iocCd;
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
	 * @param agmtSgnOfcCd
	 */
	public void setAgmtSgnOfcCd(String agmtSgnOfcCd) {
		this.agmtSgnOfcCd = agmtSgnOfcCd;
	}
	
	/**
	 * Column Info
	 * @param raPlAmt
	 */
	public void setRaPlAmt(String raPlAmt) {
		this.raPlAmt = raPlAmt;
	}
	
	/**
	 * Column Info
	 * @param estmPlAmt
	 */
	public void setEstmPlAmt(String estmPlAmt) {
		this.estmPlAmt = estmPlAmt;
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
	 * @param plDesc
	 */
	public void setPlDesc(String plDesc) {
		this.plDesc = plDesc;
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
	 * @param rlaneCd
	 */
	public void setRlaneCd(String rlaneCd) {
		this.rlaneCd = rlaneCd;
	}
	
	/**
	 * Column Info
	 * @param skdDirCd
	 */
	public void setSkdDirCd(String skdDirCd) {
		this.skdDirCd = skdDirCd;
	}
	
	/**
	 * Column Info
	 * @param acclRtAmt
	 */
	public void setAcclRtAmt(String acclRtAmt) {
		this.acclRtAmt = acclRtAmt;
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
	 * @param cntrTpszCd
	 */
	public void setCntrTpszCd(String cntrTpszCd) {
		this.cntrTpszCd = cntrTpszCd;
	}
	
	/**
	 * Column Info
	 * @param slsOfcCd
	 */
	public void setSlsOfcCd(String slsOfcCd) {
		this.slsOfcCd = slsOfcCd;
	}
	
	/**
	 * Column Info
	 * @param coAmt
	 */
	public void setCoAmt(String coAmt) {
		this.coAmt = coAmt;
	}
	
	/**
	 * Column Info
	 * @param hjsSlsAmt
	 */
	public void setHjsSlsAmt(String hjsSlsAmt) {
		this.hjsSlsAmt = hjsSlsAmt;
	}
	
	/**
	 * Column Info
	 * @param actPlAmt
	 */
	public void setActPlAmt(String actPlAmt) {
		this.actPlAmt = actPlAmt;
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
	 * @param stndCostCd
	 */
	public void setStndCostCd(String stndCostCd) {
		this.stndCostCd = stndCostCd;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setIocCd(JSPUtil.getParameter(request, "ioc_cd", ""));
		setVslCd(JSPUtil.getParameter(request, "vsl_cd", ""));
		setAgmtSgnOfcCd(JSPUtil.getParameter(request, "agmt_sgn_ofc_cd", ""));
		setRaPlAmt(JSPUtil.getParameter(request, "ra_pl_amt", ""));
		setEstmPlAmt(JSPUtil.getParameter(request, "estm_pl_amt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setPlDesc(JSPUtil.getParameter(request, "pl_desc", ""));
		setSkdVoyNo(JSPUtil.getParameter(request, "skd_voy_no", ""));
		setTrdCd(JSPUtil.getParameter(request, "trd_cd", ""));
		setRlaneCd(JSPUtil.getParameter(request, "rlane_cd", ""));
		setSkdDirCd(JSPUtil.getParameter(request, "skd_dir_cd", ""));
		setAcclRtAmt(JSPUtil.getParameter(request, "accl_rt_amt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCntrTpszCd(JSPUtil.getParameter(request, "cntr_tpsz_cd", ""));
		setSlsOfcCd(JSPUtil.getParameter(request, "sls_ofc_cd", ""));
		setCoAmt(JSPUtil.getParameter(request, "co_amt", ""));
		setHjsSlsAmt(JSPUtil.getParameter(request, "hjs_sls_amt", ""));
		setActPlAmt(JSPUtil.getParameter(request, "act_pl_amt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setStndCostCd(JSPUtil.getParameter(request, "stnd_cost_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return CoaPfitLssSvcTrnsPrcVO[]
	 */
	public CoaPfitLssSvcTrnsPrcVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return CoaPfitLssSvcTrnsPrcVO[]
	 */
	public CoaPfitLssSvcTrnsPrcVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		CoaPfitLssSvcTrnsPrcVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] iocCd = (JSPUtil.getParameter(request, prefix	+ "ioc_cd", length));
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd", length));
			String[] agmtSgnOfcCd = (JSPUtil.getParameter(request, prefix	+ "agmt_sgn_ofc_cd", length));
			String[] raPlAmt = (JSPUtil.getParameter(request, prefix	+ "ra_pl_amt", length));
			String[] estmPlAmt = (JSPUtil.getParameter(request, prefix	+ "estm_pl_amt", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] plDesc = (JSPUtil.getParameter(request, prefix	+ "pl_desc", length));
			String[] skdVoyNo = (JSPUtil.getParameter(request, prefix	+ "skd_voy_no", length));
			String[] trdCd = (JSPUtil.getParameter(request, prefix	+ "trd_cd", length));
			String[] rlaneCd = (JSPUtil.getParameter(request, prefix	+ "rlane_cd", length));
			String[] skdDirCd = (JSPUtil.getParameter(request, prefix	+ "skd_dir_cd", length));
			String[] acclRtAmt = (JSPUtil.getParameter(request, prefix	+ "accl_rt_amt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] cntrTpszCd = (JSPUtil.getParameter(request, prefix	+ "cntr_tpsz_cd", length));
			String[] slsOfcCd = (JSPUtil.getParameter(request, prefix	+ "sls_ofc_cd", length));
			String[] coAmt = (JSPUtil.getParameter(request, prefix	+ "co_amt", length));
			String[] hjsSlsAmt = (JSPUtil.getParameter(request, prefix	+ "hjs_sls_amt", length));
			String[] actPlAmt = (JSPUtil.getParameter(request, prefix	+ "act_pl_amt", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] stndCostCd = (JSPUtil.getParameter(request, prefix	+ "stnd_cost_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new CoaPfitLssSvcTrnsPrcVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (iocCd[i] != null)
					model.setIocCd(iocCd[i]);
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (agmtSgnOfcCd[i] != null)
					model.setAgmtSgnOfcCd(agmtSgnOfcCd[i]);
				if (raPlAmt[i] != null)
					model.setRaPlAmt(raPlAmt[i]);
				if (estmPlAmt[i] != null)
					model.setEstmPlAmt(estmPlAmt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (plDesc[i] != null)
					model.setPlDesc(plDesc[i]);
				if (skdVoyNo[i] != null)
					model.setSkdVoyNo(skdVoyNo[i]);
				if (trdCd[i] != null)
					model.setTrdCd(trdCd[i]);
				if (rlaneCd[i] != null)
					model.setRlaneCd(rlaneCd[i]);
				if (skdDirCd[i] != null)
					model.setSkdDirCd(skdDirCd[i]);
				if (acclRtAmt[i] != null)
					model.setAcclRtAmt(acclRtAmt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (cntrTpszCd[i] != null)
					model.setCntrTpszCd(cntrTpszCd[i]);
				if (slsOfcCd[i] != null)
					model.setSlsOfcCd(slsOfcCd[i]);
				if (coAmt[i] != null)
					model.setCoAmt(coAmt[i]);
				if (hjsSlsAmt[i] != null)
					model.setHjsSlsAmt(hjsSlsAmt[i]);
				if (actPlAmt[i] != null)
					model.setActPlAmt(actPlAmt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (stndCostCd[i] != null)
					model.setStndCostCd(stndCostCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getCoaPfitLssSvcTrnsPrcVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return CoaPfitLssSvcTrnsPrcVO[]
	 */
	public CoaPfitLssSvcTrnsPrcVO[] getCoaPfitLssSvcTrnsPrcVOs(){
		CoaPfitLssSvcTrnsPrcVO[] vos = (CoaPfitLssSvcTrnsPrcVO[])models.toArray(new CoaPfitLssSvcTrnsPrcVO[models.size()]);
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
		this.iocCd = this.iocCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslCd = this.vslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agmtSgnOfcCd = this.agmtSgnOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.raPlAmt = this.raPlAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.estmPlAmt = this.estmPlAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.plDesc = this.plDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdVoyNo = this.skdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trdCd = this.trdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rlaneCd = this.rlaneCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdDirCd = this.skdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.acclRtAmt = this.acclRtAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrTpszCd = this.cntrTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slsOfcCd = this.slsOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.coAmt = this.coAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hjsSlsAmt = this.hjsSlsAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actPlAmt = this.actPlAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stndCostCd = this.stndCostCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
