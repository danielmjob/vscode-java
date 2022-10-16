package entities;

public class Quadrado {
    
    public double baseQuadrado;

    
    public double calculoAreaQuadrado(){
        double areaDoQuadrado = baseQuadrado * baseQuadrado;
     return areaDoQuadrado;
    }


    public double calculoPerimetroQuadrado(){
        double perimetroDoQuadrado = baseQuadrado + baseQuadrado + baseQuadrado + baseQuadrado;
        return perimetroDoQuadrado;
    }

}
