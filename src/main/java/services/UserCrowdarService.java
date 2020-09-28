package services;

import api.model.UserCrowdar;
import api.model.UserToken;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;

import java.util.HashMap;
import java.util.Map;

public class UserCrowdarService extends MethodsService {
    public static final ThreadLocal<String> TOKEN = new ThreadLocal<String>();

    public static Response get(String jsonName) {
        Map<String, String> params = new HashMap<String, String>();
        params.put("token", "Bearer ".concat(TOKEN.get()));
        return get(jsonName, UserCrowdar.class,params);
    }
}