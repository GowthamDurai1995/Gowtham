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

public class ExcelWrite {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\Admin\\eclipse-workspace\\frameworkclassone\\Excel\\Datas.xlsx");
		FileInputStream fin = new FileInputStream(f);
		@SuppressWarnings("resource")
		Workbook W = new XSSFWorkbook(fin);
		Sheet s = W.getSheet("Datas");
		Row r = s.getRow(4);
		Cell c = r.getCell(1);
		c.setCellValue("Ganesh");
		FileOutputStream fout = new FileOutputStream(f);
		W.write(fout);
		System.out.println("Done.....");
	}

}
