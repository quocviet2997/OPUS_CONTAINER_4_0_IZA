/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BkgCstmsIdaVslVO.java
*@FileTitle : BkgCstmsIdaVslVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.13
*@LastModifier : 경종윤
*@LastVersion : 1.0
* 2009.05.13 경종윤 
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
 * - PDTO(Data Transfer Object including Parameters)<br>
 * - 관련 Event에서 작성, 서버실행요청시 PDTO의 역할을 수행하는 Value Object<br>
 *
 * @author 경종윤
 * @since J2EE 1.5
 * @see ..
 */

public class BkgCstmsIdaVslVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgCstmsIdaVslVO> models = new ArrayList<BkgCstmsIdaVslVO>();
	
	/* Column Info */
	private String cntCd = null;
	/* Column Info */
	private String trnsOprId = null;
	/* Column Info */
	private String idaMrnLineOprCd = null;
	/* Column Info */
	private String idaYrNo = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String idaAgnId = null;
	/* Column Info */
	private String vslCd = null;
	/* Column Info */
	private String idaDeclVslNo = null;
	/* Column Info */
	private String vslNm = null;
	/* Column Info */
	private String idaVoyNo = null;
	/* Status */
	private String ibflag = null;
	/* Column Info */
	private String ibdNo = null;
	/* Column Info */
	private String skdDirCd = null;
	/* Column Info */
	private String callSgnNo = null;
	/* Column Info */
	private String idaCfsId = null;
	/* Column Info */
	private String idaLineNo = null;
	/* Column Info */
	private String crrAgnCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String skdVoyNo = null;
	/* Column Info */
	private String bdAreaCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String podCd = null;
	/* Column Info */
	private String portCd = null;
	/* Column Info */
	private String arrDt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String vslDeclDt = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	hashFildInpo	*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgCstmsIdaVslVO() {}

	public BkgCstmsIdaVslVO(String ibflag, String pagerows, String vslCd, String skdVoyNo, String skdDirCd, String podCd, String idaDeclVslNo, String vslDeclDt, String vslNm, String callSgnNo, String idaLineNo, String idaAgnId, String cntCd, String portCd, String arrDt, String ibdNo, String crrAgnCd, String idaMrnLineOprCd, String idaCfsId, String bdAreaCd, String idaVoyNo, String idaYrNo, String trnsOprId, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.cntCd = cntCd;
		this.trnsOprId = trnsOprId;
		this.idaMrnLineOprCd = idaMrnLineOprCd;
		this.idaYrNo = idaYrNo;
		this.updUsrId = updUsrId;
		this.updDt = updDt;
		this.idaAgnId = idaAgnId;
		this.vslCd = vslCd;
		this.idaDeclVslNo = idaDeclVslNo;
		this.vslNm = vslNm;
		this.idaVoyNo = idaVoyNo;
		this.ibflag = ibflag;
		this.ibdNo = ibdNo;
		this.skdDirCd = skdDirCd;
		this.callSgnNo = callSgnNo;
		this.idaCfsId = idaCfsId;
		this.idaLineNo = idaLineNo;
		this.crrAgnCd = crrAgnCd;
		this.creDt = creDt;
		this.skdVoyNo = skdVoyNo;
		this.bdAreaCd = bdAreaCd;
		this.creUsrId = creUsrId;
		this.podCd = podCd;
		this.portCd = portCd;
		this.arrDt = arrDt;
		this.pagerows = pagerows;
		this.vslDeclDt = vslDeclDt;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("cnt_cd", getCntCd());
		this.hashColumns.put("trns_opr_id", getTrnsOprId());
		this.hashColumns.put("ida_mrn_line_opr_cd", getIdaMrnLineOprCd());
		this.hashColumns.put("ida_yr_no", getIdaYrNo());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("ida_agn_id", getIdaAgnId());
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("ida_decl_vsl_no", getIdaDeclVslNo());
		this.hashColumns.put("vsl_nm", getVslNm());
		this.hashColumns.put("ida_voy_no", getIdaVoyNo());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("ibd_no", getIbdNo());
		this.hashColumns.put("skd_dir_cd", getSkdDirCd());
		this.hashColumns.put("call_sgn_no", getCallSgnNo());
		this.hashColumns.put("ida_cfs_id", getIdaCfsId());
		this.hashColumns.put("ida_line_no", getIdaLineNo());
		this.hashColumns.put("crr_agn_cd", getCrrAgnCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("skd_voy_no", getSkdVoyNo());
		this.hashColumns.put("bd_area_cd", getBdAreaCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("pod_cd", getPodCd());
		this.hashColumns.put("port_cd", getPortCd());
		this.hashColumns.put("arr_dt", getArrDt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("vsl_decl_dt", getVslDeclDt());
		return this.hashColumns;
	}
	
	/**
	 * hashFildInpo
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("cnt_cd", "cntCd");
		this.hashFields.put("trns_opr_id", "trnsOprId");
		this.hashFields.put("ida_mrn_line_opr_cd", "idaMrnLineOprCd");
		this.hashFields.put("ida_yr_no", "idaYrNo");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("ida_agn_id", "idaAgnId");
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("ida_decl_vsl_no", "idaDeclVslNo");
		this.hashFields.put("vsl_nm", "vslNm");
		this.hashFields.put("ida_voy_no", "idaVoyNo");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("ibd_no", "ibdNo");
		this.hashFields.put("skd_dir_cd", "skdDirCd");
		this.hashFields.put("call_sgn_no", "callSgnNo");
		this.hashFields.put("ida_cfs_id", "idaCfsId");
		this.hashFields.put("ida_line_no", "idaLineNo");
		this.hashFields.put("crr_agn_cd", "crrAgnCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("skd_voy_no", "skdVoyNo");
		this.hashFields.put("bd_area_cd", "bdAreaCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("pod_cd", "podCd");
		this.hashFields.put("port_cd", "portCd");
		this.hashFields.put("arr_dt", "arrDt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("vsl_decl_dt", "vslDeclDt");
		return this.hashFields;
	}
	
	public String getCntCd() {
		return this.cntCd;
	}
	public String getTrnsOprId() {
		return this.trnsOprId;
	}
	public String getIdaMrnLineOprCd() {
		return this.idaMrnLineOprCd;
	}
	public String getIdaYrNo() {
		return this.idaYrNo;
	}
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	public String getUpdDt() {
		return this.updDt;
	}
	public String getIdaAgnId() {
		return this.idaAgnId;
	}
	public String getVslCd() {
		return this.vslCd;
	}
	public String getIdaDeclVslNo() {
		return this.idaDeclVslNo;
	}
	public String getVslNm() {
		return this.vslNm;
	}
	public String getIdaVoyNo() {
		return this.idaVoyNo;
	}
	public String getIbflag() {
		return this.ibflag;
	}
	public String getIbdNo() {
		return this.ibdNo;
	}
	public String getSkdDirCd() {
		return this.skdDirCd;
	}
	public String getCallSgnNo() {
		return this.callSgnNo;
	}
	public String getIdaCfsId() {
		return this.idaCfsId;
	}
	public String getIdaLineNo() {
		return this.idaLineNo;
	}
	public String getCrrAgnCd() {
		return this.crrAgnCd;
	}
	public String getCreDt() {
		return this.creDt;
	}
	public String getSkdVoyNo() {
		return this.skdVoyNo;
	}
	public String getBdAreaCd() {
		return this.bdAreaCd;
	}
	public String getCreUsrId() {
		return this.creUsrId;
	}
	public String getPodCd() {
		return this.podCd;
	}
	public String getPortCd() {
		return this.portCd;
	}
	public String getArrDt() {
		return this.arrDt;
	}
	public String getPagerows() {
		return this.pagerows;
	}
	public String getVslDeclDt() {
		return this.vslDeclDt;
	}

	public void setCntCd(String cntCd) {
		this.cntCd = cntCd;
		//this.cntCd=true;
	}
	public void setTrnsOprId(String trnsOprId) {
		this.trnsOprId = trnsOprId;
		//this.trnsOprId=true;
	}
	public void setIdaMrnLineOprCd(String idaMrnLineOprCd) {
		this.idaMrnLineOprCd = idaMrnLineOprCd;
		//this.idaMrnLineOprCd=true;
	}
	public void setIdaYrNo(String idaYrNo) {
		this.idaYrNo = idaYrNo;
		//this.idaYrNo=true;
	}
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
		//this.updUsrId=true;
	}
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
		//this.updDt=true;
	}
	public void setIdaAgnId(String idaAgnId) {
		this.idaAgnId = idaAgnId;
		//this.idaAgnId=true;
	}
	public void setVslCd(String vslCd) {
		this.vslCd = vslCd;
		//this.vslCd=true;
	}
	public void setIdaDeclVslNo(String idaDeclVslNo) {
		this.idaDeclVslNo = idaDeclVslNo;
		//this.idaDeclVslNo=true;
	}
	public void setVslNm(String vslNm) {
		this.vslNm = vslNm;
		//this.vslNm=true;
	}
	public void setIdaVoyNo(String idaVoyNo) {
		this.idaVoyNo = idaVoyNo;
		//this.idaVoyNo=true;
	}
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setIbdNo(String ibdNo) {
		this.ibdNo = ibdNo;
		//this.ibdNo=true;
	}
	public void setSkdDirCd(String skdDirCd) {
		this.skdDirCd = skdDirCd;
		//this.skdDirCd=true;
	}
	public void setCallSgnNo(String callSgnNo) {
		this.callSgnNo = callSgnNo;
		//this.callSgnNo=true;
	}
	public void setIdaCfsId(String idaCfsId) {
		this.idaCfsId = idaCfsId;
		//this.idaCfsId=true;
	}
	public void setIdaLineNo(String idaLineNo) {
		this.idaLineNo = idaLineNo;
		//this.idaLineNo=true;
	}
	public void setCrrAgnCd(String crrAgnCd) {
		this.crrAgnCd = crrAgnCd;
		//this.crrAgnCd=true;
	}
	public void setCreDt(String creDt) {
		this.creDt = creDt;
		//this.creDt=true;
	}
	public void setSkdVoyNo(String skdVoyNo) {
		this.skdVoyNo = skdVoyNo;
		//this.skdVoyNo=true;
	}
	public void setBdAreaCd(String bdAreaCd) {
		this.bdAreaCd = bdAreaCd;
		//this.bdAreaCd=true;
	}
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
		//this.creUsrId=true;
	}
	public void setPodCd(String podCd) {
		this.podCd = podCd;
		//this.podCd=true;
	}
	public void setPortCd(String portCd) {
		this.portCd = portCd;
		//this.portCd=true;
	}
	public void setArrDt(String arrDt) {
		this.arrDt = arrDt;
		//this.arrDt=true;
	}
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}
	public void setVslDeclDt(String vslDeclDt) {
		this.vslDeclDt = vslDeclDt;
		//this.vslDeclDt=true;
	}
	public void fromRequest(HttpServletRequest request) {
		setCntCd(JSPUtil.getParameter(request, "cnt_cd", ""));
		setTrnsOprId(JSPUtil.getParameter(request, "trns_opr_id", ""));
		setIdaMrnLineOprCd(JSPUtil.getParameter(request, "ida_mrn_line_opr_cd", ""));
		setIdaYrNo(JSPUtil.getParameter(request, "ida_yr_no", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setIdaAgnId(JSPUtil.getParameter(request, "ida_agn_id", ""));
		setVslCd(JSPUtil.getParameter(request, "vsl_cd", ""));
		setIdaDeclVslNo(JSPUtil.getParameter(request, "ida_decl_vsl_no", ""));
		setVslNm(JSPUtil.getParameter(request, "vsl_nm", ""));
		setIdaVoyNo(JSPUtil.getParameter(request, "ida_voy_no", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setIbdNo(JSPUtil.getParameter(request, "ibd_no", ""));
		setSkdDirCd(JSPUtil.getParameter(request, "skd_dir_cd", ""));
		setCallSgnNo(JSPUtil.getParameter(request, "call_sgn_no", ""));
		setIdaCfsId(JSPUtil.getParameter(request, "ida_cfs_id", ""));
		setIdaLineNo(JSPUtil.getParameter(request, "ida_line_no", ""));
		setCrrAgnCd(JSPUtil.getParameter(request, "crr_agn_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setSkdVoyNo(JSPUtil.getParameter(request, "skd_voy_no", ""));
		setBdAreaCd(JSPUtil.getParameter(request, "bd_area_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setPodCd(JSPUtil.getParameter(request, "pod_cd", ""));
		setPortCd(JSPUtil.getParameter(request, "port_cd", ""));
		setArrDt(JSPUtil.getParameter(request, "arr_dt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setVslDeclDt(JSPUtil.getParameter(request, "vsl_decl_dt", ""));
	}

	public BkgCstmsIdaVslVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public BkgCstmsIdaVslVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgCstmsIdaVslVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] cntCd = (JSPUtil.getParameter(request, prefix	+ "cnt_cd".trim(), length));
			String[] trnsOprId = (JSPUtil.getParameter(request, prefix	+ "trns_opr_id".trim(), length));
			String[] idaMrnLineOprCd = (JSPUtil.getParameter(request, prefix	+ "ida_mrn_line_opr_cd".trim(), length));
			String[] idaYrNo = (JSPUtil.getParameter(request, prefix	+ "ida_yr_no".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] idaAgnId = (JSPUtil.getParameter(request, prefix	+ "ida_agn_id".trim(), length));
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd".trim(), length));
			String[] idaDeclVslNo = (JSPUtil.getParameter(request, prefix	+ "ida_decl_vsl_no".trim(), length));
			String[] vslNm = (JSPUtil.getParameter(request, prefix	+ "vsl_nm".trim(), length));
			String[] idaVoyNo = (JSPUtil.getParameter(request, prefix	+ "ida_voy_no".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] ibdNo = (JSPUtil.getParameter(request, prefix	+ "ibd_no".trim(), length));
			String[] skdDirCd = (JSPUtil.getParameter(request, prefix	+ "skd_dir_cd".trim(), length));
			String[] callSgnNo = (JSPUtil.getParameter(request, prefix	+ "call_sgn_no".trim(), length));
			String[] idaCfsId = (JSPUtil.getParameter(request, prefix	+ "ida_cfs_id".trim(), length));
			String[] idaLineNo = (JSPUtil.getParameter(request, prefix	+ "ida_line_no".trim(), length));
			String[] crrAgnCd = (JSPUtil.getParameter(request, prefix	+ "crr_agn_cd".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] skdVoyNo = (JSPUtil.getParameter(request, prefix	+ "skd_voy_no".trim(), length));
			String[] bdAreaCd = (JSPUtil.getParameter(request, prefix	+ "bd_area_cd".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] podCd = (JSPUtil.getParameter(request, prefix	+ "pod_cd".trim(), length));
			String[] portCd = (JSPUtil.getParameter(request, prefix	+ "port_cd".trim(), length));
			String[] arrDt = (JSPUtil.getParameter(request, prefix	+ "arr_dt".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] vslDeclDt = (JSPUtil.getParameter(request, prefix	+ "vsl_decl_dt".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgCstmsIdaVslVO();
				if (cntCd[i] != null)
					model.setCntCd(cntCd[i]);
				if (trnsOprId[i] != null)
					model.setTrnsOprId(trnsOprId[i]);
				if (idaMrnLineOprCd[i] != null)
					model.setIdaMrnLineOprCd(idaMrnLineOprCd[i]);
				if (idaYrNo[i] != null)
					model.setIdaYrNo(idaYrNo[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (idaAgnId[i] != null)
					model.setIdaAgnId(idaAgnId[i]);
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (idaDeclVslNo[i] != null)
					model.setIdaDeclVslNo(idaDeclVslNo[i]);
				if (vslNm[i] != null)
					model.setVslNm(vslNm[i]);
				if (idaVoyNo[i] != null)
					model.setIdaVoyNo(idaVoyNo[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (ibdNo[i] != null)
					model.setIbdNo(ibdNo[i]);
				if (skdDirCd[i] != null)
					model.setSkdDirCd(skdDirCd[i]);
				if (callSgnNo[i] != null)
					model.setCallSgnNo(callSgnNo[i]);
				if (idaCfsId[i] != null)
					model.setIdaCfsId(idaCfsId[i]);
				if (idaLineNo[i] != null)
					model.setIdaLineNo(idaLineNo[i]);
				if (crrAgnCd[i] != null)
					model.setCrrAgnCd(crrAgnCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (skdVoyNo[i] != null)
					model.setSkdVoyNo(skdVoyNo[i]);
				if (bdAreaCd[i] != null)
					model.setBdAreaCd(bdAreaCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (podCd[i] != null)
					model.setPodCd(podCd[i]);
				if (portCd[i] != null)
					model.setPortCd(portCd[i]);
				if (arrDt[i] != null)
					model.setArrDt(arrDt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (vslDeclDt[i] != null)
					model.setVslDeclDt(vslDeclDt[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgCstmsIdaVslVOs();
	}

	public BkgCstmsIdaVslVO[] getBkgCstmsIdaVslVOs(){
		BkgCstmsIdaVslVO[] vos = (BkgCstmsIdaVslVO[])models.toArray(new BkgCstmsIdaVslVO[models.size()]);
		return vos;
	}
	
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
	 * 각 클래스 해당하는 필드 정보를 배열에 담는다 
	 * @param field
	 * @param i
	 * @return String[]
	 */
	private String[] getField(Field[] field, int i) {
		String[] arr = null;
		try{
			arr = (String[]) field[i].get(this);
		}catch(Exception ex){
			arr = getFieldCatct(field, i, arr);
		}
		return arr;
	}
	
	/**
	 * getField 에서 catch문에 대한 로직
	 * @param field
	 * @param i
	 * @param arr
	 * @return arr
	 */
	private String[] getFieldCatct(Field[] field, int i, String[] arr) {
		try {
			arr = new String[1];
			arr[0] = String.valueOf(field[i].get(this));
		} catch (IllegalAccessException e) {
			return null;
		}
		return arr;
	}
	
	/**
	* DataFormat 설정
	*/
	public void onDataFormat(){
		this.cntCd = this.cntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trnsOprId = this.trnsOprId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.idaMrnLineOprCd = this.idaMrnLineOprCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.idaYrNo = this.idaYrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.idaAgnId = this.idaAgnId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslCd = this.vslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.idaDeclVslNo = this.idaDeclVslNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslNm = this.vslNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.idaVoyNo = this.idaVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibdNo = this.ibdNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdDirCd = this.skdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.callSgnNo = this.callSgnNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.idaCfsId = this.idaCfsId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.idaLineNo = this.idaLineNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.crrAgnCd = this.crrAgnCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdVoyNo = this.skdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bdAreaCd = this.bdAreaCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.podCd = this.podCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.portCd = this.portCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.arrDt = this.arrDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslDeclDt = this.vslDeclDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
