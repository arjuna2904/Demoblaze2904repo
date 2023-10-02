package testngbasic;

import org.testng.annotations.Test;

public class Example1 {
	@Test(priority=1)
	public void login() {
		System.out.println("login method");
	}
	@Test(invocationCount =5)
	public void home() {
		System.out.println("home method");
	}
	@Test
	public void contact() {
		System.out.println("contact method");
	}

}
