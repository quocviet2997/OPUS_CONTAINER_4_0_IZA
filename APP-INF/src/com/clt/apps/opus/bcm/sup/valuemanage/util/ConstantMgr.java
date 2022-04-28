/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : ConstantMgr.java
*@FileTitle : OPUS Constants Manager
*Open Issues :
*Change history :
*@LastModifyDate : 2011.02.10
*@LastModifier : 송민석
*@LastVersion : 1.0
* 2011.02.10 송민석
* 1.0 Creation
=========================================================*/
package com.clt.apps.opus.bcm.sup.valuemanage.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.clt.apps.opus.bcm.sup.valuemanage.basic.ValueManageBC;
import com.clt.apps.opus.bcm.sup.valuemanage.basic.ValueManageBCImpl;
import com.clt.apps.opus.bcm.sup.valuemanage.vo.SetupConstantListVO;
import com.clt.framework.core.layer.event.EventException;

/**
 * 상수 정보를 caching하고 그 정보를 관리한다. <br>
 *
 * @author Min Seok Song
 * @see ValueManageBC 
 * @since J2EE 1.6
 */
public class ConstantMgr {
	private static Map<String,String> constantMap = null;
	public final static String OPC_BASE_LOCATOIN = "OPC001";
	public final static String OPC_HEAD_OFFICE_CODE = "OPC002";
	public final static String OPC_COMPANY_CODE = "OPC003";
	public final static String OPC_SCAC_CODE = "OPC004";
	public final static String OPC_COMPANY_NAME = "OPC005";
	

	/**
	 * ConstantMgr 객체 생성<br>
	 * ConstantMgr의 instance 생성 방지하고 첫 loading시 DB정보를 cache함.<br>
	 */
	private ConstantMgr(){

	}
	
	static{
		constantMap = new HashMap<String,String>();
		try{
			ValueManageBC valueManageBC = new ValueManageBCImpl();
			List<SetupConstantListVO> list = valueManageBC.searchSetupConstantCodeList();
			int size = list.size();
			for(int i = 0 ; i < size ; i++ ){
				constantMap.put(list.get(i).getConsCd(), list.get(i).getConsValCtnt());
			}
		}catch(EventException e){
			
		}
		
	}
	private static String makeJSString(String key,String value){
		String opcValue = "var "+key+" = \""+value+"\";";
		return opcValue;
	}

	/**
	 * Local 시간을 계산하기 위해 기준시간 Location을 return한다.(OPC001) <br>
	 * EX ) KRSEL
	 * 
	 * @return String
	 * 
	 */	
	public static String getBaseLocationCode(){
		return constantMap.get(OPC_BASE_LOCATOIN);
	}
	
	/**
	 * Local 시간을 계산하기 위해 기준시간 Location을 Javascript 형태로  return한다. <br>
	 * EX) var OPC001 = "KRSEL";
	 * 
	 * @return String
	 * 
	 */	
	public static String getBaseLocationCodeToJS(){
		String v = getBaseLocationCode();
		String key = OPC_BASE_LOCATOIN;
		return makeJSString( key, v );
	}
	
	/**  
	 * tCode와 기준 Location이 일치 하는지 check한다. 
	 * 
	 * @param String tCode 비교 대상  Location Code
	 * @return boolean 일치 : true, 불일치 : false
	 */		
	public static boolean isBaseLocationCode(String tCode){
		boolean result = false;
		String opcValue = getBaseLocationCode();
		if( opcValue != null && opcValue.equals(tCode)){
			result = true;
		}
		return result;
	}	
	
	/**
	 * 본사 코드를 return한다.(OPC002) <br>
	 * EX) SELHO
	 * 
	 * @return String
	 * 
	 */	
	public static String getHeadOfficeCode(){
		return constantMap.get(OPC_HEAD_OFFICE_CODE);
	}
	
	
	/**
	 * 본사 코드를 Javascript 형태로 return한다. <br>
	 * EX) var OPC002 = "SELHO";
	 * 
	 * @return String
	 * 
	 */	
	public static String getHeadOfficeCodeToJS(){
		String v = getHeadOfficeCode();
		String key = OPC_HEAD_OFFICE_CODE;
		
		return makeJSString( key, v );
	}
		
