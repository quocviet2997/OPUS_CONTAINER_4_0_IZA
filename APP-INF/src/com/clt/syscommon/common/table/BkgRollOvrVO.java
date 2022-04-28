/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BkgRollOvrVO.java
*@FileTitle : BkgRollOvrVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.06.25
*@LastModifier : 김병규
*@LastVersion : 1.0
* 2009.06.25 김병규 
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
 * @author 김병규
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class BkgRollOvrVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgRollOvrVO> models = new ArrayList<BkgRollOvrVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String preEtdDt = null;
	/* Column Info */
	private String newVslCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String newSkdDirCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String bkgNo = null;
	/* Column Info */
	private String rollOvrSeq = null;
	/* Column Info */
	private String preSkdVoyNo = null;
	/* Column Info */
	private String preSkdDirCd = null;
	/* Column Info */
	private String rollOvrRsnCd = null;
	/* Column Info */
	private String diffRmk = null;
	/* Column Info */
	private String evntUsrId = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String newSkdVoyNo = null;
	/* Column Info */
	private String evntDt = null;
	/* Column Info */
	private String preVslCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgRollOvrVO() {}

	public BkgRollOvrVO(String ibflag, String pagerows, String bkgNo, String rollOvrSeq, String preVslCd, String preSkdVoyNo, String preSkdDirCd, String preEtdDt, String newVslCd, String newSkdVoyNo, String newSkdDirCd, String rollOvrRsnCd, String diffRmk, String evntUsrId, String evntDt, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.preEtdDt = preEtdDt;
		this.newVslCd = newVslCd;
		this.creDt = creDt;
		this.newSkdDirCd = newSkdDirCd;
		this.pagerows = pagerows;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.bkgNo = bkgNo;
		this.rollOvrSeq = rollOvrSeq;
		this.preSkdVoyNo = preSkdVoyNo;
		this.preSkdDirCd = preSkdDirCd;
		this.rollOvrRsnCd = rollOvrRsnCd;
		this.diffRmk = diffRmk;
		this.evntUsrId = evntUsrId;
		this.updUsrId = updUsrId;
		this.newSkdVoyNo = newSkdVoyNo;
		this.evntDt = evntDt;
		this.preVslCd = preVslCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("pre_etd_dt", getPreEtdDt());
		this.hashColumns.put("new_vsl_cd", getNewVslCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("new_skd_dir_cd", getNewSkdDirCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("bkg_no", getBkgNo());
		this.hashColumns.put("roll_ovr_seq", getRollOvrSeq());
		this.hashColumns.put("pre_skd_voy_no", getPreSkdVoyNo());
		this.hashColumns.put("pre_skd_dir_cd", getPreSkdDirCd());
		this.hashColumns.put("roll_ovr_rsn_cd", getRollOvrRsnCd());
		this.hashColumns.put("diff_rmk", getDiffRmk());
		this.hashColumns.put("evnt_usr_id", getEvntUsrId());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("new_skd_voy_no", getNewSkdVoyNo());
		this.hashColumns.put("evnt_dt", getEvntDt());
		this.hashColumns.put("pre_vsl_cd", getPreVslCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("pre_etd_dt", "preEtdDt");
		this.hashFields.put("new_vsl_cd", "newVslCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("new_skd_dir_cd", "newSkdDirCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("roll_ovr_seq", "rollOvrSeq");
		this.hashFields.put("pre_skd_voy_no", "preSkdVoyNo");
		this.hashFields.put("pre_skd_dir_cd", "preSkdDirCd");
		this.hashFields.put("roll_ovr_rsn_cd", "rollOvrRsnCd");
		this.hashFields.put("diff_rmk", "diffRmk");
		this.hashFields.put("evnt_usr_id", "evntUsrId");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("new_skd_voy_no", "newSkdVoyNo");
		this.hashFields.put("evnt_dt", "evntDt");
		this.hashFields.put("pre_vsl_cd", "preVslCd");
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
	 * @return preEtdDt
	 */
	public String getPreEtdDt() {
		return this.preEtdDt;
	}
	
	/**
	 * Column Info
	 * @return newVslCd
	 */
	public String getNewVslCd() {
		return this.newVslCd;
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
	 * @return newSkdDirCd
	 */
	public String getNewSkdDirCd() {
		return this.newSkdDirCd;
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
	 * @return bkgNo
	 */
	public String getBkgNo() {
		return this.bkgNo;
	}
	
	/**
	 * Column Info
	 * @return rollOvrSeq
	 */
	public String getRollOvrSeq() {
		return this.rollOvrSeq;
	}
	
	/**
	 * Column Info
	 * @return preSkdVoyNo
	 */
	public String getPreSkdVoyNo() {
		return this.preSkdVoyNo;
	}
	
	/**
	 * Column Info
	 * @return preSkdDirCd
	 */
	public String getPreSkdDirCd() {
		return this.preSkdDirCd;
	}
	
	/**
	 * Column Info
	 * @return rollOvrRsnCd
	 */
	public String getRollOvrRsnCd() {
		return this.rollOvrRsnCd;
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
	 * @return evntUsrId
	 */
	public String getEvntUsrId() {
		return this.evntUsrId;
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
	 * @return newSkdVoyNo
	 */
	public String getNewSkdVoyNo() {
		return this.newSkdVoyNo;
	}
	
	/**
	 * Column Info
	 * @return evntDt
	 */
	public String getEvntDt() {
		return this.evntDt;
	}
	
	/**
	 * Column Info
	 * @return preVslCd
	 */
	public String getPreVslCd() {
		return this.preVslCd;
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
	 * @param preEtdDt
	 */
	public void setPreEtdDt(String preEtdDt) {
		this.preEtdDt = preEtdDt;
	}
	
	/**
	 * Column Info
	 * @param newVslCd
	 */
	public void setNewVslCd(String newVslCd) {
		this.newVslCd = newVslCd;
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
	 * @param newSkdDirCd
	 */
	public void setNewSkdDirCd(String newSkdDirCd) {
		this.newSkdDirCd = newSkdDirCd;
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
	 * @param bkgNo
	 */
	public void setBkgNo(String bkgNo) {
		this.bkgNo = bkgNo;
	}
	
	/**
	 * Column Info
	 * @param rollOvrSeq
	 */
	public void setRollOvrSeq(String rollOvrSeq) {
		this.rollOvrSeq = rollOvrSeq;
	}
	
	/**
	 * Column Info
	 * @param preSkdVoyNo
	 */
	public void setPreSkdVoyNo(String preSkdVoyNo) {
		this.preSkdVoyNo = preSkdVoyNo;
	}
	
	/**
	 * Column Info
	 * @param preSkdDirCd
	 */
	public void setPreSkdDirCd(String preSkdDirCd) {
		this.preSkdDirCd = preSkdDirCd;
	}
	
	/**
	 * Column Info
	 * @param rollOvrRsnCd
	 */
	public void setRollOvrRsnCd(String rollOvrRsnCd) {
		this.rollOvrRsnCd = rollOvrRsnCd;
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
	 * @param evntUsrId
	 */
	public void setEvntUsrId(String evntUsrId) {
		this.evntUsrId = evntUsrId;
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
	 * @param newSkdVoyNo
	 */
	public void setNewSkdVoyNo(String newSkdVoyNo) {
		this.newSkdVoyNo = newSkdVoyNo;
	}
	
	/**
	 * Column Info
	 * @param evntDt
	 */
	public void setEvntDt(String evntDt) {
		this.evntDt = evntDt;
	}
	
	/**
	 * Column Info
	 * @param preVslCd
	 */
	public void setPreVslCd(String preVslCd) {
		this.preVslCd = preVslCd;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setPreEtdDt(JSPUtil.getParameter(request, "pre_etd_dt", ""));
		setNewVslCd(JSPUtil.getParameter(request, "new_vsl_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setNewSkdDirCd(JSPUtil.getParameter(request, "new_skd_dir_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setBkgNo(JSPUtil.getParameter(request, "bkg_no", ""));
		setRollOvrSeq(JSPUtil.getParameter(request, "roll_ovr_seq", ""));
		setPreSkdVoyNo(JSPUtil.getParameter(request, "pre_skd_voy_no", ""));
		setPreSkdDirCd(JSPUtil.getParameter(request, "pre_skd_dir_cd", ""));
		setRollOvrRsnCd(JSPUtil.getParameter(request, "roll_ovr_rsn_cd", ""));
		setDiffRmk(JSPUtil.getParameter(request, "diff_rmk", ""));
		setEvntUsrId(JSPUtil.getParameter(request, "evnt_usr_id", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setNewSkdVoyNo(JSPUtil.getParameter(request, "new_skd_voy_no", ""));
		setEvntDt(JSPUtil.getParameter(request, "evnt_dt", ""));
		setPreVslCd(JSPUtil.getParameter(request, "pre_vsl_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BkgRollOvrVO[]
	 */
	public BkgRollOvrVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgRollOvrVO[]
	 */
	public BkgRollOvrVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgRollOvrVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] preEtdDt = (JSPUtil.getParameter(request, prefix	+ "pre_etd_dt", length));
			String[] newVslCd = (JSPUtil.getParameter(request, prefix	+ "new_vsl_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] newSkdDirCd = (JSPUtil.getParameter(request, prefix	+ "new_skd_dir_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no", length));
			String[] rollOvrSeq = (JSPUtil.getParameter(request, prefix	+ "roll_ovr_seq", length));
			String[] preSkdVoyNo = (JSPUtil.getParameter(request, prefix	+ "pre_skd_voy_no", length));
			String[] preSkdDirCd = (JSPUtil.getParameter(request, prefix	+ "pre_skd_dir_cd", length));
			String[] rollOvrRsnCd = (JSPUtil.getParameter(request, prefix	+ "roll_ovr_rsn_cd", length));
			String[] diffRmk = (JSPUtil.getParameter(request, prefix	+ "diff_rmk", length));
			String[] evntUsrId = (JSPUtil.getParameter(request, prefix	+ "evnt_usr_id", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] newSkdVoyNo = (JSPUtil.getParameter(request, prefix	+ "new_skd_voy_no", length));
			String[] evntDt = (JSPUtil.getParameter(request, prefix	+ "evnt_dt", length));
			String[] preVslCd = (JSPUtil.getParameter(request, prefix	+ "pre_vsl_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgRollOvrVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (preEtdDt[i] != null)
					model.setPreEtdDt(preEtdDt[i]);
				if (newVslCd[i] != null)
					model.setNewVslCd(newVslCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (newSkdDirCd[i] != null)
					model.setNewSkdDirCd(newSkdDirCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (rollOvrSeq[i] != null)
					model.setRollOvrSeq(rollOvrSeq[i]);
				if (preSkdVoyNo[i] != null)
					model.setPreSkdVoyNo(preSkdVoyNo[i]);
				if (preSkdDirCd[i] != null)
					model.setPreSkdDirCd(preSkdDirCd[i]);
				if (rollOvrRsnCd[i] != null)
					model.setRollOvrRsnCd(rollOvrRsnCd[i]);
				if (diffRmk[i] != null)
					model.setDiffRmk(diffRmk[i]);
				if (evntUsrId[i] != null)
					model.setEvntUsrId(evntUsrId[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (newSkdVoyNo[i] != null)
					model.setNewSkdVoyNo(newSkdVoyNo[i]);
				if (evntDt[i] != null)
					model.setEvntDt(evntDt[i]);
				if (preVslCd[i] != null)
					model.setPreVslCd(preVslCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgRollOvrVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BkgRollOvrVO[]
	 */
	public BkgRollOvrVO[] getBkgRollOvrVOs(){
		BkgRollOvrVO[] vos = (BkgRollOvrVO[])models.toArray(new BkgRollOvrVO[models.size()]);
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
		this.preEtdDt = this.preEtdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.newVslCd = this.newVslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.newSkdDirCd = this.newSkdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNo = this.bkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rollOvrSeq = this.rollOvrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.preSkdVoyNo = this.preSkdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.preSkdDirCd = this.preSkdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rollOvrRsnCd = this.rollOvrRsnCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.diffRmk = this.diffRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.evntUsrId = this.evntUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.newSkdVoyNo = this.newSkdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.evntDt = this.evntDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.preVslCd = this.preVslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
