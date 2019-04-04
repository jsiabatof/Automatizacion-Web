package com.choucair.formacion.pageobjects;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class IngresosFormularioPacientePage extends PageObject{
	@FindBy(xpath="(//INPUT[@type='text'])[1]")
	public WebElementFacade txtNombre;
	
	@FindBy(xpath="(//INPUT[@type='text'])[2]")
	public WebElementFacade txtApellidos;
	
	@FindBy(xpath="(//INPUT[@type='text'])[3]")
	public WebElementFacade txtTelefono;
	
	@FindBy(xpath="//SELECT[@class='form-control']")
	public WebElementFacade cbmTipoDoc;
	
	@FindBy(xpath="(//INPUT[@type='text'])[4]")
	public WebElementFacade txtDoc;
	
	@FindBy(xpath="//INPUT[@type='checkbox']")
	public WebElementFacade check;
	
	@FindBy(xpath="//A[@onclick='submitForm()'][text()='Guardar']")
	public WebElementFacade btnGuardar;
	
	@FindBy(xpath="//DIV[@class='panel-body']")
	public WebElementFacade MenInformativo;
	
	
	public void nombre(String datoPrueba) {
		txtNombre.click();
		txtNombre.clear();
		txtNombre.typeAndTab(datoPrueba);
	}
	public void apellidos(String datoPrueba) {
		txtApellidos.click();
		txtApellidos.clear();
		txtApellidos.typeAndTab(datoPrueba);
	}
	public void telefono(String datoPrueba) {
		txtTelefono.click();
		txtTelefono.clear();
		txtTelefono.typeAndTab(datoPrueba);
	}
	public void tipodoc(String datoPrueba) {
		cbmTipoDoc.click();
		cbmTipoDoc.selectByValue(datoPrueba);		
	}
	public void documento(String datoPrueba) {
		txtDoc.click();
		txtDoc.clear();
		txtDoc.typeAndTab(datoPrueba);
	}
	public void check() {
		check.click();
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
