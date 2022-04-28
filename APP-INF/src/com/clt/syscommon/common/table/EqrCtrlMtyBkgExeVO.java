/*=========================================================
 *Copyright(c) 2014 CyberLogitec
 *@FileName : EqrCtrlMtyBkgExeVO.java
 *@FileTitle : EqrCtrlMtyBkgExeVO
 *Open Issues :
 *Change history :
 *@LastModifyDate : 2015.04.24
 *@LastModifier : 
 *@LastVersion : 1.0
 * 2015.04.24  
 * 1.0 Creation
=========================================================*/

package	 com.clt.syscommon.common.table;

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
 * @author 
 * @since J2EE 1.6
 * @see	.. 
 */
public class EqrCtrlMtyBkgExeVO	extends	 AbstractValueObject
{

	private	 static final long serialVersionUID = 1L;

	private	 Collection<EqrCtrlMtyBkgExeVO>  models =	new	ArrayList<EqrCtrlMtyBkgExeVO>();


	/*	Column Info	*/
	private  String	 vslCd   =  null;
	/*	Column Info	*/
	private  String	 bkgStsCd   =  null;
	/*	Column Info	*/
	private  String	 oldBkgGrpNo   =  null;
	/*	Column Info	*/
	private  String	 creDt   =  null;
	/*	Column Info	*/
	private  String	 polEtdDt   =  null;
	/*	Column Info	*/
	private  String	 mtyBkgSplitFlg   =  null;
	/*	Column Info	*/
	private  String	 trspModCd   =  null;
	/*	Column Info	*/
	private  String	 pagerows   =  null;
	/*	Column Info	*/
	private  String	 vslLaneCd   =  null;
	/*	Column Info	*/
	private  String	 ibflag   =  null;
	/*	Column Info	*/
	private  String	 polClptIndSeq   =  null;
	/*	Column Info	*/
	private  String	 mtyRobFlg   =  null;
	/*	Column Info	*/
	private  String	 repoPlnFbRsnCd   =  null;
	/*	Column Info	*/
	private  String	 podYdCd   =  null;
	/*	Column Info	*/
	private  String	 eqRepoPurpCd   =  null;
	/*	Column Info	*/
	private  String	 updUsrId   =  null;
	/*	Column Info	*/
	private  String	 updDt   =  null;
	/*	Column Info	*/
	private  String	 mtyBkgFlg   =  null;
	/*	Column Info	*/
	private  String	 mtyBkgNo   =  null;
	/*	Column Info	*/
	private  String	 podClptIndSeq   =  null;
	/*	Column Info	*/
	private  String	 skdVoyNo   =  null;
	/*	Column Info	*/
	private  String	 skdDirCd   =  null;
	/*	Column Info	*/
	private  String	 podEtbDt   =  null;
	/*	Column Info	*/
	private  String	 creUsrId   =  null;
	/*	Column Info	*/
	private  String	 bkgExeSeq   =  null;
	/*	Column Info	*/
	private  String	 polYdCd   =  null;
	/*	Column Info	*/
	private  String	 repoPlnFbRmk   =  null;
	/*	Column Info	*/
	private  String	 repoPlnId   =  null;
	/*	Column Info	*/
	private  String	 refId   =  null;

	/* hashColumnInpo */
	private	 HashMap<String , String>	hashColumns	= new LinkedHashMap<String, String>();

	/* hashFildInpo	*/
	private	 HashMap<String , String>	hashFields = new LinkedHashMap<String, String>();
 
 
	/**	Constructor	*/
	public EqrCtrlMtyBkgExeVO(){}

