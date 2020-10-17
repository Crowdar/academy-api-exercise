package services;

import api.model.UAuthenticate;
import api.model.Users;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;

import java.util.HashMap;
import java.util.Map;


public class UserService extends MethodsService {

        public static ThreadLocal<String> Token = new ThreadLocal<String>();

        public static Response get(String req) {
            Map<String, String> hmap = new HashMap<String, String>();

            hmap.put("token",(Token.get()));

            return get(req, Users.class, hmap);
        }
    }