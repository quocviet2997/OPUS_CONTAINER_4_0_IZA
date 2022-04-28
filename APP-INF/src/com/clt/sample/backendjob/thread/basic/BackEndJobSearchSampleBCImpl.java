package com.clt.sample.backendjob.thread.basic;

import com.clt.framework.component.backend.core.BackEndJobManager;
import com.clt.framework.support.view.signon.SignOnUserAccount;

public class BackEndJobSearchSampleBCImpl implements BackEndJobSearchSampleBC{

	@Override
	public String doStart(SignOnUserAccount account) {
		BackEndJobSampleJob job = new BackEndJobSampleJob();
		BackEndJobManager mnger = new BackEndJobManager();
		return mnger.execute(job, account.getCre_usr_id(), "BackEndJob Test");
	}

}
