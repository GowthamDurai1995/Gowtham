package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateNewSheetWrite {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\Admin\\eclipse-workspace\\frameworkclassone\\Excel\\Datas.xlsx");
		FileInputStream fin = new FileInputStream(f);
		@SuppressWarnings("resource")
		Workbook w = new XSSFWorkbook(fin);
		Sheet c = w.createSheet("sample");
		Row r = c.createRow(2);
		Cell d = r.createCell(1);
		d.setCellValue("Gowtham");
		FileOutputStream fout = new FileOutputStream(f);
		w.write(fout);
		System.out.println("Done......");
		
	}
}
