// main.java

// Java Enum Örnekleri ve Açıklamaları

// 1. Basit Enum Tanımı
enum Level {
    HIGH,   // Yüksek seviye
    MEDIUM, // Orta seviye
    LOW     // Düşük seviye
}

public class Main {

    public static void main(String[] args) throws Exception {

        // Enum kullanımı
        Level level = Level.HIGH;

        // Enum if-else kontrolü
        if(level == Level.HIGH) {
            System.out.println("Seviye: HIGH");
        } else if(level == Level.MEDIUM) {
            System.out.println("Seviye: MEDIUM");
        } else {
            System.out.println("Seviye: LOW");
        }

        // Enum switch-case kullanımı
        switch(level) {
            case HIGH:
                System.out.println("Switch: HIGH");
                break;
            case MEDIUM:
                System.out.println("Switch: MEDIUM");
                break;
            case LOW:
                System.out.println("Switch: LOW");
                break;
        }

        // Enum tüm değerleri üzerinde döngü
        for(Level l : Level.values()) {
            System.out.println("Enum değeri: " + l);
        }

        // toString() otomatik çağrılır, ekrana enum ismini basar
        System.out.println("toString(): " + level.toString());

        // valueOf() ile String'den Enum'a dönüşüm
        Level levelFromString = Level.valueOf("HIGH");
        System.out.println("valueOf(): " + levelFromString);

        // -----------------------------------------
        // 2. Enum alanları ve constructor kullanımı
        enum LevelWithCode {
            HIGH(3), MEDIUM(2), LOW(1);

            private final int levelCode;

            // Enum constructor'u private olmalıdır
            LevelWithCode(int code) {
                this.levelCode = code;
            }

            // Getter method
            public int getLevelCode() {
                return this.levelCode;
            }
        }

        LevelWithCode l2 = LevelWithCode.HIGH;
        System.out.println("Level code: " + l2.getLevelCode());

        // -----------------------------------------
        // 3. Enum abstract method örneği
        enum LevelAbstract {
            HIGH {
                @Override
                public String asLowerCase() {
                    return "high";
                }
            },
            MEDIUM {
                @Override
                public String asLowerCase() {
                    return "medium";
                }
            },
            LOW {
                @Override
                public String asLowerCase() {
                    return "low";
                }
            };

            // Abstract method tanımı
            public abstract String asLowerCase();
        }

        System.out.println("Abstract method: " + LevelAbstract.MEDIUM.asLowerCase());

        // -----------------------------------------
        // 4. Enum bir interface'i implemente edebilir

        interface Describable {
            String getDescription();
        }

        enum EnumWithInterface implements Describable {
            FIRST("Birinci Değer"),
            SECOND("İkinci Değer");

            private final String description;

            EnumWithInterface(String desc) {
                this.description = desc;
            }

            @Override
            public String getDescription() {
                return description;
            }
        }

        System.out.println(EnumWithInterface.FIRST.getDescription());

        // -----------------------------------------
        // 5. EnumSet - Enum'ları verimli tutmak için özel Set
        java.util.EnumSet<Level> enumSet = java.util.EnumSet.of(Level.HIGH, Level.MEDIUM);
        System.out.println("EnumSet: " + enumSet);

        // -----------------------------------------
        // 6. EnumMap - Enum'ları anahtar olarak kullanabilen Map
        java.util.EnumMap<Level, String> enumMap = new java.util.EnumMap<>(Level.class);
        enumMap.put(Level.HIGH, "Yüksek seviye");
        enumMap.put(Level.MEDIUM, "Orta seviye");
        enumMap.put(Level.LOW, "Düşük seviye");

        System.out.println("EnumMap'ten değer: " + enumMap.get(Level.HIGH));
    }
}
