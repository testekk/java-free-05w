# Giới thiệu về String và các function cơ bản

## String trong Java
- Trong Java, `String` là một lớp đại diện cho chuỗi ký tự. 
- Chuỗi trong Java là bất biến, nghĩa là một khi chuỗi được tạo ra, nó không thể thay đổi. Các thao tác trên chuỗi sẽ tạo ra một đối tượng chuỗi mới. 
- String không phải là biến nguyên thủy nhưng được sử dụng phổ biến trong Java, vì vậy nó được xem xét như một kiểu dữ liệu cơ bản. 
- String khác char vì String là một đối tượng trong khi char là một kiểu dữ liệu nguyên thủy, String có thể bao gồm nhiều char.

## Khai báo và khởi tạo String
Bạn có thể khai báo và khởi tạo một chuỗi bằng cách sử dụng dấu ngoặc kép hoặc từ khóa `new`.
Bạn có thể tìm hiểu thêm thông tin [tại đây](https://kungfutech.edu.vn/bai-viet/java/string-trong-java)

```java
String str1 = "Hello, World!";
String str2 = new String("Hello, World!");
```

## Các phương thức của String
### 1. length()
Trả về độ dài của chuỗi.
```java
String str = "Testek";
int length = str.length(); // length = 6
```
### 2. charAt(int index)
Trả về ký tự tại vị trí chỉ định, lưu ý vị trí sẽ được tính từ 0.
```java
String str = "Testek";
// str.charAt(0) = 'T'
char ch = str.charAt(1); // ch = 'e'
```
### 3. substring(int beginIndex, int endIndex)
Trả về một phần của chuỗi từ beginIndex đến endIndex.
```java
String str = "Testek";
String subStr = str.substring(2, 5); // subStr = "ste"
```

### 4. contains(CharSequence s)
Kiểm tra xem chuỗi có chứa chuỗi con chỉ định hay không.
```java
String str = "Testek";
boolean isContain = str.contains("es");     // isContain = true
boolean isNotContain = str.contains("esa"); // isNotContain = false
```

### 5. equals(Object obj)
So sánh chuỗi với một đối tượng khác.
```java
String str1 = "Testek";
String str2 = "Testek";
boolean isEqual = str1.equals(str2); // isEqual = true
```
Note: Trong String, khi so sánh == và equals sẽ có sự khác biệt, == so sánh về địa chỉ của đối tượng trong bộ nhớ, còn equals so sánh về giá trị của đối tượng.

### 6. equalsIgnoreCase(String anotherString)
So sánh chuỗi với chuỗi khác mà không phân biệt chữ hoa chữ thường.
```java
String str1 = "Testek";
String str2 = "testek";
boolean isEqual = str1.equalsIgnoreCase(str2); // isEqual = true
```

### 7. toUpperCase() và toLowerCase()
Chuyển đổi chuỗi thành chữ hoa hoặc chữ thường.
```java
String str = "Testek";
String upperStr = str.toUpperCase(); // upperStr = "TESTEK"
String lowerStr = str.toLowerCase(); // lowerStr = "testek"
```
### 8. trim()
Loại bỏ khoảng trắng ở đầu và cuối chuỗi.
```java
String str = " Testek ";
String trimStr = str.trim(); // trimStr = "Testek"
```
### 9. replace(CharSequence target, CharSequence replacement)
Thay thế tất cả các chuỗi con khớp với chuỗi đích bằng chuỗi thay thế.
```java
String str = "Testek - KIỂM THỬ THỰC CHIẾN";
String newStr = str.replace("Testek", "Testek - Automation Test");  
// newStr = "Testek - Automation Test - KIỂM THỬ THỰC CHIẾN"
```
### 10. split(String regex)
Chia chuỗi thành một mảng các chuỗi con dựa trên biểu thức chính quy.
```java
String str = "Testek - KIỂM THỬ THỰC CHIẾN";
String[] arrStr = str.split(" - "); // arrStr = ["Testek", "KIỂM THỬ THỰC CHIẾN"]
```

## 11. Tóm tắt
- String trong Java là một lớp đại diện cho chuỗi ký tự.
- Chuỗi trong Java là bất biến, nghĩa là một khi chuỗi được tạo ra, nó không thể thay đổi.
- Các phương thức của String giúp thực hiện các thao tác trên chuỗi như lấy độ dài, lấy ký tự tại vị trí chỉ định, chuyển đổi chữ hoa chữ thường, thay thế chuỗi con, chia chuỗi, ...
- Khi so sánh chuỗi, bạn nên sử dụng equals() hoặc equalsIgnoreCase() thay vì ==.
- Để tìm hiểu thêm về các phương thức của String, bạn có thể xem tại [Java String Class](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)
- String rất quan trọng trong Java, bạn cần nắm vững các phương thức của String để xử lý chuỗi một cách hiệu quả.