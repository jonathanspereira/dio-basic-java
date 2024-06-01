package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarrinhoDeCompras {
    //atributo
    private List<Item> itens;

    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        itens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        for (Item i : itens) {
            if (i.getNome().equals(nome)) {
                itensParaRemover.add(i);
            }
        }
        itens.removeAll(itensParaRemover);
    }

    public double calcularValorTotal() {
        double total = 0;
        for (Item i : itens) {
            total += i.getpreco();
        }
        return total;
    }

    public void exibirItens() {
        System.out.println(itens);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        System.out.println("O valor total da compra é: " + carrinhoDeCompras.calcularValorTotal());

        System.out.println("Adicionando itens ao carrinho de compras...");
        carrinhoDeCompras.adicionarItem("Notebook", 4500.00, 1);
        carrinhoDeCompras.adicionarItem("Smartphone", 2500.00, 1);
        carrinhoDeCompras.adicionarItem("Tablet", 1500.00, 1);
        carrinhoDeCompras.adicionarItem("Smartwatch", 1000.00, 1);
        carrinhoDeCompras.adicionarItem("Fone de ouvido", 500.00, 1);
        carrinhoDeCompras.adicionarItem("Mouse", 100.00, 1);
        carrinhoDeCompras.adicionarItem("Teclado", 200.00, 1);
        carrinhoDeCompras.adicionarItem("Monitor", 1500.00, 1);
        carrinhoDeCompras.adicionarItem("Impressora", 1000.00, 1);

        carrinhoDeCompras.exibirItens();
        System.out.println("O valor total da compra é: " + carrinhoDeCompras.calcularValorTotal());

        System.out.println("removendo itens do carrinho de compras...");
        carrinhoDeCompras.removerItem("Impressora");
        carrinhoDeCompras.removerItem("Monitor");
        carrinhoDeCompras.removerItem("Teclado");

        carrinhoDeCompras.exibirItens();
        System.out.println("O valor atualizado total da compra é: " + carrinhoDeCompras.calcularValorTotal());
    }
}
