package ar.steps.Api;

import api.config.EntityConfiguration;
import api.model.Project;
import api.model.Projects;
import api.model.UserToken;
import com.crowdar.api.rest.APIManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import services.ProjectsService;
import services.TokenService;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class ProjectSteps {

    @Given("relizo una peticion (.*) a (.*) al endpoint de Crowdar (.*)")
    public void relizoUnaPeticionOperationAEntityAlEndpointDeCrowdarRequest(String operacion, String entity, String request)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        EntityConfiguration.valueOf(entity).getEntityService().getMethod(operacion.toLowerCase(),String.class).invoke("",request);
    }

    @When("obtengo el (.*)")
    public void obtengoElStatuscode(int statusCode) {
        Assert.assertEquals(APIManager.getLastResponse().getStatusCode(), statusCode);
    }

    @Then("guardo el Token")
    public void guardoElToken() {
        UserToken response = (UserToken) APIManager.getLastResponse().getResponse();
        TokenService.TOKEN.set(response.getJwt());
    }

    @Then("guardo el ids")
    public void guardoElIds() {
        Projects response = (Projects) APIManager.getLastResponse().getResponse();
        Project[] projects = response.getContent();
        Project project = projects[0];
        ProjectsService.IDS.set(project.getId());
    }
}
