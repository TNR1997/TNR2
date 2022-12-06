package javaexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TC001 {
	public static void main(String args[])throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/");
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			System.out.println("Application opened");
			Thread.sleep(2000);
			//mouse hover to signin
			Actions ac =new Actions(driver);
			ac.moveToElement(driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span"))).perform();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"nav-flyout-ya-signin\"]/a/span")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("email")).sendKeys("8106296323");
			Thread.sleep(2000);
			driver.findElement(By.id("continue")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("password")).sendKeys("nagesh9026");
			Thread.sleep(2000);
			
			driver.findElement(By.id("signInSubmit")).click();
			Thread.sleep(2000);
			
			//Search for Shirts
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mens l size shirts");
			Thread.sleep(2000);
			driver.findElement(By.id("nav-search-submit-button")).click();
			Thread.sleep(2000);
			//Select Shirt
			driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[7]/div/div/div/div/div[1]/div/span/a/div/img")).click();
			Thread.sleep(2000);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,1000)");
			Thread.sleep(2000);
			Select st=new Select(driver.findElement(By.xpath("//*[@id=\"native_dropdown_selected_size_name\"]")));
			st.selectByIndex(2);
			
			
			
	}

}
