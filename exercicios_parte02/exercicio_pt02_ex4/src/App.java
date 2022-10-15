import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * 
         * Exercício 04 Correção:
         * https://github.com/acenelio/nivelamento-java/blob/master/src/uri1046.java
         * Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do
         * jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo
         * uma duração mínima de 1 hora e máxima de 24 horas.
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a hora do Inicio: ");
        int horaInicio = sc.nextInt();

        System.out.print("Digite a hora do Término: ");
        int horaFim = sc.nextInt();

        int duracao;

        if (horaInicio < horaFim) { // o horario final sendo maior que o inicial quer dizer que não foi de um dia
                                    // para o outro
            duracao = horaFim - horaInicio; // nesse caso só diminuir a hora final pela inicial
        } else { // o horario final sendo menor que o inicial quer dizer que o jogo foi de um dia
                 // para o outro
            duracao = (24 - horaInicio) + horaFim; // então pega o valor maximo do dia (24 - inicio) e somo a hora final
                                                   // exemplo inicio 23hr final 01hr
        } // (24 - 23) + 01 => 01 + 01 => 02hr de duração

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

        sc.close();
    }
}
