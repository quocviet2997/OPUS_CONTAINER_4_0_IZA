/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : EqrScnrMstVO.java
*@FileTitle : EqrScnrMstVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.24
*@LastModifier : 정은호
*@LastVersion : 1.0
* 2009.07.24 정은호 
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
 * @author 정은호
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class EqrScnrMstVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<EqrScnrMstVO> models = new ArrayList<EqrScnrMstVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String scnrRmk = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String scnrId = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String scnrAutoGenFlg = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String repoPlnCreFlg = null;
	/* Column Info */
	private String repoPlnDtrbFlg = null;
	/* Column Info */
	private String updUsrId = null;
	/* Page Number */
	private String pagerows = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public EqrScnrMstVO() {}

	public EqrScnrMstVO(String ibflag, String pagerows, String scnrId, String scnrAutoGenFlg, String repoPlnCreFlg, String repoPlnDtrbFlg, String scnrRmk, String deltFlg, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.scnrRmk = scnrRmk;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.scnrId = scnrId;
		this.deltFlg = deltFlg;
		this.scnrAutoGenFlg = scnrAutoGenFlg;
		this.creDt = creDt;
		this.repoPlnCreFlg = repoPlnCreFlg;
		this.repoPlnDtrbFlg = repoPlnDtrbFlg;
		this.updUsrId = updUsrId;
		this.pagerows = pagerows;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("scnr_rmk", getScnrRmk());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("scnr_id", getScnrId());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("scnr_auto_gen_flg", getScnrAutoGenFlg());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("repo_pln_cre_flg", getRepoPlnCreFlg());
		this.hashColumns.put("repo_pln_dtrb_flg", getRepoPlnDtrbFlg());
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
		this.hashFields.put("scnr_rmk", "scnrRmk");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("scnr_id", "scnrId");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("scnr_auto_gen_flg", "scnrAutoGenFlg");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("repo_pln_cre_flg", "repoPlnCreFlg");
		this.hashFields.put("repo_pln_dtrb_flg", "repoPlnDtrbFlg");
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
	 * @return scnrRmk
	 */
	public String getScnrRmk() {
		return this.scnrRmk;
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
	 * @return scnrId
	 */
	public String getScnrId() {
		return this.scnrId;
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
	 * @return scnrAutoGenFlg
	 */
	public String getScnrAutoGenFlg() {
		return this.scnrAutoGenFlg;
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
	 * @return repoPlnCreFlg
	 */
	public String getRepoPlnCreFlg() {
		return this.repoPlnCreFlg;
	}
	
	/**
	 * Column Info
	 * @return repoPlnDtrbFlg
	 */
	public String getRepoPlnDtrbFlg() {
		return this.repoPlnDtrbFlg;
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
	 * @param scnrRmk
	 */
	public void setScnrRmk(String scnrRmk) {
		this.scnrRmk = scnrRmk;
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
	 * @param scnrId
	 */
	public void setScnrId(String scnrId) {
		this.scnrId = scnrId;
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
	 * @param scnrAutoGenFlg
	 */
	public void setScnrAutoGenFlg(String scnrAutoGenFlg) {
		this.scnrAutoGenFlg = scnrAutoGenFlg;
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
	 * @param repoPlnCreFlg
	 */
	public void setRepoPlnCreFlg(String repoPlnCreFlg) {
		this.repoPlnCreFlg = repoPlnCreFlg;
	}
	
	/**
	 * Column Info
	 * @param repoPlnDtrbFlg
	 */
	public void setRepoPlnDtrbFlg(String repoPlnDtrbFlg) {
		this.repoPlnDtrbFlg = repoPlnDtrbFlg;
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
		setScnrRmk(JSPUtil.getParameter(request, "scnr_rmk", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setScnrId(JSPUtil.getParameter(request, "scnr_id", ""));
		setDeltFlg(JSPUtil.getParameter(request, "delt_flg", ""));
		setScnrAutoGenFlg(JSPUtil.getParameter(request, "scnr_auto_gen_flg", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setRepoPlnCreFlg(JSPUtil.getParameter(request, "repo_pln_cre_flg", ""));
		setRepoPlnDtrbFlg(JSPUtil.getParameter(request, "repo_pln_dtrb_flg", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return EqrScnrMstVO[]
	 */
	public EqrScnrMstVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return EqrScnrMstVO[]
	 */
	public EqrScnrMstVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		EqrScnrMstVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] scnrRmk = (JSPUtil.getParameter(request, prefix	+ "scnr_rmk", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] scnrId = (JSPUtil.getParameter(request, prefix	+ "scnr_id", length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg", length));
			String[] scnrAutoGenFlg = (JSPUtil.getParameter(request, prefix	+ "scnr_auto_gen_flg", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] repoPlnCreFlg = (JSPUtil.getParameter(request, prefix	+ "repo_pln_cre_flg", length));
			String[] repoPlnDtrbFlg = (JSPUtil.getParameter(request, prefix	+ "repo_pln_dtrb_flg", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			
			for (int i = 0; i < length; i++) {
				model = new EqrScnrMstVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (scnrRmk[i] != null)
					model.setScnrRmk(scnrRmk[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (scnrId[i] != null)
					model.setScnrId(scnrId[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (scnrAutoGenFlg[i] != null)
					model.setScnrAutoGenFlg(scnrAutoGenFlg[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (repoPlnCreFlg[i] != null)
					model.setRepoPlnCreFlg(repoPlnCreFlg[i]);
				if (repoPlnDtrbFlg[i] != null)
					model.setRepoPlnDtrbFlg(repoPlnDtrbFlg[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getEqrScnrMstVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return EqrScnrMstVO[]
	 */
	public EqrScnrMstVO[] getEqrScnrMstVOs(){
		EqrScnrMstVO[] vos = (EqrScnrMstVO[])models.toArray(new EqrScnrMstVO[models.size()]);
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
		this.scnrRmk = this.scnrRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.scnrId = this.scnrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.scnrAutoGenFlg = this.scnrAutoGenFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.repoPlnCreFlg = this.repoPlnCreFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.repoPlnDtrbFlg = this.repoPlnDtrbFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
