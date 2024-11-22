package com.actitime.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteCustomer {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		d.get("http://localhost/login.do");
		d.findElement(By.id("username")).sendKeys("anuakasunny@gmail.com");Thread.sleep(1000);
		d.findElement(By.name("pwd")).sendKeys("manager");Thread.sleep(1000);
		d.findElement(By.xpath("//div[text()='Login ']")).click();Thread.sleep(1000);
		d.findElement(By.linkText("TASKS")).click();Thread.sleep(1000);
		d.findElement(By.xpath("//input[@type='text'])[2]")).sendKeys("anuraag");Thread.sleep(1000);
		d.findElement(By.xpath("//div[@class='editButton available'])")).click();Thread.sleep(1000);
		d.findElement(By.xpath("//div[@class='actionButton'])[1]")).click();Thread.sleep(1000);
		d.findElement(By.xpath("//div[text()='Delete']")).click();Thread.sleep(1000);
		d.findElement(By.id("customerPanel_deleteConfirm_submitTitle")).click();
		d.findElement(By.id("logoutLink")).click();
		d.quit();
		

	}

}
