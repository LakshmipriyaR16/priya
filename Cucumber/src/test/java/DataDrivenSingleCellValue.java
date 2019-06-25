import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenSingleCellValue {
	
	public static String getDataFromExcelSheet(int rownum, int cellnum) throws Throwable {
File xl=new File("C:\\Users\\Gautham\\Desktop\\ddf.xlsx");
		
		FileInputStream fin=new FileInputStream(xl);
		
		Workbook wb=new XSSFWorkbook(fin);
		
		Sheet sheetAt = wb.getSheetAt(0);
		
	Cell cell = sheetAt.getRow(rownum).getCell(cellnum);
	String value=null;
	CellType cellType = cell.getCellType();
	if(cellType.equals(cellType.STRING)) {
		 String value2 = cell.getStringCellValue();
		System.out.println(value2);
	}else if(cellType.equals(cellType.NUMERIC)) {
		double d = cell.getNumericCellValue();
		long l=(long)d;
		String valueOf = String.valueOf(l);
		System.out.println(valueOf);
	}
	return value;
	}

	public static void main(String[] args) throws Throwable {
		String dataFromExcelSheet = getDataFromExcelSheet(1,2);
		System.out.println(dataFromExcelSheet);
	}

}
