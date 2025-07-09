package day22.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.demoblaze.com/index.html");
		driver.manage().window().maximize();
		List<WebElement> linkList= driver.findElements(By.tagName("a"));
		System.out.println("Total number of link :"+ linkList.size());
		for(WebElement num : linkList ) {
			String text=num.getText().trim();
			if(!text.isEmpty()) {
				System.out.println("Link :"+ text);
				System.out.println("URL: " + num.getAttribute("href"));
			}
			
			
			
		}
		

	}

}
