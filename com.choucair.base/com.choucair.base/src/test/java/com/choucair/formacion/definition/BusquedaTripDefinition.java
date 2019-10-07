package com.choucair.formacion.definition;

import com.choucair.formacion.steps.BusquedaTripStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.awt.*;

public class BusquedaTripDefinition {

    @Steps
    BusquedaTripStep busquedaTripStep;

    @Given("^que me registro en la pagina tripadvisor$")
    public void que_me_registro_en_la_pagina_tripadvisor(){
        busquedaTripStep.registrarse();

    }

    @When("^selecciono el lugar y el restaurante$")
    public void selecciono_el_lugar_y_el_restaurante() throws AWTException {
        busquedaTripStep.busquedaLugar();
    }

    @Then("^tomo las evidencias necesarias$")
    public void tomo_las_evidencias_necesarias(){
    }

}
