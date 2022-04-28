/*=========================================================
*Copyright(c) 2020 CyberLogitec
*@FileName : SinhVienBC.java
*@FileTitle : Sinh Vien
*Open Issues :
*Change history :
*@LastModifyDate : 2020.03.18
*@LastModifier : 
*@LastVersion : 1.0
* 2020.03.18 
* 1.0 Creation
=========================================================*/
package com.clt.apps.opus.dou.sinhvien.sinhvien.basic;

import java.util.List;

import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.apps.opus.dou.sinhvien.sinhvien.vo.SinhVienVO;

/**
 * ALPS-Sinhvien Business Logic Command Interface<br>
 * - ALPS-Sinhvien에 대한 비지니스 로직에 대한 인터페이스<br>
 *
 * @author Vi Nguyen
 * @since J2EE 1.6
 */

public interface SinhVienBC {

	/**
	 * [비즈니스대상]을 [행위] 합니다.<br>
	 * 
	 * @param SinhVienVO	sinhVienVO
	 * @return List<SinhVienVO>
	 * @exception EventException
	 * @throws DAOException 
	 */
	public List<SinhVienVO> searchSinhVien(SinhVienVO sinhVienVO) throws EventException, DAOException;
	
	/**
	 * [비즈니스대상]을 [행위] 합니다.<br>
	 * 
	 * @param SinhVienVO[] sinhVienVO
	 * @param account SignOnUserAccount
	 * @exception EventException
	 */
	public void manageSinhVien(SinhVienVO[] sinhVienVO,SignOnUserAccount account) throws EventException;
	
	/**
	 * [비즈니스대상]을 [행위] 합니다.<br>
	 * 
	 * @param SinhVienVO	sinhVienVO
	 * @return List<SinhVienVO>
	 * @exception EventException
	 * @throws DAOException 
	 */
	public List<SinhVienVO> searchKhoaHoc() throws DAOException, EventException;
	
	public List<SinhVienVO> searchKhoaHocDetails() throws DAOException, EventException;
}