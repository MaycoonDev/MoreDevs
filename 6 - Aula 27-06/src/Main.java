import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

//        Pessoa p1 = new Pessoa();
//        p1.nome = scan.nextLine();
//        p1.idade = scan.nextInt();
//        p1.altura = scan.nextDouble();
//
//        System.out.println(p1.nome + " " + p1.idade + " " + p1.altura);
//
//        Pessoa p2 = new Pessoa();
//        p2.nome = scan.nextLine();
//        p2.idade = scan.nextInt();
//        p2.altura = scan.nextDouble();
//
//        System.out.println(p2.nome + " " + p2.idade + " " + p2.altura);

//        Animal a1 = new Animal();
//
//        a1.especie = scan.nextLine();
//        a1.idade = scan.nextInt();
//        a1.comprimento = scan.nextDouble();
//
//        System.out.println(a1.especie + " " + a1.idade + " " + a1.comprimento);

//        BolasGolf bolas = new BolasGolf();
//        System.out.println("Digite o raio de bola: ");
//        bolas.raio = scan.nextDouble();
//        System.out.println("Digite a cor de bola: ");
//        scan.nextLine();
//        bolas.cor =  scan.nextLine();
//        bolas.mostrarDados();

//        Produto produto = new Produto();
//
//        System.out.println("Digite o nome do produto: ");
//        produto.nome = scan.nextLine();
//
//        System.out.println("Digite o categoria do produto: ");
//        produto.categoria = scan.nextLine();
//
//        produto.imprimir();
//
//        produto.diminuiEstoque();

        ContaBancaria cb1 = new ContaBancaria();

        System.out.println("Digite o nome do titular: ");
        cb1.titular = scan.nextLine();

        System.out.println("Digite o saldo da conta: ");
        cb1.saldo = scan.nextDouble();

        cb1.exbConta();

        cb1.depositar();

        cb1.sacar();

    }
}