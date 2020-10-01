package services;

import api.model.ErrorToken;
import api.model.Projects;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;
import java.util.HashMap;
import java.util.Map;

public class ProjectsService extends MethodsService {

    public static final ThreadLocal<String> IDS = new ThreadLocal<String>();

    public static Response get(String jsonName) {
        Map<String, String> params = new HashMap<String, String>();
        params.put("token", "Bearer ".concat(TokenService.TOKEN.get()));
        return get(jsonName, Projects.class,params);
    }
}
