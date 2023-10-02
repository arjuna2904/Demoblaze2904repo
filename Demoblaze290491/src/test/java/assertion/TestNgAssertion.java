package assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgAssertion {
	@Test
	public void equals() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
		Assert.assertEquals(c,30 );
	}
	@Test
	
	public void notequals() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
		Assert.assertEquals(c,40 );
}
	public void true1() {
		
		
	}
	
}