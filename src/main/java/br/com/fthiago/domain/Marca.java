package br.com.fthiago.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class Marca {
	
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "produto_seq")
    @SequenceGenerator(name = "produto_seq", sequenceName = "seq_produto", initialValue = 1, allocationSize = 1)
    private Long id;
    
    @Column(name = "NOME", length = 50, nullable = false)
    private String nome;
    
    @OneToMany(mappedBy = "marca")
    private List<Carro> carros = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Carro> getCarros() {
		return carros;
	}

	public void setCarros(List<Carro> carros) {
		this.carros = carros;
	}
    
    
}
