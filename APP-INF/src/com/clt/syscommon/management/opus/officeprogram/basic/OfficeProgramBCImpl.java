/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : OfficeBCImpl.java
*@FileTitle : Office 조회(공통 Popup)
*Open Issues :
*Change history :
*@LastModifyDate : 2006-08-02
*@LastModifier : Hyunsu, Ryu
*@LastVersion : 1.0
* 2006-08-02 Hyunsu, Ryu
* 1.0 최초 생성
=========================================================*/
package com.clt.syscommon.management.opus.officeprogram.basic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.syscommon.common.table.ComOfcPgmMtchVO;
import com.clt.syscommon.management.opus.officeprogram.integration.OfficeProgramDBDAO;
import com.clt.syscommon.management.opus.officeprogram.vo.OfficeProgramListVO;
import com.clt.syscommon.management.opus.officeprogram.vo.SearchComOfcPgmMtchVO;


/**
 * ENIS-BIZCOMMON Business Logic Basic Command implementation<br>
 * - ENIS-BIZCOMMON에 대한 비지니스 로직을 처리한다.<br>
 * 
 * @author Hyunsu, Ryu
 * @see COM_ENS_071EventResponse,OfficeBC 각 DAO 클래스 참조
 * @since J2EE 1.4
 */
public class OfficeProgramBCImpl   extends BasicCommandSupport implements OfficeProgramBC {

    // Database Access Object
    private transient OfficeProgramDBDAO dbDao=null;

    /**
     * OfficeBCImpl 객체 생성<br>
     * OfficeDBDAO를 생성한다.<br>
     */
    public OfficeProgramBCImpl(){
        dbDao = new OfficeProgramDBDAO();
    }

    /**
     * 조회 이벤트 처리<br>
     * Office화면에 대한 조회 이벤트 처리<br>
     * 
     * @param SearchComOfcPgmMtchVO searchComOfcPgmMtchVO
     * @return List<OfficeProgramListVO>
     * @exception EventException
     */
    public  List<OfficeProgramListVO> searchOfficeProgramList(SearchComOfcPgmMtchVO searchComOfcPgmMtchVO) throws EventException {
   	
        int cnt  = 0; 
        List<OfficeProgramListVO> vos =null;
        try {
        	cnt    = dbDao.totalOffice(searchComOfcPgmMtchVO);
            vos = dbDao.searchOfficeProgramList(searchComOfcPgmMtchVO);
            if(vos.size()>0){
            	vos.get(0).setMaxRows(cnt);
            }
          
			return vos;

        } catch (DAOException de) {
            log.error("err "+de.toString(),de);
            throw new EventException(de.getMessage());
        }catch(Exception ex){
            log.error("err "+ex.toString(),ex);
            throw new EventException(ex.getMessage());
        }
    }

//    public DBRowSet searchPivotData(SearchComOfcPgmMtchVO searchComOfcPgmMtchVO) throws EventException {
//        DBRowSet rowSet=null; // 데이터 전송을 위해 DB ResultSet을 구현한 객체
//        try {
//
//            rowSet = dbDao.searchPivotData(searchComOfcPgmMtchVO);
//           
//			return rowSet;
//
//        } catch (DAOException de) {
//            log.error("err "+de.toString(),de);
//            throw new EventException(de.getMessage());
//        }catch(Exception ex){
//            log.error("err "+ex.toString(),ex);
//            throw new EventException(ex.getMessage());
//        }
//    }

    /**
     * Office별 상위 메뉴아래 하위 메뉴리스트를 조회한다.<br>
     * @param pgmNoForm	String 상위메뉴번호
     * @param ofcCd			String 오피스 코드 
     * @return DBRowSet
     * @exception EventException
     */
    public DBRowSet searchSubmenuList(String pgmNoForm, String ofcCd) throws EventException{
    	DBRowSet rowset = null;
    	try{
    		rowset = dbDao.searchSubmenuList(pgmNoForm,ofcCd);
        } catch (DAOException de) {
            log.error("err "+de.toString(),de);
            throw new EventException(de.getMessage());
        }catch(Exception ex){
            log.error("err "+ex.toString(),ex);
            throw new EventException(ex.getMessage());
        }
    	
    	return rowset;
    }


    /**
     * BIZCOMMON 업무 시나리오 마감작업<br>
     * Office업무 시나리오 종료시 관련 내부객체 해제<br>
     */
    public void doEnd() {
        dbDao = null;
    }

    /**
     * Office별 메뉴리스트를 저장한다.<br>
     * @param comOfcPgmMtchVOs	ComOfcPgmMtchVO[] Office별 메뉴리스트 정보 
     * @param SignOnUserAccount account
     * @exception EventException
     */
	public void multiOfficeProgram(ComOfcPgmMtchVO[] comOfcPgmMtchVOs, SignOnUserAccount account) throws EventException {

    	try{
    		Collection<ComOfcPgmMtchVO> insComOfcPgmMtchVOs =new ArrayList<ComOfcPgmMtchVO>();
    		Collection<ComOfcPgmMtchVO> delComOfcPgmMtchVOs =new ArrayList<ComOfcPgmMtchVO>();

			int cnt = comOfcPgmMtchVOs.length;
			for(int i=0;i<cnt;i++){
				if(comOfcPgmMtchVOs[i].getCheckVal().equals("1")){
					comOfcPgmMtchVOs[i].setCreUsrId(account.getUsr_id());
					insComOfcPgmMtchVOs.add(comOfcPgmMtchVOs[i]);
				}else if(comOfcPgmMtchVOs[i].getCheckVal().equals("0")){
					delComOfcPgmMtchVOs.add(comOfcPgmMtchVOs[i]);
				}
			}
			if(insComOfcPgmMtchVOs.size()>0){
				dbDao.addOfficeProgram(insComOfcPgmMtchVOs);
			}
			if(delComOfcPgmMtchVOs.size()>0){
				dbDao.removeOfficeProgram(delComOfcPgmMtchVOs);
			}
        } catch (DAOException de) {
            log.error("err "+de.toString(),de);
            throw new EventException(de.getMessage());
        }catch(Exception ex){
            log.error("err "+ex.toString(),ex);
            throw new EventException(ex.getMessage());
        }
	}
}