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

import br.com.apifunilaria.projeto.DAO.ICliente;
import br.com.apifunilaria.projeto.model.Cliente;

@RestController
@CrossOrigin("*")
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ICliente dao;

    @GetMapping
    public ResponseEntity<List<Cliente>> ListaClientes() {
        List<Cliente> lista = (List<Cliente>) dao.findAll();
        return ResponseEntity.status(200).body(lista);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Cliente>> VerClientes(@PathVariable Integer id) {
        Optional<Cliente> lista = dao.findById(id);
        return ResponseEntity.status(200).body(lista);
    }

    @PostMapping
    public ResponseEntity<Cliente> criarCliente(@RequestBody Cliente Cliente) {
        Cliente ClienteNovo = dao.save(Cliente);
        return ResponseEntity.status(201).body(ClienteNovo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cliente> editarCliente(@RequestBody Cliente Cliente) {
        Cliente ClienteNovo = dao.save(Cliente);
        return ResponseEntity.status(201).body(ClienteNovo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> excluirCliente(@PathVariable Integer id) {
        dao.deleteById(id);
        return ResponseEntity.status(204).build();
    }
}
