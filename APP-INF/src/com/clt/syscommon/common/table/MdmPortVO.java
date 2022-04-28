/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : MdmPortVO.java
*@FileTitle : MdmPortVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.04.29
*@LastModifier : 이수빈
*@LastVersion : 1.0
* 2009.04.29 이수빈 
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
 * @author 이수빈
 * @since J2EE 1.5
 */

public class MdmPortVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<MdmPortVO> models = new ArrayList<MdmPortVO>();
	
	/* Column Info */
	private String lonUtCd = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String ocnCd = null;
	/* Column Info */
	private String creDt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String drftUtCd = null;
	/* Column Info */
	private String hgtUtCd = null;
	/* Column Info */
	private String portNm = null;
	/* Status */
	private String ibflag = null;
	/* Column Info */
	private String rpCd = null;
	/* Column Info */
	private String maxDrftDpth = null;
	/* Column Info */
	private String portCd = null;
	/* Column Info */
	private String maxLoaWdt = null;
	/* Column Info */
	private String portLon = null;
	/* Column Info */
	private String loaUtCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String maxBmWdt = null;
	/* Column Info */
	private String bmUtCd = null;
	/* Column Info */
	private String znTpCd2 = null;
	/* Column Info */
	private String portLat = null;
	/* Column Info */
	private String znTpCd1 = null;
	/* Column Info */
	private String eaiEvntDt = null;
	/* Column Info */
	private String znTpCd3 = null;
	/* Column Info */
	private String latUtCd = null;
	/* Column Info */
	private String maxHgt = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String portAltnNm = null;
	/* Column Info */
	private String modiPortCd = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	hashFildInpo	*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public MdmPortVO() {}

	public MdmPortVO(String ibflag, String pagerows, String portCd, String portNm, String portAltnNm, String portLat, String latUtCd, String portLon, String lonUtCd, String ocnCd, String maxDrftDpth, String maxLoaWdt, String maxBmWdt, String maxHgt, String znTpCd1, String znTpCd2, String znTpCd3, String rpCd, String drftUtCd, String loaUtCd, String bmUtCd, String hgtUtCd, String modiPortCd, String creUsrId, String creDt, String updUsrId, String updDt, String deltFlg, String eaiEvntDt) {
		this.lonUtCd = lonUtCd;
		this.deltFlg = deltFlg;
		this.ocnCd = ocnCd;
		this.creDt = creDt;
		this.pagerows = pagerows;
		this.drftUtCd = drftUtCd;
		this.hgtUtCd = hgtUtCd;
		this.portNm = portNm;
		this.ibflag = ibflag;
		this.rpCd = rpCd;
		this.maxDrftDpth = maxDrftDpth;
		this.portCd = portCd;
		this.maxLoaWdt = maxLoaWdt;
		this.portLon = portLon;
		this.loaUtCd = loaUtCd;
		this.updUsrId = updUsrId;
		this.updDt = updDt;
		this.maxBmWdt = maxBmWdt;
		this.bmUtCd = bmUtCd;
		this.znTpCd2 = znTpCd2;
		this.portLat = portLat;
		this.znTpCd1 = znTpCd1;
		this.eaiEvntDt = eaiEvntDt;
		this.znTpCd3 = znTpCd3;
		this.latUtCd = latUtCd;
		this.maxHgt = maxHgt;
		this.creUsrId = creUsrId;
		this.portAltnNm = portAltnNm;
		this.modiPortCd = modiPortCd;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("lon_ut_cd", getLonUtCd());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("ocn_cd", getOcnCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("drft_ut_cd", getDrftUtCd());
		this.hashColumns.put("hgt_ut_cd", getHgtUtCd());
		this.hashColumns.put("port_nm", getPortNm());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("rp_cd", getRpCd());
		this.hashColumns.put("max_drft_dpth", getMaxDrftDpth());
		this.hashColumns.put("port_cd", getPortCd());
		this.hashColumns.put("max_loa_wdt", getMaxLoaWdt());
		this.hashColumns.put("port_lon", getPortLon());
		this.hashColumns.put("loa_ut_cd", getLoaUtCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("max_bm_wdt", getMaxBmWdt());
		this.hashColumns.put("bm_ut_cd", getBmUtCd());
		this.hashColumns.put("zn_tp_cd2", getZnTpCd2());
		this.hashColumns.put("port_lat", getPortLat());
		this.hashColumns.put("zn_tp_cd1", getZnTpCd1());
		this.hashColumns.put("eai_evnt_dt", getEaiEvntDt());
		this.hashColumns.put("zn_tp_cd3", getZnTpCd3());
		this.hashColumns.put("lat_ut_cd", getLatUtCd());
		this.hashColumns.put("max_hgt", getMaxHgt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("port_altn_nm", getPortAltnNm());
		this.hashColumns.put("modi_port_cd", getModiPortCd());
		return this.hashColumns;
	}
	
	/**
	 * hashFildInpo
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("lon_ut_cd", "lonUtCd");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("ocn_cd", "ocnCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("drft_ut_cd", "drftUtCd");
		this.hashFields.put("hgt_ut_cd", "hgtUtCd");
		this.hashFields.put("port_nm", "portNm");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("rp_cd", "rpCd");
		this.hashFields.put("max_drft_dpth", "maxDrftDpth");
		this.hashFields.put("port_cd", "portCd");
		this.hashFields.put("max_loa_wdt", "maxLoaWdt");
		this.hashFields.put("port_lon", "portLon");
		this.hashFields.put("loa_ut_cd", "loaUtCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("max_bm_wdt", "maxBmWdt");
		this.hashFields.put("bm_ut_cd", "bmUtCd");
		this.hashFields.put("zn_tp_cd2", "znTpCd2");
		this.hashFields.put("port_lat", "portLat");
		this.hashFields.put("zn_tp_cd1", "znTpCd1");
		this.hashFields.put("eai_evnt_dt", "eaiEvntDt");
		this.hashFields.put("zn_tp_cd3", "znTpCd3");
		this.hashFields.put("lat_ut_cd", "latUtCd");
		this.hashFields.put("max_hgt", "maxHgt");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("port_altn_nm", "portAltnNm");
		this.hashFields.put("modi_port_cd", "modiPortCd");
		return this.hashFields;
	}
	
	public String getLonUtCd() {
		return this.lonUtCd;
	}
	public String getDeltFlg() {
		return this.deltFlg;
	}
	public String getOcnCd() {
		return this.ocnCd;
	}
	public String getCreDt() {
		return this.creDt;
	}
	public String getPagerows() {
		return this.pagerows;
	}
	public String getDrftUtCd() {
		return this.drftUtCd;
	}
	public String getHgtUtCd() {
		return this.hgtUtCd;
	}
	public String getPortNm() {
		return this.portNm;
	}
	public String getIbflag() {
		return this.ibflag;
	}
	public String getRpCd() {
		return this.rpCd;
	}
	public String getMaxDrftDpth() {
		return this.maxDrftDpth;
	}
	public String getPortCd() {
		return this.portCd;
	}
	public String getMaxLoaWdt() {
		return this.maxLoaWdt;
	}
	public String getPortLon() {
		return this.portLon;
	}
	public String getLoaUtCd() {
		return this.loaUtCd;
	}
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	public String getUpdDt() {
		return this.updDt;
	}
	public String getMaxBmWdt() {
		return this.maxBmWdt;
	}
	public String getBmUtCd() {
		return this.bmUtCd;
	}
	public String getZnTpCd2() {
		return this.znTpCd2;
	}
	public String getPortLat() {
		return this.portLat;
	}
	public String getZnTpCd1() {
		return this.znTpCd1;
	}
	public String getEaiEvntDt() {
		return this.eaiEvntDt;
	}
	public String getZnTpCd3() {
		return this.znTpCd3;
	}
	public String getLatUtCd() {
		return this.latUtCd;
	}
	public String getMaxHgt() {
		return this.maxHgt;
	}
	public String getCreUsrId() {
		return this.creUsrId;
	}
	public String getPortAltnNm() {
		return this.portAltnNm;
	}
	public String getModiPortCd() {
		return this.modiPortCd;
	}

	public void setLonUtCd(String lonUtCd) {
		this.lonUtCd = lonUtCd;
		//this.lonUtCd=true;
	}
	public void setDeltFlg(String deltFlg) {
		this.deltFlg = deltFlg;
		//this.deltFlg=true;
	}
	public void setOcnCd(String ocnCd) {
		this.ocnCd = ocnCd;
		//this.ocnCd=true;
	}
	public void setCreDt(String creDt) {
		this.creDt = creDt;
		//this.creDt=true;
	}
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}
	public void setDrftUtCd(String drftUtCd) {
		this.drftUtCd = drftUtCd;
		//this.drftUtCd=true;
	}
	public void setHgtUtCd(String hgtUtCd) {
		this.hgtUtCd = hgtUtCd;
		//this.hgtUtCd=true;
	}
	public void setPortNm(String portNm) {
		this.portNm = portNm;
		//this.portNm=true;
	}
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setRpCd(String rpCd) {
		this.rpCd = rpCd;
		//this.rpCd=true;
	}
	public void setMaxDrftDpth(String maxDrftDpth) {
		this.maxDrftDpth = maxDrftDpth;
		//this.maxDrftDpth=true;
	}
	public void setPortCd(String portCd) {
		this.portCd = portCd;
		//this.portCd=true;
	}
	public void setMaxLoaWdt(String maxLoaWdt) {
		this.maxLoaWdt = maxLoaWdt;
		//this.maxLoaWdt=true;
	}
	public void setPortLon(String portLon) {
		this.portLon = portLon;
		//this.portLon=true;
	}
	public void setLoaUtCd(String loaUtCd) {
		this.loaUtCd = loaUtCd;
		//this.loaUtCd=true;
	}
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
		//this.updUsrId=true;
	}
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
		//this.updDt=true;
	}
	public void setMaxBmWdt(String maxBmWdt) {
		this.maxBmWdt = maxBmWdt;
		//this.maxBmWdt=true;
	}
	public void setBmUtCd(String bmUtCd) {
		this.bmUtCd = bmUtCd;
		//this.bmUtCd=true;
	}
	public void setZnTpCd2(String znTpCd2) {
		this.znTpCd2 = znTpCd2;
		//this.znTpCd2=true;
	}
	public void setPortLat(String portLat) {
		this.portLat = portLat;
		//this.portLat=true;
	}
	public void setZnTpCd1(String znTpCd1) {
		this.znTpCd1 = znTpCd1;
		//this.znTpCd1=true;
	}
	public void setEaiEvntDt(String eaiEvntDt) {
		this.eaiEvntDt = eaiEvntDt;
		//this.eaiEvntDt=true;
	}
	public void setZnTpCd3(String znTpCd3) {
		this.znTpCd3 = znTpCd3;
		//this.znTpCd3=true;
	}
	public void setLatUtCd(String latUtCd) {
		this.latUtCd = latUtCd;
		//this.latUtCd=true;
	}
	public void setMaxHgt(String maxHgt) {
		this.maxHgt = maxHgt;
		//this.maxHgt=true;
	}
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
		//this.creUsrId=true;
	}
	public void setPortAltnNm(String portAltnNm) {
		this.portAltnNm = portAltnNm;
		//this.portAltnNm=true;
	}
	public void setModiPortCd(String modiPortCd) {
		this.modiPortCd = modiPortCd;
		//this.modiPortCd=true;
	}
	public void fromRequest(HttpServletRequest request) {
		setLonUtCd(JSPUtil.getParameter(request, "lon_ut_cd", ""));
		setDeltFlg(JSPUtil.getParameter(request, "delt_flg", ""));
		setOcnCd(JSPUtil.getParameter(request, "ocn_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setDrftUtCd(JSPUtil.getParameter(request, "drft_ut_cd", ""));
		setHgtUtCd(JSPUtil.getParameter(request, "hgt_ut_cd", ""));
		setPortNm(JSPUtil.getParameter(request, "port_nm", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setRpCd(JSPUtil.getParameter(request, "rp_cd", ""));
		setMaxDrftDpth(JSPUtil.getParameter(request, "max_drft_dpth", ""));
		setPortCd(JSPUtil.getParameter(request, "port_cd", ""));
		setMaxLoaWdt(JSPUtil.getParameter(request, "max_loa_wdt", ""));
		setPortLon(JSPUtil.getParameter(request, "port_lon", ""));
		setLoaUtCd(JSPUtil.getParameter(request, "loa_ut_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setMaxBmWdt(JSPUtil.getParameter(request, "max_bm_wdt", ""));
		setBmUtCd(JSPUtil.getParameter(request, "bm_ut_cd", ""));
		setZnTpCd2(JSPUtil.getParameter(request, "zn_tp_cd2", ""));
		setPortLat(JSPUtil.getParameter(request, "port_lat", ""));
		setZnTpCd1(JSPUtil.getParameter(request, "zn_tp_cd1", ""));
		setEaiEvntDt(JSPUtil.getParameter(request, "eai_evnt_dt", ""));
		setZnTpCd3(JSPUtil.getParameter(request, "zn_tp_cd3", ""));
		setLatUtCd(JSPUtil.getParameter(request, "lat_ut_cd", ""));
		setMaxHgt(JSPUtil.getParameter(request, "max_hgt", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setPortAltnNm(JSPUtil.getParameter(request, "port_altn_nm", ""));
		setModiPortCd(JSPUtil.getParameter(request, "modi_port_cd", ""));
	}

	public MdmPortVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public MdmPortVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		MdmPortVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] lonUtCd = (JSPUtil.getParameter(request, prefix	+ "lon_ut_cd".trim(), length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg".trim(), length));
			String[] ocnCd = (JSPUtil.getParameter(request, prefix	+ "ocn_cd".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] drftUtCd = (JSPUtil.getParameter(request, prefix	+ "drft_ut_cd".trim(), length));
			String[] hgtUtCd = (JSPUtil.getParameter(request, prefix	+ "hgt_ut_cd".trim(), length));
			String[] portNm = (JSPUtil.getParameter(request, prefix	+ "port_nm".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] rpCd = (JSPUtil.getParameter(request, prefix	+ "rp_cd".trim(), length));
			String[] maxDrftDpth = (JSPUtil.getParameter(request, prefix	+ "max_drft_dpth".trim(), length));
			String[] portCd = (JSPUtil.getParameter(request, prefix	+ "port_cd".trim(), length));
			String[] maxLoaWdt = (JSPUtil.getParameter(request, prefix	+ "max_loa_wdt".trim(), length));
			String[] portLon = (JSPUtil.getParameter(request, prefix	+ "port_lon".trim(), length));
			String[] loaUtCd = (JSPUtil.getParameter(request, prefix	+ "loa_ut_cd".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] maxBmWdt = (JSPUtil.getParameter(request, prefix	+ "max_bm_wdt".trim(), length));
			String[] bmUtCd = (JSPUtil.getParameter(request, prefix	+ "bm_ut_cd".trim(), length));
			String[] znTpCd2 = (JSPUtil.getParameter(request, prefix	+ "zn_tp_cd2".trim(), length));
			String[] portLat = (JSPUtil.getParameter(request, prefix	+ "port_lat".trim(), length));
			String[] znTpCd1 = (JSPUtil.getParameter(request, prefix	+ "zn_tp_cd1".trim(), length));
			String[] eaiEvntDt = (JSPUtil.getParameter(request, prefix	+ "eai_evnt_dt".trim(), length));
			String[] znTpCd3 = (JSPUtil.getParameter(request, prefix	+ "zn_tp_cd3".trim(), length));
			String[] latUtCd = (JSPUtil.getParameter(request, prefix	+ "lat_ut_cd".trim(), length));
			String[] maxHgt = (JSPUtil.getParameter(request, prefix	+ "max_hgt".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] portAltnNm = (JSPUtil.getParameter(request, prefix	+ "port_altn_nm".trim(), length));
			String[] modiPortCd = (JSPUtil.getParameter(request, prefix	+ "modi_port_cd".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new MdmPortVO();
				if (lonUtCd[i] != null)
					model.setLonUtCd(lonUtCd[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (ocnCd[i] != null)
					model.setOcnCd(ocnCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (drftUtCd[i] != null)
					model.setDrftUtCd(drftUtCd[i]);
				if (hgtUtCd[i] != null)
					model.setHgtUtCd(hgtUtCd[i]);
				if (portNm[i] != null)
					model.setPortNm(portNm[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (rpCd[i] != null)
					model.setRpCd(rpCd[i]);
				if (maxDrftDpth[i] != null)
					model.setMaxDrftDpth(maxDrftDpth[i]);
				if (portCd[i] != null)
					model.setPortCd(portCd[i]);
				if (maxLoaWdt[i] != null)
					model.setMaxLoaWdt(maxLoaWdt[i]);
				if (portLon[i] != null)
					model.setPortLon(portLon[i]);
				if (loaUtCd[i] != null)
					model.setLoaUtCd(loaUtCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (maxBmWdt[i] != null)
					model.setMaxBmWdt(maxBmWdt[i]);
				if (bmUtCd[i] != null)
					model.setBmUtCd(bmUtCd[i]);
				if (znTpCd2[i] != null)
					model.setZnTpCd2(znTpCd2[i]);
				if (portLat[i] != null)
					model.setPortLat(portLat[i]);
				if (znTpCd1[i] != null)
					model.setZnTpCd1(znTpCd1[i]);
				if (eaiEvntDt[i] != null)
					model.setEaiEvntDt(eaiEvntDt[i]);
				if (znTpCd3[i] != null)
					model.setZnTpCd3(znTpCd3[i]);
				if (latUtCd[i] != null)
					model.setLatUtCd(latUtCd[i]);
				if (maxHgt[i] != null)
					model.setMaxHgt(maxHgt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (portAltnNm[i] != null)
					model.setPortAltnNm(portAltnNm[i]);
				if (modiPortCd[i] != null)
					model.setModiPortCd(modiPortCd[i]);
				models.add(model);
			}

		} catch (Exception e) {}
		return getMdmPortVOs();
	}

	public MdmPortVO[] getMdmPortVOs(){
		MdmPortVO[] vos = (MdmPortVO[])models.toArray(new MdmPortVO[models.size()]);
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
		} catch (Exception ex) {}
		return ret.toString();
	}
	
	/**
	 * 각 클래스 해당하는 필드 정보를 배열에 담는다 
	 * @param field
	 * @param i
	 * @return String[]
	 * @throws IllegalAccessException
	 */
	private String[] getField(Field[] field, int i) throws IllegalAccessException {
		String[] arr;
		try{
			arr = (String[]) field[i].get(this);
		}catch(Exception ex){
			arr = new String[1];
			arr[0] = String.valueOf(field[i].get(this));
		}
		return arr;
	}
	
	/**
	* DataFormat 설정
	*/
	public void onDataFormat(){
		this.lonUtCd = this.lonUtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ocnCd = this.ocnCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.drftUtCd = this.drftUtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hgtUtCd = this.hgtUtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.portNm = this.portNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rpCd = this.rpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.maxDrftDpth = this.maxDrftDpth .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.portCd = this.portCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.maxLoaWdt = this.maxLoaWdt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.portLon = this.portLon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.loaUtCd = this.loaUtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.maxBmWdt = this.maxBmWdt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bmUtCd = this.bmUtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.znTpCd2 = this.znTpCd2 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.portLat = this.portLat .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.znTpCd1 = this.znTpCd1 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eaiEvntDt = this.eaiEvntDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.znTpCd3 = this.znTpCd3 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.latUtCd = this.latUtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.maxHgt = this.maxHgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.portAltnNm = this.portAltnNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.modiPortCd = this.modiPortCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
