package zz;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Excel {
	 XSSFWorkbook wb;
	static File file;
	public Excel() throws Exception {
		File file=new File("C:\\Users\\91934\\Desktop\\A\\Input.xlsx");
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
		public String getData(String sheetname,int row,int column) {
		
			
			
		return wb.getSheet(sheetname).getRow(row).getCell(column).getStringCellValue();
		
			
		}
		public  void setData(String sheetName,int row,int column,String status) throws IOException {
			XSSFSheet sh=wb.getSheet(sheetName);
			 Row rownum=sh.createRow(row);
			Cell cell=rownum.createCell(column);
			cell.setCellValue(status);
			if(status.equalsIgnoreCase("Pass")) {
				XSSFCellStyle style = wb.createCellStyle();
				XSSFFont font = wb.createFont();
				font.setColor(IndexedColors.GREEN.getIndex());
				style.setFont(font);
				rownum.getCell(column).setCellStyle(style);
			}else if(status.equalsIgnoreCase("FAIL")){
				XSSFCellStyle style = wb.createCellStyle();
				XSSFFont font = wb.createFont();
				font.setColor(IndexedColors.RED.getIndex());
				style.setFont(font);
				rownum.getCell(column).setCellStyle(style);
			}else if(status.equalsIgnoreCase("Not Executed")) {
				XSSFCellStyle style = wb.createCellStyle();
				XSSFFont font = wb.createFont();
				font.setColor(IndexedColors.BLUE.getIndex());
				style.setFont(font);
				rownum.getCell(column).setCellStyle(style);
			}
			
			FileOutputStream fos=new FileOutputStream("C:\\Users\\91934\\Desktop\\A\\Output.xlsx");
			wb.write(fos);
		
			
		}
}
