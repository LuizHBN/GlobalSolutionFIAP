package com.fiap.globalsolution2.model;

import java.util.Date;

public class Medico {

    private long id;
    private String nome;
    private String crm;
    private Date dt_nascimento;
    private String area_atuacao;

    public Medico(long id, String nome, String crm, Date dt_nascimento, String area_atuacao) {
        this.id = id;
        this.nome = nome;
        this.crm = crm;
        this.dt_nascimento = dt_nascimento;
        this.area_atuacao = area_atuacao;
    }

    public Medico() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public Date getDt_nascimento() {
        return dt_nascimento;
    }

    public void setDt_nascimento(Date dt_nascimento) {
        this.dt_nascimento = dt_nascimento;
    }

    public String getArea_atuacao() {
        return area_atuacao;
    }

    public void setArea_atuacao(String area_atuacao) {
        this.area_atuacao = area_atuacao;
    }
}
