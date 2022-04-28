/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : SpcInitAlocRtoVO.java
*@FileTitle : SpcInitAlocRtoVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.23
*@LastModifier : 최윤성
*@LastVersion : 1.0
* 2009.07.23 최윤성 
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
 * @author 최윤성
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class SpcInitAlocRtoVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<SpcInitAlocRtoVO> models = new ArrayList<SpcInitAlocRtoVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String bseMon = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String initAlocRto = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String dirCd = null;
	/* Column Info */
	private String repTrdCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Page Number */
	private String pagerows = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public SpcInitAlocRtoVO() {}

	public SpcInitAlocRtoVO(String ibflag, String pagerows, String repTrdCd, String dirCd, String bseMon, String initAlocRto, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.bseMon = bseMon;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.initAlocRto = initAlocRto;
		this.creDt = creDt;
		this.dirCd = dirCd;
		this.repTrdCd = repTrdCd;
		this.updUsrId = updUsrId;
		this.pagerows = pagerows;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("bse_mon", getBseMon());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("init_aloc_rto", getInitAlocRto());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("dir_cd", getDirCd());
		this.hashColumns.put("rep_trd_cd", getRepTrdCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("pagerows", getPagerows());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("bse_mon", "bseMon");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("init_aloc_rto", "initAlocRto");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("dir_cd", "dirCd");
		this.hashFields.put("rep_trd_cd", "repTrdCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("pagerows", "pagerows");
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
	 * @return initAlocRto
	 */
	public String getInitAlocRto() {
		return this.initAlocRto;
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
	 * @return dirCd
	 */
	public String getDirCd() {
		return this.dirCd;
	}
	
	/**
	 * Column Info
	 * @return repTrdCd
	 */
	public String getRepTrdCd() {
		return this.repTrdCd;
	}
	
	/**
	 * Column Info
	 * @return updUsrId
	 */
	public String getUpdUsrId() {
		return this.updUsrId;
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
	 * @param updDt
	 */
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
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
	 * @param initAlocRto
	 */
	public void setInitAlocRto(String initAlocRto) {
		this.initAlocRto = initAlocRto;
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
	 * @param dirCd
	 */
	public void setDirCd(String dirCd) {
		this.dirCd = dirCd;
	}
	
	/**
	 * Column Info
	 * @param repTrdCd
	 */
	public void setRepTrdCd(String repTrdCd) {
		this.repTrdCd = repTrdCd;
	}
	
	/**
	 * Column Info
	 * @param updUsrId
	 */
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
	}
	
	/**
	 * Page Number
	 * @param pagerows
	 */
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setBseMon(JSPUtil.getParameter(request, "bse_mon", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setInitAlocRto(JSPUtil.getParameter(request, "init_aloc_rto", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setDirCd(JSPUtil.getParameter(request, "dir_cd", ""));
		setRepTrdCd(JSPUtil.getParameter(request, "rep_trd_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return SpcInitAlocRtoVO[]
	 */
	public SpcInitAlocRtoVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return SpcInitAlocRtoVO[]
	 */
	public SpcInitAlocRtoVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		SpcInitAlocRtoVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] bseMon = (JSPUtil.getParameter(request, prefix	+ "bse_mon", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] initAlocRto = (JSPUtil.getParameter(request, prefix	+ "init_aloc_rto", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] dirCd = (JSPUtil.getParameter(request, prefix	+ "dir_cd", length));
			String[] repTrdCd = (JSPUtil.getParameter(request, prefix	+ "rep_trd_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			
			for (int i = 0; i < length; i++) {
				model = new SpcInitAlocRtoVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (bseMon[i] != null)
					model.setBseMon(bseMon[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (initAlocRto[i] != null)
					model.setInitAlocRto(initAlocRto[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (dirCd[i] != null)
					model.setDirCd(dirCd[i]);
				if (repTrdCd[i] != null)
					model.setRepTrdCd(repTrdCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getSpcInitAlocRtoVOs();
	}
	
	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return SpcInitAlocRtoVO[]
	 */
	public SpcInitAlocRtoVO[] fromRequestGridArrayList(HttpServletRequest request, String prefix) {
		SpcInitAlocRtoVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "FLG");
  		if(tmp == null)
   			return null;
  		
  		String[] month = {"01","02","03","04","05","06","07","08","09","10","11","12"};

  		int length = request.getParameterValues(prefix + "FLG").length;
  
		try {
			
				String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
				String bseMon = null;
				String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
				String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "FLG", length));
				String[] mon01 = (JSPUtil.getParameter(request, prefix	+ "mon_01", length));
				String[] mon02 = (JSPUtil.getParameter(request, prefix	+ "mon_02", length));
				String[] mon03 = (JSPUtil.getParameter(request, prefix	+ "mon_03", length));
				String[] mon04 = (JSPUtil.getParameter(request, prefix	+ "mon_04", length));
				String[] mon05 = (JSPUtil.getParameter(request, prefix	+ "mon_05", length));
				String[] mon06 = (JSPUtil.getParameter(request, prefix	+ "mon_06", length));
				String[] mon07 = (JSPUtil.getParameter(request, prefix	+ "mon_07", length));
				String[] mon08 = (JSPUtil.getParameter(request, prefix	+ "mon_08", length));
				String[] mon09 = (JSPUtil.getParameter(request, prefix	+ "mon_09", length));
				String[] mon10 = (JSPUtil.getParameter(request, prefix	+ "mon_10", length));
				String[] mon11 = (JSPUtil.getParameter(request, prefix	+ "mon_11", length));
				String[] mon12 = (JSPUtil.getParameter(request, prefix	+ "mon_12", length));
				String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
				String[] dirCd = (JSPUtil.getParameter(request, prefix	+ "dir_cd", length));
				String[] repTrdCd = (JSPUtil.getParameter(request, prefix	+ "rep_trd_cd", length));
				String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
				String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
				
				for (int i = 0; i < length; i++) {
					bseMon = mon01[i]+","+mon02[i]+","+mon03[i]+","+mon04[i]+","+mon05[i]+","+mon06[i]+","+mon07[i]+","+mon08[i]+","+mon09[i]+","+mon10[i]+","+mon11[i]+","+mon12[i];
					
					String[] arrTmp = bseMon.split(",");
					for(int k = 0; k < arrTmp.length; k++){
						model = new SpcInitAlocRtoVO();
						if (updDt[i] != null)
							model.setUpdDt(updDt[i]);
						if (month[k] != null)
							model.setBseMon(month[k]);
						if (creUsrId[i] != null)
							model.setCreUsrId(creUsrId[i]);
						if (ibflag[i] != null)
							model.setIbflag(ibflag[i]);
						if (arrTmp[k] != null)
							model.setInitAlocRto(arrTmp[k]);
						if (creDt[i] != null)
							model.setCreDt(creDt[i]);
						if (dirCd[i] != null)
							model.setDirCd(dirCd[i]);
						if (repTrdCd[i] != null)
							model.setRepTrdCd(repTrdCd[i]);
						if (updUsrId[i] != null)
							model.setUpdUsrId(updUsrId[i]);
						if (pagerows[i] != null)
							model.setPagerows(pagerows[i]);
						models.add(model);
				}
			}

		} catch (Exception e) {
			return null;
		}
		return getSpcInitAlocRtoVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return SpcInitAlocRtoVO[]
	 */
	public SpcInitAlocRtoVO[] getSpcInitAlocRtoVOs(){
		SpcInitAlocRtoVO[] vos = (SpcInitAlocRtoVO[])models.toArray(new SpcInitAlocRtoVO[models.size()]);
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
		this.bseMon = this.bseMon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.initAlocRto = this.initAlocRto .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dirCd = this.dirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.repTrdCd = this.repTrdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
