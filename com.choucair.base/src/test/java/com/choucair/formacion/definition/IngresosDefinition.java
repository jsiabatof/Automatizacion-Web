package com.choucair.formacion.definition;

import java.util.List;

import com.choucair.formacion.steps.IngresosFormularioSteps;
import com.choucair.formacion.steps.IngresosSteps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class IngresosDefinition {
	
	@Steps
	IngresosSteps ingresosSteps;
	@Steps
	IngresosFormularioSteps ingresosFormularioSteps;
	
	@Given("^Que Carlos necesita registrar un nuevo doctor$")
	public void que_Carlos_necesita_registrar_un_nuevo_doctor() {
		ingresosSteps.ingresos_inicio();
	}
	
	@Given("^Que Carlos necesita registrar un nuevo paciente$")
	public void que_Carlos_necesita_registrar_un_nuevo_paciente() {
		ingresosSteps.ingresos_inicio();
	}
	
	@Given("^Que Carlos necesita asistir al medico$")
	public void que_Carlos_necesita_asistir_al_medico() {
		ingresosSteps.ingresos_inicio();
	}

	
	@When("^el realiza el registro del mismo en el aplicativo de Administración de Hospitales$")
	public void el_realiza_el_registro_del_mismo_en_el_aplicativo_de_Administración_de_Hospitales(DataTable dtDatos) {
		ingresosSteps.ingresar_agregar_doctor();
		List<List<String>> data = dtDatos.raw();
		
		for(int i=1; i<data.size(); i++) {
			ingresosFormularioSteps.diligenciar_agregar_doctor(data, i);
		}
	}
	
	@When("^el realiza el registro del paciente en el aplicativo de Administración de Hospitales$")
	public void el_realiza_el_registro_del_paciente_en_el_aplicativo_de_Administración_de_Hospitales(DataTable dtDatos2) {
		ingresosSteps.ingresar_agregar_paciente();
		List<List<String>> data2 = dtDatos2.raw();
		
		for(int i=1; i<data2.size(); i++) {
			ingresosFormularioSteps.diligenciar_agregar_paciente(data2, i);
		}
	}
	
	@When("^el realiza el agendamiento de una cita$")
	public void el_realiza_el_agendamiento_de_una_cita(DataTable dtDato3) {
		ingresosSteps.agendar_cita();
		List<List<String>> data3 = dtDato3.raw();
		
		for(int i=1; i<data3.size(); i++) {
			ingresosFormularioSteps.diligenciar_agendar_cita(data3, i);
		}
	}

	
	@Then("^el verifica que se presente en pantalla el mensaje Datos guardados correctamente$")
	public void el_verifica_que_se_presente_en_pantalla_el_mensaje_Datos_guardados_correctamente() {
		ingresosFormularioSteps.verificar_ingreso_datos_exitosos();
	}
	
	@Then("^el verifica que los datos fueran guardados cuando se presente en pantalla el mensaje Datos guardados correctamente$")
	public void el_verifica_que_los_datos_fueran_guardados_cuando_se_presente_en_pantalla_el_mensaje_Datos_guardados_correctamente() {
		ingresosFormularioSteps.verificar_ingreso_datos_exitosos_paciente();
	}
	
	@Then("^el verifica que los datos de la cita fueran guardados cuando se presente en pantalla el mensaje Datos guardados correctamente$")
	public void el_verifica_que_los_datos_de_la_cita_fueran_guardados_cuando_se_presente_en_pantalla_el_mensaje_Datos_guardados_correctamente() {
		ingresosFormularioSteps.verificar_ingreso_datos_exitosos_agenda();
	}
	
}
