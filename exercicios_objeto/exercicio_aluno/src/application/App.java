package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno();


        System.out.print("Nome do Aluno: ");
        aluno.nome = sc.nextLine();

        System.out.print("Primeira nota: ");
        aluno.nota01 = sc.nextDouble();

        System.out.print("Segunda nota: ");
        aluno.nota02 = sc.nextDouble();

        System.out.print("Terceira nota: ");
        aluno.nota03 = sc.nextDouble();


        System.out.printf("Notal final %.2f%n",aluno.calcularNotaFinal());

        if (aluno.calcularNotaFinal() < 60){
            System.out.println("REPROVADO");
            System.out.printf("FALTARAM: %.2f pontos%n",aluno.calcularPontosFaltando());
        }else{
            System.out.println("APROVADO");
        }
        



        sc.close();
    }
}
