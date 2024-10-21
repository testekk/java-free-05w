package lesson01;

public class VuThiKimChi_VariableExercise {
    public static void main(String[] args) {
        //Bài 01: Viết một chương trình Java để thực hành khai báo, khởi tạo và sử dụng các biến.
        //Chương trình sẽ thực hiện các bước sau:

        //1.1. Khai báo các biến với các kiểu dữ liệu khác nhau
        //(int, double, char, boolean, và String).
        int age;
        double height;
        char Name; //Chú ý cách khai báo biến, không viết hoa chữ cái đầu tiên, sửa thành => name
        boolean isChecked_Female;
        String fullName;

        //1.2. Khởi tạo các biến với các giá trị cụ thể.
        age = 24;
        height = 1.54;
        Name = 'C';
        isChecked_Female = true;
        fullName = "Vũ Thị Kim Chi";

        //1.3. Thực hiện các phép toán cơ bản với các biến.
        double sum = age + height; //Tổng

        double subtract = height - age; //Trừ
        double subtract1 = age - height; //Trừ

        double multiplication = height * age; //Nhân

        double divide = height / age; //Chia
        double divide1 = age / height; //Chia

        //1.4. In kết quả ra màn hình:
        System.out.println("Bài 1:");
        System.out.println("- Chữ cái đầu trong tên: " + Name + "\n" + "- Họ và tên: " + fullName
                + "\n" + "- Tuổi: " + age + "\n" + "- Chiều cao: " + height +
                "\n" + "- Giới tính là nữ: " + isChecked_Female);

        System.out.println("\n" + "- Tổng của chiều cao và tuổi: " + sum +
                "\n" + "- Hiệu của chiều cao và tuổi: " + subtract + " hoặc " + subtract1 +
                "\n" + "- Chiều cao nhân tuổi: " + multiplication +
                "\n" + "- Phép chia của chiều cao và tuổi: " + divide + " hoặc " + divide1 +
                "\n" + "- Làm tròn phép chia chiều cao và độ tuổi: " + Math.round(divide) +
                " hoặc " + Math.round(divide1) +
                "\n" + "- Làm tròn xuống phép chia chiều cao và độ tuổi: " + Math.floor(divide) +
                " hoặc " + Math.floor(divide1) +
                "\n" + "- Làm tròn lên phép chia chiều cao và độ tuổi: " + Math.ceil(divide) +
                " hoặc " + Math.ceil(divide1));


        //Bài 2: Phát triển chương trình sử dụng 02 biến cùng loại (02 biến int, 02 biến double, 02 biến boolean, 02 biến String) để thực hiện các yêu cầu sau:

        //2.1.Sử dụng các phép toán so sánh (==, !=, >, <, >=, <=) với các biến số nguyên và số thực.
        int a = 10;  // để các tên biến có ý nghĩa
        int b = 20;
        double c = 10.2;
        double d = 20.1;

        double e = 10.2;

        boolean isEqual = (a == b); //so sánh số nguyên với số nguyên
        boolean isEqual1 = (a == c); //so sánh số nguyên với số thực
        boolean isEqual2 = (d == c); //so sánh số thực với số thực

        boolean isDifference = (b != a); //so sánh số nguyên với số nguyên
        boolean isDifference1 = (b != c); //so sánh số nguyên với số thực
        boolean isDifference2 = (d != c); //so sánh số thực với số thực
        boolean isDifference3 = (d != d); //so sánh số thực với số thực

        boolean isGreater = (a > b); //so sánh số nguyên với số nguyên
        boolean isGreater1 = (a > c); //so sánh số nguyên với số thực
        boolean isGreater2 = (d > c); //so sánh số thực với số thực
        boolean isGreater3 = (c >= e); //so sánh số thực với số thực


        boolean isLess = (a < b); //so sánh số nguyên với số nguyên
        boolean isLess1 = (a < c); //so sánh số nguyên với số thực
        boolean isLess2 = (d < c); //so sánh số thực với số thực
        boolean isLess3 = (c <= e); //so sánh số thực với số thực

        System.out.println("\n" + "Bài 2:");
        System.out.println("- " + a + " bằng " + b + ": " + isEqual + " và " + a + " bằng " + c + ": " + isEqual1 + " và " + c + " bằng " + d + ": " + isEqual2);
        System.out.println("- " + a + " khác " + b + ": " + isDifference + " và " + b + " khác " + c + ": " + isDifference1 + " và " + c + " khác " + d + ": " + isDifference2 + " và " + d + " khác " + d + ": " + isDifference3);
        System.out.println("- " + a + " > " + b + ": " + isGreater + " và " + a + " > " + c + ": " + isGreater1 + " và " + d + ">" + c + ": " + isGreater2 + " và " + c + " >= " + e + ": " + isGreater3);
        System.out.println("- " + a + " < " + b + ": " + isLess + " và " + a + " > " + c + ": " + isLess1 + " và " + d + " < " + c + ": " + isLess2 + " và " + c + " <= " + e + ": " + isLess3);

        //Sử dụng các phép toán logic (&&, ||, !) với các biến boolean.
        boolean isChecked1 = (a < b) && (a > c);
        boolean isChecked2 = (a < b) || (a > c);
        boolean isChecked3 = !isChecked1;

        System.out.println("\n" + "- " + a + " < " + b + " và " + a + " > " + c + ": " + isChecked1);
        System.out.println("- " + a + " < " + b + " hoặc " + a + " > " + c + ": " + isChecked2);
        System.out.println("- isChecked3 là " + isChecked3);

        // if ... else
        if (isChecked1 == true) {
            System.out.println("\n" + "- " + a + " < " + b + " và " + a + " > " + c + ": " + isChecked1);
        } else if (isChecked1 == false) {
            System.out.println("\n" + "Không chính xác");
        } else {
            System.out.println("\n" + "Không có giá trị phù hợp");
        }

        //Sử dụng các phép toán cộng chuỗi với biến kiểu String.
        System.out.println("\n" + "- Chữ cái đầu trong tên: " + Name + "\n" + "- Họ và tên: " + fullName);
    }
}

