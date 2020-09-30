Feature: Api
  @Api
  Scenario Outline: Crear Token
    Given relizo una peticion <operation> a <entity> al endpoint de Crowdar <request>
    When obtengo el <statuscode>
    Then guardo el Token

    Examples:
    | request               | statuscode | operation | entity |
    | request/generateToken | 200        | POST      | TOKEN  |

  @Api
  Scenario Outline: Obtener lista de Projects
    Given relizo una peticion <operation> a <entity> al endpoint de Crowdar <request>
    When obtengo el <statuscode>

    Examples:
      | request                   | statuscode | operation | entity     |
      | request/getProjects       | 200        | GET       | PROJECTS   |
      | request/errorTokenRequest | 403        | GET       | ERROR      |
