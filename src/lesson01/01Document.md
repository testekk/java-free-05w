# Tổng quan về các biến trong Java

## 1. Khai báo biến
Trong Java, biến là một tên đại diện cho một vùng nhớ để lưu trữ dữ liệu. Để khai báo một biến, bạn cần chỉ định kiểu dữ liệu và tên biến.

```java
int age;
double salary;
char grade;
boolean isActive;
String name;
```
## 2. Khởi tạo biến
   Bạn có thể khởi tạo biến ngay khi khai báo hoặc khởi tạo sau khi khai báo.

```java
int age = 25;
double salary = 50000.0;
char grade = 'A';
boolean isActive = true;
String name = "John Doe";

// Khởi tạo sau khi khai báo
int height;
height = 180;
```

## 3. Sử dụng biến
Biến có thể được sử dụng trong các biểu thức và câu lệnh để thực hiện các phép toán và thao tác.
```java
int a = 5;
int b = 10;
int sum = a + b; // Phép cộng
int difference = b - a; // Phép trừ
int product = a * b; // Phép nhân
double quotient = (double) b / a; // Phép chia

boolean isEqual = (a == b); // Phép so sánh
boolean isGreater = (a > b); // Phép so sánh
```

## 4. Các kiểu dữ liệu cơ bản
Java cung cấp nhiều kiểu dữ liệu cơ bản để lưu trữ các loại dữ liệu khác nhau như số nguyên, số thực, ký tự, chuỗi và logic.
- char: Ký tự (2 bytes)
```java
char a ='A';
```
- byte: Số nguyên (1 byte)
```java
byte b = 100;
```
- short: Số nguyên (2 bytes)
```java
short s = 1000;
```
- int: Số nguyên (4 bytes)
```java
int i = 10000;
```
- long: Số nguyên (8 bytes)
```java
long l = 100000L;
```
- float: Số thực (4 bytes)
```java
float f = 10.5f;
```
- double: Số thực (8 bytes)
```java
double d = 10.5;
```
- boolean: Giá trị đúng/sai (1 bit)
```java
boolean isTrue = true;
```
- String: Chuỗi ký tự (đối tượng) - không phải dạng nguyên thủy nhưng được sử dụng phổ biến
```java
String str = "Hello, World!";
```

## 5. Hằng số
Hằng số là một giá trị không thay đổi trong suốt quá trình thực thi của chương trình. Để khai báo hằng số, bạn sử dụng từ khóa `final`.

```java
final double PI = 3.14159;
final int MAX_SIZE = 100;
```

## 6. Tên biến
Tên biến trong Java phải tuân thủ các quy tắc sau:
- Bắt đầu bằng một chữ cái hoặc dấu gạch dưới.
- Không chứa khoảng trắng hoặc ký tự đặc biệt ngoại trừ dấu gạch dưới (_).
- Không được trùng với các từ khóa của Java như `int`, `double`, `class`,...
- Phân biệt chữ hoa và chữ thường (case-sensitive).
- Có ý nghĩa và mô tả rõ ràng về mục đích sử dụng.
- Theo quy tắc CamelCase hoặc snake_case.

```java
int studentAge;
double studentGPA;
String studentName;
```
## 7. Phạm vi của biến
Phạm vi của biến xác định nơi mà biến có thể truy cập và sử dụng trong chương trình. Có 3 loại phạm vi biến trong Java:
- Biến cục bộ (local variables): Biến được khai báo trong một phương thức và chỉ có thể truy cập trong phương thức đó.
- Biến toàn cục (instance variables): Biến được khai báo trong một lớp và có thể truy cập từ bất kỳ phương thức nào của lớp đó.
- Biến tĩnh (static variables): Biến được khai báo với từ khóa `static` và có thể truy cập mà không cần tạo đối tượng của lớp.

```java
public class ScopeExample {
    // Biến toàn cục
    int globalVar = 10;
    static int staticVar = 20;

    public void method() {
        // Biến cục bộ
        int localVar = 30;
        System.out.println(localVar);
    }

    public static void main(String[] args) {
        ScopeExample obj = new ScopeExample();
        System.out.println(obj.globalVar);
        System.out.println(staticVar);
    }
}
```

## 8. Tóm tắt
- Biến là một tên đại diện cho một vùng nhớ để lưu trữ dữ liệu.
- Để khai báo một biến, bạn cần chỉ định kiểu dữ liệu và tên biến.
- Biến có thể được khởi tạo ngay khi khai báo hoặc sau khi khai báo.
- Biến có thể được sử dụng trong các biểu thức và câu lệnh để thực hiện các phép toán và thao tác.
- Java cung cấp nhiều kiểu dữ liệu cơ bản như số nguyên, số thực, ký tự, chuỗi và logic.
- Hằng số là một giá trị không thay đổi trong suốt quá trình thực thi của chương trình.
- Tên biến trong Java phải tuân thủ các quy tắc về cú pháp và quy tắc đặt tên.
- Phạm vi của biến xác định nơi mà biến có thể truy cập và sử dụng trong chương trình.
- Có 3 loại phạm vi biến trong Java: biến cục bộ, biến toàn cục và biến tĩnh.

