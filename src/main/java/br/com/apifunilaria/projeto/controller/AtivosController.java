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

import br.com.apifunilaria.projeto.DAO.IAtivos;
import br.com.apifunilaria.projeto.model.Ativos;

@RestController
@CrossOrigin("*")
@RequestMapping("/ativos")
public class AtivosController {

    @Autowired
    private IAtivos dao;

    @GetMapping
    public ResponseEntity<List<Ativos>> ListaAtivos() {
        List<Ativos> lista = (List<Ativos>) dao.findAll();
        return ResponseEntity.status(200).body(lista);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Ativos>> VerAtivos(@PathVariable Integer id) {
        Optional<Ativos> lista = dao.findById(id);
        return ResponseEntity.status(200).body(lista);
    }

    @PostMapping
    public ResponseEntity<Ativos> criarAtivos(@RequestBody Ativos Ativos) {
        Ativos AtivosNovo = dao.save(Ativos);
        return ResponseEntity.status(201).body(AtivosNovo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Ativos> editarAtivos(@RequestBody Ativos Ativos) {
        Ativos AtivosNovo = dao.save(Ativos);
        return ResponseEntity.status(201).body(AtivosNovo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> excluirAtivos(@PathVariable Integer id) {
        dao.deleteById(id);
        return ResponseEntity.status(204).build();
    }
}
