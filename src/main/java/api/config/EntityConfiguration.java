package api.config;

import services.*;

public enum EntityConfiguration {

    USER {
        @Override
        public Class<?> getEntityService() {
            return UserService.class;
        }

    },
    ROLE {
        @Override
        public Class<?> getEntityService() {
            return RoleService.class;
        }

    },
    ASSIGN {
        @Override
        public Class<?> getEntityService() {
            return AssignService.class;
        }

    },
    TESTING {
        @Override
        public Class<?> getEntityService() {
            return TestService.class;
        }

    },
    TIME {
        @Override
        public Class<?> getEntityService() {
            return TimesService.class;
        }

    },
    REPORTS {
        @Override
        public Class<?> getEntityService() {
            return ReportsService.class;
        }

    },
    ERROR {
        @Override
        public Class<?> getEntityService() {
            return ErrorsService.class;
        }

    },
    UPDATE {
        @Override
        public Class<?> getEntityService() {
            return UpdateService.class;
        }

    },
    REPORTSQ {
        @Override
        public Class<?> getEntityService() { return FindReportsService.class; }

    },
    COUNT {
        @Override
        public Class<?> getEntityService() { return quantityTestService.class; }

    },
    USER_A {
        @Override
        public Class<?> getEntityService() { return AuthenticateService.class; }

    };


    public abstract Class<?> getEntityService();
}
