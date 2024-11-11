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

import br.com.apifunilaria.projeto.DAO.IServico;
import br.com.apifunilaria.projeto.model.Servico;

@RestController
@CrossOrigin("*")
@RequestMapping("/novoservico")
public class ServicoController {

    @Autowired
    private IServico dao;

    @GetMapping
    public ResponseEntity<List<Servico>> ListaServicos() {
        List<Servico> lista = (List<Servico>) dao.findAll();
        return ResponseEntity.status(200).body(lista);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Servico>> VerServicos(@PathVariable Integer id) {
        Optional<Servico> lista = dao.findById(id);
        return ResponseEntity.status(200).body(lista);
    }

    @PostMapping
    public ResponseEntity<Servico> criarServico(@RequestBody Servico servico) {
        Servico servicoNovo = dao.save(servico);
        return ResponseEntity.status(201).body(servicoNovo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Servico> editarServico(@RequestBody Servico servico) {
        Servico servicoNovo = dao.save(servico);
        return ResponseEntity.status(201).body(servicoNovo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> excluirServico(@PathVariable Integer id) {
        dao.deleteById(id);
        return ResponseEntity.status(204).build();
    }
}
