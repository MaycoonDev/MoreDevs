import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);
    static ArrayList<Integer> numeros = new ArrayList();

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n0 - SAIR\n1 - ADICIONAR CINCO NUMEROS\n2 - MOSTRAR NUMEROS\n3 - ACESSAR INDICE\n4 - SUBSTITUIR NUMERO\n5 - ADICIONAR AO FINAL A LISTA\n6 - REMOVER INDICE\n7 - ENCONTRAR INDICE\n8 - SOMAR LISTA\n");
            String op = scan.next();
            if (op.equals("0")) break;

            switch (op) {
                case "1": adcNum();
                    break;
                case "2": acsNumeros();
                    break;
                case "3": encInd();
                    break;
                case "4": altNum();
                    break;
                case "5": adcFinalLista();
                    break;
                case "6": remNum();
                    break;
                case "7":encNum();
                    break;
                case "8": somNumeros();
                    break;
                default :
                    break;
            }
        }
    }

    public static void somNumeros(){
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

    public static void encNum(){
        System.out.println("\nDIGITE O NUMERO QUE DESEJA VER O INDICE:\n");
        int i = scan.nextInt();
        System.out.println("O NUMERO "+i+ " ESTA NO INDICE " + numeros.indexOf(i));
    }

    public static void encInd(){
        System.out.println("\nDIGITE O INDICE QUE DESEJA VER O NUMERO:\n");
        int i = scan.nextInt();
        System.out.println("NO INDICE "+i+" ESTA O NUMERO " +numeros.get(i));
    }

    public static void remNum(){
        acsNumeros();
        System.out.println("DIGITE O INDICE DO NUMERO: ");
        int i = scan.nextInt();
        numeros.remove(i);
    }

    public static void adcFinalLista(){
        System.out.println("\nDIGITE O NUMERO QUE VOCE QUER ADICIONAR: \n");
        int num = 0;
        num = scan.nextInt();
        numeros.add(num);
    }

    public static void altNum(){
        acsNumeros();
        System.out.println("DIGITE O INDICE DO NUMERO: ");
        int i = scan.nextInt();
        System.out.println("\nDIGITE O NOVO NUMERO: \n");
        int nvNum = scan.nextInt();
        numeros.set(i,nvNum);
    }

    public static void acsNumeros(){
        System.out.println("\n");
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(i+" - "+numeros.get(i));
        }
    }

    public static void adcNum(){
        System.out.println("\nDIGITE OS NUMEROS QUE VOCE QUER ADICIONAR: \n");
        int num = 0;
        for (int i = 0; i < 5 ; i++) {
            num = scan.nextInt();
            numeros.add(num);
        }
    }

}