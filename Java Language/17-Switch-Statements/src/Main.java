// Main.java
public class Main {
    public static void main(String[] args) {
        // 1. Java switch İfadesi Nedir?
        // switch, bir değişkenin değerine bağlı olarak farklı kod bloklarını çalıştırır.
        // if-else yapılarına alternatif, daha kompakt bir söz dizimi sunar.
        System.out.println("1. Java switch İfadesi Nedir?");
        int amount = 9;
        System.out.println("Miktar: " + amount);
        switch (amount) {
            case 0:
                System.out.println("amount is 0");
                break;
            case 5:
                System.out.println("amount is 5");
                break;
            case 10:
                System.out.println("amount is 10");
                break;
            default:
                System.out.println("amount is something else");
        }

        // 2. if İfadesi ile Karşılaştırma
        // Aynı mantık if-else ile daha uzun yazılır.
        System.out.println("\n2. if İfadesi ile Karşılaştırma Örneği:");
        System.out.println("Miktar: " + amount);
        if (amount == 0) {
            System.out.println("amount is 0");
        } else if (amount == 5) {
            System.out.println("amount is 5");
        } else if (amount == 10) {
            System.out.println("amount is 10");
        } else {
            System.out.println("amount is something else");
        }

        // 3. switch ile Parametre Kullanımı
        // Gerçek uygulamalarda genellikle metod parametreleri ile switch kullanılır.
        System.out.println("\n3. Parametre ile switch Örneği:");
        int size = 2;
        System.out.println("Boyut: " + size);
        switchOnIntegers(size);

        // 4. byte, short, int ile switch
        // switch, byte, short veya int türünde değişkenlerle çalışabilir.
        System.out.println("\n4. byte, short, int ile switch Örneği:");
        byte byteSize = 1;
        short shortSize = 2;
        int intSize = 3;
        System.out.println("byteSize: " + byteSize);
        switchOnIntegers(byteSize);
        System.out.println("shortSize: " + shortSize);
        switchOnIntegers(shortSize);
        System.out.println("intSize: " + intSize);
        switchOnIntegers(intSize);

        // 5. char ile switch
        // char türünde değişkenlerle switch kullanılabilir.
        System.out.println("\n5. char ile switch Örneği:");
        char charSize = 'M';
        System.out.println("charSize: " + charSize);
        switchOnChars(charSize);

        // 6. String ile switch
        // Java 7'den itibaren String ile switch kullanılabilir.
        System.out.println("\n6. String ile switch Örneği:");
        String stringSize = "L";
        System.out.println("stringSize: " + stringSize);
        switchOnStrings(stringSize);

        // 7. enum ile switch
        // enum türleri switch ile sıkça kullanılır, okunabilirliği artırır.
        System.out.println("\n7. enum ile switch Örneği:");
        Size enumSize = Size.MEDIUM;
        System.out.println("enumSize: " + enumSize);
        switchOnEnum(enumSize);

        // 8. Aynı İşlem için Çoklu case İfadeleri
        // Birden fazla case aynı kodu çalıştırabilir (fall-through).
        System.out.println("\n8. Çoklu case İfadeleri Örneği:");
        char key = '\t';
        System.out.println("Karakter: " + (key == '\t' ? "\\t" : key));
        switch (key) {
            case ' ':
            case '\t':
                System.out.println("white space char");
                break;
            default:
                System.out.println("char is something else");
        }

        // 9. Tek case'de Çoklu Değerler (Java 13+)
        // Java 13'ten itibaren bir case birden fazla değer alabilir.
        System.out.println("\n9. Tek case'de Çoklu Değerler Örneği (Java 13+):");
        char key2 = ' ';
        System.out.println("Karakter: " + key2);
        switch (key2) {
            case ' ', '\t':
                System.out.println("white space char");
                break;
            default:
                System.out.println("char is something else");
        }

        // 10. Java switch İfadeleri (Java 12+, Experimental)
        // switch ifadeleri, bir değer döndürür ve -> operatörü kullanır.
        System.out.println("\n10. Java switch Expression Örneği (Java 12+):");
        int digitInDecimal = 12;
        System.out.println("Ondalık sayı: " + digitInDecimal);
        char digitInHex = switch (digitInDecimal) {
            case 0 -> '0';
            case 1 -> '1';
            case 2 -> '2';
            case 3 -> '3';
            case 4 -> '4';
            case 5 -> '5';
            case 6 -> '6';
            case 7 -> '7';
            case 8 -> '8';
            case 9 -> '9';
            case 10 -> 'A';
            case 11 -> 'B';
            case 12 -> 'C';
            case 13 -> 'D';
            case 14 -> 'E';
            case 15 -> 'F';
            default -> '?';
        };
        System.out.println("Onaltılık karakter: " + digitInHex);

        // 11. Java switch yield Talimatı (Java 13+)
        // yield, switch ifadesinden değer döndürmek için kullanılır.
        System.out.println("\n11. Java switch yield Örneği (Java 13+):");
        String token = "abc";
        System.out.println("Token: " + token);
        int tokenType = switch (token) {
            case "123":
                yield 0;
            case "abc":
                yield 1;
            default:
                yield -1;
        };
        System.out.println("Token tipi: " + tokenType);

        // 12. switch Expression Kullanım Senaryoları
        // Değer dönüşümü, token çözümleme gibi durumlarda kullanışlıdır.
        System.out.println("\n12. switch Expression Kullanım Senaryosu Örneği:");
        int number = 3;
        System.out.println("Sayı: " + number);
        String description = switch (number) {
            case 1 -> "Bir";
            case 2 -> "İki";
            case 3 -> "Üç";
            default -> "Bilinmeyen sayı";
        };
        System.out.println("Açıklama: " + description);

        // 13. Yaygın Hatalar
        // - break unutmak: İstenmeyen fall-through'a neden olabilir.
        // - Yanlış veri tipi: switch double veya float desteklemez.
        System.out.println("\n13. Yaygın Hatalar Örneği:");
        int testValue = 1;
        System.out.println("Test değeri: " + testValue);
        switch (testValue) {
            case 1:
                System.out.println("Doğru kullanım: Değer 1!");
                break;
            default:
                System.out.println("Varsayılan durum");
        }
        // Hata örneği (yorum): switch (doubleValue) // double switch ile kullanılamaz
    }

