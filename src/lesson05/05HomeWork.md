# Bài Tập Thực Hành về Collection trong Java

## Mục tiêu
- Hiểu và sử dụng các Collection trong Java như `ArrayList`, `LinkedList`, `HashSet`, `TreeSet`, `HashMap`, `TreeMap`.

## Thực hành
1. Bài 1: Tạo một danh sách các số nguyên và in ra các phần tử trong danh sách.
2. Bài 2: Tạo một danh sách các chuỗi và in ra các phần tử trong danh sách.
3. Bài 3: Tạo một danh sách các số nguyên và tính tổng các phần tử trong danh sách.
4. Tìm số nguyên tố trong dãy số cho trước
5. In ra dãy số Fibonacci đến số thứ N được nhập từ bàn phím và tính tổng của dãy số đó
6. Tính tổng các số chia hết cho 3 hoặc 5 trong khoảng từ 1 đến N được nhập từ bàn phím

## Hướng dẫn
1. Bài 1: Tạo một danh sách các số nguyên và in ra các phần tử trong danh sách.
   - Sử dụng lớp `ArrayList` để tạo một danh sách các số nguyên.
   - Thêm các số nguyên vào danh sách.
   - Duyệt qua danh sách và in ra các phần tử.

2. Bài 2: Tạo một danh sách các chuỗi và in ra các phần tử trong danh sách.
    - Sử dụng lớp `ArrayList` để tạo một danh sách các chuỗi.
    - Thêm các chuỗi vào danh sách.
    - Duyệt qua danh sách và in ra các phần tử.
    - Lưu ý: Bạn có thể thay thế `ArrayList` bằng `LinkedList`.
    - Lưu ý: Bạn có thể thay thế kiểu dữ liệu `String` bằng bất kỳ kiểu dữ liệu nào.
   
3. Bài 3: Tạo một danh sách các số nguyên và tính tổng các phần tử trong danh sách.
    - Sử dụng lớp `ArrayList` để tạo một danh sách các số nguyên.
    - Thêm các số nguyên vào danh sách.
    - Duyệt qua danh sách và tính tổng các phần tử.
    - In ra tổng các phần tử trong danh sách.
   
4. Tìm số nguyên tố trong dãy số cho trước
    - Sử dụng vòng lặp `for` để duyệt qua các số từ 1 đến N.
    - Sử dụng một phương thức để kiểm tra số nguyên tố.
    - In ra các số nguyên tố trong khoảng từ 1 đến N.
    - Lưu ý: 
      - Số nguyên tố là số chỉ chia hết cho 1 và chính nó.
      - Số 1 không phải là số nguyên tố.
      - Số 2 là số nguyên tố.
      
5. In ra dãy số Fibonacci đến số thứ N được nhập từ bàn phím
    - Sử dụng lớp `Scanner` để nhập số nguyên N từ bàn phím.
    - Sử dụng vòng lặp `for` hoặc `while` để tính dãy số Fibonacci.
    - In ra dãy số Fibonacci đến số thứ N.
    - Dãy số Fibonacci bắt đầu từ 0, 1, 1, 2, 3, 5, 8, 13, 21, ...
    - Số Fibonacci thứ n được tính bằng tổng của hai số Fibonacci trước đó.
    - Ví dụ: N = 5, dãy số Fibonacci: 0, 1, 1, 2, 3.
   
6. Tính tổng các số chia hết cho 3 hoặc 5 trong khoảng từ 1 đến N được nhập từ bàn phím
    - Sử dụng lớp `Scanner` để nhập số nguyên N từ bàn phím.
    - Sử dụng vòng lặp `for` hoặc `while` để tính tổng các số chia hết cho 3 hoặc 5.
    - In ra tổng các số chia hết cho 3 hoặc 5 trong khoảng từ 1 đến N.
    - Lưu ý: 
      - Số chia hết cho 3 là số mà khi chia cho 3 dư 0.
      - Số chia hết cho 5 là số mà khi chia cho 5 dư 0.
      - Ví dụ: N = 10, tổng các số chia hết cho 3 hoặc 5: 3 + 5 + 6 + 9 + 10 = 33.