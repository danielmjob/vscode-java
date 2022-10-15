import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nome;
        System.out.print("Digite o nome: ");
        nome = sc.next(); // Leitura de String

        int idade;
        System.out.print("Digite a idade: ");
        idade = sc.nextInt();// Leitura de inteiro

        double altura;
        System.out.print("Digite a altura: ");
        altura = sc.nextDouble();// leitura de numero com ponto flutuante

        char sexo;
        System.out.print("Digite o sexo [M]masculino [F]feminino: ");
        sexo = sc.next().charAt(0); // leitura de um char |.charArt pega apenas o primeiro caracter de um String

        System.out.println("Nome: " + nome + " idade: " + idade + " ano(s)  altura " + altura + " sexo: " + sexo);

        // para leitura de varios dados na mesma linha

        System.out.println("Digite o NOME IDADE ALTURA SEXO: ");
        // Digitar separados por ESPAÇO

        nome = sc.next();
        idade = sc.nextInt();
        altura = sc.nextDouble();
        sexo = sc.next().charAt(0);

        System.out.println("Nome: " + nome + " idade: " + idade + " ano(s)  altura " + altura + " sexo: " + sexo);

        // LENDO DADOS ATÉ A QUEBRA DE LINHA

        String frase1, frase2, frase3;

        sc.nextLine(); // consumir linha pendente | limpar o buffer de leitura
        frase1 = sc.nextLine();
        frase2 = sc.nextLine();
        frase3 = sc.nextLine();

        System.out.println("Frases escritas");

        System.out.println(frase1);
        System.out.println(frase2);
        System.out.println(frase3);

        sc.close(); // não esquecer de encerrar
    }
}