	public EqrCtrlMtyBkgExeVO(String vslCd,String bkgStsCd,String oldBkgGrpNo,String creDt,String polEtdDt,String mtyBkgSplitFlg,String trspModCd,String pagerows,String vslLaneCd,String ibflag,String polClptIndSeq,String mtyRobFlg,String repoPlnFbRsnCd,String podYdCd,String eqRepoPurpCd,String updUsrId,String updDt,String mtyBkgFlg,String mtyBkgNo,String podClptIndSeq,String skdVoyNo,String skdDirCd,String podEtbDt,String creUsrId,String bkgExeSeq,String polYdCd,String repoPlnFbRmk,String repoPlnId,String refId)	{
		this.vslCd  = vslCd ;
		this.bkgStsCd  = bkgStsCd ;
		this.oldBkgGrpNo  = oldBkgGrpNo ;
		this.creDt  = creDt ;
		this.polEtdDt  = polEtdDt ;
		this.mtyBkgSplitFlg  = mtyBkgSplitFlg ;
		this.trspModCd  = trspModCd ;
		this.pagerows  = pagerows ;
		this.vslLaneCd  = vslLaneCd ;
		this.ibflag  = ibflag ;
		this.polClptIndSeq  = polClptIndSeq ;
		this.mtyRobFlg  = mtyRobFlg ;
		this.repoPlnFbRsnCd  = repoPlnFbRsnCd ;
		this.podYdCd  = podYdCd ;
		this.eqRepoPurpCd  = eqRepoPurpCd ;
		this.updUsrId  = updUsrId ;
		this.updDt  = updDt ;
		this.mtyBkgFlg  = mtyBkgFlg ;
		this.mtyBkgNo  = mtyBkgNo ;
		this.podClptIndSeq  = podClptIndSeq ;
		this.skdVoyNo  = skdVoyNo ;
		this.skdDirCd  = skdDirCd ;
		this.podEtbDt  = podEtbDt ;
		this.creUsrId  = creUsrId ;
		this.bkgExeSeq  = bkgExeSeq ;
		this.polYdCd  = polYdCd ;
		this.repoPlnFbRmk  = repoPlnFbRmk ;
		this.repoPlnId  = repoPlnId ;
		this.refId  = refId ;
	}


	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value">	로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("vsl_cd", getVslCd());		
		this.hashColumns.put("bkg_sts_cd", getBkgStsCd());		
		this.hashColumns.put("old_bkg_grp_no", getOldBkgGrpNo());		
		this.hashColumns.put("cre_dt", getCreDt());		
		this.hashColumns.put("pol_etd_dt", getPolEtdDt());		
		this.hashColumns.put("mty_bkg_split_flg", getMtyBkgSplitFlg());		
		this.hashColumns.put("trsp_mod_cd", getTrspModCd());		
		this.hashColumns.put("pagerows", getPagerows());		
		this.hashColumns.put("vsl_lane_cd", getVslLaneCd());		
		this.hashColumns.put("ibflag", getIbflag());		
		this.hashColumns.put("pol_clpt_ind_seq", getPolClptIndSeq());		
		this.hashColumns.put("mty_rob_flg", getMtyRobFlg());		
		this.hashColumns.put("repo_pln_fb_rsn_cd", getRepoPlnFbRsnCd());		
		this.hashColumns.put("pod_yd_cd", getPodYdCd());		
		this.hashColumns.put("eq_repo_purp_cd", getEqRepoPurpCd());		
		this.hashColumns.put("upd_usr_id", getUpdUsrId());		
		this.hashColumns.put("upd_dt", getUpdDt());		
		this.hashColumns.put("mty_bkg_flg", getMtyBkgFlg());		
		this.hashColumns.put("mty_bkg_no", getMtyBkgNo());		
		this.hashColumns.put("pod_clpt_ind_seq", getPodClptIndSeq());		
		this.hashColumns.put("skd_voy_no", getSkdVoyNo());		
		this.hashColumns.put("skd_dir_cd", getSkdDirCd());		
		this.hashColumns.put("pod_etb_dt", getPodEtbDt());		
		this.hashColumns.put("cre_usr_id", getCreUsrId());		
		this.hashColumns.put("bkg_exe_seq", getBkgExeSeq());		
		this.hashColumns.put("pol_yd_cd", getPolYdCd());		
		this.hashColumns.put("repo_pln_fb_rmk", getRepoPlnFbRmk());		
		this.hashColumns.put("repo_pln_id", getRepoPlnId());		
		this.hashColumns.put("ref_id", getRefId());		
		return this.hashColumns;
}

	/**
	 * 컬럼명에	대응되는 멤버변수명을	저장하여 Hashtable<"column_name", "variable"> 로 반환
	 * @return
	 */
	public  HashMap<String, String>  getFieldNames(){
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("bkg_sts_cd", "bkgStsCd");
		this.hashFields.put("old_bkg_grp_no", "oldBkgGrpNo");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("pol_etd_dt", "polEtdDt");
		this.hashFields.put("mty_bkg_split_flg", "mtyBkgSplitFlg");
		this.hashFields.put("trsp_mod_cd", "trspModCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("vsl_lane_cd", "vslLaneCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("pol_clpt_ind_seq", "polClptIndSeq");
		this.hashFields.put("mty_rob_flg", "mtyRobFlg");
		this.hashFields.put("repo_pln_fb_rsn_cd", "repoPlnFbRsnCd");
		this.hashFields.put("pod_yd_cd", "podYdCd");
		this.hashFields.put("eq_repo_purp_cd", "eqRepoPurpCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("mty_bkg_flg", "mtyBkgFlg");
		this.hashFields.put("mty_bkg_no", "mtyBkgNo");
		this.hashFields.put("pod_clpt_ind_seq", "podClptIndSeq");
		this.hashFields.put("skd_voy_no", "skdVoyNo");
		this.hashFields.put("skd_dir_cd", "skdDirCd");
		this.hashFields.put("pod_etb_dt", "podEtbDt");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("bkg_exe_seq", "bkgExeSeq");
		this.hashFields.put("pol_yd_cd", "polYdCd");
		this.hashFields.put("repo_pln_fb_rmk", "repoPlnFbRmk");
		this.hashFields.put("repo_pln_id", "repoPlnId");
		this.hashFields.put("ref_id", "refId");
		return this.hashFields;
}
	
	
	
 //	Getters	and	Setters
 	/**
	* Column Info
	* @param  vslCd
	*/
	public void	setVslCd( String	vslCd ) {
		this.vslCd =	vslCd;
	}
 
	/**
	 * Column Info
	 * @return	vslCd
	 */
	 public	 String	getVslCd() {
		 return	this.vslCd;
	 } 
 	/**
	* Column Info
	* @param  bkgStsCd
	*/
	public void	setBkgStsCd( String	bkgStsCd ) {
		this.bkgStsCd =	bkgStsCd;
	}
 
	/**
	 * Column Info
	 * @return	bkgStsCd
	 */
	 public	 String	getBkgStsCd() {
		 return	this.bkgStsCd;
	 } 
 	/**
	* Column Info
	* @param  oldBkgGrpNo
	*/
	public void	setOldBkgGrpNo( String	oldBkgGrpNo ) {
		this.oldBkgGrpNo =	oldBkgGrpNo;
	}
 
	/**
	 * Column Info
	 * @return	oldBkgGrpNo
	 */
	 public	 String	getOldBkgGrpNo() {
		 return	this.oldBkgGrpNo;
	 } 
 	/**
	* Column Info
	* @param  creDt
	*/
	public void	setCreDt( String	creDt ) {
		this.creDt =	creDt;
	}
 
	/**
	 * Column Info
	 * @return	creDt
	 */
	 public	 String	getCreDt() {
		 return	this.creDt;
	 } 
 	/**
	* Column Info
	* @param  polEtdDt
	*/
	public void	setPolEtdDt( String	polEtdDt ) {
		this.polEtdDt =	polEtdDt;
	}
 
	/**
	 * Column Info
	 * @return	polEtdDt
	 */
	 public	 String	getPolEtdDt() {
		 return	this.polEtdDt;
	 } 
 	/**
	* Column Info
	* @param  mtyBkgSplitFlg
	*/
	public void	setMtyBkgSplitFlg( String	mtyBkgSplitFlg ) {
		this.mtyBkgSplitFlg =	mtyBkgSplitFlg;
	}
 
	/**
	 * Column Info
	 * @return	mtyBkgSplitFlg
	 */
	 public	 String	getMtyBkgSplitFlg() {
		 return	this.mtyBkgSplitFlg;
	 } 
 	/**
	* Column Info
	* @param  trspModCd
	*/
	public void	setTrspModCd( String	trspModCd ) {
		this.trspModCd =	trspModCd;
	}
 
	/**
	 * Column Info
	 * @return	trspModCd
	 */
	 public	 String	getTrspModCd() {
		 return	this.trspModCd;
	 } 
 	/**
	* Column Info
	* @param  pagerows
	*/
	public void	setPagerows( String	pagerows ) {
		this.pagerows =	pagerows;
	}
 
	/**
	 * Column Info
	 * @return	pagerows
	 */
	 public	 String	getPagerows() {
		 return	this.pagerows;
	 } 
 	/**
	* Column Info
	* @param  vslLaneCd
	*/
	public void	setVslLaneCd( String	vslLaneCd ) {
		this.vslLaneCd =	vslLaneCd;
	}
 
	/**
	 * Column Info
	 * @return	vslLaneCd
	 */
	 public	 String	getVslLaneCd() {
		 return	this.vslLaneCd;
	 } 
 	/**
	* Column Info
	* @param  ibflag
	*/
	public void	setIbflag( String	ibflag ) {
		this.ibflag =	ibflag;
	}
 
	/**
	 * Column Info
	 * @return	ibflag
	 */
	 public	 String	getIbflag() {
		 return	this.ibflag;
	 } 
 	/**
	* Column Info
	* @param  polClptIndSeq
	*/
	public void	setPolClptIndSeq( String	polClptIndSeq ) {
		this.polClptIndSeq =	polClptIndSeq;
	}
 
	/**
	 * Column Info
	 * @return	polClptIndSeq
	 */
	 public	 String	getPolClptIndSeq() {
		 return	this.polClptIndSeq;
	 } 
 	/**
	* Column Info
	* @param  mtyRobFlg
	*/
	public void	setMtyRobFlg( String	mtyRobFlg ) {
		this.mtyRobFlg =	mtyRobFlg;
	}
 
	/**
	 * Column Info
	 * @return	mtyRobFlg
	 */
	 public	 String	getMtyRobFlg() {
		 return	this.mtyRobFlg;
	 } 
 	/**
	* Column Info
	* @param  repoPlnFbRsnCd
	*/
	public void	setRepoPlnFbRsnCd( String	repoPlnFbRsnCd ) {
		this.repoPlnFbRsnCd =	repoPlnFbRsnCd;
	}
 
	/**
	 * Column Info
	 * @return	repoPlnFbRsnCd
	 */
	 public	 String	getRepoPlnFbRsnCd() {
		 return	this.repoPlnFbRsnCd;
	 } 
 	/**
	* Column Info
	* @param  podYdCd
	*/
	public void	setPodYdCd( String	podYdCd ) {
		this.podYdCd =	podYdCd;
	}
 
	/**
	 * Column Info
	 * @return	podYdCd
	 */
	 public	 String	getPodYdCd() {
		 return	this.podYdCd;
	 } 
 	/**
	* Column Info
	* @param  eqRepoPurpCd
	*/
	public void	setEqRepoPurpCd( String	eqRepoPurpCd ) {
		this.eqRepoPurpCd =	eqRepoPurpCd;
	}
 
	/**
	 * Column Info
	 * @return	eqRepoPurpCd
	 */
	 public	 String	getEqRepoPurpCd() {
		 return	this.eqRepoPurpCd;
	 } 
 	/**
	* Column Info
	* @param  updUsrId
	*/
	public void	setUpdUsrId( String	updUsrId ) {
		this.updUsrId =	updUsrId;
	}
 
	/**
	 * Column Info
	 * @return	updUsrId
	 */
	 public	 String	getUpdUsrId() {
		 return	this.updUsrId;
	 } 
 	/**
	* Column Info
	* @param  updDt
	*/
	public void	setUpdDt( String	updDt ) {
		this.updDt =	updDt;
	}
 
	/**
	 * Column Info
	 * @return	updDt
	 */
	 public	 String	getUpdDt() {
		 return	this.updDt;
	 } 
 	/**
	* Column Info
	* @param  mtyBkgFlg
	*/
	public void	setMtyBkgFlg( String	mtyBkgFlg ) {
		this.mtyBkgFlg =	mtyBkgFlg;
	}
 
	/**
	 * Column Info
	 * @return	mtyBkgFlg
	 */
	 public	 String	getMtyBkgFlg() {
		 return	this.mtyBkgFlg;
	 } 
 	/**
	* Column Info
	* @param  mtyBkgNo
	*/
	public void	setMtyBkgNo( String	mtyBkgNo ) {
		this.mtyBkgNo =	mtyBkgNo;
	}
 
	/**
	 * Column Info
	 * @return	mtyBkgNo
	 */
	 public	 String	getMtyBkgNo() {
		 return	this.mtyBkgNo;
	 } 
 	/**
	* Column Info
	* @param  podClptIndSeq
	*/
	public void	setPodClptIndSeq( String	podClptIndSeq ) {
		this.podClptIndSeq =	podClptIndSeq;
	}
 
	/**
	 * Column Info
	 * @return	podClptIndSeq
	 */
	 public	 String	getPodClptIndSeq() {
		 return	this.podClptIndSeq;
	 } 
 	/**
	* Column Info
	* @param  skdVoyNo
	*/
	public void	setSkdVoyNo( String	skdVoyNo ) {
		this.skdVoyNo =	skdVoyNo;
	}
 
	/**
	 * Column Info
	 * @return	skdVoyNo
	 */
	 public	 String	getSkdVoyNo() {
		 return	this.skdVoyNo;
	 } 
 	/**
	* Column Info
	* @param  skdDirCd
	*/
	public void	setSkdDirCd( String	skdDirCd ) {
		this.skdDirCd =	skdDirCd;
	}
 
	/**
	 * Column Info
	 * @return	skdDirCd
	 */
	 public	 String	getSkdDirCd() {
		 return	this.skdDirCd;
	 } 
 	/**
	* Column Info
	* @param  podEtbDt
	*/
	public void	setPodEtbDt( String	podEtbDt ) {
		this.podEtbDt =	podEtbDt;
	}
 
	/**
	 * Column Info
	 * @return	podEtbDt
	 */
	 public	 String	getPodEtbDt() {
		 return	this.podEtbDt;
	 } 
 	/**
	* Column Info
	* @param  creUsrId
	*/
	public void	setCreUsrId( String	creUsrId ) {
		this.creUsrId =	creUsrId;
	}
 
	/**
	 * Column Info
	 * @return	creUsrId
	 */
	 public	 String	getCreUsrId() {
		 return	this.creUsrId;
	 } 
 	/**
	* Column Info
	* @param  bkgExeSeq
	*/
	public void	setBkgExeSeq( String	bkgExeSeq ) {
		this.bkgExeSeq =	bkgExeSeq;
	}
 
	/**
	 * Column Info
	 * @return	bkgExeSeq
	 */
	 public	 String	getBkgExeSeq() {
		 return	this.bkgExeSeq;
	 } 
 	/**
	* Column Info
	* @param  polYdCd
	*/
	public void	setPolYdCd( String	polYdCd ) {
		this.polYdCd =	polYdCd;
	}
 
	/**
	 * Column Info
	 * @return	polYdCd
	 */
	 public	 String	getPolYdCd() {
		 return	this.polYdCd;
	 } 
 	/**
	* Column Info
	* @param  repoPlnFbRmk
	*/
	public void	setRepoPlnFbRmk( String	repoPlnFbRmk ) {
		this.repoPlnFbRmk =	repoPlnFbRmk;
	}
 
	/**
	 * Column Info
	 * @return	repoPlnFbRmk
	 */
	 public	 String	getRepoPlnFbRmk() {
		 return	this.repoPlnFbRmk;
	 } 
 	/**
	* Column Info
	* @param  repoPlnId
	*/
	public void	setRepoPlnId( String	repoPlnId ) {
		this.repoPlnId =	repoPlnId;
	}
 
	/**
	 * Column Info
	 * @return	repoPlnId
	 */
	 public	 String	getRepoPlnId() {
		 return	this.repoPlnId;
	 } 
 	/**
	* Column Info
	* @param  refId
	*/
	public void	setRefId( String	refId ) {
		this.refId =	refId;
	}
 
	/**
	 * Column Info
	 * @return	refId
	 */
	 public	 String	getRefId() {
		 return	this.refId;
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
		setVslCd(JSPUtil.getParameter(request,	prefix + "vsl_cd", ""));
		setBkgStsCd(JSPUtil.getParameter(request,	prefix + "bkg_sts_cd", ""));
		setOldBkgGrpNo(JSPUtil.getParameter(request,	prefix + "old_bkg_grp_no", ""));
		setCreDt(JSPUtil.getParameter(request,	prefix + "cre_dt", ""));
		setPolEtdDt(JSPUtil.getParameter(request,	prefix + "pol_etd_dt", ""));
		setMtyBkgSplitFlg(JSPUtil.getParameter(request,	prefix + "mty_bkg_split_flg", ""));
		setTrspModCd(JSPUtil.getParameter(request,	prefix + "trsp_mod_cd", ""));
		setPagerows(JSPUtil.getParameter(request,	prefix + "pagerows", ""));
		setVslLaneCd(JSPUtil.getParameter(request,	prefix + "vsl_lane_cd", ""));
		setIbflag(JSPUtil.getParameter(request,	prefix + "ibflag", ""));
		setPolClptIndSeq(JSPUtil.getParameter(request,	prefix + "pol_clpt_ind_seq", ""));
		setMtyRobFlg(JSPUtil.getParameter(request,	prefix + "mty_rob_flg", ""));
		setRepoPlnFbRsnCd(JSPUtil.getParameter(request,	prefix + "repo_pln_fb_rsn_cd", ""));
		setPodYdCd(JSPUtil.getParameter(request,	prefix + "pod_yd_cd", ""));
		setEqRepoPurpCd(JSPUtil.getParameter(request,	prefix + "eq_repo_purp_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request,	prefix + "upd_usr_id", ""));
		setUpdDt(JSPUtil.getParameter(request,	prefix + "upd_dt", ""));
		setMtyBkgFlg(JSPUtil.getParameter(request,	prefix + "mty_bkg_flg", ""));
		setMtyBkgNo(JSPUtil.getParameter(request,	prefix + "mty_bkg_no", ""));
		setPodClptIndSeq(JSPUtil.getParameter(request,	prefix + "pod_clpt_ind_seq", ""));
		setSkdVoyNo(JSPUtil.getParameter(request,	prefix + "skd_voy_no", ""));
		setSkdDirCd(JSPUtil.getParameter(request,	prefix + "skd_dir_cd", ""));
		setPodEtbDt(JSPUtil.getParameter(request,	prefix + "pod_etb_dt", ""));
		setCreUsrId(JSPUtil.getParameter(request,	prefix + "cre_usr_id", ""));
		setBkgExeSeq(JSPUtil.getParameter(request,	prefix + "bkg_exe_seq", ""));
		setPolYdCd(JSPUtil.getParameter(request,	prefix + "pol_yd_cd", ""));
		setRepoPlnFbRmk(JSPUtil.getParameter(request,	prefix + "repo_pln_fb_rmk", ""));
		setRepoPlnId(JSPUtil.getParameter(request,	prefix + "repo_pln_id", ""));
		setRefId(JSPUtil.getParameter(request,	prefix + "ref_id", ""));
	}
	
	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return EqrCtrlMtyBkgExeVO[]
	 */
	public EqrCtrlMtyBkgExeVO[]	fromRequestGrid(HttpServletRequest request)	{
		return fromRequestGrid(request,	"");
	}

	/**
	 * Request 넘어온 여러 건	DATA를 VO Class 에 담는다.
	 * @param request
	 * @param prefix
	 * @return EqrCtrlMtyBkgExeVO[]
	 */
	public EqrCtrlMtyBkgExeVO[]	fromRequestGrid(HttpServletRequest request,	String prefix) {
		EqrCtrlMtyBkgExeVO model = null;

		String[] tmp = request.getParameterValues(prefix + "ibflag");
		if (tmp	== null)
			return null;

		int	length = request.getParameterValues(prefix + "ibflag").length;

		try	{
				String[] vslCd =	(JSPUtil.getParameter(request, prefix +	"vsl_cd".trim(),	length));
				String[] bkgStsCd =	(JSPUtil.getParameter(request, prefix +	"bkg_sts_cd".trim(),	length));
				String[] oldBkgGrpNo =	(JSPUtil.getParameter(request, prefix +	"old_bkg_grp_no".trim(),	length));
				String[] creDt =	(JSPUtil.getParameter(request, prefix +	"cre_dt".trim(),	length));
				String[] polEtdDt =	(JSPUtil.getParameter(request, prefix +	"pol_etd_dt".trim(),	length));
				String[] mtyBkgSplitFlg =	(JSPUtil.getParameter(request, prefix +	"mty_bkg_split_flg".trim(),	length));
				String[] trspModCd =	(JSPUtil.getParameter(request, prefix +	"trsp_mod_cd".trim(),	length));
				String[] pagerows =	(JSPUtil.getParameter(request, prefix +	"pagerows".trim(),	length));
				String[] vslLaneCd =	(JSPUtil.getParameter(request, prefix +	"vsl_lane_cd".trim(),	length));
				String[] ibflag =	(JSPUtil.getParameter(request, prefix +	"ibflag".trim(),	length));
				String[] polClptIndSeq =	(JSPUtil.getParameter(request, prefix +	"pol_clpt_ind_seq".trim(),	length));
				String[] mtyRobFlg =	(JSPUtil.getParameter(request, prefix +	"mty_rob_flg".trim(),	length));
				String[] repoPlnFbRsnCd =	(JSPUtil.getParameter(request, prefix +	"repo_pln_fb_rsn_cd".trim(),	length));
				String[] podYdCd =	(JSPUtil.getParameter(request, prefix +	"pod_yd_cd".trim(),	length));
				String[] eqRepoPurpCd =	(JSPUtil.getParameter(request, prefix +	"eq_repo_purp_cd".trim(),	length));
				String[] updUsrId =	(JSPUtil.getParameter(request, prefix +	"upd_usr_id".trim(),	length));
				String[] updDt =	(JSPUtil.getParameter(request, prefix +	"upd_dt".trim(),	length));
				String[] mtyBkgFlg =	(JSPUtil.getParameter(request, prefix +	"mty_bkg_flg".trim(),	length));
				String[] mtyBkgNo =	(JSPUtil.getParameter(request, prefix +	"mty_bkg_no".trim(),	length));
				String[] podClptIndSeq =	(JSPUtil.getParameter(request, prefix +	"pod_clpt_ind_seq".trim(),	length));
				String[] skdVoyNo =	(JSPUtil.getParameter(request, prefix +	"skd_voy_no".trim(),	length));
				String[] skdDirCd =	(JSPUtil.getParameter(request, prefix +	"skd_dir_cd".trim(),	length));
				String[] podEtbDt =	(JSPUtil.getParameter(request, prefix +	"pod_etb_dt".trim(),	length));
				String[] creUsrId =	(JSPUtil.getParameter(request, prefix +	"cre_usr_id".trim(),	length));
				String[] bkgExeSeq =	(JSPUtil.getParameter(request, prefix +	"bkg_exe_seq".trim(),	length));
				String[] polYdCd =	(JSPUtil.getParameter(request, prefix +	"pol_yd_cd".trim(),	length));
				String[] repoPlnFbRmk =	(JSPUtil.getParameter(request, prefix +	"repo_pln_fb_rmk".trim(),	length));
				String[] repoPlnId =	(JSPUtil.getParameter(request, prefix +	"repo_pln_id".trim(),	length));
				String[] refId =	(JSPUtil.getParameter(request, prefix +	"ref_id".trim(),	length));
				for	(int i = 0;	i <	length;	i++) {
					model =	new	EqrCtrlMtyBkgExeVO();
						if ( vslCd[i] !=	null)
						model.setVslCd( vslCd[i]);
						if ( bkgStsCd[i] !=	null)
						model.setBkgStsCd( bkgStsCd[i]);
						if ( oldBkgGrpNo[i] !=	null)
						model.setOldBkgGrpNo( oldBkgGrpNo[i]);
						if ( creDt[i] !=	null)
						model.setCreDt( creDt[i]);
						if ( polEtdDt[i] !=	null)
						model.setPolEtdDt( polEtdDt[i]);
						if ( mtyBkgSplitFlg[i] !=	null)
						model.setMtyBkgSplitFlg( mtyBkgSplitFlg[i]);
						if ( trspModCd[i] !=	null)
						model.setTrspModCd( trspModCd[i]);
						if ( pagerows[i] !=	null)
						model.setPagerows( pagerows[i]);
						if ( vslLaneCd[i] !=	null)
						model.setVslLaneCd( vslLaneCd[i]);
						if ( ibflag[i] !=	null)
						model.setIbflag( ibflag[i]);
						if ( polClptIndSeq[i] !=	null)
						model.setPolClptIndSeq( polClptIndSeq[i]);
						if ( mtyRobFlg[i] !=	null)
						model.setMtyRobFlg( mtyRobFlg[i]);
						if ( repoPlnFbRsnCd[i] !=	null)
						model.setRepoPlnFbRsnCd( repoPlnFbRsnCd[i]);
						if ( podYdCd[i] !=	null)
						model.setPodYdCd( podYdCd[i]);
						if ( eqRepoPurpCd[i] !=	null)
						model.setEqRepoPurpCd( eqRepoPurpCd[i]);
						if ( updUsrId[i] !=	null)
						model.setUpdUsrId( updUsrId[i]);
						if ( updDt[i] !=	null)
						model.setUpdDt( updDt[i]);
						if ( mtyBkgFlg[i] !=	null)
						model.setMtyBkgFlg( mtyBkgFlg[i]);
						if ( mtyBkgNo[i] !=	null)
						model.setMtyBkgNo( mtyBkgNo[i]);
						if ( podClptIndSeq[i] !=	null)
						model.setPodClptIndSeq( podClptIndSeq[i]);
						if ( skdVoyNo[i] !=	null)
						model.setSkdVoyNo( skdVoyNo[i]);
						if ( skdDirCd[i] !=	null)
						model.setSkdDirCd( skdDirCd[i]);
						if ( podEtbDt[i] !=	null)
						model.setPodEtbDt( podEtbDt[i]);
						if ( creUsrId[i] !=	null)
						model.setCreUsrId( creUsrId[i]);
						if ( bkgExeSeq[i] !=	null)
						model.setBkgExeSeq( bkgExeSeq[i]);
						if ( polYdCd[i] !=	null)
						model.setPolYdCd( polYdCd[i]);
						if ( repoPlnFbRmk[i] !=	null)
						model.setRepoPlnFbRmk( repoPlnFbRmk[i]);
						if ( repoPlnId[i] !=	null)
						model.setRepoPlnId( repoPlnId[i]);
						if ( refId[i] !=	null)
						model.setRefId( refId[i]);
					 models.add(model);
				}

		} catch	(Exception e) {
			return null;
		}
		return getEqrCtrlMtyBkgExeVOs();
	}

	/**
	 *  VO 배열을 반환
	 * @return EqrCtrlMtyBkgExeVO[]
	 */
	public EqrCtrlMtyBkgExeVO[]	 getEqrCtrlMtyBkgExeVOs(){
		EqrCtrlMtyBkgExeVO[] vos = (EqrCtrlMtyBkgExeVO[])models.toArray(new	EqrCtrlMtyBkgExeVO[models.size()]);
		return vos;
		}

	/**
	 * VO Class의 내용을 String으로 변환
	 */
	public String  toString() {
		   return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE );
	}
	

	/**
	* 포맷팅된 문자열에서 특수문자 제거("-","/",",",":")
	*/
	public void	unDataFormat(){
		this.vslCd =	this.vslCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgStsCd =	this.bkgStsCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.oldBkgGrpNo =	this.oldBkgGrpNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt =	this.creDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.polEtdDt =	this.polEtdDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mtyBkgSplitFlg =	this.mtyBkgSplitFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspModCd =	this.trspModCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows =	this.pagerows.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslLaneCd =	this.vslLaneCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag =	this.ibflag.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.polClptIndSeq =	this.polClptIndSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mtyRobFlg =	this.mtyRobFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.repoPlnFbRsnCd =	this.repoPlnFbRsnCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.podYdCd =	this.podYdCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eqRepoPurpCd =	this.eqRepoPurpCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId =	this.updUsrId.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt =	this.updDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mtyBkgFlg =	this.mtyBkgFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mtyBkgNo =	this.mtyBkgNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.podClptIndSeq =	this.podClptIndSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdVoyNo =	this.skdVoyNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdDirCd =	this.skdDirCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.podEtbDt =	this.podEtbDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId =	this.creUsrId.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgExeSeq =	this.bkgExeSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.polYdCd =	this.polYdCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.repoPlnFbRmk =	this.repoPlnFbRmk.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.repoPlnId =	this.repoPlnId.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.refId =	this.refId.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}	
}