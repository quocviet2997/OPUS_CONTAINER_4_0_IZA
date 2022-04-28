/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : ScgImdgUnNoVO.java
*@FileTitle : ScgImdgUnNoVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.14
*@LastModifier : 이도형
*@LastVersion : 1.0
* 2009.05.14 이도형 
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.common.table;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import javax.servlet.http.HttpServletRequest;
import com.clt.framework.component.common.AbstractValueObject;
import com.clt.framework.component.util.JSPUtil;

/**
 * Table Value Ojbect<br>
 * - PDTO(Data Transfer Object including Parameters)<br>
 * - 관련 Event에서 작성, 서버실행요청시 PDTO의 역할을 수행하는 Value Object<br>
 *
 * @author 이도형
 * @since J2EE 1.5
 * @see AbstractValueObject
 */
public class ScgImdgUnNoVO extends AbstractValueObject {

    private static final long serialVersionUID = 1L;

    private Collection<ScgImdgUnNoVO> models = new ArrayList<ScgImdgUnNoVO>();

    /* Column Info */
    private String n2ndImdgPckProviCd = null;

    /* Column Info */
    private String cfrRstrOprNm = null;

    /* Column Info */
    private String awayFmImdgSegrGrpFlg = null;

    /* Column Info */
    private String imdgUnNoSeq = null;

    /* Column Info */
    private String psaNo = null;

    /* Column Info */
    private String imdgSubsRskLblRmk = null;

    /* Column Info */
    private String hcdgRmk = null;

    /* Column Info */
    private String n2ndImdgPckInstrCd = null;

    /* Column Info */
    private String n1stImdgIbcProviCd = null;

    /* Column Info */
    private String n3rdAwayFmImdgClssCd = null;

    /* Page Number */
    private String pagerows = null;

    /* Column Info */
    private String n4thImdgPckProviCd = null;

    /* Column Info */
    private String imdgCompGrpCd = null;

    /* Column Info */
    private String segrDesc = null;

    /* Column Info */
    private String cfrDgWetCd = null;

    /* Column Info */
    private String n3rdImdgPckInstrCd = null;

    /* Column Info */
    private String sprtFmImdgSegrGrpFlg = null;

    /* Column Info */
    private String n1stImdgPckInstrCd = null;

    /* Column Info */
    private String n4thImdgTnkInstrProviCd = null;

    /* Column Info */
    private String imdgUnTnkInstrCd = null;

    /* Column Info */
    private String n4thImdgIbcProviCd = null;

    /* Column Info */
    private String n5thImdgPckProviCd = null;

    /* Column Info */
    private String updUsrId = null;

    /* Column Info */
    private String imdgUnNo = null;

    /* Column Info */
    private String hcdgFlg = null;

    /* Column Info */
    private String n3rdImdgPckProviCd = null;

    /* Column Info */
    private String sprtFmImdgClssFlg = null;

    /* Column Info */
    private String awayFmImdgClssFlg = null;

    /* Column Info */
    private String hcdgIntmdBcRstrDesc = null;

    /* Column Info */
    private String n3rdImdgIbcInstrCd = null;

    /* Column Info */
    private String segrAsForImdgClssCd = null;

    /* Column Info */
    private String n5thImdgTnkInstrProviCd = null;

    /* Column Info */
    private String creUsrId = null;

    /* Column Info */
    private String cfrRstrPortNm = null;

    /* Column Info */
    private String emerRspnGidNo = null;

    /* Column Info */
    private String n4thBomPortTrstNo = null;

    /* Column Info */
    private String emerRspnGidChrNo = null;

    /* Column Info */
    private String imdgClssCd = null;

    /* Column Info */
    private String imdgPckGrpCd = null;

    /* Column Info */
    private String imdgLmtQtyMeasUtCd = null;

    /* Column Info */
    private String creDt = null;

    /* Column Info */
    private String n1stBomPortTrstNo = null;

    /* Column Info */
    private String pkgAuthNo = null;

    /* Column Info */
    private String imdgLmtQty = null;

    /* Column Info */
    private String n3rdBomPortTrstNo = null;

    /* Column Info */
    private String n1stSprtFmImdgClssCd = null;

    /* Column Info */
    private String n5thImdgIbcProviCd = null;

    /* Column Info */
    private String segrAsForImdgClssFlg = null;

    /* Status */
    private String ibflag = null;

    /* Column Info */
    private String imdgExptQtyCd = null;

    /* Column Info */
    private String n2ndImdgIbcProviCd = null;

    /* Column Info */
    private String lkPortAuthNo = null;

    /* Column Info */
    private String n1stImdgPckProviCd = null;

    /* Column Info */
    private String flshPntTempCtnt = null;

    /* Column Info */
    private String hcdgPckRstrDesc = null;

    /* Column Info */
    private String n1stAwayFmImdgClssCd = null;

    /* Column Info */
    private String cfrRptQty = null;

    /* Column Info */
    private String cfrPsnInhZnCd = null;

    /* Column Info */
    private String imdgHtSrcStwgCd = null;

    /* Column Info */
    private String clrLivQtrStwgFlg = null;

    /* Column Info */
    private String updDt = null;

    /* Column Info */
    private String n1stImdgIbcInstrCd = null;

    /* Column Info */
    private String imdgStwgCateCd = null;

    /* Column Info */
    private String n3rdImdgTnkInstrProviCd = null;

    /* Column Info */
    private String imdgSbstPptDesc = null;

    /* Column Info */
    private String n1stImdgTnkInstrProviCd = null;

    /* Column Info */
    private String n2ndImdgIbcInstrCd = null;

    /* Column Info */
    private String imdgFdStufStwgCd = null;

    /* Column Info */
    private String n3rdImdgIbcProviCd = null;

    /* Column Info */
    private String cfrToxcCd = null;

    /* Column Info */
    private String n2ndAwayFmImdgClssCd = null;

    /* Column Info */
    private String imdgEmerNo = null;

    /* Column Info */
    private String n3rdSprtFmImdgClssCd = null;

    /* Column Info */
    private String n2ndSprtFmImdgClssCd = null;

    /* Column Info */
    private String n2ndImdgTnkInstrProviCd = null;

    /* Column Info */
    private String n2ndBomPortTrstNo = null;

    /* Column Info */
    private String hcdgTnkRstrDesc = null;

    /* Column Info */
    private String imdgMrnPolutCd = null;

    /* Column Info */
    private String cfrXtdClssCd = null;

    /* Column Info */
    private String hcdgDpndQtyFlg = null;

    /* Column Info */
    private String prpShpNm = null;

    /* CFR flag */
    private String cfrFlg = "F";

    /* Column Info */
    private String imdgAmdtNo = null;

    /*	Table Column name으로 맴버변수 value 담는다*/
    private HashMap<String, String> hashColumns = new HashMap<String, String>();

    /*	Table Column name으로 맴버변수 name 	담는다*/
    private HashMap<String, String> hashFields = new HashMap<String, String>();

    public ScgImdgUnNoVO() {
    }

    public ScgImdgUnNoVO(String ibflag, String pagerows, String imdgUnNo, String imdgUnNoSeq, String prpShpNm, String imdgClssCd, String imdgCompGrpCd, String imdgSubsRskLblRmk, String imdgMrnPolutCd, String imdgPckGrpCd, String imdgLmtQty, String imdgLmtQtyMeasUtCd, String imdgExptQtyCd, String imdgEmerNo, String imdgStwgCateCd, String flshPntTempCtnt, String emerRspnGidNo, String emerRspnGidChrNo, String psaNo, String n1stBomPortTrstNo, String n2ndBomPortTrstNo, String n3rdBomPortTrstNo, String n4thBomPortTrstNo, String pkgAuthNo, String lkPortAuthNo, String imdgSbstPptDesc, String cfrRptQty, String cfrPsnInhZnCd, String cfrToxcCd, String cfrDgWetCd, String cfrRstrPortNm, String cfrRstrOprNm, String cfrXtdClssCd, String hcdgFlg, String hcdgDpndQtyFlg, String hcdgRmk, String n1stImdgPckInstrCd, String n2ndImdgPckInstrCd, String n3rdImdgPckInstrCd, String n1stImdgPckProviCd, String n2ndImdgPckProviCd, String n3rdImdgPckProviCd, String n4thImdgPckProviCd, String n5thImdgPckProviCd, String n1stImdgIbcInstrCd, String n2ndImdgIbcInstrCd, String n3rdImdgIbcInstrCd, String n1stImdgIbcProviCd, String n2ndImdgIbcProviCd, String n3rdImdgIbcProviCd, String n4thImdgIbcProviCd, String n5thImdgIbcProviCd, String imdgUnTnkInstrCd, String n1stImdgTnkInstrProviCd, String n2ndImdgTnkInstrProviCd, String n3rdImdgTnkInstrProviCd, String n4thImdgTnkInstrProviCd, String n5thImdgTnkInstrProviCd, String hcdgPckRstrDesc, String hcdgIntmdBcRstrDesc, String hcdgTnkRstrDesc, String segrDesc, String clrLivQtrStwgFlg, String imdgFdStufStwgCd, String imdgHtSrcStwgCd, String segrAsForImdgClssFlg, String segrAsForImdgClssCd, String awayFmImdgClssFlg, String n1stAwayFmImdgClssCd, String n2ndAwayFmImdgClssCd, String n3rdAwayFmImdgClssCd, String sprtFmImdgClssFlg, String n1stSprtFmImdgClssCd, String n2ndSprtFmImdgClssCd, String n3rdSprtFmImdgClssCd, String awayFmImdgSegrGrpFlg, String sprtFmImdgSegrGrpFlg, String creUsrId, String creDt, String updUsrId, String updDt, String imdgAmdtNo) {
        this.n2ndImdgPckProviCd = n2ndImdgPckProviCd;
        this.cfrRstrOprNm = cfrRstrOprNm;
        this.awayFmImdgSegrGrpFlg = awayFmImdgSegrGrpFlg;
        this.imdgUnNoSeq = imdgUnNoSeq;
        this.psaNo = psaNo;
        this.imdgSubsRskLblRmk = imdgSubsRskLblRmk;
        this.hcdgRmk = hcdgRmk;
        this.n2ndImdgPckInstrCd = n2ndImdgPckInstrCd;
        this.n1stImdgIbcProviCd = n1stImdgIbcProviCd;
        this.n3rdAwayFmImdgClssCd = n3rdAwayFmImdgClssCd;
        this.pagerows = pagerows;
        this.n4thImdgPckProviCd = n4thImdgPckProviCd;
        this.imdgCompGrpCd = imdgCompGrpCd;
        this.segrDesc = segrDesc;
        this.cfrDgWetCd = cfrDgWetCd;
        this.n3rdImdgPckInstrCd = n3rdImdgPckInstrCd;
        this.sprtFmImdgSegrGrpFlg = sprtFmImdgSegrGrpFlg;
        this.n1stImdgPckInstrCd = n1stImdgPckInstrCd;
        this.n4thImdgTnkInstrProviCd = n4thImdgTnkInstrProviCd;
        this.imdgUnTnkInstrCd = imdgUnTnkInstrCd;
        this.n4thImdgIbcProviCd = n4thImdgIbcProviCd;
        this.n5thImdgPckProviCd = n5thImdgPckProviCd;
        this.updUsrId = updUsrId;
        this.imdgUnNo = imdgUnNo;
        this.hcdgFlg = hcdgFlg;
        this.n3rdImdgPckProviCd = n3rdImdgPckProviCd;
        this.sprtFmImdgClssFlg = sprtFmImdgClssFlg;
        this.awayFmImdgClssFlg = awayFmImdgClssFlg;
        this.hcdgIntmdBcRstrDesc = hcdgIntmdBcRstrDesc;
        this.n3rdImdgIbcInstrCd = n3rdImdgIbcInstrCd;
        this.segrAsForImdgClssCd = segrAsForImdgClssCd;
        this.n5thImdgTnkInstrProviCd = n5thImdgTnkInstrProviCd;
        this.creUsrId = creUsrId;
        this.cfrRstrPortNm = cfrRstrPortNm;
        this.emerRspnGidNo = emerRspnGidNo;
        this.n4thBomPortTrstNo = n4thBomPortTrstNo;
        this.emerRspnGidChrNo = emerRspnGidChrNo;
        this.imdgClssCd = imdgClssCd;
        this.imdgPckGrpCd = imdgPckGrpCd;
        this.imdgLmtQtyMeasUtCd = imdgLmtQtyMeasUtCd;
        this.creDt = creDt;
        this.n1stBomPortTrstNo = n1stBomPortTrstNo;
        this.pkgAuthNo = pkgAuthNo;
        this.imdgLmtQty = imdgLmtQty;
        this.n3rdBomPortTrstNo = n3rdBomPortTrstNo;
        this.n1stSprtFmImdgClssCd = n1stSprtFmImdgClssCd;
        this.n5thImdgIbcProviCd = n5thImdgIbcProviCd;
        this.segrAsForImdgClssFlg = segrAsForImdgClssFlg;
        this.ibflag = ibflag;
        this.imdgExptQtyCd = imdgExptQtyCd;
        this.n2ndImdgIbcProviCd = n2ndImdgIbcProviCd;
        this.lkPortAuthNo = lkPortAuthNo;
        this.n1stImdgPckProviCd = n1stImdgPckProviCd;
        this.flshPntTempCtnt = flshPntTempCtnt;
        this.hcdgPckRstrDesc = hcdgPckRstrDesc;
        this.n1stAwayFmImdgClssCd = n1stAwayFmImdgClssCd;
        this.cfrRptQty = cfrRptQty;
        this.cfrPsnInhZnCd = cfrPsnInhZnCd;
        this.imdgHtSrcStwgCd = imdgHtSrcStwgCd;
        this.clrLivQtrStwgFlg = clrLivQtrStwgFlg;
        this.updDt = updDt;
        this.n1stImdgIbcInstrCd = n1stImdgIbcInstrCd;
        this.imdgStwgCateCd = imdgStwgCateCd;
        this.n3rdImdgTnkInstrProviCd = n3rdImdgTnkInstrProviCd;
        this.imdgSbstPptDesc = imdgSbstPptDesc;
        this.n1stImdgTnkInstrProviCd = n1stImdgTnkInstrProviCd;
        this.n2ndImdgIbcInstrCd = n2ndImdgIbcInstrCd;
        this.imdgFdStufStwgCd = imdgFdStufStwgCd;
        this.n3rdImdgIbcProviCd = n3rdImdgIbcProviCd;
        this.cfrToxcCd = cfrToxcCd;
        this.n2ndAwayFmImdgClssCd = n2ndAwayFmImdgClssCd;
        this.imdgEmerNo = imdgEmerNo;
        this.n3rdSprtFmImdgClssCd = n3rdSprtFmImdgClssCd;
        this.n2ndSprtFmImdgClssCd = n2ndSprtFmImdgClssCd;
        this.n2ndImdgTnkInstrProviCd = n2ndImdgTnkInstrProviCd;
        this.n2ndBomPortTrstNo = n2ndBomPortTrstNo;
        this.hcdgTnkRstrDesc = hcdgTnkRstrDesc;
        this.imdgMrnPolutCd = imdgMrnPolutCd;
        this.cfrXtdClssCd = cfrXtdClssCd;
        this.hcdgDpndQtyFlg = hcdgDpndQtyFlg;
        this.prpShpNm = prpShpNm;
        this.imdgAmdtNo = imdgAmdtNo;
    }

