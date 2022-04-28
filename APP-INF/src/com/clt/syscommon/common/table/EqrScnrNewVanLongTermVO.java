/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : EqrScnrNewVanLongTermVO.java
*@FileTitle : EqrScnrNewVanLongTermVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.08.04
*@LastModifier : Lee Byoung Hun
*@LastVersion : 1.0
* 2009.08.04  
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

public class EqrScnrNewVanLongTermVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<EqrScnrNewVanLongTermVO> models = new ArrayList<EqrScnrNewVanLongTermVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String plnYrmon = null;
	/* Column Info */
	private String vndrCntCd = null;
	/* Column Info */
	private String coCd = null;
	/* Column Info */
	private String scnrId = null;
	/* Column Info */
	private String cntrDeStsCd = null;
	/* Column Info */
	private String eccCd = null;
	/* Column Info */
	private String creDt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String vndrSeq = null;
	/* Column Info */
	private String cntrTpszCd = null;
	/* Column Info */
	private String vndrAbbrNm = null;
	/* Column Info */
	private String cntrVolQty = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String cntrLstmCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public EqrScnrNewVanLongTermVO() {}

	public EqrScnrNewVanLongTermVO(String ibflag, String pagerows, String scnrId, String plnYrmon, String coCd, String eccCd, String cntrLstmCd, String cntrTpszCd, String vndrCntCd, String vndrSeq, String cntrDeStsCd, String cntrVolQty, String vndrAbbrNm, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.plnYrmon = plnYrmon;
		this.vndrCntCd = vndrCntCd;
		this.coCd = coCd;
		this.scnrId = scnrId;
		this.cntrDeStsCd = cntrDeStsCd;
		this.eccCd = eccCd;
		this.creDt = creDt;
		this.pagerows = pagerows;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.vndrSeq = vndrSeq;
		this.cntrTpszCd = cntrTpszCd;
		this.vndrAbbrNm = vndrAbbrNm;
		this.cntrVolQty = cntrVolQty;
		this.updUsrId = updUsrId;
		this.cntrLstmCd = cntrLstmCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("pln_yrmon", getPlnYrmon());
		this.hashColumns.put("vndr_cnt_cd", getVndrCntCd());
		this.hashColumns.put("co_cd", getCoCd());
		this.hashColumns.put("scnr_id", getScnrId());
		this.hashColumns.put("cntr_de_sts_cd", getCntrDeStsCd());
		this.hashColumns.put("ecc_cd", getEccCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("vndr_seq", getVndrSeq());
		this.hashColumns.put("cntr_tpsz_cd", getCntrTpszCd());
		this.hashColumns.put("vndr_abbr_nm", getVndrAbbrNm());
		this.hashColumns.put("cntr_vol_qty", getCntrVolQty());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("cntr_lstm_cd", getCntrLstmCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("pln_yrmon", "plnYrmon");
		this.hashFields.put("vndr_cnt_cd", "vndrCntCd");
		this.hashFields.put("co_cd", "coCd");
		this.hashFields.put("scnr_id", "scnrId");
		this.hashFields.put("cntr_de_sts_cd", "cntrDeStsCd");
		this.hashFields.put("ecc_cd", "eccCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("vndr_seq", "vndrSeq");
		this.hashFields.put("cntr_tpsz_cd", "cntrTpszCd");
		this.hashFields.put("vndr_abbr_nm", "vndrAbbrNm");
		this.hashFields.put("cntr_vol_qty", "cntrVolQty");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("cntr_lstm_cd", "cntrLstmCd");
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
	 * @return plnYrmon
	 */
	public String getPlnYrmon() {
		return this.plnYrmon;
	}
	
	/**
	 * Column Info
	 * @return vndrCntCd
	 */
	public String getVndrCntCd() {
		return this.vndrCntCd;
	}
	
	/**
	 * Column Info
	 * @return coCd
	 */
	public String getCoCd() {
		return this.coCd;
	}
	
	/**
	 * Column Info
	 * @return scnrId
	 */
	public String getScnrId() {
		return this.scnrId;
	}
	
	/**
	 * Column Info
	 * @return cntrDeStsCd
	 */
	public String getCntrDeStsCd() {
		return this.cntrDeStsCd;
	}
	
	/**
	 * Column Info
	 * @return eccCd
	 */
	public String getEccCd() {
		return this.eccCd;
	}
	
	/**
	 * Column Info
	 * @return creDt
	 */
	public String getCreDt() {
		return this.creDt;
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
	 * @return vndrSeq
	 */
	public String getVndrSeq() {
		return this.vndrSeq;
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
	 * @return vndrAbbrNm
	 */
	public String getVndrAbbrNm() {
		return this.vndrAbbrNm;
	}
	
	/**
	 * Column Info
	 * @return cntrVolQty
	 */
	public String getCntrVolQty() {
		return this.cntrVolQty;
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
	 * @return cntrLstmCd
	 */
	public String getCntrLstmCd() {
		return this.cntrLstmCd;
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
	 * @param plnYrmon
	 */
	public void setPlnYrmon(String plnYrmon) {
		this.plnYrmon = plnYrmon;
	}
	
	/**
	 * Column Info
	 * @param vndrCntCd
	 */
	public void setVndrCntCd(String vndrCntCd) {
		this.vndrCntCd = vndrCntCd;
	}
	
	/**
	 * Column Info
	 * @param coCd
	 */
	public void setCoCd(String coCd) {
		this.coCd = coCd;
	}
	
	/**
	 * Column Info
	 * @param scnrId
	 */
	public void setScnrId(String scnrId) {
		this.scnrId = scnrId;
	}
	
	/**
	 * Column Info
	 * @param cntrDeStsCd
	 */
	public void setCntrDeStsCd(String cntrDeStsCd) {
		this.cntrDeStsCd = cntrDeStsCd;
	}
	
	/**
	 * Column Info
	 * @param eccCd
	 */
	public void setEccCd(String eccCd) {
		this.eccCd = eccCd;
	}
	
	/**
	 * Column Info
	 * @param creDt
	 */
	public void setCreDt(String creDt) {
		this.creDt = creDt;
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
	 * @param vndrSeq
	 */
	public void setVndrSeq(String vndrSeq) {
		this.vndrSeq = vndrSeq;
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
	 * @param vndrAbbrNm
	 */
	public void setVndrAbbrNm(String vndrAbbrNm) {
		this.vndrAbbrNm = vndrAbbrNm;
	}
	
	/**
	 * Column Info
	 * @param cntrVolQty
	 */
	public void setCntrVolQty(String cntrVolQty) {
		this.cntrVolQty = cntrVolQty;
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
	 * @param cntrLstmCd
	 */
	public void setCntrLstmCd(String cntrLstmCd) {
		this.cntrLstmCd = cntrLstmCd;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setPlnYrmon(JSPUtil.getParameter(request, "pln_yrmon", ""));
		setVndrCntCd(JSPUtil.getParameter(request, "vndr_cnt_cd", ""));
		setCoCd(JSPUtil.getParameter(request, "co_cd", ""));
		setScnrId(JSPUtil.getParameter(request, "scnr_id", ""));
		setCntrDeStsCd(JSPUtil.getParameter(request, "cntr_de_sts_cd", ""));
		setEccCd(JSPUtil.getParameter(request, "ecc_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setVndrSeq(JSPUtil.getParameter(request, "vndr_seq", ""));
		setCntrTpszCd(JSPUtil.getParameter(request, "cntr_tpsz_cd", ""));
		setVndrAbbrNm(JSPUtil.getParameter(request, "vndr_abbr_nm", ""));
		setCntrVolQty(JSPUtil.getParameter(request, "cntr_vol_qty", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setCntrLstmCd(JSPUtil.getParameter(request, "cntr_lstm_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return EqrScnrNewVanLongTermVO[]
	 */
	public EqrScnrNewVanLongTermVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return EqrScnrNewVanLongTermVO[]
	 */
	public EqrScnrNewVanLongTermVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		EqrScnrNewVanLongTermVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] plnYrmon = (JSPUtil.getParameter(request, prefix	+ "pln_yrmon", length));
			String[] vndrCntCd = (JSPUtil.getParameter(request, prefix	+ "vndr_cnt_cd", length));
			String[] coCd = (JSPUtil.getParameter(request, prefix	+ "co_cd", length));
			String[] scnrId = (JSPUtil.getParameter(request, prefix	+ "scnr_id", length));
			String[] cntrDeStsCd = (JSPUtil.getParameter(request, prefix	+ "cntr_de_sts_cd", length));
			String[] eccCd = (JSPUtil.getParameter(request, prefix	+ "ecc_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] vndrSeq = (JSPUtil.getParameter(request, prefix	+ "vndr_seq", length));
			String[] cntrTpszCd = (JSPUtil.getParameter(request, prefix	+ "cntr_tpsz_cd", length));
			String[] vndrAbbrNm = (JSPUtil.getParameter(request, prefix	+ "vndr_abbr_nm", length));
			String[] cntrVolQty = (JSPUtil.getParameter(request, prefix	+ "cntr_vol_qty", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] cntrLstmCd = (JSPUtil.getParameter(request, prefix	+ "cntr_lstm_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new EqrScnrNewVanLongTermVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (plnYrmon[i] != null)
					model.setPlnYrmon(plnYrmon[i]);
				if (vndrCntCd[i] != null)
					model.setVndrCntCd(vndrCntCd[i]);
				if (coCd[i] != null)
					model.setCoCd(coCd[i]);
				if (scnrId[i] != null)
					model.setScnrId(scnrId[i]);
				if (cntrDeStsCd[i] != null)
					model.setCntrDeStsCd(cntrDeStsCd[i]);
				if (eccCd[i] != null)
					model.setEccCd(eccCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (vndrSeq[i] != null)
					model.setVndrSeq(vndrSeq[i]);
				if (cntrTpszCd[i] != null)
					model.setCntrTpszCd(cntrTpszCd[i]);
				if (vndrAbbrNm[i] != null)
					model.setVndrAbbrNm(vndrAbbrNm[i]);
				if (cntrVolQty[i] != null)
					model.setCntrVolQty(cntrVolQty[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (cntrLstmCd[i] != null)
					model.setCntrLstmCd(cntrLstmCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getEqrScnrNewVanLongTermVOs();
	}
	
	/**
	 * EES_EQR_0020 연간신조 및 L/T 계획 조회 / 수정 화면에서 사용<br>
	 * 
	 * @param request
	 * @param prefix
	 * @return
	 */
	public EqrScnrNewVanLongTermVO[] fromRequestGridArrayList1(HttpServletRequest request, String prefix) {
		EqrScnrNewVanLongTermVO model = null;
		String perfix_weekly = JSPUtil.getParameter(request, "perfix_weekly", "");
		String[] prefix1 = {};
		
		if (!(perfix_weekly.equals(""))){
        	prefix1 = perfix_weekly.split(",");
        }
	   
		int length = request.getParameterValues("ibflag").length;
		
		try {
			for (int k=0 ; k < prefix1.length ; k++){
				String[] ibflag         =  (JSPUtil.getParameter(request, "ibflag", length));
				String[] scnr_id        =  (JSPUtil.getParameter(request, "scnr_id", length));
				String   pln_yrmon      =   prefix1[k].toString();
				String[] co_cd          =  (JSPUtil.getParameter(request, "co_cd", length));
				String[] ecc_cd         =  (JSPUtil.getParameter(request, "ecc_cd", length));
				String[] cntr_lstm_cd   =  (JSPUtil.getParameter(request, "cntr_lstm_cd", length));
				String[] cntr_tpsz_cd   =  (JSPUtil.getParameter(request, "cntr_tpsz_cd", length));
				String[] vndr_cnt_cd    =  (JSPUtil.getParameter(request, "vndr_cnt_cd", length));
				String[] vndr_seq       =  (JSPUtil.getParameter(request, "vndr_seq", length));
				String[] cntr_de_sts_cd =  (JSPUtil.getParameter(request, "cntr_de_sts_cd", length));
				String[] cntr_vol_qty   =  (JSPUtil.getParameter(request,  "s1_"+ prefix1[k] + "_cntr_vol_qty", length));
				String[] vndr_abbr_nm   =  (JSPUtil.getParameter(request, "vndr_abbr_nm", length));
				
				for (int i = 0; i < length; i++) {
					model = new EqrScnrNewVanLongTermVO();
					model.setIbflag( ibflag[i]);
					model.setScnrId( scnr_id[i]);
					model.setPlnYrmon( pln_yrmon );
					model.setCoCd( co_cd[i]);
					model.setEccCd( ecc_cd[i]);
					model.setCntrLstmCd( cntr_lstm_cd[i]);
					model.setCntrTpszCd( cntr_tpsz_cd[i]);
					model.setVndrCntCd( vndr_cnt_cd[i]);
					model.setVndrSeq( vndr_seq[i]);
					model.setCntrDeStsCd( cntr_de_sts_cd[i]);
					model.setCntrVolQty( cntr_vol_qty[i]);
					model.setVndrAbbrNm( vndr_abbr_nm[i]);
					
					models.add(model);
				}
			}
			
		} catch (Exception ex) {
			return null;
		}
		return getEqrScnrNewVanLongTermVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return EqrScnrNewVanLongTermVO[]
	 */
	public EqrScnrNewVanLongTermVO[] getEqrScnrNewVanLongTermVOs(){
		EqrScnrNewVanLongTermVO[] vos = (EqrScnrNewVanLongTermVO[])models.toArray(new EqrScnrNewVanLongTermVO[models.size()]);
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
		this.plnYrmon = this.plnYrmon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vndrCntCd = this.vndrCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.coCd = this.coCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.scnrId = this.scnrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrDeStsCd = this.cntrDeStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eccCd = this.eccCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vndrSeq = this.vndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrTpszCd = this.cntrTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vndrAbbrNm = this.vndrAbbrNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrVolQty = this.cntrVolQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrLstmCd = this.cntrLstmCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
