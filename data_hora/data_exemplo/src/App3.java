import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class App3 {
    public static void main(String[] args) {

     // Conversões de Global (Instant)   
        
        LocalDate d01 = LocalDate.parse("2022-07-20");
		LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d03 = Instant.parse("2022-07-20T01:30:26Z");

        LocalDate r1 = LocalDate.ofInstant(d03, ZoneId.systemDefault()); // convertendo de Global para Local
        System.out.println(d03 +" Global para Local "+ r1);

        LocalDate r2 = LocalDate.ofInstant(d03, ZoneId.of("Portugal")); // convertendo de Global para zona especifica (PORTUGAL)
        System.out.println(d03 +" Global para Portugal "+ r2);

        LocalDateTime r3 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault()); // convertendo de Global para Local
        System.out.println(d03 + " Global para Local " + r3);

        LocalDateTime r4 = LocalDateTime.ofInstant(d03,ZoneId.of("Portugal")); // convertendo de Global para zona especifica (PORTUGAL)
        System.out.println(d03 +" Global para Portugal "+ r4);


     // Pegando apenas dados especificos dentro de uma data/hora   
     
        System.out.println();
        System.out.println("DIA: " + d01.getDayOfMonth()); // pegar dia
        System.out.println("MÊS: " + d01.getMonthValue()); // pegar mes
        System.out.println("ANO: " + d01.getYear()); // pegar ano
        System.out.println();
        System.out.println("HORA: " + d02.getHour()); // pegar hora
        System.out.println("MINUTO: " + d02.getMinute()); // pegar minuto

    }
}
