package wrappers;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import utils.DataInputProvider;

public class Annotations {
	public static ChromeDriver driver;
	public String excelFileName;
	
	@BeforeMethod
	public void login() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
	
	@DataProvider(name="fetchData")
	public String[][] getData() throws InvalidFormatException, IOException{
		return DataInputProvider
				.readExcel(excelFileName);
	}
	
	
	
	
	
	
	
	
	
	

}
