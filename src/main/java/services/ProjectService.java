package services;

import api.model.Project;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;

import java.util.HashMap;
import java.util.Map;

public class ProjectService extends MethodsService {

    public static Response get(String jsonName) {

        Map<String, String> params = new HashMap<String, String>();
        params.put("token", "Bearer ".concat(TokenService.TOKEN.get()));
        params.put("ids", ProjectsService.IDS.get());

        return get(jsonName, Project.class, params);
        
    }

}
