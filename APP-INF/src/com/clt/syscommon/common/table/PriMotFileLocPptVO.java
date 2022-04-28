/*=========================================================
 *Copyright(c) 2014 CyberLogitec
 *@FileName : PriMotFileLocPptVO.java
 *@FileTitle : PriMotFileLocPptVO
 *Open Issues :
 *Change history :
 *@LastModifyDate : 2014.09.24
 *@LastModifier : jaewonLee
 *@LastVersion : 1.0
 * 2014.09.24 jaewonLee 
 * 1.0 Creation
=========================================================*/

package com.clt.syscommon.common.table;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.clt.framework.component.common.AbstractValueObject;
import com.clt.framework.component.util.JSPUtil;

/**
 * Table Value Ojbect<br>
 * - PDTO(Data Transfer	Object including Parameters)<br>
 * - 관련	Event에서	작성,	서버실행요청시	PDTO의 역할을 수행하는 Value Object<br>
 * 
 * @author jaewonLee
 * @since J2EE 1.6
 * @see	..
 */
public class PriMotFileLocPptVO	extends	 AbstractValueObject {

	private	 static final long serialVersionUID = 1L;

	private	 Collection<PriMotFileLocPptVO>  models =	new	ArrayList<PriMotFileLocPptVO>();
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Page Number */
	private String pagerows = null;
	/*	Column Info	*/
	private String orgDestTpCd = null;
	/*	Column Info	*/
	private String locCd = null;
	/*	Column Info	*/
	private String motFileLocCd = null;
	/*	Column Info	*/
	private String motFileLocNm = null;
	/*	Column Info	*/
	private String motFileLaneCd = null;
	/*	Column Info	*/
	private String deltFlg = null;
	/*	Column Info	*/
	private String creUsrId = null;
	/*	Column Info	*/
	private String creDt = null;
	/*	Column Info	*/
	private String updUsrId = null;
	/*	Column Info	*/
	private String updDt = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private	 HashMap<String , String>	hashColumns	= new LinkedHashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private	 HashMap<String , String>	hashFields = new LinkedHashMap<String, String>();


	/**	Constructor	*/
	public PriMotFileLocPptVO(){}

