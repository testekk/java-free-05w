# Bài Tập Thực Hành cho Cấu Trúc Điều Kiện If trong Java

## Mục tiêu
- Hiểu và sử dụng các cấu trúc điều kiện `if`, `if-else`, `if-else if-else`, và toán tử điều kiện (ternary operator) trong Java.

## Thực hành
1. Bài 1: Kiểm Tra Số Chẵn Lẻ
   Viết một chương trình để nhập một số nguyên từ bàn phím và kiểm tra xem số đó là số chẵn hay số lẻ.
2. Bài 2: Viết chương trình nhập vào một số nguyên và kiểm tra xem số đó là số dương hay số âm.
3. Bài 3: Kiểm Tra Tuổi
   Viết một chương trình để nhập tuổi từ bàn phím và kiểm tra xem người đó có đủ tuổi bầu cử hay không (>= 18 tuổi).
4. Bài 4: Phân Loại Điểm
   Viết một chương trình để nhập điểm từ bàn phím và phân loại điểm theo các mức: A (>= 90), B (>= 80), C (>= 70), D (>= 60), F (< 60).
5. Bài 5: Kiểm Tra Năm Nhuận
   Viết một chương trình để nhập một năm từ bàn phím và kiểm tra xem năm đó có phải là năm nhuận hay không.
6. Bài 6: Tính Giá Trị Tuyệt Đối
   Viết một chương trình để nhập một số nguyên từ bàn phím và tính giá trị tuyệt đối của số đó.
7. Bài 7: Tính Tiền Điện với số điện sử dụng và theo quy tắc sau:
   - 50 số đầu: 1000 VND/số
   - 50 số tiếp theo: 1200 VND/số
   - 100 số tiếp theo: 1500 VND/số
   - Còn lại: 2000 VND/số
8. Bài 8: Giải phương trình bậc 2 ax^2 + bx + c = 0 với a, b, c nhập từ bàn phím.
9. Bài 9: Tính chỉ số BMI (Body Mass Index) với cân nặng (kg) và chiều cao (m) nhập từ bàn phím.
10. Bài 10: Kiểm tra tam giác với ba cạnh a, b, c nhập từ bàn phím.
11. Bài 11: Chuyển đổi tháng trong năm từ số nguyên 1-12 sang tên tháng tương ứng.

## Hướng dẫn
1. Bài 1: Kiểm Tra Số Chẵn Lẻ
   Viết một chương trình để nhập một số nguyên từ bàn phím và kiểm tra xem số đó là số chẵn hay số lẻ.
   - Sử dụng lớp `Scanner` để nhập số nguyên từ bàn phím.
   - Sử dụng toán tử `%` để kiểm tra số chẵn lẻ.
   
2. Bài 2: Viết chương trình nhập vào một số nguyên và kiểm tra xem số đó là số dương hay số âm.
   - Sử dụng lớp `Scanner` để nhập số nguyên từ bàn phím.
   - Sử dụng cấu trúc điều kiện `if` để kiểm tra số dương hay số âm bằng cách so sánh thương của số đó vs 2 và 0.
     - Nếu số > 0, in ra "Số dương."
     - Nếu số < 0, in ra "Số âm."
   
3. Bài 3: Kiểm Tra Tuổi
   Viết một chương trình để nhập tuổi từ bàn phím và kiểm tra xem người đó có đủ tuổi bầu cử hay không (>= 18 tuổi).
   -  Sử dụng lớp `Scanner` để nhập tuổi từ bàn phím.
   - Sử dụng cấu trúc điều kiện `if` để kiểm tra tuổi người dùng.
      - Nếu tuổi >= 18, in ra "Bạn đủ tuổi bầu cử."
      - Nếu tuổi >= 16, in ra "Bạn sắp đủ tuổi bầu cử."
4. Bài 4: Phân Loại Điểm
   Viết một chương trình để nhập điểm từ bàn phím và phân loại điểm theo các mức: A (>= 90), B (>= 80), C (>= 70), D (>= 60), F (< 60).
   - Sử dụng lớp `Scanner` để nhập điểm từ bàn phím.
   - Sử dụng cấu trúc điều kiện `if-else if-else` để phân loại điểm.
     - Nếu điểm >= 90, in ra "A."
     - Nếu điểm >= 80, in ra "B."
     - Nếu điểm >= 70, in ra "C."
     - Nếu điểm >= 60, in ra "D."
     - Nếu điểm < 60, in ra "F."
     
