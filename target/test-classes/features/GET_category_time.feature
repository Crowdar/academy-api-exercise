Feature: Swagger_UI API
  COMO usario de Swagger_UI API
  DESEO obtener la informacion categoryTime
  PARA mostrar las mismas

  @CategoryTime
  Scenario Outline: Obtengo la información del usuario
    When realizo una peticion '<operation>' a '<entity>' al endpoint categoryTime - '<request>'
    Then obtengo el codigo de status '<statusCode>'
    And la info es correcta
    Examples:
      | request                  | statusCode | operation | entity       |
      | request/rq_category_time | 200        | GET       | CATEGORYTIME |