Feature: Crowdar API
  COMO user de Crowdar API
  DESEO obtener información de las categorias
  PARA conocer el promedio del tiempo, largo del test

  @Categories @200 @Get @Success
  Scenario Outline: A scenario
    When realizo una petición '<operation>' a '<entity>' al endpoint usuario - '<request>'
    Then obtengo el codigo de status '<statusCode>'
    And la informacion es correcta respecto a '<response>'
    Examples:
      | request                   |statusCode | operation | entity        | response         |
      | request/rq_time_taken     | 200       | GET       | CATEGORIES    | cat_time_taken   |
      | request/rq_test_length    | 200       | GET       | CATEGORIES    | cat_test_length  |