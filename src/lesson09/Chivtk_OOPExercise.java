package lesson09;

public class Chivtk_OOPExercise {
    public static void main(String[] args) {
        //region Bài 01 + Bài 2:
        /* Implement your code here */
        // HINH TRON:
        ChivtkCircle circle = new ChivtkCircle("Pink", "Hinh tron", 2, 4, 4);
        circle.displayInfo();
        double S = (double) Math.round((circle.getArea())*100)/100; //lam tron sau dau phay 2 chua so thap phan
        System.out.println("Dien tich cua hinh tron la: "+ S);

        //Kiem tra hinh tron co phai la eclipse
        if(circle.isEclipse() == false){
            System.out.println("Đây la hinh tron");
        }
        else{
            System.out.println("Đây la hinh eclipse");
        }

        //HINH CHU NHAT
        ChivtkRectangle rectangle = new ChivtkRectangle("Black", "Hinh chu nhat", 4.3, 3.6);
        rectangle.displayInfor();
        double Shcn = (double) Math.round(rectangle.getArea()*100)/100;
        System.out.println("Dien tich hinh chua nhat: "+Shcn);
        //endregion
    }
}
