/*=========================================================
*Copyright(c) 2020 CyberLogitec
*@FileName : MuonSachVO.java
*@FileTitle : MuonSachVO
*Open Issues :
*Change history :
*@LastModifyDate : 2020.03.18
*@LastModifier : 
*@LastVersion : 1.0
* 2020.03.18  
* 1.0 Creation
=========================================================*/

package com.clt.apps.opus.dou.muonsach.muonsach.vo;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

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

public class MuonSachVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<MuonSachVO> models = new ArrayList<MuonSachVO>();
	
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String sinhvienId = null;
	/* Column Info */
	private String sotien = null;
	/* Column Info */
	private String stt = null;
	/* Column Info */
	private String ngay = null;
	/* Page Number */
	private String pagerows = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new LinkedHashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new LinkedHashMap<String, String>();
	
	public MuonSachVO() {}

	public MuonSachVO(String ibflag, String pagerows, String stt, String ngay, String sotien, String sinhvienId) {
		this.ibflag = ibflag;
		this.sinhvienId = sinhvienId;
		this.sotien = sotien;
		this.stt = stt;
		this.ngay = ngay;
		this.pagerows = pagerows;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("sinhvien_id", getSinhvienId());
		this.hashColumns.put("sotien", getSotien());
		this.hashColumns.put("stt", getStt());
		this.hashColumns.put("ngay", getNgay());
		this.hashColumns.put("pagerows", getPagerows());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("sinhvien_id", "sinhvienId");
		this.hashFields.put("sotien", "sotien");
		this.hashFields.put("stt", "stt");
		this.hashFields.put("ngay", "ngay");
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
	 * @return sinhvienId
	 */
	public String getSinhvienId() {
		return this.sinhvienId;
	}
	
	/**
	 * Column Info
	 * @return sotien
	 */
	public String getSotien() {
		return this.sotien;
	}
	
	/**
	 * Column Info
	 * @return stt
	 */
	public String getStt() {
		return this.stt;
	}
	
	/**
	 * Column Info
	 * @return ngay
	 */
	public String getNgay() {
		return this.ngay;
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
	 * @param sinhvienId
	 */
	public void setSinhvienId(String sinhvienId) {
		this.sinhvienId = sinhvienId;
	}
	
	/**
	 * Column Info
	 * @param sotien
	 */
	public void setSotien(String sotien) {
		this.sotien = sotien;
	}
	
	/**
	 * Column Info
	 * @param stt
	 */
	public void setStt(String stt) {
		this.stt = stt;
	}
	
	/**
	 * Column Info
	 * @param ngay
	 */
	public void setNgay(String ngay) {
		this.ngay = ngay;
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
		setSinhvienId(JSPUtil.getParameter(request, prefix + "sinhvien_id", ""));
		setSotien(JSPUtil.getParameter(request, prefix + "sotien", ""));
		setStt(JSPUtil.getParameter(request, prefix + "stt", ""));
		setNgay(JSPUtil.getParameter(request, prefix + "ngay", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return MuonSachVO[]
	 */
	public MuonSachVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return MuonSachVO[]
	 */
	public MuonSachVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		MuonSachVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] sinhvienId = (JSPUtil.getParameter(request, prefix	+ "sinhvien_id", length));
			String[] sotien = (JSPUtil.getParameter(request, prefix	+ "sotien", length));
			String[] stt = (JSPUtil.getParameter(request, prefix	+ "stt", length));
			String[] ngay = (JSPUtil.getParameter(request, prefix	+ "ngay", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			
			for (int i = 0; i < length; i++) {
				model = new MuonSachVO();
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (sinhvienId[i] != null)
					model.setSinhvienId(sinhvienId[i]);
				if (sotien[i] != null)
					model.setSotien(sotien[i]);
				if (stt[i] != null)
					model.setStt(stt[i]);
				if (ngay[i] != null)
					model.setNgay(ngay[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getMuonSachVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return MuonSachVO[]
	 */
	public MuonSachVO[] getMuonSachVOs(){
		MuonSachVO[] vos = (MuonSachVO[])models.toArray(new MuonSachVO[models.size()]);
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
		this.sinhvienId = this.sinhvienId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sotien = this.sotien .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stt = this.stt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ngay = this.ngay .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