    public ScgImdgUnNoVO(String ibflag, String pagerows, String imdgUnNo, String imdgUnNoSeq, String prpShpNm, String imdgClssCd, String imdgCompGrpCd, String imdgSubsRskLblRmk, String imdgMrnPolutCd, String imdgPckGrpCd, String imdgLmtQty, String imdgLmtQtyMeasUtCd, String imdgExptQtyCd, String imdgEmerNo, String imdgStwgCateCd, String flshPntTempCtnt, String emerRspnGidNo, String emerRspnGidChrNo, String psaNo, String n1stBomPortTrstNo, String n2ndBomPortTrstNo, String n3rdBomPortTrstNo, String n4thBomPortTrstNo, String pkgAuthNo, String lkPortAuthNo, String imdgSbstPptDesc, String cfrRptQty, String cfrPsnInhZnCd, String cfrToxcCd, String cfrDgWetCd, String cfrRstrPortNm, String cfrRstrOprNm, String cfrXtdClssCd, String hcdgFlg, String hcdgDpndQtyFlg, String hcdgRmk, String n1stImdgPckInstrCd, String n2ndImdgPckInstrCd, String n3rdImdgPckInstrCd, String n1stImdgPckProviCd, String n2ndImdgPckProviCd, String n3rdImdgPckProviCd, String n4thImdgPckProviCd, String n5thImdgPckProviCd, String n1stImdgIbcInstrCd, String n2ndImdgIbcInstrCd, String n3rdImdgIbcInstrCd, String n1stImdgIbcProviCd, String n2ndImdgIbcProviCd, String n3rdImdgIbcProviCd, String n4thImdgIbcProviCd, String n5thImdgIbcProviCd, String imdgUnTnkInstrCd, String n1stImdgTnkInstrProviCd, String n2ndImdgTnkInstrProviCd, String n3rdImdgTnkInstrProviCd, String n4thImdgTnkInstrProviCd, String n5thImdgTnkInstrProviCd, String hcdgPckRstrDesc, String hcdgIntmdBcRstrDesc, String hcdgTnkRstrDesc, String segrDesc, String clrLivQtrStwgFlg, String imdgFdStufStwgCd, String imdgHtSrcStwgCd, String segrAsForImdgClssFlg, String segrAsForImdgClssCd, String awayFmImdgClssFlg, String n1stAwayFmImdgClssCd, String n2ndAwayFmImdgClssCd, String n3rdAwayFmImdgClssCd, String sprtFmImdgClssFlg, String n1stSprtFmImdgClssCd, String n2ndSprtFmImdgClssCd, String n3rdSprtFmImdgClssCd, String awayFmImdgSegrGrpFlg, String sprtFmImdgSegrGrpFlg, String creUsrId, String creDt, String updUsrId, String updDt, String cfrFlg, String imdgAmdtNo) {
        this.n2ndImdgPckProviCd = n2ndImdgPckProviCd;
        this.cfrRstrOprNm = cfrRstrOprNm;
        this.awayFmImdgSegrGrpFlg = awayFmImdgSegrGrpFlg;
        this.imdgUnNoSeq = imdgUnNoSeq;
        this.psaNo = psaNo;
        this.imdgSubsRskLblRmk = imdgSubsRskLblRmk;
        this.hcdgRmk = hcdgRmk;
        this.n2ndImdgPckInstrCd = n2ndImdgPckInstrCd;
        this.n1stImdgIbcProviCd = n1stImdgIbcProviCd;
        this.n3rdAwayFmImdgClssCd = n3rdAwayFmImdgClssCd;
        this.pagerows = pagerows;
        this.n4thImdgPckProviCd = n4thImdgPckProviCd;
        this.imdgCompGrpCd = imdgCompGrpCd;
        this.segrDesc = segrDesc;
        this.cfrDgWetCd = cfrDgWetCd;
        this.n3rdImdgPckInstrCd = n3rdImdgPckInstrCd;
        this.sprtFmImdgSegrGrpFlg = sprtFmImdgSegrGrpFlg;
        this.n1stImdgPckInstrCd = n1stImdgPckInstrCd;
        this.n4thImdgTnkInstrProviCd = n4thImdgTnkInstrProviCd;
        this.imdgUnTnkInstrCd = imdgUnTnkInstrCd;
        this.n4thImdgIbcProviCd = n4thImdgIbcProviCd;
        this.n5thImdgPckProviCd = n5thImdgPckProviCd;
        this.updUsrId = updUsrId;
        this.imdgUnNo = imdgUnNo;
        this.hcdgFlg = hcdgFlg;
        this.n3rdImdgPckProviCd = n3rdImdgPckProviCd;
        this.sprtFmImdgClssFlg = sprtFmImdgClssFlg;
        this.awayFmImdgClssFlg = awayFmImdgClssFlg;
        this.hcdgIntmdBcRstrDesc = hcdgIntmdBcRstrDesc;
        this.n3rdImdgIbcInstrCd = n3rdImdgIbcInstrCd;
        this.segrAsForImdgClssCd = segrAsForImdgClssCd;
        this.n5thImdgTnkInstrProviCd = n5thImdgTnkInstrProviCd;
        this.creUsrId = creUsrId;
        this.cfrRstrPortNm = cfrRstrPortNm;
        this.emerRspnGidNo = emerRspnGidNo;
        this.n4thBomPortTrstNo = n4thBomPortTrstNo;
        this.emerRspnGidChrNo = emerRspnGidChrNo;
        this.imdgClssCd = imdgClssCd;
        this.imdgPckGrpCd = imdgPckGrpCd;
        this.imdgLmtQtyMeasUtCd = imdgLmtQtyMeasUtCd;
        this.creDt = creDt;
        this.n1stBomPortTrstNo = n1stBomPortTrstNo;
        this.pkgAuthNo = pkgAuthNo;
        this.imdgLmtQty = imdgLmtQty;
        this.n3rdBomPortTrstNo = n3rdBomPortTrstNo;
        this.n1stSprtFmImdgClssCd = n1stSprtFmImdgClssCd;
        this.n5thImdgIbcProviCd = n5thImdgIbcProviCd;
        this.segrAsForImdgClssFlg = segrAsForImdgClssFlg;
        this.ibflag = ibflag;
        this.imdgExptQtyCd = imdgExptQtyCd;
        this.n2ndImdgIbcProviCd = n2ndImdgIbcProviCd;
        this.lkPortAuthNo = lkPortAuthNo;
        this.n1stImdgPckProviCd = n1stImdgPckProviCd;
        this.flshPntTempCtnt = flshPntTempCtnt;
        this.hcdgPckRstrDesc = hcdgPckRstrDesc;
        this.n1stAwayFmImdgClssCd = n1stAwayFmImdgClssCd;
        this.cfrRptQty = cfrRptQty;
        this.cfrPsnInhZnCd = cfrPsnInhZnCd;
        this.imdgHtSrcStwgCd = imdgHtSrcStwgCd;
        this.clrLivQtrStwgFlg = clrLivQtrStwgFlg;
        this.updDt = updDt;
        this.n1stImdgIbcInstrCd = n1stImdgIbcInstrCd;
        this.imdgStwgCateCd = imdgStwgCateCd;
        this.n3rdImdgTnkInstrProviCd = n3rdImdgTnkInstrProviCd;
        this.imdgSbstPptDesc = imdgSbstPptDesc;
        this.n1stImdgTnkInstrProviCd = n1stImdgTnkInstrProviCd;
        this.n2ndImdgIbcInstrCd = n2ndImdgIbcInstrCd;
        this.imdgFdStufStwgCd = imdgFdStufStwgCd;
        this.n3rdImdgIbcProviCd = n3rdImdgIbcProviCd;
        this.cfrToxcCd = cfrToxcCd;
        this.n2ndAwayFmImdgClssCd = n2ndAwayFmImdgClssCd;
        this.imdgEmerNo = imdgEmerNo;
        this.n3rdSprtFmImdgClssCd = n3rdSprtFmImdgClssCd;
        this.n2ndSprtFmImdgClssCd = n2ndSprtFmImdgClssCd;
        this.n2ndImdgTnkInstrProviCd = n2ndImdgTnkInstrProviCd;
        this.n2ndBomPortTrstNo = n2ndBomPortTrstNo;
        this.hcdgTnkRstrDesc = hcdgTnkRstrDesc;
        this.imdgMrnPolutCd = imdgMrnPolutCd;
        this.cfrXtdClssCd = cfrXtdClssCd;
        this.hcdgDpndQtyFlg = hcdgDpndQtyFlg;
        this.prpShpNm = prpShpNm;
        this.cfrFlg = cfrFlg;
        this.imdgAmdtNo = imdgAmdtNo;
    }

    /**
	 * Table Column name 으로 맴버변수에 value를 리턴한다.
	 * @return HashMap
	 */
    public HashMap<String, String> getColumnValues() {
        this.hashColumns.put("n2nd_imdg_pck_provi_cd", getN2ndImdgPckProviCd());
        this.hashColumns.put("cfr_rstr_opr_nm", getCfrRstrOprNm());
        this.hashColumns.put("away_fm_imdg_segr_grp_flg", getAwayFmImdgSegrGrpFlg());
        this.hashColumns.put("imdg_un_no_seq", getImdgUnNoSeq());
        this.hashColumns.put("psa_no", getPsaNo());
        this.hashColumns.put("imdg_subs_rsk_lbl_rmk", getImdgSubsRskLblRmk());
        this.hashColumns.put("hcdg_rmk", getHcdgRmk());
        this.hashColumns.put("n2nd_imdg_pck_instr_cd", getN2ndImdgPckInstrCd());
        this.hashColumns.put("n1st_imdg_ibc_provi_cd", getN1stImdgIbcProviCd());
        this.hashColumns.put("n3rd_away_fm_imdg_clss_cd", getN3rdAwayFmImdgClssCd());
        this.hashColumns.put("pagerows", getPagerows());
        this.hashColumns.put("n4th_imdg_pck_provi_cd", getN4thImdgPckProviCd());
        this.hashColumns.put("imdg_comp_grp_cd", getImdgCompGrpCd());
        this.hashColumns.put("segr_desc", getSegrDesc());
        this.hashColumns.put("cfr_dg_wet_cd", getCfrDgWetCd());
        this.hashColumns.put("n3rd_imdg_pck_instr_cd", getN3rdImdgPckInstrCd());
        this.hashColumns.put("sprt_fm_imdg_segr_grp_flg", getSprtFmImdgSegrGrpFlg());
        this.hashColumns.put("n1st_imdg_pck_instr_cd", getN1stImdgPckInstrCd());
        this.hashColumns.put("n4th_imdg_tnk_instr_provi_cd", getN4thImdgTnkInstrProviCd());
        this.hashColumns.put("imdg_un_tnk_instr_cd", getImdgUnTnkInstrCd());
        this.hashColumns.put("n4th_imdg_ibc_provi_cd", getN4thImdgIbcProviCd());
        this.hashColumns.put("n5th_imdg_pck_provi_cd", getN5thImdgPckProviCd());
        this.hashColumns.put("upd_usr_id", getUpdUsrId());
        this.hashColumns.put("imdg_un_no", getImdgUnNo());
        this.hashColumns.put("hcdg_flg", getHcdgFlg());
        this.hashColumns.put("n3rd_imdg_pck_provi_cd", getN3rdImdgPckProviCd());
        this.hashColumns.put("sprt_fm_imdg_clss_flg", getSprtFmImdgClssFlg());
        this.hashColumns.put("away_fm_imdg_clss_flg", getAwayFmImdgClssFlg());
        this.hashColumns.put("hcdg_intmd_bc_rstr_desc", getHcdgIntmdBcRstrDesc());
        this.hashColumns.put("n3rd_imdg_ibc_instr_cd", getN3rdImdgIbcInstrCd());
        this.hashColumns.put("segr_as_for_imdg_clss_cd", getSegrAsForImdgClssCd());
        this.hashColumns.put("n5th_imdg_tnk_instr_provi_cd", getN5thImdgTnkInstrProviCd());
        this.hashColumns.put("cre_usr_id", getCreUsrId());
        this.hashColumns.put("cfr_rstr_port_nm", getCfrRstrPortNm());
        this.hashColumns.put("emer_rspn_gid_no", getEmerRspnGidNo());
        this.hashColumns.put("n4th_bom_port_trst_no", getN4thBomPortTrstNo());
        this.hashColumns.put("emer_rspn_gid_chr_no", getEmerRspnGidChrNo());
        this.hashColumns.put("imdg_clss_cd", getImdgClssCd());
        this.hashColumns.put("imdg_pck_grp_cd", getImdgPckGrpCd());
        this.hashColumns.put("imdg_lmt_qty_meas_ut_cd", getImdgLmtQtyMeasUtCd());
        this.hashColumns.put("cre_dt", getCreDt());
        this.hashColumns.put("n1st_bom_port_trst_no", getN1stBomPortTrstNo());
        this.hashColumns.put("pkg_auth_no", getPkgAuthNo());
        this.hashColumns.put("imdg_lmt_qty", getImdgLmtQty());
        this.hashColumns.put("n3rd_bom_port_trst_no", getN3rdBomPortTrstNo());
        this.hashColumns.put("n1st_sprt_fm_imdg_clss_cd", getN1stSprtFmImdgClssCd());
        this.hashColumns.put("n5th_imdg_ibc_provi_cd", getN5thImdgIbcProviCd());
        this.hashColumns.put("segr_as_for_imdg_clss_flg", getSegrAsForImdgClssFlg());
        this.hashColumns.put("ibflag", getIbflag());
        this.hashColumns.put("imdg_expt_qty_cd", getImdgExptQtyCd());
        this.hashColumns.put("n2nd_imdg_ibc_provi_cd", getN2ndImdgIbcProviCd());
        this.hashColumns.put("lk_port_auth_no", getLkPortAuthNo());
        this.hashColumns.put("n1st_imdg_pck_provi_cd", getN1stImdgPckProviCd());
        this.hashColumns.put("flsh_pnt_temp_ctnt", getFlshPntTempCtnt());
        this.hashColumns.put("hcdg_pck_rstr_desc", getHcdgPckRstrDesc());
        this.hashColumns.put("n1st_away_fm_imdg_clss_cd", getN1stAwayFmImdgClssCd());
        this.hashColumns.put("cfr_rpt_qty", getCfrRptQty());
        this.hashColumns.put("cfr_psn_inh_zn_cd", getCfrPsnInhZnCd());
        this.hashColumns.put("imdg_ht_src_stwg_cd", getImdgHtSrcStwgCd());
        this.hashColumns.put("clr_liv_qtr_stwg_flg", getClrLivQtrStwgFlg());
        this.hashColumns.put("upd_dt", getUpdDt());
        this.hashColumns.put("n1st_imdg_ibc_instr_cd", getN1stImdgIbcInstrCd());
        this.hashColumns.put("imdg_stwg_cate_cd", getImdgStwgCateCd());
        this.hashColumns.put("n3rd_imdg_tnk_instr_provi_cd", getN3rdImdgTnkInstrProviCd());
        this.hashColumns.put("imdg_sbst_ppt_desc", getImdgSbstPptDesc());
        this.hashColumns.put("n1st_imdg_tnk_instr_provi_cd", getN1stImdgTnkInstrProviCd());
        this.hashColumns.put("n2nd_imdg_ibc_instr_cd", getN2ndImdgIbcInstrCd());
        this.hashColumns.put("imdg_fd_stuf_stwg_cd", getImdgFdStufStwgCd());
        this.hashColumns.put("n3rd_imdg_ibc_provi_cd", getN3rdImdgIbcProviCd());
        this.hashColumns.put("cfr_toxc_cd", getCfrToxcCd());
        this.hashColumns.put("n2nd_away_fm_imdg_clss_cd", getN2ndAwayFmImdgClssCd());
        this.hashColumns.put("imdg_emer_no", getImdgEmerNo());
        this.hashColumns.put("n3rd_sprt_fm_imdg_clss_cd", getN3rdSprtFmImdgClssCd());
        this.hashColumns.put("n2nd_sprt_fm_imdg_clss_cd", getN2ndSprtFmImdgClssCd());
        this.hashColumns.put("n2nd_imdg_tnk_instr_provi_cd", getN2ndImdgTnkInstrProviCd());
        this.hashColumns.put("n2nd_bom_port_trst_no", getN2ndBomPortTrstNo());
        this.hashColumns.put("hcdg_tnk_rstr_desc", getHcdgTnkRstrDesc());
        this.hashColumns.put("imdg_mrn_polut_cd", getImdgMrnPolutCd());
        this.hashColumns.put("cfr_xtd_clss_cd", getCfrXtdClssCd());
        this.hashColumns.put("hcdg_dpnd_qty_flg", getHcdgDpndQtyFlg());
        this.hashColumns.put("prp_shp_nm", getPrpShpNm());
        this.hashColumns.put("cfr_flg", getCfrFlg());
        this.hashColumns.put("imdg_amdt_no", getImdgAmdtNo());
        return this.hashColumns;
    }

