Feature: Swagger_UI API
  COMO usario de Swagger_UI API
  DESEO obtener el token
  PARA realizar testing automatizados con un parametro persistido

  @CrearToken @swaggerTest
  Scenario Outline: Crear Token
    When realizo una peticion '<operation>' a '<entity>' al endpoint - '<request>'
    Then obtengo el codigo de status '<statusCode>'
    And el token es creado

    Examples:
      | request                | statusCode | operation | entity |
      | request/rq_crear_token | 200        | POST      | TOKEN  |





