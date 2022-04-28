/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : OpfTmlDepRptDtlVO.java
*@FileTitle : OpfTmlDepRptDtlVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.08.24
*@LastModifier : 
*@LastVersion : 1.0
* 2009.08.24  
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
 * @author 
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class OpfTmlDepRptDtlVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<OpfTmlDepRptDtlVO> models = new ArrayList<OpfTmlDepRptDtlVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String vslCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String clptCd = null;
	/* Column Info */
	private String skdVoyNo = null;
	/* Column Info */
	private String tdrEmlSndNo = null;
	/* Column Info */
	private String skdDirCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String tmlProdRptRsnCreDt = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String clptIndSeq = null;
	/* Column Info */
	private String tmlProdRptRsnCreUsrId = null;
	/* Column Info */
	private String tmlProdRptRsnRmk = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String tmlProdRptRsnCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public OpfTmlDepRptDtlVO() {}

	public OpfTmlDepRptDtlVO(String ibflag, String pagerows, String vslCd, String skdVoyNo, String skdDirCd, String clptCd, String clptIndSeq, String tmlProdRptRsnCreUsrId, String tmlProdRptRsnCreDt, String tmlProdRptRsnCd, String tmlProdRptRsnRmk, String tdrEmlSndNo, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.vslCd = vslCd;
		this.creDt = creDt;
		this.clptCd = clptCd;
		this.skdVoyNo = skdVoyNo;
		this.tdrEmlSndNo = tdrEmlSndNo;
		this.skdDirCd = skdDirCd;
		this.pagerows = pagerows;
		this.tmlProdRptRsnCreDt = tmlProdRptRsnCreDt;
		this.ibflag = ibflag;
		this.creUsrId = creUsrId;
		this.clptIndSeq = clptIndSeq;
		this.tmlProdRptRsnCreUsrId = tmlProdRptRsnCreUsrId;
		this.tmlProdRptRsnRmk = tmlProdRptRsnRmk;
		this.updUsrId = updUsrId;
		this.tmlProdRptRsnCd = tmlProdRptRsnCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("clpt_cd", getClptCd());
		this.hashColumns.put("skd_voy_no", getSkdVoyNo());
		this.hashColumns.put("tdr_eml_snd_no", getTdrEmlSndNo());
		this.hashColumns.put("skd_dir_cd", getSkdDirCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("tml_prod_rpt_rsn_cre_dt", getTmlProdRptRsnCreDt());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("clpt_ind_seq", getClptIndSeq());
		this.hashColumns.put("tml_prod_rpt_rsn_cre_usr_id", getTmlProdRptRsnCreUsrId());
		this.hashColumns.put("tml_prod_rpt_rsn_rmk", getTmlProdRptRsnRmk());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("tml_prod_rpt_rsn_cd", getTmlProdRptRsnCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("clpt_cd", "clptCd");
		this.hashFields.put("skd_voy_no", "skdVoyNo");
		this.hashFields.put("tdr_eml_snd_no", "tdrEmlSndNo");
		this.hashFields.put("skd_dir_cd", "skdDirCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("tml_prod_rpt_rsn_cre_dt", "tmlProdRptRsnCreDt");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("clpt_ind_seq", "clptIndSeq");
		this.hashFields.put("tml_prod_rpt_rsn_cre_usr_id", "tmlProdRptRsnCreUsrId");
		this.hashFields.put("tml_prod_rpt_rsn_rmk", "tmlProdRptRsnRmk");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("tml_prod_rpt_rsn_cd", "tmlProdRptRsnCd");
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
	 * @return vslCd
	 */
	public String getVslCd() {
		return this.vslCd;
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
	 * @return clptCd
	 */
	public String getClptCd() {
		return this.clptCd;
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
	 * @return tdrEmlSndNo
	 */
	public String getTdrEmlSndNo() {
		return this.tdrEmlSndNo;
	}
	
	/**
	 * Column Info
	 * @return skdDirCd
	 */
	public String getSkdDirCd() {
		return this.skdDirCd;
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
	 * @return tmlProdRptRsnCreDt
	 */
	public String getTmlProdRptRsnCreDt() {
		return this.tmlProdRptRsnCreDt;
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
	 * @return creUsrId
	 */
	public String getCreUsrId() {
		return this.creUsrId;
	}
	
	/**
	 * Column Info
	 * @return clptIndSeq
	 */
	public String getClptIndSeq() {
		return this.clptIndSeq;
	}
	
	/**
	 * Column Info
	 * @return tmlProdRptRsnCreUsrId
	 */
	public String getTmlProdRptRsnCreUsrId() {
		return this.tmlProdRptRsnCreUsrId;
	}
	
	/**
	 * Column Info
	 * @return tmlProdRptRsnRmk
	 */
	public String getTmlProdRptRsnRmk() {
		return this.tmlProdRptRsnRmk;
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
	 * @return tmlProdRptRsnCd
	 */
	public String getTmlProdRptRsnCd() {
		return this.tmlProdRptRsnCd;
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
	 * @param vslCd
	 */
	public void setVslCd(String vslCd) {
		this.vslCd = vslCd;
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
	 * @param clptCd
	 */
	public void setClptCd(String clptCd) {
		this.clptCd = clptCd;
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
	 * @param tdrEmlSndNo
	 */
	public void setTdrEmlSndNo(String tdrEmlSndNo) {
		this.tdrEmlSndNo = tdrEmlSndNo;
	}
	
	/**
	 * Column Info
	 * @param skdDirCd
	 */
	public void setSkdDirCd(String skdDirCd) {
		this.skdDirCd = skdDirCd;
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
	 * @param tmlProdRptRsnCreDt
	 */
	public void setTmlProdRptRsnCreDt(String tmlProdRptRsnCreDt) {
		this.tmlProdRptRsnCreDt = tmlProdRptRsnCreDt;
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
	 * @param creUsrId
	 */
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
	}
	
	/**
	 * Column Info
	 * @param clptIndSeq
	 */
	public void setClptIndSeq(String clptIndSeq) {
		this.clptIndSeq = clptIndSeq;
	}
	
	/**
	 * Column Info
	 * @param tmlProdRptRsnCreUsrId
	 */
	public void setTmlProdRptRsnCreUsrId(String tmlProdRptRsnCreUsrId) {
		this.tmlProdRptRsnCreUsrId = tmlProdRptRsnCreUsrId;
	}
	
	/**
	 * Column Info
	 * @param tmlProdRptRsnRmk
	 */
	public void setTmlProdRptRsnRmk(String tmlProdRptRsnRmk) {
		this.tmlProdRptRsnRmk = tmlProdRptRsnRmk;
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
	 * @param tmlProdRptRsnCd
	 */
	public void setTmlProdRptRsnCd(String tmlProdRptRsnCd) {
		this.tmlProdRptRsnCd = tmlProdRptRsnCd;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setVslCd(JSPUtil.getParameter(request, "vsl_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setClptCd(JSPUtil.getParameter(request, "clpt_cd", ""));
		setSkdVoyNo(JSPUtil.getParameter(request, "skd_voy_no", ""));
		setTdrEmlSndNo(JSPUtil.getParameter(request, "tdr_eml_snd_no", ""));
		setSkdDirCd(JSPUtil.getParameter(request, "skd_dir_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setTmlProdRptRsnCreDt(JSPUtil.getParameter(request, "tml_prod_rpt_rsn_cre_dt", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setClptIndSeq(JSPUtil.getParameter(request, "clpt_ind_seq", ""));
		setTmlProdRptRsnCreUsrId(JSPUtil.getParameter(request, "tml_prod_rpt_rsn_cre_usr_id", ""));
		setTmlProdRptRsnRmk(JSPUtil.getParameter(request, "tml_prod_rpt_rsn_rmk", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setTmlProdRptRsnCd(JSPUtil.getParameter(request, "tml_prod_rpt_rsn_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return OpfTmlDepRptDtlVO[]
	 */
	public OpfTmlDepRptDtlVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return OpfTmlDepRptDtlVO[]
	 */
	public OpfTmlDepRptDtlVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		OpfTmlDepRptDtlVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] clptCd = (JSPUtil.getParameter(request, prefix	+ "clpt_cd", length));
			String[] skdVoyNo = (JSPUtil.getParameter(request, prefix	+ "skd_voy_no", length));
			String[] tdrEmlSndNo = (JSPUtil.getParameter(request, prefix	+ "tdr_eml_snd_no", length));
			String[] skdDirCd = (JSPUtil.getParameter(request, prefix	+ "skd_dir_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] tmlProdRptRsnCreDt = (JSPUtil.getParameter(request, prefix	+ "tml_prod_rpt_rsn_cre_dt", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] clptIndSeq = (JSPUtil.getParameter(request, prefix	+ "clpt_ind_seq", length));
			String[] tmlProdRptRsnCreUsrId = (JSPUtil.getParameter(request, prefix	+ "tml_prod_rpt_rsn_cre_usr_id", length));
			String[] tmlProdRptRsnRmk = (JSPUtil.getParameter(request, prefix	+ "tml_prod_rpt_rsn_rmk", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] tmlProdRptRsnCd = (JSPUtil.getParameter(request, prefix	+ "tml_prod_rpt_rsn_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new OpfTmlDepRptDtlVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (clptCd[i] != null)
					model.setClptCd(clptCd[i]);
				if (skdVoyNo[i] != null)
					model.setSkdVoyNo(skdVoyNo[i]);
				if (tdrEmlSndNo[i] != null)
					model.setTdrEmlSndNo(tdrEmlSndNo[i]);
				if (skdDirCd[i] != null)
					model.setSkdDirCd(skdDirCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (tmlProdRptRsnCreDt[i] != null)
					model.setTmlProdRptRsnCreDt(tmlProdRptRsnCreDt[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (clptIndSeq[i] != null)
					model.setClptIndSeq(clptIndSeq[i]);
				if (tmlProdRptRsnCreUsrId[i] != null)
					model.setTmlProdRptRsnCreUsrId(tmlProdRptRsnCreUsrId[i]);
				if (tmlProdRptRsnRmk[i] != null)
					model.setTmlProdRptRsnRmk(tmlProdRptRsnRmk[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (tmlProdRptRsnCd[i] != null)
					model.setTmlProdRptRsnCd(tmlProdRptRsnCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getOpfTmlDepRptDtlVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return OpfTmlDepRptDtlVO[]
	 */
	public OpfTmlDepRptDtlVO[] getOpfTmlDepRptDtlVOs(){
		OpfTmlDepRptDtlVO[] vos = (OpfTmlDepRptDtlVO[])models.toArray(new OpfTmlDepRptDtlVO[models.size()]);
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
		this.vslCd = this.vslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.clptCd = this.clptCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdVoyNo = this.skdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tdrEmlSndNo = this.tdrEmlSndNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdDirCd = this.skdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlProdRptRsnCreDt = this.tmlProdRptRsnCreDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.clptIndSeq = this.clptIndSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlProdRptRsnCreUsrId = this.tmlProdRptRsnCreUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlProdRptRsnRmk = this.tmlProdRptRsnRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlProdRptRsnCd = this.tmlProdRptRsnCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
