package fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadWithoutEmptySpaces {
	
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
		 fis=new FileInputStream("C:\\JARS\\FileAssignment.xlsx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		XSSFWorkbook wb=null;
		try {
			wb = new XSSFWorkbook(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	XSSFSheet ws=	wb.getSheet("Civil");
	    XSSFRow row=null;
	    XSSFCell cell=null;
		for(int i=0;i<=ws.getLastRowNum();i++) {
			if(ws.getRow(i)!=null) {
				row=ws.getRow(i);
			}
			for(int j=0;j<row.getLastCellNum();j++) {
				if(row.getCell(j)!=null) {
					cell=row.getCell(j);
				}
				if(cell.getCellType()==CellType.STRING) {
					System.out.println(cell+" is a String");
				}
				else if(cell.getCellType()==CellType.NUMERIC) {
					System.out.println(cell +" is a number");
				}
				else if(cell.getCellType()==CellType.BOOLEAN) {
					System.out.println(cell +" is a boolean");
				}
			}
		}
		
	}

}
