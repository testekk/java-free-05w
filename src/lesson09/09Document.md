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
   1. Tính đa hình (Polymorphism): Là khả năng của các đối tượng thuộc các lớp khác nhau có thể được xử lý cùng phương thức với các hành vi khác nhau.
   Ví dụ: Cùng tiếng kêu của các động vật, nhưng mỗi con lại có tiếng kêu khác nhau.
      1. Tính đa hình trong Java có thể thực hiện thông qua việc sử dụng lớp cha và lớp con.
      2. Ví dụ: Tạo một lớp cha Animal với phương thức sound() và các lớp con Dog, Cat kế thừa từ lớp cha Animal và triển khai phương thức sound() theo cách khác nhau.
      3. Khi gọi phương thức sound() của lớp cha Animal thông qua đối tượng của lớp con Dog, Cat thì phương thức sound() sẽ được triển khai theo cách của lớp con.
      
```java
// Lớp cha
class Animal {
    void sound() {
        System.out.println("Animal is making a sound");
    }   
}

// Lớp con kế thừa từ lớp cha và triển khai phương thức sound với thông tin và logic khác
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog is making a sound");
    }
}

// Lớp con kế thừa từ lớp cha và triển khai phương thức sound với thông tin và logic khác
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat is making a sound");
    }
}

```
- Overriding & Overloading <br/>
  ![img.png](../../resource/img092.png)
  - Overriding: Là việc ghi đè phương thức của lớp cha trong lớp con.
    - Phương thức trong lớp con có cùng tên, cùng tham số và cùng kiểu dữ liệu với phương thức trong lớp cha.
    - Phương thức trong lớp con phải có quyền truy cập rộng hơn hoặc bằng phương thức trong lớp cha.
    - Phương thức trong lớp con không thể có quyền truy cập nhỏ hơn phương thức trong lớp cha.

  - Overloading: Là việc tạo nhiều phương thức cùng tên nhưng khác nhau về số lượng tham số, kiểu dữ liệu của tham số hoặc cả hai.
    - Phương thức trong cùng một lớp có cùng tên nhưng khác nhau về số lượng tham số, kiểu dữ liệu của tham số hoặc cả hai.
    - Phương thức trong cùng một lớp có thể có cùng tên nhưng khác nhau về kiểu trả về.
    - Phương thức trong cùng một lớp có thể có cùng tên nhưng khác nhau về kiểu trả về và kiểu dữ liệu của tham số.
    - Phương thức trong cùng một lớp có thể có cùng tên nhưng khác nhau về kiểu trả về, kiểu dữ liệu của tham số và số lượng tham số.
    ```java
    public class Calculator {
        // Phương thức cùng tên nhưng khác tham số
        public int add(int a, int b) {
            return a + b;
        }
        
        public int add(int a, int b, int c) {
            return a + b + c;
        }
        
        // Phương thức cùng tên nhưng khác kiểu trả về
        public double add(double a, double b) {
            return a + b;
        }
        
        // Phương thức cùng tên nhưng khác kiểu trả về và tham số
        public double add(int a, double b) {
            return a + b;
        }
    }
    ```


   2. Tính trừu tượng (Abstraction): Là quá trình ẩn đi các chi tiết triển khai và chỉ hiển thị các chức năng cần thiết của đối tượng có nghĩa là chỉ hiển thị các phương thức cần thiết của đối tượng.
```java
// Lớp trừu tượng
public abstract class Animal {
    // Phương thức trừu tượng
    public abstract void makeSound();

    // Phương thức thông thường
    public void sleep() {
        System.out.println("Animal is sleeping");
    }
}

// Lớp con kế thừa từ lớp trừu tượng
public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

// Sử dụng lớp trừu tượng
public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound(); // Output: Woof! Woof!
        dog.sleep();     // Output: Animal is sleeping
    }
} 
   ```
Mục đích:
- Tạo ra các Abstract class và Interface để tái sử dụng và cho các lớp con kế thừa.
- Giúp giảm sự phức tạp của chương trình, ẩn đi các chi tiết triển khai và chỉ hiển thị các chức năng cần thiết của đối tượng.
Ví dụ: Tạo ra một lớp trừu tượng Currency và các loại tiền tệ khác kế thừa các phương thức của lớp Currency. <br/>
![img.png](../../resource/img09.png)
```java
// Lớp trừu tượng
public abstract class Currency {
    // Phương thức trừu tượng
    public abstract void displayCurrency();
}

// Lớp con kế thừa từ lớp trừu tượng
public class USD extends Currency {
    @Override
    public void displayCurrency() {
        System.out.println("USD");
    }
}

// Lớp con kế thừa từ lớp trừu tượng
public class VND extends Currency {
    @Override
    public void displayCurrency() {
        System.out.println("VND");
    }
}
```

- Trong tính chất này, các bạn sẽ cần làm quen với abstract class và interface.
  - Abstract class: Là một lớp mà không thể tạo ra đối tượng từ nó, nó chỉ được sử dụng để kế thừa.
    - Các phương thức của abstract class có thể là abstract hoặc không.
    - Các phương thức abstract không có thân hàm, chỉ có khai báo.
    ```java
    public abstract class Animal {
        public abstract void makeSound();           // Phương thức trừu tượng, không có thân hàm
        public void eat() {
            System.out.println("Animal is eating"); // Phương thức thông thường, có thân hàm triển khai logic
        }
    }
    ```
    - Các phương thức không phải abstract thì có thể có thân hàm.
  - Interface: Là một tập hợp các phương thức mà một lớp phải thực thi khi nó kế thừa từ interface đó.
    - Interface không thể chứa các phương thức có thân hàm.
    - Interface không thể chứa các thuộc tính.
    - Một lớp có thể kế thừa từ nhiều interface.
    ```java
    public interface Animal {
        void makeSound(); // Phương thức trừu tượng, không có thân hàm
    }
    
    public class Dog implements Animal {
        @Override
        public void makeSound() {
            System.out.println("Woof! Woof!");
        }
    }
    ```
    
## 8. Tóm tắt
- OOP (Lập trình hướng đối tượng) là một mô hình lập trình dựa trên khái niệm về "đối tượng".
- Lớp (Class) là một bản thiết kế cho các đối tượng. Nó định nghĩa các thuộc tính và phương thức mà các đối tượng của lớp đó sẽ có.
- Đối tượng (Object) là một thể hiện của một lớp. Nó có trạng thái và hành vi được định nghĩa bởi lớp.
- Tính đa hình (Polymorphism) là khả năng của các đối tượng thuộc các lớp khác nhau có thể được xử lý cùng phương thức với các hành vi khác nhau.
- Tính trừu tượng (Abstraction) là quá trình ẩn đi các chi tiết triển khai và chỉ hiển thị các chức năng cần thiết của đối tượng.

