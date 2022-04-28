/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : BizComException.java
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

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.clt.bizcommon.util.code.BizCodeInfo;
import com.clt.bizcommon.util.code.BizCodeManager;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.component.util.JStringTokenizer;
import com.clt.framework.component.util.code.CodeInfo;
import com.clt.framework.core.layer.integration.DAOException;


/**
 * 업무공통에서 사용하는 공통 코드 등을 구현<br>
 * @author Hyung Choon_Roh
 * @see 
 * @since J2EE 1.4 
 */
public final class BizComUtil {
	public static final String CODE_DELIMITTER = "|$$|" ;
		

	/**
	 * Constructor<br>
	 */
	public BizComUtil() {
	}

	/**
	 *  IBSheet 에서 Select List Box를 만드는 javascript 변수를 정의하여 return 
	 * @param tagName
	 *            자바스크립트에서 사용할 변수 이름
	 * @param sSelectedCode
	 *            선택된 코드
	 * @param jobCode
	 *            반환할 업무 대상
	 * @param sortKey
	 *            정렬순서( 0:정렬 안함,1:코드,2:코드명)
	 * @param addOption
	 *            추가할 option string
	 * @return
	 * @throws BizComException
	 */
	public static String getIBCodeCombo(String tagName, String sSelectedCode, String jobCode, int sortKey,
			String addOption) throws BizComException {
		StringBuffer sbText = new StringBuffer();
		StringBuffer sbValue = new StringBuffer();
		StringBuffer sbSelected = new StringBuffer();
		
		Collection codeList = BizCodeManager.getInstance().getCodeList(jobCode, sortKey);

		List<BizCodeInfo> totalList = new ArrayList<BizCodeInfo>();

		JStringTokenizer stringTokenizer = new JStringTokenizer(addOption, "|");

		while (stringTokenizer.hasMoreElements()) {
			String strCodeModel = (String) stringTokenizer.nextElement();
			
			JStringTokenizer stringTokenizer1 = new JStringTokenizer(strCodeModel, ":");
			BizCodeInfo codeModel = new BizCodeInfo();
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
			BizCodeInfo codeModel = (BizCodeInfo) iterator.next();
			totalList.add(codeModel);
		}

		if( 2 == sortKey){
			Collections.sort(totalList, new CodeComparator());
		}else{
			Collections.sort(totalList);
		}

		Iterator<BizCodeInfo> totalIterator = totalList.iterator();
		BizCodeInfo codeModel = null;

		if (totalIterator.hasNext()) {
			codeModel = totalIterator.next();
			sbText.append("var ").append(tagName).append("Text").append(" = \"");
			sbText.append(codeModel.getName());
			sbValue.append("var ").append(tagName).append("Code").append(" = \"");
			sbValue.append(codeModel.getCode());
			sbSelected.append("var ").append(tagName).append("Selected").append(" = \"");
			sbSelected.append(sSelectedCode);
		}

		while (totalIterator.hasNext()) {
			codeModel = totalIterator.next();
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
	 *  IBSheet 에서 Select List Box를 만드는 javascript 변수를 정의하여 return 
	 * @param tagName
	 *            자바스크립트에서 사용할 변수 이름
	 * @param sSelectedCode
	 *            선택된 코드
	 * @param jobCode
	 *            반환할 업무 대상
	 * @param sortKey
	 *            정렬순서( 0:정렬 안함,1:코드,2:코드명)
	 * @param addOption
	 *            추가할 option string
	 * @param where 
	 * @return
	 * @throws BizComException
	 */
	public static String getIBCodeCombo(String tagName, String sSelectedCode, String jobCode, int sortKey,
			String addOption, String where) throws BizComException {
		StringBuffer sbText = new StringBuffer();
		StringBuffer sbValue = new StringBuffer();
		StringBuffer sbSelected = new StringBuffer();

		Collection codeList = BizCodeManager.getInstance().getCodeList(jobCode, where, sortKey);

		List<BizCodeInfo> totalList = new ArrayList<BizCodeInfo>();

		JStringTokenizer stringTokenizer = new JStringTokenizer(addOption, "|");

		while (stringTokenizer.hasMoreElements()) {
			String strCodeModel = (String) stringTokenizer.nextElement();
			
			JStringTokenizer stringTokenizer1 = new JStringTokenizer(strCodeModel, ":");
			BizCodeInfo codeModel = new BizCodeInfo();
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
			BizCodeInfo codeModel = (BizCodeInfo) iterator.next();
			totalList.add(codeModel);
		}

		if( 2 == sortKey){
			Collections.sort(totalList, new CodeComparator());
		}else{
			Collections.sort(totalList);
		}

		Iterator<BizCodeInfo> totalIterator = totalList.iterator();
		BizCodeInfo codeModel = null;

		if (totalIterator.hasNext()) {
			codeModel = totalIterator.next();
			sbText.append("var ").append(tagName).append("Text").append(" = \"");
			sbText.append(codeModel.getName());
			sbValue.append("var ").append(tagName).append("Code").append(" = \"");
			sbValue.append(codeModel.getCode());
			sbSelected.append("var ").append(tagName).append("Selected").append(" = \"");
			sbSelected.append(sSelectedCode);
		}

		while (totalIterator.hasNext()) {
			codeModel = totalIterator.next();
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
	 * 코드값으로 코드 Value를 구하여 Return
	 * @param jobCode 
	 * @param code 
	 * @return 
	 * @throws BizComException
	 */
	public static String getCodeVal(String jobCode, String code) throws BizComException {
		
		String sRtn = "";
		
		sRtn = BizCodeManager.getInstance().getCodeVal(jobCode, code);
		
		return sRtn;
		
	}
	
	/**
	 * SELECT box HTML 코드를 return.
	 * 
	 * @param tagName Select List Box의 name
	 * @param sSelectedCode  선택된 코드
	 * @param sOptionalSelectTag  SELECT tag 에 선택적으로 추가할 element( onChange 이벤트등 )
	 * @param jobCode  반환할 업무 대상
	 * @param sortKey  정렬순서( 0:정렬 안함,1:코드,2:코드명)
	 * @param addOption 추가할 option string
	 * @return
	 * @throws BizComException
	 */
	public static String getCodeCombo(String tagName, String sSelectedCode, String sOptionalSelectTag, String jobCode,
			int sortKey, String addOption) throws BizComException {

		StringBuffer sb = new StringBuffer("");

		sb.append("<SELECT name = \"" + tagName + "\" " + sOptionalSelectTag + ">");

		Collection codeList = BizCodeManager.getInstance().getCodeList(jobCode, sortKey);

		List<BizCodeInfo> totalList = new ArrayList<BizCodeInfo>();

		JStringTokenizer stringTokenizer = new JStringTokenizer(addOption, "|");

		while (stringTokenizer.hasMoreElements()) {
			String strCodeModel = (String) stringTokenizer.nextElement();
			
			JStringTokenizer stringTokenizer1 = new JStringTokenizer(strCodeModel, ":");
			BizCodeInfo codeModel = new BizCodeInfo();
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
			BizCodeInfo codeModel = (BizCodeInfo) iterator.next();
			totalList.add(codeModel);
		}
		
		if( 2 == sortKey) {
			Collections.sort(totalList, new CodeComparator());
		}else{
			Collections.sort(totalList);
		}

		Iterator<BizCodeInfo> totalIterator = totalList.iterator();
		while (totalIterator.hasNext()) {
			BizCodeInfo codeModel = totalIterator.next();
			sb.append("\t\t<OPTION ");
			sb.append(sSelectedCode.equals(codeModel.getCode()) ? " selected " : " ");
			sb.append("value = \"" + codeModel.getCode() + "\"> " + codeModel.getName() + " </OPTION>\n");
		}

		sb.append("\t</SELECT>\n");

		return sb.toString();
	}
	
	/**
	 * SELECT box HTML 코드를 return.
	 * 
	 * @param tagName Select List Box의 name
	 * @param sSelectedCode  선택된 코드
	 * @param sOptionalSelectTag  SELECT tag 에 선택적으로 추가할 element( onChange 이벤트등 )
	 * @param jobCode  반환할 업무 대상
	 * @param sortKey  정렬순서( 0:정렬 안함,1:코드,2:코드명)
	 * @param addOption 추가할 option string
	 * @param where 
	 * @return
	 * @throws BizComException
	 */
	public static String getCodeCombo(String tagName, String sSelectedCode, String sOptionalSelectTag, String jobCode,
			int sortKey, String addOption, String where) throws BizComException {

		StringBuffer sb = new StringBuffer("");

		sb.append("<SELECT name = \"" + tagName + "\" " + sOptionalSelectTag + ">");
		
		Collection codeList = BizCodeManager.getInstance().getCodeList(jobCode, where, sortKey);

		List<BizCodeInfo> totalList = new ArrayList<BizCodeInfo>();

		JStringTokenizer stringTokenizer = new JStringTokenizer(addOption, "|");

		while (stringTokenizer.hasMoreElements()) {
			String strCodeModel = (String) stringTokenizer.nextElement();
			
			JStringTokenizer stringTokenizer1 = new JStringTokenizer(strCodeModel, ":");
			BizCodeInfo codeModel = new BizCodeInfo();
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
			BizCodeInfo codeModel = (BizCodeInfo) iterator.next();
			totalList.add(codeModel);
		}
		
		if( 2 == sortKey) {
			Collections.sort(totalList, new CodeComparator());
		}else{
			Collections.sort(totalList);
		}

		Iterator<BizCodeInfo> totalIterator = totalList.iterator();
		while (totalIterator.hasNext()) {
			BizCodeInfo codeModel = totalIterator.next();
			sb.append("\t\t<OPTION ");
			sb.append(sSelectedCode.equals(codeModel.getCode()) ? " selected " : " ");
			sb.append("value = \"" + codeModel.getCode() + "\"> " + codeModel.getName() + " </OPTION>");
		}

		sb.append("\t</SELECT>");
		return sb.toString();
	}
	
	/**
	 * CodeInfo List를 parsing하여 Select tag를 생성하기 위한 String을 생성한다.<br>
	 * ex) val1|val2|val3|$$|text1|text2|text3 <br>
	 *  CODE_DELIMITTER로 split하면 value string과 text string이 생성되고, 각각 string을 <br>
	 *  |로 split하면 string array로 반환받을 수 있다.
	 * 
	 * @param codeList Collection<CodeInfo>
	 * @return String
	 * @throws 
	 */
	public static String getCodeSelectString(Collection<CodeInfo> codeList){
		CodeInfo[] codelist1 = codeList.toArray(new CodeInfo[codeList.size()]);
		
	    StringBuilder itemComboText1 = new StringBuilder();
	    StringBuilder itemComboValue1 = new StringBuilder();
		
	    
	    for (int i = 0; i < codelist1.length; i++) {
	        if (i != 0) {
	        	itemComboText1.append("|");
	            itemComboValue1.append("|");
	        }
	        itemComboValue1.append(codelist1[i].getCode());
	        itemComboText1.append(codelist1[i].getName());
	    }
	    return itemComboValue1  +CODE_DELIMITTER + itemComboText1;
	}
	
	/**
	 * 
	 * @param request
	 * @return
	 * @throws Exception 
	 */
	public static String getRequestParameteToString(HttpServletRequest request) throws Exception {
		StringBuilder stringBuilder = new StringBuilder();
		Enumeration<?> keys = request.getParameterNames();
		while(keys.hasMoreElements()){
			String key = (String)keys.nextElement();
			String value = String.valueOf(request.getParameter(key));
			try {
				stringBuilder.append((key != null ? key : ""));
				stringBuilder.append("=");
				stringBuilder.append(value != null ? value : "");
			} catch (Exception e) {
				//log.error(e.getMessage(),e);
				throw new Exception(new ErrorHandler(e).getMessage());	// Add R4J Modify, 2017-11-07, YC Shin				
			}
		}
		return stringBuilder.toString();
	}
}
