package services;

import api.model.UserMe;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;

public class UserMeService extends MethodsService {

    public static Response get(String jsonName) {
        return get(jsonName, UserMe.class);
    }

}
