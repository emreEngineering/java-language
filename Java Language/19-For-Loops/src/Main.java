// Main.java
public class Main {
    public static void main(String[] args) {
        // 1. Java for Döngüsü Nedir?
        // for döngüsü, bir koşul doğru olduğu sürece bir kod bloğunu tekrarlar.
        // Söz dizimi: for (başlatıcı; koşul; sonrası işlem) { kod bloğu }
        System.out.println("1. Java for Döngüsü Nedir?");
        for (int i = 0; i < 5; i++) {
            System.out.println("i: " + i);
        }

        // 2. Döngü Başlatıcı, Koşul ve Sonrası İşlem
        // for döngüsü üç ifadeden oluşur: başlatıcı, koşul, sonrası işlem.
        System.out.println("\n2. Döngü Başlatıcı, Koşul ve Sonrası İşlem Örneği:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Döngüde i: " + i);
        }

        // 3. Döngü Başlatıcı (Loop Initializer)
        // Sadece döngü başlangıcında bir kez çalışır, genellikle sayaç değişkeni tanımlanır.
        System.out.println("\n3. Döngü Başlatıcı Örneği:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Başlatıcı ile i: " + i);
        }
        // Başlatıcı olmadan örnek
        MyLoop loop = new MyLoop(3);
        System.out.println("Başlatıcı olmadan:");
        for (; loop.loopAgain(); loop.iterationDone()) {
            System.out.println("Döngü çalışıyor, durum: " + loop.getCounter());
        }
        // Çoklu değişken başlatıcı
        System.out.println("Çoklu değişken başlatıcı:");
        for (int i = 0, n = 4; i < n; i++) {
            System.out.println("i: " + i + ", n: " + n);
        }

        // 4. Koşul (Condition)
        // Her döngü başında değerlendirilir, true ise döngü çalışır, false ise durur.
        System.out.println("\n4. Koşul Örneği:");
        for (int i = 0; i < 4; i++) {
            System.out.println("Koşul i < 4, i: " + i);
        }

        // 5. Sonrası İşlem (Post Iteration Operation)
        // Her döngü sonunda çalışır, genellikle sayaç güncellenir.
        System.out.println("\n5. Sonrası İşlem Örneği:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Sonrası işlem ile i: " + i);
        }
        // Sonrası işlem olmadan örnek
        System.out.println("Sonrası işlem olmadan:");
        loop = new MyLoop(3);
        for (; loop.loopAgain(); ) {
            System.out.println("Döngü çalışıyor, durum: " + loop.getCounter());
            loop.iterationDone();
        }

        // 6. Java for-each Döngüsü
        // Java 5 ile tanıtılan for-each, bir dizi veya koleksiyon üzerinde döner.
        System.out.println("\n6. for-each Döngüsü Örneği:");
        String[] strings = {"one", "two", "three"};
        System.out.print("strings dizisi: ");
        for (String aString : strings) {
            System.out.print(aString + " ");
        }
        System.out.println();

        // 7. continue Komutu
        // Döngünün mevcut iterasyonunu atlar ve bir sonraki iterasyona geçer.
        System.out.println("\n7. continue Komutu Örneği:");
        String[] names = {"John", "Jack", "Abraham", "Jennifer", "Ann"};
        int wordsStartingWithJ = 0;
        System.out.print("İsimler: ");
        for (int i = 0; i < names.length; i++) {
            if (!names[i].toLowerCase().startsWith("j")) {
                continue;
            }
            wordsStartingWithJ++;
            System.out.print(names[i] + " ");
        }
        System.out.println("\nJ ile başlayan kelime sayısı: " + wordsStartingWithJ);

        // 8. for-each ile continue
        System.out.println("\n8. for-each ile continue Örneği:");
        wordsStartingWithJ = 0;
        System.out.print("İsimler: ");
        for (String name : names) {
            if (!name.toLowerCase().startsWith("j")) {
                continue;
            }
            wordsStartingWithJ++;
            System.out.print(name + " ");
        }
        System.out.println("\nJ ile başlayan kelime sayısı: " + wordsStartingWithJ);

        // 9. break Komutu
        // Döngüden tamamen çıkar, koşul ne olursa olsun döngü durur.
        System.out.println("\n9. break Komutu Örneği:");
        wordsStartingWithJ = 0;
        System.out.print("İsimler: ");
        for (int i = 0; i < names.length; i++) {
            if (names[i].toLowerCase().startsWith("j")) {
                wordsStartingWithJ++;
                System.out.print(names[i] + " ");
            }
            if (wordsStartingWithJ >= 3) {
                break;
            }
        }
        System.out.println("\nJ ile başlayan kelime sayısı (3'te dur): " + wordsStartingWithJ);

        // 10. for-each ile break
        System.out.println("\n10. for-each ile break Örneği:");
        wordsStartingWithJ = 0;
        System.out.print("İsimler: ");
        for (String name : names) {
            if (name.toLowerCase().startsWith("j")) {
                wordsStartingWithJ++;
                System.out.print(name + " ");
            }
            if (wordsStartingWithJ >= 3) {
                break;
            }
        }
        System.out.println("\nJ ile başlayan kelime sayısı (3'te dur): " + wordsStartingWithJ);

        // 11. Değişken Görünürlüğü
        // for döngüsünde tanımlanan değişkenler sadece döngü gövdesinde görünür.
        System.out.println("\n11. Değişken Görünürlüğü Örneği:");
        for (int i = 0; i < 2; i++) {
            String iAsNo = String.valueOf(i);
            System.out.println("Döngü içinde iAsNo: " + iAsNo);
        }
        // Hata örneği (yorum): System.out.println(i); // i döngü dışında görünmez
        // Hata örneği (yorum): System.out.println(iAsNo); // iAsNo döngü dışında görünmez

        // 12. for-each ile Değişken Görünürlüğü
        System.out.println("\n12. for-each ile Değişken Görünürlüğü Örneği:");
        for (String aString : strings) {
            System.out.println("Döngü içinde aString: " + aString);
        }
        // Hata örneği (yorum): System.out.println(aString); // aString döngü dışında görünmez

        // 13. Yaygın Hatalar
        // - Süslü parantez unutmak: Sadece bir satır döngü içinde çalışır.
        // - Yanlış başlatıcı veya koşul: Sonsuz döngüye neden olabilir.
        System.out.println("\n13. Yaygın Hatalar Örneği:");
        for (int i = 0; i < 2; i++) // Doğru kullanım
            System.out.println("Tek satır, süslü parantezsiz: " + i);
        System.out.println("Döngü bitti");
        // Hata örneği (yorum): for (int i = 0; i < 2; i++) System.out.println(i); System.out.println("Hata"); // İkinci satır döngüde sanılabilir
    }
}

// Yardımcı sınıf: Başlatıcı ve sonrası işlem olmadan döngü örneği için
class MyLoop {
    private int counter;
    private int max;

    public MyLoop(int max) {
        this.counter = 0;
        this.max = max;
    }

    public boolean loopAgain() {
        return counter < max;
    }

    public void iterationDone() {
        counter++;
    }

    public int getCounter() {
        return counter;
    }
}