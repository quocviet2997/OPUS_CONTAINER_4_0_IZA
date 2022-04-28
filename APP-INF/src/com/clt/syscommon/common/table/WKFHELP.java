package com.clt.syscommon.common.table;

import com.clt.framework.component.util.JSPUtil;
import com.clt.framework.support.view.signon.SignOnUserAccount;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import javax.servlet.http.HttpServletRequest;

/**
 * 1. 기능 : Table Value Ojbect <p> 2. 처리개요 : <p> - 모든 업무에서 공통으로 사용하는 PDTO(Data Transfer Object including Parameters) <p> - 관련 Event에서 작성, 서버실행요청시 PDTO의 역할을 수행하는 Value Object <p> 3. 주의사항 : <p>
 * @author  : 황경환
 * @version  : v1.0.0
 * @see  : 관련 Event , HTMLAction 참조
 * @since  : JDK 1.3 or EJB 1.1
 */
public final class WKFHELP implements java.io.Serializable {

    /**
	 * @uml.property  name="bizPlanNo"
	 */
    private String       bizPlanNo    = "";
    /**
	 * @uml.property  name="bizPlanSno"
	 */
    private String       bizPlanSno   = "";
    /**
	 * @uml.property  name="bwkPrcsNo"
	 */
    private String       bwkPrcsNo    = "";
    /**
	 * @uml.property  name="bwkStepNo"
	 */
    private String       bwkStepNo    = "";
    /**
	 * @uml.property  name="evtsNo"
	 */
    private String       evtsNo       = "";
    /**
	 * @uml.property  name="evtsNm"
	 */
    private String       evtsNm       = "";
    /**
	 * @uml.property  name="nxtPrcsNo"
	 */
    private String       nxtPrcsNo    = "";
    /**
	 * @uml.property  name="nxtStepNo"
	 */
    private String       nxtStepNo    = "";
    /**
	 * @uml.property  name="dyCcd"
	 */
    private String       dyCcd        = "";
    /**
	 * @uml.property  name="pgmLinkNm"
	 */
    private String       pgmLinkNm    = "";
    /**
	 * @uml.property  name="imgFileNm"
	 */
    private String       imgFileNm    = "";
    /**
	 * @uml.property  name="epPlanNo"
	 */
    private String       epPlanNo     = "";
    /**
	 * @uml.property  name="evltNo"
	 */
    private String       evltNo       = "";
    /**
	 * @uml.property  name="evltOjtNo"
	 */
    private String       evltOjtNo    = "";
    /**
	 * @uml.property  name="rgEmpno"
	 */
    private String       rgEmpno      = "";
    /**
	 * @uml.property  name="sndTm"
	 */
    private String       sndTm        = "";
    /**
	 * @uml.property  name="rcvTm"
	 */
    private String       rcvTm        = "";
    /**
	 * @uml.property  name="sndEvtsNo"
	 */
    private String       sndEvtsNo    = "";
    /**
	 * @uml.property  name="rcvEvtsNo"
	 */
    private String       rcvEvtsNo    = "";
    /**
	 * @uml.property  name="nxtPgmLinkNm"
	 */
    private String       nxtPgmLinkNm = "";
    /**
	 * @uml.property  name="param01"
	 */
    private String       param01      = "";
    /**
	 * @uml.property  name="param02"
	 */
    private String       param02      = "";
    /**
	 * @uml.property  name="param03"
	 */
    private String       param03      = "";
    /**
	 * @uml.property  name="param04"
	 */
    private String       param04      = "";
    /**
	 * @uml.property  name="param05"
	 */
    private String       param05      = "";
    /**
	 * @uml.property  name="param06"
	 */
    private String       param06      = "";
    /**
	 * @uml.property  name="param07"
	 */
    private String       param07      = "";
    /**
	 * @uml.property  name="param08"
	 */
    private String       param08      = "";
    /**
	 * @uml.property  name="param09"
	 */
    private String       param09      = "";
    /**
	 * @uml.property  name="param10"
	 */
    private String       param10      = "";
    /**
	 * @uml.property  name="wParam01"
	 */
    private String       wParam01     = "";
    /**
	 * @uml.property  name="wParam02"
	 */
    private String       wParam02     = "";
    /**
	 * @uml.property  name="wParam03"
	 */
    private String       wParam03     = "";
    /**
	 * @uml.property  name="wParam04"
	 */
    private String       wParam04     = "";
    /**
	 * @uml.property  name="wParam05"
	 */
    private String       wParam05     = "";
    /**
	 * @uml.property  name="wParam06"
	 */
    private String       wParam06     = "";
    /**
	 * @uml.property  name="wParam07"
	 */
    private String       wParam07     = "";
    /**
	 * @uml.property  name="wParam08"
	 */
    private String       wParam08     = "";
    /**
	 * @uml.property  name="wParam09"
	 */
    private String       wParam09     = "";
    /**
	 * @uml.property  name="wParam10"
	 */
    private String       wParam10     = "";
    
