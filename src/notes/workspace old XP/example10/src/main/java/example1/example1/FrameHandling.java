package example1.example1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {
	
	public static void main(String[] args)   throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		  ChromeDriver driver = new ChromeDriver();

	//driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://seleniumhq.github.io/selenium/docs/api/java/");
	
	int size = driver.findElements(By.tagName("frame")).size();
	
	System.out.println("Total number of frames are  "+ size);
	
	int isize = driver.findElements(By.tagName("iframe")).size();
	
	System.out.println("Total number of iframes are  "+ isize);
	
	
 
	
	
	
	//((WebElement) driver).getAttribute("name");
	
	//System.out.println("Navigated to frame with id "  );
	
	//System.out.println("Frame name :" + ((WebElement) driver).getAttribute("name"));
	
	List<WebElement> ele = driver.findElements(By.tagName("frame"));
    System.out.println("Number of frames in a page :" + ele.size());
    for(WebElement el : ele){
      //Returns the Id of a frame.
        System.out.println("Frame Id :" + el.getAttribute("id"));
      //Returns the Name of a frame.
        System.out.println("Frame name :" + el.getAttribute("name"));
    }
	
   // String s= driver.switchTo().frame("packageFrame").getTitle();
    //System.out.println("Current frame name   " + s);
    
    //driver.findElement(By.xpath("html/body/div[1]/ul/li[23]")).click();

    
    
   
  //  System.out.println("Frame name :" + ((WebElement) driver).getAttribute("name"));
	 
driver.quit();
}}
