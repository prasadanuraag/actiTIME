package com.actitime.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoCreateCustomer {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		d.get("http://localhost/login.do");
		d.findElement(By.id("username")).sendKeys("anuakasunny@gmail.com");Thread.sleep(1000);
		d.findElement(By.name("pwd")).sendKeys("manager");Thread.sleep(1000);
		d.findElement(By.xpath("//div[text()='Login ']")).click();Thread.sleep(1000);
		d.findElement(By.linkText("TASKS")).click();Thread.sleep(1000);
		d.findElement(By.xpath("//div[text()='Add New']")).click();Thread.sleep(1000);
		d.findElement(By.xpath("//div[text()='+ New Customer']")).click();Thread.sleep(1000);
		d.findElement(By.id("customerLightBox_nameField")).sendKeys("anuraag");Thread.sleep(1000);
		d.findElement(By.id("customerLightBox_descriptionField")).sendKeys("Developer");Thread.sleep(1000);
		d.findElement(By.id("ext-gen23")).click();Thread.sleep(1000);
		d.findElement(By.xpath("//a[text()='Our Company']")).click();Thread.sleep(1000);
		d.findElement(By.id("customerLightBox_commitBtn")).click();Thread.sleep(3000);
		WebElement createdCust=d.findElement(By.xpath("//a[text()='All Customers']/../../div[@class='title ellipsis']"));
		System.out.println(createdCust.getText());Thread.sleep(1000);
		d.findElement(By.id("logoutLink")).click();
		d.quit();
		
	}

}
