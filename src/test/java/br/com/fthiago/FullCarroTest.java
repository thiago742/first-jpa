package br.com.fthiago;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import br.com.fthiago.dao.ICarroDAO;
import br.com.fthiago.dao.IMarcaDAO;
import br.com.fthiago.dao.MarcaDAO;
import br.com.fthiago.dao.AcessorioDAO;
import br.com.fthiago.dao.CarroDAO;
import br.com.fthiago.dao.IAcessorioDAO;
import br.com.fthiago.domain.Acessorio;
import br.com.fthiago.domain.Carro;
import br.com.fthiago.domain.Marca;

import java.util.Arrays;

public class FullCarroTest {
    
    private ICarroDAO carroDAO;
    private IMarcaDAO marcaDAO;
    private IAcessorioDAO acessorioDAO;

    @Before
    public void setUp() {
        carroDAO = new CarroDAO();
        marcaDAO = new MarcaDAO();
        acessorioDAO = new AcessorioDAO();
    }

    @Test
    public void cadastrar() {
        Carro carro = new Carro();
        Marca marca = new Marca();
        Acessorio acessorio = new Acessorio();
        
        marca.setNome("Ferrari");
        marcaDAO.cadastrar(marca);
        acessorio.setNome("Aerofólio");
        acessorioDAO.cadastrar(acessorio);
        
        carro.setModelo("Lamborghini");
        carro.setMarca(marca); 
        carro.setAcessorios(Arrays.asList(acessorio)); 
        carroDAO.cadastrar(carro); 
        
        assertNotNull(carro.getId()); 
        assertNotNull(marca.getId()); 
        assertNotNull(acessorio.getId()); 
    }

}
