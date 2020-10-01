package services;
import java.util.Map;

import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;
 

public class EnvironmentService extends MethodsService {

	public static Response get(String jsonName, Map<String, String> parameters) {
		return get(jsonName, null, parameters);
	}

}
