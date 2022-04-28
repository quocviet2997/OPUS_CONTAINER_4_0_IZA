/*========================================================
*Copyright(c) 2009 CyberLogitec
*ProcessChain    : NPI
*@FileName       : MailBCImpl.java
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
import com.clt.framework.support.layer.basic.BasicCommandSupport;
import com.clt.syscommon.common.mail.integration.MailEAIDAO;
import com.clt.syscommon.common.mail.vo.MailCustomVO;

/**
 * It's MailBCImpl.java
 * @author Jeong-Hoon, KIM
 * @see 
 * @since J2EE 1.5
 * 2009. 4. 6.
 */
public class MailBCImpl extends BasicCommandSupport implements MailBC {

	/**
	 * Mail 을 전송한다.<br>
	 * @param mailCustomVO	MailCustomVO
	 * @return String
	 * @throws MailerAppException
	 * @throws RDMailSendException 
	 * @throws DAOException 
	 * @throws SQLException 
	 * @throws ReportDesignerExportException 
	 */	
	public String doMail(MailCustomVO mailCustomVO) throws MailerAppException, RDMailSendException, ReportDesignerExportException, SQLException, DAOException {
		MailEAIDAO mailEAIDAO = new MailEAIDAO();
		return mailEAIDAO.doMail(mailCustomVO);
	}
	
}
