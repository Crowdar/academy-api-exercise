package ar.steps;

import api.config.EntityConfiguration;
import api.model.CategoryTime;
import api.model.UserMe;
import com.crowdar.api.rest.APIManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.lang.reflect.InvocationTargetException;

public class SwagerUI {
    @When("realizo una peticion '(.*)' a '(.*)' al endpoint usuario - '(.*)'")
    public void realizoUnaPeticionOperationAEntityAlEndpointUsuarioRequest(String operation, String entity, String request)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        EntityConfiguration.valueOf(entity).getEntityService().getMethod(operation.toLowerCase(), String.class).invoke("", request);

    }

    @Then("obtengo el codigo de status '(.*)'")
    public void obtengoElCodigoDeStatusStatusCode(int expC) {
        int statusCode = APIManager.getLastResponse().getStatusCode();
        Assert.assertEquals(statusCode, expC);
        System.out.println("StatusCode: "+statusCode);
    }

    @And("la informacion es correcta")
    public void laInformacionEsCorrecta() {
        UserMe userme = (UserMe) APIManager.getLastResponse().getResponse();

        Assert.assertEquals(userme.getId(),"5efe2a630d248f00012fa872");
        Assert.assertEquals(userme.getName(),"admin");
        Assert.assertEquals(userme.getPassword(),"$2a$10$I/5TFi6BrHChUghTZEZfCO82txzu8L5brcK0CxhS3m.V6glfj2vZe");

    }

    @When("realizo una peticion '(.*)' a '(.*)' al endpoint categoryTime - '(.*)'")
    public void realizoUnaPeticionOperationAEntityAlEndpointCategoryTimeRequest(String operation, String entity, String request)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        EntityConfiguration.valueOf(entity).getEntityService().getMethod(operation.toLowerCase(), String.class).invoke("", request);

    }

    @And("la info es correcta")
    public void laInfoEsCorrecta() {
        CategoryTime categorytime = (CategoryTime) APIManager.getLastResponse().getResponse();

    }
}


