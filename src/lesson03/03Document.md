# Tổng quan về điều kiện (if) trong Java

## Cấu trúc điều kiện if
- Câu lệnh `if` trong Java được sử dụng để kiểm tra một điều kiện. 
  - Nếu điều kiện đúng, khối lệnh bên trong `if` sẽ được thực thi.
  - Nếu điều kiện sai, khối lệnh bên trong `if` sẽ bị bỏ qua.

## Cú pháp
    
```java
    if (condition) {
        // Khối lệnh được thực thi nếu điều kiện đúng
    }
```
Ví dụ:
```java
    int age = 18;
    if (age >= 18) {
        System.out.println("Bạn đủ tuổi bầu cử.");
    }
```
## 1. Cấu trúc điều kiện if-else
Câu lệnh if-else cho phép thực thi một khối lệnh khác nếu điều kiện trong if là sai.


Cú pháp:
```java
    if (condition) {
        // Khối lệnh được thực thi nếu điều kiện đúng
    } else {
        // Khối lệnh được thực thi nếu điều kiện sai
    }
```

Ví dụ:
```java
    int age = 15;
    if (age >= 18) {
        System.out.println("Bạn đủ tuổi bầu cử.");
    } else {
        System.out.println("Bạn chưa đủ tuổi bầu cử.");
    }
```

## 2. Cấu trúc điều kiện if-else if-else
Câu lệnh if-else if-else cho phép kiểm tra nhiều điều kiện.
Cú pháp:
```java
    if (condition1) {
        // Khối lệnh được thực thi nếu điều kiện 1 đúng
    } else if (condition2) {
        // Khối lệnh được thực thi nếu điều kiện 2 đúng
    } else {
        // Khối lệnh được thực thi nếu tất cả các điều kiện đ���u sai
    }
```
Ví dụ:
```java
    int age = 15;
    if (age >= 18) {
        System.out.println("Bạn đủ tuổi bầu cử.");
    } else if (age >= 16) {
        System.out.println("Bạn sắp đủ tuổi bầu cử.");
    } else {
        System.out.println("Bạn chưa đủ tuổi bầu cử.");
    }
```

## 3. Cấu trúc điều kện lồng nhau
Câu lệnh if có thể được lồng nhau bên trong nhau.
Cú pháp:
```java
    if (condition1) {
        if (condition2) {
            // Khối lệnh được thực thi nếu cả 2 điều kiện đúng
        }
    }
```
Ví dụ:
```java
    int age = 15;
    boolean isStudent = true;
    if (age >= 18) {
        if (isStudent) {
            System.out.println("Bạn là học sinh và đủ tuổi bầu cử.");
        } else {
            System.out.println("Bạn đủ tuổi bầu cử.");
        }
    } else {
        System.out.println("Bạn chưa đủ tuổi bầu cử.");
    }
    
    // In ra "Bạn chưa đủ tuổi bầu cử."
```

## 4. Câu lệnh điều kiện rút gọn (Ternary Operator)
Câu lệnh điều kiện rút gọn giúp viết một câu lệnh if-else ngắn gọn hơn.
Cú pháp:
```java
    variable = (condition) ? expressionTrue : expressionFalse;
```
Ví dụ:
```java
    int age = 15;
    String status = (age >= 18) ? "Bạn đủ tuổi bầu cử." : "Bạn chưa đủ tuổi bầu cử.";
    System.out.println(status);     // In ra "Bạn chưa đủ tuổi bầu cử."
```
## 5. Switch Case
Câu lệnh `switch` được sử dụng để kiểm tra giá trị của biến và thực thi các khối lệnh tương ứng.
Cú pháp:
```java
    switch (variable) {
        case value1:
            // Khối lệnh được thực thi nếu variable == value1
            break;
        case value2:
            // Khối lệnh được thực thi nếu variable == value2
            break;
        default:
            // Khối lệnh được thực thi nếu variable không bằng bất kỳ giá trị nào
    }
```
Ví dụ:
```java
    int day = 3;
    String dayName;
    switch (day) {
        case 1:
            dayName = "Monday";
            break;
        case 2:
            dayName = "Tuesday";
            break;
        case 3:
            dayName = "Wednesday";
            break;
        default:
            dayName = "Invalid day";
    }
    System.out.println(dayName);    // In ra "Wednesday"
```
Lưu  ý:
- Sử dụng break để kết thúc mỗi case. Nếu không có break, các case phía sau sẽ được thực thi.
- Default là trường hợp mặc định, được thực thi nếu không có case nào khớp với giá trị của biến.
- Switch case phù hợp với các dữ liệu cố định, không phải dữ liệu liên tục như số thực.

## 6. Tóm tắt
- Cấu trúc điều kiện `if` được sử dụng để kiểm tra một điều kiện.
- Cấu trúc `if-else` cho phép thực thi một khối lệnh khác nếu điều kiện trong `if` là sai.
- Cấu trúc `if-else if-else` cho phép kiểm tra nhiều điều kiện.
- Câu lệnh điều kiện rút gọn giúp viết một câu lệnh if-else ngắn gọn hơn.
- Câu lệnh if có thể được lồng nhau bên trong nhau.
- Sử dụng cẩn thận câu lệnh điều kiện rút gọn để không làm cho mã nguồn khó đọc.
- Sử dụng comment để giải thích mã nguồn rõ ràng.
- Thực hành nhiều để nắm vững cách sử dụng cấu trúc điều kiện.


