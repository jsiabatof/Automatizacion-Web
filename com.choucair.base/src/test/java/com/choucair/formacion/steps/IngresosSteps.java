package com.choucair.formacion.steps;

import com.choucair.formacion.pageobjects.IngresosInicioPage;
import com.choucair.formacion.pageobjects.IngresosMenuPage;

import net.thucydides.core.annotations.Step;

public class IngresosSteps {
	
	IngresosInicioPage ingresosInicioPage;
	IngresosMenuPage ingresosMenuPage;
	
	@Step
	public void ingresos_inicio() {
		ingresosInicioPage.open();
		ingresosInicioPage.VerificarHome();
	}
	
	@Step
	public void ingresar_agregar_doctor() {
		ingresosMenuPage.menu_agregar_doctor();
	}
	
	@Step
	public void ingresar_agregar_paciente() {
		ingresosMenuPage.menu_agregar_paciente();
	}
	
	@Step
	public void agendar_cita() {
		ingresosMenuPage.menu_agendar_cita();
	}
}
