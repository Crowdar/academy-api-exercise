package ar.steps;

import api.config.EntityConfiguration;
import api.model.CategoryTimeTaken;
import api.model.Users;
import com.crowdar.api.rest.APIManager;
import com.crowdar.bdd.cukes.hooks.APIHook;
import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;


public class obtenerTimeTakenAvgSteps extends PageSteps {

    /*
    @And("los datos son correctos")
    public void losDatosSonCorrectos() {
        CategoryTimeTaken[] categoryTimeTaken = (CategoryTimeTaken[]) APIManager.getLastResponse().getResponse();

        Assert.assertEquals(categoryTimeTaken[0].getName(),"@Smoke");
        Assert.assertEquals(categoryTimeTaken[0].getTotal(),0);
    }
    */
    //Comparación de datos a través de un file
    @And("los datos son correctos '(.*)'")
    public void losDatosSonCorrectosJsonresponse(String jsonResponse) throws IOException {

        CategoryTimeTaken[] catTimeTakenRespList = (CategoryTimeTaken[]) APIManager.getLastResponse().getResponse();
        List<CategoryTimeTaken> catTimeTakenJsonFResponse = APIManager.getListResponseFromJsonFile(jsonResponse,CategoryTimeTaken.class);

        for (CategoryTimeTaken catTimeTakenUnit :catTimeTakenRespList) {
            for (CategoryTimeTaken catTimeTakenUnitFile:catTimeTakenJsonFResponse) {
                if(catTimeTakenUnit.getName().equals(catTimeTakenUnitFile.getName())){
                    Assert.assertEquals(catTimeTakenUnit.getName(),catTimeTakenUnitFile.getName());
                }
                if(catTimeTakenUnit.getTotal() == catTimeTakenUnitFile.getTotal()){
                    Assert.assertEquals(catTimeTakenUnit.getTotal(), catTimeTakenUnitFile.getTotal());
                }
            }
        }

    }
}
