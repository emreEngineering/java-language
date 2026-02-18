// main.java

import java.lang.annotation.*;
import java.util.*;

// Java Annotations temel örnekleri ve açıklamaları

// 1. Basit annotation tanımı
@interface MyAnnotation {
    String value();
    String name();
    int age();
    String[] newNames() default {}; // opsiyonel eleman, default boş dizi
}

// 2. Retention ve Target kullanımı
@Retention(RetentionPolicy.RUNTIME) // Annotation çalışma zamanında erişilebilir
@Target({ElementType.TYPE, ElementType.METHOD}) // Sadece sınıf ve metot üzerinde kullanılabilir
@interface RuntimeAnnotation {
    String info() default "default info";
}

// 3. @Inherited örneği: Annotation alt sınıflara da aktarılır
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface InheritedAnnotation {
}

// 4. Built-in annotation kullanımları
class BaseClass {

    @Deprecated // Bu metot artık kullanılmamalı anlamında uyarı verir
    public void oldMethod() {
        System.out.println("Deprecated method");
    }

    @Override // Üst sınıftaki metodu doğru şekilde override ettiğimizi garanti eder
    public String toString() {
        return "BaseClass";
    }

    @SuppressWarnings("unchecked") // Bu metodun içerdiği belirli uyarıları kapatır
    public void uncheckedWarning() {
        List rawList = new ArrayList(); // unchecked conversion uyarısı
        rawList.add("test");
    }
}

@InheritedAnnotation
@RuntimeAnnotation(info = "My annotated class")
@MyAnnotation(value = "val1", name = "Jakob", age = 37, newNames = {"Jenkov", "Peterson"})
public class MyClass extends BaseClass {

    @RuntimeAnnotation(info = "my method info")
    public void myMethod() {
        System.out.println("My method");
    }

    public static void main(String[] args) {

        MyClass obj = new MyClass();

        // Deprecated metodu çağırma (derleme uyarısı verir)
        obj.oldMethod();

        // Override örneği
        System.out.println(obj.toString());

        // SuppressWarnings örneği
        obj.uncheckedWarning();

        // Annotation bilgilerini reflection ile alma
        Class<?> clazz = obj.getClass();

        if(clazz.isAnnotationPresent(MyAnnotation.class)) {
            MyAnnotation ann = clazz.getAnnotation(MyAnnotation.class);
            System.out.println("MyAnnotation value: " + ann.value());
            System.out.println("MyAnnotation name: " + ann.name());
            System.out.println("MyAnnotation age: " + ann.age());
            System.out.println("MyAnnotation newNames: " + Arrays.toString(ann.newNames()));
        }

        if(clazz.isAnnotationPresent(RuntimeAnnotation.class)) {
            RuntimeAnnotation runAnn = clazz.getAnnotation(RuntimeAnnotation.class);
            System.out.println("RuntimeAnnotation info: " + runAnn.info());
        }

        // Inherited annotation kontrolü
        Class<?> superClass = clazz.getSuperclass();
        if(superClass.isAnnotationPresent(InheritedAnnotation.class)) {
            System.out.println("Superclass has InheritedAnnotation");
        } else {
            System.out.println("Superclass has NO InheritedAnnotation");
        }
    }
}
