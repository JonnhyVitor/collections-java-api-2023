package OperacoesBasica;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //atrbuto
    private List<Tarefa> tarefaList;


    public ListaTarefa(){
        this.tarefaList = new ArrayList<>();

    }

    public void adicionarTarefa(String discricao) {
      tarefaList.add(new Tarefa(discricao));}

         public void removerTarefa(String descricao){
         List<Tarefa> tarefasParaRemover = new ArrayList<>();
         for(Tarefa T : tarefaList){
             if(T.getDiscricao().equalsIgnoreCase(descricao))

            {
                tarefasParaRemover.add(T);
            }

        }
        tarefaList.removeAll(tarefasParaRemover);
    }
    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }
    public void obterDescricoesTarefas(){

        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("O numero total de elementos na lista é:"+listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");


        System.out.println("O numero total de elementos na lista é:"+listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("Tarefa 2");

        System.out.println("O numero total de elementos na lista é:"+listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();
    }

}
