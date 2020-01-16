package com.bridgelabz.facebook.generics;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FacebookLibrary implements AutoConstant {
    public static Workbook workbook;
    public static String getProperty(String CONFIG_PATH, String key){
        String property = "";
        Properties properties = new Properties();

        try {
            properties.load(new FileInputStream(CONFIG_PATH));
            property = properties.getProperty(key);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return property;
    }
    public static int getRowCount(String EXCEL_PATH,String sheet){
        int rowCount = 0;
        try {
            workbook = WorkbookFactory.create(new FileInputStream(EXCEL_PATH));
            rowCount = workbook.getSheet(sheet).getLastRowNum();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return rowCount;
    }
    public static String getCellValue(String EXCEL_PATH,String sheet,int row, int column){
        String value ="";
        try {
            workbook=WorkbookFactory.create(new FileInputStream(EXCEL_PATH));
            value = workbook.getSheet(sheet).getRow(row).getCell(column).toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return value;
    }
}
