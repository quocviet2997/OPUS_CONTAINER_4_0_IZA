/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : OfficeCodeMgr.java
*@FileTitle : OPUS Constants Manager
*Open Issues :
*Change history :
*@LastModifyDate : 2011.02.11
*@LastModifier : 송민석
*@LastVersion : 1.0
* 2011.02.11 송민석
* 1.0 Creation
=========================================================*/
package com.clt.apps.opus.bcm.sup.valuemanage.util;

import java.util.ArrayList;
import java.util.List;

import com.clt.apps.opus.bcm.sup.valuemanage.basic.ValueManageBC;
import com.clt.apps.opus.bcm.sup.valuemanage.basic.ValueManageBCImpl;
import com.clt.apps.opus.bcm.sup.valuemanage.vo.GroupOfficeListVO;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.core.layer.event.EventException;
import com.clt.syscommon.common.table.MdmOfcGrpVO;

/**
 * Office 정보를 관리한다. <br>
 *
 * @author Min Seok Song
 * @see ValueManageBC 
 * @since J2EE 1.6
 */
public class OfficeCodeMgr {
	
	private static ValueManageBC valueManageBC;
 
 
	static {
		valueManageBC = new ValueManageBCImpl();
	}
	
	/**
	 * OfficeCodeMgr 객체 생성<br>
	 * OfficeCodeMgr의 instance 생성 방지 <br>
	 */
	private  OfficeCodeMgr(){
		 
	}
	
	/**
	 * Office Group Code에 해당하는 Office Code List를 return한다.. <br>
	 * 
	 * @param String ofcGrpCd Office Group Code
	 * @param String subSysCd Sub-system Code
	 * @return List<String>
	 * 
	 */	
	public static List<String> getOfficeCodeList(String ofcGrpCd, String subSysCd) throws EventException {
		List<String> list = new ArrayList<String>();
		MdmOfcGrpVO mdmOfcGrpVO = new MdmOfcGrpVO();
		mdmOfcGrpVO.setOfcGrpId(ofcGrpCd );
		mdmOfcGrpVO.setSubSysCd(subSysCd);
		try{
			List<GroupOfficeListVO> officeList = valueManageBC.searchGroupOfficeList( mdmOfcGrpVO);
			int size = officeList.size();
			for(int i = 0 ; i < size ; i++ ){
				list.add(officeList.get(i).getOfcCd());
			}
		}catch(EventException e){
			throw new EventException(new ErrorHandler(e).getMessage(), e);
		}
		
		return list;
	}
	
	/**
	 *  Office Group Code에 해당하는 Office Code List를 Javascript의 JSon 형태로 return한다.. <br>
	 * 
	 * @param String ofcGrpCd Office Group Code
	 * @param String subSysCd Sub-system Code
	 * @return String
	 * 
	 */	
	public static String getOfficeCodeListToJS(String ofcGrpCd, String subSysCd) throws EventException {
		List<String> list = getOfficeCodeList( ofcGrpCd, subSysCd);
		StringBuffer script = new StringBuffer();
		int size = list.size();
		/*
		 * var GRP_000001_VSK = {"SUB_SYS_CD":"VSK", "OFC_CD_LIST":[ "SELBB","SELBA" ] };
		 */
		script.append("var GRP_").append(ofcGrpCd).append("_").append(subSysCd);
		script.append(" = {\"SUB_SYS_CD\":\"").append(subSysCd).append("\",\"OFC_CD_LIST\":[");
		for(int i = 0 ; i < size ; i++){
			if( i != 0 ){
				script.append(",");
			}
			script.append("\"").append(list.get(i)).append("\"");
		}
		script.append("]};");
		
		
		return script.toString();
	}	
	
	/**
	 * office group에 param ofcCd가 속해 있는지 확인한다. <br>
	 * 
	 * @param ofcGrpCd String
	 * @param subSysCd String
	 * @param ofcCd String
	 * @return boolean
	 */
	public static boolean checkContainOfficeCode(String ofcGrpCd, String subSysCd, String ofcCd) throws EventException {
		List<String> list = getOfficeCodeList( ofcGrpCd, subSysCd);
		boolean check = list.contains(ofcCd);
		return check ;
	}	
	
	
}
