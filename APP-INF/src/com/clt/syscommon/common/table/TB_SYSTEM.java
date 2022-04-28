package com.clt.syscommon.common.table;

import com.clt.framework.component.util.JSPUtil;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import javax.servlet.http.HttpServletRequest;

/**
 * 1. 기능 : Table Value Ojbect <p> 2. 처리개요 : <p> - 모든 업무에서 공통으로 사용하는 PDTO(Data Transfer Object including Parameters) <p> - 관련 Event에서 작성, 서버실행요청시 PDTO의 역할을 수행하는 Value Object <p> 3. 주의사항 : <p>
 * @author  : 한성환
 * @version  : v1.0.0
 * @see  : 관련 Event , HTMLAction 참조
 * @since  : JDK 1.3 or EJB 1.1
 */
public final class TB_SYSTEM implements java.io.Serializable {

    /**
	 */
    private String      untsysno    = "";
    /**
	 */
    private String      untsysgrpno = "";
    /**
	 */
    private String      unitsysnm   = "";
    /**
	 */
    private String      projnm      = "";
    /**
	 */
    private String      dvlpstdt    = "";
    /**
	 */
    private String      dvlpenddt   = "";
    /**
	 */
    private String      dvlptermmt  = "";
    /**
	 */
    private String      oprstdt     = "";
    /**
	 */
    private String      oprenddt    = "";
    /**
	 */
    private String      lifetermyr  = "";
    /**
	 */
    private String      usercnt     = "";
    /**
	 */
    private String      systpcd     = "";
    /**
	 */
    private String      sysstuscd   = "";
    /**
	 */
    private String      invttpcd    = "";
    /**
	 */
    private String      oprchrgpnm  = "";
    /**
	 */
    private String      dvlpchrgpnm = "";
    /**
	 */
    private String      usgfg       = "";
    /**
	 */
    private String      filepath    = "";
    /**
	 */
    private String      rgtm        = "";
    /**
	 */
    private String      mdftm       = "";

    public TB_SYSTEM(){}

    public TB_SYSTEM(
            String      untsysno   ,
            String      untsysgrpno,
            String      unitsysnm  ,
            String      projnm     ,
            String      dvlpstdt   ,
            String      dvlpenddt  ,
            String      dvlptermmt ,
            String      oprstdt    ,
            String      oprenddt   ,
            String      lifetermyr ,
            String      usercnt    ,
            String      systpcd    ,
            String      sysstuscd  ,
            String      invttpcd   ,
            String      oprchrgpnm ,
            String      dvlpchrgpnm,
            String      usgfg      ,
            String      filepath   ,
            String      rgtm       ,
            String      mdftm      ){
        this.untsysno    = untsysno   ;
        this.untsysgrpno = untsysgrpno;
        this.unitsysnm   = unitsysnm  ;
        this.projnm      = projnm     ;
        this.dvlpstdt    = dvlpstdt   ;
        this.dvlpenddt   = dvlpenddt  ;
        this.dvlptermmt  = dvlptermmt ;
        this.oprstdt     = oprstdt    ;
        this.oprenddt    = oprenddt   ;
        this.lifetermyr  = lifetermyr ;
        this.usercnt     = usercnt    ;
        this.systpcd     = systpcd    ;
        this.sysstuscd   = sysstuscd  ;
        this.invttpcd    = invttpcd   ;
        this.oprchrgpnm  = oprchrgpnm ;
        this.dvlpchrgpnm = dvlpchrgpnm;
        this.usgfg       = usgfg      ;
        this.filepath    = filepath   ;
        this.rgtm        = rgtm       ;
        this.mdftm       = mdftm      ;
    }

