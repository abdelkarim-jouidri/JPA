import Enitities.ProductsEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();

        try{
            transaction.begin();
            ProductsEntity p = new ProductsEntity();
            p.setId(1);
            p.setName("product1");
            p.setExpirationDate(LocalDate.now());
            p.setPrice(34.4);

            em.persist(p);

            transaction.commit();
        }finally {
            if(transaction.isActive()){
                transaction.rollback();
            }

            em.close();
            emf.close();

        }
    }
}
