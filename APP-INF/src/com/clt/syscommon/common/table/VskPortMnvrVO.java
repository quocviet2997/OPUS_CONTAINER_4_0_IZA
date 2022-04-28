/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : VskPortMnvrVO.java
*@FileTitle : VskPortMnvrVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.25
*@LastModifier : 김종옥
*@LastVersion : 1.0
* 2009.05.25 김종옥 
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
 * @author 김종옥
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class VskPortMnvrVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<VskPortMnvrVO> models = new ArrayList<VskPortMnvrVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String adLen = null;
	/* Column Info */
	private String brthLen = null;
	/* Column Info */
	private String pltMnvrTmHrs = null;
	/* Column Info */
	private String alsdCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String chnlDpth = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String atDrftDpth = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String ydCd = null;
	/* Column Info */
	private String brthDpth = null;
	/* Column Info */
	private String maxDrftDpth = null;
	/* Column Info */
	private String mnvrRmk = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String pltMnvrDist = null;
	/* Column Info */
	private String turnBsnLen = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public VskPortMnvrVO() {}

	public VskPortMnvrVO(String ibflag, String pagerows, String ydCd, String alsdCd, String chnlDpth, String brthDpth, String atDrftDpth, String maxDrftDpth, String adLen, String brthLen, String turnBsnLen, String pltMnvrDist, String pltMnvrTmHrs, String mnvrRmk, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.adLen = adLen;
		this.brthLen = brthLen;
		this.pltMnvrTmHrs = pltMnvrTmHrs;
		this.alsdCd = alsdCd;
		this.creDt = creDt;
		this.chnlDpth = chnlDpth;
		this.pagerows = pagerows;
		this.atDrftDpth = atDrftDpth;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.ydCd = ydCd;
		this.brthDpth = brthDpth;
		this.maxDrftDpth = maxDrftDpth;
		this.mnvrRmk = mnvrRmk;
		this.updUsrId = updUsrId;
		this.pltMnvrDist = pltMnvrDist;
		this.turnBsnLen = turnBsnLen;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("ad_len", getAdLen());
		this.hashColumns.put("brth_len", getBrthLen());
		this.hashColumns.put("plt_mnvr_tm_hrs", getPltMnvrTmHrs());
		this.hashColumns.put("alsd_cd", getAlsdCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("chnl_dpth", getChnlDpth());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("at_drft_dpth", getAtDrftDpth());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("yd_cd", getYdCd());
		this.hashColumns.put("brth_dpth", getBrthDpth());
		this.hashColumns.put("max_drft_dpth", getMaxDrftDpth());
		this.hashColumns.put("mnvr_rmk", getMnvrRmk());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("plt_mnvr_dist", getPltMnvrDist());
		this.hashColumns.put("turn_bsn_len", getTurnBsnLen());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("ad_len", "adLen");
		this.hashFields.put("brth_len", "brthLen");
		this.hashFields.put("plt_mnvr_tm_hrs", "pltMnvrTmHrs");
		this.hashFields.put("alsd_cd", "alsdCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("chnl_dpth", "chnlDpth");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("at_drft_dpth", "atDrftDpth");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("yd_cd", "ydCd");
		this.hashFields.put("brth_dpth", "brthDpth");
		this.hashFields.put("max_drft_dpth", "maxDrftDpth");
		this.hashFields.put("mnvr_rmk", "mnvrRmk");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("plt_mnvr_dist", "pltMnvrDist");
		this.hashFields.put("turn_bsn_len", "turnBsnLen");
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
	 * @return adLen
	 */
	public String getAdLen() {
		return this.adLen;
	}
	
	/**
	 * Column Info
	 * @return brthLen
	 */
	public String getBrthLen() {
		return this.brthLen;
	}
	
	/**
	 * Column Info
	 * @return pltMnvrTmHrs
	 */
	public String getPltMnvrTmHrs() {
		return this.pltMnvrTmHrs;
	}
	
	/**
	 * Column Info
	 * @return alsdCd
	 */
	public String getAlsdCd() {
		return this.alsdCd;
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
	 * @return chnlDpth
	 */
	public String getChnlDpth() {
		return this.chnlDpth;
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
	 * @return atDrftDpth
	 */
	public String getAtDrftDpth() {
		return this.atDrftDpth;
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
	 * @return ydCd
	 */
	public String getYdCd() {
		return this.ydCd;
	}
	
	/**
	 * Column Info
	 * @return brthDpth
	 */
	public String getBrthDpth() {
		return this.brthDpth;
	}
	
	/**
	 * Column Info
	 * @return maxDrftDpth
	 */
	public String getMaxDrftDpth() {
		return this.maxDrftDpth;
	}
	
	/**
	 * Column Info
	 * @return mnvrRmk
	 */
	public String getMnvrRmk() {
		return this.mnvrRmk;
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
	 * @return pltMnvrDist
	 */
	public String getPltMnvrDist() {
		return this.pltMnvrDist;
	}
	
	/**
	 * Column Info
	 * @return turnBsnLen
	 */
	public String getTurnBsnLen() {
		return this.turnBsnLen;
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
	 * @param adLen
	 */
	public void setAdLen(String adLen) {
		this.adLen = adLen;
	}
	
	/**
	 * Column Info
	 * @param brthLen
	 */
	public void setBrthLen(String brthLen) {
		this.brthLen = brthLen;
	}
	
	/**
	 * Column Info
	 * @param pltMnvrTmHrs
	 */
	public void setPltMnvrTmHrs(String pltMnvrTmHrs) {
		this.pltMnvrTmHrs = pltMnvrTmHrs;
	}
	
	/**
	 * Column Info
	 * @param alsdCd
	 */
	public void setAlsdCd(String alsdCd) {
		this.alsdCd = alsdCd;
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
	 * @param chnlDpth
	 */
	public void setChnlDpth(String chnlDpth) {
		this.chnlDpth = chnlDpth;
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
	 * @param atDrftDpth
	 */
	public void setAtDrftDpth(String atDrftDpth) {
		this.atDrftDpth = atDrftDpth;
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
	 * @param ydCd
	 */
	public void setYdCd(String ydCd) {
		this.ydCd = ydCd;
	}
	
	/**
	 * Column Info
	 * @param brthDpth
	 */
	public void setBrthDpth(String brthDpth) {
		this.brthDpth = brthDpth;
	}
	
	/**
	 * Column Info
	 * @param maxDrftDpth
	 */
	public void setMaxDrftDpth(String maxDrftDpth) {
		this.maxDrftDpth = maxDrftDpth;
	}
	
	/**
	 * Column Info
	 * @param mnvrRmk
	 */
	public void setMnvrRmk(String mnvrRmk) {
		this.mnvrRmk = mnvrRmk;
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
	 * @param pltMnvrDist
	 */
	public void setPltMnvrDist(String pltMnvrDist) {
		this.pltMnvrDist = pltMnvrDist;
	}
	
	/**
	 * Column Info
	 * @param turnBsnLen
	 */
	public void setTurnBsnLen(String turnBsnLen) {
		this.turnBsnLen = turnBsnLen;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setAdLen(JSPUtil.getParameter(request, "ad_len", ""));
		setBrthLen(JSPUtil.getParameter(request, "brth_len", ""));
		setPltMnvrTmHrs(JSPUtil.getParameter(request, "plt_mnvr_tm_hrs", ""));
		setAlsdCd(JSPUtil.getParameter(request, "alsd_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setChnlDpth(JSPUtil.getParameter(request, "chnl_dpth", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setAtDrftDpth(JSPUtil.getParameter(request, "at_drft_dpth", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setYdCd(JSPUtil.getParameter(request, "yd_cd", ""));
		setBrthDpth(JSPUtil.getParameter(request, "brth_dpth", ""));
		setMaxDrftDpth(JSPUtil.getParameter(request, "max_drft_dpth", ""));
		setMnvrRmk(JSPUtil.getParameter(request, "mnvr_rmk", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setPltMnvrDist(JSPUtil.getParameter(request, "plt_mnvr_dist", ""));
		setTurnBsnLen(JSPUtil.getParameter(request, "turn_bsn_len", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return VskPortMnvrVO[]
	 */
	public VskPortMnvrVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return VskPortMnvrVO[]
	 */
	public VskPortMnvrVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		VskPortMnvrVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] adLen = (JSPUtil.getParameter(request, prefix	+ "ad_len".trim(), length));
			String[] brthLen = (JSPUtil.getParameter(request, prefix	+ "brth_len".trim(), length));
			String[] pltMnvrTmHrs = (JSPUtil.getParameter(request, prefix	+ "plt_mnvr_tm_hrs".trim(), length));
			String[] alsdCd = (JSPUtil.getParameter(request, prefix	+ "alsd_cd".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] chnlDpth = (JSPUtil.getParameter(request, prefix	+ "chnl_dpth".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] atDrftDpth = (JSPUtil.getParameter(request, prefix	+ "at_drft_dpth".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] ydCd = (JSPUtil.getParameter(request, prefix	+ "yd_cd".trim(), length));
			String[] brthDpth = (JSPUtil.getParameter(request, prefix	+ "brth_dpth".trim(), length));
			String[] maxDrftDpth = (JSPUtil.getParameter(request, prefix	+ "max_drft_dpth".trim(), length));
			String[] mnvrRmk = (JSPUtil.getParameter(request, prefix	+ "mnvr_rmk".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] pltMnvrDist = (JSPUtil.getParameter(request, prefix	+ "plt_mnvr_dist".trim(), length));
			String[] turnBsnLen = (JSPUtil.getParameter(request, prefix	+ "turn_bsn_len".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new VskPortMnvrVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (adLen[i] != null)
					model.setAdLen(adLen[i]);
				if (brthLen[i] != null)
					model.setBrthLen(brthLen[i]);
				if (pltMnvrTmHrs[i] != null)
					model.setPltMnvrTmHrs(pltMnvrTmHrs[i]);
				if (alsdCd[i] != null)
					model.setAlsdCd(alsdCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (chnlDpth[i] != null)
					model.setChnlDpth(chnlDpth[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (atDrftDpth[i] != null)
					model.setAtDrftDpth(atDrftDpth[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (ydCd[i] != null)
					model.setYdCd(ydCd[i]);
				if (brthDpth[i] != null)
					model.setBrthDpth(brthDpth[i]);
				if (maxDrftDpth[i] != null)
					model.setMaxDrftDpth(maxDrftDpth[i]);
				if (mnvrRmk[i] != null)
					model.setMnvrRmk(mnvrRmk[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (pltMnvrDist[i] != null)
					model.setPltMnvrDist(pltMnvrDist[i]);
				if (turnBsnLen[i] != null)
					model.setTurnBsnLen(turnBsnLen[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getVskPortMnvrVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return VskPortMnvrVO[]
	 */
	public VskPortMnvrVO[] getVskPortMnvrVOs(){
		VskPortMnvrVO[] vos = (VskPortMnvrVO[])models.toArray(new VskPortMnvrVO[models.size()]);
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
		this.adLen = this.adLen .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.brthLen = this.brthLen .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pltMnvrTmHrs = this.pltMnvrTmHrs .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.alsdCd = this.alsdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chnlDpth = this.chnlDpth .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.atDrftDpth = this.atDrftDpth .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ydCd = this.ydCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.brthDpth = this.brthDpth .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.maxDrftDpth = this.maxDrftDpth .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mnvrRmk = this.mnvrRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pltMnvrDist = this.pltMnvrDist .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.turnBsnLen = this.turnBsnLen .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
