package entities;

public class Circulo {
    public double raio;
    


    public double calculoAreaCirculo(){

        double areaDoCirculo = Math.PI * Math.pow(raio, 2);
        return areaDoCirculo;
    }

    public double caluloPerimetroCirculo(){
     /*
        -- FÓRMULA --        
        C = 2 * π * r, onde:
        C = comprimento da circunferência ou perímetro.
        π = 3,14 (aproximadamente)
        r = raio da circunferência (medida do centro à extremidade)
        
        Retirado de   https://mundoeducacao.uol.com.br/matematica/perimetro-circulo.htm#:~:text=C%20%3D%202%20*%20%CF%80%20*%20r,comprimento%20da%20circunfer%C3%AAncia%20ou%20per%C3%ADmetro.
     */
     
        double perimetroDoCirculo = 2 * Math.PI * raio;
        return perimetroDoCirculo;
    }
}
