/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : TEMP_CSV.java
*@FileTitle : CVS Upload
*Open Issues :
*Change history :
*@LastModifyDate : 2006-12-12
*@LastModifier : HOESOO,JANG
*@LastVersion : 1.0
* 2006-12-12 HOESOO,JANG
* 1.0 최초 생성
=========================================================*/
package com.clt.syscommon.common.table;

import java.lang.reflect.Field;
import java.util.Collection;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;

import com.clt.framework.component.util.JSPUtil;

/**
 * Table Value Ojbect<br>
 * - 모든 업무에서 공통으로 사용하는 PDTO(Data Transfer Object including Parameters)<br>
 * - 관련 Event에서 작성, 서버실행요청시 PDTO의 역할을 수행하는 Value Object<br>
 * 
 * @author HOESOO,JANG
 * @since J2EE 1.4
 */
public final class TEMP_CSV implements java.io.Serializable {

	private String    page_rows = "";
	private String    csv_id    = "";
	private String    col00     = "";
	private String    col01     = "";
	private String    col02     = "";
	private String    col03     = "";
	private String    col04     = "";
	private String    col05     = "";
	private String    col06     = "";
	private String    col07     = "";
	private String    col08     = "";
	private String    col09     = "";
	private String    col10     = "";
	private String    col11     = "";
	private String    col12     = "";
	private String    col13     = "";
	private String    col14     = "";
	private String    col15     = "";
	private String    col16     = "";
	private String    col17     = "";
	private String    col18     = "";
	private String    col19     = "";
	private String    col20     = "";
	private String    col21     = "";
	private String    col22     = "";
	private String    col23     = "";
	private String    col24     = "";
	private String    col25     = "";
	private String    col26     = "";
	private String    col27     = "";
	private String    col28     = "";
	private String    col29     = "";
	private String    col30     = "";
	private String    col31     = "";
	private String    col32     = "";
	private String    col33     = "";
	private String    col34     = "";
	private String    col35     = "";
	private String    col36     = "";
	private String    col37     = "";
	private String    col38     = "";
	private String    col39     = "";
	private String    col40     = "";
	private String    col41     = "";
	private String    col42     = "";
	private String    col43     = "";
	private String    col44     = "";
	private String    col45     = "";
	private String    col46     = "";
	private String    col47     = "";
	private String    col48     = "";
	private String    col49     = "";
	private String    col50     = "";
	private String    col51     = "";
	private String    col52     = "";
	private String    col53     = "";
	private String    col54     = "";
	private String    col55     = "";
	private String    col56     = "";
	private String    col57     = "";
	private String    col58     = "";
	private String    col59     = "";
	private String    col60     = "";
	private String    col61     = "";
	private String    col62     = "";
	private String    col63     = "";
	private String    col64     = "";
	private String    col65     = "";
	private String    col66     = "";
	private String    col67     = "";
	private String    col68     = "";
	private String    col69     = "";
	private String    col70     = "";
	private String    col71     = "";
	private String    col72     = "";
	private String    col73     = "";
	private String    col74     = "";
	private String    col75     = "";
	private String    col76     = "";
	private String    col77     = "";
	private String    col78     = "";
	private String    col79     = "";
	private String    col80     = "";
	private String    col81     = "";
	private String    col82     = "";
	private String    col83     = "";
	private String    col84     = "";
	private String    col85     = "";
	private String    col86     = "";
	private String    col87     = "";
	private String    col88     = "";
	private String    col89     = "";
	private String    col90     = "";
	private String    col91     = "";
	private String    col92     = "";
	private String    col93     = "";
	private String    col94     = "";
	private String    col95     = "";
	private String    col96     = "";
	private String    col97     = "";
	private String    col98     = "";
	private String    col99     = "";

	public TEMP_CSV(){}

