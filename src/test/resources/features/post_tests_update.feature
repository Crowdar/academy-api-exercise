Feature: Swagger_UI API
  COMO usario de Swagger_UI API
  DESEO obtener la cantidad de autores
  PARA mostrar la misma

  @Authors @Success @swaggerTest
  Scenario Outline: Obtengo la información del usuario
    When realizo una peticion '<operation>' a '<entity>' al endpoint - '<request>'
    Then obtengo el codigo de status '<statusCode>'
    And los datos son correctoss '<jsonName>'
    Examples:
      | request                | statusCode | operation | entity      | jsonName   |
      | request/rq_test_update | 201        | POST      | TESTSUPDATE | testUpdate |





