package services;

import api.model.UpdateTest;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;

public class UpdateService extends MethodsService {

    public static Response post(String jsonName) {
        return post(jsonName, UpdateTest.class);
    }
}
