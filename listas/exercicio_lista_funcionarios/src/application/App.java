package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

/* EXERCICO DO CURSO na Udemy Java COMPLETO Programação Orientada a Objetos +Projetos Profº Nélio Alves youtube*/

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println();
        System.out.println("Cadastro de Funcionários");

        /*
         * Esse programa tem como intuito cadastrar funcionários com id e seus salários.
         * Você pode alterar o salário do funcionário (aumento baseado em porcentagem) localizando o pelo id
         * No cadastro se o ususário digitar id repetido o programa nega a entrada
         * Para ser confirmado o aumento deve ser digitado um id de funcionário que exista caso contrario o programa avisa
         * Foi usado conceito de POO, ArrayList, funções estruturas de repetição e outras estrururas no java
        */

        System.out.print("Quantos funcionários você deseja registrar: ");
        int numFuncionarios = sc.nextInt();

        List<Employee> listaDeFuncionarios = new ArrayList<Employee>();

        for(int i = 0; i < numFuncionarios; i++){
            
            System.out.println();
            System.out.println((i+1)+"º Funcionário");
            System.out.println("-----------------");
            System.out.print("Id: ");
            Integer id = sc.nextInt();

            
            // Validação para não haver dois ids iguais
            while(idUsado(listaDeFuncionarios, id)){
                System.out.println("Esse id ja existe! Tente novamente");
                System.out.println();

                System.out.print("Id: ");
                id = sc.nextInt();
            }



            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();

            System.out.print("Salário: ");
            Double salario = sc.nextDouble();

            Employee emp = new Employee(id, nome, salario);
            listaDeFuncionarios.add(emp);
            
        }


        System.out.print("Digite o id do funcionário que receberá aumento: ");
        int idSalario = sc.nextInt();

        /*
         * Há duas formas de localizar o id do funcionário,
         * a primeira forma é a que esta sendo usada esta comentado com (1)
         * a segunda forma deixei comentado com (2)
        */

        Employee emp = listaDeFuncionarios.stream().filter(x -> x.getId() == idSalario).findFirst().orElse(null); // forma (1)

        System.out.println();

        if(emp == null){ // (2) deve mudar o "emp" para "pos"
            System.out.println("O id digitado não existe");
        }else{
             System.out.print("Digite a porcentagem de aumento: ");
             double porcentagem = sc.nextDouble();

             // (2) listaDeFuncionarios.get(pos).aumentarSalario(porcentagem);
             emp.aumentarSalario(porcentagem); // forma (1)
    
        }
  
        System.out.println();
        System.out.println("Lista de funcionários");
        for (Employee e : listaDeFuncionarios) {
            System.out.print(e.toString());
            
        }

        sc.close();
    }

    /*  
        (2) função para procurar o id
        public static Integer posicao(List<Employee> list, int id){
            for(int i = 0; i <list.size(); i++){
                if (list.get(i).getId() == id){
                    return i;
                }  
            }
        return null;
        }
    */


    public static boolean idUsado(List<Employee> list, int id){
        Employee emp = list.stream().filter(x ->x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }

}
