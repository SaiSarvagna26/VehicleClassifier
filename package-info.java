package Vehicle;


package Lib;
abstract class Vehicle
{
    abstract void start();
    abstract void stop();
}
class Car extends Vehicle
{
    void start()
    {
        System.out.println("Car has Started");
    }
    void stop()
    {
        System.out.println("Car has Stopped");
    }
}
class Motorcycle extends Vehicle
{
    void start()
    {
        System.out.println("Motorcycle has Started");
    }
    void stop()
    {
        System.out.println("Motorcycle has Stopped");
    }
}
public class VehicleClassifier {
    public static void main(String[] args) {
        Vehicle car=new Car();
        car.start();
        car.stop();
        Vehicle motorcycle =new Motorcycle();
        motorcycle.start();
        motorcycle.stop();
    }
}