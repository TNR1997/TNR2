package javaexamples;

	import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;

	public class TC002 {
		public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(2000);
				Actions ac =new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]"))).build().perform();
		Thread.sleep(2000);
		System.out.println("Mouse hover completed");
		  //sign in
		driver.findElement(By.xpath("//*[@id=\"nav-flyout-ya-signin\"]/a/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("8106296323");
		Thread.sleep(2000);
		driver.findElement(By.id("continue")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("nagesh9026");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
		Thread.sleep(2000);
		         //search box
		  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mens Shirts");
		  Thread.sleep(2000);
		  
		  WebElement el=driver.findElement(By.id("twotabsearchtextbox"));
		  el.sendKeys(Keys.ARROW_DOWN);
		  Thread.sleep(2000);
		  el.sendKeys(Keys.ARROW_DOWN);
		  Thread.sleep(2000);
		  el.sendKeys(Keys.ARROW_DOWN);
		  Thread.sleep(2000);
		  el.sendKeys(Keys.ENTER);
		  System.out.println("Mens Casual Shirts Selected");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/div/div/div[1]/div/span/a/div/img")).click();
		  Thread.sleep(2000);
		  
		  Set<String> all=driver.getWindowHandles();
		  
		     String parent=(String)all.toArray()[0];
		     String child=(String)all.toArray()[1];
		     System.out.println(driver.switchTo().window(child).getTitle());
		     Thread.sleep(3000);
		     
		  
		Select st=new Select(driver.findElement(By.xpath("//*[@id=\"native_dropdown_selected_size_name\"]")));
		st.selectByIndex(2);
		System.out.println("Dropdown completed");
		Thread.sleep(3000);
		      //Buy
		driver.findElement(By.xpath("//input[@id='buy-now-button']")).click();
		Thread.sleep(2000);
		
		
		
		  //payment mode upi
		String text="Net Banking";
		while(true)
		{
			if(text.equals("Net Banking")) 
			{
				
			driver.findElement(By.xpath("//*[@id=\"pp-RWT3nr-100\"]")).click();
			break;
			}
			else
			{
				Robot r=new Robot();
				r.keyPress(KeyEvent.VK_TAB);
				r.keyRelease(KeyEvent.VK_TAB);
			}
			
		}
		
		
		
		
		
		

		}
}
