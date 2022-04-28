package com.clt.syscommon.common.table;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.http.HttpServletRequest;

import com.clt.framework.component.util.JSPUtil;

/**
 *  1. 기능 : Table Value Ojbect <p>
 *  2. 처리개요 : <p>
 *    - 모든 업무에서 공통으로 사용하는 PDTO(Data Transfer Object including Parameters) <p>
 *    - 관련 Event에서 작성, 서버실행요청시 PDTO의 역할을 수행하는 Value Object <p>
 *  3. 주의사항 : <p>
 *
 *  @author : 개발자
 *  @version : v1.0.0
 *  @see : 관련 Event , HTMLAction 참조
 *  @since : JDK 1.4 or EJB 2.0
 **/
public final class TEMP_CSV_FILES implements java.io.Serializable {

	private String       file_no      = "";
	private String       file_nm      = "";
	private String       temp_file_nm = "";
	private String       file_place   = "";
	private String       del_flg      = "";

	public TEMP_CSV_FILES(){}

	public TEMP_CSV_FILES(
			String       file_no     ,
			String       file_nm     ,
			String       temp_file_nm,
			String       file_place,
			String       del_flg      ){
		this.file_no      = file_no     ;
		this.file_nm      = file_nm     ;
		this.temp_file_nm = temp_file_nm;
		this.file_place   = file_place  ;
		this.del_flg      = del_flg     ;
	}

	// getter method is proceeding ..
	public String       getFile_no     (){    return file_no         ;    }
	public String       getFile_nm     (){    return file_nm         ;    }
	public String       getTemp_file_nm(){    return temp_file_nm    ;    }
	public String       getFile_place  (){    return file_place      ;    }
	public String       getDel_flg     (){    return del_flg         ;    }


	// setter method is proceeding ..
	public void setFile_no     ( String       file_no      ){    this.file_no      = file_no         ;    }
	public void setFile_nm     ( String       file_nm      ){    this.file_nm      = file_nm         ;    }
	public void setTemp_file_nm( String       temp_file_nm ){    this.temp_file_nm = temp_file_nm    ;    }
	public void setFile_place  ( String       file_place   ){    this.file_place   = file_place      ;    }
	public void setDel_flg     ( String       del_flg      ){    this.del_flg      = del_flg         ;    }

	public static TEMP_CSV_FILES fromRequest(HttpServletRequest request) {
		TEMP_CSV_FILES model = new TEMP_CSV_FILES();
		try {
			model.setFile_no         (JSPUtil.getParameter(request, "file_no             ".trim(), ""));
			model.setFile_nm         (JSPUtil.getParameter(request, "file_nm             ".trim(), ""));
			model.setTemp_file_nm    (JSPUtil.getParameter(request, "temp_file_nm        ".trim(), ""));
			model.setFile_place      (JSPUtil.getParameter(request, "file_place          ".trim(), ""));
			model.setDel_flg         (JSPUtil.getParameter(request, "del_flg             ".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	public static Collection fromRequest(HttpServletRequest request, int length) {
		TEMP_CSV_FILES model = null;
		Collection models = new ArrayList();
		try {
			String[] file_no      =  (JSPUtil.getParameter(request, "file_no             ".trim(), length));
			String[] file_nm      =  (JSPUtil.getParameter(request, "file_nm             ".trim(), length));
			String[] temp_file_nm =  (JSPUtil.getParameter(request, "temp_file_nm        ".trim(), length));
			String[] file_place   =  (JSPUtil.getParameter(request, "file_place          ".trim(), length));
			String[] del_flg      =  (JSPUtil.getParameter(request, "del_flg             ".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new TEMP_CSV_FILES();
				model.setFile_no               (file_no         [i]);
				model.setFile_nm               (file_nm         [i]);
				model.setTemp_file_nm          (temp_file_nm    [i]);
				model.setFile_place            (file_place      [i]);
				model.setDel_flg               (del_flg         [i]);
				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	public static Collection fromRequestGrid(HttpServletRequest request) {
		TEMP_CSV_FILES model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag       =  (JSPUtil.getParameter(request, "ibflag              ".trim(), length));
			String[] bb_no        =  (JSPUtil.getParameter(request, "bb_no               ".trim(), length));
			String[] file_no      =  (JSPUtil.getParameter(request, "file_no             ".trim(), length));
			String[] file_nm      =  (JSPUtil.getParameter(request, "file_nm             ".trim(), length));
			String[] temp_file_nm =  (JSPUtil.getParameter(request, "temp_file_nm        ".trim(), length));
			String[] file_place   =  (JSPUtil.getParameter(request, "file_place          ".trim(), length));
			String[] del_flg      =  (JSPUtil.getParameter(request, "del_flg             ".trim(), length));
			for (int i = 0; i < length; i++) {
				model = new TEMP_CSV_FILES();
				model.setFile_no               (file_no         [i]);
				model.setFile_nm               (file_nm         [i]);
				model.setTemp_file_nm          (temp_file_nm    [i]);
				model.setFile_place            (file_place      [i]);
				model.setDel_flg               (del_flg         [i]);
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
