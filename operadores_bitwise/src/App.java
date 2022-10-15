import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       

        int n1 = 89; // BINARIO 0101 1001
        int n2 = 60; // BINARIO 0011 1100


        /*
         * Usado bastante em programação de baixo nivel 
         * 
         * micro controlado - arduino - redes
         */

        System.out.println("Comparação bitwise entre: " + n1 + " , " + n2);
        System.out.println(" & - E : " + (n1 & n2));            // BINARIO 0001 1000
        System.out.println(" | - OU : "+(n1 | n2));             // BINARIO 0111 1101
        System.out.println(" ^ - OU-EXCLUSIVO: "+(n1 ^ n2));    // BINARIO 0110 0101

        /*
         * Como testar um bit especifico
         * 
        */


        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número (decimal) que deseja testar: ");
        int n = sc.nextInt();


        /*
         * Aqui gero uma mascara de teste onde escolho o bit que irei testar
         * Exemplo: se quero testar o 6º bit a mascara recebe o valor decimal 32 equivalente a  0010 0000 em binário
        */

        int mask = 32; // tbm poderia escrever in mask = 0b00100000;

        /*
         * Testo a comparação bitwise com & pois assim o resultado tem que ser diferente de 0
         * se for 0 quer dizer que o bit esta incorreto
         * 
         */
        if ((n & mask ) != 0){
            System.out.println("6º bit esta correto");
        }else{
            System.out.println("6º bit NÃO esta correto");
        }

        sc.close();
    }
}
