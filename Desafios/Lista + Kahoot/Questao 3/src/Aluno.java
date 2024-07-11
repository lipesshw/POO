public class Aluno extends Pessoa {
    private String curso;
    private Disciplina[] disciplinas;

    public Aluno(String cpf, String nome, int idade, String curso, Disciplina[] disciplinas) {
        super(cpf, nome, idade);
        this.curso = curso;
        this.disciplinas = disciplinas;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Disciplina[] getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(Disciplina[] disciplinas) {
        this.disciplinas = disciplinas;
    }

    @Override
    public String toString() {
        StringBuilder disciplinasStr = new StringBuilder();
        for (Disciplina disciplina : disciplinas) {
            disciplinasStr.append(disciplina.getNome()).append(", ");
        }
        return "\nAluno {" + "\nCurso: " + curso + "\nDisciplinas [ " + disciplinasStr.substring(0, disciplinasStr.length() - 2) + " ]" + "\nCPF: " + getCpf() + "\nNome: " + getNome() + "\nIdade: " + getIdade() + "\n}";
    }
}