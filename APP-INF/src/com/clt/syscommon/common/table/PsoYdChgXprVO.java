/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : PsoYdChgXprVO.java
*@FileTitle : PsoYdChgXprVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.06.18
*@LastModifier : 박명종
*@LastVersion : 1.0
* 2009.06.18 박명종 
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
 * @author 박명종
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class PsoYdChgXprVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<PsoYdChgXprVO> models = new ArrayList<PsoYdChgXprVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String psoChgTpCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String ydChgVerSeq = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String chgXprNo = null;
	/* Column Info */
	private String ydChgXprNo = null;
	/* Column Info */
	private String ydChgNo = null;
	/* Column Info */
	private String xterPgmFlg = null;
	/* Column Info */
	private String updUsrId = null;
	/* Page Number */
	private String pagerows = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public PsoYdChgXprVO() {}

	public PsoYdChgXprVO(String ibflag, String pagerows, String ydChgXprNo, String psoChgTpCd, String xterPgmFlg, String ydChgNo, String ydChgVerSeq, String chgXprNo, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.creUsrId = creUsrId;
		this.psoChgTpCd = psoChgTpCd;
		this.ibflag = ibflag;
		this.ydChgVerSeq = ydChgVerSeq;
		this.creDt = creDt;
		this.chgXprNo = chgXprNo;
		this.ydChgXprNo = ydChgXprNo;
		this.ydChgNo = ydChgNo;
		this.xterPgmFlg = xterPgmFlg;
		this.updUsrId = updUsrId;
		this.pagerows = pagerows;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("pso_chg_tp_cd", getPsoChgTpCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("yd_chg_ver_seq", getYdChgVerSeq());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("chg_xpr_no", getChgXprNo());
		this.hashColumns.put("yd_chg_xpr_no", getYdChgXprNo());
		this.hashColumns.put("yd_chg_no", getYdChgNo());
		this.hashColumns.put("xter_pgm_flg", getXterPgmFlg());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("pagerows", getPagerows());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("pso_chg_tp_cd", "psoChgTpCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("yd_chg_ver_seq", "ydChgVerSeq");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("chg_xpr_no", "chgXprNo");
		this.hashFields.put("yd_chg_xpr_no", "ydChgXprNo");
		this.hashFields.put("yd_chg_no", "ydChgNo");
		this.hashFields.put("xter_pgm_flg", "xterPgmFlg");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("pagerows", "pagerows");
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
	 * @return psoChgTpCd
	 */
	public String getPsoChgTpCd() {
		return this.psoChgTpCd;
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
	 * @return ydChgVerSeq
	 */
	public String getYdChgVerSeq() {
		return this.ydChgVerSeq;
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
	 * @return chgXprNo
	 */
	public String getChgXprNo() {
		return this.chgXprNo;
	}
	
	/**
	 * Column Info
	 * @return ydChgXprNo
	 */
	public String getYdChgXprNo() {
		return this.ydChgXprNo;
	}
	
	/**
	 * Column Info
	 * @return ydChgNo
	 */
	public String getYdChgNo() {
		return this.ydChgNo;
	}
	
	/**
	 * Column Info
	 * @return xterPgmFlg
	 */
	public String getXterPgmFlg() {
		return this.xterPgmFlg;
	}
	
	/**
	 * Column Info
	 * @return updUsrId
	 */
	public String getUpdUsrId() {
		return this.updUsrId;
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
	 * @param psoChgTpCd
	 */
	public void setPsoChgTpCd(String psoChgTpCd) {
		this.psoChgTpCd = psoChgTpCd;
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
	 * @param ydChgVerSeq
	 */
	public void setYdChgVerSeq(String ydChgVerSeq) {
		this.ydChgVerSeq = ydChgVerSeq;
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
	 * @param chgXprNo
	 */
	public void setChgXprNo(String chgXprNo) {
		this.chgXprNo = chgXprNo;
	}
	
	/**
	 * Column Info
	 * @param ydChgXprNo
	 */
	public void setYdChgXprNo(String ydChgXprNo) {
		this.ydChgXprNo = ydChgXprNo;
	}
	
	/**
	 * Column Info
	 * @param ydChgNo
	 */
	public void setYdChgNo(String ydChgNo) {
		this.ydChgNo = ydChgNo;
	}
	
	/**
	 * Column Info
	 * @param xterPgmFlg
	 */
	public void setXterPgmFlg(String xterPgmFlg) {
		this.xterPgmFlg = xterPgmFlg;
	}
	
	/**
	 * Column Info
	 * @param updUsrId
	 */
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
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
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setPsoChgTpCd(JSPUtil.getParameter(request, "pso_chg_tp_cd", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setYdChgVerSeq(JSPUtil.getParameter(request, "yd_chg_ver_seq", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setChgXprNo(JSPUtil.getParameter(request, "chg_xpr_no", ""));
		setYdChgXprNo(JSPUtil.getParameter(request, "yd_chg_xpr_no", ""));
		setYdChgNo(JSPUtil.getParameter(request, "yd_chg_no", ""));
		setXterPgmFlg(JSPUtil.getParameter(request, "xter_pgm_flg", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return PsoYdChgXprVO[]
	 */
	public PsoYdChgXprVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return PsoYdChgXprVO[]
	 */
	public PsoYdChgXprVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		PsoYdChgXprVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] psoChgTpCd = (JSPUtil.getParameter(request, prefix	+ "pso_chg_tp_cd".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] ydChgVerSeq = (JSPUtil.getParameter(request, prefix	+ "yd_chg_ver_seq".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] chgXprNo = (JSPUtil.getParameter(request, prefix	+ "chg_xpr_no".trim(), length));
			String[] ydChgXprNo = (JSPUtil.getParameter(request, prefix	+ "yd_chg_xpr_no".trim(), length));
			String[] ydChgNo = (JSPUtil.getParameter(request, prefix	+ "yd_chg_no".trim(), length));
			String[] xterPgmFlg = (JSPUtil.getParameter(request, prefix	+ "xter_pgm_flg".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new PsoYdChgXprVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (psoChgTpCd[i] != null)
					model.setPsoChgTpCd(psoChgTpCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (ydChgVerSeq[i] != null)
					model.setYdChgVerSeq(ydChgVerSeq[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (chgXprNo[i] != null)
					model.setChgXprNo(chgXprNo[i]);
				if (ydChgXprNo[i] != null)
					model.setYdChgXprNo(ydChgXprNo[i]);
				if (ydChgNo[i] != null)
					model.setYdChgNo(ydChgNo[i]);
				if (xterPgmFlg[i] != null)
					model.setXterPgmFlg(xterPgmFlg[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getPsoYdChgXprVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return PsoYdChgXprVO[]
	 */
	public PsoYdChgXprVO[] getPsoYdChgXprVOs(){
		PsoYdChgXprVO[] vos = (PsoYdChgXprVO[])models.toArray(new PsoYdChgXprVO[models.size()]);
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
		this.psoChgTpCd = this.psoChgTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ydChgVerSeq = this.ydChgVerSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chgXprNo = this.chgXprNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ydChgXprNo = this.ydChgXprNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ydChgNo = this.ydChgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.xterPgmFlg = this.xterPgmFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
