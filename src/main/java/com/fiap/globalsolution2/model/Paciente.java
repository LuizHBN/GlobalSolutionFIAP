package com.fiap.globalsolution2.model;

import java.math.BigInteger;
import java.util.Date;

public class Paciente {
    private long id;
    private String nome;
    private String cpf;
    private Date dt_nascimento;
    private double peso;
    private String sexo;
    private double altura;

    public Paciente(long id, String nome, String cpf, Date dt_nascimento, double peso, String sexo, double altura) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.dt_nascimento = dt_nascimento;
        this.peso = peso;
        this.sexo = sexo;
        this.altura = altura;
    }

    public Paciente() {
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDt_nascimento() {
        return dt_nascimento;
    }

    public void setDt_nascimento(Date dt_nascimento) {
        this.dt_nascimento = dt_nascimento;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