    /**
	 * @uml.property  name="auth"
	 * @uml.associationEnd  
	 */
    private SignOnUserAccount auth = null;           //Login User Information
    
    /**
	 * @param auth  The auth to set.
	 * @uml.property  name="auth"
	 */
    public void setAuth(SignOnUserAccount auth) {
        this.auth = auth;
    }
    
    /**
	 * @return  Returns the auth.
	 * @uml.property  name="auth"
	 */
    public SignOnUserAccount getAuth() {
        return auth;
    }

    public WKFHELP(){}

    public WKFHELP(
            String       bizPlanNo   ,
            String       bizPlanSno  ,
            String       bwkPrcsNo   ,
            String       bwkStepNo   ,
            String       evtsNo      ,
            String       evtsNm      ,
            String       nxtPrcsNo   ,
            String       nxtStepNo   ,
            String       dyCcd       ,
            String       pgmLinkNm   ,
            String       imgFileNm   ,
            String       epPlanNo    ,
            String       evltNo      ,
            String       evltOjtNo   ,
            String       rgEmpno     ,
            String       sndTm       ,
            String       rcvTm       ,
            String       sndEvtsNo   ,
            String       sndRcvsNo   ,
            String       nxtPgmLinkNm,
            String       param01     ,
            String       param02     ,
            String       param03     ,
            String       param04     ,
            String       param05     ,
            String       param06     ,
            String       param07     ,
            String       param08     ,
            String       param09     ,
            String       param10     ,
            String       wParam01    ,
            String       wParam02    ,
            String       wParam03    ,
            String       wParam04    ,
            String       wParam05    ,
            String       wParam06    ,
            String       wParam07    ,
            String       wParam08    ,
            String       wParam09    ,
            String       wParam10    ){
        this.bizPlanNo    = bizPlanNo   ;
        this.bizPlanSno   = bizPlanSno  ;
        this.bwkPrcsNo    = bwkPrcsNo   ;
        this.bwkStepNo    = bwkStepNo   ;
        this.evtsNo       = evtsNo      ;
        this.evtsNm       = evtsNm      ;
        this.nxtPrcsNo    = nxtPrcsNo   ;
        this.nxtStepNo    = nxtStepNo   ;
        this.dyCcd        = dyCcd       ;
        this.pgmLinkNm    = pgmLinkNm   ;
        this.imgFileNm    = imgFileNm   ;
        this.epPlanNo     = epPlanNo    ;
        this.evltNo       = evltNo      ;
        this.evltOjtNo    = evltOjtNo   ;
        this.rgEmpno      = rgEmpno     ;
        this.sndTm        = sndTm       ;
        this.rcvTm        = rcvTm       ;
        this.sndEvtsNo    = sndEvtsNo   ;
        this.rcvEvtsNo    = rcvEvtsNo   ;
        this.nxtPgmLinkNm = nxtPgmLinkNm;
        this.param01      = param01     ;
        this.param02      = param02     ;
        this.param03      = param03     ;
        this.param04      = param04     ;
        this.param05      = param05     ;
        this.param06      = param06     ;
        this.param07      = param07     ;
        this.param08      = param08     ;
        this.param09      = param09     ;
        this.param10      = param10     ;
        this.wParam01     = wParam01    ;
        this.wParam02     = wParam02    ;
        this.wParam03     = wParam03    ;
        this.wParam04     = wParam04    ;
        this.wParam05     = wParam05    ;
        this.wParam06     = wParam06    ;
        this.wParam07     = wParam07    ;
        this.wParam08     = wParam08    ;
        this.wParam09     = wParam09    ;
        this.wParam10     = wParam10    ;
    }

