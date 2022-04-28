/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : T_CODEDOMAIN.java
*@FileTitle : 공통코드관리
*Open Issues :
*Change history :
*@LastModifyDate : 2006-09-07
*@LastModifier : SeongWook Kim
*@LastVersion : 1.0
* 2006-09-07 SeongWook Kim
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
 * @author SeongWook Kim
 * @since J2EE 1.4
 */
public final class T_CODEDOMAIN implements java.io.Serializable {

	private String            ibflag            = "";
	private String            page_rows         = "";
	private String            id                = "";
	private String            groupid           = "";
	private String            rootnomenid       = "";
	private String            mappingid         = "";
	private String            name              = "";
	private String            definition        = "";
	private String            manager           = "";
	private String            managedept        = "";
	private String            engname           = "";
	private String            datatype          = "";
	private String            precision         = "";
	private String            scale             = "";
	private String            ishierarchycode   = "";
	private String            repgroupname      = "";
	private String            maxhierarchylevel = "";
	private String            hierarchylevel    = "";
	private String            begindate         = "";
	private String            enddate           = "";
	private String            creator           = "";
	private String            createdatetime    = "";
	private String            updator           = "";
	private String            updatedatetime    = "";
	private String            var1              = "";
	private String            var2              = "";
	private String            var3              = "";
	private String            var4              = "";
	private String            var5              = "";
	private String            cdg_nm            = "";
	private String            cdt_nm            = "";
	private String            codeid            = "";

	public T_CODEDOMAIN(){}

	public T_CODEDOMAIN(
			String            ibflag           ,
			String            page_rows        ,
			String            id               ,
			String            groupid          ,
			String            rootnomenid      ,
			String            mappingid        ,
			String            name             ,
			String            definition       ,
			String            manager          ,
			String            managedept       ,
			String            engname          ,
			String            datatype         ,
			String            precision        ,
			String            scale            ,
			String            ishierarchycode  ,
			String            repgroupname     ,
			String            maxhierarchylevel,
			String            hierarchylevel   ,
			String            begindate        ,
			String            enddate          ,
			String            creator          ,
			String            createdatetime   ,
			String            updator          ,
			String            updatedatetime   ,
			String            var1             ,
			String            var2             ,
			String            var3             ,
			String            var4             ,
			String            var5             ,
			String            cdg_nm           ,
			String            cdt_nm           ,
			String            codeid           ){
		this.ibflag            = ibflag           ;
		this.page_rows         = page_rows        ;
		this.id                = id               ;
		this.groupid           = groupid          ;
		this.rootnomenid       = rootnomenid      ;
		this.mappingid         = mappingid        ;
		this.name              = name             ;
		this.definition        = definition       ;
		this.manager           = manager          ;
		this.managedept        = managedept       ;
		this.engname           = engname          ;
		this.datatype          = datatype         ;
		this.precision         = precision        ;
		this.scale             = scale            ;
		this.ishierarchycode   = ishierarchycode  ;
		this.repgroupname      = repgroupname     ;
		this.maxhierarchylevel = maxhierarchylevel;
		this.hierarchylevel    = hierarchylevel   ;
		this.begindate         = begindate        ;
		this.enddate           = enddate          ;
		this.creator           = creator          ;
		this.createdatetime    = createdatetime   ;
		this.updator           = updator          ;
		this.updatedatetime    = updatedatetime   ;
		this.var1              = var1             ;
		this.var2              = var2             ;
		this.var3              = var3             ;
		this.var4              = var4             ;
		this.var5              = var5             ;
		this.cdg_nm            = cdg_nm           ;
		this.cdt_nm            = cdt_nm           ;
		this.codeid            = codeid           ;
	}

