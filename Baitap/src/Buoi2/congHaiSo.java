package Buoi2;

import java.util.Scanner;

public class congHaiSo {
    public static void main(String[] args) {
        // Khai báo bến số là num1 và num 2, và tổng 2 số là sum;
        double num1, num2, sum;

        // Khai báo scanner để nhập từ bàn phím vào;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào số thứ nhất: ");
        num1 = input.nextDouble();
        System.out.println("Nhập vào số thứ hai: ");
        num2 = input.nextDouble();

        //Đóng lại đối tượng scanner:
        input.close();

        //Tính tổng sum = num 1+ num2;
        sum= num1+num2;

        //In kết quả ra màn hình
        System.out.println("Tồng của 2 số là: "+ sum);

    }
}
