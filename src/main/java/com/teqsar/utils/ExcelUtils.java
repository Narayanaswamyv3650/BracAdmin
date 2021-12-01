package com.teqsar.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.teqsar.Exceptions.FramWorkException;
import com.teqsar.Exceptions.InvalidPathForExcelException;
import com.teqsar.constrans.FrameWorkConstants;

public final class ExcelUtils {

	private ExcelUtils() {

	}

	public static List<Map<String, String>> getTestDetails(String sheetname){

		List<Map<String,String>>  list=null;

		try(FileInputStream fs=new FileInputStream(FrameWorkConstants.getExcelpath())) {
			XSSFWorkbook workbook=new XSSFWorkbook(fs);
			XSSFSheet sheet =workbook.getSheet(sheetname);
			int lastrownum=sheet.getLastRowNum();
			int lastcolumnnum=sheet.getRow(0).getLastCellNum();

			Map<String,String>map=null;
			list =new ArrayList<Map<String, String>>();
			for(int i=1;i<=lastrownum;i++) {
				map=new HashMap<String, String>();
				for(int j=0;j<lastcolumnnum;j++) {

					String key=sheet.getRow(0).getCell(j).getStringCellValue();
					//String value=sheet.getRow(i).getCell(j).getStringCellValue();
					DataFormatter formatter = new DataFormatter();
					String value = formatter.formatCellValue(sheet.getRow(i).getCell(j));
					//System.out.println("Test Data From Excel " + value);

					map.put(key, value);
				}
				list.add(map);
			}
		} catch(FileNotFoundException e){		
			throw new InvalidPathForExcelException("Excel sheet not found");
		} catch(IOException e1) {
			throw new FramWorkException("IO execption happen while reading Excel");

		}
		return list;

	}
}
