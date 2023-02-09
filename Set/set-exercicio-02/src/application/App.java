package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        /*
         * Exercicio SET
         * Em um portal de cursos online, cada usuário possui um código único,
         * representado por um número inteiro.
         * 
         * Cada instrutor do portal pode ter vários cursos, sendo que um mesmo aluno
         * pode se matricular em quantos cursos quiser. Assim, o número total de alunos de um
         * instrutor não é simplesmente a soma dos alunos de todos os cursos que ele possui, pois pode
         * haver alunos repetidos em mais de um curso.
         * 
         * O instrutor Alex possui três cursos A, B e C, e deseja saber seu número total
         * de alunos.
         * 
         * Seu programa deve ler os alunos dos cursos A, B e C do instrutor Alex, depois
         * mostrar a quantidade total e alunos dele, conforme exemplo.
         * 
         * Exemplo
         * How many students for course A? 3
         * 21
         * 35
         * 22
         * How many students for course B? 2
         * 21
         * 50
         * How many students for course C? 3
         * 42
         * 35
         * 13
         * Total students: 6
         */


         System.out.println();
         Scanner sc = new Scanner(System.in);
         
         Set<Integer> setA = new HashSet<>();
         Set<Integer> setB = new HashSet<>();
         Set<Integer> setC = new HashSet<>();

         System.out.print("How many students for course A? ");
         int opcaoCursoA = sc.nextInt();

         for(int i = 0; i<opcaoCursoA; i++){
            System.out.print("Digite o " + ( i + 1 ) + "º Código: ");
            setA.add(sc.nextInt());
         }
         System.out.println();

         System.out.print("How many students for course B? ");
         int opcaoCursoB = sc.nextInt();
         
         for(int i = 0; i<opcaoCursoB; i++){
            System.out.print("Digite o " + ( i + 1 ) + "º Código: ");
            setB.add(sc.nextInt());
         }
         System.out.println();

         System.out.print("How many students for course C? ");
         int opcaoCursoC = sc.nextInt();
         
         for(int i = 0; i<opcaoCursoC; i++){
            System.out.print("Digite o " + ( i + 1 ) + "º Código: ");
            setC.add(sc.nextInt());
         }
         System.out.println();

         Set<Integer> total  = new HashSet<>(setA);

         total.addAll(setB);
         total.addAll(setC);

         System.out.println("Total Students: " + total.size());

         sc.close();
    }
}