	/**
	 * 생성
	 * 
	 * @param ibflag
	 * @param page_rows
	 * @param csv_id
	 * @param col00
	 * @param col01
	 * @param col02
	 * @param col03
	 * @param col04
	 * @param col05
	 * @param col06
	 * @param col07
	 * @param col08
	 * @param col09
	 * @param col10
	 * @param col11
	 * @param col12
	 * @param col13
	 * @param col14
	 * @param col15
	 * @param col16
	 * @param col17
	 * @param col18
	 * @param col19
	 * @param col20
	 * @param col21
	 * @param col22
	 * @param col23
	 * @param col24
	 * @param col25
	 * @param col26
	 * @param col27
	 * @param col28
	 * @param col29
	 * @param col30
	 * @param col31
	 * @param col32
	 * @param col33
	 * @param col34
	 * @param col35
	 * @param col36
	 * @param col37
	 * @param col38
	 * @param col39
	 * @param col40
	 * @param col41
	 * @param col42
	 * @param col43
	 * @param col44
	 * @param col45
	 * @param col46
	 * @param col47
	 * @param col48
	 * @param col49
	 * @param col50
	 * @param col51
	 * @param col52
	 * @param col53
	 * @param col54
	 * @param col55
	 * @param col56
	 * @param col57
	 * @param col58
	 * @param col59
	 * @param col60
	 * @param col61
	 * @param col62
	 * @param col63
	 * @param col64
	 * @param col65
	 * @param col66
	 * @param col67
	 * @param col68
	 * @param col69
	 * @param col70
	 * @param col71
	 * @param col72
	 * @param col73
	 * @param col74
	 * @param col75
	 * @param col76
	 * @param col77
	 * @param col78
	 * @param col79
	 * @param col80
	 * @param col81
	 * @param col82
	 * @param col83
	 * @param col84
	 * @param col85
	 * @param col86
	 * @param col87
	 * @param col88
	 * @param col89
	 * @param col90
	 * @param col91
	 * @param col92
	 * @param col93
	 * @param col94
	 * @param col95
	 * @param col96
	 * @param col97
	 * @param col98
	 * @param col99
	 */
	public TEMP_CSV(
			String    ibflag   ,
			String    page_rows,
			String    csv_id   ,
			String    col00    ,
			String    col01    ,
			String    col02    ,
			String    col03    ,
			String    col04    ,
			String    col05    ,
			String    col06    ,
			String    col07    ,
			String    col08    ,
			String    col09    ,
			String    col10    ,
			String    col11    ,
			String    col12    ,
			String    col13    ,
			String    col14    ,
			String    col15    ,
			String    col16    ,
			String    col17    ,
			String    col18    ,
			String    col19    ,
			String    col20    ,
			String    col21    ,
			String    col22    ,
			String    col23    ,
			String    col24    ,
			String    col25    ,
			String    col26    ,
			String    col27    ,
			String    col28    ,
			String    col29    ,
			String    col30    ,
			String    col31    ,
			String    col32    ,
			String    col33    ,
			String    col34    ,
			String    col35    ,
			String    col36    ,
			String    col37    ,
			String    col38    ,
			String    col39    ,
			String    col40    ,
			String    col41    ,
			String    col42    ,
			String    col43    ,
			String    col44    ,
			String    col45    ,
			String    col46    ,
			String    col47    ,
			String    col48    ,
			String    col49    ,
			String    col50    ,
			String    col51    ,
			String    col52    ,
			String    col53    ,
			String    col54    ,
			String    col55    ,
			String    col56    ,
			String    col57    ,
			String    col58    ,
			String    col59    ,
			String    col60    ,
			String    col61    ,
			String    col62    ,
			String    col63    ,
			String    col64    ,
			String    col65    ,
			String    col66    ,
			String    col67    ,
			String    col68    ,
			String    col69    ,
			String    col70    ,
			String    col71    ,
			String    col72    ,
			String    col73    ,
			String    col74    ,
			String    col75    ,
			String    col76    ,
			String    col77    ,
			String    col78    ,
			String    col79    ,
			String    col80    ,
			String    col81    ,
			String    col82    ,
			String    col83    ,
			String    col84    ,
			String    col85    ,
			String    col86    ,
			String    col87    ,
			String    col88    ,
			String    col89    ,
			String    col90    ,
			String    col91    ,
			String    col92    ,
			String    col93    ,
			String    col94    ,
			String    col95    ,
			String    col96    ,
			String    col97    ,
			String    col98    ,
			String    col99    ){
		this.page_rows = page_rows;
		this.csv_id    = csv_id   ;
		this.col00     = col00    ;
		this.col01     = col01    ;
		this.col02     = col02    ;
		this.col03     = col03    ;
		this.col04     = col04    ;
		this.col05     = col05    ;
		this.col06     = col06    ;
		this.col07     = col07    ;
		this.col08     = col08    ;
		this.col09     = col09    ;
		this.col10     = col10    ;
		this.col11     = col11    ;
		this.col12     = col12    ;
		this.col13     = col13    ;
		this.col14     = col14    ;
		this.col15     = col15    ;
		this.col16     = col16    ;
		this.col17     = col17    ;
		this.col18     = col18    ;
		this.col19     = col19    ;
		this.col20     = col20    ;
		this.col21     = col21    ;
		this.col22     = col22    ;
		this.col23     = col23    ;
		this.col24     = col24    ;
		this.col25     = col25    ;
		this.col26     = col26    ;
		this.col27     = col27    ;
		this.col28     = col28    ;
		this.col29     = col29    ;
		this.col30     = col30    ;
		this.col31     = col31    ;
		this.col32     = col32    ;
		this.col33     = col33    ;
		this.col34     = col34    ;
		this.col35     = col35    ;
		this.col36     = col36    ;
		this.col37     = col37    ;
		this.col38     = col38    ;
		this.col39     = col39    ;
		this.col40     = col40    ;
		this.col41     = col41    ;
		this.col42     = col42    ;
		this.col43     = col43    ;
		this.col44     = col44    ;
		this.col45     = col45    ;
		this.col46     = col46    ;
		this.col47     = col47    ;
		this.col48     = col48    ;
		this.col49     = col49    ;
		this.col50     = col50    ;
		this.col51     = col51    ;
		this.col52     = col52    ;
		this.col53     = col53    ;
		this.col54     = col54    ;
		this.col55     = col55    ;
		this.col56     = col56    ;
		this.col57     = col57    ;
		this.col58     = col58    ;
		this.col59     = col59    ;
		this.col60     = col60    ;
		this.col61     = col61    ;
		this.col62     = col62    ;
		this.col63     = col63    ;
		this.col64     = col64    ;
		this.col65     = col65    ;
		this.col66     = col66    ;
		this.col67     = col67    ;
		this.col68     = col68    ;
		this.col69     = col69    ;
		this.col70     = col70    ;
		this.col71     = col71    ;
		this.col72     = col72    ;
		this.col73     = col73    ;
		this.col74     = col74    ;
		this.col75     = col75    ;
		this.col76     = col76    ;
		this.col77     = col77    ;
		this.col78     = col78    ;
		this.col79     = col79    ;
		this.col80     = col80    ;
		this.col81     = col81    ;
		this.col82     = col82    ;
		this.col83     = col83    ;
		this.col84     = col84    ;
		this.col85     = col85    ;
		this.col86     = col86    ;
		this.col87     = col87    ;
		this.col88     = col88    ;
		this.col89     = col89    ;
		this.col90     = col90    ;
		this.col91     = col91    ;
		this.col92     = col92    ;
		this.col93     = col93    ;
		this.col94     = col94    ;
		this.col95     = col95    ;
		this.col96     = col96    ;
		this.col97     = col97    ;
		this.col98     = col98    ;
		this.col99     = col99    ;
	}

