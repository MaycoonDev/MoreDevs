import Class.Pessoa;
import Class.Endereco;
import Class.Contato;
import Processador.Marca;
import Processador.Processador;
import Processador.Computador;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
//    // Listas separadas para Pessoa, Endereco e Contato
//    public static List<Pessoa> pessoas = new ArrayList<>();
//    public static List<Endereco> enderecos = new ArrayList<>();
//    public static List<Contato> contatos = new ArrayList<>();
//
    public static void main(String[] args) {

        Marca marca = new Marca(1,"intel");
        Processador processador = new Processador(1,"lga1200",5,5.4,marca);
        Computador computador = new Computador(1,"gamer","home",processador);
        System.out.println(computador.getProcesador());


//        Scanner scan = new Scanner(System.in);
//        String opcao;
//
//        do {
//            System.out.println("\nMENU");
//            System.out.println("1 - Cadastrar Pessoa");
//            System.out.println("2 - Listar Pessoas");
//            System.out.println("0 - Sair");
//            System.out.print("Escolha: ");
//            opcao = scan.nextLine();
//
//            switch (opcao) {
//                case "1":
//                    // Cadastro
//                    System.out.println("Cadastro de Pessoa:");
//
//                    // Cadastro do endereço
//                    Endereco endereco = Endereco.cadastrarEndereco();
//                    enderecos.add(endereco);
//
//                    // Cadastro do contato
//                    Contato contato = Contato.cadastrarContato();
//                    contatos.add(contato);
//
//                    // Cadastro da pessoa, associando endereço e contato recém criados
//                    System.out.print("Nome: ");
//                    String nome = scan.nextLine();
//                    Pessoa pessoa = new Pessoa(nome, endereco, contato);
//                    pessoas.add(pessoa);
//
//                    System.out.println("Pessoa cadastrada com sucesso!");
//                    break;
//
//                case "2":
//                    // Listar tudo
//                    System.out.println("\nLista de Pessoas cadastradas:");
//                    for (int i = 0; i < pessoas.size(); i++) {
//                        System.out.println("Pessoa " + (i + 1));
//                        System.out.println(pessoas.get(i));
//                        System.out.println("Endereço: " + enderecos.get(i));
//                        System.out.println("Contato: " + contatos.get(i));
//                        System.out.println("--------------------------");
//                    }
//                    break;
//
//                case "0":
//                    System.out.println("Encerrando...");
//                    break;
//
//                default:
//                    System.out.println("Opção inválida!");
//            }
//        } while (!opcao.equals("0"));
//
//        scan.close();
    }

}
