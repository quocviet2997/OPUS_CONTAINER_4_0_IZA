/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : MdmGrpCmdtVO.java
*@FileTitle : MdmGrpCmdtVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.09.29
*@LastModifier : 최윤성
*@LastVersion : 1.0
* 2009.09.29 최윤성 
* 1.0 Creation
* 2010.06.28 CHOI.Y.S - TicketID : CHM-201004307, CHM-201004304, CHM-201004306
* - EAI_IF_ID 필드 관련 내역 추가
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
 * @author 최윤성
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class MdmGrpCmdtVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<MdmGrpCmdtVO> models = new ArrayList<MdmGrpCmdtVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String grpCmdtEngNm = null;
	/* Column Info */
	private String grpCmdtKrnNm = null;
	/* Column Info */
	private String grpCmdtChnNm = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String eaiEvntDt = null;
	/* Column Info */
	private String maxRepCmdtCd = null;
	/* Column Info */
	private String grpCmdtJpnNm = null;
	/* Page Number */
	private String pagerows = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String minRepCmdtCd = null;
	/* Column Info */
	private String grpCmdtCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String eaiIfId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public MdmGrpCmdtVO() {}

	public MdmGrpCmdtVO(String ibflag, String pagerows, String grpCmdtCd, String grpCmdtEngNm, String grpCmdtKrnNm, String grpCmdtJpnNm, String grpCmdtChnNm, String minRepCmdtCd, String maxRepCmdtCd, String creUsrId, String creDt, String updUsrId, String updDt, String deltFlg, String eaiEvntDt, String eaiIfId) {
		this.updDt = updDt;
		this.grpCmdtEngNm = grpCmdtEngNm;
		this.grpCmdtKrnNm = grpCmdtKrnNm;
		this.grpCmdtChnNm = grpCmdtChnNm;
		this.deltFlg = deltFlg;
		this.creDt = creDt;
		this.eaiEvntDt = eaiEvntDt;
		this.maxRepCmdtCd = maxRepCmdtCd;
		this.grpCmdtJpnNm = grpCmdtJpnNm;
		this.pagerows = pagerows;
		this.ibflag = ibflag;
		this.creUsrId = creUsrId;
		this.minRepCmdtCd = minRepCmdtCd;
		this.grpCmdtCd = grpCmdtCd;
		this.updUsrId = updUsrId;
		this.eaiIfId = eaiIfId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("grp_cmdt_eng_nm", getGrpCmdtEngNm());
		this.hashColumns.put("grp_cmdt_krn_nm", getGrpCmdtKrnNm());
		this.hashColumns.put("grp_cmdt_chn_nm", getGrpCmdtChnNm());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("eai_evnt_dt", getEaiEvntDt());
		this.hashColumns.put("max_rep_cmdt_cd", getMaxRepCmdtCd());
		this.hashColumns.put("grp_cmdt_jpn_nm", getGrpCmdtJpnNm());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("min_rep_cmdt_cd", getMinRepCmdtCd());
		this.hashColumns.put("grp_cmdt_cd", getGrpCmdtCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("eai_if_id", getEaiIfId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("grp_cmdt_eng_nm", "grpCmdtEngNm");
		this.hashFields.put("grp_cmdt_krn_nm", "grpCmdtKrnNm");
		this.hashFields.put("grp_cmdt_chn_nm", "grpCmdtChnNm");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("eai_evnt_dt", "eaiEvntDt");
		this.hashFields.put("max_rep_cmdt_cd", "maxRepCmdtCd");
		this.hashFields.put("grp_cmdt_jpn_nm", "grpCmdtJpnNm");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("min_rep_cmdt_cd", "minRepCmdtCd");
		this.hashFields.put("grp_cmdt_cd", "grpCmdtCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("eai_if_id", "eaiIfId");
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
	 * @return grpCmdtEngNm
	 */
	public String getGrpCmdtEngNm() {
		return this.grpCmdtEngNm;
	}
	
	/**
	 * Column Info
	 * @return grpCmdtKrnNm
	 */
	public String getGrpCmdtKrnNm() {
		return this.grpCmdtKrnNm;
	}
	
	/**
	 * Column Info
	 * @return grpCmdtChnNm
	 */
	public String getGrpCmdtChnNm() {
		return this.grpCmdtChnNm;
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
	 * @return creDt
	 */
	public String getCreDt() {
		return this.creDt;
	}
	
	/**
	 * Column Info
	 * @return eaiEvntDt
	 */
	public String getEaiEvntDt() {
		return this.eaiEvntDt;
	}
	
	/**
	 * Column Info
	 * @return maxRepCmdtCd
	 */
	public String getMaxRepCmdtCd() {
		return this.maxRepCmdtCd;
	}
	
	/**
	 * Column Info
	 * @return grpCmdtJpnNm
	 */
	public String getGrpCmdtJpnNm() {
		return this.grpCmdtJpnNm;
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
	 * @return creUsrId
	 */
	public String getCreUsrId() {
		return this.creUsrId;
	}
	
	/**
	 * Column Info
	 * @return minRepCmdtCd
	 */
	public String getMinRepCmdtCd() {
		return this.minRepCmdtCd;
	}
	
	/**
	 * Column Info
	 * @return grpCmdtCd
	 */
	public String getGrpCmdtCd() {
		return this.grpCmdtCd;
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
	 * @return eaiIfId
	 */
	public String getEaiIfId() {
		return this.eaiIfId;
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
	 * @param grpCmdtEngNm
	 */
	public void setGrpCmdtEngNm(String grpCmdtEngNm) {
		this.grpCmdtEngNm = grpCmdtEngNm;
	}
	
	/**
	 * Column Info
	 * @param grpCmdtKrnNm
	 */
	public void setGrpCmdtKrnNm(String grpCmdtKrnNm) {
		this.grpCmdtKrnNm = grpCmdtKrnNm;
	}
	
	/**
	 * Column Info
	 * @param grpCmdtChnNm
	 */
	public void setGrpCmdtChnNm(String grpCmdtChnNm) {
		this.grpCmdtChnNm = grpCmdtChnNm;
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
	 * @param creDt
	 */
	public void setCreDt(String creDt) {
		this.creDt = creDt;
	}
	
	/**
	 * Column Info
	 * @param eaiEvntDt
	 */
	public void setEaiEvntDt(String eaiEvntDt) {
		this.eaiEvntDt = eaiEvntDt;
	}
	
	/**
	 * Column Info
	 * @param maxRepCmdtCd
	 */
	public void setMaxRepCmdtCd(String maxRepCmdtCd) {
		this.maxRepCmdtCd = maxRepCmdtCd;
	}
	
	/**
	 * Column Info
	 * @param grpCmdtJpnNm
	 */
	public void setGrpCmdtJpnNm(String grpCmdtJpnNm) {
		this.grpCmdtJpnNm = grpCmdtJpnNm;
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
	 * @param creUsrId
	 */
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
	}
	
	/**
	 * Column Info
	 * @param minRepCmdtCd
	 */
	public void setMinRepCmdtCd(String minRepCmdtCd) {
		this.minRepCmdtCd = minRepCmdtCd;
	}
	
	/**
	 * Column Info
	 * @param grpCmdtCd
	 */
	public void setGrpCmdtCd(String grpCmdtCd) {
		this.grpCmdtCd = grpCmdtCd;
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
	 * @param eaiIfId
	 */
	public void setEaiIfId(String eaiIfId) {
		this.eaiIfId = eaiIfId;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setGrpCmdtEngNm(JSPUtil.getParameter(request, "grp_cmdt_eng_nm", ""));
		setGrpCmdtKrnNm(JSPUtil.getParameter(request, "grp_cmdt_krn_nm", ""));
		setGrpCmdtChnNm(JSPUtil.getParameter(request, "grp_cmdt_chn_nm", ""));
		setDeltFlg(JSPUtil.getParameter(request, "delt_flg", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setEaiEvntDt(JSPUtil.getParameter(request, "eai_evnt_dt", ""));
		setMaxRepCmdtCd(JSPUtil.getParameter(request, "max_rep_cmdt_cd", ""));
		setGrpCmdtJpnNm(JSPUtil.getParameter(request, "grp_cmdt_jpn_nm", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setMinRepCmdtCd(JSPUtil.getParameter(request, "min_rep_cmdt_cd", ""));
		setGrpCmdtCd(JSPUtil.getParameter(request, "grp_cmdt_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setEaiIfId(JSPUtil.getParameter(request, "eai_if_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return MdmGrpCmdtVO[]
	 */
	public MdmGrpCmdtVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return MdmGrpCmdtVO[]
	 */
	public MdmGrpCmdtVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		MdmGrpCmdtVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt        = (JSPUtil.getParameter(request, prefix	+ "upd_dt"         , length));
			String[] grpCmdtEngNm = (JSPUtil.getParameter(request, prefix	+ "grp_cmdt_eng_nm", length));
			String[] grpCmdtKrnNm = (JSPUtil.getParameter(request, prefix	+ "grp_cmdt_krn_nm", length));
			String[] grpCmdtChnNm = (JSPUtil.getParameter(request, prefix	+ "grp_cmdt_chn_nm", length));
			String[] deltFlg      = (JSPUtil.getParameter(request, prefix	+ "delt_flg"       , length));
			String[] creDt        = (JSPUtil.getParameter(request, prefix	+ "cre_dt"         , length));
			String[] eaiEvntDt    = (JSPUtil.getParameter(request, prefix	+ "eai_evnt_dt"    , length));
			String[] maxRepCmdtCd = (JSPUtil.getParameter(request, prefix	+ "max_rep_cmdt_cd", length));
			String[] grpCmdtJpnNm = (JSPUtil.getParameter(request, prefix	+ "grp_cmdt_jpn_nm", length));
			String[] pagerows     = (JSPUtil.getParameter(request, prefix	+ "pagerows"       , length));
			String[] ibflag       = (JSPUtil.getParameter(request, prefix	+ "ibflag"         , length));
			String[] creUsrId     = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id"     , length));
			String[] minRepCmdtCd = (JSPUtil.getParameter(request, prefix	+ "min_rep_cmdt_cd", length));
			String[] grpCmdtCd    = (JSPUtil.getParameter(request, prefix	+ "grp_cmdt_cd"    , length));
			String[] updUsrId     = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id"     , length));
			String[] eaiIfId      = (JSPUtil.getParameter(request, prefix	+ "eai_if_id"      , length));
			
			for (int i = 0; i < length; i++) {
				model = new MdmGrpCmdtVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (grpCmdtEngNm[i] != null)
					model.setGrpCmdtEngNm(grpCmdtEngNm[i]);
				if (grpCmdtKrnNm[i] != null)
					model.setGrpCmdtKrnNm(grpCmdtKrnNm[i]);
				if (grpCmdtChnNm[i] != null)
					model.setGrpCmdtChnNm(grpCmdtChnNm[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (eaiEvntDt[i] != null)
					model.setEaiEvntDt(eaiEvntDt[i]);
				if (maxRepCmdtCd[i] != null)
					model.setMaxRepCmdtCd(maxRepCmdtCd[i]);
				if (grpCmdtJpnNm[i] != null)
					model.setGrpCmdtJpnNm(grpCmdtJpnNm[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (minRepCmdtCd[i] != null)
					model.setMinRepCmdtCd(minRepCmdtCd[i]);
				if (grpCmdtCd[i] != null)
					model.setGrpCmdtCd(grpCmdtCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (eaiIfId[i] != null)
					model.setEaiIfId(eaiIfId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getMdmGrpCmdtVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return MdmGrpCmdtVO[]
	 */
	public MdmGrpCmdtVO[] getMdmGrpCmdtVOs(){
		MdmGrpCmdtVO[] vos = (MdmGrpCmdtVO[])models.toArray(new MdmGrpCmdtVO[models.size()]);
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
		this.grpCmdtEngNm = this.grpCmdtEngNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.grpCmdtKrnNm = this.grpCmdtKrnNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.grpCmdtChnNm = this.grpCmdtChnNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eaiEvntDt = this.eaiEvntDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.maxRepCmdtCd = this.maxRepCmdtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.grpCmdtJpnNm = this.grpCmdtJpnNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.minRepCmdtCd = this.minRepCmdtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.grpCmdtCd = this.grpCmdtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eaiIfId = this.eaiIfId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
