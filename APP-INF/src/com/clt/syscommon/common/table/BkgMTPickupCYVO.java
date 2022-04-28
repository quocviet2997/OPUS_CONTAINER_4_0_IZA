/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BkgMTPickupCYVO.java
*@FileTitle : BkgMTPickupCYVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.07
*@LastModifier : 김기종
*@LastVersion : 1.0
* 2009.05.07 김기종 
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
 * - PDTO(Data Transfer Object including Parameters)<br>
 * - 관련 Event에서 작성, 서버실행요청시 PDTO의 역할을 수행하는 Value Object<br>
 *
 * @author 김기종
 * @since J2EE 1.5
 */

public class BkgMTPickupCYVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgMTPickupCYVO> models = new ArrayList<BkgMTPickupCYVO>();
	
	/* Column Info */
	private String fcastQty7 = null;
	/* Column Info */
	private String fcastQty8 = null;
	/* Column Info */
	private String fcastQty5 = null;
	/* Column Info */
	private String fcastQty6 = null;
	/* Column Info */
	private String coCd = null;
	/* Column Info */
	private String fcastQty3 = null;
	/* Column Info */
	private String fcastQty4 = null;
	/* Column Info */
	private String fcastQty1 = null;
	/* Column Info */
	private String fcastQty = null;
	/* Column Info */
	private String fcastQty2 = null;
	/* Column Info */
	private String fcastQty12 = null;
	/* Column Info */
	private String fcastQty13 = null;
	/* Column Info */
	private String fcastQty10 = null;
	/* Column Info */
	private String fcastQty11 = null;
	/* Column Info */
	private String fcastQty9 = null;
	/* Column Info */
	private String fcastDt = null;
	/* Page Number */
	private String pagerows = null;
	/* Status */
	private String ibflag = null;
	/* Column Info */
	private String ydCd = null;
	/* Column Info */
	private String cntrTpszCd = null;
	/* Column Info */
	private String cntrAvalFcastTpCd = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	hashFildInpo	*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgMTPickupCYVO() {}

	public BkgMTPickupCYVO(String ibflag, String pagerows, String ydCd, String fcastDt, String cntrTpszCd, String cntrAvalFcastTpCd, String coCd, String fcastQty, String fcastQty1, String fcastQty2, String fcastQty3, String fcastQty4, String fcastQty5, String fcastQty6, String fcastQty7, String fcastQty8, String fcastQty9, String fcastQty10, String fcastQty11, String fcastQty12, String fcastQty13) {
		this.fcastQty7 = fcastQty7;
		this.fcastQty8 = fcastQty8;
		this.fcastQty5 = fcastQty5;
		this.fcastQty6 = fcastQty6;
		this.coCd = coCd;
		this.fcastQty3 = fcastQty3;
		this.fcastQty4 = fcastQty4;
		this.fcastQty1 = fcastQty1;
		this.fcastQty = fcastQty;
		this.fcastQty2 = fcastQty2;
		this.fcastQty12 = fcastQty12;
		this.fcastQty13 = fcastQty13;
		this.fcastQty10 = fcastQty10;
		this.fcastQty11 = fcastQty11;
		this.fcastQty9 = fcastQty9;
		this.fcastDt = fcastDt;
		this.pagerows = pagerows;
		this.ibflag = ibflag;
		this.ydCd = ydCd;
		this.cntrTpszCd = cntrTpszCd;
		this.cntrAvalFcastTpCd = cntrAvalFcastTpCd;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("fcast_qty7", getFcastQty7());
		this.hashColumns.put("fcast_qty8", getFcastQty8());
		this.hashColumns.put("fcast_qty5", getFcastQty5());
		this.hashColumns.put("fcast_qty6", getFcastQty6());
		this.hashColumns.put("co_cd", getCoCd());
		this.hashColumns.put("fcast_qty3", getFcastQty3());
		this.hashColumns.put("fcast_qty4", getFcastQty4());
		this.hashColumns.put("fcast_qty1", getFcastQty1());
		this.hashColumns.put("fcast_qty", getFcastQty());
		this.hashColumns.put("fcast_qty2", getFcastQty2());
		this.hashColumns.put("fcast_qty12", getFcastQty12());
		this.hashColumns.put("fcast_qty13", getFcastQty13());
		this.hashColumns.put("fcast_qty10", getFcastQty10());
		this.hashColumns.put("fcast_qty11", getFcastQty11());
		this.hashColumns.put("fcast_qty9", getFcastQty9());
		this.hashColumns.put("fcast_dt", getFcastDt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("yd_cd", getYdCd());
		this.hashColumns.put("cntr_tpsz_cd", getCntrTpszCd());
		this.hashColumns.put("cntr_aval_fcast_tp_cd", getCntrAvalFcastTpCd());
		return this.hashColumns;
	}
	
	/**
	 * hashFildInpo
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("fcast_qty7", "fcastQty7");
		this.hashFields.put("fcast_qty8", "fcastQty8");
		this.hashFields.put("fcast_qty5", "fcastQty5");
		this.hashFields.put("fcast_qty6", "fcastQty6");
		this.hashFields.put("co_cd", "coCd");
		this.hashFields.put("fcast_qty3", "fcastQty3");
		this.hashFields.put("fcast_qty4", "fcastQty4");
		this.hashFields.put("fcast_qty1", "fcastQty1");
		this.hashFields.put("fcast_qty", "fcastQty");
		this.hashFields.put("fcast_qty2", "fcastQty2");
		this.hashFields.put("fcast_qty12", "fcastQty12");
		this.hashFields.put("fcast_qty13", "fcastQty13");
		this.hashFields.put("fcast_qty10", "fcastQty10");
		this.hashFields.put("fcast_qty11", "fcastQty11");
		this.hashFields.put("fcast_qty9", "fcastQty9");
		this.hashFields.put("fcast_dt", "fcastDt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("yd_cd", "ydCd");
		this.hashFields.put("cntr_tpsz_cd", "cntrTpszCd");
		this.hashFields.put("cntr_aval_fcast_tp_cd", "cntrAvalFcastTpCd");
		return this.hashFields;
	}
	
	public String getFcastQty7() {
		return this.fcastQty7;
	}
	public String getFcastQty8() {
		return this.fcastQty8;
	}
	public String getFcastQty5() {
		return this.fcastQty5;
	}
	public String getFcastQty6() {
		return this.fcastQty6;
	}
	public String getCoCd() {
		return this.coCd;
	}
	public String getFcastQty3() {
		return this.fcastQty3;
	}
	public String getFcastQty4() {
		return this.fcastQty4;
	}
	public String getFcastQty1() {
		return this.fcastQty1;
	}
	public String getFcastQty() {
		return this.fcastQty;
	}
	public String getFcastQty2() {
		return this.fcastQty2;
	}
	public String getFcastQty12() {
		return this.fcastQty12;
	}
	public String getFcastQty13() {
		return this.fcastQty13;
	}
	public String getFcastQty10() {
		return this.fcastQty10;
	}
	public String getFcastQty11() {
		return this.fcastQty11;
	}
	public String getFcastQty9() {
		return this.fcastQty9;
	}
	public String getFcastDt() {
		return this.fcastDt;
	}
	public String getPagerows() {
		return this.pagerows;
	}
	public String getIbflag() {
		return this.ibflag;
	}
	public String getYdCd() {
		return this.ydCd;
	}
	public String getCntrTpszCd() {
		return this.cntrTpszCd;
	}
	public String getCntrAvalFcastTpCd() {
		return this.cntrAvalFcastTpCd;
	}

	public void setFcastQty7(String fcastQty7) {
		this.fcastQty7 = fcastQty7;
		//this.fcastQty7=true;
	}
	public void setFcastQty8(String fcastQty8) {
		this.fcastQty8 = fcastQty8;
		//this.fcastQty8=true;
	}
	public void setFcastQty5(String fcastQty5) {
		this.fcastQty5 = fcastQty5;
		//this.fcastQty5=true;
	}
	public void setFcastQty6(String fcastQty6) {
		this.fcastQty6 = fcastQty6;
		//this.fcastQty6=true;
	}
	public void setCoCd(String coCd) {
		this.coCd = coCd;
		//this.coCd=true;
	}
	public void setFcastQty3(String fcastQty3) {
		this.fcastQty3 = fcastQty3;
		//this.fcastQty3=true;
	}
	public void setFcastQty4(String fcastQty4) {
		this.fcastQty4 = fcastQty4;
		//this.fcastQty4=true;
	}
	public void setFcastQty1(String fcastQty1) {
		this.fcastQty1 = fcastQty1;
		//this.fcastQty1=true;
	}
	public void setFcastQty(String fcastQty) {
		this.fcastQty = fcastQty;
		//this.fcastQty=true;
	}
	public void setFcastQty2(String fcastQty2) {
		this.fcastQty2 = fcastQty2;
		//this.fcastQty2=true;
	}
	public void setFcastQty12(String fcastQty12) {
		this.fcastQty12 = fcastQty12;
		//this.fcastQty12=true;
	}
	public void setFcastQty13(String fcastQty13) {
		this.fcastQty13 = fcastQty13;
		//this.fcastQty13=true;
	}
	public void setFcastQty10(String fcastQty10) {
		this.fcastQty10 = fcastQty10;
		//this.fcastQty10=true;
	}
	public void setFcastQty11(String fcastQty11) {
		this.fcastQty11 = fcastQty11;
		//this.fcastQty11=true;
	}
	public void setFcastQty9(String fcastQty9) {
		this.fcastQty9 = fcastQty9;
		//this.fcastQty9=true;
	}
	public void setFcastDt(String fcastDt) {
		this.fcastDt = fcastDt;
		//this.fcastDt=true;
	}
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setYdCd(String ydCd) {
		this.ydCd = ydCd;
		//this.ydCd=true;
	}
	public void setCntrTpszCd(String cntrTpszCd) {
		this.cntrTpszCd = cntrTpszCd;
		//this.cntrTpszCd=true;
	}
	public void setCntrAvalFcastTpCd(String cntrAvalFcastTpCd) {
		this.cntrAvalFcastTpCd = cntrAvalFcastTpCd;
		//this.cntrAvalFcastTpCd=true;
	}
	public void fromRequest(HttpServletRequest request) {
		setFcastQty7(JSPUtil.getParameter(request, "fcast_qty7", ""));
		setFcastQty8(JSPUtil.getParameter(request, "fcast_qty8", ""));
		setFcastQty5(JSPUtil.getParameter(request, "fcast_qty5", ""));
		setFcastQty6(JSPUtil.getParameter(request, "fcast_qty6", ""));
		setCoCd(JSPUtil.getParameter(request, "co_cd", ""));
		setFcastQty3(JSPUtil.getParameter(request, "fcast_qty3", ""));
		setFcastQty4(JSPUtil.getParameter(request, "fcast_qty4", ""));
		setFcastQty1(JSPUtil.getParameter(request, "fcast_qty1", ""));
		setFcastQty(JSPUtil.getParameter(request, "fcast_qty", ""));
		setFcastQty2(JSPUtil.getParameter(request, "fcast_qty2", ""));
		setFcastQty12(JSPUtil.getParameter(request, "fcast_qty12", ""));
		setFcastQty13(JSPUtil.getParameter(request, "fcast_qty13", ""));
		setFcastQty10(JSPUtil.getParameter(request, "fcast_qty10", ""));
		setFcastQty11(JSPUtil.getParameter(request, "fcast_qty11", ""));
		setFcastQty9(JSPUtil.getParameter(request, "fcast_qty9", ""));
		setFcastDt(JSPUtil.getParameter(request, "fcast_dt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setYdCd(JSPUtil.getParameter(request, "yd_cd", ""));
		setCntrTpszCd(JSPUtil.getParameter(request, "cntr_tpsz_cd", ""));
		setCntrAvalFcastTpCd(JSPUtil.getParameter(request, "cntr_aval_fcast_tp_cd", ""));
	}

	public BkgMTPickupCYVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public BkgMTPickupCYVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgMTPickupCYVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] fcastQty7 = (JSPUtil.getParameter(request, prefix	+ "fcast_qty7".trim(), length));
			String[] fcastQty8 = (JSPUtil.getParameter(request, prefix	+ "fcast_qty8".trim(), length));
			String[] fcastQty5 = (JSPUtil.getParameter(request, prefix	+ "fcast_qty5".trim(), length));
			String[] fcastQty6 = (JSPUtil.getParameter(request, prefix	+ "fcast_qty6".trim(), length));
			String[] coCd = (JSPUtil.getParameter(request, prefix	+ "co_cd".trim(), length));
			String[] fcastQty3 = (JSPUtil.getParameter(request, prefix	+ "fcast_qty3".trim(), length));
			String[] fcastQty4 = (JSPUtil.getParameter(request, prefix	+ "fcast_qty4".trim(), length));
			String[] fcastQty1 = (JSPUtil.getParameter(request, prefix	+ "fcast_qty1".trim(), length));
			String[] fcastQty = (JSPUtil.getParameter(request, prefix	+ "fcast_qty".trim(), length));
			String[] fcastQty2 = (JSPUtil.getParameter(request, prefix	+ "fcast_qty2".trim(), length));
			String[] fcastQty12 = (JSPUtil.getParameter(request, prefix	+ "fcast_qty12".trim(), length));
			String[] fcastQty13 = (JSPUtil.getParameter(request, prefix	+ "fcast_qty13".trim(), length));
			String[] fcastQty10 = (JSPUtil.getParameter(request, prefix	+ "fcast_qty10".trim(), length));
			String[] fcastQty11 = (JSPUtil.getParameter(request, prefix	+ "fcast_qty11".trim(), length));
			String[] fcastQty9 = (JSPUtil.getParameter(request, prefix	+ "fcast_qty9".trim(), length));
			String[] fcastDt = (JSPUtil.getParameter(request, prefix	+ "fcast_dt".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] ydCd = (JSPUtil.getParameter(request, prefix	+ "yd_cd".trim(), length));
			String[] cntrTpszCd = (JSPUtil.getParameter(request, prefix	+ "cntr_tpsz_cd".trim(), length));
			String[] cntrAvalFcastTpCd = (JSPUtil.getParameter(request, prefix	+ "cntr_aval_fcast_tp_cd".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgMTPickupCYVO();
				if (fcastQty7[i] != null)
					model.setFcastQty7(fcastQty7[i]);
				if (fcastQty8[i] != null)
					model.setFcastQty8(fcastQty8[i]);
				if (fcastQty5[i] != null)
					model.setFcastQty5(fcastQty5[i]);
				if (fcastQty6[i] != null)
					model.setFcastQty6(fcastQty6[i]);
				if (coCd[i] != null)
					model.setCoCd(coCd[i]);
				if (fcastQty3[i] != null)
					model.setFcastQty3(fcastQty3[i]);
				if (fcastQty4[i] != null)
					model.setFcastQty4(fcastQty4[i]);
				if (fcastQty1[i] != null)
					model.setFcastQty1(fcastQty1[i]);
				if (fcastQty[i] != null)
					model.setFcastQty(fcastQty[i]);
				if (fcastQty2[i] != null)
					model.setFcastQty2(fcastQty2[i]);
				if (fcastQty12[i] != null)
					model.setFcastQty12(fcastQty12[i]);
				if (fcastQty13[i] != null)
					model.setFcastQty13(fcastQty13[i]);
				if (fcastQty10[i] != null)
					model.setFcastQty10(fcastQty10[i]);
				if (fcastQty11[i] != null)
					model.setFcastQty11(fcastQty11[i]);
				if (fcastQty9[i] != null)
					model.setFcastQty9(fcastQty9[i]);
				if (fcastDt[i] != null)
					model.setFcastDt(fcastDt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (ydCd[i] != null)
					model.setYdCd(ydCd[i]);
				if (cntrTpszCd[i] != null)
					model.setCntrTpszCd(cntrTpszCd[i]);
				if (cntrAvalFcastTpCd[i] != null)
					model.setCntrAvalFcastTpCd(cntrAvalFcastTpCd[i]);
				models.add(model);
			}

		} catch (Exception e) {}
		return getBkgMTPickupCYVOs();
	}

	public BkgMTPickupCYVO[] getBkgMTPickupCYVOs(){
		BkgMTPickupCYVO[] vos = (BkgMTPickupCYVO[])models.toArray(new BkgMTPickupCYVO[models.size()]);
		return vos;
	}
	
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
		} catch (Exception ex) {}
		return ret.toString();
	}
	
	/**
	 * 각 클래스 해당하는 필드 정보를 배열에 담는다 
	 * @param field
	 * @param i
	 * @return String[]
	 * @throws IllegalAccessException
	 */
	private String[] getField(Field[] field, int i) throws IllegalAccessException {
		String[] arr;
		try{
			arr = (String[]) field[i].get(this);
		}catch(Exception ex){
			arr = new String[1];
			arr[0] = String.valueOf(field[i].get(this));
		}
		return arr;
	}
	
	/**
	* DataFormat 설정
	*/
	public void onDataFormat(){
		this.fcastQty7 = this.fcastQty7 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fcastQty8 = this.fcastQty8 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fcastQty5 = this.fcastQty5 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fcastQty6 = this.fcastQty6 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.coCd = this.coCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fcastQty3 = this.fcastQty3 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fcastQty4 = this.fcastQty4 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fcastQty1 = this.fcastQty1 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fcastQty = this.fcastQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fcastQty2 = this.fcastQty2 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fcastQty12 = this.fcastQty12 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fcastQty13 = this.fcastQty13 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fcastQty10 = this.fcastQty10 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fcastQty11 = this.fcastQty11 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fcastQty9 = this.fcastQty9 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fcastDt = this.fcastDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ydCd = this.ydCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrTpszCd = this.cntrTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrAvalFcastTpCd = this.cntrAvalFcastTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
