package demo;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
import java.io.FileInputStream;
 
public class ExcelRowAndColumnCount
{
   public static void main(String args[]) throws Exception
   {
	   try
   {
       FileInputStream fis = new FileInputStream("D:\\data.xlsx");
       
       XSSFWorkbook workbook = new XSSFWorkbook(fis);
       
       XSSFSheet sheet = workbook.getSheet("Sheet");
       
       XSSFRow row = sheet.getRow(0);
       
     //Get the Last ROW and Column number  
       int lastRow = sheet.getLastRowNum();
       
       XSSFRow  titleRow = sheet.getRow(0);
       int lastCol = titleRow.getLastCellNum();
       
       System.out.println("Total Number of Columns in the excel is : "+lastRow);
   
       System.out.println("Total Number of Rows in the excel is : "+lastCol);
   }
   
   catch(Exception e)
   {System.out.println("exception handled ");
   }
   }
}