5. Bài 5: Kiểm Tra Năm Nhuận
   Viết một chương trình để nhập một năm từ bàn phím và kiểm tra xem năm đó có phải là năm nhuận hay không.
   - Sử dụng lớp `Scanner` để nhập năm từ bàn phím.
   - Sử dụng cấu trúc điều kiện `if` để kiểm tra năm nhuận.
     - Nếu năm chia hết cho 4 và không chia hết cho 100 hoặc chia hết cho 400, in ra "Năm nhuận."
     - Ngược lại, in ra "Năm không nhuận."
     
6. Bài 6: Tính Giá Trị Tuyệt Đối
   Viết một chương trình để nhập một số nguyên từ bàn phím và tính giá trị tuyệt đối của số đó.
   - Sử dụng lớp `Scanner` để nhập số nguyên từ bàn phím.
   - Sử dụng cấu trúc điều kiện `if` để kiểm tra giá trị tuyệt đối.
     - Nếu số >= 0, in ra số.
     - Ngược lại, in ra số đối của số.
     
7. Bài 7: Tính Tiền Điện với số điện sử dụng và theo quy tắc sau:
   - Sử dụng lớp `Scanner` để nhập số điện sử dụng từ bàn phím.
   - Sử dụng cấu trúc điều kiện `if-else if-else` để tính tiền điện.
     - Nếu số điện <= 50, tính tiền theo quy tắc 50 số đầu.
     - Nếu số điện <= 100, tính tiền theo quy tắc 50 số đầu và 50 số tiếp theo.
     - Nếu số điện <= 200, tính tiền theo quy tắc 50 số đầu, 50 số tiếp theo, và 100 số tiếp theo.
     - Ngược lại, tính tiền theo quy tắc 50 số đầu, 50 số tiếp theo, 100 số tiếp theo, và số còn lại.
   
8. Bài 8: Giải phương trình bậc 2 ax^2 + bx + c = 0 với a, b, c nhập từ bàn phím.
   - Sử dụng lớp `Scanner` để nhập a, b, c từ bàn phím.
   - Sử dụng cấu trúc điều kiện `if-else` để giải phương trình bậc 2.
     - Tính delta = b^2 - 4ac.
     - Nếu delta > 0, in ra 2 nghiệm phân biệt.
     - Nếu delta = 0, in ra nghiệm kép.
     - Ngược lại, in ra "Phương trình vô nghiệm."
     
9. Bài 9: Tính chỉ số BMI (Body Mass Index) với cân nặng (kg) và chiều cao (m) nhập từ bàn phím.
   - Sử dụng lớp `Scanner` để nhập cân nặng và chiều cao từ bàn phím.
   - Sử dụng cấu trúc điều kiện `if-else if-else` để tính chỉ số BMI.
     - BMI = cân nặng / (chiều cao * chiều cao).
     - Nếu BMI < 18.5, in "Gầy."
     - Nếu BMI < 24.9, in "Bình thường."
     - Nếu BMI < 29.9, in "Hơi béo."
     - Ngược lại, in "Béo phì."
     
10. Bài 10: Kiểm tra tam giác với ba cạnh a, b, c nhập từ bàn phím.
    - Sử dụng lớp `Scanner` để nhập ba cạnh a, b, c từ bàn phím.
    - Sử dụng cấu trúc điều kiện `if-else` để kiểm tra tam giác.
      - Nếu a + b > c và a + c > b và b + c > a, in ra loại tam giác.
      - Ngược lại, in ra "Không phải tam giác."

11. Bài 11: Chuyển đổi tháng trong năm từ số nguyên 1-12 sang tên tháng tương ứng.
    - Sử dụng lớp `Scanner` để nhập tháng từ bàn phím.
    - Sử dụng cấu trúc điều kiện `switch-case` để chuyển đổi tháng.
      - In ra tên tháng tương ứng với số tháng.
      - Nếu số tháng không hợp lệ, in ra "Tháng không hợp lệ."