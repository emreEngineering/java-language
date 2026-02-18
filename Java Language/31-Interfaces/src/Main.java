// Main.java
public class Main {
    public static void main(String[] args) {
        MyInterface myInterface = new MyInterfaceImpl();
        myInterface.sayHello();

        MyInterfaceImpl multiImpl = new MyInterfaceImpl();
        multiImpl.sayHello();
        multiImpl.sayGoodbye();

        FileLoader fileLoader = new FileLoader();
        fileLoader.load("myfile.txt");
        fileLoader.load(java.nio.file.Paths.get("mypath"));

        MyInterface.print("Static method call!");

        Storable storable = new Car();
        storable.store();

        Serializable serializable = new Car();
        // serialize metodları burada sadece çağrılıyor,
        // gerçek dosya yazımı için Writer gereklidir.
        serializable.serializeToXML(null);
        serializable.serializeToJSON(null);
    }
}

interface MyInterface {
    String hello = "Hello";

    void sayHello();

    static void print(String text) {
        System.out.println(text);
    }
}

class MyInterfaceImpl implements MyInterface, MyOtherInterface {
    public void sayHello() {
        System.out.println(MyInterface.hello);
    }

    public void sayGoodbye() {
        System.out.println("Goodbye");
    }
}

interface MyOtherInterface {
    void sayGoodbye();
}

interface ResourceLoader {
    Resource load(String resourcePath);

    default Resource load(java.nio.file.Path resourcePath) {
        System.out.println("Default load from Path");
        return null;
    }
}

class FileLoader implements ResourceLoader {
    public Resource load(String resourcePath) {
        System.out.println("Loading from String path: " + resourcePath);
        return null;
    }
}

interface Storable {
    void store();
}

interface Serializable {
    void serializeToXML(java.io.Writer writer);
    void serializeToJSON(java.io.Writer writer);
}

class Car implements Storable, Serializable {
    public void store() {
        System.out.println("Storing car...");
    }

    public void serializeToXML(java.io.Writer writer) {
        System.out.println("Serializing car to XML...");
    }

    public void serializeToJSON(java.io.Writer writer) {
        System.out.println("Serializing car to JSON...");
    }
}

// Resource sınıfı basit tanım olarak:
class Resource {}
