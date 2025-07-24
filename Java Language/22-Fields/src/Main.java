// main.java dosyası

public class Main { // Ana sınıf tanımı

    public static void main(String[] args) { // Java uygulamasının başlangıç metodu

        System.out.println("// Java Alanları (Fields) Hakkında:");
        System.out.println("// Bir Java alanı, bir sınıfın içindeki bir değişkendir.");
        System.out.println("// Örneğin, bir Çalışan (Employee) sınıfında aşağıdaki alanlar bulunabilir:");
        System.out.println("// - name (isim)");
        System.out.println("// - position (pozisyon)");
        System.out.println("// - salary (maaş)");
        System.out.println("// - hiredDate (işe alınma tarihi)");
        System.out.println();

        System.out.println("// Örnek Çalışan Sınıfı (Employee Class):");
        class Employee { // Çalışan sınıfı tanımı
            String name;     // İsim alanının tanımı (varsayılan erişim)
            String position; // Pozisyon alanının tanımı (varsayılan erişim)
            int salary;    // Maaş alanının tanımı (varsayılan erişim)
            java.util.Date hiredDate; // İşe alınma tarihi alanının tanımı (varsayılan erişim)
        }
        System.out.println("class Employee {\n    String  name     ;\n    String  position ;\n    int     salary   ;\n    java.util.Date    hiredDate;\n}");
        System.out.println("// Bu sınıf, çalışan bilgilerini tutmak için alanlar tanımlar.");
        System.out.println();

        System.out.println("// Alan (Field) Bildirim Sözdizimi (Syntax):");
        System.out.println("// [erişim_belirteci] [static] [final] veri_tipi isim [= başlangıç_değeri] ;");
        System.out.println("// Köşeli parantezler [] içindeki kısımlar isteğe bağlıdır. Sadece veri_tipi ve isim zorunludur.");
        System.out.println();

        System.out.println("// Erişim Belirteçlerine (Access Modifiers) Örnek:");
        class Customer { // Müşteri sınıfı tanımı
            private String email;     // private: Sadece bu sınıf içinden erişilebilir
            String position;          // varsayılan (package-private): Aynı paket içinden erişilebilir
            protected String name;    // protected: Aynı paket ve alt sınıflardan erişilebilir
            public String city;      // public: Her yerden erişilebilir
        }
        System.out.println("class Customer {\n    private   String email;\n              String position;   //no modifier = package access modifier\n    protected String name;\n    public    String city;\n}");
        System.out.println("// Bu sınıf, farklı erişim seviyelerine sahip alanları göstermektedir.");
        System.out.println();

        System.out.println("// Statik (Static) ve Statik Olmayan (Non-static) Alanlara Örnek:");
        class CustomerWithStatic { // Statik özellikli müşteri sınıfı tanımı
            static String staticField1; // static: Sınıfa ait, tüm nesneler için tek bir kopya
            String field1;             // non-static: Her nesne için ayrı bir kopya
        }
        System.out.println("class CustomerWithStatic {\n    static String staticField1;\n    String field1;\n}");
        System.out.println("// `staticField1`, sınıfın kendisine aittir ve nesne oluşturmaya gerek olmadan erişilebilir.");
        System.out.println("// `field1` ise her bir CustomerWithStatic nesnesine özgüdür.");
        System.out.println();

        System.out.println("// Final Alanlara (Final Fields) Örnek:");
        class CustomerWithFinal { // Final özellikli müşteri sınıfı tanımı
            final String field1 = "Sabit Değer"; // final: Değeri bir kez atandıktan sonra değiştirilemez
            static final String CONSTANT_1 = "SABİT DEĞER"; // static final: Sınıfa ait sabit değer
        }
        System.out.println("class CustomerWithFinal {\n    final String field1 = \"Sabit Değer\";\n    static final String CONSTANT_1 = \"SABİT DEĞER\";\n}");
        System.out.println("// `field1`'in değeri oluşturulduktan sonra değiştirilemez.");
        System.out.println("// `CONSTANT_1` ise sınıf seviyesinde bir sabittir ve genellikle tüm harflerle yazılır.");
        System.out.println();

        System.out.println("// Alan İsimlendirme (Naming Java Fields) Örneği:");
        // Alan isimleri, değişkenlerle aynı kurallara ve önerilere sahiptir.
        System.out.println("// Örnek bir kullanım:");
        System.out.println("Customer customer = new Customer();\ncustomer.city = \"New York\";\nSystem.out.println(customer.city);");
        System.out.println("// İlk satırda bir Customer nesnesi oluşturulur.");
        System.out.println("// İkinci satırda, nesnenin 'city' alanına \"New York\" değeri atanır.");
        System.out.println("// Üçüncü satırda, bu değer ekrana yazdırılır.");
        System.out.println();

        System.out.println("// Alan Başlangıç Değeri (Initial Field Value) Örneği:");
        class CustomerWithInitialValue { // Başlangıç değerli müşteri sınıfı tanımı
            String customerType = "OnlineMusteri"; // Alan tanımlanırken başlangıç değeri atanır
        }
        System.out.println("class CustomerWithInitialValue {\n    String customerType = \"OnlineMusteri\";\n}");
        System.out.println("// `customerType` alanı, bir nesne oluşturulduğunda otomatik olarak \"OnlineMusteri\" değerine sahip olur.");
        System.out.println();

        // main metodunun sonu
    }
}