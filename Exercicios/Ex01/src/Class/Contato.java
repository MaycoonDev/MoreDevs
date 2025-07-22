package Class;

import java.util.Random;
import java.util.Scanner;

public class Contato {
    private int id;
    private String email;
    private String numeroTel;

    public Contato(String email, String numeroTel) {
        this.id = new Random().nextInt(1000);
        this.email = email;
        this.numeroTel = numeroTel;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumeroTel() {
        return numeroTel;
    }

    public void setNumeroTel(String numeroTel) {
        this.numeroTel = numeroTel;
    }
    public static Contato cadastrarContato() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Email: ");
        String email = scan.nextLine();
        System.out.print("Telefone: ");
        String telefone = scan.nextLine();
        return new Contato(email, telefone);
    }
    public String toString() {
        return "Email: " + email + ", Telefone: " + numeroTel;
    }
}
