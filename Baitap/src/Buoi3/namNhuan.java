package Buoi3;

import java.util.Scanner;

public class namNhuan {
    public static void main(String[] args) {
        //Khaibaobien
        int year;
        //Nhap tu ban phim
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập năm cần kiểm tra năm nhuận: ");
        year = input.nextInt();
        //Dieu kien la nam nhuan
        //1. Năm chia hết cho 100 thi phai chia hết cho 400
        //2. Năm khong chia hết cho 100 thì chỉ cần chia hết cho 4
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.println(year + " là năm nhuận");
            } else {
                System.out.println(year + " không phải là năm nhuận");
            }
        } else if (year % 4 == 0) {
            System.out.println(year + " là năm nhuận");
        } else {
            System.out.println(year + " không phải là năm nhuận");
        }
    }
}
