import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class App4 {
    public static void main(String[] args) {

        LocalDate d01 = LocalDate.parse("2022-10-29");
        LocalDateTime d02 = LocalDateTime.parse("2022-10-29T08:15:00");
        
        Instant d03 = Instant.parse("2022-10-29T08:15:00Z");


        System.out.println();

        System.out.println();
        LocalDate semanaPassadaLocalDate = d01.minusDays(7); // obtendo a data de 7 dias atras (uma semana)
        System.out.println( d01 +" semana passada "+ semanaPassadaLocalDate);
        
        LocalDate proximaSemanaLocalDate = d01.plusDays(7); // obtendo a data de 7 dias a frente (uma semana)
        System.out.println( d01 +" próxima semana "+ proximaSemanaLocalDate);



        System.out.println();
        LocalDateTime semanaPassadaLocalDateTime = d02.minusDays(7); // obtendo a data de 7 dias atras (uma semana)
        System.out.println( d01 +" semana passada "+ semanaPassadaLocalDateTime);
        
        LocalDateTime proximaSemanaLocalDateTime = d02.plusDays(7); // obtendo a data de 7 dias a frente (uma semana)
        System.out.println( d02 +" próxima semana "+ proximaSemanaLocalDateTime);

        System.out.println();
        Instant semanaPassadaInstant = d03.minus(7,ChronoUnit.DAYS); // obtendo a data de 7 dias atras (uma semana)
        System.out.println( d03 +" semana passada "+ semanaPassadaInstant);
        
        Instant proximaSemanaInstant = d03.plus(7,ChronoUnit.DAYS); // obtendo a data de 7 dias a frente (uma semana)
        System.out.println( d03 +" próxima semana "+ proximaSemanaInstant);

     //CALCULOS
 
        /*  Duration t1 = Duration.between(semanaPassadaLocalDate, d01); 
         *  não aceita pois não tem TEMPO h:m:s 
         * então deve ser feita a conversão - usando atTime(H,m)  onde voce pode escoher as horas de inicio
         *  ou pode usar atStartOfDay para inicio do dia
        */


        System.out.println(); 
        Duration t1 = Duration.between(semanaPassadaLocalDate.atTime(0,0),d01.atTime(0,0));
        System.out.println("T1 dias = " + t1.toDays());
            // ou
        Duration t1_alternativo = Duration.between(semanaPassadaLocalDate.atStartOfDay(),d01.atStartOfDay());
        System.out.println("T1 atStartOfDay dias = " + t1_alternativo.toDays());

        System.out.println(); 
        Duration t2 = Duration.between(semanaPassadaLocalDateTime, d02);
        System.out.println("T2 dias = " + t2.toDays());

        System.out.println(); 
        Duration t3 = Duration.between(semanaPassadaInstant, d03);
        System.out.println("T3 dias = " + t3.toDays());

        Duration t4 = Duration.between(d03,semanaPassadaInstant); // invertendo do menor para o maior REGRESSIVO
        System.out.println("T4 dias (REGRESSIVO) = " + t4.toDays());
        
    }
}
