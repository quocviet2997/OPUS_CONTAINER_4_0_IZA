/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : MDM_ACCOUNT.java
*@FileTitle : 사용자 관리5
*Open Issues :
*Change history :
*@LastModifyDate : 2007-01-12
*@LastModifier : Kildong_hong6
*@LastVersion : 1.0
* 2007-01-12 Kildong_hong6
* 1.0 최초 생성
=========================================================*/
package com.clt.syscommon.common.table;

import java.lang.reflect.Field;
import java.util.Collection;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;

import com.clt.framework.component.util.JSPUtil;

/**
 * Table Value Ojbect<br>
 * - 모든 업무에서 공통으로 사용하는 PDTO(Data Transfer Object including Parameters)<br>
 * - 관련 Event에서 작성, 서버실행요청시 PDTO의 역할을 수행하는 Value Object<br>
 * 
 * @author Kildong_hong6
 * @since J2EE 1.4
 */
public final class MdmAccount implements java.io.Serializable {

	private String               ibflag               = "";
	private String               page_rows            = "";
	private String               acct_cd              = "";
	private String               acct_eng_nm          = "";
	private String               acct_krn_nm          = "";
	private String               bud_if_flg           = "";
	private String               bud_use_flg          = "";
	private String               jnl_cre_flg          = "";
	private String               acctg_mng_tp_cd      = "";
	private String               pnd_tgt_flg          = "";
	private String               estm_tgt_flg         = "";
	private String               vvd_lvl_flg1         = "";
	private String               vvd_lvl_flg2         = "";
	private String               vvd_lvl_flg3         = "";
	private String               vvd_lvl_flg4         = "";
	private String               vvd_lvl_flg5         = "";
	private String               vvd_lvl_flg6         = "";
	private String               auto_curr_xch_rt_flg = "";
	private String               entr_expn_flg        = "";
	private String               cre_usr_id           = "";
	private String               cre_dt               = "";
	private String               upd_usr_id           = "";
	private String               upd_dt               = "";
	private String               delt_flg             = "";
	private String               eai_evnt_dt          = "";

	public MdmAccount(){}

	public MdmAccount(
			String               ibflag              ,
			String               page_rows           ,
			String               acct_cd             ,
			String               acct_eng_nm         ,
			String               acct_krn_nm         ,
			String               bud_if_flg          ,
			String               bud_use_flg         ,
			String               jnl_cre_flg         ,
			String               acctg_mng_tp_cd     ,
			String               pnd_tgt_flg         ,
			String               estm_tgt_flg        ,
			String               vvd_lvl_flg1        ,
			String               vvd_lvl_flg2        ,
			String               vvd_lvl_flg3        ,
			String               vvd_lvl_flg4        ,
			String               vvd_lvl_flg5        ,
			String               vvd_lvl_flg6        ,
			String               auto_curr_xch_rt_flg,
			String               entr_expn_flg       ,
			String               cre_usr_id          ,
			String               cre_dt              ,
			String               upd_usr_id          ,
			String               upd_dt              ,
			String               delt_flg            ,
			String               eai_evnt_dt         ){
		this.ibflag               = ibflag              ;
		this.page_rows            = page_rows           ;
		this.acct_cd              = acct_cd             ;
		this.acct_eng_nm          = acct_eng_nm         ;
		this.acct_krn_nm          = acct_krn_nm         ;
		this.bud_if_flg           = bud_if_flg          ;
		this.bud_use_flg          = bud_use_flg         ;
		this.jnl_cre_flg          = jnl_cre_flg         ;
		this.acctg_mng_tp_cd      = acctg_mng_tp_cd     ;
		this.pnd_tgt_flg          = pnd_tgt_flg         ;
		this.estm_tgt_flg         = estm_tgt_flg        ;
		this.vvd_lvl_flg1         = vvd_lvl_flg1        ;
		this.vvd_lvl_flg2         = vvd_lvl_flg2        ;
		this.vvd_lvl_flg3         = vvd_lvl_flg3        ;
		this.vvd_lvl_flg4         = vvd_lvl_flg4        ;
		this.vvd_lvl_flg5         = vvd_lvl_flg5        ;
		this.vvd_lvl_flg6         = vvd_lvl_flg6        ;
		this.auto_curr_xch_rt_flg = auto_curr_xch_rt_flg;
		this.entr_expn_flg        = entr_expn_flg       ;
		this.cre_usr_id           = cre_usr_id          ;
		this.cre_dt               = cre_dt              ;
		this.upd_usr_id           = upd_usr_id          ;
		this.upd_dt               = upd_dt              ;
		this.delt_flg             = delt_flg            ;
		this.eai_evnt_dt          = eai_evnt_dt         ;
	}

