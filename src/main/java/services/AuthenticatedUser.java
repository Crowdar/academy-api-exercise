package services;

import api.model.AuthoredUsers;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;

public class AuthenticatedUser extends MethodsService {

    public static Response post(String request){
        return post(request, AuthoredUsers.class);
    }
}
