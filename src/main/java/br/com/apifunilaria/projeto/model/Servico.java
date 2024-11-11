package br.com.apifunilaria.projeto.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "servico")
public class Servico {

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

    @Column(name = "fabricante", length = 50, nullable = true)
    private String fabricante;
    @Column(name = "modelo", length = 50, nullable = true)
    private String modelo;
    @Column(name = "ano", length = 5, nullable = true)
    private String ano;
    @Column(name = "placa", length = 10, nullable = true)
    private String placa;

    @Column(name = "tiposerv", length = 200, nullable = true)
    private String tiposerv;
    @Column(name = "valorserv", length = 50, nullable = true)
    private String valorserv;
    @Column(name = "dataini", length = 15, nullable = true)
    private String dataini;
    @Column(name = "datafim", length = 15, nullable = true)
    private String datafim;



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


    public String getFabricante() {
        return fabricante;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getAno() {
        return ano;
    }
    public void setAno(String ano) {
        this.ano = ano;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }


    public String getTiposerv() {
        return tiposerv;
    }
    public void setTiposerv(String tiposerv) {
        this.tiposerv = tiposerv;
    }
    public String getValorserv() {
        return valorserv;
    }
    public void setValorserv(String valorserv) {
        this.valorserv = valorserv;
    }
    public String getDataini() {
        return dataini;
    }
    public void setDataini(String dataini) {
        this.dataini = dataini;
    }
    public String getDatafim() {
        return datafim;
    }
    public void setDatafim(String datafim) {
        this.datafim = datafim;
    }   

}