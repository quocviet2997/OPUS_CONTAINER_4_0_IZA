/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : SpeActGrpTrspTolRtoVO.java
*@FileTitle : SpeActGrpTrspTolRtoVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.20
*@LastModifier : 남궁진호
*@LastVersion : 1.0
* 2009.07.20 남궁진호 
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
 * @author 남궁진호
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class SpeActGrpTrspTolRtoVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<SpeActGrpTrspTolRtoVO> models = new ArrayList<SpeActGrpTrspTolRtoVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String trspSvcTolRto = null;
	/* Column Info */
	private String costActGrpCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String otActDepCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String otActSeq = null;
	/* Column Info */
	private String costActGrpNm = null;
	/* Page Number */
	private String pagerows = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public SpeActGrpTrspTolRtoVO() {}

	public SpeActGrpTrspTolRtoVO(String ibflag, String pagerows, String costActGrpCd, String costActGrpNm, String trspSvcTolRto, String otActSeq, String otActDepCd, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.creUsrId = creUsrId;
		this.trspSvcTolRto = trspSvcTolRto;
		this.costActGrpCd = costActGrpCd;
		this.ibflag = ibflag;
		this.otActDepCd = otActDepCd;
		this.creDt = creDt;
		this.updUsrId = updUsrId;
		this.otActSeq = otActSeq;
		this.costActGrpNm = costActGrpNm;
		this.pagerows = pagerows;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("trsp_svc_tol_rto", getTrspSvcTolRto());
		this.hashColumns.put("cost_act_grp_cd", getCostActGrpCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("ot_act_dep_cd", getOtActDepCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("ot_act_seq", getOtActSeq());
		this.hashColumns.put("cost_act_grp_nm", getCostActGrpNm());
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
		this.hashFields.put("trsp_svc_tol_rto", "trspSvcTolRto");
		this.hashFields.put("cost_act_grp_cd", "costActGrpCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("ot_act_dep_cd", "otActDepCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("ot_act_seq", "otActSeq");
		this.hashFields.put("cost_act_grp_nm", "costActGrpNm");
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
	 * @return trspSvcTolRto
	 */
	public String getTrspSvcTolRto() {
		return this.trspSvcTolRto;
	}
	
	/**
	 * Column Info
	 * @return costActGrpCd
	 */
	public String getCostActGrpCd() {
		return this.costActGrpCd;
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
	 * @return otActDepCd
	 */
	public String getOtActDepCd() {
		return this.otActDepCd;
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
	 * @return updUsrId
	 */
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	
	/**
	 * Column Info
	 * @return otActSeq
	 */
	public String getOtActSeq() {
		return this.otActSeq;
	}
	
	/**
	 * Column Info
	 * @return costActGrpNm
	 */
	public String getCostActGrpNm() {
		return this.costActGrpNm;
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
	 * @param trspSvcTolRto
	 */
	public void setTrspSvcTolRto(String trspSvcTolRto) {
		this.trspSvcTolRto = trspSvcTolRto;
	}
	
	/**
	 * Column Info
	 * @param costActGrpCd
	 */
	public void setCostActGrpCd(String costActGrpCd) {
		this.costActGrpCd = costActGrpCd;
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
	 * @param otActDepCd
	 */
	public void setOtActDepCd(String otActDepCd) {
		this.otActDepCd = otActDepCd;
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
	 * @param updUsrId
	 */
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
	}
	
	/**
	 * Column Info
	 * @param otActSeq
	 */
	public void setOtActSeq(String otActSeq) {
		this.otActSeq = otActSeq;
	}
	
	/**
	 * Column Info
	 * @param costActGrpNm
	 */
	public void setCostActGrpNm(String costActGrpNm) {
		this.costActGrpNm = costActGrpNm;
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
		setTrspSvcTolRto(JSPUtil.getParameter(request, "trsp_svc_tol_rto", ""));
		setCostActGrpCd(JSPUtil.getParameter(request, "cost_act_grp_cd", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setOtActDepCd(JSPUtil.getParameter(request, "ot_act_dep_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setOtActSeq(JSPUtil.getParameter(request, "ot_act_seq", ""));
		setCostActGrpNm(JSPUtil.getParameter(request, "cost_act_grp_nm", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return SpeActGrpTrspTolRtoVO[]
	 */
	public SpeActGrpTrspTolRtoVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return SpeActGrpTrspTolRtoVO[]
	 */
	public SpeActGrpTrspTolRtoVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		SpeActGrpTrspTolRtoVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] trspSvcTolRto = (JSPUtil.getParameter(request, prefix	+ "trsp_svc_tol_rto", length));
			String[] costActGrpCd = (JSPUtil.getParameter(request, prefix	+ "cost_act_grp_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] otActDepCd = (JSPUtil.getParameter(request, prefix	+ "ot_act_dep_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] otActSeq = (JSPUtil.getParameter(request, prefix	+ "ot_act_seq", length));
			String[] costActGrpNm = (JSPUtil.getParameter(request, prefix	+ "cost_act_grp_nm", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			
			for (int i = 0; i < length; i++) {
				model = new SpeActGrpTrspTolRtoVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (trspSvcTolRto[i] != null)
					model.setTrspSvcTolRto(trspSvcTolRto[i]);
				if (costActGrpCd[i] != null)
					model.setCostActGrpCd(costActGrpCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (otActDepCd[i] != null)
					model.setOtActDepCd(otActDepCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (otActSeq[i] != null)
					model.setOtActSeq(otActSeq[i]);
				if (costActGrpNm[i] != null)
					model.setCostActGrpNm(costActGrpNm[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getSpeActGrpTrspTolRtoVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return SpeActGrpTrspTolRtoVO[]
	 */
	public SpeActGrpTrspTolRtoVO[] getSpeActGrpTrspTolRtoVOs(){
		SpeActGrpTrspTolRtoVO[] vos = (SpeActGrpTrspTolRtoVO[])models.toArray(new SpeActGrpTrspTolRtoVO[models.size()]);
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
		this.trspSvcTolRto = this.trspSvcTolRto .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costActGrpCd = this.costActGrpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.otActDepCd = this.otActDepCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.otActSeq = this.otActSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costActGrpNm = this.costActGrpNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
