import Penitenciaria.UnidadePrisional;
import Penitenciaria.Detentos;
import Penitenciaria.Funcionarios;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<UnidadePrisional> unidades = new ArrayList<>();

        UnidadePrisional unidade1 = new UnidadePrisional(0, "Presídio Central", 500, 0, 0);
        UnidadePrisional unidade2 = new UnidadePrisional(0, "Penitenciária Regional", 300, 0, 0);

        unidades.add(unidade1);
        unidades.add(unidade2);

        Funcionarios funcionario1 = new Funcionarios(0, "João Silva", "Agente Penitenciário", unidade1);
        unidade1.adicionarFuncionario(funcionario1);

        Detentos detento1 = new Detentos(0, "Carlos Alberto", "123.456.789-00", "Dr. Renato", "São Paulo", unidade1);
        unidade1.adicionarDetento(detento1);

        Funcionarios funcionario2 = new Funcionarios(0, "Maria Souza", "Psicóloga", unidade2);
        unidade2.adicionarFuncionario(funcionario2);

        Detentos detento2 = new Detentos(0, "José da Silva", "987.654.321-00", "Dr. Roberta", "Rio de Janeiro", unidade2);
        unidade2.adicionarDetento(detento2);

        for (UnidadePrisional unidade : unidades) {
            System.out.println("\nUnidade: " + unidade.getNome());
            System.out.println("Capacidade Máxima: " + unidade.getCapacidadeMax());
            System.out.println("Total de Detentos: " + unidade.getNumeroDetentos());
            System.out.println("Total de Funcionários: " + unidade.getNumeroFuncionarios());

            unidade.listarDetentos();
            unidade.listarFuncionarios();
        }
    }
}
