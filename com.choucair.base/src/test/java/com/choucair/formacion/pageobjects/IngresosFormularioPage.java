package com.choucair.formacion.pageobjects;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class IngresosFormularioPage extends PageObject{
	@FindBy(xpath="//INPUT[@id='name']")
	public WebElementFacade txtNombre;
	
	@FindBy(xpath="//INPUT[@id='last_name']")
	public WebElementFacade txtApellidos;
	
	@FindBy(xpath="//INPUT[@id='telephone']")
	public WebElementFacade txtTelefono;
	
	@FindBy(xpath="//SELECT[@id='identification_type']")
	public WebElementFacade cbmTipoDoc;
	
	@FindBy(xpath="//INPUT[@id='identification']")
	public WebElementFacade txtDoc;
	
	@FindBy(xpath="//A[@onclick='submitForm()'][text()='Guardar']")
	public WebElementFacade btnGuardar;
	
	@FindBy(xpath="//*[@id=\'page-wrapper\']/div/div[2]/div[2]/p")
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
//		try{
		cbmTipoDoc.click();
		cbmTipoDoc.selectByValue(datoPrueba);		
//		}catch(Exception e) {
//			System.out.print(e.toString());
//		}
	}
	public void documento(String datoPrueba) {
		txtDoc.click();
		txtDoc.clear();
		txtDoc.typeAndTab(datoPrueba);
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
