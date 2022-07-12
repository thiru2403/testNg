package a02_keywordTest;

import org.testng.annotations.Test;

public class DescriptionTest {
	
	@Test(priority = 1,description = "Customer should register")
	public void registerTest() {
		System.out.println("register Test");
	}
	@Test(priority = 2,description = "Customer should able to login")
	public void loginTest() {
		System.out.println("Login Test");
		System.out.println(1/0);
	}
	@Test(priority = 3,description = "Customer should able to add to cart")
	public void addToCartTest() {
		System.out.println("add to cart Test");
	}
	@Test(priority = 4,description = "Customer should able to place an order")
	public void placeOrder() {
		System.out.println("Place Order");
	}
}

