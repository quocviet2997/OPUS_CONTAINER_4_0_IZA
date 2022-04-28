/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : AgtFacCustRltVO.java
*@FileTitle : AgtFacCustRltVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.10.16
*@LastModifier : 이호진
*@LastVersion : 1.0
* 2009.10.16 이호진 
* 1.0 Creation
=========================================================*/

package com.clt.syscommon.common.table;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.clt.framework.component.common.AbstractValueObject;
import com.clt.framework.component.util.JSPUtil;

/**
 * Table Value Ojbect<br>
 * 관련 Event 에서 생성, 서버실행요청시 Data 전달역할을 수행하는 Value Object
 *
 * @author 이호진
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class AgtFacCustRltVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<AgtFacCustRltVO> models = new ArrayList<AgtFacCustRltVO>();
	
	/* Column Info */
	private String custSeq2 = null;
	/* Column Info */
	private String facOfcCd2 = null;
	/* Column Info */
	private String custNm = null;
	/* Column Info */
	private String shprCntCd = null;
	/* Column Info */
	private String facOfcCd = null;
	/* Column Info */
	private String custSeq = null;
	/* Column Info */
	private String shprSeq2 = null;
	/* Page Number */
	private String pagerows = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String custCdSeq = null;
	/* Column Info */
	private String shprCdSeq = null;
	/* Column Info */
	private String shprNm = null;
	/* Column Info */
	private String shprSeq = null;
	/* Column Info */
	private String shprCntCd2 = null;
	/* Column Info */
	private String custCntCd = null;
	/* Column Info */
	private String custCntCd2 = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */	
	private String creUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public AgtFacCustRltVO() {}

	public AgtFacCustRltVO(String ibflag, String pagerows, String custCdSeq, String custNm, String shprCdSeq, String shprNm, String facOfcCd, String custCntCd, String custSeq, String shprCntCd, String shprSeq, String facOfcCd2, String custSeq2, String shprCntCd2, String shprSeq2, String updDt, String updUsrId, String creDt, String creUsrId, String custCntCd2) {
		this.custSeq2 = custSeq2;
		this.facOfcCd2 = facOfcCd2;
		this.custNm = custNm;
		this.shprCntCd = shprCntCd;
		this.facOfcCd = facOfcCd;
		this.custSeq = custSeq;
		this.shprSeq2 = shprSeq2;
		this.pagerows = pagerows;
		this.ibflag = ibflag;
		this.custCdSeq = custCdSeq;
		this.shprCdSeq = shprCdSeq;
		this.shprNm = shprNm;
		this.shprSeq = shprSeq;
		this.shprCntCd2 = shprCntCd2;
		this.custCntCd = custCntCd;
		this.custCntCd2 = custCntCd2;
		this.updDt = updDt;
		this.updUsrId = updUsrId;
		this.creDt = creDt;
		this.creUsrId = creUsrId;
		
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("cust_seq2", getCustSeq2());
		this.hashColumns.put("fac_ofc_cd2", getFacOfcCd2());
		this.hashColumns.put("cust_nm", getCustNm());
		this.hashColumns.put("shpr_cnt_cd", getShprCntCd());
		this.hashColumns.put("fac_ofc_cd", getFacOfcCd());
		this.hashColumns.put("cust_seq", getCustSeq());
		this.hashColumns.put("shpr_seq2", getShprSeq2());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cust_cd_seq", getCustCdSeq());
		this.hashColumns.put("shpr_cd_seq", getShprCdSeq());
		this.hashColumns.put("shpr_nm", getShprNm());
		this.hashColumns.put("shpr_seq", getShprSeq());
		this.hashColumns.put("shpr_cnt_cd2", getShprCntCd2());
		this.hashColumns.put("cust_cnt_cd", getCustCntCd());
		this.hashColumns.put("cust_cnt_cd2", getCustCntCd2());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("cust_seq2", "custSeq2");
		this.hashFields.put("fac_ofc_cd2", "facOfcCd2");
		this.hashFields.put("cust_nm", "custNm");
		this.hashFields.put("shpr_cnt_cd", "shprCntCd");
		this.hashFields.put("fac_ofc_cd", "facOfcCd");
		this.hashFields.put("cust_seq", "custSeq");
		this.hashFields.put("shpr_seq2", "shprSeq2");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cust_cd_seq", "custCdSeq");
		this.hashFields.put("shpr_cd_seq", "shprCdSeq");
		this.hashFields.put("shpr_nm", "shprNm");
		this.hashFields.put("shpr_seq", "shprSeq");
		this.hashFields.put("shpr_cnt_cd2", "shprCntCd2");
		this.hashFields.put("cust_cnt_cd", "custCntCd");
		this.hashFields.put("cust_cnt_cd2", "custCntCd2");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("cre_usr_id", "creUsrId");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return custSeq2
	 */
	public String getCustSeq2() {
		return this.custSeq2;
	}
	
	/**
	 * Column Info
	 * @return facOfcCd2
	 */
	public String getFacOfcCd2() {
		return this.facOfcCd2;
	}
	
	/**
	 * Column Info
	 * @return custNm
	 */
	public String getCustNm() {
		return this.custNm;
	}
	
	/**
	 * Column Info
	 * @return shprCntCd
	 */
	public String getShprCntCd() {
		return this.shprCntCd;
	}
	
	/**
	 * Column Info
	 * @return facOfcCd
	 */
	public String getFacOfcCd() {
		return this.facOfcCd;
	}
	
	/**
	 * Column Info
	 * @return custSeq
	 */
	public String getCustSeq() {
		return this.custSeq;
	}
	
	/**
	 * Column Info
	 * @return shprSeq2
	 */
	public String getShprSeq2() {
		return this.shprSeq2;
	}
	
	/**
	 * Page Number
	 * @return pagerows
	 */
	public String getPagerows() {
		return this.pagerows;
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
	 * @return custCdSeq
	 */
	public String getCustCdSeq() {
		return this.custCdSeq;
	}
	
	/**
	 * Column Info
	 * @return shprCdSeq
	 */
	public String getShprCdSeq() {
		return this.shprCdSeq;
	}
	
	/**
	 * Column Info
	 * @return shprNm
	 */
	public String getShprNm() {
		return this.shprNm;
	}
	
	/**
	 * Column Info
	 * @return shprSeq
	 */
	public String getShprSeq() {
		return this.shprSeq;
	}
	
	/**
	 * Column Info
	 * @return shprCntCd2
	 */
	public String getShprCntCd2() {
		return this.shprCntCd2;
	}
	
	/**
	 * Column Info
	 * @return custCntCd
	 */
	public String getCustCntCd() {
		return this.custCntCd;
	}
	/**
	 * Column Info
	 * @return custCntCd
	 */
	public String getCustCntCd2() {
		return this.custCntCd2;
	}
	
	public String getUpdDt() {
    	return updDt;
    }

	public String getUpdUsrId() {
    	return updUsrId;
    }

	public String getCreDt() {
    	return creDt;
    }

	public String getCreUsrId() {
    	return creUsrId;
    }
	/**
	 * Column Info
	 * @param custSeq2
	 */
	public void setCustSeq2(String custSeq2) {
		this.custSeq2 = custSeq2;
	}
	
	/**
	 * Column Info
	 * @param facOfcCd2
	 */
	public void setFacOfcCd2(String facOfcCd2) {
		this.facOfcCd2 = facOfcCd2;
	}
	
	/**
	 * Column Info
	 * @param custNm
	 */
	public void setCustNm(String custNm) {
		this.custNm = custNm;
	}
	
	/**
	 * Column Info
	 * @param shprCntCd
	 */
	public void setShprCntCd(String shprCntCd) {
		this.shprCntCd = shprCntCd;
	}
	
	/**
	 * Column Info
	 * @param facOfcCd
	 */
	public void setFacOfcCd(String facOfcCd) {
		this.facOfcCd = facOfcCd;
	}
	
	/**
	 * Column Info
	 * @param custSeq
	 */
	public void setCustSeq(String custSeq) {
		this.custSeq = custSeq;
	}
	
	/**
	 * Column Info
	 * @param shprSeq2
	 */
	public void setShprSeq2(String shprSeq2) {
		this.shprSeq2 = shprSeq2;
	}
	
	/**
	 * Page Number
	 * @param pagerows
	 */
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
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
	 * @param custCdSeq
	 */
	public void setCustCdSeq(String custCdSeq) {
		this.custCdSeq = custCdSeq;
	}
	
	/**
	 * Column Info
	 * @param shprCdSeq
	 */
	public void setShprCdSeq(String shprCdSeq) {
		this.shprCdSeq = shprCdSeq;
	}
	
	/**
	 * Column Info
	 * @param shprNm
	 */
	public void setShprNm(String shprNm) {
		this.shprNm = shprNm;
	}
	
	/**
	 * Column Info
	 * @param shprSeq
	 */
	public void setShprSeq(String shprSeq) {
		this.shprSeq = shprSeq;
	}
	
	/**
	 * Column Info
	 * @param shprCntCd2
	 */
	public void setShprCntCd2(String shprCntCd2) {
		this.shprCntCd2 = shprCntCd2;
	}
	
	/**
	 * Column Info
	 * @param custCntCd
	 */
	public void setCustCntCd(String custCntCd) {
		this.custCntCd = custCntCd;
	}
	
	/**
	 * Column Info
	 * @param custCntCd
	 */
	public void setCustCntCd2(String custCntCd2) {
		this.custCntCd2 = custCntCd2;
	}
	
	public void setUpdDt(String updDt) {
    	this.updDt = updDt;
    }
	
	public void setUpdUsrId(String updUsrId) {
    	this.updUsrId = updUsrId;
    }
	
	public void setCreDt(String creDt) {
    	this.creDt = creDt;
    }
	
	public void setCreUsrId(String creUsrId) {
    	this.creUsrId = creUsrId;
    }
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setCustSeq2(JSPUtil.getParameter(request, "cust_seq2", ""));
		setFacOfcCd2(JSPUtil.getParameter(request, "fac_ofc_cd2", ""));
		setCustNm(JSPUtil.getParameter(request, "cust_nm", ""));
		setShprCntCd(JSPUtil.getParameter(request, "shpr_cnt_cd", ""));
		setFacOfcCd(JSPUtil.getParameter(request, "fac_ofc_cd", ""));
		setCustSeq(JSPUtil.getParameter(request, "cust_seq", ""));
		setShprSeq2(JSPUtil.getParameter(request, "shpr_seq2", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCustCdSeq(JSPUtil.getParameter(request, "cust_cd_seq", ""));
		setShprCdSeq(JSPUtil.getParameter(request, "shpr_cd_seq", ""));
		setShprNm(JSPUtil.getParameter(request, "shpr_nm", ""));
		setShprSeq(JSPUtil.getParameter(request, "shpr_seq", ""));
		setShprCntCd2(JSPUtil.getParameter(request, "shpr_cnt_cd2", ""));
		setCustCntCd(JSPUtil.getParameter(request, "cust_cnt_cd", ""));
		setCustCntCd2(JSPUtil.getParameter(request, "cust_cnt_cd2", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return AgtFacCustRltVO[]
	 */
	public AgtFacCustRltVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return AgtFacCustRltVO[]
	 */
	public AgtFacCustRltVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		AgtFacCustRltVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] custSeq2 = (JSPUtil.getParameter(request, prefix	+ "cust_seq2", length));
			String[] facOfcCd2 = (JSPUtil.getParameter(request, prefix	+ "fac_ofc_cd2", length));
			String[] custNm = (JSPUtil.getParameter(request, prefix	+ "cust_nm", length));
			String[] shprCntCd = (JSPUtil.getParameter(request, prefix	+ "shpr_cnt_cd", length));
			String[] facOfcCd = (JSPUtil.getParameter(request, prefix	+ "fac_ofc_cd", length));
			String[] custSeq = (JSPUtil.getParameter(request, prefix	+ "cust_seq", length));
			String[] shprSeq2 = (JSPUtil.getParameter(request, prefix	+ "shpr_seq2", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] custCdSeq = (JSPUtil.getParameter(request, prefix	+ "cust_cd_seq", length));
			String[] shprCdSeq = (JSPUtil.getParameter(request, prefix	+ "shpr_cd_seq", length));
			String[] shprNm = (JSPUtil.getParameter(request, prefix	+ "shpr_nm", length));
			String[] shprSeq = (JSPUtil.getParameter(request, prefix	+ "shpr_seq", length));
			String[] shprCntCd2 = (JSPUtil.getParameter(request, prefix	+ "shpr_cnt_cd2", length));
			String[] custCntCd = (JSPUtil.getParameter(request, prefix	+ "cust_cnt_cd", length));
			String[] custCntCd2 = (JSPUtil.getParameter(request, prefix	+ "cust_cnt_cd2", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			
			for (int i = 0; i < length; i++) {
				model = new AgtFacCustRltVO();
				if (custSeq2[i] != null)
					model.setCustSeq2(custSeq2[i]);
				if (facOfcCd2[i] != null)
					model.setFacOfcCd2(facOfcCd2[i]);
				if (custNm[i] != null)
					model.setCustNm(custNm[i]);
				if (shprCntCd[i] != null)
					model.setShprCntCd(shprCntCd[i]);
				if (facOfcCd[i] != null)
					model.setFacOfcCd(facOfcCd[i]);
				if (custSeq[i] != null)
					model.setCustSeq(custSeq[i]);
				if (shprSeq2[i] != null)
					model.setShprSeq2(shprSeq2[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (custCdSeq[i] != null)
					model.setCustCdSeq(custCdSeq[i]);
				if (shprCdSeq[i] != null)
					model.setShprCdSeq(shprCdSeq[i]);
				if (shprNm[i] != null)
					model.setShprNm(shprNm[i]);
				if (shprSeq[i] != null)
					model.setShprSeq(shprSeq[i]);
				if (shprCntCd2[i] != null)
					model.setShprCntCd2(shprCntCd2[i]);
				if (custCntCd[i] != null)
					model.setCustCntCd(custCntCd[i]);
				if (custCntCd2[i] != null)
					model.setCustCntCd2(custCntCd2[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getAgtFacCustRltVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return AgtFacCustRltVO[]
	 */
	public AgtFacCustRltVO[] getAgtFacCustRltVOs(){
		AgtFacCustRltVO[] vos = (AgtFacCustRltVO[])models.toArray(new AgtFacCustRltVO[models.size()]);
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
		this.custSeq2 = this.custSeq2 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.facOfcCd2 = this.facOfcCd2 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custNm = this.custNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.shprCntCd = this.shprCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.facOfcCd = this.facOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custSeq = this.custSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.shprSeq2 = this.shprSeq2 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custCdSeq = this.custCdSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.shprCdSeq = this.shprCdSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.shprNm = this.shprNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.shprSeq = this.shprSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.shprCntCd2 = this.shprCntCd2 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custCntCd = this.custCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custCntCd2 = this.custCntCd2 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
