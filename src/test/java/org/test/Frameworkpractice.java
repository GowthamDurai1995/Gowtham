package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Frameworkpractice {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\Admin\\eclipse-workspace\\frameworkclassone\\Excel\\Datas.xlsx");
		FileInputStream Stream =new FileInputStream(file);
		@SuppressWarnings("resource")
		Workbook workbook = new XSSFWorkbook(Stream);
		Sheet sheet = workbook.getSheet("Datas");
//		Row row = sheet.getRow(3);
//		Cell cell = row.getCell(6);
//		System.out.println(cell);
		
// To print the rows count		
//		int count = sheet.getPhysicalNumberOfRows();
//		System.out.println(count);
//		
// To print the cells count
//		Row row1 = sheet.getRow(4);
//		int count1 = row1.getPhysicalNumberOfCells();
//		System.out.println(count1);
// To print all cell numbers using for loop
		
//		for (int i = 0; i < row.getPhysicalNumberOfCells(); i++) {
//			Cell cell = row.getCell(i);
//			System.out.println(cell);
// To print all rows cells values using nested for loop
			for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
				Row row = sheet.getRow(i);
				for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
					Cell cell = row.getCell(j);
					System.out.println(cell);	
				}
				
			}
			
		}
		
	}


