# Java Packages

## 🔹 Java Packages Nedir?

* İlişkili sınıfları mantıksal olarak gruplamak için kullanılır.
* Fiziksel olarak her package, diskte bir klasördür.
* Alt paketler (subpackage) oluşturularak hiyerarşi sağlanabilir.

---

## 🔹 Java Package Oluşturma

```java
// Dosya yapısı:
// src/com/jenkov/navigation/Page.java

package com.jenkov.navigation;

public class Page {
    // Sınıf içeriği
}
```

* Dosya klasör yapısı ile `package` tanımı uyuşmalıdır.

---

## 🔹 Java Package İsimlendirme Kuralları

* Küçük harflerle yazılır: `com.example.project`
* Çakışmaları önlemek için ters domain önerilir: `com.jenkov` gibi.

---

## 🔹 Başka Paketten Sınıf Kullanımı

```java
import anotherpackage.B;

public class A {
    public static void main(String[] args) {
        B b = new B();
        b.doIt();
    }
}
```

### 🔸 Tüm sınıfları import etme:

```java
import anotherpackage.util.*;
```

---

## 🔹 Fully Qualified Class Name Kullanımı

```java
public class A {
    public static void main(String[] args) {
        anotherpackage.util.TimeUtil timeUtil = new anotherpackage.util.TimeUtil();
        timeUtil.startTimer();
    }
}
```

* `import` kullanmadan, doğrudan tam yol ile sınıfa erişim yapılır.

---

## 🔹 Sınıfları Paketlere Ayırma Yöntemleri

### ✅ Katmana Göre Ayırma (Layered)

* Örnek: `controller`, `service`, `repository`
* Dezavantaj: Katmanlar büyüdükçe karışıklık olabilir

### ✅ İşlevselliğe Göre Ayırma (Feature-Based) — **Tavsiye Edilen**

* Örnek: `com.jenkov.pension`, `com.jenkov.auth`
* Daha modüler ve yönetilebilir yapı sağlar

---

## 🔹 Yerleşik (Built-in) Java Paketleri

| Paket       | Açıklama                     |
| ----------- | ---------------------------- |
| `java.util` | Koleksiyonlar, veri yapıları |
| `java.io`   | Dosya işlemleri              |
| `java.net`  | Ağ işlemleri                 |
| `java.sql`  | Veritabanı bağlantıları      |
| `java.time` | Tarih ve saat işlemleri      |

---

## ✅ Özet

| Konu                     | Açıklama                                 |
| ------------------------ | ---------------------------------------- |
| Package tanımı           | `package com.example;`                   |
| İsimlendirme             | Küçük harf, ters domain önerilir         |
| Import kullanımı         | `import paket.Sınıf;` veya `import *;`   |
| FQCN                     | `new paket.Sınıf();` ile direkt erişim   |
| Sınıf ayırma stratejisi  | Katman veya işlev bazlı                  |
| Built-in paket örnekleri | `java.util`, `java.io`, `java.time`, ... |
