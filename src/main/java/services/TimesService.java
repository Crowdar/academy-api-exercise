package services;

import api.model.Test;
import api.model.Time;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;

import java.util.HashMap;
import java.util.Map;

public class TimesService extends MethodsService {
    public static Response get(String jsonName) {
        Map<String, String> hmap = new HashMap<String, String>();

        hmap.put("token",(UserService.Token.get()));
        return get(jsonName, Time[].class, hmap);
    }
}
