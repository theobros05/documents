package element;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Radiobutton {
	private static String[] links = null;
	private static int radiocount = 0;
	public static void main(String[] args) throws InterruptedException { 
		 
	
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    
	driver.get("https://www.bing.com/account/general?ru=https%3a%2f%2fwww.bing.com%2f&FORM=O2HV65&id=language_section#language-section");
	
	List<WebElement> radiosize = driver.findElements(By.cssSelector("input[type=radio]")); 
	radiocount = radiosize.size();
	
	System.out.println("Total no of radio Available: "+radiocount);
	links= new String[radiocount];
	
	System.out.println("List of radio buttons Available: ");  
	
	for(int i=0;i<radiocount;i++)
	{
	links[i] = radiosize.get(i).getAttribute("name");
	
	
    System.out.println(radiosize.get(i).getAttribute("name"));
	} 
	
	
	Thread.sleep(3000);
	driver.quit();
	

}}
