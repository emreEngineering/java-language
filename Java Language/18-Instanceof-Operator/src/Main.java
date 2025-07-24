// Main.java
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        // 1. Java instanceof Operatörü Nedir?  
        // instanceof, bir nesnenin belirli bir sınıf, üst sınıf veya arayüzün örneği olup olmadığını kontrol eder.
        // Nesne türünü belirleyip uygun türe dönüştürmek için kullanılır (type casting).
        System.out.println("1. Java instanceof Operatörü Nedir?");
        Map<Object, Object> map = new HashMap<>();
        boolean mapIsObject = map instanceof Object;
        System.out.println("map instanceof Object: " + mapIsObject); // true

        // 2. Aynı Sınıfla instanceof
        // Nesne, tam olarak belirtilen sınıfın bir örneği ise true döner.
        System.out.println("\n2. Aynı Sınıfla instanceof Örneği:");
        HashMap<Object, Object> hashMap = new HashMap<>();
        boolean isHashMap = hashMap instanceof HashMap;
        System.out.println("hashMap instanceof HashMap: " + isHashMap); // true
        // Değişken türü Map olsa bile nesnenin gerçek türü HashMap olduğu için true döner
        Map<Object, Object> mapVar = new HashMap<>();
        boolean mapVarIsHashMap = mapVar instanceof HashMap;
        System.out.println("mapVar instanceof HashMap: " + mapVarIsHashMap); // true

        // 3. Üst Sınıfla instanceof
        // Nesne, belirtilen sınıfın bir üst sınıfının örneği ise true döner.
        System.out.println("\n3. Üst Sınıfla instanceof Örneği:");
        boolean hashMapIsObject = hashMap instanceof Object;
        System.out.println("hashMap instanceof Object: " + hashMapIsObject); // true (HashMap, Object'in alt sınıfıdır)

        // 4. Arayüz ile instanceof
        // Nesne, belirtilen arayüzü uygulayan bir sınıfın örneği ise true döner.
        System.out.println("\n4. Arayüz ile instanceof Örneği:");
        boolean hashMapIsMap = hashMap instanceof Map;
        System.out.println("hashMap instanceof Map: " + hashMapIsMap); // true (HashMap, Map arayüzünü uygular)
        Map<Object, Object> map2 = new HashMap<>();
        boolean map2IsMap = map2 instanceof Map;
        System.out.println("map2 instanceof Map: " + map2IsMap); // true

        // 5. Üst Arayüz ile instanceof
        // Nesne, belirtilen arayüzün bir üst arayüzünü uygulayan bir sınıfın örneği ise true döner.
        System.out.println("\n5. Üst Arayüz ile instanceof Örneği:");
        SortedMap<Object, Object> sortedMap = new TreeMap<>();
        boolean sortedMapIsMap = sortedMap instanceof Map;
        System.out.println("sortedMap instanceof Map: " + sortedMapIsMap); // true (SortedMap, Map'i genişletir)

        // 6. null ile instanceof
        // null değeri, herhangi bir sınıf veya arayüz ile karşılaştırıldığında false döner.
        System.out.println("\n6. null ile instanceof Örneği:");
        Map<Object, Object> nullMap = null;
        boolean nullMapIsMap = nullMap instanceof Map;
        System.out.println("nullMap instanceof Map: " + nullMapIsMap); // false

        // 7. Java Derleyicisi ve instanceof
        // Derleyici, bir nesnenin asla belirtilen türün örneği olamayacağını tespit ederse hata verir.
        System.out.println("\n7. Java Derleyicisi ve instanceof Örneği:");
        String myString = "Hey";
        // Hata örneği (yorum): if (myString instanceof Integer) // Derleme hatası: String, Integer olamaz
        boolean stringIsString = myString instanceof String;
        System.out.println("myString instanceof String: " + stringIsString); // true

        // 8. Aşağı Doğru Tür Dönüşümü (Downcasting) ile instanceof
        // instanceof, bir nesneyi güvenli bir şekilde alt türe dönüştürmek için kullanılır.
        System.out.println("\n8. Downcasting ile instanceof Örneği:");
        Map<Object, Object> map3 = new TreeMap<>();
        if (map3 instanceof SortedMap) {
            SortedMap<Object, Object> sortedMap2 = (SortedMap<Object, Object>) map3;
            System.out.println("map3, SortedMap türüne dönüştürüldü: " + sortedMap2.getClass().getSimpleName());
        }

        // 9. Genel Downcasting ile instanceof
        // Object türünde bir nesne, farklı türlere dönüştürülebilir.
        System.out.println("\n9. Genel Downcasting Örneği:");
        Object myObject = "Merhaba";
        if (myObject instanceof String) {
            String myString2 = (String) myObject;
            System.out.println("myObject String türüne dönüştürüldü: " + myString2);
        } else if (myObject instanceof Integer) {
            Integer myInteger = (Integer) myObject;
            System.out.println("myObject Integer türüne dönüştürüldü: " + myInteger);
        }

        // 10. Desen Eşleştirme ile instanceof (Java 14+, Preview)
        // instanceof, nesneyi otomatik olarak hedef türe dönüştürür ve ek cast gerektirmez.
        System.out.println("\n10. Desen Eşleştirme ile instanceof Örneği (Java 14+):");
        Object obj = "Hello, Java!";
        if (obj instanceof String str) {
            System.out.println("obj String türünde, ilk 5 karakter: " + str.substring(0, 5));
        }

        // 11. Desen Eşleştirme ile Aynı İfadede Kullanım
        // instanceof ile dönüştürülen değişken, aynı ifadede kullanılabilir.
        System.out.println("\n11. Aynı İfadede Desen Eşleştirme Örneği:");
        Object obj2 = "Hello, World!";
        if (obj2 instanceof String str && str.startsWith("Hello")) {
            System.out.println("obj2 String türünde ve 'Hello' ile başlıyor: " + str);
        }

        // 12. Yaygın Hatalar
        // - null ile instanceof kullanımı false döner.
        // - Uyumsuz türlerle karşılaştırma derleme hatasına neden olur.
        System.out.println("\n12. Yaygın Hatalar Örneği:");
        Object nullObj = null;
        boolean nullIsString = nullObj instanceof String;
        System.out.println("nullObj instanceof String: " + nullIsString); // false
        // Hata örneği (yorum): String s = "test"; if (s instanceof Integer) // Derleme hatası
    }
}