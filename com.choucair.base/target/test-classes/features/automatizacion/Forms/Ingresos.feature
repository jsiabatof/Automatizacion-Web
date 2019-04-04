#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Regresion
Feature: Gestionar cita medica
  Como paciente
  Quiero realizarla solictud de una cita médica
  A través del sistema de Administración de Hospitales 

  @Caso1
  Scenario: Realizar el Registro de un Doctor
    Given Que Carlos necesita registrar un nuevo doctor
    When el realiza el registro del mismo en el aplicativo de Administración de Hospitales
    | Nombre completo | Apellidos |  Teléfono  | Tipo de documento de identidad | Documento de identidad |
    | 		Carlos			|  Puerta 	|  22222222  |     Cédula de ciudadanía 			| 			1111111112			 |
    Then el verifica que se presente en pantalla el mensaje Datos guardados correctamente
    
   @Caso2
  Scenario: Realizar el Registro de un Paciente
    Given Que Carlos necesita registrar un nuevo paciente
    When el realiza el registro del paciente en el aplicativo de Administración de Hospitales
    | Nombre completo | Apellidos |  Teléfono  | Tipo de documento de identidad | Documento de identidad |
    | 		Carlos			|  Ramirez  |  222222222 |     Cédula de ciudadanía 			| 			1111111111			 |
    Then el verifica que los datos fueran guardados cuando se presente en pantalla el mensaje Datos guardados correctamente
    
    @Caso3
  Scenario: Realizar el Agendamiento de una Cita
    Given Que Carlos necesita asistir al medico
    When el realiza el agendamiento de una cita
    | Día de la cita | Documento de identidad del paciente |  Documento de identidad del doctor  | Observaciones |
    |   03/30/2019	 |            1111111111               |              1111111112             |  Cita Medica  |
    Then el verifica que los datos de la cita fueran guardados cuando se presente en pantalla el mensaje Datos guardados correctamente

