package com.choucair.formacion.definition;

import com.choucair.formacion.steps.GestionCitaMedicaSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class GestionCitaMedicaDefinitions {

    @Steps

    GestionCitaMedicaSteps gestionCitaMedicaSteps;

    @Given("^Que carlos necesita registrar un nuevo doctor$")
    public void que_carlos_necesita_registrar_un_nuevo_doctor() {
        gestionCitaMedicaSteps.abrirRegristro();
    }



    @When("^El realiza el registro del mismo en el aplicativo de Administracion de Hospitales nombre \"([^\"]*)\" apellido \"([^\"]*)\" telefono \"([^\"]*)\" documento\"([^\"]*)\"$")
    public void el_realiza_el_registro_del_mismo_en_el_aplicativo_de_Administracion_de_Hospitales_nombre_apellido_telefono_documento(String nombre, String apellido, String telefono, String documento)  {
       gestionCitaMedicaSteps.RegistroDoctor(nombre,apellido,telefono,documento);
    }

    @Then("^El verifica que se presente en pantalla el mensaje Datos guardados correctamente$")
    public void el_verifica_que_se_presente_en_pantalla_el_mensaje_Datos_guardados_correctamente()  {
        gestionCitaMedicaSteps.ValidarRegistro();

    }

}

