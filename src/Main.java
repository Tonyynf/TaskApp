import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Tarefa> ListaTarefas = new ArrayList<Tarefa>();

        System.out.println("\nHello and welcome!\n");

        String SorN = "";
        do{
            System.out.print("Digite o nome da tarefa: ");
            String nomeTarefa = scanner.nextLine();

            System.out.print("Digite a descrição da tarefa: ");
            String descricaoTarefa = scanner.nextLine();

            Tarefa tarefa = new Tarefa(nomeTarefa, descricaoTarefa);
            ListaTarefas.add(tarefa);

            System.out.println("""
                    Deseja adicionar outra tarefa?
                     'S' para Sim
                     'N' para Não
                    """);

            SorN = scanner.nextLine();

        }while(Objects.equals(SorN, "S") || Objects.equals(SorN, "s"));

        System.out.println("LISTA DE TAREFAS\n");

       for(Tarefa tarefa: ListaTarefas){
           System.out.printf("""
                   Tarefa: %s
                   Descrição: %s
                   
                   """, tarefa.getNome(), tarefa.getDescricao());
       }

    }
}