package api.config;

import services.AuthenticatedUser;
import services.ResponseHeadersService;
import services.UserService;
import services.UsersService;

public enum EntityConfiguration {

    USER {
        @Override
        public Class<?> getEntityService() {
            return UserService.class;
        }

    },
    RESPONSE_HEADERS {
        @Override
        public Class<?> getEntityService() {
            return ResponseHeadersService.class;
        }
    },

    USERS {
        @Override
        public Class<?> getEntityService() {
            return UsersService.class;
        }
    },
    AUTHENTICATEDUSERS{
        @Override
        public Class<?> getEntityService() {
            return AuthenticatedUser.class;
        }

    };


    public abstract Class<?> getEntityService();
}
