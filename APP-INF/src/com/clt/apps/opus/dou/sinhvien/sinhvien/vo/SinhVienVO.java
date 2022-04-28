/*=========================================================
*Copyright(c) 2020 CyberLogitec
*@FileName : SinhVienVO.java
*@FileTitle : SinhVienVO
*Open Issues :
*Change history :
*@LastModifyDate : 2020.03.18
*@LastModifier : 
*@LastVersion : 1.0
* 2020.03.18  
* 1.0 Creation
=========================================================*/

package com.clt.apps.opus.dou.sinhvien.sinhvien.vo;

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

public class SinhVienVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<SinhVienVO> models = new ArrayList<SinhVienVO>();
	
	/* Column Info */
	private String hocphi = null;
	/* Column Info */
	private String tuoi = null;
	/* Column Info */
	private String ten = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String svId = null;
	/* Column Info */
	private String ngaynhaphoc = null;
	/* Column Info */
	private String khoahoc = null;
	/* Column Info */
	private String soluong = null;
	/* Column Info */
	private String tonghocphi = null;
	/* Page Number */
	private String pagerows = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new LinkedHashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new LinkedHashMap<String, String>();
	
	public SinhVienVO() {}

	public SinhVienVO(String ibflag, String pagerows, String svId, String ten, String tuoi, String khoahoc, String hocphi, String ngaynhaphoc, String soluong, String tonghocphi) {
		this.hocphi = hocphi;
		this.tuoi = tuoi;
		this.ten = ten;
		this.ibflag = ibflag;
		this.svId = svId;
		this.ngaynhaphoc = ngaynhaphoc;
		this.khoahoc = khoahoc;
		this.soluong = soluong;
		this.tonghocphi = tonghocphi;
		this.pagerows = pagerows;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("hocphi", getHocphi());
		this.hashColumns.put("tuoi", getTuoi());
		this.hashColumns.put("ten", getTen());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("sv_id", getSvId());
		this.hashColumns.put("ngaynhaphoc", getNgaynhaphoc());
		this.hashColumns.put("khoahoc", getKhoahoc());
		this.hashColumns.put("soluong", getsoluong());
		this.hashColumns.put("tonghocphi", gettonghocphi());
		this.hashColumns.put("pagerows", getPagerows());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("hocphi", "hocphi");
		this.hashFields.put("tuoi", "tuoi");
		this.hashFields.put("ten", "ten");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("sv_id", "svId");
		this.hashFields.put("ngaynhaphoc", "ngaynhaphoc");
		this.hashFields.put("khoahoc", "khoahoc");
		this.hashFields.put("soluong", "soluong");
		this.hashFields.put("tonghocphi", "tonghocphi");
		this.hashFields.put("pagerows", "pagerows");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return hocphi
	 */
	public String getHocphi() {
		return this.hocphi;
	}
	
	/**
	 * Column Info
	 * @return tuoi
	 */
	public String getTuoi() {
		return this.tuoi;
	}
	
	/**
	 * Column Info
	 * @return ten
	 */
	public String getTen() {
		return this.ten;
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
	 * @return svId
	 */
	public String getSvId() {
		return this.svId;
	}
	
	/**
	 * Column Info
	 * @return ngaynhaphoc
	 */
	public String getNgaynhaphoc() {
		return this.ngaynhaphoc;
	}
	
	/**
	 * Column Info
	 * @return khoahoc
	 */
	public String getKhoahoc() {
		return this.khoahoc;
	}
	
	/**
	 * Column Info
	 * @return soluong
	 */
	public String getsoluong() {
		return this.soluong;
	}
	
	/**
	 * Column Info
	 * @return tonghocphi
	 */
	public String gettonghocphi() {
		return this.tonghocphi;
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
	 * @param hocphi
	 */
	public void setHocphi(String hocphi) {
		this.hocphi = hocphi;
	}
	
	/**
	 * Column Info
	 * @param tuoi
	 */
	public void setTuoi(String tuoi) {
		this.tuoi = tuoi;
	}
	
	/**
	 * Column Info
	 * @param ten
	 */
	public void setTen(String ten) {
		this.ten = ten;
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
	 * @param svId
	 */
	public void setSvId(String svId) {
		this.svId = svId;
	}
	
	/**
	 * Column Info
	 * @param ngaynhaphoc
	 */
	public void setNgaynhaphoc(String ngaynhaphoc) {
		this.ngaynhaphoc = ngaynhaphoc;
	}
	
	/**
	 * Column Info
	 * @param khoahoc
	 */
	public void setKhoahoc(String khoahoc) {
		this.khoahoc = khoahoc;
	}
	
	/**
	 * Column Info
	 * @param soluong
	 */
	public String setsoluong(String soluong) {
		return this.soluong = soluong;
	}
	
	/**
	 * Column Info
	 * @param tonghocphi
	 */
	public String settonghocphi(String tonghocphi) {
		return this.tonghocphi = tonghocphi;
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
		setHocphi(JSPUtil.getParameter(request, prefix + "hocphi", ""));
		setTuoi(JSPUtil.getParameter(request, prefix + "tuoi", ""));
		setTen(JSPUtil.getParameter(request, prefix + "ten", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setSvId(JSPUtil.getParameter(request, prefix + "sv_id", ""));
		setNgaynhaphoc(JSPUtil.getParameter(request, prefix + "ngaynhaphoc", ""));
		setKhoahoc(JSPUtil.getParameter(request, prefix + "khoahoc", ""));
		setsoluong(JSPUtil.getParameter(request, prefix + "soluong", ""));
		settonghocphi(JSPUtil.getParameter(request, prefix + "tonghocphi", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return SinhVienVO[]
	 */
	public SinhVienVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return SinhVienVO[]
	 */
	public SinhVienVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		SinhVienVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] hocphi = (JSPUtil.getParameter(request, prefix	+ "hocphi", length));
			String[] tuoi = (JSPUtil.getParameter(request, prefix	+ "tuoi", length));
			String[] ten = (JSPUtil.getParameter(request, prefix	+ "ten", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] svId = (JSPUtil.getParameter(request, prefix	+ "sv_id", length));
			String[] ngaynhaphoc = (JSPUtil.getParameter(request, prefix	+ "ngaynhaphoc", length));
			String[] khoahoc = (JSPUtil.getParameter(request, prefix	+ "khoahoc", length));
			String[] soluong = (JSPUtil.getParameter(request, prefix	+ "soluong", length));
			String[] tonghocphi = (JSPUtil.getParameter(request, prefix	+ "tonghocphi", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			
			for (int i = 0; i < length; i++) {
				model = new SinhVienVO();
				if (hocphi[i] != null)
					model.setHocphi(hocphi[i]);
				if (tuoi[i] != null)
					model.setTuoi(tuoi[i]);
				if (ten[i] != null)
					model.setTen(ten[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (svId[i] != null)
					model.setSvId(svId[i]);
				if (ngaynhaphoc[i] != null)
					model.setNgaynhaphoc(ngaynhaphoc[i]);
				if (khoahoc[i] != null)
					model.setKhoahoc(khoahoc[i]);
				if (soluong[i] != null)
					model.setsoluong(soluong[i]);
				if (tonghocphi[i] != null)
					model.settonghocphi(tonghocphi[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getSinhVienVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return SinhVienVO[]
	 */
	public SinhVienVO[] getSinhVienVOs(){
		SinhVienVO[] vos = (SinhVienVO[])models.toArray(new SinhVienVO[models.size()]);
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
		this.hocphi = this.hocphi .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tuoi = this.tuoi .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ten = this.ten .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.svId = this.svId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ngaynhaphoc = this.ngaynhaphoc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.khoahoc = this.khoahoc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.soluong = this.soluong .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tonghocphi = this.tonghocphi .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
