public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};

        for (int x = 0; x < alunos.length; x++) {
            System.out.println("O aluno no índice " + x + " é " + alunos[x]);
        }

        for (String aluno : alunos) { //for each
            System.out.println(aluno);
        }
    }
}
