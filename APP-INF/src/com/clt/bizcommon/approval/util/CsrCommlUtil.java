/*=========================================================
* Copyright(c) 2006 CyberLogitec
* @FileName : CommodityDBDAO.java
* @FileTitle : Commodity정보조회(공통 Popup)
* Open Issues :
* Change history :
* @LastModifyDate : 2006-08-03
* @LastModifier : sungseok, choi
* @LastVersion : 1.0
* 2006-08-03 sungseok, choi
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.approval.util;

//import java.sql.SQLException;
import java.util.ArrayList;
import java.util.StringTokenizer;
//import java.util.HashMap;
//import java.util.Map;
//import com.clt.bizcommon.approval.integration.ApprovalDBDAOCheckOfficeCodeRSQL;
//import com.clt.framework.component.rowset.DBRowSet;
//import com.clt.framework.support.db.ISQLTemplate;
//import com.clt.framework.support.db.SQLExecuter;

/**
 * ApprovalUtil <br>
 * Process ApprovalUtil <br>
 * 
 * @author sungseok, choi
 * @see 
 * @since J2EE 1.4
 */
public class CsrCommlUtil {
	/**
     *  log 객체 
     */
    protected transient org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(this.getClass().getName());
    
	/**
	 * ApprovalUtil 객체 생성<br>
	 */
	public CsrCommlUtil() { }
	
	
	/**
	 * 0960에서 사용할 UTIL
	 * @param sparameter
	 * @param sSeperate
	 * @return
	 */
	public static ArrayList seperationParameter(String sparameter, String sSeperate) {
		ArrayList arrlist = null;
		StringTokenizer st  = null;
		int j = 0;
		if(sparameter != null && !sparameter.equals("")) {
			arrlist = new ArrayList();
			st = new StringTokenizer(sparameter, sSeperate);
			while( st.hasMoreTokens() ) {
				arrlist.add(j++, st.nextToken());
			}
		}
		return arrlist;
	}
	
}
