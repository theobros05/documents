package gmail;
 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;
import org.openqa.selenium.firefox.*;
import java.util.concurrent.*;
 
public class gmailexample {
 
    public static void main(String[] args) 
{
 
        
//initialize Chrome driver
       System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
       WebDriver driver = new ChromeDriver(); 
 


    // And now use this to visit Google
    driver.get("http://www.google.com");

    // Find the text input element by its name
    WebElement element = driver.findElement(By.name("q"));

    if (element.getTagName().equalsIgnoreCase("input") 
            && element.getAttribute("type").equalsIgnoreCase("text")) {
        System.out.println("its a textbox");
    }
    }
 
}
