package BaseClass;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class {

	public static WebDriver driver;

	public static void launch(String url) {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get(url);

	}

	public static void insert(WebElement ele, String text) {

		ele.sendKeys(text);

	}

	public static void click(WebElement ele) {

		ele.click();

	}

	
	
	public static void exit() {

		driver.quit();

	}
	
	public static void selectoption() {
		
		Actions a= new Actions(driver);
		
		
	}
	
	public void select(WebElement ele , String text) {

		
		Select s = new Select(ele);
		
		s.selectByVisibleText(text);
		
	}
	
	

}