	// getter method is proceeding ..
	public String    getPage_rows(){	return page_rows	;	}
	public String    getCsv_id   (){	return csv_id   	;	}
	public String    getCol00    (){	return col00    	;	}
	public String    getCol01    (){	return col01    	;	}
	public String    getCol02    (){	return col02    	;	}
	public String    getCol03    (){	return col03    	;	}
	public String    getCol04    (){	return col04    	;	}
	public String    getCol05    (){	return col05    	;	}
	public String    getCol06    (){	return col06    	;	}
	public String    getCol07    (){	return col07    	;	}
	public String    getCol08    (){	return col08    	;	}
	public String    getCol09    (){	return col09    	;	}
	public String    getCol10    (){	return col10    	;	}
	public String    getCol11    (){	return col11    	;	}
	public String    getCol12    (){	return col12    	;	}
	public String    getCol13    (){	return col13    	;	}
	public String    getCol14    (){	return col14    	;	}
	public String    getCol15    (){	return col15    	;	}
	public String    getCol16    (){	return col16    	;	}
	public String    getCol17    (){	return col17    	;	}
	public String    getCol18    (){	return col18    	;	}
	public String    getCol19    (){	return col19    	;	}
	public String    getCol20    (){	return col20    	;	}
	public String    getCol21    (){	return col21    	;	}
	public String    getCol22    (){	return col22    	;	}
	public String    getCol23    (){	return col23    	;	}
	public String    getCol24    (){	return col24    	;	}
	public String    getCol25    (){	return col25    	;	}
	public String    getCol26    (){	return col26    	;	}
	public String    getCol27    (){	return col27    	;	}
	public String    getCol28    (){	return col28    	;	}
	public String    getCol29    (){	return col29    	;	}
	public String    getCol30    (){	return col30    	;	}
	public String    getCol31    (){	return col31    	;	}
	public String    getCol32    (){	return col32    	;	}
	public String    getCol33    (){	return col33    	;	}
	public String    getCol34    (){	return col34    	;	}
	public String    getCol35    (){	return col35    	;	}
	public String    getCol36    (){	return col36    	;	}
	public String    getCol37    (){	return col37    	;	}
	public String    getCol38    (){	return col38    	;	}
	public String    getCol39    (){	return col39    	;	}
	public String    getCol40    (){	return col40    	;	}
	public String    getCol41    (){	return col41    	;	}
	public String    getCol42    (){	return col42    	;	}
	public String    getCol43    (){	return col43    	;	}
	public String    getCol44    (){	return col44    	;	}
	public String    getCol45    (){	return col45    	;	}
	public String    getCol46    (){	return col46    	;	}
	public String    getCol47    (){	return col47    	;	}
	public String    getCol48    (){	return col48    	;	}
	public String    getCol49    (){	return col49    	;	}
	public String    getCol50    (){	return col50    	;	}
	public String    getCol51    (){	return col51    	;	}
	public String    getCol52    (){	return col52    	;	}
	public String    getCol53    (){	return col53    	;	}
	public String    getCol54    (){	return col54    	;	}
	public String    getCol55    (){	return col55    	;	}
	public String    getCol56    (){	return col56    	;	}
	public String    getCol57    (){	return col57    	;	}
	public String    getCol58    (){	return col58    	;	}
	public String    getCol59    (){	return col59    	;	}
	public String    getCol60    (){	return col60    	;	}
	public String    getCol61    (){	return col61    	;	}
	public String    getCol62    (){	return col62    	;	}
	public String    getCol63    (){	return col63    	;	}
	public String    getCol64    (){	return col64    	;	}
	public String    getCol65    (){	return col65    	;	}
	public String    getCol66    (){	return col66    	;	}
	public String    getCol67    (){	return col67    	;	}
	public String    getCol68    (){	return col68    	;	}
	public String    getCol69    (){	return col69    	;	}
	public String    getCol70    (){	return col70    	;	}
	public String    getCol71    (){	return col71    	;	}
	public String    getCol72    (){	return col72    	;	}
	public String    getCol73    (){	return col73    	;	}
	public String    getCol74    (){	return col74    	;	}
	public String    getCol75    (){	return col75    	;	}
	public String    getCol76    (){	return col76    	;	}
	public String    getCol77    (){	return col77    	;	}
	public String    getCol78    (){	return col78    	;	}
	public String    getCol79    (){	return col79    	;	}
	public String    getCol80    (){	return col80    	;	}
	public String    getCol81    (){	return col81    	;	}
	public String    getCol82    (){	return col82    	;	}
	public String    getCol83    (){	return col83    	;	}
	public String    getCol84    (){	return col84    	;	}
	public String    getCol85    (){	return col85    	;	}
	public String    getCol86    (){	return col86    	;	}
	public String    getCol87    (){	return col87    	;	}
	public String    getCol88    (){	return col88    	;	}
	public String    getCol89    (){	return col89    	;	}
	public String    getCol90    (){	return col90    	;	}
	public String    getCol91    (){	return col91    	;	}
	public String    getCol92    (){	return col92    	;	}
	public String    getCol93    (){	return col93    	;	}
	public String    getCol94    (){	return col94    	;	}
	public String    getCol95    (){	return col95    	;	}
	public String    getCol96    (){	return col96    	;	}
	public String    getCol97    (){	return col97    	;	}
	public String    getCol98    (){	return col98    	;	}
	public String    getCol99    (){	return col99    	;	}

