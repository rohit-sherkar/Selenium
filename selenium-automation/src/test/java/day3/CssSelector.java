package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) {
		
//		WebDriver driver= new ChromeDriver();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//tag- Id;
//		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-Shirts");
//		driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-Shirts");
		
		//tag-class
//		driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("Laptop");
		
		// tag-attribute
//		driver.findElement(By.cssSelector("input[placeholder=\"Search store\"]")).sendKeys("Laptop");
//		driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("Laptop");
//		driver.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("Laptop");
		
		//tag class attrbute
		driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("Laptop");
		
		
		

	}

}
