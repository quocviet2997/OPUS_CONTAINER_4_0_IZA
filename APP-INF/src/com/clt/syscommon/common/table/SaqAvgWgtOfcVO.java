/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : SaqAvgWgtOfcVO.java
*@FileTitle : SaqAvgWgtOfcVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.23
*@LastModifier : 김민아
*@LastVersion : 1.0
* 2009.07.23 김민아 
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
 * @author 김민아
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class SaqAvgWgtOfcVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<SaqAvgWgtOfcVO> models = new ArrayList<SaqAvgWgtOfcVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String trdCd = null;
	/* Column Info */
	private String bseYr = null;
	/* Column Info */
	private String rlaneCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String bseMon = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String polCd = null;
	/* Column Info */
	private String cntrAvgWgt = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String slsOfcCd = null;
	/* Column Info */
	private String dirCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String subTrdCd = null;
	/* Column Info */
	private String initCntrAvgWgt = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public SaqAvgWgtOfcVO() {}

	public SaqAvgWgtOfcVO(String ibflag, String pagerows, String bseYr, String bseMon, String trdCd, String rlaneCd, String dirCd, String slsOfcCd, String polCd, String subTrdCd, String cntrAvgWgt, String initCntrAvgWgt, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.creDt = creDt;
		this.trdCd = trdCd;
		this.bseYr = bseYr;
		this.rlaneCd = rlaneCd;
		this.pagerows = pagerows;
		this.bseMon = bseMon;
		this.ibflag = ibflag;
		this.polCd = polCd;
		this.cntrAvgWgt = cntrAvgWgt;
		this.creUsrId = creUsrId;
		this.slsOfcCd = slsOfcCd;
		this.dirCd = dirCd;
		this.updUsrId = updUsrId;
		this.subTrdCd = subTrdCd;
		this.initCntrAvgWgt = initCntrAvgWgt;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("trd_cd", getTrdCd());
		this.hashColumns.put("bse_yr", getBseYr());
		this.hashColumns.put("rlane_cd", getRlaneCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("bse_mon", getBseMon());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("pol_cd", getPolCd());
		this.hashColumns.put("cntr_avg_wgt", getCntrAvgWgt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("sls_ofc_cd", getSlsOfcCd());
		this.hashColumns.put("dir_cd", getDirCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("sub_trd_cd", getSubTrdCd());
		this.hashColumns.put("init_cntr_avg_wgt", getInitCntrAvgWgt());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("trd_cd", "trdCd");
		this.hashFields.put("bse_yr", "bseYr");
		this.hashFields.put("rlane_cd", "rlaneCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("bse_mon", "bseMon");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("pol_cd", "polCd");
		this.hashFields.put("cntr_avg_wgt", "cntrAvgWgt");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("sls_ofc_cd", "slsOfcCd");
		this.hashFields.put("dir_cd", "dirCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("sub_trd_cd", "subTrdCd");
		this.hashFields.put("init_cntr_avg_wgt", "initCntrAvgWgt");
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
	 * Page Number
	 * @return pagerows
	 */
	public String getPagerows() {
		return this.pagerows;
	}
	
	/**
	 * Column Info
	 * @return bseMon
	 */
	public String getBseMon() {
		return this.bseMon;
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
	 * @return polCd
	 */
	public String getPolCd() {
		return this.polCd;
	}
	
	/**
	 * Column Info
	 * @return cntrAvgWgt
	 */
	public String getCntrAvgWgt() {
		return this.cntrAvgWgt;
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
	 * @return slsOfcCd
	 */
	public String getSlsOfcCd() {
		return this.slsOfcCd;
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
	 * @return initCntrAvgWgt
	 */
	public String getInitCntrAvgWgt() {
		return this.initCntrAvgWgt;
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
	 * Page Number
	 * @param pagerows
	 */
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
	}
	
	/**
	 * Column Info
	 * @param bseMon
	 */
	public void setBseMon(String bseMon) {
		this.bseMon = bseMon;
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
	 * @param polCd
	 */
	public void setPolCd(String polCd) {
		this.polCd = polCd;
	}
	
	/**
	 * Column Info
	 * @param cntrAvgWgt
	 */
	public void setCntrAvgWgt(String cntrAvgWgt) {
		this.cntrAvgWgt = cntrAvgWgt;
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
	 * @param slsOfcCd
	 */
	public void setSlsOfcCd(String slsOfcCd) {
		this.slsOfcCd = slsOfcCd;
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
	 * Column Info
	 * @param initCntrAvgWgt
	 */
	public void setInitCntrAvgWgt(String initCntrAvgWgt) {
		this.initCntrAvgWgt = initCntrAvgWgt;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setTrdCd(JSPUtil.getParameter(request, "trd_cd", ""));
		setBseYr(JSPUtil.getParameter(request, "bse_yr", ""));
		setRlaneCd(JSPUtil.getParameter(request, "rlane_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setBseMon(JSPUtil.getParameter(request, "bse_mon", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setPolCd(JSPUtil.getParameter(request, "pol_cd", ""));
		setCntrAvgWgt(JSPUtil.getParameter(request, "cntr_avg_wgt", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setSlsOfcCd(JSPUtil.getParameter(request, "sls_ofc_cd", ""));
		setDirCd(JSPUtil.getParameter(request, "dir_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setSubTrdCd(JSPUtil.getParameter(request, "sub_trd_cd", ""));
		setInitCntrAvgWgt(JSPUtil.getParameter(request, "init_cntr_avg_wgt", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return SaqAvgWgtOfcVO[]
	 */
	public SaqAvgWgtOfcVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return SaqAvgWgtOfcVO[]
	 */
	public SaqAvgWgtOfcVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		SaqAvgWgtOfcVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] trdCd = (JSPUtil.getParameter(request, prefix	+ "trd_cd", length));
			String[] bseYr = (JSPUtil.getParameter(request, prefix	+ "bse_yr", length));
			String[] rlaneCd = (JSPUtil.getParameter(request, prefix	+ "rlane_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] bseMon = (JSPUtil.getParameter(request, prefix	+ "bse_mon", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] polCd = (JSPUtil.getParameter(request, prefix	+ "pol_cd", length));
			String[] cntrAvgWgt = (JSPUtil.getParameter(request, prefix	+ "cntr_avg_wgt", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] slsOfcCd = (JSPUtil.getParameter(request, prefix	+ "sls_ofc_cd", length));
			String[] dirCd = (JSPUtil.getParameter(request, prefix	+ "dir_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] subTrdCd = (JSPUtil.getParameter(request, prefix	+ "sub_trd_cd", length));
			String[] initCntrAvgWgt = (JSPUtil.getParameter(request, prefix	+ "init_cntr_avg_wgt", length));
			
			for (int i = 0; i < length; i++) {
				model = new SaqAvgWgtOfcVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (trdCd[i] != null)
					model.setTrdCd(trdCd[i]);
				if (bseYr[i] != null)
					model.setBseYr(bseYr[i]);
				if (rlaneCd[i] != null)
					model.setRlaneCd(rlaneCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (bseMon[i] != null)
					model.setBseMon(bseMon[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (polCd[i] != null)
					model.setPolCd(polCd[i]);
				if (cntrAvgWgt[i] != null)
					model.setCntrAvgWgt(cntrAvgWgt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (slsOfcCd[i] != null)
					model.setSlsOfcCd(slsOfcCd[i]);
				if (dirCd[i] != null)
					model.setDirCd(dirCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (subTrdCd[i] != null)
					model.setSubTrdCd(subTrdCd[i]);
				if (initCntrAvgWgt[i] != null)
					model.setInitCntrAvgWgt(initCntrAvgWgt[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getSaqAvgWgtOfcVOs();
	}
	
	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return SaqMaxLodFctrVO[]
	 */
	public SaqAvgWgtOfcVO[] fromRequestGridArrayList(HttpServletRequest request, String prefix) {
		SaqAvgWgtOfcVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "FLG");
  		if(tmp == null)
   			return null;
        
  		String[] month = {"01","02","03","04","05","06","07","08","09","10","11","12"};
  		
  		int length = request.getParameterValues(prefix + "FLG").length;

  
		try {
			
				String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
				String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
				String[] trdCd = (JSPUtil.getParameter(request, prefix	+ "trd_cd", length));
				String[] bseYr = (JSPUtil.getParameter(request, prefix	+ "bse_yr", length));
				String[] rlaneCd = (JSPUtil.getParameter(request, prefix	+ "rlane_cd", length));
				String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
				String[]  bseMon = month;
				String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "FLG", length));
				String[] polCd = (JSPUtil.getParameter(request, prefix	+ "pol_cd", length));
				String[] cntrAvgWgt1 = (JSPUtil.getParameter(request, prefix	+ "m01", length));
				String[] cntrAvgWgt2 = (JSPUtil.getParameter(request, prefix	+ "m02", length));
				String[] cntrAvgWgt3 = (JSPUtil.getParameter(request, prefix	+ "m03", length));
				String[] cntrAvgWgt4 = (JSPUtil.getParameter(request, prefix	+ "m04", length));
				String[] cntrAvgWgt5 = (JSPUtil.getParameter(request, prefix	+ "m05", length));
				String[] cntrAvgWgt6 = (JSPUtil.getParameter(request, prefix	+ "m06", length));
				String[] cntrAvgWgt7 = (JSPUtil.getParameter(request, prefix	+ "m07", length));
				String[] cntrAvgWgt8 = (JSPUtil.getParameter(request, prefix	+ "m08", length));
				String[] cntrAvgWgt9 = (JSPUtil.getParameter(request, prefix	+ "m09", length));
				String[] cntrAvgWgt10 = (JSPUtil.getParameter(request, prefix	+ "m10", length));
				String[] cntrAvgWgt11 = (JSPUtil.getParameter(request, prefix	+ "m11", length));
				String[] cntrAvgWgt12 = (JSPUtil.getParameter(request, prefix	+ "m12", length));
				
				String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
				String[] slsOfcCd = (JSPUtil.getParameter(request, prefix	+ "sls_ofc_cd", length));
				String[] dirCd = (JSPUtil.getParameter(request, prefix	+ "dir_cd", length));
				String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
				String[] subTrdCd = (JSPUtil.getParameter(request, prefix	+ "sub_trd_cd", length));
			
				String cntravgwgt = null;
		for(int k=0; k< length ; k++){	

					cntravgwgt = cntrAvgWgt1[k] + "," +  cntrAvgWgt2[k] + "," +  cntrAvgWgt3[k] + "," +  cntrAvgWgt4[k] + ","+  cntrAvgWgt5[k] + ","+  cntrAvgWgt6[k] + ","+  cntrAvgWgt7[k] + ","+  cntrAvgWgt8[k] + ","+  cntrAvgWgt9[k] + ","+  cntrAvgWgt10[k] + ","+  cntrAvgWgt11[k] + ","+  cntrAvgWgt12[k] ;

					String[] arrTmp = cntravgwgt.split(",");	
			
		     for (int j = 0; j < arrTmp.length; j++) {
		    	 if(!arrTmp[j].equals("")){
		    	 
		    	 model = new SaqAvgWgtOfcVO();
				if (updDt[k] != null)
					model.setUpdDt(updDt[k]);
				if (creDt[k] != null)
					model.setCreDt(creDt[k]);
				if (trdCd[k] != null)
					model.setTrdCd(trdCd[k]);
				if (bseYr[k] != null)
					model.setBseYr(bseYr[k]);
				if (rlaneCd[k] != null)
					model.setRlaneCd(rlaneCd[k]);
				if (pagerows[k] != null)
					model.setPagerows(pagerows[k]);
				if (arrTmp[j] != null)
					model.setBseMon(month[j]);
				if (ibflag[k] != null)
					model.setIbflag(ibflag[k]);
				if (polCd[k] != null)
					model.setPolCd(polCd[k]);
				
				if (arrTmp[j] != null)
					model.setCntrAvgWgt(arrTmp[j]);
				if (creUsrId[k] != null)
					model.setCreUsrId(creUsrId[k]);
				if (slsOfcCd[k] != null)
					model.setSlsOfcCd(slsOfcCd[k]);
				if (dirCd[k] != null)
					model.setDirCd(dirCd[k]);
				if (updUsrId[k] != null)
					model.setUpdUsrId(updUsrId[k]);
				if (subTrdCd[k] != null)
					model.setSubTrdCd(subTrdCd[k]);
	
				models.add(model);
			  }	
			}
		  }
		} catch (Exception e) {
			return null;
		}
		return getSaqAvgWgtOfcVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return SaqAvgWgtOfcVO[]
	 */
	public SaqAvgWgtOfcVO[] getSaqAvgWgtOfcVOs(){
		SaqAvgWgtOfcVO[] vos = (SaqAvgWgtOfcVO[])models.toArray(new SaqAvgWgtOfcVO[models.size()]);
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
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trdCd = this.trdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bseYr = this.bseYr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rlaneCd = this.rlaneCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bseMon = this.bseMon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.polCd = this.polCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrAvgWgt = this.cntrAvgWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slsOfcCd = this.slsOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dirCd = this.dirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.subTrdCd = this.subTrdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.initCntrAvgWgt = this.initCntrAvgWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
