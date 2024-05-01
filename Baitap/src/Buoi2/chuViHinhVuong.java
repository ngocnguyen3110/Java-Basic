package Buoi2;

import java.util.Scanner;

public class chuViHinhVuong {
    //Viết chương trình tính chu vi hình vuông.
    public static void main (String[] agrs){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập độ dài cạnh hình vuông: ");
        double canh = input.nextDouble();

        // Tính chu vi
        double chuvi = 4*canh;
        // In ra màn hình:
        System.out.println("Chu vi hình vuông với độ dài cạnh bạn vừa nhập là: "+ chuvi);
    }
}
