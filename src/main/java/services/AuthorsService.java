package services;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;

public class AuthorsService extends MethodsService {

	public static Response get(String jsonName) {
		return get(jsonName, null);
	}

}
