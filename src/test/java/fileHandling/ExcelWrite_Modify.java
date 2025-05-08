package fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite_Modify {
	

	public static void main(String[] args) {
		ExcelWrite_Modify write=new ExcelWrite_Modify();
		 XSSFWorkbook workbook = null;
		 FileInputStream fis=null;
		 FileOutputStream fos=null;
		try {
			fis=new FileInputStream("C:\\JARS\\fileAssignment.xlsx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		  try {
			workbook = new XSSFWorkbook(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   XSSFSheet workSheet= workbook.getSheet("Sheet1");
		   workSheet.getRow(0).getCell(0).setCellValue("Excel");
		  try {
			 fos= new FileOutputStream("C:\\JARS\\fileAssignment.xlsx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		  try {
			workbook.write(fos);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  //workbook.close();
	}

}
