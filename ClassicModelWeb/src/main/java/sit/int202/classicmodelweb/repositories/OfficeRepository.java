package sit.int202.classicmodelweb.repositories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import sit.int202.classicmodelweb.entities.Office;

import java.util.List;

public class OfficeRepository {
    private EntityManager getEntityManager() {
        return EntityManagerSerice.getEntityManager();
    }

    public Office find(String officeCode) {
        EntityManager em = getEntityManager();
        return em.find(Office.class, officeCode);
    }

    public void save(Office office) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        em.persist(office);
        em.getTransaction().commit();
        em.close();
    }

    public void update(Office office) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        em.merge(office);
        em.getTransaction().commit();
        em.close();
    }
    public void delete(Office office) {
        delete(office.getId());
    }

    public void delete(String officeCode) {
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        Office office = find(officeCode);
        if(office != null) {
            em.remove(em.contains(office) ? office : em.merge(office));
        }
        em.getTransaction().commit();
        em.close();
    }

    public List<Office> findAll() {
        EntityManager em = getEntityManager();
        Query query = em.createNamedQuery("Office.FindAll");
        return query.getResultList();
    }
}
