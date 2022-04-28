/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : TdrCraneVO.java
*@FileTitle : TdrCraneVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.16
*@LastModifier : 
*@LastVersion : 1.0
* 2009.07.16  
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

public class TdrCraneVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<TdrCraneVO> models = new ArrayList<TdrCraneVO>();
	
	/* Column Info */
	private String vslCd = null;
	/* Column Info */
	private String voyNo = null;
	/* Column Info */
	private String startDate = null;
	/* Column Info */
	private String bwTime = null;
	/* Column Info */
	private String otherTime = null;
	/* Column Info */
	private String updateTime = null;
	/* Column Info */
	private String endDate = null;
	/* Column Info */
	private String loseTime = null;
	/* Page Number */
	private String pagerows = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String callInd = null;
	/* Column Info */
	private String craneNo = null;
	/* Column Info */
	private String bdtTime = null;
	/* Column Info */
	private String mtTime = null;
	/* Column Info */
	private String workTime = null;
	/* Column Info */
	private String dirCd = null;
	/* Column Info */
	private String portCd = null;
	/* Column Info */
	private String updateUser = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public TdrCraneVO() {}

	public TdrCraneVO(String ibflag, String pagerows, String vslCd, String voyNo, String dirCd, String portCd, String callInd, String craneNo, String startDate, String endDate, String bdtTime, String mtTime, String bwTime, String otherTime, String loseTime, String workTime, String updateTime, String updateUser) {
		this.vslCd = vslCd;
		this.voyNo = voyNo;
		this.startDate = startDate;
		this.bwTime = bwTime;
		this.otherTime = otherTime;
		this.updateTime = updateTime;
		this.endDate = endDate;
		this.loseTime = loseTime;
		this.pagerows = pagerows;
		this.ibflag = ibflag;
		this.callInd = callInd;
		this.craneNo = craneNo;
		this.bdtTime = bdtTime;
		this.mtTime = mtTime;
		this.workTime = workTime;
		this.dirCd = dirCd;
		this.portCd = portCd;
		this.updateUser = updateUser;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("voy_no", getVoyNo());
		this.hashColumns.put("start_date", getStartDate());
		this.hashColumns.put("bw_time", getBwTime());
		this.hashColumns.put("other_time", getOtherTime());
		this.hashColumns.put("update_time", getUpdateTime());
		this.hashColumns.put("end_date", getEndDate());
		this.hashColumns.put("lose_time", getLoseTime());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("call_ind", getCallInd());
		this.hashColumns.put("crane_no", getCraneNo());
		this.hashColumns.put("bdt_time", getBdtTime());
		this.hashColumns.put("mt_time", getMtTime());
		this.hashColumns.put("work_time", getWorkTime());
		this.hashColumns.put("dir_cd", getDirCd());
		this.hashColumns.put("port_cd", getPortCd());
		this.hashColumns.put("update_user", getUpdateUser());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("voy_no", "voyNo");
		this.hashFields.put("start_date", "startDate");
		this.hashFields.put("bw_time", "bwTime");
		this.hashFields.put("other_time", "otherTime");
		this.hashFields.put("update_time", "updateTime");
		this.hashFields.put("end_date", "endDate");
		this.hashFields.put("lose_time", "loseTime");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("call_ind", "callInd");
		this.hashFields.put("crane_no", "craneNo");
		this.hashFields.put("bdt_time", "bdtTime");
		this.hashFields.put("mt_time", "mtTime");
		this.hashFields.put("work_time", "workTime");
		this.hashFields.put("dir_cd", "dirCd");
		this.hashFields.put("port_cd", "portCd");
		this.hashFields.put("update_user", "updateUser");
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
	 * @return startDate
	 */
	public String getStartDate() {
		return this.startDate;
	}
	
	/**
	 * Column Info
	 * @return bwTime
	 */
	public String getBwTime() {
		return this.bwTime;
	}
	
	/**
	 * Column Info
	 * @return otherTime
	 */
	public String getOtherTime() {
		return this.otherTime;
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
	 * @return endDate
	 */
	public String getEndDate() {
		return this.endDate;
	}
	
	/**
	 * Column Info
	 * @return loseTime
	 */
	public String getLoseTime() {
		return this.loseTime;
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
	 * @return callInd
	 */
	public String getCallInd() {
		return this.callInd;
	}
	
	/**
	 * Column Info
	 * @return craneNo
	 */
	public String getCraneNo() {
		return this.craneNo;
	}
	
	/**
	 * Column Info
	 * @return bdtTime
	 */
	public String getBdtTime() {
		return this.bdtTime;
	}
	
	/**
	 * Column Info
	 * @return mtTime
	 */
	public String getMtTime() {
		return this.mtTime;
	}
	
	/**
	 * Column Info
	 * @return workTime
	 */
	public String getWorkTime() {
		return this.workTime;
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
	 * @param startDate
	 */
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	
	/**
	 * Column Info
	 * @param bwTime
	 */
	public void setBwTime(String bwTime) {
		this.bwTime = bwTime;
	}
	
	/**
	 * Column Info
	 * @param otherTime
	 */
	public void setOtherTime(String otherTime) {
		this.otherTime = otherTime;
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
	 * @param endDate
	 */
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
	/**
	 * Column Info
	 * @param loseTime
	 */
	public void setLoseTime(String loseTime) {
		this.loseTime = loseTime;
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
	 * @param callInd
	 */
	public void setCallInd(String callInd) {
		this.callInd = callInd;
	}
	
	/**
	 * Column Info
	 * @param craneNo
	 */
	public void setCraneNo(String craneNo) {
		this.craneNo = craneNo;
	}
	
	/**
	 * Column Info
	 * @param bdtTime
	 */
	public void setBdtTime(String bdtTime) {
		this.bdtTime = bdtTime;
	}
	
	/**
	 * Column Info
	 * @param mtTime
	 */
	public void setMtTime(String mtTime) {
		this.mtTime = mtTime;
	}
	
	/**
	 * Column Info
	 * @param workTime
	 */
	public void setWorkTime(String workTime) {
		this.workTime = workTime;
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
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setVslCd(JSPUtil.getParameter(request, "vsl_cd", ""));
		setVoyNo(JSPUtil.getParameter(request, "voy_no", ""));
		setStartDate(JSPUtil.getParameter(request, "start_date", ""));
		setBwTime(JSPUtil.getParameter(request, "bw_time", ""));
		setOtherTime(JSPUtil.getParameter(request, "other_time", ""));
		setUpdateTime(JSPUtil.getParameter(request, "update_time", ""));
		setEndDate(JSPUtil.getParameter(request, "end_date", ""));
		setLoseTime(JSPUtil.getParameter(request, "lose_time", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCallInd(JSPUtil.getParameter(request, "call_ind", ""));
		setCraneNo(JSPUtil.getParameter(request, "crane_no", ""));
		setBdtTime(JSPUtil.getParameter(request, "bdt_time", ""));
		setMtTime(JSPUtil.getParameter(request, "mt_time", ""));
		setWorkTime(JSPUtil.getParameter(request, "work_time", ""));
		setDirCd(JSPUtil.getParameter(request, "dir_cd", ""));
		setPortCd(JSPUtil.getParameter(request, "port_cd", ""));
		setUpdateUser(JSPUtil.getParameter(request, "update_user", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return TdrCraneVO[]
	 */
	public TdrCraneVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return TdrCraneVO[]
	 */
	public TdrCraneVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		TdrCraneVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd", length));
			String[] voyNo = (JSPUtil.getParameter(request, prefix	+ "voy_no", length));
			String[] startDate = (JSPUtil.getParameter(request, prefix	+ "start_date", length));
			String[] bwTime = (JSPUtil.getParameter(request, prefix	+ "bw_time", length));
			String[] otherTime = (JSPUtil.getParameter(request, prefix	+ "other_time", length));
			String[] updateTime = (JSPUtil.getParameter(request, prefix	+ "update_time", length));
			String[] endDate = (JSPUtil.getParameter(request, prefix	+ "end_date", length));
			String[] loseTime = (JSPUtil.getParameter(request, prefix	+ "lose_time", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] callInd = (JSPUtil.getParameter(request, prefix	+ "call_ind", length));
			String[] craneNo = (JSPUtil.getParameter(request, prefix	+ "crane_no", length));
			String[] bdtTime = (JSPUtil.getParameter(request, prefix	+ "bdt_time", length));
			String[] mtTime = (JSPUtil.getParameter(request, prefix	+ "mt_time", length));
			String[] workTime = (JSPUtil.getParameter(request, prefix	+ "work_time", length));
			String[] dirCd = (JSPUtil.getParameter(request, prefix	+ "dir_cd", length));
			String[] portCd = (JSPUtil.getParameter(request, prefix	+ "port_cd", length));
			String[] updateUser = (JSPUtil.getParameter(request, prefix	+ "update_user", length));
			
			for (int i = 0; i < length; i++) {
				model = new TdrCraneVO();
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (voyNo[i] != null)
					model.setVoyNo(voyNo[i]);
				if (startDate[i] != null)
					model.setStartDate(startDate[i]);
				if (bwTime[i] != null)
					model.setBwTime(bwTime[i]);
				if (otherTime[i] != null)
					model.setOtherTime(otherTime[i]);
				if (updateTime[i] != null)
					model.setUpdateTime(updateTime[i]);
				if (endDate[i] != null)
					model.setEndDate(endDate[i]);
				if (loseTime[i] != null)
					model.setLoseTime(loseTime[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (callInd[i] != null)
					model.setCallInd(callInd[i]);
				if (craneNo[i] != null)
					model.setCraneNo(craneNo[i]);
				if (bdtTime[i] != null)
					model.setBdtTime(bdtTime[i]);
				if (mtTime[i] != null)
					model.setMtTime(mtTime[i]);
				if (workTime[i] != null)
					model.setWorkTime(workTime[i]);
				if (dirCd[i] != null)
					model.setDirCd(dirCd[i]);
				if (portCd[i] != null)
					model.setPortCd(portCd[i]);
				if (updateUser[i] != null)
					model.setUpdateUser(updateUser[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getTdrCraneVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return TdrCraneVO[]
	 */
	public TdrCraneVO[] getTdrCraneVOs(){
		TdrCraneVO[] vos = (TdrCraneVO[])models.toArray(new TdrCraneVO[models.size()]);
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
		this.startDate = this.startDate .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bwTime = this.bwTime .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.otherTime = this.otherTime .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updateTime = this.updateTime .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.endDate = this.endDate .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.loseTime = this.loseTime .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.callInd = this.callInd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.craneNo = this.craneNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bdtTime = this.bdtTime .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mtTime = this.mtTime .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.workTime = this.workTime .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dirCd = this.dirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.portCd = this.portCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updateUser = this.updateUser .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
