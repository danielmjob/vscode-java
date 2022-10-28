import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        /*
         * Construindo matrizes
         */


        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas LINHAS vai ter a matriz: ");
        int linha = sc.nextInt();
        System.out.print("Quantas COLUNAS vai ter a matriz: ");
        int coluna = sc.nextInt();

        int [][] mat = new int[linha][coluna];

        for(int i =0; i < linha; i++){
            for(int j = 0; j < coluna;j++){
                System.out.print("Elemento ["+ i + ","+ j +"]: ");
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println();
        System.out.println("Matriz digitada");
        System.out.println();

        for(int i = 0; i < linha; i++){

            for(int j = 0; j < coluna; j++){
                System.out.print(mat[i][j] + " ");
            }
            
            System.out.println();
            
        }






        sc.close();



    }
}
