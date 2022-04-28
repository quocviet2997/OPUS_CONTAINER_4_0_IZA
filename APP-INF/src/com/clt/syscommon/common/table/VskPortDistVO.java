/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : VskPortDistVO.java
*@FileTitle : VskPortDistVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.06.22
*@LastModifier : 정진우
*@LastVersion : 1.0
* 2009.06.22 정진우 
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

public class VskPortDistVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<VskPortDistVO> models = new ArrayList<VskPortDistVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String gmtTdHrs = null;
	/* Column Info */
	private String stndDist = null;
	/* Column Info */
	private String stndDistDesc = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String toLocCd = null;
	/* Column Info */
	private String shrtDistDesc = null;
	/* Page Number */
	private String pagerows = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String shrtDist = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String fmLocCd = null;
	/* Column Info */
	private String updUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public VskPortDistVO() {}

	public VskPortDistVO(String ibflag, String pagerows, String fmLocCd, String toLocCd, String stndDist, String stndDistDesc, String shrtDist, String shrtDistDesc, String gmtTdHrs, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.gmtTdHrs = gmtTdHrs;
		this.stndDist = stndDist;
		this.stndDistDesc = stndDistDesc;
		this.creDt = creDt;
		this.toLocCd = toLocCd;
		this.shrtDistDesc = shrtDistDesc;
		this.pagerows = pagerows;
		this.ibflag = ibflag;
		this.shrtDist = shrtDist;
		this.creUsrId = creUsrId;
		this.fmLocCd = fmLocCd;
		this.updUsrId = updUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("gmt_td_hrs", getGmtTdHrs());
		this.hashColumns.put("stnd_dist", getStndDist());
		this.hashColumns.put("stnd_dist_desc", getStndDistDesc());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("to_loc_cd", getToLocCd());
		this.hashColumns.put("shrt_dist_desc", getShrtDistDesc());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("shrt_dist", getShrtDist());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("fm_loc_cd", getFmLocCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("gmt_td_hrs", "gmtTdHrs");
		this.hashFields.put("stnd_dist", "stndDist");
		this.hashFields.put("stnd_dist_desc", "stndDistDesc");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("to_loc_cd", "toLocCd");
		this.hashFields.put("shrt_dist_desc", "shrtDistDesc");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("shrt_dist", "shrtDist");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("fm_loc_cd", "fmLocCd");
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
	 * @return gmtTdHrs
	 */
	public String getGmtTdHrs() {
		return this.gmtTdHrs;
	}
	
	/**
	 * Column Info
	 * @return stndDist
	 */
	public String getStndDist() {
		return this.stndDist;
	}
	
	/**
	 * Column Info
	 * @return stndDistDesc
	 */
	public String getStndDistDesc() {
		return this.stndDistDesc;
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
	 * @return toLocCd
	 */
	public String getToLocCd() {
		return this.toLocCd;
	}
	
	/**
	 * Column Info
	 * @return shrtDistDesc
	 */
	public String getShrtDistDesc() {
		return this.shrtDistDesc;
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
	 * @return shrtDist
	 */
	public String getShrtDist() {
		return this.shrtDist;
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
	 * @return fmLocCd
	 */
	public String getFmLocCd() {
		return this.fmLocCd;
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
	 * @param gmtTdHrs
	 */
	public void setGmtTdHrs(String gmtTdHrs) {
		this.gmtTdHrs = gmtTdHrs;
	}
	
	/**
	 * Column Info
	 * @param stndDist
	 */
	public void setStndDist(String stndDist) {
		this.stndDist = stndDist;
	}
	
	/**
	 * Column Info
	 * @param stndDistDesc
	 */
	public void setStndDistDesc(String stndDistDesc) {
		this.stndDistDesc = stndDistDesc;
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
	 * @param toLocCd
	 */
	public void setToLocCd(String toLocCd) {
		this.toLocCd = toLocCd;
	}
	
	/**
	 * Column Info
	 * @param shrtDistDesc
	 */
	public void setShrtDistDesc(String shrtDistDesc) {
		this.shrtDistDesc = shrtDistDesc;
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
	 * @param shrtDist
	 */
	public void setShrtDist(String shrtDist) {
		this.shrtDist = shrtDist;
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
	 * @param fmLocCd
	 */
	public void setFmLocCd(String fmLocCd) {
		this.fmLocCd = fmLocCd;
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
		setGmtTdHrs(JSPUtil.getParameter(request, "gmt_td_hrs", ""));
		setStndDist(JSPUtil.getParameter(request, "stnd_dist", ""));
		setStndDistDesc(JSPUtil.getParameter(request, "stnd_dist_desc", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setToLocCd(JSPUtil.getParameter(request, "to_loc_cd", ""));
		setShrtDistDesc(JSPUtil.getParameter(request, "shrt_dist_desc", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setShrtDist(JSPUtil.getParameter(request, "shrt_dist", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setFmLocCd(JSPUtil.getParameter(request, "fm_loc_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return VskPortDistVO[]
	 */
	public VskPortDistVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return VskPortDistVO[]
	 */
	public VskPortDistVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		VskPortDistVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] gmtTdHrs = (JSPUtil.getParameter(request, prefix	+ "gmt_td_hrs".trim(), length));
			String[] stndDist = (JSPUtil.getParameter(request, prefix	+ "stnd_dist".trim(), length));
			String[] stndDistDesc = (JSPUtil.getParameter(request, prefix	+ "stnd_dist_desc".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] toLocCd = (JSPUtil.getParameter(request, prefix	+ "to_loc_cd".trim(), length));
			String[] shrtDistDesc = (JSPUtil.getParameter(request, prefix	+ "shrt_dist_desc".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] shrtDist = (JSPUtil.getParameter(request, prefix	+ "shrt_dist".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] fmLocCd = (JSPUtil.getParameter(request, prefix	+ "fm_loc_cd".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new VskPortDistVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (gmtTdHrs[i] != null)
					model.setGmtTdHrs(gmtTdHrs[i]);
				if (stndDist[i] != null)
					model.setStndDist(stndDist[i]);
				if (stndDistDesc[i] != null)
					model.setStndDistDesc(stndDistDesc[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (toLocCd[i] != null)
					model.setToLocCd(toLocCd[i]);
				if (shrtDistDesc[i] != null)
					model.setShrtDistDesc(shrtDistDesc[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (shrtDist[i] != null)
					model.setShrtDist(shrtDist[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (fmLocCd[i] != null)
					model.setFmLocCd(fmLocCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getVskPortDistVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return VskPortDistVO[]
	 */
	public VskPortDistVO[] getVskPortDistVOs(){
		VskPortDistVO[] vos = (VskPortDistVO[])models.toArray(new VskPortDistVO[models.size()]);
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
		this.gmtTdHrs = this.gmtTdHrs .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stndDist = this.stndDist .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stndDistDesc = this.stndDistDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.toLocCd = this.toLocCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.shrtDistDesc = this.shrtDistDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.shrtDist = this.shrtDist .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fmLocCd = this.fmLocCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
