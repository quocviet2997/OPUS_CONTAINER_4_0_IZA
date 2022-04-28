/*********************************************************************************
'주  시 스 템 : 
'서브  시스템 : 샘플
'프로그램 ID  : PopupSample.js
'프로그램 명  : javascript 샘플 구성
'프로그램개요 : javascript 샘플 구성 화면 이벤트들을 수행한다.
'작   성   자 : 박상률/2006.08.03
'작   성   일 : 
==================================================================================
'수정자/수정일 : 
'수정사유/내역 : 
 *********************************************************************************/

document.onclick = processButtonClick;

function processButtonClick()
{
    
    try {
    	var srcName = window.event.srcElement.getAttribute("name");
    
    	with(document.theForm)
    	{
    	    
    		switch(srcName) {
    		    
    		    // 01. Commodity (COM_ENS_011)
                case "cmdt_btn":                   
                   var cmdt_cd_val = cmdt_cd.value;
                   //var mid_cmdt_val = mid_cmdt.value;
                   var rep_cmdt_cd_val = rep_cmdt_cd.value;
                   var rep_imdg_lvl_cd_val = rep_imdg_lvl_cd.value;
                   
                   var cmdt_nm_val = cmdt_nm.value;
                   var dispaly = cmdt_dispaly.value;
                   
                   // mdm param
                   var cmdt_mdm_yn_val = cmdt_mdm_yn.value;
                   var cmdt_delt_flg_val = cmdt_delt_flg.value;
                   
                   var mdm_param = "&delt_flg="+cmdt_delt_flg_val +"&mdm_yn="+cmdt_mdm_yn_val+"&f_cmd=2";
                   
                   var classId = "COM_ENS_011";
          		   var param = '?cmdt_cd='+cmdt_cd_val+'&rep_cmdt_cd='+rep_cmdt_cd_val+'&cmdt_nm='+cmdt_nm_val+'&rep_imdg_lvl_cd='+rep_imdg_lvl_cd_val+'&classId='+classId
          		   					+mdm_param ;
          			  
          		   var chkStr = dispaly.substring(0,3);
                        
                       // radio PopUp  
                       if(chkStr == "1,0") {
                    	   ComOpenPopup('/opuscntr/COM_ENS_011.do' + param, 778, 450, 'getCOM_ENS_011_1', dispaly, true);
                       } else if(chkStr == "0,1") {
                    	   ComOpenPopup('/opuscntr/COM_ENS_011.do' + param, 778, 450, 'getCOM_ENS_011_2', dispaly, true);
                       } else if(chkStr == "0,0") {
                    	   ComOpenPopup('/opuscntr/COM_ENS_011.do' + param, 778, 450, 'getCOM_ENS_011_3', dispaly, true);
                       } else if(chkStr == "1,1"){
                    	   ComShowMessage("팝업을 띄우기 위한 정보가 틀립니다. \n\n예) dispaly속성 앞두자리는 [0,0], [0,1], [1,0] 만 가능합니다.");
                           return;
                       } else {
                    	   ComShowMessage("팝업을 띄우기dispaly속성 정보가 부족합니다.");
                           return;
                      }
                    break;
                
                // 02. Contract (COM_ENS_021)
                case "cnt_btn":
                  var v1 = cnt_txt1.value;
  				  var v2 = cnt_txt2.value;
  				  var v5 = cnt_txt5.value;
  				  
  				  var mdm_yn = cnt_mdm_yn.value;
  				  var delt_flg = cnt_delt_flg.value;
  				 
  				  var display = cnt_display.value;
  				  var classId = "COM_ENS_021";
  				  var param = '?cont_tp='+v1+'&cont_no='+v2+'&cust_nm='+v5+'&mdm_yn='+mdm_yn+'&delt_flg='+delt_flg+'&classId='+classId;
  				  //alert("param => "+param);
  				  var chkStr = display.substring(0,3);
  				  
  				  if(chkStr == "1,0") {		
  					ComOpenPopup('/opuscntr/COM_ENS_021.do' + param, 778, 440, 'getCOM_ENS_021_1', display, true);	// radio PopUp  
  				  } else if(chkStr == "0,1") {
  					ComOpenPopup('/opuscntr/COM_ENS_021.do' + param, 778, 440, 'getCOM_ENS_021_2', display, true);	// check PopUp  
  				  } else if(chkStr == "0,0") {
  					ComOpenPopup('/opuscntr/COM_ENS_021.do' + param, 778, 440, 'getCOM_ENS_021_3', display, true);	// list PopUp  
  				  } else if(chkStr == "1,1"){
  					ComShowMessage("팝업을 띄우기 위한 정보가 틀립니다. \n\n예) display속성 앞두자리는 [0,0], [0,1], [1,0] 만 가능합니다.");
  					  return;
  				  } else {
  					ComShowMessage("팝업을 띄우기display속성 정보가 부족합니다.");
  					return;
  				  }
				  break;
//				
//				// 03. Contract (COM_ENS_021) 달력
//				case "btns_calendar1":
//        	         var cal = new calendarPopup();
//            		 cal.select(cnt_txt3, 'cnt_txt3', 'yyyy-MM-dd');
//        	        break;
//                
//                // 03. Contract (COM_ENS_021) 달력
//        	    case "btns_calendar2":
//        	         var cal = new calendarPopup();
//            		 cal.select(cnt_txt4, 'cnt_txt4', 'yyyy-MM-dd');
//        	        break;
//				  
				// 04. Customer (COM_ENS_041)
                case "cust01_btn":
  				  var v1 = cust01_txt1.value;
  				  var v3 = cust01_txt3.value;
  				  var v4 = cust01_txt4.value;
  				  
  				  var mdm_yn = cust01_mdm_yn.value;
  				  var delt_flg = cust01_delt_flg.value;
  				  
  				  var display = "1,0,0,1,1,1,1,1,1,1,1,1";//cust01_display.value;
  				  var classId = "COM_ENS_041";
  				  var param = '?cust_cd='+v1+'&cust_nm='+v4+'&ofc_cd='+v3+'&classId='+classId+"&mdm_yn="+mdm_yn+"&delt_flg="+delt_flg;
  						  
  				  var chkStr = display.substring(0,3);
                
  				  
  				  if(chkStr == "1,0") {		
  					ComOpenPopup('/opuscntr/COM_ENS_041.do' + param, 768, 420, 'getCOM_ENS_041_1', display);	// radio PopUp  
  				  } else if(chkStr == "0,1") {
  					ComOpenPopup('/opuscntr/COM_ENS_041.do' + param, 768, 420, 'getCOM_ENS_041_2', display);	// check PopUp  
  				  } else if(chkStr == "0,0") {
  					ComOpenPopup('/opuscntr/COM_ENS_041.do' + param, 768, 420, 'getCOM_ENS_041_3', display);	// list PopUp  
  				  } else if(chkStr == "1,1"){
  					ComShowMessage("팝업을 띄우기 위한 정보가 틀립니다. \n\n예) display속성 앞두자리는 [0,0], [0,1], [1,0] 만 가능합니다.");
  					  return;
  				  } else {
  					ComShowMessage("팝업을 띄우기display속성 정보가 부족합니다.");
  					return;
  				  }
				  break;
				  
				  
				// 04. Customer (COM_ENS_042)
                case "cust02_btn":
  				  var v1 = cust02_txt1.value;
  				  var v2 = cust02_txt2.value;
  				  var v3 = cust02_txt3.value;
  				  var display = cust02_display.value;
  				  var classId = "COM_ENS_042";
  				  var param = '?loc_cd='+v1+'&cust_cd='+v2+'&cust_nm='+v3+'&classId='+classId;
  				  
  				  var chkStr = display.substring(0,3);
  				  
  				  if(chkStr == "1,0") {		
  					ComOpenPopup('/opuscntr/COM_ENS_042.do' + param, 770, 380, 'getCOM_ENS_042_1', display);	// check PopUp  
  				  } else if(chkStr == "0,1") {
  					ComOpenPopup('/opuscntr/COM_ENS_042.do' + param, 770, 380, 'getCOM_ENS_042_2', display);	// check PopUp  
  				  } else if(chkStr == "0,0") {
  					ComOpenPopup('/opuscntr/COM_ENS_042.do' + param, 770, 380, 'getCOM_ENS_042_3', display);	// list PopUp  
  				  } else if(chkStr == "1,1"){
  					ComShowMessage("팝업을 띄우기 위한 정보가 틀립니다. \n\n예) display속성 앞두자리는 [0,0], [0,1], [1,0] 만 가능합니다.");
  					  return;
  				  } else {
  					ComShowMessage("팝업을 띄우기display속성 정보가 부족합니다.");
  					return;
  				  }
				  break;
				  
				// 05. Location (COM_ENS_051)
                case "com_ens_051_btn":
                   var conti_cd_val = "";// com_ens_051_conti_cd.value;
                   var sconti_cd_val = "";// com_ens_051_sconti_cd.value;
                   var cnt_cd_val = com_ens_051_cnt_cd.value;
                   var loc_state_val = com_ens_051_loc_state.value;
                   var loc_eq_ofc_val = com_ens_051_loc_eq_ofc.value;
                   var loc_cd_val = com_ens_051_loc_cd.value;
                   var loc_desc_val = com_ens_051_loc_desc.value;
                   var sys_code = com_ens_051_sys_code.value;
                   
                   var mdm_yn = com_ens_051_mdm_yn.value;
                   var delt_flg = com_ens_051_delt_flg.value;
                   var scc_flg = com_ens_051_scc_flg.value;
                   
                   var loc_port_ind_val = "";
                   if(com_ens_051_loc_port_ind.checked) {
                       loc_port_ind_val = "1";
                   } else {
                       loc_port_ind_val = "0";
                   }
                   
                   var dispaly = com_ens_051_dispaly.value;
        	       var classId = "COM_ENS_051";
        		   var param = '?conti_cd='+conti_cd_val+'&sconti_cd='+sconti_cd_val+'&cnt_cd='+cnt_cd_val+'&loc_state='+loc_state_val
        		              +'&loc_eq_ofc='+loc_eq_ofc_val+'&loc_cd='+loc_cd_val+'&loc_desc='+loc_desc_val+'&scc_flg='+scc_flg
        		              +'&loc_port_ind='+loc_port_ind_val+'&sysCode='+sys_code+'&classId='+classId+'&mdm_yn='+mdm_yn+'&delt_flg='+delt_flg;
        		   var chkStr = dispaly.substring(0,3);
                      
                       // radio PopUp  
                       if(chkStr == "1,0") {
                    	   ComOpenPopup('/opuscntr/COM_ENS_051.do' + param, 770, 410, 'getCOM_ENS_051_1', dispaly);
                       } else if(chkStr == "0,1") {
                    	   ComOpenPopup('/opuscntr/COM_ENS_051.do' + param, 770, 410, 'getCOM_ENS_051_2', dispaly);
                       } else if(chkStr == "0,0") {
                    	   ComOpenPopup('/opuscntr/COM_ENS_051.do' + param, 770, 410, 'getCOM_ENS_051_3', dispaly);
                       } else if(chkStr == "1,1"){
                    	   ComShowMessage("팝업을 띄우기 위한 정보가 틀립니다. \n\n예) dispaly속성 앞두자리는 [0,0], [0,1], [1,0] 만 가능합니다.");
                           return;
                       } else {
                    	   ComShowMessage("팝업을 띄우기dispaly속성 정보가 부족합니다.");
                           return;
                      }
                  break;
                  
                // 06. Node (COM_ENS_061)
                case "com_ens_061_btn":                  
  				  var v1 = com_ens_061_cnt_cd.value;
  				  var v2 = com_ens_061_loc_cd.value;
  				  var v3 = com_ens_061_ofc_cd.value;
  				  var v4 = com_ens_061_node_cd.value;
  				  var v5 = com_ens_061_node_nm.value;
  				  
  				  var v6 = "";
  				  if(com_ens_061_mode) {
      				  if(com_ens_061_mode[0] && com_ens_061_mode[0].checked) {
      				      v6 = com_ens_061_mode[0].value;
      				  } else {
      				      v6 = com_ens_061_mode[1].value;
      				  }
  				  }
  				  
  				  var v7 = "N";
  				  if(com_ens_061_mode_only.checked) {
  				      v7 = "Y";
  				  }
  				  
  				  var mdmyn = com_ens_061_mdm_yn.value;
  				  var deltflg =com_ens_061_delt_flg.value;
  				  
  				  var display = com_ens_061_display.value;
  				  var classId = "COM_ENS_061";
  				  var param = '?cnt_cd='+v1+'&loc_cd='+v2+'&ofc_cd='+v3+'&node_cd='+v4+'&node_nm='+v5+'&mode='+v6+'&mode_only='+v7+'&classId='+classId+"&mdm_yn="+mdmyn+"&delt_flg="+deltflg;
  				  var chkStr = display.substring(0,3);
                
  				  if(chkStr == "1,0") {		
  					ComOpenPopup('/opuscntr/COM_ENS_061.do' + param, 800, 425, 'getCOM_ENS_061_1', display);	// radio PopUp  
  				  } else if(chkStr == "0,1") {
  					ComOpenPopup('/opuscntr/COM_ENS_061.do' + param, 800, 425, 'getCOM_ENS_061_2', display);	// check PopUp  
  				  } else if(chkStr == "0,0") {
  					ComOpenPopup('/opuscntr/COM_ENS_061.do' + param, 800, 425, 'getCOM_ENS_061_3', display);	// list PopUp  
  				  } else if(chkStr == "1,1"){
  					ComShowMessage("팝업을 띄우기 위한 정보가 틀립니다. \n\n예) display속성 앞두자리는 [0,0], [0,1], [1,0] 만 가능합니다.");
  					  return;
  				  } else {
  					ComShowMessage("팝업을 띄우기display속성 정보가 부족합니다.");
  					return;
  				  }
	              break;
	              
	            // 07. Office (COM_ENS_071)
                case "ofc_btn":
                   var ofc_lev_val = ofc_lev.value;
                   var ofc_pts_cd_val = ofc_pts_cd.value;
                   var ofc_cd_val = ofc_cd.value;
                   var ofc_nm_val = ofc_nm.value;
                   var ofc_mdm_val = ofc_mdm_yn.value;
                   var ofc_delt_val = ofc_delt_flg.value;
                   
                   var dispaly = ofc_dispaly.value;
      			   var classId = "COM_ENS_071";
      			   var param = '?ofc_lev='+ofc_lev_val+'&ofc_pts_cd='+ofc_pts_cd_val+'&ofc_cd='+ofc_cd_val+'&ofc_nm='+ofc_nm_val+'&classId='+classId+"&mdm_yn="+ofc_mdm_val+"&delt_flg="+ofc_delt_val;
			  
      			   var chkStr = dispaly.substring(0,3);
                  
                   // radio PopUp  
                   if(chkStr == "1,0") {
                	   ComOpenPopup('/opuscntr/COM_ENS_071.do' + param, 980, 430, 'getCOM_ENS_071_1', dispaly);
                   } else if(chkStr == "0,1") {
                	   ComOpenPopup('/opuscntr/COM_ENS_071.do' + param, 980, 430, 'getCOM_ENS_071_2', dispaly);
                   } else if(chkStr == "0,0") {
                	   ComOpenPopup('/opuscntr/COM_ENS_071.do' + param, 980, 430, 'getCOM_ENS_071_3', dispaly);
                   } else if(chkStr == "1,1"){
                	   ComShowMessage("팝업을 띄우기 위한 정보가 틀립니다. \n\n예) dispaly속성 앞두자리는 [0,0], [0,1], [1,0] 만 가능합니다.");
                       return;
                   } else {
                	   ComShowMessage("팝업을 띄우기dispaly속성 정보가 부족합니다.");
                       return;
                  }
                  break;
                  
                // 08. Lane (COM_ENS_081)
                case "com_ens_081_btn":                  
  				  var v1 = com_ens_081_mode.value;
  				  var v2 = com_ens_081_trade_cd.value;
  				  var v3 = com_ens_081_sub_trade_cd.value;
  				  var v4 = com_ens_081_lane_cd.value;
  				  var v5 = com_ens_081_lane_nm.value;
  				  var v6 = com_ens_081_svc_tp.value;
  				  var mdm_yn = com_ens_081_mdm_yn.value;
  				  var delt_flg = com_ens_081_delt_flg.value;
  				  
  				  var display = com_ens_081_display.value;
  				  var classId = "COM_ENS_081";
  				  
  				  var param = "";
  				  if(v1 == "rev") {
  				      param = '?mode='+v1+'&trade_cd='+v2+'&sub_trade_cd='+v3+'&lane_cd='+v4+'&lane_nm='+v5+'&svc_tp='+v6+'&classId='+classId+"&mdm_yn="+mdm_yn+"&delt_flg="+delt_flg;
  				  } else {
  				      param = '?mode='+v1+'&lane_cd='+v4+'&lane_nm='+v5+'&svc_tp='+v6+'&classId='+classId+"&mdm_yn="+mdm_yn+"&delt_flg="+delt_flg;
  				  }
  				  
  				  var chkStr = display.substring(0,3);
                
  				  if(chkStr == "1,0") {		
  					ComOpenPopup('/opuscntr/COM_ENS_081.do' + param, 770, 420, 'getCOM_ENS_081_1', display);	// radio PopUp  
  				  } else if(chkStr == "0,1") {
  					ComOpenPopup('/opuscntr/COM_ENS_081.do' + param, 770, 420, 'getCOM_ENS_081_2', display);	// check PopUp  
  				  } else if(chkStr == "0,0") {
  					ComOpenPopup('/opuscntr/COM_ENS_081.do' + param, 770, 420, 'getCOM_ENS_081_3', display);	// list PopUp  
  				  } else if(chkStr == "1,1"){
  					ComShowMessage("팝업을 띄우기 위한 정보가 틀립니다. \n\n예) display속성 앞두자리는 [0,0], [0,1], [1,0] 만 가능합니다.");
  					  return;
  				  } else {
  					ComShowMessage("팝업을 띄우기display속성 정보가 부족합니다.");
  					return;
  				  }
	              break; 
	              
	            // 09-01. Staff (COM_ENS_091)
                case "com_ens_091_btn":                
  				  var v1 = com_ens_091_ofc_cd.value;
  				  var v2 = com_ens_091_user_cd.value;
  				  var v3 = com_ens_091_user_nm.value;
  				  var display = com_ens_091_display.value;
  				  var classId = "COM_ENS_091";
  				  var param = '?ofc_cd='+v1+'&user_cd='+v2+'&user_nm='+v3+'&classId='+classId+"&f_cmd=2";
  				 
  				  var chkStr = display.substring(0,3);
                
  				  
  				  if(chkStr == "1,0") {					  
  					ComOpenPopup('/opuscntr/COM_ENS_091.do' + param, 780, 535, 'getCOM_ENS_091_1', display,true, true);
  				  } else if(chkStr == "0,1") {
  					ComOpenPopup('/opuscntr/COM_ENS_091.do' + param, 780, 535, 'getCOM_ENS_091_2', display, true, true);
  				  } else if(chkStr == "0,0") {
  					ComOpenPopup('/opuscntr/COM_ENS_091.do' + param, 780, 535, 'getCOM_ENS_091_3', display, true);	// list PopUp  
  				  } else if(chkStr == "1,1"){
  					ComShowMessage("팝업을 띄우기 위한 정보가 틀립니다. \n\n예) display속성 앞두자리는 [0,0], [0,1], [1,0] 만 가능합니다.");
  					  return;
  				  } else {
  					ComShowMessage("팝업을 띄우기display속성 정보가 부족합니다.");
  					return;
  				  }
				  break;
				
				// 09-02. Notified Subscriber (COM_ENS_092)
                case "com_ens_092_btn":                
  				  //var v1 = com_ens_092_user_id.value;
  				  //var v2 = com_ens_092_user_email.value;
  				  var classId = "COM_ENS_092";
  				  //var param = '?usr_id='+v1+'&usr_eml='+v2+'&classId='+classId;
  				  var param = '?classId='+classId;
  				 
  				  ComOpenPopup('/opuscntr/COM_ENS_092.do' + param, 810, 450, 'getCOM_ENS_092', '1,0,1,1,1,1,0,0,0,0,0,0,0,0,0', true);	// radio PopUp  
  				  
				  break;
                 
    		    // 10. Vessel (COM_ENS_0A1)(완료)
    			case "sp1_btn":
  				  var v1 = sp1_txt1.value;
  				  var v2 = sp1_txt2.value;
  				  var v3 = sp1_txt3.value;
  				  
  				  var mdm_yn = sp1_mdm_yn.value;
  				  var delt_flg = sp1_delt_flg.value;
  				  
  				  var display = sp1_display.value;
  				  var classId = "COM_ENS_0A1";
  				  var param = '?vsl_cd='+v1+'&vsl_eng_nm='+v2+'&car_cd='+v3+'&classId='+classId+"&mdm_yn="+mdm_yn+"&delt_flg="+delt_flg;
  						  
  				  var chkStr = display.substring(0,3);
                
  				  
  				  if(chkStr == "1,0") {		
  					  if(mdm_yn == "Y"){
  						  ComOpenPopup('/opuscntr/COM_ENS_0A1.do' + param, 950, 420, 'getCOM_ENS_0A1_1', display);	// radio PopUp  
  					  }else{
  						  ComOpenPopup('/opuscntr/COM_ENS_0A1.do' + param, 880, 420, 'getCOM_ENS_0A1_1', display);	// radio PopUp  
  					  }
  				  } else if(chkStr == "0,1") {
  					 if(mdm_yn == "Y"){
 						  ComOpenPopup('/opuscntr/COM_ENS_0A1.do' + param, 950, 420, 'getCOM_ENS_0A1_2', display);	// radio PopUp  
 					  }else{
 						  ComOpenPopup('/opuscntr/COM_ENS_0A1.do' + param, 880, 420, 'getCOM_ENS_0A1_2', display);	// radio PopUp  
 					  }
  				  } else if(chkStr == "0,0") {
  					if(mdm_yn == "Y"){
						  ComOpenPopup('/opuscntr/COM_ENS_0A1.do' + param, 950, 420, 'getCOM_ENS_0A1_3', display);	// radio PopUp  
					  }else{
						  ComOpenPopup('/opuscntr/COM_ENS_0A1.do' + param, 880, 420, 'getCOM_ENS_0A1_3', display);	// radio PopUp  
					  }
  				  } else if(chkStr == "1,1"){
  					ComShowMessage("팝업을 띄우기 위한 정보가 틀립니다. \n\n예) display속성 앞두자리는 [0,0], [0,1], [1,0] 만 가능합니다.");
  					  return;
  				  } else {
  					ComShowMessage("팝업을 띄우기display속성 정보가 부족합니다.");
  					return;
  				  }
				  break;
				  
				// 11. Vessel SKD (COM_ENS_0B1)
                case "vesselskd01_btn":
  				  var v1 = vvd01_cd.value;
  				  var display = vslskd01_display.value;
  				  var classId = "COM_ENS_0B1";
  				  var param = '?vvd_cd='+v1+'&classId='+classId;
  						  
  				  var chkStr = display.substring(0,3);
                
  				  
  				  if(chkStr == "1,0") {		
  					ComOpenPopup('/opuscntr/COM_ENS_0B1.do' + param, 620, 450, 'getCOM_ENS_0B1_1', display);	// radio PopUp  
  				  } else if(chkStr == "0,1") {
  					ComOpenPopup('/opuscntr/COM_ENS_0B1.do' + param, 620, 450, 'getCOM_ENS_0B1_2', display);	// check PopUp  
  				  } else if(chkStr == "0,0") {
  					ComOpenPopup('/opuscntr/COM_ENS_0B1.do' + param, 620, 450, 'getCOM_ENS_0B1_3', display);	// list PopUp  
  				  } else if(chkStr == "1,1"){
  					ComShowMessage("팝업을 띄우기 위한 정보가 틀립니다. \n\n예) display속성 앞두자리는 [0,0], [0,1], [1,0] 만 가능합니다.");
  					  return;
  				  } else {
  					ComShowMessage("팝업을 띄우기display속성 정보가 부족합니다.");
  					return;
  				  }
				  break;					  	  
	  	  
				  
				// 11. VVD (COM_ENS_0B2)
                case "vesselskd02_btn":
  				  var v1 = vslskd02_etdeta.value;
  				  var v2 = vslskd02_sdate.value;
  				  var v3 = vslskd02_edate.value;
  				  var v4 = vslskd02_vvd.value;
  				  var v5 = vslskd02_loc.value;
  				  var v6 = vslskd02_lane.value;
  				  var v7 = vslskd02_oper.value;

  				  var display = vslskd02_display.value;
  				  var classId = "COM_ENS_0B2";
  				  
  				  var param = '?etdeta='+v1+  
  				              '&sdate='+v2+             
  				              '&edate='+v3+             
  				              '&vvd_cd='+v4+             
  				              '&loc_cd='+v5+             
  				              '&lane_cd='+v6+             
  				              '&oper='+v7+             
  				              '&classId='+classId;
  						  
  				  var chkStr = display.substring(0,3);
                
  				  
  				  if(chkStr == "1,0") {		
  					ComOpenPopup('/opuscntr/COM_ENS_0B2.do' + param, 770, 420, 'getCOM_ENS_0B2_1', display);	// radio PopUp  
  				  } else if(chkStr == "0,1") {
  					ComOpenPopup('/opuscntr/COM_ENS_0B2.do' + param, 770, 420, 'getCOM_ENS_0B2_2', display);	// check PopUp  
  				  } else if(chkStr == "0,0") {
  					ComOpenPopup('/opuscntr/COM_ENS_0B2.do' + param, 770, 420, 'getCOM_ENS_0B2_3', display);	// list PopUp  
  				  } else if(chkStr == "1,1"){
  					ComShowMessage("팝업을 띄우기 위한 정보가 틀립니다. \n\n예) display속성 앞두자리는 [0,0], [0,1], [1,0] 만 가능합니다.");
  					  return;
  				  } else {
  					ComShowMessage("팝업을 띄우기display속성 정보가 부족합니다.");
  					return;
  				  }
				  break;
				  
				  /*var v1 = vslskd02_etdeta.value;
  				  var v2 = vslskd02_sdate.value;
  				  var v3 = vslskd02_edate.value;
  				  var v4 = vslskd02_vvd.value;
  				  var v5 = vslskd02_loc.value;
  				  var v6 = vslskd02_lane.value;
  				  var v7 = vslskd02_oper.value;

  				  var display = vslskd02_display.value;
  				  var classId = "COM_ENS_0B2";
  				  
                  var targetObjList = "vvd:vslskd02_vvd";
  				  var param = '?etdeta='+v1+  
  				              '&sdate='+v2+             
  				              '&edate='+v3+             
  				              '&vvd_cd='+v4+             
  				              '&loc_cd='+v5+             
  				              '&lane_cd='+v6+             
  				              '&oper='+v7+             
  				              '&classId='+classId;
  				  
  				  comPopupWithTargetObj('/opuscntr/COM_ENS_0B2.do' + param, 770, 470, targetObjList, display, true);
	              break;*/					  	  
	  	        
	  	        // 03. Contract (COM_ENS_021) 달력
				case "vslskd02_calendar1":
        	         var cal = new calendarPopup();
            		 cal.select(vslskd02_sdate, 'vslskd02_sdate', 'yyyy-MM-dd');
        	         break;
                
                // 03. Contract (COM_ENS_021) 달력
        	    case "vslskd02_calendar2":
        	         var cal = new calendarPopup();
            		 cal.select(vslskd02_edate, 'vslskd02_edate', 'yyyy-MM-dd');
        	         break;
				  
				// 12. Service Provider (COM_ENS_0C1)
                case "sp_btn":
  				  var v2 = sp_txt2.value;
  				  var v5 = sp_txt5.value;
  				  var v6 = sp_vndr_cd.value;
  				  var mdm_yn = sp_mdm_yn.value;
  				  var delt_flg = sp_delt_flg.value;
  				  
  				  var display = sp_display.value;
  				  var classId = "COM_ENS_0C1";
  				  var param = '?vndr_cd='+v6+'&vndr_nm_eng='+v2+'&pts_vndr_cd='+v5+'&classId='+classId+"&mdm_yn="+mdm_yn+"&delt_flg="+delt_flg;
  				  var chkStr = display.substring(0,3);
                
  				  if(chkStr == "1,0") {		
  					ComOpenPopup('/opuscntr/COM_ENS_0C1.do' + param, 700, 400, 'getCOM_ENS_0C1_1', display);	// radio PopUp  
  				  } else if(chkStr == "0,1") {
  					ComOpenPopup('/opuscntr/COM_ENS_0C1.do' + param, 700, 400, 'getCOM_ENS_0C1_2', display);	// check PopUp  
  				  } else if(chkStr == "0,0") {
  					ComOpenPopup('/opuscntr/COM_ENS_0C1.do' + param, 700, 400, 'getCOM_ENS_0C1_3', display);	// list PopUp  
  				  } else if(chkStr == "1,1"){
  					ComShowMessage("팝업을 띄우기 위한 정보가 틀립니다. \n\n예) display속성 앞두자리는 [0,0], [0,1], [1,0] 만 가능합니다.");
  					  return;
  				  } else {
  					ComShowMessage("팝업을 띄우기display속성 정보가 부족합니다.");
  					return;
  				  }
	              break;
	              
	              // 13. ACCOUNT (COM_ENS_0C1)
                case "acct_btn":
                	var v1 = acct_cd.value;
                	var v2 = acct_eng_nm.value;
                	var v4 = acct_mdm_yn.value;
                	var v5 = acct_delt_flg.value;
                	var display = acct_display.value;
                	var classId = "COM_ENS_N11";
                	var param = '?acct_cd='+v1+'&acct_eng_nm='+v2+'&mdm_yn='+v4+'&delt_flg='+v5+'&classId='+classId+'&f_cmd=2';
                	
                	var chkStr = display.substring(0,3);
                	
                	if(chkStr == "1,0") {		
                		ComOpenPopup('/opuscntr/COM_ENS_N11.do' + param, 700, 400, 'getCOM_ENS_N11_1', display);	// radio PopUp  
                	} else if(chkStr == "0,1") {
                		ComOpenPopup('/opuscntr/COM_ENS_N11.do' + param, 700, 400, 'getCOM_ENS_N11_2', display);	// check PopUp  
                	} else if(chkStr == "0,0") {
                		ComOpenPopup('/opuscntr/COM_ENS_N11.do' + param, 700, 400, 'getCOM_ENS_N11_3', display);	// list PopUp  
                	} else if(chkStr == "1,1"){
                		ComShowMessage("팝업을 띄우기 위한 정보가 틀립니다. \n\n예) display속성 앞두자리는 [0,0], [0,1], [1,0] 만 가능합니다.");
                		return;
                	} else {
                		ComShowMessage("팝업을 띄우기display속성 정보가 부족합니다.");
                		return;
                	}
                	break;
                	
                	// 14. CNTR TYPE/SIZE (COM_ENS_0G1)
                case "cntr0g1_btn":
                	var v1 = cntr0g1_tpsz_cd.value;
                	var v2 = cntr0g1_tpsz_desc.value;
                	var v4 = cntr0g1_mdm_yn.value;
                	var v5 = cntr0g1_delt_flg.value;
                	var display = cntr0g1_display.value;
                	var classId = "COM_ENS_0G1";
                	var param = '?cntr_tpsz_cd='+v1+'&cntr_tpsz_desc='+v2+'&mdm_yn='+v4+'&delt_flg='+v5+'&classId='+classId;
                	
                	var chkStr = display.substring(0,3);
                	
                	if(chkStr == "1,0") {		
                		ComOpenPopup('/opuscntr/COM_ENS_0G1.do' + param, 600, 400, 'getCOM_ENS_0G1_1', display);	// radio PopUp  
                	} else if(chkStr == "0,1") {
                		ComOpenPopup('/opuscntr/COM_ENS_0G1.do' + param, 600, 400, 'getCOM_ENS_0G1_2', display);	// check PopUp  
                	} else if(chkStr == "0,0") {
                		ComOpenPopup('/opuscntr/COM_ENS_0G1.do' + param, 600, 400, 'getCOM_ENS_0G1_3', display);	// list PopUp  
                	} else if(chkStr == "1,1"){
                		ComShowMessage("팝업을 띄우기 위한 정보가 틀립니다. \n\n예) display속성 앞두자리는 [0,0], [0,1], [1,0] 만 가능합니다.");
                		return;
                	} else {
                		ComShowMessage("팝업을 띄우기display속성 정보가 부족합니다.");
                		return;
                	}
                	break;
                	
                	// 15. Rep Commodity Code (COM_ENS_0K1)
                case "rep1_btn":
                	var v1 = rep1_cmdt_cd.value;
                	var v2 = rep1_cmdt_nm.value;
                	var v4 = rep1_mdm_yn.value;
                	var v5 = rep1_delt_flg.value;
                	
                	var display = rep1_display.value;
                	var classId = "COM_ENS_0K1";
                	var param = '?rep_cmdt_cd='+v1+'&rep_cmdt_nm='+v2+'&mdm_yn='+v4+'&delt_flg='+v5+'&classId='+classId;
                	
                	var chkStr = display.substring(0,3);
                	
                	if(chkStr == "1,0") {		
                		ComOpenPopup('/opuscntr/COM_ENS_0K1.do' + param, 700, 400, 'getCOM_ENS_0K1_1', display);	// radio PopUp  
                	} else if(chkStr == "0,1") {
                		ComOpenPopup('/opuscntr/COM_ENS_0K1.do' + param, 700, 400, 'getCOM_ENS_0K1_2', display);	// check PopUp  
                	} else if(chkStr == "0,0") {
                		ComOpenPopup('/opuscntr/COM_ENS_0K1.do' + param, 700, 400, 'getCOM_ENS_0K1_3', display);	// list PopUp  
                	} else if(chkStr == "1,1"){
                		ComShowMessage("팝업을 띄우기 위한 정보가 틀립니다. \n\n예) display속성 앞두자리는 [0,0], [0,1], [1,0] 만 가능합니다.");
                		return;
                	} else {
                		ComShowMessage("팝업을 띄우기display속성 정보가 부족합니다.");
                		return;
                	}
                	break;
                	
                	// 16. Continent Code Inquiry (COM_ENS_0H1)
                case "conti_inqu_btn":
                	var v1 = conti_inqu_cd.value;
                	var v2 = conti_inqu_nm.value;
                	var v4 = conti_inqu_mdm_yn.value;
                	var v5 = conti_inqu_delt_flg.value;
                	
                	var display = conti_inqu_display.value;
                	var classId = "COM_ENS_0H1";
                	var param = '?conti_cd='+v1+'&conti_nm='+v2+'&mdm_yn='+v4+'&delt_flg='+v5+'&classId='+classId;
                	var chkStr = display.substring(0,3);
                	
                	if(chkStr == "1,0") {		
                		ComOpenPopup('/opuscntr/COM_ENS_0H1.do' + param, 430, 400, 'getCOM_ENS_0H1_1', display);	// radio PopUp  
                	} else if(chkStr == "0,1") {
                		ComOpenPopup('/opuscntr/COM_ENS_0H1.do' + param, 430, 400, 'getCOM_ENS_0H1_2', display);	// check PopUp  
                	} else if(chkStr == "0,0") {
                		ComOpenPopup('/opuscntr/COM_ENS_0H1.do' + param, 430, 400, 'getCOM_ENS_0H1_3', display);	// list PopUp  
                	} else if(chkStr == "1,1"){
                		ComShowMessage("팝업을 띄우기 위한 정보가 틀립니다. \n\n예) display속성 앞두자리는 [0,0], [0,1], [1,0] 만 가능합니다.");
                		return;
                	} else {
                		ComShowMessage("팝업을 띄우기display속성 정보가 부족합니다.");
                		return;
                	}
                	break;
                	
                	// 17. Sub Continent Code Inquiry (COM_ENS_0I1)
                case "sconti_inqu_btn":
                	var v1 = sconti_inqu_cd.value;
                	var v2 = sconti_inqu_nm.value;
                	var v4 = sconti_inqu_mdm_yn.value;
                	var v5 = sconti_inqu_delt_flg.value;
                	
                	var display = conti_inqu_display.value;
                	var classId = "COM_ENS_0I1";
                	var param = '?sconti_cd='+v1+'&sconti_nm='+v2+'&mdm_yn='+v4+'&delt_flg='+v5+'&classId='+classId;
                	
                	var chkStr = display.substring(0,3);
                	
                	if(chkStr == "1,0") {		
                		ComOpenPopup('/opuscntr/COM_ENS_0I1.do' + param, 510, 400, 'getCOM_ENS_0I1_1', display);	// radio PopUp  
                	} else if(chkStr == "0,1") {
                		ComOpenPopup('/opuscntr/COM_ENS_0I1.do' + param, 510, 400, 'getCOM_ENS_0I1_2', display);	// check PopUp  
                	} else if(chkStr == "0,0") {
                		ComOpenPopup('/opuscntr/COM_ENS_0I1.do' + param, 510, 400, 'getCOM_ENS_0I1_3', display);	// list PopUp  
                	} else if(chkStr == "1,1"){
                		ComShowMessage("팝업을 띄우기 위한 정보가 틀립니다. \n\n예) display속성 앞두자리는 [0,0], [0,1], [1,0] 만 가능합니다.");
                		return;
                	} else {
                		ComShowMessage("팝업을 띄우기display속성 정보가 부족합니다.");
                		return;
                	}
                	break;
                	
                	// 18. Customs Country (UI_BKG_0696)
                case "pck_btn":
                	var v1 = pck_cd.value;
                	var v2 = pck_nm.value;
                	var v4 = pck_mdm_yn.value;
                	var v5 = pck_delt_flg.value;
                	
                	var display = pck_display.value;
                	var classId = "UI_BKG_0696";
                	var param = '?pck_cd='+v1+'&pck_nm='+v2+'&mdm_yn='+v4+'&delt_flg='+v5+'&classId='+classId;
                	
                	var chkStr = display.substring(0,3);
                	
                	if(chkStr == "1,0") {		
                		ComOpenPopup('/opuscntr/UI_BKG_0696.do' + param, 460, 400, 'getUI_BKG_0696_1', display);	// radio PopUp  
                	} else if(chkStr == "0,1") {
                		ComOpenPopup('/opuscntr/UI_BKG_0696.do' + param, 460, 400, 'getUI_BKG_0696_2', display);	// check PopUp  
                	} else if(chkStr == "0,0") {
                		ComOpenPopup('/opuscntr/UI_BKG_0696.do' + param, 460, 400, 'getUI_BKG_0696_3', display);	// list PopUp  
                	} else if(chkStr == "1,1"){
                		ComShowMessage("팝업을 띄우기 위한 정보가 틀립니다. \n\n예) display속성 앞두자리는 [0,0], [0,1], [1,0] 만 가능합니다.");
                		return;
                	} else {
                		ComShowMessage("팝업을 띄우기display속성 정보가 부족합니다.");
                		return;
                	}
                	break;
                	
                	
                	// 19. Country Code Inquiry (COM_ENS_0M1)
                case "m1_cnt_btn":
                	var v1 = m1_cnt_cd.value;
                	var v2 = m1_cnt_nm.value;
                	var v4 = m1_cnt_mdm_yn.value;
                	var v5 = m1_cnt_delt_flg.value;
                	
                	var display = m1_cnt_display.value;
                	var classId = "COM_ENS_0M1";
                	var param = '?cnt_cd='+v1+'&cnt_nm='+v2+'&mdm_yn='+v4+'&delt_flg='+v5+'&classId='+classId;
                	
                	var chkStr = display.substring(0,3);
                	
                	if(chkStr == "1,0") {		
                		ComOpenPopup('/opuscntr/COM_ENS_0M1.do' + param, 860, 430, 'getCOM_ENS_0M1_1', display);	// radio PopUp  
                	} else if(chkStr == "0,1") {
                		ComOpenPopup('/opuscntr/COM_ENS_0M1.do' + param, 860, 430, 'getCOM_ENS_0M1_2', display);	// check PopUp  
                	} else if(chkStr == "0,0") {
                		ComOpenPopup('/opuscntr/COM_ENS_0M1.do' + param, 860, 430, 'getCOM_ENS_0M1_3', display);	// list PopUp  
                	} else if(chkStr == "1,1"){
                		ComShowMessage("팝업을 띄우기 위한 정보가 틀립니다. \n\n예) display속성 앞두자리는 [0,0], [0,1], [1,0] 만 가능합니다.");
                		return;
                	} else {
                		ComShowMessage("팝업을 띄우기display속성 정보가 부족합니다.");
                		return;
                	}
                	break;
                	
                	
                	// 20. Region Code Inquiry (COM_ENS_0J1)
                case "rgn_btn":
                	var v1 = rgn_cd.value;
                	var v2 = rgn_nm.value;
                	var v4 = rgn_mdm_yn.value;
                	var v5 = rgn_delt_flg.value;
                	var v6 = rgn_cnt_cd.value;
                	
                	var display = rgn_display.value;
                	var classId = "COM_ENS_0J1";
                	var param = '?rgn_cd='+v1+'&rgn_nm='+v2+'&mdm_yn='+v4+'&delt_flg='+v5+'&classId='+classId+"&cnt_cd="+v6;
                	
                	var chkStr = display.substring(0,3);
                	
                	if(chkStr == "1,0") {		
                		ComOpenPopup('/opuscntr/COM_ENS_0J1.do' + param, 700, 400, 'getCOM_ENS_0J1_1', display);	// radio PopUp  
                	} else if(chkStr == "0,1") {
                		ComOpenPopup('/opuscntr/COM_ENS_0J1.do' + param, 700, 400, 'getCOM_ENS_0J1_2', display);	// check PopUp  
                	} else if(chkStr == "0,0") {
                		ComOpenPopup('/opuscntr/COM_ENS_0J1.do' + param, 700, 400, 'getCOM_ENS_0J1_3', display);	// list PopUp  
                	} else if(chkStr == "1,1"){
                		ComShowMessage("팝업을 띄우기 위한 정보가 틀립니다. \n\n예) display속성 앞두자리는 [0,0], [0,1], [1,0] 만 가능합니다.");
                		return;
                	} else {
                		ComShowMessage("팝업을 띄우기display속성 정보가 부족합니다.");
                		return;
                	}
                	break;
                	
                	// 21. Currency Code (COM_ENS_N13)
                case "curr_btn":
                	var v1 = curr_cd.value;
                	var v2 = curr_desc.value;
                	var v4 = curr_mdm_yn.value;
                	var v5 = curr_delt_flg.value;
                	var v6 = curr_cnt_cd.value;
                	
                	var display = curr_display.value;
                	var classId = "COM_ENS_N13";
                	var param = '?curr_cd='+v1+'&curr_desc='+v2+'&mdm_yn='+v4+'&delt_flg='+v5+'&classId='+classId+"&cnt_cd="+v6;
                	
                	var chkStr = display.substring(0,3);
                	
                	if(chkStr == "1,0") {		
                		ComOpenPopup('/opuscntr/COM_ENS_N13.do' + param, 700, 450, 'getCOM_ENS_N13_1', display);	// radio PopUp  
                	} else if(chkStr == "0,1") {
                		ComOpenPopup('/opuscntr/COM_ENS_N13.do' + param, 700, 450, 'getCOM_ENS_N13_2', display);	// check PopUp  
                	} else if(chkStr == "0,0") {
                		ComOpenPopup('/opuscntr/COM_ENS_N13.do' + param, 700, 450, 'getCOM_ENS_N13_3', display);	// list PopUp  
                	} else if(chkStr == "1,1"){
                		ComShowMessage("팝업을 띄우기 위한 정보가 틀립니다. \n\n예) display속성 앞두자리는 [0,0], [0,1], [1,0] 만 가능합니다.");
                		return;
                	} else {
                		ComShowMessage("팝업을 띄우기display속성 정보가 부족합니다.");
                		return;
                	}
                	break;
                	
                	// 22. STATE (COM_ENS_0X1)
                case "state_btn":
                	var v1 = state_cnt_cd.value;
                	var v4 = state_mdm_yn.value;
                	var v5 = state_delt_flg.value;
                	
                	var display = state_display.value;
                	var classId = "COM_ENS_0X1";
                	var param = '?cnt_cd='+v1+'&mdm_yn='+v4+'&delt_flg='+v5+'&classId='+classId;
                	
                	var chkStr = display.substring(0,3);
                	
                	if(chkStr == "1,0") {		
                		ComOpenPopup('/opuscntr/COM_ENS_0X1.do' + param, 400, 370, 'getCOM_ENS_0X1_1', display);	// radio PopUp  
                	} else if(chkStr == "0,1") {
                		ComOpenPopup('/opuscntr/COM_ENS_0X1.do' + param, 400, 370, 'getCOM_ENS_0X1_2', display);	// check PopUp  
                	} else if(chkStr == "0,0") {
                		ComOpenPopup('/opuscntr/COM_ENS_0X1.do' + param, 400, 370, 'getCOM_ENS_0X1_3', display);	// list PopUp  
                	} else if(chkStr == "1,1"){
                		ComShowMessage("팝업을 띄우기 위한 정보가 틀립니다. \n\n예) display속성 앞두자리는 [0,0], [0,1], [1,0] 만 가능합니다.");
                		return;
                	} else {
                		ComShowMessage("팝업을 띄우기display속성 정보가 부족합니다.");
                		return;
                	}
                	break;
                	
                	// 23. CARRIRE (COM_ENS_0N1)(신규 개발)
                case "crr_btn":
                	var v1 = crr_cd.value;
                	var v4 = crr_mdm_yn.value;
                	var v5 = crr_delt_flg.value;
                	
                	var display = crr_display.value;
                	var classId = "COM_ENS_0N1";
                	var param = '?crr_cd='+v1+'&mdm_yn='+v4+'&delt_flg='+v5+'&classId='+classId;
                	
                	var chkStr = display.substring(0,3);
                	
                	if(chkStr == "1,0") {		
                		ComOpenPopup('/opuscntr/COM_ENS_0N1.do' + param, 520, 420, 'getCOM_ENS_0N1_1', display);	// radio PopUp  
                	} else if(chkStr == "0,1") {
                		ComOpenPopup('/opuscntr/COM_ENS_0N1.do' + param, 520, 420, 'getCOM_ENS_0N1_2', display);	// check PopUp  
                	} else if(chkStr == "0,0") {
                		ComOpenPopup('/opuscntr/COM_ENS_0N1.do' + param, 520, 420, 'getCOM_ENS_0N1_3', display);	// list PopUp  
                	} else if(chkStr == "1,1"){
                		ComShowMessage("팝업을 띄우기 위한 정보가 틀립니다. \n\n예) display속성 앞두자리는 [0,0], [0,1], [1,0] 만 가능합니다.");
                		return;
                	} else {
                		ComShowMessage("팝업을 띄우기display속성 정보가 부족합니다.");
                		return;
                	}
                	break;
                	
                	// 24. Service Scope (COM_ENS_0L1)(신규 개발)
                case "trf_btn":
                	var v1 = svc_scp_bnd_cd.value;
                	var mdmYN = trf_mdm_yn.value;
                	var deltFlg = trf_delt_flg.value;
                	
                	var display = trf_display.value;
                	var classId = "COM_ENS_0L1";
                	var param = '?svc_scp_cd='+v1+'&mdm_yn='+mdmYN+'&delt_flg='+deltFlg+'&classId='+classId;
                	
                	var chkStr = display.substring(0,3);
                	
                	if(chkStr == "1,0") {		
                		ComOpenPopup('/opuscntr/COM_ENS_0L1.do' + param, 530, 420, 'getCOM_ENS_0L1_1', display);	// radio PopUp  
                	} else if(chkStr == "0,1") {
                		ComOpenPopup('/opuscntr/COM_ENS_0L1.do' + param, 530, 420, 'getCOM_ENS_0L1_2', display);	// check PopUp  
                	} else if(chkStr == "0,0") {
                		ComOpenPopup('/opuscntr/COM_ENS_0L1.do' + param, 530, 420, 'getCOM_ENS_0L1_3', display);	// list PopUp  
                	} else if(chkStr == "1,1"){
                		ComShowMessage("팝업을 띄우기 위한 정보가 틀립니다. \n\n예) display속성 앞두자리는 [0,0], [0,1], [1,0] 만 가능합니다.");
                		return;
                	} else {
                		ComShowMessage("팝업을 띄우기display속성 정보가 부족합니다.");
                		return;
                	}
                	break;
                	
                	// 25. Charge Code (COM_COM_0001)(신규 개발)
                case "chg_btn":
                	var v1 = chg_cd.value;
                	var v2 = chg_nm.value;
                	var v3 = chg_mdm_yn.value;
                	var v4 = chg_delt_flg.value;
                	
                	var display = chg_display.value;
                	var classId = "COM_COM_0001";
                	var param = '?chg_cd='+v1+'&chg_nm='+v2+'&mdm_yn='+v3+'&delt_flg='+v4+'&classId='+classId;
                	
                	var chkStr = display.substring(0,3);
                	
                	if(chkStr == "1,0") {		
                		ComOpenPopup('/opuscntr/COM_COM_0001.do' + param, 770, 420, 'getCOM_COM_0001_1', display);	// radio PopUp  
                	} else if(chkStr == "0,1") {
                		ComOpenPopup('/opuscntr/COM_COM_0001.do' + param, 770, 420, 'getCOM_COM_0001_2', display);	// check PopUp  
                	} else if(chkStr == "0,0") {
                		ComOpenPopup('/opuscntr/COM_COM_0001.do' + param, 770, 420, 'getCOM_COM_0001_3', display);	// list PopUp  
                	} else if(chkStr == "1,1"){
                		ComShowMessage("팝업을 띄우기 위한 정보가 틀립니다. \n\n예) display속성 앞두자리는 [0,0], [0,1], [1,0] 만 가능합니다.");
                		return;
                	} else {
                		ComShowMessage("팝업을 띄우기display속성 정보가 부족합니다.");
                		return;
                	}
                	break;

                	// 26. CNTR Type Code (COM_COM_0002)(신규 개발)
                case "cntr_tp_btn":
                	var v1 = cntr_tp_cd.value;
                	var v2 = cntr_tp_desc.value;
                	var v3 = cntr_tp_mdm_yn.value;
                	var v4 = cntr_tp_delt_flg.value;
                	
                	var display = chg_display.value;
                	var classId = "COM_COM_0002";
                	var param = '?cntr_tp_cd='+v1+'&cntr_tp_desc='+v2+'&mdm_yn='+v3+'&delt_flg='+v4+'&classId='+classId;
                	
                	var chkStr = display.substring(0,3);
                	
                	if(chkStr == "1,0") {		
                		ComOpenPopup('/opuscntr/COM_COM_0002.do' + param, 770, 440, 'getCOM_COM_0002_1', display);	// radio PopUp  
                	} else if(chkStr == "0,1") {
                		ComOpenPopup('/opuscntr/COM_COM_0002.do' + param, 770, 440, 'getCOM_COM_0002_2', display);	// check PopUp  
                	} else if(chkStr == "0,0") {
                		ComOpenPopup('/opuscntr/COM_COM_0002.do' + param, 770, 440, 'getCOM_COM_0002_3', display);	// list PopUp  
                	} else if(chkStr == "1,1"){
                		ComShowMessage("팝업을 띄우기 위한 정보가 틀립니다. \n\n예) display속성 앞두자리는 [0,0], [0,1], [1,0] 만 가능합니다.");
                		return;
                	} else {
                		ComShowMessage("팝업을 띄우기display속성 정보가 부족합니다.");
                		return;
                	}
                	break;
                	
                	// 27. CNTR Size Code (COM_COM_0003)(신규 개발)
                case "cntr_sz_btn":
                	var v1 = cntr_sz_cd.value;
                	var v2 = cntr_sz_desc.value;
                	var v3 = cntr_sz_mdm_yn.value;
                	var v4 = cntr_sz_delt_flg.value;
                	
                	var display = chg_display.value;
                	var classId = "COM_COM_0003";
                	var param = '?cntr_sz_cd='+v1+'&cntr_sz_desc='+v2+'&mdm_yn='+v3+'&delt_flg='+v4+'&classId='+classId;
                	
                	var chkStr = display.substring(0,3);
                	
                	if(chkStr == "1,0") {		
                		ComOpenPopup('/opuscntr/COM_COM_0003.do' + param, 770, 440, 'getCOM_COM_0003_1', display);	// radio PopUp  
                	} else if(chkStr == "0,1") {
                		ComOpenPopup('/opuscntr/COM_COM_0003.do' + param, 770, 440, 'getCOM_COM_0003_2', display);	// check PopUp  
                	} else if(chkStr == "0,0") {
                		ComOpenPopup('/opuscntr/COM_COM_0003.do' + param, 770, 440, 'getCOM_COM_0003_3', display);	// list PopUp  
                	} else if(chkStr == "1,1"){
                		ComShowMessage("팝업을 띄우기 위한 정보가 틀립니다. \n\n예) display속성 앞두자리는 [0,0], [0,1], [1,0] 만 가능합니다.");
                		return;
                	} else {
                		ComShowMessage("팝업을 띄우기display속성 정보가 부족합니다.");
                		return;
                	}
                	break;

                	// 28. Leasing Company Yard Code (COM_COM_0004)(신규 개발)
                case "lse_co_yd_btn":
                	var v1 = lse_co_yd_cd.value;
                	var v2 = lse_co_yd_nm.value;
                	var v3 = lse_co_yd_mdm_yn.value;
                	var v4 = lse_co_yd_delt_flg.value;
                	
                	var display = chg_display.value;
                	var classId = "COM_COM_0004";
                	var param = '?lse_co_yd_cd='+v1+'&lse_co_yd_nm='+v2+'&mdm_yn='+v3+'&delt_flg='+v4+'&classId='+classId;
                	
                	var chkStr = display.substring(0,3);
                	
                	if(chkStr == "1,0") {		
                		ComOpenPopup('/opuscntr/COM_COM_0004.do' + param, 770, 440, 'getCOM_COM_0004_1', display);	// radio PopUp  
                	} else if(chkStr == "0,1") {
                		ComOpenPopup('/opuscntr/COM_COM_0004.do' + param, 770, 440, 'getCOM_COM_0004_2', display);	// check PopUp  
                	} else if(chkStr == "0,0") {
                		ComOpenPopup('/opuscntr/COM_COM_0004.do' + param, 770, 440, 'getCOM_COM_0004_3', display);	// list PopUp  
                	} else if(chkStr == "1,1"){
                		ComShowMessage("팝업을 띄우기 위한 정보가 틀립니다. \n\n예) display속성 앞두자리는 [0,0], [0,1], [1,0] 만 가능합니다.");
                		return;
                	} else {
                		ComShowMessage("팝업을 띄우기display속성 정보가 부족합니다.");
                		return;
                	}
                	break;

                	// 29. Daylight Saving Time(DST) Code (COM_COM_0005)(신규 개발)
                case "dst_btn":
                	var v1 = dst_cnt_cd.value;
                	var v3 = dst_mdm_yn.value;
                	var v4 = dst_delt_flg.value;
                	
                	var display = chg_display.value;
                	var classId = "COM_COM_0005";
                	var param = '?dst_cnt_cd='+v1+'&mdm_yn='+v3+'&delt_flg='+v4+'&classId='+classId;
                	
                	var chkStr = display.substring(0,3);
                	
                	if(chkStr == "1,0") {		
                		ComOpenPopup('/opuscntr/COM_COM_0005.do' + param, 770, 420, 'getCOM_COM_0005_1', display);	// radio PopUp  
                	} else if(chkStr == "0,1") {
                		ComOpenPopup('/opuscntr/COM_COM_0005.do' + param, 770, 420, 'getCOM_COM_0005_2', display);	// check PopUp  
                	} else if(chkStr == "0,0") {
                		ComOpenPopup('/opuscntr/COM_COM_0005.do' + param, 770, 420, 'getCOM_COM_0005_3', display);	// list PopUp  
                	} else if(chkStr == "1,1"){
                		ComShowMessage("팝업을 띄우기 위한 정보가 틀립니다. \n\n예) display속성 앞두자리는 [0,0], [0,1], [1,0] 만 가능합니다.");
                		return;
                	} else {
                		ComShowMessage("팝업을 띄우기display속성 정보가 부족합니다.");
                		return;
                	}
                	break;

                	// 30. Customer Group Code (COM_COM_0006)(신규 개발)
                case "cust_grp_btn":
                	var v1 = cust_grp_id.value;
                	var v2 = cust_grp_nm.value;
                	var v3 = cust_grp_mdm_yn.value;
                	var v4 = cust_grp_delt_flg.value;
                	
                	var display = chg_display.value;
                	var classId = "COM_COM_0006";
                	var param = '?cust_grp_id='+v1+'&cust_grp_nm='+v2+'&mdm_yn='+v3+'&delt_flg='+v4+'&classId='+classId;
                	
                	var chkStr = display.substring(0,3);
                	
                	if(chkStr == "1,0") {		
                		ComOpenPopup('/opuscntr/COM_COM_0006.do' + param, 780, 420, 'getCOM_COM_0006_1', display);	// radio PopUp  
                	} else if(chkStr == "0,1") {
                		ComOpenPopup('/opuscntr/COM_COM_0006.do' + param, 780, 420, 'getCOM_COM_0006_2', display);	// check PopUp  
                	} else if(chkStr == "0,0") {
                		ComOpenPopup('/opuscntr/COM_COM_0006.do' + param, 780, 420, 'getCOM_COM_0006_3', display);	// list PopUp  
                	} else if(chkStr == "1,1"){
                		ComShowMessage("팝업을 띄우기 위한 정보가 틀립니다. \n\n예) display속성 앞두자리는 [0,0], [0,1], [1,0] 만 가능합니다.");
                		return;
                	} else {
                		ComShowMessage("팝업을 띄우기display속성 정보가 부족합니다.");
                		return;
                	}
                	break;

                	// 31. Vendor Code (COM_COM_0007)(신규 개발)
                case "vndr_btn":
                	var v1 = vndr_cd.value;
                	var v2 = vndr_nm.value;
                	var v3 = vndr_mdm_yn.value;
                	var v4 = vndr_delt_flg.value;
                	
                	var display = chg_display.value;
                	var classId = "COM_COM_0007";
                	var param = '?code='+v1+'&name='+v2+'&mdm_yn='+v3+'&status='+v4+'&classId='+classId;
                	
                	var chkStr = display.substring(0,3);
                	
                	if(chkStr == "1,0") {		
                		ComOpenPopup('/opuscntr/COM_COM_0007.do' + param, 770, 445, 'getCOM_COM_0007_1', display);	// radio PopUp  
                	} else if(chkStr == "0,1") {
                		ComOpenPopup('/opuscntr/COM_COM_0007.do' + param, 770, 445, 'getCOM_COM_0007_2', display);	// check PopUp  
                	} else if(chkStr == "0,0") {
                		ComOpenPopup('/opuscntr/COM_COM_0007.do' + param, 770, 445, 'getCOM_COM_0007_3', display);	// list PopUp  
                	} else if(chkStr == "1,1"){
                		ComShowMessage("팝업을 띄우기 위한 정보가 틀립니다. \n\n예) display속성 앞두자리는 [0,0], [0,1], [1,0] 만 가능합니다.");
                		return;
                	} else {
                		ComShowMessage("팝업을 띄우기display속성 정보가 부족합니다.");
                		return;
                	}
                	break;

                	// 32. Sales Representative Code (COM_COM_0008)(신규 개발)
                case "srep_btn":
                	var v1 = srep_cd.value;
                	var v2 = srep_nm.value;
                	var v3 = srep_mdm_yn.value;
                	var v4 = srep_delt_flg.value;
                	
                	var display = chg_display.value;
                	var classId = "COM_COM_0008";
                	var param = '?srep_cd='+v1+'&srep_nm='+v2+'&mdm_yn='+v3+'&delt_flg='+v4+'&classId='+classId;
                	
                	var chkStr = display.substring(0,3);
                	
                	if(chkStr == "1,0") {		
                		ComOpenPopup('/opuscntr/COM_COM_0008.do' + param, 770, 420, 'getCOM_COM_0008_1', display);	// radio PopUp  
                	} else if(chkStr == "0,1") {
                		ComOpenPopup('/opuscntr/COM_COM_0008.do' + param, 770, 420, 'getCOM_COM_0008_2', display);	// check PopUp  
                	} else if(chkStr == "0,0") {
                		ComOpenPopup('/opuscntr/COM_COM_0008.do' + param, 770, 420, 'getCOM_COM_0008_3', display);	// list PopUp  
                	} else if(chkStr == "1,1"){
                		ComShowMessage("팝업을 띄우기 위한 정보가 틀립니다. \n\n예) display속성 앞두자리는 [0,0], [0,1], [1,0] 만 가능합니다.");
                		return;
                	} else {
                		ComShowMessage("팝업을 띄우기display속성 정보가 부족합니다.");
                		return;
                	}
                	break;

                	// 33. Activity Code (COM_COM_0009)(신규 개발)
                case "act_btn":
                	var v1 = act_cd.value;
                	var v2 = act_nm.value;
                	var v3 = act_mdm_yn.value;
                	var v4 = act_delt_flg.value;
                	
                	var display = chg_display.value;
                	var classId = "COM_COM_0009";
                	var param = '?mvmt_sts_cd='+v1+'&mvmt_sts_nm='+v2+'&mdm_yn='+v3+'&delt_flg='+v4+'&classId='+classId;
                	
                	var chkStr = display.substring(0,3);
                	
                	if(chkStr == "1,0") {		
                		ComOpenPopup('/opuscntr/COM_COM_0009.do' + param, 640, 420, 'getCOM_COM_0009_1', display);	// radio PopUp  
                	} else if(chkStr == "0,1") {
                		ComOpenPopup('/opuscntr/COM_COM_0009.do' + param, 640, 420, 'getCOM_COM_0009_2', display);	// check PopUp  
                	} else if(chkStr == "0,0") {
                		ComOpenPopup('/opuscntr/COM_COM_0009.do' + param, 640, 420, 'getCOM_COM_0009_3', display);	// list PopUp  
                	} else if(chkStr == "1,1"){
                		ComShowMessage("팝업을 띄우기 위한 정보가 틀립니다. \n\n예) display속성 앞두자리는 [0,0], [0,1], [1,0] 만 가능합니다.");
                		return;
                	} else {
                		ComShowMessage("팝업을 띄우기display속성 정보가 부족합니다.");
                		return;
                	}
                	break;

                	// 34. Movement Status Code (COM_COM_0010)(신규 개발)
                case "mvmt_btn":
                	var v1 = mvmt_sts_cd.value;
                	var v2 = mvmt_sts_nm.value;
                	var v3 = mvmt_mdm_yn.value;
                	var v4 = mvmt_delt_flg.value;
                	
                	var display = chg_display.value;
                	var classId = "COM_COM_0010";
                	var param = '?mvmt_sts_cd='+v1+'&mvmt_sts_nm='+v2+'&mdm_yn='+v3+'&delt_flg='+v4+'&classId='+classId;
                	
                	var chkStr = display.substring(0,3);
                	
                	if(chkStr == "1,0") {		
                		ComOpenPopup('/opuscntr/COM_COM_0010.do' + param, 770, 420, 'getCOM_COM_0010_1', display);	// radio PopUp  
                	} else if(chkStr == "0,1") {
                		ComOpenPopup('/opuscntr/COM_COM_0010.do' + param, 770, 420, 'getCOM_COM_0010_2', display);	// check PopUp  
                	} else if(chkStr == "0,0") {
                		ComOpenPopup('/opuscntr/COM_COM_0010.do' + param, 770, 420, 'getCOM_COM_0010_3', display);	// list PopUp  
                	} else if(chkStr == "1,1"){
                		ComShowMessage("팝업을 띄우기 위한 정보가 틀립니다. \n\n예) display속성 앞두자리는 [0,0], [0,1], [1,0] 만 가능합니다.");
                		return;
                	} else {
                		ComShowMessage("팝업을 띄우기display속성 정보가 부족합니다.");
                		return;
                	}
                	break;

                	// 35. Revenue Lane Code (COM_COM_0011)(신규 개발)
                case "rlane_btn":
                	var v1 = rlane_cd.value;
                	var v2 = rlane_nm.value;
                	var v3 = rlane_mdm_yn.value;
                	var v4 = rlane_delt_flg.value;
                	
                	var display = chg_display.value;
                	var classId = "COM_COM_0011";
                	var param = '?rlane_cd='+v1+'&rlane_nm='+v2+'&mdm_yn='+v3+'&delt_flg='+v4+'&classId='+classId;
                	
                	var chkStr = display.substring(0,3);
                	
                	if(chkStr == "1,0") {		
                		ComOpenPopup('/opuscntr/COM_COM_0011.do' + param, 770, 420, 'getCOM_COM_0011_1', display);	// radio PopUp  
                	} else if(chkStr == "0,1") {
                		ComOpenPopup('/opuscntr/COM_COM_0011.do' + param, 770, 420, 'getCOM_COM_0011_2', display);	// check PopUp  
                	} else if(chkStr == "0,0") {
                		ComOpenPopup('/opuscntr/COM_COM_0011.do' + param, 770, 420, 'getCOM_COM_0011_3', display);	// list PopUp  
                	} else if(chkStr == "1,1"){
                		ComShowMessage("팝업을 띄우기 위한 정보가 틀립니다. \n\n예) display속성 앞두자리는 [0,0], [0,1], [1,0] 만 가능합니다.");
                		return;
                	} else {
                		ComShowMessage("팝업을 띄우기display속성 정보가 부족합니다.");
                		return;
                	}
                	break;
                	
                	// 36. Trade Code (COM_COM_0012)(신규 개발)
                case "trd_btn":
                	var v1 = trd_cd.value;
                	var v2 = trd_nm.value;
                	var v3 = trd_mdm_yn.value;
                	var v4 = trd_delt_flg.value;
                	
                	var display = chg_display.value;
                	var classId = "COM_COM_0012";
                	var param = '?code='+v1+'&desc='+v2+'&mdm_yn='+v3+'&delt_flg='+v4+'&classId='+classId;
                	
                	var chkStr = display.substring(0,3);
                	
                	if(chkStr == "1,0") {		
                		ComOpenPopup('/opuscntr/COM_COM_0012.do' + param, 790, 450, 'getCOM_COM_0012_1', display);	// radio PopUp  
                	} else if(chkStr == "0,1") {
                		ComOpenPopup('/opuscntr/COM_COM_0012.do' + param, 790, 450, 'getCOM_COM_0012_2', display);	// check PopUp  
                	} else if(chkStr == "0,0") {
                		ComOpenPopup('/opuscntr/COM_COM_0012.do' + param, 790, 450, 'getCOM_COM_0012_3', display);	// list PopUp  
                	} else if(chkStr == "1,1"){
                		ComShowMessage("팝업을 띄우기 위한 정보가 틀립니다. \n\n예) display속성 앞두자리는 [0,0], [0,1], [1,0] 만 가능합니다.");
                		return;
                	} else {
                		ComShowMessage("팝업을 띄우기display속성 정보가 부족합니다.");
                		return;
                	}
                	break;
                	
                	// 37. Sub Trade Code (COM_COM_0013)(신규 개발)
                case "sub_trd_btn":
                	var v1 = sub_trd_cd.value;
                	var v2 = sub_trd_nm.value;
                	var v3 = sub_trd_mdm_yn.value;
                	var v4 = sub_trd_delt_flg.value;
                	
                	var display = chg_display.value;
                	var classId = "COM_COM_0013";
                	var param = '?code='+v1+'&desc='+v2+'&mdm_yn='+v3+'&delt_flg='+v4+'&classId='+classId;
                	
                	var chkStr = display.substring(0,3);
                	
                	if(chkStr == "1,0") {		
                		ComOpenPopup('/opuscntr/COM_COM_0013.do' + param, 750, 450, 'getCOM_COM_0013_1', display);	// radio PopUp  
                	} else if(chkStr == "0,1") {
                		ComOpenPopup('/opuscntr/COM_COM_0013.do' + param, 750, 450, 'getCOM_COM_0013_2', display);	// check PopUp  
                	} else if(chkStr == "0,0") {
                		ComOpenPopup('/opuscntr/COM_COM_0013.do' + param, 750, 450, 'getCOM_COM_0013_3', display);	// list PopUp  
                	} else if(chkStr == "1,1"){
                		ComShowMessage("팝업을 띄우기 위한 정보가 틀립니다. \n\n예) display속성 앞두자리는 [0,0], [0,1], [1,0] 만 가능합니다.");
                		return;
                	} else {
                		ComShowMessage("팝업을 띄우기display속성 정보가 부족합니다.");
                		return;
                	}
                	break;                	


    		}
    	}
    }
    catch(e) {        
    	if( e = "[object Error]") {
    		ComShowMessage(OBJECT_ERROR);
    	} else {
    		ComShowMessage(e);
    	}
    }
}

