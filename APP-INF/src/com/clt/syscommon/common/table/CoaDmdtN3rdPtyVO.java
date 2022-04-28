/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CoaDmdtN3rdPtyVO.java
*@FileTitle : CoaDmdtN3rdPtyVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.09.25
*@LastModifier : 임옥영
*@LastVersion : 1.0
* 2009.09.25 임옥영 
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
 * 관련 Event 에서 생성, 서버실행요청시 Data 전달역할을 수행하는 Value Object
 *
 * @author 임옥영
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class CoaDmdtN3rdPtyVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<CoaDmdtN3rdPtyVO> models = new ArrayList<CoaDmdtN3rdPtyVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String costAssBseCd = null;
	/* Column Info */
	private String creDt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String ttlDmdtAmt = null;
	/* Column Info */
	private String ucAmt = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String costYrmon = null;
	/* Column Info */
	private String bkgVolQty = null;
	/* Column Info */
	private String cntrTpszCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String stndCostCd = null;
	
	//SJH.20141229.ADD
	/* Column Info */
	private String costYrmon3 = null;
	private String vslCd3 = null;
	private String vslClssCapa3 = null;
	private String dhirAmt3 = null;
	
	private String costYrmon4 = null;
	private String vslClssCapa4 = null;	
	private String dhirAmt4 = null;	

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public CoaDmdtN3rdPtyVO() {}

	public CoaDmdtN3rdPtyVO(String ibflag, String pagerows, String cntrTpszCd, String costYrmon, String stndCostCd, String ucAmt, String bkgVolQty, String ttlDmdtAmt, String costAssBseCd, String creUsrId, String creDt, String updUsrId, String updDt, String costYrmon3, String vslCd3, String vslClssCapa3, String dhirAmt3, String costYrmon4, String vslClssCapa4, String dhirAmt4) {
		this.updDt = updDt;
		this.costAssBseCd = costAssBseCd;
		this.creDt = creDt;
		this.pagerows = pagerows;
		this.ttlDmdtAmt = ttlDmdtAmt;
		this.ucAmt = ucAmt;
		this.ibflag = ibflag;
		this.creUsrId = creUsrId;
		this.costYrmon = costYrmon;
		this.bkgVolQty = bkgVolQty;
		this.cntrTpszCd = cntrTpszCd;
		this.updUsrId = updUsrId;
		this.stndCostCd = stndCostCd;
		//SJH.20141229.ADD
		this.costYrmon3 = costYrmon3;
		this.vslCd3 = vslCd3;
		this.vslClssCapa3 = vslClssCapa3;
		this.dhirAmt3 = dhirAmt3;
		this.costYrmon4 = costYrmon4;
		this.vslClssCapa4 = vslClssCapa4;
		this.dhirAmt4 = dhirAmt4;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("cost_ass_bse_cd", getCostAssBseCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ttl_dmdt_amt", getTtlDmdtAmt());
		this.hashColumns.put("uc_amt", getUcAmt());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("cost_yrmon", getCostYrmon());
		this.hashColumns.put("bkg_vol_qty", getBkgVolQty());
		this.hashColumns.put("cntr_tpsz_cd", getCntrTpszCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("stnd_cost_cd", getStndCostCd());
		//SJH.20141229.ADD
		this.hashColumns.put("cost_yrmon3", getCostYrmon3());
		this.hashColumns.put("vsl_cd3", getVslCd3());
		this.hashColumns.put("vsl_clss_capa3", getVslClssCapa3());
		this.hashColumns.put("dhir_amt3", getDhirAmt3());
		this.hashColumns.put("cost_yrmon4", getCostYrmon4());
		this.hashColumns.put("vsl_clss_capa4", getVslClssCapa4());
		this.hashColumns.put("dhir_amt4", getDhirAmt4());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("cost_ass_bse_cd", "costAssBseCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ttl_dmdt_amt", "ttlDmdtAmt");
		this.hashFields.put("uc_amt", "ucAmt");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("cost_yrmon", "costYrmon");
		this.hashFields.put("bkg_vol_qty", "bkgVolQty");
		this.hashFields.put("cntr_tpsz_cd", "cntrTpszCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("stnd_cost_cd", "stndCostCd");
		//SJH.20141229.ADD
		this.hashFields.put("cost_yrmon3", "costYrmon3"); 
		this.hashFields.put("vsl_cd3", "vslCd3");
		this.hashFields.put("vsl_clss_capa3", "vslClssCapa3");
		this.hashFields.put("dhir_amt3", "dhirAmt3");
		this.hashFields.put("cost_yrmon4", "costYrmon4");
		this.hashFields.put("vsl_clss_capa4", "vslClssCapa4");
		this.hashFields.put("dhir_amt4", "dhirAmt4");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return updDt
	 */
	public String getUpdDt() {
		return this.updDt;
	}
	
	/**
	 * Column Info
	 * @return costAssBseCd
	 */
	public String getCostAssBseCd() {
		return this.costAssBseCd;
	}
	
	/**
	 * Column Info
	 * @return creDt
	 */
	public String getCreDt() {
		return this.creDt;
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
	 * @return ttlDmdtAmt
	 */
	public String getTtlDmdtAmt() {
		return this.ttlDmdtAmt;
	}
	
	/**
	 * Column Info
	 * @return ucAmt
	 */
	public String getUcAmt() {
		return this.ucAmt;
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
	 * @return creUsrId
	 */
	public String getCreUsrId() {
		return this.creUsrId;
	}
	
	/**
	 * Column Info
	 * @return costYrmon
	 */
	public String getCostYrmon() {
		return this.costYrmon;
	}
	
	/**
	 * Column Info
	 * @return bkgVolQty
	 */
	public String getBkgVolQty() {
		return this.bkgVolQty;
	}
	
	/**
	 * Column Info
	 * @return cntrTpszCd
	 */
	public String getCntrTpszCd() {
		return this.cntrTpszCd;
	}
	
	/**
	 * Column Info
	 * @return updUsrId
	 */
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	
	/**
	 * Column Info
	 * @return stndCostCd
	 */
	public String getStndCostCd() {
		return this.stndCostCd;
	}
	
	/**
	 * Column Info
	 * @return costYrmon3
	 * @author SJH.20141229.ADD
	 */
	public String getCostYrmon3() {
		return this.costYrmon3;
	}
	
	/**
	 * Column Info
	 * @return vslCd3
	 * @author SJH.20141229.ADD
	 */
	public String getVslCd3() {
		return this.vslCd3;
	}
	
	/**
	 * Column Info
	 * @return vslClssCapa3
	 * @author SJH.20141229.ADD
	 */
	public String getVslClssCapa3() {
		return this.vslClssCapa3;
	}
	
	/**
	 * Column Info
	 * @return dhirAmt3
	 * @author SJH.20141229.ADD
	 */
	public String getDhirAmt3() {
		return this.dhirAmt3;
	}
	
	/**
	 * Column Info
	 * @return costYrmon4
	 * @author SJH.20141229.ADD
	 */
	public String getCostYrmon4() {
		return this.costYrmon4;
	}
	
	/**
	 * Column Info
	 * @return vslClssCapa4
	 * @author SJH.20141229.ADD
	 */
	public String getVslClssCapa4() {
		return this.vslClssCapa4;
	}
	
	/**
	 * Column Info
	 * @return dhirAmt4
	 * @author SJH.20141229.ADD
	 */
	public String getDhirAmt4() {
		return this.dhirAmt4;
	}		

	/**
	 * Column Info
	 * @param updDt
	 */
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
	}
	
	/**
	 * Column Info
	 * @param costAssBseCd
	 */
	public void setCostAssBseCd(String costAssBseCd) {
		this.costAssBseCd = costAssBseCd;
	}
	
	/**
	 * Column Info
	 * @param creDt
	 */
	public void setCreDt(String creDt) {
		this.creDt = creDt;
	}
	
	/**
	 * Page Number
	 * @param pagerows
	 */
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
	}
	
	/**
	 * Column Info
	 * @param ttlDmdtAmt
	 */
	public void setTtlDmdtAmt(String ttlDmdtAmt) {
		this.ttlDmdtAmt = ttlDmdtAmt;
	}
	
	/**
	 * Column Info
	 * @param ucAmt
	 */
	public void setUcAmt(String ucAmt) {
		this.ucAmt = ucAmt;
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
	 * @param creUsrId
	 */
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
	}
	
	/**
	 * Column Info
	 * @param costYrmon
	 */
	public void setCostYrmon(String costYrmon) {
		this.costYrmon = costYrmon;
	}
	
	/**
	 * Column Info
	 * @param bkgVolQty
	 */
	public void setBkgVolQty(String bkgVolQty) {
		this.bkgVolQty = bkgVolQty;
	}
	
	/**
	 * Column Info
	 * @param cntrTpszCd
	 */
	public void setCntrTpszCd(String cntrTpszCd) {
		this.cntrTpszCd = cntrTpszCd;
	}
	
	/**
	 * Column Info
	 * @param updUsrId
	 */
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
	}
	
	/**
	 * Column Info
	 * @param stndCostCd
	 */
	public void setStndCostCd(String stndCostCd) {
		this.stndCostCd = stndCostCd;
	}
		
	/**
	 * Column Info
	 * @param costYrmon3
	 * @author SJH.20141229.ADD
	 */
	public void setCostYrmon3(String costYrmon3) {
		this.costYrmon3 = costYrmon3;
	}
	
	/**
	 * Column Info
	 * @param vslCd3
	 * @author SJH.20141229.ADD
	 */
	public void setVslCd3(String vslCd3) {
		this.vslCd3 = vslCd3;
	}
	
	/**
	 * Column Info
	 * @param vslClssCapa3
	 * @author SJH.20141229.ADD
	 */
	public void setVslClssCapa3(String vslClssCapa3) {
		this.vslClssCapa3 = vslClssCapa3;
	}
	
	/**
	 * Column Info
	 * @param dhirAmt3
	 * @author SJH.20141229.ADD
	 */
	public void setDhirAmt3(String dhirAmt3) {
		this.dhirAmt3 = dhirAmt3;
	}
	
	/**
	 * Column Info
	 * @param costYrmon4
	 * @author SJH.20141229.ADD
	 */
	public void setCostYrmon4(String costYrmon4) {
		this.costYrmon4 = costYrmon4;
	}
	
	/**
	 * Column Info
	 * @param vslClssCapa4
	 * @author SJH.20141229.ADD
	 */
	public void setVslClssCapa4(String vslClssCapa4) {
		this.vslClssCapa4 = vslClssCapa4;
	}		
	
	/**
	 * Column Info
	 * @param dhirAmt4
	 * @author SJH.20141229.ADD
	 */
	public void setDhirAmt4(String dhirAmt4) {
		this.dhirAmt4 = dhirAmt4;
	}	
	
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setCostAssBseCd(JSPUtil.getParameter(request, "cost_ass_bse_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setTtlDmdtAmt(JSPUtil.getParameter(request, "ttl_dmdt_amt", ""));
		setUcAmt(JSPUtil.getParameter(request, "uc_amt", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setCostYrmon(JSPUtil.getParameter(request, "cost_yrmon", ""));
		setBkgVolQty(JSPUtil.getParameter(request, "bkg_vol_qty", ""));
		setCntrTpszCd(JSPUtil.getParameter(request, "cntr_tpsz_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setStndCostCd(JSPUtil.getParameter(request, "stnd_cost_cd", ""));
		//SJH.20141229.ADD
		setCostYrmon3(JSPUtil.getParameter(request, "cost_yrmon3", ""));
		setVslCd3(JSPUtil.getParameter(request, "vsl_cd3", ""));
		setVslClssCapa3(JSPUtil.getParameter(request, "vsl_clss_capa3", ""));
		setDhirAmt3(JSPUtil.getParameter(request, "dhir_amt3", ""));
		setCostYrmon4(JSPUtil.getParameter(request, "cost_yrmon4", ""));
		setVslClssCapa4(JSPUtil.getParameter(request, "vsl_clss_capa4", ""));
		setDhirAmt4(JSPUtil.getParameter(request, "dhir_amt4", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return CoaDmdtN3rdPtyVO[]
	 */
	public CoaDmdtN3rdPtyVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return CoaDmdtN3rdPtyVO[]
	 */
	public CoaDmdtN3rdPtyVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		CoaDmdtN3rdPtyVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] costAssBseCd = (JSPUtil.getParameter(request, prefix	+ "cost_ass_bse_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ttlDmdtAmt = (JSPUtil.getParameter(request, prefix	+ "ttl_dmdt_amt", length));
			String[] ucAmt = (JSPUtil.getParameter(request, prefix	+ "uc_amt", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] costYrmon = (JSPUtil.getParameter(request, prefix	+ "cost_yrmon", length));
			String[] bkgVolQty = (JSPUtil.getParameter(request, prefix	+ "bkg_vol_qty", length));
			String[] cntrTpszCd = (JSPUtil.getParameter(request, prefix	+ "cntr_tpsz_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] stndCostCd = (JSPUtil.getParameter(request, prefix	+ "stnd_cost_cd", length));
			//SJH.20141229.ADD
			String[] costYrmon3 = (JSPUtil.getParameter(request, prefix	+ "cost_yrmon3", length));
			String[] vslCd3 = (JSPUtil.getParameter(request, prefix	+ "vsl_cd3", length));
			String[] vslClssCapa3 = (JSPUtil.getParameter(request, prefix	+ "vsl_clss_capa3", length));
			String[] dhirAmt3 = (JSPUtil.getParameter(request, prefix	+ "dhir_amt3", length));
			String[] costYrmon4 = (JSPUtil.getParameter(request, prefix	+ "cost_yrmon4", length));
			String[] vslClssCapa4 = (JSPUtil.getParameter(request, prefix	+ "vsl_clss_capa4", length));
			String[] dhirAmt4 = (JSPUtil.getParameter(request, prefix	+ "dhir_amt4", length));
			
			for (int i = 0; i < length; i++) {
				model = new CoaDmdtN3rdPtyVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (costAssBseCd[i] != null)
					model.setCostAssBseCd(costAssBseCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ttlDmdtAmt[i] != null)
					model.setTtlDmdtAmt(ttlDmdtAmt[i]);
				if (ucAmt[i] != null)
					model.setUcAmt(ucAmt[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (costYrmon[i] != null)
					model.setCostYrmon(costYrmon[i]);
				if (bkgVolQty[i] != null)
					model.setBkgVolQty(bkgVolQty[i]);
				if (cntrTpszCd[i] != null)
					model.setCntrTpszCd(cntrTpszCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (stndCostCd[i] != null)
					model.setStndCostCd(stndCostCd[i]);
				//SJH.20141229.ADD
				if (costYrmon3[i] != null)
					model.setCostYrmon3(costYrmon3[i]);
				if (vslCd3[i] != null)
					model.setVslCd3(vslCd3[i]);
				if (vslClssCapa3[i] != null)
					model.setVslClssCapa3(vslClssCapa3[i]);
				if (dhirAmt3[i] != null)
					model.setDhirAmt3(dhirAmt3[i]);
				if (costYrmon4[i] != null)
					model.setCostYrmon4(costYrmon4[i]);
				if (vslClssCapa4[i] != null)
					model.setVslClssCapa4(vslClssCapa4[i]);
				if (dhirAmt4[i] != null)
					model.setDhirAmt4(dhirAmt4[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getCoaDmdtN3rdPtyVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return CoaDmdtN3rdPtyVO[]
	 */
	public CoaDmdtN3rdPtyVO[] getCoaDmdtN3rdPtyVOs(){
		CoaDmdtN3rdPtyVO[] vos = (CoaDmdtN3rdPtyVO[])models.toArray(new CoaDmdtN3rdPtyVO[models.size()]);
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
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costAssBseCd = this.costAssBseCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ttlDmdtAmt = this.ttlDmdtAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ucAmt = this.ucAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costYrmon = this.costYrmon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgVolQty = this.bkgVolQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrTpszCd = this.cntrTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stndCostCd = this.stndCostCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		//SJH.20141229.ADD
		this.costYrmon3 = this.costYrmon3 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslCd3 = this.vslCd3 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslClssCapa3 = this.vslClssCapa3 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dhirAmt3 = this.dhirAmt3 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costYrmon4 = this.costYrmon4 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslClssCapa4 = this.vslClssCapa4 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dhirAmt4 = this.dhirAmt4 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
