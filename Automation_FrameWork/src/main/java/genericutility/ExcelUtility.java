package genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

	/*
	 * @author : Naveen K Pathak
	 */

public class ExcelUtility {
	
	/*
	 *	This method is used to read string data from excel
	 *	user must pass sheetName, rowIndex, columnIndex
	 *	@param sheetName
	 *	@param rowIndex
	 *	@param columnIndex
	 *	@return String
	 *	@throws EncryptedDocumentException
	 *	@throws IOException
	 */
	
	public String getStringDataFromExcel(String sheetname, int rowIndex, int colIndex) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/testData/testScriptData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);		
		return workbook.getSheet(sheetname).getRow(rowIndex).getCell(colIndex).getStringCellValue();   
	}
	
	/*
	 *	This method is used to read Numaric data from excel
	 *	user must pass sheetName, rowIndex, columnIndex
	 *	@param sheetName
	 *	@param rowIndex
	 *	@param columnIndex
	 *	@return double
	 *	@throws EncryptedDocumentException
	 *	@throws IOException
	 */
	public double getNumaricDataFromExcel(String sheetname, int rowIndex, int colIndex) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/testData/testScriptData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		return workbook.getSheet(sheetname).getRow(rowIndex).getCell(colIndex).getNumericCellValue();
	}
	/*
	 *	This method is used to read BooleanData from excel
	 *	user must pass sheetName, rowIndex, columnIndex
	 *	@param sheetName
	 *	@param rowIndex
	 *	@param columnIndex
	 *	@return Boolean
	 *	@throws EncryptedDocumentException
	 *	@throws IOException
	 */
	public boolean getBooleanDataFromExcel(String sheetname, int rowIndex, int colIndex) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/testData/testScriptData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		return workbook.getSheet(sheetname).getRow(rowIndex).getCell(colIndex).getBooleanCellValue();
	}
	/*
	 *	This method is used to read Local Date Time from excel
	 *	user must pass sheetName, rowIndex, columnIndex
	 *	@param sheetName
	 *	@param rowIndex
	 *	@param columnIndex
	 *	@return LocalDateTime
	 *	@throws EncryptedDocumentException
	 *	@throws IOException
	 */
	public LocalDateTime getDataFromExcel(String sheetname, int rowIndex, int colIndex) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/testData/testScriptData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		return workbook.getSheet(sheetname).getRow(rowIndex).getCell(colIndex).getLocalDateTimeCellValue();
	}

}
