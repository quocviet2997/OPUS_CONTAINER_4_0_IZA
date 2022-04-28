package com.clt.syscommon.common.table;

import java.lang.reflect.Field;
import java.util.Collection;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;

import com.clt.framework.component.util.JSPUtil;

/**
 * 1. 기능 : Table Value Ojbect
 * <p>
 * 2. 처리개요 :
 * <p> - 모든 업무에서 공통으로 사용하는 PDTO(Data Transfer Object including Parameters)
 * <p> - 관련 Event에서 작성, 서버실행요청시 PDTO의 역할을 수행하는 Value Object
 * <p>
 * 3. 주의사항 :
 * <p>
 * ===================================
 * 4. 작성자/작성일 : JHG/2006.05.26
 * ===================================
 * 5. 수정사항
 * 5.1 요구사항 ID :
 * - 수정자/수정일 :
 * - 수정사유/내역 :
 * ===================================
 * <p/>
 * @author : JHG
 * @version : v1.0.0
 */
public final class TB_ESTIMATION implements java.io.Serializable {

    private String                ibflag                = "";
    private String                page_rows             = "";
    private String                cb_no                 = "";
    private String                cb_date               = "";
    private String                cb_user               = "";
    private String                business_type         = "";
    private String                counter_party_cd      = "";
    private String                counter_party_nm      = "";
    private String                contract_type         = "";
    private String                route                 = "";
    private String                contract_period_from  = "";
    private String                contract_period_to    = "";
    private String                revaluate_times       = "";
    private String                quantity_day_num      = "";
    private String                quantity_day_type     = "";
    private String                agreed_price_num      = "";
    private String                agreed_price_type     = "";
    private String                flat_rate             = "";
    private String                agreed_amount         = "";
    private String                estimation_price_num  = "";
    private String                estimation_price_type = "";
    private String                estimation_amount     = "";
    private String                commission_num        = "";
    private String                commission_type       = "";
    private String                profit_loss           = "";
    private String                used_data             = "";
    private String                FDateSer     = "";
    private String                TDateSer     = "";
    private String                CBUserSer    = "";
    private String                busTypeSer     = "";
    private String                conTypeSer     = "";
    private String                routeSer     = "";
    
    public TB_ESTIMATION(){}

    public TB_ESTIMATION(
            String                ibflag               ,
            String                page_rows            ,
            String                cb_no                ,
            String                cb_date              ,
            String                cb_user              ,
            String                business_type        ,
            String                counter_party_cd     ,
            String                counter_party_nm     ,
            String                contract_type        ,
            String                route                ,
            String                contract_period_from ,
            String                contract_period_to   ,
            String                revaluate_times      ,
            String                quantity_day_num     ,
            String                quantity_day_type    ,
            String                agreed_price_num     ,
            String                agreed_price_type    ,
            String                flat_rate            ,
            String                agreed_amount        ,
            String                estimation_price_num ,
            String                estimation_price_type,
            String                estimation_amount    ,
            String                commission_num       ,
            String                commission_type      ,
            String                profit_loss          ,
            String                used_data            ,
            String                FDateSer   ,
            String                TDateSer   ,
            String                CBUserSer  ,
            String                busTypeSer ,
            String                conTypeSer ,
            String                routeSer    ){
        this.ibflag                = ibflag               ;
        this.page_rows             = page_rows            ;
        this.cb_no                 = cb_no                ;
        this.cb_date               = cb_date              ;
        this.cb_user               = cb_user              ;
        this.business_type         = business_type        ;
        this.counter_party_cd      = counter_party_cd     ;
        this.counter_party_nm      = counter_party_nm     ;
        this.contract_type         = contract_type        ;
        this.route                 = route                ;
        this.contract_period_from  = contract_period_from ;
        this.contract_period_to    = contract_period_to   ;
        this.revaluate_times       = revaluate_times      ;
        this.quantity_day_num      = quantity_day_num     ;
        this.quantity_day_type     = quantity_day_type    ;
        this.agreed_price_num      = agreed_price_num     ;
        this.agreed_price_type     = agreed_price_type    ;
        this.flat_rate             = flat_rate            ;
        this.agreed_amount         = agreed_amount        ;
        this.estimation_price_num  = estimation_price_num ;
        this.estimation_price_type = estimation_price_type;
        this.estimation_amount     = estimation_amount    ;
        this.commission_num        = commission_num       ;
        this.commission_type       = commission_type      ;
        this.profit_loss           = profit_loss          ;
        this.used_data             = used_data            ;
        this.FDateSer       = FDateSer     ;
        this.TDateSer       = TDateSer     ;
        this.CBUserSer      = CBUserSer    ;
        this.busTypeSer     = busTypeSer   ;
        this.conTypeSer     = conTypeSer   ;
        this.routeSer       = routeSer     ;
    }

