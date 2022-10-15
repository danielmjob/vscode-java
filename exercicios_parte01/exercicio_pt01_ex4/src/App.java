import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // EXERCICIOS SEÇAO 4 AULA 29

        /*
         * Exercício 04 Correção:
         * https://github.com/acenelio/nivelamento-java/blob/master/src/uri1008.java
         * Fazer um programa que leia o número de um funcionário, seu número de horas
         * trabalhadas, o valor que recebe por hora e calcula o salário desse
         * funcionário. A seguir, mostre o número e o salário do funcionário, com duas
         * casas decimais.
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numeroFuncionario, numHorasTrab;
        double valorDaHoraTrab, salarioFinal;

        System.out.print("Digite o número do funcionário: ");
        numeroFuncionario = sc.nextInt();

        System.out.print("Digite o número de horas trabalhadas: ");
        numHorasTrab = sc.nextInt();

        System.out.print("Digite o valor da hora trabalhada: ");
        valorDaHoraTrab = sc.nextDouble();

        salarioFinal = valorDaHoraTrab * numHorasTrab;

        System.out.println("Número = " + numeroFuncionario);

        System.out.printf("Salário = U$ %.2f%n", salarioFinal);// duas casas decimais

        sc.close();
    }
}
