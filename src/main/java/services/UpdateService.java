package services;

import api.model.UpdateTest;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;

import java.util.HashMap;
import java.util.Map;

public class UpdateService extends MethodsService {
    public static Response post(String jsonName) {
        Map<String, String> hmap = new HashMap<String, String>();

        hmap.put("token",(UserService.Token.get()));
        return post(jsonName, UpdateTest.class, hmap);
    }
}
