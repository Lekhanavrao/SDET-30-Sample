package gitPractice;

import org.testng.annotations.Test;

public class CreateContactTest {
	
	@Test(groups="smoke")
	public void simpleProgram()
	{
		System.out.println("Contact 1");
		
		System.out.println("Contact 2");
	}
	
	@Test(groups="regression")
	public void simpleProgram1()
	{
		System.out.println("Contact 3");
		System.out.println("Contact 4");
	}

}
