/*=========================================================
*Copyright(c) 2013 CyberLogitec
*@FileName : SetupModuleVO.java
*@FileTitle : SetupModuleVO
*Open Issues :
*Change history :
*@LastModifyDate : 2013.07.15
*@LastModifier : 
*@LastVersion : 1.0
* 2013.07.15  
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
 *  Value Object
 *
 * @author   kjy 
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class SetupModuleVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<SetupModuleVO> models = new ArrayList<SetupModuleVO>();
	
	/* Column Info */
	private String pgmSubSysCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String aplyFlg = null;
	/* Page Number */
	private String pagerows = null;

	/*	�뚯씠釉�而щ읆��媛믪쓣 ��옣�섎뒗 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	�뚯씠釉�而щ읆����쓳�섎뒗 硫ㅻ쾭蹂�닔瑜���옣�섎뒗 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public SetupModuleVO() {}

	public SetupModuleVO(String ibflag, String pagerows, String pgmSubSysCd, String aplyFlg) {
		this.pgmSubSysCd = pgmSubSysCd;
		this.ibflag = ibflag;
		this.aplyFlg = aplyFlg;
		this.pagerows = pagerows;
	}
	
	/**
	 * �뚯씠釉�而щ읆����옣��媛믪쓣 Hashtable<"column_name", "value"> 濡�諛섑솚
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("pgm_sub_sys_cd", getPgmSubSysCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("aply_flg", getAplyFlg());
		this.hashColumns.put("pagerows", getPagerows());
		return this.hashColumns;
	}
	
	/**
	 * 而щ읆紐낆뿉 ��쓳�섎뒗 硫ㅻ쾭蹂�닔紐낆쓣 ��옣�섏뿬 Hashtable<"column_name", "variable"> 濡�諛섑솚   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("pgm_sub_sys_cd", "pgmSubSysCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("aply_flg", "aplyFlg");
		this.hashFields.put("pagerows", "pagerows");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return pgmSubSysCd
	 */
	public String getPgmSubSysCd() {
		return this.pgmSubSysCd;
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
	 * @return aplyFlg
	 */
	public String getAplyFlg() {
		return this.aplyFlg;
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
	 * @param pgmSubSysCd
	 */
	public void setPgmSubSysCd(String pgmSubSysCd) {
		this.pgmSubSysCd = pgmSubSysCd;
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
	 * @param aplyFlg
	 */
	public void setAplyFlg(String aplyFlg) {
		this.aplyFlg = aplyFlg;
	}
	
	/**
	 * Page Number
	 * @param pagerows
	 */
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
	}
	
/**
	 * Request ���곗씠�곕� 異붿텧�섏뿬 VO ��硫ㅻ쾭蹂�닔���ㅼ젙.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		fromRequest(request,"");
	}

	/**
	 * Request ���곗씠�곕� 異붿텧�섏뿬 VO ��硫ㅻ쾭蹂�닔���ㅼ젙.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request, String prefix) {
		setPgmSubSysCd(JSPUtil.getParameter(request, prefix + "pgm_sub_sys_cd", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setAplyFlg(JSPUtil.getParameter(request, prefix + "aply_flg", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
	}

	/**
	 * Request ���곗씠�곕� VO 諛곗뿴濡�蹂�솚�섏뿬 諛섑솚.
	 * @param request
	 * @return SetupModuleVO[]
	 */
	public SetupModuleVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request �섏뼱���щ윭 嫄�DATA瑜�VO Class ���대뒗�� 
	 * @param request
	 * @param prefix
	 * @return SetupModuleVO[]
	 */
	public SetupModuleVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		SetupModuleVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] pgmSubSysCd = (JSPUtil.getParameter(request, prefix	+ "pgm_sub_sys_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] aplyFlg = (JSPUtil.getParameter(request, prefix	+ "aply_flg", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			
			for (int i = 0; i < length; i++) {
				model = new SetupModuleVO();
				if (pgmSubSysCd[i] != null)
					model.setPgmSubSysCd(pgmSubSysCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (aplyFlg[i] != null)
					model.setAplyFlg(aplyFlg[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getSetupModuleVOs();
	}

	/**
	 * VO 諛곗뿴��諛섑솚
	 * @return SetupModuleVO[]
	 */
	public SetupModuleVO[] getSetupModuleVOs(){
		SetupModuleVO[] vos = (SetupModuleVO[])models.toArray(new SetupModuleVO[models.size()]);
		return vos;
	}
	
	/**
	 * VO Class���댁슜��String�쇰줈 蹂�솚
	 */
	public String toString() {
	   return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE );
    }

	/**
	* �щ㎎�낅맂 臾몄옄�댁뿉���뱀닔臾몄옄 �쒓굅("-","/",",",":")
	*/
	public void unDataFormat(){
		this.pgmSubSysCd = this.pgmSubSysCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aplyFlg = this.aplyFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
