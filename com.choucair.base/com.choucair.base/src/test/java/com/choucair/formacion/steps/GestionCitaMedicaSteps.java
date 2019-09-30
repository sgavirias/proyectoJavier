package com.choucair.formacion.steps;

import com.choucair.formacion.pageobjects.GestionCitaMedicaPageObject;
import net.thucydides.core.annotations.Step;

public class GestionCitaMedicaSteps {

    GestionCitaMedicaPageObject gestionCitaMedicaPageObject;

    @Step

    public void abrirRegristro() {
        gestionCitaMedicaPageObject.open();

    }
    @Step
    public void RegistroDoctor(String srtNombre, String srtApellido, String srtTelefono, String srtDocumento) {
        gestionCitaMedicaPageObject.RegistrarDoctor(srtNombre, srtApellido, srtTelefono, srtDocumento);

    }
    @Step
    public void ValidarRegistro() {
        gestionCitaMedicaPageObject.Validar_Home();

    }


}
