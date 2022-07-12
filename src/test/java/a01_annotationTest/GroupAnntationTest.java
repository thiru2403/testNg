package a01_annotationTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@Test
public class GroupAnntationTest {

	@BeforeSuite(alwaysRun=true)
	public void beforeSuite() {
		System.out.println("Before Suite");
	}
	@AfterSuite(alwaysRun=true)
	public void afterSuite() {
		System.out.println("After Suite");
	}
	
	@BeforeGroups("sanity")
	public void beforeGroup(){
		System.out.println("Before groups");
	}
	@AfterGroups("sanity")
	public void AfterGroup(){
		System.out.println("After groups");
	}

	@Test(groups={"sanity","Regression"})
	public void Test1() {
		System.out.println("Test1");
	}
	@Test(groups={"sanity","Regression"})
	public void Test2() {
		System.out.println("Test2");
	}
	@Test(groups="Regression")
	public void Test3() {
		System.out.println("Test3");
	}
	@Test(groups="Regression")
	public void Test4() {
		System.out.println("Test4");
	}

}