    // getter method is proceeding ..
    /**
	 * @return  Returns the bizPlanNo.
	 * @uml.property  name="bizPlanNo"
	 */
    public String       getBizPlanNo   (){    return bizPlanNo       ;    }
    /**
	 * @return  Returns the bizPlanSno.
	 * @uml.property  name="bizPlanSno"
	 */
    public String       getBizPlanSno  (){    return bizPlanSno      ;    }
    /**
	 * @return  Returns the bwkPrcsNo.
	 * @uml.property  name="bwkPrcsNo"
	 */
    public String       getBwkPrcsNo   (){    return bwkPrcsNo       ;    }
    /**
	 * @return  Returns the bwkStepNo.
	 * @uml.property  name="bwkStepNo"
	 */
    public String       getBwkStepNo   (){    return bwkStepNo       ;    }
    /**
	 * @return  Returns the evtsNo.
	 * @uml.property  name="evtsNo"
	 */
    public String       getEvtsNo      (){    return evtsNo          ;    }
    /**
	 * @return  Returns the evtsNm.
	 * @uml.property  name="evtsNm"
	 */
    public String       getEvtsNm      (){    return evtsNm          ;    }
    /**
	 * @return  Returns the nxtPrcsNo.
	 * @uml.property  name="nxtPrcsNo"
	 */
    public String       getNxtPrcsNo   (){    return nxtPrcsNo       ;    }
    /**
	 * @return  Returns the nxtStepNo.
	 * @uml.property  name="nxtStepNo"
	 */
    public String       getNxtStepNo   (){    return nxtStepNo       ;    }
    /**
	 * @return  Returns the dyCcd.
	 * @uml.property  name="dyCcd"
	 */
    public String       getDyCcd       (){    return dyCcd           ;    }
    /**
	 * @return  Returns the pgmLinkNm.
	 * @uml.property  name="pgmLinkNm"
	 */
    public String       getPgmLinkNm   (){    return pgmLinkNm       ;    }
    /**
	 * @return  Returns the imgFileNm.
	 * @uml.property  name="imgFileNm"
	 */
    public String       getImgFileNm   (){    return imgFileNm       ;    }
    /**
	 * @return  Returns the epPlanNo.
	 * @uml.property  name="epPlanNo"
	 */
    public String       getEpPlanNo    (){    return epPlanNo        ;    }
    /**
	 * @return  Returns the evltNo.
	 * @uml.property  name="evltNo"
	 */
    public String       getEvltNo      (){    return evltNo          ;    }
    /**
	 * @return  Returns the evltOjtNo.
	 * @uml.property  name="evltOjtNo"
	 */
    public String       getEvltOjtNo   (){    return evltOjtNo       ;    }
    /**
	 * @return  Returns the rgEmpno.
	 * @uml.property  name="rgEmpno"
	 */
    public String       getRgEmpno     (){    return rgEmpno         ;    }
    /**
	 * @return  Returns the sndTm.
	 * @uml.property  name="sndTm"
	 */
    public String       getSndTm       (){    return sndTm           ;    }
    /**
	 * @return  Returns the rcvTm.
	 * @uml.property  name="rcvTm"
	 */
    public String       getRcvTm       (){    return rcvTm           ;    }
    /**
	 * @return  Returns the sndEvtsNo.
	 * @uml.property  name="sndEvtsNo"
	 */
    public String       getSndEvtsNo   (){    return sndEvtsNo       ;    }
    /**
	 * @return  Returns the rcvEvtsNo.
	 * @uml.property  name="rcvEvtsNo"
	 */
    public String       getRcvEvtsNo   (){    return rcvEvtsNo       ;    }
    /**
	 * @return  Returns the nxtPgmLinkNm.
	 * @uml.property  name="nxtPgmLinkNm"
	 */
    public String       getNxtPgmLinkNm(){    return nxtPgmLinkNm    ;    }
    /**
	 * @return  Returns the param01.
	 * @uml.property  name="param01"
	 */
    public String       getParam01     (){    return param01         ;    }
    /**
	 * @return  Returns the param02.
	 * @uml.property  name="param02"
	 */
    public String       getParam02     (){    return param02         ;    }
    /**
	 * @return  Returns the param03.
	 * @uml.property  name="param03"
	 */
    public String       getParam03     (){    return param03         ;    }
    /**
	 * @return  Returns the param04.
	 * @uml.property  name="param04"
	 */
    public String       getParam04     (){    return param04         ;    }
    /**
	 * @return  Returns the param05.
	 * @uml.property  name="param05"
	 */
    public String       getParam05     (){    return param05         ;    }
    /**
	 * @return  Returns the param06.
	 * @uml.property  name="param06"
	 */
    public String       getParam06     (){    return param06         ;    }
    /**
	 * @return  Returns the param07.
	 * @uml.property  name="param07"
	 */
    public String       getParam07     (){    return param07         ;    }
    /**
	 * @return  Returns the param08.
	 * @uml.property  name="param08"
	 */
    public String       getParam08     (){    return param08         ;    }
    /**
	 * @return  Returns the param09.
	 * @uml.property  name="param09"
	 */
    public String       getParam09     (){    return param09         ;    }
    /**
	 * @return  Returns the param10.
	 * @uml.property  name="param10"
	 */
    public String       getParam10     (){    return param10         ;    }
    /**
	 * @return  Returns the wParam01.
	 * @uml.property  name="wParam01"
	 */
    public String       getWParam01    (){    return wParam01        ;    }
    /**
	 * @return  Returns the wParam02.
	 * @uml.property  name="wParam02"
	 */
    public String       getWParam02    (){    return wParam02        ;    }
    /**
	 * @return  Returns the wParam03.
	 * @uml.property  name="wParam03"
	 */
    public String       getWParam03    (){    return wParam03        ;    }
    /**
	 * @return  Returns the wParam04.
	 * @uml.property  name="wParam04"
	 */
    public String       getWParam04    (){    return wParam04        ;    }
    /**
	 * @return  Returns the wParam05.
	 * @uml.property  name="wParam05"
	 */
    public String       getWParam05    (){    return wParam05        ;    }
    /**
	 * @return  Returns the wParam06.
	 * @uml.property  name="wParam06"
	 */
    public String       getWParam06    (){    return wParam06        ;    }
    /**
	 * @return  Returns the wParam07.
	 * @uml.property  name="wParam07"
	 */
    public String       getWParam07    (){    return wParam07        ;    }
    /**
	 * @return  Returns the wParam08.
	 * @uml.property  name="wParam08"
	 */
    public String       getWParam08    (){    return wParam08        ;    }
    /**
	 * @return  Returns the wParam09.
	 * @uml.property  name="wParam09"
	 */
    public String       getWParam09    (){    return wParam09        ;    }
    /**
	 * @return  Returns the wParam10.
	 * @uml.property  name="wParam10"
	 */
    public String       getWParam10    (){    return wParam10        ;    }

