public abstract class Refeicao {
    protected String nome;
    protected int temPreparo;

    public Refeicao(){}

    public Refeicao(String nome, int temPreparo) {
        this.nome = nome;
        this.temPreparo = temPreparo;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTemPreparo() {
        return temPreparo;
    }

    public void setTemPreparo(int temPreparo) {
        this.temPreparo = temPreparo;
    }

    public abstract void preparar();
    public abstract void servir();
}
