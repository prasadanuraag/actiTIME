package com.actitime.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteUser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		d.get("http://localhost/login.do");
		d.findElement(By.id("username")).sendKeys("anuakasunny@gmail.com");
		d.findElement(By.name("pwd")).sendKeys("manager");
		d.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(3000);
		d.findElement(By.linkText("USERS")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//input[@class='filterFieldInput inputFieldWithPlaceholder'])")).sendKeys("AnuraagPrasad");
		Thread.sleep(3000);
		d.findElement(By.xpath("//table[@class='userNameContainer']")).click();
		Thread.sleep(3000);
		d.findElement(By.id("userDataLightBox_deleteBtn")).click();
		Thread.sleep(3000);
		d.switchTo().alert().accept();
		
	}

}
