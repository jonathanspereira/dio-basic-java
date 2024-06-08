package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    //atributos
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoaPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorIdade);
        return pessoaPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorAltura,new comparatorPorAltura());
        return pessoaPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("Maria", 25, 1.70);
        ordenacaoPessoa.adicionarPessoa("João", 30, 1.80);
        ordenacaoPessoa.adicionarPessoa("Ana", 20, 1.60);
        ordenacaoPessoa.adicionarPessoa("Pedro", 35, 1.75);

        System.out.println("Ordenado por idade: " + ordenacaoPessoa.ordenarPorIdade());

        System.out.println("\nOrdenado por altura: " + ordenacaoPessoa.ordenarPorAltura());
    }
}
