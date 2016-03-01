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
public class ExcelFileUtility {

    private static final String FILE_PATH = "/Users/skallem/Desktop/Non_exmt_items.xlsx";

    public ExcelWorkBook getSellerListFromExcel() {
    	ExcelWorkBook excelWorkBook = new ExcelWorkBook();
        List<ExcelSheet1Row> sellers1 = new ArrayList<ExcelSheet1Row>();
        List<ExcelSheet2Row> sellers2 = new ArrayList<ExcelSheet2Row>();
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

                    	ExcelSheet1Row seller = new ExcelSheet1Row();
                        Row row = rowIterator.next();
                        Iterator<Cell> cellIterator = row.cellIterator();

                        //Iterating over each cell (column wise)  in a particular row.
                        while (cellIterator.hasNext()) {

                            Cell cell = cellIterator.next();
                            String cellValue = null;
                            if (Cell.CELL_TYPE_STRING == cell.getCellType()) {
                            	cellValue = cell.getStringCellValue();
                            } else if(Cell.CELL_TYPE_NUMERIC == cell.getCellType()){
                            	cellValue = String.valueOf(cell.getNumericCellValue());
                            }
                            if (cell.getColumnIndex() == 0) {
                            	int number = Double.valueOf(cellValue).intValue();
                            	seller.setSellerId(String.valueOf(number));
                            }
                            else if (cell.getColumnIndex() == 1) {
                            	seller.setPartnerName(cellValue);
                            }
                            else if (cell.getColumnIndex() == 2) {
                            	seller.setPartnerDisplayName(cellValue);
                            }
                            else if (cell.getColumnIndex() == 3) {
                            	int number = Double.valueOf(cellValue).intValue();
                            	seller.setPartnerId(String.valueOf(number));
                            }
                        }
                        //end iterating a row, add all the elements of a row in list
                        sellers1.add(seller);
                    }
                }
                if(i==1 ){
                	//iterating over each row
                    while (rowIterator.hasNext()) {

                    	ExcelSheet2Row seller = new ExcelSheet2Row();
                        Row row = rowIterator.next();
                        Iterator<Cell> cellIterator = row.cellIterator();

                        //Iterating over each cell (column wise)  in a particular row.
                        while (cellIterator.hasNext()) {

                            Cell cell = cellIterator.next();
                            String cellValue = null;
                            if (Cell.CELL_TYPE_STRING == cell.getCellType()) {
                            	cellValue = cell.getStringCellValue();
                            } else if(Cell.CELL_TYPE_NUMERIC == cell.getCellType()){
                            	cellValue = String.valueOf(cell.getNumericCellValue());
                            }
                            if (cell.getColumnIndex() == 0) {
                            	int number = Double.valueOf(cellValue).intValue();
                            	seller.setCatalogSellerId(String.valueOf(number));
                            }
                            else if (cell.getColumnIndex() == 1) {
                            	seller.setSellerName(cellValue);
                            }
                            else if (cell.getColumnIndex() == 2) {
                            	int number = Double.valueOf(cellValue).intValue();
                            	seller.setPartnerId(String.valueOf(number));
                            }
                            else if (cell.getColumnIndex() == 3) {
                            	seller.setSellerNexusId(cellValue);
                            }
                        }
                        //end iterating a row, add all the elements of a row in list
                        sellers2.add(seller);
                    }
                }
                
            }
            excelWorkBook.setSheet1(sellers1);
            excelWorkBook.setSheet2(sellers2);
            fis.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return excelWorkBook;
    }
}
