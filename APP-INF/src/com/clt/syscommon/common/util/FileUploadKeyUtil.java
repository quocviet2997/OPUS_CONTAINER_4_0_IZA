/*========================================================
*Copyright(c) 2014 CyberLogitec
*ProcessChain    : NPI
*@FileName       : FileUploadKeyUtil.java
*@FileTitle      : 
*Open Issues     :
*Change history  :
*@LastModifyDate : 2015.01.20.
*@LastModifier   : SW, Jean
*@LastVersion    : 1.0
=========================================================*/

package com.clt.syscommon.common.util;

import java.util.List;

import com.clt.framework.core.layer.event.EventException;


/**
 * 
 * FileUploadKeyUtil.java
 * @author SW, Jean
 * @see 
 * @since J2SE 1.6
 * 2016. 1. 7.
 */
public class FileUploadKeyUtil 
{

	/**
	 * get FileSavId By FileName <br>
	 * 
	 * @param String fileNm
	 * @param List<String> keys

	 * @return String
	 * @exception EventException
	 */
	public static String  getFileSavIdByOriginName( String fileNm ,  List<String> keys) throws Exception {
		String retrunVal ="";
		String[] arrTemp =null;
		String savedFileName ="";
		String fileSavId=""; 
		
		try {
			
			 if( keys !=null && keys.size() > 0 && fileNm !=null && fileNm.length() > 0){
					for( String key : keys ){			
						arrTemp= key.split("/");			
						fileSavId= arrTemp[0];
						savedFileName= key.substring(fileSavId.length()+1, key.length());
									
						if(fileNm.equals(savedFileName)){
							retrunVal =fileSavId;
							break;
						}
						
					}
					
					// Key는  있는데, 찾지를 못한 경우는 Exception 발생
					  if( retrunVal ==null || retrunVal.length() < 1  )
						  throw new Exception("Exception : getFileSavIdByOriginName");			
				  }	
		} catch (Exception e) {
			// TODO: handle exception
			throw new Exception("Exception : getFileSavIdByOriginName");	
		}
		 
		  
		  return retrunVal;
		
	}
    
}