	// getter method is proceeding ..
	public String            getIbflag           (){	return ibflag           	;	}
	public String            getPage_rows        (){	return page_rows        	;	}
	public String            getId               (){	return id               	;	}
	public String            getGroupid          (){	return groupid          	;	}
	public String            getRootnomenid      (){	return rootnomenid      	;	}
	public String            getMappingid        (){	return mappingid        	;	}
	public String            getName             (){	return name             	;	}
	public String            getDefinition       (){	return definition       	;	}
	public String            getManager          (){	return manager          	;	}
	public String            getManagedept       (){	return managedept       	;	}
	public String            getEngname          (){	return engname          	;	}
	public String            getDatatype         (){	return datatype         	;	}
	public String            getPrecision        (){	return precision        	;	}
	public String            getScale            (){	return scale            	;	}
	public String            getIshierarchycode  (){	return ishierarchycode  	;	}
	public String            getRepgroupname     (){	return repgroupname     	;	}
	public String            getMaxhierarchylevel(){	return maxhierarchylevel	;	}
	public String            getHierarchylevel   (){	return hierarchylevel   	;	}
	public String            getBegindate        (){	return begindate        	;	}
	public String            getEnddate          (){	return enddate          	;	}
	public String            getCreator          (){	return creator          	;	}
	public String            getCreatedatetime   (){	return createdatetime   	;	}
	public String            getUpdator          (){	return updator          	;	}
	public String            getUpdatedatetime   (){	return updatedatetime   	;	}
	public String            getVar1             (){	return var1             	;	}
	public String            getVar2             (){	return var2             	;	}
	public String            getVar3             (){	return var3             	;	}
	public String            getVar4             (){	return var4             	;	}
	public String            getVar5             (){	return var5             	;	}
	public String            getCdg_nm           (){	return cdg_nm           	;	}
	public String            getCdt_nm           (){	return cdt_nm           	;	}
	public String            getCodeid           (){	return codeid           	;	}

	// setter method is proceeding ..
	public void setIbflag           ( String            ibflag            ){	this.ibflag            = ibflag           	;	}
	public void setPage_rows        ( String            page_rows         ){	this.page_rows         = page_rows        	;	}
	public void setId               ( String            id                ){	this.id                = id               	;	}
	public void setGroupid          ( String            groupid           ){	this.groupid           = groupid          	;	}
	public void setRootnomenid      ( String            rootnomenid       ){	this.rootnomenid       = rootnomenid      	;	}
	public void setMappingid        ( String            mappingid         ){	this.mappingid         = mappingid        	;	}
	public void setName             ( String            name              ){	this.name              = name             	;	}
	public void setDefinition       ( String            definition        ){	this.definition        = definition       	;	}
	public void setManager          ( String            manager           ){	this.manager           = manager          	;	}
	public void setManagedept       ( String            managedept        ){	this.managedept        = managedept       	;	}
	public void setEngname          ( String            engname           ){	this.engname           = engname          	;	}
	public void setDatatype         ( String            datatype          ){	this.datatype          = datatype         	;	}
	public void setPrecision        ( String            precision         ){	this.precision         = precision        	;	}
	public void setScale            ( String            scale             ){	this.scale             = scale            	;	}
	public void setIshierarchycode  ( String            ishierarchycode   ){	this.ishierarchycode   = ishierarchycode  	;	}
	public void setRepgroupname     ( String            repgroupname      ){	this.repgroupname      = repgroupname     	;	}
	public void setMaxhierarchylevel( String            maxhierarchylevel ){	this.maxhierarchylevel = maxhierarchylevel	;	}
	public void setHierarchylevel   ( String            hierarchylevel    ){	this.hierarchylevel    = hierarchylevel   	;	}
	public void setBegindate        ( String            begindate         ){	this.begindate         = begindate        	;	}
	public void setEnddate          ( String            enddate           ){	this.enddate           = enddate          	;	}
	public void setCreator          ( String            creator           ){	this.creator           = creator          	;	}
	public void setCreatedatetime   ( String            createdatetime    ){	this.createdatetime    = createdatetime   	;	}
	public void setUpdator          ( String            updator           ){	this.updator           = updator          	;	}
	public void setUpdatedatetime   ( String            updatedatetime    ){	this.updatedatetime    = updatedatetime   	;	}
	public void setVar1             ( String            var1              ){	this.var1              = var1             	;	}
	public void setVar2             ( String            var2              ){	this.var2              = var2             	;	}
	public void setVar3             ( String            var3              ){	this.var3              = var3             	;	}
	public void setVar4             ( String            var4              ){	this.var4              = var4             	;	}
	public void setVar5             ( String            var5              ){	this.var5              = var5             	;	}
	public void setCdg_nm           ( String            cdg_nm            ){	this.cdg_nm            = cdg_nm           	;	}
	public void setCdt_nm           ( String            cdt_nm            ){	this.cdt_nm            = cdt_nm           	;	}
	public void setCodeid           ( String            codeid            ){	this.codeid            = codeid           	;	}
	
