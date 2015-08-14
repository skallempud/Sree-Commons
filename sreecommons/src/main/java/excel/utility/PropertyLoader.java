/**
 * 
 */
package excel.utility;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;
import java.util.UUID;

import org.apache.commons.lang3.StringUtils;

/**
 * @author skallem
 *
 */
public class PropertyLoader {
	 
	  public static void main( String[] args ){
	 
	    	Properties prop = new Properties();
	    	InputStream input = null;
	    	
	    	try {
	    		MPSeller mpSeller;
	    		ExcelFileUtility excelUtility = new ExcelFileUtility();
	    		ExcelWorkBook excelWorkBook = excelUtility.getSellerListFromExcel();
	    		List<ExcelSheet1Row> excelSheet1Rows = excelWorkBook.getSheet1();
	    		List<ExcelSheet2Row> excelSheet2Rows = excelWorkBook.getSheet2();
	    		String filename = "environmentConfig/default/nexus.properties";
	    		input = PropertyLoader.class.getClassLoader().getResourceAsStream(filename);
	    		if(input==null){
	    	            System.out.println("Unable to find " + filename);
	    		    return;
	    		}	 
	    		//load a properties file from class path, inside static method
	    		prop.load(input);
	    		int size = 0;
	    		for (String sellerNexusId : prop.stringPropertyNames()) {
		    		String partnerId = null;
	    			mpSeller = new MPSeller();
					mpSeller.setNexusMapId(StringUtils.upperCase(sellerNexusId));
					mpSeller.setNexusToken(prop.getProperty(sellerNexusId));
					mpSeller.setSellerNexusId(StringUtils.upperCase(sellerNexusId));
	    			for (ExcelSheet2Row excelSheet2Row : excelSheet2Rows) {
						if(sellerNexusId.equalsIgnoreCase(excelSheet2Row.getSellerNexusId())){
							partnerId = excelSheet2Row.getPartnerId();
							mpSeller.setPartnerId(partnerId);
						}
					}
	    			for (ExcelSheet1Row excelSheet1Row : excelSheet1Rows) {
						if(null != partnerId && partnerId.equalsIgnoreCase(excelSheet1Row.getPartnerId())){
							mpSeller.setPartnerDisplayName(excelSheet1Row.getPartnerDisplayName());
							mpSeller.setPartnerName(excelSheet1Row.getPartnerName());
							mpSeller.setSellerId(excelSheet1Row.getSellerId());
						}
					}
	    			size++;
	    			System.out.println("Insert into TAAS.NEXUS_MAP (NEXUS_MAP_PK,CLIENT_ID,TAX_ENGINE,PLUGIN_ID,ENDPOINT_ID,ISO3_COUNTRY_CODE,SELLER_NEXUS_ID,ENGINE_NEXUS_TOKEN,CORRELATION_ID,CONSUMER_ID,DB_LOCK_VERSION,CREATED_DATE,MODIFIED_DATE,MODIFIED_BY,SELLER_ID,PARTNER_NAME,PARTNER_DISPLAY_NAME,PARTNER_ID) ");
	    			System.out.println("values ('" 
							+ mpSeller.getNexusMapId() +"','walmart.com','TWE','TWE83',null,'USD','" + mpSeller.getSellerNexusId() + "','"+ mpSeller.getNexusToken() +"',null,null,0," + "current_timestamp" + "," + "current_timestamp" + ",'TAX_APP','"+ mpSeller.getSellerId() +"','" + mpSeller.getPartnerName() + "','" + mpSeller.getPartnerDisplayName() + "','" + mpSeller.getPartnerId() + "');");
	    		}
    		    System.out.println("Size of the MP sellers on boarded:" + size);
    		    System.out.println(StringUtils.upperCase(UUID.randomUUID().toString().replaceAll("-", "")));
    		    System.out.println(StringUtils.upperCase(UUID.randomUUID().toString().replaceAll("-", "")));
	    	} catch (IOException ex) {
	    		ex.printStackTrace();
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
