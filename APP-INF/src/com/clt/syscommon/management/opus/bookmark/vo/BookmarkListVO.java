/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BookmarkListVO.java
*@FileTitle : BookmarkListVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.09.24
*@LastModifier : 
*@LastVersion : 1.0
* 2009.09.24  
* 1.0 Creation
=========================================================*/

package com.clt.syscommon.management.opus.bookmark.vo;

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

public class BookmarkListVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BookmarkListVO> models = new ArrayList<BookmarkListVO>();
	
	/* Column Info */
	private String dpSeq = null;
	/* Column Info */
	private String dpNm = null;
	/* Column Info */
	private String pgmUrl = null;
	/* Column Info */
	private String pgmFullUrl = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String level = null;
	/* Column Info */
	private String folFlg = null;
	/* Column Info */
	private String usrId = null;
	/* Column Info */
	private String prntPgmNo = null;
	/* Column Info */
	private String pgmNm = null;
	/* Column Info */
	private String pgmNo = null;
	/* Page Number */
	private String pagerows = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BookmarkListVO() {}

	public BookmarkListVO(String ibflag, String pagerows, String level, String dpNm, String folFlg, String pgmNo, String dpSeq, String prntPgmNo, String pgmNm, String pgmUrl, String pgmFullUrl, String usrId) {
		this.dpSeq = dpSeq;
		this.dpNm = dpNm;
		this.pgmUrl = pgmUrl;
		this.pgmFullUrl = pgmFullUrl;
		this.ibflag = ibflag;
		this.level = level;
		this.folFlg = folFlg;
		this.usrId = usrId;
		this.prntPgmNo = prntPgmNo;
		this.pgmNm = pgmNm;
		this.pgmNo = pgmNo;
		this.pagerows = pagerows;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("dp_seq", getDpSeq());
		this.hashColumns.put("dp_nm", getDpNm());
		this.hashColumns.put("pgm_url", getPgmUrl());
		this.hashColumns.put("pgm_full_url", getPgmFullUrl());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("level", getLevel());
		this.hashColumns.put("fol_flg", getFolFlg());
		this.hashColumns.put("usr_id", getUsrId());
		this.hashColumns.put("prnt_pgm_no", getPrntPgmNo());
		this.hashColumns.put("pgm_nm", getPgmNm());
		this.hashColumns.put("pgm_no", getPgmNo());
		this.hashColumns.put("pagerows", getPagerows());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("dp_seq", "dpSeq");
		this.hashFields.put("dp_nm", "dpNm");
		this.hashFields.put("pgm_url", "pgmUrl");
		this.hashFields.put("pgm_full_url", "pgmFullUrl");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("level", "level");
		this.hashFields.put("fol_flg", "folFlg");
		this.hashFields.put("usr_id", "usrId");
		this.hashFields.put("prnt_pgm_no", "prntPgmNo");
		this.hashFields.put("pgm_nm", "pgmNm");
		this.hashFields.put("pgm_no", "pgmNo");
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
	 * @return dpNm
	 */
	public String getDpNm() {
		return this.dpNm;
	}
	
	/**
	 * Column Info
	 * @return pgmUrl
	 */
	public String getPgmUrl() {
		return this.pgmUrl;
	}
	
	/**
	 * Column Info
	 * @return pgmFullUrl
	 */
	public String getPgmFullUrl() {
		return this.pgmFullUrl;
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
	 * @return folFlg
	 */
	public String getFolFlg() {
		return this.folFlg;
	}
	
	/**
	 * Column Info
	 * @return usrId
	 */
	public String getUsrId() {
		return this.usrId;
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
	 * @return pgmNo
	 */
	public String getPgmNo() {
		return this.pgmNo;
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
	 * @param dpNm
	 */
	public void setDpNm(String dpNm) {
		this.dpNm = dpNm;
	}
	
	/**
	 * Column Info
	 * @param pgmUrl
	 */
	public void setPgmUrl(String pgmUrl) {
		this.pgmUrl = pgmUrl;
	}
	
	/**
	 * Column Info
	 * @param pgmFullUrl
	 */
	public void setPgmFullUrl(String pgmFullUrl) {
		this.pgmFullUrl = pgmFullUrl;
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
	 * @param folFlg
	 */
	public void setFolFlg(String folFlg) {
		this.folFlg = folFlg;
	}
	
	/**
	 * Column Info
	 * @param usrId
	 */
	public void setUsrId(String usrId) {
		this.usrId = usrId;
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
	 * @param pgmNo
	 */
	public void setPgmNo(String pgmNo) {
		this.pgmNo = pgmNo;
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
		setDpNm(JSPUtil.getParameter(request, "dp_nm", ""));
		setPgmUrl(JSPUtil.getParameter(request, "pgm_url", ""));
		setPgmFullUrl(JSPUtil.getParameter(request, "pgm_full_url", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setLevel(JSPUtil.getParameter(request, "level", ""));
		setFolFlg(JSPUtil.getParameter(request, "fol_flg", ""));
		setUsrId(JSPUtil.getParameter(request, "usr_id", ""));
		setPrntPgmNo(JSPUtil.getParameter(request, "prnt_pgm_no", ""));
		setPgmNm(JSPUtil.getParameter(request, "pgm_nm", ""));
		setPgmNo(JSPUtil.getParameter(request, "pgm_no", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BookmarkListVO[]
	 */
	public BookmarkListVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BookmarkListVO[]
	 */
	public BookmarkListVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BookmarkListVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] dpSeq = (JSPUtil.getParameter(request, prefix	+ "dp_seq", length));
			String[] dpNm = (JSPUtil.getParameter(request, prefix	+ "dp_nm", length));
			String[] pgmUrl = (JSPUtil.getParameter(request, prefix	+ "pgm_url", length));
			String[] pgmFullUrl = (JSPUtil.getParameter(request, prefix	+ "pgm_full_url", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] level = (JSPUtil.getParameter(request, prefix	+ "level", length));
			String[] folFlg = (JSPUtil.getParameter(request, prefix	+ "fol_flg", length));
			String[] usrId = (JSPUtil.getParameter(request, prefix	+ "usr_id", length));
			String[] prntPgmNo = (JSPUtil.getParameter(request, prefix	+ "prnt_pgm_no", length));
			String[] pgmNm = (JSPUtil.getParameter(request, prefix	+ "pgm_nm", length));
			String[] pgmNo = (JSPUtil.getParameter(request, prefix	+ "pgm_no", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			
			for (int i = 0; i < length; i++) {
				model = new BookmarkListVO();
				if (dpSeq[i] != null)
					model.setDpSeq(dpSeq[i]);
				if (dpNm[i] != null)
					model.setDpNm(dpNm[i]);
				if (pgmUrl[i] != null)
					model.setPgmUrl(pgmUrl[i]);
				if (pgmFullUrl[i] != null)
					model.setPgmFullUrl(pgmFullUrl[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (level[i] != null)
					model.setLevel(level[i]);
				if (folFlg[i] != null)
					model.setFolFlg(folFlg[i]);
				if (usrId[i] != null)
					model.setUsrId(usrId[i]);
				if (prntPgmNo[i] != null)
					model.setPrntPgmNo(prntPgmNo[i]);
				if (pgmNm[i] != null)
					model.setPgmNm(pgmNm[i]);
				if (pgmNo[i] != null)
					model.setPgmNo(pgmNo[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBookmarkListVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BookmarkListVO[]
	 */
	public BookmarkListVO[] getBookmarkListVOs(){
		BookmarkListVO[] vos = (BookmarkListVO[])models.toArray(new BookmarkListVO[models.size()]);
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
		this.dpNm = this.dpNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pgmUrl = this.pgmUrl .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pgmFullUrl = this.pgmFullUrl .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.level = this.level .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.folFlg = this.folFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.usrId = this.usrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prntPgmNo = this.prntPgmNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pgmNm = this.pgmNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pgmNo = this.pgmNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
