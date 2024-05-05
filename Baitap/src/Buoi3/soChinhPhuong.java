package Buoi3;

import java.util.Scanner;

public class soChinhPhuong {
    public static void main(String[] args) {
        //Khai báo biến
        int n;
        //Nhập từ bàn phím
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số cần kiểm tra: ");
        n = input.nextInt();
        //Điều kiện là số chính phương là căn bậc 2 của số đó là 1 số nguyên
        double can = Math.sqrt(n);
        if (can == (int) can){
            System.out.println(n + " Là số chính phương");
        } else {
            System.out.println(n + " Không phải là số chính phương");
        }
    }
}