/**
 * Commodity : 팝업에서 Radio로 단일 선택을 한경우..
 */
function getCOM_ENS_011_1(rowArray) {
	//alertComPopupData(rowArray);
	
	var colArray = rowArray[0];	
	document.all.cmdt_cd.value = colArray[2];
	document.all.cmdt_nm.value = colArray[3];
	document.all.rep_cmdt_cd.value = colArray[4];
	document.all.rep_imdg_lvl_cd.value = colArray[5];	
}


/**
 * Commodity : 팝업에서 Check로 멀티 선택을 한경우..
 */
function getCOM_ENS_011_2(rowArray) {
	//alertComPopupData(rowArray);
	
	var gubun = ',';
	
	for(var i=0; i<rowArray.length; i++)
	{
		if(i == rowArray.length-1) gubun = '';
		
		colArray = rowArray[i];
		
		document.all.cmdt_cd.value += colArray[2] + gubun;
	    document.all.cmdt_nm.value += colArray[3] + gubun;
	    document.all.rep_cmdt_cd.value += colArray[4] + gubun;
	    document.all.rep_imdg_lvl_cd.value += colArray[5] + gubun;
	}
}


/**
 * Commodity : 팝업에서 그냥 로우(Row)를 선택한경우..
 */
function getCOM_ENS_011_3(rowArray) {
	//alertComPopupData(rowArray);

	var colArray = rowArray[0];
	document.all.cmdt_cd.value = colArray[2];
	document.all.cmdt_nm.value = colArray[3];
	document.all.rep_cmdt_cd.value = colArray[4];
	document.all.rep_imdg_lvl_cd.value = colArray[5];
}

