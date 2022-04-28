/*=========================================================
*Copyright(c) 2011 CyberLogitec
*@FileName : SetupConstantListVO.java
*@FileTitle : SetupConstantListVO
*Open Issues :
*Change history :
*@LastModifyDate : 2011.02.17
*@LastModifier : 송민석
*@LastVersion : 1.0
* 2011.02.17 송민석 
* 1.0 Creation
=========================================================*/

package com.clt.apps.opus.bcm.sup.valuemanage.vo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.clt.framework.component.common.AbstractValueObject;
import com.clt.framework.component.util.JSPUtil;

/**
 * Table Value Ojbect<br>
 * 관련 Event 에서 생성, 서버실행요청시 Data 전달역할을 수행하는 Value Object
 *
 * @author 송민석
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class SetupConstantListVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<SetupConstantListVO> models = new ArrayList<SetupConstantListVO>();
	
	/* Column Info */
	private String consCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String consValCtnt = null;
	/* Page Number */
	private String pagerows = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public SetupConstantListVO() {}

	public SetupConstantListVO(String ibflag, String pagerows, String consCd, String consValCtnt) {
		this.consCd = consCd;
		this.ibflag = ibflag;
		this.consValCtnt = consValCtnt;
		this.pagerows = pagerows;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("cons_cd", getConsCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cons_val_ctnt", getConsValCtnt());
		this.hashColumns.put("pagerows", getPagerows());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("cons_cd", "consCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cons_val_ctnt", "consValCtnt");
		this.hashFields.put("pagerows", "pagerows");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return consCd
	 */
	public String getConsCd() {
		return this.consCd;
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
	 * @return consValCtnt
	 */
	public String getConsValCtnt() {
		return this.consValCtnt;
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
	 * @param consCd
	 */
	public void setConsCd(String consCd) {
		this.consCd = consCd;
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
	 * @param consValCtnt
	 */
	public void setConsValCtnt(String consValCtnt) {
		this.consValCtnt = consValCtnt;
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
		fromRequest(request,"");
	}

	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request, String prefix) {
		setConsCd(JSPUtil.getParameter(request, prefix + "cons_cd", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setConsValCtnt(JSPUtil.getParameter(request, prefix + "cons_val_ctnt", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return SetupConstantListVO[]
	 */
	public SetupConstantListVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return SetupConstantListVO[]
	 */
	public SetupConstantListVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		SetupConstantListVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] consCd = (JSPUtil.getParameter(request, prefix	+ "cons_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] consValCtnt = (JSPUtil.getParameter(request, prefix	+ "cons_val_ctnt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			
			for (int i = 0; i < length; i++) {
				model = new SetupConstantListVO();
				if (consCd[i] != null)
					model.setConsCd(consCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (consValCtnt[i] != null)
					model.setConsValCtnt(consValCtnt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getSetupConstantListVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return SetupConstantListVO[]
	 */
	public SetupConstantListVO[] getSetupConstantListVOs(){
		SetupConstantListVO[] vos = (SetupConstantListVO[])models.toArray(new SetupConstantListVO[models.size()]);
		return vos;
	}
	
	/**
	 * VO Class의 내용을 String으로 변환
	 */
	public String toString() {
	   return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE );
    }

	/**
	* 포맷팅된 문자열에서 특수문자 제거("-","/",",",":")
	*/
	public void unDataFormat(){
		this.consCd = this.consCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.consValCtnt = this.consValCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
