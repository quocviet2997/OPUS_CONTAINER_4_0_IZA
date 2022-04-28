/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : MstLseTermVO.java
*@FileTitle : MstLseTermVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.29
*@LastModifier : 김석준
*@LastVersion : 1.0
* 2009.05.29 김석준 
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
 * @author 김석준
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class MstLseTermVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<MstLseTermVO> models = new ArrayList<MstLseTermVO>();
	
	/* Column Info */
	private String dpSeq = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String purPrc = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String lsePrdCtnt = null;
	/* Page Number */
	private String pagerows = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String lstmNm = null;
	/* Column Info */
	private String diffRmk = null;
	/* Column Info */
	private String purOptFlg = null;
	/* Column Info */
	private String lstmCd = null;
	/* Column Info */
	private String updUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public MstLseTermVO() {}

	public MstLseTermVO(String ibflag, String pagerows, String lstmCd, String lstmNm, String lsePrdCtnt, String purOptFlg, String purPrc, String dpSeq, String diffRmk, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.dpSeq = dpSeq;
		this.updDt = updDt;
		this.purPrc = purPrc;
		this.creDt = creDt;
		this.lsePrdCtnt = lsePrdCtnt;
		this.pagerows = pagerows;
		this.ibflag = ibflag;
		this.creUsrId = creUsrId;
		this.lstmNm = lstmNm;
		this.diffRmk = diffRmk;
		this.purOptFlg = purOptFlg;
		this.lstmCd = lstmCd;
		this.updUsrId = updUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("dp_seq", getDpSeq());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("pur_prc", getPurPrc());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("lse_prd_ctnt", getLsePrdCtnt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("lstm_nm", getLstmNm());
		this.hashColumns.put("diff_rmk", getDiffRmk());
		this.hashColumns.put("pur_opt_flg", getPurOptFlg());
		this.hashColumns.put("lstm_cd", getLstmCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("dp_seq", "dpSeq");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("pur_prc", "purPrc");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("lse_prd_ctnt", "lsePrdCtnt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("lstm_nm", "lstmNm");
		this.hashFields.put("diff_rmk", "diffRmk");
		this.hashFields.put("pur_opt_flg", "purOptFlg");
		this.hashFields.put("lstm_cd", "lstmCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return dpSeq
	 */
	public String getDpSeq() {
		return this.dpSeq;
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
	 * @return purPrc
	 */
	public String getPurPrc() {
		return this.purPrc;
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
	 * @return lsePrdCtnt
	 */
	public String getLsePrdCtnt() {
		return this.lsePrdCtnt;
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
	 * @return lstmNm
	 */
	public String getLstmNm() {
		return this.lstmNm;
	}
	
	/**
	 * Column Info
	 * @return diffRmk
	 */
	public String getDiffRmk() {
		return this.diffRmk;
	}
	
	/**
	 * Column Info
	 * @return purOptFlg
	 */
	public String getPurOptFlg() {
		return this.purOptFlg;
	}
	
	/**
	 * Column Info
	 * @return lstmCd
	 */
	public String getLstmCd() {
		return this.lstmCd;
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
	 * @param dpSeq
	 */
	public void setDpSeq(String dpSeq) {
		this.dpSeq = dpSeq;
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
	 * @param purPrc
	 */
	public void setPurPrc(String purPrc) {
		this.purPrc = purPrc;
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
	 * @param lsePrdCtnt
	 */
	public void setLsePrdCtnt(String lsePrdCtnt) {
		this.lsePrdCtnt = lsePrdCtnt;
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
	 * @param lstmNm
	 */
	public void setLstmNm(String lstmNm) {
		this.lstmNm = lstmNm;
	}
	
	/**
	 * Column Info
	 * @param diffRmk
	 */
	public void setDiffRmk(String diffRmk) {
		this.diffRmk = diffRmk;
	}
	
	/**
	 * Column Info
	 * @param purOptFlg
	 */
	public void setPurOptFlg(String purOptFlg) {
		this.purOptFlg = purOptFlg;
	}
	
	/**
	 * Column Info
	 * @param lstmCd
	 */
	public void setLstmCd(String lstmCd) {
		this.lstmCd = lstmCd;
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
		setDpSeq(JSPUtil.getParameter(request, "dp_seq", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setPurPrc(JSPUtil.getParameter(request, "pur_prc", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setLsePrdCtnt(JSPUtil.getParameter(request, "lse_prd_ctnt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setLstmNm(JSPUtil.getParameter(request, "lstm_nm", ""));
		setDiffRmk(JSPUtil.getParameter(request, "diff_rmk", ""));
		setPurOptFlg(JSPUtil.getParameter(request, "pur_opt_flg", ""));
		setLstmCd(JSPUtil.getParameter(request, "lstm_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return MstLseTermVO[]
	 */
	public MstLseTermVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return MstLseTermVO[]
	 */
	public MstLseTermVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		MstLseTermVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] dpSeq = (JSPUtil.getParameter(request, prefix	+ "dp_seq".trim(), length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] purPrc = (JSPUtil.getParameter(request, prefix	+ "pur_prc".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] lsePrdCtnt = (JSPUtil.getParameter(request, prefix	+ "lse_prd_ctnt".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] lstmNm = (JSPUtil.getParameter(request, prefix	+ "lstm_nm".trim(), length));
			String[] diffRmk = (JSPUtil.getParameter(request, prefix	+ "diff_rmk".trim(), length));
			String[] purOptFlg = (JSPUtil.getParameter(request, prefix	+ "pur_opt_flg".trim(), length));
			String[] lstmCd = (JSPUtil.getParameter(request, prefix	+ "lstm_cd".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new MstLseTermVO();
				if (dpSeq[i] != null)
					model.setDpSeq(dpSeq[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (purPrc[i] != null)
					model.setPurPrc(purPrc[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (lsePrdCtnt[i] != null)
					model.setLsePrdCtnt(lsePrdCtnt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (lstmNm[i] != null)
					model.setLstmNm(lstmNm[i]);
				if (diffRmk[i] != null)
					model.setDiffRmk(diffRmk[i]);
				if (purOptFlg[i] != null)
					model.setPurOptFlg(purOptFlg[i]);
				if (lstmCd[i] != null)
					model.setLstmCd(lstmCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getMstLseTermVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return MstLseTermVO[]
	 */
	public MstLseTermVO[] getMstLseTermVOs(){
		MstLseTermVO[] vos = (MstLseTermVO[])models.toArray(new MstLseTermVO[models.size()]);
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
		this.dpSeq = this.dpSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.purPrc = this.purPrc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lsePrdCtnt = this.lsePrdCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lstmNm = this.lstmNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.diffRmk = this.diffRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.purOptFlg = this.purOptFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lstmCd = this.lstmCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
