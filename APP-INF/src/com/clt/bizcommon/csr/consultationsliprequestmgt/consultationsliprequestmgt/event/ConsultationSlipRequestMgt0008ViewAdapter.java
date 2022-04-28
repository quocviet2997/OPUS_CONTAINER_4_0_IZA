/*=========================================================
*Copyright(c) 2008 CyberLogitec
*@FileName : ConsultationSlipRequestMgtViewAdapter.java
*@FileTitle : Default IBSheet Generation Class
*Open Issues :
*Change history :
*@LastModifyDate : 2009-06-12
*@LastModifier : 함 대성
*@LastVersion : 1.0
* 2009-06-12 함 대성
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.event;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.clt.framework.component.common.AbstractValueObject;
import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.component.util.JSPUtil;
import com.clt.framework.core.controller.ViewAdapter;

/**
 * 2DataRows를 위한 ViewAdapter<br>
 * - 조회한 한개의 row를 두row의 xml로 넘긴다.<br>
 *
 * @author Park Hee Dong
 * @see DefaultViewAdapter 참조
 * @since J2EE 1.6
 */
public class ConsultationSlipRequestMgt0008ViewAdapter extends ViewAdapter {
	/**
	 * VO List를 Parsing하여 <Data>태그 부분의 XML문자열을 반환한다.<br>
	 * 
	 * @param vos List<AbstractValueObject> List 객체
	 * @param colOrder String[] Column명 문자열 
	 * @param prefix String IBSheet savename's prefix
	 * @return String <Data>태그 부분의 XML문자열
	 * @exception 
	 */	
	protected String makeDataTag(List<AbstractValueObject> vos, String prefix) {
		StringBuilder sbufXML = new StringBuilder();
		
		int totCnt = vos.size();
		int realCnt = vos.size();

		AbstractValueObject vo = (AbstractValueObject)vos.get(0);
		String[] realColNms = {"csr_no","vndr_no","inv_desc","if_status","if_dt","if_err_rsn","rqst_usr_id","rqst_usr_nm","apro_usr_id","apro_usr_nm","no_of_inv","csr_curr_cd","csr_amt","due_dt","pay_grp_lu_cd","attr_ctnt2","iss_dt","rcv_dt","vndr_term_nm","aft_act_flg","if_flg","rcv_err_flg","tml_inv_sts_cd","tml_inv_rjct_sts_cd","apro_rqst_no","cost_ofc_cd"};
		
		if(vo.getMaxRows()>0){
			totCnt = vo.getMaxRows();
		}
		
		/**
		 * 변수선언
		 */
		String invCurrCd  = "";
		String cellFormat = "";

		//sbufXML.append("<DATA " + "COLSEPARATOR='" + DELIMITER + "' TOTAL='" + totCnt +"'>\n");
		sbufXML.append("<DATA TOTAL='" + totCnt +"'>\n");

		for(int i=0;i<realCnt;i++){
			Map<String, String> colValues = vos.get(i).getColumnValues();
			
			sbufXML.append("<TR>");
				sbufXML.append("<TD><![CDATA[]]></TD>\n");	//그리드빈값
			for (int j = 0 ; j < 22 ; j++) {
				if(j==7){
					invCurrCd = JSPUtil.getNull(colValues.get(realColNms[j]));
					
					if(invCurrCd.equals("KRW")||invCurrCd.equals("JPY")){	//||invCurrCd.equals("TWD")
						cellFormat = "DATA-FORMAT=\"dfInteger\" POINT-COUNT=\"0\" "; //0 --> 소숫점 이하 자리수
					}else{
						cellFormat = "DATA-FORMAT=\"dfNullFloat\" POINT-COUNT=\"2\" "; //2 --> 소숫점 이하 자리수
					}
				}
				if(j==8){ 
					sbufXML.append("<TD "+cellFormat+"><![CDATA[");
						sbufXML.append(JSPUtil.getNull(colValues.get(realColNms[j])));
					sbufXML.append("]]></TD>\n");
				}else{
					sbufXML.append("<TD><![CDATA[");
						sbufXML.append(JSPUtil.getNull(colValues.get(realColNms[j])));
					sbufXML.append("]]></TD>\n");
				}
			}
			sbufXML.append("</TR>\n");
			
			invCurrCd = "";
			
		}
		
		sbufXML.append("</DATA>\n");
		
		return sbufXML.toString();
	}

