/*=========================================================
 *Copyright(c) 2014 CyberLogitec
 *@FileName : GlEstmRevVvdVO.java
 *@FileTitle : GlEstmRevVvdVO
 *Open Issues :
 *Change history :
 *@LastModifyDate : 2016.05.03
 *@LastModifier : 
 *@LastVersion : 1.0
 * 2016.05.03  
 * 1.0 Creation
=========================================================*/

package	 com.clt.apps.opus.bcm.fin.financemanagement.financecreation.vo;

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
 * - 愿�젴	Event�먯꽌	�묒꽦,	�쒕쾭�ㅽ뻾�붿껌��PDTO����븷���섑뻾�섎뒗 Value Object<br>
 * 
 * @author 
 * @since J2EE 1.6
 * @see	..
 */
public class GlEstmRevVvdVO	extends	 AbstractValueObject
{

	private	 static final long serialVersionUID = 1L;

	private	 Collection<GlEstmRevVvdVO>  models =	new	ArrayList<GlEstmRevVvdVO>();


	/*	Column Info	*/
	private  String	 vslCd   =  null;
	/*	Column Info	*/
	private  String	 revYrmon   =  null;
	/*	Column Info	*/
	private  String	 exeYrmon   =  null;
	/*	Column Info	*/
	private  String	 estmVvdHdrId   =  null;
	/*	Column Info	*/
	private  String	 creDt   =  null;
	/*	Column Info	*/
	private  String	 skdVoyNo   =  null;
	/*	Column Info	*/
	private  String	 lineNo   =  null;
	/*	Column Info	*/
	private  String	 rlaneCd   =  null;
	/*	Column Info	*/
	private  String	 skdDirCd   =  null;
	/*	Column Info	*/
	private  String	 pagerows   =  null;
	/*	Column Info	*/
	private  String	 estmVvdTpCd   =  null;
	/*	Column Info	*/
	private  String	 vstDt   =  null;
	/*	Column Info	*/
	private  String	 revDirCd   =  null;
	/*	Column Info	*/
	private  String	 ibflag   =  null;
	/*	Column Info	*/
	private  String	 estmBcDivCd   =  null;
	/*	Column Info	*/
	private  String	 vedDt   =  null;
	/*	Column Info	*/
	private  String	 estmIocDivCd   =  null;
	/*	Column Info	*/
	private  String	 vslDirCd   =  null;
	/*	Column Info	*/
	private  String	 lane   =  null;
	/*	Column Info	*/
	private  String	 status   =  null;
	/*	Column Info	*/
	private  String	 commAmt   =  null;
	/*	Column Info	*/
	private  String	 acclCommAmt   =  null;
	/*	Column Info	*/
	private  String	 actCommAmt   =  null;
	/*	Column Info	*/
	private  String	 estmCommAmt   =  null;
	/*	Column Info	*/
	private  String	 creUsrId   =  null;
	/*	Column Info	*/
	private  String	 updDt   =  null;
	/*	Column Info	*/
	private  String	 updUsrId   =  null;
	/*	Column Info	*/
	private  String	 poResult   =  null;
	/*	Column Info	*/
	private  String	 poErrMsg   =  null;
	/*	Column Info	*/
	private  String	 vvd   =  null;
	/*	Column Info	*/
	private  String	 ifFlg   =  null;

	/* hashColumnInpo */
	private	 HashMap<String , String>	hashColumns	= new LinkedHashMap<String, String>();

	/* hashFildInpo	*/
	private	 HashMap<String , String>	hashFields = new LinkedHashMap<String, String>();
 
 
	/**	Constructor	*/
	public GlEstmRevVvdVO(){}

