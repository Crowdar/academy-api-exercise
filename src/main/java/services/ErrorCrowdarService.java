package services;

import api.model.ErrorCrowdar;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;

public class ErrorCrowdarService extends MethodsService {

    public static Response get(String jsonName) {
        return get(jsonName, ErrorCrowdar.class);
    }
}