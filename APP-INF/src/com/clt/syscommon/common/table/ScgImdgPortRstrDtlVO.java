/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : ScgImdgPortRstrDtlVO.java
*@FileTitle : ScgImdgPortRstrDtlVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.26
*@LastModifier : 장강철
*@LastVersion : 1.0
* 2009.05.26 장강철 
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
 * @author 장강철
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class ScgImdgPortRstrDtlVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<ScgImdgPortRstrDtlVO> models = new ArrayList<ScgImdgPortRstrDtlVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String dysStoFlg = null;
	/* Column Info */
	private String ndTmHrs = null;
	/* Column Info */
	private String obrdMaxQty = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String imdgCmptnAuthCd = null;
	/* Column Info */
	private String oneTmHndlMaxQty = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String portProhiTpCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* Status */
	private String ibflag = null;
	/* Column Info */
	private String tonOvrVolQty = null;
	/* Column Info */
	private String tmlMaxQty = null;
	/* Column Info */
	private String stoDys = null;
	/* Column Info */
	private String imdgPortRstrSeq = null;
	/* Column Info */
	private String portCd = null;
	/* Column Info */
	private String txtDesc = null;
	/* Column Info */
	private String prohiDesc = null;
	/* Column Info */
	private String updUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public ScgImdgPortRstrDtlVO() {}

	public ScgImdgPortRstrDtlVO(String ibflag, String pagerows, String portCd, String imdgPortRstrSeq, String portProhiTpCd, String imdgCmptnAuthCd, String tonOvrVolQty, String ndTmHrs, String tmlMaxQty, String obrdMaxQty, String oneTmHndlMaxQty, String dysStoFlg, String stoDys, String prohiDesc, String txtDesc, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.dysStoFlg = dysStoFlg;
		this.ndTmHrs = ndTmHrs;
		this.obrdMaxQty = obrdMaxQty;
		this.creDt = creDt;
		this.imdgCmptnAuthCd = imdgCmptnAuthCd;
		this.oneTmHndlMaxQty = oneTmHndlMaxQty;
		this.pagerows = pagerows;
		this.portProhiTpCd = portProhiTpCd;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.tonOvrVolQty = tonOvrVolQty;
		this.tmlMaxQty = tmlMaxQty;
		this.stoDys = stoDys;
		this.imdgPortRstrSeq = imdgPortRstrSeq;
		this.portCd = portCd;
		this.txtDesc = txtDesc;
		this.prohiDesc = prohiDesc;
		this.updUsrId = updUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("dys_sto_flg", getDysStoFlg());
		this.hashColumns.put("nd_tm_hrs", getNdTmHrs());
		this.hashColumns.put("obrd_max_qty", getObrdMaxQty());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("imdg_cmptn_auth_cd", getImdgCmptnAuthCd());
		this.hashColumns.put("one_tm_hndl_max_qty", getOneTmHndlMaxQty());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("port_prohi_tp_cd", getPortProhiTpCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("ton_ovr_vol_qty", getTonOvrVolQty());
		this.hashColumns.put("tml_max_qty", getTmlMaxQty());
		this.hashColumns.put("sto_dys", getStoDys());
		this.hashColumns.put("imdg_port_rstr_seq", getImdgPortRstrSeq());
		this.hashColumns.put("port_cd", getPortCd());
		this.hashColumns.put("txt_desc", getTxtDesc());
		this.hashColumns.put("prohi_desc", getProhiDesc());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("dys_sto_flg", "dysStoFlg");
		this.hashFields.put("nd_tm_hrs", "ndTmHrs");
		this.hashFields.put("obrd_max_qty", "obrdMaxQty");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("imdg_cmptn_auth_cd", "imdgCmptnAuthCd");
		this.hashFields.put("one_tm_hndl_max_qty", "oneTmHndlMaxQty");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("port_prohi_tp_cd", "portProhiTpCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("ton_ovr_vol_qty", "tonOvrVolQty");
		this.hashFields.put("tml_max_qty", "tmlMaxQty");
		this.hashFields.put("sto_dys", "stoDys");
		this.hashFields.put("imdg_port_rstr_seq", "imdgPortRstrSeq");
		this.hashFields.put("port_cd", "portCd");
		this.hashFields.put("txt_desc", "txtDesc");
		this.hashFields.put("prohi_desc", "prohiDesc");
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
	 * @return dysStoFlg
	 */
	public String getDysStoFlg() {
		return this.dysStoFlg;
	}
	
	/**
	 * Column Info
	 * @return ndTmHrs
	 */
	public String getNdTmHrs() {
		return this.ndTmHrs;
	}
	
	/**
	 * Column Info
	 * @return obrdMaxQty
	 */
	public String getObrdMaxQty() {
		return this.obrdMaxQty;
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
	 * @return imdgCmptnAuthCd
	 */
	public String getImdgCmptnAuthCd() {
		return this.imdgCmptnAuthCd;
	}
	
	/**
	 * Column Info
	 * @return oneTmHndlMaxQty
	 */
	public String getOneTmHndlMaxQty() {
		return this.oneTmHndlMaxQty;
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
	 * @return portProhiTpCd
	 */
	public String getPortProhiTpCd() {
		return this.portProhiTpCd;
	}
	
	/**
	 * Column Info
	 * @return creUsrId
	 */
	public String getCreUsrId() {
		return this.creUsrId;
	}
	
	/**
	 * Status
	 * @return ibflag
	 */
	public String getIbflag() {
		return this.ibflag;
	}
	
	/**
	 * Column Info
	 * @return tonOvrVolQty
	 */
	public String getTonOvrVolQty() {
		return this.tonOvrVolQty;
	}
	
	/**
	 * Column Info
	 * @return tmlMaxQty
	 */
	public String getTmlMaxQty() {
		return this.tmlMaxQty;
	}
	
	/**
	 * Column Info
	 * @return stoDys
	 */
	public String getStoDys() {
		return this.stoDys;
	}
	
	/**
	 * Column Info
	 * @return imdgPortRstrSeq
	 */
	public String getImdgPortRstrSeq() {
		return this.imdgPortRstrSeq;
	}
	
	/**
	 * Column Info
	 * @return portCd
	 */
	public String getPortCd() {
		return this.portCd;
	}
	
	/**
	 * Column Info
	 * @return txtDesc
	 */
	public String getTxtDesc() {
		return this.txtDesc;
	}
	
	/**
	 * Column Info
	 * @return prohiDesc
	 */
	public String getProhiDesc() {
		return this.prohiDesc;
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
	 * @param dysStoFlg
	 */
	public void setDysStoFlg(String dysStoFlg) {
		this.dysStoFlg = dysStoFlg;
	}
	
	/**
	 * Column Info
	 * @param ndTmHrs
	 */
	public void setNdTmHrs(String ndTmHrs) {
		this.ndTmHrs = ndTmHrs;
	}
	
	/**
	 * Column Info
	 * @param obrdMaxQty
	 */
	public void setObrdMaxQty(String obrdMaxQty) {
		this.obrdMaxQty = obrdMaxQty;
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
	 * @param imdgCmptnAuthCd
	 */
	public void setImdgCmptnAuthCd(String imdgCmptnAuthCd) {
		this.imdgCmptnAuthCd = imdgCmptnAuthCd;
	}
	
	/**
	 * Column Info
	 * @param oneTmHndlMaxQty
	 */
	public void setOneTmHndlMaxQty(String oneTmHndlMaxQty) {
		this.oneTmHndlMaxQty = oneTmHndlMaxQty;
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
	 * @param portProhiTpCd
	 */
	public void setPortProhiTpCd(String portProhiTpCd) {
		this.portProhiTpCd = portProhiTpCd;
	}
	
	/**
	 * Column Info
	 * @param creUsrId
	 */
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
	}
	
	/**
	 * Status
	 * @param ibflag
	 */
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
	}
	
	/**
	 * Column Info
	 * @param tonOvrVolQty
	 */
	public void setTonOvrVolQty(String tonOvrVolQty) {
		this.tonOvrVolQty = tonOvrVolQty;
	}
	
	/**
	 * Column Info
	 * @param tmlMaxQty
	 */
	public void setTmlMaxQty(String tmlMaxQty) {
		this.tmlMaxQty = tmlMaxQty;
	}
	
	/**
	 * Column Info
	 * @param stoDys
	 */
	public void setStoDys(String stoDys) {
		this.stoDys = stoDys;
	}
	
	/**
	 * Column Info
	 * @param imdgPortRstrSeq
	 */
	public void setImdgPortRstrSeq(String imdgPortRstrSeq) {
		this.imdgPortRstrSeq = imdgPortRstrSeq;
	}
	
	/**
	 * Column Info
	 * @param portCd
	 */
	public void setPortCd(String portCd) {
		this.portCd = portCd;
	}
	
	/**
	 * Column Info
	 * @param txtDesc
	 */
	public void setTxtDesc(String txtDesc) {
		this.txtDesc = txtDesc;
	}
	
	/**
	 * Column Info
	 * @param prohiDesc
	 */
	public void setProhiDesc(String prohiDesc) {
		this.prohiDesc = prohiDesc;
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
		setDysStoFlg(JSPUtil.getParameter(request, "dys_sto_flg", ""));
		setNdTmHrs(JSPUtil.getParameter(request, "nd_tm_hrs", ""));
		setObrdMaxQty(JSPUtil.getParameter(request, "obrd_max_qty", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setImdgCmptnAuthCd(JSPUtil.getParameter(request, "imdg_cmptn_auth_cd", ""));
		setOneTmHndlMaxQty(JSPUtil.getParameter(request, "one_tm_hndl_max_qty", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setPortProhiTpCd(JSPUtil.getParameter(request, "port_prohi_tp_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setTonOvrVolQty(JSPUtil.getParameter(request, "ton_ovr_vol_qty", ""));
		setTmlMaxQty(JSPUtil.getParameter(request, "tml_max_qty", ""));
		setStoDys(JSPUtil.getParameter(request, "sto_dys", ""));
		setImdgPortRstrSeq(JSPUtil.getParameter(request, "imdg_port_rstr_seq", ""));
		setPortCd(JSPUtil.getParameter(request, "port_cd", ""));
		setTxtDesc(JSPUtil.getParameter(request, "txt_desc", ""));
		setProhiDesc(JSPUtil.getParameter(request, "prohi_desc", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return ScgImdgPortRstrDtlVO[]
	 */
	public ScgImdgPortRstrDtlVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return ScgImdgPortRstrDtlVO[]
	 */
	public ScgImdgPortRstrDtlVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		ScgImdgPortRstrDtlVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] dysStoFlg = (JSPUtil.getParameter(request, prefix	+ "dys_sto_flg".trim(), length));
			String[] ndTmHrs = (JSPUtil.getParameter(request, prefix	+ "nd_tm_hrs".trim(), length));
			String[] obrdMaxQty = (JSPUtil.getParameter(request, prefix	+ "obrd_max_qty".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] imdgCmptnAuthCd = (JSPUtil.getParameter(request, prefix	+ "imdg_cmptn_auth_cd".trim(), length));
			String[] oneTmHndlMaxQty = (JSPUtil.getParameter(request, prefix	+ "one_tm_hndl_max_qty".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] portProhiTpCd = (JSPUtil.getParameter(request, prefix	+ "port_prohi_tp_cd".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] tonOvrVolQty = (JSPUtil.getParameter(request, prefix	+ "ton_ovr_vol_qty".trim(), length));
			String[] tmlMaxQty = (JSPUtil.getParameter(request, prefix	+ "tml_max_qty".trim(), length));
			String[] stoDys = (JSPUtil.getParameter(request, prefix	+ "sto_dys".trim(), length));
			String[] imdgPortRstrSeq = (JSPUtil.getParameter(request, prefix	+ "imdg_port_rstr_seq".trim(), length));
			String[] portCd = (JSPUtil.getParameter(request, prefix	+ "port_cd".trim(), length));
			String[] txtDesc = (JSPUtil.getParameter(request, prefix	+ "txt_desc".trim(), length));
			String[] prohiDesc = (JSPUtil.getParameter(request, prefix	+ "prohi_desc".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new ScgImdgPortRstrDtlVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (dysStoFlg[i] != null)
					model.setDysStoFlg(dysStoFlg[i]);
				if (ndTmHrs[i] != null)
					model.setNdTmHrs(ndTmHrs[i]);
				if (obrdMaxQty[i] != null)
					model.setObrdMaxQty(obrdMaxQty[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (imdgCmptnAuthCd[i] != null)
					model.setImdgCmptnAuthCd(imdgCmptnAuthCd[i]);
				if (oneTmHndlMaxQty[i] != null)
					model.setOneTmHndlMaxQty(oneTmHndlMaxQty[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (portProhiTpCd[i] != null)
					model.setPortProhiTpCd(portProhiTpCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (tonOvrVolQty[i] != null)
					model.setTonOvrVolQty(tonOvrVolQty[i]);
				if (tmlMaxQty[i] != null)
					model.setTmlMaxQty(tmlMaxQty[i]);
				if (stoDys[i] != null)
					model.setStoDys(stoDys[i]);
				if (imdgPortRstrSeq[i] != null)
					model.setImdgPortRstrSeq(imdgPortRstrSeq[i]);
				if (portCd[i] != null)
					model.setPortCd(portCd[i]);
				if (txtDesc[i] != null)
					model.setTxtDesc(txtDesc[i]);
				if (prohiDesc[i] != null)
					model.setProhiDesc(prohiDesc[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getScgImdgPortRstrDtlVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return ScgImdgPortRstrDtlVO[]
	 */
	public ScgImdgPortRstrDtlVO[] getScgImdgPortRstrDtlVOs(){
		ScgImdgPortRstrDtlVO[] vos = (ScgImdgPortRstrDtlVO[])models.toArray(new ScgImdgPortRstrDtlVO[models.size()]);
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
		this.dysStoFlg = this.dysStoFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ndTmHrs = this.ndTmHrs .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.obrdMaxQty = this.obrdMaxQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.imdgCmptnAuthCd = this.imdgCmptnAuthCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.oneTmHndlMaxQty = this.oneTmHndlMaxQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.portProhiTpCd = this.portProhiTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tonOvrVolQty = this.tonOvrVolQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlMaxQty = this.tmlMaxQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stoDys = this.stoDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.imdgPortRstrSeq = this.imdgPortRstrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.portCd = this.portCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.txtDesc = this.txtDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prohiDesc = this.prohiDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
