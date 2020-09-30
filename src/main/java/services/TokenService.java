package services;

import api.model.UserToken;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;

public class TokenService extends MethodsService {

    public static final ThreadLocal<String> TOKEN = new ThreadLocal<String>();


    public static Response post(String jsonName) {

        return post(jsonName, UserToken.class);
    }
}
