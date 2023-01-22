package org.test.hexa;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDatas {
public static void updatecellData(String sheetName,int rowNum,int cellNum, String oldData,String newData) throws IOException {
		
		File file=new File("C:\\Users\\anand\\eclipse-workspace\\FrameWork1stDay\\ExcelDatas\\Worksheet.xlsx");
		FileInputStream fileInputStream=new FileInputStream(file);
		Workbook workbook=new XSSFWorkbook(fileInputStream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rowNum);
		Cell cell = row.getCell(cellNum);
		String value = cell.getStringCellValue();
		if (value.equals(oldData)) {
			cell.setCellValue(newData);
			FileOutputStream fileOutputStream=new FileOutputStream(file);
			workbook.write(fileOutputStream);
			
		}
			
		}
	
		public static void writeCellData(String sheetName,int rowNum,int cellNum, String Data) throws IOException {
			File file=new File("C:\\Users\\anand\\eclipse-workspace\\FrameWork1stDay\\ExcelDatas\\Worksheet.xlsx");
			FileInputStream fileInputStream=new FileInputStream(file);
			Workbook workbook=new XSSFWorkbook(fileInputStream);
			Sheet sheet = workbook.getSheet(sheetName);
			Row row = sheet.getRow(rowNum);
			Cell cell = row.createCell(cellNum);
			cell.setCellValue(Data);
			FileOutputStream fileOutputStream=new FileOutputStream(file);
			workbook.write(fileOutputStream);
			
		}
		public static String getDataFromcell(String sheetName,int rowNum,int cellNum) throws IOException {

			String res=null;
			
			File file=new File("C:\\Users\\anand\\eclipse-workspace\\FrameWork1stDay\\ExcelDatas\\Worksheet.xlsx");
			FileInputStream fileInputStream=new FileInputStream(file);
			Workbook workbook=new XSSFWorkbook(fileInputStream);
			Sheet sheet = workbook.getSheet(sheetName);
			Row row = sheet.getRow(rowNum);
			Cell cell = row.getCell(cellNum);
			CellType type = cell.getCellType();
			switch (type) {
			case STRING:
				res = cell.getStringCellValue();
				break;
			case NUMERIC:
				if (DateUtil.isCellDateFormatted(cell)) {
					Date dateCellValue = cell.getDateCellValue();
					SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MMM-yy");
					res= dateFormat.format(dateCellValue);
					
				} else {
					double numericCellValue = cell.getNumericCellValue();
					long check = Math.round(numericCellValue);
					if (check==numericCellValue) {
						res = String.valueOf(check);
						
					}else{
						
						res = String.valueOf(numericCellValue);
					}
				}
				break;
			default:
				break;
			}
			return res;			
		}		
	}

