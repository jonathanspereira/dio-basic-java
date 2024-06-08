package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;
import java.lang.String;

public class ConjutoConvidados {
    //atributos
    private Set<Convidado> convidadoSet;

    public ConjutoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadoSet) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados() {
        return convidadoSet.size();
    }

    public  void exibirConvidados() {
        System.out.println(convidadoSet);
    }


    public static void main(String[] args) {
        ConjutoConvidados conjutoConvidados = new ConjutoConvidados();
        System.out.println("Existem: " + conjutoConvidados.contarConvidados() + " convidados");


        conjutoConvidados.adicionarConvidado("João", 1);
        conjutoConvidados.adicionarConvidado("Maria", 2);
        conjutoConvidados.adicionarConvidado("José", 1);
        conjutoConvidados.adicionarConvidado("Ana", 4);

        System.out.println("Existem: " + conjutoConvidados.contarConvidados() + " convidados");

        conjutoConvidados.removerConvidadoPorCodigoConvite(2);

        System.out.println("Existem: " + conjutoConvidados.contarConvidados() + " convidados");
    }
}
