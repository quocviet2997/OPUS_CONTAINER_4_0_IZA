/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : ScgImdgCompGrpSegrVO.java
*@FileTitle : ScgImdgCompGrpSegrVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.28
*@LastModifier : 이도형
*@LastVersion : 1.0
* 2009.05.28 이도형 
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

public class ScgImdgCompGrpSegrVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<ScgImdgCompGrpSegrVO> models = new ArrayList<ScgImdgCompGrpSegrVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String imdgSegrNtcNo = null;
	/* Column Info */
	private String imdgSegrCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String rowImdgCompGrpCd = null;
	/* Column Info */
	private String colImdgCompGrpCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Page Number */
	private String pagerows = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public ScgImdgCompGrpSegrVO() {}

	public ScgImdgCompGrpSegrVO(String ibflag, String pagerows, String rowImdgCompGrpCd, String colImdgCompGrpCd, String imdgSegrCd, String imdgSegrNtcNo, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.imdgSegrNtcNo = imdgSegrNtcNo;
		this.imdgSegrCd = imdgSegrCd;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.creDt = creDt;
		this.rowImdgCompGrpCd = rowImdgCompGrpCd;
		this.colImdgCompGrpCd = colImdgCompGrpCd;
		this.updUsrId = updUsrId;
		this.pagerows = pagerows;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("imdg_segr_ntc_no", getImdgSegrNtcNo());
		this.hashColumns.put("imdg_segr_cd", getImdgSegrCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("row_imdg_comp_grp_cd", getRowImdgCompGrpCd());
		this.hashColumns.put("col_imdg_comp_grp_cd", getColImdgCompGrpCd());
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
		this.hashFields.put("imdg_segr_ntc_no", "imdgSegrNtcNo");
		this.hashFields.put("imdg_segr_cd", "imdgSegrCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("row_imdg_comp_grp_cd", "rowImdgCompGrpCd");
		this.hashFields.put("col_imdg_comp_grp_cd", "colImdgCompGrpCd");
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
	 * @return imdgSegrNtcNo
	 */
	public String getImdgSegrNtcNo() {
		return this.imdgSegrNtcNo;
	}
	
	/**
	 * Column Info
	 * @return imdgSegrCd
	 */
	public String getImdgSegrCd() {
		return this.imdgSegrCd;
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
	 * @return creDt
	 */
	public String getCreDt() {
		return this.creDt;
	}
	
	/**
	 * Column Info
	 * @return rowImdgCompGrpCd
	 */
	public String getRowImdgCompGrpCd() {
		return this.rowImdgCompGrpCd;
	}
	
	/**
	 * Column Info
	 * @return colImdgCompGrpCd
	 */
	public String getColImdgCompGrpCd() {
		return this.colImdgCompGrpCd;
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
	 * @param imdgSegrNtcNo
	 */
	public void setImdgSegrNtcNo(String imdgSegrNtcNo) {
		this.imdgSegrNtcNo = imdgSegrNtcNo;
	}
	
	/**
	 * Column Info
	 * @param imdgSegrCd
	 */
	public void setImdgSegrCd(String imdgSegrCd) {
		this.imdgSegrCd = imdgSegrCd;
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
	 * @param creDt
	 */
	public void setCreDt(String creDt) {
		this.creDt = creDt;
	}
	
	/**
	 * Column Info
	 * @param rowImdgCompGrpCd
	 */
	public void setRowImdgCompGrpCd(String rowImdgCompGrpCd) {
		this.rowImdgCompGrpCd = rowImdgCompGrpCd;
	}
	
	/**
	 * Column Info
	 * @param colImdgCompGrpCd
	 */
	public void setColImdgCompGrpCd(String colImdgCompGrpCd) {
		this.colImdgCompGrpCd = colImdgCompGrpCd;
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
		setImdgSegrNtcNo(JSPUtil.getParameter(request, "imdg_segr_ntc_no", ""));
		setImdgSegrCd(JSPUtil.getParameter(request, "imdg_segr_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setRowImdgCompGrpCd(JSPUtil.getParameter(request, "row_imdg_comp_grp_cd", ""));
		setColImdgCompGrpCd(JSPUtil.getParameter(request, "col_imdg_comp_grp_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return ScgImdgCompGrpSegrVO[]
	 */
	public ScgImdgCompGrpSegrVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return ScgImdgCompGrpSegrVO[]
	 */
	public ScgImdgCompGrpSegrVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		ScgImdgCompGrpSegrVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] imdgSegrNtcNo = (JSPUtil.getParameter(request, prefix	+ "imdg_segr_ntc_no".trim(), length));
			String[] imdgSegrCd = (JSPUtil.getParameter(request, prefix	+ "imdg_segr_cd".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] rowImdgCompGrpCd = (JSPUtil.getParameter(request, prefix	+ "row_imdg_comp_grp_cd".trim(), length));
			String[] colImdgCompGrpCd = (JSPUtil.getParameter(request, prefix	+ "col_imdg_comp_grp_cd".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new ScgImdgCompGrpSegrVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (imdgSegrNtcNo[i] != null)
					model.setImdgSegrNtcNo(imdgSegrNtcNo[i]);
				if (imdgSegrCd[i] != null)
					model.setImdgSegrCd(imdgSegrCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (rowImdgCompGrpCd[i] != null)
					model.setRowImdgCompGrpCd(rowImdgCompGrpCd[i]);
				if (colImdgCompGrpCd[i] != null)
					model.setColImdgCompGrpCd(colImdgCompGrpCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getScgImdgCompGrpSegrVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return ScgImdgCompGrpSegrVO[]
	 */
	public ScgImdgCompGrpSegrVO[] getScgImdgCompGrpSegrVOs(){
		ScgImdgCompGrpSegrVO[] vos = (ScgImdgCompGrpSegrVO[])models.toArray(new ScgImdgCompGrpSegrVO[models.size()]);
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
		this.imdgSegrNtcNo = this.imdgSegrNtcNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.imdgSegrCd = this.imdgSegrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rowImdgCompGrpCd = this.rowImdgCompGrpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.colImdgCompGrpCd = this.colImdgCompGrpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
