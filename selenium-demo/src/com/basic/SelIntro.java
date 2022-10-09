package com.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SelIntro {
	public static void main(String[] args) {
		WebDriver webdriver=null;
//		System.setProperty("webdriver.edge.driver", "E:\\JAVAFSD\\drivers\\msedgedriver.exe");
//		webdriver = new EdgeDriver();
		System.setProperty("webdriver.chrome.driver", "E:\\JAVAFSD\\drivers\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		webdriver = new ChromeDriver();
		webdriver.get("https://www.simplilearn.com");
		System.out.println(webdriver.getTitle());
		System.out.println(webdriver.getCurrentUrl());
		webdriver.quit();
	}

}
