package com.teqsar.Java8.enhance;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver dr = new ChromeDriver();

		dr.get("https://www.amazon.in/");
		/*
		 * List<WebElement> element=dr.findElements(By.xpath("//a"));
		 * 
		 * List<String> text=new ArrayList<>();
		 * 
		 * for(int i=0;i<element.size();i++) { String temp=element.get(i).getText();
		 * if(!temp.isBlank()) { text.add(temp); } }
		 * 
		 * for(int j=0;j<text.size();j++) { System.out.println(text.get(j)); }
		 * 
		 * 
		 * List<String> listafterremovingdup=new ArrayList<>(new HashSet<String>(text));
		 * Collections.sort(listafterremovingdup); for(int
		 * i=0;i<listafterremovingdup.size();i++) {
		 * System.out.println(listafterremovingdup.get(i)); }
		 * 
		 * dr.quit();
		 */
		
		
		dr.findElements(By.xpath("//a")).stream()
			.map(e->e.getText())
			.filter(s->!s.isBlank())
			.distinct()
			.sorted()
			.filter(s->s.startsWith("C")||s.startsWith("D"))
			.forEach(s->System.out.println(s));
			
			
			
			
	}

}
