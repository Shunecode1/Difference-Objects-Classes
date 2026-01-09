package differenceObjectsClasses;

//Demonstrates differences between classes and objects
public class Main {
 public static void main(String[] args) {

     // OBJECTS: Specific instances of the Car CLASS
     Car car1 = new Car("Toyota", 2018);
     Car car2 = new Car("Honda", 2020);

     // Each object maintains its own state
     car1.displayInfo();
     car2.displayInfo();
 }
}
