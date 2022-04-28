/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CoaTrnsTermCalcVO.java
*@FileTitle : CoaTrnsTermCalcVO
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

public class CoaTrnsTermCalcVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<CoaTrnsTermCalcVO> models = new ArrayList<CoaTrnsTermCalcVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String wtrTermCd = null;
	/* Column Info */
	private String nxtNodThrpRto = null;
	/* Column Info */
	private String nxtNodTmlRto = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String nodTmlRto = null;
	/* Column Info */
	private String nxtNodStvgRto = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String termCalcDesc = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String costActGrpCd = null;
	/* Column Info */
	private String wtrModFlg = null;
	/* Column Info */
	private String calcTermCd = null;
	/* Column Info */
	private String nodStvgRto = null;
	/* Column Info */
	private String nodThrpRto = null;
	/* Column Info */
	private String updUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public CoaTrnsTermCalcVO() {}

	public CoaTrnsTermCalcVO(String ibflag, String pagerows, String costActGrpCd, String calcTermCd, String wtrTermCd, String wtrModFlg, String nodStvgRto, String nodThrpRto, String nodTmlRto, String nxtNodStvgRto, String nxtNodThrpRto, String nxtNodTmlRto, String termCalcDesc, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.wtrTermCd = wtrTermCd;
		this.nxtNodThrpRto = nxtNodThrpRto;
		this.nxtNodTmlRto = nxtNodTmlRto;
		this.creDt = creDt;
		this.nodTmlRto = nodTmlRto;
		this.nxtNodStvgRto = nxtNodStvgRto;
		this.pagerows = pagerows;
		this.termCalcDesc = termCalcDesc;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.costActGrpCd = costActGrpCd;
		this.wtrModFlg = wtrModFlg;
		this.calcTermCd = calcTermCd;
		this.nodStvgRto = nodStvgRto;
		this.nodThrpRto = nodThrpRto;
		this.updUsrId = updUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("wtr_term_cd", getWtrTermCd());
		this.hashColumns.put("nxt_nod_thrp_rto", getNxtNodThrpRto());
		this.hashColumns.put("nxt_nod_tml_rto", getNxtNodTmlRto());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("nod_tml_rto", getNodTmlRto());
		this.hashColumns.put("nxt_nod_stvg_rto", getNxtNodStvgRto());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("term_calc_desc", getTermCalcDesc());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cost_act_grp_cd", getCostActGrpCd());
		this.hashColumns.put("wtr_mod_flg", getWtrModFlg());
		this.hashColumns.put("calc_term_cd", getCalcTermCd());
		this.hashColumns.put("nod_stvg_rto", getNodStvgRto());
		this.hashColumns.put("nod_thrp_rto", getNodThrpRto());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("wtr_term_cd", "wtrTermCd");
		this.hashFields.put("nxt_nod_thrp_rto", "nxtNodThrpRto");
		this.hashFields.put("nxt_nod_tml_rto", "nxtNodTmlRto");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("nod_tml_rto", "nodTmlRto");
		this.hashFields.put("nxt_nod_stvg_rto", "nxtNodStvgRto");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("term_calc_desc", "termCalcDesc");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cost_act_grp_cd", "costActGrpCd");
		this.hashFields.put("wtr_mod_flg", "wtrModFlg");
		this.hashFields.put("calc_term_cd", "calcTermCd");
		this.hashFields.put("nod_stvg_rto", "nodStvgRto");
		this.hashFields.put("nod_thrp_rto", "nodThrpRto");
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
	 * @return wtrTermCd
	 */
	public String getWtrTermCd() {
		return this.wtrTermCd;
	}
	
	/**
	 * Column Info
	 * @return nxtNodThrpRto
	 */
	public String getNxtNodThrpRto() {
		return this.nxtNodThrpRto;
	}
	
	/**
	 * Column Info
	 * @return nxtNodTmlRto
	 */
	public String getNxtNodTmlRto() {
		return this.nxtNodTmlRto;
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
	 * @return nodTmlRto
	 */
	public String getNodTmlRto() {
		return this.nodTmlRto;
	}
	
	/**
	 * Column Info
	 * @return nxtNodStvgRto
	 */
	public String getNxtNodStvgRto() {
		return this.nxtNodStvgRto;
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
	 * @return termCalcDesc
	 */
	public String getTermCalcDesc() {
		return this.termCalcDesc;
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
	 * @return costActGrpCd
	 */
	public String getCostActGrpCd() {
		return this.costActGrpCd;
	}
	
	/**
	 * Column Info
	 * @return wtrModFlg
	 */
	public String getWtrModFlg() {
		return this.wtrModFlg;
	}
	
	/**
	 * Column Info
	 * @return calcTermCd
	 */
	public String getCalcTermCd() {
		return this.calcTermCd;
	}
	
	/**
	 * Column Info
	 * @return nodStvgRto
	 */
	public String getNodStvgRto() {
		return this.nodStvgRto;
	}
	
	/**
	 * Column Info
	 * @return nodThrpRto
	 */
	public String getNodThrpRto() {
		return this.nodThrpRto;
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
	 * @param wtrTermCd
	 */
	public void setWtrTermCd(String wtrTermCd) {
		this.wtrTermCd = wtrTermCd;
	}
	
	/**
	 * Column Info
	 * @param nxtNodThrpRto
	 */
	public void setNxtNodThrpRto(String nxtNodThrpRto) {
		this.nxtNodThrpRto = nxtNodThrpRto;
	}
	
	/**
	 * Column Info
	 * @param nxtNodTmlRto
	 */
	public void setNxtNodTmlRto(String nxtNodTmlRto) {
		this.nxtNodTmlRto = nxtNodTmlRto;
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
	 * @param nodTmlRto
	 */
	public void setNodTmlRto(String nodTmlRto) {
		this.nodTmlRto = nodTmlRto;
	}
	
	/**
	 * Column Info
	 * @param nxtNodStvgRto
	 */
	public void setNxtNodStvgRto(String nxtNodStvgRto) {
		this.nxtNodStvgRto = nxtNodStvgRto;
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
	 * @param termCalcDesc
	 */
	public void setTermCalcDesc(String termCalcDesc) {
		this.termCalcDesc = termCalcDesc;
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
	 * @param costActGrpCd
	 */
	public void setCostActGrpCd(String costActGrpCd) {
		this.costActGrpCd = costActGrpCd;
	}
	
	/**
	 * Column Info
	 * @param wtrModFlg
	 */
	public void setWtrModFlg(String wtrModFlg) {
		this.wtrModFlg = wtrModFlg;
	}
	
	/**
	 * Column Info
	 * @param calcTermCd
	 */
	public void setCalcTermCd(String calcTermCd) {
		this.calcTermCd = calcTermCd;
	}
	
	/**
	 * Column Info
	 * @param nodStvgRto
	 */
	public void setNodStvgRto(String nodStvgRto) {
		this.nodStvgRto = nodStvgRto;
	}
	
	/**
	 * Column Info
	 * @param nodThrpRto
	 */
	public void setNodThrpRto(String nodThrpRto) {
		this.nodThrpRto = nodThrpRto;
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
		setWtrTermCd(JSPUtil.getParameter(request, "wtr_term_cd", ""));
		setNxtNodThrpRto(JSPUtil.getParameter(request, "nxt_nod_thrp_rto", ""));
		setNxtNodTmlRto(JSPUtil.getParameter(request, "nxt_nod_tml_rto", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setNodTmlRto(JSPUtil.getParameter(request, "nod_tml_rto", ""));
		setNxtNodStvgRto(JSPUtil.getParameter(request, "nxt_nod_stvg_rto", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setTermCalcDesc(JSPUtil.getParameter(request, "term_calc_desc", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCostActGrpCd(JSPUtil.getParameter(request, "cost_act_grp_cd", ""));
		setWtrModFlg(JSPUtil.getParameter(request, "wtr_mod_flg", ""));
		setCalcTermCd(JSPUtil.getParameter(request, "calc_term_cd", ""));
		setNodStvgRto(JSPUtil.getParameter(request, "nod_stvg_rto", ""));
		setNodThrpRto(JSPUtil.getParameter(request, "nod_thrp_rto", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return CoaTrnsTermCalcVO[]
	 */
	public CoaTrnsTermCalcVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return CoaTrnsTermCalcVO[]
	 */
	public CoaTrnsTermCalcVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		CoaTrnsTermCalcVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] wtrTermCd = (JSPUtil.getParameter(request, prefix	+ "wtr_term_cd", length));
			String[] nxtNodThrpRto = (JSPUtil.getParameter(request, prefix	+ "nxt_nod_thrp_rto", length));
			String[] nxtNodTmlRto = (JSPUtil.getParameter(request, prefix	+ "nxt_nod_tml_rto", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] nodTmlRto = (JSPUtil.getParameter(request, prefix	+ "nod_tml_rto", length));
			String[] nxtNodStvgRto = (JSPUtil.getParameter(request, prefix	+ "nxt_nod_stvg_rto", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] termCalcDesc = (JSPUtil.getParameter(request, prefix	+ "term_calc_desc", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] costActGrpCd = (JSPUtil.getParameter(request, prefix	+ "cost_act_grp_cd", length));
			String[] wtrModFlg = (JSPUtil.getParameter(request, prefix	+ "wtr_mod_flg", length));
			String[] calcTermCd = (JSPUtil.getParameter(request, prefix	+ "calc_term_cd", length));
			String[] nodStvgRto = (JSPUtil.getParameter(request, prefix	+ "nod_stvg_rto", length));
			String[] nodThrpRto = (JSPUtil.getParameter(request, prefix	+ "nod_thrp_rto", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			
			for (int i = 0; i < length; i++) {
				model = new CoaTrnsTermCalcVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (wtrTermCd[i] != null)
					model.setWtrTermCd(wtrTermCd[i]);
				if (nxtNodThrpRto[i] != null)
					model.setNxtNodThrpRto(nxtNodThrpRto[i]);
				if (nxtNodTmlRto[i] != null)
					model.setNxtNodTmlRto(nxtNodTmlRto[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (nodTmlRto[i] != null)
					model.setNodTmlRto(nodTmlRto[i]);
				if (nxtNodStvgRto[i] != null)
					model.setNxtNodStvgRto(nxtNodStvgRto[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (termCalcDesc[i] != null)
					model.setTermCalcDesc(termCalcDesc[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (costActGrpCd[i] != null)
					model.setCostActGrpCd(costActGrpCd[i]);
				if (wtrModFlg[i] != null)
					model.setWtrModFlg(wtrModFlg[i]);
				if (calcTermCd[i] != null)
					model.setCalcTermCd(calcTermCd[i]);
				if (nodStvgRto[i] != null)
					model.setNodStvgRto(nodStvgRto[i]);
				if (nodThrpRto[i] != null)
					model.setNodThrpRto(nodThrpRto[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getCoaTrnsTermCalcVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return CoaTrnsTermCalcVO[]
	 */
	public CoaTrnsTermCalcVO[] getCoaTrnsTermCalcVOs(){
		CoaTrnsTermCalcVO[] vos = (CoaTrnsTermCalcVO[])models.toArray(new CoaTrnsTermCalcVO[models.size()]);
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
		this.wtrTermCd = this.wtrTermCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.nxtNodThrpRto = this.nxtNodThrpRto .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.nxtNodTmlRto = this.nxtNodTmlRto .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.nodTmlRto = this.nodTmlRto .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.nxtNodStvgRto = this.nxtNodStvgRto .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.termCalcDesc = this.termCalcDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costActGrpCd = this.costActGrpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.wtrModFlg = this.wtrModFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.calcTermCd = this.calcTermCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.nodStvgRto = this.nodStvgRto .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.nodThrpRto = this.nodThrpRto .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
