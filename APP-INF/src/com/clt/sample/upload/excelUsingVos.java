/*========================================================
*Copyright(c) 2009 CyberLogitec
*ProcessChain    : NPI
*@FileName       : excelUsingVos.java
*@FileTitle      : NIS2010
*Open Issues     :
*Change history  :
*@LastModifyDate : Sep 10, 2009
*@LastModifier   : Jeong-Hoon, KIM
*@LastVersion    : 1.0
=========================================================*/
package com.clt.sample.upload;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import com.clt.framework.component.common.AbstractValueObject;
import com.clt.framework.component.util.JSPUtil;
import com.clt.framework.component.util.upload.Uploader;

/**
 * It's excelUsingVos.java
 * @author Jeong-Hoon, KIM
 * @see 
 * @since J2EE 1.5
 * Sep 10, 2009
 */
public class excelUsingVos {

	public transient org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(this.getClass().getName());
	/**
	 * This method is a main.
	 * @author Jeong-Hoon, KIM
	 * @param args
	 */
	public static void main(String[] args) {
		try{
			
			// 객체 생성..
			ManilaManifestListCondVO vo = new ManilaManifestListCondVO();
			vo.setIbflag("U");
			vo.setVslCd("20");
			vo.setPod("KKK");
			vo.setPol("PPP");
			vo.setSkdVoyNo("REGNO");
			vo.setSkdDirCd("CCC");
			vo.setPagerows("3");
			
			ManilaManifestListCondVO vo1 = new ManilaManifestListCondVO();
			vo1.setIbflag("U1");
			vo1.setVslCd("201");
			vo1.setPod("KKK1");
			vo1.setPol("PPP1");
			vo1.setSkdVoyNo("REGNO1");
			vo1.setSkdDirCd("CCC1");
			vo1.setPagerows("31");
			
			// 엑셀의 컬럼헤더 정의
			String[] title = new String[7];
			title[0]="COL1";
			title[1]="COL2";
			title[2]="COL3";
			title[3]="COL4";
			title[4]="COL5";
			title[5]="COL6";
			title[6]="COL7";
			
			// 컬럼헤더와 매핑되는 DB Column 명 정의
			String[] titleField = new String[7];
			titleField[0] = "ibflag";
			titleField[1] = "vsl_cd";
			titleField[2] = "pol_cd";
			titleField[3] = "pod_cd";
			titleField[4] = "skd_dir_cd";
			titleField[5] = "skd_voy_no";
			titleField[6] = "pagerows";
			
			ArrayList<AbstractValueObject> vos = new ArrayList<AbstractValueObject>();
			vos.add(vo);
			vos.add(vo1);
			
			String fileName = Uploader.writeExcel(vos, title, titleField);
			
//			System.out.println("FILE => " + fileName);
			
		}catch(Exception e){
			excelUsingVos usingVos = new excelUsingVos();
			usingVos.log.error(e.getMessage());
//			e.printStackTrace();
		}
	}
	
	/**
	 * It's excelUsingVos.java
	 * @author Jeong-Hoon, KIM
	 * @see 
	 * @since J2EE 1.5
	 * Sep 10, 2009
	 */
	private static class ManilaManifestListCondVO extends AbstractValueObject{

		private static final long serialVersionUID = 1L;
		
		private Collection<ManilaManifestListCondVO> models = new ArrayList<ManilaManifestListCondVO>();
		
		/* Status */
		private String ibflag = null;
		/* Column Info */
		private String vslCd = null;
		/* Column Info */
		private String polCd = null;
		/* Column Info */
		private String podCd = null;
		/* Column Info */
		private String regNo = null;
		/* Column Info */
		private String skdDirCd = null;
		/* Column Info */
		private String skdVoyNo = null;
		/* Page Number */
		private String pagerows = null;

		/*	hashColumnInpo	*/
		private HashMap<String, String> hashColumns = new HashMap<String, String>();

		/*	hashFildInpo	*/
		private HashMap<String, String> hashFields = new HashMap<String, String>();
		
		public ManilaManifestListCondVO() {}

		public ManilaManifestListCondVO(String ibflag, String pagerows, String vslCd, String skdVoyNo, String skdDirCd, String polCd,String regNo, String podCd) {
			this.ibflag = ibflag;
			this.vslCd = vslCd;
			this.polCd = polCd;
			this.podCd = podCd;
			this.regNo = regNo;
			this.skdDirCd = skdDirCd;
			this.skdVoyNo = skdVoyNo;
			this.pagerows = pagerows;
		}
		
		/**
		 * hashColumnInpo
		 * @return HashMap
		 */
		public HashMap<String, String> getColumnValues(){
			this.hashColumns.put("ibflag", getIbflag());
			this.hashColumns.put("vsl_cd", getVslCd());
			this.hashColumns.put("pol_cd", getPol());
			this.hashColumns.put("pod_cd", getPod());
			this.hashColumns.put("reg_no", getRegNo());
			this.hashColumns.put("skd_dir_cd", getSkdDirCd());
			this.hashColumns.put("skd_voy_no", getSkdVoyNo());
			this.hashColumns.put("pagerows", getPagerows());
			return this.hashColumns;
		}
		
