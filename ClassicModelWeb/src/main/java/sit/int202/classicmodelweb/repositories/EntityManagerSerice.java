package sit.int202.classicmodelweb.repositories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;

class EntityManagerSerice {
    static EntityManager getEntityManager() {
        return Persistence.createEntityManagerFactory("classic-model").createEntityManager();
    }
}