    /**
	 * Table Column name 으로 맴버변수를 호출한다
	 * @return
	 */
    public HashMap<String, String> getFieldNames() {
        this.hashFields.put("n2nd_imdg_pck_provi_cd", "n2ndImdgPckProviCd");
        this.hashFields.put("cfr_rstr_opr_nm", "cfrRstrOprNm");
        this.hashFields.put("away_fm_imdg_segr_grp_flg", "awayFmImdgSegrGrpFlg");
        this.hashFields.put("imdg_un_no_seq", "imdgUnNoSeq");
        this.hashFields.put("psa_no", "psaNo");
        this.hashFields.put("imdg_subs_rsk_lbl_rmk", "imdgSubsRskLblRmk");
        this.hashFields.put("hcdg_rmk", "hcdgRmk");
        this.hashFields.put("n2nd_imdg_pck_instr_cd", "n2ndImdgPckInstrCd");
        this.hashFields.put("n1st_imdg_ibc_provi_cd", "n1stImdgIbcProviCd");
        this.hashFields.put("n3rd_away_fm_imdg_clss_cd", "n3rdAwayFmImdgClssCd");
        this.hashFields.put("pagerows", "pagerows");
        this.hashFields.put("n4th_imdg_pck_provi_cd", "n4thImdgPckProviCd");
        this.hashFields.put("imdg_comp_grp_cd", "imdgCompGrpCd");
        this.hashFields.put("segr_desc", "segrDesc");
        this.hashFields.put("cfr_dg_wet_cd", "cfrDgWetCd");
        this.hashFields.put("n3rd_imdg_pck_instr_cd", "n3rdImdgPckInstrCd");
        this.hashFields.put("sprt_fm_imdg_segr_grp_flg", "sprtFmImdgSegrGrpFlg");
        this.hashFields.put("n1st_imdg_pck_instr_cd", "n1stImdgPckInstrCd");
        this.hashFields.put("n4th_imdg_tnk_instr_provi_cd", "n4thImdgTnkInstrProviCd");
        this.hashFields.put("imdg_un_tnk_instr_cd", "imdgUnTnkInstrCd");
        this.hashFields.put("n4th_imdg_ibc_provi_cd", "n4thImdgIbcProviCd");
        this.hashFields.put("n5th_imdg_pck_provi_cd", "n5thImdgPckProviCd");
        this.hashFields.put("upd_usr_id", "updUsrId");
        this.hashFields.put("imdg_un_no", "imdgUnNo");
        this.hashFields.put("hcdg_flg", "hcdgFlg");
        this.hashFields.put("n3rd_imdg_pck_provi_cd", "n3rdImdgPckProviCd");
        this.hashFields.put("sprt_fm_imdg_clss_flg", "sprtFmImdgClssFlg");
        this.hashFields.put("away_fm_imdg_clss_flg", "awayFmImdgClssFlg");
        this.hashFields.put("hcdg_intmd_bc_rstr_desc", "hcdgIntmdBcRstrDesc");
        this.hashFields.put("n3rd_imdg_ibc_instr_cd", "n3rdImdgIbcInstrCd");
        this.hashFields.put("segr_as_for_imdg_clss_cd", "segrAsForImdgClssCd");
        this.hashFields.put("n5th_imdg_tnk_instr_provi_cd", "n5thImdgTnkInstrProviCd");
        this.hashFields.put("cre_usr_id", "creUsrId");
        this.hashFields.put("cfr_rstr_port_nm", "cfrRstrPortNm");
        this.hashFields.put("emer_rspn_gid_no", "emerRspnGidNo");
        this.hashFields.put("n4th_bom_port_trst_no", "n4thBomPortTrstNo");
        this.hashFields.put("emer_rspn_gid_chr_no", "emerRspnGidChrNo");
        this.hashFields.put("imdg_clss_cd", "imdgClssCd");
        this.hashFields.put("imdg_pck_grp_cd", "imdgPckGrpCd");
        this.hashFields.put("imdg_lmt_qty_meas_ut_cd", "imdgLmtQtyMeasUtCd");
        this.hashFields.put("cre_dt", "creDt");
        this.hashFields.put("n1st_bom_port_trst_no", "n1stBomPortTrstNo");
        this.hashFields.put("pkg_auth_no", "pkgAuthNo");
        this.hashFields.put("imdg_lmt_qty", "imdgLmtQty");
        this.hashFields.put("n3rd_bom_port_trst_no", "n3rdBomPortTrstNo");
        this.hashFields.put("n1st_sprt_fm_imdg_clss_cd", "n1stSprtFmImdgClssCd");
        this.hashFields.put("n5th_imdg_ibc_provi_cd", "n5thImdgIbcProviCd");
        this.hashFields.put("segr_as_for_imdg_clss_flg", "segrAsForImdgClssFlg");
        this.hashFields.put("ibflag", "ibflag");
        this.hashFields.put("imdg_expt_qty_cd", "imdgExptQtyCd");
        this.hashFields.put("n2nd_imdg_ibc_provi_cd", "n2ndImdgIbcProviCd");
        this.hashFields.put("lk_port_auth_no", "lkPortAuthNo");
        this.hashFields.put("n1st_imdg_pck_provi_cd", "n1stImdgPckProviCd");
        this.hashFields.put("flsh_pnt_temp_ctnt", "flshPntTempCtnt");
        this.hashFields.put("hcdg_pck_rstr_desc", "hcdgPckRstrDesc");
        this.hashFields.put("n1st_away_fm_imdg_clss_cd", "n1stAwayFmImdgClssCd");
        this.hashFields.put("cfr_rpt_qty", "cfrRptQty");
        this.hashFields.put("cfr_psn_inh_zn_cd", "cfrPsnInhZnCd");
        this.hashFields.put("imdg_ht_src_stwg_cd", "imdgHtSrcStwgCd");
        this.hashFields.put("clr_liv_qtr_stwg_flg", "clrLivQtrStwgFlg");
        this.hashFields.put("upd_dt", "updDt");
        this.hashFields.put("n1st_imdg_ibc_instr_cd", "n1stImdgIbcInstrCd");
        this.hashFields.put("imdg_stwg_cate_cd", "imdgStwgCateCd");
        this.hashFields.put("n3rd_imdg_tnk_instr_provi_cd", "n3rdImdgTnkInstrProviCd");
        this.hashFields.put("imdg_sbst_ppt_desc", "imdgSbstPptDesc");
        this.hashFields.put("n1st_imdg_tnk_instr_provi_cd", "n1stImdgTnkInstrProviCd");
        this.hashFields.put("n2nd_imdg_ibc_instr_cd", "n2ndImdgIbcInstrCd");
        this.hashFields.put("imdg_fd_stuf_stwg_cd", "imdgFdStufStwgCd");
        this.hashFields.put("n3rd_imdg_ibc_provi_cd", "n3rdImdgIbcProviCd");
        this.hashFields.put("cfr_toxc_cd", "cfrToxcCd");
        this.hashFields.put("n2nd_away_fm_imdg_clss_cd", "n2ndAwayFmImdgClssCd");
        this.hashFields.put("imdg_emer_no", "imdgEmerNo");
        this.hashFields.put("n3rd_sprt_fm_imdg_clss_cd", "n3rdSprtFmImdgClssCd");
        this.hashFields.put("n2nd_sprt_fm_imdg_clss_cd", "n2ndSprtFmImdgClssCd");
        this.hashFields.put("n2nd_imdg_tnk_instr_provi_cd", "n2ndImdgTnkInstrProviCd");
        this.hashFields.put("n2nd_bom_port_trst_no", "n2ndBomPortTrstNo");
        this.hashFields.put("hcdg_tnk_rstr_desc", "hcdgTnkRstrDesc");
        this.hashFields.put("imdg_mrn_polut_cd", "imdgMrnPolutCd");
        this.hashFields.put("cfr_xtd_clss_cd", "cfrXtdClssCd");
        this.hashFields.put("hcdg_dpnd_qty_flg", "hcdgDpndQtyFlg");
        this.hashFields.put("prp_shp_nm", "prpShpNm");
        this.hashFields.put("cfr_flg", "cfrFlg");
        this.hashFields.put("imdg_amdt_no", "imdgAmdtNo");
        return this.hashFields;
    }

    /**
	 * Column Info
	 * @return n2ndImdgPckProviCd
	 */
    public String getN2ndImdgPckProviCd() {
        return this.n2ndImdgPckProviCd;
    }

    /**
	 * Column Info
	 * @return cfrRstrOprNm
	 */
    public String getCfrRstrOprNm() {
        return this.cfrRstrOprNm;
    }

    /**
	 * Column Info
	 * @return awayFmImdgSegrGrpFlg
	 */
    public String getAwayFmImdgSegrGrpFlg() {
        return this.awayFmImdgSegrGrpFlg;
    }

    /**
	 * Column Info
	 * @return imdgUnNoSeq
	 */
    public String getImdgUnNoSeq() {
        return this.imdgUnNoSeq;
    }

    /**
	 * Column Info
	 * @return psaNo
	 */
    public String getPsaNo() {
        return this.psaNo;
    }

    /**
	 * Column Info
	 * @return imdgSubsRskLblRmk
	 */
    public String getImdgSubsRskLblRmk() {
        return this.imdgSubsRskLblRmk;
    }

    /**
	 * Column Info
	 * @return hcdgRmk
	 */
    public String getHcdgRmk() {
        return this.hcdgRmk;
    }

    /**
	 * Column Info
	 * @return n2ndImdgPckInstrCd
	 */
    public String getN2ndImdgPckInstrCd() {
        return this.n2ndImdgPckInstrCd;
    }

    /**
	 * Column Info
	 * @return n1stImdgIbcProviCd
	 */
    public String getN1stImdgIbcProviCd() {
        return this.n1stImdgIbcProviCd;
    }

    /**
	 * Column Info
	 * @return n3rdAwayFmImdgClssCd
	 */
    public String getN3rdAwayFmImdgClssCd() {
        return this.n3rdAwayFmImdgClssCd;
    }

    /**
	 * Page Number
	 * @return pagerows
	 */
    public String getPagerows() {
        return this.pagerows;
    }

    /**
	 * Column Info
	 * @return n4thImdgPckProviCd
	 */
    public String getN4thImdgPckProviCd() {
        return this.n4thImdgPckProviCd;
    }

    /**
	 * Column Info
	 * @return imdgCompGrpCd
	 */
    public String getImdgCompGrpCd() {
        return this.imdgCompGrpCd;
    }

    /**
	 * Column Info
	 * @return segrDesc
	 */
    public String getSegrDesc() {
        return this.segrDesc;
    }

    /**
	 * Column Info
	 * @return cfrDgWetCd
	 */
    public String getCfrDgWetCd() {
        return this.cfrDgWetCd;
    }

    /**
	 * Column Info
	 * @return n3rdImdgPckInstrCd
	 */
    public String getN3rdImdgPckInstrCd() {
        return this.n3rdImdgPckInstrCd;
    }

