package edu.bu.met.cs665.example1;


// interface for Observed

public interface Observed {

    public DeliveryRequest getOrder();
    public void addObserver(DeliveryDriver object);
    public void removerObserver(DeliveryDriver object);
    public void SendOrder(DeliveryRequest Delivery);

}
