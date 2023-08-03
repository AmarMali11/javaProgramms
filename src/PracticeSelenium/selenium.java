package PracticeSelenium;

import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v109.emulation.model.DisplayFeature;

public class selenium extends abstractclass2 {
	
	
	public static void main(String[] args) {
	
		
	
System.setProperty("webdriver.chrome.driver","d:\\chromedriver.exe");
		
	WebDriver driver= new ChromeDriver();
	driver.get("https://facebook.com");
	WebElement login=driver.findElement(By.xpath("asdgvjh"));

	
	
	
	}

	@Override
	public void method4() {
		// TODO Auto-generated method stub
		
	}


		
	}


