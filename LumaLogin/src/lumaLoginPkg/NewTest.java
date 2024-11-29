package lumaLoginPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void LoginToPage() {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://magento.softwaretestingboard.com/");
	  driver.manage().window().maximize();
	  
	  JavascriptExecutor js=(JavascriptExecutor) driver;
	  
	  js.executeScript("window.scrollBy(0,500)");
	  driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[1]/a/span/span[2]")).click();
  
	  WebElement homeText = driver.findElement(By.xpath("//*[@id=\"page-title-heading\"]/span"));
	  String actualText = homeText.getText();
	  System.out.println(actualText);
	  Assert.assertEquals(actualText, "New Luma Yoga Collection");
  }
}
