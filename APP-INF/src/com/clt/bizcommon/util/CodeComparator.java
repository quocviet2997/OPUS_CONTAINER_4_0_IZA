/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : CodeComparator.java
*@FileTitle : 공통
*Open Issues :
*Change history :
*@LastModifyDate : 2006-10-31
*@LastModifier : Hyung Choon_Roh
*@LastVersion : 1.0
* 2006-10-31 Hyung Choon_Roh
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.util;

import java.util.Comparator;

import com.clt.bizcommon.util.code.BizCodeInfo;

/**
 * 업무공통에서 사용하는 공통 코드 등을 구현<br>
 * @author Hyung Choon_Roh
 * @see 
 * @since J2EE 1.4
 */
public class CodeComparator implements Comparator {
	
	/**
	 * Code 비교<br>
	 * 
	 * @param Object o1
	 * @param Object o2
	 * @return int
	 */
	public int compare(Object o1, Object o2) {
		return ((BizCodeInfo) o1).getName().compareTo(((BizCodeInfo) o2).getName());
	}
}