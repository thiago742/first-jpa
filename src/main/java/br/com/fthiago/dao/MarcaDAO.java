package br.com.fthiago.dao;

import javax.persistence.*;

import br.com.fthiago.domain.Marca;

public class MarcaDAO implements IMarcaDAO {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("ExemploJPA");
    private EntityManager em = emf.createEntityManager();

    @Override
    public Marca cadastrar(Marca marca) {
        em.getTransaction().begin();
        em.persist(marca);
        em.getTransaction().commit();
        em.close();
        
        return marca;
    }
}