    // getter method is proceeding ..
    public String                getIbflag               (){    return ibflag                   ;    }
    public String                getPage_rows            (){    return page_rows                ;    }
    public String                getCb_no                (){    return cb_no                    ;    }
    public String                getCb_date              (){    return cb_date                  ;    }
    public String                getCb_user              (){    return cb_user                  ;    }
    public String                getBusiness_type        (){    return business_type            ;    }
    public String                getCounter_party_cd     (){    return counter_party_cd         ;    }
    public String                getCounter_party_nm     (){    return counter_party_nm         ;    }
    public String                getContract_type        (){    return contract_type            ;    }
    public String                getRoute                (){    return route                    ;    }
    public String                getContract_period_from (){    return contract_period_from     ;    }
    public String                getContract_period_to   (){    return contract_period_to       ;    }
    public String                getRevaluate_times      (){    return revaluate_times          ;    }
    public String                getQuantity_day_num     (){    return quantity_day_num         ;    }
    public String                getQuantity_day_type    (){    return quantity_day_type        ;    }
    public String                getAgreed_price_num     (){    return agreed_price_num         ;    }
    public String                getAgreed_price_type    (){    return agreed_price_type        ;    }
    public String                getFlat_rate            (){    return flat_rate                ;    }
    public String                getAgreed_amount        (){    return agreed_amount            ;    }
    public String                getEstimation_price_num (){    return estimation_price_num     ;    }
    public String                getEstimation_price_type(){    return estimation_price_type    ;    }
    public String                getEstimation_amount    (){    return estimation_amount        ;    }
    public String                getCommission_num       (){    return commission_num           ;    }
    public String                getCommission_type      (){    return commission_type          ;    }
    public String                getProfit_loss          (){    return profit_loss              ;    }
    public String                getUsed_data            (){    return used_data                ;    }
    public String                getFDateSer     (){    return FDateSer     ;    }
    public String                getTDateSer     (){    return TDateSer     ;    }
    public String                getCBUserSer    (){    return CBUserSer    ;    }
    public String                getBusTypeSer   (){    return busTypeSer   ;    }
    public String                getConTypeSer   (){    return conTypeSer   ;    }
    public String                getRouteSer     (){    return routeSer     ;    }

