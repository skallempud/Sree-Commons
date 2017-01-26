package excel.utility;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * @author skallem
 */
public class SamsGscCodesUtility {

    private static final String FILE_PATH = "/Users/skallem/Desktop/GSC_Codes.xlsx";

    public List<String> getGscCodes() {
    	List<String> gscCodes = new ArrayList<String>();
    	FileInputStream fis = null;
        try {
            fis = new FileInputStream(FILE_PATH);

            // Using XSSF for xlsx format, for xls use HSSF
            Workbook workbook = new XSSFWorkbook(fis);

            int numberOfSheets = 1;

            //looping over each workbook sheet
            for (int i = 0; i < numberOfSheets; i++) {
                Sheet sheet = workbook.getSheetAt(i);
                Iterator<Row> rowIterator = sheet.iterator();
                if(i==0 ){
                	
                	//iterating over each row
                    while (rowIterator.hasNext()) {

                        Row row = rowIterator.next();
                        Iterator<Cell> cellIterator = row.cellIterator();

                        //Iterating over each cell (column wise)  in a particular row.
                        while (cellIterator.hasNext()) {

                            Cell cell = cellIterator.next();
                            String cellValue = null;
                            if (Cell.CELL_TYPE_STRING == cell.getCellType()) {
                            	cellValue = cell.getStringCellValue();
                            } else if(Cell.CELL_TYPE_NUMERIC == cell.getCellType()){
                            	cellValue = String.valueOf(cell.getNumericCellValue()).replace(".0", "");
                            }
                            if (cell.getColumnIndex() == 0) {
//                            	int number = Double.valueOf(cellValue).intValue();
                            	gscCodes.add(cellValue);
                            }
                        }
                    }
                }
                
            }
            fis.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return gscCodes;
    }
}
