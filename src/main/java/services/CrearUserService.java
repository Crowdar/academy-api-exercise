package services;

import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;

public class CrearUserService extends MethodsService {
    public static Response post(String req){
        return post(req, String.class);
    }
}
