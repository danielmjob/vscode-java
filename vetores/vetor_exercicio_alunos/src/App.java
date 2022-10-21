import java.util.Locale;
import java.util.Scanner;
import entities.Aluno;


public class App {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serao digitados? ");
        int numAlunos = sc.nextInt();

        Aluno[] vet = new Aluno[numAlunos];

        for(int i = 0; i < vet.length; i++){

            System.out.print("Digite nome do "+ (i+1) +"o aluno: ");
            sc.nextLine();
            String nomeDoAluno = sc.nextLine();

            System.out.println("Digite a primeira nota do "+ (i+1) +"o aluno: ");
            double primeiraNota = sc.nextDouble();

            System.out.println("Digite a segunda nota do "+ (i+1) +"o aluno: ");
            double segundaNota = sc.nextDouble();

            vet[i] = new Aluno(nomeDoAluno, primeiraNota, segundaNota);
        }

        for (int i = 0 ; i < vet.length ; i++){
            if (vet[i].calcularMedia() >= vet[i].getMEDIA_APROVACAO()){
                System.out.println(vet[i].getNomeDoAluno()+" APROVADO");

            } else {System.out.println(vet[i].getNomeDoAluno()+" REPROVADO");
            }

        }
        sc.close();
    }
}
