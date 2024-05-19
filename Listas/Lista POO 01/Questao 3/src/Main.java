public class Main {
    public static void main(String[] args) {
        Disciplina disciplina1 = new Disciplina("Cálculo");
        Disciplina disciplina2 = new Disciplina("POO");

        Aluno aluno = new Aluno("077.077.077-77", "Phillipi Jesus Cardoso", 19, "Ciência da Computação", new Disciplina[]{disciplina1, disciplina2});
        System.out.println(aluno);
    }
}