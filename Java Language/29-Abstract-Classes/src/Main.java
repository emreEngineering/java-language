// Main.java
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class Main {
    public static void main(String[] args) throws IOException {
        // Abstract class örneği - URL işleyici
        URLProcessorImpl processor = new URLProcessorImpl();
        processor.process(new URL("https://www.example.com"));
    }
}

// Abstract sınıf: nesne yaratılamaz, bazı metotlar abstract olabilir
abstract class MyAbstractClass {
    public abstract void abstractMethod();
    public void normalMethod() {
        System.out.println("Normal method in abstract class");
    }
}

// Abstract sınıfın alt sınıfı, abstract metodu override etmek zorunda
class MySubClass extends MyAbstractClass {
    @Override
    public void abstractMethod() {
        System.out.println("Implemented abstractMethod");
    }
}

// Abstract sınıf ve Template Method Design Pattern örneği
abstract class URLProcessorBase {

    // Şablon metot: bağlantıyı açar, veriyi işler, bağlantıyı kapatır
    public void process(URL url) throws IOException {
        URLConnection connection = url.openConnection();
        InputStream input = connection.getInputStream();

        try {
            processURLData(input); // abstract metot, alt sınıfta implement edilecek
        } finally {
            input.close();
        }
    }

    // İşlem metodu abstract, alt sınıf tarafından tanımlanacak
    protected abstract void processURLData(InputStream input) throws IOException;
}

// Alt sınıf sadece veri işleme metodunu implement eder
class URLProcessorImpl extends URLProcessorBase {
    @Override
    protected void processURLData(InputStream input) throws IOException {
        int data = input.read();
        while (data != -1) {
            System.out.print((char) data);
            data = input.read();
        }
    }
}
