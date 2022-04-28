/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : MdmZoneVO.java
*@FileTitle : MdmZoneVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.26
*@LastModifier : 김기종
*@LastVersion : 1.0
* 2009.05.26 김기종 
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
 * @author 김기종
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class MdmZoneVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<MdmZoneVO> models = new ArrayList<MdmZoneVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String lnkDist = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String znNm = null;
	/* Column Info */
	private String znCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String repZnFlg = null;
	/* Column Info */
	private String eaiEvntDt = null;
	/* Column Info */
	private String tztmHrs = null;
	/* Page Number */
	private String pagerows = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String locCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String cgoHndlTmHrs = null;
	/* Column Info */
	private String distUtCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String repYdCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public MdmZoneVO() {}

	public MdmZoneVO(String ibflag, String pagerows, String znCd, String znNm, String repZnFlg, String repYdCd, String tztmHrs, String cgoHndlTmHrs, String locCd, String lnkDist, String distUtCd, String creUsrId, String creDt, String updUsrId, String updDt, String deltFlg, String eaiEvntDt) {
		this.updDt = updDt;
		this.lnkDist = lnkDist;
		this.deltFlg = deltFlg;
		this.znNm = znNm;
		this.znCd = znCd;
		this.creDt = creDt;
		this.repZnFlg = repZnFlg;
		this.eaiEvntDt = eaiEvntDt;
		this.tztmHrs = tztmHrs;
		this.pagerows = pagerows;
		this.ibflag = ibflag;
		this.locCd = locCd;
		this.creUsrId = creUsrId;
		this.cgoHndlTmHrs = cgoHndlTmHrs;
		this.distUtCd = distUtCd;
		this.updUsrId = updUsrId;
		this.repYdCd = repYdCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("lnk_dist", getLnkDist());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("zn_nm", getZnNm());
		this.hashColumns.put("zn_cd", getZnCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("rep_zn_flg", getRepZnFlg());
		this.hashColumns.put("eai_evnt_dt", getEaiEvntDt());
		this.hashColumns.put("tztm_hrs", getTztmHrs());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("loc_cd", getLocCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("cgo_hndl_tm_hrs", getCgoHndlTmHrs());
		this.hashColumns.put("dist_ut_cd", getDistUtCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("rep_yd_cd", getRepYdCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("lnk_dist", "lnkDist");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("zn_nm", "znNm");
		this.hashFields.put("zn_cd", "znCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("rep_zn_flg", "repZnFlg");
		this.hashFields.put("eai_evnt_dt", "eaiEvntDt");
		this.hashFields.put("tztm_hrs", "tztmHrs");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("loc_cd", "locCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("cgo_hndl_tm_hrs", "cgoHndlTmHrs");
		this.hashFields.put("dist_ut_cd", "distUtCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("rep_yd_cd", "repYdCd");
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
	 * @return lnkDist
	 */
	public String getLnkDist() {
		return this.lnkDist;
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
	 * @return znNm
	 */
	public String getZnNm() {
		return this.znNm;
	}
	
	/**
	 * Column Info
	 * @return znCd
	 */
	public String getZnCd() {
		return this.znCd;
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
	 * @return repZnFlg
	 */
	public String getRepZnFlg() {
		return this.repZnFlg;
	}
	
	/**
	 * Column Info
	 * @return eaiEvntDt
	 */
	public String getEaiEvntDt() {
		return this.eaiEvntDt;
	}
	
	/**
	 * Column Info
	 * @return tztmHrs
	 */
	public String getTztmHrs() {
		return this.tztmHrs;
	}
	
	/**
	 * Page Number
	 * @return pagerows
	 */
	public String getPagerows() {
		return this.pagerows;
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
	 * @return cgoHndlTmHrs
	 */
	public String getCgoHndlTmHrs() {
		return this.cgoHndlTmHrs;
	}
	
	/**
	 * Column Info
	 * @return distUtCd
	 */
	public String getDistUtCd() {
		return this.distUtCd;
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
	 * @return repYdCd
	 */
	public String getRepYdCd() {
		return this.repYdCd;
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
	 * @param lnkDist
	 */
	public void setLnkDist(String lnkDist) {
		this.lnkDist = lnkDist;
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
	 * @param znNm
	 */
	public void setZnNm(String znNm) {
		this.znNm = znNm;
	}
	
	/**
	 * Column Info
	 * @param znCd
	 */
	public void setZnCd(String znCd) {
		this.znCd = znCd;
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
	 * @param repZnFlg
	 */
	public void setRepZnFlg(String repZnFlg) {
		this.repZnFlg = repZnFlg;
	}
	
	/**
	 * Column Info
	 * @param eaiEvntDt
	 */
	public void setEaiEvntDt(String eaiEvntDt) {
		this.eaiEvntDt = eaiEvntDt;
	}
	
	/**
	 * Column Info
	 * @param tztmHrs
	 */
	public void setTztmHrs(String tztmHrs) {
		this.tztmHrs = tztmHrs;
	}
	
	/**
	 * Page Number
	 * @param pagerows
	 */
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
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
	 * @param cgoHndlTmHrs
	 */
	public void setCgoHndlTmHrs(String cgoHndlTmHrs) {
		this.cgoHndlTmHrs = cgoHndlTmHrs;
	}
	
	/**
	 * Column Info
	 * @param distUtCd
	 */
	public void setDistUtCd(String distUtCd) {
		this.distUtCd = distUtCd;
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
	 * @param repYdCd
	 */
	public void setRepYdCd(String repYdCd) {
		this.repYdCd = repYdCd;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setLnkDist(JSPUtil.getParameter(request, "lnk_dist", ""));
		setDeltFlg(JSPUtil.getParameter(request, "delt_flg", ""));
		setZnNm(JSPUtil.getParameter(request, "zn_nm", ""));
		setZnCd(JSPUtil.getParameter(request, "zn_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setRepZnFlg(JSPUtil.getParameter(request, "rep_zn_flg", ""));
		setEaiEvntDt(JSPUtil.getParameter(request, "eai_evnt_dt", ""));
		setTztmHrs(JSPUtil.getParameter(request, "tztm_hrs", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setLocCd(JSPUtil.getParameter(request, "loc_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setCgoHndlTmHrs(JSPUtil.getParameter(request, "cgo_hndl_tm_hrs", ""));
		setDistUtCd(JSPUtil.getParameter(request, "dist_ut_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setRepYdCd(JSPUtil.getParameter(request, "rep_yd_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return MdmZoneVO[]
	 */
	public MdmZoneVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return MdmZoneVO[]
	 */
	public MdmZoneVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		MdmZoneVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] lnkDist = (JSPUtil.getParameter(request, prefix	+ "lnk_dist".trim(), length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg".trim(), length));
			String[] znNm = (JSPUtil.getParameter(request, prefix	+ "zn_nm".trim(), length));
			String[] znCd = (JSPUtil.getParameter(request, prefix	+ "zn_cd".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] repZnFlg = (JSPUtil.getParameter(request, prefix	+ "rep_zn_flg".trim(), length));
			String[] eaiEvntDt = (JSPUtil.getParameter(request, prefix	+ "eai_evnt_dt".trim(), length));
			String[] tztmHrs = (JSPUtil.getParameter(request, prefix	+ "tztm_hrs".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] locCd = (JSPUtil.getParameter(request, prefix	+ "loc_cd".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] cgoHndlTmHrs = (JSPUtil.getParameter(request, prefix	+ "cgo_hndl_tm_hrs".trim(), length));
			String[] distUtCd = (JSPUtil.getParameter(request, prefix	+ "dist_ut_cd".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] repYdCd = (JSPUtil.getParameter(request, prefix	+ "rep_yd_cd".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new MdmZoneVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (lnkDist[i] != null)
					model.setLnkDist(lnkDist[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (znNm[i] != null)
					model.setZnNm(znNm[i]);
				if (znCd[i] != null)
					model.setZnCd(znCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (repZnFlg[i] != null)
					model.setRepZnFlg(repZnFlg[i]);
				if (eaiEvntDt[i] != null)
					model.setEaiEvntDt(eaiEvntDt[i]);
				if (tztmHrs[i] != null)
					model.setTztmHrs(tztmHrs[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (locCd[i] != null)
					model.setLocCd(locCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (cgoHndlTmHrs[i] != null)
					model.setCgoHndlTmHrs(cgoHndlTmHrs[i]);
				if (distUtCd[i] != null)
					model.setDistUtCd(distUtCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (repYdCd[i] != null)
					model.setRepYdCd(repYdCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getMdmZoneVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return MdmZoneVO[]
	 */
	public MdmZoneVO[] getMdmZoneVOs(){
		MdmZoneVO[] vos = (MdmZoneVO[])models.toArray(new MdmZoneVO[models.size()]);
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
		this.lnkDist = this.lnkDist .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.znNm = this.znNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.znCd = this.znCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.repZnFlg = this.repZnFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eaiEvntDt = this.eaiEvntDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tztmHrs = this.tztmHrs .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.locCd = this.locCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cgoHndlTmHrs = this.cgoHndlTmHrs .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.distUtCd = this.distUtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.repYdCd = this.repYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
