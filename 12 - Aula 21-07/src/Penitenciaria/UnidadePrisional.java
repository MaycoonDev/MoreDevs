package Penitenciaria;
import java.util.ArrayList;
import java.util.List;

import java.util.Random;

public class UnidadePrisional {
    private int id;
    private String nome;
    private int capacidadeMax;
    private int numeroDetentos;
    private int numeroFuncionarios;

    private List<Detentos> detentos = new ArrayList<>();
    private List<Funcionarios> funcionarios = new ArrayList<>();

    public UnidadePrisional(int id, String nome, int capacidadeMax, int numeroDetentos, int numeroFuncionarios) {
        this.id = new Random().nextInt(1000);
        this.nome = nome;
        this.capacidadeMax = capacidadeMax;
        this.numeroDetentos = numeroDetentos;
        this.numeroFuncionarios = numeroFuncionarios;
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

    public int getCapacidadeMax() {
        return capacidadeMax;
    }

    public void setCapacidadeMax(int capacidadeMax) {
        this.capacidadeMax = capacidadeMax;
    }

    public int getNumeroDetentos() {
        return numeroDetentos;
    }

    public void adicionarDetento(Detentos detento) {
        detentos.add(detento);
        this.numeroDetentos = detentos.size();
    }

    public int getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void adicionarFuncionario(Funcionarios funcionario) {
        funcionarios.add(funcionario);
        this.numeroFuncionarios = funcionarios.size();
    }

    public void listarDetentos() {
        System.out.println("\n--- Detentos da Unidade ---");
        for (Detentos d : detentos) {
            System.out.println("- " + d.getNome() + " | CPF: " + d.getCpf());
        }
    }
    public void listarFuncionarios() {
        System.out.println("\n--- Funcionários da Unidade ---");
        for (Funcionarios f : funcionarios) {
            System.out.println("- " + f.getNome() + " | Cargo: " + f.getCargo());
        }
    }
}