	// getter method is proceeding ..
	public String               getIbflag              (){	return ibflag              	;	}
	public String               getPage_rows           (){	return page_rows           	;	}
	public String               getAcct_cd             (){	return acct_cd             	;	}
	public String               getAcct_eng_nm         (){	return acct_eng_nm         	;	}
	public String               getAcct_krn_nm         (){	return acct_krn_nm         	;	}
	public String               getBud_if_flg          (){	return bud_if_flg          	;	}
	public String               getBud_use_flg         (){	return bud_use_flg         	;	}
	public String               getJnl_cre_flg         (){	return jnl_cre_flg         	;	}
	public String               getAcctg_mng_tp_cd     (){	return acctg_mng_tp_cd     	;	}
	public String               getPnd_tgt_flg         (){	return pnd_tgt_flg         	;	}
	public String               getEstm_tgt_flg        (){	return estm_tgt_flg        	;	}
	public String               getVvd_lvl_flg1        (){	return vvd_lvl_flg1        	;	}
	public String               getVvd_lvl_flg2        (){	return vvd_lvl_flg2        	;	}
	public String               getVvd_lvl_flg3        (){	return vvd_lvl_flg3        	;	}
	public String               getVvd_lvl_flg4        (){	return vvd_lvl_flg4        	;	}
	public String               getVvd_lvl_flg5        (){	return vvd_lvl_flg5        	;	}
	public String               getVvd_lvl_flg6        (){	return vvd_lvl_flg6        	;	}
	public String               getAuto_curr_xch_rt_flg(){	return auto_curr_xch_rt_flg	;	}
	public String               getEntr_expn_flg       (){	return entr_expn_flg       	;	}
	public String               getCre_usr_id          (){	return cre_usr_id          	;	}
	public String               getCre_dt              (){	return cre_dt              	;	}
	public String               getUpd_usr_id          (){	return upd_usr_id          	;	}
	public String               getUpd_dt              (){	return upd_dt              	;	}
	public String               getDelt_flg            (){	return delt_flg            	;	}
	public String               getEai_evnt_dt         (){	return eai_evnt_dt         	;	}

