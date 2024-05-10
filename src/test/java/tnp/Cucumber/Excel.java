package tnp.Cucumber;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Excel {
	static XSSFWorkbook wb;
	static File file;
	public Excel() throws Exception {
		File file=new File("C:\\Users\\91934\\Downloads\\cns\\Book10.xlsx");
		FileInputStream fis=new FileInputStream(file);
	 wb= new XSSFWorkbook(fis);
	}
	public int rowCount(String sheetname) {
		 return wb.getSheet(sheetname).getLastRowNum();
	}
	//col count
	public int colCount(String sheetname,int row) {
		return wb.getSheet(sheetname).getRow(row).getLastCellNum();
	}
	//Read the data from excel file
		public static String getData(String sheetname,int row,int column) {
		
			
			
		return wb.getSheet(sheetname).getRow(row).getCell(column).getStringCellValue();
		
			
		}
		public static void setData(String sheetName,int row,int column,String status) throws IOException {
			XSSFSheet sh=wb.createSheet(sheetName);
			 Row rownum=sh.createRow(row);
			Cell cell=rownum.createCell(column);
			cell.setCellValue(status);
			
			FileOutputStream fos=new FileOutputStream("C:\\Users\\91934\\Downloads\\cns\\Book10Output.xlsx");
			wb.write(fos);
		
			
		}
}
