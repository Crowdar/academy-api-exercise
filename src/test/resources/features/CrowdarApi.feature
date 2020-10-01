Feature: Api de Crowdar
  Como un usuario de la api quiero ejecutar los requests paara obtener las respuestas correspondientes

  @Login @Smoke
  Scenario Outline: Iniciar sesión y obtener token jwt
    
    When Realizo una peticion '<operation>' hacia '<entity>' endpoint con el archivo '<jsonName>'
    Then Obtengo el codigo de estado '<statusCode>'
    And El correspondiente '<property>' con valor '<value>' como parte de la respuesta
    
    Examples:
      | jsonName    				| statusCode |property  | value 			 | operation | entity |
      | request/login				| 200        |username	| admin    		 | POST      | USER   |
      | request/loginFail   | 401        |error			| Unauthorized | POST      | USER   |
      #| request/login				| 404        |error			| Not Found    | GET       | USER   |
    
#	@Authors @Smoke
  #Scenario Outline: realizar peticion de Autores
    #
    #When Realizo una petición '<operation>' hacia '<entity>' endpoint con el archivo '<jsonName>'
    #Then Obtengo el codigo de estado '<statusCode>'
    #
    #Examples:
      #| jsonName    									| statusCode | operation | entity  |
      #| request/authorsDistinct				| 200        | POST      | AUTHORS |
      #| request/authorsCount 					| 401        | POST      | AUTHORS |
      

      