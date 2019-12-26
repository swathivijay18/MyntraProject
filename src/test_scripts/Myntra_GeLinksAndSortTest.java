package test_scripts;

import org.testng.annotations.Test;

import generic_lib.GenericLogin_Myntra;
import pom_class.Myntra_HomePage;

public class Myntra_GeLinksAndSortTest extends GenericLogin_Myntra{
	@Test
	public void sortlinks() throws InterruptedException
	{
		Myntra_HomePage hp=new Myntra_HomePage(getDriver());
		Thread.sleep(3000);
		System.out.println("***********Ascending order***********");
		hp.sendAscendingSortedLinks();
		System.out.println("**********Descending order*********");		
		Thread.sleep(3000);
		hp.sendDescendingSortedLInks();
		Thread.sleep(2000);
		
		
	}

}
