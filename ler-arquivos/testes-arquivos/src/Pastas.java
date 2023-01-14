import java.io.File;

public class Pastas {
    public static void main(String[] args) {
        
    //criando pasta

        String caminho = "C:\\temp\\teste";
        boolean sucesso = new File(caminho + "\\outraPasta").mkdir();

        // File(caminhoDaPasta + "\\nomeDaPasta").oQueDesejaFazer
            // Nesse caso usado o mkdir() = criar (make diretory)
            // IMPORTANTE: se a pasta ja existe ele retorna false

        System.out.println("Pasta criada: " + sucesso);
    }
}
