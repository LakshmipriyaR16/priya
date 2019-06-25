import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DDFOutput {

	public static void main(String[] args) throws IOException {
		setValuesToExcel(10,10,"Lakshmi");
	}
public static void setValuesToExcel(int rowNum,int cellNum,String value) throws IOException {
	File xl=new File("C:\\Users\\Gautham\\Desktop\\ddf.xlsx");
	
	FileInputStream fin=new FileInputStream(xl);
	
	Workbook wb=new XSSFWorkbook(fin);
	
	Sheet sheetAt = wb.getSheetAt(0);
	System.out.println(sheetAt.getPhysicalNumberOfRows());
	Row row = sheetAt.getRow(rowNum);
	if(row==null) {
		row = sheetAt.createRow(rowNum);
			}
	Cell cell = row.getCell(cellNum);
	if(cell==null) {
		cell=row.createCell(cellNum);
	}
	cell.setCellValue(value);
	
	FileOutputStream fout= new FileOutputStream(xl);
	wb.write(fout);
	wb.close();
	System.out.println("Write to excel completed");
	
	
	
	
}
}