	/**
	 * DBRowSet를 Parsing하여 <DATA>태그를 생성한다.<br>
	 * IBSheet의 prefix값이 있는 경우 COLORDER에 prefix를 붙인 column명으로 표시해 준다.<br>
	 * 
	 * @param rs DBRowSet 		VO객체
	 * @param prefix String 		IBSheet savename's prefix string
	 * @return String IBSheet 		<DATA>태그
	 * @exception 
	 */
	protected String makeDataTag(DBRowSet rs,String prefix) {
		StringBuilder sb = new StringBuilder();
		
		//Pivot Table인 경우 makePivotDataTag 실행하여  return한
		if(rs.isPivot()){
			sb.append(makePivotDataTag(rs));
			return sb.toString();
		}

		String[] realColNms = getColHeader(rs);

		try{
			String[] changedColNms = getChangedColNms(realColNms, prefix);
			
			sb.append("<DATA COLORDER='" + JSPUtil.convertStringArrayToString(changedColNms, "|") + "' COLSEPARATOR='" + DELIMITER + "' TOTAL='" + getRowSetCnt(rs) + "'>\n");
			
			int colCount = realColNms.length;
			
			while (rs.next()) { 
				sb.append("	<TR><![CDATA[");
				for (int j = 1 ; j < colCount ; j++) {
					sb.append(JSPUtil.getNull(rs.getObject(j)) + DELIMITER);
				}	
				sb.append(JSPUtil.getNull(rs.getObject(colCount))  + "]]></TR>\n");
			}
			sb.append("</DATA>\n");
		}catch(SQLException ex){
			throw new RuntimeException(ex.getMessage());
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new RuntimeException(ex.getMessage());
		}
		return sb.toString();
	}

	/**
	 * Pivot Table용 Data tag를 생성한다.<br>
	 * 
	 * @param rs			DBRowSet 		VO객체
	 * @return String 	IBSheet 			<DATA>태그
	 * @exception 
	 */
	protected String makePivotDataTag(DBRowSet rs) {
		StringBuilder sb = new StringBuilder();
		int colCnt = 0;
		int rowCnt = rs.getRowCount();
		
		String[][] arrRowSet = null;

		try{
			colCnt = rs.getMetaData().getColumnCount();
			arrRowSet = new String[rowCnt][colCnt];
			
			int rowIdx = 0;
			while (rs.next()) { 
				for (int j = 1 ; j <= colCnt ; j++) {
					arrRowSet[rowIdx][j-1] = JSPUtil.getNull(rs.getObject(j)).toString();
				}
				rowIdx++;
			}
		
	
			sb.append("<DATA COLSEPARATOR='" + DELIMITER + "'>\n");
			if(rowCnt>0){
				for (int coIdx = 0 ;coIdx < colCnt ; coIdx++) {
					sb.append("	<TR><![CDATA[");
					for(int roIdx=0;roIdx < rowCnt-1; roIdx++){
						sb.append(arrRowSet[roIdx][coIdx] + DELIMITER);
					}
					sb.append(arrRowSet[rowCnt-1][coIdx]  + "]]></TR>\n");
				}//end for coIdx
			}//end for roIdx
			sb.append("</DATA>\n");
			
		}catch(SQLException ex){
			log.error(ex.getMessage(),ex);
			throw new RuntimeException(ex.getMessage());
		

		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new RuntimeException(ex.getMessage());
		}
		return sb.toString();
	}

}
