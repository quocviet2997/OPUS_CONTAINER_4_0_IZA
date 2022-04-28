/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BsaSltChtrBzcVO.java
*@FileTitle : BsaSltChtrBzcVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.09.03
*@LastModifier : 남궁진호
*@LastVersion : 1.0
* 2009.09.03 남궁진호 
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
 * @author 남궁진호
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class BsaSltChtrBzcVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BsaSltChtrBzcVO> models = new ArrayList<BsaSltChtrBzcVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String bsaFmDt = null;
	/* Column Info */
	private String vslCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String trdCd = null;
	/* Column Info */
	private String rlaneCd = null;
	/* Column Info */
	private String vslSeq = null;
	/* Column Info */
	private String coFnlBsaCapa = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String coBsaBfrSubCapa = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String vslBsaChkFlg = null;
	/* Column Info */
	private String vvdCd = null;
	/* Column Info */
	private String schtDesc = null;
	/* Column Info */
	private String bsaToDt = null;
	/* Column Info */
	private String vslMltInpFlg = null;
	/* Column Info */
	private String dirCd = null;
	/* Column Info */
	private String bsaSeq = null;
	/* Column Info */
	private String updUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BsaSltChtrBzcVO() {}

	public BsaSltChtrBzcVO(String ibflag, String pagerows, String trdCd, String rlaneCd, String dirCd, String vslSeq, String bsaSeq, String vvdCd, String bsaFmDt, String bsaToDt, String vslCd, String coFnlBsaCapa, String coBsaBfrSubCapa, String vslBsaChkFlg, String schtDesc, String vslMltInpFlg, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.bsaFmDt = bsaFmDt;
		this.vslCd = vslCd;
		this.creDt = creDt;
		this.trdCd = trdCd;
		this.rlaneCd = rlaneCd;
		this.vslSeq = vslSeq;
		this.coFnlBsaCapa = coFnlBsaCapa;
		this.pagerows = pagerows;
		this.coBsaBfrSubCapa = coBsaBfrSubCapa;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.vslBsaChkFlg = vslBsaChkFlg;
		this.vvdCd = vvdCd;
		this.schtDesc = schtDesc;
		this.bsaToDt = bsaToDt;
		this.vslMltInpFlg = vslMltInpFlg;
		this.dirCd = dirCd;
		this.bsaSeq = bsaSeq;
		this.updUsrId = updUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("bsa_fm_dt", getBsaFmDt());
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("trd_cd", getTrdCd());
		this.hashColumns.put("rlane_cd", getRlaneCd());
		this.hashColumns.put("vsl_seq", getVslSeq());
		this.hashColumns.put("co_fnl_bsa_capa", getCoFnlBsaCapa());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("co_bsa_bfr_sub_capa", getCoBsaBfrSubCapa());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("vsl_bsa_chk_flg", getVslBsaChkFlg());
		this.hashColumns.put("vvd_cd", getVvdCd());
		this.hashColumns.put("scht_desc", getSchtDesc());
		this.hashColumns.put("bsa_to_dt", getBsaToDt());
		this.hashColumns.put("vsl_mlt_inp_flg", getVslMltInpFlg());
		this.hashColumns.put("dir_cd", getDirCd());
		this.hashColumns.put("bsa_seq", getBsaSeq());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("bsa_fm_dt", "bsaFmDt");
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("trd_cd", "trdCd");
		this.hashFields.put("rlane_cd", "rlaneCd");
		this.hashFields.put("vsl_seq", "vslSeq");
		this.hashFields.put("co_fnl_bsa_capa", "coFnlBsaCapa");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("co_bsa_bfr_sub_capa", "coBsaBfrSubCapa");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("vsl_bsa_chk_flg", "vslBsaChkFlg");
		this.hashFields.put("vvd_cd", "vvdCd");
		this.hashFields.put("scht_desc", "schtDesc");
		this.hashFields.put("bsa_to_dt", "bsaToDt");
		this.hashFields.put("vsl_mlt_inp_flg", "vslMltInpFlg");
		this.hashFields.put("dir_cd", "dirCd");
		this.hashFields.put("bsa_seq", "bsaSeq");
		this.hashFields.put("upd_usr_id", "updUsrId");
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
	 * @return bsaFmDt
	 */
	public String getBsaFmDt() {
		return this.bsaFmDt;
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
	 * @return trdCd
	 */
	public String getTrdCd() {
		return this.trdCd;
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
	 * @return vslSeq
	 */
	public String getVslSeq() {
		return this.vslSeq;
	}
	
	/**
	 * Column Info
	 * @return coFnlBsaCapa
	 */
	public String getCoFnlBsaCapa() {
		return this.coFnlBsaCapa;
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
	 * @return coBsaBfrSubCapa
	 */
	public String getCoBsaBfrSubCapa() {
		return this.coBsaBfrSubCapa;
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
	 * @return vslBsaChkFlg
	 */
	public String getVslBsaChkFlg() {
		return this.vslBsaChkFlg;
	}
	
	/**
	 * Column Info
	 * @return vvdCd
	 */
	public String getVvdCd() {
		return this.vvdCd;
	}
	
	/**
	 * Column Info
	 * @return schtDesc
	 */
	public String getSchtDesc() {
		return this.schtDesc;
	}
	
	/**
	 * Column Info
	 * @return bsaToDt
	 */
	public String getBsaToDt() {
		return this.bsaToDt;
	}
	
	/**
	 * Column Info
	 * @return vslMltInpFlg
	 */
	public String getVslMltInpFlg() {
		return this.vslMltInpFlg;
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
	 * @return bsaSeq
	 */
	public String getBsaSeq() {
		return this.bsaSeq;
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
	 * @param updDt
	 */
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
	}
	
	/**
	 * Column Info
	 * @param bsaFmDt
	 */
	public void setBsaFmDt(String bsaFmDt) {
		this.bsaFmDt = bsaFmDt;
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
	 * @param trdCd
	 */
	public void setTrdCd(String trdCd) {
		this.trdCd = trdCd;
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
	 * @param vslSeq
	 */
	public void setVslSeq(String vslSeq) {
		this.vslSeq = vslSeq;
	}
	
	/**
	 * Column Info
	 * @param coFnlBsaCapa
	 */
	public void setCoFnlBsaCapa(String coFnlBsaCapa) {
		this.coFnlBsaCapa = coFnlBsaCapa;
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
	 * @param coBsaBfrSubCapa
	 */
	public void setCoBsaBfrSubCapa(String coBsaBfrSubCapa) {
		this.coBsaBfrSubCapa = coBsaBfrSubCapa;
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
	 * @param vslBsaChkFlg
	 */
	public void setVslBsaChkFlg(String vslBsaChkFlg) {
		this.vslBsaChkFlg = vslBsaChkFlg;
	}
	
	/**
	 * Column Info
	 * @param vvdCd
	 */
	public void setVvdCd(String vvdCd) {
		this.vvdCd = vvdCd;
	}
	
	/**
	 * Column Info
	 * @param schtDesc
	 */
	public void setSchtDesc(String schtDesc) {
		this.schtDesc = schtDesc;
	}
	
	/**
	 * Column Info
	 * @param bsaToDt
	 */
	public void setBsaToDt(String bsaToDt) {
		this.bsaToDt = bsaToDt;
	}
	
	/**
	 * Column Info
	 * @param vslMltInpFlg
	 */
	public void setVslMltInpFlg(String vslMltInpFlg) {
		this.vslMltInpFlg = vslMltInpFlg;
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
	 * @param bsaSeq
	 */
	public void setBsaSeq(String bsaSeq) {
		this.bsaSeq = bsaSeq;
	}
	
	/**
	 * Column Info
	 * @param updUsrId
	 */
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setBsaFmDt(JSPUtil.getParameter(request, "bsa_fm_dt", ""));
		setVslCd(JSPUtil.getParameter(request, "vsl_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setTrdCd(JSPUtil.getParameter(request, "trd_cd", ""));
		setRlaneCd(JSPUtil.getParameter(request, "rlane_cd", ""));
		setVslSeq(JSPUtil.getParameter(request, "vsl_seq", ""));
		setCoFnlBsaCapa(JSPUtil.getParameter(request, "co_fnl_bsa_capa", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setCoBsaBfrSubCapa(JSPUtil.getParameter(request, "co_bsa_bfr_sub_capa", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setVslBsaChkFlg(JSPUtil.getParameter(request, "vsl_bsa_chk_flg", ""));
		setVvdCd(JSPUtil.getParameter(request, "vvd_cd", ""));
		setSchtDesc(JSPUtil.getParameter(request, "scht_desc", ""));
		setBsaToDt(JSPUtil.getParameter(request, "bsa_to_dt", ""));
		setVslMltInpFlg(JSPUtil.getParameter(request, "vsl_mlt_inp_flg", ""));
		setDirCd(JSPUtil.getParameter(request, "dir_cd", ""));
		setBsaSeq(JSPUtil.getParameter(request, "bsa_seq", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BsaSltChtrBzcVO[]
	 */
	public BsaSltChtrBzcVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BsaSltChtrBzcVO[]
	 */
	public BsaSltChtrBzcVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BsaSltChtrBzcVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] bsaFmDt = (JSPUtil.getParameter(request, prefix	+ "bsa_fm_dt", length));
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] trdCd = (JSPUtil.getParameter(request, prefix	+ "trd_cd", length));
			String[] rlaneCd = (JSPUtil.getParameter(request, prefix	+ "rlane_cd", length));
			String[] vslSeq = (JSPUtil.getParameter(request, prefix	+ "vsl_seq", length));
			String[] coFnlBsaCapa = (JSPUtil.getParameter(request, prefix	+ "co_fnl_bsa_capa", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] coBsaBfrSubCapa = (JSPUtil.getParameter(request, prefix	+ "co_bsa_bfr_sub_capa", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] vslBsaChkFlg = (JSPUtil.getParameter(request, prefix	+ "vsl_bsa_chk_flg", length));
			String[] vvdCd = (JSPUtil.getParameter(request, prefix	+ "vvd_cd", length));
			String[] schtDesc = (JSPUtil.getParameter(request, prefix	+ "scht_desc", length));
			String[] bsaToDt = (JSPUtil.getParameter(request, prefix	+ "bsa_to_dt", length));
			String[] vslMltInpFlg = (JSPUtil.getParameter(request, prefix	+ "vsl_mlt_inp_flg", length));
			String[] dirCd = (JSPUtil.getParameter(request, prefix	+ "dir_cd", length));
			String[] bsaSeq = (JSPUtil.getParameter(request, prefix	+ "bsa_seq", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			
			for (int i = 0; i < length; i++) {
				model = new BsaSltChtrBzcVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (bsaFmDt[i] != null)
					model.setBsaFmDt(bsaFmDt[i]);
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (trdCd[i] != null)
					model.setTrdCd(trdCd[i]);
				if (rlaneCd[i] != null)
					model.setRlaneCd(rlaneCd[i]);
				if (vslSeq[i] != null)
					model.setVslSeq(vslSeq[i]);
				if (coFnlBsaCapa[i] != null)
					model.setCoFnlBsaCapa(coFnlBsaCapa[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (coBsaBfrSubCapa[i] != null)
					model.setCoBsaBfrSubCapa(coBsaBfrSubCapa[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (vslBsaChkFlg[i] != null)
					model.setVslBsaChkFlg(vslBsaChkFlg[i]);
				if (vvdCd[i] != null)
					model.setVvdCd(vvdCd[i]);
				if (schtDesc[i] != null)
					model.setSchtDesc(schtDesc[i]);
				if (bsaToDt[i] != null)
					model.setBsaToDt(bsaToDt[i]);
				if (vslMltInpFlg[i] != null)
					model.setVslMltInpFlg(vslMltInpFlg[i]);
				if (dirCd[i] != null)
					model.setDirCd(dirCd[i]);
				if (bsaSeq[i] != null)
					model.setBsaSeq(bsaSeq[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBsaSltChtrBzcVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BsaSltChtrBzcVO[]
	 */
	public BsaSltChtrBzcVO[] getBsaSltChtrBzcVOs(){
		BsaSltChtrBzcVO[] vos = (BsaSltChtrBzcVO[])models.toArray(new BsaSltChtrBzcVO[models.size()]);
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
		this.bsaFmDt = this.bsaFmDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslCd = this.vslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trdCd = this.trdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rlaneCd = this.rlaneCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslSeq = this.vslSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.coFnlBsaCapa = this.coFnlBsaCapa .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.coBsaBfrSubCapa = this.coBsaBfrSubCapa .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslBsaChkFlg = this.vslBsaChkFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vvdCd = this.vvdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.schtDesc = this.schtDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bsaToDt = this.bsaToDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslMltInpFlg = this.vslMltInpFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dirCd = this.dirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bsaSeq = this.bsaSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
