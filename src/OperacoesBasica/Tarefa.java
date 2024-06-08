package OperacoesBasica;

public class Tarefa {
    //atributo
    private String discricao;

    public Tarefa(String discricao) {
        this.discricao = discricao;

    }

    public String getDiscricao() {
        return discricao;

    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "discricao='" + discricao + '\'' +
                '}';
    }
}
