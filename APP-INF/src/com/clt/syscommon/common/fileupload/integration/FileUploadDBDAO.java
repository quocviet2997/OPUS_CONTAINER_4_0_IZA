/*========================================================
*Copyright(c) 2009 CyberLogitec
*ProcessChain    : NPI
*@FileName       : FileUploadDBDAO.java
*@FileTitle      : NIS2010
*Open Issues     :
*Change history  :
*@LastModifyDate : Apr 23, 2009
*@LastModifier   : Jeong-Hoon, KIM
*@LastVersion    : 1.0
=========================================================*/
package com.clt.syscommon.common.fileupload.integration;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

import com.clt.framework.component.databasedata.FileDatabaseData;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.core.config.SubSystemConfigFactory;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.db.SQLExecuter;
import com.clt.framework.support.layer.integration.DBDAOSupport;

/**
 * It's FileUploadDBDAO.java
 * @author Jeong-Hoon, KIM
 * @see 
 * @since J2EE 1.5
 * Apr 23, 2009
 */
public class FileUploadDBDAO extends DBDAOSupport{

	/**
	 * This method updates a File Meta Data. 
	 * @author Jeong-Hoon, KIM
	 * @param fileMetaData
	 * @param target
	 * @throws DAOException
	 */
	public void updateFileMetadata(FileDatabaseData fileMetaData, String target) throws DAOException {
		Map<String,String> mapParam = new HashMap<String,String>();
		Pattern regex = Pattern.compile("\\/"+SubSystemConfigFactory.get("TMP.MODULE.ID")+"\\/");
		try {
			mapParam.put("pgm_sub_sys_cd", target);
			mapParam.put("file_path_url", fileMetaData.getParentDirectoryPath().replaceAll(regex.pattern(), "/"+target+"/")+"/");
			mapParam.put("file_sav_id", fileMetaData.getFileSavId());
			new SQLExecuter("SysComDB").executeUpdate(new FileUploadDAOModulePathUSQL(), mapParam, null);
		} catch (SQLException e) {
			this.log.error("[SQLException]"+e.getMessage());
			throw new DAOException(new ErrorHandler(e).getMessage());
		} catch (DAOException e) {
			this.log.error("[DAOException]"+e.getMessage());
			throw new DAOException(new ErrorHandler(e).getMessage());
		} catch (Exception e) {
			this.log.error("[Exception]"+e.getMessage());
			throw new DAOException(new ErrorHandler(e).getMessage());
		}
	}

}
