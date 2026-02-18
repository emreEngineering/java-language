// Main.java
import java.util.ArrayList;

public class Main {
    // Statik final sabit (constant) örneği
    static final int EXCHANGE_RATE = 100;

    public static void main(String[] args) {
        // 1. Java Değişkenleri Nedir?
        // Değişken, bir veri değerini saklayan bellek parçasıdır ve bir veri tipine sahiptir.
        // Değişkenler, programın işini yapmak için gerekli bilgileri saklar (örn. sayılar, metinler).
        System.out.println("1. Java Değişkenleri Nedir?");
        int number = 10;
        System.out.println("number: " + number);
        number = number + 20;
        System.out.println("number + 20: " + number);

        // 2. Java Değişken Tipleri
        // Dört tip: non-static fields, static fields, local variables, parameters
        System.out.println("\n2. Java Değişken Tipleri Örneği:");
        // 2.1 Non-static field (instance variable)
        MyClass obj = new MyClass();
        obj.instanceVar = 50;
        System.out.println("Non-static field (instanceVar): " + obj.instanceVar);
        // 2.2 Static field (class variable)
        MyClass.staticVar = 100;
        System.out.println("Static field (staticVar): " + MyClass.staticVar);
        // 2.3 Local variable
        int localVar = 200;
        System.out.println("Local variable (localVar): " + localVar);
        // 2.4 Parameter (metot içinde gösterilecek)
        printParameter(300);

        // 3. Java Değişken Tanımlama
        // Söz dizimi: tip isim;
        // İlkel ve nesne tipleri için tanımlama örnekleri
        System.out.println("\n3. Java Değişken Tanımlama Örneği:");
        // İlkel veri tipleri
        byte myByte;
        short myShort;
        char myChar;
        int myInt;
        long myLong;
        float myFloat;
        double myDouble;
        // Nesne veri tipleri
        Byte myObjByte;
        Short myObjShort;
        Character myObjChar;
        Integer myObjInt;
        Long myObjLong;
        Float myObjFloat;
        Double myObjDouble;
        String myString;
        System.out.println("Değişkenler tanımlandı, ancak henüz değer atanmadı.");

        // 4. Java Değişken Atama
        // Söz dizimi: değişkenAdı = değer;
        System.out.println("\n4. Java Değişken Atama Örneği:");
        myByte = 127;
        myFloat = 199.99f;
        myString = "This is a text";
        System.out.println("myByte = " + myByte);
        System.out.println("myFloat = " + myFloat);
        System.out.println("myString = " + myString);
        // Tanımlama ile birlikte atama
        int myIntAssigned = 500;
        String myStringAssigned = "Merhaba, Java!";
        System.out.println("myIntAssigned = " + myIntAssigned);
        System.out.println("myStringAssigned = " + myStringAssigned);

        // 5. Java Değişken Okuma
        // Değişken adı, atama, metot çağrısı veya ifadelerde kullanılabilir.
        System.out.println("\n5. Java Değişken Okuma Örneği:");
        float myFloat1 = 199.99f;
        float myFloat2 = myFloat1; // Sağ taraf değeri
        float myFloat3 = myFloat2 + 123.45f; // Aritmetik ifade
        System.out.println("myFloat2 (atama): " + myFloat2);
        System.out.println("myFloat3 (aritmetik): " + myFloat3);
        System.out.println("Metot çağrısı: ");
        printFloat(myFloat3); // Metot parametresi

        // 6. Java Değişken İsimlendirme Kuralları
        // - Büyük/küçük harfe duyarlı
        // - Harf, $ veya _ ile başlar, sonra sayı içerebilir
        // - Ayrılmış kelimeler (int, for vb.) kullanılamaz
        System.out.println("\n6. Java Değişken İsimlendirme Örneği:");
        int myvar = 1;
        int myVar = 2;
        int MYVAR = 3;
        int _myVar = 4;
        int $myVar = 5;
        int myVar1 = 6;
        int myVar_1 = 7;
        System.out.println("myvar = " + myvar + ", myVar = " + myVar + ", MYVAR = " + MYVAR);
        System.out.println("_myVar = " + _myVar + ", $myVar = " + $myVar);
        System.out.println("myVar1 = " + myVar1 + ", myVar_1 = " + myVar_1);
        // Sabit (static final) örneği
        System.out.println("Sabit: EXCHANGE_RATE = " + EXCHANGE_RATE);

        // 7. Java Yerel Değişken Türü Çıkarımı (Java 10+)
        // var anahtar kelimesi, atanan değere göre türü çıkarır.
        System.out.println("\n7. Yerel Değişken Türü Çıkarımı Örneği (Java 10+):");
        var myStringVar = "A string!"; // String
        var myListVar = new ArrayList<String>(); // ArrayList<String>
        var myNumVar = new Integer(123); // Integer
        var myClassVar = new MyClass(); // MyClass
        System.out.println("var myStringVar (String): " + myStringVar);
        System.out.println("var myListVar (ArrayList): " + myListVar.getClass().getSimpleName());
        System.out.println("var myNumVar (Integer): " + myNumVar);
        System.out.println("var myClassVar (MyClass): " + myClassVar.getClass().getSimpleName());
        // for döngüsünde var kullanımı
        System.out.println("for döngüsünde var:");
        var strings = new String[]{"one", "two", "three"};
        for (var str : strings) {
            System.out.println("str: " + str);
        }

        // 8. Yaygın Hatalar
        // - Ayrılmış kelimelerle isimlendirme
        // - Yanlış veri tipi atama
        // - Tür çıkarımı olmayan yerlerde var kullanımı
        System.out.println("\n8. Yaygın Hatalar Örneği:");
        int validVar = 10; // Doğru kullanım
        System.out.println("Geçerli değişken: validVar = " + validVar);
        // Hata örneği (yorum): int for = 5; // 'for' ayrılmış kelime
        // Hata örneği (yorum): var noInit; // var için başlangıç değeri gerekli
        // Hata örneği (yorum): String str = 123; // Yanlış veri tipi atama
    }

    // Yardımcı metot: Parametre örneği
    private static void printParameter(int param) {
        System.out.println("Parameter (param): " + param);
    }

    // Yardımcı metot: Değişken okuma örneği
    private static void printFloat(float value) {
        System.out.println("Float değeri: " + value);
    }
}

// Yardımcı sınıf: Non-static ve static field örneği
class MyClass {
    int instanceVar; // Non-static field (instance variable)
    static int staticVar; // Static field (class variable)
}