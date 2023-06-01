package test;

import configuraciones.drivers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pageObjects.pagAdmin;
import pageObjects.pagDashboard;
import pageObjects.paguinalogueo;

public class testLogueo {
    private WebDriver driverl;
    private drivers driverh=new drivers();
    @Test
    public void inicio(){
        driverl=driverh.chrome();
        paguinalogueo logueo=new paguinalogueo(driverl);
        logueo.ingresousuario("Admin","admin123");
        logueo.clicklogueo();
        pagDashboard dashboard=new pagDashboard(driverl);
        dashboard.ingresaAdmin();
        pagAdmin pagAdmins=new pagAdmin(driverl);
        pagAdmins.selecciiona();
        WebElement tabla=driverl.findElement(By.cssSelector("div[class='oxd-table']"));
        pagAdmins.tablita(tabla);
    }
}
