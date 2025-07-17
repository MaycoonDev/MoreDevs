package Ex01;

import java.util.Random;

public class Pessoa {
    public int id;
    public String nome;
    public int idade;
    public double altura;
    private Endereco endereco;

    public Pessoa (int id,String nome,int idade, double altura){
        this.id = new Random().nextInt(999);
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;

    }
    public Pessoa(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}

