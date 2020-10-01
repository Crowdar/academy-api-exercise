package ar.steps;

import api.config.EntityConfiguration;
import api.model.User;
import com.crowdar.api.rest.APIManager;
import com.crowdar.core.PageSteps;
import com.google.api.client.repackaged.com.google.common.base.Splitter;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import services.UserService;

import org.apache.commons.lang.StringUtils;
import org.testng.Assert;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@SuppressWarnings("deprecation")
public class UserSteps extends PageSteps {

	@SuppressWarnings({ "deprecation" })
	@When("^Realizo una peticion '(.*)' hacia '(.*)' endpoint con el archivo '(.*)' y parametros '(.*)'$")
	public void doRequest(String methodName, String entity, String jsonName, String jsonReplacementValues) throws IllegalAccessException,
			IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {

		 Class<?> entityService = EntityConfiguration.valueOf(entity).getEntityService();
		
		 Map<String, String> parameters = getParameters(jsonReplacementValues);
	       
	        if (parameters == null) {
	            entityService.getMethod(methodName.toLowerCase(), String.class).invoke("", jsonName);
	        } else {
	            entityService.getMethod(methodName.toLowerCase(), String.class, Map.class).invoke("", jsonName, parameters);
	        }

	}
	
	@SuppressWarnings("unused")
	private Map<String, String> getParameters(String jsonReplacementValues) {
        Map<String, String> parameters = null;
        if (!StringUtils.isEmpty(jsonReplacementValues)) {
            parameters = Splitter.on(",").withKeyValueSeparator(":").split(jsonReplacementValues);
        }
        return parameters;
    }

	@SuppressWarnings("deprecation")
	@Then("^Obtengo el codigo de estado '(.*)'$")
	public void iWillGetTheProperStatusCodeStatusCode(String expStatusCode) {
		int actualStatusCode = APIManager.getLastResponse().getStatusCode();
		Assert.assertEquals(Integer.parseInt(expStatusCode), actualStatusCode, "The status code are not equals");
	}

	@SuppressWarnings("deprecation")
	@And("^El correspondiente '(.*)' con valor '(.*)' como parte de la respuesta$")
	public void theProperIdReturnedInTheResponse(String property, String value) {
		if (property.equals("username")) {

			User response = (User) APIManager.getLastResponse().getResponse();
			Assert.assertEquals(String.valueOf(response.getUsername()), value,
					"La " + property + " no está en el response");
			if (response.getJwt() != null && response.getJwt() != "") {
				UserService.TOKEN.set(response.getJwt());
			}

		} else if (property.equals("error")) {

			User response = (User) APIManager.getLastResponse().getResponse();
			Assert.assertEquals(String.valueOf(response.getError()), value,
					"La " + property + " no está en el response");
		}
	}
}
