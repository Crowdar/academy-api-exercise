package services;

import api.model.UAuthenticate;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;


public class AuthenticateService extends MethodsService {

    public static Response post(String req) {
        return post(req, UAuthenticate.class);
    }


}
