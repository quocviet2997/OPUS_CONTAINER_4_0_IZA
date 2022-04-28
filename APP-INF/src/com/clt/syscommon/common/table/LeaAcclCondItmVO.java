/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : LeaAcclCondItmVO.java
*@FileTitle : LeaAcclCondItmVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.10.05
*@LastModifier : 전재홍
*@LastVersion : 1.0
* 2009.10.05 전재홍 
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
 * @author 전재홍
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class LeaAcclCondItmVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<LeaAcclCondItmVO> models = new ArrayList<LeaAcclCondItmVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String revVvdIfFlg = null;
	/* Column Info */
	private String monAvgXchRtIfFlg = null;
	/* Column Info */
	private String monAvgXchRtIfKnt = null;
	/* Column Info */
	private String exeYrmon = null;
	/* Column Info */
	private String revVvdIfKnt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String apClzFlg = null;
	/* Column Info */
	private String condCfmFlg = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String erpIfDt = null;
	/* Column Info */
	private String acclBatStsCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String creOfcCd = null;
	/* Column Info */
	private String mnlInpFlg = null;
	/* Column Info */
	private String erpIfFlg = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String updOfcCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public LeaAcclCondItmVO() {}

	public LeaAcclCondItmVO(String ibflag, String pagerows, String exeYrmon, String apClzFlg, String revVvdIfFlg, String revVvdIfKnt, String monAvgXchRtIfFlg, String monAvgXchRtIfKnt, String condCfmFlg, String acclBatStsCd, String mnlInpFlg, String erpIfFlg, String erpIfDt, String creOfcCd, String creUsrId, String creDt, String updOfcCd, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.revVvdIfFlg = revVvdIfFlg;
		this.monAvgXchRtIfFlg = monAvgXchRtIfFlg;
		this.monAvgXchRtIfKnt = monAvgXchRtIfKnt;
		this.exeYrmon = exeYrmon;
		this.revVvdIfKnt = revVvdIfKnt;
		this.creDt = creDt;
		this.apClzFlg = apClzFlg;
		this.condCfmFlg = condCfmFlg;
		this.pagerows = pagerows;
		this.erpIfDt = erpIfDt;
		this.acclBatStsCd = acclBatStsCd;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.creOfcCd = creOfcCd;
		this.mnlInpFlg = mnlInpFlg;
		this.erpIfFlg = erpIfFlg;
		this.updUsrId = updUsrId;
		this.updOfcCd = updOfcCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("rev_vvd_if_flg", getRevVvdIfFlg());
		this.hashColumns.put("mon_avg_xch_rt_if_flg", getMonAvgXchRtIfFlg());
		this.hashColumns.put("mon_avg_xch_rt_if_knt", getMonAvgXchRtIfKnt());
		this.hashColumns.put("exe_yrmon", getExeYrmon());
		this.hashColumns.put("rev_vvd_if_knt", getRevVvdIfKnt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("ap_clz_flg", getApClzFlg());
		this.hashColumns.put("cond_cfm_flg", getCondCfmFlg());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("erp_if_dt", getErpIfDt());
		this.hashColumns.put("accl_bat_sts_cd", getAcclBatStsCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cre_ofc_cd", getCreOfcCd());
		this.hashColumns.put("mnl_inp_flg", getMnlInpFlg());
		this.hashColumns.put("erp_if_flg", getErpIfFlg());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("upd_ofc_cd", getUpdOfcCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("rev_vvd_if_flg", "revVvdIfFlg");
		this.hashFields.put("mon_avg_xch_rt_if_flg", "monAvgXchRtIfFlg");
		this.hashFields.put("mon_avg_xch_rt_if_knt", "monAvgXchRtIfKnt");
		this.hashFields.put("exe_yrmon", "exeYrmon");
		this.hashFields.put("rev_vvd_if_knt", "revVvdIfKnt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("ap_clz_flg", "apClzFlg");
		this.hashFields.put("cond_cfm_flg", "condCfmFlg");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("erp_if_dt", "erpIfDt");
		this.hashFields.put("accl_bat_sts_cd", "acclBatStsCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cre_ofc_cd", "creOfcCd");
		this.hashFields.put("mnl_inp_flg", "mnlInpFlg");
		this.hashFields.put("erp_if_flg", "erpIfFlg");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("upd_ofc_cd", "updOfcCd");
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
	 * @return revVvdIfFlg
	 */
	public String getRevVvdIfFlg() {
		return this.revVvdIfFlg;
	}
	
	/**
	 * Column Info
	 * @return monAvgXchRtIfFlg
	 */
	public String getMonAvgXchRtIfFlg() {
		return this.monAvgXchRtIfFlg;
	}
	
	/**
	 * Column Info
	 * @return monAvgXchRtIfKnt
	 */
	public String getMonAvgXchRtIfKnt() {
		return this.monAvgXchRtIfKnt;
	}
	
	/**
	 * Column Info
	 * @return exeYrmon
	 */
	public String getExeYrmon() {
		return this.exeYrmon;
	}
	
	/**
	 * Column Info
	 * @return revVvdIfKnt
	 */
	public String getRevVvdIfKnt() {
		return this.revVvdIfKnt;
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
	 * @return apClzFlg
	 */
	public String getApClzFlg() {
		return this.apClzFlg;
	}
	
	/**
	 * Column Info
	 * @return condCfmFlg
	 */
	public String getCondCfmFlg() {
		return this.condCfmFlg;
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
	 * @return erpIfDt
	 */
	public String getErpIfDt() {
		return this.erpIfDt;
	}
	
	/**
	 * Column Info
	 * @return acclBatStsCd
	 */
	public String getAcclBatStsCd() {
		return this.acclBatStsCd;
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
	 * @return creOfcCd
	 */
	public String getCreOfcCd() {
		return this.creOfcCd;
	}
	
	/**
	 * Column Info
	 * @return mnlInpFlg
	 */
	public String getMnlInpFlg() {
		return this.mnlInpFlg;
	}
	
	/**
	 * Column Info
	 * @return erpIfFlg
	 */
	public String getErpIfFlg() {
		return this.erpIfFlg;
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
	 * @return updOfcCd
	 */
	public String getUpdOfcCd() {
		return this.updOfcCd;
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
	 * @param revVvdIfFlg
	 */
	public void setRevVvdIfFlg(String revVvdIfFlg) {
		this.revVvdIfFlg = revVvdIfFlg;
	}
	
	/**
	 * Column Info
	 * @param monAvgXchRtIfFlg
	 */
	public void setMonAvgXchRtIfFlg(String monAvgXchRtIfFlg) {
		this.monAvgXchRtIfFlg = monAvgXchRtIfFlg;
	}
	
	/**
	 * Column Info
	 * @param monAvgXchRtIfKnt
	 */
	public void setMonAvgXchRtIfKnt(String monAvgXchRtIfKnt) {
		this.monAvgXchRtIfKnt = monAvgXchRtIfKnt;
	}
	
	/**
	 * Column Info
	 * @param exeYrmon
	 */
	public void setExeYrmon(String exeYrmon) {
		this.exeYrmon = exeYrmon;
	}
	
	/**
	 * Column Info
	 * @param revVvdIfKnt
	 */
	public void setRevVvdIfKnt(String revVvdIfKnt) {
		this.revVvdIfKnt = revVvdIfKnt;
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
	 * @param apClzFlg
	 */
	public void setApClzFlg(String apClzFlg) {
		this.apClzFlg = apClzFlg;
	}
	
	/**
	 * Column Info
	 * @param condCfmFlg
	 */
	public void setCondCfmFlg(String condCfmFlg) {
		this.condCfmFlg = condCfmFlg;
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
	 * @param erpIfDt
	 */
	public void setErpIfDt(String erpIfDt) {
		this.erpIfDt = erpIfDt;
	}
	
	/**
	 * Column Info
	 * @param acclBatStsCd
	 */
	public void setAcclBatStsCd(String acclBatStsCd) {
		this.acclBatStsCd = acclBatStsCd;
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
	 * @param creOfcCd
	 */
	public void setCreOfcCd(String creOfcCd) {
		this.creOfcCd = creOfcCd;
	}
	
	/**
	 * Column Info
	 * @param mnlInpFlg
	 */
	public void setMnlInpFlg(String mnlInpFlg) {
		this.mnlInpFlg = mnlInpFlg;
	}
	
	/**
	 * Column Info
	 * @param erpIfFlg
	 */
	public void setErpIfFlg(String erpIfFlg) {
		this.erpIfFlg = erpIfFlg;
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
	 * @param updOfcCd
	 */
	public void setUpdOfcCd(String updOfcCd) {
		this.updOfcCd = updOfcCd;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setRevVvdIfFlg(JSPUtil.getParameter(request, "rev_vvd_if_flg", ""));
		setMonAvgXchRtIfFlg(JSPUtil.getParameter(request, "mon_avg_xch_rt_if_flg", ""));
		setMonAvgXchRtIfKnt(JSPUtil.getParameter(request, "mon_avg_xch_rt_if_knt", ""));
		setExeYrmon(JSPUtil.getParameter(request, "exe_yrmon", ""));
		setRevVvdIfKnt(JSPUtil.getParameter(request, "rev_vvd_if_knt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setApClzFlg(JSPUtil.getParameter(request, "ap_clz_flg", ""));
		setCondCfmFlg(JSPUtil.getParameter(request, "cond_cfm_flg", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setErpIfDt(JSPUtil.getParameter(request, "erp_if_dt", ""));
		setAcclBatStsCd(JSPUtil.getParameter(request, "accl_bat_sts_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCreOfcCd(JSPUtil.getParameter(request, "cre_ofc_cd", ""));
		setMnlInpFlg(JSPUtil.getParameter(request, "mnl_inp_flg", ""));
		setErpIfFlg(JSPUtil.getParameter(request, "erp_if_flg", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setUpdOfcCd(JSPUtil.getParameter(request, "upd_ofc_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return LeaAcclCondItmVO[]
	 */
	public LeaAcclCondItmVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return LeaAcclCondItmVO[]
	 */
	public LeaAcclCondItmVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		LeaAcclCondItmVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] revVvdIfFlg = (JSPUtil.getParameter(request, prefix	+ "rev_vvd_if_flg", length));
			String[] monAvgXchRtIfFlg = (JSPUtil.getParameter(request, prefix	+ "mon_avg_xch_rt_if_flg", length));
			String[] monAvgXchRtIfKnt = (JSPUtil.getParameter(request, prefix	+ "mon_avg_xch_rt_if_knt", length));
			String[] exeYrmon = (JSPUtil.getParameter(request, prefix	+ "exe_yrmon", length));
			String[] revVvdIfKnt = (JSPUtil.getParameter(request, prefix	+ "rev_vvd_if_knt", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] apClzFlg = (JSPUtil.getParameter(request, prefix	+ "ap_clz_flg", length));
			String[] condCfmFlg = (JSPUtil.getParameter(request, prefix	+ "cond_cfm_flg", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] erpIfDt = (JSPUtil.getParameter(request, prefix	+ "erp_if_dt", length));
			String[] acclBatStsCd = (JSPUtil.getParameter(request, prefix	+ "accl_bat_sts_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] creOfcCd = (JSPUtil.getParameter(request, prefix	+ "cre_ofc_cd", length));
			String[] mnlInpFlg = (JSPUtil.getParameter(request, prefix	+ "mnl_inp_flg", length));
			String[] erpIfFlg = (JSPUtil.getParameter(request, prefix	+ "erp_if_flg", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] updOfcCd = (JSPUtil.getParameter(request, prefix	+ "upd_ofc_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new LeaAcclCondItmVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (revVvdIfFlg[i] != null)
					model.setRevVvdIfFlg(revVvdIfFlg[i]);
				if (monAvgXchRtIfFlg[i] != null)
					model.setMonAvgXchRtIfFlg(monAvgXchRtIfFlg[i]);
				if (monAvgXchRtIfKnt[i] != null)
					model.setMonAvgXchRtIfKnt(monAvgXchRtIfKnt[i]);
				if (exeYrmon[i] != null)
					model.setExeYrmon(exeYrmon[i]);
				if (revVvdIfKnt[i] != null)
					model.setRevVvdIfKnt(revVvdIfKnt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (apClzFlg[i] != null)
					model.setApClzFlg(apClzFlg[i]);
				if (condCfmFlg[i] != null)
					model.setCondCfmFlg(condCfmFlg[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (erpIfDt[i] != null)
					model.setErpIfDt(erpIfDt[i]);
				if (acclBatStsCd[i] != null)
					model.setAcclBatStsCd(acclBatStsCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (creOfcCd[i] != null)
					model.setCreOfcCd(creOfcCd[i]);
				if (mnlInpFlg[i] != null)
					model.setMnlInpFlg(mnlInpFlg[i]);
				if (erpIfFlg[i] != null)
					model.setErpIfFlg(erpIfFlg[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (updOfcCd[i] != null)
					model.setUpdOfcCd(updOfcCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getLeaAcclCondItmVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return LeaAcclCondItmVO[]
	 */
	public LeaAcclCondItmVO[] getLeaAcclCondItmVOs(){
		LeaAcclCondItmVO[] vos = (LeaAcclCondItmVO[])models.toArray(new LeaAcclCondItmVO[models.size()]);
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
		this.revVvdIfFlg = this.revVvdIfFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.monAvgXchRtIfFlg = this.monAvgXchRtIfFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.monAvgXchRtIfKnt = this.monAvgXchRtIfKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.exeYrmon = this.exeYrmon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.revVvdIfKnt = this.revVvdIfKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.apClzFlg = this.apClzFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.condCfmFlg = this.condCfmFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.erpIfDt = this.erpIfDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.acclBatStsCd = this.acclBatStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creOfcCd = this.creOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mnlInpFlg = this.mnlInpFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.erpIfFlg = this.erpIfFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updOfcCd = this.updOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