	// setter method is proceeding ..
	public void setIbflag              ( String               ibflag               ){	this.ibflag               = ibflag              	;	}
	public void setPage_rows           ( String               page_rows            ){	this.page_rows            = page_rows           	;	}
	public void setAcct_cd             ( String               acct_cd              ){	this.acct_cd              = acct_cd             	;	}
	public void setAcct_eng_nm         ( String               acct_eng_nm          ){	this.acct_eng_nm          = acct_eng_nm         	;	}
	public void setAcct_krn_nm         ( String               acct_krn_nm          ){	this.acct_krn_nm          = acct_krn_nm         	;	}
	public void setBud_if_flg          ( String               bud_if_flg           ){	this.bud_if_flg           = bud_if_flg          	;	}
	public void setBud_use_flg         ( String               bud_use_flg          ){	this.bud_use_flg          = bud_use_flg         	;	}
	public void setJnl_cre_flg         ( String               jnl_cre_flg          ){	this.jnl_cre_flg          = jnl_cre_flg         	;	}
	public void setAcctg_mng_tp_cd     ( String               acctg_mng_tp_cd      ){	this.acctg_mng_tp_cd      = acctg_mng_tp_cd     	;	}
	public void setPnd_tgt_flg         ( String               pnd_tgt_flg          ){	this.pnd_tgt_flg          = pnd_tgt_flg         	;	}
	public void setEstm_tgt_flg        ( String               estm_tgt_flg         ){	this.estm_tgt_flg         = estm_tgt_flg        	;	}
	public void setVvd_lvl_flg1        ( String               vvd_lvl_flg1         ){	this.vvd_lvl_flg1         = vvd_lvl_flg1        	;	}
	public void setVvd_lvl_flg2        ( String               vvd_lvl_flg2         ){	this.vvd_lvl_flg2         = vvd_lvl_flg2        	;	}
	public void setVvd_lvl_flg3        ( String               vvd_lvl_flg3         ){	this.vvd_lvl_flg3         = vvd_lvl_flg3        	;	}
	public void setVvd_lvl_flg4        ( String               vvd_lvl_flg4         ){	this.vvd_lvl_flg4         = vvd_lvl_flg4        	;	}
	public void setVvd_lvl_flg5        ( String               vvd_lvl_flg5         ){	this.vvd_lvl_flg5         = vvd_lvl_flg5        	;	}
	public void setVvd_lvl_flg6        ( String               vvd_lvl_flg6         ){	this.vvd_lvl_flg6         = vvd_lvl_flg6        	;	}
	public void setAuto_curr_xch_rt_flg( String               auto_curr_xch_rt_flg ){	this.auto_curr_xch_rt_flg = auto_curr_xch_rt_flg	;	}
	public void setEntr_expn_flg       ( String               entr_expn_flg        ){	this.entr_expn_flg        = entr_expn_flg       	;	}
	public void setCre_usr_id          ( String               cre_usr_id           ){	this.cre_usr_id           = cre_usr_id          	;	}
	public void setCre_dt              ( String               cre_dt               ){	this.cre_dt               = cre_dt              	;	}
	public void setUpd_usr_id          ( String               upd_usr_id           ){	this.upd_usr_id           = upd_usr_id          	;	}
	public void setUpd_dt              ( String               upd_dt               ){	this.upd_dt               = upd_dt              	;	}
	public void setDelt_flg            ( String               delt_flg             ){	this.delt_flg             = delt_flg            	;	}
	public void setEai_evnt_dt         ( String               eai_evnt_dt          ){	this.eai_evnt_dt          = eai_evnt_dt         	;	}

