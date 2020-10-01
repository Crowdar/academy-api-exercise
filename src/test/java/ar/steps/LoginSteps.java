package ar.steps;

import api.config.EntityConfiguration;
import api.model.Login;
import api.model.UserExamen;
import com.crowdar.api.rest.APIManager;
import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import services.UserExamenService;

import java.lang.reflect.InvocationTargetException;


public class LoginSteps extends PageSteps {

    @When("realizo una peticion '(.*)' a '(.*)' al endpoint - '(.*)'")
    public void realizoUnaPeticion(String operation, String entity, String request)
            throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {

        EntityConfiguration.valueOf(entity).getEntityService().getMethod(operation.toLowerCase(), String.class).invoke("", request);
    }

    @Then("obtengo el status code '(.*)'")
    public void obtengoElStatusCode(int statusCodeEsperado) {
        int statusCodeResp = APIManager.getLastResponse().getStatusCode();
        Assert.assertEquals(statusCodeEsperado, statusCodeResp);
    }

    @And("obtengo token de respuesta")
    public void obtengoElToken() {
        Login respuesta = (Login) APIManager.getLastResponse().getResponse();

        UserExamenService.TOKEN.set(respuesta.getToken());
    }
}
