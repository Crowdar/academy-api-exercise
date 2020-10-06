package services;

import api.model.CategoryTimeTaken;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;

import java.util.HashMap;
import java.util.Map;

public class CategoryTimeTakenService extends MethodsService {

    public static Response get(String jsonName) {
        Map<String, String> hmap = new HashMap<String, String>();
        hmap.put("token", "Bearer ".concat(UserService.TOKEN.get()));
        return get(jsonName, CategoryTimeTaken[].class,hmap);//acá se modela la respuesta
        //se agrega el userCrowdarService y token para poder persistir el token
    }

}
