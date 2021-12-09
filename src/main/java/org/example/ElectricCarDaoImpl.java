package org.example;

import javax.persistence.*;
import java.util.List;

public class ElectricCarDaoImpl implements ElectricCarDAO {

    EntityManagerFactory emf;
    EntityManager em;

    public ElectricCarDaoImpl() {
        emf = Persistence.createEntityManagerFactory("jpa");
        em = emf.createEntityManager();
    }

    @Override
    public void create(ElectricCar electricCar) {
        em.getTransaction().begin();
        em.persist(electricCar);
        em.getTransaction().commit();
    }

    @Override
    public void update(ElectricCar electricCar) {
        em.getTransaction().begin();
        em.merge(electricCar);
        em.getTransaction().commit();
    }

    @Override
    public void delete(ElectricCar electricCar) {
        em.getTransaction().begin();
        em.remove(electricCar);
        em.getTransaction().commit();
    }

    @Override
    public ElectricCar getById(int id) {
        return em.find(ElectricCar.class, id);
    }

    @Override
    public List<ElectricCar> sortByBrand() {
        String jql = "SELECT b FROM ElectricCar as b order by b.brand";
        Query query = em.createQuery(jql);
        return query.getResultList();
    }

    @Override
    public List<ElectricCar> getByPriceInterval(int from, int to) {
        TypedQuery<ElectricCar> query = em.createQuery("SELECT s FROM ElectricCar s WHERE s.price BETWEEN :from AND :to", ElectricCar.class);
        query.setParameter("from", from);
        query.setParameter("to", to);
        return query.getResultList();
    }

    @Override
    public List<ElectricCar> getByDriveRange(int from, int to) {
        TypedQuery<ElectricCar> query = em.createQuery("SELECT s FROM ElectricCar s WHERE s.drive_range BETWEEN :from AND :to", ElectricCar.class);
        query.setParameter("from", from);
        query.setParameter("to", to);
        return query.getResultList();
    }
}