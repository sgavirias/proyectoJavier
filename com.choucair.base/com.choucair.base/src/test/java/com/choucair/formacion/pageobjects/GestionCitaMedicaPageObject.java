package com.choucair.formacion.pageobjects;

import org.hamcrest.Matcher;
import org.openqa.selenium.By;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;


@DefaultUrl("http://automatizacion.herokuapp.com/pperez/")
public class GestionCitaMedicaPageObject extends PageObject {



    public void RegistrarDoctor(String srtNombre, String srtApellido, String srtTelefono, String srtDocumento) {
        find(By.xpath("//*[@href='addDoctor']")).click();
        find(By.id("name")).sendKeys(srtNombre);
        find(By.xpath("//*[@id='last_name']")).sendKeys(srtApellido);
        find(By.xpath("//*[@id='telephone']")).sendKeys(srtTelefono);
        find(By.xpath("//*[@id='identification_type']")).click();
        find(By.xpath("//*[@id='identification_type']/option[2]")).click();
        find(By.xpath("//*[@id='identification']")).sendKeys(srtDocumento);
        find(By.xpath("//*[@id='page-wrapper']/div/div[3]/div/a")).click();

    }

    public void Validar_Home() {
        String lblHomePpal = find(By.xpath("//*[@id='page-wrapper']/div/div[2]/div[2]/p")).getText();
        String labelv = "Datos guardados correctamente.";
       assertThat(lblHomePpal, containsString(labelv));
    }


}
