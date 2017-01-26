/**
 * 
 */
package excel.utility;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author skallem
 *
 */
public class GSCCodesQueryGenerator {
	 
	  public static void main( String[] args ){
	 
	    	InputStream input = null;
	    	
	    	try {
	    		SamsGscCodesUtility excelUtility = new SamsGscCodesUtility();
	    		List<String> excelItems = excelUtility.getGscCodes();

	    		int size = 0;
	    		String index = "cust_attr_key_value_map_id_seq.nextval";
	    			for (String exmtItem : excelItems) {
	    			size++;
//	    			index++;
	    			System.out.println("Insert into cust_attr_key_value_map (CUST_ATTR_KEY_VALUE_MAP_ID,KEY,VALUE,CREATED_BY,"
	    					+ "CREATED_DATE,UPDATED_BY,UPDATED_DATE,TAX_RULE_CRIT_CUSTOM_ATTR_ID,CACHE_REFRESH_ID) ");
	    			System.out.println("values (" + index + ",'" + exmtItem + "',null,'Admin',to_timestamp('25-JUL-16 07.23.20.299000000 PM','DD-MON-RR HH.MI.SS.FF AM'),'Admin',"
	    					+ "to_timestamp('25-JUL-16 07.23.20.299000000 PM','DD-MON-RR HH.MI.SS.FF AM'),80091137,null" + ");");
	    		}
    		    System.out.println("Size of the Items added:" + size);
	    	} finally{
	        	if(input!=null){
	        		try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
	        	}
	        }
	 
	    }
}
