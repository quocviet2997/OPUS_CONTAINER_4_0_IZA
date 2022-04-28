/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BkgHldCdVO.java
*@FileTitle : BkgHldCdVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.06.10
*@LastModifier : 박미옥
*@LastVersion : 1.0
* 2009.06.10 박미옥 
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
 * @author 박미옥
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class BkgHldCdVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgHldCdVO> models = new ArrayList<BkgHldCdVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String cstmsEdiPreHldCd = null;
	/* Column Info */
	private String cntCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String obNtcFlg = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String cstmsEdiCfmHldCd = null;
	/* Page Number */
	private String pagerows = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgHldCdVO() {}

	public BkgHldCdVO(String ibflag, String pagerows, String cntCd, String cstmsEdiPreHldCd, String cstmsEdiCfmHldCd, String obNtcFlg, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.cstmsEdiPreHldCd = cstmsEdiPreHldCd;
		this.cntCd = cntCd;
		this.creDt = creDt;
		this.obNtcFlg = obNtcFlg;
		this.updUsrId = updUsrId;
		this.cstmsEdiCfmHldCd = cstmsEdiCfmHldCd;
		this.pagerows = pagerows;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cstms_edi_pre_hld_cd", getCstmsEdiPreHldCd());
		this.hashColumns.put("cnt_cd", getCntCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("ob_ntc_flg", getObNtcFlg());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("cstms_edi_cfm_hld_cd", getCstmsEdiCfmHldCd());
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
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cstms_edi_pre_hld_cd", "cstmsEdiPreHldCd");
		this.hashFields.put("cnt_cd", "cntCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("ob_ntc_flg", "obNtcFlg");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("cstms_edi_cfm_hld_cd", "cstmsEdiCfmHldCd");
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
	 * VO Data Value( C:Creation, U:Update, D:Delete )
	 * @return ibflag
	 */
	public String getIbflag() {
		return this.ibflag;
	}
	
	/**
	 * Column Info
	 * @return cstmsEdiPreHldCd
	 */
	public String getCstmsEdiPreHldCd() {
		return this.cstmsEdiPreHldCd;
	}
	
	/**
	 * Column Info
	 * @return cntCd
	 */
	public String getCntCd() {
		return this.cntCd;
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
	 * @return obNtcFlg
	 */
	public String getObNtcFlg() {
		return this.obNtcFlg;
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
	 * @return cstmsEdiCfmHldCd
	 */
	public String getCstmsEdiCfmHldCd() {
		return this.cstmsEdiCfmHldCd;
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
	 * VO Data Value( C:Creation, U:Update, D:Delete )
	 * @param ibflag
	 */
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
	}
	
	/**
	 * Column Info
	 * @param cstmsEdiPreHldCd
	 */
	public void setCstmsEdiPreHldCd(String cstmsEdiPreHldCd) {
		this.cstmsEdiPreHldCd = cstmsEdiPreHldCd;
	}
	
	/**
	 * Column Info
	 * @param cntCd
	 */
	public void setCntCd(String cntCd) {
		this.cntCd = cntCd;
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
	 * @param obNtcFlg
	 */
	public void setObNtcFlg(String obNtcFlg) {
		this.obNtcFlg = obNtcFlg;
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
	 * @param cstmsEdiCfmHldCd
	 */
	public void setCstmsEdiCfmHldCd(String cstmsEdiCfmHldCd) {
		this.cstmsEdiCfmHldCd = cstmsEdiCfmHldCd;
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
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCstmsEdiPreHldCd(JSPUtil.getParameter(request, "cstms_edi_pre_hld_cd", ""));
		setCntCd(JSPUtil.getParameter(request, "cnt_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setObNtcFlg(JSPUtil.getParameter(request, "ob_ntc_flg", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setCstmsEdiCfmHldCd(JSPUtil.getParameter(request, "cstms_edi_cfm_hld_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BkgHldCdVO[]
	 */
	public BkgHldCdVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgHldCdVO[]
	 */
	public BkgHldCdVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgHldCdVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] cstmsEdiPreHldCd = (JSPUtil.getParameter(request, prefix	+ "cstms_edi_pre_hld_cd", length));
			String[] cntCd = (JSPUtil.getParameter(request, prefix	+ "cnt_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] obNtcFlg = (JSPUtil.getParameter(request, prefix	+ "ob_ntc_flg", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] cstmsEdiCfmHldCd = (JSPUtil.getParameter(request, prefix	+ "cstms_edi_cfm_hld_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgHldCdVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (cstmsEdiPreHldCd[i] != null)
					model.setCstmsEdiPreHldCd(cstmsEdiPreHldCd[i]);
				if (cntCd[i] != null)
					model.setCntCd(cntCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (obNtcFlg[i] != null)
					model.setObNtcFlg(obNtcFlg[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (cstmsEdiCfmHldCd[i] != null)
					model.setCstmsEdiCfmHldCd(cstmsEdiCfmHldCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgHldCdVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BkgHldCdVO[]
	 */
	public BkgHldCdVO[] getBkgHldCdVOs(){
		BkgHldCdVO[] vos = (BkgHldCdVO[])models.toArray(new BkgHldCdVO[models.size()]);
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
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cstmsEdiPreHldCd = this.cstmsEdiPreHldCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntCd = this.cntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.obNtcFlg = this.obNtcFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cstmsEdiCfmHldCd = this.cstmsEdiCfmHldCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
