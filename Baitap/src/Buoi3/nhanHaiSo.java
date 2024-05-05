package Buoi3;

import java.util.Scanner;

public class nhanHaiSo {
    public static void main(String[] args) {
        //Khai bao bien
        double num1, num2, ketqua;
        //Nhap tu ban phim
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số thứ nhất: ");
        num1 = input.nextDouble();
        System.out.println("Nhập số thứ hai: ");
        num2 = input.nextDouble();
        //Nhan hai so
        ketqua = num1 * num2;
        System.out.println("Tích của hai số là: " + ketqua);
    }
}
