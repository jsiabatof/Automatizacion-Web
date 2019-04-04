package com.choucair.formacion.steps;

import java.util.List;

import com.choucair.formacion.pageobjects.IngresosFormularioAgendarPage;
import com.choucair.formacion.pageobjects.IngresosFormularioPacientePage;
import com.choucair.formacion.pageobjects.IngresosFormularioPage;

import net.thucydides.core.annotations.Step;

public class IngresosFormularioSteps {
	
	IngresosFormularioPage ingresosFormularioPage;
	IngresosFormularioPacientePage ingresosFormularioPacientePage;
	IngresosFormularioAgendarPage ingresosFormularioAgendarPage;
	
	@Step
	public void diligenciar_agregar_doctor(List<List<String>> data, int id) {
		ingresosFormularioPage.nombre(data.get(id).get(0).trim());
		ingresosFormularioPage.apellidos(data.get(id).get(1).trim());
		ingresosFormularioPage.telefono(data.get(id).get(2).trim());
		ingresosFormularioPage.tipodoc(data.get(id).get(3).trim());
		ingresosFormularioPage.documento(data.get(id).get(4).trim());
		ingresosFormularioPage.guardar();
	}
	
	@Step
	public void verificar_ingreso_datos_exitosos() {
		ingresosFormularioPage.guardado_correctamente();
	}
	
	@Step
	public void diligenciar_agregar_paciente(List<List<String>> data2, int id) {
		ingresosFormularioPacientePage.nombre(data2.get(id).get(0).trim());
		ingresosFormularioPacientePage.apellidos(data2.get(id).get(1).trim());
		ingresosFormularioPacientePage.telefono(data2.get(id).get(2).trim());
		ingresosFormularioPacientePage.tipodoc(data2.get(id).get(3).trim());
		ingresosFormularioPacientePage.documento(data2.get(id).get(4).trim());
		ingresosFormularioPacientePage.check();
		ingresosFormularioPacientePage.guardar();
	}
	
	@Step
	public void verificar_ingreso_datos_exitosos_paciente() {
		ingresosFormularioPacientePage.guardado_correctamente();
	}
	
	@Step
	public void diligenciar_agendar_cita(List<List<String>> data3, int id) {
		ingresosFormularioAgendarPage.dia(data3.get(id).get(0).trim());
		ingresosFormularioAgendarPage.docpaciente(data3.get(id).get(1).trim());
		ingresosFormularioAgendarPage.docdoctor(data3.get(id).get(2).trim());
		ingresosFormularioAgendarPage.observaciones(data3.get(id).get(3).trim());
		ingresosFormularioAgendarPage.guardar();
	}

	public void verificar_ingreso_datos_exitosos_agenda() {
		ingresosFormularioAgendarPage.guardado_correctamente();
	}
	
}
