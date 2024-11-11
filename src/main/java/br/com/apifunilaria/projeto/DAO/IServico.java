package br.com.apifunilaria.projeto.DAO;

import org.springframework.data.repository.CrudRepository;
import br.com.apifunilaria.projeto.model.Servico;

public interface IServico extends CrudRepository<Servico, Integer>{

}
