package com.choucair.formacion.steps;

import com.choucair.formacion.pageobjects.AgendamientoCitaPageObjects;
import net.thucydides.core.annotations.Step;

public class AgendamientoCitaSteps {

    AgendamientoCitaPageObjects agendamientoCitaPageObjects;

    @Step
    public void abrirCita() {

        agendamientoCitaPageObjects.open();

    }

    public void registroCita() {

        agendamientoCitaPageObjects.registroCita();
    }

    public void verificarCita() {

        agendamientoCitaPageObjects.verificarCita();
    }
}