	public static MdmAccount fromRequest(HttpServletRequest request) {
		MdmAccount model = new MdmAccount();
		try {
			model.setIbflag              	(JSPUtil.getParameter(request, "ibflag              		".trim(), ""));
			model.setPage_rows           	(JSPUtil.getParameter(request, "page_rows           		".trim(), ""));
			model.setAcct_cd             	(JSPUtil.getParameter(request, "acct_cd             		".trim(), ""));
			model.setAcct_eng_nm         	(JSPUtil.getParameter(request, "acct_eng_nm         		".trim(), ""));
			model.setAcct_krn_nm         	(JSPUtil.getParameter(request, "acct_krn_nm         		".trim(), ""));
			model.setBud_if_flg          	(JSPUtil.getParameter(request, "bud_if_flg          		".trim(), ""));
			model.setBud_use_flg         	(JSPUtil.getParameter(request, "bud_use_flg         		".trim(), ""));
			model.setJnl_cre_flg         	(JSPUtil.getParameter(request, "jnl_cre_flg         		".trim(), ""));
			model.setAcctg_mng_tp_cd     	(JSPUtil.getParameter(request, "acctg_mng_tp_cd     		".trim(), ""));
			model.setPnd_tgt_flg         	(JSPUtil.getParameter(request, "pnd_tgt_flg         		".trim(), ""));
			model.setEstm_tgt_flg        	(JSPUtil.getParameter(request, "estm_tgt_flg        		".trim(), ""));
			model.setVvd_lvl_flg1        	(JSPUtil.getParameter(request, "vvd_lvl_flg1        		".trim(), ""));
			model.setVvd_lvl_flg2        	(JSPUtil.getParameter(request, "vvd_lvl_flg2        		".trim(), ""));
			model.setVvd_lvl_flg3        	(JSPUtil.getParameter(request, "vvd_lvl_flg3        		".trim(), ""));
			model.setVvd_lvl_flg4        	(JSPUtil.getParameter(request, "vvd_lvl_flg4        		".trim(), ""));
			model.setVvd_lvl_flg5        	(JSPUtil.getParameter(request, "vvd_lvl_flg5        		".trim(), ""));
			model.setVvd_lvl_flg6        	(JSPUtil.getParameter(request, "vvd_lvl_flg6        		".trim(), ""));
			model.setAuto_curr_xch_rt_flg	(JSPUtil.getParameter(request, "auto_curr_xch_rt_flg		".trim(), ""));
			model.setEntr_expn_flg       	(JSPUtil.getParameter(request, "entr_expn_flg       		".trim(), ""));
			model.setCre_usr_id          	(JSPUtil.getParameter(request, "cre_usr_id          		".trim(), ""));
			model.setCre_dt              	(JSPUtil.getParameter(request, "cre_dt              		".trim(), ""));
			model.setUpd_usr_id          	(JSPUtil.getParameter(request, "upd_usr_id          		".trim(), ""));
			model.setUpd_dt              	(JSPUtil.getParameter(request, "upd_dt              		".trim(), ""));
			model.setDelt_flg            	(JSPUtil.getParameter(request, "delt_flg            		".trim(), ""));
			model.setEai_evnt_dt         	(JSPUtil.getParameter(request, "eai_evnt_dt         		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		MdmAccount model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag               =  (JSPUtil.getParameter(request, "ibflag              		".trim(), length));
			String[] page_rows            =  (JSPUtil.getParameter(request, "page_rows           		".trim(), length));
			String[] acct_cd              =  (JSPUtil.getParameter(request, "acct_cd             		".trim(), length));
			String[] acct_eng_nm          =  (JSPUtil.getParameter(request, "acct_eng_nm         		".trim(), length));
			String[] acct_krn_nm          =  (JSPUtil.getParameter(request, "acct_krn_nm         		".trim(), length));
			String[] bud_if_flg           =  (JSPUtil.getParameter(request, "bud_if_flg          		".trim(), length));
			String[] bud_use_flg          =  (JSPUtil.getParameter(request, "bud_use_flg         		".trim(), length));
			String[] jnl_cre_flg          =  (JSPUtil.getParameter(request, "jnl_cre_flg         		".trim(), length));
			String[] acctg_mng_tp_cd      =  (JSPUtil.getParameter(request, "acctg_mng_tp_cd     		".trim(), length));
			String[] pnd_tgt_flg          =  (JSPUtil.getParameter(request, "pnd_tgt_flg         		".trim(), length));
			String[] estm_tgt_flg         =  (JSPUtil.getParameter(request, "estm_tgt_flg        		".trim(), length));
			String[] vvd_lvl_flg1         =  (JSPUtil.getParameter(request, "vvd_lvl_flg1        		".trim(), length));
			String[] vvd_lvl_flg2         =  (JSPUtil.getParameter(request, "vvd_lvl_flg2        		".trim(), length));
			String[] vvd_lvl_flg3         =  (JSPUtil.getParameter(request, "vvd_lvl_flg3        		".trim(), length));
			String[] vvd_lvl_flg4         =  (JSPUtil.getParameter(request, "vvd_lvl_flg4        		".trim(), length));
			String[] vvd_lvl_flg5         =  (JSPUtil.getParameter(request, "vvd_lvl_flg5        		".trim(), length));
			String[] vvd_lvl_flg6         =  (JSPUtil.getParameter(request, "vvd_lvl_flg6        		".trim(), length));
			String[] auto_curr_xch_rt_flg =  (JSPUtil.getParameter(request, "auto_curr_xch_rt_flg		".trim(), length));
			String[] entr_expn_flg        =  (JSPUtil.getParameter(request, "entr_expn_flg       		".trim(), length));
			String[] cre_usr_id           =  (JSPUtil.getParameter(request, "cre_usr_id          		".trim(), length));
			String[] cre_dt               =  (JSPUtil.getParameter(request, "cre_dt              		".trim(), length));
			String[] upd_usr_id           =  (JSPUtil.getParameter(request, "upd_usr_id          		".trim(), length));
			String[] upd_dt               =  (JSPUtil.getParameter(request, "upd_dt              		".trim(), length));
			String[] delt_flg             =  (JSPUtil.getParameter(request, "delt_flg            		".trim(), length));
			String[] eai_evnt_dt          =  (JSPUtil.getParameter(request, "eai_evnt_dt         		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new MdmAccount();
				model.setIbflag              		  (ibflag              	[i]);
				model.setPage_rows           		  (page_rows           	[i]);
				model.setAcct_cd             		  (acct_cd             	[i]);
				model.setAcct_eng_nm         		  (acct_eng_nm         	[i]);
				model.setAcct_krn_nm         		  (acct_krn_nm         	[i]);
				model.setBud_if_flg          		  (bud_if_flg          	[i]);
				model.setBud_use_flg         		  (bud_use_flg         	[i]);
				model.setJnl_cre_flg         		  (jnl_cre_flg         	[i]);
				model.setAcctg_mng_tp_cd     		  (acctg_mng_tp_cd     	[i]);
				model.setPnd_tgt_flg         		  (pnd_tgt_flg         	[i]);
				model.setEstm_tgt_flg        		  (estm_tgt_flg        	[i]);
				model.setVvd_lvl_flg1        		  (vvd_lvl_flg1        	[i]);
				model.setVvd_lvl_flg2        		  (vvd_lvl_flg2        	[i]);
				model.setVvd_lvl_flg3        		  (vvd_lvl_flg3        	[i]);
				model.setVvd_lvl_flg4        		  (vvd_lvl_flg4        	[i]);
				model.setVvd_lvl_flg5        		  (vvd_lvl_flg5        	[i]);
				model.setVvd_lvl_flg6        		  (vvd_lvl_flg6        	[i]);
				model.setAuto_curr_xch_rt_flg		  (auto_curr_xch_rt_flg	[i]);
				model.setEntr_expn_flg       		  (entr_expn_flg       	[i]);
				model.setCre_usr_id          		  (cre_usr_id          	[i]);
				model.setCre_dt              		  (cre_dt              	[i]);
				model.setUpd_usr_id          		  (upd_usr_id          	[i]);
				model.setUpd_dt              		  (upd_dt              	[i]);
				model.setDelt_flg            		  (delt_flg            	[i]);
				model.setEai_evnt_dt         		  (eai_evnt_dt         	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		MdmAccount model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag               =  (JSPUtil.getParameter(request, prefix + "ibflag              		".trim(), length));
			String[] page_rows            =  (JSPUtil.getParameter(request, prefix + "page_rows           		".trim(), length));
			String[] acct_cd              =  (JSPUtil.getParameter(request, prefix + "acct_cd             		".trim(), length));
			String[] acct_eng_nm          =  (JSPUtil.getParameter(request, prefix + "acct_eng_nm         		".trim(), length));
			String[] acct_krn_nm          =  (JSPUtil.getParameter(request, prefix + "acct_krn_nm         		".trim(), length));
			String[] bud_if_flg           =  (JSPUtil.getParameter(request, prefix + "bud_if_flg          		".trim(), length));
			String[] bud_use_flg          =  (JSPUtil.getParameter(request, prefix + "bud_use_flg         		".trim(), length));
			String[] jnl_cre_flg          =  (JSPUtil.getParameter(request, prefix + "jnl_cre_flg         		".trim(), length));
			String[] acctg_mng_tp_cd      =  (JSPUtil.getParameter(request, prefix + "acctg_mng_tp_cd     		".trim(), length));
			String[] pnd_tgt_flg          =  (JSPUtil.getParameter(request, prefix + "pnd_tgt_flg         		".trim(), length));
			String[] estm_tgt_flg         =  (JSPUtil.getParameter(request, prefix + "estm_tgt_flg        		".trim(), length));
			String[] vvd_lvl_flg1         =  (JSPUtil.getParameter(request, prefix + "vvd_lvl_flg1        		".trim(), length));
			String[] vvd_lvl_flg2         =  (JSPUtil.getParameter(request, prefix + "vvd_lvl_flg2        		".trim(), length));
			String[] vvd_lvl_flg3         =  (JSPUtil.getParameter(request, prefix + "vvd_lvl_flg3        		".trim(), length));
			String[] vvd_lvl_flg4         =  (JSPUtil.getParameter(request, prefix + "vvd_lvl_flg4        		".trim(), length));
			String[] vvd_lvl_flg5         =  (JSPUtil.getParameter(request, prefix + "vvd_lvl_flg5        		".trim(), length));
			String[] vvd_lvl_flg6         =  (JSPUtil.getParameter(request, prefix + "vvd_lvl_flg6        		".trim(), length));
			String[] auto_curr_xch_rt_flg =  (JSPUtil.getParameter(request, prefix + "auto_curr_xch_rt_flg		".trim(), length));
			String[] entr_expn_flg        =  (JSPUtil.getParameter(request, prefix + "entr_expn_flg       		".trim(), length));
			String[] cre_usr_id           =  (JSPUtil.getParameter(request, prefix + "cre_usr_id          		".trim(), length));
			String[] cre_dt               =  (JSPUtil.getParameter(request, prefix + "cre_dt              		".trim(), length));
			String[] upd_usr_id           =  (JSPUtil.getParameter(request, prefix + "upd_usr_id          		".trim(), length));
			String[] upd_dt               =  (JSPUtil.getParameter(request, prefix + "upd_dt              		".trim(), length));
			String[] delt_flg             =  (JSPUtil.getParameter(request, prefix + "delt_flg            		".trim(), length));
			String[] eai_evnt_dt          =  (JSPUtil.getParameter(request, prefix + "eai_evnt_dt         		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new MdmAccount();
				model.setIbflag              		  ( ibflag              	[i]);
				model.setPage_rows           		  ( page_rows           	[i]);
				model.setAcct_cd             		  ( acct_cd             	[i]);
				model.setAcct_eng_nm         		  ( acct_eng_nm         	[i]);
				model.setAcct_krn_nm         		  ( acct_krn_nm         	[i]);
				model.setBud_if_flg          		  ( bud_if_flg          	[i]);
				model.setBud_use_flg         		  ( bud_use_flg         	[i]);
				model.setJnl_cre_flg         		  ( jnl_cre_flg         	[i]);
				model.setAcctg_mng_tp_cd     		  ( acctg_mng_tp_cd     	[i]);
				model.setPnd_tgt_flg         		  ( pnd_tgt_flg         	[i]);
				model.setEstm_tgt_flg        		  ( estm_tgt_flg        	[i]);
				model.setVvd_lvl_flg1        		  ( vvd_lvl_flg1        	[i]);
				model.setVvd_lvl_flg2        		  ( vvd_lvl_flg2        	[i]);
				model.setVvd_lvl_flg3        		  ( vvd_lvl_flg3        	[i]);
				model.setVvd_lvl_flg4        		  ( vvd_lvl_flg4        	[i]);
				model.setVvd_lvl_flg5        		  ( vvd_lvl_flg5        	[i]);
				model.setVvd_lvl_flg6        		  ( vvd_lvl_flg6        	[i]);
				model.setAuto_curr_xch_rt_flg		  ( auto_curr_xch_rt_flg	[i]);
				model.setEntr_expn_flg       		  ( entr_expn_flg       	[i]);
				model.setCre_usr_id          		  ( cre_usr_id          	[i]);
				model.setCre_dt              		  ( cre_dt              	[i]);
				model.setUpd_usr_id          		  ( upd_usr_id          	[i]);
				model.setUpd_dt              		  ( upd_dt              	[i]);
				model.setDelt_flg            		  ( delt_flg            	[i]);
				model.setEai_evnt_dt         		  ( eai_evnt_dt         	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}

	// toString() method is overriding ..
	public String toString() {
		StringBuffer ret = new StringBuffer();
		Field[] field = this.getClass().getDeclaredFields();
		String space="                              ";
		try {
			for (int i = 0; i < field.length; i++) {
				String[] arr=null;
				try {
					arr = (String[]) field[i].get(this);
				}catch(Exception ex) {
					arr=new String[1];
					arr[0]=String.valueOf(field[i].get(this));
				}
				if (arr != null) {
					for (int j = 0; j < arr.length; j++) {
						ret.append(field[i].getName().concat(space).substring(0,30).concat("= ") + arr[j] +"\n");
					}
				} else {
					ret.append(field[i].getName() + " =  null \n");
				}
			}
		} catch (Exception ex) {}
		return ret.toString();
	}

}
