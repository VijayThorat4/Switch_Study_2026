package ReadExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		File src = new File("D:\\TestData.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);           // Class from Apache POI
		
		XSSFSheet sheet1 = wb.getSheetAt(0);
		
		int rowCount = sheet1.getLastRowNum();		
		System.out.println("Total number of rows are " + rowCount); 
		
		for (int i=0; i<rowCount; i++)
		{
			String data0 = sheet1.getRow(i).getCell(0).getStringCellValue();
			System.out.println("Test Data From excel is " + data0);
		}
		
		
		
		wb.close();
		
		
		
	}

}
