package services;
import java.util.Map;

import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;
 

public class EnvironmentService extends MethodsService {

	public static Response get(String jsonName, Map<String, String> params) {
        params.put("token", "Bearer ".concat(UserService.TOKEN.get()));
		return get(jsonName, null, params);
	}
}
