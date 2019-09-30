package com.choucair.formacion.definition;


import com.choucair.formacion.steps.GestionRegistroPacienteSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class GestionRegistroPacienteDefinitions {

    @Steps

    GestionRegistroPacienteSteps gestionRegistroPacienteSteps;


    @Given("^que Carlos necesita registrar un nuevo paciente$")
    public void que_Carlos_necesita_registrar_un_nuevo_paciente() {

        gestionRegistroPacienteSteps.abrirRegistroPaciente();

    }

    @When("^el realiza el registro del mismo en el aplicativo de Administración de Hospitales nombrePaciente \"([^\"]*)\" apellidoPaciente \"([^\"]*)\" telefonoPaciente \"([^\"]*)\" documentoPaciente \"([^\"]*)\"$")
    public void el_realiza_el_registro_del_mismo_en_el_aplicativo_de_Administración_de_Hospitales_nombrePaciente_apellidoPaciente_telefonoPaciente_documentoPaciente(String nombrePaciente, String apellidoPaciente, String telefonoPaciente, String documentoPaciente){
            gestionRegistroPacienteSteps.registroPaciente(nombrePaciente,apellidoPaciente,telefonoPaciente,documentoPaciente);
    }


    @Then("^el verifica que se presente en pantalla el mensaje Datos guardados correctamente$")
    public void el_verifica_que_se_presente_en_pantalla_el_mensaje_Datos_guardados_correctamente() {

        gestionRegistroPacienteSteps.verificarRegistroPaciente();

    }
}
