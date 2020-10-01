package services;

import api.model.MyUserData;

import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;

import java.util.HashMap;
import java.util.Map;


public class UserExamenService extends MethodsService {

    public static final ThreadLocal<String> TOKEN = new ThreadLocal<>();

    public static Response get(String jsonName) {
        Map<String, String> Token = new HashMap<>();
        Token.put("Token", TOKEN.get());
       return get(jsonName, MyUserData.class, Token);
    }


}
