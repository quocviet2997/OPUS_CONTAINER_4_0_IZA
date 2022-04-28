/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : ScgImdgPckGrpVO.java
*@FileTitle : ScgImdgPckGrpVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.29
*@LastModifier : 이도형
*@LastVersion : 1.0
* 2009.05.29 이도형 
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
 * @author 이도형
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class ScgImdgPckGrpVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<ScgImdgPckGrpVO> models = new ArrayList<ScgImdgPckGrpVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String pckDgrNm = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String imdgPckGrpCd = null;
	/* Column Info */
	private String initBoilPntTempCtnt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String flshPntTempCtnt = null;
	/* Column Info */
	private String drpHgtCtnt = null;
	/* Column Info */
	private String updUsrId = null;
	/* Page Number */
	private String pagerows = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public ScgImdgPckGrpVO() {}

	public ScgImdgPckGrpVO(String ibflag, String pagerows, String imdgPckGrpCd, String pckDgrNm, String flshPntTempCtnt, String initBoilPntTempCtnt, String drpHgtCtnt, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.pckDgrNm = pckDgrNm;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.imdgPckGrpCd = imdgPckGrpCd;
		this.initBoilPntTempCtnt = initBoilPntTempCtnt;
		this.creDt = creDt;
		this.flshPntTempCtnt = flshPntTempCtnt;
		this.drpHgtCtnt = drpHgtCtnt;
		this.updUsrId = updUsrId;
		this.pagerows = pagerows;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("pck_dgr_nm", getPckDgrNm());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("imdg_pck_grp_cd", getImdgPckGrpCd());
		this.hashColumns.put("init_boil_pnt_temp_ctnt", getInitBoilPntTempCtnt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("flsh_pnt_temp_ctnt", getFlshPntTempCtnt());
		this.hashColumns.put("drp_hgt_ctnt", getDrpHgtCtnt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("pagerows", getPagerows());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("pck_dgr_nm", "pckDgrNm");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("imdg_pck_grp_cd", "imdgPckGrpCd");
		this.hashFields.put("init_boil_pnt_temp_ctnt", "initBoilPntTempCtnt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("flsh_pnt_temp_ctnt", "flshPntTempCtnt");
		this.hashFields.put("drp_hgt_ctnt", "drpHgtCtnt");
		this.hashFields.put("upd_usr_id", "updUsrId");
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
	 * @return pckDgrNm
	 */
	public String getPckDgrNm() {
		return this.pckDgrNm;
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
	 * @return imdgPckGrpCd
	 */
	public String getImdgPckGrpCd() {
		return this.imdgPckGrpCd;
	}
	
	/**
	 * Column Info
	 * @return initBoilPntTempCtnt
	 */
	public String getInitBoilPntTempCtnt() {
		return this.initBoilPntTempCtnt;
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
	 * @return flshPntTempCtnt
	 */
	public String getFlshPntTempCtnt() {
		return this.flshPntTempCtnt;
	}
	
	/**
	 * Column Info
	 * @return drpHgtCtnt
	 */
	public String getDrpHgtCtnt() {
		return this.drpHgtCtnt;
	}
	
	/**
	 * Column Info
	 * @return updUsrId
	 */
	public String getUpdUsrId() {
		return this.updUsrId;
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
	 * @param pckDgrNm
	 */
	public void setPckDgrNm(String pckDgrNm) {
		this.pckDgrNm = pckDgrNm;
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
	 * @param imdgPckGrpCd
	 */
	public void setImdgPckGrpCd(String imdgPckGrpCd) {
		this.imdgPckGrpCd = imdgPckGrpCd;
	}
	
	/**
	 * Column Info
	 * @param initBoilPntTempCtnt
	 */
	public void setInitBoilPntTempCtnt(String initBoilPntTempCtnt) {
		this.initBoilPntTempCtnt = initBoilPntTempCtnt;
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
	 * @param flshPntTempCtnt
	 */
	public void setFlshPntTempCtnt(String flshPntTempCtnt) {
		this.flshPntTempCtnt = flshPntTempCtnt;
	}
	
	/**
	 * Column Info
	 * @param drpHgtCtnt
	 */
	public void setDrpHgtCtnt(String drpHgtCtnt) {
		this.drpHgtCtnt = drpHgtCtnt;
	}
	
	/**
	 * Column Info
	 * @param updUsrId
	 */
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
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
		setPckDgrNm(JSPUtil.getParameter(request, "pck_dgr_nm", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setImdgPckGrpCd(JSPUtil.getParameter(request, "imdg_pck_grp_cd", ""));
		setInitBoilPntTempCtnt(JSPUtil.getParameter(request, "init_boil_pnt_temp_ctnt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setFlshPntTempCtnt(JSPUtil.getParameter(request, "flsh_pnt_temp_ctnt", ""));
		setDrpHgtCtnt(JSPUtil.getParameter(request, "drp_hgt_ctnt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return ScgImdgPckGrpVO[]
	 */
	public ScgImdgPckGrpVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return ScgImdgPckGrpVO[]
	 */
	public ScgImdgPckGrpVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		ScgImdgPckGrpVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] pckDgrNm = (JSPUtil.getParameter(request, prefix	+ "pck_dgr_nm".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] imdgPckGrpCd = (JSPUtil.getParameter(request, prefix	+ "imdg_pck_grp_cd".trim(), length));
			String[] initBoilPntTempCtnt = (JSPUtil.getParameter(request, prefix	+ "init_boil_pnt_temp_ctnt".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] flshPntTempCtnt = (JSPUtil.getParameter(request, prefix	+ "flsh_pnt_temp_ctnt".trim(), length));
			String[] drpHgtCtnt = (JSPUtil.getParameter(request, prefix	+ "drp_hgt_ctnt".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new ScgImdgPckGrpVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (pckDgrNm[i] != null)
					model.setPckDgrNm(pckDgrNm[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (imdgPckGrpCd[i] != null)
					model.setImdgPckGrpCd(imdgPckGrpCd[i]);
				if (initBoilPntTempCtnt[i] != null)
					model.setInitBoilPntTempCtnt(initBoilPntTempCtnt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (flshPntTempCtnt[i] != null)
					model.setFlshPntTempCtnt(flshPntTempCtnt[i]);
				if (drpHgtCtnt[i] != null)
					model.setDrpHgtCtnt(drpHgtCtnt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getScgImdgPckGrpVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return ScgImdgPckGrpVO[]
	 */
	public ScgImdgPckGrpVO[] getScgImdgPckGrpVOs(){
		ScgImdgPckGrpVO[] vos = (ScgImdgPckGrpVO[])models.toArray(new ScgImdgPckGrpVO[models.size()]);
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
		this.pckDgrNm = this.pckDgrNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.imdgPckGrpCd = this.imdgPckGrpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.initBoilPntTempCtnt = this.initBoilPntTempCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.flshPntTempCtnt = this.flshPntTempCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.drpHgtCtnt = this.drpHgtCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
