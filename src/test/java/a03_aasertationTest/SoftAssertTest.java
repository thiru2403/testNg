package a03_aasertationTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTest {

	@Test
	public void validateAssert(){
		
	SoftAssert s=new SoftAssert();
		//s.assertEquals(Driver.getTitle(),"Dashboard" );
	
		s.assertEquals(false, false);
		System.out.println("1st assertion completed");
		s.assertEquals(true, false);
		System.out.println("2nd assertion completed");
		s.assertEquals("Test", "Test");
		s.assertAll();
}
	@Test
	public void Validation(){
		System.out.println("2nd test");
	}
}