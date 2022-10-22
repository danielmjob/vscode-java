import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
    /*
        * Listas
        * 
        * Tamanho da lista: size()
        * Obter o elemento de uma posição: get(position)
        * Inserir elemento na lista: add(obj), add(int, obj)
        * Remover elementos da lista: remove(obj), remove(int), removeIf(Predicate)
        * Encontrar posição de elemento: indexOf(obj), lastIndexOf(obj)
        * Filtrar lista com base em predicado:
        * List<Integer> result = list.stream().filter(x -> x > 4).collect(Collectors.toList());
        * Encontrar primeira ocorrência com base em predicado:
        * Integer result = list.stream().filter(x -> x > 4).findFirst().orElse(null);
        * 
        * 
        * Assuntos pendentes:
        * interfaces
        * generics
        * predicados(lambda) 
        * 
    */

    // Declarando Lista:

        List<String> listaOriginal = new ArrayList<String>();     

        System.out.println();
        System.out.println("---------------------");
        System.out.println();
        
    // Adicionando nomes a Lista:

        listaOriginal.add("Maria");         // posição 0
        listaOriginal.add("José");          // posição 1
        listaOriginal.add("Antônio");       // posição 2
        listaOriginal.add("João");          // posição 3
        listaOriginal.add("Francisco");     // posição 4
        listaOriginal.add("Ana");           // posição 5
        listaOriginal.add("Paulo");         // posição 6
        listaOriginal.add("Carlos");        // posição 7
        listaOriginal.add("Manoel");        // posição 8
        listaOriginal.add("Sônia");         // posição 9
        listaOriginal.add("Pedro");         // posição 10
        listaOriginal.add("Marcelo");       // posição 11
        listaOriginal.add("Edson");         // posição 12
        listaOriginal.add("Marcos");        // posição 13
        listaOriginal.add("Joaquim");       // posição 14
        listaOriginal.add("Jorge");         // posição 15
        

    // Lendo dados na Lista (usando for each):

        System.out.println("Lista original");
        for(String verListaOriginal:listaOriginal){
            System.out.println(verListaOriginal);
        }

        System.out.println();
        System.out.println("---------------------");
        System.out.println();


    // Mostrando tamanho da lista

        System.out.println("Tamanho da lista: " + listaOriginal.size());

        System.out.println();
        System.out.println("---------------------");
        System.out.println();
    
    // Adicionando dados numa posição especifica
    
        System.out.println("Adicionando Luiz na posição 3");
        listaOriginal.add(3, "Luiz"); // Adiciono Luiz na posição 03 ocupada por João que agora vai p/ posição 04

        for (String verListaAlterada : listaOriginal){
            System.out.println(verListaAlterada);
        }

        System.out.println();
        System.out.println("---------------------");
        System.out.println();

    // Removendo dados numa posição especifica  

        // removendo através de posição usando 

        System.out.println("Removendo quem estava na posição 8");
        listaOriginal.remove(8); // irá remover o Carlos que agora ocupa posição 8

        for (String verListaAlterada : listaOriginal){
            System.out.println(verListaAlterada);
        }    
        
        System.out.println();
        System.out.println("---------------------");
        System.out.println();
        
        // removendo através de predicado - lambda (x -> x)
        // remove todos que COMEÇAREM com M    

        listaOriginal.removeIf(verListaAlterada -> verListaAlterada.charAt(0) == 'M');
        System.out.println("Removendo TODOS que comecem com a letra M");
        for (String verListaAlterada : listaOriginal){
            System.out.println(verListaAlterada);
        }

        System.out.println();
        System.out.println("---------------------");
        System.out.println();

    // Localizando dados na lista

        //retorna o numero posição na lista (se retornar -1 não foi localizado ou seja não existe na lista)
        
        System.out.println("Index of Joaquim: " + listaOriginal.indexOf("Joaquim"));
        System.out.println("Index of Marcos: " + listaOriginal.indexOf("Marcos"));

        System.out.println();
        System.out.println("---------------------");
        System.out.println();
    
    // Filtrando nomes que comecem com J

        // cria uma nova lista, converte para stream, filtra usando lambda, usa o .collect(Collectors.toList() para converter novamente para lista

        System.out.println("Lista apenas de nomes que começam com J");
        List<String> resultNomesJ = listaOriginal.stream().filter(verListaAlterada -> verListaAlterada.charAt(0) == 'J').collect(Collectors.toList());

        for (String verListaAlteradaNomesJ : resultNomesJ){
            System.out.println(verListaAlteradaNomesJ);
        }

        System.out.println();
        System.out.println("---------------------");
        System.out.println();
    
    // Encontrando primeiro elemento que comece com uma letra específica (exemplo P)

        System.out.println("Mostra o primeiro nome que começa com P");
        String nome = listaOriginal.stream().filter(verListaAlterada -> verListaAlterada.charAt(0) == 'P').findFirst().orElse(null);
        System.out.println(nome);
   
    }
}