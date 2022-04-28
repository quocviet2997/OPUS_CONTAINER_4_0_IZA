/*========================================================
*Copyright(c) 2009 CyberLogitec
*ProcessChain    : NPI
*@FileName       : SampleBackEndBCImpl.java
*@FileTitle      : NIS2010
*Open Issues     :
*Change history  :
*@LastModifyDate : 2009. 4. 21.
*@LastModifier   : Jeong-Hoon, KIM
*@LastVersion    : 1.0
=========================================================*/
package com.clt.sample.backendjob.thread.basic;

import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.support.layer.backend.BackEndCommandSupport;
import com.clt.sample.backendjob.thread.integer.BackEndJobSampleDBDAO;

/**
 * It's SampleBackEndBCImpl.java
 * @author Jeong-Hoon, KIM
 * @see 
 * @since J2EE 1.5
 * 2009. 4. 21.
 */
public class BackEndJobSampleJob extends BackEndCommandSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3034414164961318353L;

	/**
	 * BackEndJob Sample BC
	 */
	public String doStart() throws Exception {
		BackEndJobSampleDBDAO backEndJobSampleDBDAO = new BackEndJobSampleDBDAO();
		DBRowSet rowSet = backEndJobSampleDBDAO.searchMdmVandor();
		return String.valueOf(rowSet.getRowCount());
	}

}
