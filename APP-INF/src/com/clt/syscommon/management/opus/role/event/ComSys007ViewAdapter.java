/*=========================================================
*Copyright(c) 2008 CyberLogitec
*@FileName : COM_SYS_007ViewAdapter.java
*@FileTitle : Sample ViewAdapter
*Open Issues :
*Change history :
*@LastModifyDate : 2008-11-24
*@LastModifier : Lee SeungYol
*@LastVersion : 1.0
* 2008-11-24 Lee SeungYol
* 1.0 최초 생성
=========================================================*/
package com.clt.syscommon.management.opus.role.event;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.clt.framework.component.common.AbstractValueObject;
import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.component.util.JSPUtil;
import com.clt.framework.core.controller.ViewAdapter;

/**
 * COM_SYS_007  ViewAdapter<br>
 * - IBSheet 용 XML을 생성한다.)<br>
 * 
 * @author SEUNGYOL LEE
 * @see
 * @since J2EE 1.4
 */
public class ComSys007ViewAdapter extends ViewAdapter{

	/**
	 * Make xml string through parsing DBRowSet<br>
	 * @param rs			DBRowSet
	 * @param prefix 		String
	 * @return String
	 * @throws 
	 */	
	public String makeDataTag(DBRowSet rs,String prefix) {
		StringBuilder sb = new StringBuilder();
		String[] realColNms = getColHeader(rs);

		try{
			String[] changedColNms = getChangedColNms(realColNms, prefix);
			
			sb.append("	<DATA COLORDER='" + JSPUtil.convertStringArrayToString(changedColNms, DELIMITER) + "' COLSEPARATOR='" + DELIMITER + "' TOTAL='" + getRowSetCnt(rs) + "'>\n");
			
			while (rs.next()) { 
				Object lvl = JSPUtil.getNull(rs.getObject("level"));
				sb.append("	<TR LEVEL='" + lvl +"'><![CDATA[");
				sb.append(JSPUtil.getNull(rs.getObject("usr_role_desc")) + DELIMITER);
				sb.append(JSPUtil.getNull(rs.getObject("ibflag")) + DELIMITER);
				sb.append(JSPUtil.getNull(rs.getObject("status")) + DELIMITER);
				sb.append(JSPUtil.getNull(rs.getObject("delcheck")) + DELIMITER);
				sb.append(JSPUtil.getNull(rs.getObject("prog_assign")) + DELIMITER);
				sb.append(JSPUtil.getNull(rs.getObject("lvl")) + DELIMITER);
				sb.append(JSPUtil.getNull(rs.getObject("usr_role_nm")) + DELIMITER);
				sb.append(JSPUtil.getNull(rs.getObject("cre_dt")) + DELIMITER);
				sb.append(JSPUtil.getNull(rs.getObject("prnt_usr_role_cd")) + DELIMITER);
				sb.append(JSPUtil.getNull(rs.getObject("user_assign")) + DELIMITER);
				sb.append(JSPUtil.getNull(rs.getObject("pagerows")) + DELIMITER);
				sb.append(JSPUtil.getNull(rs.getObject("usr_role_cd"))  + "]]></TR>\n");
			}
			sb.append("	</DATA>\n");
		}catch(SQLException ex){
			throw new RuntimeException(ex.getMessage());
		}catch(Exception ex){
			throw new RuntimeException(ex.getMessage());
		}
		return sb.toString();
	}

	/**
	 * Make xml string through parsing VO List<br>
	 * @param List<AbstractValueObject> vos
	 * @param String prefix
	 * @return String
	 * @throws 
	 */	
	public String makeDataTag(List<AbstractValueObject> vos, String prefix) {
		StringBuilder sbufXML = new StringBuilder();
		
		int totCnt = vos.size();
		AbstractValueObject vo = (AbstractValueObject)vos.get(0);
		String[] realColNms=getColHeader(vo);
		
		String[] changedColNms = getChangedColNms(realColNms, prefix);
		
		 String colorder = JSPUtil.convertStringArrayToString(changedColNms, DELIMITER);
		 colorder = JSPUtil.replace(colorder, prefix+"level" +DELIMITER,"");
		 
		sbufXML.append("<DATA COLORDER='" + colorder + "' COLSEPARATOR='" + DELIMITER + "' TOTAL='" + totCnt +"'>\n");

		for(int i=0;i<totCnt;i++){
			Map<String, String> colValues = vos.get(i).getColumnValues();
			
			sbufXML.append("	<TR LEVEL='" + colValues.get("level") +"'><![CDATA[");
			sbufXML.append(JSPUtil.getNull(colValues.get("ibflag")) + DELIMITER);
			sbufXML.append(JSPUtil.getNull(colValues.get("user_assign")) + DELIMITER);
			sbufXML.append(JSPUtil.getNull(colValues.get("prog_assign")) + DELIMITER);
			sbufXML.append(JSPUtil.getNull(colValues.get("status")) + DELIMITER);
			sbufXML.append(JSPUtil.getNull(colValues.get("delcheck")) + DELIMITER);
			sbufXML.append(JSPUtil.getNull(colValues.get("usr_role_nm")) + DELIMITER);
			sbufXML.append(JSPUtil.getNull(colValues.get("lvl")) + DELIMITER);
			sbufXML.append(JSPUtil.getNull(colValues.get("usr_role_desc")) + DELIMITER);
			sbufXML.append(JSPUtil.getNull(colValues.get("cre_dt")) + DELIMITER);
			sbufXML.append(JSPUtil.getNull(colValues.get("prnt_usr_role_cd")) + DELIMITER);
			sbufXML.append(JSPUtil.getNull(colValues.get("pagerows")) + DELIMITER);
			sbufXML.append(JSPUtil.getNull(colValues.get("usr_role_cd")) + "]]></TR>\n");
		}
		sbufXML.append("</DATA>\n");
		
		return sbufXML.toString();
	}
}
