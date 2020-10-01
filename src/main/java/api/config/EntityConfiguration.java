package api.config;


import services.LoginService;
import services.UserExamenService;

public enum EntityConfiguration {

    LOGIN {
        @Override
        public Class<?> getEntityService() {
            return LoginService.class;
        }
    },
    USEREXAMEN {
        @Override
        public Class<?> getEntityService() {
            return UserExamenService.class;
        }
    };

    public abstract Class<?> getEntityService();
}
