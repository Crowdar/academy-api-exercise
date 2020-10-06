package ar.steps;

import api.config.EntityConfiguration;
import api.model.CategoryTimeTaken;
import api.model.ResponseHeaders;
import api.model.Users;
import com.crowdar.api.rest.APIManager;
import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;


public class obtenerUsuariosSteps extends PageSteps {
    @When("realizo una peticion '(.*)' a '(.*)' al endpoint - '(.*)'")
    public void realizoUnaPeticionOperationAEntityAlEndpointRequest(String operation, String entity, String request)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException{
        EntityConfiguration.valueOf(entity).getEntityService().getMethod(operation.toLowerCase(), String.class).invoke("", request);
    }

    @Then("obtengo el codigo de status '(.*)'")
    public void obtengoElCodigoDeStatusStatusCode(int expC) {
        int statusCode = APIManager.getLastResponse().getStatusCode();
        Assert.assertEquals(statusCode, expC);
    }

    /*
    @And("la informacion es correcta")
    public void laInformacionEsCorrecta() {
        Users users = (Users) APIManager.getLastResponse().getResponse();

        Assert.assertEquals(users.getId(),"5efe2a630d248f00012fa872");
        Assert.assertEquals(users.getName(), "admin");
        Assert.assertEquals(users.getPassword(), "$2a$10$I/5TFi6BrHChUghTZEZfCO82txzu8L5brcK0CxhS3m.V6glfj2vZe");
        Assert.assertEquals(users.getRole(), "ROLE_ROOT");
        Assert.assertEquals(users.getAdmin(), "false");

    }*/
    //Se crea este step para poder validar la información a través de un archivo response
    @And("la informacion es correcta '(.*)'")
    public void laInformacionEsCorrectaJsonName(String jsonResponse) throws IOException {

        Users userMeResponse = (Users) APIManager.getLastResponse().getResponse();
        //Para obtener el response de un jsonFile necesito el archivo.json y la clase que se va a parametrizar
        Users userMeResponseFromJson = APIManager.getResponseFromJsonFile(jsonResponse, Users.class);

        Assert.assertEquals(userMeResponse.getId(),userMeResponseFromJson.getId());
        Assert.assertEquals(userMeResponse.getName(),userMeResponseFromJson.getName());
        Assert.assertEquals(userMeResponse.getPassword(),userMeResponseFromJson.getPassword());
        Assert.assertEquals(userMeResponse.getRole(),userMeResponseFromJson.getRole());
        Assert.assertEquals(userMeResponse.getAdmin(),userMeResponseFromJson.getAdmin());
    }
}
