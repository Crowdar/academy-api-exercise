package services;

import api.model.Data;
import api.model.Users;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;

public class UsersService extends MethodsService {

    public static Response get(String jsonName) {
        return get(jsonName, Users.class);
    }


    public static Response post(String request){
        return post(request, String.class);
    }
}
