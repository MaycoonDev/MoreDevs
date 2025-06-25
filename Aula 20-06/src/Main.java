import java.sql.SQLOutput;
import java.util.*;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static ArrayList<Double> precos = new ArrayList<>();
    public static void main(String[] args) {
        atv01();
/*        while (true){
            System.out.println("------------------------------------\n0 - SAIR\n1 - CADASTRAR PREÇO\n2 - MOSTRA PREÇOS\n3 - EXCLUIR PREÇO\n4 - ALTERAR VALOR\n------------------------------------");
            String menu = scan.next();

            if (menu.equals("0")) break;

            switch (menu){
                case "1": //cadPreco();
                break;

                case "2": //mostPreco();
                break;

                case "3": //delPreco();
                break;

                case "4": //updPreco();
                break;

                default:
                    System.out.println("ENTRADA INVALIDA\n------");
                    break;
            }
        }*/
    }

    public static void updPreco(){
        try {
            mostPreco();
            System.out.println("DIGITE O INDICE DO PREÇO: ");
            int i = scan.nextInt();
            System.out.println("------------------------------------\nCERTEZA QUE DESEJA ALTERAR O PRECO DE R$"+precos.get(i)+" ?\n1 - ALTERAR\n2 - SAIR\n------------------------------------");
            if(scan.nextInt() == 1){
                System.out.println("DIGITE O NOVO VALOR: ");
                double nvPreco = scan.nextDouble();
                precos.set(i,nvPreco);
                System.out.println("------------------------------------\nALTERADO COM SUCESSO");
            }else System.out.println("VOLTANDO PARA O MENU...\n------------------------------------");

        }catch (InputMismatchException e){
            System.out.println("**VALOR INVALIDO**");
        }catch (IndexOutOfBoundsException e){
            System.out.println("**DIGITE UM INDICE VALIDO**");
        }
    }

    public static void delPreco(){
       try {
           mostPreco();
           System.out.println("nDIGITE O INDICE DO PREÇO: ");
           int i = scan.nextInt();
           System.out.println("------------------------------------\nCERTEZA QUE DESEJA REMOVER O PRECO DE R$"+precos.get(i)+" ?\n1 - EXCLUIR\n2 - SAIR\n------------------------------------");
           if(scan.nextInt() == 1){
               precos.remove(i);
               System.out.println("REMOVIDO COM SUCESSO");
           }else System.out.println("VOLTANDO PARA O MENU...\n------------------------------------");

       }catch (InputMismatchException e){
           System.out.println("**VALOR INVALIDO**");
       }catch (IndexOutOfBoundsException e){
           System.out.println("**DIGITE UM INDICE VALIDO**");
       }
    }

    public static void cadPreco(){
        try {
            System.out.println("------------------------------------\nNOVO PREÇO: R$");
            double preco = scan.nextDouble();

            if(preco < 0) System.out.println("**O PREÇO NÃO PODE SER 0**");
            else precos.add(preco);

        }catch (InputMismatchException e){
            System.out.println("**ENTRADA INVALIDA**");
        }
    }

    public static void mostPreco(){
        System.out.println("----PREÇOS CADASTRADOS----");
        for (Double preco : precos){
            System.out.println(precos.indexOf(preco)+" -  R$"+preco);
        }
    }

    public static void ex4(){
        System.out.println("Digite: noite, dia, tarde");
        String palavra =  scan.next();

        String mensagem = switch (palavra){
            case "dia" -> "bom dia";
            case "noite" -> "boa noite";
            default -> "oi";
        };
        String msg2 = switch (palavra){
            case "segunda","terça","quarta","quinta","sexta" -> "dia de semana";
            case "domingo", "sábado" -> "final de semana";
            default -> "oi";
        };
    }

    public static int ex3(int a, int b, String operacao){
        int resultado =  switch(operacao){
            case "+" -> a + b;
            case "-" -> a -b;
            case "*" -> a* b;
            case "/" -> a / b;
            default -> 0;

        };
        return resultado;
    }

    public static void atv01(){
        ArrayList<Double> notas = new ArrayList<>();

        while (true) {
            System.out.println("0 - SAIR\n1 - NOVA NOTA\nOPÇÃO");

            if (scan.next().equals("0")) break;

            System.out.println("NOTA:");
            Double nota = scan.nextDouble();
            notas.add(nota);
        }

        Double soma = 0.0;
        for (Double nota : notas) {
            soma += nota;
        }

        System.out.println("Media das notas: " + soma / notas.size());
    }

    public static void ex02(){
        //cria a lista de frutas
        ArrayList<String> frutas = new ArrayList<>();

        //cadastro de itens na lista
        while (true){
            //pergunta ao usuario oque ele quer e guarda o resultado na variavel fruta
            System.out.println("Digite o nome da Frutas:\n0-SAIR");
            String fruta = scan.next();

            //verifica oque o usuario dejesou e adciona o nome da fruta na lista
            if(fruta.equals("0")) break;
            frutas.add(fruta);
        }
        for (int i = 0; i < frutas.size(); i++) {
            System.out.println(i + "-" + frutas.get(i));
        }
    }

    public static void ex01(){
        //Uma classe que pode ser instanciada
        ArrayList<String> nomes = new ArrayList<>();

        //cada linha é um indice...
        nomes.add("Maycon");
        nomes.add("Joao");
        nomes.add("Gabriel");
        nomes.add("Maria");
        nomes.add("Piethra");

        // adiciona o elemento no indice que desejar
        nomes.add(1,"Jefessor");

        //verifica se a lista ta vazia
        nomes.isEmpty();

        //verifica o tamanho da lista
        nomes.size();

        //for para percorer a lista, baseado no tamanho
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(i + "-" + nomes.get(i));
        }

        //for para percorer a lista, baseado nos dados da lista, mas nao acompanha index, necessario codigo
        for (String nome : nomes) {
            System.out.println(nomes.indexOf(nome) + "-" + nome);
        }
    }
}