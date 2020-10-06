package ar.steps;

import api.model.TestsUpdate;
import com.crowdar.api.rest.APIManager;
import io.cucumber.java.en.And;
import org.testng.Assert;

import java.io.IOException;

public class TestsUpdateSteps {



    @And("los datos son correctoss '(.*)'")
    public void losDatosSonCorrectossJsonName(String jsonName) throws IOException{
        TestsUpdate actUserRemove = (TestsUpdate) APIManager.getLastResponse().getResponse();
        TestsUpdate expUserRemove = APIManager.getResponseFromJsonFile(jsonName, TestsUpdate.class);
        Assert.assertEquals(actUserRemove, expUserRemove);
    }
}
