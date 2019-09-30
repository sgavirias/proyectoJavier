Feature: cita Medica

  @RegistroD
  Scenario: Realizar registro de un doctor

    Given Que carlos necesita registrar un nuevo doctor
    When El realiza el registro del mismo en el aplicativo de Administracion de Hospitales nombre "Sebastian" apellido "Gaviria" telefono "48779" documento"999988"
    Then El verifica que se presente en pantalla el mensaje Datos guardados correctamente

  @RegistroP
  Scenario: Realizar registro de un paciente

    Given que Carlos necesita registrar un nuevo paciente
    When el realiza el registro del mismo en el aplicativo de Administración de Hospitales nombrePaciente "Santiago" apellidoPaciente "Castaño" telefonoPaciente "7458524" documentoPaciente "75647426"
    Then el verifica que se presente en pantalla el mensaje Datos guardados correctamente

  @AgendamientoCita
  Scenario: Realizar el agendamiento de una cita

    Given que Carlos necesita asistir al medico
    When el realiza el agendamiento de una Cita dia "02/07/2019" documentoPaciente "75647426" documento"999988"
    Then El verifica que se presente en pantalla el mensaje Datos guardados







