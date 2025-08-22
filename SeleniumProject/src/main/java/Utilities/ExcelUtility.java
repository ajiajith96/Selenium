package Utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {

	static FileInputStream f; //to read excel file from system
 	static XSSFWorkbook w; //to represent the entire excel workbook
 	static XSSFSheet sh; //to represent single sheets in excel
  
 	public static String readStringData(int row, int col) throws IOException { 
 		f = new FileInputStream("C:\\Users\\HP\\git\\Maven\\MavenProject\\src\\main\\resources\\Details.xlsx"); //opening the file location
 		w = new XSSFWorkbook(f); //with the help of repository loading to memory file
 		sh = w.getSheet("Sheet1"); //selection of a particular name of sheet
 		XSSFRow r = sh.getRow(row); //row details
 		XSSFCell c = r.getCell(col); //cell details
 		return c.getStringCellValue(); //to return the value in string format
  
 	} 
  
 	public static String readIntegerData(int row, int col) throws IOException { 
 		f = new FileInputStream("C:\\Users\\HP\\git\\Maven\\MavenProject\\src\\main\\resources\\Details.xlsx"); 
 		w = new XSSFWorkbook(f); 
 		sh = w.getSheet("Sheet1"); 
 		XSSFRow r = sh.getRow(row); 
 		XSSFCell c = r.getCell(col); 
 		int val =   (int) c.getNumericCellValue();  //convert double to int using typecasting 
 		return String.valueOf(val);   //convert int to string using valueOf() method 
 		//return val; 
 	}
}
