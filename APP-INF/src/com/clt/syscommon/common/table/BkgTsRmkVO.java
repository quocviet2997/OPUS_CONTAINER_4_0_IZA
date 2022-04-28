/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BkgTsRmkVO.java
*@FileTitle : BkgTsRmkVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.09.15
*@LastModifier : 최영희
*@LastVersion : 1.0
* 2009.09.15 최영희 
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
 * @author 최영희
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class BkgTsRmkVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgTsRmkVO> models = new ArrayList<BkgTsRmkVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String tsAsgnDt = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String tsAsgnFlg = null;
	/* Column Info */
	private String bkgNo = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String tsRmk = null;
	/* Column Info */
	private String tsRmkDeltFlg = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String tsAsgnUsrId = null;
	/* Column Info */
	private String updUsrId = null;
	/* Page Number */
	private String pagerows = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgTsRmkVO() {}

	public BkgTsRmkVO(String ibflag, String pagerows, String bkgNo, String tsRmk, String tsAsgnFlg, String tsAsgnUsrId, String tsAsgnDt, String tsRmkDeltFlg, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.tsAsgnDt = tsAsgnDt;
		this.creUsrId = creUsrId;
		this.tsAsgnFlg = tsAsgnFlg;
		this.bkgNo = bkgNo;
		this.ibflag = ibflag;
		this.tsRmk = tsRmk;
		this.tsRmkDeltFlg = tsRmkDeltFlg;
		this.creDt = creDt;
		this.tsAsgnUsrId = tsAsgnUsrId;
		this.updUsrId = updUsrId;
		this.pagerows = pagerows;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("ts_asgn_dt", getTsAsgnDt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ts_asgn_flg", getTsAsgnFlg());
		this.hashColumns.put("bkg_no", getBkgNo());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("ts_rmk", getTsRmk());
		this.hashColumns.put("ts_rmk_delt_flg", getTsRmkDeltFlg());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("ts_asgn_usr_id", getTsAsgnUsrId());
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
		this.hashFields.put("ts_asgn_dt", "tsAsgnDt");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ts_asgn_flg", "tsAsgnFlg");
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("ts_rmk", "tsRmk");
		this.hashFields.put("ts_rmk_delt_flg", "tsRmkDeltFlg");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("ts_asgn_usr_id", "tsAsgnUsrId");
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
	 * @return tsAsgnDt
	 */
	public String getTsAsgnDt() {
		return this.tsAsgnDt;
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
	 * @return tsAsgnFlg
	 */
	public String getTsAsgnFlg() {
		return this.tsAsgnFlg;
	}
	
	/**
	 * Column Info
	 * @return bkgNo
	 */
	public String getBkgNo() {
		return this.bkgNo;
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
	 * @return tsRmk
	 */
	public String getTsRmk() {
		return this.tsRmk;
	}
	
	/**
	 * Column Info
	 * @return tsRmkDeltFlg
	 */
	public String getTsRmkDeltFlg() {
		return this.tsRmkDeltFlg;
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
	 * @return tsAsgnUsrId
	 */
	public String getTsAsgnUsrId() {
		return this.tsAsgnUsrId;
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
	 * @param tsAsgnDt
	 */
	public void setTsAsgnDt(String tsAsgnDt) {
		this.tsAsgnDt = tsAsgnDt;
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
	 * @param tsAsgnFlg
	 */
	public void setTsAsgnFlg(String tsAsgnFlg) {
		this.tsAsgnFlg = tsAsgnFlg;
	}
	
	/**
	 * Column Info
	 * @param bkgNo
	 */
	public void setBkgNo(String bkgNo) {
		this.bkgNo = bkgNo;
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
	 * @param tsRmk
	 */
	public void setTsRmk(String tsRmk) {
		this.tsRmk = tsRmk;
	}
	
	/**
	 * Column Info
	 * @param tsRmkDeltFlg
	 */
	public void setTsRmkDeltFlg(String tsRmkDeltFlg) {
		this.tsRmkDeltFlg = tsRmkDeltFlg;
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
	 * @param tsAsgnUsrId
	 */
	public void setTsAsgnUsrId(String tsAsgnUsrId) {
		this.tsAsgnUsrId = tsAsgnUsrId;
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
		setTsAsgnDt(JSPUtil.getParameter(request, "ts_asgn_dt", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setTsAsgnFlg(JSPUtil.getParameter(request, "ts_asgn_flg", ""));
		setBkgNo(JSPUtil.getParameter(request, "bkg_no", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setTsRmk(JSPUtil.getParameter(request, "ts_rmk", ""));
		setTsRmkDeltFlg(JSPUtil.getParameter(request, "ts_rmk_delt_flg", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setTsAsgnUsrId(JSPUtil.getParameter(request, "ts_asgn_usr_id", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BkgTsRmkVO[]
	 */
	public BkgTsRmkVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgTsRmkVO[]
	 */
	public BkgTsRmkVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgTsRmkVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] tsAsgnDt = (JSPUtil.getParameter(request, prefix	+ "ts_asgn_dt", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] tsAsgnFlg = (JSPUtil.getParameter(request, prefix	+ "ts_asgn_flg", length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] tsRmk = (JSPUtil.getParameter(request, prefix	+ "ts_rmk", length));
			String[] tsRmkDeltFlg = (JSPUtil.getParameter(request, prefix	+ "ts_rmk_delt_flg", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] tsAsgnUsrId = (JSPUtil.getParameter(request, prefix	+ "ts_asgn_usr_id", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgTsRmkVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (tsAsgnDt[i] != null)
					model.setTsAsgnDt(tsAsgnDt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (tsAsgnFlg[i] != null)
					model.setTsAsgnFlg(tsAsgnFlg[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (tsRmk[i] != null)
					model.setTsRmk(tsRmk[i]);
				if (tsRmkDeltFlg[i] != null)
					model.setTsRmkDeltFlg(tsRmkDeltFlg[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (tsAsgnUsrId[i] != null)
					model.setTsAsgnUsrId(tsAsgnUsrId[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgTsRmkVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BkgTsRmkVO[]
	 */
	public BkgTsRmkVO[] getBkgTsRmkVOs(){
		BkgTsRmkVO[] vos = (BkgTsRmkVO[])models.toArray(new BkgTsRmkVO[models.size()]);
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
		this.tsAsgnDt = this.tsAsgnDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tsAsgnFlg = this.tsAsgnFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNo = this.bkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tsRmk = this.tsRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tsRmkDeltFlg = this.tsRmkDeltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tsAsgnUsrId = this.tsAsgnUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
