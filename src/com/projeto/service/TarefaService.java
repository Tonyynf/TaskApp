package com.projeto.service;

import com.projeto.model.Tarefa;
import java.util.ArrayList;
import java.util.List;

public class TarefaService {
    private List<Tarefa> listaTarefas = new ArrayList<Tarefa>();

    public void adicionarTarefa(Tarefa t){
        listaTarefas.add(t);
    }

    public List<Tarefa> buscarTodasAsTarefas(){
        return listaTarefas;
    }
}
