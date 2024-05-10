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
public class WriteData {

	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Users\\91934\\Downloads\\cns\\Book10.xlsx");
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sh=wb.getSheet("Vaishnav");
//		sh.createRow(0).createCell(3).setCellValue("Location");
//		sh.createRow(1).createCell(2).setCellValue(2);
//		sh.createRow(2).createCell(2).setCellValue(34);
		sh.createRow(3).createCell(3).setCellValue(96);
		sh.createRow(4).createCell(4).setCellValue(149);
		sh.createRow(5).createCell(5).setCellValue(87);
		FileOutputStream fos=new FileOutputStream("C:\\Users\\91934\\Downloads\\cns\\Book10Output.xlsx");
		wb.write(fos);

	}

}
