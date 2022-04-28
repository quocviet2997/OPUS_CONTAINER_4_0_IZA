/*=========================================================
* Copyright(c) 2006 CyberLogitec
* @FileName : ComEns011Event.java
* @FileTitle : Commodity정보조회(공통 Popup)
* Open Issues :
* Change history :
* @LastModifyDate : 2006-08-03
* @LastModifier : sungseok, choi
* @LastVersion : 1.0
* 2006-08-03 sungseok, choi
* 2009-05-22 hyunsu, Ryu
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.commodity.event;

import com.clt.bizcommon.commodity.vo.SearchCmdtCdRepCmdtCdVO;
import com.clt.framework.core.controller.html.HTMLAction;
import com.clt.framework.support.layer.event.EventSupport;


/**
 * COM_ENS_011 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * COM_ENS_011HTMLAction에서 작성<br>
 * ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author sungseok, choi
 * @see HTMLAction 참조
 * @since J2EE 1.4
 */public class ComEns012Event extends EventSupport {
    
		private static final long serialVersionUID = 1L;
		
		/** Table Value Object 조회 조건 및 단건 처리  */
		private SearchCmdtCdRepCmdtCdVO searchCmdtCdRepCmdtCdVO = null;
		
		/** Table Value Object Multi Data 처리 */
		private SearchCmdtCdRepCmdtCdVO[] searchCmdtCdRepCmdtCdVOs = null;

		/*private String rdo_search_type =null;
		
		public String getRdo_search_type() {
			return rdo_search_type;
		}

		public void setRdo_search_type(String rdo_search_type) {
			this.rdo_search_type = rdo_search_type;
		}
		 */
		public ComEns012Event(){}
		
		public void setSearchCmdtCdRepCmdtCdVO(SearchCmdtCdRepCmdtCdVO searchCmdtCdRepCmdtCdVO){
			this. searchCmdtCdRepCmdtCdVO = searchCmdtCdRepCmdtCdVO;
		}

		public void setSearchCmdtCdRepCmdtCdVOS(SearchCmdtCdRepCmdtCdVO[] searchCmdtCdRepCmdtCdVOs){
			if(searchCmdtCdRepCmdtCdVOs != null){
				SearchCmdtCdRepCmdtCdVO[] tmpVOs = java.util.Arrays.copyOf(searchCmdtCdRepCmdtCdVOs, searchCmdtCdRepCmdtCdVOs.length);
				this.searchCmdtCdRepCmdtCdVOs = tmpVOs;
			}
		}

		public SearchCmdtCdRepCmdtCdVO getSearchCmdtCdRepCmdtCdVO(){
			return searchCmdtCdRepCmdtCdVO;
		}

		public SearchCmdtCdRepCmdtCdVO[] getSearchCmdtCdRepCmdtCdVOS(){
			SearchCmdtCdRepCmdtCdVO[] rtnVOs = null;
			if (this.searchCmdtCdRepCmdtCdVOs != null) {
				rtnVOs = java.util.Arrays.copyOf(searchCmdtCdRepCmdtCdVOs, searchCmdtCdRepCmdtCdVOs.length);
			}
			return rtnVOs;
		}

	}