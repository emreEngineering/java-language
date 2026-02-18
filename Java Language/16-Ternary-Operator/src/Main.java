// Main.java
public class Main {
    public static void main(String[] args) {
        // 1. Java Üçlü (Ternary) Operatör Nedir?
        // Üçlü operatör, bir koşula bağlı olarak iki farklı değerden birini seçer.
        // Söz dizimi: koşul ? ifade1 : ifade2
        // Koşul true ise ifade1, false ise ifade2 döner.
        System.out.println("1. Java Üçlü Operatör Nedir?");
        int number = 10;
        String result = number > 0 ? "Pozitif" : "Negatif veya sıfır";
        System.out.println("Sayı: " + number + ", Sonuç: " + result);

        // 2. Üçlü Operatörün Kullanımı
        // Üçlü operatör, if-else yapısının kısa bir alternatifidir.
        // Tek satırlık koşullu ifadeler için uygundur.
        System.out.println("\n2. Üçlü Operatör Kullanımı Örneği:");
        int age = 20;
        String status = age >= 18 ? "Yetişkin" : "Reşit değil";
        System.out.println("Yaş: " + age + ", Durum: " + status);

        // 3. Üçlü Operatör ile Değişkene Değer Atama
        // Üçlü operatör, bir değişkene doğrudan değer atamak için kullanılabilir.
        System.out.println("\n3. Değişkene Değer Atama Örneği:");
        int score = 85;
        char grade = score >= 60 ? 'P' : 'F'; // Geçti (Pass) veya Kaldı (Fail)
        System.out.println("Puan: " + score + ", Not: " + grade);

        // 4. Üçlü Operatör ile Matematiksel İşlemler
        // Sayısal değerlerle de kullanılabilir.
        System.out.println("\n4. Matematiksel İşlemler Örneği:");
        int x = 7;
        int absoluteValue = x >= 0 ? x : -x; // Mutlak değer
        System.out.println("x: " + x + ", Mutlak Değer: " + absoluteValue);

        // 5. İç İçe Üçlü Operatör
        // Birden fazla koşul için iç içe üçlü operatör kullanılabilir (okunabilirlik için dikkatli olun).
        System.out.println("\n5. İç İçe Üçlü Operatör Örneği:");
        int testScore = 75;
        String letterGrade = testScore >= 90 ? "A" :
                testScore >= 80 ? "B" :
                        testScore >= 70 ? "C" :
                                testScore >= 60 ? "D" : "F";
        System.out.println("Test Puanı: " + testScore + ", Harf Notu: " + letterGrade);

        // 6. Üçlü Operatör ile if-else Karşılaştırması
        // Aynı mantığı if-else ile yazmak daha uzun olabilir.
        System.out.println("\n6. Üçlü Operatör vs if-else Örneği:");
        boolean isWeekend = true;
        // Üçlü operatör ile
        String activity = isWeekend ? "Dinlen" : "Çalış";
        System.out.println("Hafta sonu mu: " + isWeekend + ", Aktivite: " + activity);
        // Aynı mantık if-else ile
        String activityIfElse;
        if (isWeekend) {
            activityIfElse = "Dinlen";
        } else {
            activityIfElse = "Çalış";
        }
        System.out.println("if-else ile: Hafta sonu mu: " + isWeekend + ", Aktivite: " + activityIfElse);

        // 7. Yaygın Hatalar ve Dikkat Edilmesi Gerekenler
        // - İfadeler aynı türde olmalı (örn. String ve int karışmaz).
        // - İç içe kullanımda okunabilirlik azalabilir, dikkatli olun.
        System.out.println("\n7. Yaygın Hatalar Örneği:");
        int value = 0;
        // Doğru kullanım
        String message = value == 0 ? "Sıfır" : "Sıfır değil";
        System.out.println("Değer: " + value + ", Mesaj: " + message);
        // Hata örneği (yorum olarak): String invalid = value > 0 ? "Pozitif" : 42; // Tür uyuşmazlığı
    }
}