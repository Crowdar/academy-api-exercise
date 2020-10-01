Feature: CrowdarOnline Api
  Como usuario de Crowdar API
  DESEO obtener valores
  PARA mostrar las mismas


  @Successvps
  Scenario Outline: Obtener información del user-rest-controller
    When el cliente realiza una '<operation>' a '<entity>' al endpoint '<request>'
    Then el cliente obtiene el status code '<statusCode>'

    Examples:
      | request             | statusCode | operation | entity |
      | request/userRequest | 200        | GET       | USERS  |


  @Authored
  Scenario Outline: Obtener el token del user
    When el cliente hace una '<operation>' a '<entity>' al endpoint '<request>'
    Then el cliente obtiene el status code '<statusCode>'

    Examples:
      | request                   | statusCode |operation | entity               |
      | request/userAuthenticate  | 200        |POST      | AUTHENTICATEDUSERS   |