    // getter method is proceeding ..
    /**
	 * @return  Returns the untsysno.
	 */
    public String      getUntsysno   (){    return untsysno       ;    }
    /**
	 * @return  Returns the untsysgrpno.
	 */
    public String      getUntsysgrpno(){    return untsysgrpno    ;    }
    /**
	 * @return  Returns the unitsysnm.
	 */
    public String      getUnitsysnm  (){    return unitsysnm      ;    }
    /**
	 * @return  Returns the projnm.
	 */
    public String      getProjnm     (){    return projnm         ;    }
    /**
	 * @return  Returns the dvlpstdt.
	 */
    public String      getDvlpstdt   (){    return dvlpstdt       ;    }
    /**
	 * @return  Returns the dvlpenddt.
	 */
    public String      getDvlpenddt  (){    return dvlpenddt      ;    }
    /**
	 * @return  Returns the dvlptermmt.
	 */
    public String      getDvlptermmt (){    return dvlptermmt     ;    }
    /**
	 * @return  Returns the oprstdt.
	 */
    public String      getOprstdt    (){    return oprstdt        ;    }
    /**
	 * @return  Returns the oprenddt.
	 */
    public String      getOprenddt   (){    return oprenddt       ;    }
    /**
	 * @return  Returns the lifetermyr.
	 */
    public String      getLifetermyr (){    return lifetermyr     ;    }
    /**
	 * @return  Returns the usercnt.
	 */
    public String      getUsercnt    (){    return usercnt        ;    }
    /**
	 * @return  Returns the systpcd.
	 */
    public String      getSystpcd    (){    return systpcd        ;    }
    /**
	 * @return  Returns the sysstuscd.
	 */
    public String      getSysstuscd  (){    return sysstuscd      ;    }
    /**
	 * @return  Returns the invttpcd.
	 */
    public String      getInvttpcd   (){    return invttpcd       ;    }
    /**
	 * @return  Returns the oprchrgpnm.
	 */
    public String      getOprchrgpnm (){    return oprchrgpnm     ;    }
    /**
	 * @return  Returns the dvlpchrgpnm.
	 */
    public String      getDvlpchrgpnm(){    return dvlpchrgpnm    ;    }
    /**
	 * @return  Returns the usgfg.
	 */
    public String      getUsgfg      (){    return usgfg          ;    }
    /**
	 * @return  Returns the filepath.
	 */
    public String      getFilepath   (){    return filepath       ;    }
    /**
	 * @return  Returns the rgtm.
	 */
    public String      getRgtm       (){    return rgtm           ;    }
    /**
	 * @return  Returns the mdftm.
	 */
    public String      getMdftm      (){    return mdftm          ;    }

