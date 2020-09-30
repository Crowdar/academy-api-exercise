package services;

import api.model.ErrorToken;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;

public class ErrorTokenService extends MethodsService {
    public static Response get(String jsonName) {
        return get(jsonName, ErrorToken.class);
    }
}
