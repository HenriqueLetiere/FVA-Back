package br.com.apifunilaria.projeto.DAO;

import org.springframework.data.repository.CrudRepository;
import br.com.apifunilaria.projeto.model.Cliente;

public interface ICliente extends CrudRepository<Cliente, Integer>{

}
