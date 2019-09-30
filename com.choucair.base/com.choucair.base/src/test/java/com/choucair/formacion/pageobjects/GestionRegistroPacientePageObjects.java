package com.choucair.formacion.pageobjects;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

@DefaultUrl("http://automatizacion.herokuapp.com/pperez/")
public class GestionRegistroPacientePageObjects extends PageObject {


    public void registroPaciente(String nombrePaciente, String apellidoPaciente, String telefonoPaciente, String documentoPaciente) {
        find(By.xpath("//a[@href='addPatient']")).click();
        find(By.xpath("//*[@id='page-wrapper']/div/div[3]/div/div[1]/input")).sendKeys(nombrePaciente);
        find(By.xpath("//*[@id='page-wrapper']/div/div[3]/div/div[2]/input")).sendKeys(apellidoPaciente);
        find(By.xpath("//*[@id='page-wrapper']/div/div[3]/div/div[3]/input")).sendKeys(telefonoPaciente);
        find(By.xpath("//*[@id='page-wrapper']/div/div[3]/div/div[4]/select")).click();
        find(By.xpath("//*[@id='page-wrapper']/div/div[3]/div/div[4]/select/option[1]")).click();
        find(By.xpath("//*[@id='page-wrapper']/div/div[3]/div/div[5]/input")).sendKeys(documentoPaciente);
        find(By.xpath("//a[@class='btn btn-primary pull-right']")).click();

    }

    public void verficarRegistroPaciente() {
        String lblHomePpal = find(By.xpath("//div[@class='panel-body']/p")).getText();
        System.out.println(lblHomePpal);
        String labelv = "Datos guardados correctamente.";
        assertThat(lblHomePpal, containsString(labelv));
    }
}
