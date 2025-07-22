package Class;

import java.util.Random;
import java.util.Scanner;

public class Endereco {
    private int id;
    private String rua;
    private String bairro;
    private String cidade;
    private String estado;
    private String pais;

    public Endereco(String rua, String bairro, String cidade, String estado, String pais) {
        this.id = new Random().nextInt(1000);
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
    }

    public int getId() {
        return id;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    public static Endereco cadastrarEndereco() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Rua: ");
        String rua = scan.nextLine();
        System.out.print("Bairro: ");
        String bairro = scan.nextLine();
        System.out.print("Cidade: ");
        String cidade = scan.nextLine();
        System.out.print("Estado: ");
        String estado = scan.nextLine();
        System.out.print("País: ");
        String pais = scan.nextLine();
        return new Endereco(rua, bairro, cidade, estado, pais);
    }
    public String toString() {
        return rua + ", " + bairro + ", " + cidade + ", " + estado + ", " + pais;
    }
}
