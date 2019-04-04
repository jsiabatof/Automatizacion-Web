package com.choucair.formacion.pageobjects;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class IngresosMenuPage extends PageObject{
	@FindBy(xpath="//A[@href='addDoctor']")
	public WebElement MenuAgregarDoctor;
	
	@FindBy(xpath="//A[@href='addPatient']")
	public WebElement MenuAgregarPaciente;
	
	@FindBy(xpath="//A[@href='appointmentScheduling']")
	public WebElement MenuAgendarCita;
	
	@FindBy(xpath="//SMALL[text()=' Agregar doctor']")
	public WebElement lblAgregarDoctor;
	
	@FindBy(xpath="//SMALL[text()=' Agregar paciente']")
	public WebElement lblAgregarPaciente;
	
	@FindBy(xpath="//SMALL[text()=' Agendar cita']")
	public WebElement lblAgendarCita;
	
	public void menu_agregar_doctor() {
		MenuAgregarDoctor.click();
		String strMensaje = lblAgregarDoctor.getText();
		assertThat(strMensaje, containsString("Agregar doctor"));
	}

	public void menu_agregar_paciente() {
		MenuAgregarPaciente.click();
		String strMensaje = lblAgregarPaciente.getText();
		assertThat(strMensaje, containsString("Agregar paciente"));
	}

	public void menu_agendar_cita() {
		MenuAgendarCita.click();
		String strMensaje = lblAgendarCita.getText();
		assertThat(strMensaje, containsString("Agendar cita"));
	}
}