	public GlEstmRevVvdVO(String vslCd,String revYrmon,String exeYrmon,String estmVvdHdrId,String creDt,String skdVoyNo,String lineNo,String rlaneCd,String skdDirCd,String pagerows,String estmVvdTpCd,String vstDt,String revDirCd,String ibflag,String estmBcDivCd,String vedDt,String estmIocDivCd,String vslDirCd,String lane,String status,String commAmt,String acclCommAmt,String actCommAmt,String estmCommAmt,String creUsrId,String updDt,String updUsrId,String poResult,String poErrMsg,String vvd,String ifFlg)	{
		this.vslCd  = vslCd ;
		this.revYrmon  = revYrmon ;
		this.exeYrmon  = exeYrmon ;
		this.estmVvdHdrId  = estmVvdHdrId ;
		this.creDt  = creDt ;
		this.skdVoyNo  = skdVoyNo ;
		this.lineNo  = lineNo ;
		this.rlaneCd  = rlaneCd ;
		this.skdDirCd  = skdDirCd ;
		this.pagerows  = pagerows ;
		this.estmVvdTpCd  = estmVvdTpCd ;
		this.vstDt  = vstDt ;
		this.revDirCd  = revDirCd ;
		this.ibflag  = ibflag ;
		this.estmBcDivCd  = estmBcDivCd ;
		this.vedDt  = vedDt ;
		this.estmIocDivCd  = estmIocDivCd ;
		this.vslDirCd  = vslDirCd ;
		this.lane  = lane ;
		this.status  = status ;
		this.commAmt  = commAmt ;
		this.acclCommAmt  = acclCommAmt ;
		this.actCommAmt  = actCommAmt ;
		this.estmCommAmt  = estmCommAmt ;
		this.creUsrId  = creUsrId ;
		this.updDt  = updDt ;
		this.updUsrId  = updUsrId ;
		this.poResult  = poResult ;
		this.poErrMsg  = poErrMsg ;
		this.vvd  = vvd ;
		this.ifFlg  = ifFlg ;
	}


