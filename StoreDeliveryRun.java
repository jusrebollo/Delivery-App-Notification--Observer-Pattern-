package edu.bu.met.cs665.example1;

public class StoreDeliveryRun {

    public static void main(String[] args) {

        DeliveryDriver Driver1 = new DeliveryDriver();
        DeliveryDriver Driver2 = new DeliveryDriver();
        DeliveryDriver Driver3 = new DeliveryDriver();
        DeliveryDriver Driver4 = new DeliveryDriver();
        DeliveryDriver Driver5 = new DeliveryDriver();

        Store Applebees = new Store();
        Store Wendys = new Store();
        Applebees.addObserver(Driver1);
        Applebees.addObserver(Driver2);
        Applebees.addObserver(Driver3);
        Applebees.addObserver(Driver4);
        Applebees.addObserver(Driver5);
        Wendys.addObserver(Driver1);
        Wendys.addObserver(Driver2);
        Wendys.addObserver(Driver3);
        Applebees.SendOrder(new DeliveryRequest("144 W Houston", "Mozarella Sticks"));
        Wendys.SendOrder(new DeliveryRequest("9834 Gulf Street", "Baconator"));
        Applebees.AssignOrder(new DeliveryRequest("1345 Sage Street", "Fries"));




    }


}
