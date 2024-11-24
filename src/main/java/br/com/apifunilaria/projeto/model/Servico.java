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