package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CatalogoLivros {
    //atributos
    private List<Livro> livrosList;

    public CatalogoLivros() {
        this.livrosList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livrosList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> LivrosPorAutor = new ArrayList<>();
        if (!livrosList.isEmpty()) {
            for (Livro l : livrosList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    LivrosPorAutor.add(l);
                }
            }
        }
        return LivrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervalorAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livrosList.isEmpty()) {
            for (Livro l : livrosList) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public List<Livro> pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!livrosList.isEmpty()) {
            for (Livro l : livrosList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return Collections.singletonList(livroPorTitulo);
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Java Como Programar", "Deitel", 2015);
        catalogoLivros.adicionarLivro("Java Para Web", "Roger", 2017);
        catalogoLivros.adicionarLivro("Java Para Iniciantes", "Deitel", 2019);
        catalogoLivros.adicionarLivro("Java Para Web", "Miguel", 2020);
        catalogoLivros.adicionarLivro("Java Para Desktop", "Davi", 2015);

        System.out.println("Livros por autor: " + catalogoLivros.pesquisarPorAutor("Miguel"));
        System.out.println("Livros por ano: " + catalogoLivros.pesquisarPorIntervalorAnos(2015, 2015));
        System.out.println("Livros por titulo: " + catalogoLivros.pesquisarPorTitulo("Java Para Web"));

    }
}
