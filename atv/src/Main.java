public class Main {
    public static void main(String[] args) {


        Pessoa p = new Professor("BOB",45,"Algebra");
        Pessoa a = new Aluno("Joãozinho",12);
        Disciplina d = new Disciplina("Matemática");





       // d.cadastrarAluno((Aluno) a);
      //  d.ministrarDisciplina((Professor) p);

        System.out.println("Informações do Professor:");
        System.out.println(p);

        System.out.println("Informações do Aluno:");
        System.out.println(a);

        System.out.println("Informações da disciplina:");
        System.out.println(d);
    }
}