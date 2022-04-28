/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : PgmCdUtil.java
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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.clt.framework.component.util.JStringTokenizer;


/**
 * 클래스 개요
 * <p>
 * jsp에서 기본적으로 사용하는 Util method 모음 각 method는 static 이므로, JSPUTil.methodXXX() 로 호출하여 사용한다. <br>
 * JSPUtil의 method 는 크게 Request, 문자열 변환, HTML, Date 그리고, math 관련 method로 구성되어 있다.
 * 
 * 작성일 : 2006.12.17.
 * @see CodeInfo,CodeUtil 참조
 * @since J2EE 1.4
 * @version 1.0
 * @author  김성욱
 */
public final class PgmCdUtil {

	private static transient org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(PgmCdUtil.class);

	/**
	 *  IBSheet 에서 Select List Box를 만드는 javascript 변수를 정의하여 return 
	 * @param tagName
	 *            자바스크립트에서 사용할 변수 이름
	 * @param sSelectedCode
	 *            선택된 코드
	 * @param mainCode
	 *            반환할 업무 대상
	 * @param sortKey
	 *            정렬순서( 0:정렬 안함,1:코드,2:코드명)
	 * @param addOption
	 *            추가할 option string
	 * @return
	 * @throws CodeException
	 */
	public static String getIBCodeCombo(String tagName, String sSelectedCode, String mainCode, int sortKey,
			String addOption) throws CodeException {
		StringBuffer sbText = new StringBuffer();
		StringBuffer sbValue = new StringBuffer();
		
		log.debug(sSelectedCode);

		Collection codeList = CodeUtil.getInstance().geIBSheetSelectBox(mainCode, sortKey);

		List totalList = new ArrayList();

		JStringTokenizer stringTokenizer = new JStringTokenizer(addOption, "|");
		//System.out.println("count:::" + stringTokenizer.countTokens());

		while (stringTokenizer.hasMoreElements()) {
			String strCodeModel = (String) stringTokenizer.nextElement();
			//System.out.println("strCodeModel:::" + strCodeModel);
			JStringTokenizer stringTokenizer1 = new JStringTokenizer(strCodeModel, ":");
			CodeInfo codeModel = new CodeInfo();
			while (stringTokenizer1.hasMoreElements()) {
				if (stringTokenizer1.hasMoreTokens()) {
					codeModel.setSortKey(((String) stringTokenizer1.nextToken()).trim());
				} else {
					codeModel.setSortKey("");
				}
				if (stringTokenizer1.hasMoreTokens()) {
					codeModel.setCode(((String) stringTokenizer1.nextToken()).trim());
				} else {
					codeModel.setCode("");
				}
				if (stringTokenizer1.hasMoreTokens()) {
					codeModel.setName(((String) stringTokenizer1.nextToken()).trim());
				} else {
					codeModel.setName("");
				}
			}
			totalList.add(codeModel);

		}

		Iterator iterator = codeList.iterator();
		while (iterator.hasNext()) {
			CodeInfo codeModel = (CodeInfo) iterator.next();
			totalList.add(codeModel);
		}

		//System.out.println(totalList);
		//System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");


//		if( 2 == sortKey){
//			Collections.sort(totalList, new CodeComparator());
//		}else{
			Collections.sort(totalList, new SortKeyComparator());
//		}

		// Collections.sort(totalList, new CodeComparator());
		//System.out.println(totalList);

		Iterator totalIterator = totalList.iterator();
		CodeInfo codeModel = null;

		if (totalIterator.hasNext()) {
			codeModel = (CodeInfo) totalIterator.next();
			sbText.append("var ").append(tagName).append("Text").append(" = \"");
			sbText.append(codeModel.getName());
			sbValue.append("var ").append(tagName).append("Code").append(" = \"");
			sbValue.append(codeModel.getCode());
		}

		while (totalIterator.hasNext()) {
			codeModel = (CodeInfo) totalIterator.next();
			sbText.append("|");
			sbText.append(codeModel.getName());
			sbValue.append("|");
			sbValue.append(codeModel.getCode());
		}

		if (sbText.length() > 0) {
			sbText.append("\";");
			sbValue.append("\";");
		}

		return sbText.append("\n").append(sbValue).toString();
	}

	/**
	 * SELECT box HTML 코드를 return.
	 * 
	 * @param tagName Select List Box의 name
	 * @param sSelectedCode  선택된 코드
	 * @param sOptionalSelectTag  SELECT tag 에 선택적으로 추가할 element( onChange 이벤트등 )
	 * @param mainCode  반환할 업무 대상
	 * @param sortKey  정렬순서( 0:정렬 안함,1:코드,2:코드명)
	 * @param addOption 추가할 option string
	 * @return
	 * @throws CodeException
	 */
	public static String getCodeCombo(String tagName, String sSelectedCode, String sOptionalSelectTag, String mainCode,
			int sortKey, String addOption) throws CodeException {

		//System.out.println("getMainSelectBox++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

		StringBuffer sb = new StringBuffer("");

		sb.append("<SELECT name = \"" + tagName + "\" " + sOptionalSelectTag + ">");

		Collection codeList = CodeUtil.getInstance().getCodeSelect(mainCode, sortKey);

		List totalList = new ArrayList();

		JStringTokenizer stringTokenizer = new JStringTokenizer(addOption, "|");
		//System.out.println("count:::" + stringTokenizer.countTokens());

		while (stringTokenizer.hasMoreElements()) {
			String strCodeModel = (String) stringTokenizer.nextElement();
			//System.out.println("strCodeModel:::" + strCodeModel);
			JStringTokenizer stringTokenizer1 = new JStringTokenizer(strCodeModel, ":");
			CodeInfo codeModel = new CodeInfo();
			while (stringTokenizer1.hasMoreElements()) {

				if (stringTokenizer1.hasMoreTokens()) {
					codeModel.setSortKey( ((String) stringTokenizer1.nextToken()).trim());
				} else {
					codeModel.setSortKey("");
				}
				if (stringTokenizer1.hasMoreTokens()) {
					codeModel.setCode(((String) stringTokenizer1.nextToken()).trim());
				} else {
					codeModel.setCode("");
				}
				if (stringTokenizer1.hasMoreTokens()) {
					codeModel.setName(((String) stringTokenizer1.nextToken()).trim());
				} else {
					codeModel.setName("");
				}
			}
			totalList.add(codeModel);

		}

		Iterator iterator = codeList.iterator();
		while (iterator.hasNext()) {
			CodeInfo codeModel = (CodeInfo) iterator.next();
			totalList.add(codeModel);
		}

		//System.out.println(totalList);
//		if( 2 == sortKey) {
//			Collections.sort(totalList, new CodeComparator());
//		}else{
		Collections.sort(totalList, new SortKeyComparator());
//		}

		//
		//System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		//System.out.println(totalList);

		Iterator totalIterator = totalList.iterator();
		while (totalIterator.hasNext()) {
			CodeInfo codeModel = (CodeInfo) totalIterator.next();
			sb.append("\t<OPTION ");
			sb.append(sSelectedCode.equals(codeModel.getCode()) ? " selected " : " ");
			sb.append("value=\"" + codeModel.getCode() + "\"> " + codeModel.getName() + "</OPTION>\n");
		}

		sb.append("</SELECT>");

		return sb.toString();
	}

}// end of class
