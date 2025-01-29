package br.com.fthiago.domain;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "TB_PRODUTO")
public class Produto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "produto_seq")
    @SequenceGenerator(name = "produto_seq", sequenceName = "seq_produto", initialValue = 1, allocationSize = 1)
    private Long id;

    @Column(name = "CODIGO", length = 10, nullable = false, unique = true)
    private String codigo;

    @Column(name = "NOME", length = 50, nullable = false)
    private String nome;

    @Column(name = "PRECO", nullable = false)
    private Double preco;

    @Column(name = "QTD_ESTOQUE", nullable = false)
    private Integer qtdEstoque;

    @Column(name = "DT_FABRICACAO", nullable = false)
    private LocalDate dtFabricacao;

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(Integer qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public LocalDate getDtFabricacao() {
        return dtFabricacao;
    }

    public void setDtFabricacao(LocalDate dtFabricacao) {
        this.dtFabricacao = dtFabricacao;
    }
}
