package services;
import java.util.HashMap;
import java.util.Map;

import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;

public class AuthorsService extends MethodsService {

	public static Response get(String jsonName) {
		Map<String, String> params = new HashMap<String, String>();
        params.put("token", "Bearer ".concat(UserService.TOKEN.get()));
		return get(jsonName, null, params);
	}

}
