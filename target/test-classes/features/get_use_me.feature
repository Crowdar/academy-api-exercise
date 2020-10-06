Feature: Swagger_UI API
  COMO usario de Swagger_UI API
  DESEO obtener la informacion del usuario
  PARA mostrar las mismas

  @UserMe
  Scenario Outline: Obtengo la información del usuario
    When realizo una peticion '<operation>' a '<entity>' al endpoint usuario - '<request>'
    Then obtengo el codigo de status '<statusCode>'
    And la informacion es correcta
    Examples:
      | request            | statusCode | operation | entity |
      | request/rq_user_me | 200        | GET       | USERME   |