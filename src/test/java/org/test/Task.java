package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Task {
	public static void main(String[] args) throws IOException {

		File file = new File("C:\\Users\\Admin\\eclipse-workspace\\frameworkclassone\\Excel\\Datas.xlsx");

		FileInputStream Stream = new FileInputStream(file);
		@SuppressWarnings("resource")
		Workbook workbook = new XSSFWorkbook(Stream);
		Sheet sheet = workbook.getSheet("Datas");
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				CellType type = cell.getCellType();

				switch (type) {
				case STRING:
					String name = cell.getStringCellValue();
					System.out.println(cell + ":" + name);
					break;
				case NUMERIC:
					// double d = cell.getNumericCellValue();
					// BigDecimal b = BigDecimal.valueOf(d);
					// String data = b.toString();
					// System.out.println(data);
					if (DateUtil.isCellDateFormatted(cell)) {
						Date dateCellValue = cell.getDateCellValue();
						SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
						String format = dateFormat.format(dateCellValue);
						System.out.println(cell + ":" + format);

					} else {
						double d = cell.getNumericCellValue();
						BigDecimal b = BigDecimal.valueOf(d);
						String data = b.toString();
						System.out.println(cell + " : " + data);

					}

					break;

				default:
					break;
				}
			}
			System.out.println("---------------------------------------");
		}
	}
}