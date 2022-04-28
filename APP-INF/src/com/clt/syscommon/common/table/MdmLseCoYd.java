/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : MDM_LSE_CO_YD.java
*@FileTitle : 사용자 관리5
*Open Issues :
*Change history :
*@LastModifyDate : 2007-09-04
*@LastModifier : Kim Jin-seung
*@LastVersion : 1.1
* 2007-02-28 Kildong_hong6
* 1.0 최초 생성
* 2007-09-04 Kim Jin-seung
* 1.1 수정 : lse_co_vndr_seq11 ~ lse_co_vndr_seq20 칼럼 추가
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
public final class MdmLseCoYd implements java.io.Serializable {

	private String            ibflag            = "";
	private String            page_rows         = "";
	private String            lse_co_yd_cd      = "";
	private String            lse_co_yd_nm      = "";
	private String            onf_hir_yd_flg    = "";
	private String            yd_addr           = "";
	private String            intl_phn_no       = "";
	private String            phn_no            = "";
	private String            fax_no            = "";
	private String            yd_pic_nm         = "";
	private String            yd_eml            = "";
	private String            lse_co_vndr_seq1  = "";
	private String            lse_co_vndr_seq2  = "";
	private String            lse_co_vndr_seq3  = "";
	private String            lse_co_vndr_seq4  = "";
	private String            lse_co_vndr_seq5  = "";
	private String            lse_co_vndr_seq6  = "";
	private String            lse_co_vndr_seq7  = "";
	private String            lse_co_vndr_seq8  = "";
	private String            lse_co_vndr_seq9  = "";
	private String            lse_co_vndr_seq10 = "";
	private String            lse_co_vndr_seq11  = "";
	private String            lse_co_vndr_seq12  = "";
	private String            lse_co_vndr_seq13  = "";
	private String            lse_co_vndr_seq14  = "";
	private String            lse_co_vndr_seq15  = "";
	private String            lse_co_vndr_seq16  = "";
	private String            lse_co_vndr_seq17  = "";
	private String            lse_co_vndr_seq18  = "";
	private String            lse_co_vndr_seq19  = "";
	private String            lse_co_vndr_seq20 = "";
	private String            cre_usr_id        = "";
	private String            cre_dt            = "";
	private String            upd_usr_id        = "";
	private String            upd_dt            = "";
	private String            delt_flg          = "";
	private String 			  eai_evnt_dt	    = "";
	private String 			  eai_if_id		    = "";

	public MdmLseCoYd(){}

	public MdmLseCoYd(
			String            ibflag           ,
			String            page_rows        ,
			String            lse_co_yd_cd     ,
			String            lse_co_yd_nm     ,
			String            onf_hir_yd_flg   ,
			String            yd_addr          ,
			String            intl_phn_no      ,
			String            phn_no           ,
			String            fax_no           ,
			String            yd_pic_nm        ,
			String            yd_eml           ,
			String            lse_co_vndr_seq1 ,
			String            lse_co_vndr_seq2 ,
			String            lse_co_vndr_seq3 ,
			String            lse_co_vndr_seq4 ,
			String            lse_co_vndr_seq5 ,
			String            lse_co_vndr_seq6 ,
			String            lse_co_vndr_seq7 ,
			String            lse_co_vndr_seq8 ,
			String            lse_co_vndr_seq9 ,
			String            lse_co_vndr_seq10,
			String            lse_co_vndr_seq11 ,
			String            lse_co_vndr_seq12 ,
			String            lse_co_vndr_seq13 ,
			String            lse_co_vndr_seq14 ,
			String            lse_co_vndr_seq15 ,
			String            lse_co_vndr_seq16 ,
			String            lse_co_vndr_seq17 ,
			String            lse_co_vndr_seq18 ,
			String            lse_co_vndr_seq19 ,
			String            lse_co_vndr_seq20,
			String            cre_usr_id       ,
			String            cre_dt           ,
			String            upd_usr_id       ,
			String            upd_dt           ,
			String            delt_flg         ,
			String			  eai_evnt_dt      ,		
			String			  eai_if_id        ){
		this.ibflag            = ibflag           ;
		this.page_rows         = page_rows        ;
		this.lse_co_yd_cd      = lse_co_yd_cd     ;
		this.lse_co_yd_nm      = lse_co_yd_nm     ;
		this.onf_hir_yd_flg    = onf_hir_yd_flg   ;
		this.yd_addr           = yd_addr          ;
		this.intl_phn_no       = intl_phn_no      ;
		this.phn_no            = phn_no           ;
		this.fax_no            = fax_no           ;
		this.yd_pic_nm         = yd_pic_nm        ;
		this.yd_eml            = yd_eml           ;
		this.lse_co_vndr_seq1  = lse_co_vndr_seq1 ;
		this.lse_co_vndr_seq2  = lse_co_vndr_seq2 ;
		this.lse_co_vndr_seq3  = lse_co_vndr_seq3 ;
		this.lse_co_vndr_seq4  = lse_co_vndr_seq4 ;
		this.lse_co_vndr_seq5  = lse_co_vndr_seq5 ;
		this.lse_co_vndr_seq6  = lse_co_vndr_seq6 ;
		this.lse_co_vndr_seq7  = lse_co_vndr_seq7 ;
		this.lse_co_vndr_seq8  = lse_co_vndr_seq8 ;
		this.lse_co_vndr_seq9  = lse_co_vndr_seq9 ;
		this.lse_co_vndr_seq10 = lse_co_vndr_seq10;
		this.lse_co_vndr_seq11  = lse_co_vndr_seq11 ;
		this.lse_co_vndr_seq12  = lse_co_vndr_seq12 ;
		this.lse_co_vndr_seq13  = lse_co_vndr_seq13 ;
		this.lse_co_vndr_seq14  = lse_co_vndr_seq14 ;
		this.lse_co_vndr_seq15  = lse_co_vndr_seq15 ;
		this.lse_co_vndr_seq16  = lse_co_vndr_seq16 ;
		this.lse_co_vndr_seq17  = lse_co_vndr_seq17 ;
		this.lse_co_vndr_seq18  = lse_co_vndr_seq18 ;
		this.lse_co_vndr_seq19  = lse_co_vndr_seq19 ;
		this.lse_co_vndr_seq20 = lse_co_vndr_seq20;
		this.cre_usr_id        = cre_usr_id       ;
		this.cre_dt            = cre_dt           ;
		this.upd_usr_id        = upd_usr_id       ;
		this.upd_dt            = upd_dt           ;
		this.delt_flg          = delt_flg         ;
		this.eai_evnt_dt       = eai_evnt_dt      ;
		this.eai_if_id         = eai_if_id        ;
	}

