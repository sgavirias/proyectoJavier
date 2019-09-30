package com.choucair.formacion.definition;

import com.choucair.formacion.steps.AgendamientoCitaSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Step;

public class AgendamientoCitaDefinitions {

    AgendamientoCitaSteps agendamientoCitaSteps;

    @Step

    @Given("^que Carlos necesita asistir al medico$")
    public void que_Carlos_necesita_asistir_al_medico() {

        agendamientoCitaSteps.abrirCita();
    }

    @When("^el realiza el agendamiento de una Cita dia \"([^\"]*)\"$")
    public void el_realiza_el_agendamiento_de_una_Cita_dia(String arg1)  {

        agendamientoCitaSteps.registroCita();

    }

    @Then("^El verifica que se presente en pantalla el mensaje Datos guardados$")
    public void el_verifica_que_se_presente_en_pantalla_el_mensaje_Datos_guardados()  {

        agendamientoCitaSteps.verificarCita();

    }
}
