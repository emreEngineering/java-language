// Main.java
/*
Scoped Assignment ve Scoped Access Java'da gerçek özellikler değil.
// Ancak bu örnekte fluent setter ve blok yapısı kullanarak
// bu fikirlerin benzerleri simüle edilmiştir.

// Scoped Assignment:
// Atama ifadesi sonucu o değişkeni döndürür, böylece atama sonrası metod çağrısı yapılabilir.

// Scoped Access:
// Nesne üzerinde çoklu alan ve metot çağrıları bir blok içinde yapılabilir.
// Böylece her satırda nesne adını tekrar yazmak gerekmez.
*/

class MyObject {
    int field1;
    String field2;

    // Scoped Assignment benzeri: atama yapar, kendini döner (fluent setter)
    MyObject setField1(int value) {
        this.field1 = value;
        return this;
    }

    MyObject setField2(String value) {
        this.field2 = value;
        return this;
    }

    void verifyConfiguration() {
        System.out.println("Verify config: field1 = " + field1 + ", field2 = " + field2);
    }

    void init() {
        System.out.println("Initialization done.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Scoped Access simülasyonu: blok içinde nesneye ait alan ve metotlar kullanılıyor
        MyObject myObject = new MyObject();
        {
            // Buradaki blok Scoped Access etkisi yaratıyor
            myObject.setField1(10);
            myObject.setField2("Scoped Access Example");
            myObject.verifyConfiguration();
            myObject.init();
        }

        System.out.println("---");

        // Scoped Assignment simülasyonu: zincirleme metot çağrıları ile atama ve erişim
        MyObject myObject2 = new MyObject()
                .setField1(20)                  // Atama yapılır
                .setField2("Scoped Assignment"); // Atama sonrası nesne döndüğü için zincir devam eder
        myObject2.verifyConfiguration();
        myObject2.init();

        System.out.println("---");

        // Scoped Assignment ve Scoped Access kombinasyonu simülasyonu
        MyObject myObject3 = new MyObject();
        {
            myObject3
                    .setField1(30)
                    .setField2("Combined Scoped Example");
            myObject3.verifyConfiguration();
            myObject3.init();
        }
    }
}