	// getter method is proceeding ..
	public String            getIbflag           (){	return ibflag           	;	}
	public String            getPage_rows        (){	return page_rows        	;	}
	public String            getLse_co_yd_cd     (){	return lse_co_yd_cd     	;	}
	public String            getLse_co_yd_nm     (){	return lse_co_yd_nm     	;	}
	public String            getOnf_hir_yd_flg   (){	return onf_hir_yd_flg   	;	}
	public String            getYd_addr          (){	return yd_addr          	;	}
	public String            getIntl_phn_no      (){	return intl_phn_no      	;	}
	public String            getPhn_no           (){	return phn_no           	;	}
	public String            getFax_no           (){	return fax_no           	;	}
	public String            getYd_pic_nm        (){	return yd_pic_nm        	;	}
	public String            getYd_eml           (){	return yd_eml           	;	}
	public String            getLse_co_vndr_seq1 (){	return lse_co_vndr_seq1 	;	}
	public String            getLse_co_vndr_seq2 (){	return lse_co_vndr_seq2 	;	}
	public String            getLse_co_vndr_seq3 (){	return lse_co_vndr_seq3 	;	}
	public String            getLse_co_vndr_seq4 (){	return lse_co_vndr_seq4 	;	}
	public String            getLse_co_vndr_seq5 (){	return lse_co_vndr_seq5 	;	}
	public String            getLse_co_vndr_seq6 (){	return lse_co_vndr_seq6 	;	}
	public String            getLse_co_vndr_seq7 (){	return lse_co_vndr_seq7 	;	}
	public String            getLse_co_vndr_seq8 (){	return lse_co_vndr_seq8 	;	}
	public String            getLse_co_vndr_seq9 (){	return lse_co_vndr_seq9 	;	}
	public String            getLse_co_vndr_seq10(){	return lse_co_vndr_seq10	;	}
	public String            getLse_co_vndr_seq11 (){	return lse_co_vndr_seq11 	;	}
	public String            getLse_co_vndr_seq12 (){	return lse_co_vndr_seq12 	;	}
	public String            getLse_co_vndr_seq13 (){	return lse_co_vndr_seq13 	;	}
	public String            getLse_co_vndr_seq14 (){	return lse_co_vndr_seq14 	;	}
	public String            getLse_co_vndr_seq15 (){	return lse_co_vndr_seq15 	;	}
	public String            getLse_co_vndr_seq16 (){	return lse_co_vndr_seq16 	;	}
	public String            getLse_co_vndr_seq17 (){	return lse_co_vndr_seq17 	;	}
	public String            getLse_co_vndr_seq18 (){	return lse_co_vndr_seq18 	;	}
	public String            getLse_co_vndr_seq19 (){	return lse_co_vndr_seq19 	;	}
	public String            getLse_co_vndr_seq20(){	return lse_co_vndr_seq20	;	}
	public String            getCre_usr_id       (){	return cre_usr_id       	;	}
	public String            getCre_dt           (){	return cre_dt           	;	}
	public String            getUpd_usr_id       (){	return upd_usr_id       	;	}
	public String            getUpd_dt           (){	return upd_dt           	;	}
	public String            getDelt_flg         (){	return delt_flg         	;	}
	public String            getEai_evnt_dt      (){	return eai_evnt_dt         	;	}
	public String            getEai_if_id        (){	return eai_if_id           	;	}