    // Yardımcı Metod: byte, short, int için switch
    private static void switchOnIntegers(int size) {
        switch (size) {
            case 0:
                System.out.println("size is small");
                break;
            case 1:
                System.out.println("size is medium");
                break;
            case 2:
                System.out.println("size is large");
                break;
            case 3:
                System.out.println("size is X-large");
                break;
            default:
                System.out.println("size is not S,M,L or XL: " + size);
        }
    }

    // Yardımcı Metod: char için switch
    private static void switchOnChars(char size) {
        switch (size) {
            case 'S':
                System.out.println("size is small");
                break;
            case 'M':
                System.out.println("size is medium");
                break;
            case 'L':
                System.out.println("size is large");
                break;
            case 'X':
                System.out.println("size is X-large");
                break;
            default:
                System.out.println("size is not S,M,L or XL: " + size);
        }
    }

    // Yardımcı Metod: String için switch
    private static void switchOnStrings(String size) {
        switch (size) {
            case "S":
                System.out.println("size is small");
                break;
            case "M":
                System.out.println("size is medium");
                break;
            case "L":
                System.out.println("size is large");
                break;
            case "XL":
                System.out.println("size is X-large");
                break;
            default:
                System.out.println("size is not S,M,L or XL: " + size);
        }
    }

    // Yardımcı Enum ve Metod: enum için switch
    private enum Size {
        SMALL, MEDIUM, LARGE, X_LARGE
    }

    private static void switchOnEnum(Size size) {
        switch (size) {
            case SMALL:
                System.out.println("size is small");
                break;
            case MEDIUM:
                System.out.println("size is medium");
                break;
            case LARGE:
                System.out.println("size is large");
                break;
            case X_LARGE:
                System.out.println("size is X-large");
                break;
        }
    }
}