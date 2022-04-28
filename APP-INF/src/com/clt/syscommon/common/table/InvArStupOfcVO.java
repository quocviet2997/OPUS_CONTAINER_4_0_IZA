/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : InvArStupOfcVO.java
*@FileTitle : InvArStupOfcVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.06.09
*@LastModifier : 한동훈
*@LastVersion : 1.0
* 2009.06.09 한동훈 
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
 * @author 한동훈
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class InvArStupOfcVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<InvArStupOfcVO> models = new ArrayList<InvArStupOfcVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String invSndTpCd = null;
	/* Column Info */
	private String dmdtInvAplyBlFlg = null;
	/* Column Info */
	private String xchRtRvsFlg = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String otsSmryCd = null;
	/* Column Info */
	private String xchRtN3rdTpCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String n3ptyBilArInvFlg = null;
	/* Column Info */
	private String arOfcCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String invIssTpCd = null;
	/* Column Info */
	private String xchRtUsdTpCd = null;
	/* Column Info */
	private String dmdtArInvIssFlg = null;
	/* Column Info */
	private String cpyInvKnt = null;
	/* Column Info */
	private String tmlInvIssFlg = null;
	/* Column Info */
	private String updUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public InvArStupOfcVO() {}

	public InvArStupOfcVO(String ibflag, String pagerows, String arOfcCd, String invIssTpCd, String invSndTpCd, String dmdtArInvIssFlg, String n3ptyBilArInvFlg, String dmdtInvAplyBlFlg, String cpyInvKnt, String xchRtRvsFlg, String xchRtUsdTpCd, String xchRtN3rdTpCd, String tmlInvIssFlg, String otsSmryCd, String deltFlg, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.invSndTpCd = invSndTpCd;
		this.dmdtInvAplyBlFlg = dmdtInvAplyBlFlg;
		this.xchRtRvsFlg = xchRtRvsFlg;
		this.deltFlg = deltFlg;
		this.otsSmryCd = otsSmryCd;
		this.xchRtN3rdTpCd = xchRtN3rdTpCd;
		this.creDt = creDt;
		this.n3ptyBilArInvFlg = n3ptyBilArInvFlg;
		this.arOfcCd = arOfcCd;
		this.pagerows = pagerows;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.invIssTpCd = invIssTpCd;
		this.xchRtUsdTpCd = xchRtUsdTpCd;
		this.dmdtArInvIssFlg = dmdtArInvIssFlg;
		this.cpyInvKnt = cpyInvKnt;
		this.tmlInvIssFlg = tmlInvIssFlg;
		this.updUsrId = updUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("inv_snd_tp_cd", getInvSndTpCd());
		this.hashColumns.put("dmdt_inv_aply_bl_flg", getDmdtInvAplyBlFlg());
		this.hashColumns.put("xch_rt_rvs_flg", getXchRtRvsFlg());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("ots_smry_cd", getOtsSmryCd());
		this.hashColumns.put("xch_rt_n3rd_tp_cd", getXchRtN3rdTpCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("n3pty_bil_ar_inv_flg", getN3ptyBilArInvFlg());
		this.hashColumns.put("ar_ofc_cd", getArOfcCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("inv_iss_tp_cd", getInvIssTpCd());
		this.hashColumns.put("xch_rt_usd_tp_cd", getXchRtUsdTpCd());
		this.hashColumns.put("dmdt_ar_inv_iss_flg", getDmdtArInvIssFlg());
		this.hashColumns.put("cpy_inv_knt", getCpyInvKnt());
		this.hashColumns.put("tml_inv_iss_flg", getTmlInvIssFlg());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("inv_snd_tp_cd", "invSndTpCd");
		this.hashFields.put("dmdt_inv_aply_bl_flg", "dmdtInvAplyBlFlg");
		this.hashFields.put("xch_rt_rvs_flg", "xchRtRvsFlg");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("ots_smry_cd", "otsSmryCd");
		this.hashFields.put("xch_rt_n3rd_tp_cd", "xchRtN3rdTpCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("n3pty_bil_ar_inv_flg", "n3ptyBilArInvFlg");
		this.hashFields.put("ar_ofc_cd", "arOfcCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("inv_iss_tp_cd", "invIssTpCd");
		this.hashFields.put("xch_rt_usd_tp_cd", "xchRtUsdTpCd");
		this.hashFields.put("dmdt_ar_inv_iss_flg", "dmdtArInvIssFlg");
		this.hashFields.put("cpy_inv_knt", "cpyInvKnt");
		this.hashFields.put("tml_inv_iss_flg", "tmlInvIssFlg");
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
	 * @return invSndTpCd
	 */
	public String getInvSndTpCd() {
		return this.invSndTpCd;
	}
	
	/**
	 * Column Info
	 * @return dmdtInvAplyBlFlg
	 */
	public String getDmdtInvAplyBlFlg() {
		return this.dmdtInvAplyBlFlg;
	}
	
	/**
	 * Column Info
	 * @return xchRtRvsFlg
	 */
	public String getXchRtRvsFlg() {
		return this.xchRtRvsFlg;
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
	 * @return otsSmryCd
	 */
	public String getOtsSmryCd() {
		return this.otsSmryCd;
	}
	
	/**
	 * Column Info
	 * @return xchRtN3rdTpCd
	 */
	public String getXchRtN3rdTpCd() {
		return this.xchRtN3rdTpCd;
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
	 * @return n3ptyBilArInvFlg
	 */
	public String getN3ptyBilArInvFlg() {
		return this.n3ptyBilArInvFlg;
	}
	
	/**
	 * Column Info
	 * @return arOfcCd
	 */
	public String getArOfcCd() {
		return this.arOfcCd;
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
	 * @return creUsrId
	 */
	public String getCreUsrId() {
		return this.creUsrId;
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
	 * @return invIssTpCd
	 */
	public String getInvIssTpCd() {
		return this.invIssTpCd;
	}
	
	/**
	 * Column Info
	 * @return xchRtUsdTpCd
	 */
	public String getXchRtUsdTpCd() {
		return this.xchRtUsdTpCd;
	}
	
	/**
	 * Column Info
	 * @return dmdtArInvIssFlg
	 */
	public String getDmdtArInvIssFlg() {
		return this.dmdtArInvIssFlg;
	}
	
	/**
	 * Column Info
	 * @return cpyInvKnt
	 */
	public String getCpyInvKnt() {
		return this.cpyInvKnt;
	}
	
	/**
	 * Column Info
	 * @return tmlInvIssFlg
	 */
	public String getTmlInvIssFlg() {
		return this.tmlInvIssFlg;
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
	 * @param invSndTpCd
	 */
	public void setInvSndTpCd(String invSndTpCd) {
		this.invSndTpCd = invSndTpCd;
	}
	
	/**
	 * Column Info
	 * @param dmdtInvAplyBlFlg
	 */
	public void setDmdtInvAplyBlFlg(String dmdtInvAplyBlFlg) {
		this.dmdtInvAplyBlFlg = dmdtInvAplyBlFlg;
	}
	
	/**
	 * Column Info
	 * @param xchRtRvsFlg
	 */
	public void setXchRtRvsFlg(String xchRtRvsFlg) {
		this.xchRtRvsFlg = xchRtRvsFlg;
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
	 * @param otsSmryCd
	 */
	public void setOtsSmryCd(String otsSmryCd) {
		this.otsSmryCd = otsSmryCd;
	}
	
	/**
	 * Column Info
	 * @param xchRtN3rdTpCd
	 */
	public void setXchRtN3rdTpCd(String xchRtN3rdTpCd) {
		this.xchRtN3rdTpCd = xchRtN3rdTpCd;
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
	 * @param n3ptyBilArInvFlg
	 */
	public void setN3ptyBilArInvFlg(String n3ptyBilArInvFlg) {
		this.n3ptyBilArInvFlg = n3ptyBilArInvFlg;
	}
	
	/**
	 * Column Info
	 * @param arOfcCd
	 */
	public void setArOfcCd(String arOfcCd) {
		this.arOfcCd = arOfcCd;
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
	 * @param creUsrId
	 */
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
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
	 * @param invIssTpCd
	 */
	public void setInvIssTpCd(String invIssTpCd) {
		this.invIssTpCd = invIssTpCd;
	}
	
	/**
	 * Column Info
	 * @param xchRtUsdTpCd
	 */
	public void setXchRtUsdTpCd(String xchRtUsdTpCd) {
		this.xchRtUsdTpCd = xchRtUsdTpCd;
	}
	
	/**
	 * Column Info
	 * @param dmdtArInvIssFlg
	 */
	public void setDmdtArInvIssFlg(String dmdtArInvIssFlg) {
		this.dmdtArInvIssFlg = dmdtArInvIssFlg;
	}
	
	/**
	 * Column Info
	 * @param cpyInvKnt
	 */
	public void setCpyInvKnt(String cpyInvKnt) {
		this.cpyInvKnt = cpyInvKnt;
	}
	
	/**
	 * Column Info
	 * @param tmlInvIssFlg
	 */
	public void setTmlInvIssFlg(String tmlInvIssFlg) {
		this.tmlInvIssFlg = tmlInvIssFlg;
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
		setInvSndTpCd(JSPUtil.getParameter(request, "inv_snd_tp_cd", ""));
		setDmdtInvAplyBlFlg(JSPUtil.getParameter(request, "dmdt_inv_aply_bl_flg", ""));
		setXchRtRvsFlg(JSPUtil.getParameter(request, "xch_rt_rvs_flg", ""));
		setDeltFlg(JSPUtil.getParameter(request, "delt_flg", ""));
		setOtsSmryCd(JSPUtil.getParameter(request, "ots_smry_cd", ""));
		setXchRtN3rdTpCd(JSPUtil.getParameter(request, "xch_rt_n3rd_tp_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setN3ptyBilArInvFlg(JSPUtil.getParameter(request, "n3pty_bil_ar_inv_flg", ""));
		setArOfcCd(JSPUtil.getParameter(request, "ar_ofc_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setInvIssTpCd(JSPUtil.getParameter(request, "inv_iss_tp_cd", ""));
		setXchRtUsdTpCd(JSPUtil.getParameter(request, "xch_rt_usd_tp_cd", ""));
		setDmdtArInvIssFlg(JSPUtil.getParameter(request, "dmdt_ar_inv_iss_flg", ""));
		setCpyInvKnt(JSPUtil.getParameter(request, "cpy_inv_knt", ""));
		setTmlInvIssFlg(JSPUtil.getParameter(request, "tml_inv_iss_flg", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return InvArStupOfcVO[]
	 */
	public InvArStupOfcVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return InvArStupOfcVO[]
	 */
	public InvArStupOfcVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		InvArStupOfcVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] invSndTpCd = (JSPUtil.getParameter(request, prefix	+ "inv_snd_tp_cd", length));
			String[] dmdtInvAplyBlFlg = (JSPUtil.getParameter(request, prefix	+ "dmdt_inv_aply_bl_flg", length));
			String[] xchRtRvsFlg = (JSPUtil.getParameter(request, prefix	+ "xch_rt_rvs_flg", length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg", length));
			String[] otsSmryCd = (JSPUtil.getParameter(request, prefix	+ "ots_smry_cd", length));
			String[] xchRtN3rdTpCd = (JSPUtil.getParameter(request, prefix	+ "xch_rt_n3rd_tp_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] n3ptyBilArInvFlg = (JSPUtil.getParameter(request, prefix	+ "n3pty_bil_ar_inv_flg", length));
			String[] arOfcCd = (JSPUtil.getParameter(request, prefix	+ "ar_ofc_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] invIssTpCd = (JSPUtil.getParameter(request, prefix	+ "inv_iss_tp_cd", length));
			String[] xchRtUsdTpCd = (JSPUtil.getParameter(request, prefix	+ "xch_rt_usd_tp_cd", length));
			String[] dmdtArInvIssFlg = (JSPUtil.getParameter(request, prefix	+ "dmdt_ar_inv_iss_flg", length));
			String[] cpyInvKnt = (JSPUtil.getParameter(request, prefix	+ "cpy_inv_knt", length));
			String[] tmlInvIssFlg = (JSPUtil.getParameter(request, prefix	+ "tml_inv_iss_flg", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			
			for (int i = 0; i < length; i++) {
				model = new InvArStupOfcVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (invSndTpCd[i] != null)
					model.setInvSndTpCd(invSndTpCd[i]);
				if (dmdtInvAplyBlFlg[i] != null)
					model.setDmdtInvAplyBlFlg(dmdtInvAplyBlFlg[i]);
				if (xchRtRvsFlg[i] != null)
					model.setXchRtRvsFlg(xchRtRvsFlg[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (otsSmryCd[i] != null)
					model.setOtsSmryCd(otsSmryCd[i]);
				if (xchRtN3rdTpCd[i] != null)
					model.setXchRtN3rdTpCd(xchRtN3rdTpCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (n3ptyBilArInvFlg[i] != null)
					model.setN3ptyBilArInvFlg(n3ptyBilArInvFlg[i]);
				if (arOfcCd[i] != null)
					model.setArOfcCd(arOfcCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (invIssTpCd[i] != null)
					model.setInvIssTpCd(invIssTpCd[i]);
				if (xchRtUsdTpCd[i] != null)
					model.setXchRtUsdTpCd(xchRtUsdTpCd[i]);
				if (dmdtArInvIssFlg[i] != null)
					model.setDmdtArInvIssFlg(dmdtArInvIssFlg[i]);
				if (cpyInvKnt[i] != null)
					model.setCpyInvKnt(cpyInvKnt[i]);
				if (tmlInvIssFlg[i] != null)
					model.setTmlInvIssFlg(tmlInvIssFlg[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getInvArStupOfcVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return InvArStupOfcVO[]
	 */
	public InvArStupOfcVO[] getInvArStupOfcVOs(){
		InvArStupOfcVO[] vos = (InvArStupOfcVO[])models.toArray(new InvArStupOfcVO[models.size()]);
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
		this.invSndTpCd = this.invSndTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dmdtInvAplyBlFlg = this.dmdtInvAplyBlFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.xchRtRvsFlg = this.xchRtRvsFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.otsSmryCd = this.otsSmryCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.xchRtN3rdTpCd = this.xchRtN3rdTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3ptyBilArInvFlg = this.n3ptyBilArInvFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.arOfcCd = this.arOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invIssTpCd = this.invIssTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.xchRtUsdTpCd = this.xchRtUsdTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dmdtArInvIssFlg = this.dmdtArInvIssFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cpyInvKnt = this.cpyInvKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlInvIssFlg = this.tmlInvIssFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