    // setter method is proceeding ..
    /**
	 * @param untsysno  The untsysno to set.
	 */
    public void setUntsysno   ( String      untsysno    ){    this.untsysno    = untsysno       ;    }
    /**
	 * @param untsysgrpno  The untsysgrpno to set.
	 */
    public void setUntsysgrpno( String      untsysgrpno ){    this.untsysgrpno = untsysgrpno    ;    }
    /**
	 * @param unitsysnm  The unitsysnm to set.
	 */
    public void setUnitsysnm  ( String      unitsysnm   ){    this.unitsysnm   = unitsysnm      ;    }
    /**
	 * @param projnm  The projnm to set.
	 */
    public void setProjnm     ( String      projnm      ){    this.projnm      = projnm         ;    }
    /**
	 * @param dvlpstdt  The dvlpstdt to set.
	 */
    public void setDvlpstdt   ( String      dvlpstdt    ){    this.dvlpstdt    = dvlpstdt       ;    }
    /**
	 * @param dvlpenddt  The dvlpenddt to set.
	 */
    public void setDvlpenddt  ( String      dvlpenddt   ){    this.dvlpenddt   = dvlpenddt      ;    }
    /**
	 * @param dvlptermmt  The dvlptermmt to set.
	 */
    public void setDvlptermmt ( String      dvlptermmt  ){    this.dvlptermmt  = dvlptermmt     ;    }
    /**
	 * @param oprstdt  The oprstdt to set.
	 */
    public void setOprstdt    ( String      oprstdt     ){    this.oprstdt     = oprstdt        ;    }
    /**
	 * @param oprenddt  The oprenddt to set.
	 */
    public void setOprenddt   ( String      oprenddt    ){    this.oprenddt    = oprenddt       ;    }
    /**
	 * @param lifetermyr  The lifetermyr to set.
	 */
    public void setLifetermyr ( String      lifetermyr  ){    this.lifetermyr  = lifetermyr     ;    }
    /**
	 * @param usercnt  The usercnt to set.
	 */
    public void setUsercnt    ( String      usercnt     ){    this.usercnt     = usercnt        ;    }
    /**
	 * @param systpcd  The systpcd to set.
	 */
    public void setSystpcd    ( String      systpcd     ){    this.systpcd     = systpcd        ;    }
    /**
	 * @param sysstuscd  The sysstuscd to set.
	 */
    public void setSysstuscd  ( String      sysstuscd   ){    this.sysstuscd   = sysstuscd      ;    }
    /**
	 * @param invttpcd  The invttpcd to set.
	 */
    public void setInvttpcd   ( String      invttpcd    ){    this.invttpcd    = invttpcd       ;    }
    /**
	 * @param oprchrgpnm  The oprchrgpnm to set.
	 */
    public void setOprchrgpnm ( String      oprchrgpnm  ){    this.oprchrgpnm  = oprchrgpnm     ;    }
    /**
	 * @param dvlpchrgpnm  The dvlpchrgpnm to set.
	 */
    public void setDvlpchrgpnm( String      dvlpchrgpnm ){    this.dvlpchrgpnm = dvlpchrgpnm    ;    }
    /**
	 * @param usgfg  The usgfg to set.
	 */
    public void setUsgfg      ( String      usgfg       ){    this.usgfg       = usgfg          ;    }
    /**
	 * @param filepath  The filepath to set.
	 */
    public void setFilepath   ( String      filepath    ){    this.filepath    = filepath       ;    }
    /**
	 * @param rgtm  The rgtm to set.
	 */
    public void setRgtm       ( String      rgtm        ){    this.rgtm        = rgtm           ;    }
    /**
	 * @param mdftm  The mdftm to set.
	 */
    public void setMdftm      ( String      mdftm       ){    this.mdftm       = mdftm          ;    }

