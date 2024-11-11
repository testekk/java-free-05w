# Tổng quan về Lập trình Hướng đối tượng (OOP) trong Java
1. Lập trình Hướng đối tượng (OOP) là một mô hình lập trình dựa trên khái niệm về "đối tượng", có thể chứa dữ liệu và mã để thao tác dữ liệu đó. <br/>
Ví dụ: Con người sẽ có các:
   1. Thông tin: Tên, tuổi, giới tính, địa chỉ. -> Đây được gọi là thuộc tính (Attribute).
   2. Hành vi: Ăn, ngủ, học, chơi. -> Đây được gọi là phương thức (Method). </br>
   -> Như vậy "Con người" sẽ là thể hiện đặc trưng của bất kỳ người nào và trong đó một đối tượng sẽ bao gồm các thuộc tính và phương thức. <br/>

<br/><br/>Dưới đây là các khái niệm chính trong OOP
2. Lớp (Class): Là một bản thiết kế cho các đối tượng. Nó định nghĩa các thuộc tính và phương thức mà các đối tượng của lớp đó sẽ có.<br/>
Ví dụ: Tạo ra một Class có tên Person với các thuộc tính như tên, tuổi, giới tính và các phương thức như ăn, ngủ, học, chơi.
```java
public class Person {
    // Thuộc tính
    String name;
    int age;
    String sex;
    // Phương thức
    void eat() {
        System.out.println("Person is eating");
    }
 ```
Để tạo một class trong Java, chúng ta sử dụng từ khóa `class` theo sau là tên của class. 
```java
public class Person {
    // Thuộc tính
    String name;
    int age;
```
Để tạo method trong class, chúng ta sử dụng từ khóa `void` hoặc kiểu dữ liệu của method theo sau là tên của method.
```java
void eat() {        // Phương thức không trả về giá trị
   System.out.println("Person is eating");
}

String getName() {  // Phương thức trả về giá trị
   return name;
}
```
3. Đối tượng (Object): Là một thể hiện của một lớp. Nó có trạng thái và hành vi được định nghĩa bởi lớp.<br/>
Vi dụ: Tạo ra một đối tượng từ lớp Person.
```java
public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng person từ lớp Person
        Person anhnv = new Person();
        // Gọi phương thức eat() của đối tượng person
        person.eat();

        Person vincent = new Person();
        vincent.eat();
    }
}
// Chúng ta có th tạo ra nhiều đối tượng từ một lớp. -> mỗi đối tượng được gọi là một thể hiện của lớp đó (object) và sẽ có các thuộc tính và phương thức của lớp đó, riêng biệt với các đối tượng khác.
```

4. Tính chất
   1. Kế thừa (Inheritance): Là một cơ chế mà một lớp có thể kế thừa các thuộc tính và phương thức của một lớp khác. 
   2. Đa hình (Polymorphism): Là khả năng của các đối tượng thuộc các lớp khác nhau có thể được xử lý thông qua cùng một giao diện. 
   3. Đóng gói (Encapsulation): Là cơ chế che giấu dữ liệu của một đối tượng và chỉ cho phép truy cập thông qua các phương thức công khai. 
   4. Trừu tượng (Abstraction): Là quá trình ẩn đi các chi tiết triển khai và chỉ hiển thị các chức năng cần thiết của đối tượng.

## 1. Lớp và Đối tượng
- Lớp (Class): Là một bản thiết kế cho các đối tượng. Nó định nghĩa các thuộc tính và phương thức mà các đối tượng của lớp đó sẽ có.
- Đối tượng (Object): Là một thể hiện của một lớp. Nó có trạng thái và hành vi được định nghĩa bởi lớp.
- Ví dụ: Tạo ra một lớp Animal với các thuộc tính như tên, tuổi và hành vi tạo tiếng kêu.
```java
public class Animal {
    // Thuộc tính
    private String name;
    private int age;

    // Constructor : Phương thức khởi tạo ra đối tượng
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Phương thức
    public void makeSound() {
        System.out.println("Some sound...");
    }

    // Getter và Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

// Tạo đối tượng
public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal("Buddy", 3);
        dog.makeSound();
        System.out.println("Name: " + dog.getName());
        System.out.println("Age: " + dog.getAge());
        
        // Chúng ta có thể tạo nhiều đối tượng từ một lớp
        Animal cat = new Animal("Kitty", 2);
        cat.makeSound();
        System.out.println("Name: " + cat.getName());
        System.out.println("Age: " + cat.getAge());
        
        // Chúng ta có thể thay đổi giá trị của thuộc tính
        dog.setName("Tom");     // Cập nhật tên của dog
        dog.setAge(4);          // Cập nhật tuổi của dog
    }
}
```
Khi tạo object từ class, chúng ta sử dụng từ khóa `new` để khởi tạo object và gán cho một biến. 
```java
Animal dog = new Animal("Buddy", 3);
// Chúng ta thấy Animal khi khởi ta cần truyền vào 2 tham số là name và age.
```
Sau khi có object, chúng ta có thể sử dụng object để tương tác với các thuộc tính và phương thức của class.
```java
dog.makeSound();
System.out.println("Name: " + dog.getName());
System.out.println("Age: " + dog.getAge());
```

