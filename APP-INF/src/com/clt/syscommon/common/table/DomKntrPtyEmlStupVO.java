/*=========================================================
*Copyright(c) 2018 CyberLogitec
*@FileName : DomKntrPtyEmlStupVO.java
*@FileTitle : DomKntrPtyEmlStupVO
*Open Issues :
*Change history :
*@LastModifyDate : 2018.10.05
*@LastModifier : 
*@LastVersion : 1.0
* 2018.10.05  
* 1.0 Creation
=========================================================*/

package com.clt.syscommon.common.table;

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
 * 관련 Event 에서 생성, 서버실행요청시 Data 전달역할을 수행하는 Value Object
 *
 * @author
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class DomKntrPtyEmlStupVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;

	private Collection<DomKntrPtyEmlStupVO> models = new ArrayList<DomKntrPtyEmlStupVO>();

	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String bodCtnt = null;
	/* Column Info */
	private String cntcPsonEmlCtnt = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String dmstKntrPtySeq = null;
	/* Column Info */
	private String dmstKntrPtyEmlStupSeq = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String ccEmlCtnt = null;
	/* Column Info */
	private String dmstEmlKndCd = null;
	/* Column Info */
	private String dmstKntrPtyCd = null;
	/* Column Info */
	private String edwUpdDt = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String sndFlg = null;

	/* 테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new LinkedHashMap<String, String>();

	/* 테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new LinkedHashMap<String, String>();

	public DomKntrPtyEmlStupVO() {
	}

	public DomKntrPtyEmlStupVO(String ibflag, String pagerows, String dmstKntrPtyCd, String dmstKntrPtySeq, String dmstEmlKndCd, String dmstKntrPtyEmlStupSeq, String cntcPsonEmlCtnt, String ccEmlCtnt,
			String bodCtnt, String creUsrId, String creDt, String updUsrId, String updDt, String edwUpdDt, String sndFlg) {
		this.pagerows = pagerows;
		this.bodCtnt = bodCtnt;
		this.cntcPsonEmlCtnt = cntcPsonEmlCtnt;
		this.ibflag = ibflag;
		this.dmstKntrPtySeq = dmstKntrPtySeq;
		this.dmstKntrPtyEmlStupSeq = dmstKntrPtyEmlStupSeq;
		this.updUsrId = updUsrId;
		this.creUsrId = creUsrId;
		this.creDt = creDt;
		this.ccEmlCtnt = ccEmlCtnt;
		this.dmstEmlKndCd = dmstEmlKndCd;
		this.dmstKntrPtyCd = dmstKntrPtyCd;
		this.edwUpdDt = edwUpdDt;
		this.updDt = updDt;
		this.sndFlg = sndFlg;
	}

	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * 
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues() {
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("bod_ctnt", getBodCtnt());
		this.hashColumns.put("cntc_pson_eml_ctnt", getCntcPsonEmlCtnt());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("dmst_kntr_pty_seq", getDmstKntrPtySeq());
		this.hashColumns.put("dmst_kntr_pty_eml_stup_seq", getDmstKntrPtyEmlStupSeq());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("cc_eml_ctnt", getCcEmlCtnt());
		this.hashColumns.put("dmst_eml_knd_cd", getDmstEmlKndCd());
		this.hashColumns.put("dmst_kntr_pty_cd", getDmstKntrPtyCd());
		this.hashColumns.put("edw_upd_dt", getEdwUpdDt());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("snd_flg", getSndFlg());
		return this.hashColumns;
	}

	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환
	 * 
	 * @return
	 */
	public HashMap<String, String> getFieldNames() {
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("bod_ctnt", "bodCtnt");
		this.hashFields.put("cntc_pson_eml_ctnt", "cntcPsonEmlCtnt");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("dmst_kntr_pty_seq", "dmstKntrPtySeq");
		this.hashFields.put("dmst_kntr_pty_eml_stup_seq", "dmstKntrPtyEmlStupSeq");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("cc_eml_ctnt", "ccEmlCtnt");
		this.hashFields.put("dmst_eml_knd_cd", "dmstEmlKndCd");
		this.hashFields.put("dmst_kntr_pty_cd", "dmstKntrPtyCd");
		this.hashFields.put("edw_upd_dt", "edwUpdDt");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("snd_flg", "sndFlg");
		return this.hashFields;
	}

	/**
	 * Page Number
	 * 
	 * @return pagerows
	 */
	public String getPagerows() {
		return this.pagerows;
	}

	/**
	 * Column Info
	 * 
	 * @return bodCtnt
	 */
	public String getBodCtnt() {
		return this.bodCtnt;
	}

	/**
	 * Column Info
	 * 
	 * @return cntcPsonEmlCtnt
	 */
	public String getCntcPsonEmlCtnt() {
		return this.cntcPsonEmlCtnt;
	}

	/**
	 * VO Data Value( C:Creation, U:Update, D:Delete )
	 * 
	 * @return ibflag
	 */
	public String getIbflag() {
		return this.ibflag;
	}

	/**
	 * Column Info
	 * 
	 * @return dmstKntrPtySeq
	 */
	public String getDmstKntrPtySeq() {
		return this.dmstKntrPtySeq;
	}

	/**
	 * Column Info
	 * 
	 * @return dmstKntrPtyEmlStupSeq
	 */
	public String getDmstKntrPtyEmlStupSeq() {
		return this.dmstKntrPtyEmlStupSeq;
	}

	/**
	 * Column Info
	 * 
	 * @return updUsrId
	 */
	public String getUpdUsrId() {
		return this.updUsrId;
	}

	/**
	 * Column Info
	 * 
	 * @return creUsrId
	 */
	public String getCreUsrId() {
		return this.creUsrId;
	}

	/**
	 * Column Info
	 * 
	 * @return creDt
	 */
	public String getCreDt() {
		return this.creDt;
	}

	/**
	 * Column Info
	 * 
	 * @return ccEmlCtnt
	 */
	public String getCcEmlCtnt() {
		return this.ccEmlCtnt;
	}

	/**
	 * Column Info
	 * 
	 * @return dmstEmlKndCd
	 */
	public String getDmstEmlKndCd() {
		return this.dmstEmlKndCd;
	}

	/**
	 * Column Info
	 * 
	 * @return dmstKntrPtyCd
	 */
	public String getDmstKntrPtyCd() {
		return this.dmstKntrPtyCd;
	}

	/**
	 * Column Info
	 * 
	 * @return edwUpdDt
	 */
	public String getEdwUpdDt() {
		return this.edwUpdDt;
	}

	/**
	 * Column Info
	 * 
	 * @return updDt
	 */
	public String getUpdDt() {
		return this.updDt;
	}

	/**
	 * Column Info
	 * 
	 * @return sndFlg
	 */

	public String getSndFlg() {
		return sndFlg;
	}

	/**
	 * Page Number
	 * 
	 * @param pagerows
	 */
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
	}

	/**
	 * Column Info
	 * 
	 * @param bodCtnt
	 */
	public void setBodCtnt(String bodCtnt) {
		this.bodCtnt = bodCtnt;
	}

	/**
	 * Column Info
	 * 
	 * @param cntcPsonEmlCtnt
	 */
	public void setCntcPsonEmlCtnt(String cntcPsonEmlCtnt) {
		this.cntcPsonEmlCtnt = cntcPsonEmlCtnt;
	}

	/**
	 * VO Data Value( C:Creation, U:Update, D:Delete )
	 * 
	 * @param ibflag
	 */
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
	}

	/**
	 * Column Info
	 * 
	 * @param dmstKntrPtySeq
	 */
	public void setDmstKntrPtySeq(String dmstKntrPtySeq) {
		this.dmstKntrPtySeq = dmstKntrPtySeq;
	}

	/**
	 * Column Info
	 * 
	 * @param dmstKntrPtyEmlStupSeq
	 */
	public void setDmstKntrPtyEmlStupSeq(String dmstKntrPtyEmlStupSeq) {
		this.dmstKntrPtyEmlStupSeq = dmstKntrPtyEmlStupSeq;
	}

	/**
	 * Column Info
	 * 
	 * @param updUsrId
	 */
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
	}

	/**
	 * Column Info
	 * 
	 * @param creUsrId
	 */
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
	}

	/**
	 * Column Info
	 * 
	 * @param creDt
	 */
	public void setCreDt(String creDt) {
		this.creDt = creDt;
	}

	/**
	 * Column Info
	 * 
	 * @param ccEmlCtnt
	 */
	public void setCcEmlCtnt(String ccEmlCtnt) {
		this.ccEmlCtnt = ccEmlCtnt;
	}

	/**
	 * Column Info
	 * 
	 * @param dmstEmlKndCd
	 */
	public void setDmstEmlKndCd(String dmstEmlKndCd) {
		this.dmstEmlKndCd = dmstEmlKndCd;
	}

	/**
	 * Column Info
	 * 
	 * @param dmstKntrPtyCd
	 */
	public void setDmstKntrPtyCd(String dmstKntrPtyCd) {
		this.dmstKntrPtyCd = dmstKntrPtyCd;
	}

	/**
	 * Column Info
	 * 
	 * @param edwUpdDt
	 */
	public void setEdwUpdDt(String edwUpdDt) {
		this.edwUpdDt = edwUpdDt;
	}

	/**
	 * Column Info
	 * 
	 * @param updDt
	 */
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
	}

	/**
	 * Column Info
	 * 
	 * @param sndFlg
	 */
	public void setSndFlg(String sndFlg) {
		this.sndFlg = sndFlg;
	}

	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * 
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		fromRequest(request, "");
	}

	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * 
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request, String prefix) {
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setBodCtnt(JSPUtil.getParameter(request, prefix + "bod_ctnt", ""));
		setCntcPsonEmlCtnt(JSPUtil.getParameter(request, prefix + "cntc_pson_eml_ctnt", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setDmstKntrPtySeq(JSPUtil.getParameter(request, prefix + "dmst_kntr_pty_seq", ""));
		setDmstKntrPtyEmlStupSeq(JSPUtil.getParameter(request, prefix + "dmst_kntr_pty_eml_stup_seq", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setCcEmlCtnt(JSPUtil.getParameter(request, prefix + "cc_eml_ctnt", ""));
		setDmstEmlKndCd(JSPUtil.getParameter(request, prefix + "dmst_eml_knd_cd", ""));
		setDmstKntrPtyCd(JSPUtil.getParameter(request, prefix + "dmst_kntr_pty_cd", ""));
		setEdwUpdDt(JSPUtil.getParameter(request, prefix + "edw_upd_dt", ""));
		setUpdDt(JSPUtil.getParameter(request, prefix + "upd_dt", ""));
		setSndFlg(JSPUtil.getParameter(request, prefix + "snd_flg", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * 
	 * @param request
	 * @return DomKntrPtyEmlStupVO[]
	 */
	public DomKntrPtyEmlStupVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다.
	 * 
	 * @param request
	 * @param prefix
	 * @return DomKntrPtyEmlStupVO[]
	 */
	public DomKntrPtyEmlStupVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		DomKntrPtyEmlStupVO model = null;

		String[] tmp = request.getParameterValues(prefix + "ibflag");
		if (tmp == null)
			return null;

		int length = request.getParameterValues(prefix + "ibflag").length;

		try {
			String[] pagerows = (JSPUtil.getParameter(request, prefix + "pagerows", length));
			String[] bodCtnt = (JSPUtil.getParameter(request, prefix + "bod_ctnt", length));
			String[] cntcPsonEmlCtnt = (JSPUtil.getParameter(request, prefix + "cntc_pson_eml_ctnt", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix + "ibflag", length));
			String[] dmstKntrPtySeq = (JSPUtil.getParameter(request, prefix + "dmst_kntr_pty_seq", length));
			String[] dmstKntrPtyEmlStupSeq = (JSPUtil.getParameter(request, prefix + "dmst_kntr_pty_eml_stup_seq", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix + "upd_usr_id", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix + "cre_usr_id", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix + "cre_dt", length));
			String[] ccEmlCtnt = (JSPUtil.getParameter(request, prefix + "cc_eml_ctnt", length));
			String[] dmstEmlKndCd = (JSPUtil.getParameter(request, prefix + "dmst_eml_knd_cd", length));
			String[] dmstKntrPtyCd = (JSPUtil.getParameter(request, prefix + "dmst_kntr_pty_cd", length));
			String[] edwUpdDt = (JSPUtil.getParameter(request, prefix + "edw_upd_dt", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix + "upd_dt", length));
			String[] sndFlg = (JSPUtil.getParameter(request, prefix + "snd_flg", length));

			for (int i = 0; i < length; i++) {
				model = new DomKntrPtyEmlStupVO();
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (bodCtnt[i] != null)
					model.setBodCtnt(bodCtnt[i]);
				if (cntcPsonEmlCtnt[i] != null)
					model.setCntcPsonEmlCtnt(cntcPsonEmlCtnt[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (dmstKntrPtySeq[i] != null)
					model.setDmstKntrPtySeq(dmstKntrPtySeq[i]);
				if (dmstKntrPtyEmlStupSeq[i] != null)
					model.setDmstKntrPtyEmlStupSeq(dmstKntrPtyEmlStupSeq[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (ccEmlCtnt[i] != null)
					model.setCcEmlCtnt(ccEmlCtnt[i]);
				if (dmstEmlKndCd[i] != null)
					model.setDmstEmlKndCd(dmstEmlKndCd[i]);
				if (dmstKntrPtyCd[i] != null)
					model.setDmstKntrPtyCd(dmstKntrPtyCd[i]);
				if (edwUpdDt[i] != null)
					model.setEdwUpdDt(edwUpdDt[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (sndFlg[i] != null)
					model.setSndFlg(sndFlg[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getDomKntrPtyEmlStupVOs();
	}

	/**
	 * VO 배열을 반환
	 * 
	 * @return DomKntrPtyEmlStupVO[]
	 */
	public DomKntrPtyEmlStupVO[] getDomKntrPtyEmlStupVOs() {
		DomKntrPtyEmlStupVO[] vos = (DomKntrPtyEmlStupVO[]) models.toArray(new DomKntrPtyEmlStupVO[models.size()]);
		return vos;
	}

	/**
	 * VO Class의 내용을 String으로 변환
	 */
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
	}

	/**
	 * 포맷팅된 문자열에서 특수문자 제거("-","/",",",":")
	 */
	public void unDataFormat() {
		this.pagerows = this.pagerows.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bodCtnt = this.bodCtnt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntcPsonEmlCtnt = this.cntcPsonEmlCtnt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dmstKntrPtySeq = this.dmstKntrPtySeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dmstKntrPtyEmlStupSeq = this.dmstKntrPtyEmlStupSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ccEmlCtnt = this.ccEmlCtnt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dmstEmlKndCd = this.dmstEmlKndCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dmstKntrPtyCd = this.dmstKntrPtyCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.edwUpdDt = this.edwUpdDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sndFlg = this.sndFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
