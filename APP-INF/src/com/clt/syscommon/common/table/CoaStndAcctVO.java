/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CoaStndAcctVO.java
*@FileTitle : CoaStndAcctVO
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

public class CoaStndAcctVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<CoaStndAcctVO> models = new ArrayList<CoaStndAcctVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String mgrpCostCd = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String raStndCostDesc = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String coaCostSrcPrtCd = null;
	/* Column Info */
	private String sgrpCostCd = null;
	/* Column Info */
	private String raAcctCd = null;
	/* Column Info */
	private String raMnCostCd = null;
	/* Column Info */
	private String hirScpFlg = null;
	/* Column Info */
	private String stndCostNm = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String perfVwCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String acctDpSeq = null;
	/* Column Info */
	private String raSgrpCostCd = null;
	/* Column Info */
	private String raPerfVwCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String stndCostCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public CoaStndAcctVO() {}

	public CoaStndAcctVO(String ibflag, String pagerows, String stndCostCd, String stndCostNm, String mgrpCostCd, String sgrpCostCd, String perfVwCd, String raStndCostDesc, String raAcctCd, String raMnCostCd, String raSgrpCostCd, String raPerfVwCd, String hirScpFlg, String acctDpSeq, String coaCostSrcPrtCd, String deltFlg, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.mgrpCostCd = mgrpCostCd;
		this.deltFlg = deltFlg;
		this.raStndCostDesc = raStndCostDesc;
		this.creDt = creDt;
		this.coaCostSrcPrtCd = coaCostSrcPrtCd;
		this.sgrpCostCd = sgrpCostCd;
		this.raAcctCd = raAcctCd;
		this.raMnCostCd = raMnCostCd;
		this.hirScpFlg = hirScpFlg;
		this.stndCostNm = stndCostNm;
		this.pagerows = pagerows;
		this.perfVwCd = perfVwCd;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.acctDpSeq = acctDpSeq;
		this.raSgrpCostCd = raSgrpCostCd;
		this.raPerfVwCd = raPerfVwCd;
		this.updUsrId = updUsrId;
		this.stndCostCd = stndCostCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("mgrp_cost_cd", getMgrpCostCd());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("ra_stnd_cost_desc", getRaStndCostDesc());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("coa_cost_src_prt_cd", getCoaCostSrcPrtCd());
		this.hashColumns.put("sgrp_cost_cd", getSgrpCostCd());
		this.hashColumns.put("ra_acct_cd", getRaAcctCd());
		this.hashColumns.put("ra_mn_cost_cd", getRaMnCostCd());
		this.hashColumns.put("hir_scp_flg", getHirScpFlg());
		this.hashColumns.put("stnd_cost_nm", getStndCostNm());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("perf_vw_cd", getPerfVwCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("acct_dp_seq", getAcctDpSeq());
		this.hashColumns.put("ra_sgrp_cost_cd", getRaSgrpCostCd());
		this.hashColumns.put("ra_perf_vw_cd", getRaPerfVwCd());
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
		this.hashFields.put("mgrp_cost_cd", "mgrpCostCd");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("ra_stnd_cost_desc", "raStndCostDesc");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("coa_cost_src_prt_cd", "coaCostSrcPrtCd");
		this.hashFields.put("sgrp_cost_cd", "sgrpCostCd");
		this.hashFields.put("ra_acct_cd", "raAcctCd");
		this.hashFields.put("ra_mn_cost_cd", "raMnCostCd");
		this.hashFields.put("hir_scp_flg", "hirScpFlg");
		this.hashFields.put("stnd_cost_nm", "stndCostNm");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("perf_vw_cd", "perfVwCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("acct_dp_seq", "acctDpSeq");
		this.hashFields.put("ra_sgrp_cost_cd", "raSgrpCostCd");
		this.hashFields.put("ra_perf_vw_cd", "raPerfVwCd");
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
	 * @return mgrpCostCd
	 */
	public String getMgrpCostCd() {
		return this.mgrpCostCd;
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
	 * @return raStndCostDesc
	 */
	public String getRaStndCostDesc() {
		return this.raStndCostDesc;
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
	 * @return coaCostSrcPrtCd
	 */
	public String getCoaCostSrcPrtCd() {
		return this.coaCostSrcPrtCd;
	}
	
	/**
	 * Column Info
	 * @return sgrpCostCd
	 */
	public String getSgrpCostCd() {
		return this.sgrpCostCd;
	}
	
	/**
	 * Column Info
	 * @return raAcctCd
	 */
	public String getRaAcctCd() {
		return this.raAcctCd;
	}
	
	/**
	 * Column Info
	 * @return raMnCostCd
	 */
	public String getRaMnCostCd() {
		return this.raMnCostCd;
	}
	
	/**
	 * Column Info
	 * @return hirScpFlg
	 */
	public String getHirScpFlg() {
		return this.hirScpFlg;
	}
	
	/**
	 * Column Info
	 * @return stndCostNm
	 */
	public String getStndCostNm() {
		return this.stndCostNm;
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
	 * @return perfVwCd
	 */
	public String getPerfVwCd() {
		return this.perfVwCd;
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
	 * @return acctDpSeq
	 */
	public String getAcctDpSeq() {
		return this.acctDpSeq;
	}
	
	/**
	 * Column Info
	 * @return raSgrpCostCd
	 */
	public String getRaSgrpCostCd() {
		return this.raSgrpCostCd;
	}
	
	/**
	 * Column Info
	 * @return raPerfVwCd
	 */
	public String getRaPerfVwCd() {
		return this.raPerfVwCd;
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
	 * @param mgrpCostCd
	 */
	public void setMgrpCostCd(String mgrpCostCd) {
		this.mgrpCostCd = mgrpCostCd;
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
	 * @param raStndCostDesc
	 */
	public void setRaStndCostDesc(String raStndCostDesc) {
		this.raStndCostDesc = raStndCostDesc;
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
	 * @param coaCostSrcPrtCd
	 */
	public void setCoaCostSrcPrtCd(String coaCostSrcPrtCd) {
		this.coaCostSrcPrtCd = coaCostSrcPrtCd;
	}
	
	/**
	 * Column Info
	 * @param sgrpCostCd
	 */
	public void setSgrpCostCd(String sgrpCostCd) {
		this.sgrpCostCd = sgrpCostCd;
	}
	
	/**
	 * Column Info
	 * @param raAcctCd
	 */
	public void setRaAcctCd(String raAcctCd) {
		this.raAcctCd = raAcctCd;
	}
	
	/**
	 * Column Info
	 * @param raMnCostCd
	 */
	public void setRaMnCostCd(String raMnCostCd) {
		this.raMnCostCd = raMnCostCd;
	}
	
	/**
	 * Column Info
	 * @param hirScpFlg
	 */
	public void setHirScpFlg(String hirScpFlg) {
		this.hirScpFlg = hirScpFlg;
	}
	
	/**
	 * Column Info
	 * @param stndCostNm
	 */
	public void setStndCostNm(String stndCostNm) {
		this.stndCostNm = stndCostNm;
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
	 * @param perfVwCd
	 */
	public void setPerfVwCd(String perfVwCd) {
		this.perfVwCd = perfVwCd;
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
	 * @param acctDpSeq
	 */
	public void setAcctDpSeq(String acctDpSeq) {
		this.acctDpSeq = acctDpSeq;
	}
	
	/**
	 * Column Info
	 * @param raSgrpCostCd
	 */
	public void setRaSgrpCostCd(String raSgrpCostCd) {
		this.raSgrpCostCd = raSgrpCostCd;
	}
	
	/**
	 * Column Info
	 * @param raPerfVwCd
	 */
	public void setRaPerfVwCd(String raPerfVwCd) {
		this.raPerfVwCd = raPerfVwCd;
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
		setMgrpCostCd(JSPUtil.getParameter(request, "mgrp_cost_cd", ""));
		setDeltFlg(JSPUtil.getParameter(request, "delt_flg", ""));
		setRaStndCostDesc(JSPUtil.getParameter(request, "ra_stnd_cost_desc", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setCoaCostSrcPrtCd(JSPUtil.getParameter(request, "coa_cost_src_prt_cd", ""));
		setSgrpCostCd(JSPUtil.getParameter(request, "sgrp_cost_cd", ""));
		setRaAcctCd(JSPUtil.getParameter(request, "ra_acct_cd", ""));
		setRaMnCostCd(JSPUtil.getParameter(request, "ra_mn_cost_cd", ""));
		setHirScpFlg(JSPUtil.getParameter(request, "hir_scp_flg", ""));
		setStndCostNm(JSPUtil.getParameter(request, "stnd_cost_nm", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setPerfVwCd(JSPUtil.getParameter(request, "perf_vw_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setAcctDpSeq(JSPUtil.getParameter(request, "acct_dp_seq", ""));
		setRaSgrpCostCd(JSPUtil.getParameter(request, "ra_sgrp_cost_cd", ""));
		setRaPerfVwCd(JSPUtil.getParameter(request, "ra_perf_vw_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setStndCostCd(JSPUtil.getParameter(request, "stnd_cost_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return CoaStndAcctVO[]
	 */
	public CoaStndAcctVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return CoaStndAcctVO[]
	 */
	public CoaStndAcctVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		CoaStndAcctVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] mgrpCostCd = (JSPUtil.getParameter(request, prefix	+ "mgrp_cost_cd", length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg", length));
			String[] raStndCostDesc = (JSPUtil.getParameter(request, prefix	+ "ra_stnd_cost_desc", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] coaCostSrcPrtCd = (JSPUtil.getParameter(request, prefix	+ "coa_cost_src_prt_cd", length));
			String[] sgrpCostCd = (JSPUtil.getParameter(request, prefix	+ "sgrp_cost_cd", length));
			String[] raAcctCd = (JSPUtil.getParameter(request, prefix	+ "ra_acct_cd", length));
			String[] raMnCostCd = (JSPUtil.getParameter(request, prefix	+ "ra_mn_cost_cd", length));
			String[] hirScpFlg = (JSPUtil.getParameter(request, prefix	+ "hir_scp_flg", length));
			String[] stndCostNm = (JSPUtil.getParameter(request, prefix	+ "stnd_cost_nm", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] perfVwCd = (JSPUtil.getParameter(request, prefix	+ "perf_vw_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] acctDpSeq = (JSPUtil.getParameter(request, prefix	+ "acct_dp_seq", length));
			String[] raSgrpCostCd = (JSPUtil.getParameter(request, prefix	+ "ra_sgrp_cost_cd", length));
			String[] raPerfVwCd = (JSPUtil.getParameter(request, prefix	+ "ra_perf_vw_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] stndCostCd = (JSPUtil.getParameter(request, prefix	+ "stnd_cost_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new CoaStndAcctVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (mgrpCostCd[i] != null)
					model.setMgrpCostCd(mgrpCostCd[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (raStndCostDesc[i] != null)
					model.setRaStndCostDesc(raStndCostDesc[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (coaCostSrcPrtCd[i] != null)
					model.setCoaCostSrcPrtCd(coaCostSrcPrtCd[i]);
				if (sgrpCostCd[i] != null)
					model.setSgrpCostCd(sgrpCostCd[i]);
				if (raAcctCd[i] != null)
					model.setRaAcctCd(raAcctCd[i]);
				if (raMnCostCd[i] != null)
					model.setRaMnCostCd(raMnCostCd[i]);
				if (hirScpFlg[i] != null)
					model.setHirScpFlg(hirScpFlg[i]);
				if (stndCostNm[i] != null)
					model.setStndCostNm(stndCostNm[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (perfVwCd[i] != null)
					model.setPerfVwCd(perfVwCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (acctDpSeq[i] != null)
					model.setAcctDpSeq(acctDpSeq[i]);
				if (raSgrpCostCd[i] != null)
					model.setRaSgrpCostCd(raSgrpCostCd[i]);
				if (raPerfVwCd[i] != null)
					model.setRaPerfVwCd(raPerfVwCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (stndCostCd[i] != null)
					model.setStndCostCd(stndCostCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getCoaStndAcctVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return CoaStndAcctVO[]
	 */
	public CoaStndAcctVO[] getCoaStndAcctVOs(){
		CoaStndAcctVO[] vos = (CoaStndAcctVO[])models.toArray(new CoaStndAcctVO[models.size()]);
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
		this.mgrpCostCd = this.mgrpCostCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.raStndCostDesc = this.raStndCostDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.coaCostSrcPrtCd = this.coaCostSrcPrtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sgrpCostCd = this.sgrpCostCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.raAcctCd = this.raAcctCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.raMnCostCd = this.raMnCostCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hirScpFlg = this.hirScpFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stndCostNm = this.stndCostNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.perfVwCd = this.perfVwCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.acctDpSeq = this.acctDpSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.raSgrpCostCd = this.raSgrpCostCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.raPerfVwCd = this.raPerfVwCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stndCostCd = this.stndCostCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