/**
 * Sample 1 : 팝업에서 Radio로 단일 선택을 한경우..
 */
function getCOM_ENS_021_1(rowArray) {
	//alertComPopupData(rowArray);
	var colArray = rowArray[0];
	document.all.cnt_txt1.value = colArray[2].substring(0,3);
	document.all.cnt_txt2.value = colArray[2].substring(3,colArray[2].length);	
	document.all.cnt_txt5.value = colArray[3];
}


/**
 * Sample 2 : 팝업에서 Check로 멀티 선택을 한경우..
 */
function getCOM_ENS_021_2(rowArray) {
	//alertComPopupData(rowArray);
	
	var gubun = ',';
	
	// 초기화
	document.all.cnt_txt1.value = "";
	document.all.cnt_txt2.value = "";
	//document.all.cnt_txt5.value = "";
	
	for(var i=0; i<rowArray.length; i++)
	{
		if(i == rowArray.length-1) gubun = '';

		colArray = rowArray[i];
		
		document.all.cnt_txt1.value += colArray[2] + gubun;
    	document.all.cnt_txt2.value += colArray[2] + gubun;	
    	document.all.cnt_txt5.value += colArray[3] + gubun;
	}
}


/**
 * Sample 3 : 팝업에서 그냥 로우(Row)를 선택한경우..
 */
