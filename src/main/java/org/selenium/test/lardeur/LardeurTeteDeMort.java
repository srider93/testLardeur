package org.selenium.test.lardeur;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LardeurTeteDeMort extends GenericPage{

	public LardeurTeteDeMort(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	@FindBy(how = How.XPATH, using ="//tbody[@class='clickable']/tr/td[3]")
	List<WebElement> objRare_td;
	
	
	@FindBy(how = How.XPATH, using ="//div[@class='iconmedium']/a[@href='/item=2168']")
	WebElement First_objRare;
	
	@FindBy(how = How.XPATH, using ="//div[@class='iconmedium']/a[@href='/item=1934']")
	WebElement Second_objRare;
	
	
	
	public StatChahuteur goToChahuteurStat() {
		
		JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		jse2.executeScript("arguments[0].scrollIntoView()", First_objRare ); 
		First_objRare.click();
		return PageFactory.initElements(driver, StatChahuteur.class);
	}
	
	public StatChausse goToChausseStat() {
		
		JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		jse2.executeScript("arguments[0].scrollIntoView()", Second_objRare ); 
		Second_objRare.click();
		return PageFactory.initElements(driver, StatChausse.class);
	}
	
}
