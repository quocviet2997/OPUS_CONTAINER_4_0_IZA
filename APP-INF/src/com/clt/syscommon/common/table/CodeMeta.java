package com.clt.syscommon.common.table;

import java.util.ArrayList;
import java.util.Collection;

/**
 *  클래스 개요: 공통코드 메타정보 데이타 모델
 *  클래스 상세기능 : 공통코드 메타정보 기본 데이타 모델 기능.
 *                  HttpRequest 및 ResultSet으로부터 공통코드 메타정보 데이타모델로 파싱하는 기능 구현
 */
public class CodeMeta  {

  public static final int SEL_GUBN_NULL  = 0;
  public static final int SEL_GUBN_ALL   = 1;
  public static final int SEL_GUBN_EQUAL = 2;
  public static final int SEL_GUBN_LIKE  = 3;
  /*
  public static final int CODE_CUST_COMM = 4;
  public static final int CODE_CUST_REPR = 5;
  public static final int CODE_PROD_COMM = 6;
  */
  public static final int CODE_ORG            = 101;        //기관코드  (TB_MS_ORG)
  public static final int CODE_DEPT_ONLY      = 102;        //기관코드  (TB_MS_DEPT_ACNT)
  public static final int CODE_ORG_MANY       = 103;        //기관코드  (TB_MS_DEPT_ACNT)
  public static final int CODE_ORG_HIDDEN     = 104;
  public static final int CODE_ORG_NARA       = 105;        //나라21관리자 (TB_MS_MNG_ORG)
  public static final int CODE_ORG_NARA_MANY  = 106;
  public static final int CODE_USER           = 201;        //기관담당자(TB_MS_USER)
  public static final int CODE_MODULE         = 301;        //모듈      (TB_MS_MODULE)
  public static final int CODE_SYS            = 401;        //시스템    (TB_MS_SYS_ACNT)
	//test
	public static final int CODE_ORG3           = 902;        //PopUpTest
	public static final int CODE_ORG4           = 903;        //PopUpTest

  public static String[] getCodeGubnTitle( int codeGubn)
  {
    Collection col=new ArrayList();
    col.clear();  col.add("PopUp");    col.add("Code");    col.add("CodeName");
    switch(codeGubn) {
        case CodeMeta.CODE_ORG           :  col.clear(); col.add("T"); col.add("기관코드검색");   col.add("기관명");   col.add("기관코드");    break;
        case CodeMeta.CODE_DEPT_ONLY     :  col.clear(); col.add("T"); col.add("기관코드검색");   col.add("기관명");   col.add("기관코드");    break;
        case CodeMeta.CODE_ORG_MANY      :  col.clear(); col.add("T"); col.add("기관코드검색");   col.add("기관명");   col.add("기관코드");    break;
        case CodeMeta.CODE_ORG_HIDDEN    :  col.clear(); col.add("T"); col.add("기관코드검색");   col.add("기관명");   col.add("기관코드");    break;
        case CodeMeta.CODE_ORG_NARA      :  col.clear(); col.add("T"); col.add("기관코드검색");   col.add("기관명");   col.add("기관코드");    break;
        case CodeMeta.CODE_ORG_NARA_MANY :  col.clear(); col.add("T"); col.add("기관코드검색");   col.add("기관명");   col.add("기관코드");    break;
        case CodeMeta.CODE_USER          :  col.clear(); col.add("F"); col.add("기관담당자검색"); col.add("기관명");   col.add("담당자명");    break;
        case CodeMeta.CODE_MODULE        :  col.clear(); col.add("T"); col.add("모듈검색");       col.add("중계/연계구분");     col.add("모듈ID");     col.add("모듈명");   break;
        case CodeMeta.CODE_SYS           :  col.clear(); col.add("T"); col.add("시스템검색");     col.add("시스템명");   col.add("시스템ID");    break;

        //test
        case CodeMeta.CODE_ORG3   :  col.clear();  col.add("기관코드검색");   col.add("기관명");   col.add("기관코드"); col.add("기관코드");   break;
        case CodeMeta.CODE_ORG4   :  col.clear();  col.add("기관코드검색");   col.add("기관명");   col.add("기관코드"); col.add("기관코드"); col.add("기관코드");  break;
        //test 여기까지
    }
    Object[] arrObj=col.toArray();
    String[] rValue=new String[arrObj.length];
    for (int i=0; i<arrObj.length;i++)
    {
        rValue[i]=arrObj[i].toString();
    }
    return rValue;
  }

  public static String[] getCodeGubnHead( int codeGubn)
  {
    Collection col=new ArrayList();
    col.clear();  col.add("코드");    col.add("코드명");    col.add("약어");
    switch(codeGubn) {
        case CodeMeta.CODE_ORG            :  col.clear();  col.add("기관명");      col.add("기관코드"); break;
        case CodeMeta.CODE_DEPT_ONLY      :  col.clear();  col.add("기관명");      col.add("기관코드"); break;
        case CodeMeta.CODE_ORG_MANY       :  col.clear();  col.add("기관명");      col.add("기관코드"); break;
        case CodeMeta.CODE_ORG_HIDDEN     :  col.clear();  col.add("기관명");      col.add("기관코드"); break;
        case CodeMeta.CODE_ORG_NARA       :  col.clear();  col.add("기관명");      col.add("기관코드"); break;
        case CodeMeta.CODE_ORG_NARA_MANY  :  col.clear();  col.add("기관명");      col.add("기관코드"); break;
        case CodeMeta.CODE_USER           :  col.clear();  col.add("기관명");        col.add("부서명"); col.add("성명"); col.add("e-mail"); break;
        case CodeMeta.CODE_MODULE         :  col.clear();  col.add("중계/연계구분"); col.add("모듈ID"); col.add("모듈명");   break;
        case CodeMeta.CODE_SYS            :  col.clear();  col.add("시스템ID");      col.add("시스템명"); break;

        //test
        case CodeMeta.CODE_ORG3     :  col.clear();  col.add("계정ID");        col.add("시스템명");  col.add("주소");   break;
        case CodeMeta.CODE_ORG4     :  col.clear();  col.add("계정ID");        col.add("시스템명");  col.add("주소"); col.add("타입");      break;
        //test 여기까지

    }
    Object[] arrObj=col.toArray();
    String[] rValue=new String[arrObj.length];
    for (int i=0; i<arrObj.length;i++)
    {
        rValue[i]=arrObj[i].toString();
    }
    return rValue;
  }

  /*
  private String getRealCodeGubn( int codeGubn)
  {
    String rValue="";
    switch(codeGubn) {
        case CodeGubn.CODE_SIJA :    rValue="06";   break;
        default: rValue="";                         break;
    }
    return rValue;
  }
  */

}
