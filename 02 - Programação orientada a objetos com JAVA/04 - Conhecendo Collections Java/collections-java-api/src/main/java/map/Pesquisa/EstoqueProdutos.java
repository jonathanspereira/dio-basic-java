package main.java.map.Pesquisa;

import java.util.Map;
import java.util.HashMap;

public class EstoqueProdutos {
    //atributos

    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(Long codigo, Produto produto) {
        estoqueProdutosMap.put(codigo, produto);
    }

    public void exibirProdutos() {
        System.out.println(estoqueProdutosMap);
    }

    private double calcularTotalEstoque() {
        double valorTotalEstoque = 0d;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                valorTotalEstoque += p.getPreco() * p.getQuantidade();
            }
        }
        return valorTotalEstoque;
    }

    private Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if (p.getPreco() > maiorPreco) {
                    maiorPreco = p.getPreco();
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }

    private Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if (p.getPreco() < menorPreco) {
                    menorPreco = p.getPreco();
                    produtoMaisBarato = p;
                }
            }
        }
        return produtoMaisBarato;
    }

    private Produto obterProdutoMaisEstocado() {
        Produto produtoMaisEstocado = null;
        int maiorQuantidade = Integer.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if (p.getQuantidade() > maiorQuantidade) {
                    maiorQuantidade = p.getQuantidade();
                    produtoMaisEstocado = p;
                }
            }
        }
        return produtoMaisEstocado;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();
        estoque.exibirProdutos();

        Produto p1 = new Produto("Arroz", 10.0, 5);
        Produto p2 = new Produto("Feijão", 15.0, 2);
        Produto p3 = new Produto("Macarrão", 5.0, 10);
        Produto p4 = new Produto("Carne", 20.0, 2);

        estoque.adicionarProduto(1L, p1);
        estoque.adicionarProduto(2L, p2);
        estoque.adicionarProduto(3L, p3);
        estoque.adicionarProduto(4L, p4);

        estoque.exibirProdutos();

        System.out.println("Valor total do estoque: " + estoque.calcularTotalEstoque());
        System.out.println("Produto mais caro: " + estoque.obterProdutoMaisCaro());
        System.out.println("Produto mais barato: " + estoque.obterProdutoMaisBarato());
        System.out.println("Produto mais estocado: " + estoque.obterProdutoMaisEstocado());
    }
}
