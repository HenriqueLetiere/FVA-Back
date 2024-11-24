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

import br.com.apifunilaria.projeto.DAO.IListAtivos;
import br.com.apifunilaria.projeto.model.ListAtivos;

@RestController
@CrossOrigin("*")
@RequestMapping("/listativos")
public class ListAtivosController {

    @Autowired
    private IListAtivos dao;

    @GetMapping
    public ResponseEntity<List<ListAtivos>> ListaListAtivoss() {
        List<ListAtivos> lista = (List<ListAtivos>) dao.findAll();
        return ResponseEntity.status(200).body(lista);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<ListAtivos>> VerListAtivoss(@PathVariable Integer id) {
        Optional<ListAtivos> lista = dao.findById(id);
        return ResponseEntity.status(200).body(lista);
    }

    @PostMapping
    public ResponseEntity<ListAtivos> criarListAtivos(@RequestBody ListAtivos ListAtivos) {
        ListAtivos ListAtivosNovo = dao.save(ListAtivos);
        return ResponseEntity.status(201).body(ListAtivosNovo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ListAtivos> editarListAtivos(@RequestBody ListAtivos ListAtivos) {
        ListAtivos ListAtivosNovo = dao.save(ListAtivos);
        return ResponseEntity.status(201).body(ListAtivosNovo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> excluirListAtivos(@PathVariable Integer id) {
        dao.deleteById(id);
        return ResponseEntity.status(204).build();
    }
}
