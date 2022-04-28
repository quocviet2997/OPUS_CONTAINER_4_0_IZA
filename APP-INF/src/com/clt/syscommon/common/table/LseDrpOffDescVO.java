/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : LseDrpOffDescVO.java
*@FileTitle : LseDrpOffDescVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.06.11
*@LastModifier : 노정용
*@LastVersion : 1.0
* 2009.06.11 노정용 
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
 * @author 노정용
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class LseDrpOffDescVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<LseDrpOffDescVO> models = new ArrayList<LseDrpOffDescVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String agmtSeq = null;
	/* Column Info */
	private String addrDesc = null;
	/* Column Info */
	private String ctrtNoDesc = null;
	/* Column Info */
	private String creDt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String ctrtPsonDesc = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String locCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String turnRefNoDesc = null;
	/* Column Info */
	private String agmtCtyCd = null;
	/* Column Info */
	private String dptDesc = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String lsePsonCtrtEml = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public LseDrpOffDescVO() {}

	public LseDrpOffDescVO(String ibflag, String pagerows, String agmtCtyCd, String agmtSeq, String locCd, String dptDesc, String addrDesc, String ctrtPsonDesc
			             , String ctrtNoDesc, String turnRefNoDesc, String creUsrId, String creDt, String updUsrId, String updDt, String lsePsonCtrtEml) {
		this.updDt = updDt;
		this.agmtSeq = agmtSeq;
		this.addrDesc = addrDesc;
		this.ctrtNoDesc = ctrtNoDesc;
		this.creDt = creDt;
		this.pagerows = pagerows;
		this.ctrtPsonDesc = ctrtPsonDesc;
		this.ibflag = ibflag;
		this.locCd = locCd;
		this.creUsrId = creUsrId;
		this.turnRefNoDesc = turnRefNoDesc;
		this.agmtCtyCd = agmtCtyCd;
		this.dptDesc = dptDesc;
		this.updUsrId = updUsrId;
		this.lsePsonCtrtEml = lsePsonCtrtEml;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("agmt_seq", getAgmtSeq());
		this.hashColumns.put("addr_desc", getAddrDesc());
		this.hashColumns.put("ctrt_no_desc", getCtrtNoDesc());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ctrt_pson_desc", getCtrtPsonDesc());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("loc_cd", getLocCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("turn_ref_no_desc", getTurnRefNoDesc());
		this.hashColumns.put("agmt_cty_cd", getAgmtCtyCd());
		this.hashColumns.put("dpt_desc", getDptDesc());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("lse_pson_ctrt_eml", getLsePsonCtrtEml());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("agmt_seq", "agmtSeq");
		this.hashFields.put("addr_desc", "addrDesc");
		this.hashFields.put("ctrt_no_desc", "ctrtNoDesc");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ctrt_pson_desc", "ctrtPsonDesc");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("loc_cd", "locCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("turn_ref_no_desc", "turnRefNoDesc");
		this.hashFields.put("agmt_cty_cd", "agmtCtyCd");
		this.hashFields.put("dpt_desc", "dptDesc");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("lse_pson_ctrt_eml", "lsePsonCtrtEml");
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
	 * @return agmtSeq
	 */
	public String getAgmtSeq() {
		return this.agmtSeq;
	}
	
	/**
	 * Column Info
	 * @return addrDesc
	 */
	public String getAddrDesc() {
		return this.addrDesc;
	}
	
	/**
	 * Column Info
	 * @return ctrtNoDesc
	 */
	public String getCtrtNoDesc() {
		return this.ctrtNoDesc;
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
	 * @return ctrtPsonDesc
	 */
	public String getCtrtPsonDesc() {
		return this.ctrtPsonDesc;
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
	 * @return locCd
	 */
	public String getLocCd() {
		return this.locCd;
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
	 * @return turnRefNoDesc
	 */
	public String getTurnRefNoDesc() {
		return this.turnRefNoDesc;
	}
	
	/**
	 * Column Info
	 * @return agmtCtyCd
	 */
	public String getAgmtCtyCd() {
		return this.agmtCtyCd;
	}
	
	/**
	 * Column Info
	 * @return dptDesc
	 */
	public String getDptDesc() {
		return this.dptDesc;
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
	 * @param agmtSeq
	 */
	public void setAgmtSeq(String agmtSeq) {
		this.agmtSeq = agmtSeq;
	}
	
	/**
	 * Column Info
	 * @param addrDesc
	 */
	public void setAddrDesc(String addrDesc) {
		this.addrDesc = addrDesc;
	}
	
	/**
	 * Column Info
	 * @param ctrtNoDesc
	 */
	public void setCtrtNoDesc(String ctrtNoDesc) {
		this.ctrtNoDesc = ctrtNoDesc;
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
	 * @param ctrtPsonDesc
	 */
	public void setCtrtPsonDesc(String ctrtPsonDesc) {
		this.ctrtPsonDesc = ctrtPsonDesc;
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
	 * @param locCd
	 */
	public void setLocCd(String locCd) {
		this.locCd = locCd;
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
	 * @param turnRefNoDesc
	 */
	public void setTurnRefNoDesc(String turnRefNoDesc) {
		this.turnRefNoDesc = turnRefNoDesc;
	}
	
	/**
	 * Column Info
	 * @param agmtCtyCd
	 */
	public void setAgmtCtyCd(String agmtCtyCd) {
		this.agmtCtyCd = agmtCtyCd;
	}
	
	/**
	 * Column Info
	 * @param dptDesc
	 */
	public void setDptDesc(String dptDesc) {
		this.dptDesc = dptDesc;
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
		setAgmtSeq(JSPUtil.getParameter(request, "agmt_seq", ""));
		setAddrDesc(JSPUtil.getParameter(request, "addr_desc", ""));
		setCtrtNoDesc(JSPUtil.getParameter(request, "ctrt_no_desc", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setCtrtPsonDesc(JSPUtil.getParameter(request, "ctrt_pson_desc", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setLocCd(JSPUtil.getParameter(request, "loc_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setTurnRefNoDesc(JSPUtil.getParameter(request, "turn_ref_no_desc", ""));
		setAgmtCtyCd(JSPUtil.getParameter(request, "agmt_cty_cd", ""));
		setDptDesc(JSPUtil.getParameter(request, "dpt_desc", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setLsePsonCtrtEml(JSPUtil.getParameter(request, "lse_pson_ctrt_eml", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return LseDrpOffDescVO[]
	 */
	public LseDrpOffDescVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return LseDrpOffDescVO[]
	 */
	public LseDrpOffDescVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		LseDrpOffDescVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] agmtSeq = (JSPUtil.getParameter(request, prefix	+ "agmt_seq", length));
			String[] addrDesc = (JSPUtil.getParameter(request, prefix	+ "addr_desc", length));
			String[] ctrtNoDesc = (JSPUtil.getParameter(request, prefix	+ "ctrt_no_desc", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ctrtPsonDesc = (JSPUtil.getParameter(request, prefix	+ "ctrt_pson_desc", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] locCd = (JSPUtil.getParameter(request, prefix	+ "loc_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] turnRefNoDesc = (JSPUtil.getParameter(request, prefix	+ "turn_ref_no_desc", length));
			String[] agmtCtyCd = (JSPUtil.getParameter(request, prefix	+ "agmt_cty_cd", length));
			String[] dptDesc = (JSPUtil.getParameter(request, prefix	+ "dpt_desc", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] lsePsonCtrtEml = (JSPUtil.getParameter(request, prefix	+ "lse_pson_ctrt_eml", length));
			
			for (int i = 0; i < length; i++) {
				model = new LseDrpOffDescVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (agmtSeq[i] != null)
					model.setAgmtSeq(agmtSeq[i]);
				if (addrDesc[i] != null)
					model.setAddrDesc(addrDesc[i]);
				if (ctrtNoDesc[i] != null)
					model.setCtrtNoDesc(ctrtNoDesc[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ctrtPsonDesc[i] != null)
					model.setCtrtPsonDesc(ctrtPsonDesc[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (locCd[i] != null)
					model.setLocCd(locCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (turnRefNoDesc[i] != null)
					model.setTurnRefNoDesc(turnRefNoDesc[i]);
				if (agmtCtyCd[i] != null)
					model.setAgmtCtyCd(agmtCtyCd[i]);
				if (dptDesc[i] != null)
					model.setDptDesc(dptDesc[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (lsePsonCtrtEml[i] != null)
					model.setLsePsonCtrtEml(lsePsonCtrtEml[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getLseDrpOffDescVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return LseDrpOffDescVO[]
	 */
	public LseDrpOffDescVO[] getLseDrpOffDescVOs(){
		LseDrpOffDescVO[] vos = (LseDrpOffDescVO[])models.toArray(new LseDrpOffDescVO[models.size()]);
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
		this.agmtSeq = this.agmtSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.addrDesc = this.addrDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ctrtNoDesc = this.ctrtNoDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ctrtPsonDesc = this.ctrtPsonDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.locCd = this.locCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.turnRefNoDesc = this.turnRefNoDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agmtCtyCd = this.agmtCtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dptDesc = this.dptDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lsePsonCtrtEml = this.lsePsonCtrtEml .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}

	public void setLsePsonCtrtEml(String lsePsonCtrtEml) {
		this.lsePsonCtrtEml = lsePsonCtrtEml;
	}

	public String getLsePsonCtrtEml() {
		return lsePsonCtrtEml;
	}
}
