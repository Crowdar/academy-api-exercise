Feature: Crowdar API

  @Author @200 @Success
  Scenario Outline: A scenario
    When realizo una petición '<operation>' a '<entity>' al endpoint usuario - '<request>'
    Then obtengo el codigo de status '<statusCode>'
    #And la informacion es correcta respecto a '<response>'
    @Get
    Examples:
      | request              |statusCode | operation   | entity     | response  |
      | request/rq_distinct  | 200       | GET         | AUTHOR     | distinct  |
      | request/rq_count     | 200       | GET         | AUTHOR     | count     |