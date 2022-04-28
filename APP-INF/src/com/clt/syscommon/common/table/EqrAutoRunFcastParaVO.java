/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : EqrAutoRunFcastParaVO.java
*@FileTitle : EqrAutoRunFcastParaVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.02
*@LastModifier : 채창호
*@LastVersion : 1.0
* 2009.07.02 채창호 
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
 * @author 채창호
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class EqrAutoRunFcastParaVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<EqrAutoRunFcastParaVO> models = new ArrayList<EqrAutoRunFcastParaVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String repoFcastTpCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String coCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String effEndYrwk = null;
	/* Column Info */
	private String rccCd = null;
	/* Column Info */
	private String effStYrwk = null;
	/* Column Info */
	private String updUsrId = null;
	/* Page Number */
	private String pagerows = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public EqrAutoRunFcastParaVO() {}

	public EqrAutoRunFcastParaVO(String ibflag, String pagerows, String effStYrwk, String rccCd, String coCd, String repoFcastTpCd, String effEndYrwk, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.creUsrId = creUsrId;
		this.repoFcastTpCd = repoFcastTpCd;
		this.ibflag = ibflag;
		this.coCd = coCd;
		this.creDt = creDt;
		this.effEndYrwk = effEndYrwk;
		this.rccCd = rccCd;
		this.effStYrwk = effStYrwk;
		this.updUsrId = updUsrId;
		this.pagerows = pagerows;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("repo_fcast_tp_cd", getRepoFcastTpCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("co_cd", getCoCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("eff_end_yrwk", getEffEndYrwk());
		this.hashColumns.put("rcc_cd", getRccCd());
		this.hashColumns.put("eff_st_yrwk", getEffStYrwk());
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
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("repo_fcast_tp_cd", "repoFcastTpCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("co_cd", "coCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("eff_end_yrwk", "effEndYrwk");
		this.hashFields.put("rcc_cd", "rccCd");
		this.hashFields.put("eff_st_yrwk", "effStYrwk");
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
	 * @return creUsrId
	 */
	public String getCreUsrId() {
		return this.creUsrId;
	}
	
	/**
	 * Column Info
	 * @return repoFcastTpCd
	 */
	public String getRepoFcastTpCd() {
		return this.repoFcastTpCd;
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
	 * @return coCd
	 */
	public String getCoCd() {
		return this.coCd;
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
	 * @return effEndYrwk
	 */
	public String getEffEndYrwk() {
		return this.effEndYrwk;
	}
	
	/**
	 * Column Info
	 * @return rccCd
	 */
	public String getRccCd() {
		return this.rccCd;
	}
	
	/**
	 * Column Info
	 * @return effStYrwk
	 */
	public String getEffStYrwk() {
		return this.effStYrwk;
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
	 * @param creUsrId
	 */
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
	}
	
	/**
	 * Column Info
	 * @param repoFcastTpCd
	 */
	public void setRepoFcastTpCd(String repoFcastTpCd) {
		this.repoFcastTpCd = repoFcastTpCd;
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
	 * @param coCd
	 */
	public void setCoCd(String coCd) {
		this.coCd = coCd;
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
	 * @param effEndYrwk
	 */
	public void setEffEndYrwk(String effEndYrwk) {
		this.effEndYrwk = effEndYrwk;
	}
	
	/**
	 * Column Info
	 * @param rccCd
	 */
	public void setRccCd(String rccCd) {
		this.rccCd = rccCd;
	}
	
	/**
	 * Column Info
	 * @param effStYrwk
	 */
	public void setEffStYrwk(String effStYrwk) {
		this.effStYrwk = effStYrwk;
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
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setRepoFcastTpCd(JSPUtil.getParameter(request, "repo_fcast_tp_cd", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCoCd(JSPUtil.getParameter(request, "co_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setEffEndYrwk(JSPUtil.getParameter(request, "eff_end_yrwk", ""));
		setRccCd(JSPUtil.getParameter(request, "rcc_cd", ""));
		setEffStYrwk(JSPUtil.getParameter(request, "eff_st_yrwk", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return EqrAutoRunFcastParaVO[]
	 */
	public EqrAutoRunFcastParaVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return EqrAutoRunFcastParaVO[]
	 */
	public EqrAutoRunFcastParaVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		EqrAutoRunFcastParaVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] repoFcastTpCd = (JSPUtil.getParameter(request, prefix	+ "repo_fcast_tp_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] coCd = (JSPUtil.getParameter(request, prefix	+ "co_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] effEndYrwk = (JSPUtil.getParameter(request, prefix	+ "eff_end_yrwk", length));
			String[] rccCd = (JSPUtil.getParameter(request, prefix	+ "rcc_cd", length));
			String[] effStYrwk = (JSPUtil.getParameter(request, prefix	+ "eff_st_yrwk", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			
			for (int i = 0; i < length; i++) {
				model = new EqrAutoRunFcastParaVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (repoFcastTpCd[i] != null)
					model.setRepoFcastTpCd(repoFcastTpCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (coCd[i] != null)
					model.setCoCd(coCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (effEndYrwk[i] != null)
					model.setEffEndYrwk(effEndYrwk[i]);
				if (rccCd[i] != null)
					model.setRccCd(rccCd[i]);
				if (effStYrwk[i] != null)
					model.setEffStYrwk(effStYrwk[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getEqrAutoRunFcastParaVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return EqrAutoRunFcastParaVO[]
	 */
	public EqrAutoRunFcastParaVO[] getEqrAutoRunFcastParaVOs(){
		EqrAutoRunFcastParaVO[] vos = (EqrAutoRunFcastParaVO[])models.toArray(new EqrAutoRunFcastParaVO[models.size()]);
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
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.repoFcastTpCd = this.repoFcastTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.coCd = this.coCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.effEndYrwk = this.effEndYrwk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rccCd = this.rccCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.effStYrwk = this.effStYrwk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
