# Java Access Modifiers

## 🔹 Nedir?

* Java'da erişim belirleyiciler (access modifiers), sınıfların, alanların (field), metotların ve kurucuların (constructor) erişim seviyesini tanımlar.
* Dört erişim seviyesi vardır:

    * `private`
    * default (belirtilmezse)
    * `protected`
    * `public`

---

## 🔹 private

* Yalnızca **aynı sınıf** içinden erişilebilir.
* Sınıflar `private` olamaz.

```java
public class Clock {
    private long time = 0;

    private Clock(long time) {
        this.time = time;
    }

    public static Clock newClock() {
        return new Clock(System.currentTimeMillis());
    }
}
```

### 📌 Accessor Metotları (Getter / Setter):

```java
public long getTime() { return this.time; }
public void setTime(long t) { this.time = t; }
```

---

## 🔹 default (package-private)

* Hiçbir modifier yazılmazsa default olur.
* **Aynı paket içindeki** sınıflar erişebilir.

```java
public class Clock {
    long time = 0; // default
}

class Reader {
    Clock c = new Clock();
    long t = c.time;
}
```

---

## 🔹 protected

* `default` ile aynı erişimi sağlar **+** farklı paketteki **alt sınıflar** erişebilir.

```java
public class Clock {
    protected long time = 0;
}

public class SmartClock extends Clock {
    public long getTimeInSeconds() {
        return this.time / 1000;
    }
}
```

---

## 🔹 public

* **Her yerden erişim** sağlar (sınıf, paket fark etmez).

```java
public class Clock {
    public long time = 0;
}

class Reader {
    Clock c = new Clock();
    long t = c.time;
}
```

---

## 🔹 Class Access Modifiers

| Modifier  | Uygulanabilir                  |
| --------- | ------------------------------ |
| private   | ❌ (sınıfa uygulanamaz)         |
| default   | ✅ (aynı paketten erişilebilir) |
| protected | ❌ (sınıfa uygulanamaz)         |
| public    | ✅ (her yerden erişilebilir)    |

```java
// Default erişim
class MyClass { ... }

// Public erişim
public class YourClass { ... }
```

---

## 🔹 Interface Access Modifiers

* Tüm metotlar ve değişkenler **public** olmak zorundadır.
* `private`, `protected`, `default` **kullanılamaz**.

```java
public interface Clock {
    void start(); // public implied
}
```

---

## 🔹 Erişim Belirleyiciler ve Kalıtım

* Alt sınıf, üst sınıftaki metodu **daha az erişilebilir** yapamaz.

### ✅ Geçerli:

```java
// Üst sınıf
protected void doSomething() {}

// Alt sınıf
public void doSomething() {} // genişletme OK
```

### ❌ Geçersiz:

```java
// Üst sınıf
public void doSomething() {}

// Alt sınıf
protected void doSomething() {} // HATA: daha az erişim verilmez
```

---

## ✅ Özet Tablo

| Modifier    | Aynı Sınıf | Aynı Paket | Alt Sınıf (farklı paket) | Her Yerden |
| ----------- | ---------- | ---------- | ------------------------ | ---------- |
| `private`   | ✅          | ❌          | ❌                        | ❌          |
| `default`   | ✅          | ✅          | ❌                        | ❌          |
| `protected` | ✅          | ✅          | ✅                        | ❌          |
| `public`    | ✅          | ✅          | ✅                        | ✅          |
