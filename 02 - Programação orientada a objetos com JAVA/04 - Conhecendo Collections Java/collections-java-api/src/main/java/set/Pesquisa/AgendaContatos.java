package main.java.set.Pesquisa;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class AgendaContatos {
    //atributos
    private Set<Contato> contatoSet;

    public AgendaContatos(int tamanho) {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome,int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNomes = new HashSet<>();
        for (Contato c : contatoSet) {
            if (c.getNome().equals(nome)) {
                contatosPorNomes.add(c);
            }
        }
        return contatosPorNomes;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos(10);

        agenda.exibirContato();

        agenda.adicionarContato("João", 123456);
        agenda.adicionarContato("Maria", 654321);
        agenda.adicionarContato("José", 987654);
        agenda.adicionarContato("Ana", 456789);
        agenda.adicionarContato("João", 1456);

        agenda.exibirContato();

        System.out.println(agenda.pesquisarPorNome("João"));
        System.out.println("Contato Atualizado" + agenda.atualizarNumeroContato("Maria", 111111));

        agenda.exibirContato();

        System.out.println(agenda.pesquisarPorNome("João"));

    }


}