	public PriMotFileLocPptVO(String ibflag,String pagerows,String orgDestTpCd,String locCd,String motFileLocCd,String motFileLocNm,String motFileLaneCd,String deltFlg,String creUsrId,String creDt,String updUsrId,String updDt)	{
		this.ibflag = ibflag;
		this.pagerows = pagerows;
		this.orgDestTpCd = orgDestTpCd;
		this.locCd = locCd;
		this.motFileLocCd = motFileLocCd;
		this.motFileLocNm = motFileLocNm;
		this.motFileLaneCd = motFileLaneCd;
		this.deltFlg = deltFlg;
		this.creUsrId = creUsrId;
		this.creDt = creDt;
		this.updUsrId = updUsrId;
		this.updDt = updDt;
	}


	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value">	로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("org_dest_tp_cd", getOrgDestTpCd());
		this.hashColumns.put("loc_cd", getLocCd());
		this.hashColumns.put("mot_file_loc_cd", getMotFileLocCd());
		this.hashColumns.put("mot_file_loc_nm", getMotFileLocNm());
		this.hashColumns.put("mot_file_lane_cd", getMotFileLaneCd());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("upd_dt", getUpdDt());
		return this.hashColumns;
	}

	/**
	 * 컬럼명에	대응되는 멤버변수명을	저장하여 Hashtable<"column_name", "variable"> 로 반환
	 * @return
	 */
	public  HashMap<String, String>  getFieldNames(){
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("org_dest_tp_cd", "orgDestTpCd");
		this.hashFields.put("loc_cd", "locCd");
		this.hashFields.put("mot_file_loc_cd", "motFileLocCd");
		this.hashFields.put("mot_file_loc_nm", "motFileLocNm");
		this.hashFields.put("mot_file_lane_cd", "motFileLaneCd");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("upd_dt", "updDt");
		return this.hashFields;
	}

	//	Getters	and	Setters

	/**
	 * VO Data Value( C:Creation, U:Update, D:Delete )
	 * @return ibflag
	 */
	public	String getIbflag() {
		return	this.ibflag;
	}

	/**
	 * Page Number
	 * @return pagerows
	 */
	public	String getPagerows() {
		return	this.pagerows;
	}

	/**
	 * Column Info
	 * @return orgDestTpCd
	 */
	public	String getOrgDestTpCd() {
		return	this.orgDestTpCd;
	}

	/**
	 * Column Info
	 * @return locCd
	 */
	public	String getLocCd() {
		return	this.locCd;
	}

	/**
	 * Column Info
	 * @return motFileLocCd
	 */
	public	String getMotFileLocCd() {
		return	this.motFileLocCd;
	}

	/**
	 * Column Info
	 * @return motFileLocNm
	 */
	public	String getMotFileLocNm() {
		return	this.motFileLocNm;
	}

	/**
	 * Column Info
	 * @return motFileLaneCd
	 */
	public	String getMotFileLaneCd() {
		return	this.motFileLaneCd;
	}

	/**
	 * Column Info
	 * @return deltFlg
	 */
	public	String getDeltFlg() {
		return	this.deltFlg;
	}

	/**
	 * Column Info
	 * @return creUsrId
	 */
	public	String getCreUsrId() {
		return	this.creUsrId;
	}

	/**
	 * Column Info
	 * @return creDt
	 */
	public	String getCreDt() {
		return	this.creDt;
	}

	/**
	 * Column Info
	 * @return updUsrId
	 */
	public	String getUpdUsrId() {
		return	this.updUsrId;
	}

	/**
	 * Column Info
	 * @return updDt
	 */
	public	String getUpdDt() {
		return	this.updDt;
	}

 	/**
	 * VO Data Value( C:Creation, U:Update, D:Delete )
	 * @param  ibflag
 	 */
	public void	setIbflag(String ibflag ) {
		this.ibflag =	ibflag;
	}
 	/**
	 * Page Number
	 * @param  pagerows
 	 */
	public void	setPagerows(String pagerows ) {
		this.pagerows =	pagerows;
	}
 	/**
	 * Column Info
	 * @param  orgDestTpCd
 	 */
	public void	setOrgDestTpCd(String orgDestTpCd ) {
		this.orgDestTpCd =	orgDestTpCd;
	}
 	/**
	 * Column Info
	 * @param  locCd
 	 */
	public void	setLocCd(String locCd ) {
		this.locCd =	locCd;
	}
 	/**
	 * Column Info
	 * @param  motFileLocCd
 	 */
	public void	setMotFileLocCd(String motFileLocCd ) {
		this.motFileLocCd =	motFileLocCd;
	}
 	/**
	 * Column Info
	 * @param  motFileLocNm
 	 */
	public void	setMotFileLocNm(String motFileLocNm ) {
		this.motFileLocNm =	motFileLocNm;
	}
 	/**
	 * Column Info
	 * @param  motFileLaneCd
 	 */
	public void	setMotFileLaneCd(String motFileLaneCd ) {
		this.motFileLaneCd =	motFileLaneCd;
	}
 	/**
	 * Column Info
	 * @param  deltFlg
 	 */
	public void	setDeltFlg(String deltFlg ) {
		this.deltFlg =	deltFlg;
	}
 	/**
	 * Column Info
	 * @param  creUsrId
 	 */
	public void	setCreUsrId(String creUsrId ) {
		this.creUsrId =	creUsrId;
	}
 	/**
	 * Column Info
	 * @param  creDt
 	 */
	public void	setCreDt(String creDt ) {
		this.creDt =	creDt;
	}
 	/**
	 * Column Info
	 * @param  updUsrId
 	 */
	public void	setUpdUsrId(String updUsrId ) {
		this.updUsrId =	updUsrId;
	}
 	/**
	 * Column Info
	 * @param  updDt
 	 */
	public void	setUpdDt(String updDt ) {
		this.updDt =	updDt;
	}

	/**
	 * Request 의 데이터를 추출하여 VO 의	멤버변수에 설정.
	 * @param request
	 */
	public void	fromRequest(HttpServletRequest request)	{
		fromRequest(request,"");
	}

	/**
	 * Request 의 데이터를 추출하여 VO 의	멤버변수에 설정.
	 * @param request
	 */
	public void	fromRequest(HttpServletRequest request,	String prefix) {
		setIbflag(JSPUtil.getParameter(request,	prefix + "ibflag", ""));
		setPagerows(JSPUtil.getParameter(request,	prefix + "pagerows", ""));
		setOrgDestTpCd(JSPUtil.getParameter(request,	prefix + "org_dest_tp_cd", ""));
		setLocCd(JSPUtil.getParameter(request,	prefix + "loc_cd", ""));
		setMotFileLocCd(JSPUtil.getParameter(request,	prefix + "mot_file_loc_cd", ""));
		setMotFileLocNm(JSPUtil.getParameter(request,	prefix + "mot_file_loc_nm", ""));
		setMotFileLaneCd(JSPUtil.getParameter(request,	prefix + "mot_file_lane_cd", ""));
		setDeltFlg(JSPUtil.getParameter(request,	prefix + "delt_flg", ""));
		setCreUsrId(JSPUtil.getParameter(request,	prefix + "cre_usr_id", ""));
		setCreDt(JSPUtil.getParameter(request,	prefix + "cre_dt", ""));
		setUpdUsrId(JSPUtil.getParameter(request,	prefix + "upd_usr_id", ""));
		setUpdDt(JSPUtil.getParameter(request,	prefix + "upd_dt", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return PriMotFileLocPptVO[]
	 */
	public PriMotFileLocPptVO[]	fromRequestGrid(HttpServletRequest request)	{
		return fromRequestGrid(request,	"");
	}

	/**
	 * Request 넘어온 여러 건	DATA를 VO Class 에 담는다.
	 * @param request
	 * @param prefix
	 * @return PriMotFileLocPptVO[]
	 */
	public PriMotFileLocPptVO[]	fromRequestGrid(HttpServletRequest request,	String prefix) {
		PriMotFileLocPptVO model = null;

		String[] tmp = request.getParameterValues(prefix + "ibflag");
		if (tmp	== null)
			return null;

		int	length = request.getParameterValues(prefix + "ibflag").length;

		try	{
			String[] ibflag =	(JSPUtil.getParameter(request, prefix +	"ibflag",	length));
			String[] pagerows =	(JSPUtil.getParameter(request, prefix +	"pagerows",	length));
			String[] orgDestTpCd =	(JSPUtil.getParameter(request, prefix +	"org_dest_tp_cd",	length));
			String[] locCd =	(JSPUtil.getParameter(request, prefix +	"loc_cd",	length));
			String[] motFileLocCd =	(JSPUtil.getParameter(request, prefix +	"mot_file_loc_cd",	length));
			String[] motFileLocNm =	(JSPUtil.getParameter(request, prefix +	"mot_file_loc_nm",	length));
			String[] motFileLaneCd =	(JSPUtil.getParameter(request, prefix +	"mot_file_lane_cd",	length));
			String[] deltFlg =	(JSPUtil.getParameter(request, prefix +	"delt_flg",	length));
			String[] creUsrId =	(JSPUtil.getParameter(request, prefix +	"cre_usr_id",	length));
			String[] creDt =	(JSPUtil.getParameter(request, prefix +	"cre_dt",	length));
			String[] updUsrId =	(JSPUtil.getParameter(request, prefix +	"upd_usr_id",	length));
			String[] updDt =	(JSPUtil.getParameter(request, prefix +	"upd_dt",	length));
			for	(int i = 0;	i <	length;	i++) {
				model =	new	PriMotFileLocPptVO();
				if ( ibflag[i] !=	null)
					model.setIbflag( ibflag[i]);
				if ( pagerows[i] !=	null)
					model.setPagerows( pagerows[i]);
				if ( orgDestTpCd[i] !=	null)
					model.setOrgDestTpCd( orgDestTpCd[i]);
				if ( locCd[i] !=	null)
					model.setLocCd( locCd[i]);
				if ( motFileLocCd[i] !=	null)
					model.setMotFileLocCd( motFileLocCd[i]);
				if ( motFileLocNm[i] !=	null)
					model.setMotFileLocNm( motFileLocNm[i]);
				if ( motFileLaneCd[i] !=	null)
					model.setMotFileLaneCd( motFileLaneCd[i]);
				if ( deltFlg[i] !=	null)
					model.setDeltFlg( deltFlg[i]);
				if ( creUsrId[i] !=	null)
					model.setCreUsrId( creUsrId[i]);
				if ( creDt[i] !=	null)
					model.setCreDt( creDt[i]);
				if ( updUsrId[i] !=	null)
					model.setUpdUsrId( updUsrId[i]);
				if ( updDt[i] !=	null)
					model.setUpdDt( updDt[i]);
				models.add(model);
			}

		} catch	(Exception e) {
			return null;
		}
		return getPriMotFileLocPptVOs();
	}

	/**
	 *  VO 배열을 반환
	 * @return PriMotFileLocPptVO[]
	 */
	public PriMotFileLocPptVO[]	 getPriMotFileLocPptVOs(){
		PriMotFileLocPptVO[] vos = (PriMotFileLocPptVO[])models.toArray(new	PriMotFileLocPptVO[models.size()]);
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
	public void	unDataFormat(){
		this.ibflag =	this.ibflag.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows =	this.pagerows.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.orgDestTpCd =	this.orgDestTpCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.locCd =	this.locCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.motFileLocCd =	this.motFileLocCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.motFileLocNm =	this.motFileLocNm.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.motFileLaneCd =	this.motFileLaneCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg =	this.deltFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId =	this.creUsrId.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt =	this.creDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId =	this.updUsrId.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt =	this.updDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}