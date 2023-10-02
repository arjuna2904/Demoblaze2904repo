package testngbasic;

import org.testng.annotations.Test;

public class Example {
	@Test(priority=1)
	public void login() {
		System.out.println("login method");
	}
	@Test(priority=2)
	public void home() {
		System.out.println("home method");
	}
	@Test(priority=3)
	public void contact() {
		System.out.println("contact method");
	}
	@Test
	public void contact1() {
		System.out.println("contact1 method");


}
}