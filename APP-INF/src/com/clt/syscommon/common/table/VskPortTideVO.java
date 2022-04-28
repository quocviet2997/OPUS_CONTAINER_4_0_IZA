/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : VskPortTideVO.java
*@FileTitle : VskPortTideVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.02
*@LastModifier : 정진우
*@LastVersion : 1.0
* 2009.07.02 정진우 
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
 * @author 정진우
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class VskPortTideVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<VskPortTideVO> models = new ArrayList<VskPortTideVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String tideYr = null;
	/* Column Info */
	private String n2ndFmTideHrmnt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String n1stTideToHrmnt = null;
	/* Column Info */
	private String n1stHighTideHgt = null;
	/* Column Info */
	private String n1stLowTideHgt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String n1stTideFmHrmnt = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String locCd = null;
	/* Column Info */
	private String tideMon = null;
	/* Column Info */
	private String n2ndToTideHrmnt = null;
	/* Column Info */
	private String tideDy = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String n2ndLowTideHgt = null;
	/* Column Info */
	private String n2ndHighTideHgt = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public VskPortTideVO() {}

	public VskPortTideVO(String ibflag, String pagerows, String locCd, String tideYr, String tideMon, String tideDy, String n1stTideFmHrmnt, String n1stTideToHrmnt, String n1stHighTideHgt, String n1stLowTideHgt, String n2ndFmTideHrmnt, String n2ndToTideHrmnt, String n2ndHighTideHgt, String n2ndLowTideHgt, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.tideYr = tideYr;
		this.n2ndFmTideHrmnt = n2ndFmTideHrmnt;
		this.creDt = creDt;
		this.n1stTideToHrmnt = n1stTideToHrmnt;
		this.n1stHighTideHgt = n1stHighTideHgt;
		this.n1stLowTideHgt = n1stLowTideHgt;
		this.pagerows = pagerows;
		this.n1stTideFmHrmnt = n1stTideFmHrmnt;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.locCd = locCd;
		this.tideMon = tideMon;
		this.n2ndToTideHrmnt = n2ndToTideHrmnt;
		this.tideDy = tideDy;
		this.updUsrId = updUsrId;
		this.n2ndLowTideHgt = n2ndLowTideHgt;
		this.n2ndHighTideHgt = n2ndHighTideHgt;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("tide_yr", getTideYr());
		this.hashColumns.put("n2nd_fm_tide_hrmnt", getN2ndFmTideHrmnt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("n1st_tide_to_hrmnt", getN1stTideToHrmnt());
		this.hashColumns.put("n1st_high_tide_hgt", getN1stHighTideHgt());
		this.hashColumns.put("n1st_low_tide_hgt", getN1stLowTideHgt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("n1st_tide_fm_hrmnt", getN1stTideFmHrmnt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("loc_cd", getLocCd());
		this.hashColumns.put("tide_mon", getTideMon());
		this.hashColumns.put("n2nd_to_tide_hrmnt", getN2ndToTideHrmnt());
		this.hashColumns.put("tide_dy", getTideDy());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("n2nd_low_tide_hgt", getN2ndLowTideHgt());
		this.hashColumns.put("n2nd_high_tide_hgt", getN2ndHighTideHgt());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("tide_yr", "tideYr");
		this.hashFields.put("n2nd_fm_tide_hrmnt", "n2ndFmTideHrmnt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("n1st_tide_to_hrmnt", "n1stTideToHrmnt");
		this.hashFields.put("n1st_high_tide_hgt", "n1stHighTideHgt");
		this.hashFields.put("n1st_low_tide_hgt", "n1stLowTideHgt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("n1st_tide_fm_hrmnt", "n1stTideFmHrmnt");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("loc_cd", "locCd");
		this.hashFields.put("tide_mon", "tideMon");
		this.hashFields.put("n2nd_to_tide_hrmnt", "n2ndToTideHrmnt");
		this.hashFields.put("tide_dy", "tideDy");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("n2nd_low_tide_hgt", "n2ndLowTideHgt");
		this.hashFields.put("n2nd_high_tide_hgt", "n2ndHighTideHgt");
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
	 * @return tideYr
	 */
	public String getTideYr() {
		return this.tideYr;
	}
	
	/**
	 * Column Info
	 * @return n2ndFmTideHrmnt
	 */
	public String getN2ndFmTideHrmnt() {
		return this.n2ndFmTideHrmnt;
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
	 * @return n1stTideToHrmnt
	 */
	public String getN1stTideToHrmnt() {
		return this.n1stTideToHrmnt;
	}
	
	/**
	 * Column Info
	 * @return n1stHighTideHgt
	 */
	public String getN1stHighTideHgt() {
		return this.n1stHighTideHgt;
	}
	
	/**
	 * Column Info
	 * @return n1stLowTideHgt
	 */
	public String getN1stLowTideHgt() {
		return this.n1stLowTideHgt;
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
	 * @return n1stTideFmHrmnt
	 */
	public String getN1stTideFmHrmnt() {
		return this.n1stTideFmHrmnt;
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
	 * @return locCd
	 */
	public String getLocCd() {
		return this.locCd;
	}
	
	/**
	 * Column Info
	 * @return tideMon
	 */
	public String getTideMon() {
		return this.tideMon;
	}
	
	/**
	 * Column Info
	 * @return n2ndToTideHrmnt
	 */
	public String getN2ndToTideHrmnt() {
		return this.n2ndToTideHrmnt;
	}
	
	/**
	 * Column Info
	 * @return tideDy
	 */
	public String getTideDy() {
		return this.tideDy;
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
	 * @return n2ndLowTideHgt
	 */
	public String getN2ndLowTideHgt() {
		return this.n2ndLowTideHgt;
	}
	
	/**
	 * Column Info
	 * @return n2ndHighTideHgt
	 */
	public String getN2ndHighTideHgt() {
		return this.n2ndHighTideHgt;
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
	 * @param tideYr
	 */
	public void setTideYr(String tideYr) {
		this.tideYr = tideYr;
	}
	
	/**
	 * Column Info
	 * @param n2ndFmTideHrmnt
	 */
	public void setN2ndFmTideHrmnt(String n2ndFmTideHrmnt) {
		this.n2ndFmTideHrmnt = n2ndFmTideHrmnt;
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
	 * @param n1stTideToHrmnt
	 */
	public void setN1stTideToHrmnt(String n1stTideToHrmnt) {
		this.n1stTideToHrmnt = n1stTideToHrmnt;
	}
	
	/**
	 * Column Info
	 * @param n1stHighTideHgt
	 */
	public void setN1stHighTideHgt(String n1stHighTideHgt) {
		this.n1stHighTideHgt = n1stHighTideHgt;
	}
	
	/**
	 * Column Info
	 * @param n1stLowTideHgt
	 */
	public void setN1stLowTideHgt(String n1stLowTideHgt) {
		this.n1stLowTideHgt = n1stLowTideHgt;
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
	 * @param n1stTideFmHrmnt
	 */
	public void setN1stTideFmHrmnt(String n1stTideFmHrmnt) {
		this.n1stTideFmHrmnt = n1stTideFmHrmnt;
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
	 * @param locCd
	 */
	public void setLocCd(String locCd) {
		this.locCd = locCd;
	}
	
	/**
	 * Column Info
	 * @param tideMon
	 */
	public void setTideMon(String tideMon) {
		this.tideMon = tideMon;
	}
	
	/**
	 * Column Info
	 * @param n2ndToTideHrmnt
	 */
	public void setN2ndToTideHrmnt(String n2ndToTideHrmnt) {
		this.n2ndToTideHrmnt = n2ndToTideHrmnt;
	}
	
	/**
	 * Column Info
	 * @param tideDy
	 */
	public void setTideDy(String tideDy) {
		this.tideDy = tideDy;
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
	 * @param n2ndLowTideHgt
	 */
	public void setN2ndLowTideHgt(String n2ndLowTideHgt) {
		this.n2ndLowTideHgt = n2ndLowTideHgt;
	}
	
	/**
	 * Column Info
	 * @param n2ndHighTideHgt
	 */
	public void setN2ndHighTideHgt(String n2ndHighTideHgt) {
		this.n2ndHighTideHgt = n2ndHighTideHgt;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setTideYr(JSPUtil.getParameter(request, "tide_yr", ""));
		setN2ndFmTideHrmnt(JSPUtil.getParameter(request, "n2nd_fm_tide_hrmnt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setN1stTideToHrmnt(JSPUtil.getParameter(request, "n1st_tide_to_hrmnt", ""));
		setN1stHighTideHgt(JSPUtil.getParameter(request, "n1st_high_tide_hgt", ""));
		setN1stLowTideHgt(JSPUtil.getParameter(request, "n1st_low_tide_hgt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setN1stTideFmHrmnt(JSPUtil.getParameter(request, "n1st_tide_fm_hrmnt", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setLocCd(JSPUtil.getParameter(request, "loc_cd", ""));
		setTideMon(JSPUtil.getParameter(request, "tide_mon", ""));
		setN2ndToTideHrmnt(JSPUtil.getParameter(request, "n2nd_to_tide_hrmnt", ""));
		setTideDy(JSPUtil.getParameter(request, "tide_dy", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setN2ndLowTideHgt(JSPUtil.getParameter(request, "n2nd_low_tide_hgt", ""));
		setN2ndHighTideHgt(JSPUtil.getParameter(request, "n2nd_high_tide_hgt", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return VskPortTideVO[]
	 */
	public VskPortTideVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return VskPortTideVO[]
	 */
	public VskPortTideVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		VskPortTideVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] tideYr = (JSPUtil.getParameter(request, prefix	+ "tide_yr".trim(), length));
			String[] n2ndFmTideHrmnt = (JSPUtil.getParameter(request, prefix	+ "n2nd_fm_tide_hrmnt".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] n1stTideToHrmnt = (JSPUtil.getParameter(request, prefix	+ "n1st_tide_to_hrmnt".trim(), length));
			String[] n1stHighTideHgt = (JSPUtil.getParameter(request, prefix	+ "n1st_high_tide_hgt".trim(), length));
			String[] n1stLowTideHgt = (JSPUtil.getParameter(request, prefix	+ "n1st_low_tide_hgt".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] n1stTideFmHrmnt = (JSPUtil.getParameter(request, prefix	+ "n1st_tide_fm_hrmnt".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] locCd = (JSPUtil.getParameter(request, prefix	+ "loc_cd".trim(), length));
			String[] tideMon = (JSPUtil.getParameter(request, prefix	+ "tide_mon".trim(), length));
			String[] n2ndToTideHrmnt = (JSPUtil.getParameter(request, prefix	+ "n2nd_to_tide_hrmnt".trim(), length));
			String[] tideDy = (JSPUtil.getParameter(request, prefix	+ "tide_dy".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] n2ndLowTideHgt = (JSPUtil.getParameter(request, prefix	+ "n2nd_low_tide_hgt".trim(), length));
			String[] n2ndHighTideHgt = (JSPUtil.getParameter(request, prefix	+ "n2nd_high_tide_hgt".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new VskPortTideVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (tideYr[i] != null)
					model.setTideYr(tideYr[i]);
				if (n2ndFmTideHrmnt[i] != null)
					model.setN2ndFmTideHrmnt(n2ndFmTideHrmnt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (n1stTideToHrmnt[i] != null)
					model.setN1stTideToHrmnt(n1stTideToHrmnt[i]);
				if (n1stHighTideHgt[i] != null)
					model.setN1stHighTideHgt(n1stHighTideHgt[i]);
				if (n1stLowTideHgt[i] != null)
					model.setN1stLowTideHgt(n1stLowTideHgt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (n1stTideFmHrmnt[i] != null)
					model.setN1stTideFmHrmnt(n1stTideFmHrmnt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (locCd[i] != null)
					model.setLocCd(locCd[i]);
				if (tideMon[i] != null)
					model.setTideMon(tideMon[i]);
				if (n2ndToTideHrmnt[i] != null)
					model.setN2ndToTideHrmnt(n2ndToTideHrmnt[i]);
				if (tideDy[i] != null)
					model.setTideDy(tideDy[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (n2ndLowTideHgt[i] != null)
					model.setN2ndLowTideHgt(n2ndLowTideHgt[i]);
				if (n2ndHighTideHgt[i] != null)
					model.setN2ndHighTideHgt(n2ndHighTideHgt[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getVskPortTideVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return VskPortTideVO[]
	 */
	public VskPortTideVO[] getVskPortTideVOs(){
		VskPortTideVO[] vos = (VskPortTideVO[])models.toArray(new VskPortTideVO[models.size()]);
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
		this.tideYr = this.tideYr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n2ndFmTideHrmnt = this.n2ndFmTideHrmnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stTideToHrmnt = this.n1stTideToHrmnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stHighTideHgt = this.n1stHighTideHgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stLowTideHgt = this.n1stLowTideHgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stTideFmHrmnt = this.n1stTideFmHrmnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.locCd = this.locCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tideMon = this.tideMon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n2ndToTideHrmnt = this.n2ndToTideHrmnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tideDy = this.tideDy .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n2ndLowTideHgt = this.n2ndLowTideHgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n2ndHighTideHgt = this.n2ndHighTideHgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