function getCOM_ENS_021_3(rowArray) {
	//alertComPopupData(rowArray);

	var colArray = rowArray[0];

	document.all.cnt_txt1.value = colArray[2].substring(0,3);
	document.all.cnt_txt2.value = colArray[2].substring(3,colArray[2].length);	
    document.all.cnt_txt5.value = colArray[3];
}

/**
 * Sample 1 : 팝업에서 Radio로 단일 선택을 한경우..
 */
function getCOM_ENS_041_1(rowArray) {
	//alert(rowArray);
	var colArray = rowArray[0];
	document.all.cust01_txt1.value = colArray[3];		// customer code
	document.all.cust01_txt4.value = colArray[4];		// customer name
	document.all.cust01_txt3.value = colArray[5];		// sales office
//	document.all.cust01_txt2.value = colArray[5];
}


/**
 * Sample 2 : 팝업에서 Check로 멀티 선택을 한경우..
 */
function getCOM_ENS_041_2(rowArray) {
	//alertComPopupData(rowArray);
	
	var gubun = ',';
	
	for(var i=0; i<rowArray.length; i++)
	{
		if(i == rowArray.length-1) gubun = '';

		colArray = rowArray[i];
		  	
		document.all.cust01_txt1.value = colArray[3]+gubun;		// customer code
		document.all.cust01_txt4.value = colArray[4]+gubun;		// customer name
		document.all.cust01_txt3.value = colArray[5]+gubun;		// sales office
	}
}


