package Buoi2;

import java.util.Scanner;

public class Dientichhinhtamgiac {
    //Viết chương trình tính Diện tích tam giác.
    public static void main (String[] agrs){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập độ dài cạnh đáy hình tam giác: ");
        double day = input.nextDouble();
        System.out.println("Nhập độ dài chiều cao hình tam giác: ");
        double chieucao = input.nextDouble();

        // Tính diện tích
        double dientich = day*chieucao/2;
        // In ra màn hình:
        System.out.println("Diện tích hình tam giác với cạnh đáy và chiều cao bạn vừa nhập là: "+ dientich);
    }
}
