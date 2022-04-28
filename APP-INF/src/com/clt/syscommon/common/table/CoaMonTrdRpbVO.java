/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CoaMonTrdRpbVO.java
*@FileTitle : CoaMonTrdRpbVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.09.25
*@LastModifier : 임옥영
*@LastVersion : 1.0
* 2009.09.25 임옥영 
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
 * @author 임옥영
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class CoaMonTrdRpbVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<CoaMonTrdRpbVO> models = new ArrayList<CoaMonTrdRpbVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String scr40ftAvgRev = null;
	/* Column Info */
	private String net20ftAvgRev = null;
	/* Column Info */
	private String net40ftAvgRev = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String scr20ftAvgRev = null;
	/* Column Info */
	private String trdCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String oft20ftAvgRev = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String misc20ftAvgRev = null;
	/* Column Info */
	private String oft40ftAvgRev = null;
	/* Column Info */
	private String misc40ftAvgRev = null;
	/* Column Info */
	private String dirCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String rpbYrmon = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public CoaMonTrdRpbVO() {}

	public CoaMonTrdRpbVO(String ibflag, String pagerows, String rpbYrmon, String dirCd, String trdCd, String net20ftAvgRev, String oft20ftAvgRev, String misc20ftAvgRev, String scr20ftAvgRev, String net40ftAvgRev, String oft40ftAvgRev, String misc40ftAvgRev, String scr40ftAvgRev, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.scr40ftAvgRev = scr40ftAvgRev;
		this.net20ftAvgRev = net20ftAvgRev;
		this.net40ftAvgRev = net40ftAvgRev;
		this.creDt = creDt;
		this.scr20ftAvgRev = scr20ftAvgRev;
		this.trdCd = trdCd;
		this.pagerows = pagerows;
		this.oft20ftAvgRev = oft20ftAvgRev;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.misc20ftAvgRev = misc20ftAvgRev;
		this.oft40ftAvgRev = oft40ftAvgRev;
		this.misc40ftAvgRev = misc40ftAvgRev;
		this.dirCd = dirCd;
		this.updUsrId = updUsrId;
		this.rpbYrmon = rpbYrmon;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("scr_40ft_avg_rev", getScr40ftAvgRev());
		this.hashColumns.put("net_20ft_avg_rev", getNet20ftAvgRev());
		this.hashColumns.put("net_40ft_avg_rev", getNet40ftAvgRev());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("scr_20ft_avg_rev", getScr20ftAvgRev());
		this.hashColumns.put("trd_cd", getTrdCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("oft_20ft_avg_rev", getOft20ftAvgRev());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("misc_20ft_avg_rev", getMisc20ftAvgRev());
		this.hashColumns.put("oft_40ft_avg_rev", getOft40ftAvgRev());
		this.hashColumns.put("misc_40ft_avg_rev", getMisc40ftAvgRev());
		this.hashColumns.put("dir_cd", getDirCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("rpb_yrmon", getRpbYrmon());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("scr_40ft_avg_rev", "scr40ftAvgRev");
		this.hashFields.put("net_20ft_avg_rev", "net20ftAvgRev");
		this.hashFields.put("net_40ft_avg_rev", "net40ftAvgRev");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("scr_20ft_avg_rev", "scr20ftAvgRev");
		this.hashFields.put("trd_cd", "trdCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("oft_20ft_avg_rev", "oft20ftAvgRev");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("misc_20ft_avg_rev", "misc20ftAvgRev");
		this.hashFields.put("oft_40ft_avg_rev", "oft40ftAvgRev");
		this.hashFields.put("misc_40ft_avg_rev", "misc40ftAvgRev");
		this.hashFields.put("dir_cd", "dirCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("rpb_yrmon", "rpbYrmon");
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
	 * @return scr40ftAvgRev
	 */
	public String getScr40ftAvgRev() {
		return this.scr40ftAvgRev;
	}
	
	/**
	 * Column Info
	 * @return net20ftAvgRev
	 */
	public String getNet20ftAvgRev() {
		return this.net20ftAvgRev;
	}
	
	/**
	 * Column Info
	 * @return net40ftAvgRev
	 */
	public String getNet40ftAvgRev() {
		return this.net40ftAvgRev;
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
	 * @return scr20ftAvgRev
	 */
	public String getScr20ftAvgRev() {
		return this.scr20ftAvgRev;
	}
	
	/**
	 * Column Info
	 * @return trdCd
	 */
	public String getTrdCd() {
		return this.trdCd;
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
	 * @return oft20ftAvgRev
	 */
	public String getOft20ftAvgRev() {
		return this.oft20ftAvgRev;
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
	 * @return misc20ftAvgRev
	 */
	public String getMisc20ftAvgRev() {
		return this.misc20ftAvgRev;
	}
	
	/**
	 * Column Info
	 * @return oft40ftAvgRev
	 */
	public String getOft40ftAvgRev() {
		return this.oft40ftAvgRev;
	}
	
	/**
	 * Column Info
	 * @return misc40ftAvgRev
	 */
	public String getMisc40ftAvgRev() {
		return this.misc40ftAvgRev;
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
	 * @return updUsrId
	 */
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	
	/**
	 * Column Info
	 * @return rpbYrmon
	 */
	public String getRpbYrmon() {
		return this.rpbYrmon;
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
	 * @param scr40ftAvgRev
	 */
	public void setScr40ftAvgRev(String scr40ftAvgRev) {
		this.scr40ftAvgRev = scr40ftAvgRev;
	}
	
	/**
	 * Column Info
	 * @param net20ftAvgRev
	 */
	public void setNet20ftAvgRev(String net20ftAvgRev) {
		this.net20ftAvgRev = net20ftAvgRev;
	}
	
	/**
	 * Column Info
	 * @param net40ftAvgRev
	 */
	public void setNet40ftAvgRev(String net40ftAvgRev) {
		this.net40ftAvgRev = net40ftAvgRev;
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
	 * @param scr20ftAvgRev
	 */
	public void setScr20ftAvgRev(String scr20ftAvgRev) {
		this.scr20ftAvgRev = scr20ftAvgRev;
	}
	
	/**
	 * Column Info
	 * @param trdCd
	 */
	public void setTrdCd(String trdCd) {
		this.trdCd = trdCd;
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
	 * @param oft20ftAvgRev
	 */
	public void setOft20ftAvgRev(String oft20ftAvgRev) {
		this.oft20ftAvgRev = oft20ftAvgRev;
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
	 * @param misc20ftAvgRev
	 */
	public void setMisc20ftAvgRev(String misc20ftAvgRev) {
		this.misc20ftAvgRev = misc20ftAvgRev;
	}
	
	/**
	 * Column Info
	 * @param oft40ftAvgRev
	 */
	public void setOft40ftAvgRev(String oft40ftAvgRev) {
		this.oft40ftAvgRev = oft40ftAvgRev;
	}
	
	/**
	 * Column Info
	 * @param misc40ftAvgRev
	 */
	public void setMisc40ftAvgRev(String misc40ftAvgRev) {
		this.misc40ftAvgRev = misc40ftAvgRev;
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
	 * @param updUsrId
	 */
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
	}
	
	/**
	 * Column Info
	 * @param rpbYrmon
	 */
	public void setRpbYrmon(String rpbYrmon) {
		this.rpbYrmon = rpbYrmon;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setScr40ftAvgRev(JSPUtil.getParameter(request, "scr_40ft_avg_rev", ""));
		setNet20ftAvgRev(JSPUtil.getParameter(request, "net_20ft_avg_rev", ""));
		setNet40ftAvgRev(JSPUtil.getParameter(request, "net_40ft_avg_rev", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setScr20ftAvgRev(JSPUtil.getParameter(request, "scr_20ft_avg_rev", ""));
		setTrdCd(JSPUtil.getParameter(request, "trd_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setOft20ftAvgRev(JSPUtil.getParameter(request, "oft_20ft_avg_rev", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setMisc20ftAvgRev(JSPUtil.getParameter(request, "misc_20ft_avg_rev", ""));
		setOft40ftAvgRev(JSPUtil.getParameter(request, "oft_40ft_avg_rev", ""));
		setMisc40ftAvgRev(JSPUtil.getParameter(request, "misc_40ft_avg_rev", ""));
		setDirCd(JSPUtil.getParameter(request, "dir_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setRpbYrmon(JSPUtil.getParameter(request, "rpb_yrmon", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return CoaMonTrdRpbVO[]
	 */
	public CoaMonTrdRpbVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return CoaMonTrdRpbVO[]
	 */
	public CoaMonTrdRpbVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		CoaMonTrdRpbVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] scr40ftAvgRev = (JSPUtil.getParameter(request, prefix	+ "scr_40ft_avg_rev", length));
			String[] net20ftAvgRev = (JSPUtil.getParameter(request, prefix	+ "net_20ft_avg_rev", length));
			String[] net40ftAvgRev = (JSPUtil.getParameter(request, prefix	+ "net_40ft_avg_rev", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] scr20ftAvgRev = (JSPUtil.getParameter(request, prefix	+ "scr_20ft_avg_rev", length));
			String[] trdCd = (JSPUtil.getParameter(request, prefix	+ "trd_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] oft20ftAvgRev = (JSPUtil.getParameter(request, prefix	+ "oft_20ft_avg_rev", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] misc20ftAvgRev = (JSPUtil.getParameter(request, prefix	+ "misc_20ft_avg_rev", length));
			String[] oft40ftAvgRev = (JSPUtil.getParameter(request, prefix	+ "oft_40ft_avg_rev", length));
			String[] misc40ftAvgRev = (JSPUtil.getParameter(request, prefix	+ "misc_40ft_avg_rev", length));
			String[] dirCd = (JSPUtil.getParameter(request, prefix	+ "dir_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] rpbYrmon = (JSPUtil.getParameter(request, prefix	+ "rpb_yrmon", length));
			
			for (int i = 0; i < length; i++) {
				model = new CoaMonTrdRpbVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (scr40ftAvgRev[i] != null)
					model.setScr40ftAvgRev(scr40ftAvgRev[i]);
				if (net20ftAvgRev[i] != null)
					model.setNet20ftAvgRev(net20ftAvgRev[i]);
				if (net40ftAvgRev[i] != null)
					model.setNet40ftAvgRev(net40ftAvgRev[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (scr20ftAvgRev[i] != null)
					model.setScr20ftAvgRev(scr20ftAvgRev[i]);
				if (trdCd[i] != null)
					model.setTrdCd(trdCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (oft20ftAvgRev[i] != null)
					model.setOft20ftAvgRev(oft20ftAvgRev[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (misc20ftAvgRev[i] != null)
					model.setMisc20ftAvgRev(misc20ftAvgRev[i]);
				if (oft40ftAvgRev[i] != null)
					model.setOft40ftAvgRev(oft40ftAvgRev[i]);
				if (misc40ftAvgRev[i] != null)
					model.setMisc40ftAvgRev(misc40ftAvgRev[i]);
				if (dirCd[i] != null)
					model.setDirCd(dirCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (rpbYrmon[i] != null)
					model.setRpbYrmon(rpbYrmon[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getCoaMonTrdRpbVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return CoaMonTrdRpbVO[]
	 */
	public CoaMonTrdRpbVO[] getCoaMonTrdRpbVOs(){
		CoaMonTrdRpbVO[] vos = (CoaMonTrdRpbVO[])models.toArray(new CoaMonTrdRpbVO[models.size()]);
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
		this.scr40ftAvgRev = this.scr40ftAvgRev .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.net20ftAvgRev = this.net20ftAvgRev .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.net40ftAvgRev = this.net40ftAvgRev .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.scr20ftAvgRev = this.scr20ftAvgRev .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trdCd = this.trdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.oft20ftAvgRev = this.oft20ftAvgRev .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.misc20ftAvgRev = this.misc20ftAvgRev .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.oft40ftAvgRev = this.oft40ftAvgRev .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.misc40ftAvgRev = this.misc40ftAvgRev .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dirCd = this.dirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rpbYrmon = this.rpbYrmon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
