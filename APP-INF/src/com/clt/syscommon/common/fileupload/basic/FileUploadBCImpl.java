/*========================================================
*Copyright(c) 2009 CyberLogitec
*ProcessChain    : NPI
*@FileName       : FileUploadBCImpl.java
*@FileTitle      : NIS2010
*Open Issues     :
*Change history  :
*@LastModifyDate : Apr 22, 2009
*@LastModifier   : Jeong-Hoon, KIM
*@LastVersion    : 1.0
=========================================================*/
package com.clt.syscommon.common.fileupload.basic;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.regex.Pattern;

import com.clt.framework.component.databasedata.FileDatabaseData;
import com.clt.framework.component.util.file.FileTools;
import com.clt.framework.core.config.SubSystemConfigFactory;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;
import com.clt.syscommon.common.fileupload.integration.FileUploadDBDAO;

/**
 * It's FileUploadBCImpl.java
 * @author Jeong-Hoon, KIM
 * @see 
 * @since J2EE 1.5
 * Apr 22, 2009
 */
public class FileUploadBCImpl extends BasicCommandSupport implements FileUploadBC {
	
	/**
	 * File Upload 시 File을 이동시키는 Method<br>
	 * @author Jeong-Hoon, KIM
	 * @param keys
	 * @param target
	 * @throws EventException
	 */
	public void moveUploadFile(List<String> keys, String target) throws EventException {
		if(target!=null && !"".equalsIgnoreCase(target)){
			for(String key:keys){
				FileDatabaseData fileMetaData;
				try {
					fileMetaData = new FileDatabaseData(key);
					Pattern regex = Pattern.compile("\\/"+SubSystemConfigFactory.get("TMP.MODULE.ID")+"\\/");
					FileTools.move(fileMetaData.getRealFileFullPath(), fileMetaData.getRealFileFullPath().replaceAll(regex.pattern(), "/"+target+"/"));
					FileUploadDBDAO fileUploadDBDAO = new FileUploadDBDAO();
					fileUploadDBDAO.updateFileMetadata(fileMetaData, target);
				} catch (IOException e) {
					this.log.error("[IOException]" + e);
					throw new EventException("[IOException]" + e);
				} catch (SQLException e) {
					this.log.error("[SQLException]" + e);
					throw new EventException("[SQLException]" + e);
				} catch (DAOException e) {
					this.log.error("[DAOException]" + e);
					throw new EventException("[DAOException]" + e);
				} catch (Exception e) {
					this.log.error("[Exception]" + e);
					throw new EventException("[Exception]" + e);
				}
			}
		}
	}

}
