/*=========================================================
 *Copyright(c) 2014 CyberLogitec
 *@FileName : SceEdi324SndRsltVO.java
 *@FileTitle : SceEdi324SndRsltVO
 *Open Issues :
 *Change history :
 *@LastModifyDate : 2015.02.09
 *@LastModifier : 
 *@LastVersion : 1.0
 * 2015.02.09  
 * 1.0 Creation
=========================================================*/

package	 com.clt.syscommon.common.table;

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
public class SceEdi324SndRsltVO	extends	 AbstractValueObject
{

	private	 static final long serialVersionUID = 1L;

	private	 Collection<SceEdi324SndRsltVO>  models =	new	ArrayList<SceEdi324SndRsltVO>();


	/*	Column Info	*/
	private  String	 vslCd   =  null;
	/*	Column Info	*/
	private  String	 lloydVslNo   =  null;
	/*	Column Info	*/
	private  String	 creDt   =  null;
	/*	Column Info	*/
	private  String	 copNo   =  null;
	/*	Column Info	*/
	private  String	 destYdCd   =  null;
	/*	Column Info	*/
	private  String	 cntrHgt   =  null;
	/*	Column Info	*/
	private  String	 blNo   =  null;
	/*	Column Info	*/
	private  String	 pagerows   =  null;
	/*	Column Info	*/
	private  String	 orgLocNm   =  null;
	/*	Column Info	*/
	private  String	 ibflag   =  null;
	/*	Column Info	*/
	private  String	 cntrTpszCd   =  null;
	/*	Column Info	*/
	private  String	 cntrWgtUtCd   =  null;
	/*	Column Info	*/
	private  String	 orgYdLocCtyNm   =  null;
	/*	Column Info	*/
	private  String	 ediSndRmk   =  null;
	/*	Column Info	*/
	private  String	 podYdCd   =  null;
	/*	Column Info	*/
	private  String	 cntrLen   =  null;
	/*	Column Info	*/
	private  String	 updUsrId   =  null;
	/*	Column Info	*/
	private  String	 destYdLocSteCd   =  null;
	/*	Column Info	*/
	private  String	 updDt   =  null;
	/*	Column Info	*/
	private  String	 actCd   =  null;
	/*	Column Info	*/
	private  String	 podEstmArrGdt   =  null;
	/*	Column Info	*/
	private  String	 cntrWgt   =  null;
	/*	Column Info	*/
	private  String	 podNm   =  null;
	/*	Column Info	*/
	private  String	 ediSndId   =  null;
	/*	Column Info	*/
	private  String	 skdVoyNo   =  null;
	/*	Column Info	*/
	private  String	 vslNm   =  null;
	/*	Column Info	*/
	private  String	 orgYdCd   =  null;
	/*	Column Info	*/
	private  String	 cntrLbsWgt   =  null;
	/*	Column Info	*/
	private  String	 skdDirCd   =  null;
	/*	Column Info	*/
	private  String	 creUsrId   =  null;
	/*	Column Info	*/
	private  String	 dgFlg   =  null;
	/*	Column Info	*/
	private  String	 bkgNo   =  null;
	/*	Column Info	*/
	private  String	 ediSndSeq   =  null;
	/*	Column Info	*/
	private  String	 cntrNo   =  null;
	/*	Column Info	*/
	private  String	 vndrSeq   =  null;
	/*	Column Info	*/
	private  String	 polYdCd   =  null;
	/*	Column Info	*/
	private  String	 polDepActDt   =  null;
	/*	Column Info	*/
	private  String	 destLocNm   =  null;
	/*	Column Info	*/
	private  String	 orgYdLocSteCd   =  null;
	/*	Column Info	*/
	private  String	 destYdLocCtyNm   =  null;
	/*	Column Info	*/
	private  String	 cntrSealNo   =  null;
	/*	Column Info	*/
	private  String	 podEstmArrDt   =  null;
	/*	Column Info	*/
	private  String	 ediSndTpCd   =  null;
	/*	Column Info	*/
	private  String	 ediSndDt   =  null;
	/*	Column Info	*/
	private  String	 mnlFlg   =  null;
	/*	Column Info	*/
	private  String	 destYdNm   =  null;

	/* hashColumnInpo */
	private	 HashMap<String , String>	hashColumns	= new LinkedHashMap<String, String>();

	/* hashFildInpo	*/
	private	 HashMap<String , String>	hashFields = new LinkedHashMap<String, String>();
 
 
	/**	Constructor	*/
	public SceEdi324SndRsltVO(){}

