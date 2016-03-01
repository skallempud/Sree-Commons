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
public class ExmtPropertyLoader {
	 
	  public static void main( String[] args ){
	 
	    	InputStream input = null;
	    	
	    	try {
	    		EXMTExcelFileUtility excelUtility = new EXMTExcelFileUtility();
	    		List<ExmtItmExcelSheetRow> excelItems = excelUtility.getSellerListFromExcel();

	    		int size = 0;
	    			for (ExmtItmExcelSheetRow exmtItem : excelItems) {
	    			size++;
	    			System.out.println("Insert into NON_EXMT_ITEM (NON_EXMT_ITEM_ID,SUPER_DEPT,CATEGORY,SUB_CAT,ITEM_ID,ITEM_NAME,UPC,DB_LOCK_VERSION,CREATED_DATE,MODIFIED_DATE) ");
	    			System.out.println("values (" 
							+ "SYS_GUID()" + ",'" + exmtItem.getSuperDept() + "','" + exmtItem.getCategory() + "','" + exmtItem.getSubCategory() +
							"','"+ exmtItem.getItemId() + "','" + exmtItem.getItemName() + "','" + exmtItem.getUpc() + "',0," + "current_timestamp" + "," + 
							"current_timestamp" + ");");
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
