package com.example.demo.sampletest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CCqn2 {
  public static void main(String args[]) throws InterruptedException {
	  WebDriverManager.edgedriver().setup ();
		WebDriver driver=new EdgeDriver();
		driver.get ("https://www.saucedemo.com/");
		driver.manage().window().maximize() ;
		WebElement textl=driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
		textl.sendKeys("standard_user");
		WebElement text2=driver.findElement(By.xpath("//*[@id=\"password\"]"));
		text2.sendKeys("secret_sauce");
		
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		String a=driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).getText();
		System.out.println(a);
		driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")).click();
		driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[2]")).click();
		String b=driver.findElement(By.xpath("//*[@id=\"item_3_title_link\"]/div")).getText();
		System.out.println(b);
		System.out.println("filter (A-Z and Z-A) used smoothly");
		driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")).click();
		driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[3]")).click();
		String x=driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[2]/div[2]/div")).getText();
		System.out.println(x);
		driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")).click();
		driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[4]")).click();
		String y=driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[2]/div[2]/div")).getText();
		System.out.println(y);
		System.out.println("filter (low price- high price and high price - low price )used smoothly");
		Thread.sleep(5000);	
  }
}