    // setter method is proceeding ..
    public void setIbflag               ( String                ibflag                ){    this.ibflag                = ibflag                   ;    }
    public void setPage_rows            ( String                page_rows             ){    this.page_rows             = page_rows                ;    }
    public void setCb_no                ( String                cb_no                 ){    this.cb_no                 = cb_no                    ;    }
    public void setCb_date              ( String                cb_date               ){    this.cb_date               = cb_date                  ;    }
    public void setCb_user              ( String                cb_user               ){    this.cb_user               = cb_user                  ;    }
    public void setBusiness_type        ( String                business_type         ){    this.business_type         = business_type            ;    }
    public void setCounter_party_cd     ( String                counter_party_cd      ){    this.counter_party_cd      = counter_party_cd         ;    }
    public void setCounter_party_nm     ( String                counter_party_nm      ){    this.counter_party_nm      = counter_party_nm         ;    }
    public void setContract_type        ( String                contract_type         ){    this.contract_type         = contract_type            ;    }
    public void setRoute                ( String                route                 ){    this.route                 = route                    ;    }
    public void setContract_period_from ( String                contract_period_from  ){    this.contract_period_from  = contract_period_from     ;    }
    public void setContract_period_to   ( String                contract_period_to    ){    this.contract_period_to    = contract_period_to       ;    }
    public void setRevaluate_times      ( String                revaluate_times       ){    this.revaluate_times       = revaluate_times          ;    }
    public void setQuantity_day_num     ( String                quantity_day_num      ){    this.quantity_day_num      = quantity_day_num         ;    }
    public void setQuantity_day_type    ( String                quantity_day_type     ){    this.quantity_day_type     = quantity_day_type        ;    }
    public void setAgreed_price_num     ( String                agreed_price_num      ){    this.agreed_price_num      = agreed_price_num         ;    }
    public void setAgreed_price_type    ( String                agreed_price_type     ){    this.agreed_price_type     = agreed_price_type        ;    }
    public void setFlat_rate            ( String                flat_rate             ){    this.flat_rate             = flat_rate                ;    }
    public void setAgreed_amount        ( String                agreed_amount         ){    this.agreed_amount         = agreed_amount            ;    }
    public void setEstimation_price_num ( String                estimation_price_num  ){    this.estimation_price_num  = estimation_price_num     ;    }
    public void setEstimation_price_type( String                estimation_price_type ){    this.estimation_price_type = estimation_price_type    ;    }
    public void setEstimation_amount    ( String                estimation_amount     ){    this.estimation_amount     = estimation_amount        ;    }
    public void setCommission_num       ( String                commission_num        ){    this.commission_num        = commission_num           ;    }
    public void setCommission_type      ( String                commission_type       ){    this.commission_type       = commission_type          ;    }
    public void setProfit_loss          ( String                profit_loss           ){    this.profit_loss           = profit_loss              ;    }
    public void setUsed_data            ( String                used_data             ){    this.used_data             = used_data                ;    }
    public void setFDateSer       ( String         FDateSer    ){    this.FDateSer    = FDateSer ;    }
    public void setTDateSer       ( String         TDateSer    ){    this.TDateSer    = TDateSer ;    }
    public void setCBUserSer      ( String         CBUserSer   ){    this.CBUserSer   = CBUserSer ;   }
    public void setBusTypeSer     ( String         busTypeSer  ){    this.busTypeSer  = busTypeSer ;  }
    public void setConTypeSer     ( String         conTypeSer  ){    this.conTypeSer  = conTypeSer ;  }
    public void setRouteSer       ( String         routeSer    ){    this.routeSer    = routeSer ;    }
    
