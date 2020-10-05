package services;

import api.model.User;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;

public class UserService extends MethodsService {

	public static final ThreadLocal<String> TOKEN = new ThreadLocal<String>();

	public static Response post(String jsonName) {
		return post(jsonName, User.class);
	}

	public static Response get(String jsonName) {
		return get(jsonName, User.class);
	}

}
