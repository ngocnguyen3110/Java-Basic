package Buoi3;

public class timPhanNguyenVaPhanDu {
    public static void main(String[] args) {
        //Khai bao bien
        double num1 = 3.4;
        double num2 = 0.7;
        double thuong;
        int nguyen;
        double du;
        // Tinh toan
        thuong = num1/num2;
        nguyen = (int)thuong;
        du = num1%num2;
        System.out.println("Phần nguyên của phép chia 2 số là: "+ nguyen);
        System.out.println("Phần dư của phép chia 2 số là: "+ du);
    }
}
