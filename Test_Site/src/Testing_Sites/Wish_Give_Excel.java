package Testing_Sites;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Wish_Give_Excel {
	
	XSSFWorkbook wb;
	XSSFSheet sheet1;
	
	public Wish_Give_Excel(String epath) {
		
		File src = new File(epath);
		try {
			FileInputStream fis = new FileInputStream(src);
			
			wb = new XSSFWorkbook(fis);			
			
		} catch (Exception e)
		
		{
			
       System.out.println(e.getMessage());		

		
		}
		
		
	}
	
	public String passData(int sheetnumber, int row, int column) {
		
		sheet1 = wb.getSheetAt(sheetnumber);// here we got sheetnumber, its stored in sheet1??? yes dahi kar rahi thi now you made
		// object of worksheer which is sheet1 to usko use karke value nikalo, here data will get from sheet1 na yes only row column nd value nayes
		// dehowe have to get data from where sheet right to kaun help karega sheet1 na not wb , wb is for workbook na
		//ok
		
		String Data = sheet1.getRow(row).getCell(column).getStringCellValue();
		
		return Data;	
		
	}
	
	public int getrowCount() {
	
		int row = wb.getSheetAt(0).getLastRowNum();
		System.out.println("last rw"+row);
		row = row+1;
		// on min 
		return row;
		
	}
	
	/*public int getrowCount(int sheetindex) {
		int row = wb.getSheetAt(sheetindex).getLastRowNum();
		row = row+1;
		
		return row;
		 
		path me issue hai
		
	}*/

}
