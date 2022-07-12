package a04_ParallelTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTest {


	@Test
	@Parameters({"username","pwd","browser"})
	public void login(String userneme,String pwd,String browser){
		WebDriver driver=null;
		if(browser.equalsIgnoreCase("chrome"))	{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}else if(browser.equalsIgnoreCase("edge")){
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}else if(browser.equalsIgnoreCase("firefox")){
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();	
			
		}
			
		   driver.get("https://djangovinoth.pythonanywhere.com/login/");
		 driver.manage().window().maximize();
		 driver.findElement(By.name("username")).sendKeys("username");
		 driver.findElement(By.name("password")).sendKeys("pwd");
		 driver.findElement(By.xpath("//button[@class='btn btn-outline-info']")).click();
		driver.close();
}
}
