/*=========================================================
*Copyright(c) 2013 CyberLogitec
*@FileName : ItemControlManagementVO.java
*@FileTitle : ItemControlManagementVO
*Open Issues :
*Change history :
*@LastModifyDate : 2013.07.08
*@LastModifier : 
*@LastVersion : 1.0
* 2013.07.08  
* 1.0 Creation
=========================================================*/

package com.clt.syscommon.management.opus.itemcontrolmanagement.vo;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.clt.framework.component.common.AbstractValueObject;
import com.clt.framework.component.util.JSPUtil;

/**
 * Table Value Ojbect<br>
 * 관련 Event 에서 생성, 서버실행요청시 Data 전달역할을 수행하는 Value Object
 *
 * @author 
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class ItemControlManagementVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<ItemControlManagementVO> models = new ArrayList<ItemControlManagementVO>();
	
	/* Column Info */
	private String pgmSubSysCd = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String ctrlTpCd = null;
	/* Column Info */
	private String itmDesc = null;
	/* Column Info */
	private String setTpCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String keyPgmNo = null;
	/* Column Info */
	private String pgmNo = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String keyPgmSubSysCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String pgmItmId = null;
	/* Column Info */
	private String keyPgmItmId = null;
	/* Column Info */
	private String itmDpNm = null;
	/* Column Info */
	private String aplyFlg = null;
	/* Column Info */
	private String updUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public ItemControlManagementVO() {}

	public ItemControlManagementVO(String ibflag, String pagerows, String pgmSubSysCd, String pgmNo, String pgmItmId, String ctrlTpCd, String itmDpNm, String setTpCd, String itmDesc, String creUsrId, String creDt, String updUsrId, String updDt, String keyPgmSubSysCd, String keyPgmNo, String keyPgmItmId, String aplyFlg) {
		this.pgmSubSysCd = pgmSubSysCd;
		this.updDt = updDt;
		this.ctrlTpCd = ctrlTpCd;
		this.itmDesc = itmDesc;
		this.setTpCd = setTpCd;
		this.creDt = creDt;
		this.keyPgmNo = keyPgmNo;
		this.pgmNo = pgmNo;
		this.pagerows = pagerows;
		this.keyPgmSubSysCd = keyPgmSubSysCd;
		this.ibflag = ibflag;
		this.creUsrId = creUsrId;
		this.pgmItmId = pgmItmId;
		this.keyPgmItmId = keyPgmItmId;
		this.itmDpNm = itmDpNm;
		this.aplyFlg = aplyFlg;
		this.updUsrId = updUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("pgm_sub_sys_cd", getPgmSubSysCd());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("ctrl_tp_cd", getCtrlTpCd());
		this.hashColumns.put("itm_desc", getItmDesc());
		this.hashColumns.put("set_tp_cd", getSetTpCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("key_pgm_no", getKeyPgmNo());
		this.hashColumns.put("pgm_no", getPgmNo());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("key_pgm_sub_sys_cd", getKeyPgmSubSysCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("pgm_itm_id", getPgmItmId());
		this.hashColumns.put("key_pgm_itm_id", getKeyPgmItmId());
		this.hashColumns.put("itm_dp_nm", getItmDpNm());
		this.hashColumns.put("aply_flg", getAplyFlg());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("pgm_sub_sys_cd", "pgmSubSysCd");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("ctrl_tp_cd", "ctrlTpCd");
		this.hashFields.put("itm_desc", "itmDesc");
		this.hashFields.put("set_tp_cd", "setTpCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("key_pgm_no", "keyPgmNo");
		this.hashFields.put("pgm_no", "pgmNo");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("key_pgm_sub_sys_cd", "keyPgmSubSysCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("pgm_itm_id", "pgmItmId");
		this.hashFields.put("key_pgm_itm_id", "keyPgmItmId");
		this.hashFields.put("itm_dp_nm", "itmDpNm");
		this.hashFields.put("aply_flg", "aplyFlg");
		this.hashFields.put("upd_usr_id", "updUsrId");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return pgmSubSysCd
	 */
	public String getPgmSubSysCd() {
		return this.pgmSubSysCd;
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
	 * @return ctrlTpCd
	 */
	public String getCtrlTpCd() {
		return this.ctrlTpCd;
	}
	
	/**
	 * Column Info
	 * @return itmDesc
	 */
	public String getItmDesc() {
		return this.itmDesc;
	}
	
	/**
	 * Column Info
	 * @return setTpCd
	 */
	public String getSetTpCd() {
		return this.setTpCd;
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
	 * @return keyPgmNo
	 */
	public String getKeyPgmNo() {
		return this.keyPgmNo;
	}
	
	/**
	 * Column Info
	 * @return pgmNo
	 */
	public String getPgmNo() {
		return this.pgmNo;
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
	 * @return keyPgmSubSysCd
	 */
	public String getKeyPgmSubSysCd() {
		return this.keyPgmSubSysCd;
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
	 * @return creUsrId
	 */
	public String getCreUsrId() {
		return this.creUsrId;
	}
	
	/**
	 * Column Info
	 * @return pgmItmId
	 */
	public String getPgmItmId() {
		return this.pgmItmId;
	}
	
	/**
	 * Column Info
	 * @return keyPgmItmId
	 */
	public String getKeyPgmItmId() {
		return this.keyPgmItmId;
	}
	
	/**
	 * Column Info
	 * @return itmDpNm
	 */
	public String getItmDpNm() {
		return this.itmDpNm;
	}
	
	/**
	 * Column Info
	 * @return aplyFlg
	 */
	public String getAplyFlg() {
		return this.aplyFlg;
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
	 * @param pgmSubSysCd
	 */
	public void setPgmSubSysCd(String pgmSubSysCd) {
		this.pgmSubSysCd = pgmSubSysCd;
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
	 * @param ctrlTpCd
	 */
	public void setCtrlTpCd(String ctrlTpCd) {
		this.ctrlTpCd = ctrlTpCd;
	}
	
	/**
	 * Column Info
	 * @param itmDesc
	 */
	public void setItmDesc(String itmDesc) {
		this.itmDesc = itmDesc;
	}
	
	/**
	 * Column Info
	 * @param setTpCd
	 */
	public void setSetTpCd(String setTpCd) {
		this.setTpCd = setTpCd;
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
	 * @param keyPgmNo
	 */
	public void setKeyPgmNo(String keyPgmNo) {
		this.keyPgmNo = keyPgmNo;
	}
	
	/**
	 * Column Info
	 * @param pgmNo
	 */
	public void setPgmNo(String pgmNo) {
		this.pgmNo = pgmNo;
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
	 * @param keyPgmSubSysCd
	 */
	public void setKeyPgmSubSysCd(String keyPgmSubSysCd) {
		this.keyPgmSubSysCd = keyPgmSubSysCd;
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
	 * @param creUsrId
	 */
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
	}
	
	/**
	 * Column Info
	 * @param pgmItmId
	 */
	public void setPgmItmId(String pgmItmId) {
		this.pgmItmId = pgmItmId;
	}
	
	/**
	 * Column Info
	 * @param keyPgmItmId
	 */
	public void setKeyPgmItmId(String keyPgmItmId) {
		this.keyPgmItmId = keyPgmItmId;
	}
	
	/**
	 * Column Info
	 * @param itmDpNm
	 */
	public void setItmDpNm(String itmDpNm) {
		this.itmDpNm = itmDpNm;
	}
	
	/**
	 * Column Info
	 * @param aplyFlg
	 */
	public void setAplyFlg(String aplyFlg) {
		this.aplyFlg = aplyFlg;
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
		fromRequest(request,"");
	}

	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request, String prefix) {
		setPgmSubSysCd(JSPUtil.getParameter(request, prefix + "pgm_sub_sys_cd", ""));
		setUpdDt(JSPUtil.getParameter(request, prefix + "upd_dt", ""));
		setCtrlTpCd(JSPUtil.getParameter(request, prefix + "ctrl_tp_cd", ""));
		setItmDesc(JSPUtil.getParameter(request, prefix + "itm_desc", ""));
		setSetTpCd(JSPUtil.getParameter(request, prefix + "set_tp_cd", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setKeyPgmNo(JSPUtil.getParameter(request, prefix + "key_pgm_no", ""));
		setPgmNo(JSPUtil.getParameter(request, prefix + "pgm_no", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setKeyPgmSubSysCd(JSPUtil.getParameter(request, prefix + "key_pgm_sub_sys_cd", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setPgmItmId(JSPUtil.getParameter(request, prefix + "pgm_itm_id", ""));
		setKeyPgmItmId(JSPUtil.getParameter(request, prefix + "key_pgm_itm_id", ""));
		setItmDpNm(JSPUtil.getParameter(request, prefix + "itm_dp_nm", ""));
		setAplyFlg(JSPUtil.getParameter(request, prefix + "aply_flg", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return ItemControlManagementVO[]
	 */
	public ItemControlManagementVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return ItemControlManagementVO[]
	 */
	public ItemControlManagementVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		ItemControlManagementVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] pgmSubSysCd = (JSPUtil.getParameter(request, prefix	+ "pgm_sub_sys_cd", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] ctrlTpCd = (JSPUtil.getParameter(request, prefix	+ "ctrl_tp_cd", length));
			String[] itmDesc = (JSPUtil.getParameter(request, prefix	+ "itm_desc", length));
			String[] setTpCd = (JSPUtil.getParameter(request, prefix	+ "set_tp_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] keyPgmNo = (JSPUtil.getParameter(request, prefix	+ "key_pgm_no", length));
			String[] pgmNo = (JSPUtil.getParameter(request, prefix	+ "pgm_no", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] keyPgmSubSysCd = (JSPUtil.getParameter(request, prefix	+ "key_pgm_sub_sys_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] pgmItmId = (JSPUtil.getParameter(request, prefix	+ "pgm_itm_id", length));
			String[] keyPgmItmId = (JSPUtil.getParameter(request, prefix	+ "key_pgm_itm_id", length));
			String[] itmDpNm = (JSPUtil.getParameter(request, prefix	+ "itm_dp_nm", length));
			String[] aplyFlg = (JSPUtil.getParameter(request, prefix	+ "aply_flg", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			
			for (int i = 0; i < length; i++) {
				model = new ItemControlManagementVO();
				if (pgmSubSysCd[i] != null)
					model.setPgmSubSysCd(pgmSubSysCd[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (ctrlTpCd[i] != null)
					model.setCtrlTpCd(ctrlTpCd[i]);
				if (itmDesc[i] != null)
					model.setItmDesc(itmDesc[i]);
				if (setTpCd[i] != null)
					model.setSetTpCd(setTpCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (keyPgmNo[i] != null)
					model.setKeyPgmNo(keyPgmNo[i]);
				if (pgmNo[i] != null)
					model.setPgmNo(pgmNo[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (keyPgmSubSysCd[i] != null)
					model.setKeyPgmSubSysCd(keyPgmSubSysCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (pgmItmId[i] != null)
					model.setPgmItmId(pgmItmId[i]);
				if (keyPgmItmId[i] != null)
					model.setKeyPgmItmId(keyPgmItmId[i]);
				if (itmDpNm[i] != null)
					model.setItmDpNm(itmDpNm[i]);
				if (aplyFlg[i] != null)
					model.setAplyFlg(aplyFlg[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getItemControlManagementVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return ItemControlManagementVO[]
	 */
	public ItemControlManagementVO[] getItemControlManagementVOs(){
		ItemControlManagementVO[] vos = (ItemControlManagementVO[])models.toArray(new ItemControlManagementVO[models.size()]);
		return vos;
	}
	
	/**
	 * VO Class의 내용을 String으로 변환
	 */
	public String toString() {
		   return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE );
	   }

	/**
	* 포맷팅된 문자열에서 특수문자 제거("-","/",",",":")
	*/
	public void unDataFormat(){
		this.pgmSubSysCd = this.pgmSubSysCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ctrlTpCd = this.ctrlTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.itmDesc = this.itmDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.setTpCd = this.setTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.keyPgmNo = this.keyPgmNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pgmNo = this.pgmNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.keyPgmSubSysCd = this.keyPgmSubSysCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pgmItmId = this.pgmItmId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.keyPgmItmId = this.keyPgmItmId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.itmDpNm = this.itmDpNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aplyFlg = this.aplyFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
