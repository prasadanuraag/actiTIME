package com.actitime.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddUser {

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
		d.findElement(By.xpath("//div[text()='Add User']")).click();
		Thread.sleep(3000);
		d.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("Anuraag");
		Thread.sleep(3000);
		d.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("Prasad");
		Thread.sleep(3000);
		d.findElement(By.id("userDataLightBox_emailField")).sendKeys("anuakasunny@gmail.com");
		Thread.sleep(3000);
		d.findElement(By.id("userDataLightBox_userNameField")).sendKeys("anuakasunny@gmail.com");
		Thread.sleep(3000);
		d.findElement(By.id("userDataLightBox_passwordField")).sendKeys("manager");
		Thread.sleep(3000);
		d.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("manager");
		Thread.sleep(3000);
		d.findElement(By.xpath("//span[text()='Create user']")).click();
	}
}
