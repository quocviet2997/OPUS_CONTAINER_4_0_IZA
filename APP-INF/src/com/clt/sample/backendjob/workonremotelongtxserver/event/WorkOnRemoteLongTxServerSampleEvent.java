/*========================================================
*Copyright(c) 2009 CyberLogitec
*ProcessChain    : NPI
*@FileName       : BackEndJoSampleEvent.java
*@FileTitle      : NIS2010
*Open Issues     :
*Change history  :
*@LastModifyDate : 2009. 4. 21.
*@LastModifier   : Jeong-Hoon, KIM
*@LastVersion    : 1.0
=========================================================*/
package com.clt.sample.backendjob.workonremotelongtxserver.event;

import com.clt.framework.support.layer.event.EventSupport;
import com.clt.framework.table.ComBakEndJbVO;

/**
 * It's BackEndJobSampleEvent.java
 * @author Jeong-Hoon, KIM
 * @see 
 * @since J2EE 1.5
 * May 25, 2009
 */
public class WorkOnRemoteLongTxServerSampleEvent extends EventSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2562752731757290309L;
	
	/** Table Value Object 조회 조건 및 단건 처리  */
	private ComBakEndJbVO comBakEndJbVO = null;

	public WorkOnRemoteLongTxServerSampleEvent(){}
	
	public void setComBakEndJbVO(ComBakEndJbVO comBakEndJbVO){
		this. comBakEndJbVO = comBakEndJbVO;
	}

	public ComBakEndJbVO getComBakEndJbVO(){
		return comBakEndJbVO;
	}

	
	
}
