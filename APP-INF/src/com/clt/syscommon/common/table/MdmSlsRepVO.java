/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : MdmSlsRepVO.java
*@FileTitle : MdmSlsRepVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.08.18
*@LastModifier : 김재연
*@LastVersion : 1.0
* 2009.08.18 김재연 
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
 * @author 김재연
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class MdmSlsRepVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<MdmSlsRepVO> models = new ArrayList<MdmSlsRepVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String empeCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String ibSrepFlg = null;
	/* Column Info */
	private String sexCd = null;
	/* Column Info */
	private String srepEml = null;
	/* Column Info */
	private String eaiEvntDt = null;
	/* Column Info */
	private String mphnNo = null;
	/* Column Info */
	private String obSrepFlg = null;
	/* Column Info */
	private String intlMphnNo = null;
	/* Column Info */
	private String srepCd = null;
	/* Column Info */
	private String srepAbbrNm = null;
	/* Column Info */
	private String srepStsCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String ofcTeamCd = null;
	/* Column Info */
	private String ofcCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String srepNm = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String eaiIfId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public MdmSlsRepVO() {}

	public MdmSlsRepVO(String ibflag, String pagerows, String srepCd, String ofcCd, String srepNm, String ofcTeamCd, String sexCd, String srepAbbrNm, String ibSrepFlg, String obSrepFlg, String empeCd, String srepEml, String intlMphnNo, String mphnNo, String srepStsCd, String creUsrId, String creDt, String updUsrId, String updDt, String eaiEvntDt, String eaiIfId) {
		this.updDt = updDt;
		this.empeCd = empeCd;
		this.creDt = creDt;
		this.ibSrepFlg = ibSrepFlg;
		this.sexCd = sexCd;
		this.srepEml = srepEml;
		this.eaiEvntDt = eaiEvntDt;
		this.mphnNo = mphnNo;
		this.obSrepFlg = obSrepFlg;
		this.intlMphnNo = intlMphnNo;
		this.srepCd = srepCd;
		this.srepAbbrNm = srepAbbrNm;
		this.srepStsCd = srepStsCd;
		this.pagerows = pagerows;
		this.ofcTeamCd = ofcTeamCd;
		this.ofcCd = ofcCd;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.srepNm = srepNm;
		this.updUsrId = updUsrId;
		this.eaiIfId = eaiIfId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("empe_cd", getEmpeCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("ib_srep_flg", getIbSrepFlg());
		this.hashColumns.put("sex_cd", getSexCd());
		this.hashColumns.put("srep_eml", getSrepEml());
		this.hashColumns.put("eai_evnt_dt", getEaiEvntDt());
		this.hashColumns.put("mphn_no", getMphnNo());
		this.hashColumns.put("ob_srep_flg", getObSrepFlg());
		this.hashColumns.put("intl_mphn_no", getIntlMphnNo());
		this.hashColumns.put("srep_cd", getSrepCd());
		this.hashColumns.put("srep_abbr_nm", getSrepAbbrNm());
		this.hashColumns.put("srep_sts_cd", getSrepStsCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ofc_team_cd", getOfcTeamCd());
		this.hashColumns.put("ofc_cd", getOfcCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("srep_nm", getSrepNm());
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
		this.hashFields.put("empe_cd", "empeCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("ib_srep_flg", "ibSrepFlg");
		this.hashFields.put("sex_cd", "sexCd");
		this.hashFields.put("srep_eml", "srepEml");
		this.hashFields.put("eai_evnt_dt", "eaiEvntDt");
		this.hashFields.put("mphn_no", "mphnNo");
		this.hashFields.put("ob_srep_flg", "obSrepFlg");
		this.hashFields.put("intl_mphn_no", "intlMphnNo");
		this.hashFields.put("srep_cd", "srepCd");
		this.hashFields.put("srep_abbr_nm", "srepAbbrNm");
		this.hashFields.put("srep_sts_cd", "srepStsCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ofc_team_cd", "ofcTeamCd");
		this.hashFields.put("ofc_cd", "ofcCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("srep_nm", "srepNm");
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
	 * @return empeCd
	 */
	public String getEmpeCd() {
		return this.empeCd;
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
	 * @return ibSrepFlg
	 */
	public String getIbSrepFlg() {
		return this.ibSrepFlg;
	}
	
	/**
	 * Column Info
	 * @return sexCd
	 */
	public String getSexCd() {
		return this.sexCd;
	}
	
	/**
	 * Column Info
	 * @return srepEml
	 */
	public String getSrepEml() {
		return this.srepEml;
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
	 * @return mphnNo
	 */
	public String getMphnNo() {
		return this.mphnNo;
	}
	
	/**
	 * Column Info
	 * @return obSrepFlg
	 */
	public String getObSrepFlg() {
		return this.obSrepFlg;
	}
	
	/**
	 * Column Info
	 * @return intlMphnNo
	 */
	public String getIntlMphnNo() {
		return this.intlMphnNo;
	}
	
	/**
	 * Column Info
	 * @return srepCd
	 */
	public String getSrepCd() {
		return this.srepCd;
	}
	
	/**
	 * Column Info
	 * @return srepAbbrNm
	 */
	public String getSrepAbbrNm() {
		return this.srepAbbrNm;
	}
	
	/**
	 * Column Info
	 * @return srepStsCd
	 */
	public String getSrepStsCd() {
		return this.srepStsCd;
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
	 * @return ofcTeamCd
	 */
	public String getOfcTeamCd() {
		return this.ofcTeamCd;
	}
	
	/**
	 * Column Info
	 * @return ofcCd
	 */
	public String getOfcCd() {
		return this.ofcCd;
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
	 * @return srepNm
	 */
	public String getSrepNm() {
		return this.srepNm;
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
	 * @param empeCd
	 */
	public void setEmpeCd(String empeCd) {
		this.empeCd = empeCd;
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
	 * @param ibSrepFlg
	 */
	public void setIbSrepFlg(String ibSrepFlg) {
		this.ibSrepFlg = ibSrepFlg;
	}
	
	/**
	 * Column Info
	 * @param sexCd
	 */
	public void setSexCd(String sexCd) {
		this.sexCd = sexCd;
	}
	
	/**
	 * Column Info
	 * @param srepEml
	 */
	public void setSrepEml(String srepEml) {
		this.srepEml = srepEml;
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
	 * @param mphnNo
	 */
	public void setMphnNo(String mphnNo) {
		this.mphnNo = mphnNo;
	}
	
	/**
	 * Column Info
	 * @param obSrepFlg
	 */
	public void setObSrepFlg(String obSrepFlg) {
		this.obSrepFlg = obSrepFlg;
	}
	
	/**
	 * Column Info
	 * @param intlMphnNo
	 */
	public void setIntlMphnNo(String intlMphnNo) {
		this.intlMphnNo = intlMphnNo;
	}
	
	/**
	 * Column Info
	 * @param srepCd
	 */
	public void setSrepCd(String srepCd) {
		this.srepCd = srepCd;
	}
	
	/**
	 * Column Info
	 * @param srepAbbrNm
	 */
	public void setSrepAbbrNm(String srepAbbrNm) {
		this.srepAbbrNm = srepAbbrNm;
	}
	
	/**
	 * Column Info
	 * @param srepStsCd
	 */
	public void setSrepStsCd(String srepStsCd) {
		this.srepStsCd = srepStsCd;
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
	 * @param ofcTeamCd
	 */
	public void setOfcTeamCd(String ofcTeamCd) {
		this.ofcTeamCd = ofcTeamCd;
	}
	
	/**
	 * Column Info
	 * @param ofcCd
	 */
	public void setOfcCd(String ofcCd) {
		this.ofcCd = ofcCd;
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
	 * @param srepNm
	 */
	public void setSrepNm(String srepNm) {
		this.srepNm = srepNm;
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
		setEmpeCd(JSPUtil.getParameter(request, "empe_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setIbSrepFlg(JSPUtil.getParameter(request, "ib_srep_flg", ""));
		setSexCd(JSPUtil.getParameter(request, "sex_cd", ""));
		setSrepEml(JSPUtil.getParameter(request, "srep_eml", ""));
		setEaiEvntDt(JSPUtil.getParameter(request, "eai_evnt_dt", ""));
		setMphnNo(JSPUtil.getParameter(request, "mphn_no", ""));
		setObSrepFlg(JSPUtil.getParameter(request, "ob_srep_flg", ""));
		setIntlMphnNo(JSPUtil.getParameter(request, "intl_mphn_no", ""));
		setSrepCd(JSPUtil.getParameter(request, "srep_cd", ""));
		setSrepAbbrNm(JSPUtil.getParameter(request, "srep_abbr_nm", ""));
		setSrepStsCd(JSPUtil.getParameter(request, "srep_sts_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setOfcTeamCd(JSPUtil.getParameter(request, "ofc_team_cd", ""));
		setOfcCd(JSPUtil.getParameter(request, "ofc_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setSrepNm(JSPUtil.getParameter(request, "srep_nm", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setEaiIfId(JSPUtil.getParameter(request, "eai_if_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return MdmSlsRepVO[]
	 */
	public MdmSlsRepVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return MdmSlsRepVO[]
	 */
	public MdmSlsRepVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		MdmSlsRepVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt      = (JSPUtil.getParameter(request, prefix	+ "upd_dt"      , length));
			String[] empeCd     = (JSPUtil.getParameter(request, prefix	+ "empe_cd"     , length));
			String[] creDt      = (JSPUtil.getParameter(request, prefix	+ "cre_dt"      , length));
			String[] ibSrepFlg  = (JSPUtil.getParameter(request, prefix	+ "ib_srep_flg" , length));
			String[] sexCd      = (JSPUtil.getParameter(request, prefix	+ "sex_cd"      , length));
			String[] srepEml    = (JSPUtil.getParameter(request, prefix	+ "srep_eml"    , length));
			String[] eaiEvntDt  = (JSPUtil.getParameter(request, prefix	+ "eai_evnt_dt" , length));
			String[] mphnNo     = (JSPUtil.getParameter(request, prefix	+ "mphn_no"     , length));
			String[] obSrepFlg  = (JSPUtil.getParameter(request, prefix	+ "ob_srep_flg" , length));
			String[] intlMphnNo = (JSPUtil.getParameter(request, prefix	+ "intl_mphn_no", length));
			String[] srepCd     = (JSPUtil.getParameter(request, prefix	+ "srep_cd"     , length));
			String[] srepAbbrNm = (JSPUtil.getParameter(request, prefix	+ "srep_abbr_nm", length));
			String[] srepStsCd  = (JSPUtil.getParameter(request, prefix	+ "srep_sts_cd" , length));
			String[] pagerows   = (JSPUtil.getParameter(request, prefix	+ "pagerows"    , length));
			String[] ofcTeamCd  = (JSPUtil.getParameter(request, prefix	+ "ofc_team_cd" , length));
			String[] ofcCd      = (JSPUtil.getParameter(request, prefix	+ "ofc_cd"      , length));
			String[] creUsrId   = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id"  , length));
			String[] ibflag     = (JSPUtil.getParameter(request, prefix	+ "ibflag"      , length));
			String[] srepNm     = (JSPUtil.getParameter(request, prefix	+ "srep_nm"     , length));
			String[] updUsrId   = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id"  , length));
			String[] eaiIfId    = (JSPUtil.getParameter(request, prefix	+ "eai_if_id"   , length));
			
			for (int i = 0; i < length; i++) {
				model = new MdmSlsRepVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (empeCd[i] != null)
					model.setEmpeCd(empeCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (ibSrepFlg[i] != null)
					model.setIbSrepFlg(ibSrepFlg[i]);
				if (sexCd[i] != null)
					model.setSexCd(sexCd[i]);
				if (srepEml[i] != null)
					model.setSrepEml(srepEml[i]);
				if (eaiEvntDt[i] != null)
					model.setEaiEvntDt(eaiEvntDt[i]);
				if (mphnNo[i] != null)
					model.setMphnNo(mphnNo[i]);
				if (obSrepFlg[i] != null)
					model.setObSrepFlg(obSrepFlg[i]);
				if (intlMphnNo[i] != null)
					model.setIntlMphnNo(intlMphnNo[i]);
				if (srepCd[i] != null)
					model.setSrepCd(srepCd[i]);
				if (srepAbbrNm[i] != null)
					model.setSrepAbbrNm(srepAbbrNm[i]);
				if (srepStsCd[i] != null)
					model.setSrepStsCd(srepStsCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ofcTeamCd[i] != null)
					model.setOfcTeamCd(ofcTeamCd[i]);
				if (ofcCd[i] != null)
					model.setOfcCd(ofcCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (srepNm[i] != null)
					model.setSrepNm(srepNm[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (eaiIfId[i] != null)
					model.setEaiIfId(eaiIfId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getMdmSlsRepVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return MdmSlsRepVO[]
	 */
	public MdmSlsRepVO[] getMdmSlsRepVOs(){
		MdmSlsRepVO[] vos = (MdmSlsRepVO[])models.toArray(new MdmSlsRepVO[models.size()]);
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
		this.updDt      = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.empeCd     = this.empeCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt      = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibSrepFlg  = this.ibSrepFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sexCd      = this.sexCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.srepEml    = this.srepEml .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eaiEvntDt  = this.eaiEvntDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mphnNo     = this.mphnNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.obSrepFlg  = this.obSrepFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.intlMphnNo = this.intlMphnNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.srepCd     = this.srepCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.srepAbbrNm = this.srepAbbrNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.srepStsCd  = this.srepStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows   = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ofcTeamCd  = this.ofcTeamCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ofcCd      = this.ofcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId   = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag     = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.srepNm     = this.srepNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId   = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eaiIfId    = this.eaiIfId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