    /**
	 * Column Info
	 * @return sprtFmImdgSegrGrpFlg
	 */
    public String getSprtFmImdgSegrGrpFlg() {
        return this.sprtFmImdgSegrGrpFlg;
    }

    /**
	 * Column Info
	 * @return n1stImdgPckInstrCd
	 */
    public String getN1stImdgPckInstrCd() {
        return this.n1stImdgPckInstrCd;
    }

    /**
	 * Column Info
	 * @return n4thImdgTnkInstrProviCd
	 */
    public String getN4thImdgTnkInstrProviCd() {
        return this.n4thImdgTnkInstrProviCd;
    }

    /**
	 * Column Info
	 * @return imdgUnTnkInstrCd
	 */
    public String getImdgUnTnkInstrCd() {
        return this.imdgUnTnkInstrCd;
    }

    /**
	 * Column Info
	 * @return n4thImdgIbcProviCd
	 */
    public String getN4thImdgIbcProviCd() {
        return this.n4thImdgIbcProviCd;
    }

    /**
	 * Column Info
	 * @return n5thImdgPckProviCd
	 */
    public String getN5thImdgPckProviCd() {
        return this.n5thImdgPckProviCd;
    }

    /**
	 * Column Info
	 * @return updUsrId
	 */
    public String getUpdUsrId() {
        return this.updUsrId;
    }

    /**
	 * Column Info
	 * @return imdgUnNo
	 */
    public String getImdgUnNo() {
        return this.imdgUnNo;
    }

    /**
	 * Column Info
	 * @return hcdgFlg
	 */
    public String getHcdgFlg() {
        return this.hcdgFlg;
    }

    /**
	 * Column Info
	 * @return n3rdImdgPckProviCd
	 */
    public String getN3rdImdgPckProviCd() {
        return this.n3rdImdgPckProviCd;
    }

    /**
	 * Column Info
	 * @return sprtFmImdgClssFlg
	 */
    public String getSprtFmImdgClssFlg() {
        return this.sprtFmImdgClssFlg;
    }

    /**
	 * Column Info
	 * @return awayFmImdgClssFlg
	 */
    public String getAwayFmImdgClssFlg() {
        return this.awayFmImdgClssFlg;
    }

    /**
	 * Column Info
	 * @return hcdgIntmdBcRstrDesc
	 */
    public String getHcdgIntmdBcRstrDesc() {
        return this.hcdgIntmdBcRstrDesc;
    }

    /**
	 * Column Info
	 * @return n3rdImdgIbcInstrCd
	 */
    public String getN3rdImdgIbcInstrCd() {
        return this.n3rdImdgIbcInstrCd;
    }

    /**
	 * Column Info
	 * @return segrAsForImdgClssCd
	 */
    public String getSegrAsForImdgClssCd() {
        return this.segrAsForImdgClssCd;
    }

    /**
	 * Column Info
	 * @return n5thImdgTnkInstrProviCd
	 */
    public String getN5thImdgTnkInstrProviCd() {
        return this.n5thImdgTnkInstrProviCd;
    }

    /**
	 * Column Info
	 * @return creUsrId
	 */
    public String getCreUsrId() {
        return this.creUsrId;
    }

    /**
	 * Column Info
	 * @return cfrRstrPortNm
	 */
    public String getCfrRstrPortNm() {
        return this.cfrRstrPortNm;
    }

    /**
	 * Column Info
	 * @return emerRspnGidNo
	 */
    public String getEmerRspnGidNo() {
        return this.emerRspnGidNo;
    }

    /**
	 * Column Info
	 * @return n4thBomPortTrstNo
	 */
    public String getN4thBomPortTrstNo() {
        return this.n4thBomPortTrstNo;
    }

    /**
	 * Column Info
	 * @return emerRspnGidChrNo
	 */
    public String getEmerRspnGidChrNo() {
        return this.emerRspnGidChrNo;
    }

    /**
	 * Column Info
	 * @return imdgClssCd
	 */
    public String getImdgClssCd() {
        return this.imdgClssCd;
    }

    /**
	 * Column Info
	 * @return imdgPckGrpCd
	 */
    public String getImdgPckGrpCd() {
        return this.imdgPckGrpCd;
    }

    /**
	 * Column Info
	 * @return imdgLmtQtyMeasUtCd
	 */
    public String getImdgLmtQtyMeasUtCd() {
        return this.imdgLmtQtyMeasUtCd;
    }

    /**
	 * Column Info
	 * @return creDt
	 */
    public String getCreDt() {
        return this.creDt;
    }

    /**
	 * Column Info
	 * @return n1stBomPortTrstNo
	 */
    public String getN1stBomPortTrstNo() {
        return this.n1stBomPortTrstNo;
    }

    /**
	 * Column Info
	 * @return pkgAuthNo
	 */
    public String getPkgAuthNo() {
        return this.pkgAuthNo;
    }

    /**
	 * Column Info
	 * @return imdgLmtQty
	 */
    public String getImdgLmtQty() {
        return this.imdgLmtQty;
    }

    /**
	 * Column Info
	 * @return n3rdBomPortTrstNo
	 */
    public String getN3rdBomPortTrstNo() {
        return this.n3rdBomPortTrstNo;
    }

    /**
	 * Column Info
	 * @return n1stSprtFmImdgClssCd
	 */
    public String getN1stSprtFmImdgClssCd() {
        return this.n1stSprtFmImdgClssCd;
    }

    /**
	 * Column Info
	 * @return n5thImdgIbcProviCd
	 */
    public String getN5thImdgIbcProviCd() {
        return this.n5thImdgIbcProviCd;
    }

    /**
	 * Column Info
	 * @return segrAsForImdgClssFlg
	 */
    public String getSegrAsForImdgClssFlg() {
        return this.segrAsForImdgClssFlg;
    }

    /**
	 * Status
	 * @return ibflag
	 */
    public String getIbflag() {
        return this.ibflag;
    }

    /**
	 * Column Info
	 * @return imdgExptQtyCd
	 */
    public String getImdgExptQtyCd() {
        return this.imdgExptQtyCd;
    }

    /**
	 * Column Info
	 * @return n2ndImdgIbcProviCd
	 */
    public String getN2ndImdgIbcProviCd() {
        return this.n2ndImdgIbcProviCd;
    }

    /**
	 * Column Info
	 * @return lkPortAuthNo
	 */
    public String getLkPortAuthNo() {
        return this.lkPortAuthNo;
    }

    /**
	 * Column Info
	 * @return n1stImdgPckProviCd
	 */
    public String getN1stImdgPckProviCd() {
        return this.n1stImdgPckProviCd;
    }

    /**
	 * Column Info
	 * @return flshPntTempCtnt
	 */
    public String getFlshPntTempCtnt() {
        return this.flshPntTempCtnt;
    }

    /**
	 * Column Info
	 * @return hcdgPckRstrDesc
	 */
    public String getHcdgPckRstrDesc() {
        return this.hcdgPckRstrDesc;
    }

    /**
	 * Column Info
	 * @return n1stAwayFmImdgClssCd
	 */
    public String getN1stAwayFmImdgClssCd() {
        return this.n1stAwayFmImdgClssCd;
    }

    /**
	 * Column Info
	 * @return cfrRptQty
	 */
    public String getCfrRptQty() {
        return this.cfrRptQty;
    }

    /**
	 * Column Info
	 * @return cfrPsnInhZnCd
	 */
    public String getCfrPsnInhZnCd() {
        return this.cfrPsnInhZnCd;
    }

    /**
	 * Column Info
	 * @return imdgHtSrcStwgCd
	 */
    public String getImdgHtSrcStwgCd() {
        return this.imdgHtSrcStwgCd;
    }

    /**
	 * Column Info
	 * @return clrLivQtrStwgFlg
	 */
    public String getClrLivQtrStwgFlg() {
        return this.clrLivQtrStwgFlg;
    }

    /**
	 * Column Info
	 * @return updDt
	 */
    public String getUpdDt() {
        return this.updDt;
    }

    /**
	 * Column Info
	 * @return n1stImdgIbcInstrCd
	 */
    public String getN1stImdgIbcInstrCd() {
        return this.n1stImdgIbcInstrCd;
    }

    /**
	 * Column Info
	 * @return imdgStwgCateCd
	 */
    public String getImdgStwgCateCd() {
        return this.imdgStwgCateCd;
    }

    /**
	 * Column Info
	 * @return n3rdImdgTnkInstrProviCd
	 */
    public String getN3rdImdgTnkInstrProviCd() {
        return this.n3rdImdgTnkInstrProviCd;
    }

    /**
	 * Column Info
	 * @return imdgSbstPptDesc
	 */
    public String getImdgSbstPptDesc() {
        return this.imdgSbstPptDesc;
    }

    /**
	 * Column Info
	 * @return n1stImdgTnkInstrProviCd
	 */
    public String getN1stImdgTnkInstrProviCd() {
        return this.n1stImdgTnkInstrProviCd;
    }

    /**
	 * Column Info
	 * @return n2ndImdgIbcInstrCd
	 */
    public String getN2ndImdgIbcInstrCd() {
        return this.n2ndImdgIbcInstrCd;
    }

    /**
	 * Column Info
	 * @return imdgFdStufStwgCd
	 */
    public String getImdgFdStufStwgCd() {
        return this.imdgFdStufStwgCd;
    }

    /**
	 * Column Info
	 * @return n3rdImdgIbcProviCd
	 */
    public String getN3rdImdgIbcProviCd() {
        return this.n3rdImdgIbcProviCd;
    }

    /**
	 * Column Info
	 * @return cfrToxcCd
	 */
    public String getCfrToxcCd() {
        return this.cfrToxcCd;
    }

    /**
	 * Column Info
	 * @return n2ndAwayFmImdgClssCd
	 */
    public String getN2ndAwayFmImdgClssCd() {
        return this.n2ndAwayFmImdgClssCd;
    }

    /**
	 * Column Info
	 * @return imdgEmerNo
	 */
    public String getImdgEmerNo() {
        return this.imdgEmerNo;
    }

    /**
	 * Column Info
	 * @return n3rdSprtFmImdgClssCd
	 */
    public String getN3rdSprtFmImdgClssCd() {
        return this.n3rdSprtFmImdgClssCd;
    }

    /**
	 * Column Info
	 * @return n2ndSprtFmImdgClssCd
	 */
    public String getN2ndSprtFmImdgClssCd() {
        return this.n2ndSprtFmImdgClssCd;
    }

    /**
	 * Column Info
	 * @return n2ndImdgTnkInstrProviCd
	 */
    public String getN2ndImdgTnkInstrProviCd() {
        return this.n2ndImdgTnkInstrProviCd;
    }

    /**
	 * Column Info
	 * @return n2ndBomPortTrstNo
	 */
    public String getN2ndBomPortTrstNo() {
        return this.n2ndBomPortTrstNo;
    }

    /**
	 * Column Info
	 * @return hcdgTnkRstrDesc
	 */
    public String getHcdgTnkRstrDesc() {
        return this.hcdgTnkRstrDesc;
    }

    /**
	 * Column Info
	 * @return imdgMrnPolutCd
	 */
    public String getImdgMrnPolutCd() {
        return this.imdgMrnPolutCd;
    }

    /**
	 * Column Info
	 * @return cfrXtdClssCd
	 */
    public String getCfrXtdClssCd() {
        return this.cfrXtdClssCd;
    }

    /**
	 * Column Info
	 * @return hcdgDpndQtyFlg
	 */
    public String getHcdgDpndQtyFlg() {
        return this.hcdgDpndQtyFlg;
    }

    /**
	 * Column Info
	 * @return prpShpNm
	 */
    public String getPrpShpNm() {
        return this.prpShpNm;
    }

    /**
	 * Column Info
	 * @return cfrFlg
	 */
    public String getCfrFlg() {
        return this.cfrFlg;
    }

    /**
	 * Column Info
	 * @param n2ndImdgPckProviCd
	 */
    public void setN2ndImdgPckProviCd(String n2ndImdgPckProviCd) {
        this.n2ndImdgPckProviCd = n2ndImdgPckProviCd;
    }

    /**
	 * Column Info
	 * @param cfrRstrOprNm
	 */
    public void setCfrRstrOprNm(String cfrRstrOprNm) {
        this.cfrRstrOprNm = cfrRstrOprNm;
    }

    /**
	 * Column Info
	 * @param awayFmImdgSegrGrpFlg
	 */
    public void setAwayFmImdgSegrGrpFlg(String awayFmImdgSegrGrpFlg) {
        this.awayFmImdgSegrGrpFlg = awayFmImdgSegrGrpFlg;
    }

    /**
	 * Column Info
	 * @param imdgUnNoSeq
	 */
    public void setImdgUnNoSeq(String imdgUnNoSeq) {
        this.imdgUnNoSeq = imdgUnNoSeq;
    }

    /**
	 * Column Info
	 * @param psaNo
	 */
    public void setPsaNo(String psaNo) {
        this.psaNo = psaNo;
    }

    /**
	 * Column Info
	 * @param imdgSubsRskLblRmk
	 */
    public void setImdgSubsRskLblRmk(String imdgSubsRskLblRmk) {
        this.imdgSubsRskLblRmk = imdgSubsRskLblRmk;
    }

    /**
	 * Column Info
	 * @param hcdgRmk
	 */
    public void setHcdgRmk(String hcdgRmk) {
        this.hcdgRmk = hcdgRmk;
    }

    /**
	 * Column Info
	 * @param n2ndImdgPckInstrCd
	 */
    public void setN2ndImdgPckInstrCd(String n2ndImdgPckInstrCd) {
        this.n2ndImdgPckInstrCd = n2ndImdgPckInstrCd;
    }

    /**
	 * Column Info
	 * @param n1stImdgIbcProviCd
	 */
    public void setN1stImdgIbcProviCd(String n1stImdgIbcProviCd) {
        this.n1stImdgIbcProviCd = n1stImdgIbcProviCd;
    }

    /**
	 * Column Info
	 * @param n3rdAwayFmImdgClssCd
	 */
    public void setN3rdAwayFmImdgClssCd(String n3rdAwayFmImdgClssCd) {
        this.n3rdAwayFmImdgClssCd = n3rdAwayFmImdgClssCd;
    }

    /**
	 * Page Number
	 * @param pagerows
	 */
    public void setPagerows(String pagerows) {
        this.pagerows = pagerows;
    }

    /**
	 * Column Info
	 * @param n4thImdgPckProviCd
	 */
    public void setN4thImdgPckProviCd(String n4thImdgPckProviCd) {
        this.n4thImdgPckProviCd = n4thImdgPckProviCd;
    }

