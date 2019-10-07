Feature: realizar busqueda de lugar para viajar en TripAdvisor
         Como usuario registrado
         Quiero buscar un lugar de Antioquia y un restaurante para ir a comer
         Para luego tomar evidencia de esto

  Scenario: realizar la busqueda de un sitio y un restaurante para comer

    Given que me registro en la pagina tripadvisor
    When  selecciono el lugar y el restaurante
    Then  tomo las evidencias necesarias