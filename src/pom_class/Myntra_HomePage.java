package pom_class;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic_lib.GenericSort;

public class Myntra_HomePage {
	GenericSort gs=new GenericSort();
	@FindBy(xpath="//a")
	private List<WebElement> prodlink;
	
	public Myntra_HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void sendAscendingSortedLinks()
	{
		ArrayList<String> l = gs.sortAscending(prodlink);
		for(String text:l)
		{
			System.out.println(text);
		}
	}
	
	public void sendDescendingSortedLInks()
	{
		ArrayList<String> l1 = gs.sortDescending(prodlink);
		for(String text:l1)
		{
			System.out.println(text);
		}
	}
		
		
		
	}

