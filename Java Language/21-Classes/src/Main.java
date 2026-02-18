// main.java dosyası

public class Main { // Ana sınıf tanımı

    public static void main(String[] args) { // Java uygulamasının başlangıç metodu

        // Temel Sınıf Tanımı Örneği
        // public class MyClass { }
        // Bu sadece boş bir sınıf tanımıdır. Herhangi bir özellik veya davranış içermez.

        System.out.println("// Alanlara (Fields) Sahip Sınıf Örneği:");
        // Alanlara (Fields) Sahip Sınıf Örneği
        class CarWithFields { // Araba sınıfı tanımı
            public String brand = null; // Marka bilgisini tutan public String değişken
            public String model = null; // Model bilgisini tutan public String değişken
            public String color = null; // Renk bilgisini tutan public String değişken
        }
        System.out.println("class CarWithFields {\n    public String brand = null;\n    public String model = null;\n    public String color = null;\n}");
        System.out.println("// Bu sınıf sadece araba özelliklerini tanımlayan alanlara sahiptir.");
        System.out.println();

        System.out.println("// Constructor'a Sahip Sınıf Örneği:");
        // Constructor'a Sahip Sınıf Örneği
        class CarWithConstructors { // Araba sınıfı tanımı
            public String brand = null; // Marka bilgisini tutan public String değişken
            public String model = null; // Model bilgisini tutan public String değişken
            public String color = null; // Renk bilgisini tutan public String değişken

            public CarWithConstructors() { // Parametresiz constructor
                System.out.println("    // Parametresiz CarWithConstructors constructor'ı çağrıldı.");
            }

            public CarWithConstructors(String theBrand, String theModel, String theColor) { // Üç parametreli constructor
                this.brand = theBrand; // Parametre ile gelen marka değerini sınıfın marka alanına atar
                this.model = theModel; // Parametre ile gelen model değerini sınıfın model alanına atar
                this.color = theColor; // Parametre ile gelen renk değerini sınıfın renk alanına atar
                System.out.println("    // Parametreli CarWithConstructors constructor'ı çağrıldı: " + brand + " " + model + " " + color);
            }
        }
        System.out.println("class CarWithConstructors {\n    public String brand = null;\n    public String model = null;\n    public String color = null;\n\n    public CarWithConstructors() {\n        System.out.println(\"    // Parametresiz CarWithConstructors constructor'ı çağrıldı.\");\n    }\n\n    public CarWithConstructors(String theBrand, String theModel, String theColor) {\n        this.brand = theBrand;\n        this.model = theModel;\n        this.color = theColor;\n        System.out.println(\"    // Parametreli CarWithConstructors constructor'ı çağrıldı: \" + brand + \" \" + model + \" \" + color);\n    }\n}");
        System.out.println("// Bu sınıf, nesne oluşturulurken çağrılan constructor'lara sahiptir.");
        System.out.println();

        System.out.println("// Metotlara (Methods) Sahip Sınıf Örneği:");
        // Metotlara (Methods) Sahip Sınıf Örneği
        class CarWithMethods { // Araba sınıfı tanımı
            public String brand = null; // Marka bilgisini tutan public String değişken
            public String model = null; // Model bilgisini tutan public String değişken
            public String color = null; // Renk bilgisini tutan public String değişken

            public void setColor(String newColor) { // public erişim belirleyicili, geri dönüş tipi olmayan (void) setColor metodu
                this.color = newColor; // Metoda gelen newColor parametresini sınıfın color alanına atar
                System.out.println("    // setColor metodu çağrıldı ve renk " + color + " olarak değiştirildi.");
            }
        }
        System.out.println("class CarWithMethods {\n    public String brand = null;\n    public String model = null;\n    public String color = null;\n\n    public void setColor(String newColor) {\n        this.color = newColor;\n        System.out.println(\"    // setColor metodu çağrıldı ve renk \" + color + \" olarak değiştirildi.\");\n    }\n}");
        System.out.println("// Bu sınıf, nesnelerin üzerinde işlem yapabilen metotlara sahiptir.");
        System.out.println();

        System.out.println("// İç İçe Sınıfa (Nested Class) Sahip Sınıf Örneği:");
        // İç İçe Sınıfa (Nested Class) Sahip Sınıf Örneği
        class OuterClass { // Dış sınıf tanımı
            public static class NestedClass { // Statik iç sınıf tanımı
                public void nestedMethod() {
                    System.out.println("        // İç sınıftaki nestedMethod çağrıldı.");
                }
            }
        }
        System.out.println("class OuterClass {\n    public static class NestedClass {\n        public void nestedMethod() {\n            System.out.println(\"        // İç sınıftaki nestedMethod çağrıldı.\");\n        }\n    }\n}");
        System.out.println("// Bu sınıf, başka bir sınıfın içinde tanımlanmış bir iç sınıfa sahiptir.");
        System.out.println();

        // Örneklerin kullanımı (isteğe bağlı)
        System.out.println("// Örneklerin Kullanımı:");
        CarWithConstructors myCar1 = new CarWithConstructors(); // Parametresiz constructor ile CarWithConstructors nesnesi oluşturma
        CarWithConstructors myCar2 = new CarWithConstructors("Toyota", "Corolla", "Beyaz"); // Parametreli constructor ile CarWithConstructors nesnesi oluşturma

        CarWithMethods myCar3 = new CarWithMethods(); // CarWithMethods nesnesi oluşturma
        myCar3.setColor("Kırmızı"); // myCar3 nesnesinin setColor metodunu çağırma

        OuterClass.NestedClass nestedObject = new OuterClass.NestedClass(); // İç sınıftan nesne oluşturma
        nestedObject.nestedMethod(); // İç sınıfın metodunu çağırma
    }
}