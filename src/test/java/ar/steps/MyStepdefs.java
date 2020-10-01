package ar.steps;

import api.config.EntityConfiguration;
import com.crowdar.api.rest.APIManager;
import com.google.api.client.repackaged.com.google.common.base.Splitter;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang.StringUtils;
import org.testng.Assert;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

public class MyStepdefs {

    @When("el cliente realiza una '(.*)' a '(.*)' al endpoint '(.*)'$")
    public void elClienteRealizaUnaOperationAEntityAlEndpointJsonName(String operation, String entity, String request) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        EntityConfiguration.valueOf(entity).getEntityService().getMethod(operation.toLowerCase(), String.class).invoke("", request);
    }

    @Then("el cliente obtiene el status code '(.*)'")
    public void elClienteObtieneElStatusCodeStatusCode(int expCode) {
        int statusCode= APIManager.getLastResponse().getStatusCode();
        Assert.assertEquals(statusCode, expCode);
    }

    @When("el cliente hace una '(.*)' a '(.*)' al endpoint '(.*)'$")
    public void elClienteHaceUnaOperationAEntityAlEndpointRequest(String operation, String entity, String request)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        EntityConfiguration.valueOf(entity).getEntityService().getMethod(operation.toLowerCase(), String.class).invoke("", request);
    }
}
