package com.projeto.model;

public class Tarefa {
    private String nome;
    private String descricao;

    //CONSTRUTOR
    public Tarefa (String nome, String descricao){
        this.nome = nome;
        this.descricao = descricao;
    }

    //GETTERS E SETTERS
    public String getNome() {
        return nome;
    }
    public boolean setNome(String nome) {
        if(nome != null && !nome.isEmpty()) {
            this.nome = nome;
            return true;
        }
        return false;
    }

    public String getDescricao() {
        return descricao;
    }
    public boolean setDescricao(String descricao) {
        if (descricao != null && !descricao.isEmpty()){
            this.descricao = descricao;
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        return String.format("Nome: %s | Descrição: %s", nome, descricao);
    }

}
