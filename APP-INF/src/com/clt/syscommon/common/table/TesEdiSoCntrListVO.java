/*=========================================================
*Copyright(c) 2012 CyberLogitec
*@FileName : TesEdiSoCntrListVO.java
*@FileTitle : TesEdiSoCntrListVO
*Open Issues :
*Change history :
*@LastModifyDate : 2012.06.18
*@LastModifier : 
*@LastVersion : 1.0
* 2012.06.18  
* 1.0 Creation
=========================================================*/

package com.clt.syscommon.common.table;

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

public class TesEdiSoCntrListVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<TesEdiSoCntrListVO> models = new ArrayList<TesEdiSoCntrListVO>();
	
	/* Column Info */
	private String vslCd = null;
	/* Column Info */
	private String ibVvdCd = null;
	/* Column Info */
	private String imoNo = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String invGateInTmMsg = null;
	/* Column Info */
	private String atbDt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String mtchModCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String cntrTpszCd = null;
	/* Column Info */
	private String tmlEdiSoCntrListSeq = null;
	/* Column Info */
	private String wrkDt = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String tmlEdiSoOfcCtyCd = null;
	/* Column Info */
	private String invGateOutTmMsg = null;
	/* Column Info */
	private String callSgnNo = null;
	/* Column Info */
	private String skdVoyNo = null;
	/* Column Info */
	private String custRefNoCtnt = null;
	/* Column Info */
	private String ioBndCd = null;
	/* Column Info */
	private String skdDirCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String lloydNo = null;
	/* Column Info */
	private String cntrStyCd = null;
	/* Column Info */
	private String cntrNo = null;
	/* Column Info */
	private String obVvdCd = null;
	/* Column Info */
	private String invVolQty = null;
	/* Column Info */
	private String tmlEdiSoSeq = null;
	/* Column Info */
	private String cntrRmk = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public TesEdiSoCntrListVO() {}

	public TesEdiSoCntrListVO(String ibflag, String pagerows, String tmlEdiSoOfcCtyCd, String tmlEdiSoSeq, String tmlEdiSoCntrListSeq, String cntrNo, String cntrTpszCd, String cntrStyCd, String ioBndCd, String vslCd, String skdVoyNo, String skdDirCd, String ibVvdCd, String obVvdCd, String invVolQty, String wrkDt, String invGateInTmMsg, String invGateOutTmMsg, String cntrRmk, String creUsrId, String creDt, String updUsrId, String updDt, String callSgnNo, String lloydNo, String imoNo, String custRefNoCtnt, String mtchModCd, String atbDt) {
		this.vslCd = vslCd;
		this.ibVvdCd = ibVvdCd;
		this.imoNo = imoNo;
		this.creDt = creDt;
		this.invGateInTmMsg = invGateInTmMsg;
		this.atbDt = atbDt;
		this.pagerows = pagerows;
		this.mtchModCd = mtchModCd;
		this.ibflag = ibflag;
		this.cntrTpszCd = cntrTpszCd;
		this.tmlEdiSoCntrListSeq = tmlEdiSoCntrListSeq;
		this.wrkDt = wrkDt;
		this.updUsrId = updUsrId;
		this.updDt = updDt;
		this.tmlEdiSoOfcCtyCd = tmlEdiSoOfcCtyCd;
		this.invGateOutTmMsg = invGateOutTmMsg;
		this.callSgnNo = callSgnNo;
		this.skdVoyNo = skdVoyNo;
		this.custRefNoCtnt = custRefNoCtnt;
		this.ioBndCd = ioBndCd;
		this.skdDirCd = skdDirCd;
		this.creUsrId = creUsrId;
		this.lloydNo = lloydNo;
		this.cntrStyCd = cntrStyCd;
		this.cntrNo = cntrNo;
		this.obVvdCd = obVvdCd;
		this.invVolQty = invVolQty;
		this.tmlEdiSoSeq = tmlEdiSoSeq;
		this.cntrRmk = cntrRmk;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("ib_vvd_cd", getIbVvdCd());
		this.hashColumns.put("imo_no", getImoNo());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("inv_gate_in_tm_msg", getInvGateInTmMsg());
		this.hashColumns.put("atb_dt", getAtbDt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("mtch_mod_cd", getMtchModCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cntr_tpsz_cd", getCntrTpszCd());
		this.hashColumns.put("tml_edi_so_cntr_list_seq", getTmlEdiSoCntrListSeq());
		this.hashColumns.put("wrk_dt", getWrkDt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("tml_edi_so_ofc_cty_cd", getTmlEdiSoOfcCtyCd());
		this.hashColumns.put("inv_gate_out_tm_msg", getInvGateOutTmMsg());
		this.hashColumns.put("call_sgn_no", getCallSgnNo());
		this.hashColumns.put("skd_voy_no", getSkdVoyNo());
		this.hashColumns.put("cust_ref_no_ctnt", getCustRefNoCtnt());
		this.hashColumns.put("io_bnd_cd", getIoBndCd());
		this.hashColumns.put("skd_dir_cd", getSkdDirCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("lloyd_no", getLloydNo());
		this.hashColumns.put("cntr_sty_cd", getCntrStyCd());
		this.hashColumns.put("cntr_no", getCntrNo());
		this.hashColumns.put("ob_vvd_cd", getObVvdCd());
		this.hashColumns.put("inv_vol_qty", getInvVolQty());
		this.hashColumns.put("tml_edi_so_seq", getTmlEdiSoSeq());
		this.hashColumns.put("cntr_rmk", getCntrRmk());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("ib_vvd_cd", "ibVvdCd");
		this.hashFields.put("imo_no", "imoNo");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("inv_gate_in_tm_msg", "invGateInTmMsg");
		this.hashFields.put("atb_dt", "atbDt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("mtch_mod_cd", "mtchModCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cntr_tpsz_cd", "cntrTpszCd");
		this.hashFields.put("tml_edi_so_cntr_list_seq", "tmlEdiSoCntrListSeq");
		this.hashFields.put("wrk_dt", "wrkDt");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("tml_edi_so_ofc_cty_cd", "tmlEdiSoOfcCtyCd");
		this.hashFields.put("inv_gate_out_tm_msg", "invGateOutTmMsg");
		this.hashFields.put("call_sgn_no", "callSgnNo");
		this.hashFields.put("skd_voy_no", "skdVoyNo");
		this.hashFields.put("cust_ref_no_ctnt", "custRefNoCtnt");
		this.hashFields.put("io_bnd_cd", "ioBndCd");
		this.hashFields.put("skd_dir_cd", "skdDirCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("lloyd_no", "lloydNo");
		this.hashFields.put("cntr_sty_cd", "cntrStyCd");
		this.hashFields.put("cntr_no", "cntrNo");
		this.hashFields.put("ob_vvd_cd", "obVvdCd");
		this.hashFields.put("inv_vol_qty", "invVolQty");
		this.hashFields.put("tml_edi_so_seq", "tmlEdiSoSeq");
		this.hashFields.put("cntr_rmk", "cntrRmk");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return vslCd
	 */
	public String getVslCd() {
		return this.vslCd;
	}
	
	/**
	 * Column Info
	 * @return ibVvdCd
	 */
	public String getIbVvdCd() {
		return this.ibVvdCd;
	}
	
	/**
	 * Column Info
	 * @return imoNo
	 */
	public String getImoNo() {
		return this.imoNo;
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
	 * @return invGateInTmMsg
	 */
	public String getInvGateInTmMsg() {
		return this.invGateInTmMsg;
	}
	
	/**
	 * Column Info
	 * @return atbDt
	 */
	public String getAtbDt() {
		return this.atbDt;
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
	 * @return mtchModCd
	 */
	public String getMtchModCd() {
		return this.mtchModCd;
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
	 * @return cntrTpszCd
	 */
	public String getCntrTpszCd() {
		return this.cntrTpszCd;
	}
	
	/**
	 * Column Info
	 * @return tmlEdiSoCntrListSeq
	 */
	public String getTmlEdiSoCntrListSeq() {
		return this.tmlEdiSoCntrListSeq;
	}
	
	/**
	 * Column Info
	 * @return wrkDt
	 */
	public String getWrkDt() {
		return this.wrkDt;
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
	 * @return updDt
	 */
	public String getUpdDt() {
		return this.updDt;
	}
	
	/**
	 * Column Info
	 * @return tmlEdiSoOfcCtyCd
	 */
	public String getTmlEdiSoOfcCtyCd() {
		return this.tmlEdiSoOfcCtyCd;
	}
	
	/**
	 * Column Info
	 * @return invGateOutTmMsg
	 */
	public String getInvGateOutTmMsg() {
		return this.invGateOutTmMsg;
	}
	
	/**
	 * Column Info
	 * @return callSgnNo
	 */
	public String getCallSgnNo() {
		return this.callSgnNo;
	}
	
	/**
	 * Column Info
	 * @return skdVoyNo
	 */
	public String getSkdVoyNo() {
		return this.skdVoyNo;
	}
	
	/**
	 * Column Info
	 * @return custRefNoCtnt
	 */
	public String getCustRefNoCtnt() {
		return this.custRefNoCtnt;
	}
	
	/**
	 * Column Info
	 * @return ioBndCd
	 */
	public String getIoBndCd() {
		return this.ioBndCd;
	}
	
	/**
	 * Column Info
	 * @return skdDirCd
	 */
	public String getSkdDirCd() {
		return this.skdDirCd;
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
	 * @return lloydNo
	 */
	public String getLloydNo() {
		return this.lloydNo;
	}
	
	/**
	 * Column Info
	 * @return cntrStyCd
	 */
	public String getCntrStyCd() {
		return this.cntrStyCd;
	}
	
	/**
	 * Column Info
	 * @return cntrNo
	 */
	public String getCntrNo() {
		return this.cntrNo;
	}
	
	/**
	 * Column Info
	 * @return obVvdCd
	 */
	public String getObVvdCd() {
		return this.obVvdCd;
	}
	
	/**
	 * Column Info
	 * @return invVolQty
	 */
	public String getInvVolQty() {
		return this.invVolQty;
	}
	
	/**
	 * Column Info
	 * @return tmlEdiSoSeq
	 */
	public String getTmlEdiSoSeq() {
		return this.tmlEdiSoSeq;
	}
	
	/**
	 * Column Info
	 * @return cntrRmk
	 */
	public String getCntrRmk() {
		return this.cntrRmk;
	}
	

	/**
	 * Column Info
	 * @param vslCd
	 */
	public void setVslCd(String vslCd) {
		this.vslCd = vslCd;
	}
	
	/**
	 * Column Info
	 * @param ibVvdCd
	 */
	public void setIbVvdCd(String ibVvdCd) {
		this.ibVvdCd = ibVvdCd;
	}
	
	/**
	 * Column Info
	 * @param imoNo
	 */
	public void setImoNo(String imoNo) {
		this.imoNo = imoNo;
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
	 * @param invGateInTmMsg
	 */
	public void setInvGateInTmMsg(String invGateInTmMsg) {
		this.invGateInTmMsg = invGateInTmMsg;
	}
	
	/**
	 * Column Info
	 * @param atbDt
	 */
	public void setAtbDt(String atbDt) {
		this.atbDt = atbDt;
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
	 * @param mtchModCd
	 */
	public void setMtchModCd(String mtchModCd) {
		this.mtchModCd = mtchModCd;
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
	 * @param cntrTpszCd
	 */
	public void setCntrTpszCd(String cntrTpszCd) {
		this.cntrTpszCd = cntrTpszCd;
	}
	
	/**
	 * Column Info
	 * @param tmlEdiSoCntrListSeq
	 */
	public void setTmlEdiSoCntrListSeq(String tmlEdiSoCntrListSeq) {
		this.tmlEdiSoCntrListSeq = tmlEdiSoCntrListSeq;
	}
	
	/**
	 * Column Info
	 * @param wrkDt
	 */
	public void setWrkDt(String wrkDt) {
		this.wrkDt = wrkDt;
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
	 * @param updDt
	 */
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
	}
	
	/**
	 * Column Info
	 * @param tmlEdiSoOfcCtyCd
	 */
	public void setTmlEdiSoOfcCtyCd(String tmlEdiSoOfcCtyCd) {
		this.tmlEdiSoOfcCtyCd = tmlEdiSoOfcCtyCd;
	}
	
	/**
	 * Column Info
	 * @param invGateOutTmMsg
	 */
	public void setInvGateOutTmMsg(String invGateOutTmMsg) {
		this.invGateOutTmMsg = invGateOutTmMsg;
	}
	
	/**
	 * Column Info
	 * @param callSgnNo
	 */
	public void setCallSgnNo(String callSgnNo) {
		this.callSgnNo = callSgnNo;
	}
	
	/**
	 * Column Info
	 * @param skdVoyNo
	 */
	public void setSkdVoyNo(String skdVoyNo) {
		this.skdVoyNo = skdVoyNo;
	}
	
	/**
	 * Column Info
	 * @param custRefNoCtnt
	 */
	public void setCustRefNoCtnt(String custRefNoCtnt) {
		this.custRefNoCtnt = custRefNoCtnt;
	}
	
	/**
	 * Column Info
	 * @param ioBndCd
	 */
	public void setIoBndCd(String ioBndCd) {
		this.ioBndCd = ioBndCd;
	}
	
	/**
	 * Column Info
	 * @param skdDirCd
	 */
	public void setSkdDirCd(String skdDirCd) {
		this.skdDirCd = skdDirCd;
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
	 * @param lloydNo
	 */
	public void setLloydNo(String lloydNo) {
		this.lloydNo = lloydNo;
	}
	
	/**
	 * Column Info
	 * @param cntrStyCd
	 */
	public void setCntrStyCd(String cntrStyCd) {
		this.cntrStyCd = cntrStyCd;
	}
	
	/**
	 * Column Info
	 * @param cntrNo
	 */
	public void setCntrNo(String cntrNo) {
		this.cntrNo = cntrNo;
	}
	
	/**
	 * Column Info
	 * @param obVvdCd
	 */
	public void setObVvdCd(String obVvdCd) {
		this.obVvdCd = obVvdCd;
	}
	
	/**
	 * Column Info
	 * @param invVolQty
	 */
	public void setInvVolQty(String invVolQty) {
		this.invVolQty = invVolQty;
	}
	
	/**
	 * Column Info
	 * @param tmlEdiSoSeq
	 */
	public void setTmlEdiSoSeq(String tmlEdiSoSeq) {
		this.tmlEdiSoSeq = tmlEdiSoSeq;
	}
	
	/**
	 * Column Info
	 * @param cntrRmk
	 */
	public void setCntrRmk(String cntrRmk) {
		this.cntrRmk = cntrRmk;
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
		setVslCd(JSPUtil.getParameter(request, prefix + "vsl_cd", ""));
		setIbVvdCd(JSPUtil.getParameter(request, prefix + "ib_vvd_cd", ""));
		setImoNo(JSPUtil.getParameter(request, prefix + "imo_no", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setInvGateInTmMsg(JSPUtil.getParameter(request, prefix + "inv_gate_in_tm_msg", ""));
		setAtbDt(JSPUtil.getParameter(request, prefix + "atb_dt", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setMtchModCd(JSPUtil.getParameter(request, prefix + "mtch_mod_cd", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setCntrTpszCd(JSPUtil.getParameter(request, prefix + "cntr_tpsz_cd", ""));
		setTmlEdiSoCntrListSeq(JSPUtil.getParameter(request, prefix + "tml_edi_so_cntr_list_seq", ""));
		setWrkDt(JSPUtil.getParameter(request, prefix + "wrk_dt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setUpdDt(JSPUtil.getParameter(request, prefix + "upd_dt", ""));
		setTmlEdiSoOfcCtyCd(JSPUtil.getParameter(request, prefix + "tml_edi_so_ofc_cty_cd", ""));
		setInvGateOutTmMsg(JSPUtil.getParameter(request, prefix + "inv_gate_out_tm_msg", ""));
		setCallSgnNo(JSPUtil.getParameter(request, prefix + "call_sgn_no", ""));
		setSkdVoyNo(JSPUtil.getParameter(request, prefix + "skd_voy_no", ""));
		setCustRefNoCtnt(JSPUtil.getParameter(request, prefix + "cust_ref_no_ctnt", ""));
		setIoBndCd(JSPUtil.getParameter(request, prefix + "io_bnd_cd", ""));
		setSkdDirCd(JSPUtil.getParameter(request, prefix + "skd_dir_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setLloydNo(JSPUtil.getParameter(request, prefix + "lloyd_no", ""));
		setCntrStyCd(JSPUtil.getParameter(request, prefix + "cntr_sty_cd", ""));
		setCntrNo(JSPUtil.getParameter(request, prefix + "cntr_no", ""));
		setObVvdCd(JSPUtil.getParameter(request, prefix + "ob_vvd_cd", ""));
		setInvVolQty(JSPUtil.getParameter(request, prefix + "inv_vol_qty", ""));
		setTmlEdiSoSeq(JSPUtil.getParameter(request, prefix + "tml_edi_so_seq", ""));
		setCntrRmk(JSPUtil.getParameter(request, prefix + "cntr_rmk", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return TesEdiSoCntrListVO[]
	 */
	public TesEdiSoCntrListVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return TesEdiSoCntrListVO[]
	 */
	public TesEdiSoCntrListVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		TesEdiSoCntrListVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd", length));
			String[] ibVvdCd = (JSPUtil.getParameter(request, prefix	+ "ib_vvd_cd", length));
			String[] imoNo = (JSPUtil.getParameter(request, prefix	+ "imo_no", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] invGateInTmMsg = (JSPUtil.getParameter(request, prefix	+ "inv_gate_in_tm_msg", length));
			String[] atbDt = (JSPUtil.getParameter(request, prefix	+ "atb_dt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] mtchModCd = (JSPUtil.getParameter(request, prefix	+ "mtch_mod_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] cntrTpszCd = (JSPUtil.getParameter(request, prefix	+ "cntr_tpsz_cd", length));
			String[] tmlEdiSoCntrListSeq = (JSPUtil.getParameter(request, prefix	+ "tml_edi_so_cntr_list_seq", length));
			String[] wrkDt = (JSPUtil.getParameter(request, prefix	+ "wrk_dt", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] tmlEdiSoOfcCtyCd = (JSPUtil.getParameter(request, prefix	+ "tml_edi_so_ofc_cty_cd", length));
			String[] invGateOutTmMsg = (JSPUtil.getParameter(request, prefix	+ "inv_gate_out_tm_msg", length));
			String[] callSgnNo = (JSPUtil.getParameter(request, prefix	+ "call_sgn_no", length));
			String[] skdVoyNo = (JSPUtil.getParameter(request, prefix	+ "skd_voy_no", length));
			String[] custRefNoCtnt = (JSPUtil.getParameter(request, prefix	+ "cust_ref_no_ctnt", length));
			String[] ioBndCd = (JSPUtil.getParameter(request, prefix	+ "io_bnd_cd", length));
			String[] skdDirCd = (JSPUtil.getParameter(request, prefix	+ "skd_dir_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] lloydNo = (JSPUtil.getParameter(request, prefix	+ "lloyd_no", length));
			String[] cntrStyCd = (JSPUtil.getParameter(request, prefix	+ "cntr_sty_cd", length));
			String[] cntrNo = (JSPUtil.getParameter(request, prefix	+ "cntr_no", length));
			String[] obVvdCd = (JSPUtil.getParameter(request, prefix	+ "ob_vvd_cd", length));
			String[] invVolQty = (JSPUtil.getParameter(request, prefix	+ "inv_vol_qty", length));
			String[] tmlEdiSoSeq = (JSPUtil.getParameter(request, prefix	+ "tml_edi_so_seq", length));
			String[] cntrRmk = (JSPUtil.getParameter(request, prefix	+ "cntr_rmk", length));
			
			for (int i = 0; i < length; i++) {
				model = new TesEdiSoCntrListVO();
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (ibVvdCd[i] != null)
					model.setIbVvdCd(ibVvdCd[i]);
				if (imoNo[i] != null)
					model.setImoNo(imoNo[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (invGateInTmMsg[i] != null)
					model.setInvGateInTmMsg(invGateInTmMsg[i]);
				if (atbDt[i] != null)
					model.setAtbDt(atbDt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (mtchModCd[i] != null)
					model.setMtchModCd(mtchModCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (cntrTpszCd[i] != null)
					model.setCntrTpszCd(cntrTpszCd[i]);
				if (tmlEdiSoCntrListSeq[i] != null)
					model.setTmlEdiSoCntrListSeq(tmlEdiSoCntrListSeq[i]);
				if (wrkDt[i] != null)
					model.setWrkDt(wrkDt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (tmlEdiSoOfcCtyCd[i] != null)
					model.setTmlEdiSoOfcCtyCd(tmlEdiSoOfcCtyCd[i]);
				if (invGateOutTmMsg[i] != null)
					model.setInvGateOutTmMsg(invGateOutTmMsg[i]);
				if (callSgnNo[i] != null)
					model.setCallSgnNo(callSgnNo[i]);
				if (skdVoyNo[i] != null)
					model.setSkdVoyNo(skdVoyNo[i]);
				if (custRefNoCtnt[i] != null)
					model.setCustRefNoCtnt(custRefNoCtnt[i]);
				if (ioBndCd[i] != null)
					model.setIoBndCd(ioBndCd[i]);
				if (skdDirCd[i] != null)
					model.setSkdDirCd(skdDirCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (lloydNo[i] != null)
					model.setLloydNo(lloydNo[i]);
				if (cntrStyCd[i] != null)
					model.setCntrStyCd(cntrStyCd[i]);
				if (cntrNo[i] != null)
					model.setCntrNo(cntrNo[i]);
				if (obVvdCd[i] != null)
					model.setObVvdCd(obVvdCd[i]);
				if (invVolQty[i] != null)
					model.setInvVolQty(invVolQty[i]);
				if (tmlEdiSoSeq[i] != null)
					model.setTmlEdiSoSeq(tmlEdiSoSeq[i]);
				if (cntrRmk[i] != null)
					model.setCntrRmk(cntrRmk[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getTesEdiSoCntrListVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return TesEdiSoCntrListVO[]
	 */
	public TesEdiSoCntrListVO[] getTesEdiSoCntrListVOs(){
		TesEdiSoCntrListVO[] vos = (TesEdiSoCntrListVO[])models.toArray(new TesEdiSoCntrListVO[models.size()]);
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
		this.vslCd = this.vslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibVvdCd = this.ibVvdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.imoNo = this.imoNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invGateInTmMsg = this.invGateInTmMsg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.atbDt = this.atbDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mtchModCd = this.mtchModCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrTpszCd = this.cntrTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlEdiSoCntrListSeq = this.tmlEdiSoCntrListSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.wrkDt = this.wrkDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlEdiSoOfcCtyCd = this.tmlEdiSoOfcCtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invGateOutTmMsg = this.invGateOutTmMsg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.callSgnNo = this.callSgnNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdVoyNo = this.skdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custRefNoCtnt = this.custRefNoCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ioBndCd = this.ioBndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdDirCd = this.skdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lloydNo = this.lloydNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrStyCd = this.cntrStyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrNo = this.cntrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.obVvdCd = this.obVvdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invVolQty = this.invVolQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlEdiSoSeq = this.tmlEdiSoSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrRmk = this.cntrRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
