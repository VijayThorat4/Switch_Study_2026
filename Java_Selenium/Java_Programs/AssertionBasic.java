import org.testng.Assert;
import org.testng.annotations.Test;

public class MyClass {
	
	@Test
	public void test1() {
		Assert.assertEquals(12, 12);
	}

	@Test
	public void test2() {
		Assert.assertEquals(12, 13, "check with developer ");
	}
}
