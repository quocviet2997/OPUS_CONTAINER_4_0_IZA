/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : SearchCntrTtlCntKorVO.java
*@FileTitle : SearchCntrTtlCntKorVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.29
*@LastModifier : 손윤석
*@LastVersion : 1.0
* 2009.05.29 손윤석 
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
 * @author 손윤석
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class BkgCstmsKrCntrVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgCstmsKrCntrVO> models = new ArrayList<BkgCstmsKrCntrVO>();
	
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String cnt = null;
	/* Page Number */
	
	private String bkg_no = null;
    private String bkg_no_split = null;
    private String expt_kcd_tp = null;
    private String kcd_tp = null;
    private String kt_seq = null;
    private String cntr_no = null;
    private String fe_ind = null;
    private String seal_no = null;
    private String cntrts_cd = null;
    private String cntr_pkg_qty = null;
    private String cntr_pkg_cd = null;
    private String cntr_wgt_qty = null;
    private String cntr_wgt_tp = null;
    private String cntr_mea_qty = null;
    private String cntr_mea_tp = null;
    private String kt_port = null;
    private String tr_cd = null;
    private String username = null;
    private String vsl_cd = null;
    private String ob_type = null;
    
    
    
	private String pagerows = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgCstmsKrCntrVO() {}

	public BkgCstmsKrCntrVO(String ibflag, String pagerows, String cnt) {
		this.ibflag = ibflag;
		this.cnt = cnt;
		this.pagerows = pagerows;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		//this.hashColumns.put("ibflag", getIbflag());
		//this.hashColumns.put("cnt", getCnt());
		this.hashColumns.put("bkg_no", getBkg_no());
		this.hashColumns.put("bkg_no_split", getBkg_no_split());
		this.hashColumns.put("expt_kcd_tp", getExpt_kcd_tp());
		this.hashColumns.put("kcd_tp", getKcd_tp());
		this.hashColumns.put("kt_seq", getKt_seq());
		this.hashColumns.put("cntr_no", getCntr_no());
		this.hashColumns.put("fe_ind", getFe_ind());
		this.hashColumns.put("seal_no", getSeal_no());
		this.hashColumns.put("cntrts_cd", getCntrts_cd());
		this.hashColumns.put("cntr_pkg_qty", getCntr_pkg_qty());
		this.hashColumns.put("cntr_pkg_cd", getCntr_pkg_cd());
		this.hashColumns.put("cntr_wgt_qty", getCntr_wgt_qty());
		this.hashColumns.put("cntr_wgt_tp", getCntr_wgt_tp());
		this.hashColumns.put("cntr_mea_qty", getCntr_mea_qty());
		this.hashColumns.put("cntr_mea_tp", getCntr_mea_tp());
		this.hashColumns.put("kt_port", getKt_port());
		this.hashColumns.put("tr_cd", getTrCd());
		this.hashColumns.put("username", getUsername());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("vsl_cd", getVsl_cd());
		this.hashColumns.put("ob_type", getOb_type());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cnt", "cnt");
		this.hashFields.put("bkg_no", "bkg_no");
		this.hashFields.put("bkg_no_split", "bkg_no_split");
		this.hashFields.put("expt_kcd_tp", "expt_kcd_tp");
		this.hashFields.put("kcd_tp", "kcd_tp");
		this.hashFields.put("kt_seq", "kt_seq");
		this.hashFields.put("cntr_no", "cntr_no");
		this.hashFields.put("fe_ind", "fe_ind");
		this.hashFields.put("seal_no", "seal_no");
		this.hashFields.put("cntrts_cd", "cntrts_cd");
		this.hashFields.put("cntr_pkg_qty", "cntr_pkg_qty");
		this.hashFields.put("cntr_pkg_cd", "cntr_pkg_cd");
		this.hashFields.put("cntr_wgt_qty", "cntr_wgt_qty");
		this.hashFields.put("cntr_wgt_tp", "cntr_wgt_tp");
		this.hashFields.put("cntr_mea_qty", "cntr_mea_qty");
		this.hashFields.put("cntr_mea_tp", "cntr_mea_tp");
		this.hashFields.put("kt_port", "kt_port");
		this.hashFields.put("tr_cd", "tr_cd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("vsl_cd", "vsl_cd");
		this.hashFields.put("ob_type", "ob_type");
		return this.hashFields;
	}
	
	/**
	 * @return the models
	 */
	public Collection<BkgCstmsKrCntrVO> getModels() {
		return models;
	}

	/**
	 * @param models the models to set
	 */
	public void setModels(Collection<BkgCstmsKrCntrVO> models) {
		this.models = models;
	}

	/**
	 * @return the bkg_no
	 */
	public String getBkg_no() {
		return bkg_no;
	}

	/**
	 * @param bkg_no the bkg_no to set
	 */
	public void setBkg_no(String p) {
		this.bkg_no = p;
	}

	/**
	 * @return the bkg_no_split
	 */
	public String getBkg_no_split() {
		return bkg_no_split;
	}
	
	
	
	/**
	 * @return the tr_cd
	 */
	public String getTr_cd() {
		return tr_cd;
	}

	/**
	 * @param tr_cd the tr_cd to set
	 */
	public void setTr_cd(String tr_cd) {
		this.tr_cd = tr_cd;
	}

	/**
	 * @return the vsl_cd
	 */
	public String getVsl_cd() {
		return vsl_cd;
	}

	/**
	 * @param vsl_cd the vsl_cd to set
	 */
	public void setVsl_cd(String vsl_cd) {
		this.vsl_cd = vsl_cd;
	}

	/**
	 * @return the ob_type
	 */
	public String getOb_type() {
		return ob_type;
	}

	/**
	 * @param ob_type the ob_type to set
	 */
	public void setOb_type(String ob_type) {
		this.ob_type = ob_type;
	}

	/**
	 * @param bkg_no_split the bkg_no_split to set
	 */
	public void setBkg_no_split(String p) {
		this.bkg_no_split = p;
	}

	/**
	 * @return the expt_kcd_tp
	 */
	public String getExpt_kcd_tp() {
		return expt_kcd_tp;
	}

	/**
	 * @param expt_kcd_tp the expt_kcd_tp to set
	 */
	public void setExpt_kcd_tp(String expt_kcd_tp) {
		this.expt_kcd_tp = expt_kcd_tp;
	}

	/**
	 * @return the kcd_tp
	 */
	public String getKcd_tp() {
		return kcd_tp;
	}

	/**
	 * @param kcd_tp the kcd_tp to set
	 */
	public void setKcd_tp(String kcd_tp) {
		this.kcd_tp = kcd_tp;
	}

	/**
	 * @return the kt_seq
	 */
	public String getKt_seq() {
		return kt_seq;
	}

	/**
	 * @param kt_seq the kt_seq to set
	 */
	public void setKt_seq(String kt_seq) {
		this.kt_seq = kt_seq;
	}

	/**
	 * @return the cntr_no
	 */
	public String getCntr_no() {
		return cntr_no;
	}

	/**
	 * @param cntr_no the cntr_no to set
	 */
	public void setCntr_no(String cntr_no) {
		this.cntr_no = cntr_no;
	}

	/**
	 * @return the fe_ind
	 */
	public String getFe_ind() {
		return fe_ind;
	}

	/**
	 * @param fe_ind the fe_ind to set
	 */
	public void setFe_ind(String fe_ind) {
		this.fe_ind = fe_ind;
	}

	/**
	 * @return the seal_no
	 */
	public String getSeal_no() {
		return seal_no;
	}

	/**
	 * @param seal_no the seal_no to set
	 */
	public void setSeal_no(String seal_no) {
		this.seal_no = seal_no;
	}

	/**
	 * @return the cntrts_cd
	 */
	public String getCntrts_cd() {
		return cntrts_cd;
	}

	/**
	 * @param cntrts_cd the cntrts_cd to set
	 */
	public void setCntrts_cd(String cntrts_cd) {
		this.cntrts_cd = cntrts_cd;
	}

	/**
	 * @return the cntr_pkg_qty
	 */
	public String getCntr_pkg_qty() {
		return cntr_pkg_qty;
	}

	/**
	 * @param cntr_pkg_qty the cntr_pkg_qty to set
	 */
	public void setCntr_pkg_qty(String cntr_pkg_qty) {
		this.cntr_pkg_qty = cntr_pkg_qty;
	}

	/**
	 * @return the cntr_pkg_cd
	 */
	public String getCntr_pkg_cd() {
		return cntr_pkg_cd;
	}

	/**
	 * @param cntr_pkg_cd the cntr_pkg_cd to set
	 */
	public void setCntr_pkg_cd(String cntr_pkg_cd) {
		this.cntr_pkg_cd = cntr_pkg_cd;
	}

	/**
	 * @return the cntr_wgt_qty
	 */
	public String getCntr_wgt_qty() {
		return cntr_wgt_qty;
	}

	/**
	 * @param cntr_wgt_qty the cntr_wgt_qty to set
	 */
	public void setCntr_wgt_qty(String cntr_wgt_qty) {
		this.cntr_wgt_qty = cntr_wgt_qty;
	}

	/**
	 * @return the cntr_wgt_tp
	 */
	public String getCntr_wgt_tp() {
		return this.cntr_wgt_tp;
	}
	
	public String getTrCd()	{
		return this.tr_cd;
	}
	
	public String getUsername(){
		return this.username;
	}
	/**
	 * @param cntr_wgt_tp the cntr_wgt_tp to set
	 */
	public void setCntr_wgt_tp(String cntr_wgt_tp) {
		this.cntr_wgt_tp = cntr_wgt_tp;
	}

	/**
	 * @return the cntr_mea_qty
	 */
	public String getCntr_mea_qty() {
		return cntr_mea_qty;
	}

	/**
	 * @param cntr_mea_qty the cntr_mea_qty to set
	 */
	public void setCntr_mea_qty(String cntr_mea_qty) {
		this.cntr_mea_qty = cntr_mea_qty;
	}

	/**
	 * @return the cntr_mea_tp
	 */
	public String getCntr_mea_tp() {
		return cntr_mea_tp;
	}

	/**
	 * @param cntr_mea_tp the cntr_mea_tp to set
	 */
	public void setCntr_mea_tp(String cntr_mea_tp) {
		this.cntr_mea_tp = cntr_mea_tp;
	}

	/**
	 * @return the kt_port
	 */
	public String getKt_port() {
		return kt_port;
	}

	/**
	 * @param kt_port the kt_port to set
	 */
	public void setKt_port(String kt_port) {
		this.kt_port = kt_port;
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
	 * @return cnt
	 */
	public String getCnt() {
		return this.cnt;
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
	 * @param ibflag
	 */
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
	}
	
	/**
	 * Column Info
	 * @param cnt
	 */
	public void setCnt(String cnt) {
		this.cnt = cnt;
	}
	
	public void setTrCd(String p){
		this.tr_cd = p;
	}
	
	/**
	 * Page Number
	 * @param pagerows
	 */
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
	}
	
	public void setUsername(String p){
		this.username = p;
	}
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCnt(JSPUtil.getParameter(request, "cnt", ""));
		setBkg_no(JSPUtil.getParameter(request, "bkg_no", ""));
		setBkg_no_split(JSPUtil.getParameter(request, "bkg_no_split", ""));
		setExpt_kcd_tp(JSPUtil.getParameter(request, "expt_kcd_tp", ""));
		setKcd_tp(JSPUtil.getParameter(request, "kcd_tp", ""));
		setKt_seq(JSPUtil.getParameter(request, "kt_seq", ""));
		setCntr_no(JSPUtil.getParameter(request, "cntr_no", ""));
		setFe_ind(JSPUtil.getParameter(request, "fe_ind", ""));
		setSeal_no(JSPUtil.getParameter(request, "seal_no", ""));
		setCntrts_cd(JSPUtil.getParameter(request, "cntrts_cd", ""));
		setCntr_pkg_qty(JSPUtil.getParameter(request, "cntr_pkg_qty", ""));
		setCntr_pkg_cd(JSPUtil.getParameter(request, "cntr_pkg_cd", ""));
		setCntr_wgt_qty(JSPUtil.getParameter(request, "cntr_wgt_qty", ""));
		setCntr_wgt_tp(JSPUtil.getParameter(request, "cntr_wgt_tp", ""));
		setCntr_mea_qty(JSPUtil.getParameter(request, "cntr_mea_qty", ""));
		setCntr_mea_tp(JSPUtil.getParameter(request, "cntr_mea_tp", ""));
		setKt_port(JSPUtil.getParameter(request, "kt_port", ""));
		setTrCd(JSPUtil.getParameter(request, "tr_cd", ""));
		setVsl_cd(JSPUtil.getParameter(request, "vsl_cd", ""));
		setOb_type(JSPUtil.getParameter(request, "ob_type", ""));
		
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setUsername(JSPUtil.getParameter(request, "username", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return SearchCntrTtlCntKorVO[]
	 */
	public BkgCstmsKrCntrVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return SearchCntrTtlCntKorVO[]
	 */
	public BkgCstmsKrCntrVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgCstmsKrCntrVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] cnt = (JSPUtil.getParameter(request, prefix	+ "cnt".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] bkgno		 = (JSPUtil.getParameter(request, prefix	+ "bkg_no".trim(), length));
			String[] bkgnosplit	 = (JSPUtil.getParameter(request, prefix	+ "bkg_no_split".trim(), length));
			String[] exptkcdtp	 = (JSPUtil.getParameter(request, prefix	+ "expt_kcd_tp".trim(), length));
			String[] kcdtp		 = (JSPUtil.getParameter(request, prefix	+ "kcd_tp".trim(), length));
			String[] ktseq	 	 = (JSPUtil.getParameter(request, prefix	+ "kt_seq".trim(), length));
			String[] cntrno		 = (JSPUtil.getParameter(request, prefix	+ "cntr_no".trim(), length));
			String[] feind		 = (JSPUtil.getParameter(request, prefix	+ "fe_ind".trim(), length));
			String[] sealno		 = (JSPUtil.getParameter(request, prefix	+ "seal_no".trim(), length));
			String[] cntrtscd	 = (JSPUtil.getParameter(request, prefix	+ "cntrts_cd".trim(), length));
			String[] cntrpkgqty	 = (JSPUtil.getParameter(request, prefix	+ "cntr_pkg_qty".trim(), length));
			String[] cntrpkgcd	 = (JSPUtil.getParameter(request, prefix	+ "cntr_pkg_cd".trim(), length));
			String[] cntrwgtqty	 = (JSPUtil.getParameter(request, prefix	+ "cntr_wgt_qty".trim(), length));	
			String[] cntrwgttp	 = (JSPUtil.getParameter(request, prefix	+ "cntr_wgt_tp".trim(), length));
			String[] cntrmeaqty	 = (JSPUtil.getParameter(request, prefix	+ "cntr_mea_qty".trim(), length));	
			String[] cntrmeatp	 = (JSPUtil.getParameter(request, prefix	+ "cntr_mea_tp".trim(), length));	
			String[] ktport		 = (JSPUtil.getParameter(request, prefix	+ "kt_port".trim(), length));
			String[] trcd		 = (JSPUtil.getParameter(request, prefix	+ "tr_cd".trim(), length));
			String[] ausername   = (JSPUtil.getParameter(request, prefix	+ "username".trim(), length));
			String[] vslcd		 = (JSPUtil.getParameter(request, prefix	+ "vsl_cd".trim(), length));
			String[] obtype		 = (JSPUtil.getParameter(request, prefix	+ "ob_type".trim(), length));
			
			for (int i = 0; i < length; i++) 
			{
				model = new BkgCstmsKrCntrVO();
				if (ibflag[i] != null)				model.setIbflag(ibflag[i]);
				if (cnt[i] != null)					model.setCnt(cnt[i]);
				if (pagerows[i] != null)			model.setPagerows(pagerows[i]);
				if (bkgno[i] != null)model.setBkg_no	(bkgno[i]);
				if (bkgnosplit[i] != null)model.setBkg_no_split(bkgnosplit[i]);
				if (exptkcdtp[i] != null)model.setExpt_kcd_tp(exptkcdtp[i]);
				if (kcdtp[i] != null)model.setKcd_tp(kcdtp[i]);
				if (ktseq[i] != null)model.setKt_seq	(ktseq[i]);
				if (cntrno[i] != null)model.setCntr_no(cntrno[i]);
				if (feind[i] != null)model.setFe_ind	(feind[i]);
				if (sealno[i] != null)model.setSeal_no(sealno[i]);
				if (cntrtscd[i] != null)model.setCntrts_cd(cntrtscd[i]);
				if (cntrpkgqty[i] != null)model.setCntr_pkg_qty(cntrpkgqty[i]);
				if (cntrpkgcd[i] != null)model.setCntr_pkg_cd(cntrpkgcd[i]);
				if (cntrwgtqty[i] != null)model.setCntr_wgt_qty(cntrwgtqty[i]);
				if (cntrwgttp[i] != null)model.setCntr_wgt_tp(cntrwgttp[i]);
				if (cntrmeaqty[i] != null)model.setCntr_mea_qty(cntrmeaqty[i]);
				if (cntrmeatp[i] != null)model.setCntr_mea_tp(cntrmeatp[i]);
				if (ktport[i] != null)model.setKt_port(ktport[i]);
				if (trcd[i] != null)model.setTrCd(trcd[i]);
				if (ausername[i] != null)model.setUsername(ausername[i]);
				if (vslcd[i] != null)model.setVsl_cd(vslcd[i]);
				if (obtype[i] != null)model.setOb_type(obtype[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getSearchCntrTtlCntKorVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return SearchCntrTtlCntKorVO[]
	 */
	public BkgCstmsKrCntrVO[] getSearchCntrTtlCntKorVOs(){
		BkgCstmsKrCntrVO[] vos = (BkgCstmsKrCntrVO[])models.toArray(new BkgCstmsKrCntrVO[models.size()]);
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
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cnt = this.cnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkg_no	 = this.bkg_no.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkg_no_split = this.bkg_no_split.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.expt_kcd_tp = this.expt_kcd_tp.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.kcd_tp	 = this.kcd_tp.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.kt_seq	 = this.kt_seq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntr_no	 = this.cntr_no.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fe_ind	 = this.fe_ind.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.seal_no	 = this.seal_no.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrts_cd	 = this.cntrts_cd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntr_pkg_qty = this.cntr_pkg_qty.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntr_pkg_cd = this.cntr_pkg_cd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntr_wgt_qty = this.cntr_wgt_qty.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntr_wgt_tp = this.cntr_wgt_tp.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntr_mea_qty = this.cntr_mea_qty.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntr_mea_tp = this.cntr_mea_tp.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.kt_port	 = this.kt_port.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tr_cd	 = this.tr_cd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vsl_cd	 = this.vsl_cd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ob_type = this.ob_type.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.username = this.username .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
