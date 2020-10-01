package ar.steps;

import api.config.EntityConfiguration;
import api.model.CategoryTimeTaken;
import api.model.Users;
import com.crowdar.api.rest.APIManager;
import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.lang.reflect.InvocationTargetException;


public class obtenerTimeTakenAvgSteps extends PageSteps {

    @And("los datos son correctos")
    public void losDatosSonCorrectos() {
        CategoryTimeTaken[] categoryTimeTaken = (CategoryTimeTaken[]) APIManager.getLastResponse().getResponse();

        Assert.assertEquals(categoryTimeTaken[0].getName(),"@Smoke");
        Assert.assertEquals(categoryTimeTaken[0].getTotal(),0);
    }
}
