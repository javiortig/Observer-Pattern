# Observer-Pattern:
This exercise consist in the use of the Observer Pattern implemented in java to solve a problem of book returning in a library.   
  
## Problem and context:
Each department(Shopping, Stock, Admin) works as an observer and will be notice by the BookAlarm class each time a book is returned to the library. They will first follow the Push strategy for the notifications.  
  
The following java classes are used in the project:  
* A support class called book, to make more sence of the context.
* The library class.
* ModelBookAlarm abstract class, which extends Observable java util class, and serves as a model for the PushModelObservable class.  
* ModelObserver abstract class, just like the ModelBookAlarm, but extending the Observer class, and its extended by the PushModelObserver. This class has a name attribute to distinguish between the Stock, Admin and Shopping departments.  
* Finally the test class to try our implementation.

## Conclusion:
The project needs to add the Pull philosophy as well, but the lack of specification of the exersice lead me to build a solution where the push strategy is the only one to make sence. Even so, this exersice has helped me get a better understanding of when should I use this pattern, which makes a lot of sence in a server demanding application where many different clients suscribe to the data.  

