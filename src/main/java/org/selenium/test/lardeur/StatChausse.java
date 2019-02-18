package org.selenium.test.lardeur;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class StatChausse extends GenericPage {

	
	
	@FindBy(how = How.XPATH, using ="//div[@id='tt1934']//b")
	WebElement nom_chausse;
	
	@FindBy(how = How.XPATH, using ="//div[@id='tt1934']//span[4]")
	WebElement stat_chausse_endurance;
	
	@FindBy(how = How.XPATH, using ="//div[@id='tt1934']//span[5]")
	WebElement stat_chausse_augscore;
	
	@FindBy(how = How.XPATH, using ="//div[@id='tt1934']//span[6]")
	WebElement stat_chausse_versatility;
	
	public StatChausse(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	
}