/**
 * Sample 3 : 팝업에서 그냥 로우(Row)를 선택한경우..
 */
function getCOM_ENS_041_3(rowArray) {
	//alertComPopupData(rowArray);

	var colArray = rowArray[0];

	document.all.cust01_txt1.value = colArray[3];		// customer code
	document.all.cust01_txt4.value = colArray[4];		// customer name
	document.all.cust01_txt3.value = colArray[5];		// sales office
}

/**
 * Sample 1 : 팝업에서 Radio로 단일 선택을 한경우..
 */
function getCOM_ENS_042_1(rowArray) {
	////alertComPopupData(rowArray);

	var colArray = rowArray[0];
	document.all.cust02_txt1.value = colArray[10];
	document.all.cust02_txt2.value = colArray[8];
	document.all.cust02_txt3.value = colArray[9];
	document.all.cust02_txt4.value = colArray[2];
	document.all.cust02_txt5.value = colArray[4];
	document.all.cust02_txt6.value = colArray[3];
	document.all.cust02_txt7.value = colArray[6];
}


/**
 * Sample 2 : 팝업에서 Check로 멀티 선택을 한경우..
 */
function getCOM_ENS_042_2(rowArray) {
	//alertComPopupData(rowArray);
	
	var gubun = ',';
	
	for(var i=0; i<rowArray.length; i++)
	{
		if(i == rowArray.length-1) gubun = '';

		colArray = rowArray[i];
		  	
      	document.all.cust02_txt1.value = colArray[10] + gubun;
    	document.all.cust02_txt2.value = colArray[8] + gubun;
    	document.all.cust02_txt3.value = colArray[9] + gubun;
    	document.all.cust02_txt4.value = colArray[2] + gubun;
    	document.all.cust02_txt5.value = colArray[4] + gubun;
    	document.all.cust02_txt6.value = colArray[3] + gubun;
    	document.all.cust02_txt7.value = colArray[6] + gubun;
	}
}


/**
 * Sample 3 : 팝업에서 그냥 로우(Row)를 선택한경우..
 */
function getCOM_ENS_042_3(rowArray) {
	//alertComPopupData(rowArray);

	var colArray = rowArray[0];

	document.all.cust02_txt1.value = colArray[10];
	document.all.cust02_txt2.value = colArray[8];
	document.all.cust02_txt3.value = colArray[9];
	document.all.cust02_txt4.value = colArray[2];
	document.all.cust02_txt5.value = colArray[4];
	document.all.cust02_txt6.value = colArray[3];
	document.all.cust02_txt7.value = colArray[6];
}

/**
 * Location : 팝업에서 Radio로 단일 선택을 한경우..
 */
function getCOM_ENS_051_1(rowArray) {
//	alert(rowArray);
	var colArray = rowArray[0];
	document.all.com_ens_051_cnt_cd.value = colArray[14];
	document.all.com_ens_051_loc_state.value = colArray[6];
	document.all.com_ens_051_loc_eq_ofc.value = colArray[13];
	document.all.com_ens_051_loc_cd.value = colArray[3];
	document.all.com_ens_051_loc_desc.value = colArray[4];
	if(colArray[16] == "Y") {
	    document.all.com_ens_051_loc_port_ind.checked = true;
	} else {
	    document.all.com_ens_051_loc_port_ind.checked = false;
	}
}


/**
 * Location : 팝업에서 Check로 멀티 선택을 한경우..
 */
function getCOM_ENS_051_2(rowArray) {
	//alertComPopupData(rowArray);
	
	var gubun = ',';
	
	for(var i=0; i<rowArray.length; i++)
	{
		if(i == rowArray.length-1) gubun = '';
		
		colArray = rowArray[i];
		
    	document.all.com_ens_051_cnt_cd.value = colArray[14] + gubun;
    	document.all.com_ens_051_loc_state.value = colArray[6] + gubun;
    	document.all.com_ens_051_loc_eq_ofc.value = colArray[13] + gubun;
    	document.all.com_ens_051_loc_cd.value = colArray[3] + gubun;
    	document.all.com_ens_051_loc_desc.value = colArray[4] + gubun;
    	if(colArray[16] == "Y") {
    	    document.all.com_ens_051_loc_port_ind.checked = true;
    	} else {
    	    document.all.com_ens_051_loc_port_ind.checked = false;
    	}
	}
}


