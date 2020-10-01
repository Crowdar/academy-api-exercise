package ar.steps;

import api.config.EntityConfiguration;
import api.model.Categories;
import api.model.User;
import api.model.UserCrowdar;
import com.crowdar.api.rest.APIManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import api.model.UserToken;
import services.UserCrowdarService;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class CrowdarApi {
    @When("realizo una petición '(.*)' a '(.*)' al endpoint - '(.*)'")
    public void realizoUnaPeticiónOperationAEntityAlEndpointUsuarioRequest(String op, String entity, String req)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
            EntityConfiguration.
                    valueOf(entity).
                    getEntityService().
                    getMethod(op.toLowerCase(), String.class).
                    invoke("",req);

    }

    @Then("obtengo el codigo de status '(.*)'")
    public void obtengoElCodigoDeStatusStatusCode(int expC) {
        int statusCode = APIManager.getLastResponse().getStatusCode();
        Assert.assertEquals(statusCode, expC);
    }

    @And("la informacion es correcta respecto a '(.*)'")
    public void laInformacionEsCorrectaRespectoAResponse(String jsonName) throws IOException {
        switch (jsonName) {
            case "user_me":
                UserCrowdar actUser = (UserCrowdar) APIManager.getLastResponse().getResponse();
                UserCrowdar expUser = APIManager.getResponseFromJsonFile(jsonName, UserCrowdar.class);

                Assert.assertEquals(actUser.getId(), expUser.getId());
                Assert.assertEquals(actUser.getRole(), expUser.getRole());
                Assert.assertEquals(actUser.getPassword(), expUser.getPassword());
                Assert.assertEquals(actUser.getName(), expUser.getName());
                break;
            case "cat_time_taken":
                Categories[] actTimeTaken = (Categories[]) APIManager.getLastResponse().getResponse();
                Categories[] expTimeTaken = APIManager.getResponseFromJsonFile(jsonName, Categories[].class);

                Assert.assertEquals(actTimeTaken.length, expTimeTaken.length);


                break;
            case "remv_1":
                UserCrowdar actUserRemove = (UserCrowdar) APIManager.getLastResponse().getResponse();
                UserCrowdar expUserRemove = APIManager.getResponseFromJsonFile(jsonName, UserCrowdar.class);

                Assert.assertEquals(actUserRemove, expUserRemove);


                break;
        }
    }


    @Then("guardo el token")
    public void guardoElToken() {
            UserToken response = (UserToken) APIManager.getLastResponse().getResponse();
            UserCrowdarService.TOKEN.set(response.getJwt());
    }
}
