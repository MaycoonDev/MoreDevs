package Penitenciaria;

import java.util.Random;

public class Funcionarios {
    private int id;
    private String nome;
    private String cargo;
    private UnidadePrisional unidadePrisional;

    public Funcionarios(int id, String nome, String cargo, UnidadePrisional unidadePrisional) {
        this.id = new Random().nextInt(1000);
        this.nome = nome;
        this.cargo = cargo;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public UnidadePrisional getUnidadePrisional() {
        return unidadePrisional;
    }

    public void setUnidadePrisional(UnidadePrisional unidadePrisional) {
        this.unidadePrisional = unidadePrisional;
    }
}
