import java.util.ArrayList;
import java.util.List;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println();

        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Rectangle(3.0,2.0));
        myShapes.add(new Circle(2));

        List<Circle> myCircles = new ArrayList<>();
        myCircles.add(new Circle(2.0));
        myCircles.add(new Circle(3.0));

        System.out.println("Total area: " + totalArea(myCircles)); 
        //so funciona se o tipo da lista for <?> e extender a classe Shape

        
        
        System.out.println("Total area: " + totalArea(myShapes));
        
    }

    public static double totalArea (List<? extends Shape> list){
        double sum = 0.0;
        for (Shape s : list){
            sum += s.area();
        }
        return sum;
    }
}
