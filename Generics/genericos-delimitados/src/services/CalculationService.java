package services;

import java.util.List;

public class CalculationService {

    public static <T extends Comparable<T>> T max(List<T> list){ // atenção nessa linha de código
        if (list.isEmpty()){
            throw new IllegalStateException("List cant' be empty");
        }
        // achando o maior da lista

        T max = list.get(0);
        for (T item : list) {
            if (item.compareTo(max)>0){
                max = item;
            }
        }
        return max;
    }
    
}
