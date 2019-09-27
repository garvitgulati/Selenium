package in.lti.day3;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class writeexcel {
  @Test
  public void f() throws Exception {
		XSSFWorkbook wb=new XSSFWorkbook(new FileInputStream(".\\Book2.xlsx"));
		XSSFSheet sheet=wb.getSheet("Sheet1");
		sheet.getRow(2).getCell(1).setCellValue("LTI");
		sheet.getRow(2).createCell(2).setCellValue("LTI");
		sheet.createRow(5).createCell(2).setCellValue("LTI");
		FileOutputStream op=new FileOutputStream(".\\abc.xlsx");
		wb.write(op);
  }
}
