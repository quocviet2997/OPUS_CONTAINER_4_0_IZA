/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : SortKeyComparator.java
*@FileTitle : 시스템코드 소트 키 비교자
*Open Issues :
*Change history :
*@LastModifyDate : 2006-12-13
*@LastModifier : SeongWook Kim
*@LastVersion : 1.0
* 2006-12-13 SeongWook Kim
* 1.0 최초 생성
=========================================================*/
package com.clt.syscommon.management.opus.pgmcode;

import java.util.Comparator;

/**
 * 클래스 개요 : 시스템코드 소트 키 비교자
 * <p>
 * 작성일 : 2006.12.17.
 * @see CodeInfo,CodeUtil 참조
 * @since J2EE 1.4
 * @version 1.0
 * @author  김성욱
 */
public class SortKeyComparator implements Comparator<Object> {
	/** (non-Javadoc)
	 * @param Object o1
	 * @param Object o2
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 * @return int
	 */
	public int compare(Object o1, Object o2) {
		return ((CodeInfo) o1).getSortKey().compareTo(((CodeInfo) o2).getSortKey());
	}
}