	// setter method is proceeding ..
	public void setPage_rows( String    page_rows ){	this.page_rows = page_rows	;	}
	public void setCsv_id   ( String    csv_id    ){	this.csv_id    = csv_id   	;	}
	public void setCol00    ( String    col00     ){	this.col00     = col00    	;	}
	public void setCol01    ( String    col01     ){	this.col01     = col01    	;	}
	public void setCol02    ( String    col02     ){	this.col02     = col02    	;	}
	public void setCol03    ( String    col03     ){	this.col03     = col03    	;	}
	public void setCol04    ( String    col04     ){	this.col04     = col04    	;	}
	public void setCol05    ( String    col05     ){	this.col05     = col05    	;	}
	public void setCol06    ( String    col06     ){	this.col06     = col06    	;	}
	public void setCol07    ( String    col07     ){	this.col07     = col07    	;	}
	public void setCol08    ( String    col08     ){	this.col08     = col08    	;	}
	public void setCol09    ( String    col09     ){	this.col09     = col09    	;	}
	public void setCol10    ( String    col10     ){	this.col10     = col10    	;	}
	public void setCol11    ( String    col11     ){	this.col11     = col11    	;	}
	public void setCol12    ( String    col12     ){	this.col12     = col12    	;	}
	public void setCol13    ( String    col13     ){	this.col13     = col13    	;	}
	public void setCol14    ( String    col14     ){	this.col14     = col14    	;	}
	public void setCol15    ( String    col15     ){	this.col15     = col15    	;	}
	public void setCol16    ( String    col16     ){	this.col16     = col16    	;	}
	public void setCol17    ( String    col17     ){	this.col17     = col17    	;	}
	public void setCol18    ( String    col18     ){	this.col18     = col18    	;	}
	public void setCol19    ( String    col19     ){	this.col19     = col19    	;	}
	public void setCol20    ( String    col20     ){	this.col20     = col20    	;	}
	public void setCol21    ( String    col21     ){	this.col21     = col21    	;	}
	public void setCol22    ( String    col22     ){	this.col22     = col22    	;	}
	public void setCol23    ( String    col23     ){	this.col23     = col23    	;	}
	public void setCol24    ( String    col24     ){	this.col24     = col24    	;	}
	public void setCol25    ( String    col25     ){	this.col25     = col25    	;	}
	public void setCol26    ( String    col26     ){	this.col26     = col26    	;	}
	public void setCol27    ( String    col27     ){	this.col27     = col27    	;	}
	public void setCol28    ( String    col28     ){	this.col28     = col28    	;	}
	public void setCol29    ( String    col29     ){	this.col29     = col29    	;	}
	public void setCol30    ( String    col30     ){	this.col30     = col30    	;	}
	public void setCol31    ( String    col31     ){	this.col31     = col31    	;	}
	public void setCol32    ( String    col32     ){	this.col32     = col32    	;	}
	public void setCol33    ( String    col33     ){	this.col33     = col33    	;	}
	public void setCol34    ( String    col34     ){	this.col34     = col34    	;	}
	public void setCol35    ( String    col35     ){	this.col35     = col35    	;	}
	public void setCol36    ( String    col36     ){	this.col36     = col36    	;	}
	public void setCol37    ( String    col37     ){	this.col37     = col37    	;	}
	public void setCol38    ( String    col38     ){	this.col38     = col38    	;	}
	public void setCol39    ( String    col39     ){	this.col39     = col39    	;	}
	public void setCol40    ( String    col40     ){	this.col40     = col40    	;	}
	public void setCol41    ( String    col41     ){	this.col41     = col41    	;	}
	public void setCol42    ( String    col42     ){	this.col42     = col42    	;	}
	public void setCol43    ( String    col43     ){	this.col43     = col43    	;	}
	public void setCol44    ( String    col44     ){	this.col44     = col44    	;	}
	public void setCol45    ( String    col45     ){	this.col45     = col45    	;	}
	public void setCol46    ( String    col46     ){	this.col46     = col46    	;	}
	public void setCol47    ( String    col47     ){	this.col47     = col47    	;	}
	public void setCol48    ( String    col48     ){	this.col48     = col48    	;	}
	public void setCol49    ( String    col49     ){	this.col49     = col49    	;	}
	public void setCol50    ( String    col50     ){	this.col50     = col50    	;	}
	public void setCol51    ( String    col51     ){	this.col51     = col51    	;	}
	public void setCol52    ( String    col52     ){	this.col52     = col52    	;	}
	public void setCol53    ( String    col53     ){	this.col53     = col53    	;	}
	public void setCol54    ( String    col54     ){	this.col54     = col54    	;	}
	public void setCol55    ( String    col55     ){	this.col55     = col55    	;	}
	public void setCol56    ( String    col56     ){	this.col56     = col56    	;	}
	public void setCol57    ( String    col57     ){	this.col57     = col57    	;	}
	public void setCol58    ( String    col58     ){	this.col58     = col58    	;	}
	public void setCol59    ( String    col59     ){	this.col59     = col59    	;	}
	public void setCol60    ( String    col60     ){	this.col60     = col60    	;	}
	public void setCol61    ( String    col61     ){	this.col61     = col61    	;	}
	public void setCol62    ( String    col62     ){	this.col62     = col62    	;	}
	public void setCol63    ( String    col63     ){	this.col63     = col63    	;	}
	public void setCol64    ( String    col64     ){	this.col64     = col64    	;	}
	public void setCol65    ( String    col65     ){	this.col65     = col65    	;	}
	public void setCol66    ( String    col66     ){	this.col66     = col66    	;	}
	public void setCol67    ( String    col67     ){	this.col67     = col67    	;	}
	public void setCol68    ( String    col68     ){	this.col68     = col68    	;	}
	public void setCol69    ( String    col69     ){	this.col69     = col69    	;	}
	public void setCol70    ( String    col70     ){	this.col70     = col70    	;	}
	public void setCol71    ( String    col71     ){	this.col71     = col71    	;	}
	public void setCol72    ( String    col72     ){	this.col72     = col72    	;	}
	public void setCol73    ( String    col73     ){	this.col73     = col73    	;	}
	public void setCol74    ( String    col74     ){	this.col74     = col74    	;	}
	public void setCol75    ( String    col75     ){	this.col75     = col75    	;	}
	public void setCol76    ( String    col76     ){	this.col76     = col76    	;	}
	public void setCol77    ( String    col77     ){	this.col77     = col77    	;	}
	public void setCol78    ( String    col78     ){	this.col78     = col78    	;	}
	public void setCol79    ( String    col79     ){	this.col79     = col79    	;	}
	public void setCol80    ( String    col80     ){	this.col80     = col80    	;	}
	public void setCol81    ( String    col81     ){	this.col81     = col81    	;	}
	public void setCol82    ( String    col82     ){	this.col82     = col82    	;	}
	public void setCol83    ( String    col83     ){	this.col83     = col83    	;	}
	public void setCol84    ( String    col84     ){	this.col84     = col84    	;	}
	public void setCol85    ( String    col85     ){	this.col85     = col85    	;	}
	public void setCol86    ( String    col86     ){	this.col86     = col86    	;	}
	public void setCol87    ( String    col87     ){	this.col87     = col87    	;	}
	public void setCol88    ( String    col88     ){	this.col88     = col88    	;	}
	public void setCol89    ( String    col89     ){	this.col89     = col89    	;	}
	public void setCol90    ( String    col90     ){	this.col90     = col90    	;	}
	public void setCol91    ( String    col91     ){	this.col91     = col91    	;	}
	public void setCol92    ( String    col92     ){	this.col92     = col92    	;	}
	public void setCol93    ( String    col93     ){	this.col93     = col93    	;	}
	public void setCol94    ( String    col94     ){	this.col94     = col94    	;	}
	public void setCol95    ( String    col95     ){	this.col95     = col95    	;	}
	public void setCol96    ( String    col96     ){	this.col96     = col96    	;	}
	public void setCol97    ( String    col97     ){	this.col97     = col97    	;	}
	public void setCol98    ( String    col98     ){	this.col98     = col98    	;	}
	public void setCol99    ( String    col99     ){	this.col99     = col99    	;	}

