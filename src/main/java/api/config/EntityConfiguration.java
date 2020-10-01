package api.config;

import services.ResponseHeadersService;
import services.UserService;
import services.AuthorsService;
import services.EnvironmentService;

public enum EntityConfiguration {

    USER {
        @Override
        public Class<?> getEntityService() {
            return UserService.class;
        }

    },
    AUTHORS{
    	@Override
    	public Class<?> getEntityService() {
            return AuthorsService.class;
        }
    },
    ENVIRONMENT{
    	@Override
    	public Class<?> getEntityService() {
            return EnvironmentService.class;
        }
    },
    RESPONSE_HEADERS {
        @Override
        public Class<?> getEntityService() {
            return ResponseHeadersService.class;
        }
    };

    public abstract Class<?> getEntityService();
}
