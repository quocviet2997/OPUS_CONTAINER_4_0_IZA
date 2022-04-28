/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : TdrAllocationVO.java
*@FileTitle : TdrAllocationVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.30
*@LastModifier : 
*@LastVersion : 1.0
* 2009.07.30  
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

public class TdrAllocationVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<TdrAllocationVO> models = new ArrayList<TdrAllocationVO>();
	
	/* Column Info */
	private String vslCd = null;
	/* Column Info */
	private String voyNo = null;
	/* Column Info */
	private String swapWgt = null;
	/* Column Info */
	private String updateTime = null;
	/* Column Info */
	private String ratioType = null;
	/* Column Info */
	private String releaseWgt = null;
	/* Column Info */
	private String bsaWgt = null;
	/* Column Info */
	private String swapSlot = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String releaseSlot = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String callInd = null;
	/* Column Info */
	private String oprCd = null;
	/* Column Info */
	private String bsaSlot = null;
	/* Column Info */
	private String dirCd = null;
	/* Column Info */
	private String portCd = null;
	/* Column Info */
	private String updateUser = null;
	/* Column Info */
	private String bsaType = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public TdrAllocationVO() {}

	public TdrAllocationVO(String ibflag, String pagerows, String vslCd, String voyNo, String dirCd, String portCd, String callInd, String oprCd, String bsaSlot, String bsaWgt, String releaseSlot, String releaseWgt, String swapSlot, String swapWgt, String bsaType, String ratioType, String updateUser, String updateTime) {
		this.vslCd = vslCd;
		this.voyNo = voyNo;
		this.swapWgt = swapWgt;
		this.updateTime = updateTime;
		this.ratioType = ratioType;
		this.releaseWgt = releaseWgt;
		this.bsaWgt = bsaWgt;
		this.swapSlot = swapSlot;
		this.pagerows = pagerows;
		this.releaseSlot = releaseSlot;
		this.ibflag = ibflag;
		this.callInd = callInd;
		this.oprCd = oprCd;
		this.bsaSlot = bsaSlot;
		this.dirCd = dirCd;
		this.portCd = portCd;
		this.updateUser = updateUser;
		this.bsaType = bsaType;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("voy_no", getVoyNo());
		this.hashColumns.put("swap_wgt", getSwapWgt());
		this.hashColumns.put("update_time", getUpdateTime());
		this.hashColumns.put("ratio_type", getRatioType());
		this.hashColumns.put("release_wgt", getReleaseWgt());
		this.hashColumns.put("bsa_wgt", getBsaWgt());
		this.hashColumns.put("swap_slot", getSwapSlot());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("release_slot", getReleaseSlot());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("call_ind", getCallInd());
		this.hashColumns.put("opr_cd", getOprCd());
		this.hashColumns.put("bsa_slot", getBsaSlot());
		this.hashColumns.put("dir_cd", getDirCd());
		this.hashColumns.put("port_cd", getPortCd());
		this.hashColumns.put("update_user", getUpdateUser());
		this.hashColumns.put("bsa_type", getBsaType());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("voy_no", "voyNo");
		this.hashFields.put("swap_wgt", "swapWgt");
		this.hashFields.put("update_time", "updateTime");
		this.hashFields.put("ratio_type", "ratioType");
		this.hashFields.put("release_wgt", "releaseWgt");
		this.hashFields.put("bsa_wgt", "bsaWgt");
		this.hashFields.put("swap_slot", "swapSlot");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("release_slot", "releaseSlot");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("call_ind", "callInd");
		this.hashFields.put("opr_cd", "oprCd");
		this.hashFields.put("bsa_slot", "bsaSlot");
		this.hashFields.put("dir_cd", "dirCd");
		this.hashFields.put("port_cd", "portCd");
		this.hashFields.put("update_user", "updateUser");
		this.hashFields.put("bsa_type", "bsaType");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return vslCd
	 */
	public String getVslCd() {
		return this.vslCd;
	}
	
	/**
	 * Column Info
	 * @return voyNo
	 */
	public String getVoyNo() {
		return this.voyNo;
	}
	
	/**
	 * Column Info
	 * @return swapWgt
	 */
	public String getSwapWgt() {
		return this.swapWgt;
	}
	
	/**
	 * Column Info
	 * @return updateTime
	 */
	public String getUpdateTime() {
		return this.updateTime;
	}
	
	/**
	 * Column Info
	 * @return ratioType
	 */
	public String getRatioType() {
		return this.ratioType;
	}
	
	/**
	 * Column Info
	 * @return releaseWgt
	 */
	public String getReleaseWgt() {
		return this.releaseWgt;
	}
	
	/**
	 * Column Info
	 * @return bsaWgt
	 */
	public String getBsaWgt() {
		return this.bsaWgt;
	}
	
	/**
	 * Column Info
	 * @return swapSlot
	 */
	public String getSwapSlot() {
		return this.swapSlot;
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
	 * @return releaseSlot
	 */
	public String getReleaseSlot() {
		return this.releaseSlot;
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
	 * @return callInd
	 */
	public String getCallInd() {
		return this.callInd;
	}
	
	/**
	 * Column Info
	 * @return oprCd
	 */
	public String getOprCd() {
		return this.oprCd;
	}
	
	/**
	 * Column Info
	 * @return bsaSlot
	 */
	public String getBsaSlot() {
		return this.bsaSlot;
	}
	
	/**
	 * Column Info
	 * @return dirCd
	 */
	public String getDirCd() {
		return this.dirCd;
	}
	
	/**
	 * Column Info
	 * @return portCd
	 */
	public String getPortCd() {
		return this.portCd;
	}
	
	/**
	 * Column Info
	 * @return updateUser
	 */
	public String getUpdateUser() {
		return this.updateUser;
	}
	
	/**
	 * Column Info
	 * @return bsaType
	 */
	public String getBsaType() {
		return this.bsaType;
	}
	

	/**
	 * Column Info
	 * @param vslCd
	 */
	public void setVslCd(String vslCd) {
		this.vslCd = vslCd;
	}
	
	/**
	 * Column Info
	 * @param voyNo
	 */
	public void setVoyNo(String voyNo) {
		this.voyNo = voyNo;
	}
	
	/**
	 * Column Info
	 * @param swapWgt
	 */
	public void setSwapWgt(String swapWgt) {
		this.swapWgt = swapWgt;
	}
	
	/**
	 * Column Info
	 * @param updateTime
	 */
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	
	/**
	 * Column Info
	 * @param ratioType
	 */
	public void setRatioType(String ratioType) {
		this.ratioType = ratioType;
	}
	
	/**
	 * Column Info
	 * @param releaseWgt
	 */
	public void setReleaseWgt(String releaseWgt) {
		this.releaseWgt = releaseWgt;
	}
	
	/**
	 * Column Info
	 * @param bsaWgt
	 */
	public void setBsaWgt(String bsaWgt) {
		this.bsaWgt = bsaWgt;
	}
	
	/**
	 * Column Info
	 * @param swapSlot
	 */
	public void setSwapSlot(String swapSlot) {
		this.swapSlot = swapSlot;
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
	 * @param releaseSlot
	 */
	public void setReleaseSlot(String releaseSlot) {
		this.releaseSlot = releaseSlot;
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
	 * @param callInd
	 */
	public void setCallInd(String callInd) {
		this.callInd = callInd;
	}
	
	/**
	 * Column Info
	 * @param oprCd
	 */
	public void setOprCd(String oprCd) {
		this.oprCd = oprCd;
	}
	
	/**
	 * Column Info
	 * @param bsaSlot
	 */
	public void setBsaSlot(String bsaSlot) {
		this.bsaSlot = bsaSlot;
	}
	
	/**
	 * Column Info
	 * @param dirCd
	 */
	public void setDirCd(String dirCd) {
		this.dirCd = dirCd;
	}
	
	/**
	 * Column Info
	 * @param portCd
	 */
	public void setPortCd(String portCd) {
		this.portCd = portCd;
	}
	
	/**
	 * Column Info
	 * @param updateUser
	 */
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	
	/**
	 * Column Info
	 * @param bsaType
	 */
	public void setBsaType(String bsaType) {
		this.bsaType = bsaType;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setVslCd(JSPUtil.getParameter(request, "vsl_cd", ""));
		setVoyNo(JSPUtil.getParameter(request, "voy_no", ""));
		setSwapWgt(JSPUtil.getParameter(request, "swap_wgt", ""));
		setUpdateTime(JSPUtil.getParameter(request, "update_time", ""));
		setRatioType(JSPUtil.getParameter(request, "ratio_type", ""));
		setReleaseWgt(JSPUtil.getParameter(request, "release_wgt", ""));
		setBsaWgt(JSPUtil.getParameter(request, "bsa_wgt", ""));
		setSwapSlot(JSPUtil.getParameter(request, "swap_slot", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setReleaseSlot(JSPUtil.getParameter(request, "release_slot", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCallInd(JSPUtil.getParameter(request, "call_ind", ""));
		setOprCd(JSPUtil.getParameter(request, "opr_cd", ""));
		setBsaSlot(JSPUtil.getParameter(request, "bsa_slot", ""));
		setDirCd(JSPUtil.getParameter(request, "dir_cd", ""));
		setPortCd(JSPUtil.getParameter(request, "port_cd", ""));
		setUpdateUser(JSPUtil.getParameter(request, "update_user", ""));
		setBsaType(JSPUtil.getParameter(request, "bsa_type", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return TdrAllocationVO[]
	 */
	public TdrAllocationVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return TdrAllocationVO[]
	 */
	public TdrAllocationVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		TdrAllocationVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd", length));
			String[] voyNo = (JSPUtil.getParameter(request, prefix	+ "voy_no", length));
			String[] swapWgt = (JSPUtil.getParameter(request, prefix	+ "swap_wgt", length));
			String[] updateTime = (JSPUtil.getParameter(request, prefix	+ "update_time", length));
			String[] ratioType = (JSPUtil.getParameter(request, prefix	+ "ratio_type", length));
			String[] releaseWgt = (JSPUtil.getParameter(request, prefix	+ "release_wgt", length));
			String[] bsaWgt = (JSPUtil.getParameter(request, prefix	+ "bsa_wgt", length));
			String[] swapSlot = (JSPUtil.getParameter(request, prefix	+ "swap_slot", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] releaseSlot = (JSPUtil.getParameter(request, prefix	+ "release_slot", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] callInd = (JSPUtil.getParameter(request, prefix	+ "call_ind", length));
			String[] oprCd = (JSPUtil.getParameter(request, prefix	+ "opr_cd", length));
			String[] bsaSlot = (JSPUtil.getParameter(request, prefix	+ "bsa_slot", length));
			String[] dirCd = (JSPUtil.getParameter(request, prefix	+ "dir_cd", length));
			String[] portCd = (JSPUtil.getParameter(request, prefix	+ "port_cd", length));
			String[] updateUser = (JSPUtil.getParameter(request, prefix	+ "update_user", length));
			String[] bsaType = (JSPUtil.getParameter(request, prefix	+ "bsa_type", length));
			
			for (int i = 0; i < length; i++) {
				model = new TdrAllocationVO();
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (voyNo[i] != null)
					model.setVoyNo(voyNo[i]);
				if (swapWgt[i] != null)
					model.setSwapWgt(swapWgt[i]);
				if (updateTime[i] != null)
					model.setUpdateTime(updateTime[i]);
				if (ratioType[i] != null)
					model.setRatioType(ratioType[i]);
				if (releaseWgt[i] != null)
					model.setReleaseWgt(releaseWgt[i]);
				if (bsaWgt[i] != null)
					model.setBsaWgt(bsaWgt[i]);
				if (swapSlot[i] != null)
					model.setSwapSlot(swapSlot[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (releaseSlot[i] != null)
					model.setReleaseSlot(releaseSlot[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (callInd[i] != null)
					model.setCallInd(callInd[i]);
				if (oprCd[i] != null)
					model.setOprCd(oprCd[i]);
				if (bsaSlot[i] != null)
					model.setBsaSlot(bsaSlot[i]);
				if (dirCd[i] != null)
					model.setDirCd(dirCd[i]);
				if (portCd[i] != null)
					model.setPortCd(portCd[i]);
				if (updateUser[i] != null)
					model.setUpdateUser(updateUser[i]);
				if (bsaType[i] != null)
					model.setBsaType(bsaType[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getTdrAllocationVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return TdrAllocationVO[]
	 */
	public TdrAllocationVO[] getTdrAllocationVOs(){
		TdrAllocationVO[] vos = (TdrAllocationVO[])models.toArray(new TdrAllocationVO[models.size()]);
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
		this.vslCd = this.vslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.voyNo = this.voyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.swapWgt = this.swapWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updateTime = this.updateTime .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ratioType = this.ratioType .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.releaseWgt = this.releaseWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bsaWgt = this.bsaWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.swapSlot = this.swapSlot .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.releaseSlot = this.releaseSlot .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.callInd = this.callInd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.oprCd = this.oprCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bsaSlot = this.bsaSlot .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dirCd = this.dirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.portCd = this.portCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updateUser = this.updateUser .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bsaType = this.bsaType .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
