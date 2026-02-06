package com.projeto.view;

import com.projeto.model.Tarefa;
import com.projeto.service.TarefaService;
import javax.swing.*;
import java.util.Scanner;

public class MenuConsole {
    private TarefaService service = new TarefaService();
    private Scanner leitor = new Scanner(System.in);

    public void exibir(){
        String SorN = "";
        String nome = JOptionPane.showInputDialog("Nome da tarefa: ");
        String descricao = JOptionPane.showInputDialog("Descricao da tarefa: ");

        Tarefa novaTarefa = new Tarefa(nome, descricao);
        service.adicionarTarefa(novaTarefa);

        JOptionPane.showMessageDialog(null, "Tarefa Salva: " + novaTarefa.getNome());
    }

}
