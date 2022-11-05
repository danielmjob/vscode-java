import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class App {
    public static void main(String[] args) throws Exception {


        /*
         * CONCEITOS USADOS NESSA APLICAÇÃO
         * 
         * HERANÇA (EXTENDS) PALAVRAS-CHAVE: É UM - É UMA
         * PROTECTED - PARA QUE UMA VARIAVEL POSSA SER USADA POR OUTRA CLASSE DO MESMO PACOTE
         * UPCASTING da SUBCLASSE para a SUPERCLASSE
         * DOWNCAST da SUPERCLASSE para a SUBCLASSE
         *      -INSTANCEOF PARA VERIFICAR INSTANCIAS QUANDO ESTIVER USANDO DOWNCAST
         * @OVERRIDE - SOBREPOR UMA CLASSE
         * FINAL - PODE SER USADO PARA IMPEDIR QUE UMA CLASSE SEJA HERDADA OU UM MÉTODO SOBREPOSTO
         * SUPER() - PARA USAR ATRIBUTOS/METODOS DE UMA SUPERCLASSE 
         * POLIMORFISMO - VARIÁVEIS DO MESMO TIPO PODE ASSUMIR FORMAS DIFERENTES DE TRABALHO
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.00);

     // UPCASTING da SUBCLASSE para a SUPERCLASSE

        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.00);
        Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

     //DOWNCAST da SUPERCLASSE para a SUBCLASSE

        // BusinessAccount acc4 = acc2; (Erro) Quando é o contrario não é permido fazer a atribuição diretamente
        BusinessAccount acc4 = (BusinessAccount) acc2; // Necessário fazer o casting
        acc4.loan(100.00);
        
     // IMPORTANTE: nem sempre o DOWNCAST vai funcionar então é recomendado testar usando o if em conjunto com o instaceof

        /*
        * BusinessAccount acc5 = (BusinessAccount) acc3; (Erro) - acc3 é uma Account (Instaciada como SavingsAccount) por isso não pode ser feito o DOWNCASTING
        * ATENÇÃO: esse código acima o compilador NÃO ACUSARIA erro porém ao executar ele apresentaria erro em tempo de execução
        * Para evitar erros  testamos usando o instanceof para testar vide exemplo abaixo
        */
     
        // acc3(SavingsAccount) é uma instacia da BussinessAccount? (false)
        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount)acc3;
            acc5.loan(200.00);
            System.out.println("Loan!");
        }

        // acc3(SavingsAccount) é uma instacia da SavingsAccount? (true)
        if(acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount)acc3;     // DOWNCASTING 
            acc5.updateBalance();                           // faz o update
            System.out.println("Update!");               // apresenta a mensagem de update
        }



        // POLIMORFISMO 
        
        Account x = new Account(1020, "ALEX", 1000.00);
        Account y = new SavingsAccount(1023, "MARIA", 1000.00, 0.01);

        x.withdraw(50.00);
        y.withdraw(50.00);

        /* As duas variaveis chamam o aparentemente o "mesmo método", 
         * porém o withdraw de x aponta para:
                    public void withdraw (double amount){
                    balance -= amount + 5.0;
                }
         * 
         * enquato o witrdraw de y aponta para: 
                    @Override
                    public final void withdraw (double amount){
                        balance -= amount + 5.0;
                    }
         * 
         * Mostrando que duas váriaveis do mesmo tipo podem assumir formas diferentes
        */

        System.out.println("ALEX - Account: R$" + String.format("%.2f", x.getBalance()));
        System.out.println("MARIA - SavingsAccount: R$" + String.format("%.2f", y.getBalance()));

        System.out.println();

        sc.close();
    }
}
