package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PrintMessages {

	@Test
	public void print()
	{
		System.out.println("hello ! Good morning");
		Reporter.log("hello ! Good morning",true);
	}
}
