// Main.java
public class Main {
    public static void main(String[] args) {

        // Bölüm 1: Basit Kalıtım Örneği
        Car car = new Car();
        car.setLicensePlate("34ABC123");
        car.setNumberOfSeats(4);

        System.out.println("Car license plate: " + car.getLicensePlate());
        System.out.println("Car number of seats: " + car.getNumberOfSeats());

        // Bölüm 2: Upcasting ve Downcasting
        Vehicle vehicle = car;  // Upcasting (Car -> Vehicle)
        System.out.println("Vehicle license plate (via upcast): " + vehicle.getLicensePlate());

        if (vehicle instanceof Car) {
            Car car2 = (Car) vehicle;  // Downcasting (Vehicle -> Car)
            System.out.println("Downcast successful, seats: " + car2.getNumberOfSeats());
        }

        // Bölüm 3: Method Override ve super Kullanımı
        car.setLicensePlate("XYZ987");
        System.out.println("Overridden license plate: " + car.getLicensePlate());

        // Bölüm 4: Final sınıf örneği (Aşağıdaki sınıf extend edilmez)
        // FinalClass fc = new FinalClass();
        // fc.doSomething();

        // Bölüm 5: Abstract sınıf örneği
        AbstractVehicle abstractVehicle = new ConcreteVehicle();
        abstractVehicle.move();
    }
}

// Üst sınıf Vehicle
class Vehicle {
    protected String licensePlate;

    public void setLicensePlate(String license) {
        this.licensePlate = license;
    }

    public String getLicensePlate() {
        return licensePlate;
    }
}

// Alt sınıf Car, Vehicle sınıfını genişletiyor (inheritance)
class Car extends Vehicle {
    private int numberOfSeats;

    public void setNumberOfSeats(int seats) {
        this.numberOfSeats = seats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    // Method override: Vehicle'daki setLicensePlate metodunu değiştiriyoruz
    @Override
    public void setLicensePlate(String license) {
        // Üst sınıf metodunu çağırıyoruz
        super.setLicensePlate(license.toUpperCase());
    }
}

// Final sınıf örneği
final class FinalClass {
    public void doSomething() {
        System.out.println("Final class method");
    }
}

// Abstract sınıf örneği
abstract class AbstractVehicle {
    public abstract void move();  // Abstract method (gövdesiz)
}

// Abstract sınıfı genişleten somut sınıf
class ConcreteVehicle extends AbstractVehicle {
    @Override
    public void move() {
        System.out.println("ConcreteVehicle is moving");
    }
}
