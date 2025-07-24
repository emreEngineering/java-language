// Main.java
public class Main {
    public static void main(String[] args) {
        // Bölüm 1: Java Veri Tipleri Giriş
        System.out.println("=== Java Veri Tipleri ===");
        System.out.println("Java'da iki ana veri tipi kategorisi: İlkel (Primitive) ve Referans (Reference)");

        // Bölüm 2: İlkel Veri Tipleri
        System.out.println("\n=== İlkel Veri Tipleri ===");
        System.out.println("İlkel veri tipleri: byte, short, int, long, float, double, char, boolean");

        // 2.1 byte (-128 ile 127 arasında 8-bit tamsayı)
        byte myByte = 100;
        System.out.println("byte Örneği: myByte = " + myByte); // 100
        // Hata örneği: byte myByte2 = 128; // Hata: 128, byte aralığını aşar

        // 2.2 short (-32,768 ile 32,767 arasında 16-bit tamsayı)
        short myShort = 32000;
        System.out.println("short Örneği: myShort = " + myShort); // 32000

        // 2.3 int (-2^31 ile 2^31-1 arasında 32-bit tamsayı)
        int myInt = 123456789;
        System.out.println("int Örneği: myInt = " + myInt); // 123456789

        // 2.4 long (-2^63 ile 2^63-1 arasında 64-bit tamsayı, sonuna L eklenir)
        long myLong = 1234567890123456789L;
        System.out.println("long Örneği: myLong = " + myLong); // 1234567890123456789

        // 2.5 float (32-bit ondalık sayı, sonuna f veya F eklenir)
        float myFloat = 3.14159f;
        System.out.println("float Örneği: myFloat = " + myFloat); // 3.14159

        // 2.6 double (64-bit ondalık sayı, varsayılan ondalık tip)
        double myDouble = 3.141592653589793;
        System.out.println("double Örneği: myDouble = " + myDouble); // 3.141592653589793

        // 2.7 char (16-bit Unicode karakter, tek tırnak ile tanımlanır)
        char myChar = 'A';
        char myUnicodeChar = '\u0041'; // Unicode ile 'A'
        System.out.println("char Örneği: myChar = " + myChar); // A
        System.out.println("Unicode char Örneği: myUnicodeChar = " + myUnicodeChar); // A

        // 2.8 boolean (true veya false değerleri)
        boolean myBoolean = true;
        System.out.println("boolean Örneği: myBoolean = " + myBoolean); // true
        myBoolean = false;
        System.out.println("boolean Güncellendi: myBoolean = " + myBoolean); // false

        // Bölüm 3: İlkel Veri Tipleri Varsayılan Değerleri
        System.out.println("\n=== İlkel Veri Tipleri Varsayılan Değerleri ===");
        // İlkel tipler sınıf düzeyinde tanımlandığında varsayılan değerler alır
        class DefaultValues {
            byte defaultByte;
            short defaultShort;
            int defaultInt;
            long defaultLong;
            float defaultFloat;
            double defaultDouble;
            char defaultChar;
            boolean defaultBoolean;

            void printDefaults() {
                System.out.println("Varsayılan byte: " + defaultByte); // 0
                System.out.println("Varsayılan short: " + defaultShort); // 0
                System.out.println("Varsayılan int: " + defaultInt); // 0
                System.out.println("Varsayılan long: " + defaultLong); // 0
                System.out.println("Varsayılan float: " + defaultFloat); // 0.0
                System.out.println("Varsayılan double: " + defaultDouble); // 0.0
                System.out.println("Varsayılan char: " + (int) defaultChar); // 0 (Unicode \u0000)
                System.out.println("Varsayılan boolean: " + defaultBoolean); // false
            }
        }
        DefaultValues defaults = new DefaultValues();
        defaults.printDefaults();

        // Bölüm 4: Referans Veri Tipleri
        System.out.println("\n=== Referans Veri Tipleri ===");
        System.out.println("Referans tipleri: Sınıflar, diziler, arayüzler, String gibi nesneler");
        System.out.println("Referans tiplerinin varsayılan değeri: null");

        // 4.1 String (Referans Tipi Örneği)
        String myString = "Merhaba, Java!";
        System.out.println("String Örneği: myString = " + myString); // Merhaba, Java!

        // 4.2 Dizi (Referans Tipi Örneği)
        int[] myArray = {1, 2, 3, 4, 5};
        System.out.print("Dizi Örneği: myArray = ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println(); // 1 2 3 4 5

        // 4.3 Özel Sınıf (Referans Tipi Örneği)
        class MyClass {
            int value = 42;
        }
        MyClass myObject = new MyClass();
        System.out.println("Özel Sınıf Örneği: myObject.value = " + myObject.value); // 42

        // 4.4 Null Değer (Referans Tipleri için)
        String nullString = null;
        System.out.println("Null String Örneği: nullString = " + nullString); // null
        // Hata örneği: nullString.length(); // NullPointerException

        // Bölüm 5: İlkel ve Referans Tipleri Arasındaki Farklar
        System.out.println("\n=== İlkel ve Referans Tipleri Farkları ===");
        // İlkel tipler doğrudan değeri saklar
        int primitive1 = 10;
        int primitive2 = primitive1;
        primitive2 = 20;
        System.out.println("İlkel Tip: primitive1 = " + primitive1); // 10 (değişmez)
        System.out.println("İlkel Tip: primitive2 = " + primitive2); // 20

        // Referans tipler nesneye işaret eder
        int[] array1 = {1, 2, 3};
        int[] array2 = array1;
        array2[0] = 99;
        System.out.print("Referans Tip: array1 = ");
        for (int i : array1) {
            System.out.print(i + " ");
        }
        System.out.println(); // 99 2 3 (array1 de değişir)
        System.out.print("Referans Tip: array2 = ");
        for (int i : array2) {
            System.out.print(i + " ");
        }
        System.out.println(); // 99 2 3
    }
}