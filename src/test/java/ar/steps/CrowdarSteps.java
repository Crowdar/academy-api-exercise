package ar.steps;

import api.config.EntityConfiguration;
import api.model.ResponseHeaders;
import api.model.UserToken;
import com.crowdar.api.rest.APIManager;
import com.crowdar.core.PageSteps;
import cucumber.api.java.en.When;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import services.UserCrowdarService;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class CrowdarSteps extends PageSteps {


    @When("realizo una peticion '(.*)' a '(.*)' al enpoint de Crowdar - '(.*)'")
    public void realizoUnaPeticionOperationAEntityAlEnpointDeCrowdarRequest(String operacion, String entity, String request)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        EntityConfiguration.valueOf(entity).getEntityService().getMethod(operacion.toLowerCase(),String.class).invoke("",request);
    }

    @Then("obtengo el status code '(.*)'")
    public void obtengoElStatusCodeStatusCode(int expCode) {
        int statusCode = APIManager.getLastResponse().getStatusCode();
        Assert.assertEquals(statusCode, expCode);
    }

    @Then("guardo el Token")
    public void guardoElTokenEnTokenResponse(){
        UserToken response = (UserToken) APIManager.getLastResponse().getResponse();
        UserCrowdarService.TOKEN.set(response.getJwt());
    }
}
