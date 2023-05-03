package com.example.demo.sampletest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class cc1 {
 public static void main(String args[]) throws InterruptedException {
	 WebDriverManager.edgedriver().setup();
	 WebDriver driver=new EdgeDriver();
	 driver.get("https://www.saucedemo.com/");
	 driver.manage().window().maximize();
	  driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
	  driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce",Keys.ENTER);
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
	  Thread.sleep(3000);
	  String str= driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a/span")).getText();
	 System.out.println(str);
	  
	  driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
//	  String product = "Sauce Labs Backpack";
	  Thread.sleep(4000);
	  
	  driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("ABCD");
	driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("X");
	driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("12345");
	driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
	
	System.out.println("Name of the product: " + driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div[3]/div[2]/a/div")).getText());
	System.out.println("Price of the product: " + driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div")).getText());
    
	String title=driver.getTitle();
	String url=driver.getCurrentUrl();
	
	if(title.equals("Swag Labs"))
		 System.out.println("Title is matched");
	if(url.equals("https://www.saucedemo.com/checkout-step-two.html"));
	     System.out.print("url is matched");
	
	 
     
	//*[@id="first-name"]
	  
 }
}


