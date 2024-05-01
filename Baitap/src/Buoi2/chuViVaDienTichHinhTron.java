package Buoi2;

import java.util.Scanner;

public class chuViVaDienTichHinhTron {
    //Viết chương trình tính Chu vi và diện tích hình tròn;
    public static void main (String[] agrs){
        double r, chuvi, dientich;
        double pi = 3.14;

        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào bán kính hình tròn: ");
        r = input.nextDouble();

        // Tính diện tích
        dientich = pi*r*r;
        // Tính chu vi
        chuvi = 2*pi*r;

        // In ra màn hình:
        System.out.println("Diện tích hình tròn với bán kính bạn vừa nhập là: "+ dientich);
        System.out.println("Chu vi hình tròn với bán kính bạn vừa nhập là: "+ chuvi);
    }
}
