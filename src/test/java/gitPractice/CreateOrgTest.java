package gitPractice;

import org.testng.annotations.Test;

public class CreateOrgTest {
	@Test(groups="smoke")
	public void simpleProgram()
	{
		System.out.println("Org 1");
		
		System.out.println("Org 2");
		
		System.out.println("Org 3");
	}
	
	@Test(groups="regression")
	public void simpleProgram1()
	{
		System.out.println("Org 3");
		System.out.println("Org 4");
	}

}
