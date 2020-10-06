Feature: CrowdarApi


  @CrearToken @Example @Success
  Scenario Outline: Crear Token
    When realizo una petición '<operation>' a '<entity>' al endpoint - '<request>'
    Then obtengo el codigo de status '<statusCode>'
    Then guardo el token

    Examples:
      | request                    | statusCode | operation | entity       |
      | request/cargarToken        | 200        | POST      | TOKEN        |