/**
 * Location : 팝업에서 그냥 로우(Row)를 선택한경우..
 */
function getCOM_ENS_051_3(rowArray) {
	//alertComPopupData(rowArray);

	var colArray = rowArray[0];
	document.all.com_ens_051_cnt_cd.value = colArray[14];
	document.all.com_ens_051_loc_state.value = colArray[6];
	document.all.com_ens_051_loc_eq_ofc.value = colArray[13];
	document.all.com_ens_051_loc_cd.value = colArray[3];
	document.all.com_ens_051_loc_desc.value = colArray[4];
	if(colArray[16] == "Y") {
	    document.all.com_ens_051_loc_port_ind.checked = true;
	} else {
	    document.all.com_ens_051_loc_port_ind.checked = false;
	}
}

/**
 * Sample 1 : 팝업에서 Radio로 단일 선택을 한경우..
 */
function getCOM_ENS_061_1(rowArray) {
	//alertComPopupData(rowArray);
    var gubun = '';

	var colArray = rowArray[0];
  	if(document.all.com_ens_061_mode[0].checked) {
      	document.all.com_ens_061_cnt_cd.value = colArray[13];
      	document.all.com_ens_061_loc_cd.value = colArray[14];
      	document.all.com_ens_061_ofc_cd.value = colArray[5];
      	document.all.com_ens_061_node_cd.value = colArray[3];
      	document.all.com_ens_061_node_nm.value = colArray[4];
    } else {
        document.all.com_ens_061_cnt_cd.value = colArray[10];
      	document.all.com_ens_061_loc_cd.value = colArray[11];
      	document.all.com_ens_061_ofc_cd.value = colArray[5];
      	document.all.com_ens_061_node_cd.value = colArray[3];
      	document.all.com_ens_061_node_nm.value = colArray[4];
    }
}


/**
 * Sample 2 : 팝업에서 Check로 멀티 선택을 한경우..
 */
function getCOM_ENS_061_2(rowArray) {
	//alertComPopupData(rowArray);
	
	var gubun = ',';
	
	for(var i=0; i<rowArray.length; i++)
	{
		if(i == rowArray.length-1) gubun = '';

		colArray = rowArray[i];
		  	
      	if(document.all.com_ens_061_mode[0].checked) {
          	document.all.com_ens_061_cnt_cd.value = colArray[13] + gubun;
          	document.all.com_ens_061_loc_cd.value = colArray[14] + gubun;
          	document.all.com_ens_061_ofc_cd.value += colArray[5] + gubun;
          	document.all.com_ens_061_node_cd.value += colArray[3] + gubun;
          	document.all.com_ens_061_node_nm.value += colArray[4] + gubun;
        } else {
            document.all.com_ens_061_cnt_cd.value += colArray[10] + gubun;
          	document.all.com_ens_061_loc_cd.value += colArray[11] + gubun;
          	document.all.com_ens_061_ofc_cd.value += colArray[5] + gubun;
          	document.all.com_ens_061_node_cd.value += colArray[3] + gubun;
          	document.all.com_ens_061_node_nm.value += colArray[4] + gubun;
        }
	}
}


/**
 * Sample 3 : 팝업에서 그냥 로우(Row)를 선택한경우..
 */
function getCOM_ENS_061_3(rowArray) {
	//alertComPopupData(rowArray);
    var gubun = '';

	var colArray = rowArray[0];
    
    if(document.all.com_ens_061_mode[0].checked) {
      	document.all.com_ens_061_cnt_cd.value = colArray[13];
      	document.all.com_ens_061_loc_cd.value = colArray[14];
      	document.all.com_ens_061_ofc_cd.value = colArray[5];
      	document.all.com_ens_061_node_cd.value = colArray[3];
      	document.all.com_ens_061_node_nm.value = colArray[4];
    } else {
        document.all.com_ens_061_cnt_cd.value = colArray[10];
      	document.all.com_ens_061_loc_cd.value = colArray[11];
      	document.all.com_ens_061_ofc_cd.value = colArray[5];
      	document.all.com_ens_061_node_cd.value = colArray[3];
      	document.all.com_ens_061_node_nm.value = colArray[4];
    }
}

/**
 * Commodity : 팝업에서 Radio로 단일 선택을 한경우..
 */
function getCOM_ENS_071_1(rowArray) {
	//alertComPopupData(rowArray);
	
	var colArray = rowArray[0];	
	
	document.all.ofc_cd.value = colArray[3];
	document.all.ofc_nm.value = colArray[4];
	
	var object = document.all.ofc_lev;	
	for(var i=0; i<object.length; i++) {
	    if(object.options[i].text == colArray[5]) {
	        object.options[i].selected = true;
	        break;
	    }
	}
}


/**
 * Commodity : 팝업에서 Check로 멀티 선택을 한경우..
 */
function getCOM_ENS_071_2(rowArray) {
	//alertComPopupData(rowArray);
	
	var gubun = ',';
	
	for(var i=0; i<rowArray.length; i++)
	{
		if(i == rowArray.length-1) gubun = '';
		
		colArray = rowArray[i];
		
		document.all.ofc_cd.value += colArray[3] + gubun;
    	document.all.ofc_nm.value += colArray[4] + gubun;
    	
    	var object = document.all.ofc_lev;	
    	
    	for(var j=0; j<object.length; j++) {
    	    if(object.options[j].text == colArray[5]) {
    	        object.options[j].selected = true;
    	        break;
    	    }
    	}
	}
}


/**
 * Commodity : 팝업에서 그냥 로우(Row)를 선택한경우..
 */
function getCOM_ENS_071_3(rowArray) {
	//alertComPopupData(rowArray);

	var colArray = rowArray[0];
	document.all.ofc_cd.value = colArray[3];
	document.all.ofc_nm.value = colArray[4];
	
	var object = document.all.ofc_lev;	
	for(var i=0; i<object.length; i++) {
	    if(object.options[i].text == colArray[5]) {
	        object.options[i].selected = true;
	        break;
	    }
	}
}

/**
 * Sample 1 : 팝업에서 Radio로 단일 선택을 한경우..
 */
function getCOM_ENS_081_1(rowArray) {
	//alertComPopupData(rowArray);
    var gubun = '';

	var colArray = rowArray[0];
	
	if(document.all.com_ens_081_mode.value == "rev") {
    	document.all.com_ens_081_trade_cd.value = colArray[3];
      	document.all.com_ens_081_sub_trade_cd.value = colArray[4];
      	document.all.com_ens_081_lane_cd.value = colArray[5];
      	document.all.com_ens_081_lane_nm.value = colArray[6];
      	document.all.com_ens_081_svc_tp.value = colArray[7];
	} else {
	    document.all.com_ens_081_lane_cd.value = colArray[3];
      	document.all.com_ens_081_lane_nm.value = colArray[4];
      	document.all.com_ens_081_svc_tp.value = colArray[5];
	}
}


/**
 * Sample 2 : 팝업에서 Check로 멀티 선택을 한경우..
 */
function getCOM_ENS_081_2(rowArray) {
	//alertComPopupData(rowArray);
	
	var gubun = ',';
	
	for(var i=0; i<rowArray.length; i++)
	{
		if(i == rowArray.length-1) gubun = '';

		colArray = rowArray[i];
		
		if(document.all.com_ens_081_mode.value == "rev") {
        	document.all.com_ens_081_trade_cd.value += colArray[3] + gubun;
          	document.all.com_ens_081_sub_trade_cd.value += colArray[4] + gubun;
          	document.all.com_ens_081_lane_cd.value += colArray[5] + gubun;
          	document.all.com_ens_081_lane_nm.value += colArray[6] + gubun;
          	document.all.com_ens_081_svc_tp.value = colArray[7];
    	} else {
    	    document.all.com_ens_081_lane_cd.value += colArray[3] + gubun;
          	document.all.com_ens_081_lane_nm.value += colArray[4] + gubun;
          	document.all.com_ens_081_svc_tp.value = colArray[5];
    	}
	}
}


/**
 * Sample 3 : 팝업에서 그냥 로우(Row)를 선택한경우..
 */
function getCOM_ENS_081_3(rowArray) {
	//alertComPopupData(rowArray);
    var gubun = '';

	var colArray = rowArray[0];

  	if(document.all.com_ens_081_mode.value == "rev") {
    	document.all.com_ens_081_trade_cd.value = colArray[3];
      	document.all.com_ens_081_sub_trade_cd.value = colArray[4];
      	document.all.com_ens_081_lane_cd.value = colArray[5];
      	document.all.com_ens_081_lane_nm.value = colArray[6];
      	document.all.com_ens_081_svc_tp.value = colArray[7];
	} else {
	    document.all.com_ens_081_lane_cd.value = colArray[3];
      	document.all.com_ens_081_lane_nm.value = colArray[4];
      	document.all.com_ens_081_svc_tp.value = colArray[5];
	}
}

/**
 * Sample 1 : 팝업에서 Radio로 단일 선택을 한경우..
 */
function getCOM_ENS_091_1(rowArray) {
	var gubun = '';

	var colArray = rowArray[0];
    document.all.com_ens_091_ofc_cd.value = colArray[3];
  	document.all.com_ens_091_user_cd.value = colArray[4];
  	document.all.com_ens_091_user_nm.value = colArray[5];
  	document.all.com_ens_091_user_email.value = colArray[6];
}


/**
 * Sample 2 : 팝업에서 Check로 멀티 선택을 한경우..
 */
function getCOM_ENS_091_2(rowArray) {
	//alertComPopupData(rowArray);
	
	var gubun = ',';
	
	for(var i=0; i<rowArray.length; i++)
	{
		if(i == rowArray.length-1) gubun = '';

		colArray = rowArray[i];
		
		document.all.com_ens_091_ofc_cd.value += colArray[3] + gubun;
      	document.all.com_ens_091_user_cd.value += colArray[4] + gubun;
      	document.all.com_ens_091_user_nm.value += colArray[5] + gubun;
      	document.all.com_ens_091_user_email.value += colArray[6] + gubun;
	}
}


/**
 * Sample 3 : 팝업에서 그냥 로우(Row)를 선택한경우..
 */
function getCOM_ENS_091_3(rowArray) {
	//alertComPopupData(rowArray);
    var gubun = '';

	var colArray = rowArray[0];

  	document.all.com_ens_091_ofc_cd.value = colArray[3] + gubun;
  	document.all.com_ens_091_user_cd.value = colArray[4] + gubun;
  	document.all.com_ens_091_user_nm.value = colArray[5] + gubun;
  	document.all.com_ens_091_user_email.value = colArray[6] + gubun;
}

/**
 * Sample 1 : 팝업에서 Radio로 단일 선택을 한경우..
 */
function getCOM_ENS_092(rowArray) {
	var gubun = ',';
   
	for(var i=0; i<rowArray.length; i++)
	{
		if(i == rowArray.length-1) gubun = '';

		colArray = rowArray[i];
		
    	document.all.com_ens_092_user_id.value += colArray[3] + gubun;
    	document.all.com_ens_092_user_email.value += colArray[4] + gubun;
	}
}

/**
 * Sample 1 : 팝업에서 Radio로 단일 선택을 한경우..
 */
function getCOM_ENS_0A1_1(rowArray) {
	//alertComPopupData(rowArray);

	var colArray = rowArray[0];
	document.all.sp1_txt1.value = colArray[3];
	document.all.sp1_txt2.value = colArray[4];
	document.all.sp1_txt3.value = colArray[5];
}

/**
 * Sample 2 : 팝업에서 Check로 멀티 선택을 한경우..
 */
function getCOM_ENS_0A1_2(rowArray) {
	//alertComPopupData(rowArray);
	
	var gubun = ',';
	
	for(var i=0; i<rowArray.length; i++)
	{
		if(i == rowArray.length-1) gubun = '';

		colArray = rowArray[i];
		
    	document.all.sp1_txt1.value += colArray[3] + gubun;
    	document.all.sp1_txt2.value += colArray[4] + gubun;
    	document.all.sp1_txt3.value += colArray[5] + gubun;
	}
}

/**
 * Sample 3 : 팝업에서 그냥 로우(Row)를 선택한경우..
 */
function getCOM_ENS_0A1_3(rowArray) {
	//alertComPopupData(rowArray);

	var colArray = rowArray[0];
	document.all.sp1_txt1.value = colArray[3];
	document.all.sp1_txt2.value = colArray[4];
	document.all.sp1_txt3.value = colArray[5];
}

/**
 * Sample 1 : 팝업에서 Radio로 단일 선택을 한경우..
 */
function getCOM_ENS_0B1_1(rowArray) {
	//alertComPopupData(rowArray);
    var colArray = rowArray[0];
    
  	document.all.vvd01_cd.value += colArray[3] + colArray[4] + colArray[5];  	
  	document.all.vvd01_lane.value += colArray[6];
  	document.all.vvd01_port.value += colArray[7];
  	document.all.vvd01_etd.value += colArray[8];
  	document.all.vvd01_tind.value += colArray[9];
}

/**
 * Sample 2 : 팝업에서 Check로 멀티 선택을 한경우..
 */
function getCOM_ENS_0B1_2(rowArray) {
	//alertComPopupData(rowArray);
	
	var gubun = ',';
	
	for(var i=0; i<rowArray.length; i++)
	{
		if(i == rowArray.length-1) gubun = '';

		colArray = rowArray[i];
		  	
  	document.all.vvd01_cd.value += colArray[3] + colArray[4] + colArray[5] + gubun;
  	
  	document.all.vvd01_lane.value += colArray[6] + gubun;
  	document.all.vvd01_port.value += colArray[7] + gubun;
  	document.all.vvd01_etd.value += colArray[8] + gubun;
  	document.all.vvd01_tind.value += colArray[9] + gubun;
	}
}

/**
 * Sample 3 : 팝업에서 그냥 로우(Row)를 선택한경우..
 */
function getCOM_ENS_0B1_3(rowArray) {
	//alertComPopupData(rowArray);  
	var colArray = rowArray[0];

  	document.all.vvd01_cd.value += colArray[3] + colArray[4] + colArray[5];  	
  	document.all.vvd01_lane.value += colArray[6];
  	document.all.vvd01_port.value += colArray[7];
  	document.all.vvd01_etd.value += colArray[8];
  	document.all.vvd01_tind.value += colArray[9];
}

/**
 * Sample 1 : 팝업에서 Radio로 단일 선택을 한경우..
 */
function getCOM_ENS_0B2_1(rowArray) {
	//alertComPopupData(rowArray);
  var gubun = '';

	var colArray = rowArray[0];
  	document.all.vslskd02_lane.value = colArray[3] + gubun;
  	document.all.vslskd02_loc.value  = colArray[4] + gubun;
  	document.all.vslskd02_sdate.value = colArray[5] + gubun;
  	document.all.vslskd02_edate.value = colArray[6] + gubun;
  	document.all.vslskd02_vvd.value = colArray[7] + gubun;
}

/**
 * Sample 2 : 팝업에서 Check로 멀티 선택을 한경우..
 */
function getCOM_ENS_0B2_2(rowArray) {
	//alertComPopupData(rowArray);
	
	var gubun = ',';
	
	for(var i=0; i<rowArray.length; i++)
	{
		if(i == rowArray.length-1) gubun = '';

		colArray = rowArray[i];
		  	
  	document.all.vslskd02_lane.value += colArray[3] + gubun;
  	document.all.vslskd02_loc.value += colArray[4] + gubun;
  	document.all.vslskd02_sdate.value += colArray[5] + gubun;
  	document.all.vslskd02_edate.value += colArray[6] + gubun;
  	document.all.vslskd02_vvd.value += colArray[7] + gubun;
	}
}

