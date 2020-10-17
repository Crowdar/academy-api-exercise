Feature: Swagger_UI API
  @Token  #JasonWebToken
  Scenario Outline: Obtengo un jwt del usuario
    When realizo una peticion '<operation>' a '<entity>' al endpoint authenticate - '<request>'
    Then obtengo el codigo de status '<statusCode>'
    And obtengo un token
    Examples:
      | request                      | statusCode | operation | entity |
      | request/rq_user_authenticate | 200        | POST      | USER_A |

  @Token #InfoUser
  Scenario Outline: Obtengo la información del usuario
    When realizo una peticion '<operation>' a '<entity>' al endpoint usuario - '<request>'
    Then obtengo el codigo de status '<statusCode>'
    And la informacion es correcta
    Examples:
      | request            | statusCode | operation | entity |
      | request/rq_user_me | 200        | GET       | USER   |

  @Token
  Scenario Outline: obtener el promedio de duración de pruebas de categorías sobre N informes
    When realizo una peticion '<operation>' a '<entity>' al endpoint test - '<request>'
    Then obtengo el codigo de status '<statusCode>'
    And la data es correcta
    Examples:
      | request            | statusCode | operation | entity  |
      | request/rq_testing | 200        | GET       | TESTING |

  @Token #DatosDePrueba
  Scenario Outline: Creo update de prueba
    When realizo una peticion '<operation>' a '<entity>' al endpoint testupdate - '<request>'
    Then obtengo el codigo de status '<statusCode>'
    Examples:
      | request                | statusCode | operation | entity |
      | request/rq_test_update | 201        | POST      | UPDATE |

  @Token #CategoryTime
  Scenario Outline: Obtengo el promedio de tiempo tomado por categoría sobre N informes
    When realizo un request '<operation>' a '<entity>' al endpoint time - '<request>'
    Then obtengo el codigo de status '<statusCode>'
    And la info es correcta
    Examples:
      | request         | statusCode | operation | entity |
      | request/rq_time | 200        | GET       | TIME   |

  @Token #Reports
  Scenario Outline: Obtengo el reporte de agregación de dias pasados
    When realizo una peticion '<operation>' a '<entity>' al endpoint reports - '<request>'
    Then obtengo el codigo de status '<statusCode>'
    And la data esta correcta
    Examples:
      | request            | statusCode | operation | entity  |
      | request/rq_reports | 200        | GET       | REPORTS |

  @Token  #ReportsData
  Scenario Outline: Obtengo los reportes y su información
    When realizo una peticion '<operation>' a '<entity>' al endpoint reportes - '<request>'
    Then obtengo el codigo de status '<statusCode>'
    And la data esta ok
    Examples:
      | request              | statusCode | operation | entity   |
      | request/rq_reports_q | 200        | GET       | REPORTSQ |

  @Token #CountsReports
  Scenario Outline: Obtengo la cantidad de test ejecutados
    When realizo una peticion '<operation>' a '<entity>' al endpoint count - '<request>'
    Then obtengo el codigo de status '<statusCode>'
    Examples:
      | request                  | statusCode | operation | entity |
      | request/rq_count_reports | 200        | GET       | COUNT  |

  @Token #ErrorStatus
  Scenario Outline: Creo un estado de error en el proyecto
    When realizo una peticion '<operation>' a '<entity>' al endpoint error - '<request>'
    Then obtengo el codigo de status '<statusCode>'
    Examples:
      | request                | statusCode | operation | entity |
      | request/rq_error_state | 200        | POST      | ERROR  |

  @Token #User_assign
  Scenario Outline: Asigno un usuario para un proyecto
    When realizo una peticion '<operation>' a '<entity>' al endpoint assign - '<request>'
    Then obtengo el codigo de status '<statusCode>'
    Examples:
      | request                | statusCode | operation | entity |
      | request/rq_user_assign | 200        | POST      | ASSIGN |

  @Token #User_role
  Scenario Outline: Creo un rol para un usuario de un proyecto
    When realizo una peticion '<operation>' a '<entity>' al endpoint rol - '<request>'
    Then obtengo el codigo de status '<statusCode>'
    Examples:
      | request              | statusCode | operation | entity |
      | request/rq_user_role | 200        | POST      | ROLE   |