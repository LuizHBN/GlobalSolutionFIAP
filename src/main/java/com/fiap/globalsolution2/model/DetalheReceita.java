package com.fiap.globalsolution2.model;

public class DetalheReceita {
    private long id;
    private Receita receita;
    private String remedio;
    private String dosagem;
    private String frequencia;
    private String prazo;

    public DetalheReceita(long id, Receita receita, String remedio, String dosagem, String frequencia, String prazo) {
        this.id = id;
        this.receita = receita;
        this.remedio = remedio;
        this.dosagem = dosagem;
        this.frequencia = frequencia;
        this.prazo = prazo;
    }

    public DetalheReceita() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Receita getReceita() {
        return receita;
    }

    public void setReceita(Receita receita) {
        this.receita = receita;
    }

    public String getRemedio() {
        return remedio;
    }

    public void setRemedio(String remedio) {
        this.remedio = remedio;
    }

    public String getDosagem() {
        return dosagem;
    }

    public void setDosagem(String dosagem) {
        this.dosagem = dosagem;
    }

    public String getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(String frequencia) {
        this.frequencia = frequencia;
    }

    public String getPrazo() {
        return prazo;
    }

    public void setPrazo(String prazo) {
        this.prazo = prazo;
    }
}
