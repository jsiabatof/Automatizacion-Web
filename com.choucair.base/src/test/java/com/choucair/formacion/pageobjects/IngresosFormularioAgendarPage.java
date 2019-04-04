package com.choucair.formacion.pageobjects;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class IngresosFormularioAgendarPage extends PageObject{
	@FindBy(xpath="//INPUT[@id='datepicker']")
	public WebElementFacade txtDia;
	
	@FindBy(xpath="(//INPUT[@type='text'])[2]")
	public WebElementFacade txtDocPaciente;
	
	@FindBy(xpath="(//INPUT[@type='text'])[3]")
	public WebElementFacade txtDocDoctor;
	
	@FindBy(xpath="//TEXTAREA[@class='form-control']")
	public WebElementFacade txtOberservaciones;
	
	@FindBy(xpath="//A[@onclick='submitForm()'][text()='Guardar']")
	public WebElementFacade btnGuardar;
	
	@FindBy(xpath="//DIV[@class='panel-body']")
	public WebElementFacade MenInformativo;
	
	
	public void dia(String datoPrueba) {
		txtDia.click();
		txtDia.clear();
		txtDia.typeAndTab(datoPrueba);
	}
	public void docpaciente(String datoPrueba) {
		txtDocPaciente.click();
		txtDocPaciente.clear();
		txtDocPaciente.typeAndTab(datoPrueba);
	}
	public void docdoctor(String datoPrueba) {
		txtDocDoctor.click();
		txtDocDoctor.clear();
		txtDocDoctor.typeAndTab(datoPrueba);
	}
	public void observaciones(String datoPrueba) {
		txtOberservaciones.click();
		txtOberservaciones.clear();
		txtOberservaciones.typeAndTab(datoPrueba);
	}
	public void guardar() {
		btnGuardar.click();
	}
	public void guardado_correctamente() {
		String labelv ="Datos guardados correctamente.";
		String strMensaje = MenInformativo.getText();
		assertThat(strMensaje, containsString(labelv));
	}
}
