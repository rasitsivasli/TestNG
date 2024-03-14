package utilities;

import com.github.javafaker.Faker;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataProviderBase {
    static FileInputStream fis = null;
    Workbook wb = null;
    @DataProvider
    public String[] dataName() throws IOException {
        String path = "C:\\Users\\sivas\\IdeaProjects\\TestNG\\src\\test\\java\\resources\\PersonalInfo.xlsx";
        //Open the workbook using file
        FileInputStream fis = new FileInputStream(path);
        Workbook wb = WorkbookFactory.create(fis);
        Sheet sheet1 = wb.getSheet("Sayfa1");

        String[] names = new String[5];

        for (int i = 1; i <= 5; i++) {
            names[i-1]= sheet1.getRow(i).getCell(0).toString();
            System.out.print(names + " ");
        }
        return names;

    }
    @DataProvider
    public Object[][] fakerData(){
        String [][] fullname=new String[5][];
        for (int i = 0; i <5 ; i++) {
            fullname[i]= new String[]{Faker.instance().name().name(), Faker.instance().name().lastName()};
        }
        return fullname;

    }

    @DataProvider
    public String[][] dataFullName() throws IOException {
        String path = "C:\\Users\\sivas\\IdeaProjects\\TestNG\\src\\test\\java\\resources\\PersonalInfo.xlsx";
        FileInputStream fis = new FileInputStream(path);
        Workbook wb = WorkbookFactory.create(fis);
        Sheet sheet1 = wb.getSheet("Sayfa1");
        String[][] names = new String[5][];

        for (int i = 0; i < 5; i++) {
            names[i]= new String[]{sheet1.getRow(i).getCell(0).toString(),
                    sheet1.getRow(i).getCell(1).toString()};
            System.out.print(names + " ");

        }
        return names;

    }
    @DataProvider
    public static Object[][] getdataHW35() {
        return new Object[][]{{"clarusway@gmail.com", "123456789"}};
    }
}
