package services;

import api.model.Login;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;

public class LoginService extends MethodsService {

    public static Response post(String jsonName) {
        return post(jsonName, Login.class);
    }
}
