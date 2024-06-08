package main.java.set.Ordenacao;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    // Atributos

    private Set<Produtos> produtosSet;

    public CadastroProdutos() {
        this.produtosSet = new HashSet<>();
    }

    private void adicionarProduto(long codigo, String nome, double preco, int quantidade) {
        produtosSet.add(new Produtos(codigo, nome, preco, quantidade));
    }

    public Set<Produtos> exibirProdutosPorNome() {
        Set<Produtos> produtosPorNome = new TreeSet<>(produtosSet);
        return produtosPorNome;
    }

    public Set<Produtos> exibirProdutosPorPreco() {
        Set<Produtos> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtosSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(1, "Produto 1", 10.0, 10);
        cadastroProdutos.adicionarProduto(2, "Produto 4", 20.0, 20);
        cadastroProdutos.adicionarProduto(1, "Produto 3", 30.0, 30);
        cadastroProdutos.adicionarProduto(4, "Produto 2", 40.0, 40);
        cadastroProdutos.adicionarProduto(5, "Produto 5", 50.0, 50);

        System.out.println(cadastroProdutos.produtosSet);

        System.out.println(cadastroProdutos.exibirProdutosPorNome());

        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }
}
