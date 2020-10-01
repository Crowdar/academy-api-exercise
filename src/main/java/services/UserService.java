package services;

import api.model.Users;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;

import java.util.HashMap;
import java.util.Map;


public class UserService extends MethodsService {

    public static final ThreadLocal<String> TOKEN = new ThreadLocal<String>();

    public static Response get(String jsonName) {
        Map<String, String> hmap = new HashMap<String, String>();
        hmap.put("token", "Bearer ".concat(TOKEN.get()));
        return get(jsonName, Users.class,hmap);
    }

}
