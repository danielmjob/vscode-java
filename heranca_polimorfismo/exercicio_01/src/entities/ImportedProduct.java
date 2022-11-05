package entities;

public class ImportedProduct extends Product {
    
    private Double customsFee;

    public ImportedProduct(){
        
    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    public Double totalPrice(){
        return getPrice() + customsFee;
    }

    @Override
    public String priceTag(){

        //Tablet $ 280.00 (Customs fee: $ 20.00)
        return getName()
            + " $ " 
            + String.format("%.2f", totalPrice())
            + " (Customs fee: $ "
            + String.format("%.2f", customsFee)
            +")";
    }
    
}
