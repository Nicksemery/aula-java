public class Disciplina {
    private String nome;
    private Aluno aluno;
    private Professor professor;

    public Disciplina(){}
    public Disciplina(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void cadastrarAluno(Aluno aluno){
        this.aluno = aluno;
    }
    public void ministrarDisciplina(Professor professor){
        this.professor = professor;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "nome='" + nome + '\'' +
                ", aluno=" + aluno +
                ", professor=" + professor +
                '}';
    }
}