	// setter method is proceeding ..
	public void setIbflag           ( String            ibflag            ){	this.ibflag            = ibflag           	;	}
	public void setPage_rows        ( String            page_rows         ){	this.page_rows         = page_rows        	;	}
	public void setLse_co_yd_cd     ( String            lse_co_yd_cd      ){	this.lse_co_yd_cd      = lse_co_yd_cd     	;	}
	public void setLse_co_yd_nm     ( String            lse_co_yd_nm      ){	this.lse_co_yd_nm      = lse_co_yd_nm     	;	}
	public void setOnf_hir_yd_flg   ( String            onf_hir_yd_flg    ){	this.onf_hir_yd_flg    = onf_hir_yd_flg   	;	}
	public void setYd_addr          ( String            yd_addr           ){	this.yd_addr           = yd_addr          	;	}
	public void setIntl_phn_no      ( String            intl_phn_no       ){	this.intl_phn_no       = intl_phn_no      	;	}
	public void setPhn_no           ( String            phn_no            ){	this.phn_no            = phn_no           	;	}
	public void setFax_no           ( String            fax_no            ){	this.fax_no            = fax_no           	;	}
	public void setYd_pic_nm        ( String            yd_pic_nm         ){	this.yd_pic_nm         = yd_pic_nm        	;	}
	public void setYd_eml           ( String            yd_eml            ){	this.yd_eml            = yd_eml           	;	}
	public void setLse_co_vndr_seq1 ( String            lse_co_vndr_seq1  ){	this.lse_co_vndr_seq1  = lse_co_vndr_seq1 	;	}
	public void setLse_co_vndr_seq2 ( String            lse_co_vndr_seq2  ){	this.lse_co_vndr_seq2  = lse_co_vndr_seq2 	;	}
	public void setLse_co_vndr_seq3 ( String            lse_co_vndr_seq3  ){	this.lse_co_vndr_seq3  = lse_co_vndr_seq3 	;	}
	public void setLse_co_vndr_seq4 ( String            lse_co_vndr_seq4  ){	this.lse_co_vndr_seq4  = lse_co_vndr_seq4 	;	}
	public void setLse_co_vndr_seq5 ( String            lse_co_vndr_seq5  ){	this.lse_co_vndr_seq5  = lse_co_vndr_seq5 	;	}
	public void setLse_co_vndr_seq6 ( String            lse_co_vndr_seq6  ){	this.lse_co_vndr_seq6  = lse_co_vndr_seq6 	;	}
	public void setLse_co_vndr_seq7 ( String            lse_co_vndr_seq7  ){	this.lse_co_vndr_seq7  = lse_co_vndr_seq7 	;	}
	public void setLse_co_vndr_seq8 ( String            lse_co_vndr_seq8  ){	this.lse_co_vndr_seq8  = lse_co_vndr_seq8 	;	}
	public void setLse_co_vndr_seq9 ( String            lse_co_vndr_seq9  ){	this.lse_co_vndr_seq9  = lse_co_vndr_seq9 	;	}
	public void setLse_co_vndr_seq10( String            lse_co_vndr_seq10 ){	this.lse_co_vndr_seq10 = lse_co_vndr_seq10	;	}
	public void setLse_co_vndr_seq11 ( String            lse_co_vndr_seq11  ){	this.lse_co_vndr_seq11  = lse_co_vndr_seq11 	;	}
	public void setLse_co_vndr_seq12 ( String            lse_co_vndr_seq12  ){	this.lse_co_vndr_seq12  = lse_co_vndr_seq12 	;	}
	public void setLse_co_vndr_seq13 ( String            lse_co_vndr_seq13  ){	this.lse_co_vndr_seq13  = lse_co_vndr_seq13 	;	}
	public void setLse_co_vndr_seq14 ( String            lse_co_vndr_seq14  ){	this.lse_co_vndr_seq14  = lse_co_vndr_seq14 	;	}
	public void setLse_co_vndr_seq15 ( String            lse_co_vndr_seq15  ){	this.lse_co_vndr_seq15  = lse_co_vndr_seq15 	;	}
	public void setLse_co_vndr_seq16 ( String            lse_co_vndr_seq16  ){	this.lse_co_vndr_seq16  = lse_co_vndr_seq16 	;	}
	public void setLse_co_vndr_seq17 ( String            lse_co_vndr_seq17  ){	this.lse_co_vndr_seq17  = lse_co_vndr_seq17 	;	}
	public void setLse_co_vndr_seq18 ( String            lse_co_vndr_seq18  ){	this.lse_co_vndr_seq18  = lse_co_vndr_seq18 	;	}
	public void setLse_co_vndr_seq19 ( String            lse_co_vndr_seq19  ){	this.lse_co_vndr_seq19  = lse_co_vndr_seq19 	;	}
	public void setLse_co_vndr_seq20( String            lse_co_vndr_seq20 ){	this.lse_co_vndr_seq20 = lse_co_vndr_seq20	;	}
	public void setCre_usr_id       ( String            cre_usr_id        ){	this.cre_usr_id        = cre_usr_id       	;	}
	public void setCre_dt           ( String            cre_dt            ){	this.cre_dt            = cre_dt           	;	}
	public void setUpd_usr_id       ( String            upd_usr_id        ){	this.upd_usr_id        = upd_usr_id       	;	}
	public void setUpd_dt           ( String            upd_dt            ){	this.upd_dt            = upd_dt           	;	}
	public void setDelt_flg         ( String            delt_flg          ){	this.delt_flg          = delt_flg         	;	}
	public void setEai_evnt_dt      ( String            eai_evnt_dt       ){	this.eai_evnt_dt       = eai_evnt_dt        ;	}
	public void setEai_if_id        ( String            eai_if_id         ){	this.eai_if_id         = eai_if_id          ;	}

