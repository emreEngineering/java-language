public class Main {
    public static void main(String[] args) {
        // 1. Java Dizileri Nedir?
        // Dizi, aynı türden birden fazla değeri saklayan bir veri yapısıdır.
        // Diziler sabit boyutludur ve indeks tabanlıdır (0'dan başlar).
        System.out.println("1. Java Dizileri Nedir?");
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Örnek dizi: " + java.util.Arrays.toString(numbers));

        // 2. Dizi Tanımlama
        // Diziler, tür ve boyut belirtilerek tanımlanır.
        // Tanımlama: tür[] diziAdı; veya tür diziAdı[];
        System.out.println("\n2. Dizi Tanımlama Örneği:");
        int[] arr1; // Tanımlama
        arr1 = new int[3]; // Bellek ayırma
        arr1[0] = 10; arr1[1] = 20; arr1[2] = 30;
        System.out.println("arr1: " + java.util.Arrays.toString(arr1));

        // 3. Dizi Başlatma
        // Diziler, tanımlama sırasında veya sonrasında başlatılabilir.
        // a) Tanımlama sırasında başlatma
        String[] fruits = {"Elma", "Armut", "Muz"};
        // b) new operatörü ile başlatma
        int[] arr2 = new int[] {100, 200, 300};
        System.out.println("\n3. Dizi Başlatma Örneği:");
        System.out.println("fruits: " + java.util.Arrays.toString(fruits));
        System.out.println("arr2: " + java.util.Arrays.toString(arr2));

        // 4. Dizi Elemanlarına Erişim
        // Elemanlara indeks ile erişilir (0'dan başlar).
        System.out.println("\n4. Dizi Elemanlarına Erişim Örneği:");
        System.out.println("fruits[1]: " + fruits[1]); // Armut
        fruits[1] = "Kiraz"; // Eleman değiştirme
        System.out.println("Değiştirilmiş fruits: " + java.util.Arrays.toString(fruits));

        // 5. Dizi Uzunluğu
        // length özelliği, dizinin eleman sayısını döndürür.
        System.out.println("\n5. Dizi Uzunluğu Örneği:");
        System.out.println("numbers uzunluğu: " + numbers.length);
        System.out.println("fruits uzunluğu: " + fruits.length);

        // 6. Dizi Döngüleri
        // Diziler genellikle for veya foreach döngüsü ile gezilir.
        System.out.println("\n6. Dizi Döngüleri Örneği:");
        // a) Klasik for döngüsü
        System.out.print("numbers (for): ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        // b) Foreach döngüsü
        System.out.print("fruits (foreach): ");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        // 7. Çok Boyutlu Diziler
        // Dizilerin dizisi olarak tanımlanır (örneğin, 2D dizi: matris).
        System.out.println("\n7. Çok Boyutlu Diziler Örneği:");
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("2D Dizi (matris):");
        for (int[] row : matrix) {
            System.out.println(java.util.Arrays.toString(row));
        }

        // 8. Çok Boyutlu Dizi Tanımlama ve Başlatma
        // new operatörü ile veya doğrudan başlatma ile yapılır.
        System.out.println("\n8. Çok Boyutlu Dizi Tanımlama ve Başlatma Örneği:");
        int[][] jaggedArray = new int[3][];
        jaggedArray[0] = new int[] {1, 2};
        jaggedArray[1] = new int[] {3, 4, 5};
        jaggedArray[2] = new int[] {6};
        System.out.println("Düzensiz (jagged) dizi:");
        for (int[] row : jaggedArray) {
            System.out.println(java.util.Arrays.toString(row));
        }

        // 9. Dizi Kopyalama
        // Diziler, System.arraycopy() veya Arrays.copyOf() ile kopyalanabilir.
        System.out.println("\n9. Dizi Kopyalama Örneği:");
        int[] original = {1, 2, 3, 4};
        // a) System.arraycopy
        int[] copy1 = new int[original.length];
        System.arraycopy(original, 0, copy1, 0, original.length);
        // b) Arrays.copyOf
        int[] copy2 = java.util.Arrays.copyOf(original, original.length);
        System.out.println("original: " + java.util.Arrays.toString(original));
        System.out.println("copy1: " + java.util.Arrays.toString(copy1));
        System.out.println("copy2: " + java.util.Arrays.toString(copy2));
    }
}