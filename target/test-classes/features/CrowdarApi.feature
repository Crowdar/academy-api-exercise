Feature: Crowdar Api

  @CrowdarApi
  Scenario Outline: Crear Token
    When realizo una peticion '<operation>' a '<entity>' al enpoint de Crowdar - '<request>'
    Then obtengo el status code '<statusCode>'
    Then guardo el Token

    Examples:
      | request                    | statusCode | operation | entity       |
      | request/generateToken      | 200        | POST      | TOKEN        |

  @CrowdarApi
  Scenario Outline: Solicitar mi usuario
    When realizo una peticion '<operation>' a '<entity>' al enpoint de Crowdar - '<request>'
    Then obtengo el status code '<statusCode>'
    Examples:
      | request                         | statusCode | operation | entity       |
      | request/userCrowdarRequest      | 200        | GET       | USER_CROWDAR |
      | request/errorUserCrowdarRequest | 403        | GET       | ERROR        |