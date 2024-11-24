package br.com.apifunilaria.projeto.DAO;

import org.springframework.data.repository.CrudRepository;
import br.com.apifunilaria.projeto.model.ListAtivos;

public interface IListAtivos extends CrudRepository<ListAtivos, Integer>{

}
