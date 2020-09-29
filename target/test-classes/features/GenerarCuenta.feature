Feature: Como usuario nuevo en esta Api quiero poder empezar a utilizarla creandome una cuenta

  @CrearCuenta @Success
  Scenario Outline: Creo mi usuario
    When se ejecuta la '<operation>' al '<entity>' endpoint con los datos '<jsonName>'
    Then I will get the proper status code '<statusCode>'
    And The proper 'Id' '<id>' returned in the response

    Examples:
      | jsonName            | statusCode | id | operation | entity        |
      | request/crearUser   | 200        |    | POST      | CREAR_USER    |
