package com.actitime.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteProject {

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
		d.findElement(By.linkText("TASKS")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//input[@type='text'])[2]")).sendKeys("actiTIME");
		Thread.sleep(3000);
		d.findElement(By.xpath("(//div[@class='editButton available'])[20]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("(//div[text()='ACTIONS'])[3]")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("(//div[text()='Delete'])[3]")).click();
		Thread.sleep(3000);
		d.findElement(By.id("projectPanel_deleteConfirm_submitTitle")).click();
		d.findElement(By.id("logoutLink")).click();
	}

}
