package sit.int202.classicmodelweb.repositories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import sit.int202.classicmodelweb.entities.Product;

import java.util.List;

public class ProductRepository {
    private static final int PAGE_SIZE = 10;
    private EntityManager getEntityManager() {
        return EntityManagerSerice.getEntityManager();
    }

    public Product findProduct(String productId) {
        EntityManager em = getEntityManager();
        Product product = em.find(Product.class, productId);
        em.close();
        return product;
    }

    public int getDefaultPageSize() {
        return PAGE_SIZE;
    }

    public List<Product> findAll(int page, int pageSize) {
        EntityManager em = getEntityManager();
        int startPosition = (page - 1) * pageSize;
        Query query = em.createNamedQuery("Product.FindAll");
        query.setFirstResult(startPosition);
        query.setMaxResults(pageSize);
        List<Product> productList = query.getResultList();
        return productList;
    }

    public int countAll() {
        EntityManager em = getEntityManager();
        int number = ((Number) em.createNamedQuery("Product.Count").getSingleResult()).intValue();
        em.close();
        return number;
    }
}
