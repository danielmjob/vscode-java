import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Instrumento;

public class App {
    public static void main(String[] args) throws Exception {


        /*
         * Programa apenas para testar alguns conceitos de ArrayList e POO
         * Não foram feitas todas as validações devido a só estar treinando as formas de acesso e pesquisa dentro de um ArrayList
         */
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Instrumento> listaInstrumento = new ArrayList<Instrumento>();
        Instrumento instrum =  new Instrumento();
        
        System.out.println();
        System.out.println("ESTOQUE INSTRUMENTOS MUSICAIS");
        System.out.println();

        char continuar = 's';
        int opcoes;

        
       
        do{
            System.out.println("------------------------------");
            System.out.println("[1] CADASTRAR NOVO INSTRUMENTO");
            System.out.println("[2] ENTRADA NO ESTOQUE");
            System.out.println("[3] SAIDA NO ESTOQUE");
            System.out.println("[4] ALTERAR PREÇO DO PRODUTO");
            System.out.println("[5] VER ESTOQUE");
            System.out.println("------------------------------");
            System.out.println();
            System.out.print("Escolha uma opção: ");
            opcoes = sc.nextInt();

            switch (opcoes){
                case 1:
                    System.out.println();                
                    System.out.println("CADASTRAR NOVO INSTRUMENTO");
                    System.out.println("--------------------------");
                    System.out.println();

                    System.out.print("Digite o código do produto: ");
                    Integer codigo = sc.nextInt();

                    //função para comparar codigo para evitar iguais

                    System.out.print("Digite a quantidade: ");
                    Integer quantidade = sc.nextInt();

                    System.out.print("Digite a marca: ");
                    String marca = sc.next();

                    System.out.print("Digite o modelo: ");
                    String modelo = sc.next();

                    System.out.print("Digite o preço: ");
                    double preco = sc.nextDouble();

                    System.out.print("Digite o tipo: ");
                    String tipo = sc.next();

                    instrum = new Instrumento(codigo, quantidade, marca, modelo, preco, tipo);

                    listaInstrumento.add(instrum);
                break;

                case 2:
                    System.out.println();                    
                    System.out.println("ENTRADA NO ESTOQUE");
                    System.out.println("------------------");
                    System.out.println();
 
                    
                    if(instrum.getCodigo() == null){
                        System.out.println("Estoque vazio");
                    }else{
                        System.out.println("Digite o código do produto: ");
                        codigo = sc.nextInt();
                    for(int i = 0; i < listaInstrumento.size();i++){
                        
                        if(codigo == listaInstrumento.get(i).getCodigo()){

                            System.out.print("Digite a quantidade de entrada no estoque: ");
                            quantidade = sc.nextInt();
                            listaInstrumento.get(i).adicionarProduto(quantidade);

                           
                        }else{
                            
                            
                        }



                    }

                }


                
                 
                   
                break;

                case 3:
                    System.out.println();                
                    System.out.println("SAIDA NO ESTOQUE");
                    System.out.println("----------------");
                    System.out.println();



                           
                    if(instrum.getCodigo() == null){
                        System.out.println("Estoque vazio");
                    }else{
                        System.out.println("Digite o código do produto: ");
                        codigo = sc.nextInt();
                    for(int i = 0; i < listaInstrumento.size();i++){
                        
                        if(codigo == listaInstrumento.get(i).getCodigo()){

                            System.out.print("Digite a quantidade de saida no estoque: ");
                            quantidade = sc.nextInt();
                            listaInstrumento.get(i).retirarProduto(quantidade);

                           
                        }else{
                            
                            
                        }



                    }

                }
                break;

                case 4:
                    System.out.println();
                    System.out.println("ALTERAR PREÇO DO PRODUTO");
                    System.out.println("------------------------");
                    System.out.println();
          
                    if(instrum.getCodigo() == null){
                        System.out.println("Estoque vazio");
                    }else{
                        System.out.println("Digite o código do produto: ");
                        codigo = sc.nextInt();
                    for(int i = 0; i < listaInstrumento.size();i++){
                        
                        if(codigo == listaInstrumento.get(i).getCodigo()){

                            System.out.print("Digite o novo valor do produto: ");
                            preco = sc.nextDouble();
                            listaInstrumento.get(i).alterarPreco(preco);

                           
                        }else{
                            
                            
                        }



                    }

                }



                break;

                case 5:
                    System.out.println();                
                    System.out.println("VER ESTOQUE");
                    System.out.println("-----------");
                    System.out.println();

                    for (Instrumento verEstoque : listaInstrumento) {
                        System.out.println(verEstoque.toString());
                    }

                    //desejavel ver total em produtos
                break;

                default:
                    System.out.println();
                    System.out.println("--------------");
                    System.out.println("OPÇÃO INVALIDA");
                    System.out.println("--------------");
                    System.out.println();
                break;
            }

            System.out.print("DESEJA FAZER MAIS ALGUMA ALTERAÇÃO NO ESTOQUE? [S/N]: ");
            sc.nextLine();
            continuar = sc.nextLine().charAt(0);
            
    
             
        }while((continuar == 's') || (continuar == 'S'));

        sc.close();
    }

    
}
