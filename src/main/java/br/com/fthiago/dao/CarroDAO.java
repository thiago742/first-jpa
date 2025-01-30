package br.com.fthiago.dao;

import javax.persistence.*;

import br.com.fthiago.domain.Carro;

public class CarroDAO implements ICarroDAO {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("ExemploJPA");
    private EntityManager em = emf.createEntityManager();

    @Override
    public Carro cadastrar(Carro carro) {
        em.getTransaction().begin();
        em.persist(carro);
        em.getTransaction().commit();
        em.close();
        
        return carro;
    }
}
