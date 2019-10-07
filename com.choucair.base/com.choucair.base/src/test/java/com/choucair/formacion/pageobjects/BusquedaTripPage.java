package com.choucair.formacion.pageobjects;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

@DefaultUrl("https://www.tripadvisor.co/")

public class BusquedaTripPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"component_5\"]/div[2]/div/div/div/div/span")
    WebElementFacade clickBuscar;

    @FindBy(xpath = "//input[@placeholder='¿Adónde?']")
    WebElementFacade lblAdonde;

    @FindBy(xpath = "//*[@id='BODY_BLOCK_JQUERY_REFLOW']/div[12]/div/div/div[1]/div[2]/div")
    WebElementFacade btnBuscar;

    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/span[3]/div[1]/a[1]")
    WebElementFacade clickRestaurantes;

    @FindBy(xpath = "//*[@id=\"jfy_filter_bar_establishmentTypeFilters\"]/div[2]/div[1]/div")
    WebElementFacade checkRestaurantes;

    @FindBy(xpath = "//div[@class='prw_rup prw_restaurants_restaurant_filters']//div[8]//div[@class='text'][contains(text(),'Más')]")
    WebElementFacade despMas;

    @FindBy(xpath = "//*[@id=\"overlayInnerDiv\"]/div[2]/div[3]/div[3]/div[2]/div")
    WebElementFacade checkParrilla;

    @FindBy(xpath = "//*[@id=\"overlayInnerDiv\"]/div[2]/div[4]/div[2]")
    WebElementFacade btnAplicar;

    @FindBy(xpath = "//div[@id='component_2']//div[2]/div//div//div//span//a[text()='1. Pollo Arabe Quibdo']")
    WebElementFacade clickRestEscojido;

    @FindBy(xpath = "//div[contains(@class,'mosaic_photos')]//div[2]//div[2]//span[1]//span[2]")
    WebElementFacade clickTodasFotos;

    //@FindBy(xpath = "//*[@id=\"taplc_resp_rr_photo_mosaic_0\"]/div/div/div[1]/div[2]/div[2]/div[1]")
    WebElementFacade clickFoto;

    @FindBy(xpath = "//*[@id=\"taplc_pv_resp_content_hero_0\"]/div/div[1]/div[3]/div[2]")
    WebElementFacade pagSiguiente;

    //@FindBy (xpath = "//*[@id=\"taplc_pv_resp_content_hero_0\"]/div/div[2]/div[2]")
    //List<WebElementFacade> listaFotos;

    @FindBy(xpath = "//a[@class='ui_button primary war-button']")
    WebElementFacade btnEscribirOpinion;

    @FindBy(xpath = "//input[@id='ReviewTitle']")
    WebElementFacade lblTituloOpinion;

    @FindBy(xpath = "//*[@id=\"ReviewText\"]")
    WebElementFacade lblOpinion;

    @FindBy(xpath = "//div[@class='c-cell jfy_cloud tag content category-withSpouse']")
    WebElementFacade btnTipoVisita;

    @FindBy(xpath = "//select[@id='qid391']")
    WebElementFacade btnRazonVisita;

    @FindBy(xpath = "//*[@id=\"qid391\"]//option[2]")
    WebElementFacade btnRazonDesayuno;

    @FindBy(xpath = "//select[@id='trip_date_month_year']")
    WebElementFacade btnFechaVisita;

    @FindBy(xpath = "//*[@id=\"trip_date_month_year\"]//option[@value = '10,2019']")
    WebElementFacade btnOctubre;

    @FindBy(xpath = "//div[contains(text(),'Gama media')]")
    WebElementFacade btnGamaMedia;

    @FindBy(xpath = "//input[@id='noFraud']")
    WebElementFacade btnCheck;

    @FindBy(xpath = "//div[@id='SUBMIT']")
    WebElementFacade btnEnviarOpinion;



    public void busquedaSitio() /*throws AWTException*/ {
        Actions act = new Actions(getDriver());
        act.moveToElement(clickBuscar).click().perform();
        lblAdonde.sendKeys("Quibdó");
        waitFor(5).seconds();
        act.moveToElement(btnBuscar).click().perform();
        //act.moveToElement(lblAdonde).click().perform();
        /*Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);*/


    }

    public void busquedaRestaurante(){
        Actions act = new Actions(getDriver());
        //waitFor(clickRestaurantes).waitUntilClickable().and().click();
        clickRestaurantes.waitUntilClickable().click();
        //act.moveToElement(clickRestaurantes).click().perform();
        //checkRestaurantes.waitUntilClickable().click();
        act.moveToElement(checkRestaurantes).click().perform();
        int coor = $("//*[@id=\"jfy_filter_bar_cuisine\"]/div[3]").getCoordinates().onPage().getY();
        JavascriptExecutor jse = (JavascriptExecutor) getDriver();
        jse.executeScript("window.scrollTo(0," + coor + ");");
        //waitFor(despMas).isVisible();
        act.moveToElement(despMas).click().perform();
        waitFor(checkParrilla).isVisible();
        act.moveToElement(checkParrilla).click().perform();
        waitFor(btnAplicar).isVisible();
        act.moveToElement(btnAplicar).click().perform();
        waitFor(clickRestEscojido).isVisible();
        act.moveToElement(clickRestEscojido).click().perform();

        //////// Pasar entre pestañas ///////////

        ArrayList<String> tabs2 = new ArrayList<String>(getDriver().getWindowHandles());
        System.out.println(tabs2);
        getDriver().switchTo().window(tabs2.get(1));
        System.out.println(getDriver().getWindowHandle());

        waitFor(clickTodasFotos).isVisible();
        clickTodasFotos.click();

        //waitFor(5).seconds();
        //act.moveToElement(clickTodasFotos).click().perform();

        //waitFor(clickFoto).isVisible();
        //act.moveToElement(clickFoto).click().perform();
        pagSiguiente.click();

        for (int i = 4; i <= 8; i += 2) {
            $("//*[@id=\"taplc_pv_resp_content_hero_0\"]/div/div[2]/div[2]//div["+i+"]").click();

            Serenity.takeScreenshot();
            waitFor(2).seconds();
        }
            $("//span[@class='ui_overlay ui_modal no_padding fullscreen']//div[@class='ui_close_x']").click();

            int dir = $("//*[@id=\"REVIEWS\"]/div[1]/div/div[1]").getCoordinates().onPage().getY();
            JavascriptExecutor js = (JavascriptExecutor) getDriver();
            js.executeScript("window.scrollTo(0," + dir + ");");

            $("//*[@id=\"taplc_detail_filters_rr_resp_0\"]/div/div[1]/div/div[2]/div[1]/div/div[2]/div/div[3]/label").click();
            //$("//*[@id=\"rn553637347\"]").click();


            /*int cor = $("//*[@id=\\\"rn553637347\\\"]").getCoordinates().onPage().getY();
            JavascriptExecutor jsee = (JavascriptExecutor) getDriver();
            jsee.executeScript("window.scrollTo(0," + cor + ");");*/

            Serenity.takeScreenshot();

            //waitFor(btnEscribirOpinion).isVisible();

    }

    public void clickOpinion() throws AWTException {

        int cor = $("//*[@id='REVIEWS']/div[1]/div").getCoordinates().onPage().getY();
        int corr = cor -80;
            JavascriptExecutor jsee = (JavascriptExecutor) getDriver();
            jsee.executeScript("window.scrollTo(0," + corr + ");");



        Actions action = new Actions(getDriver());
        WebElement jjpp = getDriver().findElement(By.xpath("//div[@class='block_header block_title']//div//child::a"));
        waitFor(2).seconds();
        action.contextClick(jjpp).build().perform();
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);


        System.out.println(getDriver().getWindowHandle());
        ArrayList<String> tabs3 = new ArrayList<String>(getDriver().getWindowHandles());
        System.out.println(tabs3);
        waitFor(2).seconds();
        getDriver().switchTo().window(tabs3.get(2));
        System.out.println(getDriver().getWindowHandle());

        Point coord = getDriver().findElement(By.xpath("//span[@id='bubble_rating']")).getLocation();
        new Actions(getDriver()).moveByOffset(coord.x+145,coord.y+32).click().build().perform();
        //lblTituloOpinion.click();
        lblTituloOpinion.sendKeys("Muy bueno");
        lblOpinion.click();
        lblOpinion.sendKeys("Comida muy rica");
        btnTipoVisita.click();
        btnRazonVisita.click();
        /*Robot robot1 = new Robot();
        robot1.keyPress(KeyEvent.VK_DOWN);
        robot1.keyPress(KeyEvent.VK_ENTER);*/

        btnRazonDesayuno.getText().equals("Desayuno");
        //action.moveToElement(btnRazonDesayuno).click().perform();
        btnFechaVisita.click();
        /*Robot robot2 = new Robot();
        robot2.keyPress(KeyEvent.VK_DOWN);
        robot2.keyPress(KeyEvent.VK_ENTER)*/;
        action.moveToElement(btnOctubre).click().perform();


        btnGamaMedia.click();
        btnCheck.click();
        btnEnviarOpinion.click();





    }
}