/**
 * Sample 3 : 팝업에서 그냥 로우(Row)를 선택한경우..
 */
function getCOM_ENS_0B2_3(rowArray) {
	//alertComPopupData(rowArray);
  var gubun = '';

	var colArray = rowArray[0];

  	document.all.vslskd02_lane.value = colArray[3] + gubun;
  	document.all.vslskd02_loc.value = colArray[4] + gubun;
  	document.all.vslskd02_sdate.value = colArray[5] + gubun;
  	document.all.vslskd02_edate.value = colArray[6] + gubun;
  	document.all.vslskd02_vvd.value = colArray[7] + gubun;
}

/**
 * Sample 1 : 팝업에서 Radio로 단일 선택을 한경우..
 */
function getCOM_ENS_0C1_1(rowArray) {
    //alert(rowArray);

	var colArray = rowArray[0];
	document.all.sp_vndr_cd.value = colArray[2];
	document.all.sp_txt2.value = colArray[4];
	document.all.sp_txt5.value = colArray[7];
	document.all.sp_txt6.value = colArray[9];
}


/**
 * Sample 2 : 팝업에서 Check로 멀티 선택을 한경우..
 */
function getCOM_ENS_0C1_2(rowArray) {
	//alertComPopupData(rowArray);
	
	var gubun = ',';
	
	for(var i=0; i<rowArray.length; i++)
	{
		if(i == rowArray.length-1) gubun = '';

		colArray = rowArray[i];
		
		document.all.sp_vndr_cd.value = colArray[2]+gubun;
		document.all.sp_txt2.value = colArray[4]+gubun;
		document.all.sp_txt5.value = colArray[7]+gubun;
		document.all.sp_txt6.value = colArray[9]+gubun;
	}
}


/**
 * Sample 3 : 팝업에서 그냥 로우(Row)를 선택한경우..
 */
function getCOM_ENS_0C1_3(rowArray) {
	//alertComPopupData(rowArray);

	var colArray = rowArray[0];

	document.all.sp_vndr_cd.value = colArray[2];
	document.all.sp_txt2.value = colArray[4];
	document.all.sp_txt5.value = colArray[7];
	document.all.sp_txt6.value = colArray[9];
}


/**
 * Sample 1 : 팝업에서 Radio로 단일 선택을 한경우..
 */
function getCOM_ENS_N11_1(rowArray) {
	var colArray = rowArray[0];
	document.all.acct_cd.value = colArray[2];
	document.all.acct_eng_nm.value = colArray[3];
}

/**
 * Sample 2 : 팝업에서 Check로 멀티 선택을 한경우..
 */
function getCOM_ENS_N11_2(rowArray) {
	var gubun = ',';
	
	for(var i=0; i<rowArray.length; i++)
	{
		if(i == rowArray.length-1) gubun = '';
		colArray = rowArray[i];
		document.all.acct_cd.value = colArray[2]+gubun;
		document.all.acct_eng_nm.value = colArray[3]+gubun;
	}
}

/**
 * Sample 3 : 팝업에서 그냥 로우(Row)를 선택한경우..
 */
function getCOM_ENS_N11_3(rowArray) {
	//alertComPopupData(rowArray);
	
	var colArray = rowArray[0];
	document.all.acct_cd.value = colArray[2];
	document.all.acct_eng_nm.value = colArray[3];
}


/**
 * Sample 1 : 팝업에서 Radio로 단일 선택을 한경우..
 */
function getCOM_ENS_0G1_1(rowArray) {
	var colArray = rowArray[0];
	document.all.cntr0g1_tpsz_cd.value = colArray[3];
	document.all.cntr0g1_tpsz_desc.value = colArray[4];
}


/**
 * Sample 2 : 팝업에서 Check로 멀티 선택을 한경우..
 */
function getCOM_ENS_0G1_2(rowArray) {
	var gubun = ',';
	
	for(var i=0; i<rowArray.length; i++)
	{
		if(i == rowArray.length-1) gubun = '';
		colArray = rowArray[i];
		document.all.cntr0g1_tpsz_cd.value = colArray[3]+gubun;
		document.all.cntr0g1_tpsz_desc.value = colArray[4]+gubun;
	}
}


/**
 * Sample 3 : 팝업에서 그냥 로우(Row)를 선택한경우..
 */
function getCOM_ENS_0G1_3(rowArray) {
	var colArray = rowArray[0];
	document.all.cntr0g1_tpsz_cd.value = colArray[3];
	document.all.cntr0g1_tpsz_desc.value = colArray[4];
}


/**
 * Sample 1 : 팝업에서 Radio로 단일 선택을 한경우..
 */
function getCOM_ENS_0K1_1(rowArray) {
	var colArray = rowArray[0];
	document.all.rep1_cmdt_cd.value = colArray[3];
	document.all.rep1_cmdt_nm.value = colArray[4];
}

/**
 * Sample 2 : 팝업에서 Check로 멀티 선택을 한경우..
 */
function getCOM_ENS_0K1_2(rowArray) {
	var gubun = ',';
	
	for(var i=0; i<rowArray.length; i++)
	{
		if(i == rowArray.length-1) gubun = '';
		colArray = rowArray[i];
		document.all.rep1_cmdt_cd.value = colArray[3]+gubun;
		document.all.rep1_cmdt_nm.value = colArray[4]+gubun;
	}
}

/**
 * Sample 3 : 팝업에서 그냥 로우(Row)를 선택한경우..
 */
function getCOM_ENS_0K1_3(rowArray) {
	var colArray = rowArray[0];
	document.all.rep1_cmdt_cd.value = colArray[3];
	document.all.rep1_cmdt_nm.value = colArray[4];
}


/**
 * Sample 1 : 팝업에서 Radio로 단일 선택을 한경우..
 */
function getCOM_ENS_0H1_1(rowArray) {
	var colArray = rowArray[0];
	document.all.conti_inqu_cd.value = colArray[3];
	document.all.conti_inqu_nm.value = colArray[4];
}

/**
 * Sample 2 : 팝업에서 Check로 멀티 선택을 한경우..
 */
function getCOM_ENS_0H1_2(rowArray) {
	var gubun = ',';
	
	for(var i=0; i<rowArray.length; i++)
	{
		if(i == rowArray.length-1) gubun = '';
		colArray = rowArray[i];
		document.all.conti_inqu_cd.value = colArray[3]+gubun;
		document.all.conti_inqu_nm.value = colArray[4]+gubun;
	}
}

/**
 * Sample 3 : 팝업에서 그냥 로우(Row)를 선택한경우..
 */
function getCOM_ENS_0H1_3(rowArray) {
	var colArray = rowArray[0];
	document.all.conti_inqu_cd.value = colArray[3];
	document.all.conti_inqu_nm.value = colArray[4];
}


/**
 * Sample 1 : 팝업에서 Radio로 단일 선택을 한경우..
 */
function getCOM_ENS_0I1_1(rowArray) {
	var colArray = rowArray[0];
	document.all.sconti_inqu_cd.value = colArray[3];
	document.all.sconti_inqu_nm.value = colArray[4];
}

/**
 * Sample 2 : 팝업에서 Check로 멀티 선택을 한경우..
 */
function getCOM_ENS_0I1_2(rowArray) {
	var gubun = ',';
	
	for(var i=0; i<rowArray.length; i++)
	{
		if(i == rowArray.length-1) gubun = '';
		colArray = rowArray[i];
		document.all.sconti_inqu_cd.value = colArray[3]+gubun;
		document.all.sconti_inqu_nm.value = colArray[4]+gubun;
	}
}

/**
 * Sample 3 : 팝업에서 그냥 로우(Row)를 선택한경우..
 */
function getCOM_ENS_0I1_3(rowArray) {
	var colArray = rowArray[0];
	document.all.sconti_inqu_cd.value = colArray[3];
	document.all.sconti_inqu_nm.value = colArray[4];
}


/**
 * Sample 1 : 팝업에서 Radio로 단일 선택을 한경우..
 */
function getUI_BKG_0696_1(rowArray) {
	var colArray = rowArray[0];
	document.all.pck_cd.value = colArray[2];
	document.all.pck_nm.value = colArray[3];
}

/**
 * Sample 2 : 팝업에서 Check로 멀티 선택을 한경우..
 */
function getUI_BKG_0696_2(rowArray) {
	var gubun = ',';
	
	for(var i=0; i<rowArray.length; i++)
	{
		if(i == rowArray.length-1) gubun = '';
		colArray = rowArray[i];
		document.all.pck_cd.value = colArray[2]+gubun;
		document.all.pck_nm.value = colArray[3]+gubun;
	}
}

/**
 * Sample 3 : 팝업에서 그냥 로우(Row)를 선택한경우..
 */
function getUI_BKG_0696_3(rowArray) {
	var colArray = rowArray[0];
	document.all.pck_cd.value = colArray[2];
	document.all.pck_nm.value = colArray[3];
}


/**
 * Sample 1 : 팝업에서 Radio로 단일 선택을 한경우..
 */
function getCOM_ENS_0M1_1(rowArray) {
	var colArray = rowArray[0];
	document.all.m1_cnt_cd.value = colArray[3];
	document.all.m1_cnt_nm.value = colArray[4];
}

/**
 * Sample 2 : 팝업에서 Check로 멀티 선택을 한경우..
 */
function getCOM_ENS_0M1_2(rowArray) {
	var gubun = ',';
	
	for(var i=0; i<rowArray.length; i++)
	{
		if(i == rowArray.length-1) gubun = '';
		colArray = rowArray[i];
		document.all.m1_cnt_cd.value = colArray[3]+gubun;
		document.all.m1_cnt_nm.value = colArray[4]+gubun;
	}
}

/**
 * Sample 3 : 팝업에서 그냥 로우(Row)를 선택한경우..
 */
function getCOM_ENS_0M1_3(rowArray) {
	var colArray = rowArray[0];
	document.all.m1_cnt_cd.value = colArray[3];
	document.all.m1_cnt_nm.value = colArray[4];
}


/**
 * Sample 1 : 팝업에서 Radio로 단일 선택을 한경우..
 */
function getCOM_ENS_0J1_1(rowArray) {
	//alert(rowArray);
	var colArray = rowArray[0];
	document.all.rgn_cnt_cd.value = colArray[5];
	document.all.rgn_cd.value = colArray[3];
	document.all.rgn_nm.value = colArray[4];
}

/**
 * Sample 2 : 팝업에서 Check로 멀티 선택을 한경우..
 */
function getCOM_ENS_0J1_2(rowArray) {
	var gubun = ',';
	
	for(var i=0; i<rowArray.length; i++)
	{
		if(i == rowArray.length-1) gubun = '';
		colArray = rowArray[i];
		document.all.rgn_cnt_cd.value = colArray[5]+gubun;
		document.all.rgn_cd.value = colArray[3]+gubun;
		document.all.rgn_nm.value = colArray[4]+gubun;
	}
}

/**
 * Sample 3 : 팝업에서 그냥 로우(Row)를 선택한경우..
 */
function getCOM_ENS_0J1_3(rowArray) {
	var colArray = rowArray[0];
	document.all.rgn_cnt_cd.value = colArray[5];
	document.all.rgn_cd.value = colArray[3];
	document.all.rgn_nm.value = colArray[4];
}



/**
 * Sample 1 : 팝업에서 Radio로 단일 선택을 한경우..
 */
function getCOM_ENS_N13_1(rowArray) {
	//alert(rowArray);
	var colArray = rowArray[0];
	document.all.curr_cnt_cd.value = colArray[3];
	document.all.curr_cd.value = colArray[2];
	document.all.curr_desc.value = colArray[4];
}

/**
 * Sample 2 : 팝업에서 Check로 멀티 선택을 한경우..
 */
function getCOM_ENS_N13_2(rowArray) {
	var gubun = ',';
	
	for(var i=0; i<rowArray.length; i++)
	{
		if(i == rowArray.length-1) gubun = '';
		colArray = rowArray[i];
//		document.all.cnt_cd.value = colArray[3]+gubun;
		document.all.curr_cd.value = colArray[2]+gubun;
		document.all.curr_desc.value = colArray[5]+gubun;
	}
}

/**
 * Sample 3 : 팝업에서 그냥 로우(Row)를 선택한경우..
 */
function getCOM_ENS_N13_3(rowArray) {
	var colArray = rowArray[0];
//	document.all.cnt_cd.value = colArray[3];
	document.all.curr_cd.value = colArray[2];
	document.all.curr_desc.value = colArray[5];
}


/**
 * Sample 1 : 팝업에서 Radio로 단일 선택을 한경우..
 */
function getCOM_ENS_0X1_1(rowArray) {
//	alert(rowArray);
	var colArray = rowArray[0];
	document.all.state_cnt_cd.value = colArray[5];
}

/**
 * Sample 2 : 팝업에서 Check로 멀티 선택을 한경우..
 */
function getCOM_ENS_0X1_2(rowArray) {
	var gubun = ',';
	
	for(var i=0; i<rowArray.length; i++)
	{
		if(i == rowArray.length-1) gubun = '';
		colArray = rowArray[i];
		document.all.state_cnt_cd.value = colArray[5]+gubun;
	}
}

/**
 * Sample 3 : 팝업에서 그냥 로우(Row)를 선택한경우..
 */
function getCOM_ENS_0X1_3(rowArray) {
	var colArray = rowArray[0];
	document.all.state_cnt_cd.value = colArray[5];
}

/**
 * Sample 1 : 팝업에서 Radio로 단일 선택을 한경우..
 */
function getCOM_ENS_0N1_1(rowArray) {
	//alertComPopupData(rowArray);
	var colArray = rowArray[0];
	document.all.crr_cd.value = colArray[3];
}


/**
 * Sample 2 : 팝업에서 Check로 멀티 선택을 한경우..
 */
function getCOM_ENS_0N1_2(rowArray) {
	//alertComPopupData(rowArray);
	
	var gubun = ',';
	
	for(var i=0; i<rowArray.length; i++)
	{
		if(i == rowArray.length-1) gubun = '';
		
		colArray = rowArray[i];
		
		document.all.crr_cd.value = colArray[3]+gubun;
	}
}


/**
 * Sample 3 : 팝업에서 그냥 로우(Row)를 선택한경우..
 */
function getCOM_ENS_0N1_3(rowArray) {
	
	var colArray = rowArray[0];
	document.all.crr_cd.value = colArray[3];
}


/**
 * Sample 1 : 팝업에서 Radio로 단일 선택을 한경우..
 */
function getCOM_ENS_0L1_1(rowArray) {
//	alert(rowArray);
	var colArray = rowArray[0];
	//document.all.rgn_cd.value = colArray[3];
	//document.all.rgn_nm.value = colArray[4];
}

/**
 * Sample 2 : 팝업에서 Check로 멀티 선택을 한경우..
 */
function getCOM_ENS_0L1_2(rowArray) {
	var gubun = ',';
	
	for(var i=0; i<rowArray.length; i++)
	{
		if(i == rowArray.length-1) gubun = '';
		colArray = rowArray[i];
		//document.all.rgn_cd.value = colArray[3]+gubun;
		//document.all.rgn_nm.value = colArray[4]+gubun;
	}
}

/**
 * Sample 3 : 팝업에서 그냥 로우(Row)를 선택한경우..
 */
function getCOM_ENS_0L1_3(rowArray) {
	var colArray = rowArray[0];
	//document.all.rgn_cd.value = colArray[3];
	//document.all.rgn_nm.value = colArray[4];
}

/**
* Sample 1 : 팝업에서 Radio로 단일 선택을 한경우..
*/
function getCOM_COM_0001_1(rowArray) {
	//alertComPopupData(rowArray);
	var colArray = rowArray[0];
	document.all.chg_cd.value = colArray[3];
	document.all.chg_nm.value = colArray[4];
}

