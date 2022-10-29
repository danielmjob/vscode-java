import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) throws Exception {

     // Datas e horas ISO 8601

     // Pegando do Sistema

        System.out.println();
        LocalDate d01 = LocalDate.now(); // Data atual
        System.out.println("LocalDate: " + d01);

        LocalDateTime d02 = LocalDateTime.now(); // Data e hora atual
        System.out.println("LocalDateTime: " + d02);


        Instant d03 = Instant.now(); // Data e hora no GMT (Londres)
        System.out.println("Instant: " + d03);

     // Enviando dados

        System.out.println();
        LocalDate d04 = LocalDate.parse("2022-10-28"); // enviando data
        System.out.println("LocalDate.parse: " + d04);

        LocalDateTime d05 = LocalDateTime.parse("2022-10-28T21:32:00"); // enviando data e hora
        System.out.println("LocalDateTime.parse: " + d05);

        Instant d06 = Instant.parse("2022-10-28T21:32:00Z"); // enviando data horario DAQUI
        System.out.println("Instant.parse: " + d06 + " - HORARIO AQUI");

        Instant d07 = Instant.parse("2022-10-28T21:32:00-03:00"); // enviando data horario DAQUI porem mostrando convertido para horario de Londres
        System.out.println("Instant.parse: " + d07 + " - HORARIO LONDRES");
     
     // Formatando data hora
        // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html

        System.out.println();
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d08 = LocalDate.parse("28/10/2022", fmt1);
        System.out.println("Data formatada dd/MM/yyyy : " + d08);
        
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime d09 = LocalDateTime.parse("28/10/2022 21:32", fmt2);
        System.out.println("Data e hora formatada dd/MM/yyyy HH:mm :" + d09);

        //poderia ser escrito assim diretamente
        LocalDateTime d09_1 = LocalDateTime.parse("28/10/2022 21:32", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        System.out.println("Data e hora formatada dd/MM/yyyy HH:mm :" + d09_1);

     // Recebendo os dados separadamente        
        LocalDate d10 = LocalDate.of(2022, 10, 28); // Passando a data Separada
        System.out.println("LocalDate.of : " + d10);

        LocalDateTime d11 = LocalDateTime.of(2022, 10, 28, 21, 32, 00); // Passando a data e hora Separada
        System.out.println("LocalDate.of : " + d11);

        










        


    }
}
