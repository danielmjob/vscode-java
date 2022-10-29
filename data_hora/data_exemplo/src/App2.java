import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class App2 {
    public static void main(String[] args) {

     // Continuação datas e horas...
        // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
        
        //
        System.out.println();
        LocalDate d04 = LocalDate.parse("2022-10-28");
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // criando formatação padrão
        System.out.println(d04.format(fmt1));
        // ou
        System.out.println(fmt1.format(d04));
        
        System.out.println();
        
        LocalDateTime d05 = LocalDateTime.parse("2022-10-28T21:35:00");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println(d05.format(fmt1)); //mostrar apenas data
        System.out.println(d05.format(fmt2)); //mostrar data e hora

        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME; // usando padrão pré definido
        System.out.println(d05.format(fmt4));

        
        
     // ATENÇÃO DATAS GLOBAIS (INSTANT) PRECISÃO QUE SEJA INDICADO O FUSO HORARIO OU NÃO FUNCIONARÃO

        Instant d06 = Instant.parse("2022-10-28T21:35:00Z");

        DateTimeFormatter ftm5 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault()); // transforma uma data GLOBAL para data LOCAL do sistema
        System.out.println(ftm5.format(d06));

        DateTimeFormatter fmt6 = DateTimeFormatter.ISO_INSTANT; // usando padrão pré definido PARA GLOBAL
        System.out.println(fmt6.format(d06));

        System.out.println(d06.toString());
  
        
    }
}
