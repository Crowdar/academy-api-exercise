Feature: Crowdar API
  COMO user de Crowdar API
  DESEO Crear un reporte
  PARA tenerlo en la base de datos

  @Update @201 @Post @Success
  Scenario Outline: A scenario
    When realizo una petición '<operation>' a '<entity>' al endpoint usuario - '<request>'
    Then obtengo el codigo de status '<statusCode>'
    Examples:
      | request                  |statusCode | operation | entity  |
      | request/rq_test_update   | 201       | POST      | UPDATE  |