package ar.steps;

import api.config.EntityConfiguration;
import api.model.Categories;
import api.model.User;
import com.crowdar.api.rest.APIManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import api.model.Token;
import services.UserService;

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
                User actUser = (User) APIManager.getLastResponse().getResponse();
                User expUser = APIManager.getResponseFromJsonFile(jsonName, User.class);

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
                User actUserRemove = (User) APIManager.getLastResponse().getResponse();
                User expUserRemove = APIManager.getResponseFromJsonFile(jsonName, User.class);

                Assert.assertEquals(actUserRemove, expUserRemove);


                break;
        }
    }


    @Then("guardo el token")
    public void guardoElToken() {
            Token response = (Token) APIManager.getLastResponse().getResponse();
            UserService.TOKEN.set(response.getJwt());
    }
}
