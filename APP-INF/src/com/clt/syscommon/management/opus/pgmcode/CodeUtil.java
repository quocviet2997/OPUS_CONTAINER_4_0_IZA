/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : CodeUtil.java
*@FileTitle : 시스템코드 유틸
*Open Issues :
*Change history :
*@LastModifyDate : 2006-12-13
*@LastModifier : SeongWook Kim
*@LastVersion : 1.0
* 2006-12-13 SeongWook Kim
* 1.0 최초 생성
=========================================================*/
package com.clt.syscommon.management.opus.pgmcode;

import java.util.Collection;

import com.clt.framework.component.util.code.CodeException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.syscommon.management.opus.pgmcode.dao.CodeDAOSQL;

/**
 * 클래스 개요 : 코드 모델 Bean
 * <p>
 * 작성일 : 2006.12.17.
 * @see CodeInfo,CodeUtil 참조
 * @since J2EE 1.4
 * @version 1.0
 * @author  김성욱
 */
public class CodeUtil {

	/**
	 *  log 객체
	 */
	protected transient org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(this.getClass().getName());

	/**
	 *  CodeDAOSQL 객체
	 */
	private transient CodeDAOSQL CodeDAOSQL = null;

	/**
	 *  CodeUtil 객체
	 */
	private static CodeUtil instance = new CodeUtil();

	/**
	 * 기능 : CodeInfo getInstance()<p>
	 * 2. 처리개요 :  <p>
	 *    - 객체생성시에 instance를 만들고 공유한다. <p>
	 * 3. 주의사항 : <p>
	 *
	 **/
	public static CodeUtil getInstance() {
		return instance;
	}

	/**
	 * 기능 : CodeUtil 생성자<p>
	 *
	 **/
	private CodeUtil() {
		CodeDAOSQL = new CodeDAOSQL();
	}

	/**
	 * @param mainCode
	 * @param sortKey
	 * @return Collection
	 * @throws CodeException
	 */
	public Collection getCodeSelect(String mainCode,  int sortKey) throws CodeException {

		 Collection codeList = null;
			try {
				if ( "".equals(mainCode)){ // 빈값이면
					codeList = CodeDAOSQL.getCodeList( );
				}else{
				   codeList = CodeDAOSQL.getCodeListForsSubCode(mainCode, sortKey);
				}
			} catch (DAOException de) {
				log.error(de.getMessage());
				throw new CodeException("Code Exception : " + de.getMessage());
			}
			return codeList;
	}

	/**
	 * 기능 : ibsheet용 codelist를 return <p>
	 * 2. 처리개요 :  <p>
	 *    - 해당 코드에 관련된 code list를 ibsheet용으로 변환한다. <p>
	 * 3. 주의사항 : <p>
	 *
	 * @param String mainCode
	 * @param int sortKey
	 * @return Collection
	 **/
	public Collection geIBSheetSelectBox(String mainCode,  int sortKey) throws CodeException {
		Collection codeList = null;
		try {
			if ( "".equals(mainCode)){ // 빈값이면
				codeList = CodeDAOSQL.getCodeList( );
			}else{
			   codeList = CodeDAOSQL.getCodeListForsSubCode(mainCode, sortKey);
			}
		} catch (DAOException de) {
			log.error(de.getMessage());
			throw new CodeException("Code Exception : " + de.getMessage());
		}
		return codeList;
	}
}