    public static TB_ESTIMATION fromRequest(HttpServletRequest request) {
        TB_ESTIMATION model = new TB_ESTIMATION();
        try {
        	model.setIbflag                   (JSPUtil.getParameter(request, "ibflag                       ".trim(), ""));
            model.setPage_rows                (JSPUtil.getParameter(request, "page_rows                    ".trim(), ""));
            model.setCb_no                    (JSPUtil.getParameter(request, "cb_no                        ".trim(), ""));
            model.setCb_date                  (JSPUtil.getParameter(request, "cb_date                      ".trim(), ""));
            model.setCb_user                  (JSPUtil.getParameter(request, "cb_user                      ".trim(), ""));
            model.setBusiness_type            (JSPUtil.getParameter(request, "business_type                ".trim(), ""));
            model.setCounter_party_cd         (JSPUtil.getParameter(request, "counter_party_cd             ".trim(), ""));
            model.setCounter_party_nm         (JSPUtil.getParameter(request, "counter_party_nm             ".trim(), ""));
            model.setContract_type            (JSPUtil.getParameter(request, "contract_type                ".trim(), ""));
            model.setRoute                    (JSPUtil.getParameter(request, "route                        ".trim(), ""));
            model.setContract_period_from     (JSPUtil.getParameter(request, "contract_period_from         ".trim(), ""));
            model.setContract_period_to       (JSPUtil.getParameter(request, "contract_period_to           ".trim(), ""));
            model.setRevaluate_times          (JSPUtil.getParameter(request, "revaluate_times              ".trim(), ""));
            model.setQuantity_day_num         (JSPUtil.getParameter(request, "quantity_day_num             ".trim(), ""));
            model.setQuantity_day_type        (JSPUtil.getParameter(request, "quantity_day_type            ".trim(), ""));
            model.setAgreed_price_num         (JSPUtil.getParameter(request, "agreed_price_num             ".trim(), ""));
            model.setAgreed_price_type        (JSPUtil.getParameter(request, "agreed_price_type            ".trim(), ""));
            model.setFlat_rate                (JSPUtil.getParameter(request, "flat_rate                    ".trim(), ""));
            model.setAgreed_amount            (JSPUtil.getParameter(request, "agreed_amount                ".trim(), ""));
            model.setEstimation_price_num     (JSPUtil.getParameter(request, "estimation_price_num         ".trim(), ""));
            model.setEstimation_price_type    (JSPUtil.getParameter(request, "estimation_price_type        ".trim(), ""));
            model.setEstimation_amount        (JSPUtil.getParameter(request, "estimation_amount            ".trim(), ""));
            model.setCommission_num           (JSPUtil.getParameter(request, "commission_num               ".trim(), ""));
            model.setCommission_type          (JSPUtil.getParameter(request, "commission_type              ".trim(), ""));
            model.setProfit_loss              (JSPUtil.getParameter(request, "profit_loss                  ".trim(), ""));
            model.setUsed_data                (JSPUtil.getParameter(request, "used_data                    ".trim(), ""));
            model.setFDateSer     (JSPUtil.getParameter(request, "FDateSer".trim(), ""));
            model.setTDateSer     (JSPUtil.getParameter(request, "TDateSer".trim(), ""));
            model.setCBUserSer    (JSPUtil.getParameter(request, "CBUserSer".trim(), ""));
            model.setBusTypeSer   (JSPUtil.getParameter(request, "busTypeSer".trim(), ""));
            model.setConTypeSer   (JSPUtil.getParameter(request, "conTypeSer".trim(), ""));
            model.setRouteSer     (JSPUtil.getParameter(request, "routeSer".trim(), ""));
        } catch (Exception ex) {
            //throw new Exception(ex.getMessage());
        }
        return model;
    }
    public static Collection fromRequest(HttpServletRequest request, int length) {
        TB_ESTIMATION model = null;
        Collection models = new ArrayList();
        try {
            String[] ibflag                =  (JSPUtil.getParameter(request, "ibflag                       ".trim(), length));
            String[] page_rows             =  (JSPUtil.getParameter(request, "page_rows                    ".trim(), length));
            String[] cb_no                 =  (JSPUtil.getParameter(request, "cb_no                        ".trim(), length));
            String[] cb_date               =  (JSPUtil.getParameter(request, "cb_date                      ".trim(), length));
            String[] cb_user               =  (JSPUtil.getParameter(request, "cb_user                      ".trim(), length));
            String[] business_type         =  (JSPUtil.getParameter(request, "business_type                ".trim(), length));
            String[] counter_party_cd      =  (JSPUtil.getParameter(request, "counter_party_cd             ".trim(), length));
            String[] counter_party_nm      =  (JSPUtil.getParameter(request, "counter_party_nm             ".trim(), length));
            String[] contract_type         =  (JSPUtil.getParameter(request, "contract_type                ".trim(), length));
            String[] route                 =  (JSPUtil.getParameter(request, "route                        ".trim(), length));
            String[] contract_period_from  =  (JSPUtil.getParameter(request, "contract_period_from         ".trim(), length));
            String[] contract_period_to    =  (JSPUtil.getParameter(request, "contract_period_to           ".trim(), length));
            String[] revaluate_times       =  (JSPUtil.getParameter(request, "revaluate_times              ".trim(), length));
            String[] quantity_day_num      =  (JSPUtil.getParameter(request, "quantity_day_num             ".trim(), length));
            String[] quantity_day_type     =  (JSPUtil.getParameter(request, "quantity_day_type            ".trim(), length));
            String[] agreed_price_num      =  (JSPUtil.getParameter(request, "agreed_price_num             ".trim(), length));
            String[] agreed_price_type     =  (JSPUtil.getParameter(request, "agreed_price_type            ".trim(), length));
            String[] flat_rate             =  (JSPUtil.getParameter(request, "flat_rate                    ".trim(), length));
            String[] agreed_amount         =  (JSPUtil.getParameter(request, "agreed_amount                ".trim(), length));
            String[] estimation_price_num  =  (JSPUtil.getParameter(request, "estimation_price_num         ".trim(), length));
            String[] estimation_price_type =  (JSPUtil.getParameter(request, "estimation_price_type        ".trim(), length));
            String[] estimation_amount     =  (JSPUtil.getParameter(request, "estimation_amount            ".trim(), length));
            String[] commission_num        =  (JSPUtil.getParameter(request, "commission_num               ".trim(), length));
            String[] commission_type       =  (JSPUtil.getParameter(request, "commission_type              ".trim(), length));
            String[] profit_loss           =  (JSPUtil.getParameter(request, "profit_loss                  ".trim(), length));
            String[] used_data             =  (JSPUtil.getParameter(request, "used_data                    ".trim(), length));
            for (int i = 0; i < length; i++) {
                model = new TB_ESTIMATION();
                model.setIbflag                         (ibflag                   [i]);
                model.setPage_rows                      (page_rows                [i]);
                model.setCb_no                          (cb_no                    [i]);
                model.setCb_date                        (cb_date                  [i]);
                model.setCb_user                        (cb_user                  [i]);
                model.setBusiness_type                  (business_type            [i]);
                model.setCounter_party_cd               (counter_party_cd         [i]);
                model.setCounter_party_nm               (counter_party_nm         [i]);
                model.setContract_type                  (contract_type            [i]);
                model.setRoute                          (route                    [i]);
                model.setContract_period_from           (contract_period_from     [i]);
                model.setContract_period_to             (contract_period_to       [i]);
                model.setRevaluate_times                (revaluate_times          [i]);
                model.setQuantity_day_num               (quantity_day_num         [i]);
                model.setQuantity_day_type              (quantity_day_type        [i]);
                model.setAgreed_price_num               (agreed_price_num         [i]);
                model.setAgreed_price_type              (agreed_price_type        [i]);
                model.setFlat_rate                      (flat_rate                [i]);
                model.setAgreed_amount                  (agreed_amount            [i]);
                model.setEstimation_price_num           (estimation_price_num     [i]);
                model.setEstimation_price_type          (estimation_price_type    [i]);
                model.setEstimation_amount              (estimation_amount        [i]);
                model.setCommission_num                 (commission_num           [i]);
                model.setCommission_type                (commission_type          [i]);
                model.setProfit_loss                    (profit_loss              [i]);
                model.setUsed_data                      (used_data                [i]);
                models.add(model);
            }
        } catch (Exception ex) {
        }
        return models;
    }
    public static Collection fromRequestGrid(HttpServletRequest request) {
        TB_ESTIMATION model = null;
        Collection models = new ArrayList();
        int length = request.getParameterValues("ibflag").length;
        try {
            String[] ibflag                =  (JSPUtil.getParameter(request, "ibflag                       ".trim(), length));
            String[] page_rows             =  (JSPUtil.getParameter(request, "page_rows                    ".trim(), length));
            String[] cb_no                 =  (JSPUtil.getParameter(request, "cb_no                        ".trim(), length));
            String[] cb_date               =  (JSPUtil.getParameter(request, "cb_date                      ".trim(), length));
            String[] cb_user               =  (JSPUtil.getParameter(request, "cb_user                      ".trim(), length));
            String[] business_type         =  (JSPUtil.getParameter(request, "business_type                ".trim(), length));
            String[] counter_party_cd      =  (JSPUtil.getParameter(request, "counter_party_cd             ".trim(), length));
            String[] counter_party_nm      =  (JSPUtil.getParameter(request, "counter_party_nm             ".trim(), length));
            String[] contract_type         =  (JSPUtil.getParameter(request, "contract_type                ".trim(), length));
            String[] route                 =  (JSPUtil.getParameter(request, "route                        ".trim(), length));
            String[] contract_period_from  =  (JSPUtil.getParameter(request, "contract_period_from         ".trim(), length));
            String[] contract_period_to    =  (JSPUtil.getParameter(request, "contract_period_to           ".trim(), length));
            String[] revaluate_times       =  (JSPUtil.getParameter(request, "revaluate_times              ".trim(), length));
            String[] quantity_day_num      =  (JSPUtil.getParameter(request, "quantity_day_num             ".trim(), length));
            String[] quantity_day_type     =  (JSPUtil.getParameter(request, "quantity_day_type            ".trim(), length));
            String[] agreed_price_num      =  (JSPUtil.getParameter(request, "agreed_price_num             ".trim(), length));
            String[] agreed_price_type     =  (JSPUtil.getParameter(request, "agreed_price_type            ".trim(), length));
            String[] flat_rate             =  (JSPUtil.getParameter(request, "flat_rate                    ".trim(), length));
            String[] agreed_amount         =  (JSPUtil.getParameter(request, "agreed_amount                ".trim(), length));
            String[] estimation_price_num  =  (JSPUtil.getParameter(request, "estimation_price_num         ".trim(), length));
            String[] estimation_price_type =  (JSPUtil.getParameter(request, "estimation_price_type        ".trim(), length));
            String[] estimation_amount     =  (JSPUtil.getParameter(request, "estimation_amount            ".trim(), length));
            String[] commission_num        =  (JSPUtil.getParameter(request, "commission_num               ".trim(), length));
            String[] commission_type       =  (JSPUtil.getParameter(request, "commission_type              ".trim(), length));
            String[] profit_loss           =  (JSPUtil.getParameter(request, "profit_loss                  ".trim(), length));
            String[] used_data             =  (JSPUtil.getParameter(request, "used_data                    ".trim(), length));
            for (int i = 0; i < length; i++) {
                model = new TB_ESTIMATION();
                model.setIbflag                         (ibflag                   [i]);
                model.setPage_rows                      (page_rows                [i]);
                model.setCb_no                          (cb_no                    [i]);
                model.setCb_date                        (cb_date                  [i]);
                model.setCb_user                        (cb_user                  [i]);
                model.setBusiness_type                  (business_type            [i]);
                model.setCounter_party_cd               (counter_party_cd         [i]);
                model.setCounter_party_nm               (counter_party_nm         [i]);
                model.setContract_type                  (contract_type            [i]);
                model.setRoute                          (route                    [i]);
                model.setContract_period_from           (contract_period_from     [i]);
                model.setContract_period_to             (contract_period_to       [i]);
                model.setRevaluate_times                (revaluate_times          [i]);
                model.setQuantity_day_num               (quantity_day_num         [i]);
                model.setQuantity_day_type              (quantity_day_type        [i]);
                model.setAgreed_price_num               (agreed_price_num         [i]);
                model.setAgreed_price_type              (agreed_price_type        [i]);
                model.setFlat_rate                      (flat_rate                [i]);
                model.setAgreed_amount                  (agreed_amount            [i]);
                model.setEstimation_price_num           (estimation_price_num     [i]);
                model.setEstimation_price_type          (estimation_price_type    [i]);
                model.setEstimation_amount              (estimation_amount        [i]);
                model.setCommission_num                 (commission_num           [i]);
                model.setCommission_type                (commission_type          [i]);
                model.setProfit_loss                    (profit_loss              [i]);
                model.setUsed_data                      (used_data                [i]);
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
