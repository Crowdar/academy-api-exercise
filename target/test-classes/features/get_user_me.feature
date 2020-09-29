Feature: Crowdar API
  COMO user de Crowdar API
  DESEO obtener información del usuario
  PARA mostrar las mismas

  @User @200 @Get @Success
  Scenario Outline: A scenario
    When realizo una petición '<operation>' a '<entity>' al endpoint usuario - '<request>'
    Then obtengo el codigo de status '<statusCode>'
    And la informacion es correcta respecto a '<response>'
    Examples:
    | request             |statusCode | operation | entity  | response|
    | request/rq_user_me  | 200       | GET       | USER    | user_me |