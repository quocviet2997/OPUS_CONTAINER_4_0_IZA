/*=========================================================
*Copyright(c) 2008 CyberLogitec
*@FileName : ConsultationSlipRequestMgtViewAdapter.java
*@FileTitle : Default IBSheet Generation Class
*Open Issues :
*Change history :
*@LastModifyDate : 2009-06-12
*@LastModifier : Park Hee-dong
*@LastVersion : 1.0
* 2009-06-12 Park Hee-dong
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.approval.event;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.clt.framework.component.common.AbstractValueObject;
import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.component.util.JSPUtil;
import com.clt.framework.core.controller.DefaultViewAdapter;
import com.clt.framework.core.controller.ViewAdapter;

/**
 * 2DataRows를 위한 ViewAdapter<br>
 * - 조회한 한개의 row를 두row의 xml로 넘긴다.<br>
 *
 * @author Park Hee Dong
 * @see DefaultViewAdapter 참조
 * @since J2EE 1.6
 */
public class CsrAmountLimitViewAdapter extends ViewAdapter {
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
		String[] realColNms = {"apro_rqst_no","crnt_apro_seq","apro_rqst_seq","apsts_cd","sub_sys_cd","rqst_st_dt","cost_ofc_cd","csr_no","inv_knt","vndr_seq","pay_due_dt","curr_cd","apro_ttl_amt","attr_ctnt2","asa_curr_cd","asa_xch_rt","asa_ttl_amt","apro_rmk","appyn", "dp_prcs_knt"};
		
		
		if(vo.getMaxRows()>0){
			totCnt = vo.getMaxRows();
		}
		
		/**
		 * 변수선언
		 */
		String invCurrCd  = "";
		String cellFormat = "";

		sbufXML.append("<DATA TOTAL='" + totCnt +"'>\n");

		for(int i=0;i<realCnt;i++){
			Map<String, String> colValues = vos.get(i).getColumnValues();
			
			sbufXML.append("<TR>");
				sbufXML.append("<TD><![CDATA[]]></TD>\n");	//그리드빈값
				sbufXML.append("<TD><![CDATA[]]></TD>\n");	//그리드빈값
			for (int j = 0 ; j < realColNms.length ; j++) {
				if(j==10){
					invCurrCd = JSPUtil.getNull(colValues.get(realColNms[j]));
					
					if(invCurrCd.equals("KRW")||invCurrCd.equals("JPY")){
						cellFormat = "DATA-FORMAT=\"dfInteger\" POINT-COUNT=\"0\" "; //0 --> 소숫점 이하 자리수
					}else{
						cellFormat = "DATA-FORMAT=\"dfNullFloat\" POINT-COUNT=\"2\" "; //2 --> 소숫점 이하 자리수
					}
				}
				if(j==11){ 
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
		int rowCnt = 0;
		
		try{
			rowCnt = getRowSetCnt(rs);
			String[] realColNms = getColHeader(rs);
			int colCount = realColNms.length;
			/**
			 * 변수선언
			 */
			ArrayList<String> arrTag = new ArrayList<String>();
			int iRhqTag = 0;
			int iRhqTmpTag = 0;
			String tmpRhq = "";
			int iRhq = 1;
			boolean bPauseRhq = false;
			
			int iOfcTag = 0;
			int iOfcTmpTag = 0;
			String tmpOfc = "";
			int iOfc = 1;
			boolean bPauseOfc = false;
			
			arrTag.add("<DATA TOTAL='"+rowCnt+"'>\n");
//			arrTag.add("<DATA COLORDER='" + JSPUtil.convertStringArrayToString(changedColNms, "|") + "' COLSEPARATOR='" + DELIMITER + "' TOTAL='" + getRowSetCnt(rs) + "'>\n");
			while (rs.next()) {
				arrTag.add("<TR>");
				arrTag.add("<TD><![CDATA[]]></TD>\n");	//그리드빈값
				arrTag.add("<TD><![CDATA[]]></TD>\n");	//그리드빈값
				
				for (int i = 1 ; i <= colCount ; i++) {
					String tmp = JSPUtil.getNull(rs.getObject(i)).toString();
					if(i==2) {
						if(tmpRhq.equals(tmp)) {
							iRhq++;
							arrTag.add("<TD><![CDATA[");
							arrTag.add(tmp);
							arrTag.add("]]></TD>\n");
						} else {
							if(!"".equals(tmpRhq)) {
								bPauseRhq = true;
								iRhqTag = iRhqTmpTag;
							}
							arrTag.add("<TD ROWSPAN='");
							iRhqTmpTag = arrTag.size();
							arrTag.add("");//replace rowspan
							arrTag.add("'><![CDATA[");
							arrTag.add(tmp);
							arrTag.add("]]></TD>\n");
							tmpRhq = tmp;//set
						}
					} else if(i==3) {
						if(tmpOfc.equals(tmp)) {
							iOfc++;
							arrTag.add("<TD><![CDATA[");
							arrTag.add(tmp);
							arrTag.add("]]></TD>\n");
						} else {
							if(!"".equals(tmpOfc)) {
								bPauseOfc = true;
								iOfcTag = iOfcTmpTag;
							}
							arrTag.add("<TD ROWSPAN='");
							iOfcTmpTag = arrTag.size();
							arrTag.add("");//replace rowspan
							arrTag.add("'><![CDATA[");
							arrTag.add(tmp);
							arrTag.add("]]></TD>\n");
							tmpOfc = tmp;//set
						}
					} else {
						arrTag.add("<TD ROWSPAN='1'><![CDATA[");
						arrTag.add(tmp);
						arrTag.add("]]></TD>\n");
					}
					if(bPauseRhq) {
						arrTag.set(iRhqTag, String.valueOf(iRhq));
						iRhq = 1;
						iRhqTag = 0;
						bPauseRhq = false;
					}
					if(bPauseOfc) {
						arrTag.set(iOfcTag, String.valueOf(iOfc));
						iOfc = 1;
						iOfcTag = 0;
						bPauseOfc = false;
					}
				}
				arrTag.add("</TR>\n");
			}
			arrTag.add("</DATA>\n");
			if(iRhqTmpTag > 0) {
				arrTag.set(iRhqTmpTag, String.valueOf(iRhq));
			}
			if(iOfcTmpTag > 0) {
				arrTag.set(iOfcTmpTag, String.valueOf(iOfc));
			}
			for(int j=0;j<arrTag.size();j++) {
				sb.append(arrTag.get(j));
			}
		}catch(SQLException ex){
			throw new RuntimeException(ex.getMessage());
		}catch(Exception ex){
			log.error(ex.getMessage(),ex);
			throw new RuntimeException(ex.getMessage());
		}
		return sb.toString();
	}

}
