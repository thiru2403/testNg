package a02_keywordTest;

import org.testng.annotations.Test;

public class InvocationTimeOutTest {

	@Test(invocationTimeOut= 2000)
	public void myTest() throws InterruptedException{
		Thread.sleep(3000);
		System.out.println("MyTest");
		
	}
	@Test(invocationTimeOut= 2000)
	public void myTest1() throws InterruptedException{
		Thread.sleep(2000);
		System.out.println("MyTest");
		
	}
	@Test(invocationTimeOut= 2000)
	public void myTest2() throws InterruptedException{
		Thread.sleep(1000);
		System.out.println("MyTest");
		
	}
}
