package handlingExcelFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteTheDataInExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("./data/TextData1.xlsx");//make the excel file ready for read operation
		Workbook wb=WorkbookFactory.create(fis);//make the excel file ready for read operation
		Sheet sh=wb.getSheet("City");//go to the row
		
		Row row=sh.getRow(2);
		
		org.apache.poi.ss.usermodel.Cell cell=row.createCell(1);//make the cell ready for write operation
		cell.setCellValue("xyz");//set cell data
		
		
		FileOutputStream fos=new FileOutputStream("./data/TextData1.xlsx");//go to the file in which we need to write the data
		wb.write(fos);//write the data
		wb.close();
	}

}

