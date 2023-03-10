package br.edu.ifsp.dmos5.model;

public class StarBank {

    private static StarBank instance;

    private StarBank(){

    }

    public static StarBank getInstance(String value) {
        if (instance == null) {
            instance = new StarBank();
        }
        return instance;
    }

    public void StartCreditCards(){

    }

    public void roundComplete(CreditCard card, double value){

    }

    public boolean transfer(CreditCard payer, CreditCard receiver, double value){

        return true;
    }

    public void receive(CreditCard card, double value){

    }

    public boolean pay(CreditCard card, double value){
        return true;
    }


}
