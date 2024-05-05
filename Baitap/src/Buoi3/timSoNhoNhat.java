package Buoi3;

public class timSoNhoNhat {
    public static void main(String[] args) {
        //Khai bao bien
        double num1 = -10;
        double num2 = 10.25;
        double num3 = -2.5;
        double step1, ketqua;
        //So sanh
        step1 = num1<num2 ? num1:num2;
        ketqua = num3<step1 ? num3:step1;
        System.out.println("Số nhỏ nhất là: "+ ketqua);
    }
}
