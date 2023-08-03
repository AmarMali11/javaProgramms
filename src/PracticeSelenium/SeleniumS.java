package PracticeSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumS {


	public static void main(String[] args) 

	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		WebElement login = driver.findElement(By.xpath("ebdkjbew"));
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		
		
		
		
		
	}}