	/**
	 * @param request
	 * @return
	 */
	public static TEMP_CSV fromRequest(HttpServletRequest request) {
		TEMP_CSV model = new TEMP_CSV();
		try {
			model.setPage_rows	(JSPUtil.getParameter(request, "page_rows		".trim(), ""));
			model.setCsv_id   	(JSPUtil.getParameter(request, "csv_id   		".trim(), ""));
			model.setCol00    	(JSPUtil.getParameter(request, "col00    		".trim(), ""));
			model.setCol01    	(JSPUtil.getParameter(request, "col01    		".trim(), ""));
			model.setCol02    	(JSPUtil.getParameter(request, "col02    		".trim(), ""));
			model.setCol03    	(JSPUtil.getParameter(request, "col03    		".trim(), ""));
			model.setCol04    	(JSPUtil.getParameter(request, "col04    		".trim(), ""));
			model.setCol05    	(JSPUtil.getParameter(request, "col05    		".trim(), ""));
			model.setCol06    	(JSPUtil.getParameter(request, "col06    		".trim(), ""));
			model.setCol07    	(JSPUtil.getParameter(request, "col07    		".trim(), ""));
			model.setCol08    	(JSPUtil.getParameter(request, "col08    		".trim(), ""));
			model.setCol09    	(JSPUtil.getParameter(request, "col09    		".trim(), ""));
			model.setCol10    	(JSPUtil.getParameter(request, "col10    		".trim(), ""));
			model.setCol11    	(JSPUtil.getParameter(request, "col11    		".trim(), ""));
			model.setCol12    	(JSPUtil.getParameter(request, "col12    		".trim(), ""));
			model.setCol13    	(JSPUtil.getParameter(request, "col13    		".trim(), ""));
			model.setCol14    	(JSPUtil.getParameter(request, "col14    		".trim(), ""));
			model.setCol15    	(JSPUtil.getParameter(request, "col15    		".trim(), ""));
			model.setCol16    	(JSPUtil.getParameter(request, "col16    		".trim(), ""));
			model.setCol17    	(JSPUtil.getParameter(request, "col17    		".trim(), ""));
			model.setCol18    	(JSPUtil.getParameter(request, "col18    		".trim(), ""));
			model.setCol19    	(JSPUtil.getParameter(request, "col19    		".trim(), ""));
			model.setCol20    	(JSPUtil.getParameter(request, "col20    		".trim(), ""));
			model.setCol21    	(JSPUtil.getParameter(request, "col21    		".trim(), ""));
			model.setCol22    	(JSPUtil.getParameter(request, "col22    		".trim(), ""));
			model.setCol23    	(JSPUtil.getParameter(request, "col23    		".trim(), ""));
			model.setCol24    	(JSPUtil.getParameter(request, "col24    		".trim(), ""));
			model.setCol25    	(JSPUtil.getParameter(request, "col25    		".trim(), ""));
			model.setCol26    	(JSPUtil.getParameter(request, "col26    		".trim(), ""));
			model.setCol27    	(JSPUtil.getParameter(request, "col27    		".trim(), ""));
			model.setCol28    	(JSPUtil.getParameter(request, "col28    		".trim(), ""));
			model.setCol29    	(JSPUtil.getParameter(request, "col29    		".trim(), ""));
			model.setCol30    	(JSPUtil.getParameter(request, "col30    		".trim(), ""));
			model.setCol31    	(JSPUtil.getParameter(request, "col31    		".trim(), ""));
			model.setCol32    	(JSPUtil.getParameter(request, "col32    		".trim(), ""));
			model.setCol33    	(JSPUtil.getParameter(request, "col33    		".trim(), ""));
			model.setCol34    	(JSPUtil.getParameter(request, "col34    		".trim(), ""));
			model.setCol35    	(JSPUtil.getParameter(request, "col35    		".trim(), ""));
			model.setCol36    	(JSPUtil.getParameter(request, "col36    		".trim(), ""));
			model.setCol37    	(JSPUtil.getParameter(request, "col37    		".trim(), ""));
			model.setCol38    	(JSPUtil.getParameter(request, "col38    		".trim(), ""));
			model.setCol39    	(JSPUtil.getParameter(request, "col39    		".trim(), ""));
			model.setCol40    	(JSPUtil.getParameter(request, "col40    		".trim(), ""));
			model.setCol41    	(JSPUtil.getParameter(request, "col41    		".trim(), ""));
			model.setCol42    	(JSPUtil.getParameter(request, "col42    		".trim(), ""));
			model.setCol43    	(JSPUtil.getParameter(request, "col43    		".trim(), ""));
			model.setCol44    	(JSPUtil.getParameter(request, "col44    		".trim(), ""));
			model.setCol45    	(JSPUtil.getParameter(request, "col45    		".trim(), ""));
			model.setCol46    	(JSPUtil.getParameter(request, "col46    		".trim(), ""));
			model.setCol47    	(JSPUtil.getParameter(request, "col47    		".trim(), ""));
			model.setCol48    	(JSPUtil.getParameter(request, "col48    		".trim(), ""));
			model.setCol49    	(JSPUtil.getParameter(request, "col49    		".trim(), ""));
			model.setCol50    	(JSPUtil.getParameter(request, "col50    		".trim(), ""));
			model.setCol51    	(JSPUtil.getParameter(request, "col51    		".trim(), ""));
			model.setCol52    	(JSPUtil.getParameter(request, "col52    		".trim(), ""));
			model.setCol53    	(JSPUtil.getParameter(request, "col53    		".trim(), ""));
			model.setCol54    	(JSPUtil.getParameter(request, "col54    		".trim(), ""));
			model.setCol55    	(JSPUtil.getParameter(request, "col55    		".trim(), ""));
			model.setCol56    	(JSPUtil.getParameter(request, "col56    		".trim(), ""));
			model.setCol57    	(JSPUtil.getParameter(request, "col57    		".trim(), ""));
			model.setCol58    	(JSPUtil.getParameter(request, "col58    		".trim(), ""));
			model.setCol59    	(JSPUtil.getParameter(request, "col59    		".trim(), ""));
			model.setCol60    	(JSPUtil.getParameter(request, "col60    		".trim(), ""));
			model.setCol61    	(JSPUtil.getParameter(request, "col61    		".trim(), ""));
			model.setCol62    	(JSPUtil.getParameter(request, "col62    		".trim(), ""));
			model.setCol63    	(JSPUtil.getParameter(request, "col63    		".trim(), ""));
			model.setCol64    	(JSPUtil.getParameter(request, "col64    		".trim(), ""));
			model.setCol65    	(JSPUtil.getParameter(request, "col65    		".trim(), ""));
			model.setCol66    	(JSPUtil.getParameter(request, "col66    		".trim(), ""));
			model.setCol67    	(JSPUtil.getParameter(request, "col67    		".trim(), ""));
			model.setCol68    	(JSPUtil.getParameter(request, "col68    		".trim(), ""));
			model.setCol69    	(JSPUtil.getParameter(request, "col69    		".trim(), ""));
			model.setCol70    	(JSPUtil.getParameter(request, "col70    		".trim(), ""));
			model.setCol71    	(JSPUtil.getParameter(request, "col71    		".trim(), ""));
			model.setCol72    	(JSPUtil.getParameter(request, "col72    		".trim(), ""));
			model.setCol73    	(JSPUtil.getParameter(request, "col73    		".trim(), ""));
			model.setCol74    	(JSPUtil.getParameter(request, "col74    		".trim(), ""));
			model.setCol75    	(JSPUtil.getParameter(request, "col75    		".trim(), ""));
			model.setCol76    	(JSPUtil.getParameter(request, "col76    		".trim(), ""));
			model.setCol77    	(JSPUtil.getParameter(request, "col77    		".trim(), ""));
			model.setCol78    	(JSPUtil.getParameter(request, "col78    		".trim(), ""));
			model.setCol79    	(JSPUtil.getParameter(request, "col79    		".trim(), ""));
			model.setCol80    	(JSPUtil.getParameter(request, "col80    		".trim(), ""));
			model.setCol81    	(JSPUtil.getParameter(request, "col81    		".trim(), ""));
			model.setCol82    	(JSPUtil.getParameter(request, "col82    		".trim(), ""));
			model.setCol83    	(JSPUtil.getParameter(request, "col83    		".trim(), ""));
			model.setCol84    	(JSPUtil.getParameter(request, "col84    		".trim(), ""));
			model.setCol85    	(JSPUtil.getParameter(request, "col85    		".trim(), ""));
			model.setCol86    	(JSPUtil.getParameter(request, "col86    		".trim(), ""));
			model.setCol87    	(JSPUtil.getParameter(request, "col87    		".trim(), ""));
			model.setCol88    	(JSPUtil.getParameter(request, "col88    		".trim(), ""));
			model.setCol89    	(JSPUtil.getParameter(request, "col89    		".trim(), ""));
			model.setCol90    	(JSPUtil.getParameter(request, "col90    		".trim(), ""));
			model.setCol91    	(JSPUtil.getParameter(request, "col91    		".trim(), ""));
			model.setCol92    	(JSPUtil.getParameter(request, "col92    		".trim(), ""));
			model.setCol93    	(JSPUtil.getParameter(request, "col93    		".trim(), ""));
			model.setCol94    	(JSPUtil.getParameter(request, "col94    		".trim(), ""));
			model.setCol95    	(JSPUtil.getParameter(request, "col95    		".trim(), ""));
			model.setCol96    	(JSPUtil.getParameter(request, "col96    		".trim(), ""));
			model.setCol97    	(JSPUtil.getParameter(request, "col97    		".trim(), ""));
			model.setCol98    	(JSPUtil.getParameter(request, "col98    		".trim(), ""));
			model.setCol99    	(JSPUtil.getParameter(request, "col99    		".trim(), ""));
		} catch (Exception ex) {
			//throw new Exception(ex.getMessage());
		}
		return model;
	}
	/**
	 * @param request
	 * @param length
	 * @return
	 */
	public static Collection fromRequest(HttpServletRequest request, int length) {
		TEMP_CSV model = null;
		Collection models = new ArrayList();
		try {
			String[] ibflag    =  (JSPUtil.getParameter(request, "ibflag   		".trim(), length));
			String[] page_rows =  (JSPUtil.getParameter(request, "page_rows		".trim(), length));
			String[] csv_id    =  (JSPUtil.getParameter(request, "csv_id   		".trim(), length));

			for (int i = 0; i < length; i++) {
				model = new TEMP_CSV();
				model.setPage_rows		  (page_rows	[i]);
				model.setCsv_id   		  (csv_id   	[i]);

				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}
	/**
	 * @param request
	 * @param prefix
	 * @return
	 */
	public static Collection fromRequestGrid(HttpServletRequest request, String prefix) {
		TEMP_CSV model = null;
		Collection models = new ArrayList();
		int length = request.getParameterValues("ibflag").length;
		try {
			String[] ibflag    =  (JSPUtil.getParameter(request, prefix + "ibflag   		".trim(), length));
			String[] page_rows =  (JSPUtil.getParameter(request, prefix + "page_rows		".trim(), length));
			String[] csv_id    =  (JSPUtil.getParameter(request, prefix + "csv_id   		".trim(), length));

			for (int i = 0; i < length; i++) {
				model = new TEMP_CSV();
				model.setPage_rows		  ( page_rows	[i]);
				model.setCsv_id   		  ( csv_id   	[i]);

				models.add(model);
			}
		} catch (Exception ex) {
		}
		return models;
	}

	/** (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		StringBuffer ret = new StringBuffer();
		Field[] field = this.getClass().getDeclaredFields();
		String space="                              ";
		try {
			for (int i = 0; i < field.length; i++) {
				String[] arr=null;
				try {
					arr = (String[]) field[i].get(this);
				}catch(Exception ex) {
					arr=new String[1];
					arr[0]=String.valueOf(field[i].get(this));
				}
				if (arr != null) {
					for (int j = 0; j < arr.length; j++) {
						ret.append(field[i].getName().concat(space).substring(0,30).concat("= ") + arr[j] +"\n");
					}
				} else {
					ret.append(field[i].getName() + " =  null \n");
				}
			}
		} catch (Exception ex) {}
		return ret.toString();
	}

}
