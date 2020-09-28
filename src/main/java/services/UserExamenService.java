package services;

import api.model.UserExamen;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;


public class UserExamenService extends MethodsService {

    public static Response get(String jsonName) {
       return get(jsonName, UserExamen.class);
    }


}
