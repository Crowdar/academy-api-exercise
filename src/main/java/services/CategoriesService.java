package services;

import api.model.Categories;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;

import java.util.HashMap;
import java.util.Map;

public class CategoriesService extends MethodsService {

    public static Response get(String jsonName) {
        Map<String, String> params = new HashMap<String, String>();
        params.put("token", "Bearer ".concat(UserCrowdarService.TOKEN.get()));
        return get(jsonName, Categories[].class, params);
    }
}
