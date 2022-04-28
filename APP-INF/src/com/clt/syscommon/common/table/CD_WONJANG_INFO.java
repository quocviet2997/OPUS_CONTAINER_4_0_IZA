package com.clt.syscommon.common.table;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.http.HttpServletRequest;

import com.clt.framework.component.util.JSPUtil;

/**
 *  클래스 개요 : Table Value Ojbect <p>
 *  작성일 : 2003.08.11<p>
 *  @version 1.0
 *  @author  이준직
 */public final class CD_WONJANG_INFO implements java.io.Serializable {

    private String                       imagekey                     	= "";
    private String                       kubun_code                   	= "";
    private String                       cif_no		                  	= "";
    private String                       silmyung_no                  	= "";
    private String                       saupja_no	                  	= "";
    private String                       card_no			          	= "";
    private String                       balsaeng_date		          	= "";
    private String                       sojija_kubun			      	= "";
    private String                       jehyu_kubun	              	= "";
    private String                       jehyu_name	           			= "";
    private String                       name	               			= "";
    private String                       kr_branch_no	       			= "";
    private String                       gurae_branch_no	       		= "";
    private String                       old_card_no	           		= "";
    private String                       part_no	               		= "";
    private String                       haeji_date	           			= "";
    private String                       balsaeng_time	           			= "";
    private String                       filler	               			= "";
    

    public CD_WONJANG_INFO(){}

    public CD_WONJANG_INFO(
            String                       imagekey                	,
            String                       kubun_code              	,
            String                       cif_no		            	,
            String                       silmyung_no             	,
            String                       saupja_no	            	,
            String                       card_no			        ,
            String                       balsaeng_date		    	,
            String                       sojija_kubun		    	,
            String                       jehyu_kubun	            ,
            String                       jehyu_name	            	,
            String                       name	                	,
            String                       kr_branch_no	        	,
            String                       gurae_branch_no	        ,
            String                       old_card_no	            ,
            String                       part_no	                ,
            String                       haeji_date	            	,
            String                       balsaeng_time	            	,
            String                       filler	 			){
        this.imagekey            = imagekey              	;
        this.kubun_code          = kubun_code            	;
        this.cif_no		         = cif_no		          	;
        this.silmyung_no         = silmyung_no           	;
        this.saupja_no	         = saupja_no	          	;
        this.card_no		     = card_no		          	;
        this.balsaeng_date	     = balsaeng_date	      	;
        this.sojija_kubun	     = sojija_kubun	     		;
        this.jehyu_kubun	     = jehyu_kubun	          	;
        this.jehyu_name	         = jehyu_name	          	;
        this.name	             = name	              		;
        this.kr_branch_no	     = kr_branch_no	      		;
        this.gurae_branch_no     = gurae_branch_no       	;
        this.old_card_no	     = old_card_no	          	;
        this.part_no	         = part_no	              	;
        this.haeji_date	         = haeji_date	          	;
        this.balsaeng_time	         = balsaeng_time	          	;
        this.filler	             = filler	              	;	
    }

    // getter method is proceeding ..
    public String                       getImagekey          	(){    return imagekey                    	;    }
    public String                       getKubun_code        	(){    return kubun_code                  	;    }
    public String                       getCif_no		      	(){    return cif_no		                ;    }
    public String                       getSilmyung_no       	(){    return silmyung_no                 	;    }
    public String                       getSaupja_no	      	(){    return saupja_no	                	;    }
    public String                       getCard_no		      	(){    return card_no		                ;    }
    public String                       getBalsaeng_date	  	(){    return balsaeng_date	            	;    }
    public String                       getSojija_kubun	  		(){    return sojija_kubun	  		    	;    }
    public String                       getJehyu_kubun	      	(){    return jehyu_kubun	                ;    }
    public String                       getJehyu_name	      	(){    return jehyu_name	                ;    }
    public String                       getName	          		(){    return name	          		    	;    }
    public String                       getKr_branch_no	  		(){    return kr_branch_no	  		    	;    }
    public String                       getGurae_branch_no   	(){    return gurae_branch_no             	;    }
    public String                       getOld_card_no	      	(){    return old_card_no	                ;    }
    public String                       getPart_no	          	(){    return part_no	                    ;    }
    public String                       getHaeji_date	      	(){    return haeji_date	                ;    }
    public String                       getBalsaeng_time	      	(){    return balsaeng_time	                ;    }
    public String                       getFiller	          	(){    return filler	                    ;    }


    // setter method is proceeding ..
    public void setImagekey          	( String                       imagekey                 	){    this.imagekey                 	= imagekey                    	;    }
    public void setKubun_code        	( String                       kubun_code               	){    this.kubun_code               	= kubun_code                  	;    }
    public void setCif_no		      	( String                       cif_no		             	){    this.cif_no		             	= cif_no		                ;    }
    public void setSilmyung_no       	( String                       silmyung_no              	){    this.silmyung_no              	= silmyung_no                 	;    }
    public void setSaupja_no	      	( String                       saupja_no	             	){    this.saupja_no	             	= saupja_no	                	;    }
    public void setCard_no		      	( String                       card_no		             	){    this.card_no		             	= card_no		                ;    }
    public void setBalsaeng_date	  	( String                       balsaeng_date	         	){    this.balsaeng_date	         	= balsaeng_date	            	;    }
    public void setSojija_kubun	  		( String                       sojija_kubun	  	     		){    this.sojija_kubun	  	     		= sojija_kubun	  	        	;    }
    public void setJehyu_kubun	      	( String                       jehyu_kubun	             	){    this.jehyu_kubun	             	= jehyu_kubun	                ;    }
    public void setJehyu_name	      	( String                       jehyu_name	             	){    this.jehyu_name	             	= jehyu_name	                ;    }
    public void setName	          		( String                       name	          	     		){    this.name	          	     		= name	          	        	;    }
    public void setKr_branch_no	  		( String                       kr_branch_no	  	     		){    this.kr_branch_no	  	     		= kr_branch_no	  	        	;    }
    public void setGurae_branch_no   	( String                       gurae_branch_no          	){    this.gurae_branch_no          	= gurae_branch_no             	;    }
    public void setOld_card_no	      	( String                       old_card_no	             	){    this.old_card_no	             	= old_card_no	                ;    }
    public void setPart_no	          	( String                       part_no	                 	){    this.part_no	                 	= part_no	                    ;    }
    public void setHaeji_date	      	( String                       haeji_date	             	){    this.haeji_date	             	= haeji_date	                ;    }
    public void setBalsaeng_time	      	( String                       balsaeng_time	             	){    this.balsaeng_time	             	= balsaeng_time	                ;    }
    public void setFiller	          	( String                       filler	                 	){    this.filler	                 	= filler	                    ;    }


    public static CD_WONJANG_INFO fromRequest(HttpServletRequest request) {
        CD_WONJANG_INFO model = new CD_WONJANG_INFO();
        try {
            model.setImagekey          	(JSPUtil.getParameter(request, "imagekey                              ".trim(), ""));
            model.setKubun_code        	(JSPUtil.getParameter(request, "kubun_code                            ".trim(), ""));
            model.setCif_no		      	(JSPUtil.getParameter(request, "cif_no		                          ".trim(), ""));
            model.setSilmyung_no       	(JSPUtil.getParameter(request, "silmyung_no                           ".trim(), ""));
            model.setSaupja_no	      	(JSPUtil.getParameter(request, "saupja_no	                          ".trim(), ""));
            model.setCard_no		    (JSPUtil.getParameter(request, "card_no		                          ".trim(), ""));
            model.setBalsaeng_date	  	(JSPUtil.getParameter(request, "balsaeng_date	                      ".trim(), ""));
            model.setSojija_kubun	  	(JSPUtil.getParameter(request, "sojija_kubun	  	     	          ".trim(), ""));
            model.setJehyu_kubun	    (JSPUtil.getParameter(request, "jehyu_kubun	                          ".trim(), ""));
            model.setJehyu_name	      	(JSPUtil.getParameter(request, "jehyu_name	                          ".trim(), ""));
            model.setName	          	(JSPUtil.getParameter(request, "name	          	     	          ".trim(), ""));
            model.setKr_branch_no	  	(JSPUtil.getParameter(request, "kr_branch_no	  	     	          ".trim(), ""));
            model.setGurae_branch_no   	(JSPUtil.getParameter(request, "gurae_branch_no                       ".trim(), ""));
            model.setOld_card_no	    (JSPUtil.getParameter(request, "old_card_no	                          ".trim(), ""));
            model.setPart_no	        (JSPUtil.getParameter(request, "part_no	                              ".trim(), ""));
            model.setHaeji_date	      	(JSPUtil.getParameter(request, "haeji_date	                          ".trim(), ""));
            model.setBalsaeng_time	      	(JSPUtil.getParameter(request, "balsaeng_time	                          ".trim(), ""));
            model.setFiller	          	(JSPUtil.getParameter(request, "filler	                              ".trim(), ""));
        } catch (Exception ex) {
            //throw new Exception(ex.getMessage());
        }
        return model;
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
