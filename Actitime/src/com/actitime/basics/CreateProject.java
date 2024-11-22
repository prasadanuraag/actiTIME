package com.actitime.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateProject {

	public static void main(String[] args) throws Exception {
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
		d.findElement(By.xpath("//div[text()='Add New']")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("div[text()='+ New Project']")).click();
		Thread.sleep(3000);
		d.findElement(By.id("projectPopup_projectNameField")).sendKeys("actiTIME");
		Thread.sleep(3000);
		d.findElement(By.id("projectPopup_customerSelectorPlaceholder")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//a[text()='Our Company")).click();
		Thread.sleep(3000);
		d.findElement(By.id("projectPopup_projectDescriptionField")).sendKeys("SDD");
		Thread.sleep(3000);
		d.findElement(By.xpath("//span[text()='Create Project']")).click();
	}
		
		

	}