    /**
	 * Column Info
	 * @param imdgCompGrpCd
	 */
    public void setImdgCompGrpCd(String imdgCompGrpCd) {
        this.imdgCompGrpCd = imdgCompGrpCd;
    }

    /**
	 * Column Info
	 * @param segrDesc
	 */
    public void setSegrDesc(String segrDesc) {
        this.segrDesc = segrDesc;
    }

    /**
	 * Column Info
	 * @param cfrDgWetCd
	 */
    public void setCfrDgWetCd(String cfrDgWetCd) {
        this.cfrDgWetCd = cfrDgWetCd;
    }

    /**
	 * Column Info
	 * @param n3rdImdgPckInstrCd
	 */
    public void setN3rdImdgPckInstrCd(String n3rdImdgPckInstrCd) {
        this.n3rdImdgPckInstrCd = n3rdImdgPckInstrCd;
    }

    /**
	 * Column Info
	 * @param sprtFmImdgSegrGrpFlg
	 */
    public void setSprtFmImdgSegrGrpFlg(String sprtFmImdgSegrGrpFlg) {
        this.sprtFmImdgSegrGrpFlg = sprtFmImdgSegrGrpFlg;
    }

    /**
	 * Column Info
	 * @param n1stImdgPckInstrCd
	 */
    public void setN1stImdgPckInstrCd(String n1stImdgPckInstrCd) {
        this.n1stImdgPckInstrCd = n1stImdgPckInstrCd;
    }

    /**
	 * Column Info
	 * @param n4thImdgTnkInstrProviCd
	 */
    public void setN4thImdgTnkInstrProviCd(String n4thImdgTnkInstrProviCd) {
        this.n4thImdgTnkInstrProviCd = n4thImdgTnkInstrProviCd;
    }

    /**
	 * Column Info
	 * @param imdgUnTnkInstrCd
	 */
    public void setImdgUnTnkInstrCd(String imdgUnTnkInstrCd) {
        this.imdgUnTnkInstrCd = imdgUnTnkInstrCd;
    }

    /**
	 * Column Info
	 * @param n4thImdgIbcProviCd
	 */
    public void setN4thImdgIbcProviCd(String n4thImdgIbcProviCd) {
        this.n4thImdgIbcProviCd = n4thImdgIbcProviCd;
    }

    /**
	 * Column Info
	 * @param n5thImdgPckProviCd
	 */
    public void setN5thImdgPckProviCd(String n5thImdgPckProviCd) {
        this.n5thImdgPckProviCd = n5thImdgPckProviCd;
    }

    /**
	 * Column Info
	 * @param updUsrId
	 */
    public void setUpdUsrId(String updUsrId) {
        this.updUsrId = updUsrId;
    }

    /**
	 * Column Info
	 * @param imdgUnNo
	 */
    public void setImdgUnNo(String imdgUnNo) {
        this.imdgUnNo = imdgUnNo;
    }

    /**
	 * Column Info
	 * @param hcdgFlg
	 */
    public void setHcdgFlg(String hcdgFlg) {
        this.hcdgFlg = hcdgFlg;
    }

    /**
	 * Column Info
	 * @param n3rdImdgPckProviCd
	 */
    public void setN3rdImdgPckProviCd(String n3rdImdgPckProviCd) {
        this.n3rdImdgPckProviCd = n3rdImdgPckProviCd;
    }

    /**
	 * Column Info
	 * @param sprtFmImdgClssFlg
	 */
    public void setSprtFmImdgClssFlg(String sprtFmImdgClssFlg) {
        this.sprtFmImdgClssFlg = sprtFmImdgClssFlg;
    }

    /**
	 * Column Info
	 * @param awayFmImdgClssFlg
	 */
    public void setAwayFmImdgClssFlg(String awayFmImdgClssFlg) {
        this.awayFmImdgClssFlg = awayFmImdgClssFlg;
    }

    /**
	 * Column Info
	 * @param hcdgIntmdBcRstrDesc
	 */
    public void setHcdgIntmdBcRstrDesc(String hcdgIntmdBcRstrDesc) {
        this.hcdgIntmdBcRstrDesc = hcdgIntmdBcRstrDesc;
    }

    /**
	 * Column Info
	 * @param n3rdImdgIbcInstrCd
	 */
    public void setN3rdImdgIbcInstrCd(String n3rdImdgIbcInstrCd) {
        this.n3rdImdgIbcInstrCd = n3rdImdgIbcInstrCd;
    }

    /**
	 * Column Info
	 * @param segrAsForImdgClssCd
	 */
    public void setSegrAsForImdgClssCd(String segrAsForImdgClssCd) {
        this.segrAsForImdgClssCd = segrAsForImdgClssCd;
    }

    /**
	 * Column Info
	 * @param n5thImdgTnkInstrProviCd
	 */
    public void setN5thImdgTnkInstrProviCd(String n5thImdgTnkInstrProviCd) {
        this.n5thImdgTnkInstrProviCd = n5thImdgTnkInstrProviCd;
    }

    /**
	 * Column Info
	 * @param creUsrId
	 */
    public void setCreUsrId(String creUsrId) {
        this.creUsrId = creUsrId;
    }

    /**
	 * Column Info
	 * @param cfrRstrPortNm
	 */
    public void setCfrRstrPortNm(String cfrRstrPortNm) {
        this.cfrRstrPortNm = cfrRstrPortNm;
    }

    /**
	 * Column Info
	 * @param emerRspnGidNo
	 */
    public void setEmerRspnGidNo(String emerRspnGidNo) {
        this.emerRspnGidNo = emerRspnGidNo;
    }

    /**
	 * Column Info
	 * @param n4thBomPortTrstNo
	 */
    public void setN4thBomPortTrstNo(String n4thBomPortTrstNo) {
        this.n4thBomPortTrstNo = n4thBomPortTrstNo;
    }

    /**
	 * Column Info
	 * @param emerRspnGidChrNo
	 */
    public void setEmerRspnGidChrNo(String emerRspnGidChrNo) {
        this.emerRspnGidChrNo = emerRspnGidChrNo;
    }

    /**
	 * Column Info
	 * @param imdgClssCd
	 */
    public void setImdgClssCd(String imdgClssCd) {
        this.imdgClssCd = imdgClssCd;
    }

    /**
	 * Column Info
	 * @param imdgPckGrpCd
	 */
    public void setImdgPckGrpCd(String imdgPckGrpCd) {
        this.imdgPckGrpCd = imdgPckGrpCd;
    }

    /**
	 * Column Info
	 * @param imdgLmtQtyMeasUtCd
	 */
    public void setImdgLmtQtyMeasUtCd(String imdgLmtQtyMeasUtCd) {
        this.imdgLmtQtyMeasUtCd = imdgLmtQtyMeasUtCd;
    }

    /**
	 * Column Info
	 * @param creDt
	 */
    public void setCreDt(String creDt) {
        this.creDt = creDt;
    }

    /**
	 * Column Info
	 * @param n1stBomPortTrstNo
	 */
    public void setN1stBomPortTrstNo(String n1stBomPortTrstNo) {
        this.n1stBomPortTrstNo = n1stBomPortTrstNo;
    }

    /**
	 * Column Info
	 * @param pkgAuthNo
	 */
    public void setPkgAuthNo(String pkgAuthNo) {
        this.pkgAuthNo = pkgAuthNo;
    }

    /**
	 * Column Info
	 * @param imdgLmtQty
	 */
    public void setImdgLmtQty(String imdgLmtQty) {
        this.imdgLmtQty = imdgLmtQty;
    }

    /**
	 * Column Info
	 * @param n3rdBomPortTrstNo
	 */
    public void setN3rdBomPortTrstNo(String n3rdBomPortTrstNo) {
        this.n3rdBomPortTrstNo = n3rdBomPortTrstNo;
    }

    /**
	 * Column Info
	 * @param n1stSprtFmImdgClssCd
	 */
    public void setN1stSprtFmImdgClssCd(String n1stSprtFmImdgClssCd) {
        this.n1stSprtFmImdgClssCd = n1stSprtFmImdgClssCd;
    }

    /**
	 * Column Info
	 * @param n5thImdgIbcProviCd
	 */
    public void setN5thImdgIbcProviCd(String n5thImdgIbcProviCd) {
        this.n5thImdgIbcProviCd = n5thImdgIbcProviCd;
    }

    /**
	 * Column Info
	 * @param segrAsForImdgClssFlg
	 */
    public void setSegrAsForImdgClssFlg(String segrAsForImdgClssFlg) {
        this.segrAsForImdgClssFlg = segrAsForImdgClssFlg;
    }

    /**
	 * Status
	 * @param ibflag
	 */
    public void setIbflag(String ibflag) {
        this.ibflag = ibflag;
    }

    /**
	 * Column Info
	 * @param imdgExptQtyCd
	 */
    public void setImdgExptQtyCd(String imdgExptQtyCd) {
        this.imdgExptQtyCd = imdgExptQtyCd;
    }

    /**
	 * Column Info
	 * @param n2ndImdgIbcProviCd
	 */
    public void setN2ndImdgIbcProviCd(String n2ndImdgIbcProviCd) {
        this.n2ndImdgIbcProviCd = n2ndImdgIbcProviCd;
    }

    /**
	 * Column Info
	 * @param lkPortAuthNo
	 */
    public void setLkPortAuthNo(String lkPortAuthNo) {
        this.lkPortAuthNo = lkPortAuthNo;
    }

    /**
	 * Column Info
	 * @param n1stImdgPckProviCd
	 */
    public void setN1stImdgPckProviCd(String n1stImdgPckProviCd) {
        this.n1stImdgPckProviCd = n1stImdgPckProviCd;
    }

    /**
	 * Column Info
	 * @param flshPntTempCtnt
	 */
    public void setFlshPntTempCtnt(String flshPntTempCtnt) {
        this.flshPntTempCtnt = flshPntTempCtnt;
    }

    /**
	 * Column Info
	 * @param hcdgPckRstrDesc
	 */
    public void setHcdgPckRstrDesc(String hcdgPckRstrDesc) {
        this.hcdgPckRstrDesc = hcdgPckRstrDesc;
    }

    /**
	 * Column Info
	 * @param n1stAwayFmImdgClssCd
	 */
    public void setN1stAwayFmImdgClssCd(String n1stAwayFmImdgClssCd) {
        this.n1stAwayFmImdgClssCd = n1stAwayFmImdgClssCd;
    }

    /**
	 * Column Info
	 * @param cfrRptQty
	 */
    public void setCfrRptQty(String cfrRptQty) {
        this.cfrRptQty = cfrRptQty;
    }

    /**
	 * Column Info
	 * @param cfrPsnInhZnCd
	 */
    public void setCfrPsnInhZnCd(String cfrPsnInhZnCd) {
        this.cfrPsnInhZnCd = cfrPsnInhZnCd;
    }

    /**
	 * Column Info
	 * @param imdgHtSrcStwgCd
	 */
    public void setImdgHtSrcStwgCd(String imdgHtSrcStwgCd) {
        this.imdgHtSrcStwgCd = imdgHtSrcStwgCd;
    }

    /**
	 * Column Info
	 * @param clrLivQtrStwgFlg
	 */
    public void setClrLivQtrStwgFlg(String clrLivQtrStwgFlg) {
        this.clrLivQtrStwgFlg = clrLivQtrStwgFlg;
    }

    /**
	 * Column Info
	 * @param updDt
	 */
    public void setUpdDt(String updDt) {
        this.updDt = updDt;
    }

    /**
	 * Column Info
	 * @param n1stImdgIbcInstrCd
	 */
    public void setN1stImdgIbcInstrCd(String n1stImdgIbcInstrCd) {
        this.n1stImdgIbcInstrCd = n1stImdgIbcInstrCd;
    }

    /**
	 * Column Info
	 * @param imdgStwgCateCd
	 */
    public void setImdgStwgCateCd(String imdgStwgCateCd) {
        this.imdgStwgCateCd = imdgStwgCateCd;
    }

    /**
	 * Column Info
	 * @param n3rdImdgTnkInstrProviCd
	 */
    public void setN3rdImdgTnkInstrProviCd(String n3rdImdgTnkInstrProviCd) {
        this.n3rdImdgTnkInstrProviCd = n3rdImdgTnkInstrProviCd;
    }

    /**
	 * Column Info
	 * @param imdgSbstPptDesc
	 */
    public void setImdgSbstPptDesc(String imdgSbstPptDesc) {
        this.imdgSbstPptDesc = imdgSbstPptDesc;
    }

    /**
	 * Column Info
	 * @param n1stImdgTnkInstrProviCd
	 */
    public void setN1stImdgTnkInstrProviCd(String n1stImdgTnkInstrProviCd) {
        this.n1stImdgTnkInstrProviCd = n1stImdgTnkInstrProviCd;
    }

    /**
	 * Column Info
	 * @param n2ndImdgIbcInstrCd
	 */
    public void setN2ndImdgIbcInstrCd(String n2ndImdgIbcInstrCd) {
        this.n2ndImdgIbcInstrCd = n2ndImdgIbcInstrCd;
    }

    /**
	 * Column Info
	 * @param imdgFdStufStwgCd
	 */
    public void setImdgFdStufStwgCd(String imdgFdStufStwgCd) {
        this.imdgFdStufStwgCd = imdgFdStufStwgCd;
    }

    /**
	 * Column Info
	 * @param n3rdImdgIbcProviCd
	 */
    public void setN3rdImdgIbcProviCd(String n3rdImdgIbcProviCd) {
        this.n3rdImdgIbcProviCd = n3rdImdgIbcProviCd;
    }

    /**
	 * Column Info
	 * @param cfrToxcCd
	 */
    public void setCfrToxcCd(String cfrToxcCd) {
        this.cfrToxcCd = cfrToxcCd;
    }

    /**
	 * Column Info
	 * @param n2ndAwayFmImdgClssCd
	 */
    public void setN2ndAwayFmImdgClssCd(String n2ndAwayFmImdgClssCd) {
        this.n2ndAwayFmImdgClssCd = n2ndAwayFmImdgClssCd;
    }

    /**
	 * Column Info
	 * @param imdgEmerNo
	 */
    public void setImdgEmerNo(String imdgEmerNo) {
        this.imdgEmerNo = imdgEmerNo;
    }

    /**
	 * Column Info
	 * @param n3rdSprtFmImdgClssCd
	 */
    public void setN3rdSprtFmImdgClssCd(String n3rdSprtFmImdgClssCd) {
        this.n3rdSprtFmImdgClssCd = n3rdSprtFmImdgClssCd;
    }

