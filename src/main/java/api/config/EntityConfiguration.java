package api.config;

import services.*;

public enum EntityConfiguration {

    USER {
        @Override
        public Class<?> getEntityService() {
            return UserCrowdarService.class;
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
    TOKEN {
        @Override
        public Class<?> getEntityService() {
            return TokenService.class;
        }
    };

    public abstract Class<?> getEntityService();
}
