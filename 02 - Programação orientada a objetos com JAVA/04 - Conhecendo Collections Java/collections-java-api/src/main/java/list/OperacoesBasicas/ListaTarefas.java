package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaTarefas  {
    //atributo
    private List<Tarefa> tarefalist;

    public ListaTarefas() {
        this.tarefalist = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefalist.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
      List<Tarefa> tarefasParaRemover = new ArrayList<>();
      for (Tarefa t : tarefalist) {
       if (t.getDescricao().equals(descricao)) {
           tarefasParaRemover.add(t);
       }
      }
      tarefalist.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        return tarefalist.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(tarefalist);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        System.out.println("O numero total de elementos da lista é: " + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Estudar Python");
        listaTarefas.adicionarTarefa("Estudar JavaScript");
        listaTarefas.adicionarTarefa("Estudar C#");
        listaTarefas.adicionarTarefa("Estudar Kotlin");
        listaTarefas.adicionarTarefa("Estudar Swift");
        listaTarefas.adicionarTarefa("Estudar Go");
        listaTarefas.adicionarTarefa("Estudar Rust");
        listaTarefas.adicionarTarefa("Estudar Scala");



        System.out.println("O numero total de elementos da lista é: " + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.removerTarefa( "Estudar Rust");
        System.out.println("O numero total de elementos da lista é: " + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.obterDescricoesTarefas();
    }
}
