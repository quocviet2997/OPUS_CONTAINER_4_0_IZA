// FrontEnd Plus GUI for JAD
// DeCompiled : GNI_DOCUMENT.class

package com.clt.syscommon.common.table;

import com.clt.framework.component.util.JSPUtil;
import com.clt.framework.component.util.MultipartRequest;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import javax.servlet.http.HttpServletRequest;

public final class GNI_DOCUMENT
    implements Serializable
{

    private String ibflag;
    private String page_rows;
    private String doc_seq;
    private String ref_id;
    private String doc_src_cd;
    private String vsl_cd;
    private String voy_seq;
    private String dep_cd;
    private String subj_nm;
    private String ref_rmk;
    private String file_nm;
    private String file_path_desc;
    private String file_seq;
    private String filemode;
    private String cre_usr_id;
    private String cre_dt;
    private String upd_usr_id;
    private String upd_dt;

    public GNI_DOCUMENT()
    {
        ibflag = "";
        page_rows = "";
        doc_seq = "";
        ref_id = "";
        doc_src_cd = "";
        vsl_cd = "";
        voy_seq = "";
        dep_cd = "";
        subj_nm = "";
        ref_rmk = "";
        file_nm = "";
        file_path_desc = "";
        file_seq = "";
        filemode = "";
        cre_usr_id = "";
        cre_dt = "";
        upd_usr_id = "";
        upd_dt = "";
    }

    public GNI_DOCUMENT(String ibflag, String page_rows, String doc_seq, String ref_id, String doc_src_cd, String vsl_cd, String voy_seq, 
            String dep_cd, String subj_nm, String cre_usr_id, String cre_dt, String upd_usr_id, String upd_dt)
    {
        this.ibflag = "";
        this.page_rows = "";
        this.doc_seq = "";
        this.ref_id = "";
        this.doc_src_cd = "";
        this.vsl_cd = "";
        this.voy_seq = "";
        this.dep_cd = "";
        this.subj_nm = "";
        ref_rmk = "";
        file_nm = "";
        file_path_desc = "";
        file_seq = "";
        filemode = "";
        this.cre_usr_id = "";
        this.cre_dt = "";
        this.upd_usr_id = "";
        this.upd_dt = "";
        this.ibflag = ibflag;
        this.page_rows = page_rows;
        this.doc_seq = doc_seq;
        this.ref_id = ref_id;
        this.doc_src_cd = doc_src_cd;
        this.vsl_cd = vsl_cd;
        this.voy_seq = voy_seq;
        this.dep_cd = dep_cd;
        this.subj_nm = subj_nm;
        this.cre_usr_id = cre_usr_id;
        this.cre_dt = cre_dt;
        this.upd_usr_id = upd_usr_id;
        this.upd_dt = upd_dt;
    }

    public String getIbflag()
    {
        return ibflag;
    }

    public String getPage_rows()
    {
        return page_rows;
    }

    public String getDoc_seq()
    {
        return doc_seq;
    }

    public String getRef_id()
    {
        return ref_id;
    }

    public String getDoc_src_cd()
    {
        return doc_src_cd;
    }

    public String getVsl_cd()
    {
        return vsl_cd;
    }

    public String getVoy_seq()
    {
        return voy_seq;
    }

    public String getDep_cd()
    {
        return dep_cd;
    }

    public String getSubj_nm()
    {
        return subj_nm;
    }

    public String getCre_usr_id()
    {
        return cre_usr_id;
    }

    public String getCre_dt()
    {
        return cre_dt;
    }

    public String getUpd_usr_id()
    {
        return upd_usr_id;
    }

    public String getUpd_dt()
    {
        return upd_dt;
    }

    public void setIbflag(String ibflag)
    {
        this.ibflag = ibflag;
    }

    public void setPage_rows(String page_rows)
    {
        this.page_rows = page_rows;
    }

    public void setDoc_seq(String doc_seq)
    {
        this.doc_seq = doc_seq;
    }

    public void setRef_id(String ref_id)
    {
        this.ref_id = ref_id;
    }

    public void setDoc_src_cd(String doc_src_cd)
    {
        this.doc_src_cd = doc_src_cd;
    }

    public void setVsl_cd(String vsl_cd)
    {
        this.vsl_cd = vsl_cd;
    }

    public void setVoy_seq(String voy_seq)
    {
        this.voy_seq = voy_seq;
    }

    public void setDep_cd(String dep_cd)
    {
        this.dep_cd = dep_cd;
    }

    public void setSubj_nm(String subj_nm)
    {
        this.subj_nm = subj_nm;
    }

    public void setCre_usr_id(String cre_usr_id)
    {
        this.cre_usr_id = cre_usr_id;
    }

    public void setCre_dt(String cre_dt)
    {
        this.cre_dt = cre_dt;
    }

    public void setUpd_usr_id(String upd_usr_id)
    {
        this.upd_usr_id = upd_usr_id;
    }

    public void setUpd_dt(String upd_dt)
    {
        this.upd_dt = upd_dt;
    }

    public static GNI_DOCUMENT fromRequest(HttpServletRequest request)
    {
        GNI_DOCUMENT model = new GNI_DOCUMENT();
        try
        {
            model.setIbflag(JSPUtil.getParameter(request, "ibflag            ".trim(), ""));
            model.setPage_rows(JSPUtil.getParameter(request, "page_rows         ".trim(), ""));
            model.setDoc_seq(JSPUtil.getParameter(request, "doc_seq           ".trim(), ""));
            model.setRef_id(JSPUtil.getParameter(request, "ref_id            ".trim(), ""));
            model.setDoc_src_cd(JSPUtil.getParameter(request, "doc_src_cd        ".trim(), ""));
            model.setVsl_cd(JSPUtil.getParameter(request, "vsl_cd            ".trim(), ""));
            model.setVoy_seq(JSPUtil.getParameter(request, "voy_seq           ".trim(), ""));
            model.setDep_cd(JSPUtil.getParameter(request, "dep_cd            ".trim(), ""));
            model.setSubj_nm(JSPUtil.getParameter(request, "subj_nm           ".trim(), ""));
            model.setRef_rmk(JSPUtil.getParameter(request, "ref_rmk           ".trim(), ""));
            model.setFile_nm(JSPUtil.getParameter(request, "file_nm           ".trim(), ""));
            model.setFile_path_desc(JSPUtil.getParameter(request, "file_path_desc     ".trim(), ""));
            model.setFile_seq(JSPUtil.getParameter(request, "file_seq           ".trim(), ""));
            model.setFilemode(JSPUtil.getParameter(request, "filemode           ".trim(), ""));
            model.setCre_usr_id(JSPUtil.getParameter(request, "cre_usr_id        ".trim(), ""));
            model.setCre_dt(JSPUtil.getParameter(request, "cre_dt            ".trim(), ""));
            model.setUpd_usr_id(JSPUtil.getParameter(request, "upd_usr_id        ".trim(), ""));
            model.setUpd_dt(JSPUtil.getParameter(request, "upd_dt            ".trim(), ""));
        }
        catch(Exception exception) { }
        return model;
    }

    public static Collection fromRequest(HttpServletRequest request, int length)
    {
        GNI_DOCUMENT model = null;
        Collection models = new ArrayList();
        try
        {
            String ibflag[] = JSPUtil.getParameter(request, "ibflag            ".trim(), length);
            String page_rows[] = JSPUtil.getParameter(request, "page_rows         ".trim(), length);
            String doc_seq[] = JSPUtil.getParameter(request, "doc_seq           ".trim(), length);
            String ref_id[] = JSPUtil.getParameter(request, "ref_id            ".trim(), length);
            String doc_src_cd[] = JSPUtil.getParameter(request, "doc_src_cd        ".trim(), length);
            String vsl_cd[] = JSPUtil.getParameter(request, "vsl_cd            ".trim(), length);
            String voy_seq[] = JSPUtil.getParameter(request, "voy_seq           ".trim(), length);
            String dep_cd[] = JSPUtil.getParameter(request, "dep_cd            ".trim(), length);
            String subj_nm[] = JSPUtil.getParameter(request, "subj_nm           ".trim(), length);
            String cre_usr_id[] = JSPUtil.getParameter(request, "cre_usr_id        ".trim(), length);
            String cre_dt[] = JSPUtil.getParameter(request, "cre_dt            ".trim(), length);
            String upd_usr_id[] = JSPUtil.getParameter(request, "upd_usr_id        ".trim(), length);
            String upd_dt[] = JSPUtil.getParameter(request, "upd_dt            ".trim(), length);
            for(int i = 0; i < length; i++)
            {
                model = new GNI_DOCUMENT();
                model.setIbflag(ibflag[i]);
                model.setPage_rows(page_rows[i]);
                model.setDoc_seq(doc_seq[i]);
                model.setRef_id(ref_id[i]);
                model.setDoc_src_cd(doc_src_cd[i]);
                model.setVsl_cd(vsl_cd[i]);
                model.setVoy_seq(voy_seq[i]);
                model.setDep_cd(dep_cd[i]);
                model.setSubj_nm(subj_nm[i]);
                model.setCre_usr_id(cre_usr_id[i]);
                model.setCre_dt(cre_dt[i]);
                model.setUpd_usr_id(upd_usr_id[i]);
                model.setUpd_dt(upd_dt[i]);
                models.add(model);
            }

        }
        catch(Exception exception) { }
        return models;
    }

    public static Collection fromRequestGrid(HttpServletRequest request, String prefix)
    {
        GNI_DOCUMENT model = null;
        Collection models = new ArrayList();
        int length = 0;
        if(request.getParameterValues(prefix + "ibflag") != null)
            length = request.getParameterValues(prefix + "ibflag").length;
        try
        {
            String ibflag[] = JSPUtil.getParameter(request, prefix + "ibflag            ".trim(), length);
            String page_rows[] = JSPUtil.getParameter(request, prefix + "page_rows         ".trim(), length);
            String doc_seq[] = JSPUtil.getParameter(request, prefix + "doc_seq           ".trim(), length);
            String ref_id[] = JSPUtil.getParameter(request, prefix + "ref_id            ".trim(), length);
            String doc_src_cd[] = JSPUtil.getParameter(request, prefix + "doc_src_cd        ".trim(), length);
            String vsl_cd[] = JSPUtil.getParameter(request, prefix + "vsl_cd            ".trim(), length);
            String voy_seq[] = JSPUtil.getParameter(request, prefix + "voy_seq           ".trim(), length);
            String dep_cd[] = JSPUtil.getParameter(request, prefix + "dep_cd            ".trim(), length);
            String subj_nm[] = JSPUtil.getParameter(request, prefix + "subj_nm           ".trim(), length);
            String ref_rmk[] = JSPUtil.getParameter(request, prefix + "ref_rmk           ".trim(), length);
            String file_nm[] = JSPUtil.getParameter(request, prefix + "file_nm           ".trim(), length);
            String file_path_desc[] = JSPUtil.getParameter(request, prefix + "file_path_desc    ".trim(), length);
            String file_seq[] = JSPUtil.getParameter(request, prefix + "file_seq           ".trim(), length);
            String filemode[] = JSPUtil.getParameter(request, prefix + "filemode           ".trim(), length);
            String cre_usr_id[] = JSPUtil.getParameter(request, prefix + "cre_usr_id        ".trim(), length);
            String cre_dt[] = JSPUtil.getParameter(request, prefix + "cre_dt            ".trim(), length);
            String upd_usr_id[] = JSPUtil.getParameter(request, prefix + "upd_usr_id        ".trim(), length);
            String upd_dt[] = JSPUtil.getParameter(request, prefix + "upd_dt            ".trim(), length);
            for(int i = 0; i < length; i++)
            {
                model = new GNI_DOCUMENT();
                model.setIbflag(ibflag[i]);
                model.setPage_rows(page_rows[i]);
                model.setDoc_seq(doc_seq[i]);
                model.setRef_id(ref_id[i]);
                model.setDoc_src_cd(doc_src_cd[i]);
                model.setVsl_cd(vsl_cd[i]);
                model.setVoy_seq(voy_seq[i]);
                model.setDep_cd(dep_cd[i]);
                model.setSubj_nm(subj_nm[i]);
                model.setRef_rmk(ref_rmk[i]);
                model.setFile_nm(file_nm[i]);
                model.setFile_path_desc(file_path_desc[i]);
                model.setFile_seq(file_seq[i]);
                model.setFilemode(filemode[i]);
                model.setCre_usr_id(cre_usr_id[i]);
                model.setCre_dt(cre_dt[i]);
                model.setUpd_usr_id(upd_usr_id[i]);
                model.setUpd_dt(upd_dt[i]);
                models.add(model);
            }

        }
        catch(Exception exception) { }
        return models;
    }

    public static GNI_DOCUMENT fromRequest(MultipartRequest request)
    {
        GNI_DOCUMENT model = new GNI_DOCUMENT();
        try
        {
            model.setIbflag(JSPUtil.getParameter(request, "ibflag            ".trim(), ""));
            model.setPage_rows(JSPUtil.getParameter(request, "page_rows         ".trim(), ""));
            model.setDoc_seq(JSPUtil.getParameter(request, "doc_seq           ".trim(), ""));
            model.setRef_id(JSPUtil.getParameter(request, "ref_id            ".trim(), ""));
            model.setDoc_src_cd(JSPUtil.getParameter(request, "doc_src_cd        ".trim(), ""));
            model.setVsl_cd(JSPUtil.getParameter(request, "vsl_cd            ".trim(), ""));
            model.setVoy_seq(JSPUtil.getParameter(request, "voy_seq           ".trim(), ""));
            model.setDep_cd(JSPUtil.getParameter(request, "dep_cd            ".trim(), ""));
            model.setSubj_nm(JSPUtil.getParameter(request, "subj_nm           ".trim(), ""));
            model.setRef_rmk(JSPUtil.getParameter(request, "ref_rmk           ".trim(), ""));
            model.setFile_nm(JSPUtil.getParameter(request, "file_nm           ".trim(), ""));
            model.setFile_path_desc(JSPUtil.getParameter(request, "file_path_desc           ".trim(), ""));
            model.setFile_seq(JSPUtil.getParameter(request, "file_seq           ".trim(), ""));
            model.setFilemode(JSPUtil.getParameter(request, "filemode           ".trim(), ""));
            model.setCre_usr_id(JSPUtil.getParameter(request, "cre_usr_id        ".trim(), ""));
            model.setCre_dt(JSPUtil.getParameter(request, "cre_dt            ".trim(), ""));
            model.setUpd_usr_id(JSPUtil.getParameter(request, "upd_usr_id        ".trim(), ""));
            model.setUpd_dt(JSPUtil.getParameter(request, "upd_dt            ".trim(), ""));
        }
        catch(Exception exception) { }
        return model;
    }

    public static Collection fromRequestGrid(MultipartRequest request, String prefix)
    {
        GNI_DOCUMENT model = null;
        Collection models = new ArrayList();
        int length = 0;
        if(request.getParameterValues(prefix + "ibflag") != null)
            length = request.getParameterValues(prefix + "ibflag").length;
        try
        {
            String ibflag[] = JSPUtil.getParameter(request, prefix + "ibflag            ".trim(), length);
            String page_rows[] = JSPUtil.getParameter(request, prefix + "page_rows         ".trim(), length);
            String doc_seq[] = JSPUtil.getParameter(request, prefix + "doc_seq           ".trim(), length);
            String ref_id[] = JSPUtil.getParameter(request, prefix + "ref_id            ".trim(), length);
            String doc_src_cd[] = JSPUtil.getParameter(request, prefix + "doc_src_cd        ".trim(), length);
            String vsl_cd[] = JSPUtil.getParameter(request, prefix + "vsl_cd            ".trim(), length);
            String voy_seq[] = JSPUtil.getParameter(request, prefix + "voy_seq           ".trim(), length);
            String dep_cd[] = JSPUtil.getParameter(request, prefix + "dep_cd            ".trim(), length);
            String subj_nm[] = JSPUtil.getParameter(request, prefix + "subj_nm           ".trim(), length);
            String ref_rmk[] = JSPUtil.getParameter(request, prefix + "ref_rmk           ".trim(), length);
            String file_nm[] = JSPUtil.getParameter(request, prefix + "file_nm           ".trim(), length);
            String file_path_desc[] = JSPUtil.getParameter(request, prefix + "file_path_desc           ".trim(), length);
            String file_seq[] = JSPUtil.getParameter(request, prefix + "file_seq           ".trim(), length);
            String filemode[] = JSPUtil.getParameter(request, prefix + "filemode           ".trim(), length);
            String cre_usr_id[] = JSPUtil.getParameter(request, prefix + "cre_usr_id        ".trim(), length);
            String cre_dt[] = JSPUtil.getParameter(request, prefix + "cre_dt            ".trim(), length);
            String upd_usr_id[] = JSPUtil.getParameter(request, prefix + "upd_usr_id        ".trim(), length);
            String upd_dt[] = JSPUtil.getParameter(request, prefix + "upd_dt            ".trim(), length);
            for(int i = 0; i < length; i++)
            {
                model = new GNI_DOCUMENT();
                model.setIbflag(ibflag[i]);
                model.setPage_rows(page_rows[i]);
                model.setDoc_seq(doc_seq[i]);
                model.setRef_id(ref_id[i]);
                model.setDoc_src_cd(doc_src_cd[i]);
                model.setVsl_cd(vsl_cd[i]);
                model.setVoy_seq(voy_seq[i]);
                model.setDep_cd(dep_cd[i]);
                model.setSubj_nm(subj_nm[i]);
                model.setRef_rmk(ref_rmk[i]);
                model.setFile_nm(file_nm[i]);
                model.setFile_path_desc(file_path_desc[i]);
                model.setFile_seq(file_seq[i]);
                model.setFilemode(filemode[i]);
                model.setCre_usr_id(cre_usr_id[i]);
                model.setCre_dt(cre_dt[i]);
                model.setUpd_usr_id(upd_usr_id[i]);
                model.setUpd_dt(upd_dt[i]);
                models.add(model);
            }

        }
        catch(Exception exception) { }
        return models;
    }

    public String toString()
    {
        StringBuffer ret = new StringBuffer();
        Field field[] = getClass().getDeclaredFields();
        String space = "                              ";
        try
        {
            for(int i = 0; i < field.length; i++)
            {
                String arr[] = (String[])null;
                try
                {
                    arr = (String[])field[i].get(this);
                }
                catch(Exception ex)
                {
                    arr = new String[1];
                    arr[0] = String.valueOf(field[i].get(this));
                }
                if(arr != null)
                {
                    for(int j = 0; j < arr.length; j++)
                        ret.append(field[i].getName().concat(space).substring(0, 30).concat("= ") + arr[j] + "\n");

                } else
                {
                    ret.append(field[i].getName() + " =  null \n");
                }
            }

        }
        catch(Exception exception) { }
        return ret.toString();
    }

    public String getFile_nm()
    {
        return file_nm;
    }

    public void setFile_nm(String file_nm)
    {
        this.file_nm = file_nm;
    }

    public String getRef_rmk()
    {
        return ref_rmk;
    }

    public void setRef_rmk(String ref_rmk)
    {
        this.ref_rmk = ref_rmk;
    }

    public String getFile_seq()
    {
        return file_seq;
    }

    public void setFile_seq(String file_seq)
    {
        this.file_seq = file_seq;
    }

    public String getFilemode()
    {
        return filemode;
    }

    public void setFilemode(String filemode)
    {
        this.filemode = filemode;
    }

    public void setFile_path_desc(String file_path_desc)
    {
        this.file_path_desc = file_path_desc;
    }

    public String getFile_path_desc()
    {
        return file_path_desc;
    }
}
