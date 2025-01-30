package br.com.fthiago.domain;

import java.util.List;

import javax.persistence.*;

@Entity
public class Carro {
	
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "carro_seq")
    @SequenceGenerator(name = "carro_seq", sequenceName = "seq_carro", initialValue = 1, allocationSize = 1)
    private Long id;
    
    @Column(name = "MODELO", length = 50, nullable = false)
    private String modelo;
    
    @ManyToOne
    @JoinColumn(name = "marca_id",
    	foreignKey = @ForeignKey(name = "fk_marca_id"), 
    	referencedColumnName = "id", nullable = false)
    private Marca marca;
    
    @ManyToMany
    @JoinTable(
        name = "carro_acessorio",
        joinColumns = @JoinColumn(name = "carro_id"),
        inverseJoinColumns = @JoinColumn(name = "acessorio_id")
    )
    private List<Acessorio> acessorios;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Marca getMarca() {
		return marca;
	}

	public List<Acessorio> getAcessorios() {
		return acessorios;
	}

	public void setAcessorios(List<Acessorio> acessorios) {
		this.acessorios = acessorios;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}
    
	
    
}
