Feature: Swagger_UI API
  COMO usario de Swagger_UI API
  DESEO obtener la informacion del usuario
  PARA mostrar la misma

  @User @swaggerTest @Success
  Scenario Outline: Obtengo la información del usuario
    When realizo una peticion '<operation>' a '<entity>' al endpoint - '<request>'
    Then obtengo el codigo de status '<statusCode>'
    And la informacion es correcta
    Examples:
      | request            | statusCode | operation | entity |
      | request/rq_user_me | 200        | GET       | USER   |