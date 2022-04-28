/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BackEndJobInfoVO.java
*@FileTitle : BackEndJobInfoVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.02.12
*@LastModifier : 김정훈
*@LastVersion : 1.0
* 2009.02.12 김정훈 
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
 * - PDTO(Data Transfer Object including Parameters)<br>
 * - 관련 Event에서 작성, 서버실행요청시 PDTO의 역할을 수행하는 Value Object<br>
 *
 * @author 김정훈
 * @since J2EE 1.5
 */

public class BackEndJobInfoVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BackEndJobInfoVO> models = new ArrayList<BackEndJobInfoVO>();
	
	/* Column Inpo */
	private String article = null;
	/* Status */
	private String ibflag = null;
	/* Column Inpo */
	private String threadId = null;
	/* Column Inpo */
	private String userId = null;
	/* Column Inpo */
	private String creDt = null;
	/* Column Inpo */
	private String resultFilePath = null;
	/* Column Inpo */
	private String status = null;
	/* Page Number */
	private String pagerows = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	hashFildInpo	*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BackEndJobInfoVO() {}

	public BackEndJobInfoVO(String ibflag, String pagerows, String resultFilePath, String threadId, String article, String status, String userId, String creDt) {
		this.article = article;
		this.ibflag = ibflag;
		this.threadId = threadId;
		this.userId = userId;
		this.creDt = creDt;
		this.resultFilePath = resultFilePath;
		this.status = status;
		this.pagerows = pagerows;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("article", getArticle());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("thread_id", getThreadId());
		this.hashColumns.put("user_id", getUserId());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("result_file_path", getResultFilePath());
		this.hashColumns.put("status", getStatus());
		this.hashColumns.put("pagerows", getPagerows());
		return this.hashColumns;
	}
	
	/**
	 * hashFildInpo
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("article", "article");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("thread_id", "threadId");
		this.hashFields.put("user_id", "userId");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("result_file_path", "resultFilePath");
		this.hashFields.put("status", "status");
		this.hashFields.put("pagerows", "pagerows");
		return this.hashFields;
	}
	
	public String getArticle() {
		return this.article;
	}
	public String getIbflag() {
		return this.ibflag;
	}
	public String getThreadId() {
		return this.threadId;
	}
	public String getUserId() {
		return this.userId;
	}
	public String getCreDt() {
		return this.creDt;
	}
	public String getResultFilePath() {
		return this.resultFilePath;
	}
	public String getStatus() {
		return this.status;
	}
	public String getPagerows() {
		return this.pagerows;
	}

	public void setArticle(String article) {
		this.article = article;
		//this.article=true;
	}
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setThreadId(String threadId) {
		this.threadId = threadId;
		//this.threadId=true;
	}
	public void setUserId(String userId) {
		this.userId = userId;
		//this.userId=true;
	}
	public void setCreDt(String creDt) {
		this.creDt = creDt;
		//this.creDt=true;
	}
	public void setResultFilePath(String resultFilePath) {
		this.resultFilePath = resultFilePath;
		//this.resultFilePath=true;
	}
	public void setStatus(String status) {
		this.status = status;
		//this.status=true;
	}
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}
	public void fromRequest(HttpServletRequest request) {
		setArticle(JSPUtil.getParameter(request, "article", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setThreadId(JSPUtil.getParameter(request, "thread_id", ""));
		setUserId(JSPUtil.getParameter(request, "user_id", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setResultFilePath(JSPUtil.getParameter(request, "result_file_path", ""));
		setStatus(JSPUtil.getParameter(request, "status", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
	}

	public BackEndJobInfoVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public BackEndJobInfoVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BackEndJobInfoVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] article = (JSPUtil.getParameter(request, prefix	+ "article".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] threadId = (JSPUtil.getParameter(request, prefix	+ "thread_id".trim(), length));
			String[] userId = (JSPUtil.getParameter(request, prefix	+ "user_id".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] resultFilePath = (JSPUtil.getParameter(request, prefix	+ "result_file_path".trim(), length));
			String[] status = (JSPUtil.getParameter(request, prefix	+ "status".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new BackEndJobInfoVO();
				if (article[i] != null)
					model.setArticle(article[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (threadId[i] != null)
					model.setThreadId(threadId[i]);
				if (userId[i] != null)
					model.setUserId(userId[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (resultFilePath[i] != null)
					model.setResultFilePath(resultFilePath[i]);
				if (status[i] != null)
					model.setStatus(status[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {}
		return getBackEndJobInfoVOs();
	}

	public BackEndJobInfoVO[] getBackEndJobInfoVOs(){
		BackEndJobInfoVO[] vos = (BackEndJobInfoVO[])models.toArray(new BackEndJobInfoVO[models.size()]);
		return vos;
	}
	
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
		} catch (Exception ex) {}
		return ret.toString();
	}
	
	/**
	 * 각 클래스 해당하는 필드 정보를 배열에 담는다 
	 * @param field
	 * @param i
	 * @return String[]
	 * @throws IllegalAccessException
	 */
	private String[] getField(Field[] field, int i) throws IllegalAccessException {
		String[] arr;
		try{
			arr = (String[]) field[i].get(this);
		}catch(Exception ex){
			arr = new String[1];
			arr[0] = String.valueOf(field[i].get(this));
		}
		return arr;
	}
	
	/**
	* DataFormat 설정
	*/
	public void onDataFormat(){
		this.article = this.article .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.threadId = this.threadId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.userId = this.userId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.resultFilePath = this.resultFilePath .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.status = this.status .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