		/**
		 * hashFildInpo
		 * @return
		 */
		public HashMap<String, String> getFieldNames(){
			this.hashFields.put("ibflag", "ibflag");
			this.hashFields.put("vsl_cd", "vslCd");
			this.hashFields.put("pol_cd", "polCd");
			this.hashFields.put("pod_cd", "podCd");
			this.hashFields.put("skd_dir_cd", "skdDirCd");
			this.hashFields.put("skd_voy_no", "skdVoyNo");
			this.hashFields.put("pagerows", "pagerows");
			return this.hashFields;
		}
		
		public String getIbflag() {
			return this.ibflag;
		}
		public String getVslCd() {
			return this.vslCd;
		}
		public String getPol() {
			return this.polCd;
		}
		public String getPod() {
			return this.podCd;
		}
		public String getSkdDirCd() {
			return this.skdDirCd;
		}
		public String getSkdVoyNo() {
			return this.skdVoyNo;
		}
		public String getPagerows() {
			return this.pagerows;
		}
		/**
		 * Column Info
		 * @return regNo
		 */
		public String getRegNo() {
			return this.regNo;
		}

		public void setIbflag(String ibflag) {
			this.ibflag = ibflag;
			//this.ibflag=true;
		}
		public void setVslCd(String vslCd) {
			this.vslCd = vslCd;
			//this.vslCd=true;
		}
		public void setPol(String polCd) {
			this.polCd = polCd;
			//this.clptSeq=true;
		}
		public void setPod(String podCd) {
			this.podCd = podCd;
			//this.clptSeq=true;
		}
		/**
		 * Column Info
		 * @param regNo
		 */
		public void setRegNo(String regNo) {
			this.regNo = regNo;
		}
		public void setSkdDirCd(String skdDirCd) {
			this.skdDirCd = skdDirCd;
			//this.skdDirCd=true;
		}
		public void setSkdVoyNo(String skdVoyNo) {
			this.skdVoyNo = skdVoyNo;
			//this.skdVoyNo=true;
		}
		public void setPagerows(String pagerows) {
			this.pagerows = pagerows;
			//this.pagerows=true;
		}
		public void fromRequest(HttpServletRequest request) {
			setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
			setVslCd(JSPUtil.getParameter(request, "vsl_cd", ""));
			setPol(JSPUtil.getParameter(request, "pol_cd", ""));
			setPod(JSPUtil.getParameter(request, "pod_cd", ""));
			setSkdDirCd(JSPUtil.getParameter(request, "skd_dir_cd", ""));
			setSkdVoyNo(JSPUtil.getParameter(request, "skd_voy_no", ""));
			setRegNo(JSPUtil.getParameter(request, "reg_no", ""));
			setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		}

		public ManilaManifestListCondVO[] fromRequestGrid(HttpServletRequest request) {
			return fromRequestGrid(request, "");
		}

		public ManilaManifestListCondVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
			ManilaManifestListCondVO model = null;
			
			String[] tmp = request.getParameterValues(prefix + "ibflag");
	  		if(tmp == null)
	   			return null;

	  		int length = request.getParameterValues(prefix + "ibflag").length;
	  
			try {
				String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
				String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd".trim(), length));
				String[] pol = (JSPUtil.getParameter(request, prefix	+ "pol_cd".trim(), length));
				String[] pod = (JSPUtil.getParameter(request, prefix	+ "pod_cd".trim(), length));
				String[] skdDirCd = (JSPUtil.getParameter(request, prefix	+ "skd_dir_cd".trim(), length));
				String[] skdVoyNo = (JSPUtil.getParameter(request, prefix	+ "skd_voy_no".trim(), length));
				String[] regNo = (JSPUtil.getParameter(request, prefix	+ "reg_no".trim(), length));
				String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
				
				for (int i = 0; i < length; i++) {
					model = new ManilaManifestListCondVO();
					if (ibflag[i] != null)
						model.setIbflag(ibflag[i]);
					if (vslCd[i] != null)
						model.setVslCd(vslCd[i]);
					if (pol[i] != null)
						model.setPol(pol[i]);
					if (pod[i] != null)
						model.setPod(pod[i]);
					if (skdDirCd[i] != null)
						model.setSkdDirCd(skdDirCd[i]);
					if (regNo[i] != null)
						model.setRegNo(regNo[i]);
					if (skdVoyNo[i] != null)
						model.setSkdVoyNo(skdVoyNo[i]);
					if (pagerows[i] != null)
						model.setPagerows(pagerows[i]);
					models.add(model);
				}

			} catch (Exception e) {
				return null;
			}
			return getManilaManifestListCondVOs();
		}

		public ManilaManifestListCondVO[] getManilaManifestListCondVOs(){
			ManilaManifestListCondVO[] vos = (ManilaManifestListCondVO[])models.toArray(new ManilaManifestListCondVO[models.size()]);
			return vos;
		}
		
		public String toString() {
			StringBuffer ret = new StringBuffer();
			Field[] field = this.getClass().getDeclaredFields();
			String space = "";
			try{
				for(int i = 0; i < field.length; i++){
					String[] arr = null;
					arr = getField(field, i);
					if(arr != null){
						for(int j = 0; j < arr.length; j++) {
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
		 * @throws IllegalAccessException
		 */
		 private String[] getField(Field[] field, int i) {
			 String[] arr = null;
			 try{
			 	arr = (String[]) field[i].get(this);
			 }catch(Exception ex){
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
		public void onDataFormat(){
			this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
			this.vslCd = this.vslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
			this.polCd = this.polCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
			this.podCd = this.podCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
			this.skdDirCd = this.skdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
			this.skdVoyNo = this.skdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
			this.regNo = this.regNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
			this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		}
	}
}
