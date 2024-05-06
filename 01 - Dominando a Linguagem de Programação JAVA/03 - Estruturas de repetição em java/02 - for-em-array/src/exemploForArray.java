public class exemploForArray {
    public static void main(String[] args) throws Exception {

        // em arrays o indice se inicia em ZERO
        String alunos[] = { "Felipe", "Jonas", "Julia", "Marcos"};

        for (int x=0; x<alunos.length; x++){

            System.out.println("O aluno do indice x = " + x + " é " + alunos[x]);

        }


    }
}
