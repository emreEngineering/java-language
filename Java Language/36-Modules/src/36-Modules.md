# Java Modules

## Java Module Benefits
- **Smaller Application Distributables via the Modular Java Platform**  
  Java Platform API'ları modüllere ayrılarak, uygulamanın sadece ihtiyaç duyduğu modülleri içerecek şekilde paketlenebilmesini sağlar. Böylece dağıtım dosyaları küçülür.
- **Encapsulation of Internal Packages**  
  Bir modül içinde dışa açılmak istenen paketler açıkça belirtilir. Dışa açılmayan paketler modül içinde gizli kalır ve diğer modüller tarafından erişilemez.
- **Startup Detection of Missing Modules**  
  Modüller arası bağımlılıklar JVM başlatılırken kontrol edilir. Eksik modül varsa uygulama çalışmaz ve hata verir. Önceki sürümlerde bu hata ancak çalışma zamanında ortaya çıkardı.

## Java Module Basics

### Modules Contain One or More Packages
Modül bir veya daha fazla Java paketini içerir. Bir modül tam bir uygulama, Java API veya üçüncü parti bir API olabilir.

### Module Naming
- Modül isimleri paket isimlendirme kurallarına uyar.
- Alt çizgi (_) kullanılmaması önerilir.
- Genellikle modül adı, içindeki ana paket adıyla aynı olur.  
  Örnek: `com.jenkov.mymodule`

### Module Root Directory
Java 9’dan itibaren modüller, modül adını taşıyan bir kök dizin altında organize edilir:  
