// Main.java
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        // ======= Static Nested Class =======
        Outer.StaticNested staticNested = new Outer.StaticNested();
        staticNested.sayHello();

        // ======= Non-static Nested Class (Inner Class) =======
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.printText();

        // Inner Class Shadowing örneği
        OuterWithShadowing outerShadow = new OuterWithShadowing();
        OuterWithShadowing.InnerWithShadowing innerShadow = outerShadow.new InnerWithShadowing();
        innerShadow.printText();

        // ======= Local Class =======
        outer.localClassMethod();

        // ======= Anonymous Class =======
        SuperClass anonymousInstance = new SuperClass() {
            @Override
            public void doIt() {
                System.out.println("Anonymous class doIt()");
            }
        };
        anonymousInstance.doIt();

        MyInterface anonymousInterface = new MyInterface() {
            private String text;

            { this.text = "Anonymous Interface Implementation"; } // static initializer block

            @Override
            public void doIt() {
                System.out.println(text);
            }
        };
        anonymousInterface.doIt();

        // ======= Nested Class Benefits: Cache örneği =======
        Cache cache = new Cache();
        cache.store("key1", "value1");
        System.out.println("Cache get: " + cache.get("key1"));

        CacheExposed cacheExposed = new CacheExposed();
        cacheExposed.store("key2", "value2");
        System.out.println("CacheExposed get: " + cacheExposed.get("key2"));
        System.out.println("CacheEntry timeInserted: " + cacheExposed.getCacheEntry("key2").timeInserted);
    }
}

// Static Nested Class
class Outer {
    public static class StaticNested {
        public void sayHello() {
            System.out.println("Hello from Static Nested Class");
        }
    }

    private String text = "I am private from Outer";

    // Inner Class (Non-static Nested Class)
    public class Inner {
        public void printText() {
            // Inner class erişimi private alanlara da sahip
            System.out.println(text);
        }
    }

    // Local Class örneği: bir metodun içinde tanımlanan sınıf
    public void localClassMethod() {
        class Local {
            public void localPrint() {
                System.out.println("Hello from Local Class");
            }
        }
        Local local = new Local();
        local.localPrint();
    }
}

// Inner Class Shadowing (gölgelenme) örneği
class OuterWithShadowing {
    private String text = "Outer text";

    public class InnerWithShadowing {
        private String text = "Inner text";

        public void printText() {
            System.out.println(text);               // Inner.text
            System.out.println(OuterWithShadowing.this.text); // Outer.text
        }
    }
}

// SuperClass ve Anonymous class örneği
class SuperClass {
    public void doIt() {
        System.out.println("SuperClass doIt()");
    }
}

// Interface ve Anonymous class örneği
interface MyInterface {
    void doIt();
}

// Cache örneği (Nested class private, dışarıya kapalı)
class Cache {
    private Map<String, CacheEntry> cacheMap = new HashMap<>();

    private class CacheEntry {
        public long timeInserted;
        public Object value;
    }

    public void store(String key, Object value) {
        CacheEntry entry = new CacheEntry();
        entry.value = value;
        entry.timeInserted = System.currentTimeMillis();
        cacheMap.put(key, entry);
    }

    public Object get(String key) {
        CacheEntry entry = cacheMap.get(key);
        if (entry == null) return null;
        return entry.value;
    }
}

// Cache örneği (CacheEntry sınıfı public, dışarıya açık)
class CacheExposed {
    private Map<String, CacheEntry> cacheMap = new HashMap<>();

    public class CacheEntry {
        public long timeInserted;
        public Object value;
    }

    public void store(String key, Object value) {
        CacheEntry entry = new CacheEntry();
        entry.value = value;
        entry.timeInserted = System.currentTimeMillis();
        cacheMap.put(key, entry);
    }

    public Object get(String key) {
        CacheEntry entry = cacheMap.get(key);
        if (entry == null) return null;
        return entry.value;
    }

    public CacheEntry getCacheEntry(String key) {
        return cacheMap.get(key);
    }
}
