package a02_keywordTest;

import org.testng.annotations.Test;

public class InvocationTest {

	@Test(invocationCount =6)
	public void myTest(){
		System.out.println("myTest");
	}
}
