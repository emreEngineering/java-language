// Main.java
public class Main {
    public static void main(String[] args) {
        // 1. Java if İfadesi Nedir?
        // if ifadesi, belirli bir koşul doğruysa (true) bir kod bloğunu çalıştırır.
        // Koşul parantez () içinde belirtilir ve kod bloğu süslü parantezler {} ile çevrilir.
        System.out.println("1. Java if İfadesi Nedir?");
        int number = 10;
        System.out.println("Sayı: " + number);
        if (number > 0) {
            System.out.println("if örneği: Sayı pozitif!");
        }

        // 2. if Yapısı
        // Söz dizimi: if (koşul) { kod bloğu }
        // Koşul true ise kod bloğu çalışır, false ise atlanır.
        System.out.println("\n2. if Yapısı Örneği:");
        int age = 18;
        System.out.println("Yaş: " + age);
        if (age >= 18) {
            System.out.println("Yetişkin: Oy kullanabilir!");
        }

        // 3. else Yapısı
        // else, if koşulu false olduğunda çalışacak alternatif kod bloğunu tanımlar.
        // Söz dizimi: if (koşul) { kod bloğu } else { alternatif kod bloğu }
        System.out.println("\n3. else Yapısı Örneği:");
        int temperature = 15;
        System.out.println("Sıcaklık: " + temperature);
        if (temperature > 20) {
            System.out.println("Hava sıcak!");
        } else {
            System.out.println("Hava serin!");
        }

        // 4. else if Yapısı
        // Birden fazla koşulu test etmek için kullanılır.
        // İlk true koşulun bloğu çalışır, geri kalanlar atlanır.
        // Söz dizimi: if (koşul1) { kod1 } else if (koşul2) { kod2 } else { kod3 }
        System.out.println("\n4. else if Yapısı Örneği:");
        int score = 85;
        System.out.println("Puan: " + score);
        if (score >= 90) {
            System.out.println("Not: A");
        } else if (score >= 80) {
            System.out.println("Not: B");
        } else if (score >= 70) {
            System.out.println("Not: C");
        } else if (score >= 60) {
            System.out.println("Not: D");
        } else {
            System.out.println("Not: F");
        }

        // 5. İç İçe if İfadeleri
        // if ifadeleri başka if ifadeleri içinde kullanılabilir.
        System.out.println("\n5. İç İçe if İfadeleri Örneği:");
        int x = 25;
        System.out.println("x: " + x);
        if (x > 0) {
            if (x % 2 == 0) {
                System.out.println("x pozitif ve çift bir sayı!");
            } else {
                System.out.println("x pozitif ama tek bir sayı!");
            }
        } else {
            System.out.println("x negatif veya sıfır!");
        }

        // 6. Mantıksal Operatörlerle if
        // && (ve), || (veya), ! (değil) gibi mantıksal operatörler kullanılabilir.
        System.out.println("\n6. Mantıksal Operatörlerle if Örneği:");
        int hour = 14;
        boolean isWeekend = true;
        System.out.println("Saat: " + hour + ", Hafta sonu mu: " + isWeekend);
        if (hour < 18 && isWeekend) {
            System.out.println("Hafta sonu ve saat 18:00'den önce, dışarı çıkılabilir!");
        } else {
            System.out.println("Hafta sonu değil veya saat geç!");
        }

        // 7. Tek Satırlık if İfadeleri
        // Kod bloğu tek satır ise süslü parantezler {} isteğe bağlıdır.
        System.out.println("\n7. Tek Satırlık if İfadeleri Örneği:");
        int value = 5;
        System.out.println("Değer: " + value);
        if (value > 0) System.out.println("Değer pozitif!"); // Süslü parantez olmadan
        else System.out.println("Değer pozitif değil!");

        // 8. Yaygın Hatalar
        // - Yanlış karşılaştırma operatörleri: == yerine = kullanmak (atama hatası)
        // - Süslü parantez eksikliği: Çok satırlı kodlarda hata yaratabilir
        System.out.println("\n8. Yaygın Hatalar Örneği:");
        boolean flag = true;
        // Doğru kullanım
        if (flag == true) {
            System.out.println("Flag true!");
        }
        // Hata örneği (yorum olarak): if (flag = true) // Derleme hatası değil ama yanlış atama yapar
    }
}