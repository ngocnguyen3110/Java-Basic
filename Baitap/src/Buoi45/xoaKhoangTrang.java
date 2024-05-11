package Buoi45;

import java.util.Scanner;

public class xoaKhoangTrang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi cần kiểm tra: ");
        String input = sc.nextLine();
        //Hiển thị chuỗi ban đầu
        System.out.println("Chuỗi ban đầu: "+input);
        //Sử dụng replaceall
        input = input.replaceAll(" ", "");
        System.out.println("Chuỗi sau khi xóa khoảng trắng: "+input);
    }
}
