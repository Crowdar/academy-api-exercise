package services;

import api.model.Token;
import api.model.Users;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;


public class TokenService extends MethodsService {

    public static Response post(String jsonName) {
        return post(jsonName, Token.class);
    }

}
