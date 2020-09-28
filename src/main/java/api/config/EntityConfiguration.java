package api.config;

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
    TOKEN {
        @Override
        public Class<?> getEntityService() {
            return TokenService.class;
        }
    },
    USER_CROWDAR {
        @Override
        public Class<?> getEntityService() {
            return UserCrowdarService.class;
        }
    },
    ERROR {
        @Override
        public Class<?> getEntityService() {
            return ErrorCrowdarService.class;
        }
    };

    public abstract Class<?> getEntityService();
}
