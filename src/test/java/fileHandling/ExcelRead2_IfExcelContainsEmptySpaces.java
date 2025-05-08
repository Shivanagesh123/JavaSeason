package fileHandling;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead2_IfExcelContainsEmptySpaces {

	public static void main(String[] args) throws IOException {
		FileInputStream fis1 = new FileInputStream("C:\\JARS\\FILeAssignment.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis1);
		XSSFSheet workSheet = workbook.getSheet("Sheet1");
		XSSFRow row=null;
		XSSFCell cell=null;
		    for(int i=0;i<=workSheet.getLastRowNum();i++) {
		    	if(workSheet.getRow(i)!=null) {
		    		row=workSheet.getRow(i);
		    		
		    	for(int j=0;j<row.getLastCellNum();j++) {
		    		if(row.getCell(j)!=null) {
		    			cell=row.getCell(j);
		    			 
		    			if(cell.getCellType()==CellType.STRING) {
		    				System.out.println(cell + " is a String");
		    			}
		    			else if(cell.getCellType()==CellType.NUMERIC) {
		    				System.out.println(cell +" is a Number");
		    			}
		    			else if(cell.getCellType()==CellType.BOOLEAN) {
		    				System.out.println(cell +" is a boolean ");
		    			}
		    		}
		    	}
		    	}
		    }
		workbook.close();
	}
}