	/**
	 * �뚯씠釉�而щ읆����옣��媛믪쓣 Hashtable<"column_name", "value">	濡�諛섑솚
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("vsl_cd", getVslCd());		
		this.hashColumns.put("rev_yrmon", getRevYrmon());		
		this.hashColumns.put("exe_yrmon", getExeYrmon());		
		this.hashColumns.put("estm_vvd_hdr_id", getEstmVvdHdrId());		
		this.hashColumns.put("cre_dt", getCreDt());		
		this.hashColumns.put("skd_voy_no", getSkdVoyNo());		
		this.hashColumns.put("line_no", getLineNo());		
		this.hashColumns.put("rlane_cd", getRlaneCd());		
		this.hashColumns.put("skd_dir_cd", getSkdDirCd());		
		this.hashColumns.put("pagerows", getPagerows());		
		this.hashColumns.put("estm_vvd_tp_cd", getEstmVvdTpCd());		
		this.hashColumns.put("vst_dt", getVstDt());		
		this.hashColumns.put("rev_dir_cd", getRevDirCd());		
		this.hashColumns.put("ibflag", getIbflag());		
		this.hashColumns.put("estm_bc_div_cd", getEstmBcDivCd());		
		this.hashColumns.put("ved_dt", getVedDt());		
		this.hashColumns.put("estm_ioc_div_cd", getEstmIocDivCd());		
		this.hashColumns.put("vsl_dir_cd", getVslDirCd());		
		this.hashColumns.put("lane", getLane());		
		this.hashColumns.put("status", getStatus());		
		this.hashColumns.put("comm_amt", getCommAmt());		
		this.hashColumns.put("accl_comm_amt", getAcclCommAmt());		
		this.hashColumns.put("act_comm_amt", getActCommAmt());		
		this.hashColumns.put("estm_comm_amt", getEstmCommAmt());		
		this.hashColumns.put("cre_usr_id", getCreUsrId());		
		this.hashColumns.put("upd_dt", getUpdDt());		
		this.hashColumns.put("upd_usr_id", getUpdUsrId());		
		this.hashColumns.put("po_result", getPoResult());		
		this.hashColumns.put("po_err_msg", getPoErrMsg());		
		this.hashColumns.put("vvd", getVvd());		
		this.hashColumns.put("if_flg", getIfFlg());		
		return this.hashColumns;
}

	/**
	 * 而щ읆紐낆뿉	��쓳�섎뒗 硫ㅻ쾭蹂�닔紐낆쓣	��옣�섏뿬 Hashtable<"column_name", "variable"> 濡�諛섑솚
	 * @return
	 */
	public  HashMap<String, String>  getFieldNames(){
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("rev_yrmon", "revYrmon");
		this.hashFields.put("exe_yrmon", "exeYrmon");
		this.hashFields.put("estm_vvd_hdr_id", "estmVvdHdrId");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("skd_voy_no", "skdVoyNo");
		this.hashFields.put("line_no", "lineNo");
		this.hashFields.put("rlane_cd", "rlaneCd");
		this.hashFields.put("skd_dir_cd", "skdDirCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("estm_vvd_tp_cd", "estmVvdTpCd");
		this.hashFields.put("vst_dt", "vstDt");
		this.hashFields.put("rev_dir_cd", "revDirCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("estm_bc_div_cd", "estmBcDivCd");
		this.hashFields.put("ved_dt", "vedDt");
		this.hashFields.put("estm_ioc_div_cd", "estmIocDivCd");
		this.hashFields.put("vsl_dir_cd", "vslDirCd");
		this.hashFields.put("lane", "lane");
		this.hashFields.put("status", "status");
		this.hashFields.put("comm_amt", "commAmt");
		this.hashFields.put("accl_comm_amt", "acclCommAmt");
		this.hashFields.put("act_comm_amt", "actCommAmt");
		this.hashFields.put("estm_comm_amt", "estmCommAmt");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("po_result", "poResult");
		this.hashFields.put("po_err_msg", "poErrMsg");
		this.hashFields.put("vvd", "vvd");
		this.hashFields.put("if_flg", "ifFlg");
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
	* @param  revYrmon
	*/
	public void	setRevYrmon( String	revYrmon ) {
		this.revYrmon =	revYrmon;
	}
 
	/**
	 * Column Info
	 * @return	revYrmon
	 */
	 public	 String	getRevYrmon() {
		 return	this.revYrmon;
	 } 
 	/**
	* Column Info
	* @param  exeYrmon
	*/
	public void	setExeYrmon( String	exeYrmon ) {
		this.exeYrmon =	exeYrmon;
	}
 
	/**
	 * Column Info
	 * @return	exeYrmon
	 */
	 public	 String	getExeYrmon() {
		 return	this.exeYrmon;
	 } 
 	/**
	* Column Info
	* @param  estmVvdHdrId
	*/
	public void	setEstmVvdHdrId( String	estmVvdHdrId ) {
		this.estmVvdHdrId =	estmVvdHdrId;
	}
 
	/**
	 * Column Info
	 * @return	estmVvdHdrId
	 */
	 public	 String	getEstmVvdHdrId() {
		 return	this.estmVvdHdrId;
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
	* @param  lineNo
	*/
	public void	setLineNo( String	lineNo ) {
		this.lineNo =	lineNo;
	}
 
	/**
	 * Column Info
	 * @return	lineNo
	 */
	 public	 String	getLineNo() {
		 return	this.lineNo;
	 } 
 	/**
	* Column Info
	* @param  rlaneCd
	*/
	public void	setRlaneCd( String	rlaneCd ) {
		this.rlaneCd =	rlaneCd;
	}
 
	/**
	 * Column Info
	 * @return	rlaneCd
	 */
	 public	 String	getRlaneCd() {
		 return	this.rlaneCd;
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
	* @param  estmVvdTpCd
	*/
	public void	setEstmVvdTpCd( String	estmVvdTpCd ) {
		this.estmVvdTpCd =	estmVvdTpCd;
	}
 
	/**
	 * Column Info
	 * @return	estmVvdTpCd
	 */
	 public	 String	getEstmVvdTpCd() {
		 return	this.estmVvdTpCd;
	 } 
 	/**
	* Column Info
	* @param  vstDt
	*/
	public void	setVstDt( String	vstDt ) {
		this.vstDt =	vstDt;
	}
 
	/**
	 * Column Info
	 * @return	vstDt
	 */
	 public	 String	getVstDt() {
		 return	this.vstDt;
	 } 
 	/**
	* Column Info
	* @param  revDirCd
	*/
	public void	setRevDirCd( String	revDirCd ) {
		this.revDirCd =	revDirCd;
	}
 
	/**
	 * Column Info
	 * @return	revDirCd
	 */
	 public	 String	getRevDirCd() {
		 return	this.revDirCd;
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
	* @param  estmBcDivCd
	*/
	public void	setEstmBcDivCd( String	estmBcDivCd ) {
		this.estmBcDivCd =	estmBcDivCd;
	}
 
	/**
	 * Column Info
	 * @return	estmBcDivCd
	 */
	 public	 String	getEstmBcDivCd() {
		 return	this.estmBcDivCd;
	 } 
 	/**
	* Column Info
	* @param  vedDt
	*/
	public void	setVedDt( String	vedDt ) {
		this.vedDt =	vedDt;
	}
 
	/**
	 * Column Info
	 * @return	vedDt
	 */
	 public	 String	getVedDt() {
		 return	this.vedDt;
	 } 
 	/**
	* Column Info
	* @param  estmIocDivCd
	*/
	public void	setEstmIocDivCd( String	estmIocDivCd ) {
		this.estmIocDivCd =	estmIocDivCd;
	}
 
	/**
	 * Column Info
	 * @return	estmIocDivCd
	 */
	 public	 String	getEstmIocDivCd() {
		 return	this.estmIocDivCd;
	 } 
 	/**
	* Column Info
	* @param  vslDirCd
	*/
	public void	setVslDirCd( String	vslDirCd ) {
		this.vslDirCd =	vslDirCd;
	}
 
	/**
	 * Column Info
	 * @return	vslDirCd
	 */
	 public	 String	getVslDirCd() {
		 return	this.vslDirCd;
	 } 
 	/**
	* Column Info
	* @param  lane
	*/
	public void	setLane( String	lane ) {
		this.lane =	lane;
	}
 
	/**
	 * Column Info
	 * @return	lane
	 */
	 public	 String	getLane() {
		 return	this.lane;
	 } 
 	/**
	* Column Info
	* @param  status
	*/
	public void	setStatus( String	status ) {
		this.status =	status;
	}
 
	/**
	 * Column Info
	 * @return	status
	 */
	 public	 String	getStatus() {
		 return	this.status;
	 } 
 	/**
	* Column Info
	* @param  commAmt
	*/
	public void	setCommAmt( String	commAmt ) {
		this.commAmt =	commAmt;
	}
 
	/**
	 * Column Info
	 * @return	commAmt
	 */
	 public	 String	getCommAmt() {
		 return	this.commAmt;
	 } 
 	/**
	* Column Info
	* @param  acclCommAmt
	*/
	public void	setAcclCommAmt( String	acclCommAmt ) {
		this.acclCommAmt =	acclCommAmt;
	}
 
	/**
	 * Column Info
	 * @return	acclCommAmt
	 */
	 public	 String	getAcclCommAmt() {
		 return	this.acclCommAmt;
	 } 
 	/**
	* Column Info
	* @param  actCommAmt
	*/
	public void	setActCommAmt( String	actCommAmt ) {
		this.actCommAmt =	actCommAmt;
	}
 
	/**
	 * Column Info
	 * @return	actCommAmt
	 */
	 public	 String	getActCommAmt() {
		 return	this.actCommAmt;
	 } 
 	/**
	* Column Info
	* @param  estmCommAmt
	*/
	public void	setEstmCommAmt( String	estmCommAmt ) {
		this.estmCommAmt =	estmCommAmt;
	}
 
	/**
	 * Column Info
	 * @return	estmCommAmt
	 */
	 public	 String	getEstmCommAmt() {
		 return	this.estmCommAmt;
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
	* @param  poResult
	*/
	public void	setPoResult( String	poResult ) {
		this.poResult =	poResult;
	}
 
	/**
	 * Column Info
	 * @return	poResult
	 */
	 public	 String	getPoResult() {
		 return	this.poResult;
	 } 
 	/**
	* Column Info
	* @param  poErrMsg
	*/
	public void	setPoErrMsg( String	poErrMsg ) {
		this.poErrMsg =	poErrMsg;
	}
 
	/**
	 * Column Info
	 * @return	poErrMsg
	 */
	 public	 String	getPoErrMsg() {
		 return	this.poErrMsg;
	 } 
 	/**
	* Column Info
	* @param  vvd
	*/
	public void	setVvd( String	vvd ) {
		this.vvd =	vvd;
	}
 
	/**
	 * Column Info
	 * @return	vvd
	 */
	 public	 String	getVvd() {
		 return	this.vvd;
	 } 
 	/**
	* Column Info
	* @param  ifFlg
	*/
	public void	setIfFlg( String	ifFlg ) {
		this.ifFlg =	ifFlg;
	}
 
	/**
	 * Column Info
	 * @return	ifFlg
	 */
	 public	 String	getIfFlg() {
		 return	this.ifFlg;
	 } 

	/**
	 * Request ���곗씠�곕� 異붿텧�섏뿬 VO ��硫ㅻ쾭蹂�닔���ㅼ젙.
	 * @param request
	 */
	public void	fromRequest(HttpServletRequest request)	{
		fromRequest(request,"");
	}

	/**
	 * Request ���곗씠�곕� 異붿텧�섏뿬 VO ��硫ㅻ쾭蹂�닔���ㅼ젙.
	 * @param request
	 */
	public void	fromRequest(HttpServletRequest request,	String prefix) {
		setVslCd(JSPUtil.getParameter(request,	prefix + "vsl_cd", ""));
		setRevYrmon(JSPUtil.getParameter(request,	prefix + "rev_yrmon", ""));
		setExeYrmon(JSPUtil.getParameter(request,	prefix + "exe_yrmon", ""));
		setEstmVvdHdrId(JSPUtil.getParameter(request,	prefix + "estm_vvd_hdr_id", ""));
		setCreDt(JSPUtil.getParameter(request,	prefix + "cre_dt", ""));
		setSkdVoyNo(JSPUtil.getParameter(request,	prefix + "skd_voy_no", ""));
		setLineNo(JSPUtil.getParameter(request,	prefix + "line_no", ""));
		setRlaneCd(JSPUtil.getParameter(request,	prefix + "rlane_cd", ""));
		setSkdDirCd(JSPUtil.getParameter(request,	prefix + "skd_dir_cd", ""));
		setPagerows(JSPUtil.getParameter(request,	prefix + "pagerows", ""));
		setEstmVvdTpCd(JSPUtil.getParameter(request,	prefix + "estm_vvd_tp_cd", ""));
		setVstDt(JSPUtil.getParameter(request,	prefix + "vst_dt", ""));
		setRevDirCd(JSPUtil.getParameter(request,	prefix + "rev_dir_cd", ""));
		setIbflag(JSPUtil.getParameter(request,	prefix + "ibflag", ""));
		setEstmBcDivCd(JSPUtil.getParameter(request,	prefix + "estm_bc_div_cd", ""));
		setVedDt(JSPUtil.getParameter(request,	prefix + "ved_dt", ""));
		setEstmIocDivCd(JSPUtil.getParameter(request,	prefix + "estm_ioc_div_cd", ""));
		setVslDirCd(JSPUtil.getParameter(request,	prefix + "vsl_dir_cd", ""));
		setLane(JSPUtil.getParameter(request,	prefix + "lane", ""));
		setStatus(JSPUtil.getParameter(request,	prefix + "status", ""));
		setCommAmt(JSPUtil.getParameter(request,	prefix + "comm_amt", ""));
		setAcclCommAmt(JSPUtil.getParameter(request,	prefix + "accl_comm_amt", ""));
		setActCommAmt(JSPUtil.getParameter(request,	prefix + "act_comm_amt", ""));
		setEstmCommAmt(JSPUtil.getParameter(request,	prefix + "estm_comm_amt", ""));
		setCreUsrId(JSPUtil.getParameter(request,	prefix + "cre_usr_id", ""));
		setUpdDt(JSPUtil.getParameter(request,	prefix + "upd_dt", ""));
		setUpdUsrId(JSPUtil.getParameter(request,	prefix + "upd_usr_id", ""));
		setPoResult(JSPUtil.getParameter(request,	prefix + "po_result", ""));
		setPoErrMsg(JSPUtil.getParameter(request,	prefix + "po_err_msg", ""));
		setVvd(JSPUtil.getParameter(request,	prefix + "vvd", ""));
		setIfFlg(JSPUtil.getParameter(request,	prefix + "if_flg", ""));
	}
	
	/**
	 * Request ���곗씠�곕� VO 諛곗뿴濡�蹂�솚�섏뿬 諛섑솚.
	 * @param request
	 * @return GlEstmRevVvdVO[]
	 */
	public GlEstmRevVvdVO[]	fromRequestGrid(HttpServletRequest request)	{
		return fromRequestGrid(request,	"");
	}

	/**
	 * Request �섏뼱���щ윭 嫄�DATA瑜�VO Class ���대뒗��
	 * @param request
	 * @param prefix
	 * @return GlEstmRevVvdVO[]
	 */
	public GlEstmRevVvdVO[]	fromRequestGrid(HttpServletRequest request,	String prefix) {
		GlEstmRevVvdVO model = null;

		String[] tmp = request.getParameterValues(prefix + "ibflag");
		if (tmp	== null)
			return null;

		int	length = request.getParameterValues(prefix + "ibflag").length;

		try	{
				String[] vslCd =	(JSPUtil.getParameter(request, prefix +	"vsl_cd".trim(),	length));
				String[] revYrmon =	(JSPUtil.getParameter(request, prefix +	"rev_yrmon".trim(),	length));
				String[] exeYrmon =	(JSPUtil.getParameter(request, prefix +	"exe_yrmon".trim(),	length));
				String[] estmVvdHdrId =	(JSPUtil.getParameter(request, prefix +	"estm_vvd_hdr_id".trim(),	length));
				String[] creDt =	(JSPUtil.getParameter(request, prefix +	"cre_dt".trim(),	length));
				String[] skdVoyNo =	(JSPUtil.getParameter(request, prefix +	"skd_voy_no".trim(),	length));
				String[] lineNo =	(JSPUtil.getParameter(request, prefix +	"line_no".trim(),	length));
				String[] rlaneCd =	(JSPUtil.getParameter(request, prefix +	"rlane_cd".trim(),	length));
				String[] skdDirCd =	(JSPUtil.getParameter(request, prefix +	"skd_dir_cd".trim(),	length));
				String[] pagerows =	(JSPUtil.getParameter(request, prefix +	"pagerows".trim(),	length));
				String[] estmVvdTpCd =	(JSPUtil.getParameter(request, prefix +	"estm_vvd_tp_cd".trim(),	length));
				String[] vstDt =	(JSPUtil.getParameter(request, prefix +	"vst_dt".trim(),	length));
				String[] revDirCd =	(JSPUtil.getParameter(request, prefix +	"rev_dir_cd".trim(),	length));
				String[] ibflag =	(JSPUtil.getParameter(request, prefix +	"ibflag".trim(),	length));
				String[] estmBcDivCd =	(JSPUtil.getParameter(request, prefix +	"estm_bc_div_cd".trim(),	length));
				String[] vedDt =	(JSPUtil.getParameter(request, prefix +	"ved_dt".trim(),	length));
				String[] estmIocDivCd =	(JSPUtil.getParameter(request, prefix +	"estm_ioc_div_cd".trim(),	length));
				String[] vslDirCd =	(JSPUtil.getParameter(request, prefix +	"vsl_dir_cd".trim(),	length));
				String[] lane =	(JSPUtil.getParameter(request, prefix +	"lane".trim(),	length));
				String[] status =	(JSPUtil.getParameter(request, prefix +	"status".trim(),	length));
				String[] commAmt =	(JSPUtil.getParameter(request, prefix +	"comm_amt".trim(),	length));
				String[] acclCommAmt =	(JSPUtil.getParameter(request, prefix +	"accl_comm_amt".trim(),	length));
				String[] actCommAmt =	(JSPUtil.getParameter(request, prefix +	"act_comm_amt".trim(),	length));
				String[] estmCommAmt =	(JSPUtil.getParameter(request, prefix +	"estm_comm_amt".trim(),	length));
				String[] creUsrId =	(JSPUtil.getParameter(request, prefix +	"cre_usr_id".trim(),	length));
				String[] updDt =	(JSPUtil.getParameter(request, prefix +	"upd_dt".trim(),	length));
				String[] updUsrId =	(JSPUtil.getParameter(request, prefix +	"upd_usr_id".trim(),	length));
				String[] poResult =	(JSPUtil.getParameter(request, prefix +	"po_result".trim(),	length));
				String[] poErrMsg =	(JSPUtil.getParameter(request, prefix +	"po_err_msg".trim(),	length));
				String[] vvd =	(JSPUtil.getParameter(request, prefix +	"vvd".trim(),	length));
				String[] ifFlg =	(JSPUtil.getParameter(request, prefix +	"if_flg".trim(),	length));
				for	(int i = 0;	i <	length;	i++) {
					model =	new	GlEstmRevVvdVO();
						if ( vslCd[i] !=	null)
						model.setVslCd( vslCd[i]);
						if ( revYrmon[i] !=	null)
						model.setRevYrmon( revYrmon[i]);
						if ( exeYrmon[i] !=	null)
						model.setExeYrmon( exeYrmon[i]);
						if ( estmVvdHdrId[i] !=	null)
						model.setEstmVvdHdrId( estmVvdHdrId[i]);
						if ( creDt[i] !=	null)
						model.setCreDt( creDt[i]);
						if ( skdVoyNo[i] !=	null)
						model.setSkdVoyNo( skdVoyNo[i]);
						if ( lineNo[i] !=	null)
						model.setLineNo( lineNo[i]);
						if ( rlaneCd[i] !=	null)
						model.setRlaneCd( rlaneCd[i]);
						if ( skdDirCd[i] !=	null)
						model.setSkdDirCd( skdDirCd[i]);
						if ( pagerows[i] !=	null)
						model.setPagerows( pagerows[i]);
						if ( estmVvdTpCd[i] !=	null)
						model.setEstmVvdTpCd( estmVvdTpCd[i]);
						if ( vstDt[i] !=	null)
						model.setVstDt( vstDt[i]);
						if ( revDirCd[i] !=	null)
						model.setRevDirCd( revDirCd[i]);
						if ( ibflag[i] !=	null)
						model.setIbflag( ibflag[i]);
						if ( estmBcDivCd[i] !=	null)
						model.setEstmBcDivCd( estmBcDivCd[i]);
						if ( vedDt[i] !=	null)
						model.setVedDt( vedDt[i]);
						if ( estmIocDivCd[i] !=	null)
						model.setEstmIocDivCd( estmIocDivCd[i]);
						if ( vslDirCd[i] !=	null)
						model.setVslDirCd( vslDirCd[i]);
						if ( lane[i] !=	null)
						model.setLane( lane[i]);
						if ( status[i] !=	null)
						model.setStatus( status[i]);
						if ( commAmt[i] !=	null)
						model.setCommAmt( commAmt[i]);
						if ( acclCommAmt[i] !=	null)
						model.setAcclCommAmt( acclCommAmt[i]);
						if ( actCommAmt[i] !=	null)
						model.setActCommAmt( actCommAmt[i]);
						if ( estmCommAmt[i] !=	null)
						model.setEstmCommAmt( estmCommAmt[i]);
						if ( creUsrId[i] !=	null)
						model.setCreUsrId( creUsrId[i]);
						if ( updDt[i] !=	null)
						model.setUpdDt( updDt[i]);
						if ( updUsrId[i] !=	null)
						model.setUpdUsrId( updUsrId[i]);
						if ( poResult[i] !=	null)
						model.setPoResult( poResult[i]);
						if ( poErrMsg[i] !=	null)
						model.setPoErrMsg( poErrMsg[i]);
						if ( vvd[i] !=	null)
						model.setVvd( vvd[i]);
						if ( ifFlg[i] !=	null)
						model.setIfFlg( ifFlg[i]);
					 models.add(model);
				}

		} catch	(Exception e) {
			return null;
		}
		return getGlEstmRevVvdVOs();
	}

	/**
	 *  VO 諛곗뿴��諛섑솚
	 * @return GlEstmRevVvdVO[]
	 */
	public GlEstmRevVvdVO[]	 getGlEstmRevVvdVOs(){
		GlEstmRevVvdVO[] vos = (GlEstmRevVvdVO[])models.toArray(new	GlEstmRevVvdVO[models.size()]);
		return vos;
		}

	/**
	 * VO Class���댁슜��String�쇰줈 蹂�솚
	 */
	public String  toString() {
		   return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE );
	}
	

	/**
	* �щ㎎�낅맂 臾몄옄�댁뿉���뱀닔臾몄옄 �쒓굅("-","/",",",":")
	*/
	public void	unDataFormat(){
		this.vslCd =	this.vslCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.revYrmon =	this.revYrmon.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.exeYrmon =	this.exeYrmon.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.estmVvdHdrId =	this.estmVvdHdrId.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt =	this.creDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdVoyNo =	this.skdVoyNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lineNo =	this.lineNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rlaneCd =	this.rlaneCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdDirCd =	this.skdDirCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows =	this.pagerows.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.estmVvdTpCd =	this.estmVvdTpCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vstDt =	this.vstDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.revDirCd =	this.revDirCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag =	this.ibflag.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.estmBcDivCd =	this.estmBcDivCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vedDt =	this.vedDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.estmIocDivCd =	this.estmIocDivCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslDirCd =	this.vslDirCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lane =	this.lane.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.status =	this.status.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.commAmt =	this.commAmt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.acclCommAmt =	this.acclCommAmt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actCommAmt =	this.actCommAmt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.estmCommAmt =	this.estmCommAmt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId =	this.creUsrId.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt =	this.updDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId =	this.updUsrId.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.poResult =	this.poResult.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.poErrMsg =	this.poErrMsg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vvd =	this.vvd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ifFlg =	this.ifFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}	
}