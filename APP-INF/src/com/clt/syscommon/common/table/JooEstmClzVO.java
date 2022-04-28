/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : JooEstmClzVO.java
*@FileTitle : JooEstmClzVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.06.04
*@LastModifier : 함대성
*@LastVersion : 1.0
* 2009.06.04 함대성 
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
 * @author 함대성
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class JooEstmClzVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<JooEstmClzVO> models = new ArrayList<JooEstmClzVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String estmClzYr = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String estmClzMon = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String estmClzDt = null;
	/* Column Info */
	private String estmClzFlg = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String estmRmk = null;
	/* Page Number */
	private String pagerows = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public JooEstmClzVO() {}

	public JooEstmClzVO(String ibflag, String pagerows, String estmClzYr, String estmClzMon, String estmClzFlg, String estmClzDt, String estmRmk, String creDt, String creUsrId, String updDt, String updUsrId) {
		this.updDt = updDt;
		this.estmClzYr = estmClzYr;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.estmClzMon = estmClzMon;
		this.creDt = creDt;
		this.estmClzDt = estmClzDt;
		this.estmClzFlg = estmClzFlg;
		this.updUsrId = updUsrId;
		this.estmRmk = estmRmk;
		this.pagerows = pagerows;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("estm_clz_yr", getEstmClzYr());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("estm_clz_mon", getEstmClzMon());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("estm_clz_dt", getEstmClzDt());
		this.hashColumns.put("estm_clz_flg", getEstmClzFlg());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("estm_rmk", getEstmRmk());
		this.hashColumns.put("pagerows", getPagerows());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("estm_clz_yr", "estmClzYr");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("estm_clz_mon", "estmClzMon");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("estm_clz_dt", "estmClzDt");
		this.hashFields.put("estm_clz_flg", "estmClzFlg");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("estm_rmk", "estmRmk");
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
	 * @return estmClzYr
	 */
	public String getEstmClzYr() {
		return this.estmClzYr;
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
	 * @return estmClzMon
	 */
	public String getEstmClzMon() {
		return this.estmClzMon;
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
	 * @return estmClzDt
	 */
	public String getEstmClzDt() {
		return this.estmClzDt;
	}
	
	/**
	 * Column Info
	 * @return estmClzFlg
	 */
	public String getEstmClzFlg() {
		return this.estmClzFlg;
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
	 * @return estmRmk
	 */
	public String getEstmRmk() {
		return this.estmRmk;
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
	 * @param estmClzYr
	 */
	public void setEstmClzYr(String estmClzYr) {
		this.estmClzYr = estmClzYr;
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
	 * @param estmClzMon
	 */
	public void setEstmClzMon(String estmClzMon) {
		this.estmClzMon = estmClzMon;
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
	 * @param estmClzDt
	 */
	public void setEstmClzDt(String estmClzDt) {
		this.estmClzDt = estmClzDt;
	}
	
	/**
	 * Column Info
	 * @param estmClzFlg
	 */
	public void setEstmClzFlg(String estmClzFlg) {
		this.estmClzFlg = estmClzFlg;
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
	 * @param estmRmk
	 */
	public void setEstmRmk(String estmRmk) {
		this.estmRmk = estmRmk;
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
		setEstmClzYr(JSPUtil.getParameter(request, "estm_clz_yr", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setEstmClzMon(JSPUtil.getParameter(request, "estm_clz_mon", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setEstmClzDt(JSPUtil.getParameter(request, "estm_clz_dt", ""));
		setEstmClzFlg(JSPUtil.getParameter(request, "estm_clz_flg", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setEstmRmk(JSPUtil.getParameter(request, "estm_rmk", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return JooEstmClzVO[]
	 */
	public JooEstmClzVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return JooEstmClzVO[]
	 */
	public JooEstmClzVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		JooEstmClzVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] estmClzYr = (JSPUtil.getParameter(request, prefix	+ "estm_clz_yr".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] estmClzMon = (JSPUtil.getParameter(request, prefix	+ "estm_clz_mon".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] estmClzDt = (JSPUtil.getParameter(request, prefix	+ "estm_clz_dt".trim(), length));
			String[] estmClzFlg = (JSPUtil.getParameter(request, prefix	+ "estm_clz_flg".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] estmRmk = (JSPUtil.getParameter(request, prefix	+ "estm_rmk".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new JooEstmClzVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (estmClzYr[i] != null)
					model.setEstmClzYr(estmClzYr[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (estmClzMon[i] != null)
					model.setEstmClzMon(estmClzMon[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (estmClzDt[i] != null)
					model.setEstmClzDt(estmClzDt[i]);
				if (estmClzFlg[i] != null)
					model.setEstmClzFlg(estmClzFlg[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (estmRmk[i] != null)
					model.setEstmRmk(estmRmk[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getJooEstmClzVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return JooEstmClzVO[]
	 */
	public JooEstmClzVO[] getJooEstmClzVOs(){
		JooEstmClzVO[] vos = (JooEstmClzVO[])models.toArray(new JooEstmClzVO[models.size()]);
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
		this.estmClzYr = this.estmClzYr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.estmClzMon = this.estmClzMon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.estmClzDt = this.estmClzDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.estmClzFlg = this.estmClzFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.estmRmk = this.estmRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
