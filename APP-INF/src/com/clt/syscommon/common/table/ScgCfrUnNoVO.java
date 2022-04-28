/*=========================================================
*Copyright(c) 2017 CyberLogitec
*@FileName : ScgCfrUnNoVO.java
*@FileTitle : ScgCfrUnNoVO
*Open Issues :
*Change history :
*@LastModifyDate : 2017.09.13
*@LastModifier : 
*@LastVersion : 1.0
* 2017.09.13  
* 1.0 Creation
=========================================================*/

package com.clt.syscommon.common.table;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.clt.framework.component.common.AbstractValueObject;
import com.clt.framework.component.util.JSPUtil;

/**
 * Table Value Ojbect<br>
 * 관련 Event 에서 생성, 서버실행요청시 Data 전달역할을 수행하는 Value Object
 *
 * @author 
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class ScgCfrUnNoVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<ScgCfrUnNoVO> models = new ArrayList<ScgCfrUnNoVO>();
	
	/* Column Info */
	private String cfrClssSegrExptCd = null;
	/* Column Info */
	private String cfrLmtQtyMeasUtCd = null;
	/* Column Info */
	private String imdgUnNoSeq = null;
	/* Column Info */
	private String cfrPckGrpCd = null;
	/* Column Info */
	private String n1stCfrInstrProviCd = null;
	/* Column Info */
	private String n4thBlkPckInstrCd = null;
	/* Column Info */
	private String n7thCfrStwgCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String n1stBlkSpclPckProviCd = null;
	/* Column Info */
	private String n3rdCfrSpclProviCd = null;
	/* Column Info */
	private String n4thCfrInstrProviCd = null;
	/* Column Info */
	private String n1stCfrSpclProviCd = null;
	/* Column Info */
	private String n3rdCfrLblCd = null;
	/* Column Info */
	private String cfrRailAirCgoLmtDesc = null;
	/* Column Info */
	private String n4thBlkSpclPckProviCd = null;
	/* Column Info */
	private String n4thCfrSpclProviCd = null;
	/* Column Info */
	private String cfrRptQtyCtnt = null;
	/* Column Info */
	private String n6thCfrInstrProviCd = null;
	/* Column Info */
	private String n6thCfrStwgCd = null;
	/* Column Info */
	private String cfrPsnInhHzdZnCd = null;
	/* Column Info */
	private String cfrSegrGrpCdValDesc = null;
	/* Column Info */
	private String n1stCfrSymCd = null;
	/* Column Info */
	private String n1stCfrStwgCateCd = null;
	/* Column Info */
	private String n2ndPsngVslCfrStwgCd = null;
	/* Column Info */
	private String n5thCfrSpclProviCd = null;
	/* Column Info */
	private String n3rdCfrInstrProviCd = null;
	/* Column Info */
	private String n2ndNonBlkSpclPckProviCd = null;
	/* Column Info */
	private String n1stNonBlkPckInstrCd = null;
	/* Column Info */
	private String n1stPsngVslCfrStwgCd = null;
	/* Column Info */
	private String n7thBlkSpclPckProviCd = null;
	/* Column Info */
	private String n5thNonBlkSpclPckProviCd = null;
	/* Column Info */
	private String n3rdBlkPckInstrCd = null;
	/* Column Info */
	private String n3rdNonBlkSpclPckProviCd = null;
	/* Column Info */
	private String n3rdCfrStwgCd = null;
	/* Column Info */
	private String n2ndCfrStwgCateCd = null;
	/* Column Info */
	private String cfrReguNo = null;
	/* Column Info */
	private String n4thNonBlkPckInstrCd = null;
	/* Column Info */
	private String cfrLmtQtyCtnt = null;
	/* Column Info */
	private String n1stCfrStwgCd = null;
	/* Column Info */
	private String n9thBlkSpclPckProviCd = null;
	/* Column Info */
	private String n4thNonBlkSpclPckProviCd = null;
	/* Column Info */
	private String n6thBlkSpclPckProviCd = null;
	/* Column Info */
	private String n3rdCfrIbcProviCd = null;
	/* Column Info */
	private String n5thCfrInstrProviCd = null;
	/* Column Info */
	private String cfrExptQtyCd = null;
	/* Column Info */
	private String n2ndBlkPckInstrCd = null;
	/* Column Info */
	private String cdVariNo = null;
	/* Column Info */
	private String cfrEmerRspnGidNo = null;
	/* Column Info */
	private String n1stCfrIbcProviCd = null;
	/* Column Info */
	private String imdgAmdtNo = null;
	/* Column Info */
	private String n3rdBlkSpclPckProviCd = null;
	/* Column Info */
	private String cfrRailAirPsngLmtDesc = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String n2ndCfrInstrProviCd = null;
	/* Column Info */
	private String cfrTnkInstrCd = null;
	/* Column Info */
	private String prpShpNmVarRmk = null;
	/* Column Info */
	private String n3rdCfrSymCd = null;
	/* Column Info */
	private String cfrUnNo = null;
	/* Column Info */
	private String n9thCfrStwgCd = null;
	/* Column Info */
	private String n2ndBlkSpclPckProviCd = null;
	/* Column Info */
	private String imdgUnNoSfx = null;
	/* Column Info */
	private String cfrPhysSteCd = null;
	/* Column Info */
	private String n2ndCfrIbcInstrCd = null;
	/* Column Info */
	private String n2ndCfrStwgCd = null;
	/* Column Info */
	private String cfrMrnPolutCd = null;
	/* Column Info */
	private String n1stCfrIbcInstrCd = null;
	/* Column Info */
	private String n1stBlkPckInstrCd = null;
	/* Column Info */
	private String n5thBlkSpclPckProviCd = null;
	/* Column Info */
	private String n1stNonBlkSpclPckProviCd = null;
	/* Column Info */
	private String n1stCgoVslCfrStwgCd = null;
	/* Column Info */
	private String n4thCfrIbcProviCd = null;
	/* Column Info */
	private String n2ndCgoVslCfrStwgCd = null;
	/* Column Info */
	private String n1stCfrLblCd = null;
	/* Column Info */
	private String cfrTecNmReqDesc = null;
	/* Column Info */
	private String n8thCfrStwgCd = null;
	/* Column Info */
	private String n4thCfrStwgCd = null;
	/* Column Info */
	private String n2ndCfrSpclProviCd = null;
	/* Column Info */
	private String n2ndCfrLblCd = null;
	/* Column Info */
	private String n3rdCfrStwgCateCd = null;
	/* Column Info */
	private String otrCfrStwgCateCd = null;
	/* Column Info */
	private String n3rdNonBlkPckInstrCd = null;
	/* Column Info */
	private String n4thCfrLblCd = null;
	/* Column Info */
	private String n5thCfrStwgCd = null;
	/* Column Info */
	private String cfrPfxNo = null;
	/* Column Info */
	private String prpShpNm = null;
	/* Column Info */
	private String n2ndCfrSymCd = null;
	/* Column Info */
	private String n8thBlkSpclPckProviCd = null;
	/* Column Info */
	private String n4thCfrSymCd = null;
	/* Column Info */
	private String n2ndNonBlkPckInstrCd = null;
	/* Column Info */
	private String cfrClssForSegrCd = null;
	/* Column Info */
	private String n2ndCfrIbcProviCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new LinkedHashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new LinkedHashMap<String, String>();
	
	public ScgCfrUnNoVO() {}

	public ScgCfrUnNoVO(String ibflag, String pagerows, String cfrUnNo, String imdgUnNoSeq, String cfrPfxNo, String cfrReguNo, String imdgUnNoSfx, String cdVariNo, String prpShpNm, String prpShpNmVarRmk, String cfrPckGrpCd, String n1stCfrLblCd, String n2ndCfrLblCd, String n3rdCfrLblCd, String n4thCfrLblCd, String cfrMrnPolutCd, String n1stCfrSpclProviCd, String n2ndCfrSpclProviCd, String n3rdCfrSpclProviCd, String n4thCfrSpclProviCd, String n5thCfrSpclProviCd, String cfrExptQtyCd, String cfrLmtQtyCtnt, String cfrLmtQtyMeasUtCd, String n1stCfrStwgCateCd, String n2ndCfrStwgCateCd, String n3rdCfrStwgCateCd, String n1stNonBlkPckInstrCd, String n2ndNonBlkPckInstrCd, String n3rdNonBlkPckInstrCd, String n4thNonBlkPckInstrCd, String n1stNonBlkSpclPckProviCd, String n2ndNonBlkSpclPckProviCd, String n3rdNonBlkSpclPckProviCd, String n4thNonBlkSpclPckProviCd, String n5thNonBlkSpclPckProviCd, String n1stCfrIbcInstrCd, String n2ndCfrIbcInstrCd, String n1stCfrIbcProviCd, String n2ndCfrIbcProviCd, String n3rdCfrIbcProviCd, String n4thCfrIbcProviCd, String cfrTnkInstrCd, String n1stCfrInstrProviCd, String n2ndCfrInstrProviCd, String n3rdCfrInstrProviCd, String n4thCfrInstrProviCd, String n5thCfrInstrProviCd, String n6thCfrInstrProviCd, String otrCfrStwgCateCd, String cfrPsnInhHzdZnCd, String cfrEmerRspnGidNo, String n1stBlkPckInstrCd, String n2ndBlkPckInstrCd, String n3rdBlkPckInstrCd, String n4thBlkPckInstrCd, String n1stBlkSpclPckProviCd, String n2ndBlkSpclPckProviCd, String n3rdBlkSpclPckProviCd, String n4thBlkSpclPckProviCd, String n5thBlkSpclPckProviCd, String n6thBlkSpclPckProviCd, String n7thBlkSpclPckProviCd, String n8thBlkSpclPckProviCd, String n9thBlkSpclPckProviCd, String n1stCfrSymCd, String n2ndCfrSymCd, String n3rdCfrSymCd, String n4thCfrSymCd, String cfrRptQtyCtnt, String n1stCfrStwgCd, String n2ndCfrStwgCd, String n3rdCfrStwgCd, String n4thCfrStwgCd, String n5thCfrStwgCd, String n6thCfrStwgCd, String n7thCfrStwgCd, String n8thCfrStwgCd, String n9thCfrStwgCd, String cfrRailAirPsngLmtDesc, String cfrRailAirCgoLmtDesc, String n1stCgoVslCfrStwgCd, String n2ndCgoVslCfrStwgCd, String n1stPsngVslCfrStwgCd, String n2ndPsngVslCfrStwgCd, String cfrTecNmReqDesc, String cfrSegrGrpCdValDesc, String cfrClssSegrExptCd, String cfrClssForSegrCd, String cfrPhysSteCd, String imdgAmdtNo) {
		this.cfrClssSegrExptCd = cfrClssSegrExptCd;
		this.cfrLmtQtyMeasUtCd = cfrLmtQtyMeasUtCd;
		this.imdgUnNoSeq = imdgUnNoSeq;
		this.cfrPckGrpCd = cfrPckGrpCd;
		this.n1stCfrInstrProviCd = n1stCfrInstrProviCd;
		this.n4thBlkPckInstrCd = n4thBlkPckInstrCd;
		this.n7thCfrStwgCd = n7thCfrStwgCd;
		this.pagerows = pagerows;
		this.n1stBlkSpclPckProviCd = n1stBlkSpclPckProviCd;
		this.n3rdCfrSpclProviCd = n3rdCfrSpclProviCd;
		this.n4thCfrInstrProviCd = n4thCfrInstrProviCd;
		this.n1stCfrSpclProviCd = n1stCfrSpclProviCd;
		this.n3rdCfrLblCd = n3rdCfrLblCd;
		this.cfrRailAirCgoLmtDesc = cfrRailAirCgoLmtDesc;
		this.n4thBlkSpclPckProviCd = n4thBlkSpclPckProviCd;
		this.n4thCfrSpclProviCd = n4thCfrSpclProviCd;
		this.cfrRptQtyCtnt = cfrRptQtyCtnt;
		this.n6thCfrInstrProviCd = n6thCfrInstrProviCd;
		this.n6thCfrStwgCd = n6thCfrStwgCd;
		this.cfrPsnInhHzdZnCd = cfrPsnInhHzdZnCd;
		this.cfrSegrGrpCdValDesc = cfrSegrGrpCdValDesc;
		this.n1stCfrSymCd = n1stCfrSymCd;
		this.n1stCfrStwgCateCd = n1stCfrStwgCateCd;
		this.n2ndPsngVslCfrStwgCd = n2ndPsngVslCfrStwgCd;
		this.n5thCfrSpclProviCd = n5thCfrSpclProviCd;
		this.n3rdCfrInstrProviCd = n3rdCfrInstrProviCd;
		this.n2ndNonBlkSpclPckProviCd = n2ndNonBlkSpclPckProviCd;
		this.n1stNonBlkPckInstrCd = n1stNonBlkPckInstrCd;
		this.n1stPsngVslCfrStwgCd = n1stPsngVslCfrStwgCd;
		this.n7thBlkSpclPckProviCd = n7thBlkSpclPckProviCd;
		this.n5thNonBlkSpclPckProviCd = n5thNonBlkSpclPckProviCd;
		this.n3rdBlkPckInstrCd = n3rdBlkPckInstrCd;
		this.n3rdNonBlkSpclPckProviCd = n3rdNonBlkSpclPckProviCd;
		this.n3rdCfrStwgCd = n3rdCfrStwgCd;
		this.n2ndCfrStwgCateCd = n2ndCfrStwgCateCd;
		this.cfrReguNo = cfrReguNo;
		this.n4thNonBlkPckInstrCd = n4thNonBlkPckInstrCd;
		this.cfrLmtQtyCtnt = cfrLmtQtyCtnt;
		this.n1stCfrStwgCd = n1stCfrStwgCd;
		this.n9thBlkSpclPckProviCd = n9thBlkSpclPckProviCd;
		this.n4thNonBlkSpclPckProviCd = n4thNonBlkSpclPckProviCd;
		this.n6thBlkSpclPckProviCd = n6thBlkSpclPckProviCd;
		this.n3rdCfrIbcProviCd = n3rdCfrIbcProviCd;
		this.n5thCfrInstrProviCd = n5thCfrInstrProviCd;
		this.cfrExptQtyCd = cfrExptQtyCd;
		this.n2ndBlkPckInstrCd = n2ndBlkPckInstrCd;
		this.cdVariNo = cdVariNo;
		this.cfrEmerRspnGidNo = cfrEmerRspnGidNo;
		this.n1stCfrIbcProviCd = n1stCfrIbcProviCd;
		this.imdgAmdtNo = imdgAmdtNo;
		this.n3rdBlkSpclPckProviCd = n3rdBlkSpclPckProviCd;
		this.cfrRailAirPsngLmtDesc = cfrRailAirPsngLmtDesc;
		this.ibflag = ibflag;
		this.n2ndCfrInstrProviCd = n2ndCfrInstrProviCd;
		this.cfrTnkInstrCd = cfrTnkInstrCd;
		this.prpShpNmVarRmk = prpShpNmVarRmk;
		this.n3rdCfrSymCd = n3rdCfrSymCd;
		this.cfrUnNo = cfrUnNo;
		this.n9thCfrStwgCd = n9thCfrStwgCd;
		this.n2ndBlkSpclPckProviCd = n2ndBlkSpclPckProviCd;
		this.imdgUnNoSfx = imdgUnNoSfx;
		this.cfrPhysSteCd = cfrPhysSteCd;
		this.n2ndCfrIbcInstrCd = n2ndCfrIbcInstrCd;
		this.n2ndCfrStwgCd = n2ndCfrStwgCd;
		this.cfrMrnPolutCd = cfrMrnPolutCd;
		this.n1stCfrIbcInstrCd = n1stCfrIbcInstrCd;
		this.n1stBlkPckInstrCd = n1stBlkPckInstrCd;
		this.n5thBlkSpclPckProviCd = n5thBlkSpclPckProviCd;
		this.n1stNonBlkSpclPckProviCd = n1stNonBlkSpclPckProviCd;
		this.n1stCgoVslCfrStwgCd = n1stCgoVslCfrStwgCd;
		this.n4thCfrIbcProviCd = n4thCfrIbcProviCd;
		this.n2ndCgoVslCfrStwgCd = n2ndCgoVslCfrStwgCd;
		this.n1stCfrLblCd = n1stCfrLblCd;
		this.cfrTecNmReqDesc = cfrTecNmReqDesc;
		this.n8thCfrStwgCd = n8thCfrStwgCd;
		this.n4thCfrStwgCd = n4thCfrStwgCd;
		this.n2ndCfrSpclProviCd = n2ndCfrSpclProviCd;
		this.n2ndCfrLblCd = n2ndCfrLblCd;
		this.n3rdCfrStwgCateCd = n3rdCfrStwgCateCd;
		this.otrCfrStwgCateCd = otrCfrStwgCateCd;
		this.n3rdNonBlkPckInstrCd = n3rdNonBlkPckInstrCd;
		this.n4thCfrLblCd = n4thCfrLblCd;
		this.n5thCfrStwgCd = n5thCfrStwgCd;
		this.cfrPfxNo = cfrPfxNo;
		this.prpShpNm = prpShpNm;
		this.n2ndCfrSymCd = n2ndCfrSymCd;
		this.n8thBlkSpclPckProviCd = n8thBlkSpclPckProviCd;
		this.n4thCfrSymCd = n4thCfrSymCd;
		this.n2ndNonBlkPckInstrCd = n2ndNonBlkPckInstrCd;
		this.cfrClssForSegrCd = cfrClssForSegrCd;
		this.n2ndCfrIbcProviCd = n2ndCfrIbcProviCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("cfr_clss_segr_expt_cd", getCfrClssSegrExptCd());
		this.hashColumns.put("cfr_lmt_qty_meas_ut_cd", getCfrLmtQtyMeasUtCd());
		this.hashColumns.put("imdg_un_no_seq", getImdgUnNoSeq());
		this.hashColumns.put("cfr_pck_grp_cd", getCfrPckGrpCd());
		this.hashColumns.put("n1st_cfr_instr_provi_cd", getN1stCfrInstrProviCd());
		this.hashColumns.put("n4th_blk_pck_instr_cd", getN4thBlkPckInstrCd());
		this.hashColumns.put("n7th_cfr_stwg_cd", getN7thCfrStwgCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("n1st_blk_spcl_pck_provi_cd", getN1stBlkSpclPckProviCd());
		this.hashColumns.put("n3rd_cfr_spcl_provi_cd", getN3rdCfrSpclProviCd());
		this.hashColumns.put("n4th_cfr_instr_provi_cd", getN4thCfrInstrProviCd());
		this.hashColumns.put("n1st_cfr_spcl_provi_cd", getN1stCfrSpclProviCd());
		this.hashColumns.put("n3rd_cfr_lbl_cd", getN3rdCfrLblCd());
		this.hashColumns.put("cfr_rail_air_cgo_lmt_desc", getCfrRailAirCgoLmtDesc());
		this.hashColumns.put("n4th_blk_spcl_pck_provi_cd", getN4thBlkSpclPckProviCd());
		this.hashColumns.put("n4th_cfr_spcl_provi_cd", getN4thCfrSpclProviCd());
		this.hashColumns.put("cfr_rpt_qty_ctnt", getCfrRptQtyCtnt());
		this.hashColumns.put("n6th_cfr_instr_provi_cd", getN6thCfrInstrProviCd());
		this.hashColumns.put("n6th_cfr_stwg_cd", getN6thCfrStwgCd());
		this.hashColumns.put("cfr_psn_inh_hzd_zn_cd", getCfrPsnInhHzdZnCd());
		this.hashColumns.put("cfr_segr_grp_cd_val_desc", getCfrSegrGrpCdValDesc());
		this.hashColumns.put("n1st_cfr_sym_cd", getN1stCfrSymCd());
		this.hashColumns.put("n1st_cfr_stwg_cate_cd", getN1stCfrStwgCateCd());
		this.hashColumns.put("n2nd_psng_vsl_cfr_stwg_cd", getN2ndPsngVslCfrStwgCd());
		this.hashColumns.put("n5th_cfr_spcl_provi_cd", getN5thCfrSpclProviCd());
		this.hashColumns.put("n3rd_cfr_instr_provi_cd", getN3rdCfrInstrProviCd());
		this.hashColumns.put("n2nd_non_blk_spcl_pck_provi_cd", getN2ndNonBlkSpclPckProviCd());
		this.hashColumns.put("n1st_non_blk_pck_instr_cd", getN1stNonBlkPckInstrCd());
		this.hashColumns.put("n1st_psng_vsl_cfr_stwg_cd", getN1stPsngVslCfrStwgCd());
		this.hashColumns.put("n7th_blk_spcl_pck_provi_cd", getN7thBlkSpclPckProviCd());
		this.hashColumns.put("n5th_non_blk_spcl_pck_provi_cd", getN5thNonBlkSpclPckProviCd());
		this.hashColumns.put("n3rd_blk_pck_instr_cd", getN3rdBlkPckInstrCd());
		this.hashColumns.put("n3rd_non_blk_spcl_pck_provi_cd", getN3rdNonBlkSpclPckProviCd());
		this.hashColumns.put("n3rd_cfr_stwg_cd", getN3rdCfrStwgCd());
		this.hashColumns.put("n2nd_cfr_stwg_cate_cd", getN2ndCfrStwgCateCd());
		this.hashColumns.put("cfr_regu_no", getCfrReguNo());
		this.hashColumns.put("n4th_non_blk_pck_instr_cd", getN4thNonBlkPckInstrCd());
		this.hashColumns.put("cfr_lmt_qty_ctnt", getCfrLmtQtyCtnt());
		this.hashColumns.put("n1st_cfr_stwg_cd", getN1stCfrStwgCd());
		this.hashColumns.put("n9th_blk_spcl_pck_provi_cd", getN9thBlkSpclPckProviCd());
		this.hashColumns.put("n4th_non_blk_spcl_pck_provi_cd", getN4thNonBlkSpclPckProviCd());
		this.hashColumns.put("n6th_blk_spcl_pck_provi_cd", getN6thBlkSpclPckProviCd());
		this.hashColumns.put("n3rd_cfr_ibc_provi_cd", getN3rdCfrIbcProviCd());
		this.hashColumns.put("n5th_cfr_instr_provi_cd", getN5thCfrInstrProviCd());
		this.hashColumns.put("cfr_expt_qty_cd", getCfrExptQtyCd());
		this.hashColumns.put("n2nd_blk_pck_instr_cd", getN2ndBlkPckInstrCd());
		this.hashColumns.put("cd_vari_no", getCdVariNo());
		this.hashColumns.put("cfr_emer_rspn_gid_no", getCfrEmerRspnGidNo());
		this.hashColumns.put("n1st_cfr_ibc_provi_cd", getN1stCfrIbcProviCd());
		this.hashColumns.put("imdg_amdt_no", getImdgAmdtNo());
		this.hashColumns.put("n3rd_blk_spcl_pck_provi_cd", getN3rdBlkSpclPckProviCd());
		this.hashColumns.put("cfr_rail_air_psng_lmt_desc", getCfrRailAirPsngLmtDesc());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("n2nd_cfr_instr_provi_cd", getN2ndCfrInstrProviCd());
		this.hashColumns.put("cfr_tnk_instr_cd", getCfrTnkInstrCd());
		this.hashColumns.put("prp_shp_nm_var_rmk", getPrpShpNmVarRmk());
		this.hashColumns.put("n3rd_cfr_sym_cd", getN3rdCfrSymCd());
		this.hashColumns.put("cfr_un_no", getCfrUnNo());
		this.hashColumns.put("n9th_cfr_stwg_cd", getN9thCfrStwgCd());
		this.hashColumns.put("n2nd_blk_spcl_pck_provi_cd", getN2ndBlkSpclPckProviCd());
		this.hashColumns.put("imdg_un_no_sfx", getImdgUnNoSfx());
		this.hashColumns.put("cfr_phys_ste_cd", getCfrPhysSteCd());
		this.hashColumns.put("n2nd_cfr_ibc_instr_cd", getN2ndCfrIbcInstrCd());
		this.hashColumns.put("n2nd_cfr_stwg_cd", getN2ndCfrStwgCd());
		this.hashColumns.put("cfr_mrn_polut_cd", getCfrMrnPolutCd());
		this.hashColumns.put("n1st_cfr_ibc_instr_cd", getN1stCfrIbcInstrCd());
		this.hashColumns.put("n1st_blk_pck_instr_cd", getN1stBlkPckInstrCd());
		this.hashColumns.put("n5th_blk_spcl_pck_provi_cd", getN5thBlkSpclPckProviCd());
		this.hashColumns.put("n1st_non_blk_spcl_pck_provi_cd", getN1stNonBlkSpclPckProviCd());
		this.hashColumns.put("n1st_cgo_vsl_cfr_stwg_cd", getN1stCgoVslCfrStwgCd());
		this.hashColumns.put("n4th_cfr_ibc_provi_cd", getN4thCfrIbcProviCd());
		this.hashColumns.put("n2nd_cgo_vsl_cfr_stwg_cd", getN2ndCgoVslCfrStwgCd());
		this.hashColumns.put("n1st_cfr_lbl_cd", getN1stCfrLblCd());
		this.hashColumns.put("cfr_tec_nm_req_desc", getCfrTecNmReqDesc());
		this.hashColumns.put("n8th_cfr_stwg_cd", getN8thCfrStwgCd());
		this.hashColumns.put("n4th_cfr_stwg_cd", getN4thCfrStwgCd());
		this.hashColumns.put("n2nd_cfr_spcl_provi_cd", getN2ndCfrSpclProviCd());
		this.hashColumns.put("n2nd_cfr_lbl_cd", getN2ndCfrLblCd());
		this.hashColumns.put("n3rd_cfr_stwg_cate_cd", getN3rdCfrStwgCateCd());
		this.hashColumns.put("otr_cfr_stwg_cate_cd", getOtrCfrStwgCateCd());
		this.hashColumns.put("n3rd_non_blk_pck_instr_cd", getN3rdNonBlkPckInstrCd());
		this.hashColumns.put("n4th_cfr_lbl_cd", getN4thCfrLblCd());
		this.hashColumns.put("n5th_cfr_stwg_cd", getN5thCfrStwgCd());
		this.hashColumns.put("cfr_pfx_no", getCfrPfxNo());
		this.hashColumns.put("prp_shp_nm", getPrpShpNm());
		this.hashColumns.put("n2nd_cfr_sym_cd", getN2ndCfrSymCd());
		this.hashColumns.put("n8th_blk_spcl_pck_provi_cd", getN8thBlkSpclPckProviCd());
		this.hashColumns.put("n4th_cfr_sym_cd", getN4thCfrSymCd());
		this.hashColumns.put("n2nd_non_blk_pck_instr_cd", getN2ndNonBlkPckInstrCd());
		this.hashColumns.put("cfr_clss_for_segr_cd", getCfrClssForSegrCd());
		this.hashColumns.put("n2nd_cfr_ibc_provi_cd", getN2ndCfrIbcProviCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("cfr_clss_segr_expt_cd", "cfrClssSegrExptCd");
		this.hashFields.put("cfr_lmt_qty_meas_ut_cd", "cfrLmtQtyMeasUtCd");
		this.hashFields.put("imdg_un_no_seq", "imdgUnNoSeq");
		this.hashFields.put("cfr_pck_grp_cd", "cfrPckGrpCd");
		this.hashFields.put("n1st_cfr_instr_provi_cd", "n1stCfrInstrProviCd");
		this.hashFields.put("n4th_blk_pck_instr_cd", "n4thBlkPckInstrCd");
		this.hashFields.put("n7th_cfr_stwg_cd", "n7thCfrStwgCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("n1st_blk_spcl_pck_provi_cd", "n1stBlkSpclPckProviCd");
		this.hashFields.put("n3rd_cfr_spcl_provi_cd", "n3rdCfrSpclProviCd");
		this.hashFields.put("n4th_cfr_instr_provi_cd", "n4thCfrInstrProviCd");
		this.hashFields.put("n1st_cfr_spcl_provi_cd", "n1stCfrSpclProviCd");
		this.hashFields.put("n3rd_cfr_lbl_cd", "n3rdCfrLblCd");
		this.hashFields.put("cfr_rail_air_cgo_lmt_desc", "cfrRailAirCgoLmtDesc");
		this.hashFields.put("n4th_blk_spcl_pck_provi_cd", "n4thBlkSpclPckProviCd");
		this.hashFields.put("n4th_cfr_spcl_provi_cd", "n4thCfrSpclProviCd");
		this.hashFields.put("cfr_rpt_qty_ctnt", "cfrRptQtyCtnt");
		this.hashFields.put("n6th_cfr_instr_provi_cd", "n6thCfrInstrProviCd");
		this.hashFields.put("n6th_cfr_stwg_cd", "n6thCfrStwgCd");
		this.hashFields.put("cfr_psn_inh_hzd_zn_cd", "cfrPsnInhHzdZnCd");
		this.hashFields.put("cfr_segr_grp_cd_val_desc", "cfrSegrGrpCdValDesc");
		this.hashFields.put("n1st_cfr_sym_cd", "n1stCfrSymCd");
		this.hashFields.put("n1st_cfr_stwg_cate_cd", "n1stCfrStwgCateCd");
		this.hashFields.put("n2nd_psng_vsl_cfr_stwg_cd", "n2ndPsngVslCfrStwgCd");
		this.hashFields.put("n5th_cfr_spcl_provi_cd", "n5thCfrSpclProviCd");
		this.hashFields.put("n3rd_cfr_instr_provi_cd", "n3rdCfrInstrProviCd");
		this.hashFields.put("n2nd_non_blk_spcl_pck_provi_cd", "n2ndNonBlkSpclPckProviCd");
		this.hashFields.put("n1st_non_blk_pck_instr_cd", "n1stNonBlkPckInstrCd");
		this.hashFields.put("n1st_psng_vsl_cfr_stwg_cd", "n1stPsngVslCfrStwgCd");
		this.hashFields.put("n7th_blk_spcl_pck_provi_cd", "n7thBlkSpclPckProviCd");
		this.hashFields.put("n5th_non_blk_spcl_pck_provi_cd", "n5thNonBlkSpclPckProviCd");
		this.hashFields.put("n3rd_blk_pck_instr_cd", "n3rdBlkPckInstrCd");
		this.hashFields.put("n3rd_non_blk_spcl_pck_provi_cd", "n3rdNonBlkSpclPckProviCd");
		this.hashFields.put("n3rd_cfr_stwg_cd", "n3rdCfrStwgCd");
		this.hashFields.put("n2nd_cfr_stwg_cate_cd", "n2ndCfrStwgCateCd");
		this.hashFields.put("cfr_regu_no", "cfrReguNo");
		this.hashFields.put("n4th_non_blk_pck_instr_cd", "n4thNonBlkPckInstrCd");
		this.hashFields.put("cfr_lmt_qty_ctnt", "cfrLmtQtyCtnt");
		this.hashFields.put("n1st_cfr_stwg_cd", "n1stCfrStwgCd");
		this.hashFields.put("n9th_blk_spcl_pck_provi_cd", "n9thBlkSpclPckProviCd");
		this.hashFields.put("n4th_non_blk_spcl_pck_provi_cd", "n4thNonBlkSpclPckProviCd");
		this.hashFields.put("n6th_blk_spcl_pck_provi_cd", "n6thBlkSpclPckProviCd");
		this.hashFields.put("n3rd_cfr_ibc_provi_cd", "n3rdCfrIbcProviCd");
		this.hashFields.put("n5th_cfr_instr_provi_cd", "n5thCfrInstrProviCd");
		this.hashFields.put("cfr_expt_qty_cd", "cfrExptQtyCd");
		this.hashFields.put("n2nd_blk_pck_instr_cd", "n2ndBlkPckInstrCd");
		this.hashFields.put("cd_vari_no", "cdVariNo");
		this.hashFields.put("cfr_emer_rspn_gid_no", "cfrEmerRspnGidNo");
		this.hashFields.put("n1st_cfr_ibc_provi_cd", "n1stCfrIbcProviCd");
		this.hashFields.put("imdg_amdt_no", "imdgAmdtNo");
		this.hashFields.put("n3rd_blk_spcl_pck_provi_cd", "n3rdBlkSpclPckProviCd");
		this.hashFields.put("cfr_rail_air_psng_lmt_desc", "cfrRailAirPsngLmtDesc");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("n2nd_cfr_instr_provi_cd", "n2ndCfrInstrProviCd");
		this.hashFields.put("cfr_tnk_instr_cd", "cfrTnkInstrCd");
		this.hashFields.put("prp_shp_nm_var_rmk", "prpShpNmVarRmk");
		this.hashFields.put("n3rd_cfr_sym_cd", "n3rdCfrSymCd");
		this.hashFields.put("cfr_un_no", "cfrUnNo");
		this.hashFields.put("n9th_cfr_stwg_cd", "n9thCfrStwgCd");
		this.hashFields.put("n2nd_blk_spcl_pck_provi_cd", "n2ndBlkSpclPckProviCd");
		this.hashFields.put("imdg_un_no_sfx", "imdgUnNoSfx");
		this.hashFields.put("cfr_phys_ste_cd", "cfrPhysSteCd");
		this.hashFields.put("n2nd_cfr_ibc_instr_cd", "n2ndCfrIbcInstrCd");
		this.hashFields.put("n2nd_cfr_stwg_cd", "n2ndCfrStwgCd");
		this.hashFields.put("cfr_mrn_polut_cd", "cfrMrnPolutCd");
		this.hashFields.put("n1st_cfr_ibc_instr_cd", "n1stCfrIbcInstrCd");
		this.hashFields.put("n1st_blk_pck_instr_cd", "n1stBlkPckInstrCd");
		this.hashFields.put("n5th_blk_spcl_pck_provi_cd", "n5thBlkSpclPckProviCd");
		this.hashFields.put("n1st_non_blk_spcl_pck_provi_cd", "n1stNonBlkSpclPckProviCd");
		this.hashFields.put("n1st_cgo_vsl_cfr_stwg_cd", "n1stCgoVslCfrStwgCd");
		this.hashFields.put("n4th_cfr_ibc_provi_cd", "n4thCfrIbcProviCd");
		this.hashFields.put("n2nd_cgo_vsl_cfr_stwg_cd", "n2ndCgoVslCfrStwgCd");
		this.hashFields.put("n1st_cfr_lbl_cd", "n1stCfrLblCd");
		this.hashFields.put("cfr_tec_nm_req_desc", "cfrTecNmReqDesc");
		this.hashFields.put("n8th_cfr_stwg_cd", "n8thCfrStwgCd");
		this.hashFields.put("n4th_cfr_stwg_cd", "n4thCfrStwgCd");
		this.hashFields.put("n2nd_cfr_spcl_provi_cd", "n2ndCfrSpclProviCd");
		this.hashFields.put("n2nd_cfr_lbl_cd", "n2ndCfrLblCd");
		this.hashFields.put("n3rd_cfr_stwg_cate_cd", "n3rdCfrStwgCateCd");
		this.hashFields.put("otr_cfr_stwg_cate_cd", "otrCfrStwgCateCd");
		this.hashFields.put("n3rd_non_blk_pck_instr_cd", "n3rdNonBlkPckInstrCd");
		this.hashFields.put("n4th_cfr_lbl_cd", "n4thCfrLblCd");
		this.hashFields.put("n5th_cfr_stwg_cd", "n5thCfrStwgCd");
		this.hashFields.put("cfr_pfx_no", "cfrPfxNo");
		this.hashFields.put("prp_shp_nm", "prpShpNm");
		this.hashFields.put("n2nd_cfr_sym_cd", "n2ndCfrSymCd");
		this.hashFields.put("n8th_blk_spcl_pck_provi_cd", "n8thBlkSpclPckProviCd");
		this.hashFields.put("n4th_cfr_sym_cd", "n4thCfrSymCd");
		this.hashFields.put("n2nd_non_blk_pck_instr_cd", "n2ndNonBlkPckInstrCd");
		this.hashFields.put("cfr_clss_for_segr_cd", "cfrClssForSegrCd");
		this.hashFields.put("n2nd_cfr_ibc_provi_cd", "n2ndCfrIbcProviCd");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return cfrClssSegrExptCd
	 */
	public String getCfrClssSegrExptCd() {
		return this.cfrClssSegrExptCd;
	}
	
	/**
	 * Column Info
	 * @return cfrLmtQtyMeasUtCd
	 */
	public String getCfrLmtQtyMeasUtCd() {
		return this.cfrLmtQtyMeasUtCd;
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
	 * @return cfrPckGrpCd
	 */
	public String getCfrPckGrpCd() {
		return this.cfrPckGrpCd;
	}
	
	/**
	 * Column Info
	 * @return n1stCfrInstrProviCd
	 */
	public String getN1stCfrInstrProviCd() {
		return this.n1stCfrInstrProviCd;
	}
	
	/**
	 * Column Info
	 * @return n4thBlkPckInstrCd
	 */
	public String getN4thBlkPckInstrCd() {
		return this.n4thBlkPckInstrCd;
	}
	
	/**
	 * Column Info
	 * @return n7thCfrStwgCd
	 */
	public String getN7thCfrStwgCd() {
		return this.n7thCfrStwgCd;
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
	 * @return n1stBlkSpclPckProviCd
	 */
	public String getN1stBlkSpclPckProviCd() {
		return this.n1stBlkSpclPckProviCd;
	}
	
	/**
	 * Column Info
	 * @return n3rdCfrSpclProviCd
	 */
	public String getN3rdCfrSpclProviCd() {
		return this.n3rdCfrSpclProviCd;
	}
	
	/**
	 * Column Info
	 * @return n4thCfrInstrProviCd
	 */
	public String getN4thCfrInstrProviCd() {
		return this.n4thCfrInstrProviCd;
	}
	
	/**
	 * Column Info
	 * @return n1stCfrSpclProviCd
	 */
	public String getN1stCfrSpclProviCd() {
		return this.n1stCfrSpclProviCd;
	}
	
	/**
	 * Column Info
	 * @return n3rdCfrLblCd
	 */
	public String getN3rdCfrLblCd() {
		return this.n3rdCfrLblCd;
	}
	
	/**
	 * Column Info
	 * @return cfrRailAirCgoLmtDesc
	 */
	public String getCfrRailAirCgoLmtDesc() {
		return this.cfrRailAirCgoLmtDesc;
	}
	
	/**
	 * Column Info
	 * @return n4thBlkSpclPckProviCd
	 */
	public String getN4thBlkSpclPckProviCd() {
		return this.n4thBlkSpclPckProviCd;
	}
	
	/**
	 * Column Info
	 * @return n4thCfrSpclProviCd
	 */
	public String getN4thCfrSpclProviCd() {
		return this.n4thCfrSpclProviCd;
	}
	
	/**
	 * Column Info
	 * @return cfrRptQtyCtnt
	 */
	public String getCfrRptQtyCtnt() {
		return this.cfrRptQtyCtnt;
	}
	
	/**
	 * Column Info
	 * @return n6thCfrInstrProviCd
	 */
	public String getN6thCfrInstrProviCd() {
		return this.n6thCfrInstrProviCd;
	}
	
	/**
	 * Column Info
	 * @return n6thCfrStwgCd
	 */
	public String getN6thCfrStwgCd() {
		return this.n6thCfrStwgCd;
	}
	
	/**
	 * Column Info
	 * @return cfrPsnInhHzdZnCd
	 */
	public String getCfrPsnInhHzdZnCd() {
		return this.cfrPsnInhHzdZnCd;
	}
	
	/**
	 * Column Info
	 * @return cfrSegrGrpCdValDesc
	 */
	public String getCfrSegrGrpCdValDesc() {
		return this.cfrSegrGrpCdValDesc;
	}
	
	/**
	 * Column Info
	 * @return n1stCfrSymCd
	 */
	public String getN1stCfrSymCd() {
		return this.n1stCfrSymCd;
	}
	
	/**
	 * Column Info
	 * @return n1stCfrStwgCateCd
	 */
	public String getN1stCfrStwgCateCd() {
		return this.n1stCfrStwgCateCd;
	}
	
	/**
	 * Column Info
	 * @return n2ndPsngVslCfrStwgCd
	 */
	public String getN2ndPsngVslCfrStwgCd() {
		return this.n2ndPsngVslCfrStwgCd;
	}
	
	/**
	 * Column Info
	 * @return n5thCfrSpclProviCd
	 */
	public String getN5thCfrSpclProviCd() {
		return this.n5thCfrSpclProviCd;
	}
	
	/**
	 * Column Info
	 * @return n3rdCfrInstrProviCd
	 */
	public String getN3rdCfrInstrProviCd() {
		return this.n3rdCfrInstrProviCd;
	}
	
	/**
	 * Column Info
	 * @return n2ndNonBlkSpclPckProviCd
	 */
	public String getN2ndNonBlkSpclPckProviCd() {
		return this.n2ndNonBlkSpclPckProviCd;
	}
	
	/**
	 * Column Info
	 * @return n1stNonBlkPckInstrCd
	 */
	public String getN1stNonBlkPckInstrCd() {
		return this.n1stNonBlkPckInstrCd;
	}
	
	/**
	 * Column Info
	 * @return n1stPsngVslCfrStwgCd
	 */
	public String getN1stPsngVslCfrStwgCd() {
		return this.n1stPsngVslCfrStwgCd;
	}
	
	/**
	 * Column Info
	 * @return n7thBlkSpclPckProviCd
	 */
	public String getN7thBlkSpclPckProviCd() {
		return this.n7thBlkSpclPckProviCd;
	}
	
	/**
	 * Column Info
	 * @return n5thNonBlkSpclPckProviCd
	 */
	public String getN5thNonBlkSpclPckProviCd() {
		return this.n5thNonBlkSpclPckProviCd;
	}
	
	/**
	 * Column Info
	 * @return n3rdBlkPckInstrCd
	 */
	public String getN3rdBlkPckInstrCd() {
		return this.n3rdBlkPckInstrCd;
	}
	
	/**
	 * Column Info
	 * @return n3rdNonBlkSpclPckProviCd
	 */
	public String getN3rdNonBlkSpclPckProviCd() {
		return this.n3rdNonBlkSpclPckProviCd;
	}
	
	/**
	 * Column Info
	 * @return n3rdCfrStwgCd
	 */
	public String getN3rdCfrStwgCd() {
		return this.n3rdCfrStwgCd;
	}
	
	/**
	 * Column Info
	 * @return n2ndCfrStwgCateCd
	 */
	public String getN2ndCfrStwgCateCd() {
		return this.n2ndCfrStwgCateCd;
	}
	
	/**
	 * Column Info
	 * @return cfrReguNo
	 */
	public String getCfrReguNo() {
		return this.cfrReguNo;
	}
	
	/**
	 * Column Info
	 * @return n4thNonBlkPckInstrCd
	 */
	public String getN4thNonBlkPckInstrCd() {
		return this.n4thNonBlkPckInstrCd;
	}
	
	/**
	 * Column Info
	 * @return cfrLmtQtyCtnt
	 */
	public String getCfrLmtQtyCtnt() {
		return this.cfrLmtQtyCtnt;
	}
	
	/**
	 * Column Info
	 * @return n1stCfrStwgCd
	 */
	public String getN1stCfrStwgCd() {
		return this.n1stCfrStwgCd;
	}
	
	/**
	 * Column Info
	 * @return n9thBlkSpclPckProviCd
	 */
	public String getN9thBlkSpclPckProviCd() {
		return this.n9thBlkSpclPckProviCd;
	}
	
	/**
	 * Column Info
	 * @return n4thNonBlkSpclPckProviCd
	 */
	public String getN4thNonBlkSpclPckProviCd() {
		return this.n4thNonBlkSpclPckProviCd;
	}
	
	/**
	 * Column Info
	 * @return n6thBlkSpclPckProviCd
	 */
	public String getN6thBlkSpclPckProviCd() {
		return this.n6thBlkSpclPckProviCd;
	}
	
	/**
	 * Column Info
	 * @return n3rdCfrIbcProviCd
	 */
	public String getN3rdCfrIbcProviCd() {
		return this.n3rdCfrIbcProviCd;
	}
	
	/**
	 * Column Info
	 * @return n5thCfrInstrProviCd
	 */
	public String getN5thCfrInstrProviCd() {
		return this.n5thCfrInstrProviCd;
	}
	
	/**
	 * Column Info
	 * @return cfrExptQtyCd
	 */
	public String getCfrExptQtyCd() {
		return this.cfrExptQtyCd;
	}
	
	/**
	 * Column Info
	 * @return n2ndBlkPckInstrCd
	 */
	public String getN2ndBlkPckInstrCd() {
		return this.n2ndBlkPckInstrCd;
	}
	
	/**
	 * Column Info
	 * @return cdVariNo
	 */
	public String getCdVariNo() {
		return this.cdVariNo;
	}
	
	/**
	 * Column Info
	 * @return cfrEmerRspnGidNo
	 */
	public String getCfrEmerRspnGidNo() {
		return this.cfrEmerRspnGidNo;
	}
	
	/**
	 * Column Info
	 * @return n1stCfrIbcProviCd
	 */
	public String getN1stCfrIbcProviCd() {
		return this.n1stCfrIbcProviCd;
	}
	
	/**
	 * Column Info
	 * @return imdgAmdtNo
	 */
	public String getImdgAmdtNo() {
		return this.imdgAmdtNo;
	}
	
	/**
	 * Column Info
	 * @return n3rdBlkSpclPckProviCd
	 */
	public String getN3rdBlkSpclPckProviCd() {
		return this.n3rdBlkSpclPckProviCd;
	}
	
	/**
	 * Column Info
	 * @return cfrRailAirPsngLmtDesc
	 */
	public String getCfrRailAirPsngLmtDesc() {
		return this.cfrRailAirPsngLmtDesc;
	}
	
	/**
	 * VO Data Value( C:Creation, U:Update, D:Delete )
	 * @return ibflag
	 */
	public String getIbflag() {
		return this.ibflag;
	}
	
	/**
	 * Column Info
	 * @return n2ndCfrInstrProviCd
	 */
	public String getN2ndCfrInstrProviCd() {
		return this.n2ndCfrInstrProviCd;
	}
	
	/**
	 * Column Info
	 * @return cfrTnkInstrCd
	 */
	public String getCfrTnkInstrCd() {
		return this.cfrTnkInstrCd;
	}
	
	/**
	 * Column Info
	 * @return prpShpNmVarRmk
	 */
	public String getPrpShpNmVarRmk() {
		return this.prpShpNmVarRmk;
	}
	
	/**
	 * Column Info
	 * @return n3rdCfrSymCd
	 */
	public String getN3rdCfrSymCd() {
		return this.n3rdCfrSymCd;
	}
	
	/**
	 * Column Info
	 * @return cfrUnNo
	 */
	public String getCfrUnNo() {
		return this.cfrUnNo;
	}
	
	/**
	 * Column Info
	 * @return n9thCfrStwgCd
	 */
	public String getN9thCfrStwgCd() {
		return this.n9thCfrStwgCd;
	}
	
	/**
	 * Column Info
	 * @return n2ndBlkSpclPckProviCd
	 */
	public String getN2ndBlkSpclPckProviCd() {
		return this.n2ndBlkSpclPckProviCd;
	}
	
	/**
	 * Column Info
	 * @return imdgUnNoSfx
	 */
	public String getImdgUnNoSfx() {
		return this.imdgUnNoSfx;
	}
	
	/**
	 * Column Info
	 * @return cfrPhysSteCd
	 */
	public String getCfrPhysSteCd() {
		return this.cfrPhysSteCd;
	}
	
	/**
	 * Column Info
	 * @return n2ndCfrIbcInstrCd
	 */
	public String getN2ndCfrIbcInstrCd() {
		return this.n2ndCfrIbcInstrCd;
	}
	
	/**
	 * Column Info
	 * @return n2ndCfrStwgCd
	 */
	public String getN2ndCfrStwgCd() {
		return this.n2ndCfrStwgCd;
	}
	
	/**
	 * Column Info
	 * @return cfrMrnPolutCd
	 */
	public String getCfrMrnPolutCd() {
		return this.cfrMrnPolutCd;
	}
	
	/**
	 * Column Info
	 * @return n1stCfrIbcInstrCd
	 */
	public String getN1stCfrIbcInstrCd() {
		return this.n1stCfrIbcInstrCd;
	}
	
	/**
	 * Column Info
	 * @return n1stBlkPckInstrCd
	 */
	public String getN1stBlkPckInstrCd() {
		return this.n1stBlkPckInstrCd;
	}
	
	/**
	 * Column Info
	 * @return n5thBlkSpclPckProviCd
	 */
	public String getN5thBlkSpclPckProviCd() {
		return this.n5thBlkSpclPckProviCd;
	}
	
	/**
	 * Column Info
	 * @return n1stNonBlkSpclPckProviCd
	 */
	public String getN1stNonBlkSpclPckProviCd() {
		return this.n1stNonBlkSpclPckProviCd;
	}
	
	/**
	 * Column Info
	 * @return n1stCgoVslCfrStwgCd
	 */
	public String getN1stCgoVslCfrStwgCd() {
		return this.n1stCgoVslCfrStwgCd;
	}
	
	/**
	 * Column Info
	 * @return n4thCfrIbcProviCd
	 */
	public String getN4thCfrIbcProviCd() {
		return this.n4thCfrIbcProviCd;
	}
	
	/**
	 * Column Info
	 * @return n2ndCgoVslCfrStwgCd
	 */
	public String getN2ndCgoVslCfrStwgCd() {
		return this.n2ndCgoVslCfrStwgCd;
	}
	
	/**
	 * Column Info
	 * @return n1stCfrLblCd
	 */
	public String getN1stCfrLblCd() {
		return this.n1stCfrLblCd;
	}
	
	/**
	 * Column Info
	 * @return cfrTecNmReqDesc
	 */
	public String getCfrTecNmReqDesc() {
		return this.cfrTecNmReqDesc;
	}
	
	/**
	 * Column Info
	 * @return n8thCfrStwgCd
	 */
	public String getN8thCfrStwgCd() {
		return this.n8thCfrStwgCd;
	}
	
	/**
	 * Column Info
	 * @return n4thCfrStwgCd
	 */
	public String getN4thCfrStwgCd() {
		return this.n4thCfrStwgCd;
	}
	
	/**
	 * Column Info
	 * @return n2ndCfrSpclProviCd
	 */
	public String getN2ndCfrSpclProviCd() {
		return this.n2ndCfrSpclProviCd;
	}
	
	/**
	 * Column Info
	 * @return n2ndCfrLblCd
	 */
	public String getN2ndCfrLblCd() {
		return this.n2ndCfrLblCd;
	}
	
	/**
	 * Column Info
	 * @return n3rdCfrStwgCateCd
	 */
	public String getN3rdCfrStwgCateCd() {
		return this.n3rdCfrStwgCateCd;
	}
	
	/**
	 * Column Info
	 * @return otrCfrStwgCateCd
	 */
	public String getOtrCfrStwgCateCd() {
		return this.otrCfrStwgCateCd;
	}
	
	/**
	 * Column Info
	 * @return n3rdNonBlkPckInstrCd
	 */
	public String getN3rdNonBlkPckInstrCd() {
		return this.n3rdNonBlkPckInstrCd;
	}
	
	/**
	 * Column Info
	 * @return n4thCfrLblCd
	 */
	public String getN4thCfrLblCd() {
		return this.n4thCfrLblCd;
	}
	
	/**
	 * Column Info
	 * @return n5thCfrStwgCd
	 */
	public String getN5thCfrStwgCd() {
		return this.n5thCfrStwgCd;
	}
	
	/**
	 * Column Info
	 * @return cfrPfxNo
	 */
	public String getCfrPfxNo() {
		return this.cfrPfxNo;
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
	 * @return n2ndCfrSymCd
	 */
	public String getN2ndCfrSymCd() {
		return this.n2ndCfrSymCd;
	}
	
	/**
	 * Column Info
	 * @return n8thBlkSpclPckProviCd
	 */
	public String getN8thBlkSpclPckProviCd() {
		return this.n8thBlkSpclPckProviCd;
	}
	
	/**
	 * Column Info
	 * @return n4thCfrSymCd
	 */
	public String getN4thCfrSymCd() {
		return this.n4thCfrSymCd;
	}
	
	/**
	 * Column Info
	 * @return n2ndNonBlkPckInstrCd
	 */
	public String getN2ndNonBlkPckInstrCd() {
		return this.n2ndNonBlkPckInstrCd;
	}
	
	/**
	 * Column Info
	 * @return cfrClssForSegrCd
	 */
	public String getCfrClssForSegrCd() {
		return this.cfrClssForSegrCd;
	}
	
	/**
	 * Column Info
	 * @return n2ndCfrIbcProviCd
	 */
	public String getN2ndCfrIbcProviCd() {
		return this.n2ndCfrIbcProviCd;
	}
	

	/**
	 * Column Info
	 * @param cfrClssSegrExptCd
	 */
	public void setCfrClssSegrExptCd(String cfrClssSegrExptCd) {
		this.cfrClssSegrExptCd = cfrClssSegrExptCd;
	}
	
	/**
	 * Column Info
	 * @param cfrLmtQtyMeasUtCd
	 */
	public void setCfrLmtQtyMeasUtCd(String cfrLmtQtyMeasUtCd) {
		this.cfrLmtQtyMeasUtCd = cfrLmtQtyMeasUtCd;
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
	 * @param cfrPckGrpCd
	 */
	public void setCfrPckGrpCd(String cfrPckGrpCd) {
		this.cfrPckGrpCd = cfrPckGrpCd;
	}
	
	/**
	 * Column Info
	 * @param n1stCfrInstrProviCd
	 */
	public void setN1stCfrInstrProviCd(String n1stCfrInstrProviCd) {
		this.n1stCfrInstrProviCd = n1stCfrInstrProviCd;
	}
	
	/**
	 * Column Info
	 * @param n4thBlkPckInstrCd
	 */
	public void setN4thBlkPckInstrCd(String n4thBlkPckInstrCd) {
		this.n4thBlkPckInstrCd = n4thBlkPckInstrCd;
	}
	
	/**
	 * Column Info
	 * @param n7thCfrStwgCd
	 */
	public void setN7thCfrStwgCd(String n7thCfrStwgCd) {
		this.n7thCfrStwgCd = n7thCfrStwgCd;
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
	 * @param n1stBlkSpclPckProviCd
	 */
	public void setN1stBlkSpclPckProviCd(String n1stBlkSpclPckProviCd) {
		this.n1stBlkSpclPckProviCd = n1stBlkSpclPckProviCd;
	}
	
	/**
	 * Column Info
	 * @param n3rdCfrSpclProviCd
	 */
	public void setN3rdCfrSpclProviCd(String n3rdCfrSpclProviCd) {
		this.n3rdCfrSpclProviCd = n3rdCfrSpclProviCd;
	}
	
	/**
	 * Column Info
	 * @param n4thCfrInstrProviCd
	 */
	public void setN4thCfrInstrProviCd(String n4thCfrInstrProviCd) {
		this.n4thCfrInstrProviCd = n4thCfrInstrProviCd;
	}
	
	/**
	 * Column Info
	 * @param n1stCfrSpclProviCd
	 */
	public void setN1stCfrSpclProviCd(String n1stCfrSpclProviCd) {
		this.n1stCfrSpclProviCd = n1stCfrSpclProviCd;
	}
	
	/**
	 * Column Info
	 * @param n3rdCfrLblCd
	 */
	public void setN3rdCfrLblCd(String n3rdCfrLblCd) {
		this.n3rdCfrLblCd = n3rdCfrLblCd;
	}
	
	/**
	 * Column Info
	 * @param cfrRailAirCgoLmtDesc
	 */
	public void setCfrRailAirCgoLmtDesc(String cfrRailAirCgoLmtDesc) {
		this.cfrRailAirCgoLmtDesc = cfrRailAirCgoLmtDesc;
	}
	
	/**
	 * Column Info
	 * @param n4thBlkSpclPckProviCd
	 */
	public void setN4thBlkSpclPckProviCd(String n4thBlkSpclPckProviCd) {
		this.n4thBlkSpclPckProviCd = n4thBlkSpclPckProviCd;
	}
	
	/**
	 * Column Info
	 * @param n4thCfrSpclProviCd
	 */
	public void setN4thCfrSpclProviCd(String n4thCfrSpclProviCd) {
		this.n4thCfrSpclProviCd = n4thCfrSpclProviCd;
	}
	
	/**
	 * Column Info
	 * @param cfrRptQtyCtnt
	 */
	public void setCfrRptQtyCtnt(String cfrRptQtyCtnt) {
		this.cfrRptQtyCtnt = cfrRptQtyCtnt;
	}
	
	/**
	 * Column Info
	 * @param n6thCfrInstrProviCd
	 */
	public void setN6thCfrInstrProviCd(String n6thCfrInstrProviCd) {
		this.n6thCfrInstrProviCd = n6thCfrInstrProviCd;
	}
	
	/**
	 * Column Info
	 * @param n6thCfrStwgCd
	 */
	public void setN6thCfrStwgCd(String n6thCfrStwgCd) {
		this.n6thCfrStwgCd = n6thCfrStwgCd;
	}
	
	/**
	 * Column Info
	 * @param cfrPsnInhHzdZnCd
	 */
	public void setCfrPsnInhHzdZnCd(String cfrPsnInhHzdZnCd) {
		this.cfrPsnInhHzdZnCd = cfrPsnInhHzdZnCd;
	}
	
	/**
	 * Column Info
	 * @param cfrSegrGrpCdValDesc
	 */
	public void setCfrSegrGrpCdValDesc(String cfrSegrGrpCdValDesc) {
		this.cfrSegrGrpCdValDesc = cfrSegrGrpCdValDesc;
	}
	
	/**
	 * Column Info
	 * @param n1stCfrSymCd
	 */
	public void setN1stCfrSymCd(String n1stCfrSymCd) {
		this.n1stCfrSymCd = n1stCfrSymCd;
	}
	
	/**
	 * Column Info
	 * @param n1stCfrStwgCateCd
	 */
	public void setN1stCfrStwgCateCd(String n1stCfrStwgCateCd) {
		this.n1stCfrStwgCateCd = n1stCfrStwgCateCd;
	}
	
	/**
	 * Column Info
	 * @param n2ndPsngVslCfrStwgCd
	 */
	public void setN2ndPsngVslCfrStwgCd(String n2ndPsngVslCfrStwgCd) {
		this.n2ndPsngVslCfrStwgCd = n2ndPsngVslCfrStwgCd;
	}
	
	/**
	 * Column Info
	 * @param n5thCfrSpclProviCd
	 */
	public void setN5thCfrSpclProviCd(String n5thCfrSpclProviCd) {
		this.n5thCfrSpclProviCd = n5thCfrSpclProviCd;
	}
	
	/**
	 * Column Info
	 * @param n3rdCfrInstrProviCd
	 */
	public void setN3rdCfrInstrProviCd(String n3rdCfrInstrProviCd) {
		this.n3rdCfrInstrProviCd = n3rdCfrInstrProviCd;
	}
	
	/**
	 * Column Info
	 * @param n2ndNonBlkSpclPckProviCd
	 */
	public void setN2ndNonBlkSpclPckProviCd(String n2ndNonBlkSpclPckProviCd) {
		this.n2ndNonBlkSpclPckProviCd = n2ndNonBlkSpclPckProviCd;
	}
	
	/**
	 * Column Info
	 * @param n1stNonBlkPckInstrCd
	 */
	public void setN1stNonBlkPckInstrCd(String n1stNonBlkPckInstrCd) {
		this.n1stNonBlkPckInstrCd = n1stNonBlkPckInstrCd;
	}
	
	/**
	 * Column Info
	 * @param n1stPsngVslCfrStwgCd
	 */
	public void setN1stPsngVslCfrStwgCd(String n1stPsngVslCfrStwgCd) {
		this.n1stPsngVslCfrStwgCd = n1stPsngVslCfrStwgCd;
	}
	
	/**
	 * Column Info
	 * @param n7thBlkSpclPckProviCd
	 */
	public void setN7thBlkSpclPckProviCd(String n7thBlkSpclPckProviCd) {
		this.n7thBlkSpclPckProviCd = n7thBlkSpclPckProviCd;
	}
	
	/**
	 * Column Info
	 * @param n5thNonBlkSpclPckProviCd
	 */
	public void setN5thNonBlkSpclPckProviCd(String n5thNonBlkSpclPckProviCd) {
		this.n5thNonBlkSpclPckProviCd = n5thNonBlkSpclPckProviCd;
	}
	
	/**
	 * Column Info
	 * @param n3rdBlkPckInstrCd
	 */
	public void setN3rdBlkPckInstrCd(String n3rdBlkPckInstrCd) {
		this.n3rdBlkPckInstrCd = n3rdBlkPckInstrCd;
	}
	
	/**
	 * Column Info
	 * @param n3rdNonBlkSpclPckProviCd
	 */
	public void setN3rdNonBlkSpclPckProviCd(String n3rdNonBlkSpclPckProviCd) {
		this.n3rdNonBlkSpclPckProviCd = n3rdNonBlkSpclPckProviCd;
	}
	
	/**
	 * Column Info
	 * @param n3rdCfrStwgCd
	 */
	public void setN3rdCfrStwgCd(String n3rdCfrStwgCd) {
		this.n3rdCfrStwgCd = n3rdCfrStwgCd;
	}
	
	/**
	 * Column Info
	 * @param n2ndCfrStwgCateCd
	 */
	public void setN2ndCfrStwgCateCd(String n2ndCfrStwgCateCd) {
		this.n2ndCfrStwgCateCd = n2ndCfrStwgCateCd;
	}
	
	/**
	 * Column Info
	 * @param cfrReguNo
	 */
	public void setCfrReguNo(String cfrReguNo) {
		this.cfrReguNo = cfrReguNo;
	}
	
	/**
	 * Column Info
	 * @param n4thNonBlkPckInstrCd
	 */
	public void setN4thNonBlkPckInstrCd(String n4thNonBlkPckInstrCd) {
		this.n4thNonBlkPckInstrCd = n4thNonBlkPckInstrCd;
	}
	
	/**
	 * Column Info
	 * @param cfrLmtQtyCtnt
	 */
	public void setCfrLmtQtyCtnt(String cfrLmtQtyCtnt) {
		this.cfrLmtQtyCtnt = cfrLmtQtyCtnt;
	}
	
	/**
	 * Column Info
	 * @param n1stCfrStwgCd
	 */
	public void setN1stCfrStwgCd(String n1stCfrStwgCd) {
		this.n1stCfrStwgCd = n1stCfrStwgCd;
	}
	
	/**
	 * Column Info
	 * @param n9thBlkSpclPckProviCd
	 */
	public void setN9thBlkSpclPckProviCd(String n9thBlkSpclPckProviCd) {
		this.n9thBlkSpclPckProviCd = n9thBlkSpclPckProviCd;
	}
	
	/**
	 * Column Info
	 * @param n4thNonBlkSpclPckProviCd
	 */
	public void setN4thNonBlkSpclPckProviCd(String n4thNonBlkSpclPckProviCd) {
		this.n4thNonBlkSpclPckProviCd = n4thNonBlkSpclPckProviCd;
	}
	
	/**
	 * Column Info
	 * @param n6thBlkSpclPckProviCd
	 */
	public void setN6thBlkSpclPckProviCd(String n6thBlkSpclPckProviCd) {
		this.n6thBlkSpclPckProviCd = n6thBlkSpclPckProviCd;
	}
	
	/**
	 * Column Info
	 * @param n3rdCfrIbcProviCd
	 */
	public void setN3rdCfrIbcProviCd(String n3rdCfrIbcProviCd) {
		this.n3rdCfrIbcProviCd = n3rdCfrIbcProviCd;
	}
	
	/**
	 * Column Info
	 * @param n5thCfrInstrProviCd
	 */
	public void setN5thCfrInstrProviCd(String n5thCfrInstrProviCd) {
		this.n5thCfrInstrProviCd = n5thCfrInstrProviCd;
	}
	
	/**
	 * Column Info
	 * @param cfrExptQtyCd
	 */
	public void setCfrExptQtyCd(String cfrExptQtyCd) {
		this.cfrExptQtyCd = cfrExptQtyCd;
	}
	
	/**
	 * Column Info
	 * @param n2ndBlkPckInstrCd
	 */
	public void setN2ndBlkPckInstrCd(String n2ndBlkPckInstrCd) {
		this.n2ndBlkPckInstrCd = n2ndBlkPckInstrCd;
	}
	
	/**
	 * Column Info
	 * @param cdVariNo
	 */
	public void setCdVariNo(String cdVariNo) {
		this.cdVariNo = cdVariNo;
	}
	
	/**
	 * Column Info
	 * @param cfrEmerRspnGidNo
	 */
	public void setCfrEmerRspnGidNo(String cfrEmerRspnGidNo) {
		this.cfrEmerRspnGidNo = cfrEmerRspnGidNo;
	}
	
	/**
	 * Column Info
	 * @param n1stCfrIbcProviCd
	 */
	public void setN1stCfrIbcProviCd(String n1stCfrIbcProviCd) {
		this.n1stCfrIbcProviCd = n1stCfrIbcProviCd;
	}
	
	/**
	 * Column Info
	 * @param imdgAmdtNo
	 */
	public void setImdgAmdtNo(String imdgAmdtNo) {
		this.imdgAmdtNo = imdgAmdtNo;
	}
	
	/**
	 * Column Info
	 * @param n3rdBlkSpclPckProviCd
	 */
	public void setN3rdBlkSpclPckProviCd(String n3rdBlkSpclPckProviCd) {
		this.n3rdBlkSpclPckProviCd = n3rdBlkSpclPckProviCd;
	}
	
	/**
	 * Column Info
	 * @param cfrRailAirPsngLmtDesc
	 */
	public void setCfrRailAirPsngLmtDesc(String cfrRailAirPsngLmtDesc) {
		this.cfrRailAirPsngLmtDesc = cfrRailAirPsngLmtDesc;
	}
	
	/**
	 * VO Data Value( C:Creation, U:Update, D:Delete )
	 * @param ibflag
	 */
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
	}
	
	/**
	 * Column Info
	 * @param n2ndCfrInstrProviCd
	 */
	public void setN2ndCfrInstrProviCd(String n2ndCfrInstrProviCd) {
		this.n2ndCfrInstrProviCd = n2ndCfrInstrProviCd;
	}
	
	/**
	 * Column Info
	 * @param cfrTnkInstrCd
	 */
	public void setCfrTnkInstrCd(String cfrTnkInstrCd) {
		this.cfrTnkInstrCd = cfrTnkInstrCd;
	}
	
	/**
	 * Column Info
	 * @param prpShpNmVarRmk
	 */
	public void setPrpShpNmVarRmk(String prpShpNmVarRmk) {
		this.prpShpNmVarRmk = prpShpNmVarRmk;
	}
	
	/**
	 * Column Info
	 * @param n3rdCfrSymCd
	 */
	public void setN3rdCfrSymCd(String n3rdCfrSymCd) {
		this.n3rdCfrSymCd = n3rdCfrSymCd;
	}
	
	/**
	 * Column Info
	 * @param cfrUnNo
	 */
	public void setCfrUnNo(String cfrUnNo) {
		this.cfrUnNo = cfrUnNo;
	}
	
	/**
	 * Column Info
	 * @param n9thCfrStwgCd
	 */
	public void setN9thCfrStwgCd(String n9thCfrStwgCd) {
		this.n9thCfrStwgCd = n9thCfrStwgCd;
	}
	
	/**
	 * Column Info
	 * @param n2ndBlkSpclPckProviCd
	 */
	public void setN2ndBlkSpclPckProviCd(String n2ndBlkSpclPckProviCd) {
		this.n2ndBlkSpclPckProviCd = n2ndBlkSpclPckProviCd;
	}
	
	/**
	 * Column Info
	 * @param imdgUnNoSfx
	 */
	public void setImdgUnNoSfx(String imdgUnNoSfx) {
		this.imdgUnNoSfx = imdgUnNoSfx;
	}
	
	/**
	 * Column Info
	 * @param cfrPhysSteCd
	 */
	public void setCfrPhysSteCd(String cfrPhysSteCd) {
		this.cfrPhysSteCd = cfrPhysSteCd;
	}
	
	/**
	 * Column Info
	 * @param n2ndCfrIbcInstrCd
	 */
	public void setN2ndCfrIbcInstrCd(String n2ndCfrIbcInstrCd) {
		this.n2ndCfrIbcInstrCd = n2ndCfrIbcInstrCd;
	}
	
	/**
	 * Column Info
	 * @param n2ndCfrStwgCd
	 */
	public void setN2ndCfrStwgCd(String n2ndCfrStwgCd) {
		this.n2ndCfrStwgCd = n2ndCfrStwgCd;
	}
	
	/**
	 * Column Info
	 * @param cfrMrnPolutCd
	 */
	public void setCfrMrnPolutCd(String cfrMrnPolutCd) {
		this.cfrMrnPolutCd = cfrMrnPolutCd;
	}
	
	/**
	 * Column Info
	 * @param n1stCfrIbcInstrCd
	 */
	public void setN1stCfrIbcInstrCd(String n1stCfrIbcInstrCd) {
		this.n1stCfrIbcInstrCd = n1stCfrIbcInstrCd;
	}
	
	/**
	 * Column Info
	 * @param n1stBlkPckInstrCd
	 */
	public void setN1stBlkPckInstrCd(String n1stBlkPckInstrCd) {
		this.n1stBlkPckInstrCd = n1stBlkPckInstrCd;
	}
	
	/**
	 * Column Info
	 * @param n5thBlkSpclPckProviCd
	 */
	public void setN5thBlkSpclPckProviCd(String n5thBlkSpclPckProviCd) {
		this.n5thBlkSpclPckProviCd = n5thBlkSpclPckProviCd;
	}
	
	/**
	 * Column Info
	 * @param n1stNonBlkSpclPckProviCd
	 */
	public void setN1stNonBlkSpclPckProviCd(String n1stNonBlkSpclPckProviCd) {
		this.n1stNonBlkSpclPckProviCd = n1stNonBlkSpclPckProviCd;
	}
	
	/**
	 * Column Info
	 * @param n1stCgoVslCfrStwgCd
	 */
	public void setN1stCgoVslCfrStwgCd(String n1stCgoVslCfrStwgCd) {
		this.n1stCgoVslCfrStwgCd = n1stCgoVslCfrStwgCd;
	}
	
	/**
	 * Column Info
	 * @param n4thCfrIbcProviCd
	 */
	public void setN4thCfrIbcProviCd(String n4thCfrIbcProviCd) {
		this.n4thCfrIbcProviCd = n4thCfrIbcProviCd;
	}
	
	/**
	 * Column Info
	 * @param n2ndCgoVslCfrStwgCd
	 */
	public void setN2ndCgoVslCfrStwgCd(String n2ndCgoVslCfrStwgCd) {
		this.n2ndCgoVslCfrStwgCd = n2ndCgoVslCfrStwgCd;
	}
	
	/**
	 * Column Info
	 * @param n1stCfrLblCd
	 */
	public void setN1stCfrLblCd(String n1stCfrLblCd) {
		this.n1stCfrLblCd = n1stCfrLblCd;
	}
	
	/**
	 * Column Info
	 * @param cfrTecNmReqDesc
	 */
	public void setCfrTecNmReqDesc(String cfrTecNmReqDesc) {
		this.cfrTecNmReqDesc = cfrTecNmReqDesc;
	}
	
	/**
	 * Column Info
	 * @param n8thCfrStwgCd
	 */
	public void setN8thCfrStwgCd(String n8thCfrStwgCd) {
		this.n8thCfrStwgCd = n8thCfrStwgCd;
	}
	
	/**
	 * Column Info
	 * @param n4thCfrStwgCd
	 */
	public void setN4thCfrStwgCd(String n4thCfrStwgCd) {
		this.n4thCfrStwgCd = n4thCfrStwgCd;
	}
	
	/**
	 * Column Info
	 * @param n2ndCfrSpclProviCd
	 */
	public void setN2ndCfrSpclProviCd(String n2ndCfrSpclProviCd) {
		this.n2ndCfrSpclProviCd = n2ndCfrSpclProviCd;
	}
	
	/**
	 * Column Info
	 * @param n2ndCfrLblCd
	 */
	public void setN2ndCfrLblCd(String n2ndCfrLblCd) {
		this.n2ndCfrLblCd = n2ndCfrLblCd;
	}
	
	/**
	 * Column Info
	 * @param n3rdCfrStwgCateCd
	 */
	public void setN3rdCfrStwgCateCd(String n3rdCfrStwgCateCd) {
		this.n3rdCfrStwgCateCd = n3rdCfrStwgCateCd;
	}
	
	/**
	 * Column Info
	 * @param otrCfrStwgCateCd
	 */
	public void setOtrCfrStwgCateCd(String otrCfrStwgCateCd) {
		this.otrCfrStwgCateCd = otrCfrStwgCateCd;
	}
	
	/**
	 * Column Info
	 * @param n3rdNonBlkPckInstrCd
	 */
	public void setN3rdNonBlkPckInstrCd(String n3rdNonBlkPckInstrCd) {
		this.n3rdNonBlkPckInstrCd = n3rdNonBlkPckInstrCd;
	}
	
	/**
	 * Column Info
	 * @param n4thCfrLblCd
	 */
	public void setN4thCfrLblCd(String n4thCfrLblCd) {
		this.n4thCfrLblCd = n4thCfrLblCd;
	}
	
	/**
	 * Column Info
	 * @param n5thCfrStwgCd
	 */
	public void setN5thCfrStwgCd(String n5thCfrStwgCd) {
		this.n5thCfrStwgCd = n5thCfrStwgCd;
	}
	
	/**
	 * Column Info
	 * @param cfrPfxNo
	 */
	public void setCfrPfxNo(String cfrPfxNo) {
		this.cfrPfxNo = cfrPfxNo;
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
	 * @param n2ndCfrSymCd
	 */
	public void setN2ndCfrSymCd(String n2ndCfrSymCd) {
		this.n2ndCfrSymCd = n2ndCfrSymCd;
	}
	
	/**
	 * Column Info
	 * @param n8thBlkSpclPckProviCd
	 */
	public void setN8thBlkSpclPckProviCd(String n8thBlkSpclPckProviCd) {
		this.n8thBlkSpclPckProviCd = n8thBlkSpclPckProviCd;
	}
	
	/**
	 * Column Info
	 * @param n4thCfrSymCd
	 */
	public void setN4thCfrSymCd(String n4thCfrSymCd) {
		this.n4thCfrSymCd = n4thCfrSymCd;
	}
	
	/**
	 * Column Info
	 * @param n2ndNonBlkPckInstrCd
	 */
	public void setN2ndNonBlkPckInstrCd(String n2ndNonBlkPckInstrCd) {
		this.n2ndNonBlkPckInstrCd = n2ndNonBlkPckInstrCd;
	}
	
	/**
	 * Column Info
	 * @param cfrClssForSegrCd
	 */
	public void setCfrClssForSegrCd(String cfrClssForSegrCd) {
		this.cfrClssForSegrCd = cfrClssForSegrCd;
	}
	
	/**
	 * Column Info
	 * @param n2ndCfrIbcProviCd
	 */
	public void setN2ndCfrIbcProviCd(String n2ndCfrIbcProviCd) {
		this.n2ndCfrIbcProviCd = n2ndCfrIbcProviCd;
	}
	
/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		fromRequest(request,"");
	}

	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request, String prefix) {
		setCfrClssSegrExptCd(JSPUtil.getParameter(request, prefix + "cfr_clss_segr_expt_cd", ""));
		setCfrLmtQtyMeasUtCd(JSPUtil.getParameter(request, prefix + "cfr_lmt_qty_meas_ut_cd", ""));
		setImdgUnNoSeq(JSPUtil.getParameter(request, prefix + "imdg_un_no_seq", ""));
		setCfrPckGrpCd(JSPUtil.getParameter(request, prefix + "cfr_pck_grp_cd", ""));
		setN1stCfrInstrProviCd(JSPUtil.getParameter(request, prefix + "n1st_cfr_instr_provi_cd", ""));
		setN4thBlkPckInstrCd(JSPUtil.getParameter(request, prefix + "n4th_blk_pck_instr_cd", ""));
		setN7thCfrStwgCd(JSPUtil.getParameter(request, prefix + "n7th_cfr_stwg_cd", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setN1stBlkSpclPckProviCd(JSPUtil.getParameter(request, prefix + "n1st_blk_spcl_pck_provi_cd", ""));
		setN3rdCfrSpclProviCd(JSPUtil.getParameter(request, prefix + "n3rd_cfr_spcl_provi_cd", ""));
		setN4thCfrInstrProviCd(JSPUtil.getParameter(request, prefix + "n4th_cfr_instr_provi_cd", ""));
		setN1stCfrSpclProviCd(JSPUtil.getParameter(request, prefix + "n1st_cfr_spcl_provi_cd", ""));
		setN3rdCfrLblCd(JSPUtil.getParameter(request, prefix + "n3rd_cfr_lbl_cd", ""));
		setCfrRailAirCgoLmtDesc(JSPUtil.getParameter(request, prefix + "cfr_rail_air_cgo_lmt_desc", ""));
		setN4thBlkSpclPckProviCd(JSPUtil.getParameter(request, prefix + "n4th_blk_spcl_pck_provi_cd", ""));
		setN4thCfrSpclProviCd(JSPUtil.getParameter(request, prefix + "n4th_cfr_spcl_provi_cd", ""));
		setCfrRptQtyCtnt(JSPUtil.getParameter(request, prefix + "cfr_rpt_qty_ctnt", ""));
		setN6thCfrInstrProviCd(JSPUtil.getParameter(request, prefix + "n6th_cfr_instr_provi_cd", ""));
		setN6thCfrStwgCd(JSPUtil.getParameter(request, prefix + "n6th_cfr_stwg_cd", ""));
		setCfrPsnInhHzdZnCd(JSPUtil.getParameter(request, prefix + "cfr_psn_inh_hzd_zn_cd", ""));
		setCfrSegrGrpCdValDesc(JSPUtil.getParameter(request, prefix + "cfr_segr_grp_cd_val_desc", ""));
		setN1stCfrSymCd(JSPUtil.getParameter(request, prefix + "n1st_cfr_sym_cd", ""));
		setN1stCfrStwgCateCd(JSPUtil.getParameter(request, prefix + "n1st_cfr_stwg_cate_cd", ""));
		setN2ndPsngVslCfrStwgCd(JSPUtil.getParameter(request, prefix + "n2nd_psng_vsl_cfr_stwg_cd", ""));
		setN5thCfrSpclProviCd(JSPUtil.getParameter(request, prefix + "n5th_cfr_spcl_provi_cd", ""));
		setN3rdCfrInstrProviCd(JSPUtil.getParameter(request, prefix + "n3rd_cfr_instr_provi_cd", ""));
		setN2ndNonBlkSpclPckProviCd(JSPUtil.getParameter(request, prefix + "n2nd_non_blk_spcl_pck_provi_cd", ""));
		setN1stNonBlkPckInstrCd(JSPUtil.getParameter(request, prefix + "n1st_non_blk_pck_instr_cd", ""));
		setN1stPsngVslCfrStwgCd(JSPUtil.getParameter(request, prefix + "n1st_psng_vsl_cfr_stwg_cd", ""));
		setN7thBlkSpclPckProviCd(JSPUtil.getParameter(request, prefix + "n7th_blk_spcl_pck_provi_cd", ""));
		setN5thNonBlkSpclPckProviCd(JSPUtil.getParameter(request, prefix + "n5th_non_blk_spcl_pck_provi_cd", ""));
		setN3rdBlkPckInstrCd(JSPUtil.getParameter(request, prefix + "n3rd_blk_pck_instr_cd", ""));
		setN3rdNonBlkSpclPckProviCd(JSPUtil.getParameter(request, prefix + "n3rd_non_blk_spcl_pck_provi_cd", ""));
		setN3rdCfrStwgCd(JSPUtil.getParameter(request, prefix + "n3rd_cfr_stwg_cd", ""));
		setN2ndCfrStwgCateCd(JSPUtil.getParameter(request, prefix + "n2nd_cfr_stwg_cate_cd", ""));
		setCfrReguNo(JSPUtil.getParameter(request, prefix + "cfr_regu_no", ""));
		setN4thNonBlkPckInstrCd(JSPUtil.getParameter(request, prefix + "n4th_non_blk_pck_instr_cd", ""));
		setCfrLmtQtyCtnt(JSPUtil.getParameter(request, prefix + "cfr_lmt_qty_ctnt", ""));
		setN1stCfrStwgCd(JSPUtil.getParameter(request, prefix + "n1st_cfr_stwg_cd", ""));
		setN9thBlkSpclPckProviCd(JSPUtil.getParameter(request, prefix + "n9th_blk_spcl_pck_provi_cd", ""));
		setN4thNonBlkSpclPckProviCd(JSPUtil.getParameter(request, prefix + "n4th_non_blk_spcl_pck_provi_cd", ""));
		setN6thBlkSpclPckProviCd(JSPUtil.getParameter(request, prefix + "n6th_blk_spcl_pck_provi_cd", ""));
		setN3rdCfrIbcProviCd(JSPUtil.getParameter(request, prefix + "n3rd_cfr_ibc_provi_cd", ""));
		setN5thCfrInstrProviCd(JSPUtil.getParameter(request, prefix + "n5th_cfr_instr_provi_cd", ""));
		setCfrExptQtyCd(JSPUtil.getParameter(request, prefix + "cfr_expt_qty_cd", ""));
		setN2ndBlkPckInstrCd(JSPUtil.getParameter(request, prefix + "n2nd_blk_pck_instr_cd", ""));
		setCdVariNo(JSPUtil.getParameter(request, prefix + "cd_vari_no", ""));
		setCfrEmerRspnGidNo(JSPUtil.getParameter(request, prefix + "cfr_emer_rspn_gid_no", ""));
		setN1stCfrIbcProviCd(JSPUtil.getParameter(request, prefix + "n1st_cfr_ibc_provi_cd", ""));
		setImdgAmdtNo(JSPUtil.getParameter(request, prefix + "imdg_amdt_no", ""));
		setN3rdBlkSpclPckProviCd(JSPUtil.getParameter(request, prefix + "n3rd_blk_spcl_pck_provi_cd", ""));
		setCfrRailAirPsngLmtDesc(JSPUtil.getParameter(request, prefix + "cfr_rail_air_psng_lmt_desc", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setN2ndCfrInstrProviCd(JSPUtil.getParameter(request, prefix + "n2nd_cfr_instr_provi_cd", ""));
		setCfrTnkInstrCd(JSPUtil.getParameter(request, prefix + "cfr_tnk_instr_cd", ""));
		setPrpShpNmVarRmk(JSPUtil.getParameter(request, prefix + "prp_shp_nm_var_rmk", ""));
		setN3rdCfrSymCd(JSPUtil.getParameter(request, prefix + "n3rd_cfr_sym_cd", ""));
		setCfrUnNo(JSPUtil.getParameter(request, prefix + "cfr_un_no", ""));
		setN9thCfrStwgCd(JSPUtil.getParameter(request, prefix + "n9th_cfr_stwg_cd", ""));
		setN2ndBlkSpclPckProviCd(JSPUtil.getParameter(request, prefix + "n2nd_blk_spcl_pck_provi_cd", ""));
		setImdgUnNoSfx(JSPUtil.getParameter(request, prefix + "imdg_un_no_sfx", ""));
		setCfrPhysSteCd(JSPUtil.getParameter(request, prefix + "cfr_phys_ste_cd", ""));
		setN2ndCfrIbcInstrCd(JSPUtil.getParameter(request, prefix + "n2nd_cfr_ibc_instr_cd", ""));
		setN2ndCfrStwgCd(JSPUtil.getParameter(request, prefix + "n2nd_cfr_stwg_cd", ""));
		setCfrMrnPolutCd(JSPUtil.getParameter(request, prefix + "cfr_mrn_polut_cd", ""));
		setN1stCfrIbcInstrCd(JSPUtil.getParameter(request, prefix + "n1st_cfr_ibc_instr_cd", ""));
		setN1stBlkPckInstrCd(JSPUtil.getParameter(request, prefix + "n1st_blk_pck_instr_cd", ""));
		setN5thBlkSpclPckProviCd(JSPUtil.getParameter(request, prefix + "n5th_blk_spcl_pck_provi_cd", ""));
		setN1stNonBlkSpclPckProviCd(JSPUtil.getParameter(request, prefix + "n1st_non_blk_spcl_pck_provi_cd", ""));
		setN1stCgoVslCfrStwgCd(JSPUtil.getParameter(request, prefix + "n1st_cgo_vsl_cfr_stwg_cd", ""));
		setN4thCfrIbcProviCd(JSPUtil.getParameter(request, prefix + "n4th_cfr_ibc_provi_cd", ""));
		setN2ndCgoVslCfrStwgCd(JSPUtil.getParameter(request, prefix + "n2nd_cgo_vsl_cfr_stwg_cd", ""));
		setN1stCfrLblCd(JSPUtil.getParameter(request, prefix + "n1st_cfr_lbl_cd", ""));
		setCfrTecNmReqDesc(JSPUtil.getParameter(request, prefix + "cfr_tec_nm_req_desc", ""));
		setN8thCfrStwgCd(JSPUtil.getParameter(request, prefix + "n8th_cfr_stwg_cd", ""));
		setN4thCfrStwgCd(JSPUtil.getParameter(request, prefix + "n4th_cfr_stwg_cd", ""));
		setN2ndCfrSpclProviCd(JSPUtil.getParameter(request, prefix + "n2nd_cfr_spcl_provi_cd", ""));
		setN2ndCfrLblCd(JSPUtil.getParameter(request, prefix + "n2nd_cfr_lbl_cd", ""));
		setN3rdCfrStwgCateCd(JSPUtil.getParameter(request, prefix + "n3rd_cfr_stwg_cate_cd", ""));
		setOtrCfrStwgCateCd(JSPUtil.getParameter(request, prefix + "otr_cfr_stwg_cate_cd", ""));
		setN3rdNonBlkPckInstrCd(JSPUtil.getParameter(request, prefix + "n3rd_non_blk_pck_instr_cd", ""));
		setN4thCfrLblCd(JSPUtil.getParameter(request, prefix + "n4th_cfr_lbl_cd", ""));
		setN5thCfrStwgCd(JSPUtil.getParameter(request, prefix + "n5th_cfr_stwg_cd", ""));
		setCfrPfxNo(JSPUtil.getParameter(request, prefix + "cfr_pfx_no", ""));
		setPrpShpNm(JSPUtil.getParameter(request, prefix + "prp_shp_nm", ""));
		setN2ndCfrSymCd(JSPUtil.getParameter(request, prefix + "n2nd_cfr_sym_cd", ""));
		setN8thBlkSpclPckProviCd(JSPUtil.getParameter(request, prefix + "n8th_blk_spcl_pck_provi_cd", ""));
		setN4thCfrSymCd(JSPUtil.getParameter(request, prefix + "n4th_cfr_sym_cd", ""));
		setN2ndNonBlkPckInstrCd(JSPUtil.getParameter(request, prefix + "n2nd_non_blk_pck_instr_cd", ""));
		setCfrClssForSegrCd(JSPUtil.getParameter(request, prefix + "cfr_clss_for_segr_cd", ""));
		setN2ndCfrIbcProviCd(JSPUtil.getParameter(request, prefix + "n2nd_cfr_ibc_provi_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return ScgCfrUnNoVO[]
	 */
	public ScgCfrUnNoVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return ScgCfrUnNoVO[]
	 */
	public ScgCfrUnNoVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		ScgCfrUnNoVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] cfrClssSegrExptCd = (JSPUtil.getParameter(request, prefix	+ "cfr_clss_segr_expt_cd", length));
			String[] cfrLmtQtyMeasUtCd = (JSPUtil.getParameter(request, prefix	+ "cfr_lmt_qty_meas_ut_cd", length));
			String[] imdgUnNoSeq = (JSPUtil.getParameter(request, prefix	+ "imdg_un_no_seq", length));
			String[] cfrPckGrpCd = (JSPUtil.getParameter(request, prefix	+ "cfr_pck_grp_cd", length));
			String[] n1stCfrInstrProviCd = (JSPUtil.getParameter(request, prefix	+ "n1st_cfr_instr_provi_cd", length));
			String[] n4thBlkPckInstrCd = (JSPUtil.getParameter(request, prefix	+ "n4th_blk_pck_instr_cd", length));
			String[] n7thCfrStwgCd = (JSPUtil.getParameter(request, prefix	+ "n7th_cfr_stwg_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] n1stBlkSpclPckProviCd = (JSPUtil.getParameter(request, prefix	+ "n1st_blk_spcl_pck_provi_cd", length));
			String[] n3rdCfrSpclProviCd = (JSPUtil.getParameter(request, prefix	+ "n3rd_cfr_spcl_provi_cd", length));
			String[] n4thCfrInstrProviCd = (JSPUtil.getParameter(request, prefix	+ "n4th_cfr_instr_provi_cd", length));
			String[] n1stCfrSpclProviCd = (JSPUtil.getParameter(request, prefix	+ "n1st_cfr_spcl_provi_cd", length));
			String[] n3rdCfrLblCd = (JSPUtil.getParameter(request, prefix	+ "n3rd_cfr_lbl_cd", length));
			String[] cfrRailAirCgoLmtDesc = (JSPUtil.getParameter(request, prefix	+ "cfr_rail_air_cgo_lmt_desc", length));
			String[] n4thBlkSpclPckProviCd = (JSPUtil.getParameter(request, prefix	+ "n4th_blk_spcl_pck_provi_cd", length));
			String[] n4thCfrSpclProviCd = (JSPUtil.getParameter(request, prefix	+ "n4th_cfr_spcl_provi_cd", length));
			String[] cfrRptQtyCtnt = (JSPUtil.getParameter(request, prefix	+ "cfr_rpt_qty_ctnt", length));
			String[] n6thCfrInstrProviCd = (JSPUtil.getParameter(request, prefix	+ "n6th_cfr_instr_provi_cd", length));
			String[] n6thCfrStwgCd = (JSPUtil.getParameter(request, prefix	+ "n6th_cfr_stwg_cd", length));
			String[] cfrPsnInhHzdZnCd = (JSPUtil.getParameter(request, prefix	+ "cfr_psn_inh_hzd_zn_cd", length));
			String[] cfrSegrGrpCdValDesc = (JSPUtil.getParameter(request, prefix	+ "cfr_segr_grp_cd_val_desc", length));
			String[] n1stCfrSymCd = (JSPUtil.getParameter(request, prefix	+ "n1st_cfr_sym_cd", length));
			String[] n1stCfrStwgCateCd = (JSPUtil.getParameter(request, prefix	+ "n1st_cfr_stwg_cate_cd", length));
			String[] n2ndPsngVslCfrStwgCd = (JSPUtil.getParameter(request, prefix	+ "n2nd_psng_vsl_cfr_stwg_cd", length));
			String[] n5thCfrSpclProviCd = (JSPUtil.getParameter(request, prefix	+ "n5th_cfr_spcl_provi_cd", length));
			String[] n3rdCfrInstrProviCd = (JSPUtil.getParameter(request, prefix	+ "n3rd_cfr_instr_provi_cd", length));
			String[] n2ndNonBlkSpclPckProviCd = (JSPUtil.getParameter(request, prefix	+ "n2nd_non_blk_spcl_pck_provi_cd", length));
			String[] n1stNonBlkPckInstrCd = (JSPUtil.getParameter(request, prefix	+ "n1st_non_blk_pck_instr_cd", length));
			String[] n1stPsngVslCfrStwgCd = (JSPUtil.getParameter(request, prefix	+ "n1st_psng_vsl_cfr_stwg_cd", length));
			String[] n7thBlkSpclPckProviCd = (JSPUtil.getParameter(request, prefix	+ "n7th_blk_spcl_pck_provi_cd", length));
			String[] n5thNonBlkSpclPckProviCd = (JSPUtil.getParameter(request, prefix	+ "n5th_non_blk_spcl_pck_provi_cd", length));
			String[] n3rdBlkPckInstrCd = (JSPUtil.getParameter(request, prefix	+ "n3rd_blk_pck_instr_cd", length));
			String[] n3rdNonBlkSpclPckProviCd = (JSPUtil.getParameter(request, prefix	+ "n3rd_non_blk_spcl_pck_provi_cd", length));
			String[] n3rdCfrStwgCd = (JSPUtil.getParameter(request, prefix	+ "n3rd_cfr_stwg_cd", length));
			String[] n2ndCfrStwgCateCd = (JSPUtil.getParameter(request, prefix	+ "n2nd_cfr_stwg_cate_cd", length));
			String[] cfrReguNo = (JSPUtil.getParameter(request, prefix	+ "cfr_regu_no", length));
			String[] n4thNonBlkPckInstrCd = (JSPUtil.getParameter(request, prefix	+ "n4th_non_blk_pck_instr_cd", length));
			String[] cfrLmtQtyCtnt = (JSPUtil.getParameter(request, prefix	+ "cfr_lmt_qty_ctnt", length));
			String[] n1stCfrStwgCd = (JSPUtil.getParameter(request, prefix	+ "n1st_cfr_stwg_cd", length));
			String[] n9thBlkSpclPckProviCd = (JSPUtil.getParameter(request, prefix	+ "n9th_blk_spcl_pck_provi_cd", length));
			String[] n4thNonBlkSpclPckProviCd = (JSPUtil.getParameter(request, prefix	+ "n4th_non_blk_spcl_pck_provi_cd", length));
			String[] n6thBlkSpclPckProviCd = (JSPUtil.getParameter(request, prefix	+ "n6th_blk_spcl_pck_provi_cd", length));
			String[] n3rdCfrIbcProviCd = (JSPUtil.getParameter(request, prefix	+ "n3rd_cfr_ibc_provi_cd", length));
			String[] n5thCfrInstrProviCd = (JSPUtil.getParameter(request, prefix	+ "n5th_cfr_instr_provi_cd", length));
			String[] cfrExptQtyCd = (JSPUtil.getParameter(request, prefix	+ "cfr_expt_qty_cd", length));
			String[] n2ndBlkPckInstrCd = (JSPUtil.getParameter(request, prefix	+ "n2nd_blk_pck_instr_cd", length));
			String[] cdVariNo = (JSPUtil.getParameter(request, prefix	+ "cd_vari_no", length));
			String[] cfrEmerRspnGidNo = (JSPUtil.getParameter(request, prefix	+ "cfr_emer_rspn_gid_no", length));
			String[] n1stCfrIbcProviCd = (JSPUtil.getParameter(request, prefix	+ "n1st_cfr_ibc_provi_cd", length));
			String[] imdgAmdtNo = (JSPUtil.getParameter(request, prefix	+ "imdg_amdt_no", length));
			String[] n3rdBlkSpclPckProviCd = (JSPUtil.getParameter(request, prefix	+ "n3rd_blk_spcl_pck_provi_cd", length));
			String[] cfrRailAirPsngLmtDesc = (JSPUtil.getParameter(request, prefix	+ "cfr_rail_air_psng_lmt_desc", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] n2ndCfrInstrProviCd = (JSPUtil.getParameter(request, prefix	+ "n2nd_cfr_instr_provi_cd", length));
			String[] cfrTnkInstrCd = (JSPUtil.getParameter(request, prefix	+ "cfr_tnk_instr_cd", length));
			String[] prpShpNmVarRmk = (JSPUtil.getParameter(request, prefix	+ "prp_shp_nm_var_rmk", length));
			String[] n3rdCfrSymCd = (JSPUtil.getParameter(request, prefix	+ "n3rd_cfr_sym_cd", length));
			String[] cfrUnNo = (JSPUtil.getParameter(request, prefix	+ "cfr_un_no", length));
			String[] n9thCfrStwgCd = (JSPUtil.getParameter(request, prefix	+ "n9th_cfr_stwg_cd", length));
			String[] n2ndBlkSpclPckProviCd = (JSPUtil.getParameter(request, prefix	+ "n2nd_blk_spcl_pck_provi_cd", length));
			String[] imdgUnNoSfx = (JSPUtil.getParameter(request, prefix	+ "imdg_un_no_sfx", length));
			String[] cfrPhysSteCd = (JSPUtil.getParameter(request, prefix	+ "cfr_phys_ste_cd", length));
			String[] n2ndCfrIbcInstrCd = (JSPUtil.getParameter(request, prefix	+ "n2nd_cfr_ibc_instr_cd", length));
			String[] n2ndCfrStwgCd = (JSPUtil.getParameter(request, prefix	+ "n2nd_cfr_stwg_cd", length));
			String[] cfrMrnPolutCd = (JSPUtil.getParameter(request, prefix	+ "cfr_mrn_polut_cd", length));
			String[] n1stCfrIbcInstrCd = (JSPUtil.getParameter(request, prefix	+ "n1st_cfr_ibc_instr_cd", length));
			String[] n1stBlkPckInstrCd = (JSPUtil.getParameter(request, prefix	+ "n1st_blk_pck_instr_cd", length));
			String[] n5thBlkSpclPckProviCd = (JSPUtil.getParameter(request, prefix	+ "n5th_blk_spcl_pck_provi_cd", length));
			String[] n1stNonBlkSpclPckProviCd = (JSPUtil.getParameter(request, prefix	+ "n1st_non_blk_spcl_pck_provi_cd", length));
			String[] n1stCgoVslCfrStwgCd = (JSPUtil.getParameter(request, prefix	+ "n1st_cgo_vsl_cfr_stwg_cd", length));
			String[] n4thCfrIbcProviCd = (JSPUtil.getParameter(request, prefix	+ "n4th_cfr_ibc_provi_cd", length));
			String[] n2ndCgoVslCfrStwgCd = (JSPUtil.getParameter(request, prefix	+ "n2nd_cgo_vsl_cfr_stwg_cd", length));
			String[] n1stCfrLblCd = (JSPUtil.getParameter(request, prefix	+ "n1st_cfr_lbl_cd", length));
			String[] cfrTecNmReqDesc = (JSPUtil.getParameter(request, prefix	+ "cfr_tec_nm_req_desc", length));
			String[] n8thCfrStwgCd = (JSPUtil.getParameter(request, prefix	+ "n8th_cfr_stwg_cd", length));
			String[] n4thCfrStwgCd = (JSPUtil.getParameter(request, prefix	+ "n4th_cfr_stwg_cd", length));
			String[] n2ndCfrSpclProviCd = (JSPUtil.getParameter(request, prefix	+ "n2nd_cfr_spcl_provi_cd", length));
			String[] n2ndCfrLblCd = (JSPUtil.getParameter(request, prefix	+ "n2nd_cfr_lbl_cd", length));
			String[] n3rdCfrStwgCateCd = (JSPUtil.getParameter(request, prefix	+ "n3rd_cfr_stwg_cate_cd", length));
			String[] otrCfrStwgCateCd = (JSPUtil.getParameter(request, prefix	+ "otr_cfr_stwg_cate_cd", length));
			String[] n3rdNonBlkPckInstrCd = (JSPUtil.getParameter(request, prefix	+ "n3rd_non_blk_pck_instr_cd", length));
			String[] n4thCfrLblCd = (JSPUtil.getParameter(request, prefix	+ "n4th_cfr_lbl_cd", length));
			String[] n5thCfrStwgCd = (JSPUtil.getParameter(request, prefix	+ "n5th_cfr_stwg_cd", length));
			String[] cfrPfxNo = (JSPUtil.getParameter(request, prefix	+ "cfr_pfx_no", length));
			String[] prpShpNm = (JSPUtil.getParameter(request, prefix	+ "prp_shp_nm", length));
			String[] n2ndCfrSymCd = (JSPUtil.getParameter(request, prefix	+ "n2nd_cfr_sym_cd", length));
			String[] n8thBlkSpclPckProviCd = (JSPUtil.getParameter(request, prefix	+ "n8th_blk_spcl_pck_provi_cd", length));
			String[] n4thCfrSymCd = (JSPUtil.getParameter(request, prefix	+ "n4th_cfr_sym_cd", length));
			String[] n2ndNonBlkPckInstrCd = (JSPUtil.getParameter(request, prefix	+ "n2nd_non_blk_pck_instr_cd", length));
			String[] cfrClssForSegrCd = (JSPUtil.getParameter(request, prefix	+ "cfr_clss_for_segr_cd", length));
			String[] n2ndCfrIbcProviCd = (JSPUtil.getParameter(request, prefix	+ "n2nd_cfr_ibc_provi_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new ScgCfrUnNoVO();
				if (cfrClssSegrExptCd[i] != null)
					model.setCfrClssSegrExptCd(cfrClssSegrExptCd[i]);
				if (cfrLmtQtyMeasUtCd[i] != null)
					model.setCfrLmtQtyMeasUtCd(cfrLmtQtyMeasUtCd[i]);
				if (imdgUnNoSeq[i] != null)
					model.setImdgUnNoSeq(imdgUnNoSeq[i]);
				if (cfrPckGrpCd[i] != null)
					model.setCfrPckGrpCd(cfrPckGrpCd[i]);
				if (n1stCfrInstrProviCd[i] != null)
					model.setN1stCfrInstrProviCd(n1stCfrInstrProviCd[i]);
				if (n4thBlkPckInstrCd[i] != null)
					model.setN4thBlkPckInstrCd(n4thBlkPckInstrCd[i]);
				if (n7thCfrStwgCd[i] != null)
					model.setN7thCfrStwgCd(n7thCfrStwgCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (n1stBlkSpclPckProviCd[i] != null)
					model.setN1stBlkSpclPckProviCd(n1stBlkSpclPckProviCd[i]);
				if (n3rdCfrSpclProviCd[i] != null)
					model.setN3rdCfrSpclProviCd(n3rdCfrSpclProviCd[i]);
				if (n4thCfrInstrProviCd[i] != null)
					model.setN4thCfrInstrProviCd(n4thCfrInstrProviCd[i]);
				if (n1stCfrSpclProviCd[i] != null)
					model.setN1stCfrSpclProviCd(n1stCfrSpclProviCd[i]);
				if (n3rdCfrLblCd[i] != null)
					model.setN3rdCfrLblCd(n3rdCfrLblCd[i]);
				if (cfrRailAirCgoLmtDesc[i] != null)
					model.setCfrRailAirCgoLmtDesc(cfrRailAirCgoLmtDesc[i]);
				if (n4thBlkSpclPckProviCd[i] != null)
					model.setN4thBlkSpclPckProviCd(n4thBlkSpclPckProviCd[i]);
				if (n4thCfrSpclProviCd[i] != null)
					model.setN4thCfrSpclProviCd(n4thCfrSpclProviCd[i]);
				if (cfrRptQtyCtnt[i] != null)
					model.setCfrRptQtyCtnt(cfrRptQtyCtnt[i]);
				if (n6thCfrInstrProviCd[i] != null)
					model.setN6thCfrInstrProviCd(n6thCfrInstrProviCd[i]);
				if (n6thCfrStwgCd[i] != null)
					model.setN6thCfrStwgCd(n6thCfrStwgCd[i]);
				if (cfrPsnInhHzdZnCd[i] != null)
					model.setCfrPsnInhHzdZnCd(cfrPsnInhHzdZnCd[i]);
				if (cfrSegrGrpCdValDesc[i] != null)
					model.setCfrSegrGrpCdValDesc(cfrSegrGrpCdValDesc[i]);
				if (n1stCfrSymCd[i] != null)
					model.setN1stCfrSymCd(n1stCfrSymCd[i]);
				if (n1stCfrStwgCateCd[i] != null)
					model.setN1stCfrStwgCateCd(n1stCfrStwgCateCd[i]);
				if (n2ndPsngVslCfrStwgCd[i] != null)
					model.setN2ndPsngVslCfrStwgCd(n2ndPsngVslCfrStwgCd[i]);
				if (n5thCfrSpclProviCd[i] != null)
					model.setN5thCfrSpclProviCd(n5thCfrSpclProviCd[i]);
				if (n3rdCfrInstrProviCd[i] != null)
					model.setN3rdCfrInstrProviCd(n3rdCfrInstrProviCd[i]);
				if (n2ndNonBlkSpclPckProviCd[i] != null)
					model.setN2ndNonBlkSpclPckProviCd(n2ndNonBlkSpclPckProviCd[i]);
				if (n1stNonBlkPckInstrCd[i] != null)
					model.setN1stNonBlkPckInstrCd(n1stNonBlkPckInstrCd[i]);
				if (n1stPsngVslCfrStwgCd[i] != null)
					model.setN1stPsngVslCfrStwgCd(n1stPsngVslCfrStwgCd[i]);
				if (n7thBlkSpclPckProviCd[i] != null)
					model.setN7thBlkSpclPckProviCd(n7thBlkSpclPckProviCd[i]);
				if (n5thNonBlkSpclPckProviCd[i] != null)
					model.setN5thNonBlkSpclPckProviCd(n5thNonBlkSpclPckProviCd[i]);
				if (n3rdBlkPckInstrCd[i] != null)
					model.setN3rdBlkPckInstrCd(n3rdBlkPckInstrCd[i]);
				if (n3rdNonBlkSpclPckProviCd[i] != null)
					model.setN3rdNonBlkSpclPckProviCd(n3rdNonBlkSpclPckProviCd[i]);
				if (n3rdCfrStwgCd[i] != null)
					model.setN3rdCfrStwgCd(n3rdCfrStwgCd[i]);
				if (n2ndCfrStwgCateCd[i] != null)
					model.setN2ndCfrStwgCateCd(n2ndCfrStwgCateCd[i]);
				if (cfrReguNo[i] != null)
					model.setCfrReguNo(cfrReguNo[i]);
				if (n4thNonBlkPckInstrCd[i] != null)
					model.setN4thNonBlkPckInstrCd(n4thNonBlkPckInstrCd[i]);
				if (cfrLmtQtyCtnt[i] != null)
					model.setCfrLmtQtyCtnt(cfrLmtQtyCtnt[i]);
				if (n1stCfrStwgCd[i] != null)
					model.setN1stCfrStwgCd(n1stCfrStwgCd[i]);
				if (n9thBlkSpclPckProviCd[i] != null)
					model.setN9thBlkSpclPckProviCd(n9thBlkSpclPckProviCd[i]);
				if (n4thNonBlkSpclPckProviCd[i] != null)
					model.setN4thNonBlkSpclPckProviCd(n4thNonBlkSpclPckProviCd[i]);
				if (n6thBlkSpclPckProviCd[i] != null)
					model.setN6thBlkSpclPckProviCd(n6thBlkSpclPckProviCd[i]);
				if (n3rdCfrIbcProviCd[i] != null)
					model.setN3rdCfrIbcProviCd(n3rdCfrIbcProviCd[i]);
				if (n5thCfrInstrProviCd[i] != null)
					model.setN5thCfrInstrProviCd(n5thCfrInstrProviCd[i]);
				if (cfrExptQtyCd[i] != null)
					model.setCfrExptQtyCd(cfrExptQtyCd[i]);
				if (n2ndBlkPckInstrCd[i] != null)
					model.setN2ndBlkPckInstrCd(n2ndBlkPckInstrCd[i]);
				if (cdVariNo[i] != null)
					model.setCdVariNo(cdVariNo[i]);
				if (cfrEmerRspnGidNo[i] != null)
					model.setCfrEmerRspnGidNo(cfrEmerRspnGidNo[i]);
				if (n1stCfrIbcProviCd[i] != null)
					model.setN1stCfrIbcProviCd(n1stCfrIbcProviCd[i]);
				if (imdgAmdtNo[i] != null)
					model.setImdgAmdtNo(imdgAmdtNo[i]);
				if (n3rdBlkSpclPckProviCd[i] != null)
					model.setN3rdBlkSpclPckProviCd(n3rdBlkSpclPckProviCd[i]);
				if (cfrRailAirPsngLmtDesc[i] != null)
					model.setCfrRailAirPsngLmtDesc(cfrRailAirPsngLmtDesc[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (n2ndCfrInstrProviCd[i] != null)
					model.setN2ndCfrInstrProviCd(n2ndCfrInstrProviCd[i]);
				if (cfrTnkInstrCd[i] != null)
					model.setCfrTnkInstrCd(cfrTnkInstrCd[i]);
				if (prpShpNmVarRmk[i] != null)
					model.setPrpShpNmVarRmk(prpShpNmVarRmk[i]);
				if (n3rdCfrSymCd[i] != null)
					model.setN3rdCfrSymCd(n3rdCfrSymCd[i]);
				if (cfrUnNo[i] != null)
					model.setCfrUnNo(cfrUnNo[i]);
				if (n9thCfrStwgCd[i] != null)
					model.setN9thCfrStwgCd(n9thCfrStwgCd[i]);
				if (n2ndBlkSpclPckProviCd[i] != null)
					model.setN2ndBlkSpclPckProviCd(n2ndBlkSpclPckProviCd[i]);
				if (imdgUnNoSfx[i] != null)
					model.setImdgUnNoSfx(imdgUnNoSfx[i]);
				if (cfrPhysSteCd[i] != null)
					model.setCfrPhysSteCd(cfrPhysSteCd[i]);
				if (n2ndCfrIbcInstrCd[i] != null)
					model.setN2ndCfrIbcInstrCd(n2ndCfrIbcInstrCd[i]);
				if (n2ndCfrStwgCd[i] != null)
					model.setN2ndCfrStwgCd(n2ndCfrStwgCd[i]);
				if (cfrMrnPolutCd[i] != null)
					model.setCfrMrnPolutCd(cfrMrnPolutCd[i]);
				if (n1stCfrIbcInstrCd[i] != null)
					model.setN1stCfrIbcInstrCd(n1stCfrIbcInstrCd[i]);
				if (n1stBlkPckInstrCd[i] != null)
					model.setN1stBlkPckInstrCd(n1stBlkPckInstrCd[i]);
				if (n5thBlkSpclPckProviCd[i] != null)
					model.setN5thBlkSpclPckProviCd(n5thBlkSpclPckProviCd[i]);
				if (n1stNonBlkSpclPckProviCd[i] != null)
					model.setN1stNonBlkSpclPckProviCd(n1stNonBlkSpclPckProviCd[i]);
				if (n1stCgoVslCfrStwgCd[i] != null)
					model.setN1stCgoVslCfrStwgCd(n1stCgoVslCfrStwgCd[i]);
				if (n4thCfrIbcProviCd[i] != null)
					model.setN4thCfrIbcProviCd(n4thCfrIbcProviCd[i]);
				if (n2ndCgoVslCfrStwgCd[i] != null)
					model.setN2ndCgoVslCfrStwgCd(n2ndCgoVslCfrStwgCd[i]);
				if (n1stCfrLblCd[i] != null)
					model.setN1stCfrLblCd(n1stCfrLblCd[i]);
				if (cfrTecNmReqDesc[i] != null)
					model.setCfrTecNmReqDesc(cfrTecNmReqDesc[i]);
				if (n8thCfrStwgCd[i] != null)
					model.setN8thCfrStwgCd(n8thCfrStwgCd[i]);
				if (n4thCfrStwgCd[i] != null)
					model.setN4thCfrStwgCd(n4thCfrStwgCd[i]);
				if (n2ndCfrSpclProviCd[i] != null)
					model.setN2ndCfrSpclProviCd(n2ndCfrSpclProviCd[i]);
				if (n2ndCfrLblCd[i] != null)
					model.setN2ndCfrLblCd(n2ndCfrLblCd[i]);
				if (n3rdCfrStwgCateCd[i] != null)
					model.setN3rdCfrStwgCateCd(n3rdCfrStwgCateCd[i]);
				if (otrCfrStwgCateCd[i] != null)
					model.setOtrCfrStwgCateCd(otrCfrStwgCateCd[i]);
				if (n3rdNonBlkPckInstrCd[i] != null)
					model.setN3rdNonBlkPckInstrCd(n3rdNonBlkPckInstrCd[i]);
				if (n4thCfrLblCd[i] != null)
					model.setN4thCfrLblCd(n4thCfrLblCd[i]);
				if (n5thCfrStwgCd[i] != null)
					model.setN5thCfrStwgCd(n5thCfrStwgCd[i]);
				if (cfrPfxNo[i] != null)
					model.setCfrPfxNo(cfrPfxNo[i]);
				if (prpShpNm[i] != null)
					model.setPrpShpNm(prpShpNm[i]);
				if (n2ndCfrSymCd[i] != null)
					model.setN2ndCfrSymCd(n2ndCfrSymCd[i]);
				if (n8thBlkSpclPckProviCd[i] != null)
					model.setN8thBlkSpclPckProviCd(n8thBlkSpclPckProviCd[i]);
				if (n4thCfrSymCd[i] != null)
					model.setN4thCfrSymCd(n4thCfrSymCd[i]);
				if (n2ndNonBlkPckInstrCd[i] != null)
					model.setN2ndNonBlkPckInstrCd(n2ndNonBlkPckInstrCd[i]);
				if (cfrClssForSegrCd[i] != null)
					model.setCfrClssForSegrCd(cfrClssForSegrCd[i]);
				if (n2ndCfrIbcProviCd[i] != null)
					model.setN2ndCfrIbcProviCd(n2ndCfrIbcProviCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getScgCfrUnNoVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return ScgCfrUnNoVO[]
	 */
	public ScgCfrUnNoVO[] getScgCfrUnNoVOs(){
		ScgCfrUnNoVO[] vos = (ScgCfrUnNoVO[])models.toArray(new ScgCfrUnNoVO[models.size()]);
		return vos;
	}
	
	/**
	 * VO Class의 내용을 String으로 변환
	 */
	public String toString() {
		   return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE );
	   }

	/**
	* 포맷팅된 문자열에서 특수문자 제거("-","/",",",":")
	*/
	public void unDataFormat(){
		this.cfrClssSegrExptCd = this.cfrClssSegrExptCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cfrLmtQtyMeasUtCd = this.cfrLmtQtyMeasUtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.imdgUnNoSeq = this.imdgUnNoSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cfrPckGrpCd = this.cfrPckGrpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stCfrInstrProviCd = this.n1stCfrInstrProviCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n4thBlkPckInstrCd = this.n4thBlkPckInstrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n7thCfrStwgCd = this.n7thCfrStwgCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stBlkSpclPckProviCd = this.n1stBlkSpclPckProviCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3rdCfrSpclProviCd = this.n3rdCfrSpclProviCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n4thCfrInstrProviCd = this.n4thCfrInstrProviCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stCfrSpclProviCd = this.n1stCfrSpclProviCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3rdCfrLblCd = this.n3rdCfrLblCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cfrRailAirCgoLmtDesc = this.cfrRailAirCgoLmtDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n4thBlkSpclPckProviCd = this.n4thBlkSpclPckProviCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n4thCfrSpclProviCd = this.n4thCfrSpclProviCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cfrRptQtyCtnt = this.cfrRptQtyCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n6thCfrInstrProviCd = this.n6thCfrInstrProviCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n6thCfrStwgCd = this.n6thCfrStwgCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cfrPsnInhHzdZnCd = this.cfrPsnInhHzdZnCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cfrSegrGrpCdValDesc = this.cfrSegrGrpCdValDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stCfrSymCd = this.n1stCfrSymCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stCfrStwgCateCd = this.n1stCfrStwgCateCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n2ndPsngVslCfrStwgCd = this.n2ndPsngVslCfrStwgCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n5thCfrSpclProviCd = this.n5thCfrSpclProviCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3rdCfrInstrProviCd = this.n3rdCfrInstrProviCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n2ndNonBlkSpclPckProviCd = this.n2ndNonBlkSpclPckProviCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stNonBlkPckInstrCd = this.n1stNonBlkPckInstrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stPsngVslCfrStwgCd = this.n1stPsngVslCfrStwgCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n7thBlkSpclPckProviCd = this.n7thBlkSpclPckProviCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n5thNonBlkSpclPckProviCd = this.n5thNonBlkSpclPckProviCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3rdBlkPckInstrCd = this.n3rdBlkPckInstrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3rdNonBlkSpclPckProviCd = this.n3rdNonBlkSpclPckProviCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3rdCfrStwgCd = this.n3rdCfrStwgCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n2ndCfrStwgCateCd = this.n2ndCfrStwgCateCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cfrReguNo = this.cfrReguNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n4thNonBlkPckInstrCd = this.n4thNonBlkPckInstrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cfrLmtQtyCtnt = this.cfrLmtQtyCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stCfrStwgCd = this.n1stCfrStwgCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n9thBlkSpclPckProviCd = this.n9thBlkSpclPckProviCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n4thNonBlkSpclPckProviCd = this.n4thNonBlkSpclPckProviCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n6thBlkSpclPckProviCd = this.n6thBlkSpclPckProviCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3rdCfrIbcProviCd = this.n3rdCfrIbcProviCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n5thCfrInstrProviCd = this.n5thCfrInstrProviCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cfrExptQtyCd = this.cfrExptQtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n2ndBlkPckInstrCd = this.n2ndBlkPckInstrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cdVariNo = this.cdVariNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cfrEmerRspnGidNo = this.cfrEmerRspnGidNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stCfrIbcProviCd = this.n1stCfrIbcProviCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.imdgAmdtNo = this.imdgAmdtNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3rdBlkSpclPckProviCd = this.n3rdBlkSpclPckProviCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cfrRailAirPsngLmtDesc = this.cfrRailAirPsngLmtDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n2ndCfrInstrProviCd = this.n2ndCfrInstrProviCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cfrTnkInstrCd = this.cfrTnkInstrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prpShpNmVarRmk = this.prpShpNmVarRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3rdCfrSymCd = this.n3rdCfrSymCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cfrUnNo = this.cfrUnNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n9thCfrStwgCd = this.n9thCfrStwgCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n2ndBlkSpclPckProviCd = this.n2ndBlkSpclPckProviCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.imdgUnNoSfx = this.imdgUnNoSfx .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cfrPhysSteCd = this.cfrPhysSteCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n2ndCfrIbcInstrCd = this.n2ndCfrIbcInstrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n2ndCfrStwgCd = this.n2ndCfrStwgCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cfrMrnPolutCd = this.cfrMrnPolutCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stCfrIbcInstrCd = this.n1stCfrIbcInstrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stBlkPckInstrCd = this.n1stBlkPckInstrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n5thBlkSpclPckProviCd = this.n5thBlkSpclPckProviCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stNonBlkSpclPckProviCd = this.n1stNonBlkSpclPckProviCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stCgoVslCfrStwgCd = this.n1stCgoVslCfrStwgCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n4thCfrIbcProviCd = this.n4thCfrIbcProviCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n2ndCgoVslCfrStwgCd = this.n2ndCgoVslCfrStwgCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stCfrLblCd = this.n1stCfrLblCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cfrTecNmReqDesc = this.cfrTecNmReqDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n8thCfrStwgCd = this.n8thCfrStwgCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n4thCfrStwgCd = this.n4thCfrStwgCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n2ndCfrSpclProviCd = this.n2ndCfrSpclProviCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n2ndCfrLblCd = this.n2ndCfrLblCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3rdCfrStwgCateCd = this.n3rdCfrStwgCateCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.otrCfrStwgCateCd = this.otrCfrStwgCateCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3rdNonBlkPckInstrCd = this.n3rdNonBlkPckInstrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n4thCfrLblCd = this.n4thCfrLblCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n5thCfrStwgCd = this.n5thCfrStwgCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cfrPfxNo = this.cfrPfxNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prpShpNm = this.prpShpNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n2ndCfrSymCd = this.n2ndCfrSymCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n8thBlkSpclPckProviCd = this.n8thBlkSpclPckProviCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n4thCfrSymCd = this.n4thCfrSymCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n2ndNonBlkPckInstrCd = this.n2ndNonBlkPckInstrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cfrClssForSegrCd = this.cfrClssForSegrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n2ndCfrIbcProviCd = this.n2ndCfrIbcProviCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
