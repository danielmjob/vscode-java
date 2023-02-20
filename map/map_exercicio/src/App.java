import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Na contagem de votos de uma eleição, são gerados vários registros
         * de votação contendo o nome do candidato e a quantidade de votos
         * (formato .csv) que ele obteve em uma urna de votação. Você deve
         * fazer um programa para ler os registros de votação a partir de um
         * arquivo, e daí gerar um relatório consolidado com os totais de cada
         * candidato.
         * 
         * Input file example:
         * 
         * Alex Blue,15
         * Maria Green,22
         * Bob Brown,21
         * Alex Blue,30
         * Bob Brown,15
         * Maria Green,27
         * Maria Green,22
         * Bob Brown,25
         * Alex Blue,31
         * 
         * 
         * Execution:
         * Enter file full path: c:\temp\in.txt
         * Alex Blue: 76
         * Maria Green: 71
         * Bob Brown: 61
         */

    	
         Scanner sc = new Scanner(System.in);

         // Classe Map, armazenda dados no estilo de um Json, neste caso possui dois valores, texto e inteiro. 
         Map<String, Integer> votes = new LinkedHashMap<>();

         System.out.println("Enter file full path: ");
         
         // Leitura do path do arquivo, usuário digita.
         String path = sc.nextLine();
         
         
         // BufferedReader -> Leitura de arquivos em buffer (linha a linha).
         // Exemplo de buffer: Youtube pré carregar o vídeo em partes.
         
         try (BufferedReader br = new BufferedReader(new FileReader(path))){

        	//Leitura linha a linha (br.readLine pega a próxima).
            String line = br.readLine();
            
            //Condição enquanto tiver dados do arquivo.
            while(line != null){
            	
            	//Para determinada linha, retorne um array separando por vírgulas
            	//Ex:  Marcos, 100 -> [Marcos, 100] array com duas posições. 
            	
                String[] fields = line.split(",");
                //Armazena nome
                String name = fields[0];
                
                //Armazena contador
                int count = Integer.parseInt(fields[1]);

                //Verifica se o nome já existe na lista pra somar 
                if(votes.containsKey(name)){
                    int votesSoFar = votes.get(name);
                    votes.put(name, count+votesSoFar);
                }else{
                	//Apenas armazena
                    votes.put(name, count);
                }
                //Próxima iteração
                line = br.readLine();
            }
            //Imprime todos os votos.
            for (String key : votes.keySet()) {
				System.out.println(key + ": " + votes.get(key));
			}
            
         } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
         }

         sc.close();
    }
}
