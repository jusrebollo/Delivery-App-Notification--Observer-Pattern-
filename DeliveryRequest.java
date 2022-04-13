package edu.bu.met.cs665.example1;

public class DeliveryRequest {

    String address;
    String product;

    public  DeliveryRequest( String address, String product){
        this.address = address;
        this.product = product;

    }

    public String getDelivery()
    {
        return "Address: " + address + " " + "Item: " + product;
    }



}
