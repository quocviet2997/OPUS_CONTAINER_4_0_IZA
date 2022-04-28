/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : EqrShrtTermOnhCondVO.java
*@FileTitle : EqrShrtTermOnhCondVO
*Open Issues :
*Change history :
* No.	Ver.		Modifier           			modifier date    explanation
* 1		1.0		Lee Byoung Hun		2009.07.09		1.0 최초 생성
*
*@LastModifyDate : 2009.07.09
*@LastModifier : Lee Byoung Hun
*@LastVersion : 1.0
* 2009.07.09  
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
 * @author 
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class EqrShrtTermOnhCondVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<EqrShrtTermOnhCondVO> models = new ArrayList<EqrShrtTermOnhCondVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String eccCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String pdCostAmt = null;
	/* Column Info */
	private String lftChgAmt = null;
	/* Column Info */
	private String drygAmt = null;
	/* Page Number */
	private String pagerows = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String avalCntrQty = null;
	/* Column Info */
	private String cntrTpszCd = null;
	/* Column Info */
	private String dfltUsdDys = null;
	/* Column Info */
	private String pkupChgCrAmt = null;
	/* Column Info */
	private String updUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public EqrShrtTermOnhCondVO() {}

	public EqrShrtTermOnhCondVO(String ibflag, String pagerows, String eccCd, String cntrTpszCd, String avalCntrQty, String lftChgAmt, String drygAmt, String pkupChgCrAmt, String pdCostAmt, String dfltUsdDys, String deltFlg, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.deltFlg = deltFlg;
		this.eccCd = eccCd;
		this.creDt = creDt;
		this.pdCostAmt = pdCostAmt;
		this.lftChgAmt = lftChgAmt;
		this.drygAmt = drygAmt;
		this.pagerows = pagerows;
		this.ibflag = ibflag;
		this.creUsrId = creUsrId;
		this.avalCntrQty = avalCntrQty;
		this.cntrTpszCd = cntrTpszCd;
		this.dfltUsdDys = dfltUsdDys;
		this.pkupChgCrAmt = pkupChgCrAmt;
		this.updUsrId = updUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("ecc_cd", getEccCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("pd_cost_amt", getPdCostAmt());
		this.hashColumns.put("lft_chg_amt", getLftChgAmt());
		this.hashColumns.put("dryg_amt", getDrygAmt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("aval_cntr_qty", getAvalCntrQty());
		this.hashColumns.put("cntr_tpsz_cd", getCntrTpszCd());
		this.hashColumns.put("dflt_usd_dys", getDfltUsdDys());
		this.hashColumns.put("pkup_chg_cr_amt", getPkupChgCrAmt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("ecc_cd", "eccCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("pd_cost_amt", "pdCostAmt");
		this.hashFields.put("lft_chg_amt", "lftChgAmt");
		this.hashFields.put("dryg_amt", "drygAmt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("aval_cntr_qty", "avalCntrQty");
		this.hashFields.put("cntr_tpsz_cd", "cntrTpszCd");
		this.hashFields.put("dflt_usd_dys", "dfltUsdDys");
		this.hashFields.put("pkup_chg_cr_amt", "pkupChgCrAmt");
		this.hashFields.put("upd_usr_id", "updUsrId");
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
	 * @return deltFlg
	 */
	public String getDeltFlg() {
		return this.deltFlg;
	}
	
	/**
	 * Column Info
	 * @return eccCd
	 */
	public String getEccCd() {
		return this.eccCd;
	}
	
	/**
	 * Column Info
	 * @return creDt
	 */
	public String getCreDt() {
		return this.creDt;
	}
	
	/**
	 * Column Info
	 * @return pdCostAmt
	 */
	public String getPdCostAmt() {
		return this.pdCostAmt;
	}
	
	/**
	 * Column Info
	 * @return lftChgAmt
	 */
	public String getLftChgAmt() {
		return this.lftChgAmt;
	}
	
	/**
	 * Column Info
	 * @return drygAmt
	 */
	public String getDrygAmt() {
		return this.drygAmt;
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
	 * @return avalCntrQty
	 */
	public String getAvalCntrQty() {
		return this.avalCntrQty;
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
	 * @return dfltUsdDys
	 */
	public String getDfltUsdDys() {
		return this.dfltUsdDys;
	}
	
	/**
	 * Column Info
	 * @return pkupChgCrAmt
	 */
	public String getPkupChgCrAmt() {
		return this.pkupChgCrAmt;
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
	 * @param updDt
	 */
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
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
	 * @param eccCd
	 */
	public void setEccCd(String eccCd) {
		this.eccCd = eccCd;
	}
	
	/**
	 * Column Info
	 * @param creDt
	 */
	public void setCreDt(String creDt) {
		this.creDt = creDt;
	}
	
	/**
	 * Column Info
	 * @param pdCostAmt
	 */
	public void setPdCostAmt(String pdCostAmt) {
		this.pdCostAmt = pdCostAmt;
	}
	
	/**
	 * Column Info
	 * @param lftChgAmt
	 */
	public void setLftChgAmt(String lftChgAmt) {
		this.lftChgAmt = lftChgAmt;
	}
	
	/**
	 * Column Info
	 * @param drygAmt
	 */
	public void setDrygAmt(String drygAmt) {
		this.drygAmt = drygAmt;
	}
	
	/**
	 * Page Number
	 * @param pagerows
	 */
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
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
	 * @param avalCntrQty
	 */
	public void setAvalCntrQty(String avalCntrQty) {
		this.avalCntrQty = avalCntrQty;
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
	 * @param dfltUsdDys
	 */
	public void setDfltUsdDys(String dfltUsdDys) {
		this.dfltUsdDys = dfltUsdDys;
	}
	
	/**
	 * Column Info
	 * @param pkupChgCrAmt
	 */
	public void setPkupChgCrAmt(String pkupChgCrAmt) {
		this.pkupChgCrAmt = pkupChgCrAmt;
	}
	
	/**
	 * Column Info
	 * @param updUsrId
	 */
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setDeltFlg(JSPUtil.getParameter(request, "delt_flg", ""));
		setEccCd(JSPUtil.getParameter(request, "ecc_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setPdCostAmt(JSPUtil.getParameter(request, "pd_cost_amt", ""));
		setLftChgAmt(JSPUtil.getParameter(request, "lft_chg_amt", ""));
		setDrygAmt(JSPUtil.getParameter(request, "dryg_amt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setAvalCntrQty(JSPUtil.getParameter(request, "aval_cntr_qty", ""));
		setCntrTpszCd(JSPUtil.getParameter(request, "cntr_tpsz_cd", ""));
		setDfltUsdDys(JSPUtil.getParameter(request, "dflt_usd_dys", ""));
		setPkupChgCrAmt(JSPUtil.getParameter(request, "pkup_chg_cr_amt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return EqrShrtTermOnhCondVO[]
	 */
	public EqrShrtTermOnhCondVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return EqrShrtTermOnhCondVO[]
	 */
	public EqrShrtTermOnhCondVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		EqrShrtTermOnhCondVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg", length));
			String[] eccCd = (JSPUtil.getParameter(request, prefix	+ "ecc_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] pdCostAmt = (JSPUtil.getParameter(request, prefix	+ "pd_cost_amt", length));
			String[] lftChgAmt = (JSPUtil.getParameter(request, prefix	+ "lft_chg_amt", length));
			String[] drygAmt = (JSPUtil.getParameter(request, prefix	+ "dryg_amt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] avalCntrQty = (JSPUtil.getParameter(request, prefix	+ "aval_cntr_qty", length));
			String[] cntrTpszCd = (JSPUtil.getParameter(request, prefix	+ "cntr_tpsz_cd", length));
			String[] dfltUsdDys = (JSPUtil.getParameter(request, prefix	+ "dflt_usd_dys", length));
			String[] pkupChgCrAmt = (JSPUtil.getParameter(request, prefix	+ "pkup_chg_cr_amt", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			
			for (int i = 0; i < length; i++) {
				model = new EqrShrtTermOnhCondVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (eccCd[i] != null)
					model.setEccCd(eccCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (pdCostAmt[i] != null)
					model.setPdCostAmt(pdCostAmt[i]);
				if (lftChgAmt[i] != null)
					model.setLftChgAmt(lftChgAmt[i]);
				if (drygAmt[i] != null)
					model.setDrygAmt(drygAmt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (avalCntrQty[i] != null)
					model.setAvalCntrQty(avalCntrQty[i]);
				if (cntrTpszCd[i] != null)
					model.setCntrTpszCd(cntrTpszCd[i]);
				if (dfltUsdDys[i] != null)
					model.setDfltUsdDys(dfltUsdDys[i]);
				if (pkupChgCrAmt[i] != null)
					model.setPkupChgCrAmt(pkupChgCrAmt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getEqrShrtTermOnhCondVOs();
	}
	
	/**
	 * EES_EQR_0118 S/T On-Hire 정보 조회/수정 화면에서 사용
	 * 
	 * @param request
	 * @param tpsztype
	 * @return
	 */
    public EqrShrtTermOnhCondVO[] fromRequestGridArrayList(HttpServletRequest request ,String tpsztype) {
    	EqrShrtTermOnhCondVO model = null;
        String[] prefix  			 = null;
        
        try {
        	if(!"".equals(tpsztype)) {
        		prefix = tpsztype.split(",");
        	}

        	int length = request.getParameterValues("ibflag").length;
                	
        	for(int k=0; k<prefix.length; k++) {
				String[] ibflag =  (JSPUtil.getParameter(request, "ibflag", length));
				String[] ecc_cd =  (JSPUtil.getParameter(request, "ecc_cd", length));
            	String cntr_tpsz_cd = prefix[k].toString();
            	String[] aval_cntr_qty = (JSPUtil.getParameter(request, prefix[k].toLowerCase() + "aval_cntr_qty", length));
            	String[] lft_chg_amt     =  (JSPUtil.getParameter(request, prefix[k].toLowerCase() + "lft_chg_amt", length));
            	String[] dryg_amt        =  (JSPUtil.getParameter(request, prefix[k].toLowerCase() + "dryg_amt", length));
            	String[] pkup_chg_cr_amt =  (JSPUtil.getParameter(request, prefix[k].toLowerCase() + "pkup_chg_cr_amt", length));
            	String[] pd_cost_amt     =  (JSPUtil.getParameter(request, prefix[k].toLowerCase() + "pd_cost_amt", length));
            	String[] avg_usd_dys     =  (JSPUtil.getParameter(request, prefix[k].toLowerCase() + "avg_usd_dys", length));
            
            	for(int i=0; i<length; i++) {
            	    model = new EqrShrtTermOnhCondVO();
        			model.setIbflag                   ( ibflag             [i]);
        			model.setEccCd                   ( ecc_cd             [i]);
        			model.setCntrTpszCd             ( cntr_tpsz_cd       );
        			model.setAvalCntrQty            ( aval_cntr_qty      [i]);
        			model.setLftChgAmt              ( lft_chg_amt        [i]);
        			model.setDrygAmt                 ( dryg_amt           [i]);
        			model.setPkupChgCrAmt          ( pkup_chg_cr_amt    [i]);
        			model.setPdCostAmt              ( pd_cost_amt        [i]);
        			model.setDfltUsdDys              ( avg_usd_dys        [i]);
        			models.add(model);
            	}
       		}
        } catch (Exception ex) {
        	return null;
        }
        return getEqrShrtTermOnhCondVOs();
    }

	/**
	 * VO 배열을 반환
	 * @return EqrShrtTermOnhCondVO[]
	 */
	public EqrShrtTermOnhCondVO[] getEqrShrtTermOnhCondVOs(){
		EqrShrtTermOnhCondVO[] vos = (EqrShrtTermOnhCondVO[])models.toArray(new EqrShrtTermOnhCondVO[models.size()]);
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
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eccCd = this.eccCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pdCostAmt = this.pdCostAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lftChgAmt = this.lftChgAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.drygAmt = this.drygAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.avalCntrQty = this.avalCntrQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrTpszCd = this.cntrTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dfltUsdDys = this.dfltUsdDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pkupChgCrAmt = this.pkupChgCrAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
