package entities;

public class Aluno {
    
    public String nome;
    public double nota01;
    public double nota02;
    public double nota03;

    public double calcularNotaFinal(){
        return nota01 + nota02 + nota03;
    }

    public double calcularPontosFaltando(){

        if (calcularNotaFinal() < 60){
            return 60 - calcularNotaFinal();
        }else{
            return 0.0;
        }
    }
}
