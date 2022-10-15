import java.util.Scanner;

public class App {

    public static void main(String[] args) {      
        Scanner sc = new Scanner(System.in);
        int a, b, c;

        System.out.print("Digite um número: ");
        a = sc.nextInt();
        System.out.print("Digite um número: ");
        b = sc.nextInt();
        System.out.print("Digite um número: ");
        c = sc.nextInt();
        int higher = max(a,b,c);
        showResult(higher);
        sc.close();
    }  
    /*
    * Criando funções
    */
    public static int max(int x, int y, int z) {     // como essa função retorna um valor foi declarado o tipo em vez de void
        int aux; //variavel local
        if (x > y && x > z){
            aux = x;
        }else if(y > x && y > z){
            aux = y;
        }else{
            aux = z;
        }
        return aux; //retorna o valor que estiver na variavel "aux"
    }

    public static void showResult(int value){ //void pq a função não retorna valor e sim uma ação
        System.out.println("Maior = "+ value);
    }
}
