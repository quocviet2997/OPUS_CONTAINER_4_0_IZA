package com.clt.sample;

import java.util.List;

import com.clt.framework.component.excel.ExcelParser;
import com.clt.framework.component.excel.ExcelRowInfo;
import com.clt.framework.component.excel.ExcelSheetInfo;

/**
 * ExcelParserSample 
 * @author 9008631
 *
 */
public class ExcelParserSample {

	public transient org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(this.getClass().getName());
	public static void main(String[] args) throws Exception {
    	try{
    		
    		//Excel 2007 테스트 
    		ExcelParser poiReader = new ExcelParser("C:\\Tmp\\LABP_On Street Hanjin Owner_Jan 2010.xlsx","xlsx");

    		//Excel 2007 이전버젼 테스트 
//    		ExcelParser poiReader = new ExcelParser("C:\\Tmp\\LABP_On Street Hanjin Owner_Jan 2010.xls","xls");
    		
    		// Sheet 의 정보를 모두 가져온다.   dateformat 설정 할수 있음
    		List<ExcelSheetInfo>  sheets = poiReader.getData("yyyy-MM-dd HH:mm:SS");
    		
    		// Sheet 의 정보를 모두 가져온다.   dateformat 를 default 사용  (Mon Jan 18 20:32:00)
//    		List<ExcelSheetInfo>  sheets = poiReader.getData();
    		
    		ExcelSheetInfo sheetInfo = null;
    		String sheetName = null;
    		
    		// Sheet 갯수만큼 반복한다.
			for ( int i=0; i<sheets.size(); i++ ) {
				sheetInfo = sheets.get(i);
				
				// Row 정보를 가져온다.
				List<ExcelRowInfo> rows = sheetInfo.getRows();
				int rowCount = sheetInfo.getRowCount();
				sheetName = sheetInfo.getSheetName();
//				System.out.println("SheetName -> " + sheetName);
				
				// Row 갯수만큼 반복한다.
				for ( int j=0; j<rowCount; j++ ) {
					ExcelRowInfo oneRow =  rows.get(j);
					int colCount = oneRow.getColCount();
					
					// Column 정보를 가져온다.
					List<String> cols = oneRow.getCols();
					
					// Column 갯수만큼 반복한다.
					for ( int k=0; k<colCount; k++ ) {
						System.out.print(cols.get(k));
						System.out.print(",");
					}
//					System.out.println("");
				}
//				System.out.println("");
			}
    	}catch(Exception e){
    		ExcelParserSample excelParserSample = new ExcelParserSample();
    		excelParserSample.log.error(e.getMessage());
//    		e.printStackTrace();
    	}
    }
}
