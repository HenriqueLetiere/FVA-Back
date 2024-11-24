package br.com.apifunilaria.projeto.DAO;

import org.springframework.data.repository.CrudRepository;
import br.com.apifunilaria.projeto.model.Veiculo;

public interface IVeiculo extends CrudRepository<Veiculo, Integer>{

}
