/*=========================================================
* Copyright(c) 2006 CyberLogitec
* @FileName : ApprovalProcessingMgr.java
* @FileTitle : ApprovalProcessingMgr 공통
* Open Issues :
* Change history :
* @LastModifyDate : 2006-08-03
* @LastModifier : sungseok, choi
* @LastVersion : 1.0
* 2006-08-03 sungseok, choi
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.approval.util;

import java.util.ArrayList;

/**
 * ApprovalProcessingMgr <br>
 * Process ApprovalProcessingMgr <br>
 * 
 * @author sungseok, choi
 * @see 
 * @since J2EE 1.4
 */
public class ApprovalProcessingMgr {
	static ArrayList arrProcessing = new ArrayList();
	
	/**
	 * This method regists approval. 
	 * @param apro_rqst_no
	 */
	public void registApproval(String apro_rqst_no) {
		if(!arrProcessing.contains(apro_rqst_no))
			arrProcessing.add(apro_rqst_no);
	}
	
	/**
	 * This method releases approval
	 * @param apro_rqst_no
	 */
	public void releaseApproval(String apro_rqst_no) {
		if(arrProcessing.contains(apro_rqst_no))
			arrProcessing.remove(apro_rqst_no);
	}
	
	/**
	 * This method checks approval exist.
	 * @param apro_rqst_no
	 * @return
	 */
	public boolean chkApprovalExist(String apro_rqst_no) {
		return arrProcessing.contains(apro_rqst_no);
	}
	
	/**
	 * This method gets a size
	 * @return
	 */
	public static int getSize() {
		return arrProcessing.size();
	}
}