    // setter method is proceeding ..
    /**
	 * @param bizPlanNo  The bizPlanNo to set.
	 * @uml.property  name="bizPlanNo"
	 */
    public void setBizPlanNo   ( String       bizPlanNo    ){    this.bizPlanNo    = bizPlanNo       ;    }
    /**
	 * @param bizPlanSno  The bizPlanSno to set.
	 * @uml.property  name="bizPlanSno"
	 */
    public void setBizPlanSno  ( String       bizPlanSno   ){    this.bizPlanSno   = bizPlanSno      ;    }
    /**
	 * @param bwkPrcsNo  The bwkPrcsNo to set.
	 * @uml.property  name="bwkPrcsNo"
	 */
    public void setBwkPrcsNo   ( String       bwkPrcsNo    ){    this.bwkPrcsNo    = bwkPrcsNo       ;    }
    /**
	 * @param bwkStepNo  The bwkStepNo to set.
	 * @uml.property  name="bwkStepNo"
	 */
    public void setBwkStepNo   ( String       bwkStepNo    ){    this.bwkStepNo    = bwkStepNo       ;    }
    /**
	 * @param evtsNo  The evtsNo to set.
	 * @uml.property  name="evtsNo"
	 */
    public void setEvtsNo      ( String       evtsNo       ){    this.evtsNo       = evtsNo          ;    }
    /**
	 * @param evtsNm  The evtsNm to set.
	 * @uml.property  name="evtsNm"
	 */
    public void setEvtsNm      ( String       evtsNm       ){    this.evtsNm       = evtsNm          ;    }
    /**
	 * @param nxtPrcsNo  The nxtPrcsNo to set.
	 * @uml.property  name="nxtPrcsNo"
	 */
    public void setNxtPrcsNo   ( String       nxtPrcsNo    ){    this.nxtPrcsNo    = nxtPrcsNo       ;    }
    /**
	 * @param nxtStepNo  The nxtStepNo to set.
	 * @uml.property  name="nxtStepNo"
	 */
    public void setNxtStepNo   ( String       nxtStepNo    ){    this.nxtStepNo    = nxtStepNo       ;    }
    /**
	 * @param dyCcd  The dyCcd to set.
	 * @uml.property  name="dyCcd"
	 */
    public void setDyCcd       ( String       dyCcd        ){    this.dyCcd        = dyCcd           ;    }
    /**
	 * @param pgmLinkNm  The pgmLinkNm to set.
	 * @uml.property  name="pgmLinkNm"
	 */
    public void setPgmLinkNm   ( String       pgmLinkNm    ){    this.pgmLinkNm    = pgmLinkNm       ;    }
    /**
	 * @param imgFileNm  The imgFileNm to set.
	 * @uml.property  name="imgFileNm"
	 */
    public void setImgFileNm   ( String       imgFileNm    ){    this.imgFileNm    = imgFileNm       ;    }
    /**
	 * @param epPlanNo  The epPlanNo to set.
	 * @uml.property  name="epPlanNo"
	 */
    public void setEpPlanNo    ( String       epPlanNo     ){    this.epPlanNo     = epPlanNo        ;    }
    /**
	 * @param evltNo  The evltNo to set.
	 * @uml.property  name="evltNo"
	 */
    public void setEvltNo      ( String       evltNo       ){    this.evltNo       = evltNo          ;    }
    /**
	 * @param evltOjtNo  The evltOjtNo to set.
	 * @uml.property  name="evltOjtNo"
	 */
    public void setEvltOjtNo   ( String       evltOjtNo    ){    this.evltOjtNo    = evltOjtNo       ;    }
    /**
	 * @param rgEmpno  The rgEmpno to set.
	 * @uml.property  name="rgEmpno"
	 */
    public void setRgEmpno     ( String       rgEmpno      ){    this.rgEmpno      = rgEmpno         ;    }
    /**
	 * @param sndTm  The sndTm to set.
	 * @uml.property  name="sndTm"
	 */
    public void setSndTm       ( String       sndTm        ){    this.sndTm        = sndTm           ;    }
    /**
	 * @param rcvTm  The rcvTm to set.
	 * @uml.property  name="rcvTm"
	 */
    public void setRcvTm       ( String       rcvTm        ){    this.rcvTm        = rcvTm           ;    }
    /**
	 * @param sndEvtsNo  The sndEvtsNo to set.
	 * @uml.property  name="sndEvtsNo"
	 */
    public void setSndEvtsNo   ( String       sndEvtsNo    ){    this.sndEvtsNo    = sndEvtsNo       ;    }
    /**
	 * @param rcvEvtsNo  The rcvEvtsNo to set.
	 * @uml.property  name="rcvEvtsNo"
	 */
    public void setRcvEvtsNo   ( String       rcvEvtsNo    ){    this.rcvEvtsNo    = rcvEvtsNo       ;    }
    /**
	 * @param nxtPgmLinkNm  The nxtPgmLinkNm to set.
	 * @uml.property  name="nxtPgmLinkNm"
	 */
    public void setNxtPgmLinkNm( String       nxtPgmLinkNm ){    this.nxtPgmLinkNm = nxtPgmLinkNm    ;    }
    /**
	 * @param param01  The param01 to set.
	 * @uml.property  name="param01"
	 */
    public void setParam01     ( String       param01      ){    this.param01      = param01         ;    }
    /**
	 * @param param02  The param02 to set.
	 * @uml.property  name="param02"
	 */
    public void setParam02     ( String       param02      ){    this.param02      = param02         ;    }
    /**
	 * @param param03  The param03 to set.
	 * @uml.property  name="param03"
	 */
    public void setParam03     ( String       param03      ){    this.param03      = param03         ;    }
    /**
	 * @param param04  The param04 to set.
	 * @uml.property  name="param04"
	 */
    public void setParam04     ( String       param04      ){    this.param04      = param04         ;    }
    /**
	 * @param param05  The param05 to set.
	 * @uml.property  name="param05"
	 */
    public void setParam05     ( String       param05      ){    this.param05      = param05         ;    }
    /**
	 * @param param06  The param06 to set.
	 * @uml.property  name="param06"
	 */
    public void setParam06     ( String       param06      ){    this.param06      = param06         ;    }
    /**
	 * @param param07  The param07 to set.
	 * @uml.property  name="param07"
	 */
    public void setParam07     ( String       param07      ){    this.param07      = param07         ;    }
    /**
	 * @param param08  The param08 to set.
	 * @uml.property  name="param08"
	 */
    public void setParam08     ( String       param08      ){    this.param08      = param08         ;    }
    /**
	 * @param param09  The param09 to set.
	 * @uml.property  name="param09"
	 */
    public void setParam09     ( String       param09      ){    this.param09      = param09         ;    }
    /**
	 * @param param10  The param10 to set.
	 * @uml.property  name="param10"
	 */
    public void setParam10     ( String       param10      ){    this.param10      = param10         ;    }
    /**
	 * @param wParam01  The wParam01 to set.
	 * @uml.property  name="wParam01"
	 */
    public void setWParam01    ( String       wParam01     ){    this.wParam01     = wParam01        ;    }
    /**
	 * @param wParam02  The wParam02 to set.
	 * @uml.property  name="wParam02"
	 */
    public void setWParam02    ( String       wParam02     ){    this.wParam02     = wParam02        ;    }
    /**
	 * @param wParam03  The wParam03 to set.
	 * @uml.property  name="wParam03"
	 */
    public void setWParam03    ( String       wParam03     ){    this.wParam03     = wParam03        ;    }
    /**
	 * @param wParam04  The wParam04 to set.
	 * @uml.property  name="wParam04"
	 */
    public void setWParam04    ( String       wParam04     ){    this.wParam04     = wParam04        ;    }
    /**
	 * @param wParam05  The wParam05 to set.
	 * @uml.property  name="wParam05"
	 */
    public void setWParam05    ( String       wParam05     ){    this.wParam05     = wParam05        ;    }
    /**
	 * @param wParam06  The wParam06 to set.
	 * @uml.property  name="wParam06"
	 */
    public void setWParam06    ( String       wParam06     ){    this.wParam06     = wParam06        ;    }
    /**
	 * @param wParam07  The wParam07 to set.
	 * @uml.property  name="wParam07"
	 */
    public void setWParam07    ( String       wParam07     ){    this.wParam07     = wParam07        ;    }
    /**
	 * @param wParam08  The wParam08 to set.
	 * @uml.property  name="wParam08"
	 */
    public void setWParam08    ( String       wParam08     ){    this.wParam08     = wParam08        ;    }
    /**
	 * @param wParam09  The wParam09 to set.
	 * @uml.property  name="wParam09"
	 */
    public void setWParam09    ( String       wParam09     ){    this.wParam09     = wParam09        ;    }
    /**
	 * @param wParam10  The wParam10 to set.
	 * @uml.property  name="wParam10"
	 */
    public void setWParam10    ( String       wParam10     ){    this.wParam10     = wParam10        ;    }

