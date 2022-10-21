package entities;

public class Aluno{

    private String nomeDoAluno;
    private double primeiraNota;
    private double segundaNota;
    private final double MEDIA_APROVACAO = 6.0;

    public Aluno(){

    }

    public Aluno(String nomeDoAluno, double primeiraNota, double segundaNota){
        this.nomeDoAluno = nomeDoAluno;
        this.primeiraNota = primeiraNota;
        this.segundaNota = segundaNota;
    }

    public String getNomeDoAluno(){
        return nomeDoAluno;
    }

    public void setNomeDoAluno(String nomeDoAluno){
        this.nomeDoAluno = nomeDoAluno;
    }

    public double getPrimeiraNota() {
        return primeiraNota;
    }

    public void setPrimeiraNota(double primeiraNota) {
        this.primeiraNota = primeiraNota;
    }

    public double getSegundaNota() {
        return segundaNota;
    }

    public void setSegundaNota(double segundaNota) {
        this.segundaNota = segundaNota;
    }

    public final double getMEDIA_APROVACAO(){
        return MEDIA_APROVACAO;
    }

    public double calcularMedia(){
        return (primeiraNota+segundaNota)/2;
    }
}