	public SceEdi324SndRsltVO(String vslCd,String lloydVslNo,String creDt,String copNo,String destYdCd,String cntrHgt,String blNo,String pagerows,String orgLocNm,String ibflag,String cntrTpszCd,String cntrWgtUtCd,String orgYdLocCtyNm,String ediSndRmk,String podYdCd,String cntrLen,String updUsrId,String destYdLocSteCd,String updDt,String actCd,String podEstmArrGdt,String cntrWgt,String podNm,String ediSndId,String skdVoyNo,String vslNm,String orgYdCd,String cntrLbsWgt,String skdDirCd,String creUsrId,String dgFlg,String bkgNo,String ediSndSeq,String cntrNo,String vndrSeq,String polYdCd,String polDepActDt,String destLocNm,String orgYdLocSteCd,String destYdLocCtyNm,String cntrSealNo,String podEstmArrDt,String ediSndTpCd,String ediSndDt,String mnlFlg,String destYdNm)	{
		this.vslCd  = vslCd ;
		this.lloydVslNo  = lloydVslNo ;
		this.creDt  = creDt ;
		this.copNo  = copNo ;
		this.destYdCd  = destYdCd ;
		this.cntrHgt  = cntrHgt ;
		this.blNo  = blNo ;
		this.pagerows  = pagerows ;
		this.orgLocNm  = orgLocNm ;
		this.ibflag  = ibflag ;
		this.cntrTpszCd  = cntrTpszCd ;
		this.cntrWgtUtCd  = cntrWgtUtCd ;
		this.orgYdLocCtyNm  = orgYdLocCtyNm ;
		this.ediSndRmk  = ediSndRmk ;
		this.podYdCd  = podYdCd ;
		this.cntrLen  = cntrLen ;
		this.updUsrId  = updUsrId ;
		this.destYdLocSteCd  = destYdLocSteCd ;
		this.updDt  = updDt ;
		this.actCd  = actCd ;
		this.podEstmArrGdt  = podEstmArrGdt ;
		this.cntrWgt  = cntrWgt ;
		this.podNm  = podNm ;
		this.ediSndId  = ediSndId ;
		this.skdVoyNo  = skdVoyNo ;
		this.vslNm  = vslNm ;
		this.orgYdCd  = orgYdCd ;
		this.cntrLbsWgt  = cntrLbsWgt ;
		this.skdDirCd  = skdDirCd ;
		this.creUsrId  = creUsrId ;
		this.dgFlg  = dgFlg ;
		this.bkgNo  = bkgNo ;
		this.ediSndSeq  = ediSndSeq ;
		this.cntrNo  = cntrNo ;
		this.vndrSeq  = vndrSeq ;
		this.polYdCd  = polYdCd ;
		this.polDepActDt  = polDepActDt ;
		this.destLocNm  = destLocNm ;
		this.orgYdLocSteCd  = orgYdLocSteCd ;
		this.destYdLocCtyNm  = destYdLocCtyNm ;
		this.cntrSealNo  = cntrSealNo ;
		this.podEstmArrDt  = podEstmArrDt ;
		this.ediSndTpCd  = ediSndTpCd ;
		this.ediSndDt  = ediSndDt ;
		this.mnlFlg  = mnlFlg ;
		this.destYdNm  = destYdNm ;
	}


	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value">	로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("vsl_cd", getVslCd());		
		this.hashColumns.put("lloyd_vsl_no", getLloydVslNo());		
		this.hashColumns.put("cre_dt", getCreDt());		
		this.hashColumns.put("cop_no", getCopNo());		
		this.hashColumns.put("dest_yd_cd", getDestYdCd());		
		this.hashColumns.put("cntr_hgt", getCntrHgt());		
		this.hashColumns.put("bl_no", getBlNo());		
		this.hashColumns.put("pagerows", getPagerows());		
		this.hashColumns.put("org_loc_nm", getOrgLocNm());		
		this.hashColumns.put("ibflag", getIbflag());		
		this.hashColumns.put("cntr_tpsz_cd", getCntrTpszCd());		
		this.hashColumns.put("cntr_wgt_ut_cd", getCntrWgtUtCd());		
		this.hashColumns.put("org_yd_loc_cty_nm", getOrgYdLocCtyNm());		
		this.hashColumns.put("edi_snd_rmk", getEdiSndRmk());		
		this.hashColumns.put("pod_yd_cd", getPodYdCd());		
		this.hashColumns.put("cntr_len", getCntrLen());		
		this.hashColumns.put("upd_usr_id", getUpdUsrId());		
		this.hashColumns.put("dest_yd_loc_ste_cd", getDestYdLocSteCd());		
		this.hashColumns.put("upd_dt", getUpdDt());		
		this.hashColumns.put("act_cd", getActCd());		
		this.hashColumns.put("pod_estm_arr_gdt", getPodEstmArrGdt());		
		this.hashColumns.put("cntr_wgt", getCntrWgt());		
		this.hashColumns.put("pod_nm", getPodNm());		
		this.hashColumns.put("edi_snd_id", getEdiSndId());		
		this.hashColumns.put("skd_voy_no", getSkdVoyNo());		
		this.hashColumns.put("vsl_nm", getVslNm());		
		this.hashColumns.put("org_yd_cd", getOrgYdCd());		
		this.hashColumns.put("cntr_lbs_wgt", getCntrLbsWgt());		
		this.hashColumns.put("skd_dir_cd", getSkdDirCd());		
		this.hashColumns.put("cre_usr_id", getCreUsrId());		
		this.hashColumns.put("dg_flg", getDgFlg());		
		this.hashColumns.put("bkg_no", getBkgNo());		
		this.hashColumns.put("edi_snd_seq", getEdiSndSeq());		
		this.hashColumns.put("cntr_no", getCntrNo());		
		this.hashColumns.put("vndr_seq", getVndrSeq());		
		this.hashColumns.put("pol_yd_cd", getPolYdCd());		
		this.hashColumns.put("pol_dep_act_dt", getPolDepActDt());		
		this.hashColumns.put("dest_loc_nm", getDestLocNm());		
		this.hashColumns.put("org_yd_loc_ste_cd", getOrgYdLocSteCd());		
		this.hashColumns.put("dest_yd_loc_cty_nm", getDestYdLocCtyNm());		
		this.hashColumns.put("cntr_seal_no", getCntrSealNo());		
		this.hashColumns.put("pod_estm_arr_dt", getPodEstmArrDt());		
		this.hashColumns.put("edi_snd_tp_cd", getEdiSndTpCd());		
		this.hashColumns.put("edi_snd_dt", getEdiSndDt());		
		this.hashColumns.put("mnl_flg", getMnlFlg());		
		this.hashColumns.put("dest_yd_nm", getDestYdNm());		
		return this.hashColumns;
}

	/**
	 * 컬럼명에	대응되는 멤버변수명을	저장하여 Hashtable<"column_name", "variable"> 로 반환
	 * @return
	 */
	public  HashMap<String, String>  getFieldNames(){
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("lloyd_vsl_no", "lloydVslNo");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("cop_no", "copNo");
		this.hashFields.put("dest_yd_cd", "destYdCd");
		this.hashFields.put("cntr_hgt", "cntrHgt");
		this.hashFields.put("bl_no", "blNo");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("org_loc_nm", "orgLocNm");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cntr_tpsz_cd", "cntrTpszCd");
		this.hashFields.put("cntr_wgt_ut_cd", "cntrWgtUtCd");
		this.hashFields.put("org_yd_loc_cty_nm", "orgYdLocCtyNm");
		this.hashFields.put("edi_snd_rmk", "ediSndRmk");
		this.hashFields.put("pod_yd_cd", "podYdCd");
		this.hashFields.put("cntr_len", "cntrLen");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("dest_yd_loc_ste_cd", "destYdLocSteCd");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("act_cd", "actCd");
		this.hashFields.put("pod_estm_arr_gdt", "podEstmArrGdt");
		this.hashFields.put("cntr_wgt", "cntrWgt");
		this.hashFields.put("pod_nm", "podNm");
		this.hashFields.put("edi_snd_id", "ediSndId");
		this.hashFields.put("skd_voy_no", "skdVoyNo");
		this.hashFields.put("vsl_nm", "vslNm");
		this.hashFields.put("org_yd_cd", "orgYdCd");
		this.hashFields.put("cntr_lbs_wgt", "cntrLbsWgt");
		this.hashFields.put("skd_dir_cd", "skdDirCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("dg_flg", "dgFlg");
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("edi_snd_seq", "ediSndSeq");
		this.hashFields.put("cntr_no", "cntrNo");
		this.hashFields.put("vndr_seq", "vndrSeq");
		this.hashFields.put("pol_yd_cd", "polYdCd");
		this.hashFields.put("pol_dep_act_dt", "polDepActDt");
		this.hashFields.put("dest_loc_nm", "destLocNm");
		this.hashFields.put("org_yd_loc_ste_cd", "orgYdLocSteCd");
		this.hashFields.put("dest_yd_loc_cty_nm", "destYdLocCtyNm");
		this.hashFields.put("cntr_seal_no", "cntrSealNo");
		this.hashFields.put("pod_estm_arr_dt", "podEstmArrDt");
		this.hashFields.put("edi_snd_tp_cd", "ediSndTpCd");
		this.hashFields.put("edi_snd_dt", "ediSndDt");
		this.hashFields.put("mnl_flg", "mnlFlg");
		this.hashFields.put("dest_yd_nm", "destYdNm");
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
	* @param  lloydVslNo
	*/
	public void	setLloydVslNo( String	lloydVslNo ) {
		this.lloydVslNo =	lloydVslNo;
	}
 
	/**
	 * Column Info
	 * @return	lloydVslNo
	 */
	 public	 String	getLloydVslNo() {
		 return	this.lloydVslNo;
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
	* @param  copNo
	*/
	public void	setCopNo( String	copNo ) {
		this.copNo =	copNo;
	}
 
	/**
	 * Column Info
	 * @return	copNo
	 */
	 public	 String	getCopNo() {
		 return	this.copNo;
	 } 
 	/**
	* Column Info
	* @param  destYdCd
	*/
	public void	setDestYdCd( String	destYdCd ) {
		this.destYdCd =	destYdCd;
	}
 
	/**
	 * Column Info
	 * @return	destYdCd
	 */
	 public	 String	getDestYdCd() {
		 return	this.destYdCd;
	 } 
 	/**
	* Column Info
	* @param  cntrHgt
	*/
	public void	setCntrHgt( String	cntrHgt ) {
		this.cntrHgt =	cntrHgt;
	}
 
	/**
	 * Column Info
	 * @return	cntrHgt
	 */
	 public	 String	getCntrHgt() {
		 return	this.cntrHgt;
	 } 
 	/**
	* Column Info
	* @param  blNo
	*/
	public void	setBlNo( String	blNo ) {
		this.blNo =	blNo;
	}
 
	/**
	 * Column Info
	 * @return	blNo
	 */
	 public	 String	getBlNo() {
		 return	this.blNo;
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
	* @param  orgLocNm
	*/
	public void	setOrgLocNm( String	orgLocNm ) {
		this.orgLocNm =	orgLocNm;
	}
 
	/**
	 * Column Info
	 * @return	orgLocNm
	 */
	 public	 String	getOrgLocNm() {
		 return	this.orgLocNm;
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
	* @param  cntrTpszCd
	*/
	public void	setCntrTpszCd( String	cntrTpszCd ) {
		this.cntrTpszCd =	cntrTpszCd;
	}
 
	/**
	 * Column Info
	 * @return	cntrTpszCd
	 */
	 public	 String	getCntrTpszCd() {
		 return	this.cntrTpszCd;
	 } 
 	/**
	* Column Info
	* @param  cntrWgtUtCd
	*/
	public void	setCntrWgtUtCd( String	cntrWgtUtCd ) {
		this.cntrWgtUtCd =	cntrWgtUtCd;
	}
 
	/**
	 * Column Info
	 * @return	cntrWgtUtCd
	 */
	 public	 String	getCntrWgtUtCd() {
		 return	this.cntrWgtUtCd;
	 } 
 	/**
	* Column Info
	* @param  orgYdLocCtyNm
	*/
	public void	setOrgYdLocCtyNm( String	orgYdLocCtyNm ) {
		this.orgYdLocCtyNm =	orgYdLocCtyNm;
	}
 
	/**
	 * Column Info
	 * @return	orgYdLocCtyNm
	 */
	 public	 String	getOrgYdLocCtyNm() {
		 return	this.orgYdLocCtyNm;
	 } 
 	/**
	* Column Info
	* @param  ediSndRmk
	*/
	public void	setEdiSndRmk( String	ediSndRmk ) {
		this.ediSndRmk =	ediSndRmk;
	}
 
	/**
	 * Column Info
	 * @return	ediSndRmk
	 */
	 public	 String	getEdiSndRmk() {
		 return	this.ediSndRmk;
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
	* @param  cntrLen
	*/
	public void	setCntrLen( String	cntrLen ) {
		this.cntrLen =	cntrLen;
	}
 
	/**
	 * Column Info
	 * @return	cntrLen
	 */
	 public	 String	getCntrLen() {
		 return	this.cntrLen;
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
	* @param  destYdLocSteCd
	*/
	public void	setDestYdLocSteCd( String	destYdLocSteCd ) {
		this.destYdLocSteCd =	destYdLocSteCd;
	}
 
	/**
	 * Column Info
	 * @return	destYdLocSteCd
	 */
	 public	 String	getDestYdLocSteCd() {
		 return	this.destYdLocSteCd;
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
	* @param  actCd
	*/
	public void	setActCd( String	actCd ) {
		this.actCd =	actCd;
	}
 
	/**
	 * Column Info
	 * @return	actCd
	 */
	 public	 String	getActCd() {
		 return	this.actCd;
	 } 
 	/**
	* Column Info
	* @param  podEstmArrGdt
	*/
	public void	setPodEstmArrGdt( String	podEstmArrGdt ) {
		this.podEstmArrGdt =	podEstmArrGdt;
	}
 
	/**
	 * Column Info
	 * @return	podEstmArrGdt
	 */
	 public	 String	getPodEstmArrGdt() {
		 return	this.podEstmArrGdt;
	 } 
 	/**
	* Column Info
	* @param  cntrWgt
	*/
	public void	setCntrWgt( String	cntrWgt ) {
		this.cntrWgt =	cntrWgt;
	}
 
	/**
	 * Column Info
	 * @return	cntrWgt
	 */
	 public	 String	getCntrWgt() {
		 return	this.cntrWgt;
	 } 
 	/**
	* Column Info
	* @param  podNm
	*/
	public void	setPodNm( String	podNm ) {
		this.podNm =	podNm;
	}
 
	/**
	 * Column Info
	 * @return	podNm
	 */
	 public	 String	getPodNm() {
		 return	this.podNm;
	 } 
 	/**
	* Column Info
	* @param  ediSndId
	*/
	public void	setEdiSndId( String	ediSndId ) {
		this.ediSndId =	ediSndId;
	}
 
	/**
	 * Column Info
	 * @return	ediSndId
	 */
	 public	 String	getEdiSndId() {
		 return	this.ediSndId;
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
	* @param  vslNm
	*/
	public void	setVslNm( String	vslNm ) {
		this.vslNm =	vslNm;
	}
 
	/**
	 * Column Info
	 * @return	vslNm
	 */
	 public	 String	getVslNm() {
		 return	this.vslNm;
	 } 
 	/**
	* Column Info
	* @param  orgYdCd
	*/
	public void	setOrgYdCd( String	orgYdCd ) {
		this.orgYdCd =	orgYdCd;
	}
 
	/**
	 * Column Info
	 * @return	orgYdCd
	 */
	 public	 String	getOrgYdCd() {
		 return	this.orgYdCd;
	 } 
 	/**
	* Column Info
	* @param  cntrLbsWgt
	*/
	public void	setCntrLbsWgt( String	cntrLbsWgt ) {
		this.cntrLbsWgt =	cntrLbsWgt;
	}
 
	/**
	 * Column Info
	 * @return	cntrLbsWgt
	 */
	 public	 String	getCntrLbsWgt() {
		 return	this.cntrLbsWgt;
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
	* @param  dgFlg
	*/
	public void	setDgFlg( String	dgFlg ) {
		this.dgFlg =	dgFlg;
	}
 
	/**
	 * Column Info
	 * @return	dgFlg
	 */
	 public	 String	getDgFlg() {
		 return	this.dgFlg;
	 } 
 	/**
	* Column Info
	* @param  bkgNo
	*/
	public void	setBkgNo( String	bkgNo ) {
		this.bkgNo =	bkgNo;
	}
 
	/**
	 * Column Info
	 * @return	bkgNo
	 */
	 public	 String	getBkgNo() {
		 return	this.bkgNo;
	 } 
 	/**
	* Column Info
	* @param  ediSndSeq
	*/
	public void	setEdiSndSeq( String	ediSndSeq ) {
		this.ediSndSeq =	ediSndSeq;
	}
 
	/**
	 * Column Info
	 * @return	ediSndSeq
	 */
	 public	 String	getEdiSndSeq() {
		 return	this.ediSndSeq;
	 } 
 	/**
	* Column Info
	* @param  cntrNo
	*/
	public void	setCntrNo( String	cntrNo ) {
		this.cntrNo =	cntrNo;
	}
 
	/**
	 * Column Info
	 * @return	cntrNo
	 */
	 public	 String	getCntrNo() {
		 return	this.cntrNo;
	 } 
 	/**
	* Column Info
	* @param  vndrSeq
	*/
	public void	setVndrSeq( String	vndrSeq ) {
		this.vndrSeq =	vndrSeq;
	}
 
	/**
	 * Column Info
	 * @return	vndrSeq
	 */
	 public	 String	getVndrSeq() {
		 return	this.vndrSeq;
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
	* @param  polDepActDt
	*/
	public void	setPolDepActDt( String	polDepActDt ) {
		this.polDepActDt =	polDepActDt;
	}
 
	/**
	 * Column Info
	 * @return	polDepActDt
	 */
	 public	 String	getPolDepActDt() {
		 return	this.polDepActDt;
	 } 
 	/**
	* Column Info
	* @param  destLocNm
	*/
	public void	setDestLocNm( String	destLocNm ) {
		this.destLocNm =	destLocNm;
	}
 
	/**
	 * Column Info
	 * @return	destLocNm
	 */
	 public	 String	getDestLocNm() {
		 return	this.destLocNm;
	 } 
 	/**
	* Column Info
	* @param  orgYdLocSteCd
	*/
	public void	setOrgYdLocSteCd( String	orgYdLocSteCd ) {
		this.orgYdLocSteCd =	orgYdLocSteCd;
	}
 
	/**
	 * Column Info
	 * @return	orgYdLocSteCd
	 */
	 public	 String	getOrgYdLocSteCd() {
		 return	this.orgYdLocSteCd;
	 } 
 	/**
	* Column Info
	* @param  destYdLocCtyNm
	*/
	public void	setDestYdLocCtyNm( String	destYdLocCtyNm ) {
		this.destYdLocCtyNm =	destYdLocCtyNm;
	}
 
	/**
	 * Column Info
	 * @return	destYdLocCtyNm
	 */
	 public	 String	getDestYdLocCtyNm() {
		 return	this.destYdLocCtyNm;
	 } 
 	/**
	* Column Info
	* @param  cntrSealNo
	*/
	public void	setCntrSealNo( String	cntrSealNo ) {
		this.cntrSealNo =	cntrSealNo;
	}
 
	/**
	 * Column Info
	 * @return	cntrSealNo
	 */
	 public	 String	getCntrSealNo() {
		 return	this.cntrSealNo;
	 } 
 	/**
	* Column Info
	* @param  podEstmArrDt
	*/
	public void	setPodEstmArrDt( String	podEstmArrDt ) {
		this.podEstmArrDt =	podEstmArrDt;
	}
 
	/**
	 * Column Info
	 * @return	podEstmArrDt
	 */
	 public	 String	getPodEstmArrDt() {
		 return	this.podEstmArrDt;
	 } 
 	/**
	* Column Info
	* @param  ediSndTpCd
	*/
	public void	setEdiSndTpCd( String	ediSndTpCd ) {
		this.ediSndTpCd =	ediSndTpCd;
	}
 
	/**
	 * Column Info
	 * @return	ediSndTpCd
	 */
	 public	 String	getEdiSndTpCd() {
		 return	this.ediSndTpCd;
	 } 
 	/**
	* Column Info
	* @param  ediSndDt
	*/
	public void	setEdiSndDt( String	ediSndDt ) {
		this.ediSndDt =	ediSndDt;
	}
 
	/**
	 * Column Info
	 * @return	ediSndDt
	 */
	 public	 String	getEdiSndDt() {
		 return	this.ediSndDt;
	 } 
 	/**
	* Column Info
	* @param  mnlFlg
	*/
	public void	setMnlFlg( String	mnlFlg ) {
		this.mnlFlg =	mnlFlg;
	}
 
	/**
	 * Column Info
	 * @return	mnlFlg
	 */
	 public	 String	getMnlFlg() {
		 return	this.mnlFlg;
	 } 
 	/**
	* Column Info
	* @param  destYdNm
	*/
	public void	setDestYdNm( String	destYdNm ) {
		this.destYdNm =	destYdNm;
	}
 
	/**
	 * Column Info
	 * @return	destYdNm
	 */
	 public	 String	getDestYdNm() {
		 return	this.destYdNm;
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
		setLloydVslNo(JSPUtil.getParameter(request,	prefix + "lloyd_vsl_no", ""));
		setCreDt(JSPUtil.getParameter(request,	prefix + "cre_dt", ""));
		setCopNo(JSPUtil.getParameter(request,	prefix + "cop_no", ""));
		setDestYdCd(JSPUtil.getParameter(request,	prefix + "dest_yd_cd", ""));
		setCntrHgt(JSPUtil.getParameter(request,	prefix + "cntr_hgt", ""));
		setBlNo(JSPUtil.getParameter(request,	prefix + "bl_no", ""));
		setPagerows(JSPUtil.getParameter(request,	prefix + "pagerows", ""));
		setOrgLocNm(JSPUtil.getParameter(request,	prefix + "org_loc_nm", ""));
		setIbflag(JSPUtil.getParameter(request,	prefix + "ibflag", ""));
		setCntrTpszCd(JSPUtil.getParameter(request,	prefix + "cntr_tpsz_cd", ""));
		setCntrWgtUtCd(JSPUtil.getParameter(request,	prefix + "cntr_wgt_ut_cd", ""));
		setOrgYdLocCtyNm(JSPUtil.getParameter(request,	prefix + "org_yd_loc_cty_nm", ""));
		setEdiSndRmk(JSPUtil.getParameter(request,	prefix + "edi_snd_rmk", ""));
		setPodYdCd(JSPUtil.getParameter(request,	prefix + "pod_yd_cd", ""));
		setCntrLen(JSPUtil.getParameter(request,	prefix + "cntr_len", ""));
		setUpdUsrId(JSPUtil.getParameter(request,	prefix + "upd_usr_id", ""));
		setDestYdLocSteCd(JSPUtil.getParameter(request,	prefix + "dest_yd_loc_ste_cd", ""));
		setUpdDt(JSPUtil.getParameter(request,	prefix + "upd_dt", ""));
		setActCd(JSPUtil.getParameter(request,	prefix + "act_cd", ""));
		setPodEstmArrGdt(JSPUtil.getParameter(request,	prefix + "pod_estm_arr_gdt", ""));
		setCntrWgt(JSPUtil.getParameter(request,	prefix + "cntr_wgt", ""));
		setPodNm(JSPUtil.getParameter(request,	prefix + "pod_nm", ""));
		setEdiSndId(JSPUtil.getParameter(request,	prefix + "edi_snd_id", ""));
		setSkdVoyNo(JSPUtil.getParameter(request,	prefix + "skd_voy_no", ""));
		setVslNm(JSPUtil.getParameter(request,	prefix + "vsl_nm", ""));
		setOrgYdCd(JSPUtil.getParameter(request,	prefix + "org_yd_cd", ""));
		setCntrLbsWgt(JSPUtil.getParameter(request,	prefix + "cntr_lbs_wgt", ""));
		setSkdDirCd(JSPUtil.getParameter(request,	prefix + "skd_dir_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request,	prefix + "cre_usr_id", ""));
		setDgFlg(JSPUtil.getParameter(request,	prefix + "dg_flg", ""));
		setBkgNo(JSPUtil.getParameter(request,	prefix + "bkg_no", ""));
		setEdiSndSeq(JSPUtil.getParameter(request,	prefix + "edi_snd_seq", ""));
		setCntrNo(JSPUtil.getParameter(request,	prefix + "cntr_no", ""));
		setVndrSeq(JSPUtil.getParameter(request,	prefix + "vndr_seq", ""));
		setPolYdCd(JSPUtil.getParameter(request,	prefix + "pol_yd_cd", ""));
		setPolDepActDt(JSPUtil.getParameter(request,	prefix + "pol_dep_act_dt", ""));
		setDestLocNm(JSPUtil.getParameter(request,	prefix + "dest_loc_nm", ""));
		setOrgYdLocSteCd(JSPUtil.getParameter(request,	prefix + "org_yd_loc_ste_cd", ""));
		setDestYdLocCtyNm(JSPUtil.getParameter(request,	prefix + "dest_yd_loc_cty_nm", ""));
		setCntrSealNo(JSPUtil.getParameter(request,	prefix + "cntr_seal_no", ""));
		setPodEstmArrDt(JSPUtil.getParameter(request,	prefix + "pod_estm_arr_dt", ""));
		setEdiSndTpCd(JSPUtil.getParameter(request,	prefix + "edi_snd_tp_cd", ""));
		setEdiSndDt(JSPUtil.getParameter(request,	prefix + "edi_snd_dt", ""));
		setMnlFlg(JSPUtil.getParameter(request,	prefix + "mnl_flg", ""));
		setDestYdNm(JSPUtil.getParameter(request,	prefix + "dest_yd_nm", ""));
	}
	
	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return SceEdi324SndRsltVO[]
	 */
	public SceEdi324SndRsltVO[]	fromRequestGrid(HttpServletRequest request)	{
		return fromRequestGrid(request,	"");
	}

	/**
	 * Request 넘어온 여러 건	DATA를 VO Class 에 담는다.
	 * @param request
	 * @param prefix
	 * @return SceEdi324SndRsltVO[]
	 */
	public SceEdi324SndRsltVO[]	fromRequestGrid(HttpServletRequest request,	String prefix) {
		SceEdi324SndRsltVO model = null;

		String[] tmp = request.getParameterValues(prefix + "ibflag");
		if (tmp	== null)
			return null;

		int	length = request.getParameterValues(prefix + "ibflag").length;

		try	{
				String[] vslCd =	(JSPUtil.getParameter(request, prefix +	"vsl_cd".trim(),	length));
				String[] lloydVslNo =	(JSPUtil.getParameter(request, prefix +	"lloyd_vsl_no".trim(),	length));
				String[] creDt =	(JSPUtil.getParameter(request, prefix +	"cre_dt".trim(),	length));
				String[] copNo =	(JSPUtil.getParameter(request, prefix +	"cop_no".trim(),	length));
				String[] destYdCd =	(JSPUtil.getParameter(request, prefix +	"dest_yd_cd".trim(),	length));
				String[] cntrHgt =	(JSPUtil.getParameter(request, prefix +	"cntr_hgt".trim(),	length));
				String[] blNo =	(JSPUtil.getParameter(request, prefix +	"bl_no".trim(),	length));
				String[] pagerows =	(JSPUtil.getParameter(request, prefix +	"pagerows".trim(),	length));
				String[] orgLocNm =	(JSPUtil.getParameter(request, prefix +	"org_loc_nm".trim(),	length));
				String[] ibflag =	(JSPUtil.getParameter(request, prefix +	"ibflag".trim(),	length));
				String[] cntrTpszCd =	(JSPUtil.getParameter(request, prefix +	"cntr_tpsz_cd".trim(),	length));
				String[] cntrWgtUtCd =	(JSPUtil.getParameter(request, prefix +	"cntr_wgt_ut_cd".trim(),	length));
				String[] orgYdLocCtyNm =	(JSPUtil.getParameter(request, prefix +	"org_yd_loc_cty_nm".trim(),	length));
				String[] ediSndRmk =	(JSPUtil.getParameter(request, prefix +	"edi_snd_rmk".trim(),	length));
				String[] podYdCd =	(JSPUtil.getParameter(request, prefix +	"pod_yd_cd".trim(),	length));
				String[] cntrLen =	(JSPUtil.getParameter(request, prefix +	"cntr_len".trim(),	length));
				String[] updUsrId =	(JSPUtil.getParameter(request, prefix +	"upd_usr_id".trim(),	length));
				String[] destYdLocSteCd =	(JSPUtil.getParameter(request, prefix +	"dest_yd_loc_ste_cd".trim(),	length));
				String[] updDt =	(JSPUtil.getParameter(request, prefix +	"upd_dt".trim(),	length));
				String[] actCd =	(JSPUtil.getParameter(request, prefix +	"act_cd".trim(),	length));
				String[] podEstmArrGdt =	(JSPUtil.getParameter(request, prefix +	"pod_estm_arr_gdt".trim(),	length));
				String[] cntrWgt =	(JSPUtil.getParameter(request, prefix +	"cntr_wgt".trim(),	length));
				String[] podNm =	(JSPUtil.getParameter(request, prefix +	"pod_nm".trim(),	length));
				String[] ediSndId =	(JSPUtil.getParameter(request, prefix +	"edi_snd_id".trim(),	length));
				String[] skdVoyNo =	(JSPUtil.getParameter(request, prefix +	"skd_voy_no".trim(),	length));
				String[] vslNm =	(JSPUtil.getParameter(request, prefix +	"vsl_nm".trim(),	length));
				String[] orgYdCd =	(JSPUtil.getParameter(request, prefix +	"org_yd_cd".trim(),	length));
				String[] cntrLbsWgt =	(JSPUtil.getParameter(request, prefix +	"cntr_lbs_wgt".trim(),	length));
				String[] skdDirCd =	(JSPUtil.getParameter(request, prefix +	"skd_dir_cd".trim(),	length));
				String[] creUsrId =	(JSPUtil.getParameter(request, prefix +	"cre_usr_id".trim(),	length));
				String[] dgFlg =	(JSPUtil.getParameter(request, prefix +	"dg_flg".trim(),	length));
				String[] bkgNo =	(JSPUtil.getParameter(request, prefix +	"bkg_no".trim(),	length));
				String[] ediSndSeq =	(JSPUtil.getParameter(request, prefix +	"edi_snd_seq".trim(),	length));
				String[] cntrNo =	(JSPUtil.getParameter(request, prefix +	"cntr_no".trim(),	length));
				String[] vndrSeq =	(JSPUtil.getParameter(request, prefix +	"vndr_seq".trim(),	length));
				String[] polYdCd =	(JSPUtil.getParameter(request, prefix +	"pol_yd_cd".trim(),	length));
				String[] polDepActDt =	(JSPUtil.getParameter(request, prefix +	"pol_dep_act_dt".trim(),	length));
				String[] destLocNm =	(JSPUtil.getParameter(request, prefix +	"dest_loc_nm".trim(),	length));
				String[] orgYdLocSteCd =	(JSPUtil.getParameter(request, prefix +	"org_yd_loc_ste_cd".trim(),	length));
				String[] destYdLocCtyNm =	(JSPUtil.getParameter(request, prefix +	"dest_yd_loc_cty_nm".trim(),	length));
				String[] cntrSealNo =	(JSPUtil.getParameter(request, prefix +	"cntr_seal_no".trim(),	length));
				String[] podEstmArrDt =	(JSPUtil.getParameter(request, prefix +	"pod_estm_arr_dt".trim(),	length));
				String[] ediSndTpCd =	(JSPUtil.getParameter(request, prefix +	"edi_snd_tp_cd".trim(),	length));
				String[] ediSndDt =	(JSPUtil.getParameter(request, prefix +	"edi_snd_dt".trim(),	length));
				String[] mnlFlg =	(JSPUtil.getParameter(request, prefix +	"mnl_flg".trim(),	length));
				String[] destYdNm =	(JSPUtil.getParameter(request, prefix +	"dest_yd_nm".trim(),	length));
				for	(int i = 0;	i <	length;	i++) {
					model =	new	SceEdi324SndRsltVO();
						if ( vslCd[i] !=	null)
						model.setVslCd( vslCd[i]);
						if ( lloydVslNo[i] !=	null)
						model.setLloydVslNo( lloydVslNo[i]);
						if ( creDt[i] !=	null)
						model.setCreDt( creDt[i]);
						if ( copNo[i] !=	null)
						model.setCopNo( copNo[i]);
						if ( destYdCd[i] !=	null)
						model.setDestYdCd( destYdCd[i]);
						if ( cntrHgt[i] !=	null)
						model.setCntrHgt( cntrHgt[i]);
						if ( blNo[i] !=	null)
						model.setBlNo( blNo[i]);
						if ( pagerows[i] !=	null)
						model.setPagerows( pagerows[i]);
						if ( orgLocNm[i] !=	null)
						model.setOrgLocNm( orgLocNm[i]);
						if ( ibflag[i] !=	null)
						model.setIbflag( ibflag[i]);
						if ( cntrTpszCd[i] !=	null)
						model.setCntrTpszCd( cntrTpszCd[i]);
						if ( cntrWgtUtCd[i] !=	null)
						model.setCntrWgtUtCd( cntrWgtUtCd[i]);
						if ( orgYdLocCtyNm[i] !=	null)
						model.setOrgYdLocCtyNm( orgYdLocCtyNm[i]);
						if ( ediSndRmk[i] !=	null)
						model.setEdiSndRmk( ediSndRmk[i]);
						if ( podYdCd[i] !=	null)
						model.setPodYdCd( podYdCd[i]);
						if ( cntrLen[i] !=	null)
						model.setCntrLen( cntrLen[i]);
						if ( updUsrId[i] !=	null)
						model.setUpdUsrId( updUsrId[i]);
						if ( destYdLocSteCd[i] !=	null)
						model.setDestYdLocSteCd( destYdLocSteCd[i]);
						if ( updDt[i] !=	null)
						model.setUpdDt( updDt[i]);
						if ( actCd[i] !=	null)
						model.setActCd( actCd[i]);
						if ( podEstmArrGdt[i] !=	null)
						model.setPodEstmArrGdt( podEstmArrGdt[i]);
						if ( cntrWgt[i] !=	null)
						model.setCntrWgt( cntrWgt[i]);
						if ( podNm[i] !=	null)
						model.setPodNm( podNm[i]);
						if ( ediSndId[i] !=	null)
						model.setEdiSndId( ediSndId[i]);
						if ( skdVoyNo[i] !=	null)
						model.setSkdVoyNo( skdVoyNo[i]);
						if ( vslNm[i] !=	null)
						model.setVslNm( vslNm[i]);
						if ( orgYdCd[i] !=	null)
						model.setOrgYdCd( orgYdCd[i]);
						if ( cntrLbsWgt[i] !=	null)
						model.setCntrLbsWgt( cntrLbsWgt[i]);
						if ( skdDirCd[i] !=	null)
						model.setSkdDirCd( skdDirCd[i]);
						if ( creUsrId[i] !=	null)
						model.setCreUsrId( creUsrId[i]);
						if ( dgFlg[i] !=	null)
						model.setDgFlg( dgFlg[i]);
						if ( bkgNo[i] !=	null)
						model.setBkgNo( bkgNo[i]);
						if ( ediSndSeq[i] !=	null)
						model.setEdiSndSeq( ediSndSeq[i]);
						if ( cntrNo[i] !=	null)
						model.setCntrNo( cntrNo[i]);
						if ( vndrSeq[i] !=	null)
						model.setVndrSeq( vndrSeq[i]);
						if ( polYdCd[i] !=	null)
						model.setPolYdCd( polYdCd[i]);
						if ( polDepActDt[i] !=	null)
						model.setPolDepActDt( polDepActDt[i]);
						if ( destLocNm[i] !=	null)
						model.setDestLocNm( destLocNm[i]);
						if ( orgYdLocSteCd[i] !=	null)
						model.setOrgYdLocSteCd( orgYdLocSteCd[i]);
						if ( destYdLocCtyNm[i] !=	null)
						model.setDestYdLocCtyNm( destYdLocCtyNm[i]);
						if ( cntrSealNo[i] !=	null)
						model.setCntrSealNo( cntrSealNo[i]);
						if ( podEstmArrDt[i] !=	null)
						model.setPodEstmArrDt( podEstmArrDt[i]);
						if ( ediSndTpCd[i] !=	null)
						model.setEdiSndTpCd( ediSndTpCd[i]);
						if ( ediSndDt[i] !=	null)
						model.setEdiSndDt( ediSndDt[i]);
						if ( mnlFlg[i] !=	null)
						model.setMnlFlg( mnlFlg[i]);
						if ( destYdNm[i] !=	null)
						model.setDestYdNm( destYdNm[i]);
					 models.add(model);
				}

		} catch	(Exception e) {
			return null;
		}
		return getSceEdi324SndRsltVOs();
	}

	/**
	 *  VO 배열을 반환
	 * @return SceEdi324SndRsltVO[]
	 */
	public SceEdi324SndRsltVO[]	 getSceEdi324SndRsltVOs(){
		SceEdi324SndRsltVO[] vos = (SceEdi324SndRsltVO[])models.toArray(new	SceEdi324SndRsltVO[models.size()]);
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
		this.lloydVslNo =	this.lloydVslNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt =	this.creDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.copNo =	this.copNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.destYdCd =	this.destYdCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrHgt =	this.cntrHgt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blNo =	this.blNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows =	this.pagerows.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.orgLocNm =	this.orgLocNm.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag =	this.ibflag.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrTpszCd =	this.cntrTpszCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrWgtUtCd =	this.cntrWgtUtCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.orgYdLocCtyNm =	this.orgYdLocCtyNm.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediSndRmk =	this.ediSndRmk.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.podYdCd =	this.podYdCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrLen =	this.cntrLen.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId =	this.updUsrId.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.destYdLocSteCd =	this.destYdLocSteCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt =	this.updDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actCd =	this.actCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.podEstmArrGdt =	this.podEstmArrGdt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrWgt =	this.cntrWgt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.podNm =	this.podNm.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediSndId =	this.ediSndId.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdVoyNo =	this.skdVoyNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslNm =	this.vslNm.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.orgYdCd =	this.orgYdCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrLbsWgt =	this.cntrLbsWgt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdDirCd =	this.skdDirCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId =	this.creUsrId.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dgFlg =	this.dgFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNo =	this.bkgNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediSndSeq =	this.ediSndSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrNo =	this.cntrNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vndrSeq =	this.vndrSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.polYdCd =	this.polYdCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.polDepActDt =	this.polDepActDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.destLocNm =	this.destLocNm.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.orgYdLocSteCd =	this.orgYdLocSteCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.destYdLocCtyNm =	this.destYdLocCtyNm.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrSealNo =	this.cntrSealNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.podEstmArrDt =	this.podEstmArrDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediSndTpCd =	this.ediSndTpCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediSndDt =	this.ediSndDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mnlFlg =	this.mnlFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.destYdNm =	this.destYdNm.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}	
}