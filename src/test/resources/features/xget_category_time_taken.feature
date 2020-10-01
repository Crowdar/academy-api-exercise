Feature: Swagger_UI API
  COMO usario de Swagger_UI API
  DESEO obtener el promedio de tiempo que toma una búsqueda
  PARA mostrar el tag y su tiempo

  @Authors @Success @swaggerTest
  Scenario Outline: Obtengo la información del usuario
    #Given el token es creado
    When realizo una peticion '<operation>' a '<entity>' al endpoint - '<request>'
    Then obtengo el codigo de status '<statusCode>'
    And los datos son correctos
    Examples:
      | request                  | statusCode | operation | entity            |
      | request/rq_cgry_tme_tken | 200        | GET       | CATEGORYTIMETAKEN |





