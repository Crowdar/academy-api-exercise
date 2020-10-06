Feature: Crowdar API
  COMO user de Crowdar API
  DESEO obtener información del usuario
  PARA mostrar las mismas

  @User @200 @Success
  Scenario Outline: Solicito mi usuario
    When realizo una petición '<operation>' a '<entity>' al endpoint - '<request>'
    Then obtengo el codigo de status '<statusCode>'
    And la informacion es correcta respecto a '<response>'
    @Get
    Examples:
    | request             |statusCode | operation   | entity  | response|
    | request/rq_user_me  | 200       | GET         | USER    | user_me |
    @Post
    Examples:
    | request             |statusCode | operation   | entity  | response|
    | request/rq_remv_1   | 200       | POST        | USER    | remv_1  |