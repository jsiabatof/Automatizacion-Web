package com.choucair.formacion.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

@DefaultUrl("http://automatizacion.herokuapp.com/pperez/")
public class IngresosInicioPage extends PageObject{
	@FindBy(xpath="//SMALL[text()='Ejercicios de automatización - Sistema de administración de hospitales']")
	public WebElementFacade lblHome;
	
	public void VerificarHome() {
		String labelv ="Ejercicios de automatización - Sistema de administración de hospitales";
		String strMensaje = lblHome.getText();
		assertThat(strMensaje, containsString(labelv));
	}
}
