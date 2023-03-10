package br.edu.ifsp.dmos5.model;

import android.widget.Toast;

public class CreditCard {

    private int id;
    private double balance;
    private static int LAST_CARD_ID = -1;

    public CreditCard(){
        balance = 15000.0;
        id = LAST_CARD_ID++;
        LAST_CARD_ID = id;
    }

    public void creditValue(double value){
        balance += value;
    }

    public void debitValue(double value){
        if(balance - value < 0){

        } else {
            balance -= value;
        }
    }
}
