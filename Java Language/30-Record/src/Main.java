// Main.java

public class Main {
    public static void main(String[] args) {
        // Java Record kullanımı
        Vehicle vehicle1 = new Vehicle("Mercedes", "UX 1238 A95");
        Vehicle vehicle2 = new Vehicle("Toyota");

        // Otomatik oluşturulan getter metodları
        System.out.println(vehicle1.brand());          // Mercedes
        System.out.println(vehicle1.licensePlate());   // UX 1238 A95

        // toString() metodu otomatik
        System.out.println(vehicle1);                   // Vehicle[brand=Mercedes, licensePlate=UX 1238 A95]

        // Ekstra constructor ile oluşturulan nesne
        System.out.println(vehicle2.brand());          // Toyota
        System.out.println(vehicle2.licensePlate());   // null

        // Ek instance metot kullanımı
        System.out.println(vehicle1.brandAsLowerCase());  // mercedes

        // Static metot kullanımı
        System.out.println(Vehicle.brandAsUpperCase(vehicle1)); // MERCEDES
    }
}

// Java Record: immutable, final, otomatik getter, toString, equals, hashCode sağlar
record Vehicle(String brand, String licensePlate) {

    // Ek constructor: sadece brand verilirse licensePlate null olur
    public Vehicle(String brand) {
        this(brand, null);
    }

    // Instance metot: brand değerini küçük harfe çevirir
    public String brandAsLowerCase() {
        return brand().toLowerCase();
    }

    // Static metot: verilen Vehicle objesinin brand değerini büyük harfe çevirir
    public static String brandAsUpperCase(Vehicle vehicle) {
        return vehicle.brand.toUpperCase();
    }
}
