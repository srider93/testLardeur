package org.selenium.test.lardeur;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class StatChahuteur extends GenericPage{
	
	
	@FindBy(how = How.XPATH, using ="//div[@id='tt2168']//b")
	WebElement nom_chahuteur;
	
	
	@FindBy(how = How.XPATH, using ="//div[@id='tt2168']//span[4]")
	WebElement stat_chahuteur_endurance;
	
	@FindBy(how = How.XPATH, using ="//div[@id='tt2168']//span[5]")
	WebElement stat_chahuteur_augscore;
	
	@FindBy(how = How.XPATH, using ="//div[@id='tt2168']//span[6]")
	WebElement stat_chahuteur_versatility;
	

	

	public StatChahuteur(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

}