## 2. Tính đóng gói (Encapsulation)
- Tính đóng gói (Encapsulation) là một trong bốn tính chất của lập trình hướng đối tượng (OOP).
- Tính đóng gói (Encapsulation) là quá trình che giấu thông tin và bảo vệ dữ liệu của một đối tượng khỏi sự truy cập từ bên ngoài.
- Để thực hiện tính đóng gói, chúng ta sử dụng các phương thức getter và setter để truy cập và cập nhật giá trị của các thuộc tính.
- Ví dụ: Sử dụng getter và setter để truy cập và cập nhật giá trị của thuộc tính name.
```java
public class Animal {
    private String name; // Thuộc tính private, không cho truy cập từ bên ngoài

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Animal dog = new Animal();
        // dog.name = "Buddy";              // Lỗi: Không thể truy cập trực tiếp thuộc tính private
        dog.setName("Buddy");               // Sử dụng setter để cập nhật giá trị của name 
        System.out.println(dog.getName());  // Sử dụng getter để lấy giá trị của name
    }
}
```

Trong Java có 4 mức độ truy cập (Access Modifier) cho các thuộc tính và phương thức:
- `private`: Chỉ có thể truy cập từ bên trong class.
- `default`: Chỉ có thể truy cập từ cùng package và măc định nếu không khai báo mức độ truy cập.
- `protected`: Chỉ có thể truy cập từ cùng package hoặc từ class kế thừa.
- `public`: Có thể truy cập từ mọi nơi.
- Ví dụ: Sử dụng mức độ truy cập `private` cho thuộc tính `name`.
```java
public class Animal {
    private String name; // Thuộc tính private, không cho truy cập từ bên ngoài

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Animal dog = new Animal();
        // dog.name = "Buddy";              // Lỗi: Không thể truy cập trực tiếp thuộc tính private
        dog.setName("Buddy");               // Sử dụng setter để cập nhật giá trị của name 
        System.out.println(dog.getName());  // Sử dụng getter để lấy giá trị của name
    }
}
```

Ví dụ: Sử dụng mức độ truy cập `protected` cho thuộc tính `name`.
```java
public class Animal {
    protected String name; // Thuộc tính protected, chỉ có thể truy cập từ cùng package hoặc từ class kế thừa

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.name = "Buddy";              // Có thể truy cập thuộc tính protected từ class cùng package
        dog.setName("Buddy");            // Sử dụng setter để cập nhật giá trị của name 
        System.out.println(dog.getName());  // Sử dụng getter để lấy giá trị của name
    }
}
```

## 3. Tính kế thừa (Inheritance)
- Tính kế thừa (Inheritance) là một trong bốn tính chất của lập trình hướng đối tượng (OOP).
- Tính kế thừa (Inheritance) cho phép một lớp mới (con) kế thừa tất cả các thuộc tính và phương thức từ lớp hiện có (cha).
- Lớp con có thể sử dụng tất cả các thuộc tính và phương thức của lớp cha và có thể thêm các thuộc tính và phương thức mới.

Ví dụ: Tạo lớp Animal là lớp cha và lớp Dog là lớp con kế thừa từ lớp Animal.
```java
public class Animal {
    public void makeSound() {
        System.out.println("Some sound...");
    }
}

public class Dog extends Animal {
    public void bark() {
        System.out.println("Woof! Woof!");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound(); // Kế thừa từ lớp cha, trong class Dog hoàn toàn không có phương thức makeSound nhưng vẫn có thể sử dụng được.
        dog.bark();      // Phương thức của lớp con
    }
}

// Chúng ta có thể tạo nhiều lớp con từ một lớp cha
public class Cat extends Animal {
    public void meow() {
        System.out.println("Meow! Meow!");
    }
}

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.makeSound(); // Kế thừa từ lớp cha
        cat.meow();      // Phương thức của lớp con
    }
}
```
Ngoài ra các bạn cần đọc và nghiên cứu thêm về Abstract class (tương ứng extend class) và Interface (tương ứng implement interface), super và this trong Java




## 8. Tóm tắt
- OOP (Lập trình hướng đối tượng) là một mô hình lập trình dựa trên khái niệm về "đối tượng".
- Lớp (Class) là một bản thiết kế cho các đối tượng. Nó định nghĩa các thuộc tính và phương thức mà các đối tượng của lớp đó sẽ có.
- Đối tượng (Object) là một thể hiện của một lớp. Nó có trạng thái và hành vi được định nghĩa bởi lớp.
- Tính đóng gói (Encapsulation) là quá trình che giấu thông tin và bảo vệ dữ liệu của một đối tượng khỏi sự truy cập từ bên ngoài.
- Tính kế thừa (Inheritance) cho phép một lớp mới (con) kế thừa tất cả các thuộc tính và phương thức từ lớp hiện có (cha).


