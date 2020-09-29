package api.config;

import services.*;

public enum EntityConfiguration {

    USER {
        @Override
        public Class<?> getEntityService() {
            return UserService.class;
        }

    },
    UPDATE {
        @Override
        public Class<?> getEntityService() {
            return UpdateService.class;
        }

    },
    CATEGORIES {
        @Override
        public Class<?> getEntityService() {
            return CategoriesService.class;
        }

    },
    CREAR_USER {
        @Override
        public Class<?> getEntityService() {
            return CrearUserService.class;
        }
    };

    public abstract Class<?> getEntityService();
}
