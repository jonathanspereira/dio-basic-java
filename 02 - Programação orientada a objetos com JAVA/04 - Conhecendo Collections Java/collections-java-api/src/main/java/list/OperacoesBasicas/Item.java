package main.java.list.OperacoesBasicas;

public class Item {
    //atributo
    private String nome;
    private double preco;
    private int quantidade;

    //construtor
    public Item(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = 1;
    }

    public String getNome() {
        return nome;
    }

    public double getpreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return nome + preco + quantidade;
    }
}
