public final class Professor extends Pessoa implements Remuneravel{
    private String especialidade;

    public Professor(){}
    public Professor(String nome, int idade, String especialidade){
        super(nome,idade);
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        return super.toString() +
                "especialidade='" + especialidade + '\'' +
                '}';
    }

    @Override
    public void aplicarBonus() {

    }

    @Override
    public void calcularSalairo() {


    }

}
