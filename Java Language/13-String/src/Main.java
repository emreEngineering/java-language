public class Main {
    public static void main(String[] args) {
        //NOTE: 1. Java String Nedir?
        //String, karakter dizilerini temsil eden bir nesnedir. java.lang.String sınıfı tarafından tanımlanır.
        String str = "Merhaba Dünya";
        System.out.println("1. String Nedir Örneği: " + str);

        //NOTE: 2. String Oluşturma
        //String literal ile oluşturulur (String Pool'da saklanır).
        String strLiteral = "Merhaba";
        // new operatörü ile yeni bir String nesnesi oluşturulur (String Pool dışında).
        String strNew = new String("Merhaba");
        System.out.println("2. String Oluşturma Örneği:");
        System.out.println("Literal: " + strLiteral);
        System.out.println("New: " + strNew);
        System.out.println("Aynı mı? (==): " + (strLiteral == strNew)); // false, farklı nesneler
        System.out.println("Eşit mi? (equals): " + strLiteral.equals(strNew)); // true, aynı içerik

        //NOTE: 3. String'lerin Değişmezliği (Immutability)
        //String'ler değiştirilemez; yeni işlemler yeni nesneler oluşturur.
        String immutableStr = "Merhaba";
        immutableStr = immutableStr.concat(" Dünya"); // Yeni bir String nesnesi
        System.out.println("3. Değişmezlik Örneği: " + immutableStr);

        //NOTE: 4. Kaçış Karakterleri (Escape Characters)
        //Özel karakterler için \ kullanılır: \n (yeni satır), \t (sekme), \" (çift tırnak), \\ (ters eğik çizgi).
        String escapeStr = "Merhaba\nDünya\t\"Java\"\\";
        System.out.println("4. Kaçış Karakterleri Örneği:");
        System.out.println(escapeStr);

        //NOTE:5. translateEscapes() Metodu (Java 15+)
        //Kaçış karakterlerini yorumlar.
        String rawStr = "Merhaba \\n Dünya";
        System.out.println("5. translateEscapes Örneği:");
        System.out.println("Ham: " + rawStr);
        System.out.println("Yorumlanmış: " + rawStr.translateEscapes());

        //NOTE: 6. Kompakt String'ler (Compact Strings, Java 9+)
        //ISO-8859-1/Latin-1 karakterleri için bellek optimizasyonu (1 byte/karakter).
        // Bu özellik otomatik olarak çalışır, kodda açık bir örnek gerekmez.
        String compactStr = "Merhaba"; // Latin-1 karakterleri, kompakt olarak saklanır.
        System.out.println("6. Kompakt String Örneği: " + compactStr + " (otomatik optimize edilir)");

        //NOTE: 7. Text Block (Java 13+)
        //Çok satırlı String'ler için """ kullanılır, kaçış karakterine gerek yoktur.
        String textBlock = """
            Merhaba
            Dünya
            "Java" ile programlama
            """;
        System.out.println("7. Text Block Örneği:");
        System.out.println(textBlock);

        //NOTE: 8. String Singleton/Constant Özelliği
        //Aynı String literal'ları String Pool'da tek bir nesne olarak saklanır.
        String str1 = "Merhaba";
        String str2 = "Merhaba";
        System.out.println("8. Singleton Örneği:");
        System.out.println("str1 == str2: " + (str1 == str2)); // true, aynı nesne

        //NOTE: 9. Yaygın String Metotları
        //String sınıfının sık kullanılan metotları.
        String methodStr = " Merhaba Dünya ";
        System.out.println("9. String Metotları Örnekleri:");
        System.out.println("length(): " + methodStr.length()); // 15
        System.out.println("trim(): " + methodStr.trim()); // Baştaki ve sondaki boşlukları kaldırır
        System.out.println("toUpperCase(): " + methodStr.toUpperCase()); // Büyük harfe çevirir
        System.out.println("toLowerCase(): " + methodStr.toLowerCase()); // Küçük harfe çevirir
        System.out.println("substring(1, 8): " + methodStr.substring(1, 8)); // Belirtilen aralığı alır
        System.out.println("replace('Dünya', 'Java'): " + methodStr.replace("Dünya", "Java")); // Değiştirir
        System.out.println("concat('!'): " + methodStr.concat("!")); // Birleştirir
    }
}