	/**
	 * tCode와 본사 office code가 일치 하는지 check한다. 
	 * 
	 * @param String tCode 비교 대상  본사 office code
	 * @return boolean 일치 : true, 불일치 : false
	 */			
	public static boolean isHeadOfficeCode(String tCode){
		boolean result = false;
		String opcValue = getHeadOfficeCode();
		if( opcValue != null && opcValue.equals(tCode)){
			result = true;
		}		
		
		return result;
	}	
	
	/**
	 * 회사 Code(Carrier Code)를 return 한다.(OPC003 <br>
	 * EX) CLT
	 *  
	 * @return String
	 * 
	 */		
	public static String getCompanyCode(){
		return constantMap.get(OPC_COMPANY_CODE);
	}
	
	/**
	 * 회사 Code(Carrier Code)를 Javascript 형태로 return 한다. <br>
	 * EX) var OPC003 = "CLT";
	 * 
	 * @return String
	 * 
	 */		
	public static String getCompanyCodeToJS(){
		String v = getCompanyCode();
		String key = OPC_COMPANY_CODE;
		
		return makeJSString( key, v );		
	}	
	
	/**
	 * tCode와 회사 코드가 일치 하는지 check한다. 
	 * 
	 * @param String tCode 비교 대상 회사 코드가
	 * @return boolean 일치 : true, 불일치 : false
	 */			
	public static boolean isCompanyCode(String tCode){
		boolean result = false;
		String opcValue = getCompanyCode();
		if( opcValue != null && opcValue.equals(tCode)){
			result = true;
		}		
		
		return result;
	}			
	
	
	
	
	/**
	 * SCAC - SCAC - Standard Carrier Alpha Code를 return 한다.(OPC004) <br>
	 * EX) CLTC
	 *  
	 * @return String
	 * 
	 */		
	public static String getScacCode(){
		return constantMap.get(OPC_SCAC_CODE);
	}
	
	/**
	 * SCAC - SCAC - Standard Carrier Alpha Code를  Javascript 형태로 return 한다. <br>
	 * EX) var OPC004 = "CLTC";
	 * 
	 * @return String
	 * 
	 */		
	public static String getScacCodeToJS(){
		String v = getScacCode();
		String key = OPC_SCAC_CODE;
		
		return makeJSString( key, v );		
	}	
	
	/**
	 * tCode와 SCAC - SCAC - Standard Carrier Alpha Code가 일치 하는지 check한다. 
	 * 
	 * @param String tCode 비교 대상 회사 코드가
	 * @return boolean 일치 : true, 불일치 : false
	 */			
	public static boolean isScacCode(String tCode){
		boolean result = false;
		String opcValue = getScacCode();
		if( opcValue != null && opcValue.equals(tCode)){
			result = true;
		}		
		
		return result;
	}			
	

	
	
	/**
	 * 회사 이름를 return 한다.(OPC005) <br>
	 * EX) Cyberlogitec Shipping
	 *  
	 * @return String
	 * 
	 */		
	public static String getCompanyName(){
		return constantMap.get(OPC_COMPANY_NAME);
	}
	
	/**
	 * 회사 이름을 Javascript 형태로 return 한다. <br>
	 * EX) var OPC005 = "Cyberlogitec Shipping";
	 * 
	 * @return String
	 * 
	 */		
	public static String getCompanyNameToJS(){
		String v = getCompanyName();
		String key = OPC_COMPANY_NAME;
		
		return makeJSString( key, v );		
	}	
	
	/**
	 * tCode와 회사 코드가 일치 하는지 check한다. 
	 * 
	 * @param String tCode 비교 대상 회사 이름
	 * @return boolean 일치 : true, 불일치 : false
	 */			
	public static boolean isCompanyName(String tCode){
		boolean result = false;
		String opcValue = getCompanyName();
		if( opcValue != null && opcValue.equals(tCode)){
			result = true;
		}		
		
		return result;
	}			
	
	
	
	/**
	 * OPUS Constant Code에 해당하는 OPUS Constant Value를 return 한다. <br>
	 * 
	 * @return String
	 * 
	 */	
	public static String getValue(String opcCode){
		return constantMap.get(opcCode);
	}
	
	/**
	 * OPUS Constant Code에 해당하는 OPUS Constant Value를 javascript 형태로 return 한다. <br>
	 * 
	 * @return String
	 * 
	 */	
	public static String getValueToJS(String opcCode){
		return  makeJSString( opcCode, constantMap.get(opcCode) );
	}	
 
}
