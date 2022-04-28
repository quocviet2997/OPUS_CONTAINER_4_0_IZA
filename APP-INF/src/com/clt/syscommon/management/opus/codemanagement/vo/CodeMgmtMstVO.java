/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CodeMgmtMstVO.java
*@FileTitle : CodeMgmtMstVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.25
*@LastModifier : 이선영
*@LastVersion : 1.0
* 2009.05.25 이선영 
* 1.0 Creation
=========================================================*/

package com.clt.syscommon.management.opus.codemanagement.vo;

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
 * @author 이선영
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class CodeMgmtMstVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<CodeMgmtMstVO> models = new ArrayList<CodeMgmtMstVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String intgCdUseFlg = null;
	/* Column Info */
	private String intgCdNm = null;
	/* Column Info */
	private String intgCdLen = null;
	/* Column Info */
	private String creDt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String intgCdId = null;
	/* Column Info */
	private String intgCdTpNm = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String intgCdDesc = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String ownrSubSysCd = null;
	/* Column Info */
	private String updUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public CodeMgmtMstVO() {}

	public CodeMgmtMstVO(String ibflag, String pagerows, String intgCdId, String ownrSubSysCd, String intgCdNm, String intgCdDesc, String intgCdUseFlg, String intgCdTpNm, String intgCdLen, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.intgCdUseFlg = intgCdUseFlg;
		this.intgCdNm = intgCdNm;
		this.intgCdLen = intgCdLen;
		this.creDt = creDt;
		this.pagerows = pagerows;
		this.intgCdId = intgCdId;
		this.intgCdTpNm = intgCdTpNm;
		this.ibflag = ibflag;
		this.intgCdDesc = intgCdDesc;
		this.creUsrId = creUsrId;
		this.ownrSubSysCd = ownrSubSysCd;
		this.updUsrId = updUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("intg_cd_use_flg", getIntgCdUseFlg());
		this.hashColumns.put("intg_cd_nm", getIntgCdNm());
		this.hashColumns.put("intg_cd_len", getIntgCdLen());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("intg_cd_id", getIntgCdId());
		this.hashColumns.put("intg_cd_tp_cd", getIntgCdTpNm());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("intg_cd_desc", getIntgCdDesc());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ownr_sub_sys_cd", getOwnrSubSysCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("intg_cd_use_flg", "intgCdUseFlg");
		this.hashFields.put("intg_cd_nm", "intgCdNm");
		this.hashFields.put("intg_cd_len", "intgCdLen");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("intg_cd_id", "intgCdId");
		this.hashFields.put("intg_cd_tp_cd", "intgCdTpNm");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("intg_cd_desc", "intgCdDesc");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ownr_sub_sys_cd", "ownrSubSysCd");
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
	 * @return intgCdUseFlg
	 */
	public String getIntgCdUseFlg() {
		return this.intgCdUseFlg;
	}
	
	/**
	 * Column Info
	 * @return intgCdNm
	 */
	public String getIntgCdNm() {
		return this.intgCdNm;
	}
	
	/**
	 * Column Info
	 * @return intgCdLen
	 */
	public String getIntgCdLen() {
		return this.intgCdLen;
	}
	
	/**
	 * Column Info
	 * @return creDt
	 */
	public String getCreDt() {
		return this.creDt;
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
	 * @return intgCdId
	 */
	public String getIntgCdId() {
		return this.intgCdId;
	}
	
	/**
	 * Column Info
	 * @return intgCdTpNm
	 */
	public String getIntgCdTpNm() {
		return this.intgCdTpNm;
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
	 * @return intgCdDesc
	 */
	public String getIntgCdDesc() {
		return this.intgCdDesc;
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
	 * @return ownrSubSysCd
	 */
	public String getOwnrSubSysCd() {
		return this.ownrSubSysCd;
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
	 * @param intgCdUseFlg
	 */
	public void setIntgCdUseFlg(String intgCdUseFlg) {
		this.intgCdUseFlg = intgCdUseFlg;
	}
	
	/**
	 * Column Info
	 * @param intgCdNm
	 */
	public void setIntgCdNm(String intgCdNm) {
		this.intgCdNm = intgCdNm;
	}
	
	/**
	 * Column Info
	 * @param intgCdLen
	 */
	public void setIntgCdLen(String intgCdLen) {
		this.intgCdLen = intgCdLen;
	}
	
	/**
	 * Column Info
	 * @param creDt
	 */
	public void setCreDt(String creDt) {
		this.creDt = creDt;
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
	 * @param intgCdId
	 */
	public void setIntgCdId(String intgCdId) {
		this.intgCdId = intgCdId;
	}
	
	/**
	 * Column Info
	 * @param intgCdTpNm
	 */
	public void setIntgCdTpNm(String intgCdTpNm) {
		this.intgCdTpNm = intgCdTpNm;
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
	 * @param intgCdDesc
	 */
	public void setIntgCdDesc(String intgCdDesc) {
		this.intgCdDesc = intgCdDesc;
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
	 * @param ownrSubSysCd
	 */
	public void setOwnrSubSysCd(String ownrSubSysCd) {
		this.ownrSubSysCd = ownrSubSysCd;
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
		setIntgCdUseFlg(JSPUtil.getParameter(request, "intg_cd_use_flg", ""));
		setIntgCdNm(JSPUtil.getParameter(request, "intg_cd_nm", ""));
		setIntgCdLen(JSPUtil.getParameter(request, "intg_cd_len", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setIntgCdId(JSPUtil.getParameter(request, "intg_cd_id", ""));
		setIntgCdTpNm(JSPUtil.getParameter(request, "intg_cd_tp_cd", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setIntgCdDesc(JSPUtil.getParameter(request, "intg_cd_desc", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setOwnrSubSysCd(JSPUtil.getParameter(request, "ownr_sub_sys_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return CodeMgmtMstVO[]
	 */
	public CodeMgmtMstVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return CodeMgmtMstVO[]
	 */
	public CodeMgmtMstVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		CodeMgmtMstVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] intgCdUseFlg = (JSPUtil.getParameter(request, prefix	+ "intg_cd_use_flg".trim(), length));
			String[] intgCdNm = (JSPUtil.getParameter(request, prefix	+ "intg_cd_nm".trim(), length));
			String[] intgCdLen = (JSPUtil.getParameter(request, prefix	+ "intg_cd_len".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] intgCdId = (JSPUtil.getParameter(request, prefix	+ "intg_cd_id".trim(), length));
			String[] intgCdTpNm = (JSPUtil.getParameter(request, prefix	+ "intg_cd_tp_cd".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] intgCdDesc = (JSPUtil.getParameter(request, prefix	+ "intg_cd_desc".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] ownrSubSysCd = (JSPUtil.getParameter(request, prefix	+ "ownr_sub_sys_cd".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new CodeMgmtMstVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (intgCdUseFlg[i] != null)
					model.setIntgCdUseFlg(intgCdUseFlg[i]);
				if (intgCdNm[i] != null)
					model.setIntgCdNm(intgCdNm[i]);
				if (intgCdLen[i] != null)
					model.setIntgCdLen(intgCdLen[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (intgCdId[i] != null)
					model.setIntgCdId(intgCdId[i]);
				if (intgCdTpNm[i] != null)
					model.setIntgCdTpNm(intgCdTpNm[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (intgCdDesc[i] != null)
					model.setIntgCdDesc(intgCdDesc[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ownrSubSysCd[i] != null)
					model.setOwnrSubSysCd(ownrSubSysCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getCodeMgmtMstVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return CodeMgmtMstVO[]
	 */
	public CodeMgmtMstVO[] getCodeMgmtMstVOs(){
		CodeMgmtMstVO[] vos = (CodeMgmtMstVO[])models.toArray(new CodeMgmtMstVO[models.size()]);
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
		this.intgCdUseFlg = this.intgCdUseFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.intgCdNm = this.intgCdNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.intgCdLen = this.intgCdLen .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.intgCdId = this.intgCdId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.intgCdTpNm = this.intgCdTpNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.intgCdDesc = this.intgCdDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ownrSubSysCd = this.ownrSubSysCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
