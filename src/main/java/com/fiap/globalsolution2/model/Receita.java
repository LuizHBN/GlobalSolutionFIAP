package com.fiap.globalsolution2.model;

import java.util.Date;

public class Receita {
    private long id;
    private Paciente paciente;
    private Medico medico;
    private Date dt_emissao;

    public Receita(long id, Paciente paciente, Medico medico, Date dt_emissao) {
        this.id = id;
        this.paciente = paciente;
        this.medico = medico;
        this.dt_emissao = dt_emissao;
    }

    public Receita() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Date getDt_emissao() {
        return dt_emissao;
    }

    public void setDt_emissao(Date dt_emissao) {
        this.dt_emissao = dt_emissao;
    }
}
