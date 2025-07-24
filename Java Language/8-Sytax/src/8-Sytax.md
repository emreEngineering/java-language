Java Sözdizimi Notları
Kaynak: Jakob Jenkov, Son Güncelleme: 2020-01-17
Genel Bakış
Bu belge, bir Java dosyasının yapısını ve temel unsurlarını kapsayan Java sözdiziminin temel bir özetini sunar. Her detayı kapsamamakla birlikte, Java sözdizimine giriş niteliğindedir.
Java Dosyaları

Tüm Java kodu, .java uzantılı dosyalarda bulunmalıdır (örneğin, HelloWorld.java, MyApp.java).
Bir Java uygulaması birden fazla .java dosyasından oluşabilir.

Java Sözdizimi Unsurları
Bir Java dosyası aşağıdaki bileşenleri içerebilir:

Paket Bildirimi
İçe Aktarma (Import) İfadeleri
Tip Bildirimi
Alan (Field) Bildirimleri
Sınıf Başlatıcıları
Yapıcılar (Constructors)
Metotlar
Yorumlar ve anotasyonlar (bu metinde ele alınmamıştır, daha sonra açıklanacaktır).

Örnek Java Dosyası
package javacore;

// örnek içe aktarma - HashMap kullanılmamıştır.
import java.util.HashMap;

public class MyClass {

    protected final String name = "John";

    {
        //sınıf başlatıcısı
    }

    public MyClass() {
    }

    public String getName() {
        return this.name;
    }

    public static void main(String[] args) {
    }
}

Ayrıntılı Açıklama
1. Paket Bildirimi

Sözdizimi: package paketAdı;
Örnek: package javacore;
Java dosyasının bulunduğu paketi belirtir.
Dosya, paket adına uygun bir dizin yapısında yer almalıdır.
Daha fazla bilgi için Java Paketleri metnine bakınız.

2. İçe Aktarma (Import) İfadeleri

Sözdizimi: import paketAdı.SınıfAdı;
Örnek: import java.util.HashMap;
Java derleyicisine, dosyada kullanılan harici sınıfları bildirir.
Yalnızca farklı paketlerdeki sınıfların içe aktarılması gerekir.
Birden fazla içe aktarma ifadesi kullanılabilir, her biri ayrı bir satırda yer alır.
Not: Gerçek projelerde kullanılmayan sınıfları içe aktarmaktan kaçının.

3. Tip Bildirimi

Bir sınıf, soyut sınıf, arayüz, enum veya anotasyon tanımlar.
{ ve } ile sınırlandırılır.
Örnek: public class MyClass {
}


Açılış { genellikle bildirimle aynı satırda yer alır, kapanış } ise tipin son satırındadır.

4. Alan (Field) Bildirimleri

Sözdizimi: [erişimBelirleyici] [tip] alanAdı = değer;
Örnek: protected final String name = "John";
Sınıf, arayüz veya enum içinde tanımlı değişkenlerdir.
Bir tip birden fazla alana sahip olabilir.
Daha fazla bilgi için Java Alanları metnine bakınız.

5. Sınıf Başlatıcıları

Bir sınıf örneği oluşturulduğunda çalıştırılan kod bloğudur.
Sözdizimi: {
// başlatma kodu
}


Örnek: {
//sınıf başlatıcısı
}


Statik Başlatıcı: Sınıf JVM’ye yüklendiğinde yalnızca bir kez çalıştırılır.
Sözdizimi: static {
// statik başlatma kodu
}


Örnek: static {
//statik sınıf başlatıcısı
}





6. Yapıcılar (Constructors)

Nesneleri başlatmak için kullanılan özel metotlardır.
Sınıf başlatıcılarından farklı olarak parametre alabilir.
Sözdizimi: [erişimBelirleyici] SınıfAdı([parametreler]) {
// yapıcı gövdesi
}


Örnek: public MyClass() {
}


Bir sınıf birden fazla yapıcıya sahip olabilir.
Daha fazla bilgi için Java Yapıcıları metnine bakınız.

7. Metotlar

Bir sınıf içinde tanımlı, nesne (örnek metotları) veya sınıf (statik metotlar) üzerinden çağrılabilen fonksiyonlardır.
Örnek Metot Örneği:public String getName() {
return this.name;
}


Statik Metot Örneği:public static void main(String[] args) {
}


Statik metotlar, sınıfa aittir ve nesne örneği olmadan çağrılabilir.
Daha fazla bilgi için Java Metotları metnine bakınız.

8. Tip Bildirimi Sonu

Tip bildiriminin kapanış } ile işaretlenir.
Bu, bildirilen tipe ait başka Java kodunun gelmeyeceğini gösterir.

Ek Notlar

Yorumlar ve anotasyonlar bu metinde ele alınmamıştır, ancak daha sonraki metinlerde açıklanacaktır.
Belirli unsurlar hakkında daha fazla bilgi için paketler, alanlar, yapıcılar ve metotlar üzerine yazılmış özel metinlere bakınız.
