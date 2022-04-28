/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : BizCodeInfo.java
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

import java.lang.reflect.Field;


/**
 * 클래스 개요 : 업무공통에서 사용할 공통 함수 모음<br>
 *
 * @author Hyung Choon_Roh
 * @see ComEns091EventResponse 참조
 * @since J2EE 1.4
 */
public class BizCodeInfo implements java.io.Serializable, Comparable {

	private static transient org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(BizCodeInfo.class);
	
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
	 * 1. 기능 : CodeInfo 생성자
	 * <p>
	 * 2. 처리개요 :
	 * <p> - CodeInfo 객체를 생성
	 * <p>
	 * 3. 주의사항 :
	 * <p>
	 * 
	 */
	public BizCodeInfo() {
	}

	/**
	 * 1. 기능 : CodeInfo 생성자
	 * <p>
	 * 2. 처리개요 :
	 * <p> - code값, code명을 받아 모델 setting
	 * <p>
	 * 3. 주의사항 :
	 * <p>
	 * @param String sortKey 
	 * @param String code
	 * @param String name
	 */
	public BizCodeInfo(String sortKey, String code, String name) {
		this.code = code;
		this.name = name;
		this.sortKey = sortKey;
	}

	/**
	 * 1. 기능 : code 값 return
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
	 * 1. 기능 : code 명 return
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
	 * @return
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
	 * 1. 기능 : toString() 의 overriding 된 method
	 * 
	 * @return String model의 toString()
	 */
	public String toString() {
		StringBuffer ret = new StringBuffer();
		Field[] field = this.getClass().getDeclaredFields();
		String space = "                              ";
		try {
			for (int i = 0; i < field.length; i++) {
				String[] arr = null;
				
				if(field[i].get(this) instanceof String[]) {
					arr = (String[]) field[i].get(this);
				} else {
					arr = new String[1];
					arr[0] = String.valueOf(field[i].get(this));
				}
				if (arr != null) {
					for (int j = 0; j < arr.length; j++) {
						ret.append(field[i].getName().concat(space).substring(0, 30).concat("= ") + arr[j] + "\n");
					}
				} else {
					ret.append(field[i].getName() + " =  null \n");
				}
			}
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
		}
		return ret.toString();
	}

	/**
	 * @param Object o
	 * @return int 
	 */
	public int compareTo(Object o) {
		BizCodeInfo bean = (BizCodeInfo) o;
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
