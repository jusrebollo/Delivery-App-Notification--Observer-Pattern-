package edu.bu.met.cs665.example1;

import java.util.ArrayList;

// implements a store based on Observed
// Represents when a store has a product to send to multiple delivery drivers

public class Store implements Observed {

    // product information and address for delivery driver
    String address;
    String product;

    // array list to hold all delivery drivers
    public ArrayList<DeliveryDriver> AllDeliveryDrivers= new ArrayList<DeliveryDriver>();

    //instance of delivery request
    public DeliveryRequest Delivery;


    // returns the delivery of address and product
    @Override
    public DeliveryRequest getOrder() {
        return Delivery;
    }


    // adds an observer (delivery driver) to the store to receive information
    @Override
    public void addObserver(DeliveryDriver Driver) {

        AllDeliveryDrivers.add(Driver);

    }

    // removes an observer (delivery driver) from the store
    @Override
    public void removerObserver(DeliveryDriver Driver) {

        AllDeliveryDrivers.remove(Driver);

    }

    // broadcasts the delivery order to all delivery drivers

    @Override
    public void SendOrder(DeliveryRequest Delivery) {

        for(DeliveryDriver Driver: AllDeliveryDrivers)
        {
            Driver.post(Delivery);
        }

    }

    // assigns the order to one delivery driver based on first available driver
    public String AssignOrder(DeliveryRequest Delivery) {

        for (DeliveryDriver Driver : AllDeliveryDrivers) {
            if (Driver.onDelivery == 0) {
                Driver.onDelivery = 1;
                System.out.println ("Delivery Assigned");
                break;
            }
        }
        return null;
    }


}
