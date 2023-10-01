package com.JavaSeleniumBDD;

import org.testng.annotations.*;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import utility.BaseTest;

@CucumberOptions(features = { "resources/features" }, 
glue = {"stepDefinitions","utility/BaseTest"}, 
tags = "@ut")
public class TestRunner extends AbstractTestNGCucumberTests {
	BaseTest bs = new BaseTest();

	@BeforeClass
	public void start() {
		System.out.println("setup the driver");
		bs.setup();
	}
	
	@AfterSuite
	public void tear() {
		bs.closeSession();
	}

}