/**
* Sample 2 : 팝업에서 Check로 멀티 선택을 한경우..
*/
function getCOM_COM_0001_2(rowArray) {
	//alertComPopupData(rowArray);
	
	var gubun = ',';
	
	for(var i=0; i<rowArray.length; i++)
	{
		if(i == rowArray.length-1) gubun = '';
		
		colArray = rowArray[i];
		
		document.all.chg_cd.value = colArray[3]+gubun;
		document.all.chg_nm.value = colArray[4]+gubun;
	}
}

/**
* Sample 3 : 팝업에서 그냥 로우(Row)를 선택한경우..
*/
function getCOM_COM_0001_3(rowArray) {
	
	var colArray = rowArray[0];
	document.all.chg_cd.value = colArray[3];
	document.all.chg_nm.value = colArray[4];
}


/**
* Sample 1 : 팝업에서 Radio로 단일 선택을 한경우..
*/
function getCOM_COM_0002_1(rowArray) {
	//alertComPopupData(rowArray);
	var colArray = rowArray[0];
	document.all.cntr_tp_cd.value = colArray[2];
	document.all.cntr_tp_desc.value = colArray[3];
}

/**
* Sample 2 : 팝업에서 Check로 멀티 선택을 한경우..
*/
function getCOM_COM_0002_2(rowArray) {
	//alertComPopupData(rowArray);
	
	var gubun = ',';
	
	for(var i=0; i<rowArray.length; i++)
	{
		if(i == rowArray.length-1) gubun = '';
		
		colArray = rowArray[i];
		
		document.all.cntr_tp_cd.value = colArray[2]+gubun;
		document.all.cntr_tp_desc.value = colArray[3]+gubun;
	}
}

/**
* Sample 3 : 팝업에서 그냥 로우(Row)를 선택한경우..
*/
function getCOM_COM_0002_3(rowArray) {
	
	var colArray = rowArray[0];
	document.all.cntr_tp_cd.value = colArray[2];
	document.all.cntr_tp_desc.value = colArray[3];
}

/**
* Sample 1 : 팝업에서 Radio로 단일 선택을 한경우..
*/
function getCOM_COM_0003_1(rowArray) {
	//alertComPopupData(rowArray);
	var colArray = rowArray[0];
	document.all.cntr_sz_cd.value = colArray[2];
	document.all.cntr_sz_desc.value = colArray[3];
}

/**
* Sample 2 : 팝업에서 Check로 멀티 선택을 한경우..
*/
function getCOM_COM_0003_2(rowArray) {
	//alertComPopupData(rowArray);
	
	var gubun = ',';
	
	for(var i=0; i<rowArray.length; i++)
	{
		if(i == rowArray.length-1) gubun = '';
		
		colArray = rowArray[i];
		
		document.all.cntr_sz_cd.value = colArray[2]+gubun;
		document.all.cntr_sz_desc.value = colArray[3]+gubun;
	}
}

/**
* Sample 3 : 팝업에서 그냥 로우(Row)를 선택한경우..
*/
function getCOM_COM_0003_3(rowArray) {
	
	var colArray = rowArray[0];
	document.all.cntr_sz_cd.value = colArray[2];
	document.all.cntr_sz_desc.value = colArray[3];
}

/**
* Sample 1 : 팝업에서 Radio로 단일 선택을 한경우..
*/
function getCOM_COM_0004_1(rowArray) {
	//alertComPopupData(rowArray);
	var colArray = rowArray[0];
	document.all.lse_co_yd_cd.value = colArray[2];
	document.all.lse_co_yd_nm.value = colArray[3];
}

/**
* Sample 2 : 팝업에서 Check로 멀티 선택을 한경우..
*/
function getCOM_COM_0004_2(rowArray) {
	//alertComPopupData(rowArray);
	
	var gubun = ',';
	
	for(var i=0; i<rowArray.length; i++)
	{
		if(i == rowArray.length-1) gubun = '';
		
		colArray = rowArray[i];
		
		document.all.lse_co_yd_cd.value = colArray[2]+gubun;
		document.all.lse_co_yd_nm.value = colArray[3]+gubun;
	}
}

/**
* Sample 3 : 팝업에서 그냥 로우(Row)를 선택한경우..
*/
function getCOM_COM_0004_3(rowArray) {
	
	var colArray = rowArray[0];
	document.all.lse_co_yd_cd.value = colArray[2];
	document.all.lse_co_yd_nm.value = colArray[3];
}

/**
* Sample 1 : 팝업에서 Radio로 단일 선택을 한경우..
*/
function getCOM_COM_0005_1(rowArray) {
	//alertComPopupData(rowArray);
	var colArray = rowArray[0];
	document.all.dst_cnt_cd.value = colArray[2];
}

/**
* Sample 2 : 팝업에서 Check로 멀티 선택을 한경우..
*/
function getCOM_COM_0005_2(rowArray) {
	//alertComPopupData(rowArray);
	
	var gubun = ',';
	
	for(var i=0; i<rowArray.length; i++)
	{
		if(i == rowArray.length-1) gubun = '';
		
		colArray = rowArray[i];
		
		document.all.dst_cnt_cd.value = colArray[2]+gubun;
	}
}

/**
* Sample 3 : 팝업에서 그냥 로우(Row)를 선택한경우..
*/
function getCOM_COM_0005_3(rowArray) {
	
	var colArray = rowArray[0];
	document.all.dst_cnt_cd.value = colArray[2];
}

/**
* Sample 1 : 팝업에서 Radio로 단일 선택을 한경우..
*/
function getCOM_COM_0006_1(rowArray) {
	//alertComPopupData(rowArray);
	var colArray = rowArray[0];
	document.all.cust_grp_id.value = colArray[2];
	document.all.cust_grp_nm.value = colArray[3];
}

/**
* Sample 2 : 팝업에서 Check로 멀티 선택을 한경우..
*/
function getCOM_COM_0006_2(rowArray) {
	//alertComPopupData(rowArray);
	
	var gubun = ',';
	
	for(var i=0; i<rowArray.length; i++)
	{
		if(i == rowArray.length-1) gubun = '';
		
		colArray = rowArray[i];
		
		document.all.cust_grp_id.value = colArray[2]+gubun;
		document.all.cust_grp_nm.value = colArray[3]+gubun;
	}
}

/**
* Sample 3 : 팝업에서 그냥 로우(Row)를 선택한경우..
*/
function getCOM_COM_0006_3(rowArray) {
	
	var colArray = rowArray[0];
	document.all.cust_grp_id.value = colArray[2];
	document.all.cust_grp_nm.value = colArray[3];
}


/**
* Sample 1 : 팝업에서 Radio로 단일 선택을 한경우..
*/
function getCOM_COM_0007_1(rowArray) {
	//alertComPopupData(rowArray);
	var colArray = rowArray[0];
	document.all.vndr_cd.value = colArray[2];
	document.all.vndr_nm.value = colArray[3];
}

/**
* Sample 2 : 팝업에서 Check로 멀티 선택을 한경우..
*/
function getCOM_COM_0007_2(rowArray) {
	//alertComPopupData(rowArray);
	
	var gubun = ',';
	
	for(var i=0; i<rowArray.length; i++)
	{
		if(i == rowArray.length-1) gubun = '';
		
		colArray = rowArray[i];
		
		document.all.vndr_cd.value = colArray[2]+gubun;
		document.all.vndr_nm.value = colArray[3]+gubun;
	}
}

/**
* Sample 3 : 팝업에서 그냥 로우(Row)를 선택한경우..
*/
function getCOM_COM_0007_3(rowArray) {
	
	var colArray = rowArray[0];
	document.all.vndr_cd.value = colArray[2];
	document.all.vndr_nm.value = colArray[3];
}


/**
* Sample 1 : 팝업에서 Radio로 단일 선택을 한경우..
*/
function getCOM_COM_0008_1(rowArray) {
	//alertComPopupData(rowArray);
	var colArray = rowArray[0];
	document.all.srep_cd.value = colArray[2];
	document.all.srep_nm.value = colArray[3];
}

/**
* Sample 2 : 팝업에서 Check로 멀티 선택을 한경우..
*/
function getCOM_COM_0008_2(rowArray) {
	//alertComPopupData(rowArray);
	
	var gubun = ',';
	
	for(var i=0; i<rowArray.length; i++)
	{
		if(i == rowArray.length-1) gubun = '';
		
		colArray = rowArray[i];
		
		document.all.srep_cd.value = colArray[2]+gubun;
		document.all.srep_nm.value = colArray[3]+gubun;
	}
}

/**
* Sample 3 : 팝업에서 그냥 로우(Row)를 선택한경우..
*/
function getCOM_COM_0008_3(rowArray) {
	
	var colArray = rowArray[0];
	document.all.srep_cd.value = colArray[2];
	document.all.srep_nm.value = colArray[3];
}


/**
* Sample 1 : 팝업에서 Radio로 단일 선택을 한경우..
*/
function getCOM_COM_0009_1(rowArray) {
	//alertComPopupData(rowArray);
	var colArray = rowArray[0];
	document.all.act_cd.value = colArray[2];
	document.all.act_nm.value = colArray[3];
}

/**
* Sample 2 : 팝업에서 Check로 멀티 선택을 한경우..
*/
function getCOM_COM_0009_2(rowArray) {
	//alertComPopupData(rowArray);
	
	var gubun = ',';
	
	for(var i=0; i<rowArray.length; i++)
	{
		if(i == rowArray.length-1) gubun = '';
		
		colArray = rowArray[i];
		
		document.all.act_cd.value = colArray[2]+gubun;
		document.all.act_nm.value = colArray[3]+gubun;
	}
}

/**
* Sample 3 : 팝업에서 그냥 로우(Row)를 선택한경우..
*/
function getCOM_COM_0009_3(rowArray) {
	
	var colArray = rowArray[0];
	document.all.act_cd.value = colArray[2];
	document.all.act_nm.value = colArray[3];
}


/**
* Sample 1 : 팝업에서 Radio로 단일 선택을 한경우..
*/
function getCOM_COM_0010_1(rowArray) {
	//alertComPopupData(rowArray);
	var colArray = rowArray[0];
	document.all.mvmt_sts_cd.value = colArray[2];
	document.all.mvmt_sts_nm.value = colArray[3];
}

/**
* Sample 2 : 팝업에서 Check로 멀티 선택을 한경우..
*/
function getCOM_COM_0010_2(rowArray) {
	//alertComPopupData(rowArray);
	
	var gubun = ',';
	
	for(var i=0; i<rowArray.length; i++)
	{
		if(i == rowArray.length-1) gubun = '';
		
		colArray = rowArray[i];
		
		document.all.mvmt_sts_cd.value = colArray[2]+gubun;
		document.all.mvmt_sts_nm.value = colArray[3]+gubun;
	}
}

/**
* Sample 3 : 팝업에서 그냥 로우(Row)를 선택한경우..
*/
function getCOM_COM_0010_3(rowArray) {
	
	var colArray = rowArray[0];
	document.all.mvmt_sts_cd.value = colArray[2];
	document.all.mvmt_sts_nm.value = colArray[3];
}


/**
* Sample 1 : 팝업에서 Radio로 단일 선택을 한경우..
*/
function getCOM_COM_0011_1(rowArray) {
	//alertComPopupData(rowArray);
	var colArray = rowArray[0];
	document.all.rlane_cd.value = colArray[2];
	document.all.rlane_nm.value = colArray[3];
}

/**
* Sample 2 : 팝업에서 Check로 멀티 선택을 한경우..
*/
function getCOM_COM_0011_2(rowArray) {
	//alertComPopupData(rowArray);
	
	var gubun = ',';
	
	for(var i=0; i<rowArray.length; i++)
	{
		if(i == rowArray.length-1) gubun = '';
		
		colArray = rowArray[i];
		
		document.all.rlane_cd.value = colArray[2]+gubun;
		document.all.rlane_nm.value = colArray[3]+gubun;
	}
}

/**
* Sample 3 : 팝업에서 그냥 로우(Row)를 선택한경우..
*/
function getCOM_COM_0011_3(rowArray) {
	
	var colArray = rowArray[0];
	document.all.rlane_cd.value = colArray[2];
	document.all.rlane_nm.value = colArray[3];
}


/**
* Sample 1 : 팝업에서 Radio로 단일 선택을 한경우..
*/
function getCOM_COM_0012_1(rowArray) {
	//alertComPopupData(rowArray);
	var colArray = rowArray[0];
	document.all.trd_cd.value = colArray[3];
	document.all.trd_nm.value = colArray[4];
}

/**
* Sample 2 : 팝업에서 Check로 멀티 선택을 한경우..
*/
function getCOM_COM_0012_2(rowArray) {
	//alertComPopupData(rowArray);
	
	var gubun = ',';
	
	for(var i=0; i<rowArray.length; i++)
	{
		if(i == rowArray.length-1) gubun = '';
		
		colArray = rowArray[i];
		
		document.all.trd_cd.value = colArray[3]+gubun;
		document.all.trd_nm.value = colArray[4]+gubun;
	}
}

/**
* Sample 3 : 팝업에서 그냥 로우(Row)를 선택한경우..
*/
function getCOM_COM_0012_3(rowArray) {
	
	var colArray = rowArray[0];
	document.all.trd_cd.value = colArray[3];
	document.all.trd_nm.value = colArray[4];
}


/**
* Sample 1 : 팝업에서 Radio로 단일 선택을 한경우..
*/
function getCOM_COM_0013_1(rowArray) {
	//alertComPopupData(rowArray);
	var colArray = rowArray[0];
	document.all.sub_trd_cd.value = colArray[3];
	document.all.sub_trd_nm.value = colArray[4];
}

/**
* Sample 2 : 팝업에서 Check로 멀티 선택을 한경우..
*/
function getCOM_COM_0013_2(rowArray) {
	//alertComPopupData(rowArray);
	
	var gubun = ',';
	
	for(var i=0; i<rowArray.length; i++)
	{
		if(i == rowArray.length-1) gubun = '';
		
		colArray = rowArray[i];
		
		document.all.sub_trd_cd.value = colArray[3]+gubun;
		document.all.sub_trd_nm.value = colArray[4]+gubun;
	}
}

/**
* Sample 3 : 팝업에서 그냥 로우(Row)를 선택한경우..
*/
function getCOM_COM_0013_3(rowArray) {
	
	var colArray = rowArray[0];
	document.all.sub_trd_cd.value = colArray[3];
	document.all.sub_trd_nm.value = colArray[4];
}

/**
 * Sample 2 : 팝업에서 Check로 멀티 선택을 한경우..
 */
function getCOM_ENS_0O1(rowArray) {
	//alertComPopupData(rowArray);
	
	var gubun = ',';
	
	for(var i=0; i<rowArray.length; i++)
	{
		if(i == rowArray.length-1) gubun = '';

		colArray = rowArray[i];
		
		document.all.COM_ENS_0O1_loc_cd.value += colArray[2] + gubun;
	}
}

/**
 * 특정 Div 영역의 Display 모드를 변경한다.
 */
function chgDisplayMode(divId) {
    
    var divList = eval(divId);
    
    if(divList.length) {
        
        for(var i=0; i<divList.length; i++) {  
            var curDisplayMode = divList[i].style.display;
            if(curDisplayMode == "inline") {
                divList[i].style.display = "none";
            } else {
                divList[i].style.display = "inline";
            }
        }
    } else {
        var curDisplayMode = divList.style.display;
        if(curDisplayMode == "inline") {
            divList.style.display = "none";
        } else {
            divList.style.display = "inline";
        }
    }
}