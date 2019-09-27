package in.lti.day4;

import util.ExcelReader;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

public class excelreader extends ExcelReader {



public excelreader(String path) throws FileNotFoundException, IOException {
		super(path);
		// TODO Auto-generated constructor stub
	}

@Test
  public void f() throws FileNotFoundException, IOException {
	ExcelReader ex=new ExcelReader(".//Book2.xlsx");
/*	for(int i=0;i<=ex.getRowNum("Sheet1");i++) {
		System.out.println(ex.getAllData("sheet1", i, 1));
	}*/
	String A[][]=ex.getAllData("Sheet1", 4, 2);
	for(int i=0;i<A.length;i++) //reading row
	{
		for(int j=0;j<A[0].length;j++) //reading col
		{
			System.out.println(A[i][j]+" ");
		}
		System.out.println();
	}
	
  }
}
