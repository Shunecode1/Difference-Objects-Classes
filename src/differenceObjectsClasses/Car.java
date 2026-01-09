package differenceObjectsClasses;

//CLASS: Blueprint defining attributes and behaviors of all Car objects
public class Car {
 String brand;
 int year;

 // Constructor: used to create OBJECTS with specific data
 public Car(String brand, int year) {
     this.brand = brand;
     this.year = year;
 }

 // Method: behavior shared by all Car objects
 public void displayInfo() {
     System.out.println("Brand: " + brand + ", Year: " + year);
 }
}
