/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CoaUtCostCreStsVO.java
*@FileTitle : CoaUtCostCreStsVO
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

public class CoaUtCostCreStsVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<CoaUtCostCreStsVO> models = new ArrayList<CoaUtCostCreStsVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String costSrcFmYrmon = null;
	/* Column Info */
	private String cmUcCd = null;
	/* Column Info */
	private String costSrcToYrmon = null;
	/* Column Info */
	private String eccCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String costIfStsCd = null;
	/* Column Info */
	private String costCreStsCd = null;
	/* Page Number */
	private String pagerows = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String locCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String costYrmon = null;
	/* Column Info */
	private String sccCd = null;
	/* Column Info */
	private String costCreFlg = null;
	/* Column Info */
	private String updUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public CoaUtCostCreStsVO() {}

	public CoaUtCostCreStsVO(String ibflag, String pagerows, String costYrmon, String cmUcCd, String costCreFlg, String eccCd, String sccCd, String locCd, String costCreStsCd, String costIfStsCd, String costSrcFmYrmon, String costSrcToYrmon, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.costSrcFmYrmon = costSrcFmYrmon;
		this.cmUcCd = cmUcCd;
		this.costSrcToYrmon = costSrcToYrmon;
		this.eccCd = eccCd;
		this.creDt = creDt;
		this.costIfStsCd = costIfStsCd;
		this.costCreStsCd = costCreStsCd;
		this.pagerows = pagerows;
		this.ibflag = ibflag;
		this.locCd = locCd;
		this.creUsrId = creUsrId;
		this.costYrmon = costYrmon;
		this.sccCd = sccCd;
		this.costCreFlg = costCreFlg;
		this.updUsrId = updUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("cost_src_fm_yrmon", getCostSrcFmYrmon());
		this.hashColumns.put("cm_uc_cd", getCmUcCd());
		this.hashColumns.put("cost_src_to_yrmon", getCostSrcToYrmon());
		this.hashColumns.put("ecc_cd", getEccCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("cost_if_sts_cd", getCostIfStsCd());
		this.hashColumns.put("cost_cre_sts_cd", getCostCreStsCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("loc_cd", getLocCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("cost_yrmon", getCostYrmon());
		this.hashColumns.put("scc_cd", getSccCd());
		this.hashColumns.put("cost_cre_flg", getCostCreFlg());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("cost_src_fm_yrmon", "costSrcFmYrmon");
		this.hashFields.put("cm_uc_cd", "cmUcCd");
		this.hashFields.put("cost_src_to_yrmon", "costSrcToYrmon");
		this.hashFields.put("ecc_cd", "eccCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("cost_if_sts_cd", "costIfStsCd");
		this.hashFields.put("cost_cre_sts_cd", "costCreStsCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("loc_cd", "locCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("cost_yrmon", "costYrmon");
		this.hashFields.put("scc_cd", "sccCd");
		this.hashFields.put("cost_cre_flg", "costCreFlg");
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
	 * @return costSrcFmYrmon
	 */
	public String getCostSrcFmYrmon() {
		return this.costSrcFmYrmon;
	}
	
	/**
	 * Column Info
	 * @return cmUcCd
	 */
	public String getCmUcCd() {
		return this.cmUcCd;
	}
	
	/**
	 * Column Info
	 * @return costSrcToYrmon
	 */
	public String getCostSrcToYrmon() {
		return this.costSrcToYrmon;
	}
	
	/**
	 * Column Info
	 * @return eccCd
	 */
	public String getEccCd() {
		return this.eccCd;
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
	 * @return costIfStsCd
	 */
	public String getCostIfStsCd() {
		return this.costIfStsCd;
	}
	
	/**
	 * Column Info
	 * @return costCreStsCd
	 */
	public String getCostCreStsCd() {
		return this.costCreStsCd;
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
	 * @return costYrmon
	 */
	public String getCostYrmon() {
		return this.costYrmon;
	}
	
	/**
	 * Column Info
	 * @return sccCd
	 */
	public String getSccCd() {
		return this.sccCd;
	}
	
	/**
	 * Column Info
	 * @return costCreFlg
	 */
	public String getCostCreFlg() {
		return this.costCreFlg;
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
	 * @param costSrcFmYrmon
	 */
	public void setCostSrcFmYrmon(String costSrcFmYrmon) {
		this.costSrcFmYrmon = costSrcFmYrmon;
	}
	
	/**
	 * Column Info
	 * @param cmUcCd
	 */
	public void setCmUcCd(String cmUcCd) {
		this.cmUcCd = cmUcCd;
	}
	
	/**
	 * Column Info
	 * @param costSrcToYrmon
	 */
	public void setCostSrcToYrmon(String costSrcToYrmon) {
		this.costSrcToYrmon = costSrcToYrmon;
	}
	
	/**
	 * Column Info
	 * @param eccCd
	 */
	public void setEccCd(String eccCd) {
		this.eccCd = eccCd;
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
	 * @param costIfStsCd
	 */
	public void setCostIfStsCd(String costIfStsCd) {
		this.costIfStsCd = costIfStsCd;
	}
	
	/**
	 * Column Info
	 * @param costCreStsCd
	 */
	public void setCostCreStsCd(String costCreStsCd) {
		this.costCreStsCd = costCreStsCd;
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
	 * @param costYrmon
	 */
	public void setCostYrmon(String costYrmon) {
		this.costYrmon = costYrmon;
	}
	
	/**
	 * Column Info
	 * @param sccCd
	 */
	public void setSccCd(String sccCd) {
		this.sccCd = sccCd;
	}
	
	/**
	 * Column Info
	 * @param costCreFlg
	 */
	public void setCostCreFlg(String costCreFlg) {
		this.costCreFlg = costCreFlg;
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
		setCostSrcFmYrmon(JSPUtil.getParameter(request, "cost_src_fm_yrmon", ""));
		setCmUcCd(JSPUtil.getParameter(request, "cm_uc_cd", ""));
		setCostSrcToYrmon(JSPUtil.getParameter(request, "cost_src_to_yrmon", ""));
		setEccCd(JSPUtil.getParameter(request, "ecc_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setCostIfStsCd(JSPUtil.getParameter(request, "cost_if_sts_cd", ""));
		setCostCreStsCd(JSPUtil.getParameter(request, "cost_cre_sts_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setLocCd(JSPUtil.getParameter(request, "loc_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setCostYrmon(JSPUtil.getParameter(request, "cost_yrmon", ""));
		setSccCd(JSPUtil.getParameter(request, "scc_cd", ""));
		setCostCreFlg(JSPUtil.getParameter(request, "cost_cre_flg", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return CoaUtCostCreStsVO[]
	 */
	public CoaUtCostCreStsVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return CoaUtCostCreStsVO[]
	 */
	public CoaUtCostCreStsVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		CoaUtCostCreStsVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] costSrcFmYrmon = (JSPUtil.getParameter(request, prefix	+ "cost_src_fm_yrmon", length));
			String[] cmUcCd = (JSPUtil.getParameter(request, prefix	+ "cm_uc_cd", length));
			String[] costSrcToYrmon = (JSPUtil.getParameter(request, prefix	+ "cost_src_to_yrmon", length));
			String[] eccCd = (JSPUtil.getParameter(request, prefix	+ "ecc_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] costIfStsCd = (JSPUtil.getParameter(request, prefix	+ "cost_if_sts_cd", length));
			String[] costCreStsCd = (JSPUtil.getParameter(request, prefix	+ "cost_cre_sts_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] locCd = (JSPUtil.getParameter(request, prefix	+ "loc_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] costYrmon = (JSPUtil.getParameter(request, prefix	+ "cost_yrmon", length));
			String[] sccCd = (JSPUtil.getParameter(request, prefix	+ "scc_cd", length));
			String[] costCreFlg = (JSPUtil.getParameter(request, prefix	+ "cost_cre_flg", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			
			for (int i = 0; i < length; i++) {
				model = new CoaUtCostCreStsVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (costSrcFmYrmon[i] != null)
					model.setCostSrcFmYrmon(costSrcFmYrmon[i]);
				if (cmUcCd[i] != null)
					model.setCmUcCd(cmUcCd[i]);
				if (costSrcToYrmon[i] != null)
					model.setCostSrcToYrmon(costSrcToYrmon[i]);
				if (eccCd[i] != null)
					model.setEccCd(eccCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (costIfStsCd[i] != null)
					model.setCostIfStsCd(costIfStsCd[i]);
				if (costCreStsCd[i] != null)
					model.setCostCreStsCd(costCreStsCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (locCd[i] != null)
					model.setLocCd(locCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (costYrmon[i] != null)
					model.setCostYrmon(costYrmon[i]);
				if (sccCd[i] != null)
					model.setSccCd(sccCd[i]);
				if (costCreFlg[i] != null)
					model.setCostCreFlg(costCreFlg[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getCoaUtCostCreStsVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return CoaUtCostCreStsVO[]
	 */
	public CoaUtCostCreStsVO[] getCoaUtCostCreStsVOs(){
		CoaUtCostCreStsVO[] vos = (CoaUtCostCreStsVO[])models.toArray(new CoaUtCostCreStsVO[models.size()]);
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
		this.costSrcFmYrmon = this.costSrcFmYrmon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cmUcCd = this.cmUcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costSrcToYrmon = this.costSrcToYrmon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eccCd = this.eccCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costIfStsCd = this.costIfStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costCreStsCd = this.costCreStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.locCd = this.locCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costYrmon = this.costYrmon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sccCd = this.sccCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costCreFlg = this.costCreFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
