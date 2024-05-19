public class Aluno extends Pessoa {
    private String curso;
    private String disciplina;

    public Aluno(String cpf, String nome, int idade, String curso, String disciplina) {
        super(cpf, nome, idade);
        this.curso = curso;
        this.disciplina = disciplina;
    }

    public String getCurso() {

        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public String toString() {
        return "\nAluno {" + "\nCurso: " + curso + "\nDisciplina: " + disciplina + "\nCPF: " + getCpf() + "\nNome: " + getNome() + "\nIdade: " + getIdade() + "\n}";
    }
}
