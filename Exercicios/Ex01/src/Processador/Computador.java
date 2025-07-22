package Processador;

public class Computador {
    private int id;
    private String nome;
    private String modelo;
    private Processador procesador;

    public int getId() {
        return id;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Processador getProcesador() {
        return procesador;
    }

    public void setProcesador(Processador procesador) {
        this.procesador = procesador;
    }

    public Computador(int id, String nome, String modelo, Processador procesador) {
        this.id = id;
        this.nome = nome;
        this.modelo = modelo;
        this.procesador = procesador;
    }
}
