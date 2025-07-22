package Ex01;

import java.util.Random;

public class Paciente {
    private int id;
    private String nome;
    private int idade;
    private String cpf;

    public Paciente(int id, String nome, int idade, String cpf) {
        this.id = new Random().nextInt(1000);
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public Paciente() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
