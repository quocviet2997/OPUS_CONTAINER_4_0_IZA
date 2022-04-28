/*=========================================================
*Copyright(c) 2012 CyberLogitec
*@FileName : MdmCntrSzListVO.java
*@FileTitle : MdmCntrSzListVO
*Open Issues :
*Change history :
*@LastModifyDate : 2012.02.15
*@LastModifier : 민정호
*@LastVersion : 1.0
* 2012.02.15 민정호 
* 1.0 Creation
=========================================================*/

package com.clt.bizcommon.cntrsize.vo;

import java.lang.reflect.Field;
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
 * @author 민정호
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class MdmCntrSzListVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<MdmCntrSzListVO> models = new ArrayList<MdmCntrSzListVO>();
	
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String mdmYn = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String cntrSzCd = null;
	/* Column Info */
	private String modiCntrSzCd = null;
	/* Column Info */
	private String cntrSzDesc = null;
	/* Column Info */
	private String cntrSzTeuCapa = null;
	/* Page Number */
	private String pagerows = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public MdmCntrSzListVO() {}

	public MdmCntrSzListVO(String ibflag, String pagerows, String cntrSzCd, String cntrSzDesc, String cntrSzTeuCapa, String modiCntrSzCd, String deltFlg, String mdmYn) {
		this.ibflag = ibflag;
		this.mdmYn = mdmYn;
		this.deltFlg = deltFlg;
		this.cntrSzCd = cntrSzCd;
		this.modiCntrSzCd = modiCntrSzCd;
		this.cntrSzDesc = cntrSzDesc;
		this.cntrSzTeuCapa = cntrSzTeuCapa;
		this.pagerows = pagerows;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("mdm_yn", getMdmYn());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("cntr_sz_cd", getCntrSzCd());
		this.hashColumns.put("modi_cntr_sz_cd", getModiCntrSzCd());
		this.hashColumns.put("cntr_sz_desc", getCntrSzDesc());
		this.hashColumns.put("cntr_sz_teu_capa", getCntrSzTeuCapa());
		this.hashColumns.put("pagerows", getPagerows());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("mdm_yn", "mdmYn");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("cntr_sz_cd", "cntrSzCd");
		this.hashFields.put("modi_cntr_sz_cd", "modiCntrSzCd");
		this.hashFields.put("cntr_sz_desc", "cntrSzDesc");
		this.hashFields.put("cntr_sz_teu_capa", "cntrSzTeuCapa");
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
	 * @return mdmYn
	 */
	public String getMdmYn() {
		return this.mdmYn;
	}
	
	/**
	 * Column Info
	 * @return deltFlg
	 */
	public String getDeltFlg() {
		return this.deltFlg;
	}
	
	/**
	 * Column Info
	 * @return cntrSzCd
	 */
	public String getCntrSzCd() {
		return this.cntrSzCd;
	}
	
	/**
	 * Column Info
	 * @return modiCntrSzCd
	 */
	public String getModiCntrSzCd() {
		return this.modiCntrSzCd;
	}
	
	/**
	 * Column Info
	 * @return cntrSzDesc
	 */
	public String getCntrSzDesc() {
		return this.cntrSzDesc;
	}
	
	/**
	 * Column Info
	 * @return cntrSzTeuCapa
	 */
	public String getCntrSzTeuCapa() {
		return this.cntrSzTeuCapa;
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
	 * @param mdmYn
	 */
	public void setMdmYn(String mdmYn) {
		this.mdmYn = mdmYn;
	}
	
	/**
	 * Column Info
	 * @param deltFlg
	 */
	public void setDeltFlg(String deltFlg) {
		this.deltFlg = deltFlg;
	}
	
	/**
	 * Column Info
	 * @param cntrSzCd
	 */
	public void setCntrSzCd(String cntrSzCd) {
		this.cntrSzCd = cntrSzCd;
	}
	
	/**
	 * Column Info
	 * @param modiCntrSzCd
	 */
	public void setModiCntrSzCd(String modiCntrSzCd) {
		this.modiCntrSzCd = modiCntrSzCd;
	}
	
	/**
	 * Column Info
	 * @param cntrSzDesc
	 */
	public void setCntrSzDesc(String cntrSzDesc) {
		this.cntrSzDesc = cntrSzDesc;
	}
	
	/**
	 * Column Info
	 * @param cntrSzTeuCapa
	 */
	public void setCntrSzTeuCapa(String cntrSzTeuCapa) {
		this.cntrSzTeuCapa = cntrSzTeuCapa;
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
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setMdmYn(JSPUtil.getParameter(request, prefix + "mdm_yn", ""));
		setDeltFlg(JSPUtil.getParameter(request, prefix + "delt_flg", ""));
		setCntrSzCd(JSPUtil.getParameter(request, prefix + "cntr_sz_cd", ""));
		setModiCntrSzCd(JSPUtil.getParameter(request, prefix + "modi_cntr_sz_cd", ""));
		setCntrSzDesc(JSPUtil.getParameter(request, prefix + "cntr_sz_desc", ""));
		setCntrSzTeuCapa(JSPUtil.getParameter(request, prefix + "cntr_sz_teu_capa", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return MdmCntrSzListVO[]
	 */
	public MdmCntrSzListVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return MdmCntrSzListVO[]
	 */
	public MdmCntrSzListVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		MdmCntrSzListVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] mdmYn = (JSPUtil.getParameter(request, prefix	+ "mdm_yn", length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg", length));
			String[] cntrSzCd = (JSPUtil.getParameter(request, prefix	+ "cntr_sz_cd", length));
			String[] modiCntrSzCd = (JSPUtil.getParameter(request, prefix	+ "modi_cntr_sz_cd", length));
			String[] cntrSzDesc = (JSPUtil.getParameter(request, prefix	+ "cntr_sz_desc", length));
			String[] cntrSzTeuCapa = (JSPUtil.getParameter(request, prefix	+ "cntr_sz_teu_capa", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			
			for (int i = 0; i < length; i++) {
				model = new MdmCntrSzListVO();
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (mdmYn[i] != null)
					model.setMdmYn(mdmYn[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (cntrSzCd[i] != null)
					model.setCntrSzCd(cntrSzCd[i]);
				if (modiCntrSzCd[i] != null)
					model.setModiCntrSzCd(modiCntrSzCd[i]);
				if (cntrSzDesc[i] != null)
					model.setCntrSzDesc(cntrSzDesc[i]);
				if (cntrSzTeuCapa[i] != null)
					model.setCntrSzTeuCapa(cntrSzTeuCapa[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getMdmCntrSzListVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return MdmCntrSzListVO[]
	 */
	public MdmCntrSzListVO[] getMdmCntrSzListVOs(){
		MdmCntrSzListVO[] vos = (MdmCntrSzListVO[])models.toArray(new MdmCntrSzListVO[models.size()]);
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
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mdmYn = this.mdmYn .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrSzCd = this.cntrSzCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.modiCntrSzCd = this.modiCntrSzCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrSzDesc = this.cntrSzDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrSzTeuCapa = this.cntrSzTeuCapa .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
