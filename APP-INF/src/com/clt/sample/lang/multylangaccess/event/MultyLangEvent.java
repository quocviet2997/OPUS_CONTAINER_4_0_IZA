package com.clt.sample.lang.multylangaccess.event;

import com.clt.framework.core.layer.event.Event;
import com.clt.framework.support.layer.event.EventSupport;
import com.clt.syscommon.common.table.ComUserVO;

public class MultyLangEvent extends EventSupport implements Event{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private ComUserVO comUserVO = null;

	private ComUserVO[] comUserVOs = null;
	
	
	

	public ComUserVO[] getComUserVOs() {
		return comUserVOs;
	}


	public void setComUserVOs(ComUserVO[] comUserVOs) {
		this.comUserVOs = comUserVOs;
	}


	public ComUserVO getComUserVO() {
		return comUserVO;
	}


	public void setComUserVO(ComUserVO comUserVO) {
		this.comUserVO = comUserVO;
	}
	
	
	
}
