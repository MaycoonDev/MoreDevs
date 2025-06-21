import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<String> nomes = new ArrayList<>(10);
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        while(true){
            System.out.println("------------------------------------\n0 - SAIR\n1 - CADASTRAR NOME\n2 - BUSCAR NOME");
            String op = scan.next();

            if (op.equals("0"))break;

            switch (op){
                case "1":
                    cadNome();
                    break;
                case "2":
                    busNome();
                    break;
                default:
                    break;
            }
        }

    }

    public static void cadNome() {
        System.out.println("------------------------------------\nDIGITE O NOME: ");
        String nome = scan.next();
        nomes.add(nome);
    }

    public static void busNome(){
        System.out.println("DIGITE O NOME QUE DESEJA BUSCAR: ");
        String nome = scan.next();
        int nVezes = 0;
        for (int i = 0; i < nomes.size(); i++) {
            if (nomes.get(i).equals(nome)){
                nVezes++;
            }
        }
        if (nVezes > 0){
            System.out.println("ACHEI O NOME "+nome+ " EM UM TOTAL DE "+nVezes+" VEZES");
        }else System.out.println("NAO ACHEI");

    }
}