package br.com.fthiago.dao;

import javax.persistence.*;

import br.com.fthiago.domain.Acessorio;

public class AcessorioDAO implements IAcessorioDAO {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("ExemploJPA");
    private EntityManager em = emf.createEntityManager();

	@Override
	public Acessorio cadastrar(Acessorio acessorio) {
		em.getTransaction().begin();
        em.persist(acessorio);
        em.getTransaction().commit();
        em.close();
        
        return acessorio;
	}
}
