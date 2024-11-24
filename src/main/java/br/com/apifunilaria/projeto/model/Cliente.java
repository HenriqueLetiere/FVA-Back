package br.com.apifunilaria.projeto.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Integer id;

    @Column(name = "nome", length = 200, nullable = true)
    private String nome;
    @Column(name = "datanasc", length = 15, nullable = true)
    private String datanasc;
    @Column(name = "rg", length = 15, nullable = true)
    private String rg;
    @Column(name = "cpf", length = 15, nullable = true)
    private String cpf;
    @Column(name = "telefone", length = 15, nullable = true)
    private String telefone;
    @Column(name = "sexo", length = 15, nullable = true)
    private String sexo;

    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDatanasc() {
        return datanasc;
    }
    public void setDatanasc(String datanasc) {
        this.datanasc = datanasc;
    }
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


}