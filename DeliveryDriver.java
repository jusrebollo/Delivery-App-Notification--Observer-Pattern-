package edu.bu.met.cs665.example1;

public class DeliveryDriver implements Observer{

    // variable to keep track of the delivery status
    // 0 = not on delivery
    // 1 = on delivery
    int onDelivery = 0;

    // receives update about the deliver request
    @Override
    public String post(DeliveryRequest Delivery) {

         System.out.println ("Delivery Order- " + Delivery.getDelivery()); // remove if no command line needed
         return "Delivery Order- " + Delivery.getDelivery();
    }

    // method to return the delivery status

    public int DeliveryStatus()
    {
        return onDelivery;
    }


}

