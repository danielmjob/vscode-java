package model.services;

import java.time.Duration;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService {
    private Double pricePerHour;
    private Double pricePerDay;

    private TaxService taxService;

    public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) { // criando inversão de controle ao alterar de BrazilTaxService para TaxService
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }


    public void processInvoice(CarRental carRental){
       
        double minutes = Duration.between(carRental.getStart(),carRental.getFinish()).toMinutes(); // encontra a duração entre dois instantes
        double hours = minutes/60.0;
        
        double basicPayment;

        if(hours <=12.0){
            basicPayment = pricePerHour * Math.ceil(hours);  // Math.ceil arredonda pra cima
        } else {
            basicPayment = pricePerDay * Math.ceil(hours/24);
        }

        double tax = taxService.tax(basicPayment);

        carRental.setInvoice(new Invoice(basicPayment,tax));

    }


}

