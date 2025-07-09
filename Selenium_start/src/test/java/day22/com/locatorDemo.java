package day22.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/b/ref=surl_fashion/?_encoding=UTF8&node=6648217031&pd_rd_w=CISKw&content-id=amzn1.sym.27ab47d1-d19f-4b4f-8e54-6d97645e2daf&pf_rd_p=27ab47d1-d19f-4b4f-8e54-6d97645e2daf&pf_rd_r=0T29TY1K23Q5NGCKTB6V&pd_rd_wg=xkIWp&pd_rd_r=4e25cf6a-1aeb-4107-b1f2-f1be64bb7669&ref_=pd_hp_d_hero_unk");
		driver.manage().window().maximize();
		
		//id 
//		boolean logo=driver.findElement(By.id("nav-logo-sprites")).isDisplayed();
//		System.out.println(logo);
		
		//Name
//		driver.findElement(By.name("field-keywords")).sendKeys("laptop");
		
		// linktext and partialLinktext :
//		driver.findElement(By.linkText("Customer Service")).click();
		
		//className and tagName
		List<WebElement> headerLink=driver.findElements(By.tagName("a"));
		System.out.println("totoal number of header links :" + headerLink.size());
		
		
	}
	

}
