package services;

import api.model.UpdateTest;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;

import java.util.HashMap;
import java.util.Map;

public class UpdateService extends MethodsService {
    public static final ThreadLocal<String> TOKEN = new ThreadLocal<String>();

    public static Response post(String jsonName) {
        Map<String, String> params = new HashMap<String, String>();
        params.put("token", "Bearer ".concat(UserService.TOKEN.get()));
        return post(jsonName, UpdateTest.class, params);
    }
}
