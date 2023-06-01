package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class paguinalogueo {
    private WebDriver driverl;
    private WebDriverWait wait;
    //Constructor
    public paguinalogueo(WebDriver browser){
        driverl=browser;
        PageFactory.initElements(this.driverl,this);
        wait=new WebDriverWait(driverl,10);

    }
    //locator
    @FindBy(name = "username")
        private WebElement nameuser;
    @FindBy(name = "password")
        private WebElement clave;
    @FindBy(css = "button[type='submit']")
        private WebElement botonloguin;

    //Actions
  public void ingresousuario(String u,String p){
        wait.until(ExpectedConditions.visibilityOf(nameuser));
      nameuser.sendKeys(u);
      clave.sendKeys(p);
  }
  public  void clicklogueo(){
      botonloguin.click();
  }
}
