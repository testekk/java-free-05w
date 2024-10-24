# Tổng quan về vòng lặp (loop) trong Java

## Tổng quan
- Vòng lặp (Loop) là một cấu trúc lặp đi lặp lại một khối lệnh nhiều lần, và thường xuyên được sử dụng trong lập trình để thực hiện các công việc.
- Chúng bao gồm:
    - Vòng lặp `for`
    - Vòng lặp `while`
    - Vòng lặp `do-while`

## 1. Vòng lặp `for`
- Vòng lặp `for` được sử dụng khi bạn biết trước số lần lặp.
- Có các loại vòng lặp `for`:
    - Vòng lặp `for` cơ bản
    - Vòng lặp `for-each`
    - Sử dụng lambda trong vòng lặp `for` (Áp dụng từ Java 8)
- Lưu ý: 
  - Vòng lặp `for` sẽ được thực thi từ index = 0 đến index = n - 1, với n là số lần lặp.
  - Sử dụng `break` để thoát khỏi vòng lặp.
  - Sử dụng `continue` để bỏ qua lần lặp hiện tại và tiếp tục với lần lặp tiếp theo.
  - Vòng lặp `for` được sử dụng với mảng, danh sách hoặc bất kỳ cấu trúc dữ liệu nào có thể lặp lại.
  - `foreach` là một cách viết ngắn gọn của vòng lặp `for` để lặp qua các phần tử của một mảng hoặc danh sách.
  - Khi sử dụng `foreach`, bạn không cần phải quan tâm đến việc quản lý index.
  - Sử dụng lambda trong vòng lặp `for` giúp viết mã ngắn gọn hơn.

###Cú pháp
```java
    for (initialization; condition; update) {
        // Khối lệnh được thực thi
    }
    // Trong đó:
    //  - initialization: Khởi tạo biến đếm.
    //  - condition: Điều kiện kiểm tra trước mỗi lần lặp.
    //  - update: Cập nhật biến đếm sau mỗi lần lặp.
```
### Ví dụ: Vòng lặp `for` với index
```java
    for (int i = 0; i < 5; i++) {
        System.out.println("Hello, World!");
    }
    // In ra "Hello, World!" 5 lần, vì vòng lặp sẽ được chạy từ i = 0 đến i = 4.
 ```
### Ví dụ: Vòng lặp `for` với foreach
```java
    int[] numbers = {1, 2, 3, 4, 5};    // Đât là một array chứa các số nguyên.
    for (int number : numbers) {
        System.out.println(number);
    }
    // In ra các phần tử trong mảng numbers.
    //  - Lần lặp đầu tiên: number = 1
    //  - Lần lặp thứ hai: number = 2
    //  - Lần lặp thứ ba: number = 3
    //  - Lần lặp thứ tư: number = 4
    //  - Lần lặp thứ năm: number = 5
```
### Sử dụng lambda trong vòng lặp `for`
```java
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);    // Đây là một danh sách chứa các số nguyên.
    numbers.forEach(number -> System.out.println(number));
    // In ra các phần tử trong danh sách numbers.
    //  - Lần lặp đầu tiên: number = 1
    //  - Lần lặp thứ hai: number = 2
    //  - Lần lặp thứ ba: number = 3
    //  - Lần lặp thứ tư: number = 4
    //  - Lần lặp thứ năm: number = 5
```

### Sử dụng `break` và `continue` trong vòng lặp `for`
```java
    for (int i = 0; i < 5; i++) {
        if (i == 2) {
            continue;    // Bỏ qua lần lặp hiện tại nếu i = 2 và tiếp tục với lần lặp tiếp theo (i = 3).
        }
        if (i == 4) {
            break;    // Thoát khỏi vòng lặp nếu i = 4.
        }
        System.out.println(i);
    }
    // In ra:
    //  - 0
    //  - 1
    //  - 3
```

## 2. Vòng lặp `while`
- Vòng lặp while được sử dụng khi bạn không biết trước số lần lặp và muốn lặp cho đến khi một điều kiện nào đó không còn đúng
- Vòng lặp `while` được sử dụng khi số lần lặp không xác định trước.

### Cú pháp
```java
    while (condition) {
        // Khối lệnh được thực thi nếu điều kiện đúng
    }
```
### Ví dụ:
```java
    int i = 0;
    while (i < 5) {
        System.out.println(i);
        i++;
    }
    // In ra các số từ 0 đến 4.
```

### Ví dụ: Vòng lặp `while` vô hạn
```java
    while (true) {
        System.out.println("Hello, World!");
    }
    // In ra "Hello, World!" vô hạn.
```

### Sử dụng `break`  trong vòng lặp `while`
```java
    int i = 0;
    while (i < 5) {
        if (i == 4) {
            break;    // Thoát khỏi vòng lặp nếu i = 4.
        }
        System.out.println(i);
        i++;
    }
    // In ra:
    //  - 0
    //  - 1
    //  - 2
    //  - 3
```

## 3. Vòng lặp `do-while`
- Vòng lặp do-while tương tự như vòng lặp while, nhưng khối lệnh sẽ được thực thi ít nhất một lần trước khi điều kiện được kiểm tra.
- Vòng lặp `do-while` được sử dụng khi bạn muốn thực thi một khối lệnh ít nhất một lần.

### Cú pháp
```java
    do {
        // Khối lệnh được thực thi ít nhất một lần
    } while (condition);
```

### Ví dụ:
```java
    int i = 0;
    do {
        System.out.println(i);
        i++;
    } while (i < 5);
    // In ra các số từ 0 đến 4.
```

### Sử dụng `break` trong vòng lặp `do-while`
```java
    int i = 0;
    do {
        if (i == 4) {
            break;    // Thoát khỏi vòng lặp nếu i = 4.
        }
        System.out.println(i);
        i++;
    } while (i < 5);
    // In ra:
    //  - 0
    //  - 1
    //  - 2
    //  - 3
```


## 4. Tóm tắt
- Vòng lặp (Loop) là một cấu trúc lặp đi lặp lại một khối lệnh nhiều lần.
- Có 3 loại vòng lặp chính trong Java: `for`, `while`, và `do-while`.
- Vòng lặp `for` được sử dụng khi bạn biết trước số lần lặp.
- Vòng lặp `while` được sử dụng khi số lần lặp không xác định trước.
- Vòng lặp `do-while` tương tự như vòng lặp `while`, nhưng khối lệnh sẽ được thực thi ít nhất một lần trước khi điều kiện được kiểm tra.
- Sử dụng `break` để thoát khỏi vòng lặp và `continue` để bỏ qua lần lặp hiện tại và tiếp tục với lần lặp tiếp theo.
- 

