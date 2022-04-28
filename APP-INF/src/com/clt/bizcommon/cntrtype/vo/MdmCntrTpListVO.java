/*=========================================================
*Copyright(c) 2012 CyberLogitec
*@FileName : MdmCntrTpListVO.java
*@FileTitle : MdmCntrTpListVO
*Open Issues :
*Change history :
*@LastModifyDate : 2012.02.15
*@LastModifier : 민정호
*@LastVersion : 1.0
* 2012.02.15 민정호 
* 1.0 Creation
=========================================================*/

package com.clt.bizcommon.cntrtype.vo;

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

public class MdmCntrTpListVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<MdmCntrTpListVO> models = new ArrayList<MdmCntrTpListVO>();
	
	/* Column Info */
	private String cntrTpDesc = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String mdmYn = null;
	/* Column Info */
	private String cntrTpCd = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String modiCntrTpCd = null;
	/* Page Number */
	private String pagerows = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public MdmCntrTpListVO() {}

	public MdmCntrTpListVO(String ibflag, String pagerows, String cntrTpCd, String cntrTpDesc, String modiCntrTpCd, String deltFlg, String mdmYn) {
		this.cntrTpDesc = cntrTpDesc;
		this.ibflag = ibflag;
		this.mdmYn = mdmYn;
		this.cntrTpCd = cntrTpCd;
		this.deltFlg = deltFlg;
		this.modiCntrTpCd = modiCntrTpCd;
		this.pagerows = pagerows;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("cntr_tp_desc", getCntrTpDesc());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("mdm_yn", getMdmYn());
		this.hashColumns.put("cntr_tp_cd", getCntrTpCd());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("modi_cntr_tp_cd", getModiCntrTpCd());
		this.hashColumns.put("pagerows", getPagerows());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("cntr_tp_desc", "cntrTpDesc");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("mdm_yn", "mdmYn");
		this.hashFields.put("cntr_tp_cd", "cntrTpCd");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("modi_cntr_tp_cd", "modiCntrTpCd");
		this.hashFields.put("pagerows", "pagerows");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return cntrTpDesc
	 */
	public String getCntrTpDesc() {
		return this.cntrTpDesc;
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
	 * @return cntrTpCd
	 */
	public String getCntrTpCd() {
		return this.cntrTpCd;
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
	 * @return modiCntrTpCd
	 */
	public String getModiCntrTpCd() {
		return this.modiCntrTpCd;
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
	 * @param cntrTpDesc
	 */
	public void setCntrTpDesc(String cntrTpDesc) {
		this.cntrTpDesc = cntrTpDesc;
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
	 * @param cntrTpCd
	 */
	public void setCntrTpCd(String cntrTpCd) {
		this.cntrTpCd = cntrTpCd;
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
	 * @param modiCntrTpCd
	 */
	public void setModiCntrTpCd(String modiCntrTpCd) {
		this.modiCntrTpCd = modiCntrTpCd;
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
		setCntrTpDesc(JSPUtil.getParameter(request, prefix + "cntr_tp_desc", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setMdmYn(JSPUtil.getParameter(request, prefix + "mdm_yn", ""));
		setCntrTpCd(JSPUtil.getParameter(request, prefix + "cntr_tp_cd", ""));
		setDeltFlg(JSPUtil.getParameter(request, prefix + "delt_flg", ""));
		setModiCntrTpCd(JSPUtil.getParameter(request, prefix + "modi_cntr_tp_cd", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return MdmCntrTpListVO[]
	 */
	public MdmCntrTpListVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return MdmCntrTpListVO[]
	 */
	public MdmCntrTpListVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		MdmCntrTpListVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] cntrTpDesc = (JSPUtil.getParameter(request, prefix	+ "cntr_tp_desc", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] mdmYn = (JSPUtil.getParameter(request, prefix	+ "mdm_yn", length));
			String[] cntrTpCd = (JSPUtil.getParameter(request, prefix	+ "cntr_tp_cd", length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg", length));
			String[] modiCntrTpCd = (JSPUtil.getParameter(request, prefix	+ "modi_cntr_tp_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			
			for (int i = 0; i < length; i++) {
				model = new MdmCntrTpListVO();
				if (cntrTpDesc[i] != null)
					model.setCntrTpDesc(cntrTpDesc[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (mdmYn[i] != null)
					model.setMdmYn(mdmYn[i]);
				if (cntrTpCd[i] != null)
					model.setCntrTpCd(cntrTpCd[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (modiCntrTpCd[i] != null)
					model.setModiCntrTpCd(modiCntrTpCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getMdmCntrTpListVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return MdmCntrTpListVO[]
	 */
	public MdmCntrTpListVO[] getMdmCntrTpListVOs(){
		MdmCntrTpListVO[] vos = (MdmCntrTpListVO[])models.toArray(new MdmCntrTpListVO[models.size()]);
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
		this.cntrTpDesc = this.cntrTpDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mdmYn = this.mdmYn .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrTpCd = this.cntrTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.modiCntrTpCd = this.modiCntrTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
