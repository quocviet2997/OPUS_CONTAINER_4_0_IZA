/*=========================================================
 *Copyright(c) 2015 CyberLogitec
 *@FileName : RemoveUTF8BOMUtil.java
 *@FileTitle : RemoveUTF8BOMUtil
 *Open Issues :
 *Change history :
 *@LastModifyDate : 2015.10.22
 *@LastModifier : 김용후
 *@LastVersion : 1.0
 * 2015.10.22 김용후
 * 1.0 최초 생성
=========================================================*/
package com.clt.syscommon.common.util;

/**
 * 
 * RemoveUTF8BOMUtil.java
 * @author 김용후
 * @see 
 * @since J2SE 1.6
 * 2015.10.22
 */
public class RemoveUTF8BOMUtil {
		public static final String UTF8_BOM = "\uFEFF";
 
		/**
		 * 
		 * removeUTF8BOM
		 * @author 김용후
		 * @param s
		 * @return String
		 */
		public String removeUTF8BOM(String s) {
		    if (s.startsWith(UTF8_BOM)) {
		        s = s.substring(1);
		    }
		    return s;
		}
}
