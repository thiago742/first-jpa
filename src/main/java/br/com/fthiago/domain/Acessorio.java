package br.com.fthiago.domain;

import java.util.List;

import javax.persistence.*;

@Entity
public class Acessorio {
	
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "acessorio_sq")
    @SequenceGenerator(name = "acessorio_sq", sequenceName = "sq_acessorio", initialValue = 1, allocationSize = 1)
    private Long id;
    
    @Column(name = "NOME", length = 50, nullable = false)
    private String nome;
    
    @ManyToMany(mappedBy = "acessorios")
    private List<Carro> carros;
   

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
