package br.com.apifunilaria.projeto.DAO;

import org.springframework.data.repository.CrudRepository;
import br.com.apifunilaria.projeto.model.Ativos;

public interface IAtivos extends CrudRepository<Ativos, Integer>{

}
