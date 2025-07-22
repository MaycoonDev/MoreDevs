package Class;

import java.util.Random;
import java.util.Scanner;

public class Pessoa {
    private int id;
    private String nome;
    private Endereco endereco;
    private Contato contato;

    public Pessoa(String nome, Endereco endereco, Contato contato) {
        this.id = new Random().nextInt(1000);
        this.nome = nome;
        this.endereco = endereco;
        this.contato = contato;

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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }
    public static Pessoa cadastrarPessoa() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = scan.nextLine();
        Endereco endereco = Endereco.cadastrarEndereco();
        Contato contato = Contato.cadastrarContato();
        return new Pessoa(nome, endereco, contato);
    }
    public String toString() {
        return "ID: " + id + "\nNome: " + nome;
    }

}
