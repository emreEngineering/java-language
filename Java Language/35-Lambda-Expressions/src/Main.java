// main.java

import java.util.function.Function;

public class Main {

    // Tek metotlu fonksiyonel arayüz (Functional Interface) örneği
    @FunctionalInterface
    interface StateChangeListener {
        void onStateChange(String oldState, String newState);
    }

    // Lambda ifadeleri anonim sınıf yerine kullanılır
    static class StateOwner {
        private StateChangeListener listener;

        public void addStateListener(StateChangeListener listener) {
            this.listener = listener;
        }

        public void changeState(String oldState, String newState) {
            if(listener != null) listener.onStateChange(oldState, newState);
        }
    }

    public static void main(String[] args) {

        StateOwner stateOwner = new StateOwner();

        // Java 7'de anonim sınıf ile kullanım:
        stateOwner.addStateListener(new StateChangeListener() {
            @Override
            public void onStateChange(String oldState, String newState) {
                System.out.println("State changed from " + oldState + " to " + newState);
            }
        });

        // Java 8+ lambda ifadesi ile kullanım (daha kısa, temiz)
        stateOwner.addStateListener(
                (oldState, newState) -> System.out.println("Lambda: State changed from " + oldState + " to " + newState)
        );

        stateOwner.changeState("OFF", "ON");

        // Lambda parametre türü çıkarımı (type inference)
        Function<String, String> toLowerCase = s -> s.toLowerCase();
        System.out.println(toLowerCase.apply("JAVA LAMBDA"));

        // Lambda parametre türünü açık yazma
        Function<String, String> toUpperCase = (String s) -> s.toUpperCase();
        System.out.println(toUpperCase.apply("java lambda"));

        // Çok parametreli lambda
        MyComparator comparator = (a, b) -> a > b;
        System.out.println("Compare 5 > 3? " + comparator.compare(5, 3));

        // Lambda bloğu (çoklu ifade)
        MyComparator verboseComparator = (a, b) -> {
            System.out.println("Comparing " + a + " and " + b);
            return a > b;
        };
        System.out.println("Verbose compare 1 > 2? " + verboseComparator.compare(1, 2));

        // Değişken yakalama - effectively final local variable
        String prefix = "Result: ";
        Function<Integer, String> addPrefix = (num) -> prefix + num;
        System.out.println(addPrefix.apply(10));

        // Method reference örnekleri
        MyPrinter printer = System.out::println;
        printer.print("Hello from method reference!");

        // Statik method referansı
        Finder finder = MyClass::doFind;
        System.out.println("Index: " + finder.find("Hello world", "world"));

        // Parametre method referansı
        Finder finder2 = String::indexOf;
        System.out.println("Index2: " + finder2.find("Hello world", "world"));

        // Örnek: Constructor referansı
        Factory factory = String::new;
        System.out.println(factory.create(new char[] {'J','a','v','a'}));
    }

    // Fonksiyonel arayüzler
    interface MyComparator {
        boolean compare(int a1, int a2);
    }

    interface MyPrinter {
        void print(String s);
    }

    interface Finder {
        int find(String s1, String s2);
    }

    interface Factory {
        String create(char[] chars);
    }

    static class MyClass {
        public static int doFind(String s1, String s2) {
            return s1.lastIndexOf(s2);
        }
    }
}