    public static WKFHELP fromRequest(HttpServletRequest request) {
        WKFHELP model = new WKFHELP();
        try {
            model.setBizPlanNo       (JSPUtil.getParameter(request, "bizPlanNo           ".trim(), ""));
            model.setBizPlanSno      (JSPUtil.getParameter(request, "bizPlanSno          ".trim(), ""));
            model.setBwkPrcsNo       (JSPUtil.getParameter(request, "bwkPrcsNo           ".trim(), ""));
            model.setBwkStepNo       (JSPUtil.getParameter(request, "bwkStepNo           ".trim(), ""));
            model.setEvtsNo          (JSPUtil.getParameter(request, "evtsNo              ".trim(), ""));
            model.setEvtsNm          (JSPUtil.getParameter(request, "evtsNm              ".trim(), ""));
            model.setNxtPrcsNo       (JSPUtil.getParameter(request, "nxtPrcsNo           ".trim(), ""));
            model.setNxtStepNo       (JSPUtil.getParameter(request, "nxtStepNo           ".trim(), ""));
            model.setDyCcd           (JSPUtil.getParameter(request, "dyCcd               ".trim(), ""));
            model.setPgmLinkNm       (JSPUtil.getParameter(request, "pgmLinkNm           ".trim(), ""));
            model.setImgFileNm       (JSPUtil.getParameter(request, "imgFileNm           ".trim(), ""));
            model.setEpPlanNo        (JSPUtil.getParameter(request, "epPlanNo            ".trim(), ""));
            model.setEvltNo          (JSPUtil.getParameter(request, "evltNo              ".trim(), ""));
            model.setEvltOjtNo       (JSPUtil.getParameter(request, "evltOjtNo           ".trim(), ""));
            model.setRgEmpno         (JSPUtil.getParameter(request, "rgEmpno             ".trim(), ""));
            model.setSndTm           (JSPUtil.getParameter(request, "sndTm               ".trim(), ""));
            model.setRcvTm           (JSPUtil.getParameter(request, "rcvTm               ".trim(), ""));
            model.setSndEvtsNo       (JSPUtil.getParameter(request, "sndEvtsNo           ".trim(), ""));
            model.setRcvEvtsNo       (JSPUtil.getParameter(request, "rcvEvtsNo           ".trim(), ""));
            model.setNxtPgmLinkNm    (JSPUtil.getParameter(request, "nxtPgmLinkNm        ".trim(), ""));
            model.setParam01         (JSPUtil.getParameter(request, "param01             ".trim(), ""));
            model.setParam02         (JSPUtil.getParameter(request, "param02             ".trim(), ""));
            model.setParam03         (JSPUtil.getParameter(request, "param03             ".trim(), ""));
            model.setParam04         (JSPUtil.getParameter(request, "param04             ".trim(), ""));
            model.setParam05         (JSPUtil.getParameter(request, "param05             ".trim(), ""));
            model.setParam06         (JSPUtil.getParameter(request, "param06             ".trim(), ""));
            model.setParam07         (JSPUtil.getParameter(request, "param07             ".trim(), ""));
            model.setParam08         (JSPUtil.getParameter(request, "param08             ".trim(), ""));
            model.setParam09         (JSPUtil.getParameter(request, "param09             ".trim(), ""));
            model.setParam10         (JSPUtil.getParameter(request, "param10             ".trim(), ""));
            model.setWParam01        (JSPUtil.getParameter(request, "wParam01            ".trim(), ""));
            model.setWParam02        (JSPUtil.getParameter(request, "wParam02            ".trim(), ""));
            model.setWParam03        (JSPUtil.getParameter(request, "wParam03            ".trim(), ""));
            model.setWParam04        (JSPUtil.getParameter(request, "wParam04            ".trim(), ""));
            model.setWParam05        (JSPUtil.getParameter(request, "wParam05            ".trim(), ""));
            model.setWParam06        (JSPUtil.getParameter(request, "wParam06            ".trim(), ""));
            model.setWParam07        (JSPUtil.getParameter(request, "wParam07            ".trim(), ""));
            model.setWParam08        (JSPUtil.getParameter(request, "wParam08            ".trim(), ""));
            model.setWParam09        (JSPUtil.getParameter(request, "wParam09            ".trim(), ""));
            model.setWParam10        (JSPUtil.getParameter(request, "wParam10            ".trim(), ""));
        } catch (Exception ex) {
            //throw new Exception(ex.getMessage());
        }
        return model;
    }
    public static Collection fromRequest(HttpServletRequest request, int length) {
        WKFHELP model = null;
        Collection models = new ArrayList();
        try {
            String[] bizPlanNo    =  (JSPUtil.getParameter(request, "bizPlanNo           ".trim(), length));
            String[] bizPlanSno   =  (JSPUtil.getParameter(request, "bizPlanSno          ".trim(), length));
            String[] bwkPrcsNo    =  (JSPUtil.getParameter(request, "bwkPrcsNo           ".trim(), length));
            String[] bwkStepNo    =  (JSPUtil.getParameter(request, "bwkStepNo           ".trim(), length));
            String[] evtsNo       =  (JSPUtil.getParameter(request, "evtsNo              ".trim(), length));
            String[] evtsNm       =  (JSPUtil.getParameter(request, "evtsNm              ".trim(), length));
            String[] nxtPrcsNo    =  (JSPUtil.getParameter(request, "nxtPrcsNo           ".trim(), length));
            String[] nxtStepNo    =  (JSPUtil.getParameter(request, "nxtStepNo           ".trim(), length));
            String[] dyCcd        =  (JSPUtil.getParameter(request, "dyCcd               ".trim(), length));
            String[] pgmLinkNm    =  (JSPUtil.getParameter(request, "pgmLinkNm           ".trim(), length));
            String[] imgFileNm    =  (JSPUtil.getParameter(request, "imgFileNm           ".trim(), length));
            String[] epPlanNo     =  (JSPUtil.getParameter(request, "epPlanNo            ".trim(), length));
            String[] evltNo       =  (JSPUtil.getParameter(request, "evltNo              ".trim(), length));
            String[] evltOjtNo    =  (JSPUtil.getParameter(request, "evltOjtNo           ".trim(), length));
            String[] rgEmpno      =  (JSPUtil.getParameter(request, "rgEmpno             ".trim(), length));
            String[] sndTm        =  (JSPUtil.getParameter(request, "sndTm               ".trim(), length));
            String[] rcvTm        =  (JSPUtil.getParameter(request, "rcvTm               ".trim(), length));
            String[] sndEvtsNo    =  (JSPUtil.getParameter(request, "sndEvtsNo           ".trim(), length));
            String[] rcvEvtsNo    =  (JSPUtil.getParameter(request, "rcvEvtsNo           ".trim(), length));
            String[] nxtPgmLinkNm =  (JSPUtil.getParameter(request, "nxtPgmLinkNm        ".trim(), length));
            String[] param01      =  (JSPUtil.getParameter(request, "param01             ".trim(), length));
            String[] param02      =  (JSPUtil.getParameter(request, "param02             ".trim(), length));
            String[] param03      =  (JSPUtil.getParameter(request, "param03             ".trim(), length));
            String[] param04      =  (JSPUtil.getParameter(request, "param04             ".trim(), length));
            String[] param05      =  (JSPUtil.getParameter(request, "param05             ".trim(), length));
            String[] param06      =  (JSPUtil.getParameter(request, "param06             ".trim(), length));
            String[] param07      =  (JSPUtil.getParameter(request, "param07             ".trim(), length));
            String[] param08      =  (JSPUtil.getParameter(request, "param08             ".trim(), length));
            String[] param09      =  (JSPUtil.getParameter(request, "param09             ".trim(), length));
            String[] param10      =  (JSPUtil.getParameter(request, "param10             ".trim(), length));
            String[] wParam01     =  (JSPUtil.getParameter(request, "wParam01            ".trim(), length));
            String[] wParam02     =  (JSPUtil.getParameter(request, "wParam02            ".trim(), length));
            String[] wParam03     =  (JSPUtil.getParameter(request, "wParam03            ".trim(), length));
            String[] wParam04     =  (JSPUtil.getParameter(request, "wParam04            ".trim(), length));
            String[] wParam05     =  (JSPUtil.getParameter(request, "wParam05            ".trim(), length));
            String[] wParam06     =  (JSPUtil.getParameter(request, "wParam06            ".trim(), length));
            String[] wParam07     =  (JSPUtil.getParameter(request, "wParam07            ".trim(), length));
            String[] wParam08     =  (JSPUtil.getParameter(request, "wParam08            ".trim(), length));
            String[] wParam09     =  (JSPUtil.getParameter(request, "wParam09            ".trim(), length));
            String[] wParam10     =  (JSPUtil.getParameter(request, "wParam10            ".trim(), length));
            for (int i = 0; i < length; i++) {
                model = new WKFHELP();
                model.setBizPlanNo             (bizPlanNo       [i]);
                model.setBizPlanSno            (bizPlanSno      [i]);
                model.setBwkPrcsNo             (bwkPrcsNo       [i]);
                model.setBwkStepNo             (bwkStepNo       [i]);
                model.setEvtsNo                (evtsNo          [i]);
                model.setEvtsNm                (evtsNm          [i]);
                model.setNxtPrcsNo             (nxtPrcsNo       [i]);
                model.setNxtStepNo             (nxtStepNo       [i]);
                model.setDyCcd                 (dyCcd           [i]);
                model.setPgmLinkNm             (pgmLinkNm       [i]);
                model.setImgFileNm             (imgFileNm       [i]);
                model.setEpPlanNo              (epPlanNo        [i]);
                model.setEvltNo                (evltNo          [i]);
                model.setEvltOjtNo             (evltOjtNo       [i]);
                model.setRgEmpno               (rgEmpno         [i]);
                model.setSndTm                 (sndTm           [i]);
                model.setRcvTm                 (rcvTm           [i]);
                model.setSndEvtsNo             (sndEvtsNo       [i]);
                model.setRcvEvtsNo             (rcvEvtsNo       [i]);
                model.setNxtPgmLinkNm          (nxtPgmLinkNm    [i]);
                model.setParam01               (param01         [i]);
                model.setParam02               (param02         [i]);
                model.setParam03               (param03         [i]);
                model.setParam04               (param04         [i]);
                model.setParam05               (param05         [i]);
                model.setParam06               (param06         [i]);
                model.setParam07               (param07         [i]);
                model.setParam08               (param08         [i]);
                model.setParam09               (param09         [i]);
                model.setParam10               (param10         [i]);
                model.setWParam01              (wParam01        [i]);
                model.setWParam02              (wParam02        [i]);
                model.setWParam03              (wParam03        [i]);
                model.setWParam04              (wParam04        [i]);
                model.setWParam05              (wParam05        [i]);
                model.setWParam06              (wParam06        [i]);
                model.setWParam07              (wParam07        [i]);
                model.setWParam08              (wParam08        [i]);
                model.setWParam09              (wParam09        [i]);
                model.setWParam10              (wParam10        [i]);
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
