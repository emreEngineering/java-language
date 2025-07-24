# Java Interfaces vs Abstract Classes - Özet

## Java Interface
- Sadece method imzaları (signature) ve sabitler (constants) içerir.
- Sınıfları bağımsızlaştırmak ve soyutlamak için kullanılır.
- Bir sınıf birden fazla interface'i implemente edebilir.
- Polimorfizm için ideal.
- Java 8 ile `default` ve `static` methodlar eklenmiştir.

## Abstract Class
- Hem abstract hem somut (concrete) methodlar içerebilir.
- Nesne oluşturulamaz (instantiate edilemez).
- Sınıflar sadece bir abstract class'tan kalıtım alabilir.
- Ortak kod ve temel işlevsellik sağlar.
- Interface'i implemente edip, somut işlevsellik içerebilir.

## Farklar ve Kullanım Alanları
- Interface: **Davranış bildirimi** için, farklı sınıflara aynı metodları zorunlu kılmak için.
- Abstract Class: **Ortak temel kod** ve bazı varsayılan davranışlar için.
- Java'da sınıf sadece bir abstract class'tan kalıtım alabilir, ancak birden fazla interface implemente edebilir.
- Esneklik açısından, arayüz (interface) kullanımı tercih edilir.
- İhtiyaç varsa, abstract class interface'i implemente edip temel işlevsellik verebilir.

## Örnek Yapı
```java
public interface URLProcessor {
    void process(URL url) throws IOException;
}

public abstract class URLProcessorBase implements URLProcessor {
    public void process(URL url) throws IOException {
        // Ortak açma, kapama işlemleri
        // Alt sınıf processURLData() methodunu implement edecek
    }
    protected abstract void processURLData(InputStream input) throws IOException;
}

public class URLProcessorImpl extends URLProcessorBase {
    @Override
    protected void processURLData(InputStream input) throws IOException {
        // İşlem implementasyonu
    }
}

// Kullanımı
URLProcessor urlProcessor = new URLProcessorImpl();
urlProcessor.process(new URL("http://jenkov.com"));
