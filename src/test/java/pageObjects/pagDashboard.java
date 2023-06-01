package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class pagDashboard {

    private WebDriver driverl;
    private WebDriverWait wait;
    //Constructor
    public pagDashboard(WebDriver browser){
        driverl=browser;
        PageFactory.initElements(this.driverl,this);
        wait=new WebDriverWait(driverl,10);

    }
    //Locators
    @FindBy(linkText = "Admin")
        private WebElement ingAdmin;
    //Actions
    public void ingresaAdmin(){
        wait.until(ExpectedConditions.visibilityOf(ingAdmin));
        ingAdmin.click();
    }
}
