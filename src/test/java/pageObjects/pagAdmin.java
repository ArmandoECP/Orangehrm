package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class pagAdmin {
    private WebDriver driverl;
    private WebDriverWait wait;
    //Constructor
    public pagAdmin(WebDriver browser){
        driverl=browser;
        PageFactory.initElements(this.driverl,this);
        wait=new WebDriverWait(driverl,10);

    }
    //Locators
    @FindBy(className = "oxd-select-text-input")
        private WebElement userRole;
    @FindBy(css = "button[class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
        private WebElement botonbuscar;
    //Actions
    public void selecciiona(){
        wait.until(ExpectedConditions.visibilityOf(userRole));
        List <WebElement> userRol=driverl.findElements(By.className("oxd-select-text-input"));
        Actions accion=new Actions(driverl);
        accion.click(userRol.get(0)).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).perform();
        WebElement caso=driverl.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']"));
        wait.until(ExpectedConditions.elementToBeClickable(caso));
        caso.click();
    }
    public void tablita(WebElement tabla){
        //private ArrayList<tabla>
        WebElement tabla1=driverl.findElement(By.className("orangehrm-container"));
        wait.until(ExpectedConditions.visibilityOf(tabla));
        //List<WebElement> filas=tabla.findElements(By.cssSelector("div[class='oxd-table-body']"));




        List<WebElement> filas=tabla1.findElements(By.className("oxd-table-body"));
        System.out.println("ya entre al proceso de la tabla");
        System.out.println("la fila  "+filas.size());
        int indexfil=0;
        for (WebElement f: filas) {
            System.out.println("ya entre a cada fila");
            List<WebElement> columna=f.findElements(By.className("oxd-table-card"));
            int indexcol=0;
            System.out.println("numero de filas "+ f.getSize());
            for (WebElement d: columna) {
                System.out.println("ya entre a cada columna");
                WebElement dato=d.findElement(By.className("oxd-table-cell oxd-padding-cell"));
                System.out.println(dato.getText());
                indexcol++;

            }
            indexfil++;
            
        }



    }
}
