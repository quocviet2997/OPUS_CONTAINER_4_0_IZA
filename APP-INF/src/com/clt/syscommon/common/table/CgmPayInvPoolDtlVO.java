/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CgmPayInvPoolDtlVO.java
*@FileTitle : CgmPayInvPoolDtlVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.08
*@LastModifier : 김창식
*@LastVersion : 1.0
* 2009.05.08 김창식 
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
 * @author 김창식
 * @since J2EE 1.5
 */

public class CgmPayInvPoolDtlVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<CgmPayInvPoolDtlVO> models = new ArrayList<CgmPayInvPoolDtlVO>();
	
	/* Column Info */
	private String costBilDys = null;
	/* Status */
	private String ibflag = null;
	/* Column Info */
	private String payInvSeq = null;
	/* Column Info */
	private String poolBsrtAmt = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String costCd = null;
	/* Column Info */
	private String costAmt = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String dtlPoolCostItmCd = null;
	/* Column Info */
	private String costChssQty = null;
	/* Column Info */
	private String creUsrId = null;
	/* Page Number */
	private String pagerows = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	hashFildInpo	*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public CgmPayInvPoolDtlVO() {}

	public CgmPayInvPoolDtlVO(String ibflag, String pagerows, String payInvSeq, String dtlPoolCostItmCd, String costCd, String costChssQty, String poolBsrtAmt, String costBilDys, String costAmt, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.costBilDys = costBilDys;
		this.ibflag = ibflag;
		this.payInvSeq = payInvSeq;
		this.poolBsrtAmt = poolBsrtAmt;
		this.updUsrId = updUsrId;
		this.costCd = costCd;
		this.costAmt = costAmt;
		this.updDt = updDt;
		this.creDt = creDt;
		this.dtlPoolCostItmCd = dtlPoolCostItmCd;
		this.costChssQty = costChssQty;
		this.creUsrId = creUsrId;
		this.pagerows = pagerows;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("cost_bil_dys", getCostBilDys());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("pay_inv_seq", getPayInvSeq());
		this.hashColumns.put("pool_bsrt_amt", getPoolBsrtAmt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("cost_cd", getCostCd());
		this.hashColumns.put("cost_amt", getCostAmt());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("dtl_pool_cost_itm_cd", getDtlPoolCostItmCd());
		this.hashColumns.put("cost_chss_qty", getCostChssQty());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("pagerows", getPagerows());
		return this.hashColumns;
	}
	
	/**
	 * hashFildInpo
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("cost_bil_dys", "costBilDys");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("pay_inv_seq", "payInvSeq");
		this.hashFields.put("pool_bsrt_amt", "poolBsrtAmt");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("cost_cd", "costCd");
		this.hashFields.put("cost_amt", "costAmt");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("dtl_pool_cost_itm_cd", "dtlPoolCostItmCd");
		this.hashFields.put("cost_chss_qty", "costChssQty");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("pagerows", "pagerows");
		return this.hashFields;
	}
	
	public String getCostBilDys() {
		return this.costBilDys;
	}
	public String getIbflag() {
		return this.ibflag;
	}
	public String getPayInvSeq() {
		return this.payInvSeq;
	}
	public String getPoolBsrtAmt() {
		return this.poolBsrtAmt;
	}
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	public String getCostCd() {
		return this.costCd;
	}
	public String getCostAmt() {
		return this.costAmt;
	}
	public String getUpdDt() {
		return this.updDt;
	}
	public String getCreDt() {
		return this.creDt;
	}
	public String getDtlPoolCostItmCd() {
		return this.dtlPoolCostItmCd;
	}
	public String getCostChssQty() {
		return this.costChssQty;
	}
	public String getCreUsrId() {
		return this.creUsrId;
	}
	public String getPagerows() {
		return this.pagerows;
	}

	public void setCostBilDys(String costBilDys) {
		this.costBilDys = costBilDys;
		//this.costBilDys=true;
	}
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setPayInvSeq(String payInvSeq) {
		this.payInvSeq = payInvSeq;
		//this.payInvSeq=true;
	}
	public void setPoolBsrtAmt(String poolBsrtAmt) {
		this.poolBsrtAmt = poolBsrtAmt;
		//this.poolBsrtAmt=true;
	}
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
		//this.updUsrId=true;
	}
	public void setCostCd(String costCd) {
		this.costCd = costCd;
		//this.costCd=true;
	}
	public void setCostAmt(String costAmt) {
		this.costAmt = costAmt;
		//this.costAmt=true;
	}
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
		//this.updDt=true;
	}
	public void setCreDt(String creDt) {
		this.creDt = creDt;
		//this.creDt=true;
	}
	public void setDtlPoolCostItmCd(String dtlPoolCostItmCd) {
		this.dtlPoolCostItmCd = dtlPoolCostItmCd;
		//this.dtlPoolCostItmCd=true;
	}
	public void setCostChssQty(String costChssQty) {
		this.costChssQty = costChssQty;
		//this.costChssQty=true;
	}
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
		//this.creUsrId=true;
	}
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}
	public void fromRequest(HttpServletRequest request) {
		setCostBilDys(JSPUtil.getParameter(request, "cost_bil_dys", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setPayInvSeq(JSPUtil.getParameter(request, "pay_inv_seq", ""));
		setPoolBsrtAmt(JSPUtil.getParameter(request, "pool_bsrt_amt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setCostCd(JSPUtil.getParameter(request, "cost_cd", ""));
		setCostAmt(JSPUtil.getParameter(request, "cost_amt", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setDtlPoolCostItmCd(JSPUtil.getParameter(request, "dtl_pool_cost_itm_cd", ""));
		setCostChssQty(JSPUtil.getParameter(request, "cost_chss_qty", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
	}

	public CgmPayInvPoolDtlVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public CgmPayInvPoolDtlVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		CgmPayInvPoolDtlVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] costBilDys = (JSPUtil.getParameter(request, prefix	+ "cost_bil_dys".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] payInvSeq = (JSPUtil.getParameter(request, prefix	+ "pay_inv_seq".trim(), length));
			String[] poolBsrtAmt = (JSPUtil.getParameter(request, prefix	+ "pool_bsrt_amt".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] costCd = (JSPUtil.getParameter(request, prefix	+ "cost_cd".trim(), length));
			String[] costAmt = (JSPUtil.getParameter(request, prefix	+ "cost_amt".trim(), length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] dtlPoolCostItmCd = (JSPUtil.getParameter(request, prefix	+ "dtl_pool_cost_itm_cd".trim(), length));
			String[] costChssQty = (JSPUtil.getParameter(request, prefix	+ "cost_chss_qty".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new CgmPayInvPoolDtlVO();
				if (costBilDys[i] != null)
					model.setCostBilDys(costBilDys[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (payInvSeq[i] != null)
					model.setPayInvSeq(payInvSeq[i]);
				if (poolBsrtAmt[i] != null)
					model.setPoolBsrtAmt(poolBsrtAmt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (costCd[i] != null)
					model.setCostCd(costCd[i]);
				if (costAmt[i] != null)
					model.setCostAmt(costAmt[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (dtlPoolCostItmCd[i] != null)
					model.setDtlPoolCostItmCd(dtlPoolCostItmCd[i]);
				if (costChssQty[i] != null)
					model.setCostChssQty(costChssQty[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {}
		return getCgmPayInvPoolDtlVOs();
	}

	public CgmPayInvPoolDtlVO[] getCgmPayInvPoolDtlVOs(){
		CgmPayInvPoolDtlVO[] vos = (CgmPayInvPoolDtlVO[])models.toArray(new CgmPayInvPoolDtlVO[models.size()]);
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
		this.costBilDys = this.costBilDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.payInvSeq = this.payInvSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.poolBsrtAmt = this.poolBsrtAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costCd = this.costCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costAmt = this.costAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dtlPoolCostItmCd = this.dtlPoolCostItmCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costChssQty = this.costChssQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
