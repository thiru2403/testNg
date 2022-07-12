package a02_keywordTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderTest {
	
	@Test(dataProvider="login")
	public void login(String userneme,String pwd) throws InterruptedException{

	WebDriverManager.chromedriver().setup();
	
	 WebDriver driver=new ChromeDriver();
	   driver.get("https://djangovinoth.pythonanywhere.com/login/");
	 driver.manage().window().maximize();
	 driver.findElement(By.name("username")).sendKeys("username");
	 driver.findElement(By.name("password")).sendKeys("pwd");
	 driver.findElement(By.xpath("//button[@class='btn btn-outline-info']")).click();
	Thread.sleep(3000);
	driver.close();
	
	}
	
	
	@DataProvider(name="login")
	public Object[][] validCredentials(){
		Object[][] l=new Object[2][2];
		l[0][0]="Selvam";
		l[0][1]="@Thiru24";
		
		l[1][0]="Test";
		l[1][1]="Test234";
		return l;
		
		
		
		
		
		
		
	
}
}