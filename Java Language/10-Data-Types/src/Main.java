// Main.java
public class Main {
    public static void main(String[] args) {
        // 1. Java Veri Tipleri Nedir?
        // Java'da her değişkenin bir veri tipi vardır: ilkel (primitive) veya nesne referansı (object reference).
        // İlkel tipler doğrudan değer saklar, nesne tipleri ise bellekteki nesneye işaret eder.
        System.out.println("1. Java Veri Tipleri Nedir?");
        System.out.println("İlkel Tipler: boolean, byte, short, char, int, long, float, double");
        System.out.println("Nesne Tipler: Boolean, Byte, Short, Character, Integer, Long, Float, Double, String, vb.");

        // 2. İlkel Veri Tipleri
        // İlkel tipler, doğrudan değer saklar ve sabit bir boyuta sahiptir.
        System.out.println("\n2. İlkel Veri Tipleri Örneği:");
        // 2.1 boolean: true veya false
        boolean myBoolean = true;
        System.out.println("boolean: myBoolean = " + myBoolean);
        // 2.2 byte: 8-bit, -128 ile 127
        byte myByte = 100;
        System.out.println("byte: myByte = " + myByte);
        // 2.3 short: 16-bit, -32,768 ile 32,767
        short myShort = 30000;
        System.out.println("short: myShort = " + myShort);
        // 2.4 char: 16-bit Unicode karakter
        char myChar = 'A';
        System.out.println("char: myChar = " + myChar);
        // 2.5 int: 32-bit, -2^31 ile 2^31-1
        int myInt = 123456;
        System.out.println("int: myInt = " + myInt);
        // 2.6 long: 64-bit, -2^63 ile 2^63-1
        long myLong = 123456789012L;
        System.out.println("long: myLong = " + myLong);
        // 2.7 float: 32-bit kayan noktalı sayı
        float myFloat = 3.14f;
        System.out.println("float: myFloat = " + myFloat);
        // 2.8 double: 64-bit kayan noktalı sayı
        double myDouble = 3.14159;
        System.out.println("double: myDouble = " + myDouble);

        // 3. Nesne Veri Tipleri
        // İlkel tiplerin nesne sürümleri ve diğer temel nesne tipleri (ör. String).
        // Nesne tipleri, bellekte bir nesneye referans tutar.
        System.out.println("\n3. Nesne Veri Tipleri Örneği:");
        // 3.1 Boolean
        Boolean myObjBoolean = new Boolean(true);
        System.out.println("Boolean: myObjBoolean = " + myObjBoolean);
        // 3.2 Byte
        Byte myObjByte = new Byte((byte) 100);
        System.out.println("Byte: myObjByte = " + myObjByte);
        // 3.3 Short
        Short myObjShort = new Short((short) 30000);
        System.out.println("Short: myObjShort = " + myObjShort);
        // 3.4 Character
        Character myObjChar = new Character('A');
        System.out.println("Character: myObjChar = " + myObjChar);
        // 3.5 Integer
        Integer myObjInteger = new Integer(123456);
        System.out.println("Integer: myObjInteger = " + myObjInteger);
        // 3.6 Long
        Long myObjLong = new Long(123456789012L);
        System.out.println("Long: myObjLong = " + myObjLong);
        // 3.7 Float
        Float myObjFloat = new Float(3.14f);
        System.out.println("Float: myObjFloat = " + myObjFloat);
        // 3.8 Double
        Double myObjDouble = new Double(3.14159);
        System.out.println("Double: myObjDouble = " + myObjDouble);
        // 3.9 String
        String myString = "Merhaba, Java!";
        System.out.println("String: myString = " + myString);

        // 4. İlkel Veri Tiplerinin Nesne Sürümlerinin Değişmezliği (Immutability)
        // Nesne tipleri, bir kez oluşturulduktan sonra içindeki değer değiştirilemez.
        System.out.println("\n4. Nesne Tiplerinin Değişmezliği Örneği:");
        Integer immutableInt = new Integer(45);
        System.out.println("Başlangıç immutableInt: " + immutableInt);
        immutableInt = new Integer(33); // Yeni bir nesne oluşturulur
        System.out.println("Yeni atama sonrası immutableInt: " + immutableInt);
        // Not: immutableInt'in eski nesnesi değiştirilmez, yeni bir nesneye işaret eder.

        // 5. Otomatik Kutulama (Auto-Boxing)
        // Java 5'ten itibaren ilkel tipler ile nesne tipleri arasında otomatik dönüşüm yapılır.
        System.out.println("\n5. Otomatik Kutulama Örneği:");
        // 5.1 İlkelden nesneye (boxing)
        int primitiveInt = 45;
        Integer boxedInt = primitiveInt; // Otomatik kutulama
        System.out.println("İlkel int: " + primitiveInt + ", Kutu Integer: " + boxedInt);
        // 5.2 Nesneden ilkele (unboxing)
        Integer objInt = new Integer(33);
        int unboxedInt = objInt; // Otomatik kutudan çıkarma
        System.out.println("Nesne Integer: " + objInt + ", İlkel int: " + unboxedInt);

        // 6. Otomatik Kutulama ile NullPointerException Tehlikesi
        // Nesne tipi null ise, ilkel tipe dönüşüm NullPointerException fırlatır.
        System.out.println("\n6. NullPointerException ile Otomatik Kutulama Örneği:");
        Integer nullInteger = null;
        try {
            int badInt = nullInteger; // null'dan ilkele dönüşüm
            System.out.println("Hata: " + badInt);
        } catch (NullPointerException e) {
            System.out.println("Hata: nullInteger ilkel tipe dönüştürülemez, NullPointerException!");
        }

        // 7. Yaygın Hatalar
        // - İlkel ve nesne tipleri karıştırıldığında dikkatli olunmalı.
        // - null nesne referansları ile otomatik kutulama/unboxing hataları.
        System.out.println("\n7. Yaygın Hatalar Örneği:");
        Integer safeInteger = 100; // Güvenli kullanım
        int safeInt = safeInteger; // Güvenli unboxing
        System.out.println("Güvenli dönüşüm: Integer " + safeInteger + " -> int " + safeInt);
        // Hata örneği (yorum): Integer nullInt = null; int bad = nullInt; // NullPointerException
    }
}