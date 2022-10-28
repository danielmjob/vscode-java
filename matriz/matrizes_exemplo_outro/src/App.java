import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de colunas e linhas de uma matriz quadrada: ");
        int n = sc.nextInt();
        
        int[][] mat = new int[n][n];
     
     // inserir dados na matriz

        for(int i = 0; i < mat.length ; i++){
            for(int j = 0; j < mat[i].length ; j++){
                System.out.print("Digite um número inteiro: ");
                mat[i][j] = sc.nextInt();
            }
        }
     //ler toda a matriz
            System.out.println();
            System.out.println("Matriz gerada");
        
           for (int i = 0; i < mat.length; i++){
                for(int j = 0; j < mat[i].length ; j++){
                   System.out.print(mat[i][j]+" ");
               }
               System.out.println();
            }
            
            System.out.println();
            System.out.println("Diagonal principal");
     //ler diagonal principal
            for (int i = 0; i < mat.length; i++){
                    System.out.print(mat[i][i]+" ");
            }

     //ler negativos
     
            int numNeg = 0;
            int numPos = 0;
            
            System.out.println();
            System.out.println("Números negativos: ");
     
            for(int i = 0 ; i < mat.length; i++){
                for(int j = 0; j < mat[i].length ; j++){

                    if( mat[i][j] < 0 ){
                        System.out.print(mat[i][j]+" ");
                        numNeg++;
                    }else{
                        numPos++;
                    }

                }
            }
            System.out.println();
            System.out.println("Quantidade de negativos: " + numNeg);
            System.out.println("Quantidade de positivos: " + numPos);

        sc.close();
    }
}
