/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : ComEmlReSndInfoVO.java
*@FileTitle : ComEmlReSndInfoVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.08.19
*@LastModifier : 김정훈
*@LastVersion : 1.0
* 2009.08.19 김정훈 
* 1.0 Creation
=========================================================*/

package com.clt.sample.groupwarepopup.groupwarepopup.vo;

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
 * @author 김정훈
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class ComEmlReSndInfoVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<ComEmlReSndInfoVO> models = new ArrayList<ComEmlReSndInfoVO>();
	
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String emlsndno = null;
	/* Column Info */
	private String emlfilepathurl = null;
	/* Page Number */
	private String pagerows = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public ComEmlReSndInfoVO() {}

	public ComEmlReSndInfoVO(String ibflag, String pagerows, String emlsndno, String emlfilepathurl) {
		this.ibflag = ibflag;
		this.emlsndno = emlsndno;
		this.emlfilepathurl = emlfilepathurl;
		this.pagerows = pagerows;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("emlsndno", getEmlsndno());
		this.hashColumns.put("emlfilepathurl", getEmlfilepathurl());
		this.hashColumns.put("pagerows", getPagerows());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("emlsndno", "emlsndno");
		this.hashFields.put("emlfilepathurl", "emlfilepathurl");
		this.hashFields.put("pagerows", "pagerows");
		return this.hashFields;
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
	 * @return emlsndno
	 */
	public String getEmlsndno() {
		return this.emlsndno;
	}
	
	/**
	 * Column Info
	 * @return emlfilepathurl
	 */
	public String getEmlfilepathurl() {
		return this.emlfilepathurl;
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
	 * @param emlsndno
	 */
	public void setEmlsndno(String emlsndno) {
		this.emlsndno = emlsndno;
	}
	
	/**
	 * Column Info
	 * @param emlfilepathurl
	 */
	public void setEmlfilepathurl(String emlfilepathurl) {
		this.emlfilepathurl = emlfilepathurl;
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
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setEmlsndno(JSPUtil.getParameter(request, "emlsndno", ""));
		setEmlfilepathurl(JSPUtil.getParameter(request, "emlfilepathurl", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return ComEmlReSndInfoVO[]
	 */
	public ComEmlReSndInfoVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return ComEmlReSndInfoVO[]
	 */
	public ComEmlReSndInfoVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		ComEmlReSndInfoVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] emlsndno = (JSPUtil.getParameter(request, prefix	+ "emlsndno", length));
			String[] emlfilepathurl = (JSPUtil.getParameter(request, prefix	+ "emlfilepathurl", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			
			for (int i = 0; i < length; i++) {
				model = new ComEmlReSndInfoVO();
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (emlsndno[i] != null)
					model.setEmlsndno(emlsndno[i]);
				if (emlfilepathurl[i] != null)
					model.setEmlfilepathurl(emlfilepathurl[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getComEmlReSndInfoVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return ComEmlReSndInfoVO[]
	 */
	public ComEmlReSndInfoVO[] getComEmlReSndInfoVOs(){
		ComEmlReSndInfoVO[] vos = (ComEmlReSndInfoVO[])models.toArray(new ComEmlReSndInfoVO[models.size()]);
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
		this.emlsndno = this.emlsndno .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.emlfilepathurl = this.emlfilepathurl .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
