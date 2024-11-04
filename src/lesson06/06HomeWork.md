# Tiêu đề
## Mục tiêu
- Nắm vững cách khai báo, khởi tạo và sử dụng các biến trong Java.

## Thực hành
1.Xây dựng một ứng dụng cho phép tính tiền cho vay lãi của một ngân hàng. 
- Ứng dụng cho phép nhập vào 3 tham số: số lượng tiền cho vay, tỉ lệ lãi suất theo tháng, số tháng cho vay. 
- Ứng dụng sẽ hiển thị tổng số tiền có được khi hết thời hạn cho vay.
- Cách tính tiền lãi:
  - Tiền gửi có kỳ hạn là loại tiền gửi tiết kiệm chỉ có thể rút ra sau một khoảng thời gian nhất định người gửi tiền đã cam kết với ngân hàng. Bên ngân hàng sẽ đưa ra nhiều mức kỳ hạn khác nhau để khách hàng có thể chọn lựa theo tuần, tháng, quý, năm.
- Công thức:
  - Số_tiền_lãi = Số_tiền_gửi *  tỉ_lệ_lãi_suất (% năm) / 12 * số_tháng_gửi
2. Trong toán học, nếu số nguyên a chia hết cho số nguyên b thì số b được gọi là ước của số nguyên a, a được gọi là bội của b. 
Số nguyên dương b lớn nhất là ước của cả hai số nguyên a, b được gọi là ước số chung lớn nhất (ƯCLN) của a và b. 
- Trong trường hợp cả hai số nguyên a và b đều bằng 0 thì chúng không có ƯCLN vì khi đó mọi số tự nhiên khác không đều là ước chung của a và b. 
- Nếu chỉ một trong hai số a hoặc b bằng 0, số kia khác 0 thì ƯCLN của chúng bằng giá trị tuyệt đối của số khác 0.
Bạn hãy phát triển một ứng dụng để tìm ước số chung lớn nhất của hai số.

3. Hãy phát triển một ứng dụng hiển thị một menu cho phép người dùng lựa chọn hiển thị các hình. Menu gồm các lựa chọn như sau
- Menu:
  - Print the rectangle 
  - Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)
  - Print isosceles triangle 
  - Exit

Lưu ý: biểu diễn các hình có thể sử dụng ký hiệu * hoặc một ký hiệu khác.
4. Chuyển đổi số từ hệ cơ số 10 sang hệ cơ số 2

## Hướng dẫn
1. Bài 1: Xây dựng một ứng dụng cho phép tính tiền cho vay lãi của một ngân hàng.
   - Sử dụng lớp `Scanner` để nhập số lượng tiền cho vay, tỉ lệ lãi suất theo tháng, số tháng cho vay từ bàn phím.
   - Sử dụng cấu trúc điều kiện `if` để kiểm tra số lượng tiền cho vay, tỉ lệ lãi suất theo tháng, số tháng cho vay.
   - Sử dụng công thức để tính tiền lãi.
   - In ra tổng số tiền có được khi hết thời hạn cho vay.
   - Ví dụ:
     - Số tiền cho vay: 1000000
     - Tỉ lệ lãi suất: 0.1
     - Số tháng cho vay: 12
     - Tổng số tiền có được khi hết thời hạn cho vay: 1120000
     - Lưu ý: 0.1 là 10%.
  
2. Bài 2: Tìm UCLN của hai số nguyên.
   - Sử dụng lớp `Scanner` để nhập hai số nguyên từ bàn phím.
   - Sử dụng cấu trúc điều kiện `if` để kiểm tra hai số nguyên.
   - Sử dụng vòng lặp để tìm ước số chung lớn nhất của hai số nguyên.
     - ƯCLN của hai số nguyên a, b là số nguyên dương lớn nhất mà cả hai số a, b đều chia hết cho nó.
     - ƯCLN của hai số nguyên a, b được ký hiệu là gcd(a, b).
     - Công thức: gcd(a, b) = gcd(b, a % b).
     - Điều kiện dừng: a % b = 0.
   
   - In ra ước số chung lớn nhất của hai số nguyên.
   - Ví dụ:
     - Số nguyên a: 12
     - Số nguyên b: 18
     - ƯCLN của 12 và 18 là 6.

3. In ra các hình theo yêu cầu của người dùng.
   - Sử dụng lớp `Scanner` để nhập lựa chọn từ bàn phím.
   - Sử dụng cấu trúc điều kiện `if-else` hoặc `switch case` để kiểm tra lựa chọn của người dùng.
   - Sử dụng vòng lặp để in các hình.
     - In hình chữ nhật
       - Sử dụng 2 vòng lặp lồng nhau.
       - Vòng lặp ngoài hiển thị số dòng (chiều dài), vòng lặp trong hiển thị số cột (chiều rộng).
       - Ví dụ:
         ```
            * * * * * * *
            * * * * * * *
            * * * * * * *
            ```
        - In hình tam giác vuông, có cạnh góc vuông ở botton-left
          - Sử dụng 2 vòng lặp.
          - Vòng lặp ngoài hiển thị số dòng (chiều dài), vòng lặp trong hiển thị số lượng * có trong mỗi dòng.
          - Ví dụ:
            ```
            *
            * *
            * * *
            * * * *
            * * * * *
            ```
        - In hình tam giác vuông, có cạnh góc vuông ở top-left
          - Sử dụng 2 vòng lặp.
          - Vòng lặp ngoài hiển thị số dòng (chiều dài), vòng lặp trong hiển thị số lượng * có trong mỗi dòng.
          - Ví dụ:
            ```
            * * * * *
            * * * *
            * * *
            * *
            *
            ```
        - In hình tam giác cân
          - Sử dụng 2 vòng lặp bên trong 1 vòng lặp.
          - Vòng lặp ngoài hiển thị số dòng (chiều dài), 2 vòng lặp bên trong in ra dấu *.

   - In hình vuông
      - Sử dụng 2 vòng lặp.
      - Vòng lặp ngoài hiển thị số dòng (chiều dài), vòng lặp trong hiển thị số lượng * có trong mỗi dòng.
        - Ví dụ:
          ```
            * * * * * * *
            * * * * * * *
            * * * * * * *
            * * * * * * *
            * * * * * * *
            * * * * * * *
            * * * * * * *
            ```

4. Bài 4: Chuyển đổi số từ hệ cơ số 10 sang hệ cơ số 2.
- Sử dụng lớp `Scanner` để nhập số nguyên từ bàn phím.
- Sử dụng cấu trúc điều kiện `if` để kiểm tra số nguyên.
- Sử dụng vòng lặp để chuyển đổi số từ hệ cơ số 10 sang hệ cơ số 2.
  - Chia số nguyên cho 2 và lưu phần dư.
  - Lặp lại cho đến khi số nguyên bằng 0.
  - In ra số nguyên ở hệ cơ số 2.
  - Ví dụ:
    - Số nguyên: 10
    - Số nguyên ở hệ cơ số 2: 1010.