package Penitenciaria;

import java.util.Random;

public class Detentos {
    private int id;
    private String nome;
    private String cpf;
    private String responsavel;
    private String Naturalidade;
    private UnidadePrisional unidadePrisional;

    public Detentos(int id, String nome, String cpf, String responsavel, String naturalidade, UnidadePrisional unidadePrisional) {
        this.id = new Random().nextInt();
        this.nome = nome;
        this.cpf = cpf;
        this.responsavel = responsavel;
        Naturalidade = naturalidade;
        this.unidadePrisional = unidadePrisional;
    }

    public int getId() {
        return id;
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

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getNaturalidade() {
        return Naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        Naturalidade = naturalidade;
    }

    public UnidadePrisional getUnidadePrisional() {
        return unidadePrisional;
    }

    public void setUnidadePrisional(UnidadePrisional unidadePrisional) {
        this.unidadePrisional = unidadePrisional;
    }
}
