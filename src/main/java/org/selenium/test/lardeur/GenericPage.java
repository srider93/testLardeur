package org.selenium.test.lardeur;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class GenericPage {
	
	

	WebDriver driver;
	@FindBy(how = How.XPATH, using ="//div[@class='header-search']//input")
	WebElement search_field;
	
	@FindBy(how = How.XPATH, using ="//div[@class='header-search']//a")
	WebElement search_zoom;
	
	
	public GenericPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);

	}
	
	public SearchLardeur search(String key) {
		
		search_field.sendKeys(key);
		search_zoom.click();
		return PageFactory.initElements(driver, SearchLardeur.class);
	}
	

}
