Feature: Crowdar API

  @Categories @200 @Get @Success
  Scenario Outline: Busco datos de las categorias
    When realizo una petición '<operation>' a '<entity>' al endpoint - '<request>'
    Then obtengo el codigo de status '<statusCode>'
    And la informacion es correcta respecto a '<response>'
    Examples:
      | request                   |statusCode | operation | entity        | response         |
      | request/rq_time_taken     | 200       | GET       | CATEGORIES    | cat_time_taken   |
      | request/rq_test_length    | 200       | GET       | CATEGORIES    | cat_test_length  |