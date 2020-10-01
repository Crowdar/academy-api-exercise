package api.config;

import api.model.CategoryTimeTaken;
import services.*;

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
    CATEGORYTIMETAKEN {
        @Override
        public Class<?> getEntityService() {
            return CategoryTimeTakenService.class;
        }
    },
    TESTSUPDATE {
        @Override
        public Class<?> getEntityService() {
            return TestsUpdateService.class;
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
