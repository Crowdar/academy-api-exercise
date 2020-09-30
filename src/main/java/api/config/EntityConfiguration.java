package api.config;

import api.model.Projects;
import services.*;

public enum EntityConfiguration {

    TOKEN {
        @Override
        public Class<?> getEntityService() {
            return TokenService.class;
        }
    },
    ID_PROJECT {
        @Override
        public Class<?> getEntityService() {
            return ProjectService.class;
        }

    },
    ERROR {
        @Override
        public Class<?> getEntityService() {
            return ErrorTokenService.class;
        }

    },
    PROJECTS {
        @Override
        public Class<?> getEntityService() {
            return ProjectsService.class;
        }

    };

    public abstract Class<?> getEntityService();
}
