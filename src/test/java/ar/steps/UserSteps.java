package ar.steps;

import api.model.MyUserData;
import com.crowdar.api.rest.APIManager;
import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import org.testng.Assert;

public class UserSteps extends PageSteps {
    @And("verifico que el id '(.*)' es correcto")
    public void verificoDatosCorrectos(String idUsuario) {
        MyUserData respuesta = (MyUserData) APIManager.getLastResponse().getResponse();

        Assert.assertEquals(idUsuario, respuesta.getId());
    }
}
