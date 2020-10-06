package services;

import api.model.CategoryTime;
import api.model.UserMe;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;

public class CategoryTimeService  extends MethodsService {

    public static Response get(String jsonName) {
        return get(jsonName, CategoryTime.class);
    }
}
