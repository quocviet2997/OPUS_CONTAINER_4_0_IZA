/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : EqrObFcastRedLgtAltVO.java
*@FileTitle : EqrObFcastRedLgtAltVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.22
*@LastModifier : 
*@LastVersion : 1.0
* 2009.07.22  
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

public class EqrObFcastRedLgtAltVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<EqrObFcastRedLgtAltVO> models = new ArrayList<EqrObFcastRedLgtAltVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String rlaTpCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String cntrTpszCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String rlaRto = null;
	/* Column Info */
	private String rccCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String rlaQty = null;
	/* Page Number */
	private String pagerows = null;
	/* CUD용 데이터 */
	private String type2 = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public EqrObFcastRedLgtAltVO() {}

	public EqrObFcastRedLgtAltVO(String ibflag, String pagerows, String rccCd, String rlaTpCd, String cntrTpszCd, String rlaRto, String rlaQty, String creUsrId, String creDt, String updUsrId, String updDt, String type2) {
		this.updDt = updDt;
		this.creUsrId = creUsrId;
		this.rlaTpCd = rlaTpCd;
		this.ibflag = ibflag;
		this.cntrTpszCd = cntrTpszCd;
		this.creDt = creDt;
		this.rlaRto = rlaRto;
		this.rccCd = rccCd;
		this.updUsrId = updUsrId;
		this.rlaQty = rlaQty;
		this.pagerows = pagerows;
		this.type2 = type2;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("rla_tp_cd", getRlaTpCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cntr_tpsz_cd", getCntrTpszCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("rla_rto", getRlaRto());
		this.hashColumns.put("rcc_cd", getRccCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("rla_qty", getRlaQty());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("type2", getType2());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("rla_tp_cd", "rlaTpCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cntr_tpsz_cd", "cntrTpszCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("rla_rto", "rlaRto");
		this.hashFields.put("rcc_cd", "rccCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("rla_qty", "rlaQty");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("type2", "type2");
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
	 * @return creUsrId
	 */
	public String getCreUsrId() {
		return this.creUsrId;
	}
	
	/**
	 * Column Info
	 * @return rlaTpCd
	 */
	public String getRlaTpCd() {
		return this.rlaTpCd;
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
	 * @return cntrTpszCd
	 */
	public String getCntrTpszCd() {
		return this.cntrTpszCd;
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
	 * @return rlaRto
	 */
	public String getRlaRto() {
		return this.rlaRto;
	}
	
	/**
	 * Column Info
	 * @return rccCd
	 */
	public String getRccCd() {
		return this.rccCd;
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
	 * @return rlaQty
	 */
	public String getRlaQty() {
		return this.rlaQty;
	}
	
	/**
	 * Page Number
	 * @return pagerows
	 */
	public String getPagerows() {
		return this.pagerows;
	}
	
	/**
	 * Type2
	 * @return type2
	 */
	public String getType2() {
		return this.type2;
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
	 * @param creUsrId
	 */
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
	}
	
	/**
	 * Column Info
	 * @param rlaTpCd
	 */
	public void setRlaTpCd(String rlaTpCd) {
		this.rlaTpCd = rlaTpCd;
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
	 * @param cntrTpszCd
	 */
	public void setCntrTpszCd(String cntrTpszCd) {
		this.cntrTpszCd = cntrTpszCd;
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
	 * @param rlaRto
	 */
	public void setRlaRto(String rlaRto) {
		this.rlaRto = rlaRto;
	}
	
	/**
	 * Column Info
	 * @param rccCd
	 */
	public void setRccCd(String rccCd) {
		this.rccCd = rccCd;
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
	 * @param rlaQty
	 */
	public void setRlaQty(String rlaQty) {
		this.rlaQty = rlaQty;
	}
	
	/**
	 * Page Number
	 * @param pagerows
	 */
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
	}
	
	/**
	 * Type2
	 * @param type2
	 */
	public void setType2(String type2) {
		this.type2 = type2;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setRlaTpCd(JSPUtil.getParameter(request, "rla_tp_cd", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCntrTpszCd(JSPUtil.getParameter(request, "cntr_tpsz_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setRlaRto(JSPUtil.getParameter(request, "rla_rto", ""));
		setRccCd(JSPUtil.getParameter(request, "rcc_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setRlaQty(JSPUtil.getParameter(request, "rla_qty", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setPagerows(JSPUtil.getParameter(request, "type2", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return EqrObFcastRedLgtAltVO[]
	 */
	public EqrObFcastRedLgtAltVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return EqrObFcastRedLgtAltVO[]
	 */
	public EqrObFcastRedLgtAltVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		EqrObFcastRedLgtAltVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] rlaTpCd = (JSPUtil.getParameter(request, prefix	+ "rla_tp_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] cntrTpszCd = (JSPUtil.getParameter(request, prefix	+ "cntr_tpsz_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] rlaRto = (JSPUtil.getParameter(request, prefix	+ "rla_rto", length));
			String[] rccCd = (JSPUtil.getParameter(request, prefix	+ "rcc_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] rlaQty = (JSPUtil.getParameter(request, prefix	+ "rla_qty", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] type2 = (JSPUtil.getParameter(request, prefix	+ "type2", length));
			
			for (int i = 0; i < length; i++) {
				model = new EqrObFcastRedLgtAltVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (rlaTpCd[i] != null)
					model.setRlaTpCd(rlaTpCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (cntrTpszCd[i] != null)
					model.setCntrTpszCd(cntrTpszCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (rlaRto[i] != null)
					model.setRlaRto(rlaRto[i]);
				if (rccCd[i] != null)
					model.setRccCd(rccCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (rlaQty[i] != null)
					model.setRlaQty(rlaQty[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (type2[i] != null)
					model.setType2(type2[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getEqrObFcastRedLgtAltVOs();
	}
	
	/**
	 * EES_EQR_0035 Red Light Alert 기준 조회/수정---컨테이너 수급 예측 화면에서 사용<br>
	 * 
	 * @param request
	 * @return
	 */
    public EqrObFcastRedLgtAltVO[] fromRequestGridArrayList(HttpServletRequest request) {
    	EqrObFcastRedLgtAltVO model = null;
        String tpsz	= JSPUtil.getParameter(request, "tpsz", "");
		String[] prefix = tpsz.replace('|', ',').split(",");
        
        try {
            
        	int length = request.getParameterValues("ibflag").length;
                	
        	for(int k=0; k<prefix.length; k++) {
    			String[] ibflag          =  (JSPUtil.getParameter(request, "ibflag", length));
    			String[] rcc_cd          =  (JSPUtil.getParameter(request, "rcc_cd", length)); // rcc
    			String[] type2           =  (JSPUtil.getParameter(request, "type2", length)); // ratio, qty
    			String[] rla_tp_cd       =  (JSPUtil.getParameter(request, "rla_tp_cd", length)); // C,V code
    			String   cntr_tpsz_cd    =  prefix[k].toString();                                 // tpsz
    			String[] rla_qty   =  (JSPUtil.getParameter(request, prefix[k].toLowerCase() + "rla", length)); // qty, ratio
            
            	for(int i=0; i<length; i++) { 
            		model = new EqrObFcastRedLgtAltVO();
    				model.setIbflag         		  ( ibflag         	[i]);
    				model.setRccCd      		      ( rcc_cd      	[i]);
    				model.setType2         		      ( type2         	[i]);
    				model.setRlaTpCd            	  ( rla_tp_cd      	[i]);
     				model.setCntrTpszCd   		  ( cntr_tpsz_cd   	 );
    				model.setRlaQty  		  		  ( rla_qty     	[i]);
     				
    				models.add(model);
            	}
       		}
        } catch (Exception ex) {
        	ex.printStackTrace();
        }
        return getEqrObFcastRedLgtAltVOs();
    }

	/**
	 * VO 배열을 반환
	 * @return EqrObFcastRedLgtAltVO[]
	 */
	public EqrObFcastRedLgtAltVO[] getEqrObFcastRedLgtAltVOs(){
		EqrObFcastRedLgtAltVO[] vos = (EqrObFcastRedLgtAltVO[])models.toArray(new EqrObFcastRedLgtAltVO[models.size()]);
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
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rlaTpCd = this.rlaTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrTpszCd = this.cntrTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rlaRto = this.rlaRto .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rccCd = this.rccCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rlaQty = this.rlaQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.type2 = this.type2 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