    /**
	 * Column Info
	 * @param n2ndSprtFmImdgClssCd
	 */
    public void setN2ndSprtFmImdgClssCd(String n2ndSprtFmImdgClssCd) {
        this.n2ndSprtFmImdgClssCd = n2ndSprtFmImdgClssCd;
    }

    /**
	 * Column Info
	 * @param n2ndImdgTnkInstrProviCd
	 */
    public void setN2ndImdgTnkInstrProviCd(String n2ndImdgTnkInstrProviCd) {
        this.n2ndImdgTnkInstrProviCd = n2ndImdgTnkInstrProviCd;
    }

    /**
	 * Column Info
	 * @param n2ndBomPortTrstNo
	 */
    public void setN2ndBomPortTrstNo(String n2ndBomPortTrstNo) {
        this.n2ndBomPortTrstNo = n2ndBomPortTrstNo;
    }

    /**
	 * Column Info
	 * @param hcdgTnkRstrDesc
	 */
    public void setHcdgTnkRstrDesc(String hcdgTnkRstrDesc) {
        this.hcdgTnkRstrDesc = hcdgTnkRstrDesc;
    }

    /**
	 * Column Info
	 * @param imdgMrnPolutCd
	 */
    public void setImdgMrnPolutCd(String imdgMrnPolutCd) {
        this.imdgMrnPolutCd = imdgMrnPolutCd;
    }

    /**
	 * Column Info
	 * @param cfrXtdClssCd
	 */
    public void setCfrXtdClssCd(String cfrXtdClssCd) {
        this.cfrXtdClssCd = cfrXtdClssCd;
    }

    /**
	 * Column Info
	 * @param hcdgDpndQtyFlg
	 */
    public void setHcdgDpndQtyFlg(String hcdgDpndQtyFlg) {
        this.hcdgDpndQtyFlg = hcdgDpndQtyFlg;
    }

    /**
	 * Column Info
	 * @param prpShpNm
	 */
    public void setPrpShpNm(String prpShpNm) {
        this.prpShpNm = prpShpNm;
    }

    /**
	 * Column Info
	 * @return cfrFlg
	 */
    public void setCfrFlg(String cfrFlg) {
        this.cfrFlg = cfrFlg;
    }

    public void setImdgAmdtNo(String imdgAmdtNo) {
        this.imdgAmdtNo = imdgAmdtNo;
    }

    public String getImdgAmdtNo() {
        return this.imdgAmdtNo;
    }

    /**
	 * Request 넘어온 단건 DATA를 VO Class 에 담는다. 
	 * @param request
	 */
    public void fromRequest(HttpServletRequest request) {
        setN2ndImdgPckProviCd(JSPUtil.getParameter(request, "n2nd_imdg_pck_provi_cd", ""));
        setCfrRstrOprNm(JSPUtil.getParameter(request, "cfr_rstr_opr_nm", ""));
        setAwayFmImdgSegrGrpFlg(JSPUtil.getParameter(request, "away_fm_imdg_segr_grp_flg", ""));
        setImdgUnNoSeq(JSPUtil.getParameter(request, "imdg_un_no_seq", ""));
        setPsaNo(JSPUtil.getParameter(request, "psa_no", ""));
        setImdgSubsRskLblRmk(JSPUtil.getParameter(request, "imdg_subs_rsk_lbl_rmk", ""));
        setHcdgRmk(JSPUtil.getParameter(request, "hcdg_rmk", ""));
        setN2ndImdgPckInstrCd(JSPUtil.getParameter(request, "n2nd_imdg_pck_instr_cd", ""));
        setN1stImdgIbcProviCd(JSPUtil.getParameter(request, "n1st_imdg_ibc_provi_cd", ""));
        setN3rdAwayFmImdgClssCd(JSPUtil.getParameter(request, "n3rd_away_fm_imdg_clss_cd", ""));
        setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
        setN4thImdgPckProviCd(JSPUtil.getParameter(request, "n4th_imdg_pck_provi_cd", ""));
        setImdgCompGrpCd(JSPUtil.getParameter(request, "imdg_comp_grp_cd", ""));
        setSegrDesc(JSPUtil.getParameter(request, "segr_desc", ""));
        setCfrDgWetCd(JSPUtil.getParameter(request, "cfr_dg_wet_cd", ""));
        setN3rdImdgPckInstrCd(JSPUtil.getParameter(request, "n3rd_imdg_pck_instr_cd", ""));
        setSprtFmImdgSegrGrpFlg(JSPUtil.getParameter(request, "sprt_fm_imdg_segr_grp_flg", ""));
        setN1stImdgPckInstrCd(JSPUtil.getParameter(request, "n1st_imdg_pck_instr_cd", ""));
        setN4thImdgTnkInstrProviCd(JSPUtil.getParameter(request, "n4th_imdg_tnk_instr_provi_cd", ""));
        setImdgUnTnkInstrCd(JSPUtil.getParameter(request, "imdg_un_tnk_instr_cd", ""));
        setN4thImdgIbcProviCd(JSPUtil.getParameter(request, "n4th_imdg_ibc_provi_cd", ""));
        setN5thImdgPckProviCd(JSPUtil.getParameter(request, "n5th_imdg_pck_provi_cd", ""));
        setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
        setImdgUnNo(JSPUtil.getParameter(request, "imdg_un_no", ""));
        setHcdgFlg(JSPUtil.getParameter(request, "hcdg_flg", ""));
        setN3rdImdgPckProviCd(JSPUtil.getParameter(request, "n3rd_imdg_pck_provi_cd", ""));
        setSprtFmImdgClssFlg(JSPUtil.getParameter(request, "sprt_fm_imdg_clss_flg", ""));
        setAwayFmImdgClssFlg(JSPUtil.getParameter(request, "away_fm_imdg_clss_flg", ""));
        setHcdgIntmdBcRstrDesc(JSPUtil.getParameter(request, "hcdg_intmd_bc_rstr_desc", ""));
        setN3rdImdgIbcInstrCd(JSPUtil.getParameter(request, "n3rd_imdg_ibc_instr_cd", ""));
        setSegrAsForImdgClssCd(JSPUtil.getParameter(request, "segr_as_for_imdg_clss_cd", ""));
        setN5thImdgTnkInstrProviCd(JSPUtil.getParameter(request, "n5th_imdg_tnk_instr_provi_cd", ""));
        setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
        setCfrRstrPortNm(JSPUtil.getParameter(request, "cfr_rstr_port_nm", ""));
        setEmerRspnGidNo(JSPUtil.getParameter(request, "emer_rspn_gid_no", ""));
        setN4thBomPortTrstNo(JSPUtil.getParameter(request, "n4th_bom_port_trst_no", ""));
        setEmerRspnGidChrNo(JSPUtil.getParameter(request, "emer_rspn_gid_chr_no", ""));
        setImdgClssCd(JSPUtil.getParameter(request, "imdg_clss_cd", ""));
        setImdgPckGrpCd(JSPUtil.getParameter(request, "imdg_pck_grp_cd", ""));
        setImdgLmtQtyMeasUtCd(JSPUtil.getParameter(request, "imdg_lmt_qty_meas_ut_cd", ""));
        setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
        setN1stBomPortTrstNo(JSPUtil.getParameter(request, "n1st_bom_port_trst_no", ""));
        setPkgAuthNo(JSPUtil.getParameter(request, "pkg_auth_no", ""));
        setImdgLmtQty(JSPUtil.getParameter(request, "imdg_lmt_qty", ""));
        setN3rdBomPortTrstNo(JSPUtil.getParameter(request, "n3rd_bom_port_trst_no", ""));
        setN1stSprtFmImdgClssCd(JSPUtil.getParameter(request, "n1st_sprt_fm_imdg_clss_cd", ""));
        setN5thImdgIbcProviCd(JSPUtil.getParameter(request, "n5th_imdg_ibc_provi_cd", ""));
        setSegrAsForImdgClssFlg(JSPUtil.getParameter(request, "segr_as_for_imdg_clss_flg", ""));
        setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
        setImdgExptQtyCd(JSPUtil.getParameter(request, "imdg_expt_qty_cd", ""));
        setN2ndImdgIbcProviCd(JSPUtil.getParameter(request, "n2nd_imdg_ibc_provi_cd", ""));
        setLkPortAuthNo(JSPUtil.getParameter(request, "lk_port_auth_no", ""));
        setN1stImdgPckProviCd(JSPUtil.getParameter(request, "n1st_imdg_pck_provi_cd", ""));
        setFlshPntTempCtnt(JSPUtil.getParameter(request, "flsh_pnt_temp_ctnt", ""));
        setHcdgPckRstrDesc(JSPUtil.getParameter(request, "hcdg_pck_rstr_desc", ""));
        setN1stAwayFmImdgClssCd(JSPUtil.getParameter(request, "n1st_away_fm_imdg_clss_cd", ""));
        setCfrRptQty(JSPUtil.getParameter(request, "cfr_rpt_qty", ""));
        setCfrPsnInhZnCd(JSPUtil.getParameter(request, "cfr_psn_inh_zn_cd", ""));
        setImdgHtSrcStwgCd(JSPUtil.getParameter(request, "imdg_ht_src_stwg_cd", ""));
        setClrLivQtrStwgFlg(JSPUtil.getParameter(request, "clr_liv_qtr_stwg_flg", ""));
        setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
        setN1stImdgIbcInstrCd(JSPUtil.getParameter(request, "n1st_imdg_ibc_instr_cd", ""));
        setImdgStwgCateCd(JSPUtil.getParameter(request, "imdg_stwg_cate_cd", ""));
        setN3rdImdgTnkInstrProviCd(JSPUtil.getParameter(request, "n3rd_imdg_tnk_instr_provi_cd", ""));
        setImdgSbstPptDesc(JSPUtil.getParameter(request, "imdg_sbst_ppt_desc", ""));
        setN1stImdgTnkInstrProviCd(JSPUtil.getParameter(request, "n1st_imdg_tnk_instr_provi_cd", ""));
        setN2ndImdgIbcInstrCd(JSPUtil.getParameter(request, "n2nd_imdg_ibc_instr_cd", ""));
        setImdgFdStufStwgCd(JSPUtil.getParameter(request, "imdg_fd_stuf_stwg_cd", ""));
        setN3rdImdgIbcProviCd(JSPUtil.getParameter(request, "n3rd_imdg_ibc_provi_cd", ""));
        setCfrToxcCd(JSPUtil.getParameter(request, "cfr_toxc_cd", ""));
        setN2ndAwayFmImdgClssCd(JSPUtil.getParameter(request, "n2nd_away_fm_imdg_clss_cd", ""));
        setImdgEmerNo(JSPUtil.getParameter(request, "imdg_emer_no", ""));
        setN3rdSprtFmImdgClssCd(JSPUtil.getParameter(request, "n3rd_sprt_fm_imdg_clss_cd", ""));
        setN2ndSprtFmImdgClssCd(JSPUtil.getParameter(request, "n2nd_sprt_fm_imdg_clss_cd", ""));
        setN2ndImdgTnkInstrProviCd(JSPUtil.getParameter(request, "n2nd_imdg_tnk_instr_provi_cd", ""));
        setN2ndBomPortTrstNo(JSPUtil.getParameter(request, "n2nd_bom_port_trst_no", ""));
        setHcdgTnkRstrDesc(JSPUtil.getParameter(request, "hcdg_tnk_rstr_desc", ""));
        setImdgMrnPolutCd(JSPUtil.getParameter(request, "imdg_mrn_polut_cd", ""));
        setCfrXtdClssCd(JSPUtil.getParameter(request, "cfr_xtd_clss_cd", ""));
        setHcdgDpndQtyFlg(JSPUtil.getParameter(request, "hcdg_dpnd_qty_flg", ""));
        setPrpShpNm(JSPUtil.getParameter(request, "prp_shp_nm", ""));
        setCfrFlg(JSPUtil.getParameter(request, "cfr_flg", ""));
        setImdgAmdtNo(JSPUtil.getParameter(request, "imdg_amdt_no", ""));
    }

    /**
	 * Request를 VO Class를 담는다.
	 * @param request
	 * @return ScgImdgUnNoVO[]
	 */
    public ScgImdgUnNoVO[] fromRequestGrid(HttpServletRequest request) {
        return fromRequestGrid(request, "");
    }

