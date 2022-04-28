/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CgmPoolMvmtSmryVO.java
*@FileTitle : CgmPoolMvmtSmryVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.08
*@LastModifier : 김창식
*@LastVersion : 1.0
* 2009.05.08 김창식 
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
 * @author 김창식
 * @since J2EE 1.5
 */

public class CgmPoolMvmtSmryVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<CgmPoolMvmtSmryVO> models = new ArrayList<CgmPoolMvmtSmryVO>();
	
	/* Status */
	private String ibflag = null;
	/* Column Info */
	private String cntrOwnrCoCd = null;
	/* Column Info */
	private String chssNo = null;
	/* Column Info */
	private String poolChssMvmtYdComFlg = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String hjsChssMvmtYdComFlg = null;
	/* Column Info */
	private String hjsChssMvmtYdCd = null;
	/* Column Info */
	private String hjsChssUsdDys = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String poolChssUsdDys = null;
	/* Column Info */
	private String hjsChssMvmtDt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String poolChssMvmtYdCd = null;
	/* Column Info */
	private String cntrNo = null;
	/* Column Info */
	private String chssOwnrCoCd = null;
	/* Column Info */
	private String poolChssMvmtDt = null;
	/* Column Info */
	private String mvmtDt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String chssPoolCd = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	hashFildInpo	*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public CgmPoolMvmtSmryVO() {}

	public CgmPoolMvmtSmryVO(String ibflag, String pagerows, String chssNo, String mvmtDt, String chssOwnrCoCd, String chssPoolCd, String cntrNo, String cntrOwnrCoCd, String hjsChssMvmtDt, String hjsChssMvmtYdCd, String hjsChssMvmtYdComFlg, String hjsChssUsdDys, String poolChssMvmtDt, String poolChssMvmtYdCd, String poolChssMvmtYdComFlg, String poolChssUsdDys, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.ibflag = ibflag;
		this.cntrOwnrCoCd = cntrOwnrCoCd;
		this.chssNo = chssNo;
		this.poolChssMvmtYdComFlg = poolChssMvmtYdComFlg;
		this.updUsrId = updUsrId;
		this.hjsChssMvmtYdComFlg = hjsChssMvmtYdComFlg;
		this.hjsChssMvmtYdCd = hjsChssMvmtYdCd;
		this.hjsChssUsdDys = hjsChssUsdDys;
		this.updDt = updDt;
		this.poolChssUsdDys = poolChssUsdDys;
		this.hjsChssMvmtDt = hjsChssMvmtDt;
		this.creDt = creDt;
		this.creUsrId = creUsrId;
		this.poolChssMvmtYdCd = poolChssMvmtYdCd;
		this.cntrNo = cntrNo;
		this.chssOwnrCoCd = chssOwnrCoCd;
		this.poolChssMvmtDt = poolChssMvmtDt;
		this.mvmtDt = mvmtDt;
		this.pagerows = pagerows;
		this.chssPoolCd = chssPoolCd;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cntr_ownr_co_cd", getCntrOwnrCoCd());
		this.hashColumns.put("chss_no", getChssNo());
		this.hashColumns.put("pool_chss_mvmt_yd_com_flg", getPoolChssMvmtYdComFlg());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("hjs_chss_mvmt_yd_com_flg", getHjsChssMvmtYdComFlg());
		this.hashColumns.put("hjs_chss_mvmt_yd_cd", getHjsChssMvmtYdCd());
		this.hashColumns.put("hjs_chss_usd_dys", getHjsChssUsdDys());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("pool_chss_usd_dys", getPoolChssUsdDys());
		this.hashColumns.put("hjs_chss_mvmt_dt", getHjsChssMvmtDt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("pool_chss_mvmt_yd_cd", getPoolChssMvmtYdCd());
		this.hashColumns.put("cntr_no", getCntrNo());
		this.hashColumns.put("chss_ownr_co_cd", getChssOwnrCoCd());
		this.hashColumns.put("pool_chss_mvmt_dt", getPoolChssMvmtDt());
		this.hashColumns.put("mvmt_dt", getMvmtDt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("chss_pool_cd", getChssPoolCd());
		return this.hashColumns;
	}
	
	/**
	 * hashFildInpo
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cntr_ownr_co_cd", "cntrOwnrCoCd");
		this.hashFields.put("chss_no", "chssNo");
		this.hashFields.put("pool_chss_mvmt_yd_com_flg", "poolChssMvmtYdComFlg");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("hjs_chss_mvmt_yd_com_flg", "hjsChssMvmtYdComFlg");
		this.hashFields.put("hjs_chss_mvmt_yd_cd", "hjsChssMvmtYdCd");
		this.hashFields.put("hjs_chss_usd_dys", "hjsChssUsdDys");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("pool_chss_usd_dys", "poolChssUsdDys");
		this.hashFields.put("hjs_chss_mvmt_dt", "hjsChssMvmtDt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("pool_chss_mvmt_yd_cd", "poolChssMvmtYdCd");
		this.hashFields.put("cntr_no", "cntrNo");
		this.hashFields.put("chss_ownr_co_cd", "chssOwnrCoCd");
		this.hashFields.put("pool_chss_mvmt_dt", "poolChssMvmtDt");
		this.hashFields.put("mvmt_dt", "mvmtDt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("chss_pool_cd", "chssPoolCd");
		return this.hashFields;
	}
	
	public String getIbflag() {
		return this.ibflag;
	}
	public String getCntrOwnrCoCd() {
		return this.cntrOwnrCoCd;
	}
	public String getChssNo() {
		return this.chssNo;
	}
	public String getPoolChssMvmtYdComFlg() {
		return this.poolChssMvmtYdComFlg;
	}
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	public String getHjsChssMvmtYdComFlg() {
		return this.hjsChssMvmtYdComFlg;
	}
	public String getHjsChssMvmtYdCd() {
		return this.hjsChssMvmtYdCd;
	}
	public String getHjsChssUsdDys() {
		return this.hjsChssUsdDys;
	}
	public String getUpdDt() {
		return this.updDt;
	}
	public String getPoolChssUsdDys() {
		return this.poolChssUsdDys;
	}
	public String getHjsChssMvmtDt() {
		return this.hjsChssMvmtDt;
	}
	public String getCreDt() {
		return this.creDt;
	}
	public String getCreUsrId() {
		return this.creUsrId;
	}
	public String getPoolChssMvmtYdCd() {
		return this.poolChssMvmtYdCd;
	}
	public String getCntrNo() {
		return this.cntrNo;
	}
	public String getChssOwnrCoCd() {
		return this.chssOwnrCoCd;
	}
	public String getPoolChssMvmtDt() {
		return this.poolChssMvmtDt;
	}
	public String getMvmtDt() {
		return this.mvmtDt;
	}
	public String getPagerows() {
		return this.pagerows;
	}
	public String getChssPoolCd() {
		return this.chssPoolCd;
	}

	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setCntrOwnrCoCd(String cntrOwnrCoCd) {
		this.cntrOwnrCoCd = cntrOwnrCoCd;
		//this.cntrOwnrCoCd=true;
	}
	public void setChssNo(String chssNo) {
		this.chssNo = chssNo;
		//this.chssNo=true;
	}
	public void setPoolChssMvmtYdComFlg(String poolChssMvmtYdComFlg) {
		this.poolChssMvmtYdComFlg = poolChssMvmtYdComFlg;
		//this.poolChssMvmtYdComFlg=true;
	}
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
		//this.updUsrId=true;
	}
	public void setHjsChssMvmtYdComFlg(String hjsChssMvmtYdComFlg) {
		this.hjsChssMvmtYdComFlg = hjsChssMvmtYdComFlg;
		//this.hjsChssMvmtYdComFlg=true;
	}
	public void setHjsChssMvmtYdCd(String hjsChssMvmtYdCd) {
		this.hjsChssMvmtYdCd = hjsChssMvmtYdCd;
		//this.hjsChssMvmtYdCd=true;
	}
	public void setHjsChssUsdDys(String hjsChssUsdDys) {
		this.hjsChssUsdDys = hjsChssUsdDys;
		//this.hjsChssUsdDys=true;
	}
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
		//this.updDt=true;
	}
	public void setPoolChssUsdDys(String poolChssUsdDys) {
		this.poolChssUsdDys = poolChssUsdDys;
		//this.poolChssUsdDys=true;
	}
	public void setHjsChssMvmtDt(String hjsChssMvmtDt) {
		this.hjsChssMvmtDt = hjsChssMvmtDt;
		//this.hjsChssMvmtDt=true;
	}
	public void setCreDt(String creDt) {
		this.creDt = creDt;
		//this.creDt=true;
	}
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
		//this.creUsrId=true;
	}
	public void setPoolChssMvmtYdCd(String poolChssMvmtYdCd) {
		this.poolChssMvmtYdCd = poolChssMvmtYdCd;
		//this.poolChssMvmtYdCd=true;
	}
	public void setCntrNo(String cntrNo) {
		this.cntrNo = cntrNo;
		//this.cntrNo=true;
	}
	public void setChssOwnrCoCd(String chssOwnrCoCd) {
		this.chssOwnrCoCd = chssOwnrCoCd;
		//this.chssOwnrCoCd=true;
	}
	public void setPoolChssMvmtDt(String poolChssMvmtDt) {
		this.poolChssMvmtDt = poolChssMvmtDt;
		//this.poolChssMvmtDt=true;
	}
	public void setMvmtDt(String mvmtDt) {
		this.mvmtDt = mvmtDt;
		//this.mvmtDt=true;
	}
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}
	public void setChssPoolCd(String chssPoolCd) {
		this.chssPoolCd = chssPoolCd;
		//this.chssPoolCd=true;
	}
	public void fromRequest(HttpServletRequest request) {
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCntrOwnrCoCd(JSPUtil.getParameter(request, "cntr_ownr_co_cd", ""));
		setChssNo(JSPUtil.getParameter(request, "chss_no", ""));
		setPoolChssMvmtYdComFlg(JSPUtil.getParameter(request, "pool_chss_mvmt_yd_com_flg", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setHjsChssMvmtYdComFlg(JSPUtil.getParameter(request, "hjs_chss_mvmt_yd_com_flg", ""));
		setHjsChssMvmtYdCd(JSPUtil.getParameter(request, "hjs_chss_mvmt_yd_cd", ""));
		setHjsChssUsdDys(JSPUtil.getParameter(request, "hjs_chss_usd_dys", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setPoolChssUsdDys(JSPUtil.getParameter(request, "pool_chss_usd_dys", ""));
		setHjsChssMvmtDt(JSPUtil.getParameter(request, "hjs_chss_mvmt_dt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setPoolChssMvmtYdCd(JSPUtil.getParameter(request, "pool_chss_mvmt_yd_cd", ""));
		setCntrNo(JSPUtil.getParameter(request, "cntr_no", ""));
		setChssOwnrCoCd(JSPUtil.getParameter(request, "chss_ownr_co_cd", ""));
		setPoolChssMvmtDt(JSPUtil.getParameter(request, "pool_chss_mvmt_dt", ""));
		setMvmtDt(JSPUtil.getParameter(request, "mvmt_dt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setChssPoolCd(JSPUtil.getParameter(request, "chss_pool_cd", ""));
	}

	public CgmPoolMvmtSmryVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public CgmPoolMvmtSmryVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		CgmPoolMvmtSmryVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] cntrOwnrCoCd = (JSPUtil.getParameter(request, prefix	+ "cntr_ownr_co_cd".trim(), length));
			String[] chssNo = (JSPUtil.getParameter(request, prefix	+ "chss_no".trim(), length));
			String[] poolChssMvmtYdComFlg = (JSPUtil.getParameter(request, prefix	+ "pool_chss_mvmt_yd_com_flg".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] hjsChssMvmtYdComFlg = (JSPUtil.getParameter(request, prefix	+ "hjs_chss_mvmt_yd_com_flg".trim(), length));
			String[] hjsChssMvmtYdCd = (JSPUtil.getParameter(request, prefix	+ "hjs_chss_mvmt_yd_cd".trim(), length));
			String[] hjsChssUsdDys = (JSPUtil.getParameter(request, prefix	+ "hjs_chss_usd_dys".trim(), length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] poolChssUsdDys = (JSPUtil.getParameter(request, prefix	+ "pool_chss_usd_dys".trim(), length));
			String[] hjsChssMvmtDt = (JSPUtil.getParameter(request, prefix	+ "hjs_chss_mvmt_dt".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] poolChssMvmtYdCd = (JSPUtil.getParameter(request, prefix	+ "pool_chss_mvmt_yd_cd".trim(), length));
			String[] cntrNo = (JSPUtil.getParameter(request, prefix	+ "cntr_no".trim(), length));
			String[] chssOwnrCoCd = (JSPUtil.getParameter(request, prefix	+ "chss_ownr_co_cd".trim(), length));
			String[] poolChssMvmtDt = (JSPUtil.getParameter(request, prefix	+ "pool_chss_mvmt_dt".trim(), length));
			String[] mvmtDt = (JSPUtil.getParameter(request, prefix	+ "mvmt_dt".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] chssPoolCd = (JSPUtil.getParameter(request, prefix	+ "chss_pool_cd".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new CgmPoolMvmtSmryVO();
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (cntrOwnrCoCd[i] != null)
					model.setCntrOwnrCoCd(cntrOwnrCoCd[i]);
				if (chssNo[i] != null)
					model.setChssNo(chssNo[i]);
				if (poolChssMvmtYdComFlg[i] != null)
					model.setPoolChssMvmtYdComFlg(poolChssMvmtYdComFlg[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (hjsChssMvmtYdComFlg[i] != null)
					model.setHjsChssMvmtYdComFlg(hjsChssMvmtYdComFlg[i]);
				if (hjsChssMvmtYdCd[i] != null)
					model.setHjsChssMvmtYdCd(hjsChssMvmtYdCd[i]);
				if (hjsChssUsdDys[i] != null)
					model.setHjsChssUsdDys(hjsChssUsdDys[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (poolChssUsdDys[i] != null)
					model.setPoolChssUsdDys(poolChssUsdDys[i]);
				if (hjsChssMvmtDt[i] != null)
					model.setHjsChssMvmtDt(hjsChssMvmtDt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (poolChssMvmtYdCd[i] != null)
					model.setPoolChssMvmtYdCd(poolChssMvmtYdCd[i]);
				if (cntrNo[i] != null)
					model.setCntrNo(cntrNo[i]);
				if (chssOwnrCoCd[i] != null)
					model.setChssOwnrCoCd(chssOwnrCoCd[i]);
				if (poolChssMvmtDt[i] != null)
					model.setPoolChssMvmtDt(poolChssMvmtDt[i]);
				if (mvmtDt[i] != null)
					model.setMvmtDt(mvmtDt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (chssPoolCd[i] != null)
					model.setChssPoolCd(chssPoolCd[i]);
				models.add(model);
			}

		} catch (Exception e) {}
		return getCgmPoolMvmtSmryVOs();
	}

	public CgmPoolMvmtSmryVO[] getCgmPoolMvmtSmryVOs(){
		CgmPoolMvmtSmryVO[] vos = (CgmPoolMvmtSmryVO[])models.toArray(new CgmPoolMvmtSmryVO[models.size()]);
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
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrOwnrCoCd = this.cntrOwnrCoCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chssNo = this.chssNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.poolChssMvmtYdComFlg = this.poolChssMvmtYdComFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hjsChssMvmtYdComFlg = this.hjsChssMvmtYdComFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hjsChssMvmtYdCd = this.hjsChssMvmtYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hjsChssUsdDys = this.hjsChssUsdDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.poolChssUsdDys = this.poolChssUsdDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hjsChssMvmtDt = this.hjsChssMvmtDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.poolChssMvmtYdCd = this.poolChssMvmtYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrNo = this.cntrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chssOwnrCoCd = this.chssOwnrCoCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.poolChssMvmtDt = this.poolChssMvmtDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mvmtDt = this.mvmtDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chssPoolCd = this.chssPoolCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