	public static MdmLseCoYd fromRequest(HttpServletRequest request) {
		MdmLseCoYd model = new MdmLseCoYd();
		try {
			model.setIbflag           	(JSPUtil.getParameter(request, "ibflag           		".trim(), ""));
			model.setPage_rows        	(JSPUtil.getParameter(request, "page_rows        		".trim(), ""));
			model.setLse_co_yd_cd     	(JSPUtil.getParameter(request, "lse_co_yd_cd     		".trim(), ""));
			model.setLse_co_yd_nm     	(JSPUtil.getParameter(request, "lse_co_yd_nm     		".trim(), ""));
			model.setOnf_hir_yd_flg   	(JSPUtil.getParameter(request, "onf_hir_yd_flg   		".trim(), ""));
			model.setYd_addr          	(JSPUtil.getParameter(request, "yd_addr          		".trim(), ""));
			model.setIntl_phn_no      	(JSPUtil.getParameter(request, "intl_phn_no      		".trim(), ""));
			model.setPhn_no           	(JSPUtil.getParameter(request, "phn_no           		".trim(), ""));
			model.setFax_no           	(JSPUtil.getParameter(request, "fax_no           		".trim(), ""));
			model.setYd_pic_nm        	(JSPUtil.getParameter(request, "yd_pic_nm        		".trim(), ""));
			model.setYd_eml           	(JSPUtil.getParameter(request, "yd_eml           		".trim(), ""));
			model.setLse_co_vndr_seq1 	(JSPUtil.getParameter(request, "lse_co_vndr_seq1 		".trim(), ""));
			model.setLse_co_vndr_seq2 	(JSPUtil.getParameter(request, "lse_co_vndr_seq2 		".trim(), ""));
			model.setLse_co_vndr_seq3 	(JSPUtil.getParameter(request, "lse_co_vndr_seq3 		".trim(), ""));
			model.setLse_co_vndr_seq4 	(JSPUtil.getParameter(request, "lse_co_vndr_seq4 		".trim(), ""));
			model.setLse_co_vndr_seq5 	(JSPUtil.getParameter(request, "lse_co_vndr_seq5 		".trim(), ""));
			model.setLse_co_vndr_seq6 	(JSPUtil.getParameter(request, "lse_co_vndr_seq6 		".trim(), ""));
			model.setLse_co_vndr_seq7 	(JSPUtil.getParameter(request, "lse_co_vndr_seq7 		".trim(), ""));
			model.setLse_co_vndr_seq8 	(JSPUtil.getParameter(request, "lse_co_vndr_seq8 		".trim(), ""));
			model.setLse_co_vndr_seq9 	(JSPUtil.getParameter(request, "lse_co_vndr_seq9 		".trim(), ""));
			model.setLse_co_vndr_seq10	(JSPUtil.getParameter(request, "lse_co_vndr_seq10		".trim(), ""));
			model.setLse_co_vndr_seq11 	(JSPUtil.getParameter(request, "lse_co_vndr_seq11 		".trim(), ""));
			model.setLse_co_vndr_seq12 	(JSPUtil.getParameter(request, "lse_co_vndr_seq12 		".trim(), ""));
			model.setLse_co_vndr_seq13 	(JSPUtil.getParameter(request, "lse_co_vndr_seq13 		".trim(), ""));
			model.setLse_co_vndr_seq14 	(JSPUtil.getParameter(request, "lse_co_vndr_seq14 		".trim(), ""));
			model.setLse_co_vndr_seq15 	(JSPUtil.getParameter(request, "lse_co_vndr_seq15 		".trim(), ""));
			model.setLse_co_vndr_seq16 	(JSPUtil.getParameter(request, "lse_co_vndr_seq16 		".trim(), ""));
			model.setLse_co_vndr_seq17 	(JSPUtil.getParameter(request, "lse_co_vndr_seq17 		".trim(), ""));
			model.setLse_co_vndr_seq18 	(JSPUtil.getParameter(request, "lse_co_vndr_seq18 		".trim(), ""));
			model.setLse_co_vndr_seq19 	(JSPUtil.getParameter(request, "lse_co_vndr_seq19 		".trim(), ""));
			model.setLse_co_vndr_seq20	(JSPUtil.getParameter(request, "lse_co_vndr_seq20		".trim(), ""));
			model.setCre_usr_id       	(JSPUtil.getParameter(request, "cre_usr_id       		".trim(), ""));
			model.setCre_dt           	(JSPUtil.getParameter(request, "cre_dt           		".trim(), ""));
			model.setUpd_usr_id       	(JSPUtil.getParameter(request, "upd_usr_id       		".trim(), ""));
			model.setUpd_dt           	(JSPUtil.getParameter(request, "upd_dt           		".trim(), ""));
			model.setDelt_flg         	(JSPUtil.getParameter(request, "delt_flg         		".trim(), ""));
			model.setEai_evnt_dt        (JSPUtil.getParameter(request, "eai_evnt_dt         	".trim(), ""));
			model.setEai_if_id          (JSPUtil.getParameter(request, "eai_if_id           	".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		MdmLseCoYd model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag            =  (JSPUtil.getParameter(request, "ibflag           		".trim(), length));
			String[] page_rows         =  (JSPUtil.getParameter(request, "page_rows        		".trim(), length));
			String[] lse_co_yd_cd      =  (JSPUtil.getParameter(request, "lse_co_yd_cd     		".trim(), length));
			String[] lse_co_yd_nm      =  (JSPUtil.getParameter(request, "lse_co_yd_nm     		".trim(), length));
			String[] onf_hir_yd_flg    =  (JSPUtil.getParameter(request, "onf_hir_yd_flg   		".trim(), length));
			String[] yd_addr           =  (JSPUtil.getParameter(request, "yd_addr          		".trim(), length));
			String[] intl_phn_no       =  (JSPUtil.getParameter(request, "intl_phn_no      		".trim(), length));
			String[] phn_no            =  (JSPUtil.getParameter(request, "phn_no           		".trim(), length));
			String[] fax_no            =  (JSPUtil.getParameter(request, "fax_no           		".trim(), length));
			String[] yd_pic_nm         =  (JSPUtil.getParameter(request, "yd_pic_nm        		".trim(), length));
			String[] yd_eml            =  (JSPUtil.getParameter(request, "yd_eml           		".trim(), length));
			String[] lse_co_vndr_seq1  =  (JSPUtil.getParameter(request, "lse_co_vndr_seq1 		".trim(), length));
			String[] lse_co_vndr_seq2  =  (JSPUtil.getParameter(request, "lse_co_vndr_seq2 		".trim(), length));
			String[] lse_co_vndr_seq3  =  (JSPUtil.getParameter(request, "lse_co_vndr_seq3 		".trim(), length));
			String[] lse_co_vndr_seq4  =  (JSPUtil.getParameter(request, "lse_co_vndr_seq4 		".trim(), length));
			String[] lse_co_vndr_seq5  =  (JSPUtil.getParameter(request, "lse_co_vndr_seq5 		".trim(), length));
			String[] lse_co_vndr_seq6  =  (JSPUtil.getParameter(request, "lse_co_vndr_seq6 		".trim(), length));
			String[] lse_co_vndr_seq7  =  (JSPUtil.getParameter(request, "lse_co_vndr_seq7 		".trim(), length));
			String[] lse_co_vndr_seq8  =  (JSPUtil.getParameter(request, "lse_co_vndr_seq8 		".trim(), length));
			String[] lse_co_vndr_seq9  =  (JSPUtil.getParameter(request, "lse_co_vndr_seq9 		".trim(), length));
			String[] lse_co_vndr_seq10 =  (JSPUtil.getParameter(request, "lse_co_vndr_seq10		".trim(), length));
			String[] lse_co_vndr_seq11  =  (JSPUtil.getParameter(request, "lse_co_vndr_seq11 		".trim(), length));
			String[] lse_co_vndr_seq12  =  (JSPUtil.getParameter(request, "lse_co_vndr_seq12 		".trim(), length));
			String[] lse_co_vndr_seq13  =  (JSPUtil.getParameter(request, "lse_co_vndr_seq13 		".trim(), length));
			String[] lse_co_vndr_seq14  =  (JSPUtil.getParameter(request, "lse_co_vndr_seq14 		".trim(), length));
			String[] lse_co_vndr_seq15  =  (JSPUtil.getParameter(request, "lse_co_vndr_seq15 		".trim(), length));
			String[] lse_co_vndr_seq16  =  (JSPUtil.getParameter(request, "lse_co_vndr_seq16 		".trim(), length));
			String[] lse_co_vndr_seq17  =  (JSPUtil.getParameter(request, "lse_co_vndr_seq17 		".trim(), length));
			String[] lse_co_vndr_seq18  =  (JSPUtil.getParameter(request, "lse_co_vndr_seq18 		".trim(), length));
			String[] lse_co_vndr_seq19  =  (JSPUtil.getParameter(request, "lse_co_vndr_seq19 		".trim(), length));
			String[] lse_co_vndr_seq20 =  (JSPUtil.getParameter(request, "lse_co_vndr_seq20		".trim(), length));
			String[] cre_usr_id        =  (JSPUtil.getParameter(request, "cre_usr_id       		".trim(), length));
			String[] cre_dt            =  (JSPUtil.getParameter(request, "cre_dt           		".trim(), length));
			String[] upd_usr_id        =  (JSPUtil.getParameter(request, "upd_usr_id       		".trim(), length));
			String[] upd_dt            =  (JSPUtil.getParameter(request, "upd_dt           		".trim(), length));
			String[] delt_flg          =  (JSPUtil.getParameter(request, "delt_flg         		".trim(), length));
			String[] eai_evnt_dt       =  (JSPUtil.getParameter(request, "eai_evnt_dt         	".trim(), length));
			String[] eai_if_id         =  (JSPUtil.getParameter(request, "eai_if_id           	".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new MdmLseCoYd();
				model.setIbflag           		  (ibflag           	[i]);
				model.setPage_rows        		  (page_rows        	[i]);
				model.setLse_co_yd_cd     		  (lse_co_yd_cd     	[i]);
				model.setLse_co_yd_nm     		  (lse_co_yd_nm     	[i]);
				model.setOnf_hir_yd_flg   		  (onf_hir_yd_flg   	[i]);
				model.setYd_addr          		  (yd_addr          	[i]);
				model.setIntl_phn_no      		  (intl_phn_no      	[i]);
				model.setPhn_no           		  (phn_no           	[i]);
				model.setFax_no           		  (fax_no           	[i]);
				model.setYd_pic_nm        		  (yd_pic_nm        	[i]);
				model.setYd_eml           		  (yd_eml           	[i]);
				model.setLse_co_vndr_seq1 		  (lse_co_vndr_seq1 	[i]);
				model.setLse_co_vndr_seq2 		  (lse_co_vndr_seq2 	[i]);
				model.setLse_co_vndr_seq3 		  (lse_co_vndr_seq3 	[i]);
				model.setLse_co_vndr_seq4 		  (lse_co_vndr_seq4 	[i]);
				model.setLse_co_vndr_seq5 		  (lse_co_vndr_seq5 	[i]);
				model.setLse_co_vndr_seq6 		  (lse_co_vndr_seq6 	[i]);
				model.setLse_co_vndr_seq7 		  (lse_co_vndr_seq7 	[i]);
				model.setLse_co_vndr_seq8 		  (lse_co_vndr_seq8 	[i]);
				model.setLse_co_vndr_seq9 		  (lse_co_vndr_seq9 	[i]);
				model.setLse_co_vndr_seq10		  (lse_co_vndr_seq10	[i]);
				model.setLse_co_vndr_seq11 		  (lse_co_vndr_seq11 	[i]);
				model.setLse_co_vndr_seq12 		  (lse_co_vndr_seq12 	[i]);
				model.setLse_co_vndr_seq13 		  (lse_co_vndr_seq13 	[i]);
				model.setLse_co_vndr_seq14 		  (lse_co_vndr_seq14 	[i]);
				model.setLse_co_vndr_seq15 		  (lse_co_vndr_seq15 	[i]);
				model.setLse_co_vndr_seq16 		  (lse_co_vndr_seq16 	[i]);
				model.setLse_co_vndr_seq17 		  (lse_co_vndr_seq17 	[i]);
				model.setLse_co_vndr_seq18 		  (lse_co_vndr_seq18 	[i]);
				model.setLse_co_vndr_seq19 		  (lse_co_vndr_seq19 	[i]);
				model.setLse_co_vndr_seq20		  (lse_co_vndr_seq20	[i]);
				model.setCre_usr_id       		  (cre_usr_id       	[i]);
				model.setCre_dt           		  (cre_dt           	[i]);
				model.setUpd_usr_id       		  (upd_usr_id       	[i]);
				model.setUpd_dt           		  (upd_dt           	[i]);
				model.setDelt_flg         		  (delt_flg         	[i]);
				model.setEai_evnt_dt         	  (eai_evnt_dt         	[i]);
				model.setEai_if_id           	  (eai_if_id           	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		MdmLseCoYd model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag            =  (JSPUtil.getParameter(request, prefix + "ibflag           		".trim(), length));
			String[] page_rows         =  (JSPUtil.getParameter(request, prefix + "page_rows        		".trim(), length));
			String[] lse_co_yd_cd      =  (JSPUtil.getParameter(request, prefix + "lse_co_yd_cd     		".trim(), length));
			String[] lse_co_yd_nm      =  (JSPUtil.getParameter(request, prefix + "lse_co_yd_nm     		".trim(), length));
			String[] onf_hir_yd_flg    =  (JSPUtil.getParameter(request, prefix + "onf_hir_yd_flg   		".trim(), length));
			String[] yd_addr           =  (JSPUtil.getParameter(request, prefix + "yd_addr          		".trim(), length));
			String[] intl_phn_no       =  (JSPUtil.getParameter(request, prefix + "intl_phn_no      		".trim(), length));
			String[] phn_no            =  (JSPUtil.getParameter(request, prefix + "phn_no           		".trim(), length));
			String[] fax_no            =  (JSPUtil.getParameter(request, prefix + "fax_no           		".trim(), length));
			String[] yd_pic_nm         =  (JSPUtil.getParameter(request, prefix + "yd_pic_nm        		".trim(), length));
			String[] yd_eml            =  (JSPUtil.getParameter(request, prefix + "yd_eml           		".trim(), length));
			String[] lse_co_vndr_seq1  =  (JSPUtil.getParameter(request, prefix + "lse_co_vndr_seq1 		".trim(), length));
			String[] lse_co_vndr_seq2  =  (JSPUtil.getParameter(request, prefix + "lse_co_vndr_seq2 		".trim(), length));
			String[] lse_co_vndr_seq3  =  (JSPUtil.getParameter(request, prefix + "lse_co_vndr_seq3 		".trim(), length));
			String[] lse_co_vndr_seq4  =  (JSPUtil.getParameter(request, prefix + "lse_co_vndr_seq4 		".trim(), length));
			String[] lse_co_vndr_seq5  =  (JSPUtil.getParameter(request, prefix + "lse_co_vndr_seq5 		".trim(), length));
			String[] lse_co_vndr_seq6  =  (JSPUtil.getParameter(request, prefix + "lse_co_vndr_seq6 		".trim(), length));
			String[] lse_co_vndr_seq7  =  (JSPUtil.getParameter(request, prefix + "lse_co_vndr_seq7 		".trim(), length));
			String[] lse_co_vndr_seq8  =  (JSPUtil.getParameter(request, prefix + "lse_co_vndr_seq8 		".trim(), length));
			String[] lse_co_vndr_seq9  =  (JSPUtil.getParameter(request, prefix + "lse_co_vndr_seq9 		".trim(), length));
			String[] lse_co_vndr_seq10 =  (JSPUtil.getParameter(request, prefix + "lse_co_vndr_seq10		".trim(), length));
			String[] lse_co_vndr_seq11  =  (JSPUtil.getParameter(request, prefix + "lse_co_vndr_seq11 		".trim(), length));
			String[] lse_co_vndr_seq12  =  (JSPUtil.getParameter(request, prefix + "lse_co_vndr_seq12 		".trim(), length));
			String[] lse_co_vndr_seq13  =  (JSPUtil.getParameter(request, prefix + "lse_co_vndr_seq13 		".trim(), length));
			String[] lse_co_vndr_seq14  =  (JSPUtil.getParameter(request, prefix + "lse_co_vndr_seq14 		".trim(), length));
			String[] lse_co_vndr_seq15  =  (JSPUtil.getParameter(request, prefix + "lse_co_vndr_seq15 		".trim(), length));
			String[] lse_co_vndr_seq16  =  (JSPUtil.getParameter(request, prefix + "lse_co_vndr_seq16 		".trim(), length));
			String[] lse_co_vndr_seq17  =  (JSPUtil.getParameter(request, prefix + "lse_co_vndr_seq17 		".trim(), length));
			String[] lse_co_vndr_seq18  =  (JSPUtil.getParameter(request, prefix + "lse_co_vndr_seq18 		".trim(), length));
			String[] lse_co_vndr_seq19  =  (JSPUtil.getParameter(request, prefix + "lse_co_vndr_seq19 		".trim(), length));
			String[] lse_co_vndr_seq20 =  (JSPUtil.getParameter(request, prefix + "lse_co_vndr_seq20		".trim(), length));
			String[] cre_usr_id        =  (JSPUtil.getParameter(request, prefix + "cre_usr_id       		".trim(), length));
			String[] cre_dt            =  (JSPUtil.getParameter(request, prefix + "cre_dt           		".trim(), length));
			String[] upd_usr_id        =  (JSPUtil.getParameter(request, prefix + "upd_usr_id       		".trim(), length));
			String[] upd_dt            =  (JSPUtil.getParameter(request, prefix + "upd_dt           		".trim(), length));
			String[] delt_flg          =  (JSPUtil.getParameter(request, prefix + "delt_flg         		".trim(), length));
			String[] eai_evnt_dt       =  (JSPUtil.getParameter(request, prefix + "eai_evnt_dt         		".trim(), length));
			String[] eai_if_id         =  (JSPUtil.getParameter(request, prefix + "eai_if_id           		".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new MdmLseCoYd();
				model.setIbflag           		  ( ibflag           	[i]);
				model.setPage_rows        		  ( page_rows        	[i]);
				model.setLse_co_yd_cd     		  ( lse_co_yd_cd     	[i]);
				model.setLse_co_yd_nm     		  ( lse_co_yd_nm     	[i]);
				model.setOnf_hir_yd_flg   		  ( onf_hir_yd_flg   	[i]);
				model.setYd_addr          		  ( yd_addr          	[i]);
				model.setIntl_phn_no      		  ( intl_phn_no      	[i]);
				model.setPhn_no           		  ( phn_no           	[i]);
				model.setFax_no           		  ( fax_no           	[i]);
				model.setYd_pic_nm        		  ( yd_pic_nm        	[i]);
				model.setYd_eml           		  ( yd_eml           	[i]);
				model.setLse_co_vndr_seq1 		  ( lse_co_vndr_seq1 	[i]);
				model.setLse_co_vndr_seq2 		  ( lse_co_vndr_seq2 	[i]);
				model.setLse_co_vndr_seq3 		  ( lse_co_vndr_seq3 	[i]);
				model.setLse_co_vndr_seq4 		  ( lse_co_vndr_seq4 	[i]);
				model.setLse_co_vndr_seq5 		  ( lse_co_vndr_seq5 	[i]);
				model.setLse_co_vndr_seq6 		  ( lse_co_vndr_seq6 	[i]);
				model.setLse_co_vndr_seq7 		  ( lse_co_vndr_seq7 	[i]);
				model.setLse_co_vndr_seq8 		  ( lse_co_vndr_seq8 	[i]);
				model.setLse_co_vndr_seq9 		  ( lse_co_vndr_seq9 	[i]);
				model.setLse_co_vndr_seq10		  ( lse_co_vndr_seq10	[i]);
				model.setLse_co_vndr_seq11 		  ( lse_co_vndr_seq11 	[i]);
				model.setLse_co_vndr_seq12 		  ( lse_co_vndr_seq12 	[i]);
				model.setLse_co_vndr_seq13 		  ( lse_co_vndr_seq13 	[i]);
				model.setLse_co_vndr_seq14 		  ( lse_co_vndr_seq14 	[i]);
				model.setLse_co_vndr_seq15 		  ( lse_co_vndr_seq15 	[i]);
				model.setLse_co_vndr_seq16 		  ( lse_co_vndr_seq16 	[i]);
				model.setLse_co_vndr_seq17 		  ( lse_co_vndr_seq17 	[i]);
				model.setLse_co_vndr_seq18 		  ( lse_co_vndr_seq18 	[i]);
				model.setLse_co_vndr_seq19 		  ( lse_co_vndr_seq19 	[i]);
				model.setLse_co_vndr_seq20		  ( lse_co_vndr_seq20	[i]);
				model.setCre_usr_id       		  ( cre_usr_id       	[i]);
				model.setCre_dt           		  ( cre_dt           	[i]);
				model.setUpd_usr_id       		  ( upd_usr_id       	[i]);
				model.setUpd_dt           		  ( upd_dt           	[i]);
				model.setDelt_flg         		  ( delt_flg         	[i]);
				model.setEai_evnt_dt         	  ( eai_evnt_dt         [i]);
				model.setEai_if_id           	  ( eai_if_id           [i]);
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
