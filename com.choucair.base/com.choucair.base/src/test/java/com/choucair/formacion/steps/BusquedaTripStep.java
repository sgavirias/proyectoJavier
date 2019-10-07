package com.choucair.formacion.steps;

import com.choucair.formacion.pageobjects.BusquedaTripPage;
import net.thucydides.core.annotations.Step;

import java.awt.*;

public class BusquedaTripStep {

    BusquedaTripPage busquedaTripPage;


    @Step

    public void registrarse() {
        busquedaTripPage.open();


    }

    @Step

    public void busquedaLugar() throws AWTException {

        busquedaTripPage.busquedaSitio();
        busquedaTripPage.busquedaRestaurante();
        busquedaTripPage.clickOpinion();


    }



}
