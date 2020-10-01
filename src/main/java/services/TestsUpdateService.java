package services;

import api.model.ResponseHeaders;
import api.model.TestsUpdate;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;

import java.util.HashMap;
import java.util.Map;

public class TestsUpdateService extends MethodsService {
    public static Response post(String jsonName) {
        Map<String, String> hmap = new HashMap<String, String>();
        hmap.put("token", "Bearer ".concat(UserService.TOKEN.get()));
        return post(jsonName,TestsUpdate.class,hmap);
    }
}
