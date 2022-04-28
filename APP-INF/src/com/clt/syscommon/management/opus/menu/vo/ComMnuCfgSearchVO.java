/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : ComMnuCfgSearchVO.java
*@FileTitle : ComMnuCfgSearchVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.10.01
*@LastModifier : 
*@LastVersion : 1.0
* 2009.10.01  
* 1.0 Creation
=========================================================*/

package com.clt.syscommon.management.opus.menu.vo;

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

public class ComMnuCfgSearchVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<ComMnuCfgSearchVO> models = new ArrayList<ComMnuCfgSearchVO>();
	
	/* Column Info */
	private String dpSeq = null;
	/* Column Info */
	private String pgmUrl = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String level = null;
	/* Column Info */
	private String accessLvl = null;
	/* Column Info */
	private String prntPgmNo = null;
	/* Column Info */
	private String pgmNm = null;
	/* Column Info */
	private String chdPgmNo = null;
	/* Column Info */
	private String mnuCfgCd = null;
	/* Page Number */
	private String pagerows = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public ComMnuCfgSearchVO() {}

	public ComMnuCfgSearchVO(String ibflag, String pagerows, String level, String chdPgmNo, String pgmNm, String dpSeq, String mnuCfgCd, String prntPgmNo, String pgmUrl, String accessLvl) {
		this.dpSeq = dpSeq;
		this.pgmUrl = pgmUrl;
		this.ibflag = ibflag;
		this.level = level;
		this.accessLvl = accessLvl;
		this.prntPgmNo = prntPgmNo;
		this.pgmNm = pgmNm;
		this.chdPgmNo = chdPgmNo;
		this.mnuCfgCd = mnuCfgCd;
		this.pagerows = pagerows;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("dp_seq", getDpSeq());
		this.hashColumns.put("pgm_url", getPgmUrl());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("level", getLevel());
		this.hashColumns.put("access_lvl", getAccessLvl());
		this.hashColumns.put("prnt_pgm_no", getPrntPgmNo());
		this.hashColumns.put("pgm_nm", getPgmNm());
		this.hashColumns.put("chd_pgm_no", getChdPgmNo());
		this.hashColumns.put("mnu_cfg_cd", getMnuCfgCd());
		this.hashColumns.put("pagerows", getPagerows());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("dp_seq", "dpSeq");
		this.hashFields.put("pgm_url", "pgmUrl");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("level", "level");
		this.hashFields.put("access_lvl", "accessLvl");
		this.hashFields.put("prnt_pgm_no", "prntPgmNo");
		this.hashFields.put("pgm_nm", "pgmNm");
		this.hashFields.put("chd_pgm_no", "chdPgmNo");
		this.hashFields.put("mnu_cfg_cd", "mnuCfgCd");
		this.hashFields.put("pagerows", "pagerows");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return dpSeq
	 */
	public String getDpSeq() {
		return this.dpSeq;
	}
	
	/**
	 * Column Info
	 * @return pgmUrl
	 */
	public String getPgmUrl() {
		return this.pgmUrl;
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
	 * @return level
	 */
	public String getLevel() {
		return this.level;
	}
	
	/**
	 * Column Info
	 * @return accessLvl
	 */
	public String getAccessLvl() {
		return this.accessLvl;
	}
	
	/**
	 * Column Info
	 * @return prntPgmNo
	 */
	public String getPrntPgmNo() {
		return this.prntPgmNo;
	}
	
	/**
	 * Column Info
	 * @return pgmNm
	 */
	public String getPgmNm() {
		return this.pgmNm;
	}
	
	/**
	 * Column Info
	 * @return chdPgmNo
	 */
	public String getChdPgmNo() {
		return this.chdPgmNo;
	}
	
	/**
	 * Column Info
	 * @return mnuCfgCd
	 */
	public String getMnuCfgCd() {
		return this.mnuCfgCd;
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
	 * @param dpSeq
	 */
	public void setDpSeq(String dpSeq) {
		this.dpSeq = dpSeq;
	}
	
	/**
	 * Column Info
	 * @param pgmUrl
	 */
	public void setPgmUrl(String pgmUrl) {
		this.pgmUrl = pgmUrl;
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
	 * @param level
	 */
	public void setLevel(String level) {
		this.level = level;
	}
	
	/**
	 * Column Info
	 * @param accessLvl
	 */
	public void setAccessLvl(String accessLvl) {
		this.accessLvl = accessLvl;
	}
	
	/**
	 * Column Info
	 * @param prntPgmNo
	 */
	public void setPrntPgmNo(String prntPgmNo) {
		this.prntPgmNo = prntPgmNo;
	}
	
	/**
	 * Column Info
	 * @param pgmNm
	 */
	public void setPgmNm(String pgmNm) {
		this.pgmNm = pgmNm;
	}
	
	/**
	 * Column Info
	 * @param chdPgmNo
	 */
	public void setChdPgmNo(String chdPgmNo) {
		this.chdPgmNo = chdPgmNo;
	}
	
	/**
	 * Column Info
	 * @param mnuCfgCd
	 */
	public void setMnuCfgCd(String mnuCfgCd) {
		this.mnuCfgCd = mnuCfgCd;
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
		setDpSeq(JSPUtil.getParameter(request, "dp_seq", ""));
		setPgmUrl(JSPUtil.getParameter(request, "pgm_url", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setLevel(JSPUtil.getParameter(request, "level", ""));
		setAccessLvl(JSPUtil.getParameter(request, "access_lvl", ""));
		setPrntPgmNo(JSPUtil.getParameter(request, "prnt_pgm_no", ""));
		setPgmNm(JSPUtil.getParameter(request, "pgm_nm", ""));
		setChdPgmNo(JSPUtil.getParameter(request, "chd_pgm_no", ""));
		setMnuCfgCd(JSPUtil.getParameter(request, "mnu_cfg_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return ComMnuCfgSearchVO[]
	 */
	public ComMnuCfgSearchVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return ComMnuCfgSearchVO[]
	 */
	public ComMnuCfgSearchVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		ComMnuCfgSearchVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] dpSeq = (JSPUtil.getParameter(request, prefix	+ "dp_seq", length));
			String[] pgmUrl = (JSPUtil.getParameter(request, prefix	+ "pgm_url", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] level = (JSPUtil.getParameter(request, prefix	+ "level", length));
			String[] accessLvl = (JSPUtil.getParameter(request, prefix	+ "access_lvl", length));
			String[] prntPgmNo = (JSPUtil.getParameter(request, prefix	+ "prnt_pgm_no", length));
			String[] pgmNm = (JSPUtil.getParameter(request, prefix	+ "pgm_nm", length));
			String[] chdPgmNo = (JSPUtil.getParameter(request, prefix	+ "chd_pgm_no", length));
			String[] mnuCfgCd = (JSPUtil.getParameter(request, prefix	+ "mnu_cfg_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			
			for (int i = 0; i < length; i++) {
				model = new ComMnuCfgSearchVO();
				if (dpSeq[i] != null)
					model.setDpSeq(dpSeq[i]);
				if (pgmUrl[i] != null)
					model.setPgmUrl(pgmUrl[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (level[i] != null)
					model.setLevel(level[i]);
				if (accessLvl[i] != null)
					model.setAccessLvl(accessLvl[i]);
				if (prntPgmNo[i] != null)
					model.setPrntPgmNo(prntPgmNo[i]);
				if (pgmNm[i] != null)
					model.setPgmNm(pgmNm[i]);
				if (chdPgmNo[i] != null)
					model.setChdPgmNo(chdPgmNo[i]);
				if (mnuCfgCd[i] != null)
					model.setMnuCfgCd(mnuCfgCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getComMnuCfgSearchVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return ComMnuCfgSearchVO[]
	 */
	public ComMnuCfgSearchVO[] getComMnuCfgSearchVOs(){
		ComMnuCfgSearchVO[] vos = (ComMnuCfgSearchVO[])models.toArray(new ComMnuCfgSearchVO[models.size()]);
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
		this.dpSeq = this.dpSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pgmUrl = this.pgmUrl .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.level = this.level .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.accessLvl = this.accessLvl .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prntPgmNo = this.prntPgmNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pgmNm = this.pgmNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chdPgmNo = this.chdPgmNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mnuCfgCd = this.mnuCfgCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
