// main.java

// Java Constructors Notları

class MyClass {
    // No-arg constructor (boş kurucu)
    public MyClass() {
        // Nesne oluşturulunca çalışır
    }

    // Constructor Overloading
    private int number;
    public MyClass(int number) {
        this.number = number;
    }
}

class Employee {
    private String firstName;
    private String lastName;
    private int birthYear;

    // Constructor with parameters
    public Employee(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    // Constructor overloading
    public Employee(String firstName, String lastName) {
        this(firstName, lastName, -1); // Diğer kurucuyu çağırma
    }
}

class Vehicle {
    private String regNo;

    public Vehicle(String regNo) {
        this.regNo = regNo;
    }
}

class Car extends Vehicle {
    private String brand;

    // Calling superclass constructor using super
    public Car(String brand, String regNo) {
        super(regNo);
        this.brand = brand;
    }

    // Constructor throwing exception
    public Car(String brand) throws Exception {
        super("UNKNOWN");
        if (brand == null) {
            throw new Exception("Brand cannot be null");
        }
        this.brand = brand;
    }
}

public class Main {
    public static void main(String[] args) {
        // Constructor çağırma örnekleri
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass(42);

        Employee emp1 = new Employee("Ali", "Yılmaz", 1999);
        Employee emp2 = new Employee("Zeynep", "Kaya");

        Car car1 = new Car("Toyota", "34ABC123");

        try {
            Car car2 = new Car(null);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
