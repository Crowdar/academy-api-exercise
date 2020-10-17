package ar.steps;

import api.config.EntityConfiguration;
import api.model.*;
import com.crowdar.api.rest.APIManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.json.JSONObject;
import org.testng.Assert;
import services.AuthenticateService;
import services.UserService;

import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;

public class SwaggerUiStep {


    @Then("obtengo el codigo de status '(.*)'")
    public void obtengoElCodigoDeStatusStatusCode(int expC) {
        int statusCode = APIManager.getLastResponse().getStatusCode();
        Assert.assertEquals(statusCode, expC);
    }
    @And("la informacion es correcta")
    public void laInformacionEsCorrecta() {
        Users users = (Users) APIManager.getLastResponse().getResponse();

        Assert.assertEquals(users.getId(), "5efe2a630d248f00012fa872");
        Assert.assertEquals(users.getName(), "admin");
        Assert.assertEquals(users.getPassword(), "$2a$10$I/5TFi6BrHChUghTZEZfCO82txzu8L5brcK0CxhS3m.V6glfj2vZe");
        Assert.assertEquals(users.getRole(), "ROLE_ROOT");
        Assert.assertEquals(users.getAdmin(), "false");

    }

    //---------USUARIOS---------//
    @When("realizo una peticion '(.*)' a '(.*)' al endpoint usuario - '(.*)'")
    public void realizoUnaPeticionOperationAEntityAlEndpointUsuarioRequest(String operation, String entity, String request) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        EntityConfiguration.valueOf(entity).getEntityService().getMethod(operation.toLowerCase(), String.class).invoke("", request);
    }

    //---------ROLES---------//

    @When("realizo una peticion '(.*)' a '(.*)' al endpoint rol - '(.*)'$")
    public void realizoUnaPeticionOperationAEntityAlEndpointRolRequest(String operacion, String entity, String request) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        EntityConfiguration.valueOf(entity).getEntityService().getMethod(operacion.toLowerCase(), String.class).invoke("", request);
    }

    //----------ASSIGN-------//
    @When("realizo una peticion '(.*)' a '(.*)' al endpoint assign - '(.*)'$")
    public void realizoUnaPeticionOperationAEntityAlEndpointAssignRequest(String operacion, String entity, String request) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        EntityConfiguration.valueOf(entity).getEntityService().getMethod(operacion.toLowerCase(), String.class).invoke("", request);
    }

    //----------CATEGORY_TEST-------//
    @When("realizo una peticion '(.*)' a '(.*)' al endpoint test - '(.*)'")
    public void realizoUnaPeticionOperationAEntityAlEndpointTestRequest(String operacion, String entity, String request) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        EntityConfiguration.valueOf(entity).getEntityService().getMethod(operacion.toLowerCase(), String.class).invoke("", request);
    }

    @And("la data es correcta")
    public void laDataEsCorrecta() {
        Test[] category = (Test[]) APIManager.getLastResponse().getResponse();

        int size = category.length;
        Assert.assertEquals(size, 3);
    }
    //----------FIN CATEGORY_TEST-------//

    //----------CATEGORY_TIME-------//
    @When("realizo un request '(.*)' a '(.*)' al endpoint time - '(.*)'")
    public void realizoUnRequestOperationAEntityAlEndpointTimeRequest(String operacion, String entity, String request) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        EntityConfiguration.valueOf(entity).getEntityService().getMethod(operacion.toLowerCase(), String.class).invoke("", request);

    }

    @And("la info es correcta")
    public void laInfoEsCorrecta() {
        Time[] promedio = (Time[]) APIManager.getLastResponse().getResponse();

        int size = promedio.length;
        Assert.assertEquals(size, 3);
    }
    //----------FIN CATEGORY_TIME-------//

    //----------Reports_Aggregation-------//
    @When("realizo una peticion '(.*)' a '(.*)' al endpoint reports - '(.*)'")
    public void realizoUnaPeticionOperationAEntityAlEndpointReportsRequest(String operacion, String entity, String request) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        EntityConfiguration.valueOf(entity).getEntityService().getMethod(operacion.toLowerCase(), String.class).invoke("", request);
    }

    @And("la data esta correcta")
    public void laDataEstaCorrecta() {
        Report[] aggregation = (Report[]) APIManager.getLastResponse().getResponse();

        int size = aggregation.length;
        Assert.assertEquals(size, 16);
    }
    //----------Fin Reports_Aggregation-------//

    //----------Error_Status-------//
    @When("realizo una peticion '(.*)' a '(.*)' al endpoint error - '(.*)'$")
    public void realizoUnaPeticionOperationAEntityAlEndpointErrorRequest(String operacion, String entity, String request) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        EntityConfiguration.valueOf(entity).getEntityService().getMethod(operacion.toLowerCase(), String.class).invoke("", request);
    }
    //----------Fin Error_Status-------//

    //----------Test_Update-------//
    @When("realizo una peticion '(.*)' a '(.*)' al endpoint testupdate - '(.*)'$")
    public void realizoUnaPeticionOperationAEntityAlEndpointTestupdateRequest(String operacion, String entity, String request) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        EntityConfiguration.valueOf(entity).getEntityService().getMethod(operacion.toLowerCase(), String.class).invoke("", request);
    }
    //----------Fin Test_Update-------//
    
    //----------Reports_q-------//
    @When("realizo una peticion '(.*)' a '(.*)' al endpoint reportes - '(.*)'")
    public void realizoUnaPeticionOperationAEntityAlEndpointReportesRequest(String operacion, String entity, String request) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        EntityConfiguration.valueOf(entity).getEntityService().getMethod(operacion.toLowerCase(), String.class).invoke("", request);
    }

    @And("la data esta ok")
    public void laDataEstaOk() {
        FindsReports freports = (FindsReports) APIManager.getLastResponse().getResponse();

        Assert.assertFalse(freports.isSorted());
        Assert.assertEquals(freports.getPageSize(), 0);
        Assert.assertEquals(freports.getPageNumber(), 0);
        Assert.assertEquals(freports.getOffset(), 0);
    }

    @When("realizo una peticion '(.*)' a '(.*)' al endpoint count - '(.*)'")
    public void realizoUnaPeticionOperationAEntityAlEndpointCountRequest(String operacion, String entity, String request) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        EntityConfiguration.valueOf(entity).getEntityService().getMethod(operacion.toLowerCase(), String.class).invoke("", request);

    }


    //----------Autenticate-------//
    @When("realizo una peticion '(.*)' a '(.*)' al endpoint authenticate - '(.*)'")
    public void realizoUnaPeticionOperationAEntityAlEndpointAuthenticateRequest(String operacion, String entity, String request) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        EntityConfiguration.valueOf(entity).getEntityService().getMethod(operacion.toLowerCase(), String.class).invoke("", request);
    }

    @And("obtengo un token")
    public void obtengoUnToken() throws FileNotFoundException {
        UAuthenticate respuesta = (UAuthenticate) APIManager.getLastResponse().getResponse();

        UserService.Token.set(respuesta.getJwt());

    }
}




