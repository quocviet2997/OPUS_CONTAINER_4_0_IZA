/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : ModuleMgr.java
*@FileTitle : OPUS Module Manager
*Open Issues :
*Change history :
*@LastModifyDate : 2013.07.15
*@LastModifier :  kjy
*@LastVersion : 1.0
* 2013.07.15 kjy
* 1.0 Creation
=========================================================*/
package com.clt.apps.opus.bcm.sup.valuemanage.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.clt.apps.opus.bcm.sup.valuemanage.basic.ValueManageBC;
import com.clt.apps.opus.bcm.sup.valuemanage.basic.ValueManageBCImpl;
import com.clt.apps.opus.bcm.sup.valuemanage.vo.SetupModuleVO;
import com.clt.framework.core.layer.event.EventException;

/**
 * <br>
 *
 * @author  Jong Yun Kyoung
 * @see ValueManageBC 
 * @since J2EE 1.6
 */
public class ModuleMgr {
	private static Map<String,String> moduleMap = null;
	public final static String MODULE_COM ="COM";
	public final static String MODULE_MDA ="MDA";
	public final static String MODULE_FIN ="FIN";
	public final static String MODULE_SUP ="SUP";
	public final static String MODULE_CNI ="CNI";
	public final static String MODULE_GEM ="GEM";
	public final static String MODULE_CGM ="CGM";
	public final static String MODULE_CIM ="CIM";
	public final static String MODULE_CTM ="CTM";
	public final static String MODULE_DMT ="DMT";
	public final static String MODULE_EQR ="EQR";
	public final static String MODULE_LSE ="LSE";
	public final static String MODULE_MNR ="MNR";
	public final static String MODULE_MST ="MST";
	public final static String MODULE_PRD ="PRD";
	public final static String MODULE_SCE ="SCE";
	public final static String MODULE_TES ="TES";
	public final static String MODULE_TPB ="TPB";
	public final static String MODULE_TRS ="TRS";
	public final static String MODULE_AGT ="AGT";
	public final static String MODULE_BKG ="BKG";
	public final static String MODULE_BSA ="BSA";
	public final static String MODULE_COA ="COA";
	public final static String MODULE_FMS ="FMS";
	public final static String MODULE_PRI ="PRI";
	public final static String MODULE_SAQ ="SAQ";
	public final static String MODULE_SPC ="SPC";
	public final static String MODULE_INV ="INV";
	public final static String MODULE_JOO ="JOO";
	public final static String MODULE_OPF ="OPF";
	public final static String MODULE_PSO ="PSO";
	public final static String MODULE_SCG ="SCG";
	public final static String MODULE_VSK ="VSK";	
	

	/**
	 * ConstantMgr 객체 생성<br>
	 * ConstantMgr의 instance 생성 방지하고 첫 loading시 DB정보를 cache함.<br>
	 */
	private ModuleMgr(){

	}
	
	static{
		moduleMap = new HashMap<String,String>();
		try{
			ValueManageBC valueManageBC = new ValueManageBCImpl();
			List<SetupModuleVO> list = valueManageBC.searchSetupModuleList();
			int size = list.size();
			for(int i = 0 ; i < size ; i++ ){
				moduleMap.put(list.get(i).getPgmSubSysCd(), list.get(i).getAplyFlg());
			}
		}catch(EventException e){
			
		}
		
	}
	private static String makeJSString(String key,String value){
		String opcValue = "var is"+key+" = \""+value+"\";";
		return opcValue;
	}

	/**
	 * BKG 모듈 사용 유무 값을  return한다. <br>
	 * EX) Y / N
	 * 
	 * @return String
	 * 
	 */	
	public static String getUsed(String module){
		return moduleMap.get(module);
	}
	
	/**
	 * 모듈의 사용 유무를 Javascript 형태로 return한다. <br>
	 * EX) var isBKG = "Y";
	 * 
	 * @return String
	 * 
	 */	
	public static String getUsedToJS(String module){
		String v = getUsed(module);
		String key = module;
		return makeJSString( key, v );
	}
	
	/**
	 * BKG module의 사용 유무를 리턴한다. 
	 * 
	 * @param String module 모듈 코드
	 * @return boolean 사용 : true, 사용안함 : false
	 */			
	public static boolean isUsed(String module){
		boolean result = true;
		String opcValue = getUsed(module);
		
		if( opcValue == null || "N".equals(opcValue.toUpperCase())){
			result = false;
		} 
		
		return result;
	}	
	

}
