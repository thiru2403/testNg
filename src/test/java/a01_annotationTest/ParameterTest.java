package a01_annotationTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;

public class ParameterTest {

	@Test
	@Parameters({"username","pwd"})
	public void login(String userneme,String pwd){
		WebDriverManager.chromedriver().setup();
		
		 WebDriver driver=new ChromeDriver();
		   driver.get("https://djangovinoth.pythonanywhere.com/login/");
		 driver.manage().window().maximize();
		 driver.findElement(By.name("username")).sendKeys("username");
		 driver.findElement(By.name("password")).sendKeys("pwd");
		 driver.findElement(By.xpath("//button[@class='btn btn-outline-info']")).click();
		
	}


}
