package ar.steps;

import api.model.Token;
import com.crowdar.api.rest.APIManager;
import io.cucumber.java.en.Given;
import services.UserService;

public class CargarTokenSteps {

    @Given("el token es creado")
    public void elTokenEsCreado() {
        Token response = (Token) APIManager.getLastResponse().getResponse();
        UserService.TOKEN.set(response.getJwt());
    }
}
