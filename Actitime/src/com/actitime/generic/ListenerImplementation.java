package com.actitime.generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerImplementation extends BaseClass implements ITestListener
{
	@Override
	public void onTestSuccess(ITestResult result)
	{
		String res=result.getName();
		Reporter.log(res+"has been passed",true);
	}
	@Override
	public void onTestFailure(ITestResult result)
	{
		String res=result.getName();
		TakesScreenshot ts=(TakesScreenshot).driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File des=new File("./screenshots/"+res+".png");
		try
		{
			FileUtils.copyFile(src, des);
		}
		catch(IOException e) {}
	}
	@Override
	public void onTestSkipped(ITestResult result)
	{
		String res=result.getName();
		Reporter.log(res+"has been skipped",true);
	}	
	@Override
	public void onTestStart(ITestResult result)
	{
		
	}
	@Override
	public void onTestSuccess(ITestResult result)
	{
		String res=result.getName();
		Reporter.log(res+"has been passed",true);
	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}
	@Override
	public void onTestFailedWithTimeout(ITestResult result)
	{
	}
	@Override
	public void onStart(ITestContext context)
	{
	}
	public void onFinish(ITestContext context)
	{
	}

}
	
	