    /**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return ScgImdgUnNoVO[]
	 */
    public ScgImdgUnNoVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
        ScgImdgUnNoVO model = null;
        String[] tmp = request.getParameterValues(prefix + "ibflag");
        if (tmp == null)
            return null;
        int length = request.getParameterValues(prefix + "ibflag").length;
        try {
            String[] n2ndImdgPckProviCd = (JSPUtil.getParameter(request, prefix + "n2nd_imdg_pck_provi_cd".trim(), length));
            String[] cfrRstrOprNm = (JSPUtil.getParameter(request, prefix + "cfr_rstr_opr_nm".trim(), length));
            String[] awayFmImdgSegrGrpFlg = (JSPUtil.getParameter(request, prefix + "away_fm_imdg_segr_grp_flg".trim(), length));
            String[] imdgUnNoSeq = (JSPUtil.getParameter(request, prefix + "imdg_un_no_seq".trim(), length));
            String[] psaNo = (JSPUtil.getParameter(request, prefix + "psa_no".trim(), length));
            String[] imdgSubsRskLblRmk = (JSPUtil.getParameter(request, prefix + "imdg_subs_rsk_lbl_rmk".trim(), length));
            String[] hcdgRmk = (JSPUtil.getParameter(request, prefix + "hcdg_rmk".trim(), length));
            String[] n2ndImdgPckInstrCd = (JSPUtil.getParameter(request, prefix + "n2nd_imdg_pck_instr_cd".trim(), length));
            String[] n1stImdgIbcProviCd = (JSPUtil.getParameter(request, prefix + "n1st_imdg_ibc_provi_cd".trim(), length));
            String[] n3rdAwayFmImdgClssCd = (JSPUtil.getParameter(request, prefix + "n3rd_away_fm_imdg_clss_cd".trim(), length));
            String[] pagerows = (JSPUtil.getParameter(request, prefix + "pagerows".trim(), length));
            String[] n4thImdgPckProviCd = (JSPUtil.getParameter(request, prefix + "n4th_imdg_pck_provi_cd".trim(), length));
            String[] imdgCompGrpCd = (JSPUtil.getParameter(request, prefix + "imdg_comp_grp_cd".trim(), length));
            String[] segrDesc = (JSPUtil.getParameter(request, prefix + "segr_desc".trim(), length));
            String[] cfrDgWetCd = (JSPUtil.getParameter(request, prefix + "cfr_dg_wet_cd".trim(), length));
            String[] n3rdImdgPckInstrCd = (JSPUtil.getParameter(request, prefix + "n3rd_imdg_pck_instr_cd".trim(), length));
            String[] sprtFmImdgSegrGrpFlg = (JSPUtil.getParameter(request, prefix + "sprt_fm_imdg_segr_grp_flg".trim(), length));
            String[] n1stImdgPckInstrCd = (JSPUtil.getParameter(request, prefix + "n1st_imdg_pck_instr_cd".trim(), length));
            String[] n4thImdgTnkInstrProviCd = (JSPUtil.getParameter(request, prefix + "n4th_imdg_tnk_instr_provi_cd".trim(), length));
            String[] imdgUnTnkInstrCd = (JSPUtil.getParameter(request, prefix + "imdg_un_tnk_instr_cd".trim(), length));
            String[] n4thImdgIbcProviCd = (JSPUtil.getParameter(request, prefix + "n4th_imdg_ibc_provi_cd".trim(), length));
            String[] n5thImdgPckProviCd = (JSPUtil.getParameter(request, prefix + "n5th_imdg_pck_provi_cd".trim(), length));
            String[] updUsrId = (JSPUtil.getParameter(request, prefix + "upd_usr_id".trim(), length));
            String[] imdgUnNo = (JSPUtil.getParameter(request, prefix + "imdg_un_no".trim(), length));
            String[] hcdgFlg = (JSPUtil.getParameter(request, prefix + "hcdg_flg".trim(), length));
            String[] n3rdImdgPckProviCd = (JSPUtil.getParameter(request, prefix + "n3rd_imdg_pck_provi_cd".trim(), length));
            String[] sprtFmImdgClssFlg = (JSPUtil.getParameter(request, prefix + "sprt_fm_imdg_clss_flg".trim(), length));
            String[] awayFmImdgClssFlg = (JSPUtil.getParameter(request, prefix + "away_fm_imdg_clss_flg".trim(), length));
            String[] hcdgIntmdBcRstrDesc = (JSPUtil.getParameter(request, prefix + "hcdg_intmd_bc_rstr_desc".trim(), length));
            String[] n3rdImdgIbcInstrCd = (JSPUtil.getParameter(request, prefix + "n3rd_imdg_ibc_instr_cd".trim(), length));
            String[] segrAsForImdgClssCd = (JSPUtil.getParameter(request, prefix + "segr_as_for_imdg_clss_cd".trim(), length));
            String[] n5thImdgTnkInstrProviCd = (JSPUtil.getParameter(request, prefix + "n5th_imdg_tnk_instr_provi_cd".trim(), length));
            String[] creUsrId = (JSPUtil.getParameter(request, prefix + "cre_usr_id".trim(), length));
            String[] cfrRstrPortNm = (JSPUtil.getParameter(request, prefix + "cfr_rstr_port_nm".trim(), length));
            String[] emerRspnGidNo = (JSPUtil.getParameter(request, prefix + "emer_rspn_gid_no".trim(), length));
            String[] n4thBomPortTrstNo = (JSPUtil.getParameter(request, prefix + "n4th_bom_port_trst_no".trim(), length));
            String[] emerRspnGidChrNo = (JSPUtil.getParameter(request, prefix + "emer_rspn_gid_chr_no".trim(), length));
            String[] imdgClssCd = (JSPUtil.getParameter(request, prefix + "imdg_clss_cd".trim(), length));
            String[] imdgPckGrpCd = (JSPUtil.getParameter(request, prefix + "imdg_pck_grp_cd".trim(), length));
            String[] imdgLmtQtyMeasUtCd = (JSPUtil.getParameter(request, prefix + "imdg_lmt_qty_meas_ut_cd".trim(), length));
            String[] creDt = (JSPUtil.getParameter(request, prefix + "cre_dt".trim(), length));
            String[] n1stBomPortTrstNo = (JSPUtil.getParameter(request, prefix + "n1st_bom_port_trst_no".trim(), length));
            String[] pkgAuthNo = (JSPUtil.getParameter(request, prefix + "pkg_auth_no".trim(), length));
            String[] imdgLmtQty = (JSPUtil.getParameter(request, prefix + "imdg_lmt_qty".trim(), length));
            String[] n3rdBomPortTrstNo = (JSPUtil.getParameter(request, prefix + "n3rd_bom_port_trst_no".trim(), length));
            String[] n1stSprtFmImdgClssCd = (JSPUtil.getParameter(request, prefix + "n1st_sprt_fm_imdg_clss_cd".trim(), length));
            String[] n5thImdgIbcProviCd = (JSPUtil.getParameter(request, prefix + "n5th_imdg_ibc_provi_cd".trim(), length));
            String[] segrAsForImdgClssFlg = (JSPUtil.getParameter(request, prefix + "segr_as_for_imdg_clss_flg".trim(), length));
            String[] ibflag = (JSPUtil.getParameter(request, prefix + "ibflag".trim(), length));
            String[] imdgExptQtyCd = (JSPUtil.getParameter(request, prefix + "imdg_expt_qty_cd".trim(), length));
            String[] n2ndImdgIbcProviCd = (JSPUtil.getParameter(request, prefix + "n2nd_imdg_ibc_provi_cd".trim(), length));
            String[] lkPortAuthNo = (JSPUtil.getParameter(request, prefix + "lk_port_auth_no".trim(), length));
            String[] n1stImdgPckProviCd = (JSPUtil.getParameter(request, prefix + "n1st_imdg_pck_provi_cd".trim(), length));
            String[] flshPntTempCtnt = (JSPUtil.getParameter(request, prefix + "flsh_pnt_temp_ctnt".trim(), length));
            String[] hcdgPckRstrDesc = (JSPUtil.getParameter(request, prefix + "hcdg_pck_rstr_desc".trim(), length));
            String[] n1stAwayFmImdgClssCd = (JSPUtil.getParameter(request, prefix + "n1st_away_fm_imdg_clss_cd".trim(), length));
            String[] cfrRptQty = (JSPUtil.getParameter(request, prefix + "cfr_rpt_qty".trim(), length));
            String[] cfrPsnInhZnCd = (JSPUtil.getParameter(request, prefix + "cfr_psn_inh_zn_cd".trim(), length));
            String[] imdgHtSrcStwgCd = (JSPUtil.getParameter(request, prefix + "imdg_ht_src_stwg_cd".trim(), length));
            String[] clrLivQtrStwgFlg = (JSPUtil.getParameter(request, prefix + "clr_liv_qtr_stwg_flg".trim(), length));
            String[] updDt = (JSPUtil.getParameter(request, prefix + "upd_dt".trim(), length));
            String[] n1stImdgIbcInstrCd = (JSPUtil.getParameter(request, prefix + "n1st_imdg_ibc_instr_cd".trim(), length));
            String[] imdgStwgCateCd = (JSPUtil.getParameter(request, prefix + "imdg_stwg_cate_cd".trim(), length));
            String[] n3rdImdgTnkInstrProviCd = (JSPUtil.getParameter(request, prefix + "n3rd_imdg_tnk_instr_provi_cd".trim(), length));
            String[] imdgSbstPptDesc = (JSPUtil.getParameter(request, prefix + "imdg_sbst_ppt_desc".trim(), length));
            String[] n1stImdgTnkInstrProviCd = (JSPUtil.getParameter(request, prefix + "n1st_imdg_tnk_instr_provi_cd".trim(), length));
            String[] n2ndImdgIbcInstrCd = (JSPUtil.getParameter(request, prefix + "n2nd_imdg_ibc_instr_cd".trim(), length));
            String[] imdgFdStufStwgCd = (JSPUtil.getParameter(request, prefix + "imdg_fd_stuf_stwg_cd".trim(), length));
            String[] n3rdImdgIbcProviCd = (JSPUtil.getParameter(request, prefix + "n3rd_imdg_ibc_provi_cd".trim(), length));
            String[] cfrToxcCd = (JSPUtil.getParameter(request, prefix + "cfr_toxc_cd".trim(), length));
            String[] n2ndAwayFmImdgClssCd = (JSPUtil.getParameter(request, prefix + "n2nd_away_fm_imdg_clss_cd".trim(), length));
            String[] imdgEmerNo = (JSPUtil.getParameter(request, prefix + "imdg_emer_no".trim(), length));
            String[] n3rdSprtFmImdgClssCd = (JSPUtil.getParameter(request, prefix + "n3rd_sprt_fm_imdg_clss_cd".trim(), length));
            String[] n2ndSprtFmImdgClssCd = (JSPUtil.getParameter(request, prefix + "n2nd_sprt_fm_imdg_clss_cd".trim(), length));
            String[] n2ndImdgTnkInstrProviCd = (JSPUtil.getParameter(request, prefix + "n2nd_imdg_tnk_instr_provi_cd".trim(), length));
            String[] n2ndBomPortTrstNo = (JSPUtil.getParameter(request, prefix + "n2nd_bom_port_trst_no".trim(), length));
            String[] hcdgTnkRstrDesc = (JSPUtil.getParameter(request, prefix + "hcdg_tnk_rstr_desc".trim(), length));
            String[] imdgMrnPolutCd = (JSPUtil.getParameter(request, prefix + "imdg_mrn_polut_cd".trim(), length));
            String[] cfrXtdClssCd = (JSPUtil.getParameter(request, prefix + "cfr_xtd_clss_cd".trim(), length));
            String[] hcdgDpndQtyFlg = (JSPUtil.getParameter(request, prefix + "hcdg_dpnd_qty_flg".trim(), length));
            String[] prpShpNm = (JSPUtil.getParameter(request, prefix + "prp_shp_nm".trim(), length));
            String[] cfrFlg = (JSPUtil.getParameter(request, prefix + "cfr_flg".trim(), length));
            String[] imdgAmdtNo = (JSPUtil.getParameter(request, prefix + "imdg_amdt_no", length));
	    	/* Add a field line, do not delete */
            for (int i = 0; i < length; i++) {
                model = new ScgImdgUnNoVO();
                if (n2ndImdgPckProviCd[i] != null)
                    model.setN2ndImdgPckProviCd(n2ndImdgPckProviCd[i]);
                if (cfrRstrOprNm[i] != null)
                    model.setCfrRstrOprNm(cfrRstrOprNm[i]);
                if (awayFmImdgSegrGrpFlg[i] != null)
                    model.setAwayFmImdgSegrGrpFlg(awayFmImdgSegrGrpFlg[i]);
                if (imdgUnNoSeq[i] != null)
                    model.setImdgUnNoSeq(imdgUnNoSeq[i]);
                if (psaNo[i] != null)
                    model.setPsaNo(psaNo[i]);
                if (imdgSubsRskLblRmk[i] != null)
                    model.setImdgSubsRskLblRmk(imdgSubsRskLblRmk[i]);
                if (hcdgRmk[i] != null)
                    model.setHcdgRmk(hcdgRmk[i]);
                if (n2ndImdgPckInstrCd[i] != null)
                    model.setN2ndImdgPckInstrCd(n2ndImdgPckInstrCd[i]);
                if (n1stImdgIbcProviCd[i] != null)
                    model.setN1stImdgIbcProviCd(n1stImdgIbcProviCd[i]);
                if (n3rdAwayFmImdgClssCd[i] != null)
                    model.setN3rdAwayFmImdgClssCd(n3rdAwayFmImdgClssCd[i]);
                if (pagerows[i] != null)
                    model.setPagerows(pagerows[i]);
                if (n4thImdgPckProviCd[i] != null)
                    model.setN4thImdgPckProviCd(n4thImdgPckProviCd[i]);
                if (imdgCompGrpCd[i] != null)
                    model.setImdgCompGrpCd(imdgCompGrpCd[i]);
                if (segrDesc[i] != null)
                    model.setSegrDesc(segrDesc[i]);
                if (cfrDgWetCd[i] != null)
                    model.setCfrDgWetCd(cfrDgWetCd[i]);
                if (n3rdImdgPckInstrCd[i] != null)
                    model.setN3rdImdgPckInstrCd(n3rdImdgPckInstrCd[i]);
                if (sprtFmImdgSegrGrpFlg[i] != null)
                    model.setSprtFmImdgSegrGrpFlg(sprtFmImdgSegrGrpFlg[i]);
                if (n1stImdgPckInstrCd[i] != null)
                    model.setN1stImdgPckInstrCd(n1stImdgPckInstrCd[i]);
                if (n4thImdgTnkInstrProviCd[i] != null)
                    model.setN4thImdgTnkInstrProviCd(n4thImdgTnkInstrProviCd[i]);
                if (imdgUnTnkInstrCd[i] != null)
                    model.setImdgUnTnkInstrCd(imdgUnTnkInstrCd[i]);
                if (n4thImdgIbcProviCd[i] != null)
                    model.setN4thImdgIbcProviCd(n4thImdgIbcProviCd[i]);
                if (n5thImdgPckProviCd[i] != null)
                    model.setN5thImdgPckProviCd(n5thImdgPckProviCd[i]);
                if (updUsrId[i] != null)
                    model.setUpdUsrId(updUsrId[i]);
                if (imdgUnNo[i] != null)
                    model.setImdgUnNo(imdgUnNo[i]);
                if (hcdgFlg[i] != null)
                    model.setHcdgFlg(hcdgFlg[i]);
                if (n3rdImdgPckProviCd[i] != null)
                    model.setN3rdImdgPckProviCd(n3rdImdgPckProviCd[i]);
                if (sprtFmImdgClssFlg[i] != null)
                    model.setSprtFmImdgClssFlg(sprtFmImdgClssFlg[i]);
                if (awayFmImdgClssFlg[i] != null)
                    model.setAwayFmImdgClssFlg(awayFmImdgClssFlg[i]);
                if (hcdgIntmdBcRstrDesc[i] != null)
                    model.setHcdgIntmdBcRstrDesc(hcdgIntmdBcRstrDesc[i]);
                if (n3rdImdgIbcInstrCd[i] != null)
                    model.setN3rdImdgIbcInstrCd(n3rdImdgIbcInstrCd[i]);
                if (segrAsForImdgClssCd[i] != null)
                    model.setSegrAsForImdgClssCd(segrAsForImdgClssCd[i]);
                if (n5thImdgTnkInstrProviCd[i] != null)
                    model.setN5thImdgTnkInstrProviCd(n5thImdgTnkInstrProviCd[i]);
                if (creUsrId[i] != null)
                    model.setCreUsrId(creUsrId[i]);
                if (cfrRstrPortNm[i] != null)
                    model.setCfrRstrPortNm(cfrRstrPortNm[i]);
                if (emerRspnGidNo[i] != null)
                    model.setEmerRspnGidNo(emerRspnGidNo[i]);
                if (n4thBomPortTrstNo[i] != null)
                    model.setN4thBomPortTrstNo(n4thBomPortTrstNo[i]);
                if (emerRspnGidChrNo[i] != null)
                    model.setEmerRspnGidChrNo(emerRspnGidChrNo[i]);
                if (imdgClssCd[i] != null)
                    model.setImdgClssCd(imdgClssCd[i]);
                if (imdgPckGrpCd[i] != null)
                    model.setImdgPckGrpCd(imdgPckGrpCd[i]);
                if (imdgLmtQtyMeasUtCd[i] != null)
                    model.setImdgLmtQtyMeasUtCd(imdgLmtQtyMeasUtCd[i]);
                if (creDt[i] != null)
                    model.setCreDt(creDt[i]);
                if (n1stBomPortTrstNo[i] != null)
                    model.setN1stBomPortTrstNo(n1stBomPortTrstNo[i]);
                if (pkgAuthNo[i] != null)
                    model.setPkgAuthNo(pkgAuthNo[i]);
                if (imdgLmtQty[i] != null)
                    model.setImdgLmtQty(imdgLmtQty[i]);
                if (n3rdBomPortTrstNo[i] != null)
                    model.setN3rdBomPortTrstNo(n3rdBomPortTrstNo[i]);
                if (n1stSprtFmImdgClssCd[i] != null)
                    model.setN1stSprtFmImdgClssCd(n1stSprtFmImdgClssCd[i]);
                if (n5thImdgIbcProviCd[i] != null)
                    model.setN5thImdgIbcProviCd(n5thImdgIbcProviCd[i]);
                if (segrAsForImdgClssFlg[i] != null)
                    model.setSegrAsForImdgClssFlg(segrAsForImdgClssFlg[i]);
                if (ibflag[i] != null)
                    model.setIbflag(ibflag[i]);
                if (imdgExptQtyCd[i] != null)
                    model.setImdgExptQtyCd(imdgExptQtyCd[i]);
                if (n2ndImdgIbcProviCd[i] != null)
                    model.setN2ndImdgIbcProviCd(n2ndImdgIbcProviCd[i]);
                if (lkPortAuthNo[i] != null)
                    model.setLkPortAuthNo(lkPortAuthNo[i]);
                if (n1stImdgPckProviCd[i] != null)
                    model.setN1stImdgPckProviCd(n1stImdgPckProviCd[i]);
                if (flshPntTempCtnt[i] != null)
                    model.setFlshPntTempCtnt(flshPntTempCtnt[i]);
                if (hcdgPckRstrDesc[i] != null)
                    model.setHcdgPckRstrDesc(hcdgPckRstrDesc[i]);
                if (n1stAwayFmImdgClssCd[i] != null)
                    model.setN1stAwayFmImdgClssCd(n1stAwayFmImdgClssCd[i]);
                if (cfrRptQty[i] != null)
                    model.setCfrRptQty(cfrRptQty[i]);
                if (cfrPsnInhZnCd[i] != null)
                    model.setCfrPsnInhZnCd(cfrPsnInhZnCd[i]);
                if (imdgHtSrcStwgCd[i] != null)
                    model.setImdgHtSrcStwgCd(imdgHtSrcStwgCd[i]);
                if (clrLivQtrStwgFlg[i] != null)
                    model.setClrLivQtrStwgFlg(clrLivQtrStwgFlg[i]);
                if (updDt[i] != null)
                    model.setUpdDt(updDt[i]);
                if (n1stImdgIbcInstrCd[i] != null)
                    model.setN1stImdgIbcInstrCd(n1stImdgIbcInstrCd[i]);
                if (imdgStwgCateCd[i] != null)
                    model.setImdgStwgCateCd(imdgStwgCateCd[i]);
                if (n3rdImdgTnkInstrProviCd[i] != null)
                    model.setN3rdImdgTnkInstrProviCd(n3rdImdgTnkInstrProviCd[i]);
                if (imdgSbstPptDesc[i] != null)
                    model.setImdgSbstPptDesc(imdgSbstPptDesc[i]);
                if (n1stImdgTnkInstrProviCd[i] != null)
                    model.setN1stImdgTnkInstrProviCd(n1stImdgTnkInstrProviCd[i]);
                if (n2ndImdgIbcInstrCd[i] != null)
                    model.setN2ndImdgIbcInstrCd(n2ndImdgIbcInstrCd[i]);
                if (imdgFdStufStwgCd[i] != null)
                    model.setImdgFdStufStwgCd(imdgFdStufStwgCd[i]);
                if (n3rdImdgIbcProviCd[i] != null)
                    model.setN3rdImdgIbcProviCd(n3rdImdgIbcProviCd[i]);
                if (cfrToxcCd[i] != null)
                    model.setCfrToxcCd(cfrToxcCd[i]);
                if (n2ndAwayFmImdgClssCd[i] != null)
                    model.setN2ndAwayFmImdgClssCd(n2ndAwayFmImdgClssCd[i]);
                if (imdgEmerNo[i] != null)
                    model.setImdgEmerNo(imdgEmerNo[i]);
                if (n3rdSprtFmImdgClssCd[i] != null)
                    model.setN3rdSprtFmImdgClssCd(n3rdSprtFmImdgClssCd[i]);
                if (n2ndSprtFmImdgClssCd[i] != null)
                    model.setN2ndSprtFmImdgClssCd(n2ndSprtFmImdgClssCd[i]);
                if (n2ndImdgTnkInstrProviCd[i] != null)
                    model.setN2ndImdgTnkInstrProviCd(n2ndImdgTnkInstrProviCd[i]);
                if (n2ndBomPortTrstNo[i] != null)
                    model.setN2ndBomPortTrstNo(n2ndBomPortTrstNo[i]);
                if (hcdgTnkRstrDesc[i] != null)
                    model.setHcdgTnkRstrDesc(hcdgTnkRstrDesc[i]);
                if (imdgMrnPolutCd[i] != null)
                    model.setImdgMrnPolutCd(imdgMrnPolutCd[i]);
                if (cfrXtdClssCd[i] != null)
                    model.setCfrXtdClssCd(cfrXtdClssCd[i]);
                if (hcdgDpndQtyFlg[i] != null)
                    model.setHcdgDpndQtyFlg(hcdgDpndQtyFlg[i]);
                if (prpShpNm[i] != null)
                    model.setPrpShpNm(prpShpNm[i]);
                if (cfrFlg[i] != null)
                    model.setCfrFlg(cfrFlg[i]);
                if (imdgAmdtNo[i] != null) 
		    		model.setImdgAmdtNo(imdgAmdtNo[i]);
				/* Add a Method line, do not delete */
                models.add(model);
            }
        } catch (Exception e) {
            return null;
        }
        return getScgImdgUnNoVOs();
    }

    /**
	 * 여러 VO Calss를 배열화 한다 
	 * @return ScgImdgUnNoVO[]
	 */
    public ScgImdgUnNoVO[] getScgImdgUnNoVOs() {
        ScgImdgUnNoVO[] vos = (ScgImdgUnNoVO[]) models.toArray(new ScgImdgUnNoVO[models.size()]);
        return vos;
    }

    /**
	 * VO Class의 내용을 String으로 변환
	 */
    public String toString() {
        StringBuffer ret = new StringBuffer();
        Field[] field = this.getClass().getDeclaredFields();
        String space = "";
        try {
            for (int i = 0; i < field.length; i++) {
                String[] arr = null;
                arr = getField(field, i);
                if (arr != null) {
                    for (int j = 0; j < arr.length; j++) {
                        ret.append(field[i].getName().concat(space).substring(0, 30).concat("= ") + arr[j] + "\n");
                    }
                } else {
                    ret.append(field[i].getName() + " =  null \n");
                }
            }
        } catch (Exception ex) {
            return null;
        }
        return ret.toString();
    }

    /**
	 * 각 클래스 해당하는 필드 정보를 배열에 담는다 
	 * @param field
	 * @param i
	 * @return String[]
	 */
    private String[] getField(Field[] field, int i) {
        String[] arr = null;
        try {
            arr = (String[]) field[i].get(this);
        } catch (Exception ex) {
            arr = getFieldCatct(field, i, arr);
        }
        return arr;
    }

    /**
	 * getField 에서 catch문에 대한 로직
	 * @param field
	 * @param i
	 * @param arr
	 * @return arr
	 */
    private String[] getFieldCatct(Field[] field, int i, String[] arr) {
        try {
            arr = new String[1];
            arr[0] = String.valueOf(field[i].get(this));
        } catch (IllegalAccessException e) {
            return null;
        }
        return arr;
    }

    /**
	* DataFormat 설정
	*/
    public void unDataFormat() {
        this.n2ndImdgPckProviCd = this.n2ndImdgPckProviCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.cfrRstrOprNm = this.cfrRstrOprNm.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.awayFmImdgSegrGrpFlg = this.awayFmImdgSegrGrpFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.imdgUnNoSeq = this.imdgUnNoSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.psaNo = this.psaNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.imdgSubsRskLblRmk = this.imdgSubsRskLblRmk.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.hcdgRmk = this.hcdgRmk.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.n2ndImdgPckInstrCd = this.n2ndImdgPckInstrCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.n1stImdgIbcProviCd = this.n1stImdgIbcProviCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.n3rdAwayFmImdgClssCd = this.n3rdAwayFmImdgClssCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.pagerows = this.pagerows.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.n4thImdgPckProviCd = this.n4thImdgPckProviCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.imdgCompGrpCd = this.imdgCompGrpCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.segrDesc = this.segrDesc.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.cfrDgWetCd = this.cfrDgWetCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.n3rdImdgPckInstrCd = this.n3rdImdgPckInstrCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.sprtFmImdgSegrGrpFlg = this.sprtFmImdgSegrGrpFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.n1stImdgPckInstrCd = this.n1stImdgPckInstrCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.n4thImdgTnkInstrProviCd = this.n4thImdgTnkInstrProviCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.imdgUnTnkInstrCd = this.imdgUnTnkInstrCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.n4thImdgIbcProviCd = this.n4thImdgIbcProviCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.n5thImdgPckProviCd = this.n5thImdgPckProviCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.updUsrId = this.updUsrId.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.imdgUnNo = this.imdgUnNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.hcdgFlg = this.hcdgFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.n3rdImdgPckProviCd = this.n3rdImdgPckProviCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.sprtFmImdgClssFlg = this.sprtFmImdgClssFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.awayFmImdgClssFlg = this.awayFmImdgClssFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.hcdgIntmdBcRstrDesc = this.hcdgIntmdBcRstrDesc.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.n3rdImdgIbcInstrCd = this.n3rdImdgIbcInstrCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.segrAsForImdgClssCd = this.segrAsForImdgClssCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.n5thImdgTnkInstrProviCd = this.n5thImdgTnkInstrProviCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.creUsrId = this.creUsrId.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.cfrRstrPortNm = this.cfrRstrPortNm.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.emerRspnGidNo = this.emerRspnGidNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.n4thBomPortTrstNo = this.n4thBomPortTrstNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.emerRspnGidChrNo = this.emerRspnGidChrNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.imdgClssCd = this.imdgClssCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.imdgPckGrpCd = this.imdgPckGrpCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.imdgLmtQtyMeasUtCd = this.imdgLmtQtyMeasUtCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.creDt = this.creDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.n1stBomPortTrstNo = this.n1stBomPortTrstNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.pkgAuthNo = this.pkgAuthNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.imdgLmtQty = this.imdgLmtQty.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.n3rdBomPortTrstNo = this.n3rdBomPortTrstNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.n1stSprtFmImdgClssCd = this.n1stSprtFmImdgClssCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.n5thImdgIbcProviCd = this.n5thImdgIbcProviCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.segrAsForImdgClssFlg = this.segrAsForImdgClssFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.ibflag = this.ibflag.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.imdgExptQtyCd = this.imdgExptQtyCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.n2ndImdgIbcProviCd = this.n2ndImdgIbcProviCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.lkPortAuthNo = this.lkPortAuthNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.n1stImdgPckProviCd = this.n1stImdgPckProviCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.flshPntTempCtnt = this.flshPntTempCtnt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.hcdgPckRstrDesc = this.hcdgPckRstrDesc.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.n1stAwayFmImdgClssCd = this.n1stAwayFmImdgClssCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.cfrRptQty = this.cfrRptQty.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.cfrPsnInhZnCd = this.cfrPsnInhZnCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.imdgHtSrcStwgCd = this.imdgHtSrcStwgCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.clrLivQtrStwgFlg = this.clrLivQtrStwgFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.updDt = this.updDt.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.n1stImdgIbcInstrCd = this.n1stImdgIbcInstrCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.imdgStwgCateCd = this.imdgStwgCateCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.n3rdImdgTnkInstrProviCd = this.n3rdImdgTnkInstrProviCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.imdgSbstPptDesc = this.imdgSbstPptDesc.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.n1stImdgTnkInstrProviCd = this.n1stImdgTnkInstrProviCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.n2ndImdgIbcInstrCd = this.n2ndImdgIbcInstrCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.imdgFdStufStwgCd = this.imdgFdStufStwgCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.n3rdImdgIbcProviCd = this.n3rdImdgIbcProviCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.cfrToxcCd = this.cfrToxcCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.n2ndAwayFmImdgClssCd = this.n2ndAwayFmImdgClssCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.imdgEmerNo = this.imdgEmerNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.n3rdSprtFmImdgClssCd = this.n3rdSprtFmImdgClssCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.n2ndSprtFmImdgClssCd = this.n2ndSprtFmImdgClssCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.n2ndImdgTnkInstrProviCd = this.n2ndImdgTnkInstrProviCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.n2ndBomPortTrstNo = this.n2ndBomPortTrstNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.hcdgTnkRstrDesc = this.hcdgTnkRstrDesc.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.imdgMrnPolutCd = this.imdgMrnPolutCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.cfrXtdClssCd = this.cfrXtdClssCd.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.hcdgDpndQtyFlg = this.hcdgDpndQtyFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.prpShpNm = this.prpShpNm.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.cfrFlg = this.cfrFlg.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
        this.imdgAmdtNo = this.imdgAmdtNo.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
    }
}
