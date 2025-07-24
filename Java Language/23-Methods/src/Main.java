// main.java

public class Main {

    // Method Parameters
    // Metotlara dışarıdan veri iletmemizi sağlar
    public void printText(String text) {
        System.out.println(text);
    }

    // Birden fazla parametre kullanımı
    public void printTwoTexts(String text1, String text2) {
        System.out.print(text1);
        System.out.print(text2);
    }

    // Parameters vs. Variables
    // Parametreler de değişken gibidir, değeri okunabilir ve değiştirilebilir
    public void modifyText(String text1, String text2) {
        text1 = "Yeni Değer 1";
        text2 = "Yeni Değer 2";
        System.out.println(text1 + ", " + text2);
    }

    // Final Parameters
    // Final parametreler yeniden atanamaz
    public void printFinalTexts(final String text1, final String text2) {
        System.out.println(text1);
        System.out.println(text2);
        // text1 = "hatalı"; // Bu satır hata verir çünkü final
    }

    // Local Variables
    // Metot içerisinde tanımlanırlar ve sadece o metotta geçerlidir
    public void sumLocalVariables() {
        int a = 5;
        int b = 10;
        System.out.println(a + b);
    }

    // Method Return Types
    // Metotların geriye değer döndürmesini sağlar
    public int sum(int x, int y) {
        return x + y;
    }

    public String concat(String a, String b) {
        return a + b;
    }

    // Multiple Return Statements
    public String conditionalConcat(String s1, String s2, boolean reverse) {
        if (reverse) {
            return s2 + s1;
        }
        return s1 + s2;
    }

    // Access Modifiers (Erişim Belirleyiciler)
    // public, private, protected (detayları başka dosyada)
    public void publicMethod() {
        System.out.println("Erişim tipi: public");
    }

    // Exception Declarations
    public String safeConcat(String s1, String s2) throws Exception {
        if (s1 == null) throw new Exception("s1 null");
        if (s2 == null) throw new Exception("s2 null");
        return s1 + s2;
    }

    // Calling Methods (Metot Çağırma)
    public void callSum() {
        int result = sum(3, 7);
        System.out.println("Toplam: " + result);
    }

    public static void main(String[] args) {
        Main m = new Main();

        m.printText("Merhaba!");
        m.printTwoTexts("Hello", " World");
        m.modifyText("Deneme1", "Deneme2");
        m.printFinalTexts("A", "B");
        m.sumLocalVariables();
        System.out.println(m.sum(4, 6));
        System.out.println(m.concat("Emre", "Karaman"));
        System.out.println(m.conditionalConcat("A", "B", true));
        m.publicMethod();

        try {
            System.out.println(m.safeConcat("Open", "AI"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        m.callSum();
    }
}
