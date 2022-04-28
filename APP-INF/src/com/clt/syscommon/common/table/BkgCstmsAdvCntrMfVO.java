/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : BkgCstmsAdvCntrMfVO.java
*@FileTitle : BkgCstmsAdvCntrMfVO
*Open Issues :
*Change history :
*@LastModifyDate : 2010.03.15
*@LastModifier : 김민정
*@LastVersion : 1.0
* 2010.03.15 김민정 
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
 * @author 김민정
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class BkgCstmsAdvCntrMfVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgCstmsAdvCntrMfVO> models = new ArrayList<BkgCstmsAdvCntrMfVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String pinUsrId = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String priorNtcRmk = null;
	/* Column Info */
	private String cmdtGdsSeq = null;
	/* Column Info */
	private String hamoCmdtCd = null;
	/* Column Info */
	private String blNo = null;
	/* Column Info */
	private String mkDesc = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String cgoDesc = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String priorNtcCfmFlg = null;
	/* Column Info */
	private String priorNtcSndFlg = null;
	/* Column Info */
	private String cntrNo = null;
	/* Column Info */
	private String cntCd = null;
	/* Column Info */
	private String amsPckTpCd = null;
	/* Column Info */
	private String wgtUtCd = null;
	/* Column Info */
	private String priorNtcCfmDt = null;
	/* Column Info */
	private String pckQty = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String grsWgt = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgCstmsAdvCntrMfVO() {}

	public BkgCstmsAdvCntrMfVO(String ibflag, String pagerows, String cntCd, String blNo, String cntrNo, String cmdtGdsSeq, String pckQty, String amsPckTpCd, String grsWgt, String wgtUtCd, String hamoCmdtCd, String mkDesc, String cgoDesc, String priorNtcSndFlg, String priorNtcCfmFlg, String priorNtcCfmDt, String priorNtcRmk, String pinUsrId, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.pinUsrId = pinUsrId;
		this.creDt = creDt;
		this.priorNtcRmk = priorNtcRmk;
		this.cmdtGdsSeq = cmdtGdsSeq;
		this.hamoCmdtCd = hamoCmdtCd;
		this.blNo = blNo;
		this.mkDesc = mkDesc;
		this.pagerows = pagerows;
		this.cgoDesc = cgoDesc;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.priorNtcCfmFlg = priorNtcCfmFlg;
		this.priorNtcSndFlg = priorNtcSndFlg;
		this.cntrNo = cntrNo;
		this.cntCd = cntCd;
		this.amsPckTpCd = amsPckTpCd;
		this.wgtUtCd = wgtUtCd;
		this.priorNtcCfmDt = priorNtcCfmDt;
		this.pckQty = pckQty;
		this.updUsrId = updUsrId;
		this.grsWgt = grsWgt;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("pin_usr_id", getPinUsrId());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("prior_ntc_rmk", getPriorNtcRmk());
		this.hashColumns.put("cmdt_gds_seq", getCmdtGdsSeq());
		this.hashColumns.put("hamo_cmdt_cd", getHamoCmdtCd());
		this.hashColumns.put("bl_no", getBlNo());
		this.hashColumns.put("mk_desc", getMkDesc());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("cgo_desc", getCgoDesc());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("prior_ntc_cfm_flg", getPriorNtcCfmFlg());
		this.hashColumns.put("prior_ntc_snd_flg", getPriorNtcSndFlg());
		this.hashColumns.put("cntr_no", getCntrNo());
		this.hashColumns.put("cnt_cd", getCntCd());
		this.hashColumns.put("ams_pck_tp_cd", getAmsPckTpCd());
		this.hashColumns.put("wgt_ut_cd", getWgtUtCd());
		this.hashColumns.put("prior_ntc_cfm_dt", getPriorNtcCfmDt());
		this.hashColumns.put("pck_qty", getPckQty());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("grs_wgt", getGrsWgt());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("pin_usr_id", "pinUsrId");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("prior_ntc_rmk", "priorNtcRmk");
		this.hashFields.put("cmdt_gds_seq", "cmdtGdsSeq");
		this.hashFields.put("hamo_cmdt_cd", "hamoCmdtCd");
		this.hashFields.put("bl_no", "blNo");
		this.hashFields.put("mk_desc", "mkDesc");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("cgo_desc", "cgoDesc");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("prior_ntc_cfm_flg", "priorNtcCfmFlg");
		this.hashFields.put("prior_ntc_snd_flg", "priorNtcSndFlg");
		this.hashFields.put("cntr_no", "cntrNo");
		this.hashFields.put("cnt_cd", "cntCd");
		this.hashFields.put("ams_pck_tp_cd", "amsPckTpCd");
		this.hashFields.put("wgt_ut_cd", "wgtUtCd");
		this.hashFields.put("prior_ntc_cfm_dt", "priorNtcCfmDt");
		this.hashFields.put("pck_qty", "pckQty");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("grs_wgt", "grsWgt");
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
	 * @return pinUsrId
	 */
	public String getPinUsrId() {
		return this.pinUsrId;
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
	 * @return priorNtcRmk
	 */
	public String getPriorNtcRmk() {
		return this.priorNtcRmk;
	}
	
	/**
	 * Column Info
	 * @return cmdtGdsSeq
	 */
	public String getCmdtGdsSeq() {
		return this.cmdtGdsSeq;
	}
	
	/**
	 * Column Info
	 * @return hamoCmdtCd
	 */
	public String getHamoCmdtCd() {
		return this.hamoCmdtCd;
	}
	
	/**
	 * Column Info
	 * @return blNo
	 */
	public String getBlNo() {
		return this.blNo;
	}
	
	/**
	 * Column Info
	 * @return mkDesc
	 */
	public String getMkDesc() {
		return this.mkDesc;
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
	 * @return cgoDesc
	 */
	public String getCgoDesc() {
		return this.cgoDesc;
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
	 * @return priorNtcCfmFlg
	 */
	public String getPriorNtcCfmFlg() {
		return this.priorNtcCfmFlg;
	}
	
	/**
	 * Column Info
	 * @return priorNtcSndFlg
	 */
	public String getPriorNtcSndFlg() {
		return this.priorNtcSndFlg;
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
	 * @return cntCd
	 */
	public String getCntCd() {
		return this.cntCd;
	}
	
	/**
	 * Column Info
	 * @return amsPckTpCd
	 */
	public String getAmsPckTpCd() {
		return this.amsPckTpCd;
	}
	
	/**
	 * Column Info
	 * @return wgtUtCd
	 */
	public String getWgtUtCd() {
		return this.wgtUtCd;
	}
	
	/**
	 * Column Info
	 * @return priorNtcCfmDt
	 */
	public String getPriorNtcCfmDt() {
		return this.priorNtcCfmDt;
	}
	
	/**
	 * Column Info
	 * @return pckQty
	 */
	public String getPckQty() {
		return this.pckQty;
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
	 * @return grsWgt
	 */
	public String getGrsWgt() {
		return this.grsWgt;
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
	 * @param pinUsrId
	 */
	public void setPinUsrId(String pinUsrId) {
		this.pinUsrId = pinUsrId;
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
	 * @param priorNtcRmk
	 */
	public void setPriorNtcRmk(String priorNtcRmk) {
		this.priorNtcRmk = priorNtcRmk;
	}
	
	/**
	 * Column Info
	 * @param cmdtGdsSeq
	 */
	public void setCmdtGdsSeq(String cmdtGdsSeq) {
		this.cmdtGdsSeq = cmdtGdsSeq;
	}
	
	/**
	 * Column Info
	 * @param hamoCmdtCd
	 */
	public void setHamoCmdtCd(String hamoCmdtCd) {
		this.hamoCmdtCd = hamoCmdtCd;
	}
	
	/**
	 * Column Info
	 * @param blNo
	 */
	public void setBlNo(String blNo) {
		this.blNo = blNo;
	}
	
	/**
	 * Column Info
	 * @param mkDesc
	 */
	public void setMkDesc(String mkDesc) {
		this.mkDesc = mkDesc;
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
	 * @param cgoDesc
	 */
	public void setCgoDesc(String cgoDesc) {
		this.cgoDesc = cgoDesc;
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
	 * @param priorNtcCfmFlg
	 */
	public void setPriorNtcCfmFlg(String priorNtcCfmFlg) {
		this.priorNtcCfmFlg = priorNtcCfmFlg;
	}
	
	/**
	 * Column Info
	 * @param priorNtcSndFlg
	 */
	public void setPriorNtcSndFlg(String priorNtcSndFlg) {
		this.priorNtcSndFlg = priorNtcSndFlg;
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
	 * @param cntCd
	 */
	public void setCntCd(String cntCd) {
		this.cntCd = cntCd;
	}
	
	/**
	 * Column Info
	 * @param amsPckTpCd
	 */
	public void setAmsPckTpCd(String amsPckTpCd) {
		this.amsPckTpCd = amsPckTpCd;
	}
	
	/**
	 * Column Info
	 * @param wgtUtCd
	 */
	public void setWgtUtCd(String wgtUtCd) {
		this.wgtUtCd = wgtUtCd;
	}
	
	/**
	 * Column Info
	 * @param priorNtcCfmDt
	 */
	public void setPriorNtcCfmDt(String priorNtcCfmDt) {
		this.priorNtcCfmDt = priorNtcCfmDt;
	}
	
	/**
	 * Column Info
	 * @param pckQty
	 */
	public void setPckQty(String pckQty) {
		this.pckQty = pckQty;
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
	 * @param grsWgt
	 */
	public void setGrsWgt(String grsWgt) {
		this.grsWgt = grsWgt;
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
		setUpdDt(JSPUtil.getParameter(request, prefix + "upd_dt", ""));
		setPinUsrId(JSPUtil.getParameter(request, prefix + "pin_usr_id", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setPriorNtcRmk(JSPUtil.getParameter(request, prefix + "prior_ntc_rmk", ""));
		setCmdtGdsSeq(JSPUtil.getParameter(request, prefix + "cmdt_gds_seq", ""));
		setHamoCmdtCd(JSPUtil.getParameter(request, prefix + "hamo_cmdt_cd", ""));
		setBlNo(JSPUtil.getParameter(request, prefix + "bl_no", ""));
		setMkDesc(JSPUtil.getParameter(request, prefix + "mk_desc", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setCgoDesc(JSPUtil.getParameter(request, prefix + "cgo_desc", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setPriorNtcCfmFlg(JSPUtil.getParameter(request, prefix + "prior_ntc_cfm_flg", ""));
		setPriorNtcSndFlg(JSPUtil.getParameter(request, prefix + "prior_ntc_snd_flg", ""));
		setCntrNo(JSPUtil.getParameter(request, prefix + "cntr_no", ""));
		setCntCd(JSPUtil.getParameter(request, prefix + "cnt_cd", ""));
		setAmsPckTpCd(JSPUtil.getParameter(request, prefix + "ams_pck_tp_cd", ""));
		setWgtUtCd(JSPUtil.getParameter(request, prefix + "wgt_ut_cd", ""));
		setPriorNtcCfmDt(JSPUtil.getParameter(request, prefix + "prior_ntc_cfm_dt", ""));
		setPckQty(JSPUtil.getParameter(request, prefix + "pck_qty", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setGrsWgt(JSPUtil.getParameter(request, prefix + "grs_wgt", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BkgCstmsAdvCntrMfVO[]
	 */
	public BkgCstmsAdvCntrMfVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgCstmsAdvCntrMfVO[]
	 */
	public BkgCstmsAdvCntrMfVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgCstmsAdvCntrMfVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] pinUsrId = (JSPUtil.getParameter(request, prefix	+ "pin_usr_id", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] priorNtcRmk = (JSPUtil.getParameter(request, prefix	+ "prior_ntc_rmk", length));
			String[] cmdtGdsSeq = (JSPUtil.getParameter(request, prefix	+ "cmdt_gds_seq", length));
			String[] hamoCmdtCd = (JSPUtil.getParameter(request, prefix	+ "hamo_cmdt_cd", length));
			String[] blNo = (JSPUtil.getParameter(request, prefix	+ "bl_no", length));
			String[] mkDesc = (JSPUtil.getParameter(request, prefix	+ "mk_desc", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] cgoDesc = (JSPUtil.getParameter(request, prefix	+ "cgo_desc", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] priorNtcCfmFlg = (JSPUtil.getParameter(request, prefix	+ "prior_ntc_cfm_flg", length));
			String[] priorNtcSndFlg = (JSPUtil.getParameter(request, prefix	+ "prior_ntc_snd_flg", length));
			String[] cntrNo = (JSPUtil.getParameter(request, prefix	+ "cntr_no", length));
			String[] cntCd = (JSPUtil.getParameter(request, prefix	+ "cnt_cd", length));
			String[] amsPckTpCd = (JSPUtil.getParameter(request, prefix	+ "ams_pck_tp_cd", length));
			String[] wgtUtCd = (JSPUtil.getParameter(request, prefix	+ "wgt_ut_cd", length));
			String[] priorNtcCfmDt = (JSPUtil.getParameter(request, prefix	+ "prior_ntc_cfm_dt", length));
			String[] pckQty = (JSPUtil.getParameter(request, prefix	+ "pck_qty", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] grsWgt = (JSPUtil.getParameter(request, prefix	+ "grs_wgt", length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgCstmsAdvCntrMfVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (pinUsrId[i] != null)
					model.setPinUsrId(pinUsrId[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (priorNtcRmk[i] != null)
					model.setPriorNtcRmk(priorNtcRmk[i]);
				if (cmdtGdsSeq[i] != null)
					model.setCmdtGdsSeq(cmdtGdsSeq[i]);
				if (hamoCmdtCd[i] != null)
					model.setHamoCmdtCd(hamoCmdtCd[i]);
				if (blNo[i] != null)
					model.setBlNo(blNo[i]);
				if (mkDesc[i] != null)
					model.setMkDesc(mkDesc[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (cgoDesc[i] != null)
					model.setCgoDesc(cgoDesc[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (priorNtcCfmFlg[i] != null)
					model.setPriorNtcCfmFlg(priorNtcCfmFlg[i]);
				if (priorNtcSndFlg[i] != null)
					model.setPriorNtcSndFlg(priorNtcSndFlg[i]);
				if (cntrNo[i] != null)
					model.setCntrNo(cntrNo[i]);
				if (cntCd[i] != null)
					model.setCntCd(cntCd[i]);
				if (amsPckTpCd[i] != null)
					model.setAmsPckTpCd(amsPckTpCd[i]);
				if (wgtUtCd[i] != null)
					model.setWgtUtCd(wgtUtCd[i]);
				if (priorNtcCfmDt[i] != null)
					model.setPriorNtcCfmDt(priorNtcCfmDt[i]);
				if (pckQty[i] != null)
					model.setPckQty(pckQty[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (grsWgt[i] != null)
					model.setGrsWgt(grsWgt[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgCstmsAdvCntrMfVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BkgCstmsAdvCntrMfVO[]
	 */
	public BkgCstmsAdvCntrMfVO[] getBkgCstmsAdvCntrMfVOs(){
		BkgCstmsAdvCntrMfVO[] vos = (BkgCstmsAdvCntrMfVO[])models.toArray(new BkgCstmsAdvCntrMfVO[models.size()]);
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
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pinUsrId = this.pinUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.priorNtcRmk = this.priorNtcRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cmdtGdsSeq = this.cmdtGdsSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hamoCmdtCd = this.hamoCmdtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blNo = this.blNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mkDesc = this.mkDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cgoDesc = this.cgoDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.priorNtcCfmFlg = this.priorNtcCfmFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.priorNtcSndFlg = this.priorNtcSndFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrNo = this.cntrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntCd = this.cntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.amsPckTpCd = this.amsPckTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.wgtUtCd = this.wgtUtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.priorNtcCfmDt = this.priorNtcCfmDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pckQty = this.pckQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.grsWgt = this.grsWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
