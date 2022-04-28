/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BkgDocProcSkdVO.java
*@FileTitle : BkgDocProcSkdVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.06.17
*@LastModifier : 김영출
*@LastVersion : 1.0
* 2009.06.17 김영출 
* 1.0 Creation
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
 * @author 김영출
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class BkgDocProcSkdVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgDocProcSkdVO> models = new ArrayList<BkgDocProcSkdVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String bkgNoSplit = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String bkgDocProcTpCd = null;
	/* Column Info */
	private String docPerfDeltFlg = null;
	/* Page Number */
	private String pagerows = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String bkgNo = null;
	/* Column Info */
	private String docProcSeq = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String diffRmk = null;
	/* Column Info */
	private String evntUsrId = null;
	/* Column Info */
	private String bkgEvntCd2 = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String bkgEvntCd1 = null;
	/* Column Info */
	private String evntDt = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgDocProcSkdVO() {}

	public BkgDocProcSkdVO(String ibflag, String pagerows, String bkgNo, String bkgNoSplit, String bkgDocProcTpCd, String docProcSeq, String evntDt, String evntUsrId, String diffRmk, String bkgEvntCd1, String bkgEvntCd2, String docPerfDeltFlg, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.bkgNoSplit = bkgNoSplit;
		this.creDt = creDt;
		this.bkgDocProcTpCd = bkgDocProcTpCd;
		this.docPerfDeltFlg = docPerfDeltFlg;
		this.pagerows = pagerows;
		this.ibflag = ibflag;
		this.bkgNo = bkgNo;
		this.docProcSeq = docProcSeq;
		this.creUsrId = creUsrId;
		this.diffRmk = diffRmk;
		this.evntUsrId = evntUsrId;
		this.bkgEvntCd2 = bkgEvntCd2;
		this.updUsrId = updUsrId;
		this.bkgEvntCd1 = bkgEvntCd1;
		this.evntDt = evntDt;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("bkg_no_split", getBkgNoSplit());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("bkg_doc_proc_tp_cd", getBkgDocProcTpCd());
		this.hashColumns.put("doc_perf_delt_flg", getDocPerfDeltFlg());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("bkg_no", getBkgNo());
		this.hashColumns.put("doc_proc_seq", getDocProcSeq());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("diff_rmk", getDiffRmk());
		this.hashColumns.put("evnt_usr_id", getEvntUsrId());
		this.hashColumns.put("bkg_evnt_cd2", getBkgEvntCd2());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("bkg_evnt_cd1", getBkgEvntCd1());
		this.hashColumns.put("evnt_dt", getEvntDt());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("bkg_no_split", "bkgNoSplit");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("bkg_doc_proc_tp_cd", "bkgDocProcTpCd");
		this.hashFields.put("doc_perf_delt_flg", "docPerfDeltFlg");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("doc_proc_seq", "docProcSeq");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("diff_rmk", "diffRmk");
		this.hashFields.put("evnt_usr_id", "evntUsrId");
		this.hashFields.put("bkg_evnt_cd2", "bkgEvntCd2");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("bkg_evnt_cd1", "bkgEvntCd1");
		this.hashFields.put("evnt_dt", "evntDt");
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
	 * @return bkgNoSplit
	 */
	public String getBkgNoSplit() {
		return this.bkgNoSplit;
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
	 * @return bkgDocProcTpCd
	 */
	public String getBkgDocProcTpCd() {
		return this.bkgDocProcTpCd;
	}
	
	/**
	 * Column Info
	 * @return docPerfDeltFlg
	 */
	public String getDocPerfDeltFlg() {
		return this.docPerfDeltFlg;
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
	 * @return bkgNo
	 */
	public String getBkgNo() {
		return this.bkgNo;
	}
	
	/**
	 * Column Info
	 * @return docProcSeq
	 */
	public String getDocProcSeq() {
		return this.docProcSeq;
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
	 * @return diffRmk
	 */
	public String getDiffRmk() {
		return this.diffRmk;
	}
	
	/**
	 * Column Info
	 * @return evntUsrId
	 */
	public String getEvntUsrId() {
		return this.evntUsrId;
	}
	
	/**
	 * Column Info
	 * @return bkgEvntCd2
	 */
	public String getBkgEvntCd2() {
		return this.bkgEvntCd2;
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
	 * @return bkgEvntCd1
	 */
	public String getBkgEvntCd1() {
		return this.bkgEvntCd1;
	}
	
	/**
	 * Column Info
	 * @return evntDt
	 */
	public String getEvntDt() {
		return this.evntDt;
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
	 * @param bkgNoSplit
	 */
	public void setBkgNoSplit(String bkgNoSplit) {
		this.bkgNoSplit = bkgNoSplit;
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
	 * @param bkgDocProcTpCd
	 */
	public void setBkgDocProcTpCd(String bkgDocProcTpCd) {
		this.bkgDocProcTpCd = bkgDocProcTpCd;
	}
	
	/**
	 * Column Info
	 * @param docPerfDeltFlg
	 */
	public void setDocPerfDeltFlg(String docPerfDeltFlg) {
		this.docPerfDeltFlg = docPerfDeltFlg;
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
	 * @param bkgNo
	 */
	public void setBkgNo(String bkgNo) {
		this.bkgNo = bkgNo;
	}
	
	/**
	 * Column Info
	 * @param docProcSeq
	 */
	public void setDocProcSeq(String docProcSeq) {
		this.docProcSeq = docProcSeq;
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
	 * @param diffRmk
	 */
	public void setDiffRmk(String diffRmk) {
		this.diffRmk = diffRmk;
	}
	
	/**
	 * Column Info
	 * @param evntUsrId
	 */
	public void setEvntUsrId(String evntUsrId) {
		this.evntUsrId = evntUsrId;
	}
	
	/**
	 * Column Info
	 * @param bkgEvntCd2
	 */
	public void setBkgEvntCd2(String bkgEvntCd2) {
		this.bkgEvntCd2 = bkgEvntCd2;
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
	 * @param bkgEvntCd1
	 */
	public void setBkgEvntCd1(String bkgEvntCd1) {
		this.bkgEvntCd1 = bkgEvntCd1;
	}
	
	/**
	 * Column Info
	 * @param evntDt
	 */
	public void setEvntDt(String evntDt) {
		this.evntDt = evntDt;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setBkgNoSplit(JSPUtil.getParameter(request, "bkg_no_split", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setBkgDocProcTpCd(JSPUtil.getParameter(request, "bkg_doc_proc_tp_cd", ""));
		setDocPerfDeltFlg(JSPUtil.getParameter(request, "doc_perf_delt_flg", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setBkgNo(JSPUtil.getParameter(request, "bkg_no", ""));
		setDocProcSeq(JSPUtil.getParameter(request, "doc_proc_seq", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setDiffRmk(JSPUtil.getParameter(request, "diff_rmk", ""));
		setEvntUsrId(JSPUtil.getParameter(request, "evnt_usr_id", ""));
		setBkgEvntCd2(JSPUtil.getParameter(request, "bkg_evnt_cd2", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setBkgEvntCd1(JSPUtil.getParameter(request, "bkg_evnt_cd1", ""));
		setEvntDt(JSPUtil.getParameter(request, "evnt_dt", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BkgDocProcSkdVO[]
	 */
	public BkgDocProcSkdVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgDocProcSkdVO[]
	 */
	public BkgDocProcSkdVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgDocProcSkdVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] bkgNoSplit = (JSPUtil.getParameter(request, prefix	+ "bkg_no_split", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] bkgDocProcTpCd = (JSPUtil.getParameter(request, prefix	+ "bkg_doc_proc_tp_cd", length));
			String[] docPerfDeltFlg = (JSPUtil.getParameter(request, prefix	+ "doc_perf_delt_flg", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no", length));
			String[] docProcSeq = (JSPUtil.getParameter(request, prefix	+ "doc_proc_seq", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] diffRmk = (JSPUtil.getParameter(request, prefix	+ "diff_rmk", length));
			String[] evntUsrId = (JSPUtil.getParameter(request, prefix	+ "evnt_usr_id", length));
			String[] bkgEvntCd2 = (JSPUtil.getParameter(request, prefix	+ "bkg_evnt_cd2", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] bkgEvntCd1 = (JSPUtil.getParameter(request, prefix	+ "bkg_evnt_cd1", length));
			String[] evntDt = (JSPUtil.getParameter(request, prefix	+ "evnt_dt", length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgDocProcSkdVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (bkgNoSplit[i] != null)
					model.setBkgNoSplit(bkgNoSplit[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (bkgDocProcTpCd[i] != null)
					model.setBkgDocProcTpCd(bkgDocProcTpCd[i]);
				if (docPerfDeltFlg[i] != null)
					model.setDocPerfDeltFlg(docPerfDeltFlg[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (docProcSeq[i] != null)
					model.setDocProcSeq(docProcSeq[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (diffRmk[i] != null)
					model.setDiffRmk(diffRmk[i]);
				if (evntUsrId[i] != null)
					model.setEvntUsrId(evntUsrId[i]);
				if (bkgEvntCd2[i] != null)
					model.setBkgEvntCd2(bkgEvntCd2[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (bkgEvntCd1[i] != null)
					model.setBkgEvntCd1(bkgEvntCd1[i]);
				if (evntDt[i] != null)
					model.setEvntDt(evntDt[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgDocProcSkdVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BkgDocProcSkdVO[]
	 */
	public BkgDocProcSkdVO[] getBkgDocProcSkdVOs(){
		BkgDocProcSkdVO[] vos = (BkgDocProcSkdVO[])models.toArray(new BkgDocProcSkdVO[models.size()]);
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
		this.bkgNoSplit = this.bkgNoSplit .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgDocProcTpCd = this.bkgDocProcTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.docPerfDeltFlg = this.docPerfDeltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNo = this.bkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.docProcSeq = this.docProcSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.diffRmk = this.diffRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.evntUsrId = this.evntUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgEvntCd2 = this.bkgEvntCd2 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgEvntCd1 = this.bkgEvntCd1 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.evntDt = this.evntDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
