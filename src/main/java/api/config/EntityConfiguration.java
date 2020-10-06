package api.config;

import services.CategoryTimeService;
import services.ResponseHeadersService;
import services.UserMeService;
import services.UserService;

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
    USERME {
        @Override
        public Class<?> getEntityService() {
            return UserMeService.class;
        }
    },
    CATEGORYTIME {
        @Override
        public Class<?> getEntityService() {
            return CategoryTimeService.class;
        }

    };

    public abstract Class<?> getEntityService();
}

