/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : CodeInfo.java
*@FileTitle : 시스템코드 모델
*Open Issues :
*Change history :
*@LastModifyDate : 2006-12-13
*@LastModifier : SeongWook Kim
*@LastVersion : 1.0
* 2006-12-13 SeongWook Kim
* 1.0 최초 생성
=========================================================*/
package com.clt.syscommon.management.opus.pgmcode;

import java.lang.reflect.Array;
import java.lang.reflect.Field;

/**
 * 클래스 개요 : 코드 모델 Bean
 * <p>
 * 작성일 : 2006.12.17.
 * @see CodeDAO,CodeUtil 참조
 * @since J2EE 1.4
 * @version 1.0
 * @author  김성욱
 */
public class CodeInfo implements java.io.Serializable, Comparable {
	private org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(this.getClass().getName());
	/**
	 * code 값
	 */
	private String code;

	/**
	 * sort key
	 */
	private String sortKey;

	/**
	 * code 명
	 */
	private String name;

	/**
	 * 기능 : CodeInfo 생성자
	 * <p>
	 * 2. 처리개요 :
	 * <p> - CodeInfo 객체를 생성
	 * <p>
	 * 3. 주의사항 :
	 * <p>
	 * 
	 */
	public CodeInfo() {
	}

	/**
	 * 기능 : CodeInfo 생성자
	 * <p>
	 * 2. 처리개요 :
	 * <p> - code값, code명을 받아 모델 setting
	 * <p>
	 * 3. 주의사항 :
	 * <p>
	 * 
	 * @param sortKey String
	 * @param code
	 *            code 값
	 * @param name
	 *            code 명
	 */
	public CodeInfo(String sortKey, String code, String name) {
		this.code = code;
		this.name = name;
		this.sortKey = sortKey;
	}

	/**
	 * 기능 : code 값 return
	 * <p>
	 * 2. 처리개요 :
	 * <p>
	 * 3. 주의사항 :
	 * <p>
	 * 
	 * @return String code 값
	 */
	public String getCode() {
		return this.code;
	}

	/**
	 * 기능 : code 명 return
	 * <p>
	 * 2. 처리개요 : getter method
	 * <p>
	 * 3. 주의사항 :
	 * <p>
	 * 
	 * @return String code 명
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * @return String
	 */
	public String getSortKey() {
		return sortKey;
	}

	/**
	 * @param sortKey
	 */
	public void setSortKey(String sortKey) {
		this.sortKey = sortKey;
	}

	/**
	 * 기능 : toString() 의 overriding 된 method
	 * 
	 * @return String model의 toString()
	 */
	public String toString() {
		StringBuffer ret = new StringBuffer();
		Field[] field = this.getClass().getDeclaredFields();
		String space = "                              ";
		for (int i = 0; i < field.length; i++) {

			String[] arr = null;
//			try {
			try {
				if ( field[i].get(this) instanceof Array){
					arr = (String[]) field[i].get(this);
				//} catch (Exception ex) {
				//	log.error(ex.getMessage(), ex);
				}else{
					arr = new String[1];
					arr[0] = String.valueOf(field[i].get(this));
				}
			} catch (IllegalArgumentException e1) {
				log.error(e1.getMessage(), e1);
			} catch (IllegalAccessException e1) {
				log.error(e1.getMessage(), e1);
			}catch ( Exception e){
				log.error(e.getMessage(), e);
			}
			//}

			if (arr != null) {
				for (int j = 0; j < arr.length; j++) {
					ret.append(field[i].getName().concat(space).substring(0, 30).concat("= ") + arr[j] + "\n");
				}
			} else {
				ret.append(field[i].getName() + " =  null \n");
			}
		}
		return ret.toString();
	}

	/** (non-Javadoc)
	 * 구현 메소드
	 * @param Object o
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 * @return int
	 */
	public int compareTo(Object o) {
		CodeInfo bean = (CodeInfo) o;
		//오름차순 정렬
		return (this.sortKey.compareTo( bean.sortKey));

	}

	/**
	 * @param code
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

}
