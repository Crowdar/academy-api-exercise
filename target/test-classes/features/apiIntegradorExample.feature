Feature: Como usuario de la api, quiero enviar mis credenciales acceso para obtener un token que me permita realizar peticiones

  @Integrador @Login
  Scenario Outline: Envio credenciales de login y obtengo el token de respuesta
    When realizo una peticion '<operation>' a '<entity>' al endpoint - '<request>'
    Then obtengo el status code '<statusCode>'
    And obtengo token de respuesta

    Examples:
      | request                   | statusCode | operation |    entity  |
      | request/postRequest       | 200        |  POST     |    LOGIN   |

    @Integrador
    Scenario Outline: Obtengo datos de mi usuario
      When realizo una peticion '<operation>' a '<entity>' al endpoint - '<request>'
      Then obtengo el status code '<statusCode>'
      And verifico que el id '<idUser>' es correcto

      Examples:
        | request                 | statusCode | operation |    entity       | idUser                 |
        | request/getUserRequest   | 200        |  GET      |   USEREXAMEN   |5efe2a630d248f00012fa872|