    public static TB_SYSTEM fromRequest(HttpServletRequest request) {
        TB_SYSTEM model = new TB_SYSTEM();
        try {
            model.setUntsysno       (JSPUtil.getParameter(request, "untsysno           ".trim(), ""));
            model.setUntsysgrpno    (JSPUtil.getParameter(request, "untsysgrpno        ".trim(), ""));
            model.setUnitsysnm      (JSPUtil.getParameter(request, "unitsysnm          ".trim(), ""));
            model.setProjnm         (JSPUtil.getParameter(request, "projnm             ".trim(), ""));
            model.setDvlpstdt       (JSPUtil.getParameter(request, "dvlpstdt           ".trim(), ""));
            model.setDvlpenddt      (JSPUtil.getParameter(request, "dvlpenddt          ".trim(), ""));
            model.setDvlptermmt     (JSPUtil.getParameter(request, "dvlptermmt         ".trim(), ""));
            model.setOprstdt        (JSPUtil.getParameter(request, "oprstdt            ".trim(), ""));
            model.setOprenddt       (JSPUtil.getParameter(request, "oprenddt           ".trim(), ""));
            model.setLifetermyr     (JSPUtil.getParameter(request, "lifetermyr         ".trim(), ""));
            model.setUsercnt        (JSPUtil.getParameter(request, "usercnt            ".trim(), ""));
            model.setSystpcd        (JSPUtil.getParameter(request, "systpcd            ".trim(), ""));
            model.setSysstuscd      (JSPUtil.getParameter(request, "sysstuscd          ".trim(), ""));
            model.setInvttpcd       (JSPUtil.getParameter(request, "invttpcd           ".trim(), ""));
            model.setOprchrgpnm     (JSPUtil.getParameter(request, "oprchrgpnm         ".trim(), ""));
            model.setDvlpchrgpnm    (JSPUtil.getParameter(request, "dvlpchrgpnm        ".trim(), ""));
            model.setUsgfg          (JSPUtil.getParameter(request, "usgfg              ".trim(), ""));
            model.setFilepath       (JSPUtil.getParameter(request, "filepath           ".trim(), ""));
            model.setRgtm           (JSPUtil.getParameter(request, "rgtm               ".trim(), ""));
            model.setMdftm          (JSPUtil.getParameter(request, "mdftm              ".trim(), ""));
        } catch (Exception ex) {
            //throw new Exception(ex.getMessage());
        }
        return model;
    }
    public static Collection fromRequest(HttpServletRequest request, int length) {
        TB_SYSTEM model = null;
        Collection models = new ArrayList();
        try {
            String[] untsysno    =  (JSPUtil.getParameter(request, "untsysno           ".trim(), length));
            String[] untsysgrpno =  (JSPUtil.getParameter(request, "untsysgrpno        ".trim(), length));
            String[] unitsysnm   =  (JSPUtil.getParameter(request, "unitsysnm          ".trim(), length));
            String[] projnm      =  (JSPUtil.getParameter(request, "projnm             ".trim(), length));
            String[] dvlpstdt    =  (JSPUtil.getParameter(request, "dvlpstdt           ".trim(), length));
            String[] dvlpenddt   =  (JSPUtil.getParameter(request, "dvlpenddt          ".trim(), length));
            String[] dvlptermmt  =  (JSPUtil.getParameter(request, "dvlptermmt         ".trim(), length));
            String[] oprstdt     =  (JSPUtil.getParameter(request, "oprstdt            ".trim(), length));
            String[] oprenddt    =  (JSPUtil.getParameter(request, "oprenddt           ".trim(), length));
            String[] lifetermyr  =  (JSPUtil.getParameter(request, "lifetermyr         ".trim(), length));
            String[] usercnt     =  (JSPUtil.getParameter(request, "usercnt            ".trim(), length));
            String[] systpcd     =  (JSPUtil.getParameter(request, "systpcd            ".trim(), length));
            String[] sysstuscd   =  (JSPUtil.getParameter(request, "sysstuscd          ".trim(), length));
            String[] invttpcd    =  (JSPUtil.getParameter(request, "invttpcd           ".trim(), length));
            String[] oprchrgpnm  =  (JSPUtil.getParameter(request, "oprchrgpnm         ".trim(), length));
            String[] dvlpchrgpnm =  (JSPUtil.getParameter(request, "dvlpchrgpnm        ".trim(), length));
            String[] usgfg       =  (JSPUtil.getParameter(request, "usgfg              ".trim(), length));
            String[] filepath    =  (JSPUtil.getParameter(request, "filepath           ".trim(), length));
            String[] rgtm        =  (JSPUtil.getParameter(request, "rgtm               ".trim(), length));
            String[] mdftm       =  (JSPUtil.getParameter(request, "mdftm              ".trim(), length));
            for (int i = 0; i < length; i++) {
                model = new TB_SYSTEM();
                model.setUntsysno             (untsysno       [i]);
                model.setUntsysgrpno          (untsysgrpno    [i]);
                model.setUnitsysnm            (unitsysnm      [i]);
                model.setProjnm               (projnm         [i]);
                model.setDvlpstdt             (dvlpstdt       [i]);
                model.setDvlpenddt            (dvlpenddt      [i]);
                model.setDvlptermmt           (dvlptermmt     [i]);
                model.setOprstdt              (oprstdt        [i]);
                model.setOprenddt             (oprenddt       [i]);
                model.setLifetermyr           (lifetermyr     [i]);
                model.setUsercnt              (usercnt        [i]);
                model.setSystpcd              (systpcd        [i]);
                model.setSysstuscd            (sysstuscd      [i]);
                model.setInvttpcd             (invttpcd       [i]);
                model.setOprchrgpnm           (oprchrgpnm     [i]);
                model.setDvlpchrgpnm          (dvlpchrgpnm    [i]);
                model.setUsgfg                (usgfg          [i]);
                model.setFilepath             (filepath       [i]);
                model.setRgtm                 (rgtm           [i]);
                model.setMdftm                (mdftm          [i]);
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
