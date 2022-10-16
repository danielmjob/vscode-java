package entities;

public class Product {
    public String name;
    public double price;
    public int quantity; // (quantidade atributo) para melhor referencia do comentário mais abaixo



    public double totalValueInStock(){
        return price * quantity;
    }


    public void addProducts(int quantity ){
        this.quantity += quantity; // this.quantity acessa a quantidade (atributo) e vai receber o que tem nela + o valor quantidade(argumento)
    }

    public void removeProducts(int quantity){
        this.quantity -= quantity; // this.quantity acessa a quantidade (atributo) e vai receber o que tem nela - o valor quantidade(argumento)
    }

    public String toString(){ // aqui estou sobrepondo o toString, para que apresente no formato que eu defini

        return name.toUpperCase() // vai apresentar em letras maiusculas indenpende de como o usuário digitar
               + ", $ "
               + String.format("%.2f", price) //formatando para duas casas decimais
               + ", "
               + quantity
               + " units, Total: $ "
               + String.format("%.2f",totalValueInStock());

        //Product data: TV, $ 900.00, 10 units, Total: $ 9000.00

    }
}
