/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : BizCodeManager.java
*@FileTitle : 공통
*Open Issues :
*Change history :
*@LastModifyDate : 2006-10-31
*@LastModifier : Hyung Choon_Roh
*@LastVersion : 1.0
* 2006-10-31 Hyung Choon_Roh
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.util.code;

import java.util.Collection;

import com.clt.bizcommon.util.dao.BizComDAO;
import com.clt.framework.component.util.code.CodeException;
import com.clt.framework.core.layer.integration.DAOException;

/**
 * 업무공통에서 사용하는 공통 코드 등을 구현<br>
 * @author Hyung Choon_Roh
 * @see 
 * @since J2EE 1.4
 */
public class BizCodeManager {

	/**
     *  log 객체
     */
    protected transient org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(this.getClass().getName());

    /**
     *  CodeDAO 객체
     */
    private transient BizComDAO codedao = null;

    /**
     *  CodeUtil 객체
     */
    private static BizCodeManager instance = new BizCodeManager();

    /**
     * 1. 기능 : CodeInfo getInstance()<p>
     * 2. 처리개요 :  <p>
     *    - 객체생성시에 instance를 만들고 공유한다. <p>
     * 3. 주의사항 : <p>
     * @return 
     *
     **/    
    public static BizCodeManager getInstance() {
        return instance;
    }

    /**
     * 1. 기능 : CodeUtil 생성자<p>
     *
     **/
    private BizCodeManager() {
        codedao = new BizComDAO();
    }

    /**
     * 공통 코드 조회<br>
     * @param jobCode
     * @param sortKey
     * @return
     * @throws CodeException
     */
    public Collection getCodeList(String jobCode, int sortKey) throws CodeException {
		
		 Collection codeList = null;
	        try {
	        	if("CURR".equals(jobCode)) {
	        		codeList = codedao.getCurrencyList("", sortKey);
	        	} else if("CNTRTP".equals(jobCode)) {
	        		codeList = codedao.getCntrTpList("", sortKey);
	        	} else if("CNTRSZ".equals(jobCode)) {
	        		codeList = codedao.getCntrSzList("", sortKey);
	        	} else if("CNTRTPSZ".equals(jobCode)) {
	        		codeList = codedao.getCntrTpSzList("", sortKey);
	        	} else if("CHASSIS".equals(jobCode)) {
	        		codeList = codedao.getChassisList("", sortKey);
	        	} else if("GENSET".equals(jobCode)) {
	        		codeList = codedao.getGensetList("", sortKey);
	        	} else if("CONTI".equals(jobCode)) {
	        		codeList = codedao.getContiList("", sortKey);
	        	} else if("SCONTI".equals(jobCode)) {
	        		codeList = codedao.getSContiList("", sortKey);
	        	} else if("SUBSYS".equals(jobCode)) {
	        		codeList = codedao.getSubSysList("", sortKey);
	        	} else if("STE".equals(jobCode)) {
	        		codeList = codedao.getSteList("", sortKey);
	        	} else if("SCONTI".equals(jobCode)) {
	        		codeList = codedao.getSContiList("", sortKey);
	        	} else if("SVC_SCOPE".equals(jobCode)) {
	        		codeList = codedao.getSvcScopeList("", sortKey);
	        	}else if("FDRDIVCD".equals(jobCode)){
	        		codeList = codedao.getComIntgCodeList("", sortKey);
	        	}
	        } catch (DAOException de) {
	            log.error(de.getMessage(), de);
	            throw new CodeException("Code Exception : " + de.getMessage());
	        }
	        return codeList;
    }
    
    /**
     * 공통 코드 조회<br>
     * @param jobCode
     * @param where
     * @param sortKey
     * @return
     * @throws CodeException
     */
    public Collection getCodeList(String jobCode, String where, int sortKey) throws CodeException {
		
    	 Collection codeList = null;
	        try {
	        	if("CURR".equals(jobCode)) {
	        		codeList = codedao.getCurrencyList(where, sortKey);
	        	} else if("CNTRTP".equals(jobCode)) {
	        		codeList = codedao.getCntrTpList(where, sortKey);
	        	} else if("CNTRSZ".equals(jobCode)) {
	        		codeList = codedao.getCntrSzList(where, sortKey);
	        	} else if("CNTRTPSZ".equals(jobCode)) {
	        		codeList = codedao.getCntrTpSzList(where, sortKey);
	        	} else if("CHASSIS".equals(jobCode)) {
	        		codeList = codedao.getChassisList(where, sortKey);
	        	} else if("GENSET".equals(jobCode)) {
	        		codeList = codedao.getGensetList(where, sortKey);
	        	} else if("CONTI".equals(jobCode)) {
	        		codeList = codedao.getContiList(where, sortKey);
	        	} else if("SCONTI".equals(jobCode)) {
	        		codeList = codedao.getSContiList(where, sortKey);
	        	} else if("SUBSYS".equals(jobCode)) {
	        		codeList = codedao.getSubSysList(where, sortKey);
	        	} else if("STE".equals(jobCode)) {
	        		codeList = codedao.getSteList(where, sortKey);
	        	} else if("SCONTI".equals(jobCode)) {
	        		codeList = codedao.getSContiList(where, sortKey);
	        	} else if("SVC_SCOPE".equals(jobCode)) {
	        		codeList = codedao.getSvcScopeList(where, sortKey);
	        	}
	        } catch (DAOException de) {
	            log.error(de.getMessage(), de);
	            throw new CodeException("Code Exception : " + de.getMessage());
	        }
	        return codeList;
    }
    
    /**
     * 코드값 조회<br>
     * @param jobCode
     * @param code 
     * @return
     * @throws CodeException
     */
    public String getCodeVal(String jobCode, String code) throws CodeException {
		String codeVal = "";
        try {        	
        	codeVal = codedao.getCodeVal(jobCode, code);
        } catch (DAOException de) {
            log.error(de.getMessage(), de);
            throw new CodeException("Code Exception : " + de.getMessage());
        }
        return codeVal;
    }
}
