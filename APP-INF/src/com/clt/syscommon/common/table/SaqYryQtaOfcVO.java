/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : SaqYryQtaOfcVO.java
*@FileTitle : SaqYryQtaOfcVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.23
*@LastModifier : 김민아
*@LastVersion : 1.0
* 2009.07.23 김민아 
* 1.0 Creation
* 2010.12.01 최윤성 [CHM-201007464-01] 연간 판매목표 기능 추가
=========================================================*/

package com.clt.syscommon.common.table;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;

import com.clt.framework.component.common.AbstractValueObject;
import com.clt.framework.component.util.JSPUtil;

/**
 * Table Value Ojbect<br>
 * 관련 Event 에서 생성, 서버실행요청시 Data 전달역할을 수행하는 Value Object
 *
 * @author 김민아
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class SaqYryQtaOfcVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<SaqYryQtaOfcVO> models = new ArrayList<SaqYryQtaOfcVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String cmUcAmt = null;
	/* Column Info */
	private String lodQty = null;
	/* Column Info */
	private String raOpfitUcAmt = null;
	/* Column Info */
	private String opfitUcAmt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String trdCd = null;
	/* Column Info */
	private String bseYr = null;
	/* Column Info */
	private String rlaneCd = null;
	/* Column Info */
	private String yqtaStepCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String ctrtRhqCd = null;
	/* Column Info */
	private String bseMon = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String raCmUcAmt = null;
	/* Column Info */
	private String ctrtOfcCd = null;
	/* Column Info */
	private String grsRpbRev = null;
	/* Column Info */
	private String raStpPfitUtAmt = null;
	/* Column Info */
	private String dirCd = null;
	/* Column Info */
	private String yqtaVerNo = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String subTrdCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public SaqYryQtaOfcVO() {}

	public SaqYryQtaOfcVO(String ibflag, String pagerows, String yqtaStepCd, String bseYr, String trdCd, String dirCd, String yqtaVerNo, String rlaneCd, String ctrtOfcCd, String bseMon, String subTrdCd, String ctrtRhqCd, String lodQty, String grsRpbRev, String cmUcAmt, String opfitUcAmt, String raCmUcAmt, String raStpPfitUtAmt, String raOpfitUcAmt, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.cmUcAmt = cmUcAmt;
		this.lodQty = lodQty;
		this.raOpfitUcAmt = raOpfitUcAmt;
		this.opfitUcAmt = opfitUcAmt;
		this.creDt = creDt;
		this.trdCd = trdCd;
		this.bseYr = bseYr;
		this.rlaneCd = rlaneCd;
		this.yqtaStepCd = yqtaStepCd;
		this.pagerows = pagerows;
		this.ctrtRhqCd = ctrtRhqCd;
		this.bseMon = bseMon;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.raCmUcAmt = raCmUcAmt;
		this.ctrtOfcCd = ctrtOfcCd;
		this.grsRpbRev = grsRpbRev;
		this.raStpPfitUtAmt = raStpPfitUtAmt;
		this.dirCd = dirCd;
		this.yqtaVerNo = yqtaVerNo;
		this.updUsrId = updUsrId;
		this.subTrdCd = subTrdCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("cm_uc_amt", getCmUcAmt());
		this.hashColumns.put("lod_qty", getLodQty());
		this.hashColumns.put("ra_opfit_uc_amt", getRaOpfitUcAmt());
		this.hashColumns.put("opfit_uc_amt", getOpfitUcAmt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("trd_cd", getTrdCd());
		this.hashColumns.put("bse_yr", getBseYr());
		this.hashColumns.put("rlane_cd", getRlaneCd());
		this.hashColumns.put("yqta_step_cd", getYqtaStepCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ctrt_rhq_cd", getCtrtRhqCd());
		this.hashColumns.put("bse_mon", getBseMon());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("ra_cm_uc_amt", getRaCmUcAmt());
		this.hashColumns.put("ctrt_ofc_cd", getCtrtOfcCd());
		this.hashColumns.put("grs_rpb_rev", getGrsRpbRev());
		this.hashColumns.put("ra_stp_pfit_ut_amt", getRaStpPfitUtAmt());
		this.hashColumns.put("dir_cd", getDirCd());
		this.hashColumns.put("yqta_ver_no", getYqtaVerNo());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("sub_trd_cd", getSubTrdCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("cm_uc_amt", "cmUcAmt");
		this.hashFields.put("lod_qty", "lodQty");
		this.hashFields.put("ra_opfit_uc_amt", "raOpfitUcAmt");
		this.hashFields.put("opfit_uc_amt", "opfitUcAmt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("trd_cd", "trdCd");
		this.hashFields.put("bse_yr", "bseYr");
		this.hashFields.put("rlane_cd", "rlaneCd");
		this.hashFields.put("yqta_step_cd", "yqtaStepCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ctrt_rhq_cd", "ctrtRhqCd");
		this.hashFields.put("bse_mon", "bseMon");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("ra_cm_uc_amt", "raCmUcAmt");
		this.hashFields.put("ctrt_ofc_cd", "ctrtOfcCd");
		this.hashFields.put("grs_rpb_rev", "grsRpbRev");
		this.hashFields.put("ra_stp_pfit_ut_amt", "raStpPfitUtAmt");
		this.hashFields.put("dir_cd", "dirCd");
		this.hashFields.put("yqta_ver_no", "yqtaVerNo");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("sub_trd_cd", "subTrdCd");
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
	 * @return cmUcAmt
	 */
	public String getCmUcAmt() {
		return this.cmUcAmt;
	}
	
	/**
	 * Column Info
	 * @return lodQty
	 */
	public String getLodQty() {
		return this.lodQty;
	}
	
	/**
	 * Column Info
	 * @return raOpfitUcAmt
	 */
	public String getRaOpfitUcAmt() {
		return this.raOpfitUcAmt;
	}
	
	/**
	 * Column Info
	 * @return opfitUcAmt
	 */
	public String getOpfitUcAmt() {
		return this.opfitUcAmt;
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
	 * @return trdCd
	 */
	public String getTrdCd() {
		return this.trdCd;
	}
	
	/**
	 * Column Info
	 * @return bseYr
	 */
	public String getBseYr() {
		return this.bseYr;
	}
	
	/**
	 * Column Info
	 * @return rlaneCd
	 */
	public String getRlaneCd() {
		return this.rlaneCd;
	}
	
	/**
	 * Column Info
	 * @return yqtaStepCd
	 */
	public String getYqtaStepCd() {
		return this.yqtaStepCd;
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
	 * @return ctrtRhqCd
	 */
	public String getCtrtRhqCd() {
		return this.ctrtRhqCd;
	}
	
	/**
	 * Column Info
	 * @return bseMon
	 */
	public String getBseMon() {
		return this.bseMon;
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
	 * @return raCmUcAmt
	 */
	public String getRaCmUcAmt() {
		return this.raCmUcAmt;
	}
	
	/**
	 * Column Info
	 * @return ctrtOfcCd
	 */
	public String getCtrtOfcCd() {
		return this.ctrtOfcCd;
	}
	
	/**
	 * Column Info
	 * @return grsRpbRev
	 */
	public String getGrsRpbRev() {
		return this.grsRpbRev;
	}
	
	/**
	 * Column Info
	 * @return raStpPfitUtAmt
	 */
	public String getRaStpPfitUtAmt() {
		return this.raStpPfitUtAmt;
	}
	
	/**
	 * Column Info
	 * @return dirCd
	 */
	public String getDirCd() {
		return this.dirCd;
	}
	
	/**
	 * Column Info
	 * @return yqtaVerNo
	 */
	public String getYqtaVerNo() {
		return this.yqtaVerNo;
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
	 * @return subTrdCd
	 */
	public String getSubTrdCd() {
		return this.subTrdCd;
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
	 * @param cmUcAmt
	 */
	public void setCmUcAmt(String cmUcAmt) {
		this.cmUcAmt = cmUcAmt;
	}
	
	/**
	 * Column Info
	 * @param lodQty
	 */
	public void setLodQty(String lodQty) {
		this.lodQty = lodQty;
	}
	
	/**
	 * Column Info
	 * @param raOpfitUcAmt
	 */
	public void setRaOpfitUcAmt(String raOpfitUcAmt) {
		this.raOpfitUcAmt = raOpfitUcAmt;
	}
	
	/**
	 * Column Info
	 * @param opfitUcAmt
	 */
	public void setOpfitUcAmt(String opfitUcAmt) {
		this.opfitUcAmt = opfitUcAmt;
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
	 * @param trdCd
	 */
	public void setTrdCd(String trdCd) {
		this.trdCd = trdCd;
	}
	
	/**
	 * Column Info
	 * @param bseYr
	 */
	public void setBseYr(String bseYr) {
		this.bseYr = bseYr;
	}
	
	/**
	 * Column Info
	 * @param rlaneCd
	 */
	public void setRlaneCd(String rlaneCd) {
		this.rlaneCd = rlaneCd;
	}
	
	/**
	 * Column Info
	 * @param yqtaStepCd
	 */
	public void setYqtaStepCd(String yqtaStepCd) {
		this.yqtaStepCd = yqtaStepCd;
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
	 * @param ctrtRhqCd
	 */
	public void setCtrtRhqCd(String ctrtRhqCd) {
		this.ctrtRhqCd = ctrtRhqCd;
	}
	
	/**
	 * Column Info
	 * @param bseMon
	 */
	public void setBseMon(String bseMon) {
		this.bseMon = bseMon;
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
	 * @param raCmUcAmt
	 */
	public void setRaCmUcAmt(String raCmUcAmt) {
		this.raCmUcAmt = raCmUcAmt;
	}
	
	/**
	 * Column Info
	 * @param ctrtOfcCd
	 */
	public void setCtrtOfcCd(String ctrtOfcCd) {
		this.ctrtOfcCd = ctrtOfcCd;
	}
	
	/**
	 * Column Info
	 * @param grsRpbRev
	 */
	public void setGrsRpbRev(String grsRpbRev) {
		this.grsRpbRev = grsRpbRev;
	}
	
	/**
	 * Column Info
	 * @param raStpPfitUtAmt
	 */
	public void setRaStpPfitUtAmt(String raStpPfitUtAmt) {
		this.raStpPfitUtAmt = raStpPfitUtAmt;
	}
	
	/**
	 * Column Info
	 * @param dirCd
	 */
	public void setDirCd(String dirCd) {
		this.dirCd = dirCd;
	}
	
	/**
	 * Column Info
	 * @param yqtaVerNo
	 */
	public void setYqtaVerNo(String yqtaVerNo) {
		this.yqtaVerNo = yqtaVerNo;
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
	 * @param subTrdCd
	 */
	public void setSubTrdCd(String subTrdCd) {
		this.subTrdCd = subTrdCd;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setCmUcAmt(JSPUtil.getParameter(request, "cm_uc_amt", ""));
		setLodQty(JSPUtil.getParameter(request, "lod_qty", ""));
		setRaOpfitUcAmt(JSPUtil.getParameter(request, "ra_opfit_uc_amt", ""));
		setOpfitUcAmt(JSPUtil.getParameter(request, "opfit_uc_amt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setTrdCd(JSPUtil.getParameter(request, "trd_cd", ""));
		setBseYr(JSPUtil.getParameter(request, "bse_yr", ""));
		setRlaneCd(JSPUtil.getParameter(request, "rlane_cd", ""));
		setYqtaStepCd(JSPUtil.getParameter(request, "yqta_step_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setCtrtRhqCd(JSPUtil.getParameter(request, "ctrt_rhq_cd", ""));
		setBseMon(JSPUtil.getParameter(request, "bse_mon", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setRaCmUcAmt(JSPUtil.getParameter(request, "ra_cm_uc_amt", ""));
		setCtrtOfcCd(JSPUtil.getParameter(request, "ctrt_ofc_cd", ""));
		setGrsRpbRev(JSPUtil.getParameter(request, "grs_rpb_rev", ""));
		setRaStpPfitUtAmt(JSPUtil.getParameter(request, "ra_stp_pfit_ut_amt", ""));
		setDirCd(JSPUtil.getParameter(request, "dir_cd", ""));
		setYqtaVerNo(JSPUtil.getParameter(request, "yqta_ver_no", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setSubTrdCd(JSPUtil.getParameter(request, "sub_trd_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return SaqYryQtaOfcVO[]
	 */
	public SaqYryQtaOfcVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGridGeneral(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return SaqYryQtaOfcVO[]
	 */
	public SaqYryQtaOfcVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		if(prefix != null && ( prefix.equals("0042_trd_grp") || prefix.equals("0042_fnl"))){ // 0042 화면 multi VO 객체 생성을 위한 분기 09.09.17 Add By ChungEunHo
			prefix = prefix.replaceAll("0042_", "");
			return fromRequestGrid0042(request , prefix);
		}else if (prefix.equals("0080_rhq")){
			prefix = prefix.replaceAll("0080_", "");
			return fromRequestGrid0042(request , prefix);
		}else {
			return fromRequestGridGeneral(request , prefix);
		}
		
	}
	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return SaqYryQtaOfcVO[]
	 */
	@SuppressWarnings("unchecked")
	public SaqYryQtaOfcVO[] fromRequestGrid0042(HttpServletRequest request, String prefix) {
		String bound = JSPUtil.getParameter(request, "bound", "");
		String year = JSPUtil.getParameter(request, "year", "");
		String rep_trade = JSPUtil.getParameter(request, "rep_trade", "");
		String unit = JSPUtil.getParameter(request, "unit", "");
		String version = JSPUtil.getParameter(request, "version", "");
		String yqta_step_cd = JSPUtil.getParameter(request, "yqta_step_cd", "");
		
		SaqYryQtaOfcVO model = null;
		String[] params = request.getParameterValues( "sub_trd_cd");
		float unitOffSet = 0;
		if( unit != null && unit.equals("F")){ //FEU 일때는 load는 나누기2 cmb,opb,rpb는 곱하기2
			unitOffSet = 2 ;
		}else{
			unitOffSet = 1;
		}
		if (params != null){

//			HttpSession session = request.getSession();
//			SignOnUserAccount account = ((SignOnUserAccount) (session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT)));
//			String strUserId = account.getUsr_id();
			
			int length = request.getParameterValues( "sub_trd_cd").length;
			String[] ibflag = (JSPUtil.getParameter(request,  "ibflag".trim(), length));
			String[] rlane_cd = (JSPUtil.getParameter(request,  "rlane_cd".trim(), length));
			String[] rhq_cd = (JSPUtil.getParameter(request,  "rhq_cd".trim(), length));
			String[] sub_trd_cd = (JSPUtil.getParameter(request,  "sub_trd_cd".trim(), length));
			String[] data_seq = (JSPUtil.getParameter(request,  "data_seq".trim(), length));
			String[] item_cd = (JSPUtil.getParameter(request,  "item_cd".trim(), length));
			
			String[][] trd_grp_data  = new String[12][];
		
			for( int mon = 1; mon <= 12 ; mon ++){
				trd_grp_data[mon-1] = (JSPUtil.getParameter(request,  "hidden_"+prefix+"_"+(mon < 10 ? "0"+mon : String.valueOf(mon) ), length));
			}
		
//			
//			String[] hidden_rhq_01 = (JSPUtil.getParameter(request,  "hidden_rhq_01".trim(), length));
//			String[] hidden_fnl_01 = (JSPUtil.getParameter(request,  "hidden_fnl_01".trim(), length));
			
		
			int iDataSeq = 0;
			SaqYryQtaOfcVO tmpModel;
			for (int i = 0; i < length; i++) {
				if( data_seq[i] != null ){
					iDataSeq = Integer.parseInt(data_seq[i]);
					// Total의 데이터 이다. 필요 없는 데이터.
					// 0080화면에서는 이부분이 필요가 없어서  제외시킴
					if (!prefix.equals("rhq")){
						if( iDataSeq < 12 ){
							continue;
						}
					}
					if( item_cd[i] == null || !( item_cd[i].equals("2") ||  item_cd[i].equals("5") ) ){//load데이터 또는 rpb데이터,그외 필요 없는데이터이다.
						continue;
					}
				    }else{
					continue;
				   }
				
				
				for(int mon = 1 ; mon <= 12 ; mon++){
					model = new SaqYryQtaOfcVO();
					model.setYqtaStepCd(yqta_step_cd);
					model.setBseYr(year);
					model.setTrdCd(rep_trade);
					model.setDirCd(bound);
					model.setYqtaVerNo(version);
				
					if (ibflag[i] != null)
						model.setIbflag(ibflag[i]);
					if (rlane_cd[i] != null)
						model.setRlaneCd(rlane_cd[i]);
					if (sub_trd_cd[i] != null)
						model.setSubTrdCd(sub_trd_cd[i]);
					if (rhq_cd[i] != null)
						model.setCtrtOfcCd(rhq_cd[i]);	
					
					model.setBseMon((mon < 10 ? "0"+mon : String.valueOf(mon) ));	
					if(  item_cd[i].equals("2")  ){ //load이면
						if (trd_grp_data[mon-1][i] != null){
							model.setLodQty(String.valueOf(Float.parseFloat(trd_grp_data[mon-1][i]) * unitOffSet) );
						}						
					}else if(mon == 1){ //rpb이면서 1월이면
						
						//이미 load가 있는지 검사후 있다면 그 model의 grs_rpb_rev값에 set한다.
						//새로운 row를 만들지 말아야 한다.
						Iterator itr = models.iterator();
						boolean flg = false;
						tmpModel = null;
						while(itr.hasNext()){
							tmpModel = (SaqYryQtaOfcVO)itr.next();
							if( tmpModel.getSubTrdCd().equals(sub_trd_cd[i]) 
									&& tmpModel.getRlaneCd().equals(rlane_cd[i])
									&& tmpModel.getCtrtOfcCd().equals(rhq_cd[i] )){
								tmpModel.setGrsRpbRev(String.valueOf(Float.parseFloat(trd_grp_data[mon-1][i])/unitOffSet) );
								mon++;
								flg = true;
								if( mon > 12 ){
									break;
								}
							}else{
								if( flg ){ //이미 찾은 후 뒷 부분은 검색 불필요.
									break;
								}
							}
						}
						if( flg ){ //load가 이미 존재한다.
							break;
						}
					}
					//load에 이미 동일한 값이 있다면 이곳 이하는 실행 되지 않고 while loop에서 끝난다.
					if(item_cd[i].equals("5") ){ //rpb이면.
						if (trd_grp_data[mon-1][i] != null)
							model.setGrsRpbRev(String.valueOf(Float.parseFloat(trd_grp_data[mon-1][i])/unitOffSet) );
					}
//					model.setCreUsrId(strUserId);
//					model.setUpdUsrId(strUserId);
					models.add(model);	

				}
			}		
		
		}
		return getSaqYryQtaOfcVOs();
	}
	
	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return SaqYryQtaOfcVO[]
	 */
	public SaqYryQtaOfcVO[] fromRequestGridGeneral(HttpServletRequest request, String prefix) {
		SaqYryQtaOfcVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] cmUcAmt = (JSPUtil.getParameter(request, prefix	+ "cm_uc_amt", length));
			String[] lodQty = (JSPUtil.getParameter(request, prefix	+ "lod_qty", length));
			String[] raOpfitUcAmt = (JSPUtil.getParameter(request, prefix	+ "ra_opfit_uc_amt", length));
			String[] opfitUcAmt = (JSPUtil.getParameter(request, prefix	+ "opfit_uc_amt", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] trdCd = (JSPUtil.getParameter(request, prefix	+ "trd_cd", length));
			String[] bseYr = (JSPUtil.getParameter(request, prefix	+ "bse_yr", length));
			String[] rlaneCd = (JSPUtil.getParameter(request, prefix	+ "rlane_cd", length));
			String[] yqtaStepCd = (JSPUtil.getParameter(request, prefix	+ "yqta_step_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ctrtRhqCd = (JSPUtil.getParameter(request, prefix	+ "ctrt_rhq_cd", length));
			String[] bseMon = (JSPUtil.getParameter(request, prefix	+ "bse_mon", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] raCmUcAmt = (JSPUtil.getParameter(request, prefix	+ "ra_cm_uc_amt", length));
			String[] ctrtOfcCd = (JSPUtil.getParameter(request, prefix	+ "ctrt_ofc_cd", length));
			String[] grsRpbRev = (JSPUtil.getParameter(request, prefix	+ "grs_rpb_rev", length));
			String[] raStpPfitUtAmt = (JSPUtil.getParameter(request, prefix	+ "ra_stp_pfit_ut_amt", length));
			String[] dirCd = (JSPUtil.getParameter(request, prefix	+ "dir_cd", length));
			String[] yqtaVerNo = (JSPUtil.getParameter(request, prefix	+ "yqta_ver_no", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] subTrdCd = (JSPUtil.getParameter(request, prefix	+ "sub_trd_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new SaqYryQtaOfcVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (cmUcAmt[i] != null)
					model.setCmUcAmt(cmUcAmt[i]);
				if (lodQty[i] != null)
					model.setLodQty(lodQty[i]);
				if (raOpfitUcAmt[i] != null)
					model.setRaOpfitUcAmt(raOpfitUcAmt[i]);
				if (opfitUcAmt[i] != null)
					model.setOpfitUcAmt(opfitUcAmt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (trdCd[i] != null)
					model.setTrdCd(trdCd[i]);
				if (bseYr[i] != null)
					model.setBseYr(bseYr[i]);
				if (rlaneCd[i] != null)
					model.setRlaneCd(rlaneCd[i]);
				if (yqtaStepCd[i] != null)
					model.setYqtaStepCd(yqtaStepCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ctrtRhqCd[i] != null)
					model.setCtrtRhqCd(ctrtRhqCd[i]);
				if (bseMon[i] != null)
					model.setBseMon(bseMon[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (raCmUcAmt[i] != null)
					model.setRaCmUcAmt(raCmUcAmt[i]);
				if (ctrtOfcCd[i] != null)
					model.setCtrtOfcCd(ctrtOfcCd[i]);
				if (grsRpbRev[i] != null)
					model.setGrsRpbRev(grsRpbRev[i]);
				if (raStpPfitUtAmt[i] != null)
					model.setRaStpPfitUtAmt(raStpPfitUtAmt[i]);
				if (dirCd[i] != null)
					model.setDirCd(dirCd[i]);
				if (yqtaVerNo[i] != null)
					model.setYqtaVerNo(yqtaVerNo[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (subTrdCd[i] != null)
					model.setSubTrdCd(subTrdCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getSaqYryQtaOfcVOs();
	}
	
	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다.
	 * 
	 * 2010.12.01 최윤성 [CHM-201007464-01] 연간 판매목표 기능 추가
	 * 
	 * @param request
	 * @param conVo
	 * @param prefix
	 * @return SaqYryQtaOfcVO[]
	 */
//	public SaqYryQtaOfcVO[] fromRequestGrid0177(HttpServletRequest request, QuotaConditionVO conVo, String prefix) {
//		SaqYryQtaOfcVO model = null;
//		
//		String[] tmp = request.getParameterValues(prefix + "ibflag");
//		
//  		if(tmp == null)
//   			return null;
//  		
//  		int length = request.getParameterValues(prefix + "ibflag").length;
//  		
//		try {
//			String[] ibflag     = (JSPUtil.getParameter(request, prefix	+ "ibflag"      , length));
//			String[] pagerows   = (JSPUtil.getParameter(request, prefix	+ "pagerows"    , length));
//			String[] yqtaStepCd = (JSPUtil.getParameter(request, prefix	+ "yqta_step_cd", length));
//			String[] bseYr      = (JSPUtil.getParameter(request, prefix	+ "bse_yr"      , length));
//			String[] trdCd      = (JSPUtil.getParameter(request, prefix	+ "trd_cd"      , length));
//			String[] rlaneCd    = (JSPUtil.getParameter(request, prefix	+ "rlane_cd"    , length));
//			String[] dirCd      = (JSPUtil.getParameter(request, prefix	+ "dir_cd"      , length));
//			String[] yqtaVerNo  = (JSPUtil.getParameter(request, prefix	+ "yqta_ver_no" , length));
//			String[] bseMon     = (JSPUtil.getParameter(request, prefix	+ "bse_mon"     , length));
//			String[] ctrtOfcCd  = (JSPUtil.getParameter(request, prefix	+ "ctrt_ofc_cd" , length));
//			String[] lodQty     = (JSPUtil.getParameter(request, prefix	+ "lod_qty"     , length));
//			String[] grsRpbRev  = (JSPUtil.getParameter(request, prefix	+ "grs_rpb_rev" , length));
//			String[] creDt      = (JSPUtil.getParameter(request, prefix	+ "cre_dt"      , length));
//			String[] creUsrId   = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id"  , length));
//			String[] updDt      = (JSPUtil.getParameter(request, prefix	+ "upd_dt"      , length));
//			String[] updUsrId   = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id"  , length));
//			
//			for (int i = 0; i < length; i++) {
//				model = new SaqYryQtaOfcVO();
//				
//				if (ibflag[i] != null)
//					model.setIbflag(ibflag[i]);
//				if (pagerows[i] != null)
//					model.setPagerows(pagerows[i]);
//				if (yqtaStepCd[i] != null)
//					model.setYqtaStepCd(conVo.getYqta_step_cd());			// 변수
//				if (bseYr[i] != null)
//					model.setBseYr(conVo.getBse_yr());						// 변수
//				if (trdCd[i] != null)
//					model.setTrdCd(conVo.getTrd_cd());						// 변수
//				if (rlaneCd[i] != null)
//					model.setRlaneCd(rlaneCd[i]);
//				if (dirCd[i] != null)
//					model.setDirCd(conVo.getDir_cd());						// 변수
//				if (yqtaVerNo[i] != null)
//					model.setYqtaVerNo(conVo.getYqta_ver_no());				// 변수
//				if (bseMon[i] != null)
//					model.setBseMon(bseMon[i]);
//				if (ctrtOfcCd[i] != null)
//					model.setCtrtOfcCd(ctrtOfcCd[i]);
//				if (lodQty[i] != null)
//					model.setLodQty(lodQty[i]);
//				if (grsRpbRev[i] != null)
//					model.setGrsRpbRev(grsRpbRev[i]);
//				if (creDt[i] != null)
//					model.setCreDt(creDt[i]);
//				if (creUsrId[i] != null)
//					model.setCreUsrId(creUsrId[i]);
//				if (updDt[i] != null)
//					model.setUpdDt(updDt[i]);
//				if (updUsrId[i] != null)
//					model.setUpdUsrId(updUsrId[i]);
//				models.add(model);
//			}
//
//		} catch (Exception e) {
//			return null;
//		}
//		return getSaqYryQtaOfcVOs();
//	}
	

	/**
	 * VO 배열을 반환
	 * @return SaqYryQtaOfcVO[]
	 */
	public SaqYryQtaOfcVO[] getSaqYryQtaOfcVOs(){
		SaqYryQtaOfcVO[] vos = (SaqYryQtaOfcVO[])models.toArray(new SaqYryQtaOfcVO[models.size()]);
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
		this.cmUcAmt = this.cmUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lodQty = this.lodQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.raOpfitUcAmt = this.raOpfitUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.opfitUcAmt = this.opfitUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trdCd = this.trdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bseYr = this.bseYr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rlaneCd = this.rlaneCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.yqtaStepCd = this.yqtaStepCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ctrtRhqCd = this.ctrtRhqCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bseMon = this.bseMon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.raCmUcAmt = this.raCmUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ctrtOfcCd = this.ctrtOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.grsRpbRev = this.grsRpbRev .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.raStpPfitUtAmt = this.raStpPfitUtAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dirCd = this.dirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.yqtaVerNo = this.yqtaVerNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.subTrdCd = this.subTrdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
