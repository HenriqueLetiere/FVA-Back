package br.com.apifunilaria.projeto.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.apifunilaria.projeto.DAO.IVeiculo;
import br.com.apifunilaria.projeto.model.Veiculo;

@RestController
@CrossOrigin("*")
@RequestMapping("/veiculo")
public class VeiculoController {

    @Autowired
    private IVeiculo dao;

    @GetMapping
    public ResponseEntity<List<Veiculo>> ListaVeiculos() {
        List<Veiculo> lista = (List<Veiculo>) dao.findAll();
        return ResponseEntity.status(200).body(lista);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Veiculo>> VerVeiculos(@PathVariable Integer id) {
        Optional<Veiculo> lista = dao.findById(id);
        return ResponseEntity.status(200).body(lista);
    }

    @PostMapping
    public ResponseEntity<Veiculo> criarVeiculo(@RequestBody Veiculo Veiculo) {
        Veiculo VeiculoNovo = dao.save(Veiculo);
        return ResponseEntity.status(201).body(VeiculoNovo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Veiculo> editarVeiculo(@RequestBody Veiculo Veiculo) {
        Veiculo VeiculoNovo = dao.save(Veiculo);
        return ResponseEntity.status(201).body(VeiculoNovo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> excluirVeiculo(@PathVariable Integer id) {
        dao.deleteById(id);
        return ResponseEntity.status(204).build();
    }
}
