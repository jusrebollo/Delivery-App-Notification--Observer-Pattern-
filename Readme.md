# Read me Assignment 2

UML Diagram for my implementation for Assignment 2 
![Screen Shot 2022-03-28 at 12 14 20 AM](https://user-images.githubusercontent.com/101818122/160328684-21222c8a-1358-4912-9cd2-04bd606e5a0d.png)


# Design Pattern 
For this assignment I used the Observer patten to implement the Delivery Application - Notification System which was 
the goal of this assignment. I used the Observer pattern because the use case of notifying many drivers about delivery 
requests from a sole store fits the purpose of the observer pattern. The patterns allows one to broadcast the deliveries 
to multiple "drivers" at once. 

#Assumptions 
In my implementation I assumed that a store could add as many drivers as needed and that there was no need to differentiate 
drivers between stores. In my implementation when a driver is added to a store, they will receive all delivery requests. 
When a delivery is assigned, the first available driver "accepts" the delivery. 

#Reusability 
In order to ensure that my code was reusable. I created Observer and Observed interfaces which can be implemented in many
fashions while still meeting the use case of the Observer pattern. 

#Simplicity and Readability 
To ensure my code was simple and readable, I used short and direct function names which adequately describe the nature 
of the method. In addition, I added significant comments to help define and explain methods and variables. 

#Flexibility 
The Observer and Observed interfaces can be reused in multiple ways while still meeting the Observer pattern. In addition, 
the Store and Delivery Driver classes can be extended to meet the needs of more complex or differing scenarios. 