	public static T_CODEDOMAIN fromRequest(HttpServletRequest request) {
		T_CODEDOMAIN model = new T_CODEDOMAIN();
		try {
			model.setIbflag           	(JSPUtil.getParameter(request, "ibflag           		".trim(), ""));
			model.setPage_rows        	(JSPUtil.getParameter(request, "page_rows        		".trim(), ""));
			model.setId               	(JSPUtil.getParameter(request, "id               		".trim(), ""));
			model.setGroupid          	(JSPUtil.getParameter(request, "groupid          		".trim(), ""));
			model.setRootnomenid      	(JSPUtil.getParameter(request, "rootnomenid      		".trim(), ""));
			model.setMappingid        	(JSPUtil.getParameter(request, "mappingid        		".trim(), ""));
			model.setName             	(JSPUtil.getParameter(request, "name             		".trim(), ""));
			model.setDefinition       	(JSPUtil.getParameter(request, "definition       		".trim(), ""));
			model.setManager          	(JSPUtil.getParameter(request, "manager          		".trim(), ""));
			model.setManagedept       	(JSPUtil.getParameter(request, "managedept       		".trim(), ""));
			model.setEngname          	(JSPUtil.getParameter(request, "engname          		".trim(), ""));
			model.setDatatype         	(JSPUtil.getParameter(request, "datatype         		".trim(), ""));
			model.setPrecision        	(JSPUtil.getParameter(request, "precision        		".trim(), ""));
			model.setScale            	(JSPUtil.getParameter(request, "scale            		".trim(), ""));
			model.setIshierarchycode  	(JSPUtil.getParameter(request, "ishierarchycode  		".trim(), ""));
			model.setRepgroupname     	(JSPUtil.getParameter(request, "repgroupname     		".trim(), ""));
			model.setMaxhierarchylevel	(JSPUtil.getParameter(request, "maxhierarchylevel		".trim(), ""));
			model.setHierarchylevel   	(JSPUtil.getParameter(request, "hierarchylevel   		".trim(), ""));
			model.setBegindate        	(JSPUtil.getParameter(request, "begindate        		".trim(), ""));
			model.setEnddate          	(JSPUtil.getParameter(request, "enddate          		".trim(), ""));
			model.setCreator          	(JSPUtil.getParameter(request, "creator          		".trim(), ""));
			model.setCreatedatetime   	(JSPUtil.getParameter(request, "createdatetime   		".trim(), ""));
			model.setUpdator          	(JSPUtil.getParameter(request, "updator          		".trim(), ""));
			model.setUpdatedatetime   	(JSPUtil.getParameter(request, "updatedatetime   		".trim(), ""));
			model.setVar1             	(JSPUtil.getParameter(request, "var1             		".trim(), ""));
			model.setVar2             	(JSPUtil.getParameter(request, "var2             		".trim(), ""));
			model.setVar3             	(JSPUtil.getParameter(request, "var3             		".trim(), ""));
			model.setVar4             	(JSPUtil.getParameter(request, "var4             		".trim(), ""));
			model.setVar5             	(JSPUtil.getParameter(request, "var5             		".trim(), ""));
			model.setCdg_nm           	(JSPUtil.getParameter(request, "cdg_nm           		".trim(), ""));
			model.setCdt_nm           	(JSPUtil.getParameter(request, "cdt_nm           		".trim(), ""));
			model.setCodeid           	(JSPUtil.getParameter(request, "codeid           		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		T_CODEDOMAIN model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag            =  (JSPUtil.getParameter(request, "ibflag           		".trim(), length));
			String[] page_rows         =  (JSPUtil.getParameter(request, "page_rows        		".trim(), length));
			String[] id                =  (JSPUtil.getParameter(request, "id               		".trim(), length));
			String[] groupid           =  (JSPUtil.getParameter(request, "groupid          		".trim(), length));
			String[] rootnomenid       =  (JSPUtil.getParameter(request, "rootnomenid      		".trim(), length));
			String[] mappingid         =  (JSPUtil.getParameter(request, "mappingid        		".trim(), length));
			String[] name              =  (JSPUtil.getParameter(request, "name             		".trim(), length));
			String[] definition        =  (JSPUtil.getParameter(request, "definition       		".trim(), length));
			String[] manager           =  (JSPUtil.getParameter(request, "manager          		".trim(), length));
			String[] managedept        =  (JSPUtil.getParameter(request, "managedept       		".trim(), length));
			String[] engname           =  (JSPUtil.getParameter(request, "engname          		".trim(), length));
			String[] datatype          =  (JSPUtil.getParameter(request, "datatype         		".trim(), length));
			String[] precision         =  (JSPUtil.getParameter(request, "precision        		".trim(), length));
			String[] scale             =  (JSPUtil.getParameter(request, "scale            		".trim(), length));
			String[] ishierarchycode   =  (JSPUtil.getParameter(request, "ishierarchycode  		".trim(), length));
			String[] repgroupname      =  (JSPUtil.getParameter(request, "repgroupname     		".trim(), length));
			String[] maxhierarchylevel =  (JSPUtil.getParameter(request, "maxhierarchylevel		".trim(), length));
			String[] hierarchylevel    =  (JSPUtil.getParameter(request, "hierarchylevel   		".trim(), length));
			String[] begindate         =  (JSPUtil.getParameter(request, "begindate        		".trim(), length));
			String[] enddate           =  (JSPUtil.getParameter(request, "enddate          		".trim(), length));
			String[] creator           =  (JSPUtil.getParameter(request, "creator          		".trim(), length));
			String[] createdatetime    =  (JSPUtil.getParameter(request, "createdatetime   		".trim(), length));
			String[] updator           =  (JSPUtil.getParameter(request, "updator          		".trim(), length));
			String[] updatedatetime    =  (JSPUtil.getParameter(request, "updatedatetime   		".trim(), length));
			String[] var1              =  (JSPUtil.getParameter(request, "var1             		".trim(), length));
			String[] var2              =  (JSPUtil.getParameter(request, "var2             		".trim(), length));
			String[] var3              =  (JSPUtil.getParameter(request, "var3             		".trim(), length));
			String[] var4              =  (JSPUtil.getParameter(request, "var4             		".trim(), length));
			String[] var5              =  (JSPUtil.getParameter(request, "var5             		".trim(), length));
			String[] cdg_nm            =  (JSPUtil.getParameter(request, "cdg_nm           		".trim(), length));
			String[] cdt_nm            =  (JSPUtil.getParameter(request, "cdt_nm           		".trim(), length));
			String[] codeid            =  (JSPUtil.getParameter(request, "codeid           		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new T_CODEDOMAIN();
				model.setIbflag           		  (ibflag           	[i]);
				model.setPage_rows        		  (page_rows        	[i]);
				model.setId               		  (id               	[i]);
				model.setGroupid          		  (groupid          	[i]);
				model.setRootnomenid      		  (rootnomenid      	[i]);
				model.setMappingid        		  (mappingid        	[i]);
				model.setName             		  (name             	[i]);
				model.setDefinition       		  (definition       	[i]);
				model.setManager          		  (manager          	[i]);
				model.setManagedept       		  (managedept       	[i]);
				model.setEngname          		  (engname          	[i]);
				model.setDatatype         		  (datatype         	[i]);
				model.setPrecision        		  (precision        	[i]);
				model.setScale            		  (scale            	[i]);
				model.setIshierarchycode  		  (ishierarchycode  	[i]);
				model.setRepgroupname     		  (repgroupname     	[i]);
				model.setMaxhierarchylevel		  (maxhierarchylevel	[i]);
				model.setHierarchylevel   		  (hierarchylevel   	[i]);
				model.setBegindate        		  (begindate        	[i]);
				model.setEnddate          		  (enddate          	[i]);
				model.setCreator          		  (creator          	[i]);
				model.setCreatedatetime   		  (createdatetime   	[i]);
				model.setUpdator          		  (updator          	[i]);
				model.setUpdatedatetime   		  (updatedatetime   	[i]);
				model.setVar1             		  (var1             	[i]);
				model.setVar2             		  (var2             	[i]);
				model.setVar3             		  (var3             	[i]);
				model.setVar4             		  (var4             	[i]);
				model.setVar5             		  (var5             	[i]);
				model.setCdg_nm           		  (cdg_nm           	[i]);
				model.setCdt_nm           		  (cdt_nm           	[i]);
				model.setCodeid           		  (codeid           	[i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		T_CODEDOMAIN model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag            =  (JSPUtil.getParameter(request, prefix + "ibflag           		".trim(), length));
			String[] page_rows         =  (JSPUtil.getParameter(request, prefix + "page_rows        		".trim(), length));
			String[] id                =  (JSPUtil.getParameter(request, prefix + "id               		".trim(), length));
			String[] groupid           =  (JSPUtil.getParameter(request, prefix + "groupid          		".trim(), length));
			String[] rootnomenid       =  (JSPUtil.getParameter(request, prefix + "rootnomenid      		".trim(), length));
			String[] mappingid         =  (JSPUtil.getParameter(request, prefix + "mappingid        		".trim(), length));
			String[] name              =  (JSPUtil.getParameter(request, prefix + "name             		".trim(), length));
			String[] definition        =  (JSPUtil.getParameter(request, prefix + "definition       		".trim(), length));
			String[] manager           =  (JSPUtil.getParameter(request, prefix + "manager          		".trim(), length));
			String[] managedept        =  (JSPUtil.getParameter(request, prefix + "managedept       		".trim(), length));
			String[] engname           =  (JSPUtil.getParameter(request, prefix + "engname          		".trim(), length));
			String[] datatype          =  (JSPUtil.getParameter(request, prefix + "datatype         		".trim(), length));
			String[] precision         =  (JSPUtil.getParameter(request, prefix + "precision        		".trim(), length));
			String[] scale             =  (JSPUtil.getParameter(request, prefix + "scale            		".trim(), length));
			String[] ishierarchycode   =  (JSPUtil.getParameter(request, prefix + "ishierarchycode  		".trim(), length));
			String[] repgroupname      =  (JSPUtil.getParameter(request, prefix + "repgroupname     		".trim(), length));
			String[] maxhierarchylevel =  (JSPUtil.getParameter(request, prefix + "maxhierarchylevel		".trim(), length));
			String[] hierarchylevel    =  (JSPUtil.getParameter(request, prefix + "hierarchylevel   		".trim(), length));
			String[] begindate         =  (JSPUtil.getParameter(request, prefix + "begindate        		".trim(), length));
			String[] enddate           =  (JSPUtil.getParameter(request, prefix + "enddate          		".trim(), length));
			String[] creator           =  (JSPUtil.getParameter(request, prefix + "creator          		".trim(), length));
			String[] createdatetime    =  (JSPUtil.getParameter(request, prefix + "createdatetime   		".trim(), length));
			String[] updator           =  (JSPUtil.getParameter(request, prefix + "updator          		".trim(), length));
			String[] updatedatetime    =  (JSPUtil.getParameter(request, prefix + "updatedatetime   		".trim(), length));
			String[] var1              =  (JSPUtil.getParameter(request, prefix + "var1             		".trim(), length));
			String[] var2              =  (JSPUtil.getParameter(request, prefix + "var2             		".trim(), length));
			String[] var3              =  (JSPUtil.getParameter(request, prefix + "var3             		".trim(), length));
			String[] var4              =  (JSPUtil.getParameter(request, prefix + "var4             		".trim(), length));
			String[] var5              =  (JSPUtil.getParameter(request, prefix + "var5             		".trim(), length));
			String[] cdg_nm            =  (JSPUtil.getParameter(request, prefix + "cdg_nm           		".trim(), length));
			String[] cdt_nm            =  (JSPUtil.getParameter(request, prefix + "cdt_nm           		".trim(), length));
			String[] codeid            =  (JSPUtil.getParameter(request, prefix + "codeid           		".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new T_CODEDOMAIN();
				model.setIbflag           		  ( ibflag           	[i]);
				model.setPage_rows        		  ( page_rows        	[i]);
				model.setId               		  ( id               	[i]);
				model.setGroupid          		  ( groupid          	[i]);
				model.setRootnomenid      		  ( rootnomenid      	[i]);
				model.setMappingid        		  ( mappingid        	[i]);
				model.setName             		  ( name             	[i]);
				model.setDefinition       		  ( definition       	[i]);
				model.setManager          		  ( manager          	[i]);
				model.setManagedept       		  ( managedept       	[i]);
				model.setEngname          		  ( engname          	[i]);
				model.setDatatype         		  ( datatype         	[i]);
				model.setPrecision        		  ( precision        	[i]);
				model.setScale            		  ( scale            	[i]);
				model.setIshierarchycode  		  ( ishierarchycode  	[i]);
				model.setRepgroupname     		  ( repgroupname     	[i]);
				model.setMaxhierarchylevel		  ( maxhierarchylevel	[i]);
				model.setHierarchylevel   		  ( hierarchylevel   	[i]);
				model.setBegindate        		  ( begindate        	[i]);
				model.setEnddate          		  ( enddate          	[i]);
				model.setCreator          		  ( creator          	[i]);
				model.setCreatedatetime   		  ( createdatetime   	[i]);
				model.setUpdator          		  ( updator          	[i]);
				model.setUpdatedatetime   		  ( updatedatetime   	[i]);
				model.setVar1             		  ( var1             	[i]);
				model.setVar2             		  ( var2             	[i]);
				model.setVar3             		  ( var3             	[i]);
				model.setVar4             		  ( var4             	[i]);
				model.setVar5             		  ( var5             	[i]);
				model.setCdg_nm           		  ( cdg_nm           	[i]);
				model.setCdt_nm           		  ( cdt_nm           	[i]);
				model.setCodeid           		  ( codeid           	[i]);
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
