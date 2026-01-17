package ReadExcelData;

import Library.ExcelDataConfig;

public class readExcelData {

	public static void main(String[] args) {
		
		ExcelDataConfig obj1 = new ExcelDataConfig("D:\\TestData.xlsx");
		System.out.println(obj1.getData(1, 0, 1));
	}
}
