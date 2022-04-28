/*========================================================
*Copyright(c) 2009 CyberLogitec
*ProcessChain    : NPI
*@FileName       : MailBC.java
*@FileTitle      : NIS2010
*Open Issues     :
*Change history  :
*@LastModifyDate : 2009. 4. 6.
*@LastModifier   : Jeong-Hoon, KIM
*@LastVersion    : 1.0
=========================================================*/
package com.clt.syscommon.common.mail.basic;

import java.sql.SQLException;

import com.clt.framework.component.javamail.MailerAppException;
import com.clt.framework.component.rdexport.ReportDesignerExportException;
import com.clt.framework.component.rdmail.RDMailSendException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.syscommon.common.mail.vo.MailCustomVO;

/**
 * It's MailBC.java
 * @author Jeong-Hoon, KIM
 * @see 
 * @since J2EE 1.5
 * 2009. 4. 6.
 */
public interface MailBC {

	String doMail(MailCustomVO mailCustomVO) throws MailerAppException, RDMailSendException, ReportDesignerExportException, SQLException, DAOException;

}
