package entities;

public class Retangulo {
    public double baseRetangulo;
    public double alturaRetangulo;



    public double calculoAreaRetangulo(){

        double areaRetangulo = baseRetangulo * alturaRetangulo;
        return areaRetangulo;
    }

    public double calculoPerimetroRetangulo(){

        double perimetroDoRetangulo = baseRetangulo + baseRetangulo + alturaRetangulo +alturaRetangulo;
        return perimetroDoRetangulo;
    }
    
}
