package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;

import edu.bu.met.cs665.example1.DeliveryDriver;
import edu.bu.met.cs665.example1.DeliveryRequest;
import edu.bu.met.cs665.example1.Store;
import org.junit.Test;

// Write some Unit tests for your program like the following.

public class TestDelivery {

  public TestDelivery() {
  }

  // Tests if the Deliveries are broadcasted and assigned

  // tests if delivery driver receives the address and product information
  @Test
  public void testDeliveryDriver() {
    DeliveryDriver Driver1 = new DeliveryDriver();
    assertEquals("Delivery Order- Address: 144 W Houston Item: Mozarella Sticks",
            (Driver1.post(new DeliveryRequest("144 W Houston", "Mozarella Sticks"))));

  }

  //tests if delivery driver is added to the store broadcast list
  @Test
  public void testStore() {
    Store Store1 = new Store();
    DeliveryDriver Driver1 = new DeliveryDriver();
    Store1.addObserver(Driver1);
    Store1.AllDeliveryDrivers.size();
    assertEquals(Store1.AllDeliveryDrivers.size(), 1);

  }


  // tests if multiple delivery drivers are added to the store
  @Test
  public void testStoreMultiple() {
    Store Store1 = new Store();
    DeliveryDriver Driver1 = new DeliveryDriver();
    DeliveryDriver Driver2 = new DeliveryDriver();
    DeliveryDriver Driver3 = new DeliveryDriver();
    DeliveryDriver Driver4 = new DeliveryDriver();
    DeliveryDriver Driver5 = new DeliveryDriver();
    DeliveryDriver Driver6 = new DeliveryDriver();

    Store1.addObserver(Driver1);
    Store1.addObserver(Driver2);
    Store1.addObserver(Driver3);
    Store1.addObserver(Driver4);
    Store1.addObserver(Driver5);
    Store1.addObserver(Driver6);

    Store1.AllDeliveryDrivers.size();
    assertEquals(Store1.AllDeliveryDrivers.size(), 6);

  }

  // tests if the delivery was assigned to a  driver
  @Test
  public void testAssignedDelivery() {
    Store Applebees = new Store();
    DeliveryDriver Driver1 = new DeliveryDriver();
    Applebees.addObserver(Driver1);
    Applebees.AssignOrder(new DeliveryRequest("1345 Sage Street", "Fries"));

    assertEquals(1, (Driver1.DeliveryStatus()));

    }

  //tests if the delivery was assigned to the first available driver
  // in this instance the delivery should be assigned to driver 1 not 2
  @Test
  public void testAssignedDeliveryMultiple() {
    Store Applebees = new Store();
    DeliveryDriver Driver1 = new DeliveryDriver();
    DeliveryDriver Driver2 = new DeliveryDriver();
    Applebees.addObserver(Driver1);
    Applebees.addObserver(Driver2);
    Applebees.AssignOrder(new DeliveryRequest("1345 Sage Street", "Fries"));

    assertEquals(0, (Driver2.DeliveryStatus()));

  }

}

