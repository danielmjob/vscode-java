import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de linhas: ");
        int numLinhas = sc.nextInt();

        System.out.print("Digite o número de colunas: ");
        int numColunas = sc.nextInt();

        Integer[][] mat = new Integer[numLinhas][numColunas];

        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                System.out.print("Digite o valor: ");
                mat[i][j] = sc.nextInt();
            }
        }
        
        System.out.println();
        System.out.println("Matriz gerada");
        System.out.println();

        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.print("Escolha o número a ser procurado: ");
        int numProc = sc.nextInt();
        System.out.println();

        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){

                if(mat[i][j] == numProc){
                    System.out.println("Posição " + i +","+ j + ":");
                    if ((i-1) < 0){
                        // não escrever a posição cima
                    }else{
                        System.out.println("Cima: "+ mat[i-1][j]);
                    }
                    
                    if((j-1) < 0){
                        // não escrever a posição esquerda
                    }else{
                        System.out.println("Esquerda: "+ mat[i][j-1]);
                    }
                    
                    System.out.println("Centro: " + mat[i][j]);

                    if(j < mat[i].length - 1){
                        System.out.println("Direita: "+ mat[i][j+1]);
                    }else{
                        // não escrever a posição direita
                    }

                    if(i < mat.length - 1){
                        System.out.println("Baixo: "+ mat[i+1][j]);
                    }else{
                         // não escrever a posição baixo
                    }

                }
            }
        }
     
        sc.close();
    }
}
