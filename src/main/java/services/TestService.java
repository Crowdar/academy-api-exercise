package services;

import api.model.Test;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;

import java.util.HashMap;
import java.util.Map;

public class TestService extends MethodsService {
    public static Response get(String jsonName) {
        Map<String, String> hmap = new HashMap<String, String>();

        hmap.put("token",(UserService.Token.get()));

        return get(jsonName, Test[].class, hmap);
    }
}
