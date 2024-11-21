# Thực hành OOP (Lập trình hướng đối tượng)

## Thực hành
Xây dựng hệ thống quản lý vé máy bay với các yêu cầu sau:
1. Tạo lớp trừu tượng `Ticket` với các thuộc tính:
   - `id`: Mã vé
   - `price`: Giá vé
   - `flightNumber`: Số hiệu chuyến bay
   - `departureDate`: Ngày khởi hành
   - `departureTime`: Giờ khởi hành
   - `arrivalDate`: Ngày đến
   - `arrivalTime`: Giờ đến
   - `passenger`: Hành khách
2. Tạo lớp `Passenger` với các thuộc tính:
    - `id`: Mã hành khách
    - `name`: Tên hành khách
    - `address`: Địa chỉ
    - `phone`: Số điện thoại
3. Tạo lớp `EconomyTicket` kế thừa từ `Ticket` với các thuộc tính:
    - `meal`: Bữa ăn
    - `seat`: Ghế
4. Tạo lớp `BusinessTicket` kế thừa từ `Ticket` với các thuộc tính:
    - `meal`: Bữa ăn
    - `seat`: Ghế
    - `lounge`: Phòng chờ
5. Tạo lớp `TicketManagement` để quản lý các vé máy bay với các chức năng:
   1. Tạo lớp `Main` để thực hiện các chức năng quản lý vé máy bay.
   2. Tạo danh sách các vé máy bay.
   3. Thêm vé máy bay.
   4. Hiển thị danh sách vé máy bay.
   5. Tìm kiếm vé máy bay theo mã vé.
   6. Sắp xếp vé máy bay theo giá vé tăng dần.
   7. Sắp xếp vé máy bay theo ngày khởi hành tăng dần.
   8. Sắp xếp vé máy bay theo ngày đến tăng dần.
   9. Tính tổng tiền của tất cả các vé máy bay.
   10. Tính tổng tiền của khách và theo từng loại vé.
