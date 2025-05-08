package fileHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.Serializable;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.microsoft.schemas.office.visio.x2012.main.CellType;

public class ExcelRead1 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis1 = new FileInputStream("C:\\JARS\\FileAssignment.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis1);
		XSSFSheet ws = wb.getSheet("Sheet1");
		int lastRowNum = ws.getLastRowNum();
		System.out.println(lastRowNum);
		System.out.println(ws.getPhysicalNumberOfRows());

		XSSFRow row = ws.getRow(0);
		int lastCellNum = row.getLastCellNum();
		System.out.println("lastCellInARow:" + lastCellNum);
		int totalCells = row.getPhysicalNumberOfCells();
		System.out.println("Total Physicalcells in a row: " + totalCells);
		XSSFCell cell = row.getCell(0);
		System.out.println(cell);
		Object cellType = cell.getCellType();
		System.out.println(cellType);
		wb.close();
	}

}
