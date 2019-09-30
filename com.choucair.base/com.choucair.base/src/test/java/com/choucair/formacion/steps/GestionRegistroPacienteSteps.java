package com.choucair.formacion.steps;


import com.choucair.formacion.pageobjects.GestionRegistroPacientePageObjects;
import net.thucydides.core.annotations.Step;

public class GestionRegistroPacienteSteps {

    GestionRegistroPacientePageObjects gestionRegistroPacientePageObjects;

    @Step
    public void abrirRegistroPaciente() {

        gestionRegistroPacientePageObjects.open();
    }

    @Step
    public void registroPaciente(String nombrePaciente, String apellidoPaciente, String telefonoPaciente, String documentoPaciente) {

        gestionRegistroPacientePageObjects.registroPaciente(nombrePaciente, apellidoPaciente, telefonoPaciente, documentoPaciente);
    }

    @Step
    public void verificarRegistroPaciente() {
        gestionRegistroPacientePageObjects.verficarRegistroPaciente();
    }
}
