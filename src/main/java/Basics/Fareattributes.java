/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basics;

/**
 *
 * @author Cryowynd
 */
import java.util.ArrayList;

public class Fareattributes {
 private String    fare_id ;
private int price ;
private String currency_type ;
private int payment_method ;
private int transfers ;
private int transfer_duration ;

    public Fareattributes(String fare_id, int price, String currency_type, int payment_method, int transfers, int transfer_duration) {
        this.fare_id = fare_id;
        this.price = price;
        this.currency_type = currency_type;
        this.payment_method = payment_method;
        this.transfers = transfers;
        this.transfer_duration = transfer_duration;
    }

    public String getFare_id() {
        return fare_id;
    }

    public int getPrice() {
        return price;
    }

    public String getCurrency_type() {
        return currency_type;
    }

    public int getPayment_method() {
        return payment_method;
    }

    public int getTransfers() {
        return transfers;
    }

    public int getTransfer_duration() {
        return transfer_duration;
    }

ArrayList<Fareattributes> List = new ArrayList<Fareattributes>();

    public ArrayList<Fareattributes> getList() {
        return List;
    }


    public void AddL(Fareattributes object) {
    List.add(object);
    
}
}