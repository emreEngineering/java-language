// Main.java
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        // 1. Java while Döngüsü Nedir?
        // while döngüsü, bir koşul doğru olduğu sürece bir kod bloğunu tekrarlar.
        // İki varyasyon: standart while ve do-while.
        System.out.println("1. Java while Döngüsü Nedir?");
        int counter = 0;
        System.out.println("Standart while döngüsü:");
        while (counter < 5) {
            System.out.println("counter: " + counter);
            counter++;
        }

        // 2. Standart while Döngüsü
        // Koşul true olduğu sürece döngü gövdesi çalışır.
        System.out.println("\n2. Standart while Döngüsü Örneği:");
        boolean shouldContinue = true;
        System.out.println("Rastgele sayı ile while:");
        while (shouldContinue) {
            System.out.println("running");
            double random = Math.random() * 10D;
            System.out.println("Rastgele sayı: " + random);
            if (random <= 5) {
                shouldContinue = false;
            }
        }

        // 3. Süslü Parantez Olmadan while
        // Süslü parantez olmadan sadece ilk satır döngü gövdesine dahildir.
        System.out.println("\n3. Süslü Parantez Olmadan while Örneği:");
        counter = 0;
        while (counter < 3)
            System.out.println("Tek satır: counter: " + counter++); // Döngüde
        System.out.println("Döngü sonrası satır"); // Döngü dışında

        // 4. Java do-while Döngüsü
        // do-while, gövdeyi en az bir kez çalıştırır, sonra koşulu kontrol eder.
        System.out.println("\n4. do-while Döngüsü Örneği:");
        try (InputStream inputStream = new FileInputStream("data/text.xml")) {
            int data;
            System.out.println("Dosya okuma simülasyonu:");
            do {
                data = inputStream.read();
                System.out.println("Okunan veri: " + data);
            } while (data != -1);
        } catch (IOException e) {
            System.out.println("Dosya bulunamadı, simülasyon için -1 ile çıkış:");
            System.out.println("Okunan veri: -1");
        }

        // 5. continue Komutu
        // Mevcut iterasyonu atlar ve bir sonraki iterasyona geçer.
        System.out.println("\n5. continue Komutu Örneği:");
        String[] strings = {"John", "Jack", "Abraham", "Jennifer", "Ann"};
        int wordsStartingWithJ = 0;
        int i = 0;
        System.out.print("İsimler: ");
        while (i < strings.length) {
            if (!strings[i].toLowerCase().startsWith("j")) {
                i++;
                continue;
            }
            wordsStartingWithJ++;
            System.out.print(strings[i] + " ");
            i++;
        }
        System.out.println("\nJ ile başlayan kelime sayısı: " + wordsStartingWithJ);

        // 6. do-while ile continue
        System.out.println("\n6. do-while ile continue Örneği:");
        wordsStartingWithJ = 0;
        i = 0;
        System.out.print("İsimler: ");
        do {
            if (!strings[i].toLowerCase().startsWith("j")) {
                i++;
                continue;
            }
            wordsStartingWithJ++;
            System.out.print(strings[i] + " ");
            i++;
        } while (i < strings.length);
        System.out.println("\nJ ile başlayan kelime sayısı: " + wordsStartingWithJ);

        // 7. break Komutu
        // Döngüden tamamen çıkar, koşul ne olursa olsun döngü durur.
        System.out.println("\n7. break Komutu Örneği:");
        wordsStartingWithJ = 0;
        i = 0;
        System.out.print("İsimler: ");
        while (i < strings.length) {
            if (strings[i].toLowerCase().startsWith("j")) {
                wordsStartingWithJ++;
                System.out.print(strings[i] + " ");
            }
            if (wordsStartingWithJ >= 3) {
                break;
            }
            i++;
        }
        System.out.println("\nJ ile başlayan kelime sayısı (3'te dur): " + wordsStartingWithJ);

        // 8. do-while ile break
        System.out.println("\n8. do-while ile break Örneği:");
        wordsStartingWithJ = 0;
        i = 0;
        System.out.print("İsimler: ");
        do {
            if (strings[i].toLowerCase().startsWith("j")) {
                wordsStartingWithJ++;
                System.out.print(strings[i] + " ");
            }
            if (wordsStartingWithJ >= 3) {
                break;
            }
            i++;
        } while (i < strings.length);
        System.out.println("\nJ ile başlayan kelime sayısı (3'te dur): " + wordsStartingWithJ);

        // 9. Değişken Görünürlüğü
        // while döngüsü içinde tanımlanan değişkenler sadece döngü gövdesinde görünür.
        System.out.println("\n9. Değişken Görünürlüğü Örneği:");
        int count = 0;
        while (count < 2) {
            String name = "Çalışan-" + count;
            System.out.println("Döngü içinde name: " + name);
            count++;
        }
        // Hata örneği (yorum): System.out.println(name); // name döngü dışında görünmez
        System.out.println("Döngü dışında count: " + count); // count görünür

        // 10. Yaygın Hatalar
        // - Süslü parantez unutmak: Sadece bir satır döngüde çalışır.
        // - Yanlış koşul: Sonsuz döngüye neden olabilir.
        System.out.println("\n10. Yaygın Hatalar Örneği:");
        count = 0;
        while (count < 2) // Doğru kullanım
            System.out.println("Tek satır: count: " + count++); // Döngüde
        System.out.println("Döngü sonrası satır"); // Döngü dışında
        // Hata örneği (yorum): while (true) System.out.println("Sonsuz döngü!"); // Sonsuz döngü
    }
}